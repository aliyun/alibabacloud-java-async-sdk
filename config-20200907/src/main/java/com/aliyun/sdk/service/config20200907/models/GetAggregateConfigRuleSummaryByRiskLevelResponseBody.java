// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAggregateConfigRuleSummaryByRiskLevelResponseBody} extends {@link TeaModel}
 *
 * <p>GetAggregateConfigRuleSummaryByRiskLevelResponseBody</p>
 */
public class GetAggregateConfigRuleSummaryByRiskLevelResponseBody extends TeaModel {
    @NameInMap("ConfigRuleSummaries")
    private java.util.List < ConfigRuleSummaries> configRuleSummaries;

    @NameInMap("RequestId")
    private String requestId;

    private GetAggregateConfigRuleSummaryByRiskLevelResponseBody(Builder builder) {
        this.configRuleSummaries = builder.configRuleSummaries;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAggregateConfigRuleSummaryByRiskLevelResponseBody create() {
        return builder().build();
    }

    /**
     * @return configRuleSummaries
     */
    public java.util.List < ConfigRuleSummaries> getConfigRuleSummaries() {
        return this.configRuleSummaries;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ConfigRuleSummaries> configRuleSummaries; 
        private String requestId; 

        /**
         * The summary of compliance evaluation results by rule risk level.
         */
        public Builder configRuleSummaries(java.util.List < ConfigRuleSummaries> configRuleSummaries) {
            this.configRuleSummaries = configRuleSummaries;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAggregateConfigRuleSummaryByRiskLevelResponseBody build() {
            return new GetAggregateConfigRuleSummaryByRiskLevelResponseBody(this);
        } 

    } 

    public static class ConfigRuleSummaries extends TeaModel {
        @NameInMap("CompliantCount")
        private Integer compliantCount;

        @NameInMap("NonCompliantCount")
        private Integer nonCompliantCount;

        @NameInMap("RiskLevel")
        private Integer riskLevel;

        private ConfigRuleSummaries(Builder builder) {
            this.compliantCount = builder.compliantCount;
            this.nonCompliantCount = builder.nonCompliantCount;
            this.riskLevel = builder.riskLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigRuleSummaries create() {
            return builder().build();
        }

        /**
         * @return compliantCount
         */
        public Integer getCompliantCount() {
            return this.compliantCount;
        }

        /**
         * @return nonCompliantCount
         */
        public Integer getNonCompliantCount() {
            return this.nonCompliantCount;
        }

        /**
         * @return riskLevel
         */
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

        public static final class Builder {
            private Integer compliantCount; 
            private Integer nonCompliantCount; 
            private Integer riskLevel; 

            /**
             * The number of rules against which specific resources are evaluated as compliant.
             */
            public Builder compliantCount(Integer compliantCount) {
                this.compliantCount = compliantCount;
                return this;
            }

            /**
             * The number of rules against which specific resources are evaluated as non-compliant.
             */
            public Builder nonCompliantCount(Integer nonCompliantCount) {
                this.nonCompliantCount = nonCompliantCount;
                return this;
            }

            /**
             * The risk level of the resources that do not comply with the rule. Valid values:
             * <p>
             * 
             * *   1: high
             * *   2: medium
             * *   3: low
             */
            public Builder riskLevel(Integer riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            public ConfigRuleSummaries build() {
                return new ConfigRuleSummaries(this);
            } 

        } 

    }
}
