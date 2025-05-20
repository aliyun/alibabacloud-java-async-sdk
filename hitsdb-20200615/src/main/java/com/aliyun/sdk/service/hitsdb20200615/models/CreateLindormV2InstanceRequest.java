// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateLindormV2InstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateLindormV2InstanceRequest</p>
 */
public class CreateLindormV2InstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ArbiterVSwitchId")
    private String arbiterVSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ArbiterZoneId")
    private String arbiterZoneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ArchVersion")
    private String archVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenewDuration")
    private String autoRenewDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenewal")
    private Boolean autoRenewal;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CapacityStorageSize")
    private Integer capacityStorageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudStorageSize")
    private Integer cloudStorageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudStorageType")
    private String cloudStorageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterMode")
    private String clusterMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterPattern")
    private String clusterPattern;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Duration")
    private Integer duration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableCapacityStorage")
    private Boolean enableCapacityStorage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EngineList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<EngineList> engineList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceAlias")
    private String instanceAlias;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String payType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PricingCycle")
    private String pricingCycle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrimaryVSwitchId")
    private String primaryVSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrimaryZoneId")
    private String primaryZoneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StandbyVSwitchId")
    private String standbyVSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StandbyZoneId")
    private String standbyZoneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VPCId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String VPCId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String zoneId;

    private CreateLindormV2InstanceRequest(Builder builder) {
        super(builder);
        this.arbiterVSwitchId = builder.arbiterVSwitchId;
        this.arbiterZoneId = builder.arbiterZoneId;
        this.archVersion = builder.archVersion;
        this.autoRenewDuration = builder.autoRenewDuration;
        this.autoRenewal = builder.autoRenewal;
        this.capacityStorageSize = builder.capacityStorageSize;
        this.cloudStorageSize = builder.cloudStorageSize;
        this.cloudStorageType = builder.cloudStorageType;
        this.clusterMode = builder.clusterMode;
        this.clusterPattern = builder.clusterPattern;
        this.duration = builder.duration;
        this.enableCapacityStorage = builder.enableCapacityStorage;
        this.engineList = builder.engineList;
        this.instanceAlias = builder.instanceAlias;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.payType = builder.payType;
        this.pricingCycle = builder.pricingCycle;
        this.primaryVSwitchId = builder.primaryVSwitchId;
        this.primaryZoneId = builder.primaryZoneId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityToken = builder.securityToken;
        this.standbyVSwitchId = builder.standbyVSwitchId;
        this.standbyZoneId = builder.standbyZoneId;
        this.VPCId = builder.VPCId;
        this.vSwitchId = builder.vSwitchId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLindormV2InstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return arbiterVSwitchId
     */
    public String getArbiterVSwitchId() {
        return this.arbiterVSwitchId;
    }

    /**
     * @return arbiterZoneId
     */
    public String getArbiterZoneId() {
        return this.arbiterZoneId;
    }

    /**
     * @return archVersion
     */
    public String getArchVersion() {
        return this.archVersion;
    }

    /**
     * @return autoRenewDuration
     */
    public String getAutoRenewDuration() {
        return this.autoRenewDuration;
    }

    /**
     * @return autoRenewal
     */
    public Boolean getAutoRenewal() {
        return this.autoRenewal;
    }

    /**
     * @return capacityStorageSize
     */
    public Integer getCapacityStorageSize() {
        return this.capacityStorageSize;
    }

    /**
     * @return cloudStorageSize
     */
    public Integer getCloudStorageSize() {
        return this.cloudStorageSize;
    }

    /**
     * @return cloudStorageType
     */
    public String getCloudStorageType() {
        return this.cloudStorageType;
    }

    /**
     * @return clusterMode
     */
    public String getClusterMode() {
        return this.clusterMode;
    }

    /**
     * @return clusterPattern
     */
    public String getClusterPattern() {
        return this.clusterPattern;
    }

    /**
     * @return duration
     */
    public Integer getDuration() {
        return this.duration;
    }

    /**
     * @return enableCapacityStorage
     */
    public Boolean getEnableCapacityStorage() {
        return this.enableCapacityStorage;
    }

    /**
     * @return engineList
     */
    public java.util.List<EngineList> getEngineList() {
        return this.engineList;
    }

    /**
     * @return instanceAlias
     */
    public String getInstanceAlias() {
        return this.instanceAlias;
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
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return pricingCycle
     */
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    /**
     * @return primaryVSwitchId
     */
    public String getPrimaryVSwitchId() {
        return this.primaryVSwitchId;
    }

    /**
     * @return primaryZoneId
     */
    public String getPrimaryZoneId() {
        return this.primaryZoneId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return standbyVSwitchId
     */
    public String getStandbyVSwitchId() {
        return this.standbyVSwitchId;
    }

    /**
     * @return standbyZoneId
     */
    public String getStandbyZoneId() {
        return this.standbyZoneId;
    }

    /**
     * @return VPCId
     */
    public String getVPCId() {
        return this.VPCId;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreateLindormV2InstanceRequest, Builder> {
        private String arbiterVSwitchId; 
        private String arbiterZoneId; 
        private String archVersion; 
        private String autoRenewDuration; 
        private Boolean autoRenewal; 
        private Integer capacityStorageSize; 
        private Integer cloudStorageSize; 
        private String cloudStorageType; 
        private String clusterMode; 
        private String clusterPattern; 
        private Integer duration; 
        private Boolean enableCapacityStorage; 
        private java.util.List<EngineList> engineList; 
        private String instanceAlias; 
        private String ownerAccount; 
        private Long ownerId; 
        private String payType; 
        private String pricingCycle; 
        private String primaryVSwitchId; 
        private String primaryZoneId; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String securityToken; 
        private String standbyVSwitchId; 
        private String standbyZoneId; 
        private String VPCId; 
        private String vSwitchId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateLindormV2InstanceRequest request) {
            super(request);
            this.arbiterVSwitchId = request.arbiterVSwitchId;
            this.arbiterZoneId = request.arbiterZoneId;
            this.archVersion = request.archVersion;
            this.autoRenewDuration = request.autoRenewDuration;
            this.autoRenewal = request.autoRenewal;
            this.capacityStorageSize = request.capacityStorageSize;
            this.cloudStorageSize = request.cloudStorageSize;
            this.cloudStorageType = request.cloudStorageType;
            this.clusterMode = request.clusterMode;
            this.clusterPattern = request.clusterPattern;
            this.duration = request.duration;
            this.enableCapacityStorage = request.enableCapacityStorage;
            this.engineList = request.engineList;
            this.instanceAlias = request.instanceAlias;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.payType = request.payType;
            this.pricingCycle = request.pricingCycle;
            this.primaryVSwitchId = request.primaryVSwitchId;
            this.primaryZoneId = request.primaryZoneId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.securityToken = request.securityToken;
            this.standbyVSwitchId = request.standbyVSwitchId;
            this.standbyZoneId = request.standbyZoneId;
            this.VPCId = request.VPCId;
            this.vSwitchId = request.vSwitchId;
            this.zoneId = request.zoneId;
        } 

        /**
         * ArbiterVSwitchId.
         */
        public Builder arbiterVSwitchId(String arbiterVSwitchId) {
            this.putQueryParameter("ArbiterVSwitchId", arbiterVSwitchId);
            this.arbiterVSwitchId = arbiterVSwitchId;
            return this;
        }

        /**
         * ArbiterZoneId.
         */
        public Builder arbiterZoneId(String arbiterZoneId) {
            this.putQueryParameter("ArbiterZoneId", arbiterZoneId);
            this.arbiterZoneId = arbiterZoneId;
            return this;
        }

        /**
         * ArchVersion.
         */
        public Builder archVersion(String archVersion) {
            this.putQueryParameter("ArchVersion", archVersion);
            this.archVersion = archVersion;
            return this;
        }

        /**
         * AutoRenewDuration.
         */
        public Builder autoRenewDuration(String autoRenewDuration) {
            this.putQueryParameter("AutoRenewDuration", autoRenewDuration);
            this.autoRenewDuration = autoRenewDuration;
            return this;
        }

        /**
         * AutoRenewal.
         */
        public Builder autoRenewal(Boolean autoRenewal) {
            this.putQueryParameter("AutoRenewal", autoRenewal);
            this.autoRenewal = autoRenewal;
            return this;
        }

        /**
         * CapacityStorageSize.
         */
        public Builder capacityStorageSize(Integer capacityStorageSize) {
            this.putQueryParameter("CapacityStorageSize", capacityStorageSize);
            this.capacityStorageSize = capacityStorageSize;
            return this;
        }

        /**
         * CloudStorageSize.
         */
        public Builder cloudStorageSize(Integer cloudStorageSize) {
            this.putQueryParameter("CloudStorageSize", cloudStorageSize);
            this.cloudStorageSize = cloudStorageSize;
            return this;
        }

        /**
         * CloudStorageType.
         */
        public Builder cloudStorageType(String cloudStorageType) {
            this.putQueryParameter("CloudStorageType", cloudStorageType);
            this.cloudStorageType = cloudStorageType;
            return this;
        }

        /**
         * ClusterMode.
         */
        public Builder clusterMode(String clusterMode) {
            this.putQueryParameter("ClusterMode", clusterMode);
            this.clusterMode = clusterMode;
            return this;
        }

        /**
         * ClusterPattern.
         */
        public Builder clusterPattern(String clusterPattern) {
            this.putQueryParameter("ClusterPattern", clusterPattern);
            this.clusterPattern = clusterPattern;
            return this;
        }

        /**
         * Duration.
         */
        public Builder duration(Integer duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * EnableCapacityStorage.
         */
        public Builder enableCapacityStorage(Boolean enableCapacityStorage) {
            this.putQueryParameter("EnableCapacityStorage", enableCapacityStorage);
            this.enableCapacityStorage = enableCapacityStorage;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder engineList(java.util.List<EngineList> engineList) {
            this.putQueryParameter("EngineList", engineList);
            this.engineList = engineList;
            return this;
        }

        /**
         * InstanceAlias.
         */
        public Builder instanceAlias(String instanceAlias) {
            this.putQueryParameter("InstanceAlias", instanceAlias);
            this.instanceAlias = instanceAlias;
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
         * <p>This parameter is required.</p>
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * PricingCycle.
         */
        public Builder pricingCycle(String pricingCycle) {
            this.putQueryParameter("PricingCycle", pricingCycle);
            this.pricingCycle = pricingCycle;
            return this;
        }

        /**
         * PrimaryVSwitchId.
         */
        public Builder primaryVSwitchId(String primaryVSwitchId) {
            this.putQueryParameter("PrimaryVSwitchId", primaryVSwitchId);
            this.primaryVSwitchId = primaryVSwitchId;
            return this;
        }

        /**
         * PrimaryZoneId.
         */
        public Builder primaryZoneId(String primaryZoneId) {
            this.putQueryParameter("PrimaryZoneId", primaryZoneId);
            this.primaryZoneId = primaryZoneId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * StandbyVSwitchId.
         */
        public Builder standbyVSwitchId(String standbyVSwitchId) {
            this.putQueryParameter("StandbyVSwitchId", standbyVSwitchId);
            this.standbyVSwitchId = standbyVSwitchId;
            return this;
        }

        /**
         * StandbyZoneId.
         */
        public Builder standbyZoneId(String standbyZoneId) {
            this.putQueryParameter("StandbyZoneId", standbyZoneId);
            this.standbyZoneId = standbyZoneId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder VPCId(String VPCId) {
            this.putQueryParameter("VPCId", VPCId);
            this.VPCId = VPCId;
            return this;
        }

        /**
         * VSwitchId.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateLindormV2InstanceRequest build() {
            return new CreateLindormV2InstanceRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateLindormV2InstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateLindormV2InstanceRequest</p>
     */
    public static class NodeGroupList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeCount")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer nodeCount;

        @com.aliyun.core.annotation.NameInMap("NodeDiskSize")
        private Integer nodeDiskSize;

        @com.aliyun.core.annotation.NameInMap("NodeDiskType")
        private String nodeDiskType;

        @com.aliyun.core.annotation.NameInMap("NodeSpec")
        @com.aliyun.core.annotation.Validation(required = true)
        private String nodeSpec;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupName")
        private String resourceGroupName;

        private NodeGroupList(Builder builder) {
            this.nodeCount = builder.nodeCount;
            this.nodeDiskSize = builder.nodeDiskSize;
            this.nodeDiskType = builder.nodeDiskType;
            this.nodeSpec = builder.nodeSpec;
            this.resourceGroupName = builder.resourceGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeGroupList create() {
            return builder().build();
        }

        /**
         * @return nodeCount
         */
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        /**
         * @return nodeDiskSize
         */
        public Integer getNodeDiskSize() {
            return this.nodeDiskSize;
        }

        /**
         * @return nodeDiskType
         */
        public String getNodeDiskType() {
            return this.nodeDiskType;
        }

        /**
         * @return nodeSpec
         */
        public String getNodeSpec() {
            return this.nodeSpec;
        }

        /**
         * @return resourceGroupName
         */
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

        public static final class Builder {
            private Integer nodeCount; 
            private Integer nodeDiskSize; 
            private String nodeDiskType; 
            private String nodeSpec; 
            private String resourceGroupName; 

            private Builder() {
            } 

            private Builder(NodeGroupList model) {
                this.nodeCount = model.nodeCount;
                this.nodeDiskSize = model.nodeDiskSize;
                this.nodeDiskType = model.nodeDiskType;
                this.nodeSpec = model.nodeSpec;
                this.resourceGroupName = model.resourceGroupName;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder nodeCount(Integer nodeCount) {
                this.nodeCount = nodeCount;
                return this;
            }

            /**
             * NodeDiskSize.
             */
            public Builder nodeDiskSize(Integer nodeDiskSize) {
                this.nodeDiskSize = nodeDiskSize;
                return this;
            }

            /**
             * NodeDiskType.
             */
            public Builder nodeDiskType(String nodeDiskType) {
                this.nodeDiskType = nodeDiskType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder nodeSpec(String nodeSpec) {
                this.nodeSpec = nodeSpec;
                return this;
            }

            /**
             * ResourceGroupName.
             */
            public Builder resourceGroupName(String resourceGroupName) {
                this.resourceGroupName = resourceGroupName;
                return this;
            }

            public NodeGroupList build() {
                return new NodeGroupList(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateLindormV2InstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateLindormV2InstanceRequest</p>
     */
    public static class EngineList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EngineType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String engineType;

        @com.aliyun.core.annotation.NameInMap("NodeGroupList")
        private java.util.List<NodeGroupList> nodeGroupList;

        private EngineList(Builder builder) {
            this.engineType = builder.engineType;
            this.nodeGroupList = builder.nodeGroupList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EngineList create() {
            return builder().build();
        }

        /**
         * @return engineType
         */
        public String getEngineType() {
            return this.engineType;
        }

        /**
         * @return nodeGroupList
         */
        public java.util.List<NodeGroupList> getNodeGroupList() {
            return this.nodeGroupList;
        }

        public static final class Builder {
            private String engineType; 
            private java.util.List<NodeGroupList> nodeGroupList; 

            private Builder() {
            } 

            private Builder(EngineList model) {
                this.engineType = model.engineType;
                this.nodeGroupList = model.nodeGroupList;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder engineType(String engineType) {
                this.engineType = engineType;
                return this;
            }

            /**
             * NodeGroupList.
             */
            public Builder nodeGroupList(java.util.List<NodeGroupList> nodeGroupList) {
                this.nodeGroupList = nodeGroupList;
                return this;
            }

            public EngineList build() {
                return new EngineList(this);
            } 

        } 

    }
}
