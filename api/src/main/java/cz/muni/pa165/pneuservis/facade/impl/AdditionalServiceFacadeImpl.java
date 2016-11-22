package cz.muni.pa165.pneuservis.facade.impl;

import cz.muni.pa165.pneuservis.dto.AdditionalServiceDTO;
import cz.muni.pa165.pneuservis.facade.AdditionalServiceFacade;
import cz.muni.pa165.pneuservis.persistence.domain.AdditionalService;
import cz.muni.pa165.pneuservis.service.AdditionalServiceService;
import cz.muni.pa165.pneuservis.service.BeanMappingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by peter on 11/18/16.
 */
@Service
@Transactional
public class AdditionalServiceFacadeImpl implements AdditionalServiceFacade {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Inject
    public AdditionalServiceService serviceService;
    @Inject
    public BeanMappingService mappingService;

    public AdditionalServiceDTO create(AdditionalServiceDTO dto) {
        AdditionalService service = mappingService.mapTo(dto, AdditionalService.class);
        return mappingService.mapTo(serviceService.save(service), AdditionalServiceDTO.class);
    }

    public AdditionalServiceDTO update(AdditionalServiceDTO dto) {
        return null;
    }

    public AdditionalServiceDTO findOne(Long id) {
        return null;
    }

    public List<AdditionalServiceDTO> findAll() {
        return null;
    }

    public void delete(Long id) {

    }
}
