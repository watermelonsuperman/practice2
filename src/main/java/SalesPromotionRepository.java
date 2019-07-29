import java.util.List;

public interface SalesPromotionRepository {
    List<SalesPromotion> findAll();
    int getPromotion1(int price);
    int getPromotion2(String id,int price);
}
