package com.maylinda.belajarandroidproyekawal

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.maylinda.belajarandroidproyekawal.databinding.ActivityDetailUserBinding


class DetailUser : AppCompatActivity() {
    //Dibawah ini adalah kode objek companion,
    // dalam objek ini diberikan konstanta variabel untuk link menuju akun github dan linkedin

    companion object {
        const val WEBPREFIX = "https://github.com/Riyani01"
        const val WEB_PREFIX = "https://www.linkedin.com/in/may-linda-indriyani-2abb51231/"
    }
    lateinit var binding: ActivityDetailUserBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailUserBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonNotes.setOnClickListener { cekNotes()}

        //Kode di bawah ini merupakan kode yang berguna untuk memberikan klik listener button
        //pada id button :buttonGithub,saat button di-klik maka secara otomatis akan menjalankan fungsi cekAkunGithub()
        //fungsi cekAkunGithub ini harus dideklarasikan setelah setOnClickListener diapit melalui { }.
        //pada id button :buttonLinkedin,saat button di-klik maka secara otomatis akan menjalankan fungsi cekAkunLinkedin()
        //fungsi cekAkunLinkedin ini harus dideklarasikan setelah setOnClickListener diapit melalui { }.

        binding.buttonGithub.setOnClickListener { cekAkunGithub() }
        binding.buttonLinkedin.setOnClickListener { cekAkunLinkedin() }

    }
    //Kode dibawah ini merupakan kode yang berfungsi untuk mendeklarasikan fungsi pada cekNotes()
    private fun cekNotes() {
        //Dibawah ini merupakan contoh penggunaan variabel intent dari kelas Intent yang digunakan pada cekNotes atau pada saat buttonNotes di-klik.
        // Cara untuk melakukannya konfigurasi adalah dengan menuliskan terlebih dahulu
        // activity yang digunakan saat ini kemudian diikuti kelas yang akan dituju ketika button di klik yakni dari DetailUser ke  MainActivityRecycler.
        val intent = Intent(this, MainActivityRecycler::class.java)
        //untuk menjalankan variabel  intent yang telah dideklarasikan maka dapat menuliskan perintah  startActivity(intent)
        startActivity(intent)
    }

    //Kode dibawah ini  berfungsi untuk mendeklarasikan fungsi pada cekAkunGithub()
    private fun cekAkunGithub() {
        //Kode dibawah ini merupakan kode yang menggunakan intent implisit dengan variabel queryUrl,dengan data pada WEBPREFIX
        //Kemudian menjalankan perintah ini menggunakan perintah startActivity(intent)
        val queryUrl: Uri = Uri.parse(WEBPREFIX)
        val intent = Intent(Intent.ACTION_VIEW, queryUrl)
        startActivity(intent)
    }
    // //Kode dibawah ini  berfungsi untuk mendeklarasikan fungsi pada cekAkunLinkedin()
    private fun cekAkunLinkedin() {
        //Kode dibawah ini merupakan kode yang menggunakan intent implisit dengan variabel queryUrl,dengan data pada WEB_PREFIX
        //Kemudian menjalankan perintah ini menggunakan perintah startActivity(intent)
        val queryUrl: Uri = Uri.parse(WEB_PREFIX)
        val intent = Intent(Intent.ACTION_VIEW, queryUrl)
        startActivity(intent)

    }
}