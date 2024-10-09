// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bdrc20230808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRulesResponseBody</p>
 */
public class DescribeRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeRulesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRulesResponseBody create() {
        return builder().build();
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

        public DescribeRulesResponseBody build() {
            return new DescribeRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRulesResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckFailedResourceCount")
        private Long checkFailedResourceCount;

        @com.aliyun.core.annotation.NameInMap("CheckStatus")
        private String checkStatus;

        @com.aliyun.core.annotation.NameInMap("CheckTime")
        private Long checkTime;

        @com.aliyun.core.annotation.NameInMap("ProductType")
        private String productType;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("RiskyResourceCount")
        private Long riskyResourceCount;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleTemplate")
        private String ruleTemplate;

        @com.aliyun.core.annotation.NameInMap("TotalResourceCount")
        private Long totalResourceCount;

        private Content(Builder builder) {
            this.checkFailedResourceCount = builder.checkFailedResourceCount;
            this.checkStatus = builder.checkStatus;
            this.checkTime = builder.checkTime;
            this.productType = builder.productType;
            this.resourceType = builder.resourceType;
            this.riskyResourceCount = builder.riskyResourceCount;
            this.ruleId = builder.ruleId;
            this.ruleTemplate = builder.ruleTemplate;
            this.totalResourceCount = builder.totalResourceCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return checkFailedResourceCount
         */
        public Long getCheckFailedResourceCount() {
            return this.checkFailedResourceCount;
        }

        /**
         * @return checkStatus
         */
        public String getCheckStatus() {
            return this.checkStatus;
        }

        /**
         * @return checkTime
         */
        public Long getCheckTime() {
            return this.checkTime;
        }

        /**
         * @return productType
         */
        public String getProductType() {
            return this.productType;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return riskyResourceCount
         */
        public Long getRiskyResourceCount() {
            return this.riskyResourceCount;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleTemplate
         */
        public String getRuleTemplate() {
            return this.ruleTemplate;
        }

        /**
         * @return totalResourceCount
         */
        public Long getTotalResourceCount() {
            return this.totalResourceCount;
        }

        public static final class Builder {
            private Long checkFailedResourceCount; 
            private String checkStatus; 
            private Long checkTime; 
            private String productType; 
            private String resourceType; 
            private Long riskyResourceCount; 
            private String ruleId; 
            private String ruleTemplate; 
            private Long totalResourceCount; 

            /**
             * CheckFailedResourceCount.
             */
            public Builder checkFailedResourceCount(Long checkFailedResourceCount) {
                this.checkFailedResourceCount = checkFailedResourceCount;
                return this;
            }

            /**
             * CheckStatus.
             */
            public Builder checkStatus(String checkStatus) {
                this.checkStatus = checkStatus;
                return this;
            }

            /**
             * CheckTime.
             */
            public Builder checkTime(Long checkTime) {
                this.checkTime = checkTime;
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
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
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
             * RuleId.
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * RuleTemplate.
             */
            public Builder ruleTemplate(String ruleTemplate) {
                this.ruleTemplate = ruleTemplate;
                return this;
            }

            /**
             * TotalResourceCount.
             */
            public Builder totalResourceCount(Long totalResourceCount) {
                this.totalResourceCount = totalResourceCount;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRulesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private java.util.List < Content> content;

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
        public java.util.List < Content> getContent() {
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
            private java.util.List < Content> content; 
            private Integer maxResults; 
            private String nextToken; 
            private Long totalCount; 

            /**
             * Content.
             */
            public Builder content(java.util.List < Content> content) {
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
