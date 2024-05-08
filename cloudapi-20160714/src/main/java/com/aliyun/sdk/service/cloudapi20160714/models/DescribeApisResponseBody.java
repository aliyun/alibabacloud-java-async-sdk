// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApisResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApisResponseBody</p>
 */
public class DescribeApisResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApiSummarys")
    private ApiSummarys apiSummarys;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeApisResponseBody(Builder builder) {
        this.apiSummarys = builder.apiSummarys;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApisResponseBody create() {
        return builder().build();
    }

    /**
     * @return apiSummarys
     */
    public ApiSummarys getApiSummarys() {
        return this.apiSummarys;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private ApiSummarys apiSummarys; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The queried API definitions.
         */
        public Builder apiSummarys(ApiSummarys apiSummarys) {
            this.apiSummarys = apiSummarys;
            return this;
        }

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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of returned entries.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeApisResponseBody build() {
            return new DescribeApisResponseBody(this);
        } 

    } 

    public static class DeployedInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeployedStatus")
        private String deployedStatus;

        @com.aliyun.core.annotation.NameInMap("EffectiveVersion")
        private String effectiveVersion;

        @com.aliyun.core.annotation.NameInMap("StageName")
        private String stageName;

        private DeployedInfo(Builder builder) {
            this.deployedStatus = builder.deployedStatus;
            this.effectiveVersion = builder.effectiveVersion;
            this.stageName = builder.stageName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeployedInfo create() {
            return builder().build();
        }

        /**
         * @return deployedStatus
         */
        public String getDeployedStatus() {
            return this.deployedStatus;
        }

        /**
         * @return effectiveVersion
         */
        public String getEffectiveVersion() {
            return this.effectiveVersion;
        }

        /**
         * @return stageName
         */
        public String getStageName() {
            return this.stageName;
        }

        public static final class Builder {
            private String deployedStatus; 
            private String effectiveVersion; 
            private String stageName; 

            /**
             * The deployment status. Valid values: DEPLOYED and NONDEPLOYED.
             */
            public Builder deployedStatus(String deployedStatus) {
                this.deployedStatus = deployedStatus;
                return this;
            }

            /**
             * The deployed version.
             */
            public Builder effectiveVersion(String effectiveVersion) {
                this.effectiveVersion = effectiveVersion;
                return this;
            }

            /**
             * Stage Name:
             * <p>
             * 
             * *   **RELEASE**: production environment
             * *   **PRE**: staging environment
             * *   **TEST**: test environment
             */
            public Builder stageName(String stageName) {
                this.stageName = stageName;
                return this;
            }

            public DeployedInfo build() {
                return new DeployedInfo(this);
            } 

        } 

    }
    public static class DeployedInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeployedInfo")
        private java.util.List < DeployedInfo> deployedInfo;

        private DeployedInfos(Builder builder) {
            this.deployedInfo = builder.deployedInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeployedInfos create() {
            return builder().build();
        }

        /**
         * @return deployedInfo
         */
        public java.util.List < DeployedInfo> getDeployedInfo() {
            return this.deployedInfo;
        }

        public static final class Builder {
            private java.util.List < DeployedInfo> deployedInfo; 

            /**
             * DeployedInfo.
             */
            public Builder deployedInfo(java.util.List < DeployedInfo> deployedInfo) {
                this.deployedInfo = deployedInfo;
                return this;
            }

            public DeployedInfos build() {
                return new DeployedInfos(this);
            } 

        } 

    }
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tag(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
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
             * The tag key.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * The tag value.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    public static class TagList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List < Tag> tag;

        private TagList(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagList create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
                return this;
            }

            public TagList build() {
                return new TagList(this);
            } 

        } 

    }
    public static class ApiSummary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiId")
        private String apiId;

        @com.aliyun.core.annotation.NameInMap("ApiMethod")
        private String apiMethod;

        @com.aliyun.core.annotation.NameInMap("ApiName")
        private String apiName;

        @com.aliyun.core.annotation.NameInMap("ApiPath")
        private String apiPath;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("DeployedInfos")
        private DeployedInfos deployedInfos;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("TagList")
        private TagList tagList;

        @com.aliyun.core.annotation.NameInMap("Visibility")
        private String visibility;

        private ApiSummary(Builder builder) {
            this.apiId = builder.apiId;
            this.apiMethod = builder.apiMethod;
            this.apiName = builder.apiName;
            this.apiPath = builder.apiPath;
            this.createdTime = builder.createdTime;
            this.deployedInfos = builder.deployedInfos;
            this.description = builder.description;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.modifiedTime = builder.modifiedTime;
            this.regionId = builder.regionId;
            this.tagList = builder.tagList;
            this.visibility = builder.visibility;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiSummary create() {
            return builder().build();
        }

        /**
         * @return apiId
         */
        public String getApiId() {
            return this.apiId;
        }

        /**
         * @return apiMethod
         */
        public String getApiMethod() {
            return this.apiMethod;
        }

        /**
         * @return apiName
         */
        public String getApiName() {
            return this.apiName;
        }

        /**
         * @return apiPath
         */
        public String getApiPath() {
            return this.apiPath;
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return deployedInfos
         */
        public DeployedInfos getDeployedInfos() {
            return this.deployedInfos;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return tagList
         */
        public TagList getTagList() {
            return this.tagList;
        }

        /**
         * @return visibility
         */
        public String getVisibility() {
            return this.visibility;
        }

        public static final class Builder {
            private String apiId; 
            private String apiMethod; 
            private String apiName; 
            private String apiPath; 
            private String createdTime; 
            private DeployedInfos deployedInfos; 
            private String description; 
            private String groupId; 
            private String groupName; 
            private String modifiedTime; 
            private String regionId; 
            private TagList tagList; 
            private String visibility; 

            /**
             * The API ID.
             */
            public Builder apiId(String apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * The HTTP method of the API request.
             */
            public Builder apiMethod(String apiMethod) {
                this.apiMethod = apiMethod;
                return this;
            }

            /**
             * The API name.
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * The request path of the API.
             */
            public Builder apiPath(String apiPath) {
                this.apiPath = apiPath;
                return this;
            }

            /**
             * The time when the API was created. The time is displayed in UTC.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * The API publishing statuses.
             */
            public Builder deployedInfos(DeployedInfos deployedInfos) {
                this.deployedInfos = deployedInfos;
                return this;
            }

            /**
             * The API description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The API group ID.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The name of the API group to which the API belongs.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * The time when the API was modified. The time is displayed in UTC.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * The ID of the region to which the API belongs.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The tags that are added to the APIs.
             */
            public Builder tagList(TagList tagList) {
                this.tagList = tagList;
                return this;
            }

            /**
             * Indicates whether the API is public. Valid values:
             * <p>
             * 
             * *   **PUBLIC**: The API is public.
             * *   **PRIVATE**: The API is private.
             */
            public Builder visibility(String visibility) {
                this.visibility = visibility;
                return this;
            }

            public ApiSummary build() {
                return new ApiSummary(this);
            } 

        } 

    }
    public static class ApiSummarys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiSummary")
        private java.util.List < ApiSummary> apiSummary;

        private ApiSummarys(Builder builder) {
            this.apiSummary = builder.apiSummary;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiSummarys create() {
            return builder().build();
        }

        /**
         * @return apiSummary
         */
        public java.util.List < ApiSummary> getApiSummary() {
            return this.apiSummary;
        }

        public static final class Builder {
            private java.util.List < ApiSummary> apiSummary; 

            /**
             * ApiSummary.
             */
            public Builder apiSummary(java.util.List < ApiSummary> apiSummary) {
                this.apiSummary = apiSummary;
                return this;
            }

            public ApiSummarys build() {
                return new ApiSummarys(this);
            } 

        } 

    }
}
