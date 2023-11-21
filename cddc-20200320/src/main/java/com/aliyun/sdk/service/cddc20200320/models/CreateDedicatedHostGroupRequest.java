// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cddc20200320.models;

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
    @NameInMap("DedicatedHostGroupDesc")
    private String dedicatedHostGroupDesc;

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
        this.dedicatedHostGroupDesc = builder.dedicatedHostGroupDesc;
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
     * @return dedicatedHostGroupDesc
     */
    public String getDedicatedHostGroupDesc() {
        return this.dedicatedHostGroupDesc;
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
        private String dedicatedHostGroupDesc; 
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

        private Builder(CreateDedicatedHostGroupRequest request) {
            super(request);
            this.allocationPolicy = request.allocationPolicy;
            this.clientToken = request.clientToken;
            this.cpuAllocationRatio = request.cpuAllocationRatio;
            this.dedicatedHostGroupDesc = request.dedicatedHostGroupDesc;
            this.diskAllocationRatio = request.diskAllocationRatio;
            this.engine = request.engine;
            this.hostReplacePolicy = request.hostReplacePolicy;
            this.memAllocationRatio = request.memAllocationRatio;
            this.openPermission = request.openPermission;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.VPCId = request.VPCId;
        } 

        /**
         * The policy that is used to allocate resources in the dedicated cluster. Valid values:
         * <p>
         * 
         * *   **Evenly** (default): The system preferentially deploys database instances on the hosts where no resources or fewer resources are allocated. This maximizes system stability.
         * *   **Intensively**: The system preferentially deploys database instances on the hosts that are created earlier and have more allocated resources. This maximizes resource utilization.
         */
        public Builder allocationPolicy(String allocationPolicy) {
            this.putQueryParameter("AllocationPolicy", allocationPolicy);
            this.allocationPolicy = allocationPolicy;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The CPU overcommit ratio of the dedicated cluster.
         * <p>
         * 
         * >  Unit: %. Valid values: **100** to **300**. Default value: **200**, which specifies that the total amount of CPU resources allocated to all instances is twice the amount of actual CPU resources. This helps you maximize CPU utilization.
         */
        public Builder cpuAllocationRatio(Integer cpuAllocationRatio) {
            this.putQueryParameter("CpuAllocationRatio", cpuAllocationRatio);
            this.cpuAllocationRatio = cpuAllocationRatio;
            return this;
        }

        /**
         * The name of the dedicated cluster. The name must be 1 to 64 characters in length and can contain letters, digits, underscores (\_), and hyphens (-). The name must start with a letter.
         */
        public Builder dedicatedHostGroupDesc(String dedicatedHostGroupDesc) {
            this.putQueryParameter("DedicatedHostGroupDesc", dedicatedHostGroupDesc);
            this.dedicatedHostGroupDesc = dedicatedHostGroupDesc;
            return this;
        }

        /**
         * The storage overcommit ratio of the dedicated cluster.
         * <p>
         * 
         * >  Unit: %. Valid values: **100** to **300**. Default value: **200**, which specifies that the total amount of storage resources allocated to all instances is twice the amount of actual storage resources. This helps you maximize storage usage. This parameter does not take effect for dedicated clusters that run SQL Server.
         */
        public Builder diskAllocationRatio(Integer diskAllocationRatio) {
            this.putQueryParameter("DiskAllocationRatio", diskAllocationRatio);
            this.diskAllocationRatio = diskAllocationRatio;
            return this;
        }

        /**
         * The database engine of the dedicated cluster. Valid values:
         * <p>
         * 
         * *   **MySQL**
         * *   **SQL Server**
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * The policy that is used to handle host failures. Valid values:
         * <p>
         * 
         * *   **Auto** (default): The system automatically replaces faulty hosts.
         * *   **Manual**: You must manually replace faulty hosts.
         * 
         * >  When you create a dedicated cluster that runs **MySQL**, you can select a policy based on your business requirements. For dedicated clusters that run other database engines, the default value **Auto** is used.
         */
        public Builder hostReplacePolicy(String hostReplacePolicy) {
            this.putQueryParameter("HostReplacePolicy", hostReplacePolicy);
            this.hostReplacePolicy = hostReplacePolicy;
            return this;
        }

        /**
         * The maximum memory usage of each host in the dedicated cluster.
         * <p>
         * 
         * >  Unit: %. Valid values: **0** to **100**. Default value: **100**.
         */
        public Builder memAllocationRatio(Integer memAllocationRatio) {
            this.putQueryParameter("MemAllocationRatio", memAllocationRatio);
            this.memAllocationRatio = memAllocationRatio;
            return this;
        }

        /**
         * Specifies whether to grant the host OS permissions. Valid values:
         * <p>
         * 
         * *   **0**: no.
         * *   **1**: yes.
         * 
         * >  When you create a dedicated cluster that runs **MySQL or SQL Server**, you can grant the host OS permissions based on your business requirements. For dedicated clusters that run other database engines, the default value **0** is used. When you create an ApsaraDB MyBase for SQL Server dedicated cluster, you must set this parameter to 1.
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
         * The region ID. For more information, see [Region IDs](~~198326~~).
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
         * The ID of the virtual private cloud (VPC) where you want to create the dedicated cluster. You can log on to the VPC console and click **VPCs** in the left-side navigation pane to view the VPC ID.
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
