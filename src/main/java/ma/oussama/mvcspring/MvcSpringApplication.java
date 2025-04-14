package ma.oussama.mvcspring;

import ma.oussama.mvcspring.entities.Product;
import ma.oussama.mvcspring.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MvcSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(MvcSpringApplication.class, args);
    }
    @Bean
    public CommandLineRunner init(ProductRepository productRepository) {
        return args -> {
            Product product = Product.builder()
                    .name("Computer").price(4500).quantity(50)
                    .build();
            productRepository.save(product);
            productRepository.save(product.builder().name("Printer").price(4900).quantity(3).build());
            productRepository.save(product.builder().name("Phone").price(11500).quantity(5).build());
            productRepository.findAll().forEach(p->{
                    System.out.println(p.toString());
            });

        };
    }
}
