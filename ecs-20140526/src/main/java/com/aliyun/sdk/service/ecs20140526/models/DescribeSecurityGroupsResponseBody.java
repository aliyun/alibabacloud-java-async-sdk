// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSecurityGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSecurityGroupsResponseBody</p>
 */
public class DescribeSecurityGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityGroups")
    private SecurityGroups securityGroups;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeSecurityGroupsResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.securityGroups = builder.securityGroups;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSecurityGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return securityGroups
     */
    public SecurityGroups getSecurityGroups() {
        return this.securityGroups;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String requestId; 
        private SecurityGroups securityGroups; 
        private Integer totalCount; 

        /**
         * A pagination token. If the return value of this parameter is empty when MaxResults and NextToken are used for a paged query, no next page exists.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The page number.
         * <p>
         * 
         * > This parameter will be deprecated in the future. We recommend that you use NextToken and MaxResults for a paged query.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         * <p>
         * 
         * > This parameter will be deprecated in the future. We recommend that you use NextToken and MaxResults for a paged query.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The region ID of the security group.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
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
         * The information about the security groups.
         */
        public Builder securityGroups(SecurityGroups securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }

        /**
         * The total number of security groups returned. If `MaxResults` and `NextToken` are specified in the request, the value of this parameter is not returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSecurityGroupsResponseBody build() {
            return new DescribeSecurityGroupsResponseBody(this);
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
             * The key of the tag.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * The value of the tag.
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
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List < Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class SecurityGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableInstanceAmount")
        private Integer availableInstanceAmount;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EcsCount")
        private Integer ecsCount;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupName")
        private String securityGroupName;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupType")
        private String securityGroupType;

        @com.aliyun.core.annotation.NameInMap("ServiceID")
        private Long serviceID;

        @com.aliyun.core.annotation.NameInMap("ServiceManaged")
        private Boolean serviceManaged;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private SecurityGroup(Builder builder) {
            this.availableInstanceAmount = builder.availableInstanceAmount;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.ecsCount = builder.ecsCount;
            this.resourceGroupId = builder.resourceGroupId;
            this.securityGroupId = builder.securityGroupId;
            this.securityGroupName = builder.securityGroupName;
            this.securityGroupType = builder.securityGroupType;
            this.serviceID = builder.serviceID;
            this.serviceManaged = builder.serviceManaged;
            this.tags = builder.tags;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityGroup create() {
            return builder().build();
        }

        /**
         * @return availableInstanceAmount
         */
        public Integer getAvailableInstanceAmount() {
            return this.availableInstanceAmount;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return ecsCount
         */
        public Integer getEcsCount() {
            return this.ecsCount;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return securityGroupName
         */
        public String getSecurityGroupName() {
            return this.securityGroupName;
        }

        /**
         * @return securityGroupType
         */
        public String getSecurityGroupType() {
            return this.securityGroupType;
        }

        /**
         * @return serviceID
         */
        public Long getServiceID() {
            return this.serviceID;
        }

        /**
         * @return serviceManaged
         */
        public Boolean getServiceManaged() {
            return this.serviceManaged;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private Integer availableInstanceAmount; 
            private String creationTime; 
            private String description; 
            private Integer ecsCount; 
            private String resourceGroupId; 
            private String securityGroupId; 
            private String securityGroupName; 
            private String securityGroupType; 
            private Long serviceID; 
            private Boolean serviceManaged; 
            private Tags tags; 
            private String vpcId; 

            /**
             * The number of private IP addresses that can be added to the security group. For more information, see the "Security group capacity" section in [Basic security groups and advanced security groups](~~605897#section-kj9-e46-6v5~~).
             * <p>
             * 
             * If you set IsQueryEcsCount to True, the return value of AvailableInstanceAmount is valid.
             * 
             * >  This parameter is deprecated. The returned quantity is provided only for reference. The actual quantity may differ from the returned quantity.
             */
            public Builder availableInstanceAmount(Integer availableInstanceAmount) {
                this.availableInstanceAmount = availableInstanceAmount;
                return this;
            }

            /**
             * The time when the security group was created. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddThh:mmZ format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The description of the security group.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The number of private IP addresses that are contained in the security group. For more information, see the "Security group capacity" section in [Basic security groups and advanced security groups](~~605897#section-kj9-e46-6v5~~).
             * <p>
             * 
             * If you set IsQueryEcsCount to True, the return value of EcsCount is valid.
             * 
             * >  This parameter is deprecated. The returned quantity is provided only for reference. The actual quantity may differ from the returned quantity.
             */
            public Builder ecsCount(Integer ecsCount) {
                this.ecsCount = ecsCount;
                return this;
            }

            /**
             * The ID of the resource group to which the security group belongs.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The ID of the security group.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * The name of the security group.
             */
            public Builder securityGroupName(String securityGroupName) {
                this.securityGroupName = securityGroupName;
                return this;
            }

            /**
             * The type of the security group. Valid values:
             * <p>
             * 
             * *   normal: basic security group
             * *   enterprise: advanced security group
             */
            public Builder securityGroupType(String securityGroupType) {
                this.securityGroupType = securityGroupType;
                return this;
            }

            /**
             * The ID of the distributor to which the security group belongs.
             */
            public Builder serviceID(Long serviceID) {
                this.serviceID = serviceID;
                return this;
            }

            /**
             * Indicates whether the user of the security group is an Alibaba Cloud service or a distributor.
             */
            public Builder serviceManaged(Boolean serviceManaged) {
                this.serviceManaged = serviceManaged;
                return this;
            }

            /**
             * The tags of the security group.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The ID of the VPC to which the security group belongs.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public SecurityGroup build() {
                return new SecurityGroup(this);
            } 

        } 

    }
    public static class SecurityGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SecurityGroup")
        private java.util.List < SecurityGroup> securityGroup;

        private SecurityGroups(Builder builder) {
            this.securityGroup = builder.securityGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityGroups create() {
            return builder().build();
        }

        /**
         * @return securityGroup
         */
        public java.util.List < SecurityGroup> getSecurityGroup() {
            return this.securityGroup;
        }

        public static final class Builder {
            private java.util.List < SecurityGroup> securityGroup; 

            /**
             * SecurityGroup.
             */
            public Builder securityGroup(java.util.List < SecurityGroup> securityGroup) {
                this.securityGroup = securityGroup;
                return this;
            }

            public SecurityGroups build() {
                return new SecurityGroups(this);
            } 

        } 

    }
}
