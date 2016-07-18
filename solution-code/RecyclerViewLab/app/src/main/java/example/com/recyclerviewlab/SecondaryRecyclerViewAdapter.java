package example.com.recyclerviewlab;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by alanjcaceres on 7/12/16.
 */

public class SecondaryRecyclerViewAdapter
        extends RecyclerView.Adapter<SecondaryRecyclerViewHolder> {

    List<CustomJavaObject2> mObjectList;

    public SecondaryRecyclerViewAdapter(List<CustomJavaObject2> objectList){
        mObjectList = objectList;
    }

    @Override
    public SecondaryRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.secondary_recycler_row, parent, false);

        return new SecondaryRecyclerViewHolder(v);
    }

    @Override
    public void onBindViewHolder(SecondaryRecyclerViewHolder holder, final int position) {
        final CustomJavaObject2 customJavaObject = mObjectList.get(position);
        holder.setTitle(customJavaObject.getTitle());
        holder.setDescription(customJavaObject.getDescription());
        holder.setColor(customJavaObject.getColor());
        holder.setChecked(customJavaObject.isChecked());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //This toggles the boolean value of checked
                customJavaObject.setChecked(!customJavaObject.isChecked());
                notifyItemChanged(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mObjectList.size();
    }
}
