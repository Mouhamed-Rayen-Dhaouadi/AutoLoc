package tn.esprit.autoloc.service;

import java.util.List;

public interface ICrudService<T, ID> {
    List<T> retrieveAll();
    T retrieve(ID id);
    T add(T entity);
    T modify(T entity);
    void remove(ID id);
}