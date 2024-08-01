// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAccountAttributesRequest} extends {@link RequestModel}
 *
 * <p>DescribeAccountAttributesRequest</p>
 */
public class DescribeAccountAttributesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AttributeName")
    private java.util.List < String > attributeName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private DescribeAccountAttributesRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.attributeName = builder.attributeName;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccountAttributesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return attributeName
     */
    public java.util.List < String > getAttributeName() {
        return this.attributeName;
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
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<DescribeAccountAttributesRequest, Builder> {
        private String sourceRegionId; 
        private java.util.List < String > attributeName; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAccountAttributesRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.attributeName = request.attributeName;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.zoneId = request.zoneId;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * The type of resource quota N. Valid values of N: 1 to 8. Valid values:
         * <p>
         * 
         * *   instance-network-type: the available network types.
         * 
         * *   max-security-groups: the maximum number of security groups.
         * 
         * *   max-elastic-network-interfaces: the maximum number of ENIs.
         * 
         * *   max-postpaid-instance-vcpu-count: the maximum number of vCPUs for pay-as-you-go instances.
         * 
         * *   max-spot-instance-vcpu-count: the maximum number of vCPUs for preemptible instances.
         * 
         * *   used-postpaid-instance-vcpu-count: the number of vCPUs that have been allocated to pay-as-you-go instances.
         * 
         * *   used-spot-instance-vcpu-count: the number of vCPUs that have been allocated to preemptible instances.
         * 
         * *   max-postpaid-yundisk-capacity: the maximum capacity of pay-as-you-go data disks. (The value is deprecated.)
         * 
         * *   used-postpaid-yundisk-capacity: the capacity of pay-as-you-go data disks that have been created. (The value is deprecated.)
         * 
         * *   max-dedicated-hosts: the maximum number of dedicated hosts.
         * 
         * *   supported-postpaid-instance-types: the instance types of pay-as-you-go I/O optimized instances.
         * 
         * *   max-axt-command-count: the maximum number of Cloud Assistant commands.
         * 
         * *   max-axt-invocation-daily: the maximum number of Cloud Assistant command executions per day.
         * 
         * *   real-name-authentication: whether the account has completed the real-name verification.
         * 
         *     **
         * 
         *     **Note** To create an ECS instance in a region in the Chinese mainland, you must complete the real-name verification.
         * 
         * *   max-cloud-assistant-activation-count: the maximum number of activation codes that can be created to use to register managed instances.
         * 
         * This parameter is empty by default.
         */
        public Builder attributeName(java.util.List < String > attributeName) {
            this.putQueryParameter("AttributeName", attributeName);
            this.attributeName = attributeName;
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
         * The ID of the region. You can call the [DescribeRegions](~~25609~~) operation to query the most recent list of regions.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * The ID of the zone in which the resource resides.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public DescribeAccountAttributesRequest build() {
            return new DescribeAccountAttributesRequest(this);
        } 

    } 

}
