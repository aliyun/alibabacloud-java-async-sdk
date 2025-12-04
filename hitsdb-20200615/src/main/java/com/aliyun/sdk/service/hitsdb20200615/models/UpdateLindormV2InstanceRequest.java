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
 * {@link UpdateLindormV2InstanceRequest} extends {@link RequestModel}
 *
 * <p>UpdateLindormV2InstanceRequest</p>
 */
public class UpdateLindormV2InstanceRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("EnableCapacityStorage")
    private Boolean enableCapacityStorage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EngineList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<EngineList> engineList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

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

    private UpdateLindormV2InstanceRequest(Builder builder) {
        super(builder);
        this.capacityStorageSize = builder.capacityStorageSize;
        this.cloudStorageSize = builder.cloudStorageSize;
        this.cloudStorageType = builder.cloudStorageType;
        this.enableCapacityStorage = builder.enableCapacityStorage;
        this.engineList = builder.engineList;
        this.instanceId = builder.instanceId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLindormV2InstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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

    public static final class Builder extends Request.Builder<UpdateLindormV2InstanceRequest, Builder> {
        private Integer capacityStorageSize; 
        private Integer cloudStorageSize; 
        private String cloudStorageType; 
        private Boolean enableCapacityStorage; 
        private java.util.List<EngineList> engineList; 
        private String instanceId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLindormV2InstanceRequest request) {
            super(request);
            this.capacityStorageSize = request.capacityStorageSize;
            this.cloudStorageSize = request.cloudStorageSize;
            this.cloudStorageType = request.cloudStorageType;
            this.enableCapacityStorage = request.enableCapacityStorage;
            this.engineList = request.engineList;
            this.instanceId = request.instanceId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.securityToken = request.securityToken;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ld-bp1o3y0yme2i2****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public UpdateLindormV2InstanceRequest build() {
            return new UpdateLindormV2InstanceRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateLindormV2InstanceRequest} extends {@link TeaModel}
     *
     * <p>UpdateLindormV2InstanceRequest</p>
     */
    public static class NodeGroupList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

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
            private String groupId; 
            private Integer nodeCount; 
            private Integer nodeDiskSize; 
            private String nodeDiskType; 
            private String nodeSpec; 
            private String resourceGroupName; 

            private Builder() {
            } 

            private Builder(NodeGroupList model) {
                this.groupId = model.groupId;
                this.nodeCount = model.nodeCount;
                this.nodeDiskSize = model.nodeDiskSize;
                this.nodeDiskType = model.nodeDiskType;
                this.nodeSpec = model.nodeSpec;
                this.resourceGroupName = model.resourceGroupName;
            } 

            /**
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
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
             * 
             * <strong>example:</strong>
             * <p>lindorm.g.2xlarge</p>
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
     * {@link UpdateLindormV2InstanceRequest} extends {@link TeaModel}
     *
     * <p>UpdateLindormV2InstanceRequest</p>
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
             * 
             * <strong>example:</strong>
             * <p>TABLE</p>
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
