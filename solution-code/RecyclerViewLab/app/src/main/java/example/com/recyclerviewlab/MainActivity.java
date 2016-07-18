package example.com.recyclerviewlab;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview_main_activity);
        mRecyclerView.setLayoutManager(
                new LinearLayoutManager(MainActivity.this,
                        LinearLayoutManager.VERTICAL, false));

        List<CustomJavaObject1> objectList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            objectList.add(new CustomJavaObject1()); //This creates a default CustomJavaObject1
        }

        mRecyclerView.setAdapter(new MainRecyclerViewAdapter(objectList));

    }
}
