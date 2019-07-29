import java.util.List;

public class SalesPromotionRepositoryTestImpl implements SalesPromotionRepository {

    public List<SalesPromotion> findAll() {
        return TestData.ALL_SALES_PROMOTIONS;
    }

    public int getPromotion1(int price) {
        if(price>30){
            return price-6;
        }
        return price;
    }

    public int getPromotion2( String id,int price) {
        for(SalesPromotion s:this.findAll()){
            List<String> list = s.getRelatedItems();
            if(list.contains(id)){
               return price/2;
            }
        }
        return price;
    }


}
