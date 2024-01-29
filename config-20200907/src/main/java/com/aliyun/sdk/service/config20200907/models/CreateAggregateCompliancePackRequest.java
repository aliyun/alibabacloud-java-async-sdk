// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAggregateCompliancePackRequest} extends {@link RequestModel}
 *
 * <p>CreateAggregateCompliancePackRequest</p>
 */
public class CreateAggregateCompliancePackRequest extends Request {
    @Body
    @NameInMap("AggregatorId")
    @Validation(required = true)
    private String aggregatorId;

    @Body
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("CompliancePackName")
    @Validation(required = true, maxLength = 100)
    private String compliancePackName;

    @Body
    @NameInMap("CompliancePackTemplateId")
    private String compliancePackTemplateId;

    @Body
    @NameInMap("ConfigRules")
    private java.util.List < ConfigRules> configRules;

    @Body
    @NameInMap("DefaultEnable")
    private Boolean defaultEnable;

    @Body
    @NameInMap("Description")
    @Validation(maxLength = 500)
    private String description;

    @Body
    @NameInMap("ExcludeResourceIdsScope")
    private String excludeResourceIdsScope;

    @Body
    @NameInMap("RegionIdsScope")
    private String regionIdsScope;

    @Body
    @NameInMap("ResourceGroupIdsScope")
    private String resourceGroupIdsScope;

    @Body
    @NameInMap("RiskLevel")
    @Validation(maximum = 3, minimum = 1)
    private Integer riskLevel;

    @Body
    @NameInMap("TagKeyScope")
    private String tagKeyScope;

    @Body
    @NameInMap("TagValueScope")
    private String tagValueScope;

    @Body
    @NameInMap("TemplateContent")
    @Validation(maxLength = 1024000)
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
         * The ID of the compliance package template.
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
         * The rules in the compliance package.
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
         * The risk level of the resources that are not compliant with the rules in the compliance package. Valid values:
         * <p>
         * 
         * *   1: high
         * *   2: medium
         * *   3: low
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
         * TemplateContent.
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
        @NameInMap("ParameterName")
        private String parameterName;

        @NameInMap("ParameterValue")
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
             * You must configure the `ParameterName` and `ParameterValue` parameters or neither of them. If the managed rule has an input parameter but no default value exists, you must configure this parameter. For more information about how to obtain the name of an input parameter for a managed rule, see [ListCompliancePackTemplates](~~261176~~).
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            /**
             * The value of the input parameter.
             * <p>
             * 
             * You must configure the `ParameterName` and `ParameterValue` parameters or neither of them. If the managed rule has an input parameter but no default value exists, you must configure this parameter. For more information about how to obtain the value of an input parameter for a managed rule, see [ListCompliancePackTemplates](~~261176~~).
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
        @NameInMap("ConfigRuleId")
        private String configRuleId;

        @NameInMap("ConfigRuleName")
        @Validation(maxLength = 100)
        private String configRuleName;

        @NameInMap("ConfigRuleParameters")
        private java.util.List < ConfigRuleParameters> configRuleParameters;

        @NameInMap("Description")
        private String description;

        @NameInMap("ManagedRuleIdentifier")
        private String managedRuleIdentifier;

        @NameInMap("RiskLevel")
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
             * The ID of the rule. If you configure this parameter, Cloud Config adds the rule of the specified ID to the compliance package.
             * <p>
             * 
             * You only need to configure the `ManagedRuleIdentifier` or `ConfigRuleId` parameter. If you configure both parameters, the value of the `ConfigRuleId` parameter takes precedence. For more information about how to obtain the ID of a rule, see [ListAggregateConfigRules](~~264148~~).
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
             * The details of the input parameter of the rule.
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
             * The ID of the managed rule. Cloud Config automatically create a managed rule of the specified ID and adds the rule to the compliance package.
             * <p>
             * 
             * You only need to configure the `ManagedRuleIdentifier` or `ConfigRuleId` parameter. If you configure both parameters, the value of the `ConfigRuleId` parameter take precedence. For more information about how to obtain the identifier of a managed rule, see [ListCompliancePackTemplates](~~261176~~).
             */
            public Builder managedRuleIdentifier(String managedRuleIdentifier) {
                this.managedRuleIdentifier = managedRuleIdentifier;
                return this;
            }

            /**
             * The risk level of the resources that are not compliant with the rule. Valid values:
             * <p>
             * 
             * *   1: high risk level
             * *   2: medium risk level
             * *   3: low risk level
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
