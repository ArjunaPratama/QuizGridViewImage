package com.arjuna.quizgridviewimage;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    GridView gridview;

    String[] values = {
            "Instagram", "Facebook", "Path", "Snapchat", "Twitter"
    };
    int[] images = {

            R.drawable.instagram,
            R.drawable.facebook,
            R.drawable.path,
            R.drawable.snapchat,
            R.drawable.twitter,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridview = (GridView) findViewById(R.id.gridview);

        GridAdapter gridAdapter = new GridAdapter();
        gridview.setAdapter(gridAdapter);

    }

    class GridAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int Position, View convertView, ViewGroup viewGroup) {
            View view = getLayoutInflater().inflate(R.layout.list_item, null);
            ImageView mImageView = (ImageView) view.findViewById(R.id.imageview);
            TextView mTextView = (TextView) view.findViewById(R.id.textview);

            mImageView.setImageResource(images[Position]);
            mTextView.setText(values[Position]);

            return view;
        }
    }
}
