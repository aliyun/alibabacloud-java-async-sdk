// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link ListProductsResponseBody} extends {@link TeaModel}
 *
 * <p>ListProductsResponseBody</p>
 */
public class ListProductsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("Products")
    private java.util.List<Products> products;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListProductsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.products = builder.products;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProductsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return products
     */
    public java.util.List<Products> getProducts() {
        return this.products;
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
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<Products> products; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListProductsResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.products = model.products;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Products.
         */
        public Builder products(java.util.List<Products> products) {
            this.products = products;
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

        public ListProductsResponseBody build() {
            return new ListProductsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListProductsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProductsResponseBody</p>
     */
    public static class Products extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AbnormalDataIngestionCount")
        private Integer abnormalDataIngestionCount;

        @com.aliyun.core.annotation.NameInMap("ActiveTime")
        private Long activeTime;

        @com.aliyun.core.annotation.NameInMap("AllowAddDataIngestion")
        private Boolean allowAddDataIngestion;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DataIngestionStatus")
        private Boolean dataIngestionStatus;

        @com.aliyun.core.annotation.NameInMap("EnabledDataIngestionCount")
        private Integer enabledDataIngestionCount;

        @com.aliyun.core.annotation.NameInMap("ProductAlias")
        private String productAlias;

        @com.aliyun.core.annotation.NameInMap("ProductId")
        private String productId;

        @com.aliyun.core.annotation.NameInMap("ProductName")
        private String productName;

        @com.aliyun.core.annotation.NameInMap("ProductType")
        private String productType;

        @com.aliyun.core.annotation.NameInMap("TotalDataIngestionCount")
        private Integer totalDataIngestionCount;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        @com.aliyun.core.annotation.NameInMap("VendorId")
        private String vendorId;

        @com.aliyun.core.annotation.NameInMap("VendorName")
        private String vendorName;

        private Products(Builder builder) {
            this.abnormalDataIngestionCount = builder.abnormalDataIngestionCount;
            this.activeTime = builder.activeTime;
            this.allowAddDataIngestion = builder.allowAddDataIngestion;
            this.createTime = builder.createTime;
            this.dataIngestionStatus = builder.dataIngestionStatus;
            this.enabledDataIngestionCount = builder.enabledDataIngestionCount;
            this.productAlias = builder.productAlias;
            this.productId = builder.productId;
            this.productName = builder.productName;
            this.productType = builder.productType;
            this.totalDataIngestionCount = builder.totalDataIngestionCount;
            this.updateTime = builder.updateTime;
            this.vendorId = builder.vendorId;
            this.vendorName = builder.vendorName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Products create() {
            return builder().build();
        }

        /**
         * @return abnormalDataIngestionCount
         */
        public Integer getAbnormalDataIngestionCount() {
            return this.abnormalDataIngestionCount;
        }

        /**
         * @return activeTime
         */
        public Long getActiveTime() {
            return this.activeTime;
        }

        /**
         * @return allowAddDataIngestion
         */
        public Boolean getAllowAddDataIngestion() {
            return this.allowAddDataIngestion;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dataIngestionStatus
         */
        public Boolean getDataIngestionStatus() {
            return this.dataIngestionStatus;
        }

        /**
         * @return enabledDataIngestionCount
         */
        public Integer getEnabledDataIngestionCount() {
            return this.enabledDataIngestionCount;
        }

        /**
         * @return productAlias
         */
        public String getProductAlias() {
            return this.productAlias;
        }

        /**
         * @return productId
         */
        public String getProductId() {
            return this.productId;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        /**
         * @return productType
         */
        public String getProductType() {
            return this.productType;
        }

        /**
         * @return totalDataIngestionCount
         */
        public Integer getTotalDataIngestionCount() {
            return this.totalDataIngestionCount;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return vendorId
         */
        public String getVendorId() {
            return this.vendorId;
        }

        /**
         * @return vendorName
         */
        public String getVendorName() {
            return this.vendorName;
        }

        public static final class Builder {
            private Integer abnormalDataIngestionCount; 
            private Long activeTime; 
            private Boolean allowAddDataIngestion; 
            private Long createTime; 
            private Boolean dataIngestionStatus; 
            private Integer enabledDataIngestionCount; 
            private String productAlias; 
            private String productId; 
            private String productName; 
            private String productType; 
            private Integer totalDataIngestionCount; 
            private Long updateTime; 
            private String vendorId; 
            private String vendorName; 

            private Builder() {
            } 

            private Builder(Products model) {
                this.abnormalDataIngestionCount = model.abnormalDataIngestionCount;
                this.activeTime = model.activeTime;
                this.allowAddDataIngestion = model.allowAddDataIngestion;
                this.createTime = model.createTime;
                this.dataIngestionStatus = model.dataIngestionStatus;
                this.enabledDataIngestionCount = model.enabledDataIngestionCount;
                this.productAlias = model.productAlias;
                this.productId = model.productId;
                this.productName = model.productName;
                this.productType = model.productType;
                this.totalDataIngestionCount = model.totalDataIngestionCount;
                this.updateTime = model.updateTime;
                this.vendorId = model.vendorId;
                this.vendorName = model.vendorName;
            } 

            /**
             * AbnormalDataIngestionCount.
             */
            public Builder abnormalDataIngestionCount(Integer abnormalDataIngestionCount) {
                this.abnormalDataIngestionCount = abnormalDataIngestionCount;
                return this;
            }

            /**
             * ActiveTime.
             */
            public Builder activeTime(Long activeTime) {
                this.activeTime = activeTime;
                return this;
            }

            /**
             * AllowAddDataIngestion.
             */
            public Builder allowAddDataIngestion(Boolean allowAddDataIngestion) {
                this.allowAddDataIngestion = allowAddDataIngestion;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DataIngestionStatus.
             */
            public Builder dataIngestionStatus(Boolean dataIngestionStatus) {
                this.dataIngestionStatus = dataIngestionStatus;
                return this;
            }

            /**
             * EnabledDataIngestionCount.
             */
            public Builder enabledDataIngestionCount(Integer enabledDataIngestionCount) {
                this.enabledDataIngestionCount = enabledDataIngestionCount;
                return this;
            }

            /**
             * ProductAlias.
             */
            public Builder productAlias(String productAlias) {
                this.productAlias = productAlias;
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
             * ProductName.
             */
            public Builder productName(String productName) {
                this.productName = productName;
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
             * TotalDataIngestionCount.
             */
            public Builder totalDataIngestionCount(Integer totalDataIngestionCount) {
                this.totalDataIngestionCount = totalDataIngestionCount;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * VendorId.
             */
            public Builder vendorId(String vendorId) {
                this.vendorId = vendorId;
                return this;
            }

            /**
             * VendorName.
             */
            public Builder vendorName(String vendorName) {
                this.vendorName = vendorName;
                return this;
            }

            public Products build() {
                return new Products(this);
            } 

        } 

    }
}
