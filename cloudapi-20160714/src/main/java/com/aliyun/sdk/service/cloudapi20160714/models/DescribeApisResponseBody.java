// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApisResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApisResponseBody</p>
 */
public class DescribeApisResponseBody extends TeaModel {
    @NameInMap("ApiSummarys")
    private ApiSummarys apiSummarys;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * The returned API definition. It is an array that consists of ApiSummary data.
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
         * The ID of the request.
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
        @NameInMap("DeployedStatus")
        private String deployedStatus;

        @NameInMap("EffectiveVersion")
        private String effectiveVersion;

        @NameInMap("StageName")
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
             * DeployedStatus.
             */
            public Builder deployedStatus(String deployedStatus) {
                this.deployedStatus = deployedStatus;
                return this;
            }

            /**
             * EffectiveVersion.
             */
            public Builder effectiveVersion(String effectiveVersion) {
                this.effectiveVersion = effectiveVersion;
                return this;
            }

            /**
             * StageName.
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
        @NameInMap("DeployedInfo")
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
        @NameInMap("TagKey")
        private String tagKey;

        @NameInMap("TagValue")
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
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
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
        @NameInMap("Tag")
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
        @NameInMap("ApiId")
        private String apiId;

        @NameInMap("ApiMethod")
        private String apiMethod;

        @NameInMap("ApiName")
        private String apiName;

        @NameInMap("ApiPath")
        private String apiPath;

        @NameInMap("CreatedTime")
        private String createdTime;

        @NameInMap("DeployedInfos")
        private DeployedInfos deployedInfos;

        @NameInMap("Description")
        private String description;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("TagList")
        private TagList tagList;

        @NameInMap("Visibility")
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
             * The ID of the API.
             */
            public Builder apiId(String apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * ApiMethod.
             */
            public Builder apiMethod(String apiMethod) {
                this.apiMethod = apiMethod;
                return this;
            }

            /**
             * The name of the API operation.
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * ApiPath.
             */
            public Builder apiPath(String apiPath) {
                this.apiPath = apiPath;
                return this;
            }

            /**
             * The creation time (UTC) of the query task.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * DeployedInfos.
             */
            public Builder deployedInfos(DeployedInfos deployedInfos) {
                this.deployedInfos = deployedInfos;
                return this;
            }

            /**
             * The description of the API.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the API group.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The name of the group to which the API belongs.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * The modification time (UTC) of the API.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * The ID of the region in which the API resides.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * TagList.
             */
            public Builder tagList(TagList tagList) {
                this.tagList = tagList;
                return this;
            }

            /**
             * Indicates whether the API is public. Valid values:
             * <p>
             * 
             * *   **PUBLIC**
             * *   **PRIVATE**
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
        @NameInMap("ApiSummary")
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
