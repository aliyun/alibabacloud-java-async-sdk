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
 * {@link ModifyLindormV2InstanceRequest} extends {@link RequestModel}
 *
 * <p>ModifyLindormV2InstanceRequest</p>
 */
public class ModifyLindormV2InstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudStorageSize")
    private Long cloudStorageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudStorageType")
    private String cloudStorageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EngineType")
    private String engineType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeGroupList")
    private java.util.List<NodeGroupList> nodeGroupList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    @com.aliyun.core.annotation.Validation(minimum = 1)
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
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpgradeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String upgradeType;

    private ModifyLindormV2InstanceRequest(Builder builder) {
        super(builder);
        this.cloudStorageSize = builder.cloudStorageSize;
        this.cloudStorageType = builder.cloudStorageType;
        this.engineType = builder.engineType;
        this.instanceId = builder.instanceId;
        this.nodeGroupList = builder.nodeGroupList;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityToken = builder.securityToken;
        this.upgradeType = builder.upgradeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyLindormV2InstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cloudStorageSize
     */
    public Long getCloudStorageSize() {
        return this.cloudStorageSize;
    }

    /**
     * @return cloudStorageType
     */
    public String getCloudStorageType() {
        return this.cloudStorageType;
    }

    /**
     * @return engineType
     */
    public String getEngineType() {
        return this.engineType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return nodeGroupList
     */
    public java.util.List<NodeGroupList> getNodeGroupList() {
        return this.nodeGroupList;
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

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return upgradeType
     */
    public String getUpgradeType() {
        return this.upgradeType;
    }

    public static final class Builder extends Request.Builder<ModifyLindormV2InstanceRequest, Builder> {
        private Long cloudStorageSize; 
        private String cloudStorageType; 
        private String engineType; 
        private String instanceId; 
        private java.util.List<NodeGroupList> nodeGroupList; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String securityToken; 
        private String upgradeType; 

        private Builder() {
            super();
        } 

        private Builder(ModifyLindormV2InstanceRequest request) {
            super(request);
            this.cloudStorageSize = request.cloudStorageSize;
            this.cloudStorageType = request.cloudStorageType;
            this.engineType = request.engineType;
            this.instanceId = request.instanceId;
            this.nodeGroupList = request.nodeGroupList;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.securityToken = request.securityToken;
            this.upgradeType = request.upgradeType;
        } 

        /**
         * CloudStorageSize.
         */
        public Builder cloudStorageSize(Long cloudStorageSize) {
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
         * EngineType.
         */
        public Builder engineType(String engineType) {
            this.putQueryParameter("EngineType", engineType);
            this.engineType = engineType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * NodeGroupList.
         */
        public Builder nodeGroupList(java.util.List<NodeGroupList> nodeGroupList) {
            this.putQueryParameter("NodeGroupList", nodeGroupList);
            this.nodeGroupList = nodeGroupList;
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
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder upgradeType(String upgradeType) {
            this.putQueryParameter("UpgradeType", upgradeType);
            this.upgradeType = upgradeType;
            return this;
        }

        @Override
        public ModifyLindormV2InstanceRequest build() {
            return new ModifyLindormV2InstanceRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyLindormV2InstanceRequest} extends {@link TeaModel}
     *
     * <p>ModifyLindormV2InstanceRequest</p>
     */
    public static class NodeGroupList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("NodeCount")
        private String nodeCount;

        @com.aliyun.core.annotation.NameInMap("NodeDiskSize")
        private Long nodeDiskSize;

        @com.aliyun.core.annotation.NameInMap("NodeDiskType")
        private String nodeDiskType;

        @com.aliyun.core.annotation.NameInMap("NodeSpec")
        private String nodeSpec;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupName")
        private String resourceGroupName;

        private NodeGroupList(Builder builder) {
            this.groupId = builder.groupId;
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
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return nodeCount
         */
        public String getNodeCount() {
            return this.nodeCount;
        }

        /**
         * @return nodeDiskSize
         */
        public Long getNodeDiskSize() {
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
            private String groupId; 
            private String nodeCount; 
            private Long nodeDiskSize; 
            private String nodeDiskType; 
            private String nodeSpec; 
            private String resourceGroupName; 

            /**
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * NodeCount.
             */
            public Builder nodeCount(String nodeCount) {
                this.nodeCount = nodeCount;
                return this;
            }

            /**
             * NodeDiskSize.
             */
            public Builder nodeDiskSize(Long nodeDiskSize) {
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
             * NodeSpec.
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
}
