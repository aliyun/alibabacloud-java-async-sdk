// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTemplateScratchesResponseBody} extends {@link TeaModel}
 *
 * <p>ListTemplateScratchesResponseBody</p>
 */
public class ListTemplateScratchesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TemplateScratches")
    private java.util.List < TemplateScratches> templateScratches;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListTemplateScratchesResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.templateScratches = builder.templateScratches;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTemplateScratchesResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return templateScratches
     */
    public java.util.List < TemplateScratches> getTemplateScratches() {
        return this.templateScratches;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List < TemplateScratches> templateScratches; 
        private Integer totalCount; 

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The resource scenarios.
         */
        public Builder templateScratches(java.util.List < TemplateScratches> templateScratches) {
            this.templateScratches = templateScratches;
            return this;
        }

        /**
         * The total number of scenarios.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListTemplateScratchesResponseBody build() {
            return new ListTemplateScratchesResponseBody(this);
        } 

    } 

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
             * The ID of the source resource group.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The resource types for filtering resources.
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
        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
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
             * The source tags.
             */
            public Builder resourceTags(java.util.Map < String, ? > resourceTags) {
                this.resourceTags = resourceTags;
                return this;
            }

            /**
             * The resource types for filtering resources.
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
        @com.aliyun.core.annotation.NameInMap("Key")
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
             * The tag key of the resource scenario.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value of the resource scenario.
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
    public static class TemplateScratches extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusReason")
        private String statusReason;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        @com.aliyun.core.annotation.NameInMap("TemplateScratchId")
        private String templateScratchId;

        @com.aliyun.core.annotation.NameInMap("TemplateScratchType")
        private String templateScratchType;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private TemplateScratches(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.failedCode = builder.failedCode;
            this.logicalIdStrategy = builder.logicalIdStrategy;
            this.preferenceParameters = builder.preferenceParameters;
            this.resourceGroupId = builder.resourceGroupId;
            this.sourceResourceGroup = builder.sourceResourceGroup;
            this.sourceResources = builder.sourceResources;
            this.sourceTag = builder.sourceTag;
            this.status = builder.status;
            this.statusReason = builder.statusReason;
            this.tags = builder.tags;
            this.templateScratchId = builder.templateScratchId;
            this.templateScratchType = builder.templateScratchType;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TemplateScratches create() {
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
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
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
            private String status; 
            private String statusReason; 
            private java.util.List < Tags> tags; 
            private String templateScratchId; 
            private String templateScratchType; 
            private String updateTime; 

            /**
             * The time when the resource scenario was created.
             * <p>
             * 
             * The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The description of the resource scenario.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The status code of the resource scenario that failed to be generated.
             * <p>
             * 
             * >  This parameter is returned only if the value of Status is GENERATE_FAILED.
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
             * The preference parameters of the resource scenario.
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
             * The state of the resource scenario.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The reason why the resource scenario failed to be generated.
             * <p>
             * 
             * >  This parameter is returned only if the value of Status is GENERATE_FAILED.
             */
            public Builder statusReason(String statusReason) {
                this.statusReason = statusReason;
                return this;
            }

            /**
             * The tags of the resource scenario.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The ID of the resource scenario.
             */
            public Builder templateScratchId(String templateScratchId) {
                this.templateScratchId = templateScratchId;
                return this;
            }

            /**
             * The type of the resource scenario. Valid values:
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
             * The time when the resource scenario was updated.
             * <p>
             * 
             * The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public TemplateScratches build() {
                return new TemplateScratches(this);
            } 

        } 

    }
}
