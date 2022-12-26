// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInterceptionSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>GetInterceptionSummaryResponseBody</p>
 */
public class GetInterceptionSummaryResponseBody extends TeaModel {
    @NameInMap("InterceptionSummary")
    private InterceptionSummary interceptionSummary;

    @NameInMap("RequestId")
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
         * InterceptionSummary.
         */
        public Builder interceptionSummary(InterceptionSummary interceptionSummary) {
            this.interceptionSummary = interceptionSummary;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("CloseClusterCount")
        private Integer closeClusterCount;

        @NameInMap("CloseRuleCount")
        private Integer closeRuleCount;

        @NameInMap("ClusterCount")
        private Integer clusterCount;

        @NameInMap("OpenClusterCount")
        private Integer openClusterCount;

        @NameInMap("OpenRuleCount")
        private Integer openRuleCount;

        @NameInMap("RiskCount180Day")
        private Long riskCount180Day;

        @NameInMap("RiskCount30Day")
        private Long riskCount30Day;

        @NameInMap("RiskCountToday")
        private Long riskCountToday;

        @NameInMap("RuleCount")
        private Integer ruleCount;

        private InterceptionSummary(Builder builder) {
            this.closeClusterCount = builder.closeClusterCount;
            this.closeRuleCount = builder.closeRuleCount;
            this.clusterCount = builder.clusterCount;
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
            private Integer openClusterCount; 
            private Integer openRuleCount; 
            private Long riskCount180Day; 
            private Long riskCount30Day; 
            private Long riskCountToday; 
            private Integer ruleCount; 

            /**
             * CloseClusterCount.
             */
            public Builder closeClusterCount(Integer closeClusterCount) {
                this.closeClusterCount = closeClusterCount;
                return this;
            }

            /**
             * CloseRuleCount.
             */
            public Builder closeRuleCount(Integer closeRuleCount) {
                this.closeRuleCount = closeRuleCount;
                return this;
            }

            /**
             * ClusterCount.
             */
            public Builder clusterCount(Integer clusterCount) {
                this.clusterCount = clusterCount;
                return this;
            }

            /**
             * OpenClusterCount.
             */
            public Builder openClusterCount(Integer openClusterCount) {
                this.openClusterCount = openClusterCount;
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
             * RiskCount180Day.
             */
            public Builder riskCount180Day(Long riskCount180Day) {
                this.riskCount180Day = riskCount180Day;
                return this;
            }

            /**
             * RiskCount30Day.
             */
            public Builder riskCount30Day(Long riskCount30Day) {
                this.riskCount30Day = riskCount30Day;
                return this;
            }

            /**
             * RiskCountToday.
             */
            public Builder riskCountToday(Long riskCountToday) {
                this.riskCountToday = riskCountToday;
                return this;
            }

            /**
             * RuleCount.
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
