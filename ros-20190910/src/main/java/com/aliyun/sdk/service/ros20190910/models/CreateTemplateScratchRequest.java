// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTemplateScratchRequest} extends {@link RequestModel}
 *
 * <p>CreateTemplateScratchRequest</p>
 */
public class CreateTemplateScratchRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("ExecutionMode")
    private String executionMode;

    @Query
    @NameInMap("LogicalIdStrategy")
    private String logicalIdStrategy;

    @Query
    @NameInMap("PreferenceParameters")
    private java.util.List < PreferenceParameters> preferenceParameters;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("SourceResourceGroup")
    private SourceResourceGroup sourceResourceGroup;

    @Query
    @NameInMap("SourceResources")
    private java.util.List < SourceResources> sourceResources;

    @Query
    @NameInMap("SourceTag")
    private SourceTag sourceTag;

    @Query
    @NameInMap("Tags")
    private java.util.List < Tags> tags;

    @Query
    @NameInMap("TemplateScratchType")
    @Validation(required = true)
    private String templateScratchType;

    private CreateTemplateScratchRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.executionMode = builder.executionMode;
        this.logicalIdStrategy = builder.logicalIdStrategy;
        this.preferenceParameters = builder.preferenceParameters;
        this.regionId = builder.regionId;
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
            this.sourceResourceGroup = request.sourceResourceGroup;
            this.sourceResources = request.sourceResources;
            this.sourceTag = request.sourceTag;
            this.tags = request.tags;
            this.templateScratchType = request.templateScratchType;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests. The token can be up to 64 characters in length, and can contain letters, digits, hyphens (-), and underscores (\_).
         * <p>
         * 
         * For more information, see [Ensure idempotence](~~134212~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The description of the scenario.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The execution mode. Default value: Async. Valid values:
         * <p>
         * 
         * *   Async: asynchronous mode
         * *   Sync: synchronous mode
         * 
         * >  If a wide scope of resources exist, the synchronous mode takes a longer period of time than the asynchronous mode. If you set the ExecutionMode parameter to Sync, we recommend that you configure the ClientToken parameter to prevent a timeout error.
         */
        public Builder executionMode(String executionMode) {
            this.putQueryParameter("ExecutionMode", executionMode);
            this.executionMode = executionMode;
            return this;
        }

        /**
         * The policy based on which the logical ID is generated. Default value: LongTypePrefixAndIndexSuffix. Valid values:
         * <p>
         * 
         * *   LongTypePrefixAndIndexSuffix: long-type prefix + index-type suffix
         * *   LongTypePrefixAndHashSuffix: long-type prefix + hash-type suffix
         * *   ShortTypePrefixAndHashSuffix: short-type prefix + hash-type suffix
         */
        public Builder logicalIdStrategy(String logicalIdStrategy) {
            this.putQueryParameter("LogicalIdStrategy", logicalIdStrategy);
            this.logicalIdStrategy = logicalIdStrategy;
            return this;
        }

        /**
         * The parameters that you want to configure for the scenario.
         */
        public Builder preferenceParameters(java.util.List < PreferenceParameters> preferenceParameters) {
            String preferenceParametersShrink = shrink(preferenceParameters, "PreferenceParameters", "json");
            this.putQueryParameter("PreferenceParameters", preferenceParametersShrink);
            this.preferenceParameters = preferenceParameters;
            return this;
        }

        /**
         * The ID of the region in which you want to create the scenario.
         * <p>
         * 
         * You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The source resource group.
         */
        public Builder sourceResourceGroup(SourceResourceGroup sourceResourceGroup) {
            String sourceResourceGroupShrink = shrink(sourceResourceGroup, "SourceResourceGroup", "json");
            this.putQueryParameter("SourceResourceGroup", sourceResourceGroupShrink);
            this.sourceResourceGroup = sourceResourceGroup;
            return this;
        }

        /**
         * The source resources.
         */
        public Builder sourceResources(java.util.List < SourceResources> sourceResources) {
            String sourceResourcesShrink = shrink(sourceResources, "SourceResources", "json");
            this.putQueryParameter("SourceResources", sourceResourcesShrink);
            this.sourceResources = sourceResources;
            return this;
        }

        /**
         * The source tag.
         */
        public Builder sourceTag(SourceTag sourceTag) {
            String sourceTagShrink = shrink(sourceTag, "SourceTag", "json");
            this.putQueryParameter("SourceTag", sourceTagShrink);
            this.sourceTag = sourceTag;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * The type of the scenario. Valid values:
         * <p>
         * 
         * *   ResourceImport: resource management
         * *   ArchitectureReplication: resource replication
         * *   ResourceMigration: resource migration
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

    public static class PreferenceParameters extends TeaModel {
        @NameInMap("ParameterKey")
        @Validation(required = true)
        private String parameterKey;

        @NameInMap("ParameterValue")
        @Validation(required = true)
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
             * The name of the parameter.
             * <p>
             * 
             * For more information about the valid values of the ParameterKey parameter, see the "**Additional information about request parameters**" section of this topic.
             * 
             * > 
             * *   The PreferenceParameters parameter is optional. If you want to specify the PreferenceParameters parameter, you must specify both the ParameterKey and ParameterValue parameters.
             * *   If you set the TemplateScratchType parameter to ResourceImport, you must set the ParameterKey parameter to DeletionPolicy.
             */
            public Builder parameterKey(String parameterKey) {
                this.parameterKey = parameterKey;
                return this;
            }

            /**
             * The value of the parameter. The value of the ParameterValue parameter varies based on the value of the ParameterKey parameter.
             * <p>
             * 
             * For more information about the valid values of the ParameterValue parameter, see the "**Additional information about request parameters**" section of this topic.
             * 
             * >  The PreferenceParameters parameter is optional. If you want to specify the PreferenceParameters parameter, you must specify both the ParameterKey and ParameterValue parameters.
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
    public static class SourceResourceGroup extends TeaModel {
        @NameInMap("ResourceGroupId")
        @Validation(required = true)
        private String resourceGroupId;

        @NameInMap("ResourceTypeFilter")
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
             * The ID of the source resource group.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The filter for resource types. If you specify this parameter, only the resources of the specified types and in the specified resource groups are scanned. If you do not specify this parameter, all resources in the specified resource groups are scanned.
             * <p>
             * 
             * You can specify up to 20 resource types.
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
    public static class SourceResources extends TeaModel {
        @NameInMap("ResourceId")
        @Validation(required = true)
        private String resourceId;

        @NameInMap("ResourceType")
        @Validation(required = true)
        private String resourceType;

        private SourceResources(Builder builder) {
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
            private String resourceId; 
            private String resourceType; 

            /**
             * The ID of the resource.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * The resource type.
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
    public static class SourceTag extends TeaModel {
        @NameInMap("ResourceTags")
        @Validation(required = true)
        private java.util.Map < String, ? > resourceTags;

        @NameInMap("ResourceTypeFilter")
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
             * The source tags that consist of key-value pairs.
             * <p>
             * 
             * If you want to specify only the tag key, you must leave the tag value empty. Example: `{"TagKey": ""}`.
             * 
             * You can add up to 10 source tags.
             */
            public Builder resourceTags(java.util.Map < String, ? > resourceTags) {
                this.resourceTags = resourceTags;
                return this;
            }

            /**
             * The filter for resource types. If you specify this parameter, only the resources of the specified types and have the specified tags are scanned. If you do not specify this parameter, all resources that have the specified tags are scanned.
             * <p>
             * 
             * You can specify up to 20 resource types.
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
    public static class Tags extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        private String key;

        @NameInMap("Value")
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
             * The key of tag N that you want to add to the scenario.
             * <p>
             * 
             * >  The Tags parameter is optional. If you specify the Tags parameter, you must specify the Tags.N.Key parameter.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of tag N that you want to add to the scenario.
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
