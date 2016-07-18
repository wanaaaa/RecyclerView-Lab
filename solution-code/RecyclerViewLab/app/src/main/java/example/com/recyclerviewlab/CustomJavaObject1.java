package example.com.recyclerviewlab;

/**
 * Created by alanjcaceres on 7/12/16.
 */

public class CustomJavaObject1 {

    String mTitle;
    String mDescription;
    int mColor;

    public CustomJavaObject1() {
        mTitle = "Title";
        mDescription = "Description";
        mColor = R.color.colorAccent;
    }

    public CustomJavaObject1(String title, String description, int color) {
        mTitle = title;
        mDescription = description;
        mColor = color;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public int getColor() {
        return mColor;
    }

    public void setColor(int color) {
        mColor = color;
    }
}
