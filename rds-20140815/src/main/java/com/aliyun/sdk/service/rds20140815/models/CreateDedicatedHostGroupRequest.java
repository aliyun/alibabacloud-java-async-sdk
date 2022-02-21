// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDedicatedHostGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateDedicatedHostGroupRequest</p>
 */
public class CreateDedicatedHostGroupRequest extends Request {
    @Query
    @NameInMap("AllocationPolicy")
    private String allocationPolicy;

    @Query
    @NameInMap("ClientToken")
    @Validation(required = true)
    private String clientToken;

    @Query
    @NameInMap("CpuAllocationRatio")
    private Integer cpuAllocationRatio;

    @Query
    @NameInMap("DiskAllocationRatio")
    private Integer diskAllocationRatio;

    @Query
    @NameInMap("Engine")
    @Validation(required = true)
    private String engine;

    @Query
    @NameInMap("HostReplacePolicy")
    private String hostReplacePolicy;

    @Query
    @NameInMap("MemAllocationRatio")
    private Integer memAllocationRatio;

    @Query
    @NameInMap("OpenPermission")
    private Integer openPermission;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

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
    @NameInMap("VPCId")
    @Validation(required = true)
    private String VPCId;

    private CreateDedicatedHostGroupRequest(Builder builder) {
        super(builder);
        this.allocationPolicy = builder.allocationPolicy;
        this.clientToken = builder.clientToken;
        this.cpuAllocationRatio = builder.cpuAllocationRatio;
        this.diskAllocationRatio = builder.diskAllocationRatio;
        this.engine = builder.engine;
        this.hostReplacePolicy = builder.hostReplacePolicy;
        this.memAllocationRatio = builder.memAllocationRatio;
        this.openPermission = builder.openPermission;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.VPCId = builder.VPCId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDedicatedHostGroupRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return cpuAllocationRatio
     */
    public Integer getCpuAllocationRatio() {
        return this.cpuAllocationRatio;
    }

    /**
     * @return diskAllocationRatio
     */
    public Integer getDiskAllocationRatio() {
        return this.diskAllocationRatio;
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
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
    public Integer getOpenPermission() {
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

    /**
     * @return VPCId
     */
    public String getVPCId() {
        return this.VPCId;
    }

    public static final class Builder extends Request.Builder<CreateDedicatedHostGroupRequest, Builder> {
        private String allocationPolicy; 
        private String clientToken; 
        private Integer cpuAllocationRatio; 
        private Integer diskAllocationRatio; 
        private String engine; 
        private String hostReplacePolicy; 
        private Integer memAllocationRatio; 
        private Integer openPermission; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String VPCId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDedicatedHostGroupRequest response) {
            super(response);
            this.allocationPolicy = response.allocationPolicy;
            this.clientToken = response.clientToken;
            this.cpuAllocationRatio = response.cpuAllocationRatio;
            this.diskAllocationRatio = response.diskAllocationRatio;
            this.engine = response.engine;
            this.hostReplacePolicy = response.hostReplacePolicy;
            this.memAllocationRatio = response.memAllocationRatio;
            this.openPermission = response.openPermission;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.VPCId = response.VPCId;
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
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
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
         * DiskAllocationRatio.
         */
        public Builder diskAllocationRatio(Integer diskAllocationRatio) {
            this.putQueryParameter("DiskAllocationRatio", diskAllocationRatio);
            this.diskAllocationRatio = diskAllocationRatio;
            return this;
        }

        /**
         * Engine.
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
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
        public Builder openPermission(Integer openPermission) {
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

        /**
         * VPCId.
         */
        public Builder VPCId(String VPCId) {
            this.putQueryParameter("VPCId", VPCId);
            this.VPCId = VPCId;
            return this;
        }

        @Override
        public CreateDedicatedHostGroupRequest build() {
            return new CreateDedicatedHostGroupRequest(this);
        } 

    } 

}
