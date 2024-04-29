// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInterceptionSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>GetInterceptionSummaryResponseBody</p>
 */
public class GetInterceptionSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InterceptionSummary")
    private InterceptionSummary interceptionSummary;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetInterceptionSummaryResponseBody(Builder builder) {
        this.interceptionSummary = builder.interceptionSummary;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInterceptionSummaryResponseBody create() {
        return builder().build();
    }

    /**
     * @return interceptionSummary
     */
    public InterceptionSummary getInterceptionSummary() {
        return this.interceptionSummary;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private InterceptionSummary interceptionSummary; 
        private String requestId; 

        /**
         * The statistics.
         */
        public Builder interceptionSummary(InterceptionSummary interceptionSummary) {
            this.interceptionSummary = interceptionSummary;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetInterceptionSummaryResponseBody build() {
            return new GetInterceptionSummaryResponseBody(this);
        } 

    } 

    public static class InterceptionSummary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CloseClusterCount")
        private Integer closeClusterCount;

        @com.aliyun.core.annotation.NameInMap("CloseRuleCount")
        private Integer closeRuleCount;

        @com.aliyun.core.annotation.NameInMap("ClusterCount")
        private Integer clusterCount;

        @com.aliyun.core.annotation.NameInMap("InterceptionCountInDays")
        private Integer interceptionCountInDays;

        @com.aliyun.core.annotation.NameInMap("OpenClusterCount")
        private Integer openClusterCount;

        @com.aliyun.core.annotation.NameInMap("OpenRuleCount")
        private Integer openRuleCount;

        @com.aliyun.core.annotation.NameInMap("RiskCount180Day")
        private Long riskCount180Day;

        @com.aliyun.core.annotation.NameInMap("RiskCount30Day")
        private Long riskCount30Day;

        @com.aliyun.core.annotation.NameInMap("RiskCountToday")
        private Long riskCountToday;

        @com.aliyun.core.annotation.NameInMap("RuleCount")
        private Integer ruleCount;

        private InterceptionSummary(Builder builder) {
            this.closeClusterCount = builder.closeClusterCount;
            this.closeRuleCount = builder.closeRuleCount;
            this.clusterCount = builder.clusterCount;
            this.interceptionCountInDays = builder.interceptionCountInDays;
            this.openClusterCount = builder.openClusterCount;
            this.openRuleCount = builder.openRuleCount;
            this.riskCount180Day = builder.riskCount180Day;
            this.riskCount30Day = builder.riskCount30Day;
            this.riskCountToday = builder.riskCountToday;
            this.ruleCount = builder.ruleCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InterceptionSummary create() {
            return builder().build();
        }

        /**
         * @return closeClusterCount
         */
        public Integer getCloseClusterCount() {
            return this.closeClusterCount;
        }

        /**
         * @return closeRuleCount
         */
        public Integer getCloseRuleCount() {
            return this.closeRuleCount;
        }

        /**
         * @return clusterCount
         */
        public Integer getClusterCount() {
            return this.clusterCount;
        }

        /**
         * @return interceptionCountInDays
         */
        public Integer getInterceptionCountInDays() {
            return this.interceptionCountInDays;
        }

        /**
         * @return openClusterCount
         */
        public Integer getOpenClusterCount() {
            return this.openClusterCount;
        }

        /**
         * @return openRuleCount
         */
        public Integer getOpenRuleCount() {
            return this.openRuleCount;
        }

        /**
         * @return riskCount180Day
         */
        public Long getRiskCount180Day() {
            return this.riskCount180Day;
        }

        /**
         * @return riskCount30Day
         */
        public Long getRiskCount30Day() {
            return this.riskCount30Day;
        }

        /**
         * @return riskCountToday
         */
        public Long getRiskCountToday() {
            return this.riskCountToday;
        }

        /**
         * @return ruleCount
         */
        public Integer getRuleCount() {
            return this.ruleCount;
        }

        public static final class Builder {
            private Integer closeClusterCount; 
            private Integer closeRuleCount; 
            private Integer clusterCount; 
            private Integer interceptionCountInDays; 
            private Integer openClusterCount; 
            private Integer openRuleCount; 
            private Long riskCount180Day; 
            private Long riskCount30Day; 
            private Long riskCountToday; 
            private Integer ruleCount; 

            /**
             * The number of clusters that are not protected.
             */
            public Builder closeClusterCount(Integer closeClusterCount) {
                this.closeClusterCount = closeClusterCount;
                return this;
            }

            /**
             * The number of disabled cluster defense rules.
             */
            public Builder closeRuleCount(Integer closeRuleCount) {
                this.closeRuleCount = closeRuleCount;
                return this;
            }

            /**
             * The total number of clusters.
             */
            public Builder clusterCount(Integer clusterCount) {
                this.clusterCount = clusterCount;
                return this;
            }

            /**
             * The total number of interception records for the specified cluster.
             */
            public Builder interceptionCountInDays(Integer interceptionCountInDays) {
                this.interceptionCountInDays = interceptionCountInDays;
                return this;
            }

            /**
             * The number of clusters that are protected.
             */
            public Builder openClusterCount(Integer openClusterCount) {
                this.openClusterCount = openClusterCount;
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
             * The number of security risks that are detected in the last 180 days.
             */
            public Builder riskCount180Day(Long riskCount180Day) {
                this.riskCount180Day = riskCount180Day;
                return this;
            }

            /**
             * The number of security risks that are detected in the last 30 days.
             */
            public Builder riskCount30Day(Long riskCount30Day) {
                this.riskCount30Day = riskCount30Day;
                return this;
            }

            /**
             * The number of security risks that are detected in the last 24 hours.
             */
            public Builder riskCountToday(Long riskCountToday) {
                this.riskCountToday = riskCountToday;
                return this;
            }

            /**
             * The total number of cluster defense rules.
             */
            public Builder ruleCount(Integer ruleCount) {
                this.ruleCount = ruleCount;
                return this;
            }

            public InterceptionSummary build() {
                return new InterceptionSummary(this);
            } 

        } 

    }
}
