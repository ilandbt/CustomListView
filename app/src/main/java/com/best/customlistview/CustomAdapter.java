package com.best.customlistview;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.best.cutomlistview.R;

import java.util.List;

/**
 * Created by ilandbt on 24/02/2016.
 */
public class CustomAdapter extends ArrayAdapter<Model> {

    public CustomAdapter(Context context, List<Model> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //infalte view only if the view wasn't inflated befor
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_row, parent, false);
        }

        //get model
        final Model model = getItem(position);

        //init views
        TextView t = (TextView) convertView.findViewById(R.id.title);
        Button b = (Button) convertView.findViewById(R.id.image);

        t.setText(model.getTitle());

        //set text color by model status
        if (model.getStatus() == Model.Status.A) {
            t.setTextColor(Color.BLUE);
        } else {
            t.setTextColor(Color.GREEN);
        }

        //set click event
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //toggle status
                model.toggleStatus();

                //reload the list view to see new changes
                notifyDataSetChanged();
            }
        });

        return convertView;
    }
}
