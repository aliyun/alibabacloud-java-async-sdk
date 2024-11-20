// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateTemplateScratchRequest} extends {@link RequestModel}
 *
 * <p>CreateTemplateScratchRequest</p>
 */
public class CreateTemplateScratchRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExecutionMode")
    private String executionMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogicalIdStrategy")
    private String logicalIdStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreferenceParameters")
    private java.util.List < PreferenceParameters> preferenceParameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceResourceGroup")
    private SourceResourceGroup sourceResourceGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceResources")
    private java.util.List < SourceResources> sourceResources;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceTag")
    private SourceTag sourceTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List < Tags> tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateScratchType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateScratchType;

    private CreateTemplateScratchRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.executionMode = builder.executionMode;
        this.logicalIdStrategy = builder.logicalIdStrategy;
        this.preferenceParameters = builder.preferenceParameters;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.sourceResourceGroup = builder.sourceResourceGroup;
        this.sourceResources = builder.sourceResources;
        this.sourceTag = builder.sourceTag;
        this.tags = builder.tags;
        this.templateScratchType = builder.templateScratchType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTemplateScratchRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return executionMode
     */
    public String getExecutionMode() {
        return this.executionMode;
    }

    /**
     * @return logicalIdStrategy
     */
    public String getLogicalIdStrategy() {
        return this.logicalIdStrategy;
    }

    /**
     * @return preferenceParameters
     */
    public java.util.List < PreferenceParameters> getPreferenceParameters() {
        return this.preferenceParameters;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return sourceResourceGroup
     */
    public SourceResourceGroup getSourceResourceGroup() {
        return this.sourceResourceGroup;
    }

    /**
     * @return sourceResources
     */
    public java.util.List < SourceResources> getSourceResources() {
        return this.sourceResources;
    }

    /**
     * @return sourceTag
     */
    public SourceTag getSourceTag() {
        return this.sourceTag;
    }

    /**
     * @return tags
     */
    public java.util.List < Tags> getTags() {
        return this.tags;
    }

    /**
     * @return templateScratchType
     */
    public String getTemplateScratchType() {
        return this.templateScratchType;
    }

    public static final class Builder extends Request.Builder<CreateTemplateScratchRequest, Builder> {
        private String clientToken; 
        private String description; 
        private String executionMode; 
        private String logicalIdStrategy; 
        private java.util.List < PreferenceParameters> preferenceParameters; 
        private String regionId; 
        private String resourceGroupId; 
        private SourceResourceGroup sourceResourceGroup; 
        private java.util.List < SourceResources> sourceResources; 
        private SourceTag sourceTag; 
        private java.util.List < Tags> tags; 
        private String templateScratchType; 

        private Builder() {
            super();
        } 

        private Builder(CreateTemplateScratchRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.executionMode = request.executionMode;
            this.logicalIdStrategy = request.logicalIdStrategy;
            this.preferenceParameters = request.preferenceParameters;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.sourceResourceGroup = request.sourceResourceGroup;
            this.sourceResources = request.sourceResources;
            this.sourceTag = request.sourceTag;
            this.tags = request.tags;
            this.templateScratchType = request.templateScratchType;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/134212.html">How to ensure idempotence</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-42665544****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The description of the resource scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>Replicate a VPC.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The execution mode. Valid values:</p>
         * <ul>
         * <li>Async (default)</li>
         * <li>Sync</li>
         * </ul>
         * <blockquote>
         * <p>If you have a wide scope of resources, Sync takes longer. If you set ExecutionMode to Sync, we recommend that you specify ClientToken to prevent the execution timeout.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Sync</p>
         */
        public Builder executionMode(String executionMode) {
            this.putQueryParameter("ExecutionMode", executionMode);
            this.executionMode = executionMode;
            return this;
        }

        /**
         * <p>The policy based on which the logical ID is generated. Valid values:</p>
         * <ul>
         * <li>LongTypePrefixAndIndexSuffix (default): long-type prefix + index-type suffix</li>
         * <li>LongTypePrefixAndHashSuffix: long-type prefix + hash-type suffix</li>
         * <li>ShortTypePrefixAndHashSuffix: short-type prefix + hash-type suffix</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>LongTypePrefixAndIndexSuffix</p>
         */
        public Builder logicalIdStrategy(String logicalIdStrategy) {
            this.putQueryParameter("LogicalIdStrategy", logicalIdStrategy);
            this.logicalIdStrategy = logicalIdStrategy;
            return this;
        }

        /**
         * <p>The preference parameters of the resource scenario.</p>
         */
        public Builder preferenceParameters(java.util.List < PreferenceParameters> preferenceParameters) {
            String preferenceParametersShrink = shrink(preferenceParameters, "PreferenceParameters", "json");
            this.putQueryParameter("PreferenceParameters", preferenceParametersShrink);
            this.preferenceParameters = preferenceParameters;
            return this;
        }

        /**
         * <p>The region ID of the resource scenario.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxazb4ph6aiy****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The source resource group.</p>
         */
        public Builder sourceResourceGroup(SourceResourceGroup sourceResourceGroup) {
            String sourceResourceGroupShrink = shrink(sourceResourceGroup, "SourceResourceGroup", "json");
            this.putQueryParameter("SourceResourceGroup", sourceResourceGroupShrink);
            this.sourceResourceGroup = sourceResourceGroup;
            return this;
        }

        /**
         * <p>The source resources.</p>
         * <p>When you set TemplateScratchType to ArchitectureDetection, you can specify SourceResources to detect the architecture data of all resources associated with the specified source resources. For example, if you set SourceResources to the ID of a Classic Load Balancer (CLB) instance, the architecture data of all resources, such as the Elastic Compute Service (ECS) instance, vSwitch, and VPC, associated with the CLB instance is detected.</p>
         * <p>If you set TemplateScratchType to ArchitectureDetection, you can specify up to 20 source resources. In other cases, you can specify up to 200 source resources.</p>
         */
        public Builder sourceResources(java.util.List < SourceResources> sourceResources) {
            String sourceResourcesShrink = shrink(sourceResources, "SourceResources", "json");
            this.putQueryParameter("SourceResources", sourceResourcesShrink);
            this.sourceResources = sourceResources;
            return this;
        }

        /**
         * <p>The source tag.</p>
         */
        public Builder sourceTag(SourceTag sourceTag) {
            String sourceTagShrink = shrink(sourceTag, "SourceTag", "json");
            this.putQueryParameter("SourceTag", sourceTagShrink);
            this.sourceTag = sourceTag;
            return this;
        }

        /**
         * <p>The tags of the resource scenario.</p>
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The type of the resource scenario. Valid values:</p>
         * <ul>
         * <li>ArchitectureReplication: resource replication</li>
         * <li>ArchitectureDetection: resource detection</li>
         * <li>ResourceImport: resource management</li>
         * <li>ResourceMigration: resource migration</li>
         * </ul>
         * <blockquote>
         * <p> The valid values of the ParameterKey and ParameterValue request parameters vary based on the value of TemplateScratchType. For more information, see the &quot;<strong>Additional information about request parameters</strong>&quot; section of this topic.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ArchitectureReplication</p>
         */
        public Builder templateScratchType(String templateScratchType) {
            this.putQueryParameter("TemplateScratchType", templateScratchType);
            this.templateScratchType = templateScratchType;
            return this;
        }

        @Override
        public CreateTemplateScratchRequest build() {
            return new CreateTemplateScratchRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateTemplateScratchRequest} extends {@link TeaModel}
     *
     * <p>CreateTemplateScratchRequest</p>
     */
    public static class PreferenceParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ParameterKey")
        @com.aliyun.core.annotation.Validation(required = true)
        private String parameterKey;

        @com.aliyun.core.annotation.NameInMap("ParameterValue")
        @com.aliyun.core.annotation.Validation(required = true)
        private String parameterValue;

        private PreferenceParameters(Builder builder) {
            this.parameterKey = builder.parameterKey;
            this.parameterValue = builder.parameterValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PreferenceParameters create() {
            return builder().build();
        }

        /**
         * @return parameterKey
         */
        public String getParameterKey() {
            return this.parameterKey;
        }

        /**
         * @return parameterValue
         */
        public String getParameterValue() {
            return this.parameterValue;
        }

        public static final class Builder {
            private String parameterKey; 
            private String parameterValue; 

            /**
             * <p>The parameter name.</p>
             * <p>For more information about the valid values of ParameterKey, see the &quot;<strong>Additional information about request parameters</strong>&quot; section of this topic.</p>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li><p>PreferenceParameters is optional. If you specify PreferenceParameters, you must specify ParameterKey and ParameterValue.</p>
             * </li>
             * <li><p>You must set ParameterKey to DeletionPolicy when TemplateScratchType is set to ResourceImport.</p>
             * </li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>DeletionPolicy</p>
             */
            public Builder parameterKey(String parameterKey) {
                this.parameterKey = parameterKey;
                return this;
            }

            /**
             * <p>The parameter value. The value is an assignment to the parameter key.</p>
             * <p>For more information about the valid values of ParameterValue, see the &quot;<strong>Additional information about request parameters</strong>&quot; section of this topic.</p>
             * <blockquote>
             * <p> PreferenceParameters is optional. If you specify PreferenceParameters, you must specify ParameterKey and ParameterValue.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Retain</p>
             */
            public Builder parameterValue(String parameterValue) {
                this.parameterValue = parameterValue;
                return this;
            }

            public PreferenceParameters build() {
                return new PreferenceParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateTemplateScratchRequest} extends {@link TeaModel}
     *
     * <p>CreateTemplateScratchRequest</p>
     */
    public static class SourceResourceGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ResourceTypeFilter")
        private java.util.List < String > resourceTypeFilter;

        private SourceResourceGroup(Builder builder) {
            this.resourceGroupId = builder.resourceGroupId;
            this.resourceTypeFilter = builder.resourceTypeFilter;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceResourceGroup create() {
            return builder().build();
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return resourceTypeFilter
         */
        public java.util.List < String > getResourceTypeFilter() {
            return this.resourceTypeFilter;
        }

        public static final class Builder {
            private String resourceGroupId; 
            private java.util.List < String > resourceTypeFilter; 

            /**
             * <p>The ID of the source resource group.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmzawhxxc****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The resource types for filtering resources.</p>
             */
            public Builder resourceTypeFilter(java.util.List < String > resourceTypeFilter) {
                this.resourceTypeFilter = resourceTypeFilter;
                return this;
            }

            public SourceResourceGroup build() {
                return new SourceResourceGroup(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateTemplateScratchRequest} extends {@link TeaModel}
     *
     * <p>CreateTemplateScratchRequest</p>
     */
    public static class SourceResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RelatedResourceTypeFilter")
        private java.util.List < String > relatedResourceTypeFilter;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String resourceType;

        private SourceResources(Builder builder) {
            this.regionId = builder.regionId;
            this.relatedResourceTypeFilter = builder.relatedResourceTypeFilter;
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceResources create() {
            return builder().build();
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return relatedResourceTypeFilter
         */
        public java.util.List < String > getRelatedResourceTypeFilter() {
            return this.relatedResourceTypeFilter;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private String regionId; 
            private java.util.List < String > relatedResourceTypeFilter; 
            private String resourceId; 
            private String resourceType; 

            /**
             * <p>The region ID of the resource.</p>
             * <p>You can call the <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> operation to query the most recent region list.</p>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li><p>This parameter takes effect only when TemplateScratchType is set to ArchitectureDetection.</p>
             * </li>
             * <li><p>The region ID of a global resource is <code>global</code>. For example, the region ID of the ALIYUN::CDN::Domain global resource is <code>global</code>.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The related resource type filters.</p>
             */
            public Builder relatedResourceTypeFilter(java.util.List < String > relatedResourceTypeFilter) {
                this.relatedResourceTypeFilter = relatedResourceTypeFilter;
                return this;
            }

            /**
             * <p>The resource ID.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1m6fww66xbntjyc****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN::ECS::VPC</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public SourceResources build() {
                return new SourceResources(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateTemplateScratchRequest} extends {@link TeaModel}
     *
     * <p>CreateTemplateScratchRequest</p>
     */
    public static class SourceTag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceTags")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.Map < String, ? > resourceTags;

        @com.aliyun.core.annotation.NameInMap("ResourceTypeFilter")
        private java.util.List < String > resourceTypeFilter;

        private SourceTag(Builder builder) {
            this.resourceTags = builder.resourceTags;
            this.resourceTypeFilter = builder.resourceTypeFilter;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceTag create() {
            return builder().build();
        }

        /**
         * @return resourceTags
         */
        public java.util.Map < String, ? > getResourceTags() {
            return this.resourceTags;
        }

        /**
         * @return resourceTypeFilter
         */
        public java.util.List < String > getResourceTypeFilter() {
            return this.resourceTypeFilter;
        }

        public static final class Builder {
            private java.util.Map < String, ? > resourceTags; 
            private java.util.List < String > resourceTypeFilter; 

            /**
             * <p>The source tags that consist of key-value pairs. If you want to specify only the tag key, you must leave the tag value empty. Example: <code>{&quot;TagKey&quot;: &quot;&quot;}</code>.</p>
             * <p>You can add up to 10 source tags.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;a&quot;: &quot;b&quot;}</p>
             */
            public Builder resourceTags(java.util.Map < String, ? > resourceTags) {
                this.resourceTags = resourceTags;
                return this;
            }

            /**
             * <p>The resource types for filtering resources.</p>
             */
            public Builder resourceTypeFilter(java.util.List < String > resourceTypeFilter) {
                this.resourceTypeFilter = resourceTypeFilter;
                return this;
            }

            public SourceTag build() {
                return new SourceTag(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateTemplateScratchRequest} extends {@link TeaModel}
     *
     * <p>CreateTemplateScratchRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        @com.aliyun.core.annotation.Validation(required = true)
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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

            /**
             * <p>The tag key of the resource scenario.</p>
             * <blockquote>
             * <p>Tags is optional. If you want to specify Tags, you must specify Key.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>usage</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the resource scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
