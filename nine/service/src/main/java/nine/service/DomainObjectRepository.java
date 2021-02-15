package nine.service;

import java.util.List;

import org.nakedobjects.applib.AbstractFactoryAndRepository;

import nine.dom.DomainObject;


public class DomainObjectRepository extends AbstractFactoryAndRepository {

    public String title() {
        return "Domain Objects";
    }

    public String iconName() {
        return "DomainObject";
    }

    public List<DomainObject> allDomainObjects() {
        return allInstances(DomainObject.class);
    }

    public DomainObject newDomainObject() {
        DomainObject object = newTransientInstance(DomainObject.class);
        return object;
    }

}
