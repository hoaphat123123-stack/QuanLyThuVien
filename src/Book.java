import java.util.List;

public class Book {
    private String title = "Sach da merge main va feature";
    private String id;

    public Book(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public static Book timKiemTheoMa(List<Book> books, String maSach) {
        for (Book b : books) {
            if (b.getId().equalsIgnoreCase(maSach)) {
                return b;
            }
        }
        return null;
    }
}
