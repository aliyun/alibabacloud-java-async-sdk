// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDedicatedHostsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDedicatedHostsRequest</p>
 */
public class DescribeDedicatedHostsRequest extends Request {
    @Query
    @NameInMap("AllocationStatus")
    private String allocationStatus;

    @Query
    @NameInMap("DedicatedHostGroupId")
    private String dedicatedHostGroupId;

    @Query
    @NameInMap("DedicatedHostId")
    private String dedicatedHostId;

    @Query
    @NameInMap("HostStatus")
    private String hostStatus;

    @Query
    @NameInMap("HostType")
    private String hostType;

    @Query
    @NameInMap("OrderId")
    private Long orderId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    private DescribeDedicatedHostsRequest(Builder builder) {
        super(builder);
        this.allocationStatus = builder.allocationStatus;
        this.dedicatedHostGroupId = builder.dedicatedHostGroupId;
        this.dedicatedHostId = builder.dedicatedHostId;
        this.hostStatus = builder.hostStatus;
        this.hostType = builder.hostType;
        this.orderId = builder.orderId;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDedicatedHostsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allocationStatus
     */
    public String getAllocationStatus() {
        return this.allocationStatus;
    }

    /**
     * @return dedicatedHostGroupId
     */
    public String getDedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }

    /**
     * @return dedicatedHostId
     */
    public String getDedicatedHostId() {
        return this.dedicatedHostId;
    }

    /**
     * @return hostStatus
     */
    public String getHostStatus() {
        return this.hostStatus;
    }

    /**
     * @return hostType
     */
    public String getHostType() {
        return this.hostType;
    }

    /**
     * @return orderId
     */
    public Long getOrderId() {
        return this.orderId;
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

    public static final class Builder extends Request.Builder<DescribeDedicatedHostsRequest, Builder> {
        private String allocationStatus; 
        private String dedicatedHostGroupId; 
        private String dedicatedHostId; 
        private String hostStatus; 
        private String hostType; 
        private Long orderId; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDedicatedHostsRequest request) {
            super(request);
            this.allocationStatus = request.allocationStatus;
            this.dedicatedHostGroupId = request.dedicatedHostGroupId;
            this.dedicatedHostId = request.dedicatedHostId;
            this.hostStatus = request.hostStatus;
            this.hostType = request.hostType;
            this.orderId = request.orderId;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.zoneId = request.zoneId;
        } 

        /**
         * Specifies whether instances can be deployed on the host. Valid values:
         * <p>
         * 
         * *   **0**: Instances cannot be deployed on the host.
         * *   **1**: Instances can be deployed on the host.
         */
        public Builder allocationStatus(String allocationStatus) {
            this.putQueryParameter("AllocationStatus", allocationStatus);
            this.allocationStatus = allocationStatus;
            return this;
        }

        /**
         * The dedicated cluster ID. You can call the DescribeDedicatedHostGroups operation to query the dedicated cluster ID.
         */
        public Builder dedicatedHostGroupId(String dedicatedHostGroupId) {
            this.putQueryParameter("DedicatedHostGroupId", dedicatedHostGroupId);
            this.dedicatedHostGroupId = dedicatedHostGroupId;
            return this;
        }

        /**
         * The ID of the host in the dedicated cluster.
         */
        public Builder dedicatedHostId(String dedicatedHostId) {
            this.putQueryParameter("DedicatedHostId", dedicatedHostId);
            this.dedicatedHostId = dedicatedHostId;
            return this;
        }

        /**
         * The status of the host. Valid values:
         * <p>
         * 
         * *   **0**: creating
         * *   **1**: running
         * *   **2**: faulty
         * *   **3**: being replaced
         * *   **4**: deprecated
         * *   **5**: deleting
         * *   **6**: restarting
         */
        public Builder hostStatus(String hostStatus) {
            this.putQueryParameter("HostStatus", hostStatus);
            this.hostStatus = hostStatus;
            return this;
        }

        /**
         * The storage type of the host. Valid values:
         * <p>
         * 
         * *   **dhg_cloud_ssd**: enhanced SSD (ESSD)
         * *   **dhg_local_ssd**: local SSD
         */
        public Builder hostType(String hostType) {
            this.putQueryParameter("HostType", hostType);
            this.hostType = hostType;
            return this;
        }

        /**
         * The order ID.
         */
        public Builder orderId(Long orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
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
         * The region ID. You can call the DescribeRegions operation to query the most recent region list.
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
         * The zone ID.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public DescribeDedicatedHostsRequest build() {
            return new DescribeDedicatedHostsRequest(this);
        } 

    } 

}
