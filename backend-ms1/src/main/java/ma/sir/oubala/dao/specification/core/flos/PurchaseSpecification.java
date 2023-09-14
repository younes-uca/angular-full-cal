package  ma.sir.oubala.dao.specification.core.flos;

import ma.sir.oubala.zynerator.specification.AbstractSpecification;
import ma.sir.oubala.dao.criteria.core.flos.PurchaseCriteria;
import ma.sir.oubala.bean.core.flos.Purchase;


public class PurchaseSpecification extends  AbstractSpecification<PurchaseCriteria, Purchase>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("reference", criteria.getReference(),criteria.getReferenceLike());
        addPredicate("purchaseDate", criteria.getPurchaseDate(), criteria.getPurchaseDateFrom(), criteria.getPurchaseDateTo());
        addPredicate("purchaseStartDate", criteria.getPurchaseStartDate(), criteria.getPurchaseStartDateFrom(), criteria.getPurchaseStartDateTo());
        addPredicate("purchaseEndDate", criteria.getPurchaseEndDate(), criteria.getPurchaseEndDateFrom(), criteria.getPurchaseEndDateTo());
        addPredicate("image", criteria.getImage(),criteria.getImageLike());
        addPredicateBool("etat", criteria.getEtat());
        addPredicateBigDecimal("total", criteria.getTotal(), criteria.getTotalMin(), criteria.getTotalMax());
        addPredicateFk("client","id", criteria.getClient()==null?null:criteria.getClient().getId());
        addPredicateFk("client","id", criteria.getClients());
    }

    public PurchaseSpecification(PurchaseCriteria criteria) {
        super(criteria);
    }

    public PurchaseSpecification(PurchaseCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
