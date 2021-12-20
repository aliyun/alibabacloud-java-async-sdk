// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>TemplateScratch.</p>
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
             * <p>ParameterKey.</p>
             */
            public Builder parameterKey(String parameterKey) {
                this.parameterKey = parameterKey;
                return this;
            }

            /**
             * <p>ParameterValue.</p>
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
             * <p>ResourceGroupId.</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>ResourceTypeFilter.</p>
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
             * <p>ResourceId.</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>ResourceType.</p>
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
             * <p>ResourceTags.</p>
             */
            public Builder resourceTags(java.util.Map < String, ? > resourceTags) {
                this.resourceTags = resourceTags;
                return this;
            }

            /**
             * <p>ResourceTypeFilter.</p>
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
             * <p>Creatable.</p>
             */
            public Builder creatable(Boolean creatable) {
                this.creatable = creatable;
                return this;
            }

            /**
             * <p>Importable.</p>
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
             * <p>RegionId.</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>StackId.</p>
             */
            public Builder stackId(String stackId) {
                this.stackId = stackId;
                return this;
            }

            /**
             * <p>UsageType.</p>
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
             * <p>CreateTime.</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Description.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>FailedCode.</p>
             */
            public Builder failedCode(String failedCode) {
                this.failedCode = failedCode;
                return this;
            }

            /**
             * <p>LogicalIdStrategy.</p>
             */
            public Builder logicalIdStrategy(String logicalIdStrategy) {
                this.logicalIdStrategy = logicalIdStrategy;
                return this;
            }

            /**
             * <p>PreferenceParameters.</p>
             */
            public Builder preferenceParameters(java.util.List < PreferenceParameters> preferenceParameters) {
                this.preferenceParameters = preferenceParameters;
                return this;
            }

            /**
             * <p>SourceResourceGroup.</p>
             */
            public Builder sourceResourceGroup(SourceResourceGroup sourceResourceGroup) {
                this.sourceResourceGroup = sourceResourceGroup;
                return this;
            }

            /**
             * <p>SourceResources.</p>
             */
            public Builder sourceResources(java.util.List < SourceResources> sourceResources) {
                this.sourceResources = sourceResources;
                return this;
            }

            /**
             * <p>SourceTag.</p>
             */
            public Builder sourceTag(SourceTag sourceTag) {
                this.sourceTag = sourceTag;
                return this;
            }

            /**
             * <p>StackProvision.</p>
             */
            public Builder stackProvision(StackProvision stackProvision) {
                this.stackProvision = stackProvision;
                return this;
            }

            /**
             * <p>Stacks.</p>
             */
            public Builder stacks(java.util.List < Stacks> stacks) {
                this.stacks = stacks;
                return this;
            }

            /**
             * <p>Status.</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>StatusReason.</p>
             */
            public Builder statusReason(String statusReason) {
                this.statusReason = statusReason;
                return this;
            }

            /**
             * <p>TemplateScratchData.</p>
             */
            public Builder templateScratchData(java.util.Map < String, ? > templateScratchData) {
                this.templateScratchData = templateScratchData;
                return this;
            }

            /**
             * <p>TemplateScratchId.</p>
             */
            public Builder templateScratchId(String templateScratchId) {
                this.templateScratchId = templateScratchId;
                return this;
            }

            /**
             * <p>TemplateScratchType.</p>
             */
            public Builder templateScratchType(String templateScratchType) {
                this.templateScratchType = templateScratchType;
                return this;
            }

            /**
             * <p>UpdateTime.</p>
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
