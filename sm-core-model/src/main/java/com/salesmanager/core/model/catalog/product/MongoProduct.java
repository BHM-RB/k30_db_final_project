package com.salesmanager.core.model.catalog.product;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "product")
public class MongoProduct {
	@Id
	private BigInteger id;

	@Indexed(unique = true)
	@Field(value = "sku")
	private String sku;

	@Field(value = "sef_url")
	private String sefUrl;

	@Field(value = "product_weight")
	private BigDecimal productWeight;

	@Field(value = "product_height")
	private BigDecimal productHeight;

	@Field(value = "product_width")
	private BigDecimal productWidth;

	@Field(value = "product_length")
	private BigDecimal productLength;

	@Field(value = "product_description")
	private MongoProductDescription productDescription;

	@Field(value = "product_image")
	private MongoProductImage productImage;

	@Field(value = "product_availability")
	private MongoProductAvailability productAvailability;

	@Document(collection = "product_description")
	public class MongoProductDescription {
		@Id
		private BigInteger id;
		@Field(value = "name")
		private String name;
		@Field(value = "description")
		private String description;

		public Long getId() {
			return id.longValue();
		}

		public void setId(BigInteger id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

	}

	@Document(collection = "product_image")
	public class MongoProductImage {
		@Id
		private BigInteger id;
		@Field(value = "product_image")
		private String productImage;
		@Field(value = "description")
		private String description;

		public Long getId() {
			return id.longValue();
		}

		public void setId(BigInteger id) {
			this.id = id;
		}

		public String getProductImage() {
			return productImage;
		}

		public void setProductImage(String productImage) {
			this.productImage = productImage;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

	}

	@Document(collection = "product_availability")
	public class MongoProductAvailability {
		@Id
		private BigInteger id;
		@Field(value = "quantity")
		private Integer quantity;
		@Field(value = "product_price")
		private MongoProductPrice productPrice;

		@Document(collection = "product_price")
		public class MongoProductPrice {
			@Id
			private BigInteger id;
			@Field(value = "product_price_amount")
			private BigDecimal price;

			public Long getId() {
				return id.longValue();
			}

			public void setId(BigInteger id) {
				this.id = id;
			}

			public BigDecimal getPrice() {
				return price;
			}

			public void setPrice(BigDecimal price) {
				this.price = price;
			}
		}

		public Long getId() {
			return id.longValue();
		}

		public void setId(BigInteger id) {
			this.id = id;
		}

		public Integer getQuantity() {
			return quantity;
		}

		public void setQuantity(Integer quantity) {
			this.quantity = quantity;
		}

		public MongoProductPrice getProductPrice() {
			return productPrice;
		}

		public void setProductPrice(MongoProductPrice productPrice) {
			this.productPrice = productPrice;
		}

	}

	@Override
	public String toString() {
		return "id:" + this.id + ", sku: " + sku //
				+ ", title: " + this.productDescription.name + ", description: " + this.productDescription.description;
	}

	public Long getId() {
		return id.longValue();
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

	public String getSefUrl() {
		return sefUrl;
	}

	public void setSefUrl(String sefUrl) {
		this.sefUrl = sefUrl;
	}

	public BigDecimal getProductWeight() {
		return productWeight;
	}

	public void setProductWeight(BigDecimal productWeight) {
		this.productWeight = productWeight;
	}

	public BigDecimal getProductHeight() {
		return productHeight;
	}

	public void setProductHeight(BigDecimal productHeight) {
		this.productHeight = productHeight;
	}

	public BigDecimal getProductWidth() {
		return productWidth;
	}

	public void setProductWidth(BigDecimal productWidth) {
		this.productWidth = productWidth;
	}

	public BigDecimal getProductLength() {
		return productLength;
	}

	public void setProductLength(BigDecimal productLength) {
		this.productLength = productLength;
	}

	public MongoProductDescription getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(MongoProductDescription productDescription) {
		this.productDescription = productDescription;
	}

	public MongoProductImage getProductImage() {
		return productImage;
	}

	public void setProductImage(MongoProductImage productImage) {
		this.productImage = productImage;
	}

	public MongoProductAvailability getProductAvailability() {
		return productAvailability;
	}

	public void setProductAvailability(MongoProductAvailability productAvailability) {
		this.productAvailability = productAvailability;
	}

}