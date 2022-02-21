// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProductsResponseBody} extends {@link TeaModel}
 *
 * <p>ListProductsResponseBody</p>
 */
public class ListProductsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("ProductInfo")
    private java.util.List < ProductInfo> productInfo;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
    public java.util.List < ProductInfo> getProductInfo() {
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
        private java.util.List < ProductInfo> productInfo; 
        private String requestId; 
        private Integer totalCount; 

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
         * ProductInfo.
         */
        public Builder productInfo(java.util.List < ProductInfo> productInfo) {
            this.productInfo = productInfo;
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

    public static class ProductInfo extends TeaModel {
        @NameInMap("CommonQuotaSupport")
        private String commonQuotaSupport;

        @NameInMap("Dynamic")
        private Boolean dynamic;

        @NameInMap("FlowControlSupport")
        private String flowControlSupport;

        @NameInMap("ProductCode")
        private String productCode;

        @NameInMap("ProductName")
        private String productName;

        @NameInMap("ProductNameEn")
        private String productNameEn;

        @NameInMap("SecondCategoryId")
        private Long secondCategoryId;

        @NameInMap("SecondCategoryName")
        private String secondCategoryName;

        @NameInMap("SecondCategoryNameEn")
        private String secondCategoryNameEn;

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

            /**
             * 通用配额是否支持
             */
            public Builder commonQuotaSupport(String commonQuotaSupport) {
                this.commonQuotaSupport = commonQuotaSupport;
                return this;
            }

            /**
             * Dynamic.
             */
            public Builder dynamic(Boolean dynamic) {
                this.dynamic = dynamic;
                return this;
            }

            /**
             * 是否支持流程
             */
            public Builder flowControlSupport(String flowControlSupport) {
                this.flowControlSupport = flowControlSupport;
                return this;
            }

            /**
             * ProductCode.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
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
             * ProductNameEn.
             */
            public Builder productNameEn(String productNameEn) {
                this.productNameEn = productNameEn;
                return this;
            }

            /**
             * SecondCategoryId.
             */
            public Builder secondCategoryId(Long secondCategoryId) {
                this.secondCategoryId = secondCategoryId;
                return this;
            }

            /**
             * SecondCategoryName.
             */
            public Builder secondCategoryName(String secondCategoryName) {
                this.secondCategoryName = secondCategoryName;
                return this;
            }

            /**
             * SecondCategoryNameEn.
             */
            public Builder secondCategoryNameEn(String secondCategoryNameEn) {
                this.secondCategoryNameEn = secondCategoryNameEn;
                return this;
            }

            public ProductInfo build() {
                return new ProductInfo(this);
            } 

        } 

    }
}
