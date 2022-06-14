package com.maylinda.belajarandroidproyekawal.data
import com.maylinda.belajarandroidproyekawal.R
import com.maylinda.belajarandroidproyekawal.model.Affirmation

//  Pada class  Datasource.kt ini yang mengantisispasi terjadinya ketidak tepatan dalam format yang sama persis dengan yang butuhkan.
//  Maka didalam class ini dituliskan kode, yakni: memaut fungsi loadAffirmations() untuk dapat menampilkan daftar Affirmations,
//  yang didalamnya dideklarasikan List<Affirmation> sebagai jenis nilai yang ditampilkan,ditambahkan pernyataan return,
//  serta memanggil listOf<>() untuk membuat List.
class Datasource{

    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1),
            Affirmation(R.string.affirmation2),
            Affirmation(R.string.affirmation3),
            Affirmation(R.string.affirmation4),
            Affirmation(R.string.affirmation5),
            Affirmation(R.string.affirmation6),
            Affirmation(R.string.affirmation7),
            Affirmation(R.string.affirmation8),
            Affirmation(R.string.affirmation9),
            Affirmation(R.string.affirmation10)
        )
    }
}
