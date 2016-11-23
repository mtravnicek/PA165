package cz.muni.pa165.pneuservis.facade;

import cz.muni.pa165.pneuservis.dto.TireDTO;
import cz.muni.pa165.pneuservis.dto.TireTypeDTO;

import java.util.List;

/**
 * @author Martin Spisiak <spisiak@mail.muni.cz> on 23/11/2016.
 */
public interface TireFacade {
    TireDTO save(TireDTO tireDTO);
    TireDTO findOne(Long id);
    List<TireDTO> findAll();
    List<TireDTO> findByTireType(TireTypeDTO tireType);
    void delete(Long id);
}
