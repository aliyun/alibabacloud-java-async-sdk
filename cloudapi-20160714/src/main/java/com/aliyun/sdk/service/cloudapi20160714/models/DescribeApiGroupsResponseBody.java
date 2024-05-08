// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApiGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApiGroupsResponseBody</p>
 */
public class DescribeApiGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApiGroupAttributes")
    private ApiGroupAttributes apiGroupAttributes;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeApiGroupsResponseBody(Builder builder) {
        this.apiGroupAttributes = builder.apiGroupAttributes;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApiGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return apiGroupAttributes
     */
    public ApiGroupAttributes getApiGroupAttributes() {
        return this.apiGroupAttributes;
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
        private ApiGroupAttributes apiGroupAttributes; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The returned group set.
         */
        public Builder apiGroupAttributes(ApiGroupAttributes apiGroupAttributes) {
            this.apiGroupAttributes = apiGroupAttributes;
            return this;
        }

        /**
         * The number of pages to return the results on.
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

        public DescribeApiGroupsResponseBody build() {
            return new DescribeApiGroupsResponseBody(this);
        } 

    } 

    public static class TagInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private TagInfo(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagInfo create() {
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
             * The key of the tag.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the tag.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public TagInfo build() {
                return new TagInfo(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagInfo")
        private java.util.List < TagInfo> tagInfo;

        private Tags(Builder builder) {
            this.tagInfo = builder.tagInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagInfo
         */
        public java.util.List < TagInfo> getTagInfo() {
            return this.tagInfo;
        }

        public static final class Builder {
            private java.util.List < TagInfo> tagInfo; 

            /**
             * TagInfo.
             */
            public Builder tagInfo(java.util.List < TagInfo> tagInfo) {
                this.tagInfo = tagInfo;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class ApiGroupAttribute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BasePath")
        private String basePath;

        @com.aliyun.core.annotation.NameInMap("BillingStatus")
        private String billingStatus;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("HttpsPolicy")
        private String httpsPolicy;

        @com.aliyun.core.annotation.NameInMap("IllegalStatus")
        private String illegalStatus;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SubDomain")
        private String subDomain;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("TrafficLimit")
        private Integer trafficLimit;

        private ApiGroupAttribute(Builder builder) {
            this.basePath = builder.basePath;
            this.billingStatus = builder.billingStatus;
            this.createdTime = builder.createdTime;
            this.description = builder.description;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.httpsPolicy = builder.httpsPolicy;
            this.illegalStatus = builder.illegalStatus;
            this.instanceId = builder.instanceId;
            this.instanceType = builder.instanceType;
            this.modifiedTime = builder.modifiedTime;
            this.regionId = builder.regionId;
            this.subDomain = builder.subDomain;
            this.tags = builder.tags;
            this.trafficLimit = builder.trafficLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiGroupAttribute create() {
            return builder().build();
        }

        /**
         * @return basePath
         */
        public String getBasePath() {
            return this.basePath;
        }

        /**
         * @return billingStatus
         */
        public String getBillingStatus() {
            return this.billingStatus;
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
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
         * @return httpsPolicy
         */
        public String getHttpsPolicy() {
            return this.httpsPolicy;
        }

        /**
         * @return illegalStatus
         */
        public String getIllegalStatus() {
            return this.illegalStatus;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
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
         * @return subDomain
         */
        public String getSubDomain() {
            return this.subDomain;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return trafficLimit
         */
        public Integer getTrafficLimit() {
            return this.trafficLimit;
        }

        public static final class Builder {
            private String basePath; 
            private String billingStatus; 
            private String createdTime; 
            private String description; 
            private String groupId; 
            private String groupName; 
            private String httpsPolicy; 
            private String illegalStatus; 
            private String instanceId; 
            private String instanceType; 
            private String modifiedTime; 
            private String regionId; 
            private String subDomain; 
            private Tags tags; 
            private Integer trafficLimit; 

            /**
             * The basepath.
             */
            public Builder basePath(String basePath) {
                this.basePath = basePath;
                return this;
            }

            /**
             * The billing status of the API group. Valid values:
             * <p>
             * 
             * *   **NORMAL**: The instance is normal.
             * *   **LOCKED**: The API group is locked due to overdue payments.
             */
            public Builder billingStatus(String billingStatus) {
                this.billingStatus = billingStatus;
                return this;
            }

            /**
             * The creation time (UTC) of the API group.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * Group Description
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the API group. This ID is generated by the system and globally unique.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The name of the API group.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * The HTTPS security policy
             */
            public Builder httpsPolicy(String httpsPolicy) {
                this.httpsPolicy = httpsPolicy;
                return this;
            }

            /**
             * The validity status of the API group. Valid values:
             * <p>
             * 
             * *   **NORMAL**: The instance is normal.
             * *   **LOCKED**: The API group is locked because it is not valid.
             */
            public Builder illegalStatus(String illegalStatus) {
                this.illegalStatus = illegalStatus;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The type of the instance.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The last modification time (UTC) of the API group.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * The region to which the API group belongs.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The second-level domain name that corresponds to the API group and is used by the CNAME of the custom domain name.
             */
            public Builder subDomain(String subDomain) {
                this.subDomain = subDomain;
                return this;
            }

            /**
             * The list of tags.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The upper QPS limit of the API group. The default value is 500. You can increase the upper limit by submitting an application.
             */
            public Builder trafficLimit(Integer trafficLimit) {
                this.trafficLimit = trafficLimit;
                return this;
            }

            public ApiGroupAttribute build() {
                return new ApiGroupAttribute(this);
            } 

        } 

    }
    public static class ApiGroupAttributes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiGroupAttribute")
        private java.util.List < ApiGroupAttribute> apiGroupAttribute;

        private ApiGroupAttributes(Builder builder) {
            this.apiGroupAttribute = builder.apiGroupAttribute;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiGroupAttributes create() {
            return builder().build();
        }

        /**
         * @return apiGroupAttribute
         */
        public java.util.List < ApiGroupAttribute> getApiGroupAttribute() {
            return this.apiGroupAttribute;
        }

        public static final class Builder {
            private java.util.List < ApiGroupAttribute> apiGroupAttribute; 

            /**
             * ApiGroupAttribute.
             */
            public Builder apiGroupAttribute(java.util.List < ApiGroupAttribute> apiGroupAttribute) {
                this.apiGroupAttribute = apiGroupAttribute;
                return this;
            }

            public ApiGroupAttributes build() {
                return new ApiGroupAttributes(this);
            } 

        } 

    }
}
