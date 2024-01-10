// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTemplateScratchResponseBody} extends {@link TeaModel}
 *
 * <p>GetTemplateScratchResponseBody</p>
 */
public class GetTemplateScratchResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TemplateScratch")
    private TemplateScratch templateScratch;

    private GetTemplateScratchResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.templateScratch = builder.templateScratch;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTemplateScratchResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return templateScratch
     */
    public TemplateScratch getTemplateScratch() {
        return this.templateScratch;
    }

    public static final class Builder {
        private String requestId; 
        private TemplateScratch templateScratch; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The resource scenario.
         */
        public Builder templateScratch(TemplateScratch templateScratch) {
            this.templateScratch = templateScratch;
            return this;
        }

        public GetTemplateScratchResponseBody build() {
            return new GetTemplateScratchResponseBody(this);
        } 

    } 

    public static class PreferenceParameters extends TeaModel {
        @NameInMap("ParameterKey")
        private String parameterKey;

        @NameInMap("ParameterValue")
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
             * The parameter name.
             */
            public Builder parameterKey(String parameterKey) {
                this.parameterKey = parameterKey;
                return this;
            }

            /**
             * The parameter value.
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
             * The resource types.
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
        private String resourceId;

        @NameInMap("ResourceType")
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
             * The resource ID.
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
             * The source tags.
             */
            public Builder resourceTags(java.util.Map < String, ? > resourceTags) {
                this.resourceTags = resourceTags;
                return this;
            }

            /**
             * The resource types.
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
    public static class StackProvision extends TeaModel {
        @NameInMap("Creatable")
        private Boolean creatable;

        @NameInMap("Importable")
        private Boolean importable;

        private StackProvision(Builder builder) {
            this.creatable = builder.creatable;
            this.importable = builder.importable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StackProvision create() {
            return builder().build();
        }

        /**
         * @return creatable
         */
        public Boolean getCreatable() {
            return this.creatable;
        }

        /**
         * @return importable
         */
        public Boolean getImportable() {
            return this.importable;
        }

        public static final class Builder {
            private Boolean creatable; 
            private Boolean importable; 

            /**
             * Indicates whether the resource is replicated by calling the [CreateStack](~~132086~~) operation. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder creatable(Boolean creatable) {
                this.creatable = creatable;
                return this;
            }

            /**
             * Indicates whether the resource is managed by calling the [CreateChangeSet](~~131051~~) operation. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder importable(Boolean importable) {
                this.importable = importable;
                return this;
            }

            public StackProvision build() {
                return new StackProvision(this);
            } 

        } 

    }
    public static class Stacks extends TeaModel {
        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("StackId")
        private String stackId;

        @NameInMap("UsageType")
        private String usageType;

        private Stacks(Builder builder) {
            this.regionId = builder.regionId;
            this.stackId = builder.stackId;
            this.usageType = builder.usageType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Stacks create() {
            return builder().build();
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return stackId
         */
        public String getStackId() {
            return this.stackId;
        }

        /**
         * @return usageType
         */
        public String getUsageType() {
            return this.usageType;
        }

        public static final class Builder {
            private String regionId; 
            private String stackId; 
            private String usageType; 

            /**
             * The region ID of the stack.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The stack ID.
             */
            public Builder stackId(String stackId) {
                this.stackId = stackId;
                return this;
            }

            /**
             * The purpose of the stack. Valid values:
             * <p>
             * 
             * *   ResourceImport: resource management
             * *   ArchitectureReplication: resource replication
             */
            public Builder usageType(String usageType) {
                this.usageType = usageType;
                return this;
            }

            public Stacks build() {
                return new Stacks(this);
            } 

        } 

    }
    public static class TemplateScratch extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("FailedCode")
        private String failedCode;

        @NameInMap("LogicalIdStrategy")
        private String logicalIdStrategy;

        @NameInMap("PreferenceParameters")
        private java.util.List < PreferenceParameters> preferenceParameters;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("SourceResourceGroup")
        private SourceResourceGroup sourceResourceGroup;

        @NameInMap("SourceResources")
        private java.util.List < SourceResources> sourceResources;

        @NameInMap("SourceTag")
        private SourceTag sourceTag;

        @NameInMap("StackProvision")
        private StackProvision stackProvision;

        @NameInMap("Stacks")
        private java.util.List < Stacks> stacks;

        @NameInMap("Status")
        private String status;

        @NameInMap("StatusReason")
        private String statusReason;

        @NameInMap("TemplateScratchData")
        private java.util.Map < String, ? > templateScratchData;

        @NameInMap("TemplateScratchId")
        private String templateScratchId;

        @NameInMap("TemplateScratchType")
        private String templateScratchType;

        @NameInMap("UpdateTime")
        private String updateTime;

        private TemplateScratch(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.failedCode = builder.failedCode;
            this.logicalIdStrategy = builder.logicalIdStrategy;
            this.preferenceParameters = builder.preferenceParameters;
            this.resourceGroupId = builder.resourceGroupId;
            this.sourceResourceGroup = builder.sourceResourceGroup;
            this.sourceResources = builder.sourceResources;
            this.sourceTag = builder.sourceTag;
            this.stackProvision = builder.stackProvision;
            this.stacks = builder.stacks;
            this.status = builder.status;
            this.statusReason = builder.statusReason;
            this.templateScratchData = builder.templateScratchData;
            this.templateScratchId = builder.templateScratchId;
            this.templateScratchType = builder.templateScratchType;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TemplateScratch create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return failedCode
         */
        public String getFailedCode() {
            return this.failedCode;
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
         * @return stackProvision
         */
        public StackProvision getStackProvision() {
            return this.stackProvision;
        }

        /**
         * @return stacks
         */
        public java.util.List < Stacks> getStacks() {
            return this.stacks;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusReason
         */
        public String getStatusReason() {
            return this.statusReason;
        }

        /**
         * @return templateScratchData
         */
        public java.util.Map < String, ? > getTemplateScratchData() {
            return this.templateScratchData;
        }

        /**
         * @return templateScratchId
         */
        public String getTemplateScratchId() {
            return this.templateScratchId;
        }

        /**
         * @return templateScratchType
         */
        public String getTemplateScratchType() {
            return this.templateScratchType;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String failedCode; 
            private String logicalIdStrategy; 
            private java.util.List < PreferenceParameters> preferenceParameters; 
            private String resourceGroupId; 
            private SourceResourceGroup sourceResourceGroup; 
            private java.util.List < SourceResources> sourceResources; 
            private SourceTag sourceTag; 
            private StackProvision stackProvision; 
            private java.util.List < Stacks> stacks; 
            private String status; 
            private String statusReason; 
            private java.util.Map < String, ? > templateScratchData; 
            private String templateScratchId; 
            private String templateScratchType; 
            private String updateTime; 

            /**
             * The time at which the scenario was created.
             * <p>
             * 
             * The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The description of the scenario.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The status code of the scenario that fails to be created.
             * <p>
             * 
             * > This parameter is returned only if you set Status to GENERATE_FAILED.
             */
            public Builder failedCode(String failedCode) {
                this.failedCode = failedCode;
                return this;
            }

            /**
             * The policy based on which the logical ID is generated. Valid values:
             * <p>
             * 
             * *   LongTypePrefixAndIndexSuffix (default): long-type prefix + index-type suffix
             * *   LongTypePrefixAndHashSuffix: long-type prefix + hash-type suffix
             * *   ShortTypePrefixAndHashSuffix: short-type prefix + hash-type suffix
             */
            public Builder logicalIdStrategy(String logicalIdStrategy) {
                this.logicalIdStrategy = logicalIdStrategy;
                return this;
            }

            /**
             * The preference parameters of the scenario.
             */
            public Builder preferenceParameters(java.util.List < PreferenceParameters> preferenceParameters) {
                this.preferenceParameters = preferenceParameters;
                return this;
            }

            /**
             * The ID of the resource group.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The source resource group.
             */
            public Builder sourceResourceGroup(SourceResourceGroup sourceResourceGroup) {
                this.sourceResourceGroup = sourceResourceGroup;
                return this;
            }

            /**
             * The source resources.
             */
            public Builder sourceResources(java.util.List < SourceResources> sourceResources) {
                this.sourceResources = sourceResources;
                return this;
            }

            /**
             * The source tag.
             */
            public Builder sourceTag(SourceTag sourceTag) {
                this.sourceTag = sourceTag;
                return this;
            }

            /**
             * The preset information of the stack.
             */
            public Builder stackProvision(StackProvision stackProvision) {
                this.stackProvision = stackProvision;
                return this;
            }

            /**
             * The stacks that are associated with the scenario.
             */
            public Builder stacks(java.util.List < Stacks> stacks) {
                this.stacks = stacks;
                return this;
            }

            /**
             * The state of the scenario. Valid values:
             * <p>
             * 
             * *   GENERATE_IN_PROGRESS: The scenario is being created.
             * *   GENERATE_COMPLETE: The scenario is created.
             * *   GENERATE_FAILED: The scenario fails to be created.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The reason why the scenario fails to be created.
             * <p>
             * 
             * > This parameter is returned only if you set Status to GENERATE_FAILED.
             */
            public Builder statusReason(String statusReason) {
                this.statusReason = statusReason;
                return this;
            }

            /**
             * The scenario data.
             */
            public Builder templateScratchData(java.util.Map < String, ? > templateScratchData) {
                this.templateScratchData = templateScratchData;
                return this;
            }

            /**
             * The ID of the scenario.
             */
            public Builder templateScratchId(String templateScratchId) {
                this.templateScratchId = templateScratchId;
                return this;
            }

            /**
             * The type of the scenario. Valid values:
             * <p>
             * 
             * *   ResourceImport: resource management
             * *   ArchitectureReplication: resource replication
             */
            public Builder templateScratchType(String templateScratchType) {
                this.templateScratchType = templateScratchType;
                return this;
            }

            /**
             * The time at which the scenario was updated.
             * <p>
             * 
             * The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public TemplateScratch build() {
                return new TemplateScratch(this);
            } 

        } 

    }
}
