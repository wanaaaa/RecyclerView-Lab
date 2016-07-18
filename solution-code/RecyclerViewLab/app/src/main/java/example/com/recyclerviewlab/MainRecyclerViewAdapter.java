package example.com.recyclerviewlab;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by alanjcaceres on 7/12/16.
 */

public class MainRecyclerViewAdapter extends
        RecyclerView.Adapter<MainRecyclerViewHolder> {

    List<CustomJavaObject1> mObjectList;

    public MainRecyclerViewAdapter(List<CustomJavaObject1> objectList){
        mObjectList = objectList;
    }

    @Override
    public MainRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.main_recycler_row, parent, false);
        return new MainRecyclerViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MainRecyclerViewHolder holder, int position) {
        CustomJavaObject1 customJavaObject = mObjectList.get(position);
        holder.setTitle(customJavaObject.getTitle());
        holder.setDescription(customJavaObject.getDescription());
        holder.setColor(customJavaObject.getColor());
    }

    @Override
    public int getItemCount() {
        return mObjectList.size();
    }
}
