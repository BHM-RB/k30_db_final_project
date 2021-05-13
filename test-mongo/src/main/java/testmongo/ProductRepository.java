package testmongo;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;

@Document(collection = "product")
public interface ProductRepository extends MongoRepository<Product, Long> { // Long: Type of Prodct ID.
 
    Product findBySku(String sku);
 
}
