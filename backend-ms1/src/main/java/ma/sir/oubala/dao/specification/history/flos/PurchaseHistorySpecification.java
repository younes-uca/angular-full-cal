package  ma.sir.oubala.dao.specification.history.flos;

import ma.sir.oubala.zynerator.specification.AbstractHistorySpecification;
import ma.sir.oubala.dao.criteria.history.flos.PurchaseHistoryCriteria;
import ma.sir.oubala.bean.history.flos.PurchaseHistory;


public class PurchaseHistorySpecification extends AbstractHistorySpecification<PurchaseHistoryCriteria, PurchaseHistory> {

    public PurchaseHistorySpecification(PurchaseHistoryCriteria criteria) {
        super(criteria);
    }

    public PurchaseHistorySpecification(PurchaseHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
