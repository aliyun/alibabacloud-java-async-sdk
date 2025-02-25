// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeContainerGroupsRequest} extends {@link RequestModel}
 *
 * <p>DescribeContainerGroupsRequest</p>
 */
public class DescribeContainerGroupsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComputeCategory")
    private String computeCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContainerGroupIds")
    private String containerGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContainerGroupName")
    private String containerGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Limit")
    private Integer limit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    private String securityGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List < Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WithEvent")
    private Boolean withEvent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private DescribeContainerGroupsRequest(Builder builder) {
        super(builder);
        this.computeCategory = builder.computeCategory;
        this.containerGroupIds = builder.containerGroupIds;
        this.containerGroupName = builder.containerGroupName;
        this.limit = builder.limit;
        this.nextToken = builder.nextToken;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityGroupId = builder.securityGroupId;
        this.status = builder.status;
        this.tag = builder.tag;
        this.vSwitchId = builder.vSwitchId;
        this.withEvent = builder.withEvent;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeContainerGroupsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return computeCategory
     */
    public String getComputeCategory() {
        return this.computeCategory;
    }

    /**
     * @return containerGroupIds
     */
    public String getContainerGroupIds() {
        return this.containerGroupIds;
    }

    /**
     * @return containerGroupName
     */
    public String getContainerGroupName() {
        return this.containerGroupName;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return withEvent
     */
    public Boolean getWithEvent() {
        return this.withEvent;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<DescribeContainerGroupsRequest, Builder> {
        private String computeCategory; 
        private String containerGroupIds; 
        private String containerGroupName; 
        private Integer limit; 
        private String nextToken; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String securityGroupId; 
        private String status; 
        private java.util.List < Tag> tag; 
        private String vSwitchId; 
        private Boolean withEvent; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeContainerGroupsRequest request) {
            super(request);
            this.computeCategory = request.computeCategory;
            this.containerGroupIds = request.containerGroupIds;
            this.containerGroupName = request.containerGroupName;
            this.limit = request.limit;
            this.nextToken = request.nextToken;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.securityGroupId = request.securityGroupId;
            this.status = request.status;
            this.tag = request.tag;
            this.vSwitchId = request.vSwitchId;
            this.withEvent = request.withEvent;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>The compute category of the instance. Valid values:</p>
         * <ul>
         * <li>economy</li>
         * <li>general</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>economy</p>
         */
        public Builder computeCategory(String computeCategory) {
            this.putQueryParameter("ComputeCategory", computeCategory);
            this.computeCategory = computeCategory;
            return this;
        }

        /**
         * <p>The IDs of the elastic container instances in JSON format. You can specify up to 20 IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;eci-bp17gw49eu09yiwm****&quot;, &quot;eci-bp19aq49du01abcm****&quot;, &quot;eci-2zegym1qhbmdfr1s****&quot;]</p>
         */
        public Builder containerGroupIds(String containerGroupIds) {
            this.putQueryParameter("ContainerGroupIds", containerGroupIds);
            this.containerGroupIds = containerGroupIds;
            return this;
        }

        /**
         * <p>The name of the elastic container instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder containerGroupName(String containerGroupName) {
            this.putQueryParameter("ContainerGroupName", containerGroupName);
            this.containerGroupName = containerGroupName;
            return this;
        }

        /**
         * <p>The maximum number of resources to return. Default value: 20. Maximum value: 20.</p>
         * <blockquote>
         * <p> The number of returned resources is less than or equal to the specified number.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * <p>The token that determines the start point of the query. If this parameter is left empty, all results have been returned.</p>
         * <blockquote>
         * <p>You do not need to specify this parameter in the first request. Starting from the second request, you can obtain the token from the result returned by the previous request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>d78f2dd8-5979-42fe-****-b16db43be5bc</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The region ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzh43v*****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The ID of the security group to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-uf66jeqopgqa9hdn****</p>
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * <p>The status of the elastic container instance. Valid values:</p>
         * <ul>
         * <li>Pending: The instance is being started.</li>
         * <li>Running: The instance is running.</li>
         * <li>Succeeded: The instance runs successfully.</li>
         * <li>Failed: The instance fails to run.</li>
         * <li>Scheduling: The instance is being created.</li>
         * <li>ScheduleFailed: The instance fails to be created.</li>
         * <li>Restarting: The instance is being restarted.</li>
         * <li>Updating: The instance is being updated.</li>
         * <li>Terminating: The instance is being terminated.</li>
         * <li>Expired: The instance expires.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The tag of the instances.</p>
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The ID of the vSwitch to which the elastic container instances are connected.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1jrgfqqy54kg5hc****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>Specify whether to return event information.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder withEvent(Boolean withEvent) {
            this.putQueryParameter("WithEvent", withEvent);
            this.withEvent = withEvent;
            return this;
        }

        /**
         * <p>The ID of the zone in which the elastic container instances are deployed. If you do not specify this parameter, the system selects a zone.</p>
         * <p>This parameter is empty by default.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public DescribeContainerGroupsRequest build() {
            return new DescribeContainerGroupsRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeContainerGroupsRequest} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupsRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
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
             * <p>The tag key of the instances.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the instances.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
