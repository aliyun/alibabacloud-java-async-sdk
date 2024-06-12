// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAggregateConfigRuleComplianceByPackResponseBody} extends {@link TeaModel}
 *
 * <p>GetAggregateConfigRuleComplianceByPackResponseBody</p>
 */
public class GetAggregateConfigRuleComplianceByPackResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfigRuleComplianceResult")
    private ConfigRuleComplianceResult configRuleComplianceResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAggregateConfigRuleComplianceByPackResponseBody(Builder builder) {
        this.configRuleComplianceResult = builder.configRuleComplianceResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAggregateConfigRuleComplianceByPackResponseBody create() {
        return builder().build();
    }

    /**
     * @return configRuleComplianceResult
     */
    public ConfigRuleComplianceResult getConfigRuleComplianceResult() {
        return this.configRuleComplianceResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ConfigRuleComplianceResult configRuleComplianceResult; 
        private String requestId; 

        /**
         * The compliance evaluation results that are returned by rules in the compliance package.
         */
        public Builder configRuleComplianceResult(ConfigRuleComplianceResult configRuleComplianceResult) {
            this.configRuleComplianceResult = configRuleComplianceResult;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAggregateConfigRuleComplianceByPackResponseBody build() {
            return new GetAggregateConfigRuleComplianceByPackResponseBody(this);
        } 

    } 

    public static class ConfigRuleCompliances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComplianceType")
        private String complianceType;

        @com.aliyun.core.annotation.NameInMap("ConfigRuleId")
        private String configRuleId;

        @com.aliyun.core.annotation.NameInMap("ConfigRuleName")
        private String configRuleName;

        private ConfigRuleCompliances(Builder builder) {
            this.complianceType = builder.complianceType;
            this.configRuleId = builder.configRuleId;
            this.configRuleName = builder.configRuleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigRuleCompliances create() {
            return builder().build();
        }

        /**
         * @return complianceType
         */
        public String getComplianceType() {
            return this.complianceType;
        }

        /**
         * @return configRuleId
         */
        public String getConfigRuleId() {
            return this.configRuleId;
        }

        /**
         * @return configRuleName
         */
        public String getConfigRuleName() {
            return this.configRuleName;
        }

        public static final class Builder {
            private String complianceType; 
            private String configRuleId; 
            private String configRuleName; 

            /**
             * The compliance evaluation result returned by the rule. Valid values:
             * <p>
             * 
             * *   COMPLIANT: The relevant resources are evaluated as compliant.
             * *   NON_COMPLIANT: The relevant resources are evaluated as non-compliant.
             * *   NOT_APPLICABLE: The rule does not apply to your resources.
             * *   INSUFFICIENT_DATA: No resource data is available.
             */
            public Builder complianceType(String complianceType) {
                this.complianceType = complianceType;
                return this;
            }

            /**
             * The ID of the rule.
             */
            public Builder configRuleId(String configRuleId) {
                this.configRuleId = configRuleId;
                return this;
            }

            /**
             * The name of the rule.
             */
            public Builder configRuleName(String configRuleName) {
                this.configRuleName = configRuleName;
                return this;
            }

            public ConfigRuleCompliances build() {
                return new ConfigRuleCompliances(this);
            } 

        } 

    }
    public static class ConfigRuleComplianceResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompliancePackId")
        private String compliancePackId;

        @com.aliyun.core.annotation.NameInMap("ConfigRuleCompliances")
        private java.util.List < ConfigRuleCompliances> configRuleCompliances;

        @com.aliyun.core.annotation.NameInMap("NonCompliantCount")
        private Integer nonCompliantCount;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private ConfigRuleComplianceResult(Builder builder) {
            this.compliancePackId = builder.compliancePackId;
            this.configRuleCompliances = builder.configRuleCompliances;
            this.nonCompliantCount = builder.nonCompliantCount;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigRuleComplianceResult create() {
            return builder().build();
        }

        /**
         * @return compliancePackId
         */
        public String getCompliancePackId() {
            return this.compliancePackId;
        }

        /**
         * @return configRuleCompliances
         */
        public java.util.List < ConfigRuleCompliances> getConfigRuleCompliances() {
            return this.configRuleCompliances;
        }

        /**
         * @return nonCompliantCount
         */
        public Integer getNonCompliantCount() {
            return this.nonCompliantCount;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private String compliancePackId; 
            private java.util.List < ConfigRuleCompliances> configRuleCompliances; 
            private Integer nonCompliantCount; 
            private Integer totalCount; 

            /**
             * The ID of the compliance package.
             */
            public Builder compliancePackId(String compliancePackId) {
                this.compliancePackId = compliancePackId;
                return this;
            }

            /**
             * The information about rules in the compliance package.
             */
            public Builder configRuleCompliances(java.util.List < ConfigRuleCompliances> configRuleCompliances) {
                this.configRuleCompliances = configRuleCompliances;
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
             * The total number of rules in the compliance package.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public ConfigRuleComplianceResult build() {
                return new ConfigRuleComplianceResult(this);
            } 

        } 

    }
}
