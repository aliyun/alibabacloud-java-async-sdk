// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCompliancePackResponseBody} extends {@link TeaModel}
 *
 * <p>GetCompliancePackResponseBody</p>
 */
public class GetCompliancePackResponseBody extends TeaModel {
    @NameInMap("CompliancePack")
    private CompliancePack compliancePack;

    @NameInMap("RequestId")
    private String requestId;

    private GetCompliancePackResponseBody(Builder builder) {
        this.compliancePack = builder.compliancePack;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCompliancePackResponseBody create() {
        return builder().build();
    }

    /**
     * @return compliancePack
     */
    public CompliancePack getCompliancePack() {
        return this.compliancePack;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private CompliancePack compliancePack; 
        private String requestId; 

        /**
         * The details of the compliance package.
         */
        public Builder compliancePack(CompliancePack compliancePack) {
            this.compliancePack = compliancePack;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCompliancePackResponseBody build() {
            return new GetCompliancePackResponseBody(this);
        } 

    } 

    public static class ConfigRuleParameters extends TeaModel {
        @NameInMap("ParameterName")
        private String parameterName;

        @NameInMap("ParameterValue")
        private String parameterValue;

        @NameInMap("Required")
        private Boolean required;

        private ConfigRuleParameters(Builder builder) {
            this.parameterName = builder.parameterName;
            this.parameterValue = builder.parameterValue;
            this.required = builder.required;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigRuleParameters create() {
            return builder().build();
        }

        /**
         * @return parameterName
         */
        public String getParameterName() {
            return this.parameterName;
        }

        /**
         * @return parameterValue
         */
        public String getParameterValue() {
            return this.parameterValue;
        }

        /**
         * @return required
         */
        public Boolean getRequired() {
            return this.required;
        }

        public static final class Builder {
            private String parameterName; 
            private String parameterValue; 
            private Boolean required; 

            /**
             * The name of the input parameter.
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            /**
             * The value of the input parameter.
             */
            public Builder parameterValue(String parameterValue) {
                this.parameterValue = parameterValue;
                return this;
            }

            /**
             * Indicates whether the input parameter is required. Valid values:
             * <p>
             * 
             * *   true: The input parameter is required.
             * *   false: The input parameter is optional.
             */
            public Builder required(Boolean required) {
                this.required = required;
                return this;
            }

            public ConfigRuleParameters build() {
                return new ConfigRuleParameters(this);
            } 

        } 

    }
    public static class ConfigRules extends TeaModel {
        @NameInMap("ConfigRuleId")
        private String configRuleId;

        @NameInMap("ConfigRuleName")
        private String configRuleName;

        @NameInMap("ConfigRuleParameters")
        private java.util.List < ConfigRuleParameters> configRuleParameters;

        @NameInMap("Description")
        private String description;

        @NameInMap("ManagedRuleIdentifier")
        private String managedRuleIdentifier;

        @NameInMap("ResourceTypesScope")
        private String resourceTypesScope;

        @NameInMap("RiskLevel")
        private Integer riskLevel;

        private ConfigRules(Builder builder) {
            this.configRuleId = builder.configRuleId;
            this.configRuleName = builder.configRuleName;
            this.configRuleParameters = builder.configRuleParameters;
            this.description = builder.description;
            this.managedRuleIdentifier = builder.managedRuleIdentifier;
            this.resourceTypesScope = builder.resourceTypesScope;
            this.riskLevel = builder.riskLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigRules create() {
            return builder().build();
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

        /**
         * @return configRuleParameters
         */
        public java.util.List < ConfigRuleParameters> getConfigRuleParameters() {
            return this.configRuleParameters;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return managedRuleIdentifier
         */
        public String getManagedRuleIdentifier() {
            return this.managedRuleIdentifier;
        }

        /**
         * @return resourceTypesScope
         */
        public String getResourceTypesScope() {
            return this.resourceTypesScope;
        }

        /**
         * @return riskLevel
         */
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

        public static final class Builder {
            private String configRuleId; 
            private String configRuleName; 
            private java.util.List < ConfigRuleParameters> configRuleParameters; 
            private String description; 
            private String managedRuleIdentifier; 
            private String resourceTypesScope; 
            private Integer riskLevel; 

            /**
             * The rule ID.
             */
            public Builder configRuleId(String configRuleId) {
                this.configRuleId = configRuleId;
                return this;
            }

            /**
             * The rule name.
             */
            public Builder configRuleName(String configRuleName) {
                this.configRuleName = configRuleName;
                return this;
            }

            /**
             * The input parameters of the rule.
             */
            public Builder configRuleParameters(java.util.List < ConfigRuleParameters> configRuleParameters) {
                this.configRuleParameters = configRuleParameters;
                return this;
            }

            /**
             * The description of the rule.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The identifier of the managed rule.
             */
            public Builder managedRuleIdentifier(String managedRuleIdentifier) {
                this.managedRuleIdentifier = managedRuleIdentifier;
                return this;
            }

            /**
             * The types of the resources evaluated based on the rule. Multiple resource types are separated with commas (,).
             */
            public Builder resourceTypesScope(String resourceTypesScope) {
                this.resourceTypesScope = resourceTypesScope;
                return this;
            }

            /**
             * The risk level of the resources that are not compliant with the rule. Valid values:
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

            public ConfigRules build() {
                return new ConfigRules(this);
            } 

        } 

    }
    public static class Scope extends TeaModel {
        @NameInMap("ExcludeResourceIdsScope")
        private String excludeResourceIdsScope;

        @NameInMap("RegionIdsScope")
        private String regionIdsScope;

        @NameInMap("ResourceGroupIdsScope")
        private String resourceGroupIdsScope;

        @NameInMap("TagKeyScope")
        private String tagKeyScope;

        @NameInMap("TagValueScope")
        private String tagValueScope;

        private Scope(Builder builder) {
            this.excludeResourceIdsScope = builder.excludeResourceIdsScope;
            this.regionIdsScope = builder.regionIdsScope;
            this.resourceGroupIdsScope = builder.resourceGroupIdsScope;
            this.tagKeyScope = builder.tagKeyScope;
            this.tagValueScope = builder.tagValueScope;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Scope create() {
            return builder().build();
        }

        /**
         * @return excludeResourceIdsScope
         */
        public String getExcludeResourceIdsScope() {
            return this.excludeResourceIdsScope;
        }

        /**
         * @return regionIdsScope
         */
        public String getRegionIdsScope() {
            return this.regionIdsScope;
        }

        /**
         * @return resourceGroupIdsScope
         */
        public String getResourceGroupIdsScope() {
            return this.resourceGroupIdsScope;
        }

        /**
         * @return tagKeyScope
         */
        public String getTagKeyScope() {
            return this.tagKeyScope;
        }

        /**
         * @return tagValueScope
         */
        public String getTagValueScope() {
            return this.tagValueScope;
        }

        public static final class Builder {
            private String excludeResourceIdsScope; 
            private String regionIdsScope; 
            private String resourceGroupIdsScope; 
            private String tagKeyScope; 
            private String tagValueScope; 

            /**
             * The ID of the resource that you do not want to evaluate by using the compliance package.
             */
            public Builder excludeResourceIdsScope(String excludeResourceIdsScope) {
                this.excludeResourceIdsScope = excludeResourceIdsScope;
                return this;
            }

            /**
             * The ID of the region whose resources you want to evaluate by using the compliance package.
             */
            public Builder regionIdsScope(String regionIdsScope) {
                this.regionIdsScope = regionIdsScope;
                return this;
            }

            /**
             * The ID of the resource group whose resources you want to evaluate by using the compliance package.
             */
            public Builder resourceGroupIdsScope(String resourceGroupIdsScope) {
                this.resourceGroupIdsScope = resourceGroupIdsScope;
                return this;
            }

            /**
             * The tag key of the resource that you want to evaluate by using the compliance package.
             */
            public Builder tagKeyScope(String tagKeyScope) {
                this.tagKeyScope = tagKeyScope;
                return this;
            }

            /**
             * The tag value of the resource that you want to evaluate by using the compliance package.
             */
            public Builder tagValueScope(String tagValueScope) {
                this.tagValueScope = tagValueScope;
                return this;
            }

            public Scope build() {
                return new Scope(this);
            } 

        } 

    }
    public static class CompliancePack extends TeaModel {
        @NameInMap("AccountId")
        private Long accountId;

        @NameInMap("CompliancePackId")
        private String compliancePackId;

        @NameInMap("CompliancePackName")
        private String compliancePackName;

        @NameInMap("CompliancePackTemplateId")
        private String compliancePackTemplateId;

        @NameInMap("ConfigRules")
        private java.util.List < ConfigRules> configRules;

        @NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @NameInMap("Description")
        private String description;

        @NameInMap("RiskLevel")
        private Integer riskLevel;

        @NameInMap("Scope")
        private Scope scope;

        @NameInMap("Status")
        private String status;

        private CompliancePack(Builder builder) {
            this.accountId = builder.accountId;
            this.compliancePackId = builder.compliancePackId;
            this.compliancePackName = builder.compliancePackName;
            this.compliancePackTemplateId = builder.compliancePackTemplateId;
            this.configRules = builder.configRules;
            this.createTimestamp = builder.createTimestamp;
            this.description = builder.description;
            this.riskLevel = builder.riskLevel;
            this.scope = builder.scope;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CompliancePack create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public Long getAccountId() {
            return this.accountId;
        }

        /**
         * @return compliancePackId
         */
        public String getCompliancePackId() {
            return this.compliancePackId;
        }

        /**
         * @return compliancePackName
         */
        public String getCompliancePackName() {
            return this.compliancePackName;
        }

        /**
         * @return compliancePackTemplateId
         */
        public String getCompliancePackTemplateId() {
            return this.compliancePackTemplateId;
        }

        /**
         * @return configRules
         */
        public java.util.List < ConfigRules> getConfigRules() {
            return this.configRules;
        }

        /**
         * @return createTimestamp
         */
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return riskLevel
         */
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return scope
         */
        public Scope getScope() {
            return this.scope;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long accountId; 
            private String compliancePackId; 
            private String compliancePackName; 
            private String compliancePackTemplateId; 
            private java.util.List < ConfigRules> configRules; 
            private Long createTimestamp; 
            private String description; 
            private Integer riskLevel; 
            private Scope scope; 
            private String status; 

            /**
             * The ID of the Alibaba Cloud account to which the compliance package belongs.
             */
            public Builder accountId(Long accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * The ID of the compliance package.
             */
            public Builder compliancePackId(String compliancePackId) {
                this.compliancePackId = compliancePackId;
                return this;
            }

            /**
             * The name of the compliance package.
             */
            public Builder compliancePackName(String compliancePackName) {
                this.compliancePackName = compliancePackName;
                return this;
            }

            /**
             * The ID of the compliance package template.
             */
            public Builder compliancePackTemplateId(String compliancePackTemplateId) {
                this.compliancePackTemplateId = compliancePackTemplateId;
                return this;
            }

            /**
             * The rules in the compliance package.
             */
            public Builder configRules(java.util.List < ConfigRules> configRules) {
                this.configRules = configRules;
                return this;
            }

            /**
             * The timestamp when the compliance package was created. Unit: milliseconds.
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * The description of the compliance package.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The risk level of the resources that are not compliant with the rules in the compliance package. Valid values:
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

            /**
             * The resource group for which the compliance package took effect.
             */
            public Builder scope(Scope scope) {
                this.scope = scope;
                return this;
            }

            /**
             * The status of the compliance package. Valid values:
             * <p>
             * 
             * *   ACTIVE: The compliance package is normal.
             * *   CREATING: The compliance package is being created.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public CompliancePack build() {
                return new CompliancePack(this);
            } 

        } 

    }
}
