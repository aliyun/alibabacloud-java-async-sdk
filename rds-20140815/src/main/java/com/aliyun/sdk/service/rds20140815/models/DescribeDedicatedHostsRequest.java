// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDedicatedHostsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDedicatedHostsRequest</p>
 */
public class DescribeDedicatedHostsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllocationStatus")
    private String allocationStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DedicatedHostGroupId")
    private String dedicatedHostGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DedicatedHostId")
    private String dedicatedHostId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostStatus")
    private String hostStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostType")
    private String hostType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderId")
    private Long orderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
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
         * <p>Specifies whether instances can be deployed on the host. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Instances cannot be deployed on the host.</li>
         * <li><strong>1</strong>: Instances can be deployed on the host.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder allocationStatus(String allocationStatus) {
            this.putQueryParameter("AllocationStatus", allocationStatus);
            this.allocationStatus = allocationStatus;
            return this;
        }

        /**
         * <p>The dedicated cluster ID. You can call the DescribeDedicatedHostGroups operation to query the dedicated cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dhg-7a9xxxxxxxx</p>
         */
        public Builder dedicatedHostGroupId(String dedicatedHostGroupId) {
            this.putQueryParameter("DedicatedHostGroupId", dedicatedHostGroupId);
            this.dedicatedHostGroupId = dedicatedHostGroupId;
            return this;
        }

        /**
         * <p>The ID of the host in the dedicated cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>ch-t4nn100ddxxxxxxxx</p>
         */
        public Builder dedicatedHostId(String dedicatedHostId) {
            this.putQueryParameter("DedicatedHostId", dedicatedHostId);
            this.dedicatedHostId = dedicatedHostId;
            return this;
        }

        /**
         * <p>The status of the host. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: creating</li>
         * <li><strong>1</strong>: running</li>
         * <li><strong>2</strong>: faulty</li>
         * <li><strong>3</strong>: being replaced</li>
         * <li><strong>4</strong>: deprecated</li>
         * <li><strong>5</strong>: deleting</li>
         * <li><strong>6</strong>: restarting</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder hostStatus(String hostStatus) {
            this.putQueryParameter("HostStatus", hostStatus);
            this.hostStatus = hostStatus;
            return this;
        }

        /**
         * <p>The storage type of the host. Valid values:</p>
         * <ul>
         * <li><strong>dhg_cloud_ssd</strong>: enhanced SSD (ESSD)</li>
         * <li><strong>dhg_local_ssd</strong>: local SSD</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dhg_cloud_ssd</p>
         */
        public Builder hostType(String hostType) {
            this.putQueryParameter("HostType", hostType);
            this.hostType = hostType;
            return this;
        }

        /**
         * <p>The order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>102565235</p>
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
         * <p>The region ID. You can call the DescribeRegions operation to query the most recent region list.</p>
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
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
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
