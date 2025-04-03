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
 * {@link UpdateAggregateConfigRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateAggregateConfigRuleRequest</p>
 */
public class UpdateAggregateConfigRuleRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccountIdsScope")
    private String accountIdsScope;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AggregatorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aggregatorId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConfigRuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configRuleId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConfigRuleName")
    private String configRuleName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConfigRuleTriggerTypes")
    private String configRuleTriggerTypes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExcludeAccountIdsScope")
    private String excludeAccountIdsScope;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExcludeFolderIdsScope")
    private String excludeFolderIdsScope;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExcludeRegionIdsScope")
    private String excludeRegionIdsScope;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExcludeResourceGroupIdsScope")
    private String excludeResourceGroupIdsScope;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExcludeResourceIdsScope")
    private String excludeResourceIdsScope;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExcludeTagsScope")
    private java.util.List<ExcludeTagsScope> excludeTagsScope;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FolderIdsScope")
    private String folderIdsScope;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InputParameters")
    private java.util.Map<String, ?> inputParameters;

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
    @com.aliyun.core.annotation.NameInMap("ResourceIdsScope")
    private String resourceIdsScope;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceNameScope")
    private String resourceNameScope;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceTypesScope")
    private java.util.List<String> resourceTypesScope;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RiskLevel")
    @com.aliyun.core.annotation.Validation(maximum = 3, minimum = 1)
    private Integer riskLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TagKeyLogicScope")
    @Deprecated
    private String tagKeyLogicScope;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TagKeyScope")
    @Deprecated
    private String tagKeyScope;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TagValueScope")
    @Deprecated
    private String tagValueScope;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TagsScope")
    private java.util.List<TagsScope> tagsScope;

    private UpdateAggregateConfigRuleRequest(Builder builder) {
        super(builder);
        this.accountIdsScope = builder.accountIdsScope;
        this.aggregatorId = builder.aggregatorId;
        this.clientToken = builder.clientToken;
        this.configRuleId = builder.configRuleId;
        this.configRuleName = builder.configRuleName;
        this.configRuleTriggerTypes = builder.configRuleTriggerTypes;
        this.description = builder.description;
        this.excludeAccountIdsScope = builder.excludeAccountIdsScope;
        this.excludeFolderIdsScope = builder.excludeFolderIdsScope;
        this.excludeRegionIdsScope = builder.excludeRegionIdsScope;
        this.excludeResourceGroupIdsScope = builder.excludeResourceGroupIdsScope;
        this.excludeResourceIdsScope = builder.excludeResourceIdsScope;
        this.excludeTagsScope = builder.excludeTagsScope;
        this.folderIdsScope = builder.folderIdsScope;
        this.inputParameters = builder.inputParameters;
        this.maximumExecutionFrequency = builder.maximumExecutionFrequency;
        this.regionIdsScope = builder.regionIdsScope;
        this.resourceGroupIdsScope = builder.resourceGroupIdsScope;
        this.resourceIdsScope = builder.resourceIdsScope;
        this.resourceNameScope = builder.resourceNameScope;
        this.resourceTypesScope = builder.resourceTypesScope;
        this.riskLevel = builder.riskLevel;
        this.tag = builder.tag;
        this.tagKeyLogicScope = builder.tagKeyLogicScope;
        this.tagKeyScope = builder.tagKeyScope;
        this.tagValueScope = builder.tagValueScope;
        this.tagsScope = builder.tagsScope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAggregateConfigRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountIdsScope
     */
    public String getAccountIdsScope() {
        return this.accountIdsScope;
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
     * @return excludeRegionIdsScope
     */
    public String getExcludeRegionIdsScope() {
        return this.excludeRegionIdsScope;
    }

    /**
     * @return excludeResourceGroupIdsScope
     */
    public String getExcludeResourceGroupIdsScope() {
        return this.excludeResourceGroupIdsScope;
    }

    /**
     * @return excludeResourceIdsScope
     */
    public String getExcludeResourceIdsScope() {
        return this.excludeResourceIdsScope;
    }

    /**
     * @return excludeTagsScope
     */
    public java.util.List<ExcludeTagsScope> getExcludeTagsScope() {
        return this.excludeTagsScope;
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
    public java.util.Map<String, ?> getInputParameters() {
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
     * @return resourceIdsScope
     */
    public String getResourceIdsScope() {
        return this.resourceIdsScope;
    }

    /**
     * @return resourceNameScope
     */
    public String getResourceNameScope() {
        return this.resourceNameScope;
    }

    /**
     * @return resourceTypesScope
     */
    public java.util.List<String> getResourceTypesScope() {
        return this.resourceTypesScope;
    }

    /**
     * @return riskLevel
     */
    public Integer getRiskLevel() {
        return this.riskLevel;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
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

    /**
     * @return tagsScope
     */
    public java.util.List<TagsScope> getTagsScope() {
        return this.tagsScope;
    }

    public static final class Builder extends Request.Builder<UpdateAggregateConfigRuleRequest, Builder> {
        private String accountIdsScope; 
        private String aggregatorId; 
        private String clientToken; 
        private String configRuleId; 
        private String configRuleName; 
        private String configRuleTriggerTypes; 
        private String description; 
        private String excludeAccountIdsScope; 
        private String excludeFolderIdsScope; 
        private String excludeRegionIdsScope; 
        private String excludeResourceGroupIdsScope; 
        private String excludeResourceIdsScope; 
        private java.util.List<ExcludeTagsScope> excludeTagsScope; 
        private String folderIdsScope; 
        private java.util.Map<String, ?> inputParameters; 
        private String maximumExecutionFrequency; 
        private String regionIdsScope; 
        private String resourceGroupIdsScope; 
        private String resourceIdsScope; 
        private String resourceNameScope; 
        private java.util.List<String> resourceTypesScope; 
        private Integer riskLevel; 
        private java.util.List<Tag> tag; 
        private String tagKeyLogicScope; 
        private String tagKeyScope; 
        private String tagValueScope; 
        private java.util.List<TagsScope> tagsScope; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAggregateConfigRuleRequest request) {
            super(request);
            this.accountIdsScope = request.accountIdsScope;
            this.aggregatorId = request.aggregatorId;
            this.clientToken = request.clientToken;
            this.configRuleId = request.configRuleId;
            this.configRuleName = request.configRuleName;
            this.configRuleTriggerTypes = request.configRuleTriggerTypes;
            this.description = request.description;
            this.excludeAccountIdsScope = request.excludeAccountIdsScope;
            this.excludeFolderIdsScope = request.excludeFolderIdsScope;
            this.excludeRegionIdsScope = request.excludeRegionIdsScope;
            this.excludeResourceGroupIdsScope = request.excludeResourceGroupIdsScope;
            this.excludeResourceIdsScope = request.excludeResourceIdsScope;
            this.excludeTagsScope = request.excludeTagsScope;
            this.folderIdsScope = request.folderIdsScope;
            this.inputParameters = request.inputParameters;
            this.maximumExecutionFrequency = request.maximumExecutionFrequency;
            this.regionIdsScope = request.regionIdsScope;
            this.resourceGroupIdsScope = request.resourceGroupIdsScope;
            this.resourceIdsScope = request.resourceIdsScope;
            this.resourceNameScope = request.resourceNameScope;
            this.resourceTypesScope = request.resourceTypesScope;
            this.riskLevel = request.riskLevel;
            this.tag = request.tag;
            this.tagKeyLogicScope = request.tagKeyLogicScope;
            this.tagKeyScope = request.tagKeyScope;
            this.tagValueScope = request.tagValueScope;
            this.tagsScope = request.tagsScope;
        } 

        /**
         * <p>The IDs of the member accounts to which the rule applies, which means that the resources within the member accounts are evaluated based on the rule. Separate multiple member account IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>115748125982****</p>
         */
        public Builder accountIdsScope(String accountIdsScope) {
            this.putBodyParameter("AccountIdsScope", accountIdsScope);
            this.accountIdsScope = accountIdsScope;
            return this;
        }

        /**
         * <p>The ID of the account group.</p>
         * <p>For more information about how to query the ID of an account group, see <a href="https://help.aliyun.com/document_detail/255797.html">ListAggregators</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ca-a4e5626622af0079****</p>
         */
        public Builder aggregatorId(String aggregatorId) {
            this.putBodyParameter("AggregatorId", aggregatorId);
            this.aggregatorId = aggregatorId;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>1594295238-f9361358-5843-4294-8d30-b5183fac****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The ID of the rule.</p>
         * <p>For more information about how to query the ID of a rule, see <a href="https://help.aliyun.com/document_detail/264148.html">ListAggregateConfigRules</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cr-4e3d626622af0080****</p>
         */
        public Builder configRuleId(String configRuleId) {
            this.putBodyParameter("ConfigRuleId", configRuleId);
            this.configRuleId = configRuleId;
            return this;
        }

        /**
         * <p>The name of the rule.</p>
         * <p>For more information about how to query the name of a rule, see <a href="https://help.aliyun.com/document_detail/264148.html">ListAggregateConfigRules</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>test_rule</p>
         */
        public Builder configRuleName(String configRuleName) {
            this.putBodyParameter("ConfigRuleName", configRuleName);
            this.configRuleName = configRuleName;
            return this;
        }

        /**
         * <p>The trigger type of the rule. Valid values:</p>
         * <ul>
         * <li>ConfigurationItemChangeNotification: The rule is triggered by configuration changes.</li>
         * <li>ScheduledNotification: The rule is periodically triggered.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter applies only to a custom rule.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ConfigurationItemChangeNotification</p>
         */
        public Builder configRuleTriggerTypes(String configRuleTriggerTypes) {
            this.putBodyParameter("ConfigRuleTriggerTypes", configRuleTriggerTypes);
            this.configRuleTriggerTypes = configRuleTriggerTypes;
            return this;
        }

        /**
         * <p>The description of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test_description</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The IDs of the member accounts to which the rule does not apply, which means that the resources within the member accounts are not evaluated based on the rule. Separate multiple member account IDs with commas (,).</p>
         * <blockquote>
         * <p> This parameter applies only to a managed rule.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>120886317861****</p>
         */
        public Builder excludeAccountIdsScope(String excludeAccountIdsScope) {
            this.putBodyParameter("ExcludeAccountIdsScope", excludeAccountIdsScope);
            this.excludeAccountIdsScope = excludeAccountIdsScope;
            return this;
        }

        /**
         * <p>The IDs of the resource directories to which the rule does not apply, which means that the resources within member accounts in the resource directories are not evaluated based on the rule. Separate multiple resource directory IDs with commas (,).</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>This parameter applies only to a rule of a global account group.</p>
         * </li>
         * <li><p>This parameter applies only to a managed rule.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>fd-pWmkqZ****</p>
         */
        public Builder excludeFolderIdsScope(String excludeFolderIdsScope) {
            this.putBodyParameter("ExcludeFolderIdsScope", excludeFolderIdsScope);
            this.excludeFolderIdsScope = excludeFolderIdsScope;
            return this;
        }

        /**
         * <p>The IDs of the regions to which the rule not applies. Separate multiple region IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder excludeRegionIdsScope(String excludeRegionIdsScope) {
            this.putBodyParameter("ExcludeRegionIdsScope", excludeRegionIdsScope);
            this.excludeRegionIdsScope = excludeRegionIdsScope;
            return this;
        }

        /**
         * <p>The IDs of the resource groups to which the rule not applies. Separate multiple resource group IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>rg-bnczc6r7rml****</p>
         */
        public Builder excludeResourceGroupIdsScope(String excludeResourceGroupIdsScope) {
            this.putBodyParameter("ExcludeResourceGroupIdsScope", excludeResourceGroupIdsScope);
            this.excludeResourceGroupIdsScope = excludeResourceGroupIdsScope;
            return this;
        }

        /**
         * <p>The IDs of the resources excluded from the compliance evaluations performed by the rule. Separate multiple resource IDs with commas (,).</p>
         * <blockquote>
         * <p> This parameter applies only to a managed rule.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>lb-t4nbowvtbkss7t326****</p>
         */
        public Builder excludeResourceIdsScope(String excludeResourceIdsScope) {
            this.putBodyParameter("ExcludeResourceIdsScope", excludeResourceIdsScope);
            this.excludeResourceIdsScope = excludeResourceIdsScope;
            return this;
        }

        /**
         * <p>Exclude the specific tag scope of resources .</p>
         */
        public Builder excludeTagsScope(java.util.List<ExcludeTagsScope> excludeTagsScope) {
            this.putBodyParameter("ExcludeTagsScope", excludeTagsScope);
            this.excludeTagsScope = excludeTagsScope;
            return this;
        }

        /**
         * <p>The IDs of the resource directories to which the rule applies, which means that the resources within member accounts in the resource directories are evaluated based on the rule.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>This parameter applies only to a rule of a global account group.</p>
         * </li>
         * <li><p>This parameter applies only to a managed rule.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>fd-ZtHsRH****</p>
         */
        public Builder folderIdsScope(String folderIdsScope) {
            this.putBodyParameter("FolderIdsScope", folderIdsScope);
            this.folderIdsScope = folderIdsScope;
            return this;
        }

        /**
         * <p>The input parameters of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;tag1Key&quot;:&quot;ECS&quot;,&quot;tag1Value&quot;:&quot;test&quot;}</p>
         */
        public Builder inputParameters(java.util.Map<String, ?> inputParameters) {
            String inputParametersShrink = shrink(inputParameters, "InputParameters", "json");
            this.putBodyParameter("InputParameters", inputParametersShrink);
            this.inputParameters = inputParameters;
            return this;
        }

        /**
         * <p>The interval at which the rule is triggered. Valid values:</p>
         * <ul>
         * <li>One_Hour</li>
         * <li>Three_Hours</li>
         * <li>Six_Hours</li>
         * <li>Twelve_Hours</li>
         * <li>TwentyFour_Hours</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is required if the <code>ConfigRuleTriggerTypes</code> parameter is set to <code>ScheduledNotification</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>One_Hour</p>
         */
        public Builder maximumExecutionFrequency(String maximumExecutionFrequency) {
            this.putBodyParameter("MaximumExecutionFrequency", maximumExecutionFrequency);
            this.maximumExecutionFrequency = maximumExecutionFrequency;
            return this;
        }

        /**
         * <p>The IDs of the regions to which the rule applies. Separate multiple region IDs with commas (,).</p>
         * <blockquote>
         * <p> This parameter applies only to a managed rule.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionIdsScope(String regionIdsScope) {
            this.putBodyParameter("RegionIdsScope", regionIdsScope);
            this.regionIdsScope = regionIdsScope;
            return this;
        }

        /**
         * <p>The IDs of the resource groups to which the rule applies. Separate multiple resource group IDs with commas (,).</p>
         * <blockquote>
         * <p> This parameter applies only to a managed rule.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzc7r7rhx****</p>
         */
        public Builder resourceGroupIdsScope(String resourceGroupIdsScope) {
            this.putBodyParameter("ResourceGroupIdsScope", resourceGroupIdsScope);
            this.resourceGroupIdsScope = resourceGroupIdsScope;
            return this;
        }

        /**
         * <p>The IDs of the resources included from the compliance evaluations performed by the rule. Separate multiple resource IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>lb-5cmbowstbkss9ta03****</p>
         */
        public Builder resourceIdsScope(String resourceIdsScope) {
            this.putBodyParameter("ResourceIdsScope", resourceIdsScope);
            this.resourceIdsScope = resourceIdsScope;
            return this;
        }

        /**
         * <p>The names of the resource groups to which the rule applies.</p>
         * 
         * <strong>example:</strong>
         * <p>i-xxx</p>
         */
        public Builder resourceNameScope(String resourceNameScope) {
            this.putBodyParameter("ResourceNameScope", resourceNameScope);
            this.resourceNameScope = resourceNameScope;
            return this;
        }

        /**
         * <p>The type of the resource to be evaluated by the rule. Separate multiple resource types with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>ACS::ECS::Instance</p>
         */
        public Builder resourceTypesScope(java.util.List<String> resourceTypesScope) {
            String resourceTypesScopeShrink = shrink(resourceTypesScope, "ResourceTypesScope", "simple");
            this.putBodyParameter("ResourceTypesScope", resourceTypesScopeShrink);
            this.resourceTypesScope = resourceTypesScope;
            return this;
        }

        /**
         * <p>The risk level of the resources that do not comply with the rule. Valid values:</p>
         * <ul>
         * <li>1: high</li>
         * <li>2: medium</li>
         * <li>3: low</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder riskLevel(Integer riskLevel) {
            this.putBodyParameter("RiskLevel", riskLevel);
            this.riskLevel = riskLevel;
            return this;
        }

        /**
         * <p>The tags of the resource.</p>
         * <p>You can add up to 20 tags to a resource.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            String tagShrink = shrink(tag, "Tag", "json");
            this.putQueryParameter("Tag", tagShrink);
            this.tag = tag;
            return this;
        }

        /**
         * <p>This parameter is deprecated. We recommend that you use the <code>TagsScope</code> parameter.</p>
         * <p>The logical relationship among the tag keys if you specify multiple tag keys for the <code>TagKeyScope</code> parameter. For example, if you set the <code>TagKeyScope</code> parameter to <code>ECS,OSS</code> and the TagKeyLogicScope parameter to <code>AND</code>, the rule applies to resources with both the <code>ECS</code> and <code>OSS</code> tag keys. Valid values:</p>
         * <ul>
         * <li>AND</li>
         * <li>OR</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AND</p>
         */
        public Builder tagKeyLogicScope(String tagKeyLogicScope) {
            this.putBodyParameter("TagKeyLogicScope", tagKeyLogicScope);
            this.tagKeyLogicScope = tagKeyLogicScope;
            return this;
        }

        /**
         * <p>This parameter is deprecated. We recommend that you use the <code>TagsScope</code> parameter.</p>
         * <p>The tag key used to filter resources. The rule applies only to the resources with the specified tag key.</p>
         * <blockquote>
         * <p> This parameter applies only to a managed rule. You must configure the <code>TagKeyScope</code> and <code>TagValueScope</code> parameters at the same time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        public Builder tagKeyScope(String tagKeyScope) {
            this.putBodyParameter("TagKeyScope", tagKeyScope);
            this.tagKeyScope = tagKeyScope;
            return this;
        }

        /**
         * <p>This parameter is deprecated. We recommend that you use the <code>TagsScope</code> parameter.</p>
         * <p>The tag value used to filter resources. The rule applies only to the resources that use the specified tag value.</p>
         * <blockquote>
         * <p> This parameter applies only to a managed rule. You must configure the <code>TagKeyScope</code> and <code>TagValueScope</code> parameters at the same time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder tagValueScope(String tagValueScope) {
            this.putBodyParameter("TagValueScope", tagValueScope);
            this.tagValueScope = tagValueScope;
            return this;
        }

        /**
         * <p>The valid tag scope of resources.</p>
         */
        public Builder tagsScope(java.util.List<TagsScope> tagsScope) {
            this.putBodyParameter("TagsScope", tagsScope);
            this.tagsScope = tagsScope;
            return this;
        }

        @Override
        public UpdateAggregateConfigRuleRequest build() {
            return new UpdateAggregateConfigRuleRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateAggregateConfigRuleRequest} extends {@link TeaModel}
     *
     * <p>UpdateAggregateConfigRuleRequest</p>
     */
    public static class ExcludeTagsScope extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private ExcludeTagsScope(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExcludeTagsScope create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            private Builder() {
            } 

            private Builder(ExcludeTagsScope model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>key-2</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>value-2</p>
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public ExcludeTagsScope build() {
                return new ExcludeTagsScope(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateAggregateConfigRuleRequest} extends {@link TeaModel}
     *
     * <p>UpdateAggregateConfigRuleRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key of the resource. You can specify up to 20 tag keys.</p>
             * <p>The tag key cannot be an empty string. The tag key must be 1 to 64 characters in length and cannot start with <code>aliyun</code> or <code>acs</code>:. The tag key cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>key-1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag values.</p>
             * <p>The tag values can be an empty string or up to 128 characters in length. The tag values cannot start with <code>aliyun</code> or <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * <p>Each key-value must be unique. You can specify at most 20 tag values in each call.</p>
             * 
             * <strong>example:</strong>
             * <p>value-1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateAggregateConfigRuleRequest} extends {@link TeaModel}
     *
     * <p>UpdateAggregateConfigRuleRequest</p>
     */
    public static class TagsScope extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private TagsScope(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagsScope create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            private Builder() {
            } 

            private Builder(TagsScope model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>key-1</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>value-1</p>
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public TagsScope build() {
                return new TagsScope(this);
            } 

        } 

    }
}
