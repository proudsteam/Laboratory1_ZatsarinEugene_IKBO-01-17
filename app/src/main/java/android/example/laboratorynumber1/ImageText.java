package android.example.laboratorynumber1;

public class ImageText {
    private String color;
    private String text;
    private int image;

    public ImageText(String color, String text, int image) {
        this.color = color;
        this.text = text;
        this.image = image;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
