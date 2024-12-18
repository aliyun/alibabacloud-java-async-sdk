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
 * {@link GetConfigRuleSummaryByRiskLevelResponseBody} extends {@link TeaModel}
 *
 * <p>GetConfigRuleSummaryByRiskLevelResponseBody</p>
 */
public class GetConfigRuleSummaryByRiskLevelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfigRuleSummaries")
    private java.util.List<ConfigRuleSummaries> configRuleSummaries;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetConfigRuleSummaryByRiskLevelResponseBody(Builder builder) {
        this.configRuleSummaries = builder.configRuleSummaries;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConfigRuleSummaryByRiskLevelResponseBody create() {
        return builder().build();
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

        /**
         * <p>The summary of compliance evaluation results by rule risk level.</p>
         */
        public Builder configRuleSummaries(java.util.List<ConfigRuleSummaries> configRuleSummaries) {
            this.configRuleSummaries = configRuleSummaries;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A3CED98C-DE65-46AC-B2D2-04A4A9AB5B36</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetConfigRuleSummaryByRiskLevelResponseBody build() {
            return new GetConfigRuleSummaryByRiskLevelResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetConfigRuleSummaryByRiskLevelResponseBody} extends {@link TeaModel}
     *
     * <p>GetConfigRuleSummaryByRiskLevelResponseBody</p>
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
             * <p>The risk level of the resources that are not compliant with the rules. Valid values:</p>
             * <ul>
             * <li>1: high risk level.</li>
             * <li>2: medium risk level.</li>
             * <li>3: low risk level.</li>
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
