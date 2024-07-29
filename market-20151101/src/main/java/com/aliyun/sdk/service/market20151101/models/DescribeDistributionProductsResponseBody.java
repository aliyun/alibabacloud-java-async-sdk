// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.market20151101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.List < Results> results;

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
    public java.util.List < Results> getResults() {
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
        private java.util.List < Results> results; 
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Results.
         */
        public Builder results(java.util.List < Results> results) {
            this.results = results;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDistributionProductsResponseBody build() {
            return new DescribeDistributionProductsResponseBody(this);
        } 

    } 

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

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * FirstCategoryName.
             */
            public Builder firstCategoryName(String firstCategoryName) {
                this.firstCategoryName = firstCategoryName;
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
             * Price.
             */
            public Builder price(String price) {
                this.price = price;
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
             * SecondCategoryName.
             */
            public Builder secondCategoryName(String secondCategoryName) {
                this.secondCategoryName = secondCategoryName;
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
             * SubmissionRadio.
             */
            public Builder submissionRadio(String submissionRadio) {
                this.submissionRadio = submissionRadio;
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
             * SupplierUId.
             */
            public Builder supplierUId(String supplierUId) {
                this.supplierUId = supplierUId;
                return this;
            }

            /**
             * TradeCount.
             */
            public Builder tradeCount(String tradeCount) {
                this.tradeCount = tradeCount;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * UserCommentCount.
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
