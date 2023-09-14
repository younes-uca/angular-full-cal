package  ma.sir.oubala.dao.specification.history.flos;

import ma.sir.oubala.zynerator.specification.AbstractHistorySpecification;
import ma.sir.oubala.dao.criteria.history.flos.PurchaseItemHistoryCriteria;
import ma.sir.oubala.bean.history.flos.PurchaseItemHistory;


public class PurchaseItemHistorySpecification extends AbstractHistorySpecification<PurchaseItemHistoryCriteria, PurchaseItemHistory> {

    public PurchaseItemHistorySpecification(PurchaseItemHistoryCriteria criteria) {
        super(criteria);
    }

    public PurchaseItemHistorySpecification(PurchaseItemHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
