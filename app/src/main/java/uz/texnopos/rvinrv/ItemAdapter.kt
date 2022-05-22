package uz.texnopos.rvinrv

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.texnopos.rvinrv.data.ItemText
import uz.texnopos.rvinrv.databinding.Item1Binding

class ItemAdapter : RecyclerView.Adapter<ItemViewHolder>() {
    var models = listOf<ItemText>()
        @SuppressLint("NotifyDataSetChanged")
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun getItemCount(): Int = models.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_1, parent, false)
        val binding = Item1Binding.bind(view)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(models[position])
    }
}
