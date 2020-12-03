package cn.zql.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView lv;
    MyAdapter myAdapter = new MyAdapter();
    List<String[]> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initview();
    }

    private void initview() {
        lv = findViewById(R.id.listview);
        System.out.println("w jinlai l ");
        list.add(new String[]{"\n123","\n123","aaaa\n222"});
        lv.setAdapter(myAdapter);
    }

    private class MyAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return list.size();
        }

        @Override
        public Object getItem(int position) {
            return list.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = View.inflate(MainActivity.this, R.layout.item_listview, null);
            TextView man, money, time;
            man = convertView.findViewById(R.id.tv_man);
            money = convertView.findViewById(R.id.tv_money);
            time = convertView.findViewById(R.id.tv_time);
            man.setText(list.get(position)[0]);
            money.setText(list.get(position)[1]);
            time.setText(list.get(position)[2]);
            System.out.println("lail ");
            return convertView;
        }
    }
}
