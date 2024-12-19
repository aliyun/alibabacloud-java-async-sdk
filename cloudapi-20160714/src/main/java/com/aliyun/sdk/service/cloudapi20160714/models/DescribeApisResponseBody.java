// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The queried API definitions.</p>
         */
        public Builder apiSummarys(ApiSummarys apiSummarys) {
            this.apiSummarys = apiSummarys;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BZ002</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeApisResponseBody build() {
            return new DescribeApisResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApisResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApisResponseBody</p>
     */
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
             * <p>The deployment status. Valid values: DEPLOYED and NONDEPLOYED.</p>
             * 
             * <strong>example:</strong>
             * <p>DEPLOYED</p>
             */
            public Builder deployedStatus(String deployedStatus) {
                this.deployedStatus = deployedStatus;
                return this;
            }

            /**
             * <p>The deployed version.</p>
             * 
             * <strong>example:</strong>
             * <p>20220103170737313</p>
             */
            public Builder effectiveVersion(String effectiveVersion) {
                this.effectiveVersion = effectiveVersion;
                return this;
            }

            /**
             * <p>Stage Name:</p>
             * <ul>
             * <li><strong>RELEASE</strong>: production environment</li>
             * <li><strong>PRE</strong>: staging environment</li>
             * <li><strong>TEST</strong>: test environment</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RELEASE</p>
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
    /**
     * 
     * {@link DescribeApisResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApisResponseBody</p>
     */
    public static class DeployedInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeployedInfo")
        private java.util.List<DeployedInfo> deployedInfo;

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
        public java.util.List<DeployedInfo> getDeployedInfo() {
            return this.deployedInfo;
        }

        public static final class Builder {
            private java.util.List<DeployedInfo> deployedInfo; 

            /**
             * DeployedInfo.
             */
            public Builder deployedInfo(java.util.List<DeployedInfo> deployedInfo) {
                this.deployedInfo = deployedInfo;
                return this;
            }

            public DeployedInfos build() {
                return new DeployedInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApisResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApisResponseBody</p>
     */
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
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>tagKey</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>tagValue</p>
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
    /**
     * 
     * {@link DescribeApisResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApisResponseBody</p>
     */
    public static class TagList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List<Tag> tag;

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
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List<Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List<Tag> tag) {
                this.tag = tag;
                return this;
            }

            public TagList build() {
                return new TagList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApisResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApisResponseBody</p>
     */
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
             * <p>The API ID.</p>
             * 
             * <strong>example:</strong>
             * <p>5af418828f0344a3b588c0cc1331a3bc</p>
             */
            public Builder apiId(String apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * <p>The HTTP method of the API request.</p>
             * 
             * <strong>example:</strong>
             * <p>GET</p>
             */
            public Builder apiMethod(String apiMethod) {
                this.apiMethod = apiMethod;
                return this;
            }

            /**
             * <p>The API name.</p>
             * 
             * <strong>example:</strong>
             * <p>CreateObject</p>
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * <p>The request path of the API.</p>
             * 
             * <strong>example:</strong>
             * <p>/sqb/</p>
             */
            public Builder apiPath(String apiPath) {
                this.apiPath = apiPath;
                return this;
            }

            /**
             * <p>The time when the API was created. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2016-05-20T18:18:25Z</p>
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The API publishing statuses.</p>
             */
            public Builder deployedInfos(DeployedInfos deployedInfos) {
                this.deployedInfos = deployedInfos;
                return this;
            }

            /**
             * <p>The API description.</p>
             * 
             * <strong>example:</strong>
             * <p>Creates an object</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The API group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1084f9034c744137901057206b39d2b6</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The name of the API group to which the API belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>myGroup2</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The time when the API was modified. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2016-07-23T08:28:48Z</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The ID of the region to which the API belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-qingdao</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The tags that are added to the APIs.</p>
             */
            public Builder tagList(TagList tagList) {
                this.tagList = tagList;
                return this;
            }

            /**
             * <p>Indicates whether the API is public. Valid values:</p>
             * <ul>
             * <li><strong>PUBLIC</strong>: The API is public.</li>
             * <li><strong>PRIVATE</strong>: The API is private.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PUBLIC</p>
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
    /**
     * 
     * {@link DescribeApisResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApisResponseBody</p>
     */
    public static class ApiSummarys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiSummary")
        private java.util.List<ApiSummary> apiSummary;

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
        public java.util.List<ApiSummary> getApiSummary() {
            return this.apiSummary;
        }

        public static final class Builder {
            private java.util.List<ApiSummary> apiSummary; 

            /**
             * ApiSummary.
             */
            public Builder apiSummary(java.util.List<ApiSummary> apiSummary) {
                this.apiSummary = apiSummary;
                return this;
            }

            public ApiSummarys build() {
                return new ApiSummarys(this);
            } 

        } 

    }
}
