package br.com.dao;

import br.com.entity.User;

public class UserDAO extends GenericDAO<User, Integer> {

    public UserDAO() {
        super(User.class);
    }
}
