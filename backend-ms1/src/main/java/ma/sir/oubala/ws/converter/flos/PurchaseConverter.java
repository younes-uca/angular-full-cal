package  ma.sir.oubala.ws.converter.flos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.sir.oubala.zynerator.util.ListUtil;

import ma.sir.oubala.ws.converter.commun.ClientConverter;
import ma.sir.oubala.ws.converter.commun.ProductConverter;
import ma.sir.oubala.ws.converter.flos.PurchaseItemConverter;



import ma.sir.oubala.zynerator.util.StringUtil;
import ma.sir.oubala.zynerator.converter.AbstractConverter;
import ma.sir.oubala.zynerator.util.DateUtil;
import ma.sir.oubala.bean.history.flos.PurchaseHistory;
import ma.sir.oubala.bean.core.flos.Purchase;
import ma.sir.oubala.ws.dto.flos.PurchaseDto;

@Component
public class PurchaseConverter extends AbstractConverter<Purchase, PurchaseDto, PurchaseHistory> {

    @Autowired
    private ClientConverter clientConverter ;
    @Autowired
    private ProductConverter productConverter ;
    @Autowired
    private PurchaseItemConverter purchaseItemConverter ;
    private boolean client;
    private boolean purchaseItems;

    public  PurchaseConverter(){
        super(Purchase.class, PurchaseDto.class, PurchaseHistory.class);
        init(true);
    }

    @Override
    public Purchase toItem(PurchaseDto dto) {
        if (dto == null) {
            return null;
        } else {
        Purchase item = new Purchase();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getReference()))
                item.setReference(dto.getReference());
            if(StringUtil.isNotEmpty(dto.getPurchaseDate()))
                item.setPurchaseDate(DateUtil.stringEnToDate(dto.getPurchaseDate()));
            if(StringUtil.isNotEmpty(dto.getPurchaseStartDate()))
                item.setPurchaseStartDate(DateUtil.stringEnToDate(dto.getPurchaseStartDate()));
            if(StringUtil.isNotEmpty(dto.getPurchaseEndDate()))
                item.setPurchaseEndDate(DateUtil.stringEnToDate(dto.getPurchaseEndDate()));
            if(StringUtil.isNotEmpty(dto.getImage()))
                item.setImage(dto.getImage());
            if(dto.getEtat() != null)
                item.setEtat(dto.getEtat());
            if(StringUtil.isNotEmpty(dto.getTotal()))
                item.setTotal(dto.getTotal());
            if(StringUtil.isNotEmpty(dto.getDescription()))
                item.setDescription(dto.getDescription());
            if(this.client && dto.getClient()!=null &&  dto.getClient().getId() != null)
                item.setClient(clientConverter.toItem(dto.getClient())) ;


            if(this.purchaseItems && ListUtil.isNotEmpty(dto.getPurchaseItems()))
                item.setPurchaseItems(purchaseItemConverter.toItem(dto.getPurchaseItems()));


        return item;
        }
    }

    @Override
    public PurchaseDto toDto(Purchase item) {
        if (item == null) {
            return null;
        } else {
            PurchaseDto dto = new PurchaseDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getReference()))
                dto.setReference(item.getReference());
            if(item.getPurchaseDate()!=null)
                dto.setPurchaseDate(DateUtil.dateTimeToString(item.getPurchaseDate()));
            if(item.getPurchaseStartDate()!=null)
                dto.setPurchaseStartDate(DateUtil.dateTimeToString(item.getPurchaseStartDate()));
            if(item.getPurchaseEndDate()!=null)
                dto.setPurchaseEndDate(DateUtil.dateTimeToString(item.getPurchaseEndDate()));
            if(StringUtil.isNotEmpty(item.getImage()))
                dto.setImage(item.getImage());
                dto.setEtat(item.getEtat());
            if(StringUtil.isNotEmpty(item.getTotal()))
                dto.setTotal(item.getTotal());
            if(StringUtil.isNotEmpty(item.getDescription()))
                dto.setDescription(item.getDescription());
        if(this.client && item.getClient()!=null) {
            dto.setClient(clientConverter.toDto(item.getClient())) ;
        }
        if(this.purchaseItems && ListUtil.isNotEmpty(item.getPurchaseItems())){
            purchaseItemConverter.init(true);
            purchaseItemConverter.setPurchase(false);
            dto.setPurchaseItems(purchaseItemConverter.toDto(item.getPurchaseItems()));
            purchaseItemConverter.setPurchase(true);

        }


        return dto;
        }
    }

    public void initList(boolean value) {
        this.purchaseItems = value;
    }

    public void initObject(boolean value) {
        this.client = value;
    }


    public ClientConverter getClientConverter(){
        return this.clientConverter;
    }
    public void setClientConverter(ClientConverter clientConverter ){
        this.clientConverter = clientConverter;
    }
    public ProductConverter getProductConverter(){
        return this.productConverter;
    }
    public void setProductConverter(ProductConverter productConverter ){
        this.productConverter = productConverter;
    }
    public PurchaseItemConverter getPurchaseItemConverter(){
        return this.purchaseItemConverter;
    }
    public void setPurchaseItemConverter(PurchaseItemConverter purchaseItemConverter ){
        this.purchaseItemConverter = purchaseItemConverter;
    }
    public boolean  isClient(){
        return this.client;
    }
    public void  setClient(boolean client){
        this.client = client;
    }
    public boolean  isPurchaseItems(){
        return this.purchaseItems ;
    }
    public void  setPurchaseItems(boolean purchaseItems ){
        this.purchaseItems  = purchaseItems ;
    }
}
