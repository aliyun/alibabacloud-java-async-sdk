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
    @com.aliyun.core.annotation.NameInMap("ConnectionResourceQuota")
    private Long connectionResourceQuota;

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
        this.connectionResourceQuota = builder.connectionResourceQuota;
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
     * @return connectionResourceQuota
     */
    public Long getConnectionResourceQuota() {
        return this.connectionResourceQuota;
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
        private Long connectionResourceQuota; 
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
            this.connectionResourceQuota = request.connectionResourceQuota;
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
         * <p>Enables storage compression. Set the value to <strong>ON</strong>.</p>
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
         * ConnectionResourceQuota.
         */
        public Builder connectionResourceQuota(Long connectionResourceQuota) {
            this.putQueryParameter("ConnectionResourceQuota", connectionResourceQuota);
            this.connectionResourceQuota = connectionResourceQuota;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/173433.html">DescribeDBClusters</a> operation to query information about all clusters in the specified region, including cluster IDs.</p>
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
         * <p>The list of node instance names for the disaster recovery drill.</p>
         * <blockquote>
         * <p>Node-level drills support only a single node. For zone-level drills, you can leave this parameter empty or specify all nodes.</p>
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
         * <p>The cross-zone data replication mode of the cluster. Valid values:</p>
         * <ul>
         * <li><strong>AsyncSync</strong>: asynchronous</li>
         * <li><strong>SemiSync</strong>: semi-synchronous</li>
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
         * <li>0: instance fault injection based on <code>Crash SQL</code></li>
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
         * <p>The dimension of the disaster recovery drill for the cluster. Valid values:</p>
         * <ul>
         * <li><code>0</code> or <code>FaultInjection</code>: primary zone-level disaster recovery drill.</li>
         * <li><code>1</code>: node-level disaster recovery drill.<blockquote>
         * <ul>
         * <li>In the <strong>primary zone-level disaster recovery drill</strong> scenario, all compute nodes in the primary zone become unavailable. The failover in this scenario causes service interruptions.</li>
         * <li>In the <strong>node-level disaster recovery drill</strong> scenario, only a single compute node is supported for the drill. Specify the desired compute node name by using <code>DBNodeCrashList</code>.</li>
         * </ul>
         * </blockquote>
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
         * <p>The automatic IMCI-based query acceleration feature. Valid values:</p>
         * <ul>
         * <li><code>ON</code>: enabled.</li>
         * <li><code>OFF</code>: disabled.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>Only PolarDB for MySQL clusters are supported.</li>
         * <li>For cluster version requirements, see <a href="https://help.aliyun.com/document_detail/2854119.html">Automatic acceleration (AutoIndex)</a>.</li>
         * </ul>
         * </blockquote>
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
         * <p>Modifies the row compression settings.</p>
         * 
         * <strong>example:</strong>
         * <p>OFF</p>
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
         * <p>The cross-zone automatic switchover mode of the cluster. Valid values:</p>
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
         * <p>Specifies whether to enable automatic storage scaling for the Standard Edition cluster. Valid values:</p>
         * <ul>
         * <li>Enable: enables automatic storage scaling.</li>
         * <li>Disable: disables automatic storage scaling.</li>
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
         * <p>The upper limit for automatic storage scaling of the Standard Edition cluster. Unit: GB.</p>
         * <blockquote>
         * <p>The maximum value is 32000.</p>
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
         * <p>The JSON string that contains the information about the databases and tables to be restored. The values of the database and table information are strings.
         * Example: <code>[    {        &quot;tables&quot;:[            {                &quot;name&quot;:&quot;testtb&quot;,                &quot;type&quot;:&quot;table&quot;,                &quot;newname&quot;:&quot;testtb_restore&quot;            }        ],        &quot;name&quot;:&quot;testdb&quot;,        &quot;type&quot;:&quot;db&quot;,        &quot;newname&quot;:&quot;testdb_restore&quot;    } ]</code>.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/194770.html">DescribeMetaList</a> operation to query the names of databases and tables that can be restored, and then specify the information in the corresponding fields in the preceding example.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[ { &quot;tables&quot;:[ { &quot;name&quot;:&quot;testtb&quot;, &quot;type&quot;:&quot;table&quot;, &quot;newname&quot;:&quot;testtb_restore&quot; } ], &quot;name&quot;:&quot;testdb&quot;, &quot;type&quot;:&quot;db&quot;, &quot;newname&quot;:&quot;testdb_restore&quot; } ]</p>
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
