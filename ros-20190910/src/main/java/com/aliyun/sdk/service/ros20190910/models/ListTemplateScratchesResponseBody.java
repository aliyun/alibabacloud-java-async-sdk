// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTemplateScratchesResponseBody} extends {@link TeaModel}
 *
 * <p>ListTemplateScratchesResponseBody</p>
 */
public class ListTemplateScratchesResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TemplateScratches")
    private java.util.List < TemplateScratches> templateScratches;

    @NameInMap("TotalCount")
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
         * The list of scenarios.
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
             * The name of the parameter.
             */
            public Builder parameterKey(String parameterKey) {
                this.parameterKey = parameterKey;
                return this;
            }

            /**
             * The value of the parameter.
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
             * The filter for resource types.
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
             * The filter for resource types.
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
             * The tag key of the scenario.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value of the scenario.
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

        @NameInMap("Status")
        private String status;

        @NameInMap("StatusReason")
        private String statusReason;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        @NameInMap("TemplateScratchId")
        private String templateScratchId;

        @NameInMap("TemplateScratchType")
        private String templateScratchType;

        @NameInMap("UpdateTime")
        private String updateTime;

        private TemplateScratches(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.failedCode = builder.failedCode;
            this.logicalIdStrategy = builder.logicalIdStrategy;
            this.preferenceParameters = builder.preferenceParameters;
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
             * >  This parameter is returned only if the Status parameter is set to GENERATE_FAILED.
             */
            public Builder failedCode(String failedCode) {
                this.failedCode = failedCode;
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
                this.logicalIdStrategy = logicalIdStrategy;
                return this;
            }

            /**
             * The parameters that are configured for the scenario.
             */
            public Builder preferenceParameters(java.util.List < PreferenceParameters> preferenceParameters) {
                this.preferenceParameters = preferenceParameters;
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
             * The state of the scenario.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The reason why the scenario fails to be created.
             * <p>
             * 
             * >  This parameter is returned only if the Status parameter is set to GENERATE_FAILED.
             */
            public Builder statusReason(String statusReason) {
                this.statusReason = statusReason;
                return this;
            }

            /**
             * The tags of the scenario.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
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

            public TemplateScratches build() {
                return new TemplateScratches(this);
            } 

        } 

    }
}
