package example.com.recyclerviewlab;

/**
 * Created by wanmac on 7/5/16.
 */
public class SecondObject {
    String mTitle, mDescription, mColor;
    boolean mCheck;

    public SecondObject() {
        mTitle = "titleOne";
        mDescription = "descriptionOne";
        mColor = "colorOne";
        mCheck = true;
    }

    public SecondObject (String title, String description, String color) {
        mTitle = title;
        mDescription = description;
        mColor = "red";
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String title) {
        mTitle = title;
    }

    public boolean getmCheck() {
        return mCheck;
    }

    public void  setmCheck(boolean check) {
        mCheck = check;
    }


}
