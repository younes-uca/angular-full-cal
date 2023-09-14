package  ma.sir.oubala.dao.specification.history.commun;

import ma.sir.oubala.zynerator.specification.AbstractHistorySpecification;
import ma.sir.oubala.dao.criteria.history.commun.ProductHistoryCriteria;
import ma.sir.oubala.bean.history.commun.ProductHistory;


public class ProductHistorySpecification extends AbstractHistorySpecification<ProductHistoryCriteria, ProductHistory> {

    public ProductHistorySpecification(ProductHistoryCriteria criteria) {
        super(criteria);
    }

    public ProductHistorySpecification(ProductHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
