package io.github.movax10.sublator.service;

import java.io.Serializable;
import java.util.List;

public interface GenericService <T, D, ID extends Serializable>{
    
    D findOne(ID id);
    
    List<D> findAll();
    
    void save(D dto);

}
