package com.burakkutbay.springkayitgirisuygulamasi.repository;

import com.burakkutbay.springkayitgirisuygulamasi.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by burakkutbay on 14.02.2019.
 */

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);

    User findByEmail(String email);
}
