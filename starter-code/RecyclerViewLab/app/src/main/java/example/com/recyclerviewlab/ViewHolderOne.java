package example.com.recyclerviewlab;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by wanmac on 7/5/16.
 */
public class ViewHolderOne extends RecyclerView.ViewHolder {
    public TextView mTextViewTitle, mTextViewDescription, mTextViewColor;
    public Button mButton1;

    public ViewHolderOne (View itemView) {
        super(itemView);

        mTextViewTitle = (TextView) itemView.findViewById(R.id.titleID);
        mTextViewDescription = (TextView) itemView.findViewById(R.id.descriptionID);
        mTextViewColor = (TextView) itemView.findViewById(R.id.colorID);
        mButton1 = (Button) itemView.findViewById(R.id.button01);

    }
}


