package com.apps.it.tabsliding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {

    TabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /// เพิ่ม Button ///


        /// TAP ทั้งหมด ///

        TabHost host = (TabHost)findViewById(R.id.tabHost);
        host.setup();

        //Tab 1
        TabHost.TabSpec spec = host.newTabSpec("Free TV");
        spec.setContent(R.id.tab1);
        spec.setIndicator("Free TV");
        host.addTab(spec);

        //Tab 2
        spec = host.newTabSpec("ช่อง บันเทิง");
        spec.setContent(R.id.tab2);
        spec.setIndicator("ช่อง บันเทิง");
        host.addTab(spec);

        //Tab 3
        spec = host.newTabSpec("ช่อง หนัง");
        spec.setContent(R.id.tab3);
        spec.setIndicator("ช่อง หนัง");
        host.addTab(spec);
    }

}
