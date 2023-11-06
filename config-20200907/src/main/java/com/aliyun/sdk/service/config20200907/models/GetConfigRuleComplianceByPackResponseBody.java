// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetConfigRuleComplianceByPackResponseBody} extends {@link TeaModel}
 *
 * <p>GetConfigRuleComplianceByPackResponseBody</p>
 */
public class GetConfigRuleComplianceByPackResponseBody extends TeaModel {
    @NameInMap("ConfigRuleComplianceResult")
    private ConfigRuleComplianceResult configRuleComplianceResult;

    @NameInMap("RequestId")
    private String requestId;

    private GetConfigRuleComplianceByPackResponseBody(Builder builder) {
        this.configRuleComplianceResult = builder.configRuleComplianceResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConfigRuleComplianceByPackResponseBody create() {
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
         * The information about the compliance evaluation results returned.
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

        public GetConfigRuleComplianceByPackResponseBody build() {
            return new GetConfigRuleComplianceByPackResponseBody(this);
        } 

    } 

    public static class ConfigRuleCompliances extends TeaModel {
        @NameInMap("ComplianceType")
        private String complianceType;

        @NameInMap("ConfigRuleId")
        private String configRuleId;

        @NameInMap("ConfigRuleName")
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
             * The compliance evaluation result. Valid values:
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
             * The ID of the rule enabled in the compliance package.
             */
            public Builder configRuleId(String configRuleId) {
                this.configRuleId = configRuleId;
                return this;
            }

            /**
             * The name of the rule enabled in the compliance package.
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
        @NameInMap("CompliancePackId")
        private String compliancePackId;

        @NameInMap("ConfigRuleCompliances")
        private java.util.List < ConfigRuleCompliances> configRuleCompliances;

        @NameInMap("NonCompliantCount")
        private Integer nonCompliantCount;

        @NameInMap("TotalCount")
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
             * The rule enabled in the compliance package and the compliance evaluation result returned by the rule.
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
             * The total number of rules enabled in the compliance package.
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
