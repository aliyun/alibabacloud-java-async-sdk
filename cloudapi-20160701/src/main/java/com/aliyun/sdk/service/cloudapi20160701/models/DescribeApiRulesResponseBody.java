// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApiRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApiRulesResponseBody</p>
 */
public class DescribeApiRulesResponseBody extends TeaModel {
    @NameInMap("ApiRules")
    private ApiRules apiRules;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeApiRulesResponseBody(Builder builder) {
        this.apiRules = builder.apiRules;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApiRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return apiRules
     */
    public ApiRules getApiRules() {
        return this.apiRules;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private ApiRules apiRules; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * ApiRules.
         */
        public Builder apiRules(ApiRules apiRules) {
            this.apiRules = apiRules;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeApiRulesResponseBody build() {
            return new DescribeApiRulesResponseBody(this);
        } 

    } 

    public static class ApiRule extends TeaModel {
        @NameInMap("ApiId")
        private String apiId;

        @NameInMap("ApiName")
        private String apiName;

        @NameInMap("CreatedTime")
        private String createdTime;

        @NameInMap("RuleId")
        private String ruleId;

        @NameInMap("RuleName")
        private String ruleName;

        @NameInMap("RuleType")
        private String ruleType;

        private ApiRule(Builder builder) {
            this.apiId = builder.apiId;
            this.apiName = builder.apiName;
            this.createdTime = builder.createdTime;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.ruleType = builder.ruleType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiRule create() {
            return builder().build();
        }

        /**
         * @return apiId
         */
        public String getApiId() {
            return this.apiId;
        }

        /**
         * @return apiName
         */
        public String getApiName() {
            return this.apiName;
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return ruleType
         */
        public String getRuleType() {
            return this.ruleType;
        }

        public static final class Builder {
            private String apiId; 
            private String apiName; 
            private String createdTime; 
            private String ruleId; 
            private String ruleName; 
            private String ruleType; 

            /**
             * ApiId.
             */
            public Builder apiId(String apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * ApiName.
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * CreatedTime.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
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
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * RuleType.
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            public ApiRule build() {
                return new ApiRule(this);
            } 

        } 

    }
    public static class ApiRules extends TeaModel {
        @NameInMap("ApiRule")
        private java.util.List < ApiRule> apiRule;

        private ApiRules(Builder builder) {
            this.apiRule = builder.apiRule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiRules create() {
            return builder().build();
        }

        /**
         * @return apiRule
         */
        public java.util.List < ApiRule> getApiRule() {
            return this.apiRule;
        }

        public static final class Builder {
            private java.util.List < ApiRule> apiRule; 

            /**
             * ApiRule.
             */
            public Builder apiRule(java.util.List < ApiRule> apiRule) {
                this.apiRule = apiRule;
                return this;
            }

            public ApiRules build() {
                return new ApiRules(this);
            } 

        } 

    }
}
