// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cddc20200320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDedicatedHostGroupAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyDedicatedHostGroupAttributeRequest</p>
 */
public class ModifyDedicatedHostGroupAttributeRequest extends Request {
    @Query
    @NameInMap("AllocationPolicy")
    private String allocationPolicy;

    @Query
    @NameInMap("CpuAllocationRatio")
    private Integer cpuAllocationRatio;

    @Query
    @NameInMap("DedicatedHostGroupDesc")
    private String dedicatedHostGroupDesc;

    @Query
    @NameInMap("DedicatedHostGroupId")
    @Validation(required = true)
    private String dedicatedHostGroupId;

    @Query
    @NameInMap("DiskAllocationRatio")
    private Integer diskAllocationRatio;

    @Query
    @NameInMap("HostReplacePolicy")
    private String hostReplacePolicy;

    @Query
    @NameInMap("MemAllocationRatio")
    private Integer memAllocationRatio;

    @Query
    @NameInMap("OpenPermission")
    private String openPermission;

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

    private ModifyDedicatedHostGroupAttributeRequest(Builder builder) {
        super(builder);
        this.allocationPolicy = builder.allocationPolicy;
        this.cpuAllocationRatio = builder.cpuAllocationRatio;
        this.dedicatedHostGroupDesc = builder.dedicatedHostGroupDesc;
        this.dedicatedHostGroupId = builder.dedicatedHostGroupId;
        this.diskAllocationRatio = builder.diskAllocationRatio;
        this.hostReplacePolicy = builder.hostReplacePolicy;
        this.memAllocationRatio = builder.memAllocationRatio;
        this.openPermission = builder.openPermission;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDedicatedHostGroupAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allocationPolicy
     */
    public String getAllocationPolicy() {
        return this.allocationPolicy;
    }

    /**
     * @return cpuAllocationRatio
     */
    public Integer getCpuAllocationRatio() {
        return this.cpuAllocationRatio;
    }

    /**
     * @return dedicatedHostGroupDesc
     */
    public String getDedicatedHostGroupDesc() {
        return this.dedicatedHostGroupDesc;
    }

    /**
     * @return dedicatedHostGroupId
     */
    public String getDedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }

    /**
     * @return diskAllocationRatio
     */
    public Integer getDiskAllocationRatio() {
        return this.diskAllocationRatio;
    }

    /**
     * @return hostReplacePolicy
     */
    public String getHostReplacePolicy() {
        return this.hostReplacePolicy;
    }

    /**
     * @return memAllocationRatio
     */
    public Integer getMemAllocationRatio() {
        return this.memAllocationRatio;
    }

    /**
     * @return openPermission
     */
    public String getOpenPermission() {
        return this.openPermission;
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

    public static final class Builder extends Request.Builder<ModifyDedicatedHostGroupAttributeRequest, Builder> {
        private String allocationPolicy; 
        private Integer cpuAllocationRatio; 
        private String dedicatedHostGroupDesc; 
        private String dedicatedHostGroupId; 
        private Integer diskAllocationRatio; 
        private String hostReplacePolicy; 
        private Integer memAllocationRatio; 
        private String openPermission; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDedicatedHostGroupAttributeRequest request) {
            super(request);
            this.allocationPolicy = request.allocationPolicy;
            this.cpuAllocationRatio = request.cpuAllocationRatio;
            this.dedicatedHostGroupDesc = request.dedicatedHostGroupDesc;
            this.dedicatedHostGroupId = request.dedicatedHostGroupId;
            this.diskAllocationRatio = request.diskAllocationRatio;
            this.hostReplacePolicy = request.hostReplacePolicy;
            this.memAllocationRatio = request.memAllocationRatio;
            this.openPermission = request.openPermission;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * AllocationPolicy.
         */
        public Builder allocationPolicy(String allocationPolicy) {
            this.putQueryParameter("AllocationPolicy", allocationPolicy);
            this.allocationPolicy = allocationPolicy;
            return this;
        }

        /**
         * CpuAllocationRatio.
         */
        public Builder cpuAllocationRatio(Integer cpuAllocationRatio) {
            this.putQueryParameter("CpuAllocationRatio", cpuAllocationRatio);
            this.cpuAllocationRatio = cpuAllocationRatio;
            return this;
        }

        /**
         * DedicatedHostGroupDesc.
         */
        public Builder dedicatedHostGroupDesc(String dedicatedHostGroupDesc) {
            this.putQueryParameter("DedicatedHostGroupDesc", dedicatedHostGroupDesc);
            this.dedicatedHostGroupDesc = dedicatedHostGroupDesc;
            return this;
        }

        /**
         * DedicatedHostGroupId.
         */
        public Builder dedicatedHostGroupId(String dedicatedHostGroupId) {
            this.putQueryParameter("DedicatedHostGroupId", dedicatedHostGroupId);
            this.dedicatedHostGroupId = dedicatedHostGroupId;
            return this;
        }

        /**
         * DiskAllocationRatio.
         */
        public Builder diskAllocationRatio(Integer diskAllocationRatio) {
            this.putQueryParameter("DiskAllocationRatio", diskAllocationRatio);
            this.diskAllocationRatio = diskAllocationRatio;
            return this;
        }

        /**
         * HostReplacePolicy.
         */
        public Builder hostReplacePolicy(String hostReplacePolicy) {
            this.putQueryParameter("HostReplacePolicy", hostReplacePolicy);
            this.hostReplacePolicy = hostReplacePolicy;
            return this;
        }

        /**
         * MemAllocationRatio.
         */
        public Builder memAllocationRatio(Integer memAllocationRatio) {
            this.putQueryParameter("MemAllocationRatio", memAllocationRatio);
            this.memAllocationRatio = memAllocationRatio;
            return this;
        }

        /**
         * OpenPermission.
         */
        public Builder openPermission(String openPermission) {
            this.putQueryParameter("OpenPermission", openPermission);
            this.openPermission = openPermission;
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
         * RegionId.
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

        @Override
        public ModifyDedicatedHostGroupAttributeRequest build() {
            return new ModifyDedicatedHostGroupAttributeRequest(this);
        } 

    } 

}
