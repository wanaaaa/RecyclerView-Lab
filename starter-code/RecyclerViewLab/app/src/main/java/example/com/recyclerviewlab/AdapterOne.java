package example.com.recyclerviewlab;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

/**
 * Created by wanmac on 7/5/16.
 */
public class AdapterOne extends RecyclerView.Adapter<ViewHolderOne> {

    List<FirstObject> mFirstObject;

    public AdapterOne(List<FirstObject> firstObjects) {
        mFirstObject = firstObjects;
    }

    @Override
    public ViewHolderOne onCreateViewHolder(ViewGroup parent, int viewType) {
        View parentView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.first_view, parent, false);
        ViewHolderOne viewHolder = new ViewHolderOne(parentView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolderOne holder, int position) {
        holder.mTextViewTitle.setText(mFirstObject.get(position).getmTitle());
        holder.mTextViewDescription.setText("This is setDescription");
        holder.mTextViewColor.setText("setColor");

        View.OnClickListener onClickListener = new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "I am clicked", Toast.LENGTH_SHORT).show();
            }
        };

        holder.mButton1.setOnClickListener(onClickListener);
    }

    @Override
    public int getItemCount() {
        return mFirstObject.size();
    }


}
