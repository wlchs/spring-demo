package com.laszloborbely.spring_demo_security.user;

import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.Optional;

public class ApplicationUserRepository implements CrudRepository<ApplicationUser, Integer> {
    private final ArrayList<ApplicationUser> userList;

    public ApplicationUserRepository() {
        userList = new ArrayList<>();
    }

    @Override
    public <AUser extends ApplicationUser> AUser save(AUser aUser) {
        userList.add(aUser);
        return aUser;
    }

    @Override
    public <AUser extends ApplicationUser> Iterable<AUser> saveAll(Iterable<AUser> users) {
        for (AUser user : users) {
            userList.add(user);
        }
        return users;
    }

    @Override
    public Optional<ApplicationUser> findById(Integer id) {
        if (userList.size() > id && id >= 0) {
            return Optional.of(userList.get(id));
        } else {
            return Optional.empty();
        }
    }

    @Override
    public boolean existsById(Integer id) {
        return userList.size() > id && id >= 0;
    }

    @Override
    public Iterable<ApplicationUser> findAll() {
        return userList;
    }

    @Override
    public Iterable<ApplicationUser> findAllById(Iterable<Integer> ids) {
        ArrayList<ApplicationUser> results = new ArrayList<>();
        int listSize = userList.size();

        ids.forEach(id -> {
            if (id >= 0 && id < listSize) {
                results.add(userList.get(id));
            }
        });

        return results;
    }

    @Override
    public long count() {
        return userList.size();
    }

    @Override
    public void deleteById(Integer id) {
        userList.remove(id.intValue());
    }

    @Override
    public void delete(ApplicationUser applicationUser) {
        userList.remove(applicationUser);
    }

    @Override
    public void deleteAll(Iterable<? extends ApplicationUser> users) {
        ArrayList<ApplicationUser> userCollection = new ArrayList<>();
        users.forEach(userList::remove);
    }

    @Override
    public void deleteAll() {
        userList.clear();
    }

    public Optional<ApplicationUser> findByUsername(String userName) {
        return userList.stream()
                .filter(i -> i.getUsername().equals(userName))
                .findFirst();
    }
}
