package io.github.jack_ma.gsontest;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class MainActivity extends AppCompatActivity {
    String jsonData = "{\"desc\":\"OK\",\"status\":1000,\"data\":{\"wendu\":\"8\",\"ganmao\":\"天气较凉，较易发生感冒，请适当增加衣服。体质较弱的朋友尤其应该注意防护。\",\"forecast\":[{\"fengxiang\":\"无持续风向\",\"fengli\":\"微风级\",\"high\":\"高温 9℃\",\"type\":\"晴\",\"low\":\"低温 3℃\",\"date\":\"25日星期一\"},{\"fengxiang\":\"无持续风向\",\"fengli\":\"微风级\",\"high\":\"高温 10℃\",\"type\":\"小雨\",\"low\":\"低温 5℃\",\"date\":\"26日星期二\"},{\"fengxiang\":\"无持续风向\",\"fengli\":\"微风级\",\"high\":\"高温 15℃\",\"type\":\"小雨\",\"low\":\"低温 8℃\",\"date\":\"27日星期三\"},{\"fengxiang\":\"无持续风向\",\"fengli\":\"微风级\",\"high\":\"高温 17℃\",\"type\":\"中雨\",\"low\":\"低温 13℃\",\"date\":\"28日星期四\"},{\"fengxiang\":\"无持续风向\",\"fengli\":\"微风级\",\"high\":\"高温 18℃\",\"type\":\"中雨\",\"low\":\"低温 14℃\",\"date\":\"29日星期五\"}],\"yesterday\":{\"fl\":\"微风\",\"fx\":\"无持续风向\",\"high\":\"高温 5℃\",\"type\":\"小雨\",\"low\":\"低温 1℃\",\"date\":\"24日星期日\"},\"aqi\":\"45\",\"city\":\"深圳\"}}";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        Gson gson = new Gson();
       // java.lang.reflect.Type type = new TypeToken<JsonBean>(){}.getType();
        JsonBean jsonBean = gson.fromJson(jsonData, JsonBean.class);
        Log.d("myappdesc", jsonBean.getDesc());
        Log.d("myappstatus", jsonBean.getStatus());
        Log.d("myappjsonBean", jsonBean.toString() );
        Log.d("myappdata", jsonBean.getData().toString());

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
