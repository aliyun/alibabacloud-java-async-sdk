// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bdrc20230808.models;

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
 * {@link DescribeProductsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeProductsResponseBody</p>
 */
public class DescribeProductsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeProductsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProductsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeProductsResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
    public static class Range extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("From")
        private Integer from;

        @com.aliyun.core.annotation.NameInMap("To")
        private Integer to;

        private Range(Builder builder) {
            this.from = builder.from;
            this.to = builder.to;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Range create() {
            return builder().build();
        }

        /**
         * @return from
         */
        public Integer getFrom() {
            return this.from;
        }

        /**
         * @return to
         */
        public Integer getTo() {
            return this.to;
        }

        public static final class Builder {
            private Integer from; 
            private Integer to; 

            private Builder() {
            } 

            private Builder(Range model) {
                this.from = model.from;
                this.to = model.to;
            } 

            /**
             * From.
             */
            public Builder from(Integer from) {
                this.from = from;
                return this;
            }

            /**
             * To.
             */
            public Builder to(Integer to) {
                this.to = to;
                return this;
            }

            public Range build() {
                return new Range(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeProductsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProductsResponseBody</p>
     */
    public static class ProtectionScoreDistribution extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Range")
        private Range range;

        private ProtectionScoreDistribution(Builder builder) {
            this.count = builder.count;
            this.range = builder.range;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProtectionScoreDistribution create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return range
         */
        public Range getRange() {
            return this.range;
        }

        public static final class Builder {
            private Long count; 
            private Range range; 

            private Builder() {
            } 

            private Builder(ProtectionScoreDistribution model) {
                this.count = model.count;
                this.range = model.range;
            } 

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * Range.
             */
            public Builder range(Range range) {
                this.range = range;
                return this;
            }

            public ProtectionScoreDistribution build() {
                return new ProtectionScoreDistribution(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeProductsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProductsResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckFailedCount")
        private Long checkFailedCount;

        @com.aliyun.core.annotation.NameInMap("CheckFailedResourceCount")
        private Long checkFailedResourceCount;

        @com.aliyun.core.annotation.NameInMap("DisableCheckResourceCount")
        private Long disableCheckResourceCount;

        @com.aliyun.core.annotation.NameInMap("EnableCheck")
        private Boolean enableCheck;

        @com.aliyun.core.annotation.NameInMap("ProductType")
        private String productType;

        @com.aliyun.core.annotation.NameInMap("ProtectionScore")
        private Integer protectionScore;

        @com.aliyun.core.annotation.NameInMap("ProtectionScoreDistribution")
        private java.util.List<ProtectionScoreDistribution> protectionScoreDistribution;

        @com.aliyun.core.annotation.NameInMap("ProtectionScoreUpdatedTime")
        private Long protectionScoreUpdatedTime;

        @com.aliyun.core.annotation.NameInMap("RiskCount")
        private Long riskCount;

        @com.aliyun.core.annotation.NameInMap("RiskyResourceCount")
        private Long riskyResourceCount;

        @com.aliyun.core.annotation.NameInMap("TotalResourceCount")
        private Long totalResourceCount;

        @com.aliyun.core.annotation.NameInMap("WaitForCheckResourceCount")
        private Long waitForCheckResourceCount;

        private Content(Builder builder) {
            this.checkFailedCount = builder.checkFailedCount;
            this.checkFailedResourceCount = builder.checkFailedResourceCount;
            this.disableCheckResourceCount = builder.disableCheckResourceCount;
            this.enableCheck = builder.enableCheck;
            this.productType = builder.productType;
            this.protectionScore = builder.protectionScore;
            this.protectionScoreDistribution = builder.protectionScoreDistribution;
            this.protectionScoreUpdatedTime = builder.protectionScoreUpdatedTime;
            this.riskCount = builder.riskCount;
            this.riskyResourceCount = builder.riskyResourceCount;
            this.totalResourceCount = builder.totalResourceCount;
            this.waitForCheckResourceCount = builder.waitForCheckResourceCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return checkFailedCount
         */
        public Long getCheckFailedCount() {
            return this.checkFailedCount;
        }

        /**
         * @return checkFailedResourceCount
         */
        public Long getCheckFailedResourceCount() {
            return this.checkFailedResourceCount;
        }

        /**
         * @return disableCheckResourceCount
         */
        public Long getDisableCheckResourceCount() {
            return this.disableCheckResourceCount;
        }

        /**
         * @return enableCheck
         */
        public Boolean getEnableCheck() {
            return this.enableCheck;
        }

        /**
         * @return productType
         */
        public String getProductType() {
            return this.productType;
        }

        /**
         * @return protectionScore
         */
        public Integer getProtectionScore() {
            return this.protectionScore;
        }

        /**
         * @return protectionScoreDistribution
         */
        public java.util.List<ProtectionScoreDistribution> getProtectionScoreDistribution() {
            return this.protectionScoreDistribution;
        }

        /**
         * @return protectionScoreUpdatedTime
         */
        public Long getProtectionScoreUpdatedTime() {
            return this.protectionScoreUpdatedTime;
        }

        /**
         * @return riskCount
         */
        public Long getRiskCount() {
            return this.riskCount;
        }

        /**
         * @return riskyResourceCount
         */
        public Long getRiskyResourceCount() {
            return this.riskyResourceCount;
        }

        /**
         * @return totalResourceCount
         */
        public Long getTotalResourceCount() {
            return this.totalResourceCount;
        }

        /**
         * @return waitForCheckResourceCount
         */
        public Long getWaitForCheckResourceCount() {
            return this.waitForCheckResourceCount;
        }

        public static final class Builder {
            private Long checkFailedCount; 
            private Long checkFailedResourceCount; 
            private Long disableCheckResourceCount; 
            private Boolean enableCheck; 
            private String productType; 
            private Integer protectionScore; 
            private java.util.List<ProtectionScoreDistribution> protectionScoreDistribution; 
            private Long protectionScoreUpdatedTime; 
            private Long riskCount; 
            private Long riskyResourceCount; 
            private Long totalResourceCount; 
            private Long waitForCheckResourceCount; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.checkFailedCount = model.checkFailedCount;
                this.checkFailedResourceCount = model.checkFailedResourceCount;
                this.disableCheckResourceCount = model.disableCheckResourceCount;
                this.enableCheck = model.enableCheck;
                this.productType = model.productType;
                this.protectionScore = model.protectionScore;
                this.protectionScoreDistribution = model.protectionScoreDistribution;
                this.protectionScoreUpdatedTime = model.protectionScoreUpdatedTime;
                this.riskCount = model.riskCount;
                this.riskyResourceCount = model.riskyResourceCount;
                this.totalResourceCount = model.totalResourceCount;
                this.waitForCheckResourceCount = model.waitForCheckResourceCount;
            } 

            /**
             * CheckFailedCount.
             */
            public Builder checkFailedCount(Long checkFailedCount) {
                this.checkFailedCount = checkFailedCount;
                return this;
            }

            /**
             * CheckFailedResourceCount.
             */
            public Builder checkFailedResourceCount(Long checkFailedResourceCount) {
                this.checkFailedResourceCount = checkFailedResourceCount;
                return this;
            }

            /**
             * DisableCheckResourceCount.
             */
            public Builder disableCheckResourceCount(Long disableCheckResourceCount) {
                this.disableCheckResourceCount = disableCheckResourceCount;
                return this;
            }

            /**
             * EnableCheck.
             */
            public Builder enableCheck(Boolean enableCheck) {
                this.enableCheck = enableCheck;
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
             * ProtectionScore.
             */
            public Builder protectionScore(Integer protectionScore) {
                this.protectionScore = protectionScore;
                return this;
            }

            /**
             * ProtectionScoreDistribution.
             */
            public Builder protectionScoreDistribution(java.util.List<ProtectionScoreDistribution> protectionScoreDistribution) {
                this.protectionScoreDistribution = protectionScoreDistribution;
                return this;
            }

            /**
             * ProtectionScoreUpdatedTime.
             */
            public Builder protectionScoreUpdatedTime(Long protectionScoreUpdatedTime) {
                this.protectionScoreUpdatedTime = protectionScoreUpdatedTime;
                return this;
            }

            /**
             * RiskCount.
             */
            public Builder riskCount(Long riskCount) {
                this.riskCount = riskCount;
                return this;
            }

            /**
             * RiskyResourceCount.
             */
            public Builder riskyResourceCount(Long riskyResourceCount) {
                this.riskyResourceCount = riskyResourceCount;
                return this;
            }

            /**
             * TotalResourceCount.
             */
            public Builder totalResourceCount(Long totalResourceCount) {
                this.totalResourceCount = totalResourceCount;
                return this;
            }

            /**
             * WaitForCheckResourceCount.
             */
            public Builder waitForCheckResourceCount(Long waitForCheckResourceCount) {
                this.waitForCheckResourceCount = waitForCheckResourceCount;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeProductsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProductsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private java.util.List<Content> content;

        @com.aliyun.core.annotation.NameInMap("MaxResults")
        private Integer maxResults;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.content = builder.content;
            this.maxResults = builder.maxResults;
            this.nextToken = builder.nextToken;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public java.util.List<Content> getContent() {
            return this.content;
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
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<Content> content; 
            private Integer maxResults; 
            private String nextToken; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.content = model.content;
                this.maxResults = model.maxResults;
                this.nextToken = model.nextToken;
                this.totalCount = model.totalCount;
            } 

            /**
             * Content.
             */
            public Builder content(java.util.List<Content> content) {
                this.content = content;
                return this;
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
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
