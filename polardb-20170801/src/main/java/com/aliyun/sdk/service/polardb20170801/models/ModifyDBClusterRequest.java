// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link ModifyDBClusterRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBClusterRequest</p>
 */
public class ModifyDBClusterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CompressStorage")
    private String compressStorage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBNodeCrashList")
    private String DBNodeCrashList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataSyncMode")
    private String dataSyncMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FaultInjectionType")
    private String faultInjectionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FaultSimulateMode")
    private String faultSimulateMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImciAutoIndex")
    private String imciAutoIndex;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModifyRowCompression")
    private String modifyRowCompression;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StandbyHAMode")
    private String standbyHAMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageAutoScale")
    private String storageAutoScale;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageUpperBound")
    @com.aliyun.core.annotation.Validation(maximum = 64000, minimum = 20)
    private Long storageUpperBound;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableMeta")
    private String tableMeta;

    private ModifyDBClusterRequest(Builder builder) {
        super(builder);
        this.compressStorage = builder.compressStorage;
        this.DBClusterId = builder.DBClusterId;
        this.DBNodeCrashList = builder.DBNodeCrashList;
        this.dataSyncMode = builder.dataSyncMode;
        this.faultInjectionType = builder.faultInjectionType;
        this.faultSimulateMode = builder.faultSimulateMode;
        this.imciAutoIndex = builder.imciAutoIndex;
        this.modifyRowCompression = builder.modifyRowCompression;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.standbyHAMode = builder.standbyHAMode;
        this.storageAutoScale = builder.storageAutoScale;
        this.storageUpperBound = builder.storageUpperBound;
        this.tableMeta = builder.tableMeta;
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
     * @return compressStorage
     */
    public String getCompressStorage() {
        return this.compressStorage;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return DBNodeCrashList
     */
    public String getDBNodeCrashList() {
        return this.DBNodeCrashList;
    }

    /**
     * @return dataSyncMode
     */
    public String getDataSyncMode() {
        return this.dataSyncMode;
    }

    /**
     * @return faultInjectionType
     */
    public String getFaultInjectionType() {
        return this.faultInjectionType;
    }

    /**
     * @return faultSimulateMode
     */
    public String getFaultSimulateMode() {
        return this.faultSimulateMode;
    }

    /**
     * @return imciAutoIndex
     */
    public String getImciAutoIndex() {
        return this.imciAutoIndex;
    }

    /**
     * @return modifyRowCompression
     */
    public String getModifyRowCompression() {
        return this.modifyRowCompression;
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
     * @return standbyHAMode
     */
    public String getStandbyHAMode() {
        return this.standbyHAMode;
    }

    /**
     * @return storageAutoScale
     */
    public String getStorageAutoScale() {
        return this.storageAutoScale;
    }

    /**
     * @return storageUpperBound
     */
    public Long getStorageUpperBound() {
        return this.storageUpperBound;
    }

    /**
     * @return tableMeta
     */
    public String getTableMeta() {
        return this.tableMeta;
    }

    public static final class Builder extends Request.Builder<ModifyDBClusterRequest, Builder> {
        private String compressStorage; 
        private String DBClusterId; 
        private String DBNodeCrashList; 
        private String dataSyncMode; 
        private String faultInjectionType; 
        private String faultSimulateMode; 
        private String imciAutoIndex; 
        private String modifyRowCompression; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String standbyHAMode; 
        private String storageAutoScale; 
        private Long storageUpperBound; 
        private String tableMeta; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBClusterRequest request) {
            super(request);
            this.compressStorage = request.compressStorage;
            this.DBClusterId = request.DBClusterId;
            this.DBNodeCrashList = request.DBNodeCrashList;
            this.dataSyncMode = request.dataSyncMode;
            this.faultInjectionType = request.faultInjectionType;
            this.faultSimulateMode = request.faultSimulateMode;
            this.imciAutoIndex = request.imciAutoIndex;
            this.modifyRowCompression = request.modifyRowCompression;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.standbyHAMode = request.standbyHAMode;
            this.storageAutoScale = request.storageAutoScale;
            this.storageUpperBound = request.storageUpperBound;
            this.tableMeta = request.tableMeta;
        } 

        /**
         * <p>Specifies whether to enable storage compression. Set the value to <strong>ON</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        public Builder compressStorage(String compressStorage) {
            this.putQueryParameter("CompressStorage", compressStorage);
            this.compressStorage = compressStorage;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * <blockquote>
         * <p> You can call the DescribeDBClusters operation to query information about all PolarDB clusters that are deployed in a specified region, such as cluster IDs.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-*************</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The list of nodes for the drill.</p>
         * <blockquote>
         * <p> You can specify only one node for a node-level disaster recovery drill. For a primary zone-level disaster recovery drill, you can either choose not to specify this parameter or specify all nodes.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>pi-rwxxx</p>
         */
        public Builder DBNodeCrashList(String DBNodeCrashList) {
            this.putQueryParameter("DBNodeCrashList", DBNodeCrashList);
            this.DBNodeCrashList = DBNodeCrashList;
            return this;
        }

        /**
         * <p>The method used to replicate data across zones. Valid values:</p>
         * <ul>
         * <li><strong>AsyncSync</strong>: the asynchronous mode.</li>
         * <li><strong>SemiSync</strong>: the semi-synchronous mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AsynSync</p>
         */
        public Builder dataSyncMode(String dataSyncMode) {
            this.putQueryParameter("DataSyncMode", dataSyncMode);
            this.dataSyncMode = dataSyncMode;
            return this;
        }

        /**
         * <p>The fault injection method. Valid values:</p>
         * <ul>
         * <li>0: <code>Crash SQL</code>-based fault injection.</li>
         * </ul>
         * <p>Valid values:</p>
         * <ul>
         * <li>CrashSQLInjection: CrashSQLInjection.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder faultInjectionType(String faultInjectionType) {
            this.putQueryParameter("FaultInjectionType", faultInjectionType);
            this.faultInjectionType = faultInjectionType;
            return this;
        }

        /**
         * <p>The level of the disaster recovery drill. Valid values:</p>
         * <ul>
         * <li><code>0</code> or <code>FaultInjection</code>: The primary zone level.</li>
         * <li><code>1</code>: The node level.</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>In <strong>primary zone-level disaster recovery drill</strong> scenarios, all compute nodes in the primary zone are unavailable. Data loss occurs during failovers in the scenarios.</p>
         * </li>
         * <li><p>In <strong>node-level disaster recovery drill</strong> scenarios, you can specify only one compute node for the disaster recovery drill. You can use the <code>DBNodeCrashList</code> parameter to specify the name of the compute node that you want to use for the drill.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder faultSimulateMode(String faultSimulateMode) {
            this.putQueryParameter("FaultSimulateMode", faultSimulateMode);
            this.faultSimulateMode = faultSimulateMode;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic IMCI-based query acceleration. IMCI is short for In-Memory Column Index. Valid values:</p>
         * <ul>
         * <li><code>ON</code>: enables automatic IMCI-based query acceleration.</li>
         * <li><code>OFF</code>: disables automatic IMCI-based query acceleration.</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>This parameter is supported only for PolarDB for MySQL clusters.</p>
         * </li>
         * <li><p>For information about the cluster version limits, see <a href="https://help.aliyun.com/document_detail/2854119.html">Automatic IMCI-based query acceleration</a>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OFF</p>
         */
        public Builder imciAutoIndex(String imciAutoIndex) {
            this.putQueryParameter("ImciAutoIndex", imciAutoIndex);
            this.imciAutoIndex = imciAutoIndex;
            return this;
        }

        /**
         * ModifyRowCompression.
         */
        public Builder modifyRowCompression(String modifyRowCompression) {
            this.putQueryParameter("ModifyRowCompression", modifyRowCompression);
            this.modifyRowCompression = modifyRowCompression;
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
         * <p>Specifies whether to enable cross-zone automatic switchover. Valid values:</p>
         * <ul>
         * <li><strong>ON</strong>: enables cross-zone automatic switchover.</li>
         * <li><strong>OFF</strong>: disables cross-zone automatic switchover.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        public Builder standbyHAMode(String standbyHAMode) {
            this.putQueryParameter("StandbyHAMode", standbyHAMode);
            this.standbyHAMode = standbyHAMode;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic storage scaling. This parameter is available only for Standard Edition clusters. Valid values:</p>
         * <ul>
         * <li>Enable</li>
         * <li>Disable</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        public Builder storageAutoScale(String storageAutoScale) {
            this.putQueryParameter("StorageAutoScale", storageAutoScale);
            this.storageAutoScale = storageAutoScale;
            return this;
        }

        /**
         * <p>The maximum storage capacity of the cluster of Standard Edition in automatic scaling. Unit: GB.</p>
         * <blockquote>
         * <p> The maximum value of this parameter is 32000.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>800</p>
         */
        public Builder storageUpperBound(Long storageUpperBound) {
            this.putQueryParameter("StorageUpperBound", storageUpperBound);
            this.storageUpperBound = storageUpperBound;
            return this;
        }

        /**
         * TableMeta.
         */
        public Builder tableMeta(String tableMeta) {
            this.putQueryParameter("TableMeta", tableMeta);
            this.tableMeta = tableMeta;
            return this;
        }

        @Override
        public ModifyDBClusterRequest build() {
            return new ModifyDBClusterRequest(this);
        } 

    } 

}
