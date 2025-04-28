// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

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
 * {@link MigrateDBClusterRequest} extends {@link RequestModel}
 *
 * <p>MigrateDBClusterRequest</p>
 */
public class MigrateDBClusterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComputeResource")
    private String computeResource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductForm")
    private String productForm;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductVersion")
    private String productVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReservedNodeCount")
    private Integer reservedNodeCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReservedNodeSize")
    private String reservedNodeSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecondaryVSwitchId")
    private String secondaryVSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecondaryZoneId")
    private String secondaryZoneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShardNumber")
    private String shardNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageResource")
    private String storageResource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageResourceSize")
    private String storageResourceSize;

    private MigrateDBClusterRequest(Builder builder) {
        super(builder);
        this.computeResource = builder.computeResource;
        this.DBClusterId = builder.DBClusterId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.productForm = builder.productForm;
        this.productVersion = builder.productVersion;
        this.reservedNodeCount = builder.reservedNodeCount;
        this.reservedNodeSize = builder.reservedNodeSize;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.secondaryVSwitchId = builder.secondaryVSwitchId;
        this.secondaryZoneId = builder.secondaryZoneId;
        this.shardNumber = builder.shardNumber;
        this.storageResource = builder.storageResource;
        this.storageResourceSize = builder.storageResourceSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MigrateDBClusterRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return computeResource
     */
    public String getComputeResource() {
        return this.computeResource;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
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
     * @return productForm
     */
    public String getProductForm() {
        return this.productForm;
    }

    /**
     * @return productVersion
     */
    public String getProductVersion() {
        return this.productVersion;
    }

    /**
     * @return reservedNodeCount
     */
    public Integer getReservedNodeCount() {
        return this.reservedNodeCount;
    }

    /**
     * @return reservedNodeSize
     */
    public String getReservedNodeSize() {
        return this.reservedNodeSize;
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
     * @return secondaryVSwitchId
     */
    public String getSecondaryVSwitchId() {
        return this.secondaryVSwitchId;
    }

    /**
     * @return secondaryZoneId
     */
    public String getSecondaryZoneId() {
        return this.secondaryZoneId;
    }

    /**
     * @return shardNumber
     */
    public String getShardNumber() {
        return this.shardNumber;
    }

    /**
     * @return storageResource
     */
    public String getStorageResource() {
        return this.storageResource;
    }

    /**
     * @return storageResourceSize
     */
    public String getStorageResourceSize() {
        return this.storageResourceSize;
    }

    public static final class Builder extends Request.Builder<MigrateDBClusterRequest, Builder> {
        private String computeResource; 
        private String DBClusterId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String productForm; 
        private String productVersion; 
        private Integer reservedNodeCount; 
        private String reservedNodeSize; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String secondaryVSwitchId; 
        private String secondaryZoneId; 
        private String shardNumber; 
        private String storageResource; 
        private String storageResourceSize; 

        private Builder() {
            super();
        } 

        private Builder(MigrateDBClusterRequest request) {
            super(request);
            this.computeResource = request.computeResource;
            this.DBClusterId = request.DBClusterId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.productForm = request.productForm;
            this.productVersion = request.productVersion;
            this.reservedNodeCount = request.reservedNodeCount;
            this.reservedNodeSize = request.reservedNodeSize;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.secondaryVSwitchId = request.secondaryVSwitchId;
            this.secondaryZoneId = request.secondaryZoneId;
            this.shardNumber = request.shardNumber;
            this.storageResource = request.storageResource;
            this.storageResourceSize = request.storageResourceSize;
        } 

        /**
         * <p>The amount of reserved computing resources.
         * Valid values: 0ACU to 4096ACU. Step size: 16. Each AnalyticDB compute unit (ACU) is approximately equal to 1 core and 4 GB memory.</p>
         * 
         * <strong>example:</strong>
         * <p>32ACU</p>
         */
        public Builder computeResource(String computeResource) {
            this.putQueryParameter("ComputeResource", computeResource);
            this.computeResource = computeResource;
            return this;
        }

        /**
         * <p>The ID of the AnalyticDB for MySQL Data Warehouse Edition cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>am-bp1xxxxxxxx47</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
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
         * ProductForm.
         */
        public Builder productForm(String productForm) {
            this.putQueryParameter("ProductForm", productForm);
            this.productForm = productForm;
            return this;
        }

        /**
         * ProductVersion.
         */
        public Builder productVersion(String productVersion) {
            this.putQueryParameter("ProductVersion", productVersion);
            this.productVersion = productVersion;
            return this;
        }

        /**
         * ReservedNodeCount.
         */
        public Builder reservedNodeCount(Integer reservedNodeCount) {
            this.putQueryParameter("ReservedNodeCount", reservedNodeCount);
            this.reservedNodeCount = reservedNodeCount;
            return this;
        }

        /**
         * ReservedNodeSize.
         */
        public Builder reservedNodeSize(String reservedNodeSize) {
            this.putQueryParameter("ReservedNodeSize", reservedNodeSize);
            this.reservedNodeSize = reservedNodeSize;
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
         * SecondaryVSwitchId.
         */
        public Builder secondaryVSwitchId(String secondaryVSwitchId) {
            this.putQueryParameter("SecondaryVSwitchId", secondaryVSwitchId);
            this.secondaryVSwitchId = secondaryVSwitchId;
            return this;
        }

        /**
         * SecondaryZoneId.
         */
        public Builder secondaryZoneId(String secondaryZoneId) {
            this.putQueryParameter("SecondaryZoneId", secondaryZoneId);
            this.secondaryZoneId = secondaryZoneId;
            return this;
        }

        /**
         * <p>The number of shards that you want to change during the data migration.</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        public Builder shardNumber(String shardNumber) {
            this.putQueryParameter("ShardNumber", shardNumber);
            this.shardNumber = shardNumber;
            return this;
        }

        /**
         * <p>The amount of reserved storage resources. Valid values: 0ACU to 2064ACU. The value must be in increments of the number of ACUs specified by the StorageResourceSize parameter × 3 (default value: 24ACU). Each ACU is approximately equal to 1 core and 4 GB memory.</p>
         * <blockquote>
         * <p> This parameter must be specified with a unit.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>24ACU</p>
         */
        public Builder storageResource(String storageResource) {
            this.putQueryParameter("StorageResource", storageResource);
            this.storageResource = storageResource;
            return this;
        }

        /**
         * <p>The node specifications of reserved storage resources. Valid values: 8ACU, 12ACU, and 16ACU.</p>
         * 
         * <strong>example:</strong>
         * <p>8ACU</p>
         */
        public Builder storageResourceSize(String storageResourceSize) {
            this.putQueryParameter("StorageResourceSize", storageResourceSize);
            this.storageResourceSize = storageResourceSize;
            return this;
        }

        @Override
        public MigrateDBClusterRequest build() {
            return new MigrateDBClusterRequest(this);
        } 

    } 

}
