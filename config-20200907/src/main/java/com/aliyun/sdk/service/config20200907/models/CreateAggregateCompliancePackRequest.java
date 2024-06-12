// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAggregateCompliancePackRequest} extends {@link RequestModel}
 *
 * <p>CreateAggregateCompliancePackRequest</p>
 */
public class CreateAggregateCompliancePackRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AggregatorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aggregatorId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CompliancePackName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 100)
    private String compliancePackName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CompliancePackTemplateId")
    private String compliancePackTemplateId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConfigRules")
    private java.util.List < ConfigRules> configRules;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DefaultEnable")
    private Boolean defaultEnable;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 500)
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExcludeResourceIdsScope")
    private String excludeResourceIdsScope;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionIdsScope")
    private String regionIdsScope;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupIdsScope")
    private String resourceGroupIdsScope;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RiskLevel")
    @com.aliyun.core.annotation.Validation(maximum = 3, minimum = 1)
    private Integer riskLevel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TagKeyScope")
    private String tagKeyScope;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TagValueScope")
    private String tagValueScope;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateContent")
    @com.aliyun.core.annotation.Validation(maxLength = 1024000)
    private String templateContent;

    private CreateAggregateCompliancePackRequest(Builder builder) {
        super(builder);
        this.aggregatorId = builder.aggregatorId;
        this.clientToken = builder.clientToken;
        this.compliancePackName = builder.compliancePackName;
        this.compliancePackTemplateId = builder.compliancePackTemplateId;
        this.configRules = builder.configRules;
        this.defaultEnable = builder.defaultEnable;
        this.description = builder.description;
        this.excludeResourceIdsScope = builder.excludeResourceIdsScope;
        this.regionIdsScope = builder.regionIdsScope;
        this.resourceGroupIdsScope = builder.resourceGroupIdsScope;
        this.riskLevel = builder.riskLevel;
        this.tagKeyScope = builder.tagKeyScope;
        this.tagValueScope = builder.tagValueScope;
        this.templateContent = builder.templateContent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAggregateCompliancePackRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aggregatorId
     */
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
     * @return defaultEnable
     */
    public Boolean getDefaultEnable() {
        return this.defaultEnable;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * @return riskLevel
     */
    public Integer getRiskLevel() {
        return this.riskLevel;
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

    /**
     * @return templateContent
     */
    public String getTemplateContent() {
        return this.templateContent;
    }

    public static final class Builder extends Request.Builder<CreateAggregateCompliancePackRequest, Builder> {
        private String aggregatorId; 
        private String clientToken; 
        private String compliancePackName; 
        private String compliancePackTemplateId; 
        private java.util.List < ConfigRules> configRules; 
        private Boolean defaultEnable; 
        private String description; 
        private String excludeResourceIdsScope; 
        private String regionIdsScope; 
        private String resourceGroupIdsScope; 
        private Integer riskLevel; 
        private String tagKeyScope; 
        private String tagValueScope; 
        private String templateContent; 

        private Builder() {
            super();
        } 

        private Builder(CreateAggregateCompliancePackRequest request) {
            super(request);
            this.aggregatorId = request.aggregatorId;
            this.clientToken = request.clientToken;
            this.compliancePackName = request.compliancePackName;
            this.compliancePackTemplateId = request.compliancePackTemplateId;
            this.configRules = request.configRules;
            this.defaultEnable = request.defaultEnable;
            this.description = request.description;
            this.excludeResourceIdsScope = request.excludeResourceIdsScope;
            this.regionIdsScope = request.regionIdsScope;
            this.resourceGroupIdsScope = request.resourceGroupIdsScope;
            this.riskLevel = request.riskLevel;
            this.tagKeyScope = request.tagKeyScope;
            this.tagValueScope = request.tagValueScope;
            this.templateContent = request.templateContent;
        } 

        /**
         * The ID of the account group.
         * <p>
         * 
         * For more information about how to obtain the ID of an account group, see [ListAggregators](~~255797~~).
         */
        public Builder aggregatorId(String aggregatorId) {
            this.putBodyParameter("AggregatorId", aggregatorId);
            this.aggregatorId = aggregatorId;
            return this;
        }

        /**
         * The client token that you want to use to ensure the idempotency of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.``
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The name of the compliance package.
         */
        public Builder compliancePackName(String compliancePackName) {
            this.putBodyParameter("CompliancePackName", compliancePackName);
            this.compliancePackName = compliancePackName;
            return this;
        }

        /**
         * The ID of the compliance package template from which you want to create a compliance package.
         * <p>
         * 
         * For more information about how to obtain the ID of a compliance package template, see [ListCompliancePackTemplates](~~261176~~).
         */
        public Builder compliancePackTemplateId(String compliancePackTemplateId) {
            this.putBodyParameter("CompliancePackTemplateId", compliancePackTemplateId);
            this.compliancePackTemplateId = compliancePackTemplateId;
            return this;
        }

        /**
         * The rules in the compliance package. You must specify one of ConfigRules and TemplateContent.
         */
        public Builder configRules(java.util.List < ConfigRules> configRules) {
            String configRulesShrink = shrink(configRules, "ConfigRules", "json");
            this.putBodyParameter("ConfigRules", configRulesShrink);
            this.configRules = configRules;
            return this;
        }

        /**
         * Specifies whether to enable the rule together with the compliance package. Valid values:
         * <p>
         * 
         * *   true: The system enables the rule together with the compliance package.
         * *   false: The system does not enable the rule together with the compliance package.
         */
        public Builder defaultEnable(Boolean defaultEnable) {
            this.putBodyParameter("DefaultEnable", defaultEnable);
            this.defaultEnable = defaultEnable;
            return this;
        }

        /**
         * The description of the compliance package.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The ID of the resource that you do not want to evaluate by using the compliance package. Separate multiple resource IDs with commas (,).
         */
        public Builder excludeResourceIdsScope(String excludeResourceIdsScope) {
            this.putBodyParameter("ExcludeResourceIdsScope", excludeResourceIdsScope);
            this.excludeResourceIdsScope = excludeResourceIdsScope;
            return this;
        }

        /**
         * The ID of the region whose resources you want to evaluate by using the compliance package. Separate multiple region IDs with commas (,).
         */
        public Builder regionIdsScope(String regionIdsScope) {
            this.putBodyParameter("RegionIdsScope", regionIdsScope);
            this.regionIdsScope = regionIdsScope;
            return this;
        }

        /**
         * The ID of the resource group whose resources you want to evaluate by using the compliance package. Separate multiple resource group IDs with commas (,).
         */
        public Builder resourceGroupIdsScope(String resourceGroupIdsScope) {
            this.putBodyParameter("ResourceGroupIdsScope", resourceGroupIdsScope);
            this.resourceGroupIdsScope = resourceGroupIdsScope;
            return this;
        }

        /**
         * The risk level of the resources that are not compliant with the rules in the compliance package. Default value: 2. Valid values:
         * <p>
         * 
         * *   1: high.
         * *   2: medium.
         * *   3: low.
         */
        public Builder riskLevel(Integer riskLevel) {
            this.putBodyParameter("RiskLevel", riskLevel);
            this.riskLevel = riskLevel;
            return this;
        }

        /**
         * The tag key of the resource that you want to evaluate by using the compliance package.
         */
        public Builder tagKeyScope(String tagKeyScope) {
            this.putBodyParameter("TagKeyScope", tagKeyScope);
            this.tagKeyScope = tagKeyScope;
            return this;
        }

        /**
         * The tag value of the resource that you want to evaluate by using the compliance package.
         * <p>
         * 
         * >  You must configure the TagValueScope parameter together with the TagKeyScope parameter.
         */
        public Builder tagValueScope(String tagValueScope) {
            this.putBodyParameter("TagValueScope", tagValueScope);
            this.tagValueScope = tagValueScope;
            return this;
        }

        /**
         * The information about the template that is used to create the compliance package. You can call the GetAggregateCompliancePack operation to view the details of an existing compliance package or write a compliance package template. For more information, see [Write a compliance package template in a configuration file](~~2659733~~). You must specify one of ConfigRules and TemplateContent.
         */
        public Builder templateContent(String templateContent) {
            this.putBodyParameter("TemplateContent", templateContent);
            this.templateContent = templateContent;
            return this;
        }

        @Override
        public CreateAggregateCompliancePackRequest build() {
            return new CreateAggregateCompliancePackRequest(this);
        } 

    } 

    public static class ConfigRuleParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ParameterName")
        private String parameterName;

        @com.aliyun.core.annotation.NameInMap("ParameterValue")
        private String parameterValue;

        private ConfigRuleParameters(Builder builder) {
            this.parameterName = builder.parameterName;
            this.parameterValue = builder.parameterValue;
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

        public static final class Builder {
            private String parameterName; 
            private String parameterValue; 

            /**
             * The name of the input parameter.
             * <p>
             * 
             * You must specify both `ParameterName` and `ParameterValue` or neither of them. If the managed rule has an input parameter but no default value is specified, you must specify this parameter. You can call the [ListCompliancePackTemplates](~~261176~~) operation to obtain the names of input parameters of the managed rule.
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            /**
             * The value of the input parameter.
             * <p>
             * 
             * You must specify both `ParameterName` and `ParameterValue` or neither of them. If the managed rule has an input parameter but no default value is specified, you must specify this parameter. You can call the [ListCompliancePackTemplates](~~261176~~) operation to obtain the values of input parameters of the managed rule.
             */
            public Builder parameterValue(String parameterValue) {
                this.parameterValue = parameterValue;
                return this;
            }

            public ConfigRuleParameters build() {
                return new ConfigRuleParameters(this);
            } 

        } 

    }
    public static class ConfigRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigRuleId")
        private String configRuleId;

        @com.aliyun.core.annotation.NameInMap("ConfigRuleName")
        @com.aliyun.core.annotation.Validation(maxLength = 100)
        private String configRuleName;

        @com.aliyun.core.annotation.NameInMap("ConfigRuleParameters")
        private java.util.List < ConfigRuleParameters> configRuleParameters;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ManagedRuleIdentifier")
        private String managedRuleIdentifier;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private Integer riskLevel;

        private ConfigRules(Builder builder) {
            this.configRuleId = builder.configRuleId;
            this.configRuleName = builder.configRuleName;
            this.configRuleParameters = builder.configRuleParameters;
            this.description = builder.description;
            this.managedRuleIdentifier = builder.managedRuleIdentifier;
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
            private Integer riskLevel; 

            /**
             * The rule ID. If you specify this parameter, Cloud Config adds the rule that has the specified ID to the compliance package.
             * <p>
             * 
             * You need to only specify `ManagedRuleIdentifier` or `ConfigRuleId`. If you specify both parameters, Cloud Config adds a rule based on the value of `ConfigRuleId`. You can call the [ListAggregateConfigRules](~~264148~~) operation to obtain the rule ID.
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
             * The identifier of the managed rule. Cloud Config automatically creates a managed rule based on the specified identifier and adds the rule to the compliance package.
             * <p>
             * 
             * You need to only specify `ManagedRuleIdentifier` or `ConfigRuleId`. If you specify both parameters, Cloud Config adds a rule based on the value of `ConfigRuleId`. You can call the [ListCompliancePackTemplates](~~261176~~) operation to obtain the identifier of the managed rule.
             */
            public Builder managedRuleIdentifier(String managedRuleIdentifier) {
                this.managedRuleIdentifier = managedRuleIdentifier;
                return this;
            }

            /**
             * The risk level of the resources that do not comply with the rule. Valid values:
             * <p>
             * 
             * *   1: high.
             * *   2: medium.
             * *   3: low.
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
}
