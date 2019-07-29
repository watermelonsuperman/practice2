import java.util.List;

public class ItemRepositoryTestImpl implements ItemRepository{

    public List<Item> findAll() {
        return TestData.ALL_ITEMS;
    }

    public String getNameById(String id) {
        List<Item> all = TestData.ALL_ITEMS;
        for(Item i : all){
            if(id.equals(i.getId())){
                return i.getName();
            }
        }
        return null;
    }

    public int getPriceById(String id) {
        List<Item> all = TestData.ALL_ITEMS;
        for(Item i : all){
            if(id.equals(i.getId())){
                return (int)i.getPrice();
            }
        }
        return 0;
    }
}
