// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApiGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApiGroupsResponseBody</p>
 */
public class DescribeApiGroupsResponseBody extends TeaModel {
    @NameInMap("ApiGroupAttributes")
    private ApiGroupAttributes apiGroupAttributes;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * ApiGroupAttributes.
         */
        public Builder apiGroupAttributes(ApiGroupAttributes apiGroupAttributes) {
            this.apiGroupAttributes = apiGroupAttributes;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeApiGroupsResponseBody build() {
            return new DescribeApiGroupsResponseBody(this);
        } 

    } 

    public static class ApiGroupAttribute extends TeaModel {
        @NameInMap("BillingStatus")
        private String billingStatus;

        @NameInMap("CreatedTime")
        private String createdTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("HttpsPolicy")
        private String httpsPolicy;

        @NameInMap("IllegalStatus")
        private String illegalStatus;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("SubDomain")
        private String subDomain;

        @NameInMap("TrafficLimit")
        private Integer trafficLimit;

        private ApiGroupAttribute(Builder builder) {
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
            this.trafficLimit = builder.trafficLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiGroupAttribute create() {
            return builder().build();
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
         * @return trafficLimit
         */
        public Integer getTrafficLimit() {
            return this.trafficLimit;
        }

        public static final class Builder {
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
            private Integer trafficLimit; 

            /**
             * BillingStatus.
             */
            public Builder billingStatus(String billingStatus) {
                this.billingStatus = billingStatus;
                return this;
            }

            /**
             * CreatedTime.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * HttpsPolicy.
             */
            public Builder httpsPolicy(String httpsPolicy) {
                this.httpsPolicy = httpsPolicy;
                return this;
            }

            /**
             * IllegalStatus.
             */
            public Builder illegalStatus(String illegalStatus) {
                this.illegalStatus = illegalStatus;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * SubDomain.
             */
            public Builder subDomain(String subDomain) {
                this.subDomain = subDomain;
                return this;
            }

            /**
             * TrafficLimit.
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
        @NameInMap("ApiGroupAttribute")
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
