// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.market20151101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeProductsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeProductsResponseBody</p>
 */
public class DescribeProductsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("ProductItems")
    private ProductItems productItems;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeProductsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.productItems = builder.productItems;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProductsResponseBody create() {
        return builder().build();
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
     * @return productItems
     */
    public ProductItems getProductItems() {
        return this.productItems;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private ProductItems productItems; 
        private String requestId; 
        private Integer totalCount; 

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
         * ProductItems.
         */
        public Builder productItems(ProductItems productItems) {
            this.productItems = productItems;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeProductsResponseBody build() {
            return new DescribeProductsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeProductsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProductsResponseBody</p>
     */
    public static class ProductItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CategoryId")
        private Long categoryId;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("DeliveryDate")
        private String deliveryDate;

        @com.aliyun.core.annotation.NameInMap("DeliveryWay")
        private String deliveryWay;

        @com.aliyun.core.annotation.NameInMap("ImageUrl")
        private String imageUrl;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OperationSystem")
        private String operationSystem;

        @com.aliyun.core.annotation.NameInMap("PriceInfo")
        private String priceInfo;

        @com.aliyun.core.annotation.NameInMap("Score")
        private String score;

        @com.aliyun.core.annotation.NameInMap("ShortDescription")
        private String shortDescription;

        @com.aliyun.core.annotation.NameInMap("SuggestedPrice")
        private String suggestedPrice;

        @com.aliyun.core.annotation.NameInMap("SupplierId")
        private Long supplierId;

        @com.aliyun.core.annotation.NameInMap("SupplierName")
        private String supplierName;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private String tags;

        @com.aliyun.core.annotation.NameInMap("TargetUrl")
        private String targetUrl;

        @com.aliyun.core.annotation.NameInMap("WarrantyDate")
        private String warrantyDate;

        private ProductItem(Builder builder) {
            this.categoryId = builder.categoryId;
            this.code = builder.code;
            this.deliveryDate = builder.deliveryDate;
            this.deliveryWay = builder.deliveryWay;
            this.imageUrl = builder.imageUrl;
            this.name = builder.name;
            this.operationSystem = builder.operationSystem;
            this.priceInfo = builder.priceInfo;
            this.score = builder.score;
            this.shortDescription = builder.shortDescription;
            this.suggestedPrice = builder.suggestedPrice;
            this.supplierId = builder.supplierId;
            this.supplierName = builder.supplierName;
            this.tags = builder.tags;
            this.targetUrl = builder.targetUrl;
            this.warrantyDate = builder.warrantyDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProductItem create() {
            return builder().build();
        }

        /**
         * @return categoryId
         */
        public Long getCategoryId() {
            return this.categoryId;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return deliveryDate
         */
        public String getDeliveryDate() {
            return this.deliveryDate;
        }

        /**
         * @return deliveryWay
         */
        public String getDeliveryWay() {
            return this.deliveryWay;
        }

        /**
         * @return imageUrl
         */
        public String getImageUrl() {
            return this.imageUrl;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return operationSystem
         */
        public String getOperationSystem() {
            return this.operationSystem;
        }

        /**
         * @return priceInfo
         */
        public String getPriceInfo() {
            return this.priceInfo;
        }

        /**
         * @return score
         */
        public String getScore() {
            return this.score;
        }

        /**
         * @return shortDescription
         */
        public String getShortDescription() {
            return this.shortDescription;
        }

        /**
         * @return suggestedPrice
         */
        public String getSuggestedPrice() {
            return this.suggestedPrice;
        }

        /**
         * @return supplierId
         */
        public Long getSupplierId() {
            return this.supplierId;
        }

        /**
         * @return supplierName
         */
        public String getSupplierName() {
            return this.supplierName;
        }

        /**
         * @return tags
         */
        public String getTags() {
            return this.tags;
        }

        /**
         * @return targetUrl
         */
        public String getTargetUrl() {
            return this.targetUrl;
        }

        /**
         * @return warrantyDate
         */
        public String getWarrantyDate() {
            return this.warrantyDate;
        }

        public static final class Builder {
            private Long categoryId; 
            private String code; 
            private String deliveryDate; 
            private String deliveryWay; 
            private String imageUrl; 
            private String name; 
            private String operationSystem; 
            private String priceInfo; 
            private String score; 
            private String shortDescription; 
            private String suggestedPrice; 
            private Long supplierId; 
            private String supplierName; 
            private String tags; 
            private String targetUrl; 
            private String warrantyDate; 

            /**
             * CategoryId.
             */
            public Builder categoryId(Long categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * DeliveryDate.
             */
            public Builder deliveryDate(String deliveryDate) {
                this.deliveryDate = deliveryDate;
                return this;
            }

            /**
             * DeliveryWay.
             */
            public Builder deliveryWay(String deliveryWay) {
                this.deliveryWay = deliveryWay;
                return this;
            }

            /**
             * ImageUrl.
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
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
             * OperationSystem.
             */
            public Builder operationSystem(String operationSystem) {
                this.operationSystem = operationSystem;
                return this;
            }

            /**
             * PriceInfo.
             */
            public Builder priceInfo(String priceInfo) {
                this.priceInfo = priceInfo;
                return this;
            }

            /**
             * Score.
             */
            public Builder score(String score) {
                this.score = score;
                return this;
            }

            /**
             * ShortDescription.
             */
            public Builder shortDescription(String shortDescription) {
                this.shortDescription = shortDescription;
                return this;
            }

            /**
             * SuggestedPrice.
             */
            public Builder suggestedPrice(String suggestedPrice) {
                this.suggestedPrice = suggestedPrice;
                return this;
            }

            /**
             * SupplierId.
             */
            public Builder supplierId(Long supplierId) {
                this.supplierId = supplierId;
                return this;
            }

            /**
             * SupplierName.
             */
            public Builder supplierName(String supplierName) {
                this.supplierName = supplierName;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * TargetUrl.
             */
            public Builder targetUrl(String targetUrl) {
                this.targetUrl = targetUrl;
                return this;
            }

            /**
             * WarrantyDate.
             */
            public Builder warrantyDate(String warrantyDate) {
                this.warrantyDate = warrantyDate;
                return this;
            }

            public ProductItem build() {
                return new ProductItem(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeProductsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProductsResponseBody</p>
     */
    public static class ProductItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProductItem")
        private java.util.List < ProductItem> productItem;

        private ProductItems(Builder builder) {
            this.productItem = builder.productItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProductItems create() {
            return builder().build();
        }

        /**
         * @return productItem
         */
        public java.util.List < ProductItem> getProductItem() {
            return this.productItem;
        }

        public static final class Builder {
            private java.util.List < ProductItem> productItem; 

            /**
             * ProductItem.
             */
            public Builder productItem(java.util.List < ProductItem> productItem) {
                this.productItem = productItem;
                return this;
            }

            public ProductItems build() {
                return new ProductItems(this);
            } 

        } 

    }
}
