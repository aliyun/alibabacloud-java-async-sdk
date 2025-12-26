// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeRelatedDefenseRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRelatedDefenseRulesResponseBody</p>
 */
public class DescribeRelatedDefenseRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Rules")
    private java.util.List<Rules> rules;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeRelatedDefenseRulesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.rules = builder.rules;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRelatedDefenseRulesResponseBody create() {
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
     * @return rules
     */
    public java.util.List<Rules> getRules() {
        return this.rules;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<Rules> rules; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeRelatedDefenseRulesResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.rules = model.rules;
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
         * Rules.
         */
        public Builder rules(java.util.List<Rules> rules) {
            this.rules = rules;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeRelatedDefenseRulesResponseBody build() {
            return new DescribeRelatedDefenseRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRelatedDefenseRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRelatedDefenseRulesResponseBody</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefenseScene")
        private String defenseScene;

        @com.aliyun.core.annotation.NameInMap("DefenseType")
        private String defenseType;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private Long ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private Long templateId;

        private Rules(Builder builder) {
            this.defenseScene = builder.defenseScene;
            this.defenseType = builder.defenseType;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.templateId = builder.templateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return defenseScene
         */
        public String getDefenseScene() {
            return this.defenseScene;
        }

        /**
         * @return defenseType
         */
        public String getDefenseType() {
            return this.defenseType;
        }

        /**
         * @return ruleId
         */
        public Long getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return templateId
         */
        public Long getTemplateId() {
            return this.templateId;
        }

        public static final class Builder {
            private String defenseScene; 
            private String defenseType; 
            private Long ruleId; 
            private String ruleName; 
            private Long templateId; 

            private Builder() {
            } 

            private Builder(Rules model) {
                this.defenseScene = model.defenseScene;
                this.defenseType = model.defenseType;
                this.ruleId = model.ruleId;
                this.ruleName = model.ruleName;
                this.templateId = model.templateId;
            } 

            /**
             * DefenseScene.
             */
            public Builder defenseScene(String defenseScene) {
                this.defenseScene = defenseScene;
                return this;
            }

            /**
             * DefenseType.
             */
            public Builder defenseType(String defenseType) {
                this.defenseType = defenseType;
                return this;
            }

            /**
             * RuleId.
             */
            public Builder ruleId(Long ruleId) {
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
             * TemplateId.
             */
            public Builder templateId(Long templateId) {
                this.templateId = templateId;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
}
