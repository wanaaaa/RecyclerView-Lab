package example.com.recyclerviewlab;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by alanjcaceres on 7/12/16.
 */

public class MainRecyclerViewHolder extends RecyclerView.ViewHolder {

    ImageView coloredImageView;
    TextView titleTextView;
    TextView descriptionTextView;

    public MainRecyclerViewHolder(View itemView) {
        super(itemView);

        coloredImageView = (ImageView) itemView.findViewById(R.id.imageview_color);
        titleTextView = (TextView) itemView.findViewById(R.id.textview_title);
        descriptionTextView = (TextView) itemView.findViewById(R.id.textview_title);

    }

    public void setTitle(String title){
        titleTextView.setText(title);
    }

    public void setDescription(String description){
        descriptionTextView.setText(description);
    }

    public void setColor(int colorResId){
        coloredImageView.setBackgroundResource(colorResId);
    }
}
