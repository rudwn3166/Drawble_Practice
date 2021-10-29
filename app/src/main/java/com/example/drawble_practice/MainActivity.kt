package com.example.drawble_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.widget.Toolbar
import kotlinx.android.synthetic.main.my_cutsom_action_bar.*

class MainActivity : AppCompatActivity() {

//    액션바에 있는 UI를 담아줄 변수를 멤버변수로 만들기

    lateinit var toastBtn : Button
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

//        양 옆여백은 커스텀 바가 아니라서 커스텀 바를 가지고 있는 toolbar를 찾아 여백 제거하기
//        커스텀 바를 가지고 있는 툴바를 불러내기

//        as캐스팅을 사용해 툴바를 커스텀 바로 바꿈
        val toolbar =defaultActionbar.customView.parent as Toolbar
        
//        양 옆의 여백을 모두 무조걱 0으로 없앤다고 함
        toolbar.setContentInsetsAbsolute(0,0)

//       커스텀 액션바에 달아둔 버튼을 찾아오는 방법
       toastBtn =defaultActionbar.customView.findViewById<Button>(R.id.toastBtn)
       toastBtn.setOnClickListener {
           Toast.makeText(this, "액션바를 통해 토스트 띄우기 ", Toast.LENGTH_SHORT).show()
           

       }
    }
}