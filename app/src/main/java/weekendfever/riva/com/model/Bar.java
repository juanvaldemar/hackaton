package weekendfever.riva.com.model;

public class Bar {
    private String title;
    private String status;
    private String image;

    public Bar() {
    }

    public Bar(String title, String status, String image) {
        this.title = title;
        this.status = status;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
