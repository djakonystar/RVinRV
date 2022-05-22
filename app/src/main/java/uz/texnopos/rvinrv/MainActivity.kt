package uz.texnopos.rvinrv

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import uz.texnopos.rvinrv.data.ItemText
import uz.texnopos.rvinrv.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val adapter = MainAdapter()
    private val itemLists = mutableListOf<List<ItemText>>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fillList()
        adapter.models = itemLists

        binding.rvMain.adapter = adapter
        binding.rvMain.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
    }

    private fun fillList() {
        repeat(6) { i ->
            val t = mutableListOf<ItemText>()
            repeat(10) { j ->
                t.add(ItemText("Item ${(i * 10) + (j + 1)}"))
            }
            itemLists.add(t)
        }
    }
}
