package com.example.btntest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    companion object {
        const val TAG = "태그"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<Button>(R.id.btn_1)
        val btn2 = findViewById<Button>(R.id.btn_2)
        val btn3 = findViewById<Button>(R.id.btn_3)
        // 리스너 달기
        btn1.setOnClickListener(this)
        btn2.setOnClickListener(this)
        btn3.setOnClickListener(this)

    }

    // 이렇게 처리하면 xml 뷰에서 클릭될때 해당 뷰를 매개변수로 받게 되고
    fun btnClick(btn: View){
        Log.d(TAG, "xml 에 박은 btnClick: ")
        // 들어온 버튼의 아이디에 따라 분기처리가 가능합니다!
        when (btn.id) {
            R.id.btn_a -> { Log.d(TAG, "btnClick: 버튼 a 입니다") }
            R.id.btn_b -> { Log.d(TAG, "btnClick: 버튼 b 입니다") }
            R.id.btn_c -> { Log.d(TAG, "btnClick: 버튼 c 입니다") }
        }

    }

    // 리스너를 달아서 처리
    override fun onClick(v: View?) {
        Log.d(TAG, "리스너 btnClick: ")
        // 들어온 버튼의 아이디에 따라 분기처리가 가능합니다!
        when (v?.id) {
            R.id.btn_1 -> { Log.d(TAG, "btnClick: 버튼 1 입니다") }
            R.id.btn_2 -> { Log.d(TAG, "btnClick: 버튼 2 입니다") }
            R.id.btn_3 -> { Log.d(TAG, "btnClick: 버튼 3 입니다") }
        }

    }

}
