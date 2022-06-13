package knight.springframework.mypetstore.services;

import knight.springframework.mypetstore.model.Owner;

import java.time.LocalDate;
import java.util.Set;

public interface OwnerService extends CrudService<Owner,Long>{


    Owner findByLastName(String lastName);



}
