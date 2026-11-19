// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link Product} extends {@link TeaModel}
 *
 * <p>Product</p>
 */
public class Product extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("brandName")
    private String brandName;

    @com.aliyun.core.annotation.NameInMap("canSell")
    private Boolean canSell;

    @com.aliyun.core.annotation.NameInMap("categoryChain")
    private java.util.List<Category> categoryChain;

    @com.aliyun.core.annotation.NameInMap("categoryLeafId")
    private Long categoryLeafId;

    @com.aliyun.core.annotation.NameInMap("descPath")
    private String descPath;

    @com.aliyun.core.annotation.NameInMap("divisionCode")
    private String divisionCode;

    @com.aliyun.core.annotation.NameInMap("extendProperties")
    private java.util.List<ProductExtendProperty> extendProperties;

    @com.aliyun.core.annotation.NameInMap("fuzzyQuantity")
    private String fuzzyQuantity;

    @com.aliyun.core.annotation.NameInMap("images")
    private java.util.List<String> images;

    @com.aliyun.core.annotation.NameInMap("inGroup")
    private Boolean inGroup;

    @com.aliyun.core.annotation.NameInMap("limitRules")
    private java.util.List<LimitRule> limitRules;

    @com.aliyun.core.annotation.NameInMap("lmItemId")
    private String lmItemId;

    @com.aliyun.core.annotation.NameInMap("picUrl")
    private String picUrl;

    @com.aliyun.core.annotation.NameInMap("productId")
    private String productId;

    @com.aliyun.core.annotation.NameInMap("productSpecs")
    private java.util.List<ProductSpec> productSpecs;

    @com.aliyun.core.annotation.NameInMap("productStatus")
    private String productStatus;

    @com.aliyun.core.annotation.NameInMap("productType")
    private String productType;

    @com.aliyun.core.annotation.NameInMap("properties")
    private java.util.List<ProductProperty> properties;

    @com.aliyun.core.annotation.NameInMap("quantity")
    private Long quantity;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("servicePromises")
    private java.util.List<String> servicePromises;

    @com.aliyun.core.annotation.NameInMap("shopId")
    private String shopId;

    @com.aliyun.core.annotation.NameInMap("skus")
    private java.util.List<Sku> skus;

    @com.aliyun.core.annotation.NameInMap("soldQuantity")
    private String soldQuantity;

    @com.aliyun.core.annotation.NameInMap("taxCode")
    private String taxCode;

    @com.aliyun.core.annotation.NameInMap("taxRate")
    private Integer taxRate;

    @com.aliyun.core.annotation.NameInMap("title")
    private String title;

    private Product(Builder builder) {
        this.brandName = builder.brandName;
        this.canSell = builder.canSell;
        this.categoryChain = builder.categoryChain;
        this.categoryLeafId = builder.categoryLeafId;
        this.descPath = builder.descPath;
        this.divisionCode = builder.divisionCode;
        this.extendProperties = builder.extendProperties;
        this.fuzzyQuantity = builder.fuzzyQuantity;
        this.images = builder.images;
        this.inGroup = builder.inGroup;
        this.limitRules = builder.limitRules;
        this.lmItemId = builder.lmItemId;
        this.picUrl = builder.picUrl;
        this.productId = builder.productId;
        this.productSpecs = builder.productSpecs;
        this.productStatus = builder.productStatus;
        this.productType = builder.productType;
        this.properties = builder.properties;
        this.quantity = builder.quantity;
        this.requestId = builder.requestId;
        this.servicePromises = builder.servicePromises;
        this.shopId = builder.shopId;
        this.skus = builder.skus;
        this.soldQuantity = builder.soldQuantity;
        this.taxCode = builder.taxCode;
        this.taxRate = builder.taxRate;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Product create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return brandName
     */
    public String getBrandName() {
        return this.brandName;
    }

    /**
     * @return canSell
     */
    public Boolean getCanSell() {
        return this.canSell;
    }

    /**
     * @return categoryChain
     */
    public java.util.List<Category> getCategoryChain() {
        return this.categoryChain;
    }

    /**
     * @return categoryLeafId
     */
    public Long getCategoryLeafId() {
        return this.categoryLeafId;
    }

    /**
     * @return descPath
     */
    public String getDescPath() {
        return this.descPath;
    }

    /**
     * @return divisionCode
     */
    public String getDivisionCode() {
        return this.divisionCode;
    }

    /**
     * @return extendProperties
     */
    public java.util.List<ProductExtendProperty> getExtendProperties() {
        return this.extendProperties;
    }

    /**
     * @return fuzzyQuantity
     */
    public String getFuzzyQuantity() {
        return this.fuzzyQuantity;
    }

    /**
     * @return images
     */
    public java.util.List<String> getImages() {
        return this.images;
    }

    /**
     * @return inGroup
     */
    public Boolean getInGroup() {
        return this.inGroup;
    }

    /**
     * @return limitRules
     */
    public java.util.List<LimitRule> getLimitRules() {
        return this.limitRules;
    }

    /**
     * @return lmItemId
     */
    public String getLmItemId() {
        return this.lmItemId;
    }

    /**
     * @return picUrl
     */
    public String getPicUrl() {
        return this.picUrl;
    }

    /**
     * @return productId
     */
    public String getProductId() {
        return this.productId;
    }

    /**
     * @return productSpecs
     */
    public java.util.List<ProductSpec> getProductSpecs() {
        return this.productSpecs;
    }

    /**
     * @return productStatus
     */
    public String getProductStatus() {
        return this.productStatus;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return properties
     */
    public java.util.List<ProductProperty> getProperties() {
        return this.properties;
    }

    /**
     * @return quantity
     */
    public Long getQuantity() {
        return this.quantity;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return servicePromises
     */
    public java.util.List<String> getServicePromises() {
        return this.servicePromises;
    }

    /**
     * @return shopId
     */
    public String getShopId() {
        return this.shopId;
    }

    /**
     * @return skus
     */
    public java.util.List<Sku> getSkus() {
        return this.skus;
    }

    /**
     * @return soldQuantity
     */
    public String getSoldQuantity() {
        return this.soldQuantity;
    }

    /**
     * @return taxCode
     */
    public String getTaxCode() {
        return this.taxCode;
    }

    /**
     * @return taxRate
     */
    public Integer getTaxRate() {
        return this.taxRate;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder {
        private String brandName; 
        private Boolean canSell; 
        private java.util.List<Category> categoryChain; 
        private Long categoryLeafId; 
        private String descPath; 
        private String divisionCode; 
        private java.util.List<ProductExtendProperty> extendProperties; 
        private String fuzzyQuantity; 
        private java.util.List<String> images; 
        private Boolean inGroup; 
        private java.util.List<LimitRule> limitRules; 
        private String lmItemId; 
        private String picUrl; 
        private String productId; 
        private java.util.List<ProductSpec> productSpecs; 
        private String productStatus; 
        private String productType; 
        private java.util.List<ProductProperty> properties; 
        private Long quantity; 
        private String requestId; 
        private java.util.List<String> servicePromises; 
        private String shopId; 
        private java.util.List<Sku> skus; 
        private String soldQuantity; 
        private String taxCode; 
        private Integer taxRate; 
        private String title; 

        private Builder() {
        } 

        private Builder(Product model) {
            this.brandName = model.brandName;
            this.canSell = model.canSell;
            this.categoryChain = model.categoryChain;
            this.categoryLeafId = model.categoryLeafId;
            this.descPath = model.descPath;
            this.divisionCode = model.divisionCode;
            this.extendProperties = model.extendProperties;
            this.fuzzyQuantity = model.fuzzyQuantity;
            this.images = model.images;
            this.inGroup = model.inGroup;
            this.limitRules = model.limitRules;
            this.lmItemId = model.lmItemId;
            this.picUrl = model.picUrl;
            this.productId = model.productId;
            this.productSpecs = model.productSpecs;
            this.productStatus = model.productStatus;
            this.productType = model.productType;
            this.properties = model.properties;
            this.quantity = model.quantity;
            this.requestId = model.requestId;
            this.servicePromises = model.servicePromises;
            this.shopId = model.shopId;
            this.skus = model.skus;
            this.soldQuantity = model.soldQuantity;
            this.taxCode = model.taxCode;
            this.taxRate = model.taxRate;
            this.title = model.title;
        } 

        /**
         * <p>The brand name.</p>
         * 
         * <strong>example:</strong>
         * <p>Apple</p>
         */
        public Builder brandName(String brandName) {
            this.brandName = brandName;
            return this;
        }

        /**
         * <p>The calculated value indicating whether the product is available for sale.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder canSell(Boolean canSell) {
            this.canSell = canSell;
            return this;
        }

        /**
         * <p>The category chain.</p>
         */
        public Builder categoryChain(java.util.List<Category> categoryChain) {
            this.categoryChain = categoryChain;
            return this;
        }

        /**
         * <p>The leaf category ID.</p>
         * 
         * <strong>example:</strong>
         * <p>201****501</p>
         */
        public Builder categoryLeafId(Long categoryLeafId) {
            this.categoryLeafId = categoryLeafId;
            return this;
        }

        /**
         * <p>The product details URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://img.alicdn.com/descpath/O1CN01wciRDp22AEU1*******f34">https://img.alicdn.com/descpath/O1CN01wciRDp22AEU1*******f34</a></p>
         */
        public Builder descPath(String descPath) {
            this.descPath = descPath;
            return this;
        }

        /**
         * <p>The division code.</p>
         * 
         * <strong>example:</strong>
         * <p>110000</p>
         */
        public Builder divisionCode(String divisionCode) {
            this.divisionCode = divisionCode;
            return this;
        }

        /**
         * <p>The extended product properties.</p>
         */
        public Builder extendProperties(java.util.List<ProductExtendProperty> extendProperties) {
            this.extendProperties = extendProperties;
            return this;
        }

        /**
         * <p>The approximate inventory.</p>
         * 
         * <strong>example:</strong>
         * <p>In stock</p>
         */
        public Builder fuzzyQuantity(String fuzzyQuantity) {
            this.fuzzyQuantity = fuzzyQuantity;
            return this;
        }

        /**
         * <p>images</p>
         */
        public Builder images(java.util.List<String> images) {
            this.images = images;
            return this;
        }

        /**
         * <p>The warehousing status of the product.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder inGroup(Boolean inGroup) {
            this.inGroup = inGroup;
            return this;
        }

        /**
         * <p>The purchase limit rules.</p>
         */
        public Builder limitRules(java.util.List<LimitRule> limitRules) {
            this.limitRules = limitRules;
            return this;
        }

        /**
         * <p>The LM product ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2100<strong><strong>7-458</strong></strong>812</p>
         */
        public Builder lmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }

        /**
         * <p>The product main image.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://img.alicdn.com/imgextra/i3/221*******988/O1CN01w4vomR1QYYEx6nyr5_!!221******988.jpg">https://img.alicdn.com/imgextra/i3/221*******988/O1CN01w4vomR1QYYEx6nyr5_!!221******988.jpg</a></p>
         */
        public Builder picUrl(String picUrl) {
            this.picUrl = picUrl;
            return this;
        }

        /**
         * <p>The product ID.</p>
         * 
         * <strong>example:</strong>
         * <p>660460842******080</p>
         */
        public Builder productId(String productId) {
            this.productId = productId;
            return this;
        }

        /**
         * <p>The product specifications.</p>
         */
        public Builder productSpecs(java.util.List<ProductSpec> productSpecs) {
            this.productSpecs = productSpecs;
            return this;
        }

        /**
         * <p>The product status.</p>
         * 
         * <strong>example:</strong>
         * <p>Online</p>
         */
        public Builder productStatus(String productStatus) {
            this.productStatus = productStatus;
            return this;
        }

        /**
         * <p>The product type.</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder productType(String productType) {
            this.productType = productType;
            return this;
        }

        /**
         * <p>The product properties.</p>
         */
        public Builder properties(java.util.List<ProductProperty> properties) {
            this.properties = properties;
            return this;
        }

        /**
         * <p>The inventory.</p>
         * <blockquote>
         * <ul>
         * <li>This field is currently a fixed value of -1 and can be ignored.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        public Builder quantity(Long quantity) {
            this.quantity = quantity;
            return this;
        }

        /**
         * <p>The API request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3239281273******823</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The service commitments.<notice>Service commitments are maintained by suppliers. If suppliers fail to maintain or update them promptly, the service commitment labels for some products may be inaccurate. Distributors should display these commitments to their customers with caution.</notice></p>
         */
        public Builder servicePromises(java.util.List<String> servicePromises) {
            this.servicePromises = servicePromises;
            return this;
        }

        /**
         * <p>The channel store ID.</p>
         * 
         * <strong>example:</strong>
         * <p>210*****7</p>
         */
        public Builder shopId(String shopId) {
            this.shopId = shopId;
            return this;
        }

        /**
         * <p>skus</p>
         */
        public Builder skus(java.util.List<Sku> skus) {
            this.skus = skus;
            return this;
        }

        /**
         * <p>The sales volume.</p>
         * 
         * <strong>example:</strong>
         * <p>100+</p>
         */
        public Builder soldQuantity(String soldQuantity) {
            this.soldQuantity = soldQuantity;
            return this;
        }

        /**
         * <p>The tax code.</p>
         * 
         * <strong>example:</strong>
         * <p>3040203000*******000</p>
         */
        public Builder taxCode(String taxCode) {
            this.taxCode = taxCode;
            return this;
        }

        /**
         * <p>The tax rate.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        public Builder taxRate(Integer taxRate) {
            this.taxRate = taxRate;
            return this;
        }

        /**
         * <p>The title.</p>
         * 
         * <strong>example:</strong>
         * <p>Money tree</p>
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Product build() {
            return new Product(this);
        } 

    } 

}
