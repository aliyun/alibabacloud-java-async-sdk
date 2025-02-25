// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetTemplateScratchResponseBody} extends {@link TeaModel}
 *
 * <p>GetTemplateScratchResponseBody</p>
 */
public class GetTemplateScratchResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TemplateScratch")
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A8E0EF98-6FBD-5656-8298-FC8194F0F7B7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The resource scenario.</p>
         */
        public Builder templateScratch(TemplateScratch templateScratch) {
            this.templateScratch = templateScratch;
            return this;
        }

        public GetTemplateScratchResponseBody build() {
            return new GetTemplateScratchResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTemplateScratchResponseBody} extends {@link TeaModel}
     *
     * <p>GetTemplateScratchResponseBody</p>
     */
    public static class PreferenceParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ParameterKey")
        private String parameterKey;

        @com.aliyun.core.annotation.NameInMap("ParameterValue")
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
             * 
             * <strong>example:</strong>
             * <p>DeletionPolicy</p>
             */
            public Builder parameterKey(String parameterKey) {
                this.parameterKey = parameterKey;
                return this;
            }

            /**
             * <p>The parameter value.</p>
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
     * {@link GetTemplateScratchResponseBody} extends {@link TeaModel}
     *
     * <p>GetTemplateScratchResponseBody</p>
     */
    public static class SourceResourceGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
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
             * 
             * <strong>example:</strong>
             * <p>rg-acfmzawhxxc****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The resource type filters.</p>
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
     * {@link GetTemplateScratchResponseBody} extends {@link TeaModel}
     *
     * <p>GetTemplateScratchResponseBody</p>
     */
    public static class SourceResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RelatedResourceTypeFilter")
        private java.util.List < String > relatedResourceTypeFilter;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        private SourceResources(Builder builder) {
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
            private java.util.List < String > relatedResourceTypeFilter; 
            private String resourceId; 
            private String resourceType; 

            /**
             * <p>The related resource type filters.</p>
             */
            public Builder relatedResourceTypeFilter(java.util.List < String > relatedResourceTypeFilter) {
                this.relatedResourceTypeFilter = relatedResourceTypeFilter;
                return this;
            }

            /**
             * <p>The resource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-m5e7cv7e9mz69sszb****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The resource type.</p>
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
     * {@link GetTemplateScratchResponseBody} extends {@link TeaModel}
     *
     * <p>GetTemplateScratchResponseBody</p>
     */
    public static class SourceTag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceTags")
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
             * <p>The source tags.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;a&quot;: &quot;b&quot;}</p>
             */
            public Builder resourceTags(java.util.Map < String, ? > resourceTags) {
                this.resourceTags = resourceTags;
                return this;
            }

            /**
             * <p>The resource type filters.</p>
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
     * {@link GetTemplateScratchResponseBody} extends {@link TeaModel}
     *
     * <p>GetTemplateScratchResponseBody</p>
     */
    public static class StackProvision extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Creatable")
        private Boolean creatable;

        @com.aliyun.core.annotation.NameInMap("Importable")
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
             * <p>Indicates whether the resource is replicated by calling the <a href="https://help.aliyun.com/document_detail/132086.html">CreateStack</a> operation. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder creatable(Boolean creatable) {
                this.creatable = creatable;
                return this;
            }

            /**
             * <p>Indicates whether the resource is managed by calling the <a href="https://help.aliyun.com/document_detail/131051.html">CreateChangeSet</a> operation. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
    /**
     * 
     * {@link GetTemplateScratchResponseBody} extends {@link TeaModel}
     *
     * <p>GetTemplateScratchResponseBody</p>
     */
    public static class Stacks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("StackId")
        private String stackId;

        @com.aliyun.core.annotation.NameInMap("UsageType")
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
             * <p>The region ID of the stack.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The stack ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3708bf6a-3a67-44d4-9eb1-c56704b9****</p>
             */
            public Builder stackId(String stackId) {
                this.stackId = stackId;
                return this;
            }

            /**
             * <p>The purpose of the stack. Valid values:</p>
             * <ul>
             * <li>ResourceImport: resource management</li>
             * <li>ArchitectureReplication: resource replication</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ArchitectureReplication</p>
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
    /**
     * 
     * {@link GetTemplateScratchResponseBody} extends {@link TeaModel}
     *
     * <p>GetTemplateScratchResponseBody</p>
     */
    public static class TemplateScratch extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("FailedCode")
        private String failedCode;

        @com.aliyun.core.annotation.NameInMap("LogicalIdStrategy")
        private String logicalIdStrategy;

        @com.aliyun.core.annotation.NameInMap("PreferenceParameters")
        private java.util.List < PreferenceParameters> preferenceParameters;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SourceResourceGroup")
        private SourceResourceGroup sourceResourceGroup;

        @com.aliyun.core.annotation.NameInMap("SourceResources")
        private java.util.List < SourceResources> sourceResources;

        @com.aliyun.core.annotation.NameInMap("SourceTag")
        private SourceTag sourceTag;

        @com.aliyun.core.annotation.NameInMap("StackProvision")
        private StackProvision stackProvision;

        @com.aliyun.core.annotation.NameInMap("Stacks")
        private java.util.List < Stacks> stacks;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusReason")
        private String statusReason;

        @com.aliyun.core.annotation.NameInMap("TemplateScratchData")
        private java.util.Map < String, ? > templateScratchData;

        @com.aliyun.core.annotation.NameInMap("TemplateScratchId")
        private String templateScratchId;

        @com.aliyun.core.annotation.NameInMap("TemplateScratchType")
        private String templateScratchType;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
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
             * <p>The time at which the resource scenario was created.</p>
             * <p>The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-22T01:49:22</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the resource scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>The description of the resource scenario.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The status code of the resource scenario that fails to be created.</p>
             * <blockquote>
             * <p>This parameter is returned only if you set Status to GENERATE_FAILED.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>InvalidZoneId</p>
             */
            public Builder failedCode(String failedCode) {
                this.failedCode = failedCode;
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
                this.logicalIdStrategy = logicalIdStrategy;
                return this;
            }

            /**
             * <p>The preference parameters of the resource scenario.</p>
             */
            public Builder preferenceParameters(java.util.List < PreferenceParameters> preferenceParameters) {
                this.preferenceParameters = preferenceParameters;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmzmhzoaad5oq</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The source resource group.</p>
             */
            public Builder sourceResourceGroup(SourceResourceGroup sourceResourceGroup) {
                this.sourceResourceGroup = sourceResourceGroup;
                return this;
            }

            /**
             * <p>The source resources.</p>
             */
            public Builder sourceResources(java.util.List < SourceResources> sourceResources) {
                this.sourceResources = sourceResources;
                return this;
            }

            /**
             * <p>The source tag.</p>
             */
            public Builder sourceTag(SourceTag sourceTag) {
                this.sourceTag = sourceTag;
                return this;
            }

            /**
             * <p>The preset information of the stack.</p>
             */
            public Builder stackProvision(StackProvision stackProvision) {
                this.stackProvision = stackProvision;
                return this;
            }

            /**
             * <p>The stacks that are associated with the resource scenario.</p>
             */
            public Builder stacks(java.util.List < Stacks> stacks) {
                this.stacks = stacks;
                return this;
            }

            /**
             * <p>The state of the resource scenario. Valid values:</p>
             * <ul>
             * <li>GENERATE_IN_PROGRESS: The resource scenario is being created.</li>
             * <li>GENERATE_COMPLETE: The resource scenario is created.</li>
             * <li>GENERATE_FAILED: The resource scenario fails to be created.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>GENERATE_COMPLETE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The reason why the resource scenario fails to be created.</p>
             * <blockquote>
             * <p>This parameter is returned only if you set Status to GENERATE_FAILED.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Resource ALIYUN::ECS::VPC vpc-m5eauuq80anx59v28**** could not be found for template scratch.</p>
             */
            public Builder statusReason(String statusReason) {
                this.statusReason = statusReason;
                return this;
            }

            /**
             * <p>The resource scenario data.</p>
             */
            public Builder templateScratchData(java.util.Map < String, ? > templateScratchData) {
                this.templateScratchData = templateScratchData;
                return this;
            }

            /**
             * <p>The ID of the resource scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>ts-7f7a704cf71c49a6****</p>
             */
            public Builder templateScratchId(String templateScratchId) {
                this.templateScratchId = templateScratchId;
                return this;
            }

            /**
             * <p>The type of the resource scenario. Valid values:</p>
             * <ul>
             * <li>ResourceImport: resource management</li>
             * <li>ArchitectureReplication: resource replication</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ArchitectureReplication</p>
             */
            public Builder templateScratchType(String templateScratchType) {
                this.templateScratchType = templateScratchType;
                return this;
            }

            /**
             * <p>The time at which the resource scenario was updated.</p>
             * <p>The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-22T01:49:23</p>
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
