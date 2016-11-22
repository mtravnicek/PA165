package cz.muni.pa165.pneuservis.service;

import cz.muni.pa165.pneuservis.persistence.domain.AdditionalService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by peter on 11/18/16.
 */
public interface AdditionalServiceService {
    public AdditionalService save(AdditionalService service);
    public AdditionalService findOne(Long id);
    public List<AdditionalService> findAll();
    public List<AdditionalService> findByNameContaining(String name);
    public void delete(Long id);
}
