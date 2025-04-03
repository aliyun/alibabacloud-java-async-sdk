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
 * {@link GetCompliancePackResponseBody} extends {@link TeaModel}
 *
 * <p>GetCompliancePackResponseBody</p>
 */
public class GetCompliancePackResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CompliancePack")
    private CompliancePack compliancePack;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetCompliancePackResponseBody model) {
            this.compliancePack = model.compliancePack;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the compliance package.</p>
         */
        public Builder compliancePack(CompliancePack compliancePack) {
            this.compliancePack = compliancePack;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6EC7AED1-172F-42AE-9C12-295BC2ADB751</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCompliancePackResponseBody build() {
            return new GetCompliancePackResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCompliancePackResponseBody} extends {@link TeaModel}
     *
     * <p>GetCompliancePackResponseBody</p>
     */
    public static class ConfigRuleParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ParameterName")
        private String parameterName;

        @com.aliyun.core.annotation.NameInMap("ParameterValue")
        private String parameterValue;

        @com.aliyun.core.annotation.NameInMap("Required")
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

            private Builder() {
            } 

            private Builder(ConfigRuleParameters model) {
                this.parameterName = model.parameterName;
                this.parameterValue = model.parameterValue;
                this.required = model.required;
            } 

            /**
             * <p>The name of the input parameter.</p>
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
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder parameterValue(String parameterValue) {
                this.parameterValue = parameterValue;
                return this;
            }

            /**
             * <p>Indicates whether the input parameters are required. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
    /**
     * 
     * {@link GetCompliancePackResponseBody} extends {@link TeaModel}
     *
     * <p>GetCompliancePackResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("ResourceTypesScope")
        private String resourceTypesScope;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
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
            private java.util.List<ConfigRuleParameters> configRuleParameters; 
            private String description; 
            private String managedRuleIdentifier; 
            private String resourceTypesScope; 
            private Integer riskLevel; 

            private Builder() {
            } 

            private Builder(ConfigRules model) {
                this.configRuleId = model.configRuleId;
                this.configRuleName = model.configRuleName;
                this.configRuleParameters = model.configRuleParameters;
                this.description = model.description;
                this.managedRuleIdentifier = model.managedRuleIdentifier;
                this.resourceTypesScope = model.resourceTypesScope;
                this.riskLevel = model.riskLevel;
            } 

            /**
             * <p>The rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cr-a260626622af0005****</p>
             */
            public Builder configRuleId(String configRuleId) {
                this.configRuleId = configRuleId;
                return this;
            }

            /**
             * <p>The rule name.</p>
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
             * <p>The rule description.</p>
             * 
             * <strong>example:</strong>
             * <p>example-description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The identifier of the managed rule.</p>
             * 
             * <strong>example:</strong>
             * <p>eip-bandwidth-limit</p>
             */
            public Builder managedRuleIdentifier(String managedRuleIdentifier) {
                this.managedRuleIdentifier = managedRuleIdentifier;
                return this;
            }

            /**
             * <p>The type of the resource evaluated based on the rule. Separate multiple resource types with commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>ACS::EIP::EipAddress</p>
             */
            public Builder resourceTypesScope(String resourceTypesScope) {
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
     * {@link GetCompliancePackResponseBody} extends {@link TeaModel}
     *
     * <p>GetCompliancePackResponseBody</p>
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
             * <p>The key of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>key-2</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
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
     * {@link GetCompliancePackResponseBody} extends {@link TeaModel}
     *
     * <p>GetCompliancePackResponseBody</p>
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
             * <p>The key of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>key-1</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
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
    /**
     * 
     * {@link GetCompliancePackResponseBody} extends {@link TeaModel}
     *
     * <p>GetCompliancePackResponseBody</p>
     */
    public static class Scope extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExcludeRegionIdsScope")
        private String excludeRegionIdsScope;

        @com.aliyun.core.annotation.NameInMap("ExcludeResourceGroupIdsScope")
        private String excludeResourceGroupIdsScope;

        @com.aliyun.core.annotation.NameInMap("ExcludeResourceIdsScope")
        private String excludeResourceIdsScope;

        @com.aliyun.core.annotation.NameInMap("ExcludeTagsScope")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<ExcludeTagsScope> excludeTagsScope;

        @com.aliyun.core.annotation.NameInMap("RegionIdsScope")
        private String regionIdsScope;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupIdsScope")
        private String resourceGroupIdsScope;

        @com.aliyun.core.annotation.NameInMap("ResourceIdsScope")
        private String resourceIdsScope;

        @com.aliyun.core.annotation.NameInMap("TagKeyScope")
        private String tagKeyScope;

        @com.aliyun.core.annotation.NameInMap("TagValueScope")
        private String tagValueScope;

        @com.aliyun.core.annotation.NameInMap("TagsScope")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<TagsScope> tagsScope;

        private Scope(Builder builder) {
            this.excludeRegionIdsScope = builder.excludeRegionIdsScope;
            this.excludeResourceGroupIdsScope = builder.excludeResourceGroupIdsScope;
            this.excludeResourceIdsScope = builder.excludeResourceIdsScope;
            this.excludeTagsScope = builder.excludeTagsScope;
            this.regionIdsScope = builder.regionIdsScope;
            this.resourceGroupIdsScope = builder.resourceGroupIdsScope;
            this.resourceIdsScope = builder.resourceIdsScope;
            this.tagKeyScope = builder.tagKeyScope;
            this.tagValueScope = builder.tagValueScope;
            this.tagsScope = builder.tagsScope;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Scope create() {
            return builder().build();
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

        public static final class Builder {
            private String excludeRegionIdsScope; 
            private String excludeResourceGroupIdsScope; 
            private String excludeResourceIdsScope; 
            private java.util.List<ExcludeTagsScope> excludeTagsScope; 
            private String regionIdsScope; 
            private String resourceGroupIdsScope; 
            private String resourceIdsScope; 
            private String tagKeyScope; 
            private String tagValueScope; 
            private java.util.List<TagsScope> tagsScope; 

            private Builder() {
            } 

            private Builder(Scope model) {
                this.excludeRegionIdsScope = model.excludeRegionIdsScope;
                this.excludeResourceGroupIdsScope = model.excludeResourceGroupIdsScope;
                this.excludeResourceIdsScope = model.excludeResourceIdsScope;
                this.excludeTagsScope = model.excludeTagsScope;
                this.regionIdsScope = model.regionIdsScope;
                this.resourceGroupIdsScope = model.resourceGroupIdsScope;
                this.resourceIdsScope = model.resourceIdsScope;
                this.tagKeyScope = model.tagKeyScope;
                this.tagValueScope = model.tagValueScope;
                this.tagsScope = model.tagsScope;
            } 

            /**
             * <p>The IDs of regions that are excluded. Separate multiple region IDs with commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder excludeRegionIdsScope(String excludeRegionIdsScope) {
                this.excludeRegionIdsScope = excludeRegionIdsScope;
                return this;
            }

            /**
             * <p>The IDs of the resource groups whose resources you do not want to evaluate by using the compliance package. Separate multiple resource group IDs with commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aekzc7r7rhx****</p>
             */
            public Builder excludeResourceGroupIdsScope(String excludeResourceGroupIdsScope) {
                this.excludeResourceGroupIdsScope = excludeResourceGroupIdsScope;
                return this;
            }

            /**
             * <p>The ID of the resource that you do not want to evaluate by using the compliance package.</p>
             * 
             * <strong>example:</strong>
             * <p>eip-8vbf3x310fn56ijfd****</p>
             */
            public Builder excludeResourceIdsScope(String excludeResourceIdsScope) {
                this.excludeResourceIdsScope = excludeResourceIdsScope;
                return this;
            }

            /**
             * <p>The scope of the tag that is excluded.</p>
             * <p>This parameter is required.</p>
             */
            public Builder excludeTagsScope(java.util.List<ExcludeTagsScope> excludeTagsScope) {
                this.excludeTagsScope = excludeTagsScope;
                return this;
            }

            /**
             * <p>The ID of the region whose resources you want to evaluate by using the compliance package.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionIdsScope(String regionIdsScope) {
                this.regionIdsScope = regionIdsScope;
                return this;
            }

            /**
             * <p>The ID of the resource group whose resources you want to evaluate by using the compliance package.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aekzc7r7rhx****</p>
             */
            public Builder resourceGroupIdsScope(String resourceGroupIdsScope) {
                this.resourceGroupIdsScope = resourceGroupIdsScope;
                return this;
            }

            /**
             * <p>The IDs of the resources to which the rule applies. Separate multiple resource IDs with commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>eip-8vbf3x310fn56ijfd****</p>
             */
            public Builder resourceIdsScope(String resourceIdsScope) {
                this.resourceIdsScope = resourceIdsScope;
                return this;
            }

            /**
             * <p>The tag key of the resource that you want to evaluate by using the compliance package.</p>
             * 
             * <strong>example:</strong>
             * <p>ECS</p>
             */
            public Builder tagKeyScope(String tagKeyScope) {
                this.tagKeyScope = tagKeyScope;
                return this;
            }

            /**
             * <p>The tag value of the resource that you want to evaluate by using the compliance package.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder tagValueScope(String tagValueScope) {
                this.tagValueScope = tagValueScope;
                return this;
            }

            /**
             * <p>The tag scope.</p>
             * <p>This parameter is required.</p>
             */
            public Builder tagsScope(java.util.List<TagsScope> tagsScope) {
                this.tagsScope = tagsScope;
                return this;
            }

            public Scope build() {
                return new Scope(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCompliancePackResponseBody} extends {@link TeaModel}
     *
     * <p>GetCompliancePackResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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

            private Builder(Tags model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * <p>The tag keys of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>key-1</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag values of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>value-1</p>
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCompliancePackResponseBody} extends {@link TeaModel}
     *
     * <p>GetCompliancePackResponseBody</p>
     */
    public static class CompliancePack extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private Long accountId;

        @com.aliyun.core.annotation.NameInMap("CompliancePackId")
        private String compliancePackId;

        @com.aliyun.core.annotation.NameInMap("CompliancePackName")
        private String compliancePackName;

        @com.aliyun.core.annotation.NameInMap("CompliancePackTemplateId")
        private String compliancePackTemplateId;

        @com.aliyun.core.annotation.NameInMap("ConfigRules")
        private java.util.List<ConfigRules> configRules;

        @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private Integer riskLevel;

        @com.aliyun.core.annotation.NameInMap("Scope")
        private Scope scope;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("TemplateContent")
        private String templateContent;

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
            this.tags = builder.tags;
            this.templateContent = builder.templateContent;
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
        public java.util.List<ConfigRules> getConfigRules() {
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

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        /**
         * @return templateContent
         */
        public String getTemplateContent() {
            return this.templateContent;
        }

        public static final class Builder {
            private Long accountId; 
            private String compliancePackId; 
            private String compliancePackName; 
            private String compliancePackTemplateId; 
            private java.util.List<ConfigRules> configRules; 
            private Long createTimestamp; 
            private String description; 
            private Integer riskLevel; 
            private Scope scope; 
            private String status; 
            private java.util.List<Tags> tags; 
            private String templateContent; 

            private Builder() {
            } 

            private Builder(CompliancePack model) {
                this.accountId = model.accountId;
                this.compliancePackId = model.compliancePackId;
                this.compliancePackName = model.compliancePackName;
                this.compliancePackTemplateId = model.compliancePackTemplateId;
                this.configRules = model.configRules;
                this.createTimestamp = model.createTimestamp;
                this.description = model.description;
                this.riskLevel = model.riskLevel;
                this.scope = model.scope;
                this.status = model.status;
                this.tags = model.tags;
                this.templateContent = model.templateContent;
            } 

            /**
             * <p>The ID of the Alibaba Cloud account to which the compliance package belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>100931896542****</p>
             */
            public Builder accountId(Long accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The ID of the compliance package.</p>
             * 
             * <strong>example:</strong>
             * <p>cp-a8a8626622af0082****</p>
             */
            public Builder compliancePackId(String compliancePackId) {
                this.compliancePackId = compliancePackId;
                return this;
            }

            /**
             * <p>The name of the compliance package.</p>
             * 
             * <strong>example:</strong>
             * <p>example-pack-name</p>
             */
            public Builder compliancePackName(String compliancePackName) {
                this.compliancePackName = compliancePackName;
                return this;
            }

            /**
             * <p>The ID of the compliance package template.</p>
             * 
             * <strong>example:</strong>
             * <p>ct-5f26ff4e06a300c4****</p>
             */
            public Builder compliancePackTemplateId(String compliancePackTemplateId) {
                this.compliancePackTemplateId = compliancePackTemplateId;
                return this;
            }

            /**
             * <p>The rules in the compliance package.</p>
             */
            public Builder configRules(java.util.List<ConfigRules> configRules) {
                this.configRules = configRules;
                return this;
            }

            /**
             * <p>The timestamp when the compliance package was created. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1624245766000</p>
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * <p>The description of the compliance package.</p>
             * 
             * <strong>example:</strong>
             * <p>example-name</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The risk level of the resources that are not compliant with the rules in the compliance package. Valid values:</p>
             * <ul>
             * <li>1: high</li>
             * <li>2: medium</li>
             * <li>3: low</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder riskLevel(Integer riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>The resource group for which the compliance package took effect.</p>
             */
            public Builder scope(Scope scope) {
                this.scope = scope;
                return this;
            }

            /**
             * <p>The status of the compliance package. Valid values:</p>
             * <ul>
             * <li>ACTIVE: The compliance package is normal.</li>
             * <li>CREATING: The compliance package is being created.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ACTIVE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The list of tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The information about the current compliance package template. The rules in the template do not contain custom function rules. You can quickly create the same compliance package for other accounts or account groups based on the template information.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;configRuleTemplates&quot;: [
             *         {
             *             &quot;configRuleName&quot;: &quot;rule-example&quot;,
             *             &quot;scope&quot;: {
             *                 &quot;complianceResourceTypes&quot;: [
             *                     &quot;ACS::ECS::Instance&quot;
             *                 ]
             *             },
             *             &quot;description&quot;: &quot;&quot;,
             *             &quot;source&quot;: {
             *                 &quot;owner&quot;: &quot;CUSTOM_CONFIGURATION&quot;,
             *                 &quot;identifier&quot;: &quot;acs-config-configuration&quot;,
             *                 &quot;sourceDetails&quot;: [
             *                     {
             *                         &quot;messageType&quot;: &quot;ScheduledNotification&quot;,
             *                         &quot;maximumExecutionFrequency&quot;: &quot;Twelve_Hours&quot;
             *                     },
             *                     {
             *                         &quot;messageType&quot;: &quot;ConfigurationItemChangeNotification&quot;
             *                     }
             *                 ],
             *                 &quot;conditions&quot;: &quot;{&quot;ComplianceConditions&quot;:&quot;{\&quot;operator\&quot;:\&quot;and\&quot;,\&quot;children\&quot;:[{\&quot;operator\&quot;:\&quot;GreaterOrEquals\&quot;,\&quot;featurePath\&quot;:\&quot;$.Cpu\&quot;,\&quot;featureSource\&quot;:\&quot;CONFIGURATION\&quot;,\&quot;desired\&quot;:\&quot;2\&quot;}]}&quot;}&quot;
             *             },
             *             &quot;inputParameters&quot;: {}
             *         },
             *         {
             *             &quot;configRuleName&quot;: &quot;name&quot;,
             *             &quot;scope&quot;: {
             *                 &quot;complianceResourceTypes&quot;: [
             *                     &quot;ACS::OSS::Bucket&quot;
             *                 ]
             *             },
             *             &quot;description&quot;: &quot;description-1&quot;,
             *             &quot;source&quot;: {
             *                 &quot;owner&quot;: &quot;ALIYUN&quot;,
             *                 &quot;identifier&quot;: &quot;oss-bucket-referer-limit&quot;,
             *                 &quot;sourceDetails&quot;: [
             *                     {
             *                         &quot;messageType&quot;: &quot;ConfigurationItemChangeNotification&quot;
             *                     }
             *                 ]
             *             },
             *             &quot;inputParameters&quot;: {
             *                 &quot;allowEmptyReferer&quot;: &quot;true&quot;,
             *                 &quot;allowReferers&quot;: &quot;<a href="http://www.aliyun.com">http://www.aliyun.com</a>&quot;
             *             }
             *         }
             *     ]
             * }</p>
             */
            public Builder templateContent(String templateContent) {
                this.templateContent = templateContent;
                return this;
            }

            public CompliancePack build() {
                return new CompliancePack(this);
            } 

        } 

    }
}
