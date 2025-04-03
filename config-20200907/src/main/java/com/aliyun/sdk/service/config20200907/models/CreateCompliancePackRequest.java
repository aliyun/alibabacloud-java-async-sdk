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
 * {@link CreateCompliancePackRequest} extends {@link RequestModel}
 *
 * <p>CreateCompliancePackRequest</p>
 */
public class CreateCompliancePackRequest extends Request {
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
    private java.util.List<ConfigRules> configRules;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DefaultEnable")
    private Boolean defaultEnable;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 500)
    private String description;

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
    @com.aliyun.core.annotation.NameInMap("RegionIdsScope")
    private String regionIdsScope;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupIdsScope")
    private String resourceGroupIdsScope;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceIdsScope")
    private String resourceIdsScope;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RiskLevel")
    @com.aliyun.core.annotation.Validation(maximum = 3, minimum = 1)
    private Integer riskLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TagKeyScope")
    private String tagKeyScope;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TagValueScope")
    private String tagValueScope;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TagsScope")
    private java.util.List<TagsScope> tagsScope;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateContent")
    @com.aliyun.core.annotation.Validation(maxLength = 1024000)
    private String templateContent;

    private CreateCompliancePackRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.compliancePackName = builder.compliancePackName;
        this.compliancePackTemplateId = builder.compliancePackTemplateId;
        this.configRules = builder.configRules;
        this.defaultEnable = builder.defaultEnable;
        this.description = builder.description;
        this.excludeRegionIdsScope = builder.excludeRegionIdsScope;
        this.excludeResourceGroupIdsScope = builder.excludeResourceGroupIdsScope;
        this.excludeResourceIdsScope = builder.excludeResourceIdsScope;
        this.excludeTagsScope = builder.excludeTagsScope;
        this.regionIdsScope = builder.regionIdsScope;
        this.resourceGroupIdsScope = builder.resourceGroupIdsScope;
        this.resourceIdsScope = builder.resourceIdsScope;
        this.riskLevel = builder.riskLevel;
        this.tag = builder.tag;
        this.tagKeyScope = builder.tagKeyScope;
        this.tagValueScope = builder.tagValueScope;
        this.tagsScope = builder.tagsScope;
        this.templateContent = builder.templateContent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCompliancePackRequest create() {
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
    public java.util.List<ConfigRules> getConfigRules() {
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

    /**
     * @return templateContent
     */
    public String getTemplateContent() {
        return this.templateContent;
    }

    public static final class Builder extends Request.Builder<CreateCompliancePackRequest, Builder> {
        private String clientToken; 
        private String compliancePackName; 
        private String compliancePackTemplateId; 
        private java.util.List<ConfigRules> configRules; 
        private Boolean defaultEnable; 
        private String description; 
        private String excludeRegionIdsScope; 
        private String excludeResourceGroupIdsScope; 
        private String excludeResourceIdsScope; 
        private java.util.List<ExcludeTagsScope> excludeTagsScope; 
        private String regionIdsScope; 
        private String resourceGroupIdsScope; 
        private String resourceIdsScope; 
        private Integer riskLevel; 
        private java.util.List<Tag> tag; 
        private String tagKeyScope; 
        private String tagValueScope; 
        private java.util.List<TagsScope> tagsScope; 
        private String templateContent; 

        private Builder() {
            super();
        } 

        private Builder(CreateCompliancePackRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.compliancePackName = request.compliancePackName;
            this.compliancePackTemplateId = request.compliancePackTemplateId;
            this.configRules = request.configRules;
            this.defaultEnable = request.defaultEnable;
            this.description = request.description;
            this.excludeRegionIdsScope = request.excludeRegionIdsScope;
            this.excludeResourceGroupIdsScope = request.excludeResourceGroupIdsScope;
            this.excludeResourceIdsScope = request.excludeResourceIdsScope;
            this.excludeTagsScope = request.excludeTagsScope;
            this.regionIdsScope = request.regionIdsScope;
            this.resourceGroupIdsScope = request.resourceGroupIdsScope;
            this.resourceIdsScope = request.resourceIdsScope;
            this.riskLevel = request.riskLevel;
            this.tag = request.tag;
            this.tagKeyScope = request.tagKeyScope;
            this.tagValueScope = request.tagValueScope;
            this.tagsScope = request.tagsScope;
            this.templateContent = request.templateContent;
        } 

        /**
         * <p>The client token that you want to use to ensure the idempotency of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.``</p>
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
         * <p>The name of the compliance package.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-pack-name</p>
         */
        public Builder compliancePackName(String compliancePackName) {
            this.putBodyParameter("CompliancePackName", compliancePackName);
            this.compliancePackName = compliancePackName;
            return this;
        }

        /**
         * <p>The ID of the compliance package template.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/261176.html">ListCompliancePackTemplates</a> operation to obtain the ID of the compliance package.</p>
         * 
         * <strong>example:</strong>
         * <p>ct-5f26ff4e06a300c4****</p>
         */
        public Builder compliancePackTemplateId(String compliancePackTemplateId) {
            this.putBodyParameter("CompliancePackTemplateId", compliancePackTemplateId);
            this.compliancePackTemplateId = compliancePackTemplateId;
            return this;
        }

        /**
         * <p>The rules in the compliance package. You must specify either this parameter or TemplateContent.</p>
         */
        public Builder configRules(java.util.List<ConfigRules> configRules) {
            String configRulesShrink = shrink(configRules, "ConfigRules", "json");
            this.putBodyParameter("ConfigRules", configRulesShrink);
            this.configRules = configRules;
            return this;
        }

        /**
         * <p>Specifies whether to enable the rule together with the compliance package. Valid values:</p>
         * <ul>
         * <li>true: The system enables the rule together with the compliance package.</li>
         * <li>false: The system does not enable the rule together with the compliance package.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder defaultEnable(Boolean defaultEnable) {
            this.putBodyParameter("DefaultEnable", defaultEnable);
            this.defaultEnable = defaultEnable;
            return this;
        }

        /**
         * <p>The description of the compliance package.</p>
         * 
         * <strong>example:</strong>
         * <p>Test pack description.</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>ExcludeRegionIdsScope</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder excludeRegionIdsScope(String excludeRegionIdsScope) {
            this.putBodyParameter("ExcludeRegionIdsScope", excludeRegionIdsScope);
            this.excludeRegionIdsScope = excludeRegionIdsScope;
            return this;
        }

        /**
         * <p>ExcludeResourceGroupIdsScope. Separate multiple resource group IDs with commas (,).</p>
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
         * <p>The ID of the resource that you do not want to evaluate by using the compliance package. Separate multiple resource IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>eip-8vbf3x310fn56ijfd****</p>
         */
        public Builder excludeResourceIdsScope(String excludeResourceIdsScope) {
            this.putBodyParameter("ExcludeResourceIdsScope", excludeResourceIdsScope);
            this.excludeResourceIdsScope = excludeResourceIdsScope;
            return this;
        }

        /**
         * <p>ExcludeTagsScope</p>
         */
        public Builder excludeTagsScope(java.util.List<ExcludeTagsScope> excludeTagsScope) {
            this.putBodyParameter("ExcludeTagsScope", excludeTagsScope);
            this.excludeTagsScope = excludeTagsScope;
            return this;
        }

        /**
         * <p>The ID of the region whose resources you want to evaluate by using the compliance package. Separate multiple region IDs with commas (,).</p>
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
         * <p>The ID of the resource group whose resources you want to evaluate by using the compliance package. Separate multiple resource group IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzdibsjjc****</p>
         */
        public Builder resourceGroupIdsScope(String resourceGroupIdsScope) {
            this.putBodyParameter("ResourceGroupIdsScope", resourceGroupIdsScope);
            this.resourceGroupIdsScope = resourceGroupIdsScope;
            return this;
        }

        /**
         * <p>ResourceIdsScope</p>
         * 
         * <strong>example:</strong>
         * <p>eip-8vbf3x310fn56ijfd****</p>
         */
        public Builder resourceIdsScope(String resourceIdsScope) {
            this.putBodyParameter("ResourceIdsScope", resourceIdsScope);
            this.resourceIdsScope = resourceIdsScope;
            return this;
        }

        /**
         * <p>The risk level of the resources that are not compliant with the rules in the compliance package. Default value: 2. Valid values:</p>
         * <ul>
         * <li>1: high.</li>
         * <li>2: medium.</li>
         * <li>3: low.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>The tag key of the resource that you want to evaluate by using the compliance package.</p>
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
         * <p>The tag value of the resource that you want to evaluate by using the compliance package.</p>
         * <blockquote>
         * <p> You must configure the TagValueScope parameter together with the TagKeyScope parameter.</p>
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
         * <p>TagsScope</p>
         */
        public Builder tagsScope(java.util.List<TagsScope> tagsScope) {
            this.putBodyParameter("TagsScope", tagsScope);
            this.tagsScope = tagsScope;
            return this;
        }

        /**
         * <p>The information about the template that is used to generate the compliance package. You can call an API operation to view the details of an existing compliance package or write a compliance package template. For more information, see <a href="https://help.aliyun.com/document_detail/2659733.html">Write a compliance package template in a configuration file</a>. You must specify one of ConfigRules and TemplateContent.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;configRuleTemplates&quot;: [ { &quot;configRuleName&quot;: &quot;condition-rule-example&quot;, &quot;scope&quot;: { &quot;complianceResourceTypes&quot;: [ &quot;ACS::ECS::Instance&quot; ] }, &quot;description&quot;: &quot;&quot;, &quot;source&quot;: { &quot;owner&quot;: &quot;CUSTOM_CONFIGURATION&quot;, &quot;identifier&quot;: &quot;acs-config-configuration&quot;, &quot;sourceDetails&quot;: [ { &quot;messageType&quot;: &quot;ScheduledNotification&quot;, &quot;maximumExecutionFrequency&quot;: &quot;Twelve_Hours&quot; }, { &quot;messageType&quot;: &quot;ConfigurationItemChangeNotification&quot; } ], &quot;conditions&quot;: &quot;{\&quot;ComplianceConditions\&quot;:\&quot;{\\&quot;operator\\&quot;:\\&quot;and\\&quot;,\\&quot;children\\&quot;:[{\\&quot;operator\\&quot;:\\&quot;GreaterOrEquals\\&quot;,\\&quot;featurePath\\&quot;:\\&quot;$.Cpu\\&quot;,\\&quot;featureSource\\&quot;:\\&quot;CONFIGURATION\\&quot;,\\&quot;desired\\&quot;:\\&quot;2\\&quot;}]}\&quot;}&quot; }, &quot;inputParameters&quot;: {} }, { &quot;configRuleName&quot;: &quot;oss-bucket-referer-limit&quot;, &quot;scope&quot;: { &quot;complianceResourceTypes&quot;: [ &quot;ACS::OSS::Bucket&quot; ] }, &quot;description&quot;: &quot;If the hotlink protection feature is enabled for the Object Storage Service (OSS) bucket and the Referer is added to a specific whitelist, the evaluation result is compliant.&quot;, &quot;source&quot;: { &quot;owner&quot;: &quot;ALIYUN&quot;, &quot;identifier&quot;: &quot;oss-bucket-referer-limit&quot;, &quot;sourceDetails&quot;: [ { &quot;messageType&quot;: &quot;ConfigurationItemChangeNotification&quot; } ] }, &quot;inputParameters&quot;: { &quot;allowEmptyReferer&quot;: &quot;true&quot;, &quot;allowReferers&quot;: &quot;<a href="http://www.aliyun.com">http://www.aliyun.com</a>&quot; } } ] }</p>
         */
        public Builder templateContent(String templateContent) {
            this.putBodyParameter("TemplateContent", templateContent);
            this.templateContent = templateContent;
            return this;
        }

        @Override
        public CreateCompliancePackRequest build() {
            return new CreateCompliancePackRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateCompliancePackRequest} extends {@link TeaModel}
     *
     * <p>CreateCompliancePackRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(ConfigRuleParameters model) {
                this.parameterName = model.parameterName;
                this.parameterValue = model.parameterValue;
            } 

            /**
             * <p>The name of the input parameter.</p>
             * <p>You must specify both <code>ParameterName</code> and <code>ParameterValue</code> or neither of them. If the managed rule has an input parameter but no default value is specified, you must specify this parameter. You can call the <a href="https://help.aliyun.com/document_detail/261176.html">ListCompliancePackTemplates</a> operation to obtain the names of input parameters of the managed rule.</p>
             * 
             * <strong>example:</strong>
             * <p>bandwidth</p>
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            /**
             * <p>The value of the input parameter.</p>
             * <p>You must specify both <code>ParameterName</code> and <code>ParameterValue</code> or neither of them. If the managed rule has an input parameter but no default value is specified, you must specify this parameter. You can call the <a href="https://help.aliyun.com/document_detail/261176.html">ListCompliancePackTemplates</a> operation to obtain the values of input parameters of the managed rule.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
    /**
     * 
     * {@link CreateCompliancePackRequest} extends {@link TeaModel}
     *
     * <p>CreateCompliancePackRequest</p>
     */
    public static class ConfigRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigRuleId")
        private String configRuleId;

        @com.aliyun.core.annotation.NameInMap("ConfigRuleName")
        private String configRuleName;

        @com.aliyun.core.annotation.NameInMap("ConfigRuleParameters")
        private java.util.List<ConfigRuleParameters> configRuleParameters;

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
        public java.util.List<ConfigRuleParameters> getConfigRuleParameters() {
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
            private java.util.List<ConfigRuleParameters> configRuleParameters; 
            private String description; 
            private String managedRuleIdentifier; 
            private Integer riskLevel; 

            private Builder() {
            } 

            private Builder(ConfigRules model) {
                this.configRuleId = model.configRuleId;
                this.configRuleName = model.configRuleName;
                this.configRuleParameters = model.configRuleParameters;
                this.description = model.description;
                this.managedRuleIdentifier = model.managedRuleIdentifier;
                this.riskLevel = model.riskLevel;
            } 

            /**
             * <p>The rule ID. If you specify this parameter, Cloud Config adds the rule that has the specified ID to the compliance package.</p>
             * <p>You need to only specify <code>ManagedRuleIdentifier</code> or <code>ConfigRuleId</code>. If you specify both parameters, Cloud Config adds a rule based on the value of <code>ConfigRuleId</code>. You can call the <a href="https://help.aliyun.com/document_detail/169607.html">ListConfigRules</a> operation to obtain the rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cr-e918626622af000f****</p>
             */
            public Builder configRuleId(String configRuleId) {
                this.configRuleId = configRuleId;
                return this;
            }

            /**
             * <p>The name of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>eip-bandwidth-limit</p>
             */
            public Builder configRuleName(String configRuleName) {
                this.configRuleName = configRuleName;
                return this;
            }

            /**
             * <p>The input parameters of the rule.</p>
             */
            public Builder configRuleParameters(java.util.List<ConfigRuleParameters> configRuleParameters) {
                this.configRuleParameters = configRuleParameters;
                return this;
            }

            /**
             * <p>The description of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>The description of the test rule.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The identifier of the managed rule. Cloud Config automatically creates a managed rule based on the specified identifier and adds the rule to the compliance package.</p>
             * <p>You need to only specify <code>ManagedRuleIdentifier</code> or <code>ConfigRuleId</code>. If you specify both parameters, Cloud Config adds a rule based on the value of <code>ConfigRuleId</code>. You can call the <a href="https://help.aliyun.com/document_detail/261176.html">ListCompliancePackTemplates</a> operation to obtain the identifier of the managed rule.</p>
             * 
             * <strong>example:</strong>
             * <p>eip-bandwidth-limit</p>
             */
            public Builder managedRuleIdentifier(String managedRuleIdentifier) {
                this.managedRuleIdentifier = managedRuleIdentifier;
                return this;
            }

            /**
             * <p>The risk level of the resources that do not comply with the rule. Valid values:</p>
             * <ul>
             * <li>1: high.</li>
             * <li>2: medium.</li>
             * <li>3: low.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link CreateCompliancePackRequest} extends {@link TeaModel}
     *
     * <p>CreateCompliancePackRequest</p>
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
             * <p>TagKey</p>
             * 
             * <strong>example:</strong>
             * <p>key-2</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>TagValue</p>
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
     * {@link CreateCompliancePackRequest} extends {@link TeaModel}
     *
     * <p>CreateCompliancePackRequest</p>
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
             * <p>The tag keys.</p>
             * <p>The tag keys cannot be an empty string. The tag keys can be up to 64 characters in length. The tag keys cannot start with <code>aliyun</code> or <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * <p>You can specify at most 20 tag keys in each call.</p>
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
     * {@link CreateCompliancePackRequest} extends {@link TeaModel}
     *
     * <p>CreateCompliancePackRequest</p>
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
             * <p>Tagkey</p>
             * 
             * <strong>example:</strong>
             * <p>key-1</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>TagValue</p>
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
