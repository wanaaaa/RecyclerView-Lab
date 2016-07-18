package example.com.recyclerviewlab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecylerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mRecylerView = (RecyclerView) findViewById(R.id.recyclerview_main);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false);
        mRecylerView.setLayoutManager(linearLayoutManager);

        List<FirstObject> firstListObjects = new ArrayList<>();

        Collections.fill(firstListObjects, new FirstObject());
        firstListObjects.add(new FirstObject("hi", "hello", "Yo"));
        firstListObjects.add(new FirstObject("hghffgdfi", "hello", "Yo"));
        firstListObjects.add(new FirstObject("hi", "hello", "Yo"));
        firstListObjects.add(new FirstObject("hi", "hello", "Yo"));

        mRecylerView.setAdapter(new AdapterOne(firstListObjects));

    }
}
