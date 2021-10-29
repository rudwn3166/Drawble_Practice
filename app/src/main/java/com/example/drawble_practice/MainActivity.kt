package com.example.drawble_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        1.기본 액션바를 불러내자.

//        서포트 액션바를 절대 널이 아니라고!!를 처리함 무조건 액션바를 둘거라 널을 해제함
        val defaultActionbar = supportActionBar!!

//        모드를 커스텀 지원으로 설정
//        아래 기능들을 이용해서 커스텀 모드 지원을 설정함
        defaultActionbar.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM
//        실제로 어떤 커스텀 뷰를 사용할지 ?
//        여기까지하면 액션바가 바뀌긴 하나 양옆의 여백이 생김
        defaultActionbar.setCustomView(R.layout.my_cutsom_action_bar)
    }
}