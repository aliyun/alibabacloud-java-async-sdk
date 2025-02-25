// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cd2021127.models;

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
 * {@link CreateMenuDataRequest} extends {@link RequestModel}
 *
 * <p>CreateMenuDataRequest</p>
 */
public class CreateMenuDataRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BatchId")
    private String batchId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Country")
    private String country;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Priority")
    private Integer priority;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductCombineList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<ProductCombineList> productCombineList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductContainerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productContainerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ShopGroupId")
    private String shopGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ShopIdList")
    private java.util.List<String> shopIdList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private CreateMenuDataRequest(Builder builder) {
        super(builder);
        this.batchId = builder.batchId;
        this.country = builder.country;
        this.priority = builder.priority;
        this.productCombineList = builder.productCombineList;
        this.productContainerId = builder.productContainerId;
        this.shopGroupId = builder.shopGroupId;
        this.shopIdList = builder.shopIdList;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMenuDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return batchId
     */
    public String getBatchId() {
        return this.batchId;
    }

    /**
     * @return country
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * @return productCombineList
     */
    public java.util.List<ProductCombineList> getProductCombineList() {
        return this.productCombineList;
    }

    /**
     * @return productContainerId
     */
    public String getProductContainerId() {
        return this.productContainerId;
    }

    /**
     * @return shopGroupId
     */
    public String getShopGroupId() {
        return this.shopGroupId;
    }

    /**
     * @return shopIdList
     */
    public java.util.List<String> getShopIdList() {
        return this.shopIdList;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateMenuDataRequest, Builder> {
        private String batchId; 
        private String country; 
        private Integer priority; 
        private java.util.List<ProductCombineList> productCombineList; 
        private String productContainerId; 
        private String shopGroupId; 
        private java.util.List<String> shopIdList; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateMenuDataRequest request) {
            super(request);
            this.batchId = request.batchId;
            this.country = request.country;
            this.priority = request.priority;
            this.productCombineList = request.productCombineList;
            this.productContainerId = request.productContainerId;
            this.shopGroupId = request.shopGroupId;
            this.shopIdList = request.shopIdList;
            this.type = request.type;
        } 

        /**
         * BatchId.
         */
        public Builder batchId(String batchId) {
            this.putBodyParameter("BatchId", batchId);
            this.batchId = batchId;
            return this;
        }

        /**
         * Country.
         */
        public Builder country(String country) {
            this.putBodyParameter("Country", country);
            this.country = country;
            return this;
        }

        /**
         * Priority.
         */
        public Builder priority(Integer priority) {
            this.putBodyParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder productCombineList(java.util.List<ProductCombineList> productCombineList) {
            String productCombineListShrink = shrink(productCombineList, "ProductCombineList", "json");
            this.putBodyParameter("ProductCombineList", productCombineListShrink);
            this.productCombineList = productCombineList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>productContainerId</p>
         */
        public Builder productContainerId(String productContainerId) {
            this.putBodyParameter("ProductContainerId", productContainerId);
            this.productContainerId = productContainerId;
            return this;
        }

        /**
         * ShopGroupId.
         */
        public Builder shopGroupId(String shopGroupId) {
            this.putBodyParameter("ShopGroupId", shopGroupId);
            this.shopGroupId = shopGroupId;
            return this;
        }

        /**
         * ShopIdList.
         */
        public Builder shopIdList(java.util.List<String> shopIdList) {
            String shopIdListShrink = shrink(shopIdList, "ShopIdList", "json");
            this.putBodyParameter("ShopIdList", shopIdListShrink);
            this.shopIdList = shopIdList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>top</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateMenuDataRequest build() {
            return new CreateMenuDataRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateMenuDataRequest} extends {@link TeaModel}
     *
     * <p>CreateMenuDataRequest</p>
     */
    public static class ProductInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChineseName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String chineseName;

        @com.aliyun.core.annotation.NameInMap("CurrentPrice")
        private String currentPrice;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EnglishName")
        private String englishName;

        @com.aliyun.core.annotation.NameInMap("IconText")
        private String iconText;

        @com.aliyun.core.annotation.NameInMap("OriginalPrice")
        private String originalPrice;

        @com.aliyun.core.annotation.NameInMap("ProductId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String productId;

        @com.aliyun.core.annotation.NameInMap("ProductType")
        private String productType;

        @com.aliyun.core.annotation.NameInMap("Temperature")
        private String temperature;

        private ProductInfo(Builder builder) {
            this.chineseName = builder.chineseName;
            this.currentPrice = builder.currentPrice;
            this.description = builder.description;
            this.englishName = builder.englishName;
            this.iconText = builder.iconText;
            this.originalPrice = builder.originalPrice;
            this.productId = builder.productId;
            this.productType = builder.productType;
            this.temperature = builder.temperature;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProductInfo create() {
            return builder().build();
        }

        /**
         * @return chineseName
         */
        public String getChineseName() {
            return this.chineseName;
        }

        /**
         * @return currentPrice
         */
        public String getCurrentPrice() {
            return this.currentPrice;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return englishName
         */
        public String getEnglishName() {
            return this.englishName;
        }

        /**
         * @return iconText
         */
        public String getIconText() {
            return this.iconText;
        }

        /**
         * @return originalPrice
         */
        public String getOriginalPrice() {
            return this.originalPrice;
        }

        /**
         * @return productId
         */
        public String getProductId() {
            return this.productId;
        }

        /**
         * @return productType
         */
        public String getProductType() {
            return this.productType;
        }

        /**
         * @return temperature
         */
        public String getTemperature() {
            return this.temperature;
        }

        public static final class Builder {
            private String chineseName; 
            private String currentPrice; 
            private String description; 
            private String englishName; 
            private String iconText; 
            private String originalPrice; 
            private String productId; 
            private String productType; 
            private String temperature; 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder chineseName(String chineseName) {
                this.chineseName = chineseName;
                return this;
            }

            /**
             * CurrentPrice.
             */
            public Builder currentPrice(String currentPrice) {
                this.currentPrice = currentPrice;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * EnglishName.
             */
            public Builder englishName(String englishName) {
                this.englishName = englishName;
                return this;
            }

            /**
             * IconText.
             */
            public Builder iconText(String iconText) {
                this.iconText = iconText;
                return this;
            }

            /**
             * OriginalPrice.
             */
            public Builder originalPrice(String originalPrice) {
                this.originalPrice = originalPrice;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>productId</p>
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * ProductType.
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * Temperature.
             */
            public Builder temperature(String temperature) {
                this.temperature = temperature;
                return this;
            }

            public ProductInfo build() {
                return new ProductInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMenuDataRequest} extends {@link TeaModel}
     *
     * <p>CreateMenuDataRequest</p>
     */
    public static class ProductItemList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Order")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer order;

        @com.aliyun.core.annotation.NameInMap("ProductInfo")
        @com.aliyun.core.annotation.Validation(required = true)
        private ProductInfo productInfo;

        private ProductItemList(Builder builder) {
            this.order = builder.order;
            this.productInfo = builder.productInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProductItemList create() {
            return builder().build();
        }

        /**
         * @return order
         */
        public Integer getOrder() {
            return this.order;
        }

        /**
         * @return productInfo
         */
        public ProductInfo getProductInfo() {
            return this.productInfo;
        }

        public static final class Builder {
            private Integer order; 
            private ProductInfo productInfo; 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder order(Integer order) {
                this.order = order;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder productInfo(ProductInfo productInfo) {
                this.productInfo = productInfo;
                return this;
            }

            public ProductItemList build() {
                return new ProductItemList(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMenuDataRequest} extends {@link TeaModel}
     *
     * <p>CreateMenuDataRequest</p>
     */
    public static class ProductCombineList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnglishName")
        private String englishName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Order")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer order;

        @com.aliyun.core.annotation.NameInMap("ProductItemList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<ProductItemList> productItemList;

        private ProductCombineList(Builder builder) {
            this.englishName = builder.englishName;
            this.name = builder.name;
            this.order = builder.order;
            this.productItemList = builder.productItemList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProductCombineList create() {
            return builder().build();
        }

        /**
         * @return englishName
         */
        public String getEnglishName() {
            return this.englishName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return order
         */
        public Integer getOrder() {
            return this.order;
        }

        /**
         * @return productItemList
         */
        public java.util.List<ProductItemList> getProductItemList() {
            return this.productItemList;
        }

        public static final class Builder {
            private String englishName; 
            private String name; 
            private Integer order; 
            private java.util.List<ProductItemList> productItemList; 

            /**
             * EnglishName.
             */
            public Builder englishName(String englishName) {
                this.englishName = englishName;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder order(Integer order) {
                this.order = order;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder productItemList(java.util.List<ProductItemList> productItemList) {
                this.productItemList = productItemList;
                return this;
            }

            public ProductCombineList build() {
                return new ProductCombineList(this);
            } 

        } 

    }
}
