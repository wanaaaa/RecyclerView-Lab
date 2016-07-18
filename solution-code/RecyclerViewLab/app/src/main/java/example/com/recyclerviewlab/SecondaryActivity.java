package example.com.recyclerviewlab;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SecondaryActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview_secondary_activity);
        mRecyclerView.setLayoutManager(
                new LinearLayoutManager(SecondaryActivity.this,
                        LinearLayoutManager.VERTICAL, false));

        List<CustomJavaObject2> objectList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            objectList.add(new CustomJavaObject2()); //This creates a default CustomJavaObject2
        }

        mRecyclerView.setAdapter(new SecondaryRecyclerViewAdapter(objectList));


    }
}
