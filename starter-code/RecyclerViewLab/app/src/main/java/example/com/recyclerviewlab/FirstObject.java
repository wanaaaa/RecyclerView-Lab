package example.com.recyclerviewlab;

/**
 * Created by wanmac on 7/5/16.
 */
public class FirstObject {
    String mTitle, mDescription, mColor;

    public FirstObject() {
        mTitle = "titleOne";
        mDescription = "descriptionOne";
        mColor = "colorOne";
    }


    public FirstObject(String title, String description, String color) {
        mTitle = title;
        mDescription = description;
        mColor = color;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String title) {
        mTitle = title;
    }



}
