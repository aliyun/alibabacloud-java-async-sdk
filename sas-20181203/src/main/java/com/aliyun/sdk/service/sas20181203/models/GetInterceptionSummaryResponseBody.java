// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetInterceptionSummaryResponseBody model) {
            this.interceptionSummary = model.interceptionSummary;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The statistics.</p>
         */
        public Builder interceptionSummary(InterceptionSummary interceptionSummary) {
            this.interceptionSummary = interceptionSummary;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>F35F45B0-5D6B-4238-BE02-A62D0760E840</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetInterceptionSummaryResponseBody build() {
            return new GetInterceptionSummaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInterceptionSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetInterceptionSummaryResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(InterceptionSummary model) {
                this.closeClusterCount = model.closeClusterCount;
                this.closeRuleCount = model.closeRuleCount;
                this.clusterCount = model.clusterCount;
                this.interceptionCountInDays = model.interceptionCountInDays;
                this.openClusterCount = model.openClusterCount;
                this.openRuleCount = model.openRuleCount;
                this.riskCount180Day = model.riskCount180Day;
                this.riskCount30Day = model.riskCount30Day;
                this.riskCountToday = model.riskCountToday;
                this.ruleCount = model.ruleCount;
            } 

            /**
             * <p>The number of clusters that are not protected.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder closeClusterCount(Integer closeClusterCount) {
                this.closeClusterCount = closeClusterCount;
                return this;
            }

            /**
             * <p>The number of disabled cluster defense rules.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder closeRuleCount(Integer closeRuleCount) {
                this.closeRuleCount = closeRuleCount;
                return this;
            }

            /**
             * <p>The total number of clusters.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder clusterCount(Integer clusterCount) {
                this.clusterCount = clusterCount;
                return this;
            }

            /**
             * <p>The total number of interception records for the specified cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder interceptionCountInDays(Integer interceptionCountInDays) {
                this.interceptionCountInDays = interceptionCountInDays;
                return this;
            }

            /**
             * <p>The number of clusters that are protected.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder openClusterCount(Integer openClusterCount) {
                this.openClusterCount = openClusterCount;
                return this;
            }

            /**
             * <p>The number of enabled cluster defense rules.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder openRuleCount(Integer openRuleCount) {
                this.openRuleCount = openRuleCount;
                return this;
            }

            /**
             * <p>The number of security risks that are detected in the last 180 days.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder riskCount180Day(Long riskCount180Day) {
                this.riskCount180Day = riskCount180Day;
                return this;
            }

            /**
             * <p>The number of security risks that are detected in the last 30 days.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder riskCount30Day(Long riskCount30Day) {
                this.riskCount30Day = riskCount30Day;
                return this;
            }

            /**
             * <p>The number of security risks that are detected in the last 24 hours.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder riskCountToday(Long riskCountToday) {
                this.riskCountToday = riskCountToday;
                return this;
            }

            /**
             * <p>The total number of cluster defense rules.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
