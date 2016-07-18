package example.com.recyclerviewlab;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by alanjcaceres on 7/12/16.
 */

public class SecondaryRecyclerViewHolder extends RecyclerView.ViewHolder {

    ImageView coloredImageView;
    TextView titleTextView;
    TextView descriptionTextView;
    CheckBox checkBox;

    public SecondaryRecyclerViewHolder(View itemView) {
        super(itemView);

        coloredImageView = (ImageView) itemView.findViewById(R.id.imageview_color);
        titleTextView = (TextView) itemView.findViewById(R.id.textview_title);
        descriptionTextView = (TextView) itemView.findViewById(R.id.textview_title);
        checkBox = (CheckBox) itemView.findViewById(R.id.checkbox_checked);

    }

    public void setChecked(boolean checked){
        checkBox.setChecked(checked);
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
