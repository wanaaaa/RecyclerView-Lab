package example.com.recyclerviewlab;

/**
 * Created by alanjcaceres on 7/12/16.
 */

public class CustomJavaObject2 extends CustomJavaObject1{

    boolean mChecked;

    public CustomJavaObject2(){
        super("Title", "Description", R.color.colorPrimary);
        mChecked = false;
    }

    public CustomJavaObject2(boolean checked) {
        mChecked = checked;
    }

    public CustomJavaObject2(String title, String description,
                             int color, boolean checked) {
        super(title, description, color);
        mChecked = checked;
    }

    public boolean isChecked() {
        return mChecked;
    }

    public void setChecked(boolean checked) {
        mChecked = checked;
    }
}
