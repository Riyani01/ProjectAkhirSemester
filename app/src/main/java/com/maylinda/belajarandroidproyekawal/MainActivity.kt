package com.maylinda.belajarandroidproyekawal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.maylinda.belajarandroidproyekawal.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Kode di bawah ini merupakan kode untuk memanggil untuk menampilkan
        // layout yang sesuai dengan MainActivity yakni layout activity_main
        // dengan menggunakan metode binding yang telah dideklarasikan terlebih dahulu pada build.gradle
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Kode di bawah ini merupakan kode yang berguna untuk memberikan klik listener button
        // pada id button :buttonSignin,saat button di-klik maka secara otomatis akan menjalankan fungsi cekMasuk()
        //fungsi cekMasuk ini harus dideklarasikan setelah setOnClickListener diapit melalui { }.
        //Sedangkan pada id button:buttonCancel,saat button di-klik maka secara otomatis akan menjalankan fungsi cekCancel()
        //fungsi cekCancel ini harus dideklarasikan setelah setOnClickListener diapit melalui { }.
        binding.buttonSignin.setOnClickListener { cekMasuk() }
        binding.buttonCencel.setOnClickListener { cekCancel() }
    }
    //Kode dibawah ini merupakan kode yang berfungsi untuk mendeklarasikan fungsi pada cekMasuk()
    private fun cekMasuk() {
        //Dibawah ini merupakan contoh penggunaan variabel intent dari kelas Intent yang digunakan pada cekMasuk atau pada saat buttonSignin di-klik.
        // Cara untuk melakukannya konfigurasi adalah dengan menuliskan terlebih dahulu
        // activity yang digunakan saat ini kemudian diikuti kelas yang akan dituju ketika button di klik yakni dari MainActivity ke  LoginActivity.
        val intent = Intent(this, LoginActivity::class.java)
        //untuk menjalankan variabel  intent yang telah dideklarasikan maka dapat menuliskan perintah  startActivity(intent)
        startActivity(intent)
    }
    //Kode dibawah ini merupakan kode yang berfungsi untuk mendeklarasikan fungsi pada cekCancel()
    private  fun  cekCancel() {
        //Dibawah ini merupakan contoh penggunaan variabel intent dari kelas Intent yang digunakan pada cekCancel atau pada saat buttonCancel di klik
        //Agar dapat melakukan konfigurasi maka harus menuliskan terlebih dahulu activity yang digunakan atau yang sedang berjalan
        // kemudian diikuti perintah finish() dimana perintah ini berguna untuk mengakhiri activity atau pada hal ini menutup aplikasi.

        finish()

    }
}