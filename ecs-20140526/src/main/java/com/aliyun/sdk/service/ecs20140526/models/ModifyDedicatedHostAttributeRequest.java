// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDedicatedHostAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyDedicatedHostAttributeRequest</p>
 */
public class ModifyDedicatedHostAttributeRequest extends Request {
    @Query
    @NameInMap("NetworkAttributes")
    private NetworkAttributes networkAttributes;

    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("DedicatedHostId")
    @Validation(required = true)
    private String dedicatedHostId;

    @Query
    @NameInMap("DedicatedHostName")
    private String dedicatedHostName;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("AutoPlacement")
    private String autoPlacement;

    @Query
    @NameInMap("DedicatedHostClusterId")
    private String dedicatedHostClusterId;

    @Query
    @NameInMap("ActionOnMaintenance")
    private String actionOnMaintenance;

    @Query
    @NameInMap("CpuOverCommitRatio")
    private Float cpuOverCommitRatio;

    private ModifyDedicatedHostAttributeRequest(Builder builder) {
        super(builder);
        this.networkAttributes = builder.networkAttributes;
        this.sourceRegionId = builder.sourceRegionId;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.ownerAccount = builder.ownerAccount;
        this.regionId = builder.regionId;
        this.dedicatedHostId = builder.dedicatedHostId;
        this.dedicatedHostName = builder.dedicatedHostName;
        this.description = builder.description;
        this.autoPlacement = builder.autoPlacement;
        this.dedicatedHostClusterId = builder.dedicatedHostClusterId;
        this.actionOnMaintenance = builder.actionOnMaintenance;
        this.cpuOverCommitRatio = builder.cpuOverCommitRatio;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDedicatedHostAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return networkAttributes
     */
    public NetworkAttributes getNetworkAttributes() {
        return this.networkAttributes;
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return dedicatedHostId
     */
    public String getDedicatedHostId() {
        return this.dedicatedHostId;
    }

    /**
     * @return dedicatedHostName
     */
    public String getDedicatedHostName() {
        return this.dedicatedHostName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return autoPlacement
     */
    public String getAutoPlacement() {
        return this.autoPlacement;
    }

    /**
     * @return dedicatedHostClusterId
     */
    public String getDedicatedHostClusterId() {
        return this.dedicatedHostClusterId;
    }

    /**
     * @return actionOnMaintenance
     */
    public String getActionOnMaintenance() {
        return this.actionOnMaintenance;
    }

    /**
     * @return cpuOverCommitRatio
     */
    public Float getCpuOverCommitRatio() {
        return this.cpuOverCommitRatio;
    }

    public static final class Builder extends Request.Builder<ModifyDedicatedHostAttributeRequest, Builder> {
        private NetworkAttributes networkAttributes; 
        private String sourceRegionId; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String ownerAccount; 
        private String regionId; 
        private String dedicatedHostId; 
        private String dedicatedHostName; 
        private String description; 
        private String autoPlacement; 
        private String dedicatedHostClusterId; 
        private String actionOnMaintenance; 
        private Float cpuOverCommitRatio; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDedicatedHostAttributeRequest request) {
            super(request);
            this.networkAttributes = request.networkAttributes;
            this.sourceRegionId = request.sourceRegionId;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.ownerAccount = request.ownerAccount;
            this.regionId = request.regionId;
            this.dedicatedHostId = request.dedicatedHostId;
            this.dedicatedHostName = request.dedicatedHostName;
            this.description = request.description;
            this.autoPlacement = request.autoPlacement;
            this.dedicatedHostClusterId = request.dedicatedHostClusterId;
            this.actionOnMaintenance = request.actionOnMaintenance;
            this.cpuOverCommitRatio = request.cpuOverCommitRatio;
        } 

        /**
         * NetworkAttributes.
         */
        public Builder networkAttributes(NetworkAttributes networkAttributes) {
            this.putQueryParameter("NetworkAttributes", networkAttributes);
            this.networkAttributes = networkAttributes;
            return this;
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
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
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
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * The ID of the region to which the dedicated host belongs. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the dedicated host.
         */
        public Builder dedicatedHostId(String dedicatedHostId) {
            this.putQueryParameter("DedicatedHostId", dedicatedHostId);
            this.dedicatedHostId = dedicatedHostId;
            return this;
        }

        /**
         * The name of the dedicated host. The description must be 2 to 128 characters in length. It must start with a letter and cannot start with http:// or https. It can contain numbers, colons (:), underscores (_), and hyphens (-).
         */
        public Builder dedicatedHostName(String dedicatedHostName) {
            this.putQueryParameter("DedicatedHostName", dedicatedHostName);
            this.dedicatedHostName = dedicatedHostName;
            return this;
        }

        /**
         * The description of the dedicated host. The description must be 2 to 256 characters in length and cannot start with http:// or https.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Specifies whether the dedicated host is added to the automatic deployment resource pool. When you create an instance on a DDH without specifying **DedicatedHostId**, Alibaba Cloud automatically selects a DDH from the resource pool to place the instance. Valid values:
         * <p>
         * 
         * -on: added to the automatic deployment resource pool.
         * 
         * -off: does not join the automatic deployment resource pool.
         * 
         * For more information, see [features](~~ 118938 ~~).
         */
        public Builder autoPlacement(String autoPlacement) {
            this.putQueryParameter("AutoPlacement", autoPlacement);
            this.autoPlacement = autoPlacement;
            return this;
        }

        /**
         * The ID of the DDH cluster.
         */
        public Builder dedicatedHostClusterId(String dedicatedHostClusterId) {
            this.putQueryParameter("DedicatedHostClusterId", dedicatedHostClusterId);
            this.dedicatedHostClusterId = dedicatedHostClusterId;
            return this;
        }

        /**
         * When a dedicated host fails or is repaired online, you can configure a migration solution for the host. Valid values:
         * <p>
         * 
         * -Migrate: Migrate the instance to another physical machine and restart the instance.
         * 
         * -Stop: Stop the instance on the current DDH. After confirming that the DDH cannot be repaired, migrate the instance to another physical machine and restart the instance.
         * 
         * If a cloud disk is attached to a dedicated host, the default value is Migrate.
         * 
         * If a local disk is mounted on a dedicated host, the default value is Stop.
         */
        public Builder actionOnMaintenance(String actionOnMaintenance) {
            this.putQueryParameter("ActionOnMaintenance", actionOnMaintenance);
            this.actionOnMaintenance = actionOnMaintenance;
            return this;
        }

        /**
         * CPU oversold ratio. You can set the CPU oversell ratio only for g6s, c6s, and r6s specifications. Valid values: 1 to 5.
         * <p>
         * 
         * CPU oversold ratio affects the number of available vcpus of a DDH. The number of available vcpus of a DDH = number of physical CPU cores * 2* CPU oversold ratio. For example, the number of physical CPU cores of g6s is 52. If the CPU oversell ratio is set to 4, the total number of vcpus after modification is 416. For scenarios where the absolute stability of CPU is not strict or the CPU load is not high, for example, in the development and testing environment, increasing the overselling ratio can increase the number of available vCPU, which is used to deploy more ECS instances of the same specification and reduce the unit deployment cost.
         * 
         * 
         */
        public Builder cpuOverCommitRatio(Float cpuOverCommitRatio) {
            this.putQueryParameter("CpuOverCommitRatio", cpuOverCommitRatio);
            this.cpuOverCommitRatio = cpuOverCommitRatio;
            return this;
        }

        @Override
        public ModifyDedicatedHostAttributeRequest build() {
            return new ModifyDedicatedHostAttributeRequest(this);
        } 

    } 

    public static class NetworkAttributes extends TeaModel {
        @NameInMap("SlbUdpTimeout")
        private Integer slbUdpTimeout;

        @NameInMap("UdpTimeout")
        private Integer udpTimeout;

        private NetworkAttributes(Builder builder) {
            this.slbUdpTimeout = builder.slbUdpTimeout;
            this.udpTimeout = builder.udpTimeout;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkAttributes create() {
            return builder().build();
        }

        /**
         * @return slbUdpTimeout
         */
        public Integer getSlbUdpTimeout() {
            return this.slbUdpTimeout;
        }

        /**
         * @return udpTimeout
         */
        public Integer getUdpTimeout() {
            return this.udpTimeout;
        }

        public static final class Builder {
            private Integer slbUdpTimeout; 
            private Integer udpTimeout; 

            /**
             * The UDP session timeout period of the SLB connection. Unit: seconds. Valid values: 15 to 310
             */
            public Builder slbUdpTimeout(Integer slbUdpTimeout) {
                this.slbUdpTimeout = slbUdpTimeout;
                return this;
            }

            /**
             * Set the UDP session timeout period for user access for cloud services running on the DDH. Unit: seconds. Valid values: 15 to 310
             */
            public Builder udpTimeout(Integer udpTimeout) {
                this.udpTimeout = udpTimeout;
                return this;
            }

            public NetworkAttributes build() {
                return new NetworkAttributes(this);
            } 

        } 

    }
}
