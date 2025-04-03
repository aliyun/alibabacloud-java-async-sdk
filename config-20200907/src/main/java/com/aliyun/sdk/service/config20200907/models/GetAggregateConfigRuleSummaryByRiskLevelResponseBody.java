// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link GetAggregateConfigRuleSummaryByRiskLevelResponseBody} extends {@link TeaModel}
 *
 * <p>GetAggregateConfigRuleSummaryByRiskLevelResponseBody</p>
 */
public class GetAggregateConfigRuleSummaryByRiskLevelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfigRuleSummaries")
    private java.util.List<ConfigRuleSummaries> configRuleSummaries;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configRuleSummaries
     */
    public java.util.List<ConfigRuleSummaries> getConfigRuleSummaries() {
        return this.configRuleSummaries;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ConfigRuleSummaries> configRuleSummaries; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetAggregateConfigRuleSummaryByRiskLevelResponseBody model) {
            this.configRuleSummaries = model.configRuleSummaries;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The summary of compliance evaluation results by rule risk level.</p>
         */
        public Builder configRuleSummaries(java.util.List<ConfigRuleSummaries> configRuleSummaries) {
            this.configRuleSummaries = configRuleSummaries;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A3CDD98C-DE65-46AC-B2D2-04A4A9AB5B73</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAggregateConfigRuleSummaryByRiskLevelResponseBody build() {
            return new GetAggregateConfigRuleSummaryByRiskLevelResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAggregateConfigRuleSummaryByRiskLevelResponseBody} extends {@link TeaModel}
     *
     * <p>GetAggregateConfigRuleSummaryByRiskLevelResponseBody</p>
     */
    public static class ConfigRuleSummaries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompliantCount")
        private Integer compliantCount;

        @com.aliyun.core.annotation.NameInMap("NonCompliantCount")
        private Integer nonCompliantCount;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
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

            private Builder() {
            } 

            private Builder(ConfigRuleSummaries model) {
                this.compliantCount = model.compliantCount;
                this.nonCompliantCount = model.nonCompliantCount;
                this.riskLevel = model.riskLevel;
            } 

            /**
             * <p>The number of rules against which specific resources are evaluated as compliant.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder compliantCount(Integer compliantCount) {
                this.compliantCount = compliantCount;
                return this;
            }

            /**
             * <p>The number of rules against which specific resources are evaluated as non-compliant.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder nonCompliantCount(Integer nonCompliantCount) {
                this.nonCompliantCount = nonCompliantCount;
                return this;
            }

            /**
             * <p>The risk level of the resources that do not comply with the rule. Valid values:</p>
             * <ul>
             * <li>1: high</li>
             * <li>2: medium</li>
             * <li>3: low</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
