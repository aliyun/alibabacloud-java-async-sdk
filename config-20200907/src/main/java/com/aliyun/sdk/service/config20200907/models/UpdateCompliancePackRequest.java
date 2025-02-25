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
 * {@link UpdateCompliancePackRequest} extends {@link RequestModel}
 *
 * <p>UpdateCompliancePackRequest</p>
 */
public class UpdateCompliancePackRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CompliancePackId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String compliancePackId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CompliancePackName")
    private String compliancePackName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConfigRules")
    private java.util.List<ConfigRules> configRules;

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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TagKeyScope")
    private String tagKeyScope;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TagValueScope")
    private String tagValueScope;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TagsScope")
    private java.util.List<TagsScope> tagsScope;

    private UpdateCompliancePackRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.compliancePackId = builder.compliancePackId;
        this.compliancePackName = builder.compliancePackName;
        this.configRules = builder.configRules;
        this.description = builder.description;
        this.excludeRegionIdsScope = builder.excludeRegionIdsScope;
        this.excludeResourceGroupIdsScope = builder.excludeResourceGroupIdsScope;
        this.excludeResourceIdsScope = builder.excludeResourceIdsScope;
        this.excludeTagsScope = builder.excludeTagsScope;
        this.regionIdsScope = builder.regionIdsScope;
        this.resourceGroupIdsScope = builder.resourceGroupIdsScope;
        this.resourceIdsScope = builder.resourceIdsScope;
        this.riskLevel = builder.riskLevel;
        this.tagKeyScope = builder.tagKeyScope;
        this.tagValueScope = builder.tagValueScope;
        this.tagsScope = builder.tagsScope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCompliancePackRequest create() {
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
     * @return configRules
     */
    public java.util.List<ConfigRules> getConfigRules() {
        return this.configRules;
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

    public static final class Builder extends Request.Builder<UpdateCompliancePackRequest, Builder> {
        private String clientToken; 
        private String compliancePackId; 
        private String compliancePackName; 
        private java.util.List<ConfigRules> configRules; 
        private String description; 
        private String excludeRegionIdsScope; 
        private String excludeResourceGroupIdsScope; 
        private String excludeResourceIdsScope; 
        private java.util.List<ExcludeTagsScope> excludeTagsScope; 
        private String regionIdsScope; 
        private String resourceGroupIdsScope; 
        private String resourceIdsScope; 
        private Integer riskLevel; 
        private String tagKeyScope; 
        private String tagValueScope; 
        private java.util.List<TagsScope> tagsScope; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCompliancePackRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.compliancePackId = request.compliancePackId;
            this.compliancePackName = request.compliancePackName;
            this.configRules = request.configRules;
            this.description = request.description;
            this.excludeRegionIdsScope = request.excludeRegionIdsScope;
            this.excludeResourceGroupIdsScope = request.excludeResourceGroupIdsScope;
            this.excludeResourceIdsScope = request.excludeResourceIdsScope;
            this.excludeTagsScope = request.excludeTagsScope;
            this.regionIdsScope = request.regionIdsScope;
            this.resourceGroupIdsScope = request.resourceGroupIdsScope;
            this.resourceIdsScope = request.resourceIdsScope;
            this.riskLevel = request.riskLevel;
            this.tagKeyScope = request.tagKeyScope;
            this.tagValueScope = request.tagValueScope;
            this.tagsScope = request.tagsScope;
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
         * <p>The ID of the compliance package.</p>
         * <p>For more information about how to obtain the ID of a compliance package, see <a href="https://help.aliyun.com/document_detail/263332.html">ListCompliancePacks</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cp-a8a8626622af0082****</p>
         */
        public Builder compliancePackId(String compliancePackId) {
            this.putBodyParameter("CompliancePackId", compliancePackId);
            this.compliancePackId = compliancePackId;
            return this;
        }

        /**
         * <p>The name of the compliance package.</p>
         * <p>For more information about how to obtain the name of a compliance package, see <a href="https://help.aliyun.com/document_detail/263332.html">ListCompliancePacks</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>The name of the compliance package.</p>
         */
        public Builder compliancePackName(String compliancePackName) {
            this.putBodyParameter("CompliancePackName", compliancePackName);
            this.compliancePackName = compliancePackName;
            return this;
        }

        /**
         * <p>The rules in the compliance package.</p>
         * <p>If you leave this parameter empty, the rules in the compliance package remain unchanged. If you configure this parameter, Cloud Config replaces the existing rules in the compliance package with the specified rules.</p>
         */
        public Builder configRules(java.util.List<ConfigRules> configRules) {
            String configRulesShrink = shrink(configRules, "ConfigRules", "json");
            this.putBodyParameter("ConfigRules", configRulesShrink);
            this.configRules = configRules;
            return this;
        }

        /**
         * <p>The description of the compliance package.</p>
         * 
         * <strong>example:</strong>
         * <p>The description of the compliance package.</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
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
         * <p>23642660635687****</p>
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
         * <p>The risk level of the resources that are not compliant with the rules in the compliance package. Valid values:</p>
         * <ul>
         * <li>1: high risk level</li>
         * <li>2: medium risk level</li>
         * <li>3: low risk level</li>
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
         * <p> You must configure the TagValueScope parameter together with the TagValueScope parameter.</p>
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

        @Override
        public UpdateCompliancePackRequest build() {
            return new UpdateCompliancePackRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateCompliancePackRequest} extends {@link TeaModel}
     *
     * <p>UpdateCompliancePackRequest</p>
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

            /**
             * <p>The name of the managed rule parameter.</p>
             * <p>You must specify both <code>ParameterName</code> and <code>ParameterValue</code> or neither of them. If the managed rule has an input parameter but no default value exists, you must configure this parameter. For more information about how to obtain the name of an input parameter for a managed rule, see <a href="https://help.aliyun.com/document_detail/261176.html">ListCompliancePackTemplates</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>bandwidth</p>
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            /**
             * <p>The value of the managed rule parameter.</p>
             * <p>You must configure the <code>ParameterName</code> and <code>ParameterValue</code> parameters or neither of them. If the managed rule has an input parameter but no default value exists, you must configure this parameter. For more information about how to obtain the value of an input parameter for a managed rule, see <a href="https://help.aliyun.com/document_detail/261176.html">ListCompliancePackTemplates</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
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
     * {@link UpdateCompliancePackRequest} extends {@link TeaModel}
     *
     * <p>UpdateCompliancePackRequest</p>
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

            /**
             * <p>The rule ID. If you configure this parameter, Cloud Config adds the rule that has the specified ID to the compliance package.</p>
             * <p>You need to only specify one of the <code>ManagedRuleIdentifier</code> and <code>ConfigRuleId</code> properties. If you specify both the properties, the value of the <code>ConfigRuleId</code> property takes precedence. You can call the <a href="https://help.aliyun.com/document_detail/169607.html">ListConfigRules</a> operation to obtain the rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cr-e918626622af000f****</p>
             */
            public Builder configRuleId(String configRuleId) {
                this.configRuleId = configRuleId;
                return this;
            }

            /**
             * <p>The rule name.</p>
             * 
             * <strong>example:</strong>
             * <p>The rule name.</p>
             */
            public Builder configRuleName(String configRuleName) {
                this.configRuleName = configRuleName;
                return this;
            }

            /**
             * <p>The details of the input parameter of the rule.</p>
             */
            public Builder configRuleParameters(java.util.List<ConfigRuleParameters> configRuleParameters) {
                this.configRuleParameters = configRuleParameters;
                return this;
            }

            /**
             * <p>The rule description.</p>
             * 
             * <strong>example:</strong>
             * <p>The rule description.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The identifier of the managed rule. Cloud Config automatically creates a rule based on the identifier of the managed rule and adds the rule to the current compliance package.</p>
             * <p>You need to only configure the <code>ManagedRuleIdentifier</code> or <code>ConfigRuleId</code> parameter. If you configure both parameters, the value of the <code>ConfigRuleId</code> parameter takes precedence. For more information about how to obtain the identifier of a managed rule, see <a href="https://help.aliyun.com/document_detail/261176.html">ListCompliancePackTemplates</a>.</p>
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
             * <li>1: high risk level</li>
             * <li>2: medium risk level</li>
             * <li>3: low risk level</li>
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
     * {@link UpdateCompliancePackRequest} extends {@link TeaModel}
     *
     * <p>UpdateCompliancePackRequest</p>
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
     * {@link UpdateCompliancePackRequest} extends {@link TeaModel}
     *
     * <p>UpdateCompliancePackRequest</p>
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
