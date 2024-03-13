package com.example.sem4_springboot_exem.service;

import java.util.List;

public interface IBaseCRUD<S> {
    List<S> getAll();
    S create(S s);
    S update(S s);
    S update(S s,Long e);
    boolean delete(Long e);
    <K> S find(K id);

    List<S> search(String e);
}
