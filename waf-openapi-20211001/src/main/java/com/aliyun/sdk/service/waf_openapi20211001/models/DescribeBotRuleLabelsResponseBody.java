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
 * {@link DescribeBotRuleLabelsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBotRuleLabelsResponseBody</p>
 */
public class DescribeBotRuleLabelsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleLabels")
    private java.util.List<RuleLabels> ruleLabels;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeBotRuleLabelsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.ruleLabels = builder.ruleLabels;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBotRuleLabelsResponseBody create() {
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
     * @return ruleLabels
     */
    public java.util.List<RuleLabels> getRuleLabels() {
        return this.ruleLabels;
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
        private java.util.List<RuleLabels> ruleLabels; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeBotRuleLabelsResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.ruleLabels = model.ruleLabels;
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
         * RuleLabels.
         */
        public Builder ruleLabels(java.util.List<RuleLabels> ruleLabels) {
            this.ruleLabels = ruleLabels;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeBotRuleLabelsResponseBody build() {
            return new DescribeBotRuleLabelsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBotRuleLabelsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBotRuleLabelsResponseBody</p>
     */
    public static class RuleLabels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BotBehavior")
        private String botBehavior;

        @com.aliyun.core.annotation.NameInMap("LabelKey")
        private String labelKey;

        @com.aliyun.core.annotation.NameInMap("LabelType")
        private String labelType;

        @com.aliyun.core.annotation.NameInMap("SubScene")
        private String subScene;

        private RuleLabels(Builder builder) {
            this.botBehavior = builder.botBehavior;
            this.labelKey = builder.labelKey;
            this.labelType = builder.labelType;
            this.subScene = builder.subScene;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleLabels create() {
            return builder().build();
        }

        /**
         * @return botBehavior
         */
        public String getBotBehavior() {
            return this.botBehavior;
        }

        /**
         * @return labelKey
         */
        public String getLabelKey() {
            return this.labelKey;
        }

        /**
         * @return labelType
         */
        public String getLabelType() {
            return this.labelType;
        }

        /**
         * @return subScene
         */
        public String getSubScene() {
            return this.subScene;
        }

        public static final class Builder {
            private String botBehavior; 
            private String labelKey; 
            private String labelType; 
            private String subScene; 

            private Builder() {
            } 

            private Builder(RuleLabels model) {
                this.botBehavior = model.botBehavior;
                this.labelKey = model.labelKey;
                this.labelType = model.labelType;
                this.subScene = model.subScene;
            } 

            /**
             * BotBehavior.
             */
            public Builder botBehavior(String botBehavior) {
                this.botBehavior = botBehavior;
                return this;
            }

            /**
             * LabelKey.
             */
            public Builder labelKey(String labelKey) {
                this.labelKey = labelKey;
                return this;
            }

            /**
             * LabelType.
             */
            public Builder labelType(String labelType) {
                this.labelType = labelType;
                return this;
            }

            /**
             * SubScene.
             */
            public Builder subScene(String subScene) {
                this.subScene = subScene;
                return this;
            }

            public RuleLabels build() {
                return new RuleLabels(this);
            } 

        } 

    }
}
