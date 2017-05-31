package dsa.eetac.upc.edu.minim2dsa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import android.widget.ListView;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    private GlobalData globalData = null;
    private ListView listView;
    List<RowItem> rowItems;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_2);
            globalData = (GlobalData) getApplication();
            User user = globalData.getUser();
            rowItems = new ArrayList<RowItem>();

            TextView repos = (TextView) findViewById(R.id.textView_nrepo);
            repos.setText(user.getRepositories());
            TextView followers = (TextView) findViewById(R.id.textView_nfollow);
            followers.setText(user.getFollowing());
            for (int i = 0; i < globalData.getFollowerList().size(); i++){
                RowItem item = new RowItem(R.drawable.man,globalData.getFollowerList().get(i).getFollowername());
                rowItems.add(item);
            }
            listView = (ListView) findViewById(R.id.list);
            List_Adapter adapter = new List_Adapter(this,R.layout.activity_entry,rowItems);
            listView.setAdapter(adapter);
        }
    }

