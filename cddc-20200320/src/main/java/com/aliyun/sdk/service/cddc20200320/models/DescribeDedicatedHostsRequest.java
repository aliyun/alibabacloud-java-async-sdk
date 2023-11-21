// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cddc20200320.models;

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
    @NameInMap("PageNumbers")
    private Integer pageNumbers;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("Tags")
    private String tags;

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
        this.pageNumbers = builder.pageNumbers;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tags = builder.tags;
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
     * @return pageNumbers
     */
    public Integer getPageNumbers() {
        return this.pageNumbers;
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
     * @return tags
     */
    public String getTags() {
        return this.tags;
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
        private Integer pageNumbers; 
        private Integer pageSize; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String tags; 
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
            this.pageNumbers = request.pageNumbers;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.tags = request.tags;
            this.zoneId = request.zoneId;
        } 

        /**
         * Specifies whether instances can be deployed on the host. Valid values:
         * <p>
         * 
         * *   **Allocatable**: Instances can be deployed on the host.
         * *   **Suspended**: Instances cannot be deployed on the host.
         */
        public Builder allocationStatus(String allocationStatus) {
            this.putQueryParameter("AllocationStatus", allocationStatus);
            this.allocationStatus = allocationStatus;
            return this;
        }

        /**
         * The dedicated cluster ID. You can log on to the ApsaraDB for MyBase console and go to the **Dedicated Clusters** page to view the dedicated cluster ID.
         */
        public Builder dedicatedHostGroupId(String dedicatedHostGroupId) {
            this.putQueryParameter("DedicatedHostGroupId", dedicatedHostGroupId);
            this.dedicatedHostGroupId = dedicatedHostGroupId;
            return this;
        }

        /**
         * The ID of the host in the dedicated cluster. You can log on to the ApsaraDB for MyBase console and go to the **Hosts** page to view the host ID.
         */
        public Builder dedicatedHostId(String dedicatedHostId) {
            this.putQueryParameter("DedicatedHostId", dedicatedHostId);
            this.dedicatedHostId = dedicatedHostId;
            return this;
        }

        /**
         * The state of the host. Valid values:
         * <p>
         * 
         * *   **0**: The host is being created.
         * *   **1**: The host is running.
         * *   **2**: The host is faulty.
         * *   **3**: The host is ready for disabling.
         * *   **4**: The host is being maintained.
         * *   **5**: The host is disabled.
         * *   **6**: The host is restarting.
         * *   **7**: The host is locked.
         * 
         * >  When a host fails, the host is disabled. Before the host is disabled, the data of the instances that run on the host is migrated to another host.
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
         * *   **dhg_local_ssd**: local SSD.
         * *   **dhg_cloud_ssd** or **dhg_cloud_essd**: enhanced SSD (ESSD).
         */
        public Builder hostType(String hostType) {
            this.putQueryParameter("HostType", hostType);
            this.hostType = hostType;
            return this;
        }

        /**
         * The order ID. You can log on to the Billing Management console and go to the **Orders** page to view the order ID.
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
         * The page number.
         */
        public Builder pageNumbers(Integer pageNumbers) {
            this.putQueryParameter("PageNumbers", pageNumbers);
            this.pageNumbers = pageNumbers;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * [The region ID](~~198326~~).
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
         * The tags that are added to the host. Each tag is a key-value pair that consists of TagKey and TagValue. You can specify a maximum of five tags in the following format for each request: {"key1":"value1","key2":"value2"...}.
         * <p>
         * 
         * >  If you want to filter hosts based on tags, do not specify the **DedicatedHostId** parameter. Otherwise, the **DedicatedHostId** parameter is used to filter hosts.
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * The zone ID. You can call the [DescribeRegions](~~214103~~) operation to query the most recent zone list.
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
