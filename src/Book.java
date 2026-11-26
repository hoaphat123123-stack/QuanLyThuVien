import java.util.List;

public class Book {
    private String title = "Sach tren nhanh FEATURE";
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
