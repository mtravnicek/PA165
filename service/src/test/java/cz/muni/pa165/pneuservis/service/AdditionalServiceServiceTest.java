package cz.muni.pa165.pneuservis.service;

import cz.muni.pa165.pneuservis.config.TestConfiguration;
import cz.muni.pa165.pneuservis.persistence.domain.AdditionalService;
import cz.muni.pa165.pneuservis.persistence.repository.AdditionalServiceRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;
import java.math.BigDecimal;

/**
 * Created by peter on 11/22/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfiguration.class)
public class AdditionalServiceServiceTest {
    @Mock
    AdditionalServiceRepository repository;

    @Inject
    @InjectMocks
    AdditionalServiceService serviceService;

    @Test
    public void test1() {
        MockitoAnnotations.initMocks(this);
        AdditionalService service = new AdditionalService();
        service.setName("Nazov");
        service.setDescription("Opis");
        service.setPrice(BigDecimal.TEN);
        serviceService.save(service);
    }
}
