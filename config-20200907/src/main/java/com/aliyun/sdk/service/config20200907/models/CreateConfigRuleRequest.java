// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateConfigRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateConfigRuleRequest</p>
 */
public class CreateConfigRuleRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConfigRuleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configRuleName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConfigRuleTriggerTypes")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configRuleTriggerTypes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExcludeResourceIdsScope")
    private String excludeResourceIdsScope;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InputParameters")
    private java.util.Map < String, ? > inputParameters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaximumExecutionFrequency")
    private String maximumExecutionFrequency;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionIdsScope")
    private String regionIdsScope;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupIdsScope")
    private String resourceGroupIdsScope;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceTypesScope")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > resourceTypesScope;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RiskLevel")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 3, minimum = 1)
    private Integer riskLevel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceIdentifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceIdentifier;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceOwner")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceOwner;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TagKeyLogicScope")
    private String tagKeyLogicScope;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TagKeyScope")
    private String tagKeyScope;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TagValueScope")
    private String tagValueScope;

    private CreateConfigRuleRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.configRuleName = builder.configRuleName;
        this.configRuleTriggerTypes = builder.configRuleTriggerTypes;
        this.description = builder.description;
        this.excludeResourceIdsScope = builder.excludeResourceIdsScope;
        this.inputParameters = builder.inputParameters;
        this.maximumExecutionFrequency = builder.maximumExecutionFrequency;
        this.regionIdsScope = builder.regionIdsScope;
        this.resourceGroupIdsScope = builder.resourceGroupIdsScope;
        this.resourceTypesScope = builder.resourceTypesScope;
        this.riskLevel = builder.riskLevel;
        this.sourceIdentifier = builder.sourceIdentifier;
        this.sourceOwner = builder.sourceOwner;
        this.tagKeyLogicScope = builder.tagKeyLogicScope;
        this.tagKeyScope = builder.tagKeyScope;
        this.tagValueScope = builder.tagValueScope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateConfigRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return configRuleName
     */
    public String getConfigRuleName() {
        return this.configRuleName;
    }

    /**
     * @return configRuleTriggerTypes
     */
    public String getConfigRuleTriggerTypes() {
        return this.configRuleTriggerTypes;
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
     * @return inputParameters
     */
    public java.util.Map < String, ? > getInputParameters() {
        return this.inputParameters;
    }

    /**
     * @return maximumExecutionFrequency
     */
    public String getMaximumExecutionFrequency() {
        return this.maximumExecutionFrequency;
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
     * @return resourceTypesScope
     */
    public java.util.List < String > getResourceTypesScope() {
        return this.resourceTypesScope;
    }

    /**
     * @return riskLevel
     */
    public Integer getRiskLevel() {
        return this.riskLevel;
    }

    /**
     * @return sourceIdentifier
     */
    public String getSourceIdentifier() {
        return this.sourceIdentifier;
    }

    /**
     * @return sourceOwner
     */
    public String getSourceOwner() {
        return this.sourceOwner;
    }

    /**
     * @return tagKeyLogicScope
     */
    public String getTagKeyLogicScope() {
        return this.tagKeyLogicScope;
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

    public static final class Builder extends Request.Builder<CreateConfigRuleRequest, Builder> {
        private String clientToken; 
        private String configRuleName; 
        private String configRuleTriggerTypes; 
        private String description; 
        private String excludeResourceIdsScope; 
        private java.util.Map < String, ? > inputParameters; 
        private String maximumExecutionFrequency; 
        private String regionIdsScope; 
        private String resourceGroupIdsScope; 
        private java.util.List < String > resourceTypesScope; 
        private Integer riskLevel; 
        private String sourceIdentifier; 
        private String sourceOwner; 
        private String tagKeyLogicScope; 
        private String tagKeyScope; 
        private String tagValueScope; 

        private Builder() {
            super();
        } 

        private Builder(CreateConfigRuleRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.configRuleName = request.configRuleName;
            this.configRuleTriggerTypes = request.configRuleTriggerTypes;
            this.description = request.description;
            this.excludeResourceIdsScope = request.excludeResourceIdsScope;
            this.inputParameters = request.inputParameters;
            this.maximumExecutionFrequency = request.maximumExecutionFrequency;
            this.regionIdsScope = request.regionIdsScope;
            this.resourceGroupIdsScope = request.resourceGroupIdsScope;
            this.resourceTypesScope = request.resourceTypesScope;
            this.riskLevel = request.riskLevel;
            this.sourceIdentifier = request.sourceIdentifier;
            this.sourceOwner = request.sourceOwner;
            this.tagKeyLogicScope = request.tagKeyLogicScope;
            this.tagKeyScope = request.tagKeyScope;
            this.tagValueScope = request.tagValueScope;
        } 

        /**
         * The client token that you want to use to ensure the idempotency of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.``
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The name of the rule.
         */
        public Builder configRuleName(String configRuleName) {
            this.putBodyParameter("ConfigRuleName", configRuleName);
            this.configRuleName = configRuleName;
            return this;
        }

        /**
         * The trigger type of the rule. Valid values:
         * <p>
         * 
         * *   ConfigurationItemChangeNotification: The rule is triggered by configuration changes.
         * *   ScheduledNotification: The rule is periodically triggered.
         * 
         * >  If a rule supports the preceding trigger types, separate the types with a comma (,).
         */
        public Builder configRuleTriggerTypes(String configRuleTriggerTypes) {
            this.putBodyParameter("ConfigRuleTriggerTypes", configRuleTriggerTypes);
            this.configRuleTriggerTypes = configRuleTriggerTypes;
            return this;
        }

        /**
         * The description of the rule.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The ID of the resource to be excluded from the compliance evaluations performed by the rule. Separate multiple resource IDs with commas (,).
         * <p>
         * 
         * >  This parameter applies only to managed rules.
         */
        public Builder excludeResourceIdsScope(String excludeResourceIdsScope) {
            this.putBodyParameter("ExcludeResourceIdsScope", excludeResourceIdsScope);
            this.excludeResourceIdsScope = excludeResourceIdsScope;
            return this;
        }

        /**
         * The input parameter of the rule.
         */
        public Builder inputParameters(java.util.Map < String, ? > inputParameters) {
            String inputParametersShrink = shrink(inputParameters, "InputParameters", "json");
            this.putBodyParameter("InputParameters", inputParametersShrink);
            this.inputParameters = inputParameters;
            return this;
        }

        /**
         * The intervals at which the rule is triggered. Valid values:
         * <p>
         * 
         * *   One_Hour: 1 hour.
         * *   Three_Hours: 3 hours.
         * *   Six_Hours: 6 hours.
         * *   Twelve_Hours: 12 hours.
         * *   TwentyFour_Hours (default): 24 hours.
         * 
         * >  This parameter is required if the ConfigRuleTriggerTypes parameter is set to ScheduledNotification.
         */
        public Builder maximumExecutionFrequency(String maximumExecutionFrequency) {
            this.putBodyParameter("MaximumExecutionFrequency", maximumExecutionFrequency);
            this.maximumExecutionFrequency = maximumExecutionFrequency;
            return this;
        }

        /**
         * The ID of the region to which the rule applies. Separate multiple region IDs with commas (,).
         * <p>
         * 
         * >  This parameter applies only to managed rules.
         */
        public Builder regionIdsScope(String regionIdsScope) {
            this.putBodyParameter("RegionIdsScope", regionIdsScope);
            this.regionIdsScope = regionIdsScope;
            return this;
        }

        /**
         * The ID of the resource group to which the rule applies. Separate multiple resource group IDs with commas (,).
         * <p>
         * 
         * >  This parameter applies only to managed rules.
         */
        public Builder resourceGroupIdsScope(String resourceGroupIdsScope) {
            this.putBodyParameter("ResourceGroupIdsScope", resourceGroupIdsScope);
            this.resourceGroupIdsScope = resourceGroupIdsScope;
            return this;
        }

        /**
         * The type of the resource to be evaluated by the rule. Separate multiple resource types with commas (,).
         */
        public Builder resourceTypesScope(java.util.List < String > resourceTypesScope) {
            String resourceTypesScopeShrink = shrink(resourceTypesScope, "ResourceTypesScope", "simple");
            this.putBodyParameter("ResourceTypesScope", resourceTypesScopeShrink);
            this.resourceTypesScope = resourceTypesScope;
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
            this.putBodyParameter("RiskLevel", riskLevel);
            this.riskLevel = riskLevel;
            return this;
        }

        /**
         * The ID of the rule.
         * <p>
         * 
         * *   If you set the SourceOwner parameter to ALIYUN, set this parameter to the name of the managed rule.
         * *   If you set the SourceOwner parameter to CUSTOM_FC, set this parameter to the Alibaba Cloud Resource Name (ARN) of the relevant function in Function Compute.
         * 
         * For more information about how to query the name of a managed rule, see [Managed rules](~~127404~~).
         */
        public Builder sourceIdentifier(String sourceIdentifier) {
            this.putBodyParameter("SourceIdentifier", sourceIdentifier);
            this.sourceIdentifier = sourceIdentifier;
            return this;
        }

        /**
         * The type of the rule Valid values:
         * <p>
         * 
         * *   ALIYUN: managed rule.
         * *   CUSTOM_FC: custom rule.
         */
        public Builder sourceOwner(String sourceOwner) {
            this.putBodyParameter("SourceOwner", sourceOwner);
            this.sourceOwner = sourceOwner;
            return this;
        }

        /**
         * The logical relationship among the tag keys if you specify multiple tag keys for `TagKeyScope`. For example, if you set `TagKeyScope` to `ECS,OSS` and set TagKeyLogicScope to `AND`, the rule applies to resources with both the `ECS` and `OSS` tag keys. Valid values:
         * <p>
         * 
         * *   AND
         * *   OR
         */
        public Builder tagKeyLogicScope(String tagKeyLogicScope) {
            this.putBodyParameter("TagKeyLogicScope", tagKeyLogicScope);
            this.tagKeyLogicScope = tagKeyLogicScope;
            return this;
        }

        /**
         * The tag key used to filter resources. The rule applies only to the resources with the specified tag key.
         * <p>
         * 
         * >  This parameter applies only to managed rules. You must specify both `TagKeyScope` and `TagValueScope`.
         */
        public Builder tagKeyScope(String tagKeyScope) {
            this.putBodyParameter("TagKeyScope", tagKeyScope);
            this.tagKeyScope = tagKeyScope;
            return this;
        }

        /**
         * The tag value used to filter resources. The rule applies only to the resources that use the specified tag value.
         * <p>
         * 
         * >  This parameter applies only to managed rules. You must specify both `TagKeyScope` and `TagValueScope`.
         */
        public Builder tagValueScope(String tagValueScope) {
            this.putBodyParameter("TagValueScope", tagValueScope);
            this.tagValueScope = tagValueScope;
            return this;
        }

        @Override
        public CreateConfigRuleRequest build() {
            return new CreateConfigRuleRequest(this);
        } 

    } 

}
