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
 * {@link GetConfigRuleComplianceByPackResponseBody} extends {@link TeaModel}
 *
 * <p>GetConfigRuleComplianceByPackResponseBody</p>
 */
public class GetConfigRuleComplianceByPackResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfigRuleComplianceResult")
    private ConfigRuleComplianceResult configRuleComplianceResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetConfigRuleComplianceByPackResponseBody model) {
            this.configRuleComplianceResult = model.configRuleComplianceResult;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the compliance evaluation results returned.</p>
         */
        public Builder configRuleComplianceResult(ConfigRuleComplianceResult configRuleComplianceResult) {
            this.configRuleComplianceResult = configRuleComplianceResult;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>6EC7AED1-172F-42AE-9C12-295BC2ADB751</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetConfigRuleComplianceByPackResponseBody build() {
            return new GetConfigRuleComplianceByPackResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetConfigRuleComplianceByPackResponseBody} extends {@link TeaModel}
     *
     * <p>GetConfigRuleComplianceByPackResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ConfigRuleCompliances model) {
                this.complianceType = model.complianceType;
                this.configRuleId = model.configRuleId;
                this.configRuleName = model.configRuleName;
            } 

            /**
             * <p>The compliance evaluation result. Valid values:</p>
             * <ul>
             * <li>COMPLIANT: The relevant resources are evaluated as compliant.</li>
             * <li>NON_COMPLIANT: The relevant resources are evaluated as non-compliant.</li>
             * <li>NOT_APPLICABLE: The rule does not apply to your resources.</li>
             * <li>INSUFFICIENT_DATA: No resource data is available.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>COMPLIANT</p>
             */
            public Builder complianceType(String complianceType) {
                this.complianceType = complianceType;
                return this;
            }

            /**
             * <p>The ID of the rule enabled in the compliance package.</p>
             * 
             * <strong>example:</strong>
             * <p>cr-fdc8626622af00f9****</p>
             */
            public Builder configRuleId(String configRuleId) {
                this.configRuleId = configRuleId;
                return this;
            }

            /**
             * <p>The name of the rule enabled in the compliance package.</p>
             * 
             * <strong>example:</strong>
             * <p>test-rule-name</p>
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
    /**
     * 
     * {@link GetConfigRuleComplianceByPackResponseBody} extends {@link TeaModel}
     *
     * <p>GetConfigRuleComplianceByPackResponseBody</p>
     */
    public static class ConfigRuleComplianceResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompliancePackId")
        private String compliancePackId;

        @com.aliyun.core.annotation.NameInMap("ConfigRuleCompliances")
        private java.util.List<ConfigRuleCompliances> configRuleCompliances;

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
        public java.util.List<ConfigRuleCompliances> getConfigRuleCompliances() {
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
            private java.util.List<ConfigRuleCompliances> configRuleCompliances; 
            private Integer nonCompliantCount; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(ConfigRuleComplianceResult model) {
                this.compliancePackId = model.compliancePackId;
                this.configRuleCompliances = model.configRuleCompliances;
                this.nonCompliantCount = model.nonCompliantCount;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The ID of the compliance package.</p>
             * 
             * <strong>example:</strong>
             * <p>cp-541e626622af0087****</p>
             */
            public Builder compliancePackId(String compliancePackId) {
                this.compliancePackId = compliancePackId;
                return this;
            }

            /**
             * <p>The rule enabled in the compliance package and the compliance evaluation result returned by the rule.</p>
             */
            public Builder configRuleCompliances(java.util.List<ConfigRuleCompliances> configRuleCompliances) {
                this.configRuleCompliances = configRuleCompliances;
                return this;
            }

            /**
             * <p>The number of rules against which specific resources are evaluated as non-compliant.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder nonCompliantCount(Integer nonCompliantCount) {
                this.nonCompliantCount = nonCompliantCount;
                return this;
            }

            /**
             * <p>The total number of rules enabled in the compliance package.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
