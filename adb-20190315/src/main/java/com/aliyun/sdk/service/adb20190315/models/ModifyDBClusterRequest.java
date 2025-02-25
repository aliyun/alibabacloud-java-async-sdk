// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyDBClusterRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBClusterRequest</p>
 */
public class ModifyDBClusterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComputeResource")
    private String computeResource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterCategory")
    private String DBClusterCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBNodeClass")
    private String DBNodeClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBNodeGroupCount")
    private String DBNodeGroupCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBNodeStorage")
    private String DBNodeStorage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskPerformanceLevel")
    private String diskPerformanceLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ElasticIOResource")
    @com.aliyun.core.annotation.Validation(maximum = 200)
    private Integer elasticIOResource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ElasticIOResourceSize")
    private String elasticIOResourceSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExecutorCount")
    private String executorCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mode")
    private String mode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModifyType")
    private String modifyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageResource")
    private String storageResource;

    private ModifyDBClusterRequest(Builder builder) {
        super(builder);
        this.computeResource = builder.computeResource;
        this.DBClusterCategory = builder.DBClusterCategory;
        this.DBClusterId = builder.DBClusterId;
        this.DBNodeClass = builder.DBNodeClass;
        this.DBNodeGroupCount = builder.DBNodeGroupCount;
        this.DBNodeStorage = builder.DBNodeStorage;
        this.diskPerformanceLevel = builder.diskPerformanceLevel;
        this.elasticIOResource = builder.elasticIOResource;
        this.elasticIOResourceSize = builder.elasticIOResourceSize;
        this.executorCount = builder.executorCount;
        this.mode = builder.mode;
        this.modifyType = builder.modifyType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.storageResource = builder.storageResource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBClusterRequest create() {
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
     * @return DBClusterCategory
     */
    public String getDBClusterCategory() {
        return this.DBClusterCategory;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return DBNodeClass
     */
    public String getDBNodeClass() {
        return this.DBNodeClass;
    }

    /**
     * @return DBNodeGroupCount
     */
    public String getDBNodeGroupCount() {
        return this.DBNodeGroupCount;
    }

    /**
     * @return DBNodeStorage
     */
    public String getDBNodeStorage() {
        return this.DBNodeStorage;
    }

    /**
     * @return diskPerformanceLevel
     */
    public String getDiskPerformanceLevel() {
        return this.diskPerformanceLevel;
    }

    /**
     * @return elasticIOResource
     */
    public Integer getElasticIOResource() {
        return this.elasticIOResource;
    }

    /**
     * @return elasticIOResourceSize
     */
    public String getElasticIOResourceSize() {
        return this.elasticIOResourceSize;
    }

    /**
     * @return executorCount
     */
    public String getExecutorCount() {
        return this.executorCount;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return modifyType
     */
    public String getModifyType() {
        return this.modifyType;
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
     * @return storageResource
     */
    public String getStorageResource() {
        return this.storageResource;
    }

    public static final class Builder extends Request.Builder<ModifyDBClusterRequest, Builder> {
        private String computeResource; 
        private String DBClusterCategory; 
        private String DBClusterId; 
        private String DBNodeClass; 
        private String DBNodeGroupCount; 
        private String DBNodeStorage; 
        private String diskPerformanceLevel; 
        private Integer elasticIOResource; 
        private String elasticIOResourceSize; 
        private String executorCount; 
        private String mode; 
        private String modifyType; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String storageResource; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBClusterRequest request) {
            super(request);
            this.computeResource = request.computeResource;
            this.DBClusterCategory = request.DBClusterCategory;
            this.DBClusterId = request.DBClusterId;
            this.DBNodeClass = request.DBNodeClass;
            this.DBNodeGroupCount = request.DBNodeGroupCount;
            this.DBNodeStorage = request.DBNodeStorage;
            this.diskPerformanceLevel = request.diskPerformanceLevel;
            this.elasticIOResource = request.elasticIOResource;
            this.elasticIOResourceSize = request.elasticIOResourceSize;
            this.executorCount = request.executorCount;
            this.mode = request.mode;
            this.modifyType = request.modifyType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.storageResource = request.storageResource;
        } 

        /**
         * <p>The computing resources of the cluster. You can call the <a href="https://help.aliyun.com/document_detail/190632.html">DescribeAvailableResource</a> operation to query the computing resources that are available within a region.</p>
         * <blockquote>
         * <p>This parameter must be specified when Mode is set to Flexible.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>32Core128GBNEW</p>
         */
        public Builder computeResource(String computeResource) {
            this.putQueryParameter("ComputeResource", computeResource);
            this.computeResource = computeResource;
            return this;
        }

        /**
         * <p>The edition of the cluster. Valid values:</p>
         * <ul>
         * <li><strong>Cluster</strong>: reserved mode for Cluster Edition.</li>
         * <li><strong>MixedStorage</strong>: elastic mode for Cluster Edition.</li>
         * </ul>
         * <blockquote>
         * <p>If you set DBClusterCategory to Cluster, you must set Mode to Reserver. If you set DBClusterCategory to MixedStorage, you must set Mode to Flexible. Otherwise, you fail to change the specifications of the cluster.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>MixedStorage</p>
         */
        public Builder DBClusterCategory(String DBClusterCategory) {
            this.putQueryParameter("DBClusterCategory", DBClusterCategory);
            this.DBClusterCategory = DBClusterCategory;
            return this;
        }

        /**
         * <p>The ID of the AnalyticDB for MySQL Data Warehouse Edition (V3.0) cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>am-bp1u8c0mgfg58****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The node specifications of the cluster. Valid values:</p>
         * <ul>
         * <li><strong>C8</strong></li>
         * <li><strong>C32</strong></li>
         * </ul>
         * <blockquote>
         * <p>This parameter must be specified when Mode is set to Reserver.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>C32</p>
         */
        public Builder DBNodeClass(String DBNodeClass) {
            this.putQueryParameter("DBNodeClass", DBNodeClass);
            this.DBNodeClass = DBNodeClass;
            return this;
        }

        /**
         * <p>The number of node groups. Valid values: 1 to 200.</p>
         * <blockquote>
         * <p>This parameter must be specified when Mode is set to Reserver.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder DBNodeGroupCount(String DBNodeGroupCount) {
            this.putQueryParameter("DBNodeGroupCount", DBNodeGroupCount);
            this.DBNodeGroupCount = DBNodeGroupCount;
            return this;
        }

        /**
         * <p>The storage capacity per node. Unit: GB.</p>
         * <ul>
         * <li>Valid values when DBClusterClass is set to C8: 100 to 2000.</li>
         * <li>Valid values when DBClusterClass is set to C32: 100 to 8000.</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>This parameter must be specified when Mode is set to Reserver.</p>
         * </li>
         * <li><p>The storage capacity less than 1,000 GB increases in 100 GB increments. The storage capacity greater than 1,000 GB increases in 1,000 GB increments.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder DBNodeStorage(String DBNodeStorage) {
            this.putQueryParameter("DBNodeStorage", DBNodeStorage);
            this.DBNodeStorage = DBNodeStorage;
            return this;
        }

        /**
         * <p>The enhanced SSD (ESSD) performance level of the cluster. Valid values:</p>
         * <ul>
         * <li>PL0</li>
         * <li>PL1</li>
         * <li>PL2</li>
         * <li>PL3</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        public Builder diskPerformanceLevel(String diskPerformanceLevel) {
            this.putQueryParameter("DiskPerformanceLevel", diskPerformanceLevel);
            this.diskPerformanceLevel = diskPerformanceLevel;
            return this;
        }

        /**
         * <p>The number of EIUs. The number of EIUs that you can purchase varies based on the single-node EIU specifications.</p>
         * <ul>
         * <li>If the single-node EIU specifications are 8 cores and 64 GB, you can purchase up to 32 EIUs.</li>
         * <li>If the single-node EIU specifications are 12 cores and 96 GB, you can purchase up to 16 EIUs.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder elasticIOResource(Integer elasticIOResource) {
            this.putQueryParameter("ElasticIOResource", elasticIOResource);
            this.elasticIOResource = elasticIOResource;
            return this;
        }

        /**
         * <p>The single-node specifications of an elastic I/O unit (EIU). Valid values:</p>
         * <ul>
         * <li><strong>8Core64GB</strong>: If you set the parameter to <strong>8Core64GB</strong>, the specifications of an EIU are 24 cores and 192 GB memory.</li>
         * <li><strong>12Core96GB</strong>: If you set the parameter to <strong>12Core96GB</strong>, the specifications of an EIU are 36 cores and 288 GB memory.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter takes effect only when your cluster meets the following requirements:</p>
         * </blockquote>
         * <ul>
         * <li><p>The cluster is in elastic mode.</p>
         * </li>
         * <li><p>If the cluster resides in the China (Guangzhou), China (Shenzhen), China (Hangzhou), China (Shanghai), China (Qingdao), China (Beijing), or China (Zhangjiakou) region, the cluster has 16 cores and 64 GB memory or higher specifications.</p>
         * </li>
         * <li><p>If the cluster resides in another region, the cluster has 32 cores and 128 GB memory or higher specifications.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>8Core64GB</p>
         */
        public Builder elasticIOResourceSize(String elasticIOResourceSize) {
            this.putQueryParameter("ElasticIOResourceSize", elasticIOResourceSize);
            this.elasticIOResourceSize = elasticIOResourceSize;
            return this;
        }

        /**
         * <p>N/A</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder executorCount(String executorCount) {
            this.putQueryParameter("ExecutorCount", executorCount);
            this.executorCount = executorCount;
            return this;
        }

        /**
         * <p>The mode of the cluster. Valid values:</p>
         * <ul>
         * <li><strong>Reserver</strong>: the reserved mode.</li>
         * <li><strong>Flexible</strong>: the elastic mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Flexible</p>
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * <p>The change type. Valid values:</p>
         * <ul>
         * <li><strong>Upgrade</strong></li>
         * <li><strong>Downgrade</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Upgrade</p>
         */
        public Builder modifyType(String modifyType) {
            this.putQueryParameter("ModifyType", modifyType);
            this.modifyType = modifyType;
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
         * <p>The region ID of the cluster. You can call the <a href="https://help.aliyun.com/document_detail/143074.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>N/A</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder storageResource(String storageResource) {
            this.putQueryParameter("StorageResource", storageResource);
            this.storageResource = storageResource;
            return this;
        }

        @Override
        public ModifyDBClusterRequest build() {
            return new ModifyDBClusterRequest(this);
        } 

    } 

}
