import java.util.List;

public interface ItemRepository {
    List<Item> findAll();
    String getNameById(String id);
    int getPriceById(String id);
}
