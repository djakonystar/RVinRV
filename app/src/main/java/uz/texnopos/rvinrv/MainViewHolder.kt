package uz.texnopos.rvinrv

import androidx.recyclerview.widget.RecyclerView
import uz.texnopos.rvinrv.data.ItemText
import uz.texnopos.rvinrv.databinding.RecyclerView1Binding

class MainViewHolder(private val binding: RecyclerView1Binding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(itemList: List<ItemText>) {
        val itemAdapter = ItemAdapter()
        itemAdapter.models = itemList

        binding.rvMain1.adapter = itemAdapter
    }
}
