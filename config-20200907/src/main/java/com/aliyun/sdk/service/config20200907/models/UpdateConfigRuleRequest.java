// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateConfigRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateConfigRuleRequest</p>
 */
public class UpdateConfigRuleRequest extends Request {
    @Body
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("ConfigRuleId")
    @Validation(required = true)
    private String configRuleId;

    @Body
    @NameInMap("ConfigRuleName")
    private String configRuleName;

    @Body
    @NameInMap("ConfigRuleTriggerTypes")
    private String configRuleTriggerTypes;

    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("ExcludeResourceIdsScope")
    private String excludeResourceIdsScope;

    @Body
    @NameInMap("InputParameters")
    private java.util.Map < String, ? > inputParameters;

    @Body
    @NameInMap("MaximumExecutionFrequency")
    private String maximumExecutionFrequency;

    @Body
    @NameInMap("RegionIdsScope")
    private String regionIdsScope;

    @Body
    @NameInMap("ResourceGroupIdsScope")
    private String resourceGroupIdsScope;

    @Body
    @NameInMap("ResourceTypesScope")
    private java.util.List < String > resourceTypesScope;

    @Body
    @NameInMap("RiskLevel")
    @Validation(maximum = 3, minimum = 1)
    private Integer riskLevel;

    @Body
    @NameInMap("TagKeyLogicScope")
    private String tagKeyLogicScope;

    @Body
    @NameInMap("TagKeyScope")
    private String tagKeyScope;

    @Body
    @NameInMap("TagValueScope")
    private String tagValueScope;

    private UpdateConfigRuleRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.configRuleId = builder.configRuleId;
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
        this.tagKeyLogicScope = builder.tagKeyLogicScope;
        this.tagKeyScope = builder.tagKeyScope;
        this.tagValueScope = builder.tagValueScope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateConfigRuleRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateConfigRuleRequest, Builder> {
        private String clientToken; 
        private String configRuleId; 
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
        private String tagKeyLogicScope; 
        private String tagKeyScope; 
        private String tagValueScope; 

        private Builder() {
            super();
        } 

        private Builder(UpdateConfigRuleRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.configRuleId = request.configRuleId;
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
         * The ID of the rule.
         * <p>
         * 
         * For more information about how to query the ID of a rule, see [ListConfigRules](~~169607~~).
         */
        public Builder configRuleId(String configRuleId) {
            this.putBodyParameter("ConfigRuleId", configRuleId);
            this.configRuleId = configRuleId;
            return this;
        }

        /**
         * The name of the rule.
         * <p>
         * 
         * For more information about how to query the name of a rule, see [ListAggregateConfigRules](~~264148~~).
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
         * >  This parameter applies only to custom rules.
         */
        public Builder configRuleTriggerTypes(String configRuleTriggerTypes) {
            this.putBodyParameter("ConfigRuleTriggerTypes", configRuleTriggerTypes);
            this.configRuleTriggerTypes = configRuleTriggerTypes;
            return this;
        }

        /**
         * The description of the rule. You can enter up to 500 characters.
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
         * The input parameters of the rule.
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
         * >  This parameter is required if you set the `ConfigRuleTriggerTypes` parameter to `ScheduledNotification`.
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
         * The risk level of the resources that are not compliant with the rule. Valid values:
         * <p>
         * 
         * *   1: high risk level
         * *   2: medium risk level
         * *   3: low risk level
         */
        public Builder riskLevel(Integer riskLevel) {
            this.putBodyParameter("RiskLevel", riskLevel);
            this.riskLevel = riskLevel;
            return this;
        }

        /**
         * The logical relationship among the tag keys if you specify multiple tag keys by using the `TagKeyScope` parameter. For example, if the `TagKeyScope` parameter is set to `ECS,OSS` and the TagKeyLogicScope parameter is set to `AND`, the rule applies to resources with both the `ECS` and `OSS` tag keys. Valid values:
         * <p>
         * 
         * *   AND: logical AND
         * *   OR: logical OR
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
         * >  This parameter applies only to managed rules. You must configure the `TagKeyScope` and `TagValueScope` parameters at the same time.
         */
        public Builder tagKeyScope(String tagKeyScope) {
            this.putBodyParameter("TagKeyScope", tagKeyScope);
            this.tagKeyScope = tagKeyScope;
            return this;
        }

        /**
         * The tag key used to filter resources. The rule applies only to the resources with the specified tag key.
         * <p>
         * 
         * >  This parameter applies only to managed rules. You must configure the `TagKeyScope` and `TagValueScope` parameters at the same time.
         */
        public Builder tagValueScope(String tagValueScope) {
            this.putBodyParameter("TagValueScope", tagValueScope);
            this.tagValueScope = tagValueScope;
            return this;
        }

        @Override
        public UpdateConfigRuleRequest build() {
            return new UpdateConfigRuleRequest(this);
        } 

    } 

}
