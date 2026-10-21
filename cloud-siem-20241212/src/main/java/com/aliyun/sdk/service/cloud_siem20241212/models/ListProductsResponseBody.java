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
         * <p>The maximum number of entries to return in this request.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token. You do not need to specify this parameter for the first request or if no more results exist. If more results exist, set this parameter to the NextToken value returned by the previous API call.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAUqcj6VO4E3ECWIrFczs****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The list of products.</p>
         */
        public Builder products(java.util.List<Products> products) {
            this.products = products;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>57</p>
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
             * <p>The number of abnormal data ingestion entries.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder abnormalDataIngestionCount(Integer abnormalDataIngestionCount) {
                this.abnormalDataIngestionCount = abnormalDataIngestionCount;
                return this;
            }

            /**
             * <p>The activation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1733269771123</p>
             */
            public Builder activeTime(Long activeTime) {
                this.activeTime = activeTime;
                return this;
            }

            /**
             * <p>Indicates whether data collection can be added.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder allowAddDataIngestion(Boolean allowAddDataIngestion) {
                this.allowAddDataIngestion = allowAddDataIngestion;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1733269771123</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The accessed state of data ingestion. Valid values:</p>
             * <ul>
             * <li>enabled: Enabled.</li>
             * <li>disabled: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder dataIngestionStatus(Boolean dataIngestionStatus) {
                this.dataIngestionStatus = dataIngestionStatus;
                return this;
            }

            /**
             * <p>The number of enabled data ingestion entries.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder enabledDataIngestionCount(Integer enabledDataIngestionCount) {
                this.enabledDataIngestionCount = enabledDataIngestionCount;
                return this;
            }

            /**
             * <p>The product alias.</p>
             * 
             * <strong>example:</strong>
             * <p>alibaba_cloud_sas</p>
             */
            public Builder productAlias(String productAlias) {
                this.productAlias = productAlias;
                return this;
            }

            /**
             * <p>The product ID.</p>
             * 
             * <strong>example:</strong>
             * <p>alibaba_cloud_sas</p>
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> This parameter is deprecated and does not need to be specified.</p>
             * 
             * <strong>example:</strong>
             * <p>sas</p>
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * <p>The product type. Valid values:</p>
             * <ul>
             * <li>preset</li>
             * <li>custom</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>preset</p>
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * <p>The total number of data ingestion entries.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder totalDataIngestionCount(Integer totalDataIngestionCount) {
                this.totalDataIngestionCount = totalDataIngestionCount;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>1733269771123</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The vendor ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vd-qlsw5eocx94w9</p>
             */
            public Builder vendorId(String vendorId) {
                this.vendorId = vendorId;
                return this;
            }

            /**
             * <p>The vendor name.</p>
             * 
             * <strong>example:</strong>
             * <p>111</p>
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
