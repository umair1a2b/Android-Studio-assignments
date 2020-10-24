package com.example.myapplication6;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import org.json.JSONException;
import org.json.JSONObject;
import android.widget.TextView;

public class ListItemActivity2 extends AppCompatActivity {

    public static final String JSON_STRING="{\"employee\":{\"name\":\"umair\",\"salary\":50000}}";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView textView1=(TextView)findViewById(R.id.textView1);

        try{
            JSONObject emp=(new JSONObject(JSON_STRING)).getJSONObject("employee");
            String empname=emp.getString("name");
            int empsalary=emp.getInt("salary");

            String str="Employee Name:"+empname+"\n"+"Employee Salary:"+empsalary;
            textView1.setText(str);

        }catch (Exception e) {e.printStackTrace();}
    }
}
