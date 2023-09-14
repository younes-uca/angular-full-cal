package ma.sir.oubala.service.facade.admin.commun;

import java.util.List;
import ma.sir.oubala.bean.core.commun.Client;
import ma.sir.oubala.dao.criteria.core.commun.ClientCriteria;
import ma.sir.oubala.dao.criteria.history.commun.ClientHistoryCriteria;
import ma.sir.oubala.zynerator.service.IService;

import ma.sir.oubala.ws.dto.commun.ClientDto;
import org.springframework.http.HttpEntity;

public interface ClientAdminService extends  IService<Client,ClientCriteria, ClientHistoryCriteria>  {
    Client findByUsername(String username);
    boolean changePassword(String username, String newPassword);

    List<Client> findByClientCategoryId(Long id);
    int deleteByClientCategoryId(Long id);


    HttpEntity<byte[]> createPdf(ClientDto dto) throws Exception;

}
