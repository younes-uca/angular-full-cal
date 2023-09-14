package ma.sir.oubala.service.impl.admin.commun;


import ma.sir.oubala.bean.core.commun.Client;
import ma.sir.oubala.bean.history.commun.ClientHistory;
import ma.sir.oubala.dao.criteria.core.commun.ClientCriteria;
import ma.sir.oubala.dao.criteria.history.commun.ClientHistoryCriteria;
import ma.sir.oubala.dao.facade.core.commun.ClientDao;
import ma.sir.oubala.dao.facade.history.commun.ClientHistoryDao;
import ma.sir.oubala.dao.specification.core.commun.ClientSpecification;
import ma.sir.oubala.service.facade.admin.commun.ClientAdminService;
import ma.sir.oubala.zynerator.service.AbstractServiceImpl;
import ma.sir.oubala.zynerator.service.Attribute;
import ma.sir.oubala.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;


import ma.sir.oubala.zynerator.util.VelocityPdf;
import ma.sir.oubala.ws.dto.commun.ClientDto;
import org.springframework.http.HttpEntity;

import org.springframework.beans.factory.annotation.Autowired;

import ma.sir.oubala.service.facade.admin.commun.ClientCategoryAdminService ;
import ma.sir.oubala.bean.core.commun.ClientCategory ;

import ma.sir.oubala.zynerator.security.service.facade.UserService;
import ma.sir.oubala.zynerator.security.service.facade.RoleService;
import ma.sir.oubala.zynerator.security.bean.Role;
import java.util.Collection;

import java.util.List;
@Service
public class ClientAdminServiceImpl extends AbstractServiceImpl<Client,ClientHistory, ClientCriteria, ClientHistoryCriteria, ClientDao,
ClientHistoryDao> implements ClientAdminService {
    public static final String TEMPLATE = "template/client.vm";
    public static final String FILE_NAME = "client.pdf";
public static final List<Attribute> ATTRIBUTES = new ArrayList();
    static{


    ATTRIBUTES.add(new Attribute("fullName"));


    ATTRIBUTES.add(new Attribute("credentialsNonExpired","Boolean"));

    ATTRIBUTES.add(new Attribute("enabled","Boolean"));

    ATTRIBUTES.add(new Attribute("accountNonExpired","Boolean"));

    ATTRIBUTES.add(new Attribute("accountNonLocked","Boolean"));

    ATTRIBUTES.add(new Attribute("passwordChanged","Boolean"));

    ATTRIBUTES.add(new Attribute("username"));

    ATTRIBUTES.add(new Attribute("password"));
    }

    @Override
    public HttpEntity<byte[]> createPdf(ClientDto dto) throws Exception{
        return velocityPdf.createPdf(FILE_NAME, TEMPLATE, dto);
    }





    public List<Client> findByClientCategoryId(Long id){
        return dao.findByClientCategoryId(id);
    }
    public int deleteByClientCategoryId(Long id){
        return dao.deleteByClientCategoryId(id);
    }



    @Override
    protected List<Attribute> getAttributes() {
        return ATTRIBUTES;
    }


    @Override
    public Client create(Client t) {
        if (findByUsername(t.getUsername()) != null || t.getPassword() == null) return null;
        t.setPassword(userService.cryptPassword(t.getPassword()));
        t.setEnabled(true);
        t.setAccountNonExpired(true);
        t.setAccountNonLocked(true);
        t.setCredentialsNonExpired(true);
        t.setPasswordChanged(false);
        if (t.getRoles() != null) {
            Collection<Role> roles = new ArrayList<Role>();
            for (Role role : t.getRoles()) {
                roles.add(roleService.save(role));
            }
            t.setRoles(roles);
        }
        Client mySaved = super.create(t);

        return mySaved;
     }

    public Client findByUsername(String username){
    return dao.findByUsername(username);
    }

    public boolean changePassword(String username, String newPassword) {
    return userService.changePassword(username, newPassword);
    }

    public void configure() {
        super.configure(Client.class,ClientHistory.class, ClientHistoryCriteria.class, ClientSpecification.class);
    }

    @Autowired
    private UserService userService;


    @Autowired
    private RoleService roleService;

    @Autowired
    private ClientCategoryAdminService clientCategoryService ;
    @Autowired
    private VelocityPdf velocityPdf;

    public ClientAdminServiceImpl(ClientDao dao, ClientHistoryDao historyDao) {
        super(dao, historyDao);
    }

}