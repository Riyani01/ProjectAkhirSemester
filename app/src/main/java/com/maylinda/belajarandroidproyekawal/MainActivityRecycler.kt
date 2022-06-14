package com.maylinda.belajarandroidproyekawal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.maylinda.belajarandroidproyekawal.adapter.ItemAdapter
import com.maylinda.belajarandroidproyekawal.data.Datasource

class MainActivityRecycler : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        //Agar dapat memanggil activity_main_recycler,maka harus membuka metode onCreate() terlebih dahulu,
        // diikuti dengan perintah setContentView() yang didalam kurungnya diberi perintah
        // atau kode pemanggilan layout activity_main_recycler.
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_recycler)

        //Dibuat sebuah daftar afirmasi dengan nama myDataset yang ditampilkan melalui val.
        //Datasource instance  dibuat serta metode loadAffirmations() dipanggil.
        val myDataset = Datasource().loadAffirmations()

        // Supaya dapat menemukan referensi ke RecyclerView dalam tata letak,
        // maka perlu dibuat variabel dengan nama recyclerView serta findViewById().
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataset)

        // Kode dibawah ini digunakan untuk mengetahui peningkatan kinerja apabila suatu saat terdapat perubahan.
        recyclerView.setHasFixedSize(true)
    }
}
