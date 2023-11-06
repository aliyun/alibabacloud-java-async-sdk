// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAggregateConfigRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateAggregateConfigRuleRequest</p>
 */
public class CreateAggregateConfigRuleRequest extends Request {
    @Body
    @NameInMap("AggregatorId")
    @Validation(required = true)
    private String aggregatorId;

    @Body
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("ConfigRuleName")
    @Validation(required = true)
    private String configRuleName;

    @Body
    @NameInMap("ConfigRuleTriggerTypes")
    @Validation(required = true)
    private String configRuleTriggerTypes;

    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("ExcludeAccountIdsScope")
    private String excludeAccountIdsScope;

    @Body
    @NameInMap("ExcludeFolderIdsScope")
    private String excludeFolderIdsScope;

    @Body
    @NameInMap("ExcludeResourceIdsScope")
    private String excludeResourceIdsScope;

    @Body
    @NameInMap("FolderIdsScope")
    private String folderIdsScope;

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
    @Validation(required = true)
    private java.util.List < String > resourceTypesScope;

    @Body
    @NameInMap("RiskLevel")
    @Validation(required = true)
    private Integer riskLevel;

    @Body
    @NameInMap("SourceIdentifier")
    @Validation(required = true)
    private String sourceIdentifier;

    @Body
    @NameInMap("SourceOwner")
    @Validation(required = true)
    private String sourceOwner;

    @Body
    @NameInMap("TagKeyLogicScope")
    private String tagKeyLogicScope;

    @Body
    @NameInMap("TagKeyScope")
    private String tagKeyScope;

    @Body
    @NameInMap("TagValueScope")
    private String tagValueScope;

