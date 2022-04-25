// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTemplateScratchRequest} extends {@link RequestModel}
 *
 * <p>UpdateTemplateScratchRequest</p>
 */
public class UpdateTemplateScratchRequest extends Request {
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
    @NameInMap("TemplateScratchId")
    @Validation(required = true)
    private String templateScratchId;

    private UpdateTemplateScratchRequest(Builder builder) {
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
        this.templateScratchId = builder.templateScratchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTemplateScratchRequest create() {
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
     * @return templateScratchId
     */
    public String getTemplateScratchId() {
        return this.templateScratchId;
    }

    public static final class Builder extends Request.Builder<UpdateTemplateScratchRequest, Builder> {
        private String clientToken; 
        private String description; 
        private String executionMode; 
        private String logicalIdStrategy; 
        private java.util.List < PreferenceParameters> preferenceParameters; 
        private String regionId; 
        private SourceResourceGroup sourceResourceGroup; 
        private java.util.List < SourceResources> sourceResources; 
        private SourceTag sourceTag; 
        private String templateScratchId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTemplateScratchRequest request) {
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
            this.templateScratchId = request.templateScratchId;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * ExecutionMode.
         */
        public Builder executionMode(String executionMode) {
            this.putQueryParameter("ExecutionMode", executionMode);
            this.executionMode = executionMode;
            return this;
        }

        /**
         * LogicalIdStrategy.
         */
        public Builder logicalIdStrategy(String logicalIdStrategy) {
            this.putQueryParameter("LogicalIdStrategy", logicalIdStrategy);
            this.logicalIdStrategy = logicalIdStrategy;
            return this;
        }

        /**
         * PreferenceParameters.
         */
        public Builder preferenceParameters(java.util.List < PreferenceParameters> preferenceParameters) {
            String preferenceParametersShrink = shrink(preferenceParameters, "PreferenceParameters", "json");
            this.putQueryParameter("PreferenceParameters", preferenceParametersShrink);
            this.preferenceParameters = preferenceParameters;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SourceResourceGroup.
         */
        public Builder sourceResourceGroup(SourceResourceGroup sourceResourceGroup) {
            String sourceResourceGroupShrink = shrink(sourceResourceGroup, "SourceResourceGroup", "json");
            this.putQueryParameter("SourceResourceGroup", sourceResourceGroupShrink);
            this.sourceResourceGroup = sourceResourceGroup;
            return this;
        }

        /**
         * SourceResources.
         */
        public Builder sourceResources(java.util.List < SourceResources> sourceResources) {
            String sourceResourcesShrink = shrink(sourceResources, "SourceResources", "json");
            this.putQueryParameter("SourceResources", sourceResourcesShrink);
            this.sourceResources = sourceResources;
            return this;
        }

        /**
         * SourceTag.
         */
        public Builder sourceTag(SourceTag sourceTag) {
            String sourceTagShrink = shrink(sourceTag, "SourceTag", "json");
            this.putQueryParameter("SourceTag", sourceTagShrink);
            this.sourceTag = sourceTag;
            return this;
        }

        /**
         * TemplateScratchId.
         */
        public Builder templateScratchId(String templateScratchId) {
            this.putQueryParameter("TemplateScratchId", templateScratchId);
            this.templateScratchId = templateScratchId;
            return this;
        }

        @Override
        public UpdateTemplateScratchRequest build() {
            return new UpdateTemplateScratchRequest(this);
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
             * ParameterKey.
             */
            public Builder parameterKey(String parameterKey) {
                this.parameterKey = parameterKey;
                return this;
            }

            /**
             * ParameterValue.
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
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * ResourceTypeFilter.
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
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * ResourceType.
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
             * ResourceTags.
             */
            public Builder resourceTags(java.util.Map < String, ? > resourceTags) {
                this.resourceTags = resourceTags;
                return this;
            }

            /**
             * ResourceTypeFilter.
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
}
