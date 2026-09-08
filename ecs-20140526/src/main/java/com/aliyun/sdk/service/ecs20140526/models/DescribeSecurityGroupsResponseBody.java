// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeSecurityGroupsResponseBody model) {
            this.nextToken = model.nextToken;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.securityGroups = model.securityGroups;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The pagination token returned in this invoke. If this value is empty when you use MaxResults and NextToken for paged query with paging, no more data is available.</p>
         * 
         * <strong>example:</strong>
         * <p>e71d8a535bd9cc11</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * <blockquote>
         * <p>This parameter will be offline soon. Use NextToken and MaxResults for paged query and paging operations.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * <blockquote>
         * <p>This parameter will be offline soon. Use NextToken and MaxResults for paged query and paging operations.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID of the security group.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SecurityGroups.
         */
        public Builder securityGroups(SecurityGroups securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }

        /**
         * <p>The total number of security groups. This parameter is not returned when you use <code>MaxResults</code> and <code>NextToken</code> parameter query.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSecurityGroupsResponseBody build() {
            return new DescribeSecurityGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSecurityGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSecurityGroupsResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

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
    /**
     * 
     * {@link DescribeSecurityGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSecurityGroupsResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List<Tag> tag;

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
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List<Tag> tag; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tag = model.tag;
            } 

            /**
             * Tag.
             */
            public Builder tag(java.util.List<Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSecurityGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSecurityGroupsResponseBody</p>
     */
    public static class SecurityGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableInstanceAmount")
        private Integer availableInstanceAmount;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EcsCount")
        private Integer ecsCount;

        @com.aliyun.core.annotation.NameInMap("GroupToGroupRuleCount")
        private Integer groupToGroupRuleCount;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("RuleCount")
        private Integer ruleCount;

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
            this.groupToGroupRuleCount = builder.groupToGroupRuleCount;
            this.resourceGroupId = builder.resourceGroupId;
            this.ruleCount = builder.ruleCount;
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
         * @return groupToGroupRuleCount
         */
        public Integer getGroupToGroupRuleCount() {
            return this.groupToGroupRuleCount;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return ruleCount
         */
        public Integer getRuleCount() {
            return this.ruleCount;
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
            private Integer groupToGroupRuleCount; 
            private String resourceGroupId; 
            private Integer ruleCount; 
            private String securityGroupId; 
            private String securityGroupName; 
            private String securityGroupType; 
            private Long serviceID; 
            private Boolean serviceManaged; 
            private Tags tags; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(SecurityGroup model) {
                this.availableInstanceAmount = model.availableInstanceAmount;
                this.creationTime = model.creationTime;
                this.description = model.description;
                this.ecsCount = model.ecsCount;
                this.groupToGroupRuleCount = model.groupToGroupRuleCount;
                this.resourceGroupId = model.resourceGroupId;
                this.ruleCount = model.ruleCount;
                this.securityGroupId = model.securityGroupId;
                this.securityGroupName = model.securityGroupName;
                this.securityGroupType = model.securityGroupType;
                this.serviceID = model.serviceID;
                this.serviceManaged = model.serviceManaged;
                this.tags = model.tags;
                this.vpcId = model.vpcId;
            } 

            /**
             * AvailableInstanceAmount.
             */
            public Builder availableInstanceAmount(Integer availableInstanceAmount) {
                this.availableInstanceAmount = availableInstanceAmount;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
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
             * EcsCount.
             */
            public Builder ecsCount(Integer ecsCount) {
                this.ecsCount = ecsCount;
                return this;
            }

            /**
             * GroupToGroupRuleCount.
             */
            public Builder groupToGroupRuleCount(Integer groupToGroupRuleCount) {
                this.groupToGroupRuleCount = groupToGroupRuleCount;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * RuleCount.
             */
            public Builder ruleCount(Integer ruleCount) {
                this.ruleCount = ruleCount;
                return this;
            }

            /**
             * SecurityGroupId.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * SecurityGroupName.
             */
            public Builder securityGroupName(String securityGroupName) {
                this.securityGroupName = securityGroupName;
                return this;
            }

            /**
             * SecurityGroupType.
             */
            public Builder securityGroupType(String securityGroupType) {
                this.securityGroupType = securityGroupType;
                return this;
            }

            /**
             * ServiceID.
             */
            public Builder serviceID(Long serviceID) {
                this.serviceID = serviceID;
                return this;
            }

            /**
             * ServiceManaged.
             */
            public Builder serviceManaged(Boolean serviceManaged) {
                this.serviceManaged = serviceManaged;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * VpcId.
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
    /**
     * 
     * {@link DescribeSecurityGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSecurityGroupsResponseBody</p>
     */
    public static class SecurityGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SecurityGroup")
        private java.util.List<SecurityGroup> securityGroup;

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
        public java.util.List<SecurityGroup> getSecurityGroup() {
            return this.securityGroup;
        }

        public static final class Builder {
            private java.util.List<SecurityGroup> securityGroup; 

            private Builder() {
            } 

            private Builder(SecurityGroups model) {
                this.securityGroup = model.securityGroup;
            } 

            /**
             * SecurityGroup.
             */
            public Builder securityGroup(java.util.List<SecurityGroup> securityGroup) {
                this.securityGroup = securityGroup;
                return this;
            }

            public SecurityGroups build() {
                return new SecurityGroups(this);
            } 

        } 

    }
}
