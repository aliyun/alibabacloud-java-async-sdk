// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangeSecurityScoreRuleRequest} extends {@link RequestModel}
 *
 * <p>ChangeSecurityScoreRuleRequest</p>
 */
public class ChangeSecurityScoreRuleRequest extends Request {
    @Query
    @NameInMap("ResetSecurityScoreRule")
    private Boolean resetSecurityScoreRule;

    @Query
    @NameInMap("SecurityScoreRuleList")
    private java.util.List < SecurityScoreRuleList> securityScoreRuleList;

    private ChangeSecurityScoreRuleRequest(Builder builder) {
        super(builder);
        this.resetSecurityScoreRule = builder.resetSecurityScoreRule;
        this.securityScoreRuleList = builder.securityScoreRuleList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeSecurityScoreRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resetSecurityScoreRule
     */
    public Boolean getResetSecurityScoreRule() {
        return this.resetSecurityScoreRule;
    }

    /**
     * @return securityScoreRuleList
     */
    public java.util.List < SecurityScoreRuleList> getSecurityScoreRuleList() {
        return this.securityScoreRuleList;
    }

    public static final class Builder extends Request.Builder<ChangeSecurityScoreRuleRequest, Builder> {
        private Boolean resetSecurityScoreRule; 
        private java.util.List < SecurityScoreRuleList> securityScoreRuleList; 

        private Builder() {
            super();
        } 

        private Builder(ChangeSecurityScoreRuleRequest request) {
            super(request);
            this.resetSecurityScoreRule = request.resetSecurityScoreRule;
            this.securityScoreRuleList = request.securityScoreRuleList;
        } 

        /**
         * ResetSecurityScoreRule.
         */
        public Builder resetSecurityScoreRule(Boolean resetSecurityScoreRule) {
            this.putQueryParameter("ResetSecurityScoreRule", resetSecurityScoreRule);
            this.resetSecurityScoreRule = resetSecurityScoreRule;
            return this;
        }

        /**
         * SecurityScoreRuleList.
         */
        public Builder securityScoreRuleList(java.util.List < SecurityScoreRuleList> securityScoreRuleList) {
            this.putQueryParameter("SecurityScoreRuleList", securityScoreRuleList);
            this.securityScoreRuleList = securityScoreRuleList;
            return this;
        }

        @Override
        public ChangeSecurityScoreRuleRequest build() {
            return new ChangeSecurityScoreRuleRequest(this);
        } 

    } 

    public static class SecurityScoreItemList extends TeaModel {
        @NameInMap("Score")
        private Integer score;

        @NameInMap("ScoreThreshold")
        @Validation(maximum = 100)
        private Integer scoreThreshold;

        @NameInMap("SubRuleType")
        private String subRuleType;

        private SecurityScoreItemList(Builder builder) {
            this.score = builder.score;
            this.scoreThreshold = builder.scoreThreshold;
            this.subRuleType = builder.subRuleType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityScoreItemList create() {
            return builder().build();
        }

        /**
         * @return score
         */
        public Integer getScore() {
            return this.score;
        }

        /**
         * @return scoreThreshold
         */
        public Integer getScoreThreshold() {
            return this.scoreThreshold;
        }

        /**
         * @return subRuleType
         */
        public String getSubRuleType() {
            return this.subRuleType;
        }

        public static final class Builder {
            private Integer score; 
            private Integer scoreThreshold; 
            private String subRuleType; 

            /**
             * Score.
             */
            public Builder score(Integer score) {
                this.score = score;
                return this;
            }

            /**
             * ScoreThreshold.
             */
            public Builder scoreThreshold(Integer scoreThreshold) {
                this.scoreThreshold = scoreThreshold;
                return this;
            }

            /**
             * SubRuleType.
             */
            public Builder subRuleType(String subRuleType) {
                this.subRuleType = subRuleType;
                return this;
            }

            public SecurityScoreItemList build() {
                return new SecurityScoreItemList(this);
            } 

        } 

    }
    public static class SecurityScoreRuleList extends TeaModel {
        @NameInMap("RuleType")
        private String ruleType;

        @NameInMap("Score")
        @Validation(maximum = 100)
        private Integer score;

        @NameInMap("SecurityScoreItemList")
        private java.util.List < SecurityScoreItemList> securityScoreItemList;

        private SecurityScoreRuleList(Builder builder) {
            this.ruleType = builder.ruleType;
            this.score = builder.score;
            this.securityScoreItemList = builder.securityScoreItemList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityScoreRuleList create() {
            return builder().build();
        }

        /**
         * @return ruleType
         */
        public String getRuleType() {
            return this.ruleType;
        }

        /**
         * @return score
         */
        public Integer getScore() {
            return this.score;
        }

        /**
         * @return securityScoreItemList
         */
        public java.util.List < SecurityScoreItemList> getSecurityScoreItemList() {
            return this.securityScoreItemList;
        }

        public static final class Builder {
            private String ruleType; 
            private Integer score; 
            private java.util.List < SecurityScoreItemList> securityScoreItemList; 

            /**
             * RuleType.
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            /**
             * Score.
             */
            public Builder score(Integer score) {
                this.score = score;
                return this;
            }

            /**
             * SecurityScoreItemList.
             */
            public Builder securityScoreItemList(java.util.List < SecurityScoreItemList> securityScoreItemList) {
                this.securityScoreItemList = securityScoreItemList;
                return this;
            }

            public SecurityScoreRuleList build() {
                return new SecurityScoreRuleList(this);
            } 

        } 

    }
}
