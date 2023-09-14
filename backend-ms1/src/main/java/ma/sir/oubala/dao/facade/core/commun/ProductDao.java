package ma.sir.oubala.dao.facade.core.commun;

import org.springframework.data.jpa.repository.Query;
import ma.sir.oubala.zynerator.repository.AbstractRepository;
import ma.sir.oubala.bean.core.commun.Product;
import org.springframework.stereotype.Repository;
import ma.sir.oubala.bean.core.commun.Product;
import java.util.List;


@Repository
public interface ProductDao extends AbstractRepository<Product,Long>  {
    Product findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW Product(item.id,item.reference) FROM Product item")
    List<Product> findAllOptimized();

}
