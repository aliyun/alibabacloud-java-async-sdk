// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

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

    @com.aliyun.core.annotation.NameInMap("ProductInfo")
    private java.util.List<ProductInfo> productInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListProductsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.productInfo = builder.productInfo;
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
     * @return productInfo
     */
    public java.util.List<ProductInfo> getProductInfo() {
        return this.productInfo;
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
        private java.util.List<ProductInfo> productInfo; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListProductsResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.productInfo = model.productInfo;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The maximum number of entries returned for this query.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token that marks the position of the returned query data. An empty value indicates that all data has been queried.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The information about the Alibaba Cloud service.</p>
         */
        public Builder productInfo(java.util.List<ProductInfo> productInfo) {
            this.productInfo = productInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1DA9C136-11BC-4C39-ADC6-B86276128072</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned for this request.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
    public static class ProductInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommonQuotaSupport")
        private String commonQuotaSupport;

        @com.aliyun.core.annotation.NameInMap("Dynamic")
        private Boolean dynamic;

        @com.aliyun.core.annotation.NameInMap("FlowControlSupport")
        private String flowControlSupport;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("ProductName")
        private String productName;

        @com.aliyun.core.annotation.NameInMap("ProductNameEn")
        private String productNameEn;

        @com.aliyun.core.annotation.NameInMap("SecondCategoryId")
        private Long secondCategoryId;

        @com.aliyun.core.annotation.NameInMap("SecondCategoryName")
        private String secondCategoryName;

        @com.aliyun.core.annotation.NameInMap("SecondCategoryNameEn")
        private String secondCategoryNameEn;

        @com.aliyun.core.annotation.NameInMap("WhiteListLabelQuotaSupport")
        private String whiteListLabelQuotaSupport;

        private ProductInfo(Builder builder) {
            this.commonQuotaSupport = builder.commonQuotaSupport;
            this.dynamic = builder.dynamic;
            this.flowControlSupport = builder.flowControlSupport;
            this.productCode = builder.productCode;
            this.productName = builder.productName;
            this.productNameEn = builder.productNameEn;
            this.secondCategoryId = builder.secondCategoryId;
            this.secondCategoryName = builder.secondCategoryName;
            this.secondCategoryNameEn = builder.secondCategoryNameEn;
            this.whiteListLabelQuotaSupport = builder.whiteListLabelQuotaSupport;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProductInfo create() {
            return builder().build();
        }

        /**
         * @return commonQuotaSupport
         */
        public String getCommonQuotaSupport() {
            return this.commonQuotaSupport;
        }

        /**
         * @return dynamic
         */
        public Boolean getDynamic() {
            return this.dynamic;
        }

        /**
         * @return flowControlSupport
         */
        public String getFlowControlSupport() {
            return this.flowControlSupport;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        /**
         * @return productNameEn
         */
        public String getProductNameEn() {
            return this.productNameEn;
        }

        /**
         * @return secondCategoryId
         */
        public Long getSecondCategoryId() {
            return this.secondCategoryId;
        }

        /**
         * @return secondCategoryName
         */
        public String getSecondCategoryName() {
            return this.secondCategoryName;
        }

        /**
         * @return secondCategoryNameEn
         */
        public String getSecondCategoryNameEn() {
            return this.secondCategoryNameEn;
        }

        /**
         * @return whiteListLabelQuotaSupport
         */
        public String getWhiteListLabelQuotaSupport() {
            return this.whiteListLabelQuotaSupport;
        }

        public static final class Builder {
            private String commonQuotaSupport; 
            private Boolean dynamic; 
            private String flowControlSupport; 
            private String productCode; 
            private String productName; 
            private String productNameEn; 
            private Long secondCategoryId; 
            private String secondCategoryName; 
            private String secondCategoryNameEn; 
            private String whiteListLabelQuotaSupport; 

            private Builder() {
            } 

            private Builder(ProductInfo model) {
                this.commonQuotaSupport = model.commonQuotaSupport;
                this.dynamic = model.dynamic;
                this.flowControlSupport = model.flowControlSupport;
                this.productCode = model.productCode;
                this.productName = model.productName;
                this.productNameEn = model.productNameEn;
                this.secondCategoryId = model.secondCategoryId;
                this.secondCategoryName = model.secondCategoryName;
                this.secondCategoryNameEn = model.secondCategoryNameEn;
                this.whiteListLabelQuotaSupport = model.whiteListLabelQuotaSupport;
            } 

            /**
             * <p>Specifies whether general quotas are supported. Valid values:</p>
             * <ul>
             * <li><p>support: Supported.</p>
             * </li>
             * <li><p>unsupport: Not supported.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>support</p>
             */
            public Builder commonQuotaSupport(String commonQuotaSupport) {
                this.commonQuotaSupport = commonQuotaSupport;
                return this;
            }

            /**
             * <p><notice><strong>[Deprecated]</strong> We recommend that you do not use this parameter.</notice></p>
             * <p>Specifies whether dynamic quota adjustment is supported. Valid values:</p>
             * <ul>
             * <li><p>true</p>
             * </li>
             * <li><p>false</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder dynamic(Boolean dynamic) {
                this.dynamic = dynamic;
                return this;
            }

            /**
             * <p>Specifies whether API rate limits are supported. Valid values:</p>
             * <ul>
             * <li><p>support: Supported.</p>
             * </li>
             * <li><p>unsupport: Not supported.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>unsupport</p>
             */
            public Builder flowControlSupport(String flowControlSupport) {
                this.flowControlSupport = flowControlSupport;
                return this;
            }

            /**
             * <p>The abbreviation of the Alibaba Cloud service name.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs</p>
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * <p>The name of the Alibaba Cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p>Elastic Compute Service (ECS)</p>
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * <p>The English name of the Alibaba Cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p>Elastic Compute Service</p>
             */
            public Builder productNameEn(String productNameEn) {
                this.productNameEn = productNameEn;
                return this;
            }

            /**
             * <p>The ID of the service category.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder secondCategoryId(Long secondCategoryId) {
                this.secondCategoryId = secondCategoryId;
                return this;
            }

            /**
             * <p>The name of the service category.</p>
             * 
             * <strong>example:</strong>
             * <p>Elastic Compute</p>
             */
            public Builder secondCategoryName(String secondCategoryName) {
                this.secondCategoryName = secondCategoryName;
                return this;
            }

            /**
             * <p>The English name of the service category.</p>
             * 
             * <strong>example:</strong>
             * <p>Elastic Compute</p>
             */
            public Builder secondCategoryNameEn(String secondCategoryNameEn) {
                this.secondCategoryNameEn = secondCategoryNameEn;
                return this;
            }

            /**
             * <p>Specifies whether privileges are supported. Valid values:</p>
             * <ul>
             * <li><p>support: Supported.</p>
             * </li>
             * <li><p>unsupport: Not supported.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>support</p>
             */
            public Builder whiteListLabelQuotaSupport(String whiteListLabelQuotaSupport) {
                this.whiteListLabelQuotaSupport = whiteListLabelQuotaSupport;
                return this;
            }

            public ProductInfo build() {
                return new ProductInfo(this);
            } 

        } 

    }
}
