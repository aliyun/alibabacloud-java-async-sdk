// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

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
    private String regionId;

    @Query
    @NameInMap("DedicatedHostId")
    private String dedicatedHostId;

    @Query
    @NameInMap("DedicatedHostClusterId")
    private String dedicatedHostClusterId;

    @Query
    @NameInMap("DedicatedHostName")
    private String dedicatedHostName;

    @Query
    @NameInMap("ActionOnMaintenance")
    private String actionOnMaintenance;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("AutoPlacement")
    private String autoPlacement;

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
        this.dedicatedHostClusterId = builder.dedicatedHostClusterId;
        this.dedicatedHostName = builder.dedicatedHostName;
        this.actionOnMaintenance = builder.actionOnMaintenance;
        this.description = builder.description;
        this.autoPlacement = builder.autoPlacement;
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
     * @return dedicatedHostClusterId
     */
    public String getDedicatedHostClusterId() {
        return this.dedicatedHostClusterId;
    }

    /**
     * @return dedicatedHostName
     */
    public String getDedicatedHostName() {
        return this.dedicatedHostName;
    }

    /**
     * @return actionOnMaintenance
     */
    public String getActionOnMaintenance() {
        return this.actionOnMaintenance;
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
        private String dedicatedHostClusterId; 
        private String dedicatedHostName; 
        private String actionOnMaintenance; 
        private String description; 
        private String autoPlacement; 
        private Float cpuOverCommitRatio; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDedicatedHostAttributeRequest response) {
            super(response);
            this.networkAttributes = response.networkAttributes;
            this.sourceRegionId = response.sourceRegionId;
            this.ownerId = response.ownerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.ownerAccount = response.ownerAccount;
            this.regionId = response.regionId;
            this.dedicatedHostId = response.dedicatedHostId;
            this.dedicatedHostClusterId = response.dedicatedHostClusterId;
            this.dedicatedHostName = response.dedicatedHostName;
            this.actionOnMaintenance = response.actionOnMaintenance;
            this.description = response.description;
            this.autoPlacement = response.autoPlacement;
            this.cpuOverCommitRatio = response.cpuOverCommitRatio;
        } 

        /**
         * NetworkAttributes.
         */
        public Builder networkAttributes(NetworkAttributes networkAttributes) {
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
         * The ID of the DDH cluster.
         */
        public Builder dedicatedHostClusterId(String dedicatedHostClusterId) {
            this.putQueryParameter("DedicatedHostClusterId", dedicatedHostClusterId);
            this.dedicatedHostClusterId = dedicatedHostClusterId;
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
         * When a dedicated host fails or is repaired online, you can configure a migration solution for the host. Valid values:
         * <p>
         * 
         * -Migrate: Migrate the instance to another physical machine and restart the instance.
         * 
         * -Stop: Stop the instance on the current DDH. After confirming that the DDH cannot be repaired, migrate the instance to another physical machine and restart the instance.
         * 
         * When proprietary host mounted is cloud when default: Migrate.
         * 
         * When proprietary host mount is local plate when default: Stop.
         */
        public Builder actionOnMaintenance(String actionOnMaintenance) {
            this.putQueryParameter("ActionOnMaintenance", actionOnMaintenance);
            this.actionOnMaintenance = actionOnMaintenance;
            return this;
        }

        /**
         * Proprietary host description. The description must be 2 to 256 characters in length and cannot start with http:// or https.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Set proprietary host whether to join automatic deployment resource pool. When you in proprietary host create an instance, but do not specify **DedicatedHostId** when Alibaba Cloud automatic from the resource pools Select proprietary host placed instance. Valid values:
         * <p>
         * 
         * -on: added to the automatic deployment resource pool.
         * 
         * -off: Does not add automatic deployment resource pool.
         * 
         * Automatic deployment feature details, please see [features](~~ 118938 ~~).
         */
        public Builder autoPlacement(String autoPlacement) {
            this.putQueryParameter("AutoPlacement", autoPlacement);
            this.autoPlacement = autoPlacement;
            return this;
        }

        /**
         * CPU oversold. You can set the CPU oversell ratio only for g6s, c6s, and r6s specifications. Valid values: 1 to 5.
         * <p>
         * 
         * CPU oversold ratio affects the number of available VCPUs of a DDH. The number of available vCPUs of a DDH = number of physical CPU cores * 2* CPU oversold ratio. For example, g6s of physical CPU audit for 52, if set CPU oversold than is 4, modify the complete rear vCPU total number is displayed as 416. For CPU absolute stability requirements harsh or CPU load not high scene, for example development test environment, lift oversold than can lift available vCPU number for deployment more equal dimension ECS instance, reduce the unit deployment costs.
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
