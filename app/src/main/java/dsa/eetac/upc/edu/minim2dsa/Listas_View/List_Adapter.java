package dsa.eetac.upc.edu.minim2dsa.Listas_View;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import dsa.eetac.upc.edu.minim2dsa.R;

/**
 * Created by Carlos on 31/05/2017.
 */

public class List_Adapter extends ArrayAdapter<RowItem> {



    private Context context;


    public List_Adapter(Context context,int resourceId, List<RowItem> entradas) {
        super(context,resourceId,entradas);
        this.context = context;
    }

    private  class  ViewHolder{
        TextView textName;
        TextView textUrl;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder= null;
        RowItem rowItem = (RowItem) getItem(position);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if(convertView == null) {
            convertView = inflater.inflate(R.layout.activity_2, null);
            holder = new ViewHolder();
            holder.textName = (TextView) convertView.findViewById(R.id.textView_superior);
            holder.textUrl = (TextView) convertView.findViewById(R.id.textView_inferior);
            convertView.setTag(holder);
        }else
            holder=(ViewHolder)convertView.getTag();
        holder.textName.setText(rowItem.getUsername());
        holder.textUrl.setText(rowItem.getUrlimage());


        ShowList_follower showList_follower = new ShowList_follower();
        showList_follower.setTextOfRow(holder.textName,holder.textUrl);

        return convertView;
    }






}
