// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The returned group set.</p>
         */
        public Builder apiGroupAttributes(ApiGroupAttributes apiGroupAttributes) {
            this.apiGroupAttributes = apiGroupAttributes;
            return this;
        }

        /**
         * <p>The number of pages to return the results on.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>D6E46F10-F26C-4AA0-BB69-FE2743D9AE62</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeApiGroupsResponseBody build() {
            return new DescribeApiGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApiGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApiGroupsResponseBody</p>
     */
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
             * <p>The key of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>value</p>
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
    /**
     * 
     * {@link DescribeApiGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApiGroupsResponseBody</p>
     */
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
    /**
     * 
     * {@link DescribeApiGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApiGroupsResponseBody</p>
     */
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
             * <p>The basepath.</p>
             * 
             * <strong>example:</strong>
             * <p>/v2/</p>
             */
            public Builder basePath(String basePath) {
                this.basePath = basePath;
                return this;
            }

            /**
             * <p>The billing status of the API group. Valid values:</p>
             * <ul>
             * <li><strong>NORMAL</strong>: The instance is normal.</li>
             * <li><strong>LOCKED</strong>: The API group is locked due to overdue payments.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder billingStatus(String billingStatus) {
                this.billingStatus = billingStatus;
                return this;
            }

            /**
             * <p>The creation time (UTC) of the API group.</p>
             * 
             * <strong>example:</strong>
             * <p>2016-08-01T08:45:15Z</p>
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>Group Description</p>
             * 
             * <strong>example:</strong>
             * <p>TrafficInformations.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the API group. This ID is generated by the system and globally unique.</p>
             * 
             * <strong>example:</strong>
             * <p>be6d2abcc0dd4f749fc2d2edd6567164</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The name of the API group.</p>
             * 
             * <strong>example:</strong>
             * <p>Traffic</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The HTTPS security policy</p>
             * 
             * <strong>example:</strong>
             * <p>HTTPS2_TLS1_0</p>
             */
            public Builder httpsPolicy(String httpsPolicy) {
                this.httpsPolicy = httpsPolicy;
                return this;
            }

            /**
             * <p>The validity status of the API group. Valid values:</p>
             * <ul>
             * <li><strong>NORMAL</strong>: The instance is normal.</li>
             * <li><strong>LOCKED</strong>: The API group is locked because it is not valid.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder illegalStatus(String illegalStatus) {
                this.illegalStatus = illegalStatus;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>apigateway-cn-v6419k43245xx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The type of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>VPC_SHARED</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The last modification time (UTC) of the API group.</p>
             * 
             * <strong>example:</strong>
             * <p>2016-08-01T08:45:15Z</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The region to which the API group belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The second-level domain name that corresponds to the API group and is used by the CNAME of the custom domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>be6d2abcc0dd4f749fc2d2edd6567164-cn-hangzhou.alicloudapi.com</p>
             */
            public Builder subDomain(String subDomain) {
                this.subDomain = subDomain;
                return this;
            }

            /**
             * <p>The list of tags.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The upper QPS limit of the API group. The default value is 500. You can increase the upper limit by submitting an application.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
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
    /**
     * 
     * {@link DescribeApiGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApiGroupsResponseBody</p>
     */
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
