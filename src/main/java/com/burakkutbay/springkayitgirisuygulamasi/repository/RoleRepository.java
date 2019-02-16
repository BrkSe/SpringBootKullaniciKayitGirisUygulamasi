package com.burakkutbay.springkayitgirisuygulamasi.repository;

import com.burakkutbay.springkayitgirisuygulamasi.model.Role;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by burakkutbay on 14.02.2019.
 */

public interface RoleRepository extends CrudRepository<Role, Long> {
    Role findByRole(String role);
}
