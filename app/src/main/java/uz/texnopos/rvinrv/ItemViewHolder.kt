package uz.texnopos.rvinrv

import androidx.recyclerview.widget.RecyclerView
import uz.texnopos.rvinrv.data.ItemText
import uz.texnopos.rvinrv.databinding.Item1Binding

class ItemViewHolder(private val binding: Item1Binding): RecyclerView.ViewHolder(binding.root) {
    fun bind(itemText: ItemText) {
        binding.tvItem.text = itemText.text
    }
}
