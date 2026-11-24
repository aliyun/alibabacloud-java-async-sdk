// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.market20151101.models;

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
 * {@link DescribeDistributionProductsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDistributionProductsResponseBody</p>
 */
public class DescribeDistributionProductsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Results")
    private java.util.List<Results> results;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDistributionProductsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.results = builder.results;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDistributionProductsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return results
     */
    public java.util.List<Results> getResults() {
        return this.results;
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
        private String requestId; 
        private java.util.List<Results> results; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeDistributionProductsResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.results = model.results;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of promotional products per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5BD09171-MB74-18D8-890E-C70C067527BE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The promotional product information.</p>
         */
        public Builder results(java.util.List<Results> results) {
            this.results = results;
            return this;
        }

        /**
         * <p>The total number of promotional products that match the search conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDistributionProductsResponseBody build() {
            return new DescribeDistributionProductsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDistributionProductsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDistributionProductsResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("FirstCategoryName")
        private String firstCategoryName;

        @com.aliyun.core.annotation.NameInMap("ImageUrl")
        private String imageUrl;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Price")
        private String price;

        @com.aliyun.core.annotation.NameInMap("Score")
        private String score;

        @com.aliyun.core.annotation.NameInMap("SecondCategoryName")
        private String secondCategoryName;

        @com.aliyun.core.annotation.NameInMap("ShortDescription")
        private String shortDescription;

        @com.aliyun.core.annotation.NameInMap("SubmissionRadio")
        private String submissionRadio;

        @com.aliyun.core.annotation.NameInMap("SupplierName")
        private String supplierName;

        @com.aliyun.core.annotation.NameInMap("SupplierUId")
        private String supplierUId;

        @com.aliyun.core.annotation.NameInMap("TradeCount")
        private String tradeCount;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UserCommentCount")
        private String userCommentCount;

        private Results(Builder builder) {
            this.code = builder.code;
            this.firstCategoryName = builder.firstCategoryName;
            this.imageUrl = builder.imageUrl;
            this.name = builder.name;
            this.price = builder.price;
            this.score = builder.score;
            this.secondCategoryName = builder.secondCategoryName;
            this.shortDescription = builder.shortDescription;
            this.submissionRadio = builder.submissionRadio;
            this.supplierName = builder.supplierName;
            this.supplierUId = builder.supplierUId;
            this.tradeCount = builder.tradeCount;
            this.type = builder.type;
            this.userCommentCount = builder.userCommentCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return firstCategoryName
         */
        public String getFirstCategoryName() {
            return this.firstCategoryName;
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
         * @return price
         */
        public String getPrice() {
            return this.price;
        }

        /**
         * @return score
         */
        public String getScore() {
            return this.score;
        }

        /**
         * @return secondCategoryName
         */
        public String getSecondCategoryName() {
            return this.secondCategoryName;
        }

        /**
         * @return shortDescription
         */
        public String getShortDescription() {
            return this.shortDescription;
        }

        /**
         * @return submissionRadio
         */
        public String getSubmissionRadio() {
            return this.submissionRadio;
        }

        /**
         * @return supplierName
         */
        public String getSupplierName() {
            return this.supplierName;
        }

        /**
         * @return supplierUId
         */
        public String getSupplierUId() {
            return this.supplierUId;
        }

        /**
         * @return tradeCount
         */
        public String getTradeCount() {
            return this.tradeCount;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return userCommentCount
         */
        public String getUserCommentCount() {
            return this.userCommentCount;
        }

        public static final class Builder {
            private String code; 
            private String firstCategoryName; 
            private String imageUrl; 
            private String name; 
            private String price; 
            private String score; 
            private String secondCategoryName; 
            private String shortDescription; 
            private String submissionRadio; 
            private String supplierName; 
            private String supplierUId; 
            private String tradeCount; 
            private String type; 
            private String userCommentCount; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.code = model.code;
                this.firstCategoryName = model.firstCategoryName;
                this.imageUrl = model.imageUrl;
                this.name = model.name;
                this.price = model.price;
                this.score = model.score;
                this.secondCategoryName = model.secondCategoryName;
                this.shortDescription = model.shortDescription;
                this.submissionRadio = model.submissionRadio;
                this.supplierName = model.supplierName;
                this.supplierUId = model.supplierUId;
                this.tradeCount = model.tradeCount;
                this.type = model.type;
                this.userCommentCount = model.userCommentCount;
            } 

            /**
             * <p>The product code.</p>
             * 
             * <strong>example:</strong>
             * <p>cmap*****</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The first-level category name of the product.</p>
             * 
             * <strong>example:</strong>
             * <p>API Marketplace</p>
             */
            public Builder firstCategoryName(String firstCategoryName) {
                this.firstCategoryName = firstCategoryName;
                return this;
            }

            /**
             * <p>The URL of the product main image.</p>
             * 
             * <strong>example:</strong>
             * <p>//photogallery.oss-cn-hangzhou.aliyuncs.com/photo/1744526877246715/09605255-87fd-44d1-8143-96ebc8019d46.jpeg</p>
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * <p>The product name.</p>
             * 
             * <strong>example:</strong>
             * <p>Mobile phone number online status query</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The price of the default product specification. For example, 100 indicates CNY 100.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder price(String price) {
                this.price = price;
                return this;
            }

            /**
             * <p>The user rating of the product.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder score(String score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The second-level category name of the product.</p>
             * 
             * <strong>example:</strong>
             * <p>Life services</p>
             */
            public Builder secondCategoryName(String secondCategoryName) {
                this.secondCategoryName = secondCategoryName;
                return this;
            }

            /**
             * <p>The brief description of the product.</p>
             * 
             * <strong>example:</strong>
             * <p>Carrier phone number status query] Provides accurate and real-time detection of empty numbers. You can query the online status of phone numbers, and statuses such as normal, empty, in-call, online but unavailable, powered off, call forwarding, suspected power-off, number portability, wrong number, and suspended are returned.</p>
             */
            public Builder shortDescription(String shortDescription) {
                this.shortDescription = shortDescription;
                return this;
            }

            /**
             * <p>The commission rebate ratio for the product. For example, 30 indicates 30%.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder submissionRadio(String submissionRadio) {
                this.submissionRadio = submissionRadio;
                return this;
            }

            /**
             * <p>The name of the promotion service provider.</p>
             * 
             * <strong>example:</strong>
             * <p>Shenzhen **** Co., Ltd.</p>
             */
            public Builder supplierName(String supplierName) {
                this.supplierName = supplierName;
                return this;
            }

            /**
             * <p>The Alibaba Cloud UID of the promotion service provider (product supplier).</p>
             * 
             * <strong>example:</strong>
             * <p>1911534921******</p>
             */
            public Builder supplierUId(String supplierUId) {
                this.supplierUId = supplierUId;
                return this;
            }

            /**
             * <p>The number of transactions for the product in the last 180 days.</p>
             * 
             * <strong>example:</strong>
             * <p>109</p>
             */
            public Builder tradeCount(String tradeCount) {
                this.tradeCount = tradeCount;
                return this;
            }

            /**
             * <p>The product type. Valid values:
             *         APP: application
             *         SERVICE: service
             *         CHENGPIN_SITE: ready-made website
             *         SITE_CUSTOM_SERVICE: custom website
             *         SITE_PROMOTION_RUN: website promotion and operations
             *         ENT_APP_SOFT: application software
             *         CLOUD_SERVICE: cloud service
             *         EIF: enterprise information
             *         BASIC_TOOLS: basic tools
             *         BASIC_SERVICES: basic services
             *         JIANZHAN_XITONG: website building system
             *         APP_COUPLES: application companion
             *         MIRRORS_MARKET: image marketplace
             *         MIRRORS_MARKET_BASIC_ENVIRONMENT: basic environment
             *         MIRRORS_MARKET_APPLICATION_SOFTWARE: application software
             *         MIRROR: image
             *         DINGDING: DingTalk
             *         DOWNLOAD: download
             *         EXTENDED: unknown
             *         API_SERVICE: API
             *         ROS: resource orchestration
             *         DOCKER: container
             *         LICENSE: license key
             *         SAAS_WUYING: application software - Wuying application.</p>
             * 
             * <strong>example:</strong>
             * <p>API</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The number of buyer comments for the product.</p>
             * 
             * <strong>example:</strong>
             * <p>55</p>
             */
            public Builder userCommentCount(String userCommentCount) {
                this.userCommentCount = userCommentCount;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
}
