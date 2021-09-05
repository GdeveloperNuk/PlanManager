package com.wook.planmanager.history

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.wook.planmanager.R
import com.wook.planmanager.record.RecordFragment
import kotlinx.android.synthetic.main.showsavefile_fragment.*

class SaveFileFragment : AppCompatActivity(){

    val historyAdapter = HistoryAdapter()
    val historys =   ArrayList<History>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.showsavefile_fragment)

        historys.add(History("기록"))
        historys.add(History("기록"))

        historyAdapter.addHistorys(historys)

        rv_history.apply {
            layoutManager = LinearLayoutManager(context)
            adapter =historyAdapter
        }
    }

    fun moveFragment(view: View){
        val intent = Intent(this, RecordFragment::class.java)
        startActivity(intent)
    }
}