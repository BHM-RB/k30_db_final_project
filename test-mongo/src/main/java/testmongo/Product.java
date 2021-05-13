package testmongo;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "product")
public class Product {
	@Id
    private BigInteger id;
 
    @Indexed(unique = true)
    @Field(value = "sku")
    private String sku;
 
    @Field(value = "title")
    private String title;
 
    @Field(value = "description")
    private String description;
    
    @Override
    public String toString() {
        return "id:" + this.id + ", sku: " + sku //
                + ", title: " + this.title + ", description: " + this.description;
    }

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
    
}
