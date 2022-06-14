package com.maylinda.belajarandroidproyekawal.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.maylinda.belajarandroidproyekawal.R
import com.maylinda.belajarandroidproyekawal.model.Affirmation

class ItemAdapter(
    private val context: Context,
    private val dataset: List<Affirmation>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    //  Pada ItemAdapter,untuk dapat meneruskan daftar afirmasi ke adaptor maka diperlukan sebuah parameter.
    //  Dalam ItemAdapter dibutuhkan informasi tentang cara menyelesaikan resource string serta informasi lain tentang aplikasi,
    //  dimana semuanya disimpan dalam instance objek Context yang dapat diteruskan ke instance ItemAdapter.
    //  Agar dapat memberikan akses ke semua tampilan item data maka diperlukan sebuah view holder.
    //  Diperlukan tambahan kode  untuk memperluas ItemAdapter dari class abstrak RecyclerView.Adapter,namun kemudian akan muncul error,
    //  Sehingga perlu menerapkan metode abstrak(getItemCount(), onCreateViewHolder(), dan onBindViewHolder()) dari RecyclerView.Adapter.
    //  Caranya adalah dengan  meneekan Command+I (Control+I di Windows) pada saat kursor berada pada ItemAdapter,
    //  kemudian semua fungsi dipilih dengan cara klik Shift+klik dan klik OK.


    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
    }

    /**
     * Create new views (invoked by the layout manager)
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {

        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    /**
     * Replace the contents of a view (invoked by the layout manager)
     */
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
    }

    /**
     * Return the size of your dataset (invoked by the layout manager)
     */
    override fun getItemCount() = dataset.size
}
