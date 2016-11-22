package cz.muni.pa165.pneuservis.facade;

import cz.muni.pa165.pneuservis.dto.AdditionalServiceDTO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by peter on 11/18/16.
 */
@Service
public interface AdditionalServiceFacade {
    public AdditionalServiceDTO create(AdditionalServiceDTO dto);
    public AdditionalServiceDTO update(AdditionalServiceDTO dto);
    public AdditionalServiceDTO findOne(Long id);
    public List<AdditionalServiceDTO> findAll();
    public void delete(Long id);
}
