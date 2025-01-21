package _rc.assessment.test;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import _rc.assessment.test.model.Product;
import _rc.assessment.test.repository.ProductRepository; // Assumiamo che tu abbia un repository per la tua entità Product

@Configuration
public class DataLoader {

    @Bean
    public CommandLineRunner loadData(ProductRepository productRepository) {
        return (args) -> {
            if (productRepository.count() == 0) {
                Product product1 = new Product();
                product1.setName("Prodotto A");
                product1.setDescription("Descrizione del prodotto A");
                product1.setPrice(19.99);
                product1.setQuantity(10);
                productRepository.save(product1);

                Product product2 = new Product();
                product2.setName("Prodotto B");
                product2.setDescription("Descrizione del prodotto B");
                product2.setPrice(29.99);
                product2.setQuantity(15);
                productRepository.save(product2);

                Product product3 = new Product();
                product3.setName("Prodotto C");
                product3.setDescription("Descrizione del prodotto C");
                product3.setPrice(9.99);
                product3.setQuantity(25);
                productRepository.save(product3);
            }
        };
    }
}
