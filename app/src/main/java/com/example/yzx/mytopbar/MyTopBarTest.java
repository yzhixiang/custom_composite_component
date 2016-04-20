package com.example.yzx.mytopbar;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.yzx.mytopbar.UI.MyTopBar;

/**
 * Created by yzx on 2016/4/20.
 */
public class MyTopBarTest extends Activity {

    private MyTopBar myTopBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mytopbar_test);
        myTopBar = (MyTopBar) findViewById(R.id.topBar);
        myTopBar.setOnTopbarClickListener(new MyTopBar.topbarClickListener() {
            @Override
            public void leftClick() {
                Toast.makeText(MyTopBarTest.this,"left",Toast.LENGTH_LONG).show();
            }

            @Override
            public void rightClick() {
                Toast.makeText(MyTopBarTest.this,"right",Toast.LENGTH_LONG).show();
            }
        });
        // 控制topbar上组件的状态
        myTopBar.setButtonVisable(0,true);
        myTopBar.setButtonVisable(1,true);
    }
}
