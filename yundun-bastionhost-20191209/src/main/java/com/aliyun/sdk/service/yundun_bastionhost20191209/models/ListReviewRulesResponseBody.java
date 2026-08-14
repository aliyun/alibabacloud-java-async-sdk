// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
 * {@link ListReviewRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListReviewRulesResponseBody</p>
 */
public class ListReviewRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ReviewRules")
    private java.util.List<ReviewRules> reviewRules;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListReviewRulesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.reviewRules = builder.reviewRules;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListReviewRulesResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return reviewRules
     */
    public java.util.List<ReviewRules> getReviewRules() {
        return this.reviewRules;
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
        private String requestId; 
        private java.util.List<ReviewRules> reviewRules; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListReviewRulesResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.reviewRules = model.reviewRules;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ReviewRules.
         */
        public Builder reviewRules(java.util.List<ReviewRules> reviewRules) {
            this.reviewRules = reviewRules;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListReviewRulesResponseBody build() {
            return new ListReviewRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListReviewRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListReviewRulesResponseBody</p>
     */
    public static class ReviewRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("ReviewRuleId")
        private Long reviewRuleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("ScopeType")
        private Integer scopeType;

        private ReviewRules(Builder builder) {
            this.remark = builder.remark;
            this.reviewRuleId = builder.reviewRuleId;
            this.ruleName = builder.ruleName;
            this.scopeType = builder.scopeType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReviewRules create() {
            return builder().build();
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return reviewRuleId
         */
        public Long getReviewRuleId() {
            return this.reviewRuleId;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return scopeType
         */
        public Integer getScopeType() {
            return this.scopeType;
        }

        public static final class Builder {
            private String remark; 
            private Long reviewRuleId; 
            private String ruleName; 
            private Integer scopeType; 

            private Builder() {
            } 

            private Builder(ReviewRules model) {
                this.remark = model.remark;
                this.reviewRuleId = model.reviewRuleId;
                this.ruleName = model.ruleName;
                this.scopeType = model.scopeType;
            } 

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * ReviewRuleId.
             */
            public Builder reviewRuleId(Long reviewRuleId) {
                this.reviewRuleId = reviewRuleId;
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
             * ScopeType.
             */
            public Builder scopeType(Integer scopeType) {
                this.scopeType = scopeType;
                return this;
            }

            public ReviewRules build() {
                return new ReviewRules(this);
            } 

        } 

    }
}
