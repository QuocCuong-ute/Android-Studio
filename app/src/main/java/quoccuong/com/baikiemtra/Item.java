package quoccuong.com.baikiemtra;

public class Item {
    private String title;
    private String description;
    private int imageResID;

    public Item(String title, String description, int imageResID) {
        this.title = title;
        this.description = description;
        this.imageResID = imageResID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImageResID() {
        return imageResID;
    }

    public void setImageResID(int imageResID) {
        this.imageResID = imageResID;
    }
}
