// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSecurityScoreRuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetSecurityScoreRuleResponseBody</p>
 */
public class GetSecurityScoreRuleResponseBody extends TeaModel {
    @NameInMap("EnableStatus")
    private Boolean enableStatus;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecurityScoreRuleList")
    private java.util.List < SecurityScoreRuleList> securityScoreRuleList;

    private GetSecurityScoreRuleResponseBody(Builder builder) {
        this.enableStatus = builder.enableStatus;
        this.requestId = builder.requestId;
        this.securityScoreRuleList = builder.securityScoreRuleList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSecurityScoreRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return enableStatus
     */
    public Boolean getEnableStatus() {
        return this.enableStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return securityScoreRuleList
     */
    public java.util.List < SecurityScoreRuleList> getSecurityScoreRuleList() {
        return this.securityScoreRuleList;
    }

    public static final class Builder {
        private Boolean enableStatus; 
        private String requestId; 
        private java.util.List < SecurityScoreRuleList> securityScoreRuleList; 

        /**
         * EnableStatus.
         */
        public Builder enableStatus(Boolean enableStatus) {
            this.enableStatus = enableStatus;
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
         * SecurityScoreRuleList.
         */
        public Builder securityScoreRuleList(java.util.List < SecurityScoreRuleList> securityScoreRuleList) {
            this.securityScoreRuleList = securityScoreRuleList;
            return this;
        }

        public GetSecurityScoreRuleResponseBody build() {
            return new GetSecurityScoreRuleResponseBody(this);
        } 

    } 

    public static class SecurityScoreItemList extends TeaModel {
        @NameInMap("Score")
        private Integer score;

        @NameInMap("ScoreThreshold")
        private Integer scoreThreshold;

        @NameInMap("SubRuleType")
        private String subRuleType;

        @NameInMap("Title")
        private String title;

        private SecurityScoreItemList(Builder builder) {
            this.score = builder.score;
            this.scoreThreshold = builder.scoreThreshold;
            this.subRuleType = builder.subRuleType;
            this.title = builder.title;
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

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private Integer score; 
            private Integer scoreThreshold; 
            private String subRuleType; 
            private String title; 

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

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
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
        private Integer score;

        @NameInMap("SecurityScoreItemList")
        private java.util.List < SecurityScoreItemList> securityScoreItemList;

        @NameInMap("Title")
        private String title;

        private SecurityScoreRuleList(Builder builder) {
            this.ruleType = builder.ruleType;
            this.score = builder.score;
            this.securityScoreItemList = builder.securityScoreItemList;
            this.title = builder.title;
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

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String ruleType; 
            private Integer score; 
            private java.util.List < SecurityScoreItemList> securityScoreItemList; 
            private String title; 

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

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public SecurityScoreRuleList build() {
                return new SecurityScoreRuleList(this);
            } 

        } 

    }
}
