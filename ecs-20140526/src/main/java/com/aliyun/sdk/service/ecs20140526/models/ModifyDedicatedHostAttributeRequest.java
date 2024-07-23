// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDedicatedHostAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyDedicatedHostAttributeRequest</p>
 */
public class ModifyDedicatedHostAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkAttributes")
    private NetworkAttributes networkAttributes;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActionOnMaintenance")
    private String actionOnMaintenance;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPlacement")
    private String autoPlacement;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CpuOverCommitRatio")
    private Float cpuOverCommitRatio;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DedicatedHostClusterId")
    private String dedicatedHostClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DedicatedHostId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dedicatedHostId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DedicatedHostName")
    private String dedicatedHostName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

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
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ModifyDedicatedHostAttributeRequest(Builder builder) {
        super(builder);
        this.networkAttributes = builder.networkAttributes;
        this.sourceRegionId = builder.sourceRegionId;
        this.actionOnMaintenance = builder.actionOnMaintenance;
        this.autoPlacement = builder.autoPlacement;
        this.cpuOverCommitRatio = builder.cpuOverCommitRatio;
        this.dedicatedHostClusterId = builder.dedicatedHostClusterId;
        this.dedicatedHostId = builder.dedicatedHostId;
        this.dedicatedHostName = builder.dedicatedHostName;
        this.description = builder.description;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
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
     * @return actionOnMaintenance
     */
    public String getActionOnMaintenance() {
        return this.actionOnMaintenance;
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

    /**
     * @return dedicatedHostClusterId
     */
    public String getDedicatedHostClusterId() {
        return this.dedicatedHostClusterId;
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

    public static final class Builder extends Request.Builder<ModifyDedicatedHostAttributeRequest, Builder> {
        private NetworkAttributes networkAttributes; 
        private String sourceRegionId; 
        private String actionOnMaintenance; 
        private String autoPlacement; 
        private Float cpuOverCommitRatio; 
        private String dedicatedHostClusterId; 
        private String dedicatedHostId; 
        private String dedicatedHostName; 
        private String description; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDedicatedHostAttributeRequest request) {
            super(request);
            this.networkAttributes = request.networkAttributes;
            this.sourceRegionId = request.sourceRegionId;
            this.actionOnMaintenance = request.actionOnMaintenance;
            this.autoPlacement = request.autoPlacement;
            this.cpuOverCommitRatio = request.cpuOverCommitRatio;
            this.dedicatedHostClusterId = request.dedicatedHostClusterId;
            this.dedicatedHostId = request.dedicatedHostId;
            this.dedicatedHostName = request.dedicatedHostName;
            this.description = request.description;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
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
         * The policy for migrating the instances deployed on the dedicated host when the dedicated host fails or needs to be repaired online. Valid values:
         * <p>
         * 
         * *   Migrate: The instances are migrated to another physical machine and then restarted.
         * *   Stop: The instances are stopped. If the dedicated host cannot be repaired, the instances are migrated to another physical machine and then restarted.
         * 
         * If the dedicated host has cloud disks attached, the default value is Migrate.
         * 
         * If the dedicated host has local disks attached, the default value is Stop.
         */
        public Builder actionOnMaintenance(String actionOnMaintenance) {
            this.putQueryParameter("ActionOnMaintenance", actionOnMaintenance);
            this.actionOnMaintenance = actionOnMaintenance;
            return this;
        }

        /**
         * Specifies whether to add the dedicated host to the resource pool for automatic deployment. If you do not specify **DedicatedHostId** when you create an instance on a dedicated host, Alibaba Cloud automatically selects a dedicated host from the resource pool to host the instance. Valid values:
         * <p>
         * 
         * *   on: adds the dedicated host to the resource pool for automatic deployment.
         * *   off: does not add the dedicated host to the resource pool for automatic deployment.
         * 
         * For information about automatic deployment, see [Functions and features](~~118938~~).
         */
        public Builder autoPlacement(String autoPlacement) {
            this.putQueryParameter("AutoPlacement", autoPlacement);
            this.autoPlacement = autoPlacement;
            return this;
        }

        /**
         * The CPU overcommit ratio. You can configure CPU overcommit ratios only for the following dedicated host types: g6s, c6s, and r6s. Valid values: 1 to 5.
         * <p>
         * 
         * The CPU overcommit ratio affects the number of available vCPUs on a dedicated host. You can use the following formula to calculate the number of available vCPUs on a dedicated host: Number of available vCPUs = Number of physical CPU cores × 2 × CPU overcommit ratio. For example, the number of physical CPU cores on each g6s dedicated host is 52. If you change the CPU overcommit ratio of a g6s dedicated host to 4, the number of available vCPUs on the dedicated host is 416. For scenarios that have minimal requirements for CPU stability or where CPU load is not heavy, such as development and test environments, you can increase the number of available vCPUs on a dedicated host by increasing the CPU overcommit ratio. This allows you to deploy more ECS instances of the same specifications on the dedicated host and reduce the unit deployment cost.
         */
        public Builder cpuOverCommitRatio(Float cpuOverCommitRatio) {
            this.putQueryParameter("CpuOverCommitRatio", cpuOverCommitRatio);
            this.cpuOverCommitRatio = cpuOverCommitRatio;
            return this;
        }

        /**
         * The ID of the dedicated host cluster to which to assign the dedicated host.
         */
        public Builder dedicatedHostClusterId(String dedicatedHostClusterId) {
            this.putQueryParameter("DedicatedHostClusterId", dedicatedHostClusterId);
            this.dedicatedHostClusterId = dedicatedHostClusterId;
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
         * The name of the dedicated host. The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with http:// or https://. The name can contain letters, digits, colons (:), underscores (\_), and hyphens (-).
         */
        public Builder dedicatedHostName(String dedicatedHostName) {
            this.putQueryParameter("DedicatedHostName", dedicatedHostName);
            this.dedicatedHostName = dedicatedHostName;
            return this;
        }

        /**
         * The description of the dedicated host. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
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
         * The ID of the region where the dedicated host resides. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
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
        public ModifyDedicatedHostAttributeRequest build() {
            return new ModifyDedicatedHostAttributeRequest(this);
        } 

    } 

    public static class NetworkAttributes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SlbUdpTimeout")
        private Integer slbUdpTimeout;

        @com.aliyun.core.annotation.NameInMap("UdpTimeout")
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
             * The timeout period for a UDP session between a Server Load Balancer (SLB) instance and the dedicated host. Unit: seconds. Valid values: 15 to 310.
             */
            public Builder slbUdpTimeout(Integer slbUdpTimeout) {
                this.slbUdpTimeout = slbUdpTimeout;
                return this;
            }

            /**
             * The timeout period for a UDP session between a user and an Alibaba Cloud service on the dedicated host. Unit: seconds. Valid values: 15 to 310.
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
