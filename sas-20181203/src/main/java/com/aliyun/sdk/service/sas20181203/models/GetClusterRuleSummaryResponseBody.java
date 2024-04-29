// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetClusterRuleSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>GetClusterRuleSummaryResponseBody</p>
 */
public class GetClusterRuleSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterRuleSummary")
    private ClusterRuleSummary clusterRuleSummary;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * The overall information about the cluster defense rules.
         */
        public Builder clusterRuleSummary(ClusterRuleSummary clusterRuleSummary) {
            this.clusterRuleSummary = clusterRuleSummary;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
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
        @com.aliyun.core.annotation.NameInMap("CloseRuleCount")
        private Integer closeRuleCount;

        @com.aliyun.core.annotation.NameInMap("InterceptionCount7Day")
        private Long interceptionCount7Day;

        @com.aliyun.core.annotation.NameInMap("InterceptionSwitch")
        private Integer interceptionSwitch;

        @com.aliyun.core.annotation.NameInMap("InterceptionType")
        private Integer interceptionType;

        @com.aliyun.core.annotation.NameInMap("OpenRuleCount")
        private Integer openRuleCount;

        @com.aliyun.core.annotation.NameInMap("RuleCount")
        private Integer ruleCount;

        @com.aliyun.core.annotation.NameInMap("SuggestRuleCount")
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
             * The number of disabled cluster defense rules.
             */
            public Builder closeRuleCount(Integer closeRuleCount) {
                this.closeRuleCount = closeRuleCount;
                return this;
            }

            /**
             * The number of alerts that are triggered by the cluster defense rules in the last seven days.
             */
            public Builder interceptionCount7Day(Long interceptionCount7Day) {
                this.interceptionCount7Day = interceptionCount7Day;
                return this;
            }

            /**
             * The status of the container firewall feature. Valid values:
             * <p>
             * 
             * *   **0**: disabled
             * *   **1**: enabled
             */
            public Builder interceptionSwitch(Integer interceptionSwitch) {
                this.interceptionSwitch = interceptionSwitch;
                return this;
            }

            /**
             * The interception mode.
             */
            public Builder interceptionType(Integer interceptionType) {
                this.interceptionType = interceptionType;
                return this;
            }

            /**
             * The number of enabled cluster defense rules.
             */
            public Builder openRuleCount(Integer openRuleCount) {
                this.openRuleCount = openRuleCount;
                return this;
            }

            /**
             * The total number of configured cluster defense rules.
             */
            public Builder ruleCount(Integer ruleCount) {
                this.ruleCount = ruleCount;
                return this;
            }

            /**
             * The number of recommended cluster defense rules.
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
