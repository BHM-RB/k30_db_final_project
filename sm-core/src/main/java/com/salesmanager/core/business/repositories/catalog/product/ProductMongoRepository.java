package com.salesmanager.core.business.repositories.catalog.product;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.salesmanager.core.model.catalog.product.MongoProduct;

@Document(collection = "product")
public interface ProductMongoRepository extends MongoRepository<MongoProduct, Long> { // Long: Type of Prodct ID.
 
    MongoProduct findBySku(String sku);
 
    MongoProduct findBySefUrl(String sefUrl);
}