    private CreateAggregateConfigRuleRequest(Builder builder) {
        super(builder);
        this.aggregatorId = builder.aggregatorId;
        this.clientToken = builder.clientToken;
        this.configRuleName = builder.configRuleName;
        this.configRuleTriggerTypes = builder.configRuleTriggerTypes;
        this.description = builder.description;
        this.excludeAccountIdsScope = builder.excludeAccountIdsScope;
        this.excludeFolderIdsScope = builder.excludeFolderIdsScope;
        this.excludeResourceIdsScope = builder.excludeResourceIdsScope;
        this.folderIdsScope = builder.folderIdsScope;
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

    public static CreateAggregateConfigRuleRequest create() {
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
     * @return excludeAccountIdsScope
     */
    public String getExcludeAccountIdsScope() {
        return this.excludeAccountIdsScope;
    }

    /**
     * @return excludeFolderIdsScope
     */
    public String getExcludeFolderIdsScope() {
        return this.excludeFolderIdsScope;
    }

    /**
     * @return excludeResourceIdsScope
     */
    public String getExcludeResourceIdsScope() {
        return this.excludeResourceIdsScope;
    }

    /**
     * @return folderIdsScope
     */
    public String getFolderIdsScope() {
        return this.folderIdsScope;
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

    public static final class Builder extends Request.Builder<CreateAggregateConfigRuleRequest, Builder> {
        private String aggregatorId; 
        private String clientToken; 
        private String configRuleName; 
        private String configRuleTriggerTypes; 
        private String description; 
        private String excludeAccountIdsScope; 
        private String excludeFolderIdsScope; 
        private String excludeResourceIdsScope; 
        private String folderIdsScope; 
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

        private Builder(CreateAggregateConfigRuleRequest request) {
            super(request);
            this.aggregatorId = request.aggregatorId;
            this.clientToken = request.clientToken;
            this.configRuleName = request.configRuleName;
            this.configRuleTriggerTypes = request.configRuleTriggerTypes;
            this.description = request.description;
            this.excludeAccountIdsScope = request.excludeAccountIdsScope;
            this.excludeFolderIdsScope = request.excludeFolderIdsScope;
            this.excludeResourceIdsScope = request.excludeResourceIdsScope;
            this.folderIdsScope = request.folderIdsScope;
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
         * The ID of the account group.
         * <p>
         * 
         * For more information about how to obtain the ID of the account group, see [ListAggregators](~~255797~~).
         */
        public Builder aggregatorId(String aggregatorId) {
            this.putBodyParameter("AggregatorId", aggregatorId);
            this.aggregatorId = aggregatorId;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The `token` can contain only ASCII characters and cannot exceed 64 characters in length.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The rule name.
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
         * The ID of the member account to which the rule does not apply, which means that the resources within the member account are not evaluated based on the rule. Separate multiple member account IDs with commas (,).
         * <p>
         * 
         * > This parameter applies only to a managed rule.
         */
        public Builder excludeAccountIdsScope(String excludeAccountIdsScope) {
            this.putBodyParameter("ExcludeAccountIdsScope", excludeAccountIdsScope);
            this.excludeAccountIdsScope = excludeAccountIdsScope;
            return this;
        }

        /**
         * The ID of the resource directory to which the rule does not apply, which means that the resources within member accounts in the resource directory are not evaluated based on the rule. Separate multiple resource directory IDs with commas (,).
         * <p>
         * 
         * > 
         * 
         * *   This parameter applies only to a rule of a global account group.
         * 
         * *   This parameter applies only to a managed rule.
         */
        public Builder excludeFolderIdsScope(String excludeFolderIdsScope) {
            this.putBodyParameter("ExcludeFolderIdsScope", excludeFolderIdsScope);
            this.excludeFolderIdsScope = excludeFolderIdsScope;
            return this;
        }

        /**
         * The ID of the resource to be excluded from the compliance evaluations performed by the rule. Separate multiple resource IDs with commas (,).
         * <p>
         * 
         * > This parameter applies only to a managed rule.
         */
        public Builder excludeResourceIdsScope(String excludeResourceIdsScope) {
            this.putBodyParameter("ExcludeResourceIdsScope", excludeResourceIdsScope);
            this.excludeResourceIdsScope = excludeResourceIdsScope;
            return this;
        }

        /**
         * The ID of the resource directory to which the rule applies, which means that the resources within member accounts in the resource directory are evaluated based on the rule.
         * <p>
         * 
         * > 
         * 
         * *   This parameter applies only to a rule of a global account group.
         * 
         * *   This parameter applies only to a managed rule.
         */
        public Builder folderIdsScope(String folderIdsScope) {
            this.putBodyParameter("FolderIdsScope", folderIdsScope);
            this.folderIdsScope = folderIdsScope;
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
         * The interval at which the rule is triggered. Valid values:
         * <p>
         * 
         * *   One_Hour: 1 hour.
         * *   Three_Hours: 3 hours.
         * *   Six_Hours: 6 hours.
         * *   Twelve_Hours: 12 hours.
         * *   TwentyFour_Hours (default): 24 hours.
         * 
         * > This parameter is required if the `ConfigRuleTriggerTypes` parameter is set to `ScheduledNotification`.
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
         * > This parameter applies only to a managed rule.
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
         * > This parameter applies only to a managed rule.
         */
        public Builder resourceGroupIdsScope(String resourceGroupIdsScope) {
            this.putBodyParameter("ResourceGroupIdsScope", resourceGroupIdsScope);
            this.resourceGroupIdsScope = resourceGroupIdsScope;
            return this;
        }

        /**
         * The type of the resource evaluated by the rule. Separate multiple resource types with commas (,).
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
         * The identifier of the rule.
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
         * The type of the rule. Valid values:
         * <p>
         * 
         * *   ALIYUN: managed rule
         * *   CUSTOM_FC: custom rule
         */
        public Builder sourceOwner(String sourceOwner) {
            this.putBodyParameter("SourceOwner", sourceOwner);
            this.sourceOwner = sourceOwner;
            return this;
        }

        /**
         * The logical relationship among the tag keys if you specify multiple tag keys for the `TagKeyScope` parameter. For example, if you set the `TagKeyScope` parameter to `ECS,OSS` and the TagKeyLogicScope parameter to `AND`, the rule applies to resources with both the `ECS` and `OSS` tag keys. Valid values:
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
         * The tag key used to filter resources. The rule applies only to the resources with the specified tag key. Separate multiple parameter values with commas (,).
         * <p>
         * 
         * > This parameter applies only to a managed rule. You must configure the `TagKeyScope` and `TagValueScope` parameters at the same time.
         */
        public Builder tagKeyScope(String tagKeyScope) {
            this.putBodyParameter("TagKeyScope", tagKeyScope);
            this.tagKeyScope = tagKeyScope;
            return this;
        }

        /**
         * The tag value used to filter resources. The rule applies only to the resources with the specified tag value.
         * <p>
         * 
         * > This parameter applies only to a managed rule. You must configure the `TagKeyScope` and `TagValueScope` parameters at the same time.
         */
        public Builder tagValueScope(String tagValueScope) {
            this.putBodyParameter("TagValueScope", tagValueScope);
            this.tagValueScope = tagValueScope;
            return this;
        }

        @Override
        public CreateAggregateConfigRuleRequest build() {
            return new CreateAggregateConfigRuleRequest(this);
        } 

    } 

}
