package com.ahchim.android.settings;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

// activity에 view와 controller가 같이 들어간다.
// 소스가 좀 지저분해질 수 있다는 단점이...
public class SettingsActivity extends AppCompatActivity implements View.OnClickListener{
    // 1. 레이아웃.xml 에서 사용하는 뷰 객체 정의
    Button btn;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        // 2. findViewById 로 뷰 세팅(가져오기)
        // View 값의 findViewById를 Button 변수로 캐스팅해줄 수 있다.
        btn = (Button) findViewById(R.id.button);
        tv = (TextView) findViewById(R.id.textView);

        // 3. 버튼에 onClickListener 달기
        // 클릭동작 Listner로 클래스 자체를 달아준다.
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.button:    // 버튼을 누르면
                tv.setText(BuildConfig.MYURL);   // 텍스트 뷰 값 세팅
        }
    }
}