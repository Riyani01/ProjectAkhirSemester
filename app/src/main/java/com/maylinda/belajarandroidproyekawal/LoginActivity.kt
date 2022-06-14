package com.maylinda.belajarandroidproyekawal

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.maylinda.belajarandroidproyekawal.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Kode di bawah ini merupakan kode untuk memanggil untuk menampilkan
        // layout yang sesuai dengan LoginActivity yakni layout activity_login
        // dengan menggunakan metode binding yang telah dideklarasikan terlebih dahulu pada build.gradle
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //Kode di bawah ini merupakan kode yang berguna untuk memberikan klik listener button
        // pada id button :buttonLogin,saat button di-klik maka secara otomatis akan menjalankan fungsi cekLogin()
        //fungsi cekLogin ini harus dideklarasikan setelah setOnClickListener diapit melalui { }.
        binding.buttonLogin.setOnClickListener { cekLogin() }
    }
    //Kode dibawah ini merupakan kode yang berfungsi untuk mendeklarasikan fungsi pada cekLogin()
    private  fun cekLogin() {
        //Kode di bawah ini merupakan pendeklarasian  variabel namaUser dan passwordUser
        // untuk mengambil data dari input textUsername dan textPassword yang kemudian dikonversi ke String.
        val namaUser = binding.textUsername.text.toString()
        val passwordUser = binding.textPassword.text.toString()

        //Sebagai validasi data user agar ketika user mencoba masuk dengan
        // tidak mengisi Username atau password atau kedua-duanya maka dapat menggunakan looping untuk mendeklarasikannya seperti kode di bawah ini.
        if (namaUser.isEmpty() || passwordUser.isEmpty()) {
            Toast.makeText(this, "Username dan password tidak boleh kosong!", Toast.LENGTH_SHORT).show()
            return
        }
        //Selain tidak boleh kosong juga dapat melakukan validasi keakuratan username dan password,
        //untuk itu diperlukan looping untuk mendeklarasikan username dan password terlebih dahulu menggunakan looping if seperti pada kode di bawah ini.
        if(namaUser == "Maylinda" && passwordUser== "010506"){
            //Dibawah ini merupakan contoh penggunaan variabel intent dari kelas Intent yang digunakan pada cekLogin atau pada saat buttonLogin di-klik.
            // Cara untuk melakukannya konfigurasi adalah dengan menuliskan terlebih dahulu
            // activity yang digunakan saat ini kemudian diikuti kelas yang akan dituju ketika button di klik yakni dari LoginActivity ke DetailUser.
            val intent = Intent(this, DetailUser::class.java)

            // Di bawah ini adalah kode untuk mengambil value dari inputan nama user Pada saat mendeklarasikan  variabel nama_user,
            intent.putExtra("nama_user", binding.textUsername.text.toString())
            //untuk menjalankan variabel  intent yang telah dideklarasikan maka dapat menuliskan perintah  startActivity(intent)
                startActivity(intent)
        //
        } else{
        Toast.makeText(this, "Username atau password salah.", Toast.LENGTH_SHORT).show()
        return
     }
    }

}