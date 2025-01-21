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
 * {@link ListMenuDataResponseBody} extends {@link TeaModel}
 *
 * <p>ListMenuDataResponseBody</p>
 */
public class ListMenuDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListMenuDataResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMenuDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListMenuDataResponseBody build() {
            return new ListMenuDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMenuDataResponseBody} extends {@link TeaModel}
     *
     * <p>ListMenuDataResponseBody</p>
     */
    public static class ProductInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChineseName")
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
             * ChineseName.
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
             * ProductId.
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
     * {@link ListMenuDataResponseBody} extends {@link TeaModel}
     *
     * <p>ListMenuDataResponseBody</p>
     */
    public static class ProductItemList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Order")
        private Integer order;

        @com.aliyun.core.annotation.NameInMap("ProductInfo")
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
             * Order.
             */
            public Builder order(Integer order) {
                this.order = order;
                return this;
            }

            /**
             * ProductInfo.
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
     * {@link ListMenuDataResponseBody} extends {@link TeaModel}
     *
     * <p>ListMenuDataResponseBody</p>
     */
    public static class ProductCombineList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Order")
        private Integer order;

        @com.aliyun.core.annotation.NameInMap("ProductItemList")
        private java.util.List<ProductItemList> productItemList;

        private ProductCombineList(Builder builder) {
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
            private String name; 
            private Integer order; 
            private java.util.List<ProductItemList> productItemList; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Order.
             */
            public Builder order(Integer order) {
                this.order = order;
                return this;
            }

            /**
             * ProductItemList.
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
    /**
     * 
     * {@link ListMenuDataResponseBody} extends {@link TeaModel}
     *
     * <p>ListMenuDataResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BatchId")
        private String batchId;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("ProductCombineList")
        private java.util.List<ProductCombineList> productCombineList;

        @com.aliyun.core.annotation.NameInMap("ProductContainerId")
        private String productContainerId;

        @com.aliyun.core.annotation.NameInMap("ShopGroupId")
        private String shopGroupId;

        @com.aliyun.core.annotation.NameInMap("ShopIdList")
        private java.util.List<String> shopIdList;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Data(Builder builder) {
            this.batchId = builder.batchId;
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

        public static Data create() {
            return builder().build();
        }

        /**
         * @return batchId
         */
        public String getBatchId() {
            return this.batchId;
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

        public static final class Builder {
            private String batchId; 
            private Integer priority; 
            private java.util.List<ProductCombineList> productCombineList; 
            private String productContainerId; 
            private String shopGroupId; 
            private java.util.List<String> shopIdList; 
            private String type; 

            /**
             * BatchId.
             */
            public Builder batchId(String batchId) {
                this.batchId = batchId;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * ProductCombineList.
             */
            public Builder productCombineList(java.util.List<ProductCombineList> productCombineList) {
                this.productCombineList = productCombineList;
                return this;
            }

            /**
             * ProductContainerId.
             */
            public Builder productContainerId(String productContainerId) {
                this.productContainerId = productContainerId;
                return this;
            }

            /**
             * ShopGroupId.
             */
            public Builder shopGroupId(String shopGroupId) {
                this.shopGroupId = shopGroupId;
                return this;
            }

            /**
             * ShopIdList.
             */
            public Builder shopIdList(java.util.List<String> shopIdList) {
                this.shopIdList = shopIdList;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
