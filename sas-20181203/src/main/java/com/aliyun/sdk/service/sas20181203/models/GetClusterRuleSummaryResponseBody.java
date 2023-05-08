// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetClusterRuleSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>GetClusterRuleSummaryResponseBody</p>
 */
public class GetClusterRuleSummaryResponseBody extends TeaModel {
    @NameInMap("ClusterRuleSummary")
    private ClusterRuleSummary clusterRuleSummary;

    @NameInMap("RequestId")
    private String requestId;

    private GetClusterRuleSummaryResponseBody(Builder builder) {
        this.clusterRuleSummary = builder.clusterRuleSummary;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClusterRuleSummaryResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusterRuleSummary
     */
    public ClusterRuleSummary getClusterRuleSummary() {
        return this.clusterRuleSummary;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ClusterRuleSummary clusterRuleSummary; 
        private String requestId; 

        /**
         * ClusterRuleSummary.
         */
        public Builder clusterRuleSummary(ClusterRuleSummary clusterRuleSummary) {
            this.clusterRuleSummary = clusterRuleSummary;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetClusterRuleSummaryResponseBody build() {
            return new GetClusterRuleSummaryResponseBody(this);
        } 

    } 

    public static class ClusterRuleSummary extends TeaModel {
        @NameInMap("CloseRuleCount")
        private Integer closeRuleCount;

        @NameInMap("InterceptionCount7Day")
        private Long interceptionCount7Day;

        @NameInMap("InterceptionSwitch")
        private Integer interceptionSwitch;

        @NameInMap("InterceptionType")
        private Integer interceptionType;

        @NameInMap("OpenRuleCount")
        private Integer openRuleCount;

        @NameInMap("RuleCount")
        private Integer ruleCount;

        @NameInMap("SuggestRuleCount")
        private Integer suggestRuleCount;

        private ClusterRuleSummary(Builder builder) {
            this.closeRuleCount = builder.closeRuleCount;
            this.interceptionCount7Day = builder.interceptionCount7Day;
            this.interceptionSwitch = builder.interceptionSwitch;
            this.interceptionType = builder.interceptionType;
            this.openRuleCount = builder.openRuleCount;
            this.ruleCount = builder.ruleCount;
            this.suggestRuleCount = builder.suggestRuleCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterRuleSummary create() {
            return builder().build();
        }

        /**
         * @return closeRuleCount
         */
        public Integer getCloseRuleCount() {
            return this.closeRuleCount;
        }

        /**
         * @return interceptionCount7Day
         */
        public Long getInterceptionCount7Day() {
            return this.interceptionCount7Day;
        }

        /**
         * @return interceptionSwitch
         */
        public Integer getInterceptionSwitch() {
            return this.interceptionSwitch;
        }

        /**
         * @return interceptionType
         */
        public Integer getInterceptionType() {
            return this.interceptionType;
        }

        /**
         * @return openRuleCount
         */
        public Integer getOpenRuleCount() {
            return this.openRuleCount;
        }

        /**
         * @return ruleCount
         */
        public Integer getRuleCount() {
            return this.ruleCount;
        }

        /**
         * @return suggestRuleCount
         */
        public Integer getSuggestRuleCount() {
            return this.suggestRuleCount;
        }

        public static final class Builder {
            private Integer closeRuleCount; 
            private Long interceptionCount7Day; 
            private Integer interceptionSwitch; 
            private Integer interceptionType; 
            private Integer openRuleCount; 
            private Integer ruleCount; 
            private Integer suggestRuleCount; 

            /**
             * CloseRuleCount.
             */
            public Builder closeRuleCount(Integer closeRuleCount) {
                this.closeRuleCount = closeRuleCount;
                return this;
            }

            /**
             * InterceptionCount7Day.
             */
            public Builder interceptionCount7Day(Long interceptionCount7Day) {
                this.interceptionCount7Day = interceptionCount7Day;
                return this;
            }

            /**
             * InterceptionSwitch.
             */
            public Builder interceptionSwitch(Integer interceptionSwitch) {
                this.interceptionSwitch = interceptionSwitch;
                return this;
            }

            /**
             * InterceptionType.
             */
            public Builder interceptionType(Integer interceptionType) {
                this.interceptionType = interceptionType;
                return this;
            }

            /**
             * OpenRuleCount.
             */
            public Builder openRuleCount(Integer openRuleCount) {
                this.openRuleCount = openRuleCount;
                return this;
            }

            /**
             * RuleCount.
             */
            public Builder ruleCount(Integer ruleCount) {
                this.ruleCount = ruleCount;
                return this;
            }

            /**
             * SuggestRuleCount.
             */
            public Builder suggestRuleCount(Integer suggestRuleCount) {
                this.suggestRuleCount = suggestRuleCount;
                return this;
            }

            public ClusterRuleSummary build() {
                return new ClusterRuleSummary(this);
            } 

        } 

    }
}
