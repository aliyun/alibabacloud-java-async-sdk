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
 * {@link ModifyDBClusterEndpointRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBClusterEndpointRequest</p>
 */
public class ModifyDBClusterEndpointRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoAddNewNodes")
    private String autoAddNewNodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBEndpointDescription")
    private String DBEndpointDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBEndpointId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBEndpointId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointConfig")
    private String endpointConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Nodes")
    private String nodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolarSccTimeoutAction")
    private String polarSccTimeoutAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolarSccWaitTimeout")
    private String polarSccWaitTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReadWriteMode")
    private String readWriteMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SccMode")
    private String sccMode;

    private ModifyDBClusterEndpointRequest(Builder builder) {
        super(builder);
        this.autoAddNewNodes = builder.autoAddNewNodes;
        this.DBClusterId = builder.DBClusterId;
        this.DBEndpointDescription = builder.DBEndpointDescription;
        this.DBEndpointId = builder.DBEndpointId;
        this.endpointConfig = builder.endpointConfig;
        this.nodes = builder.nodes;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.polarSccTimeoutAction = builder.polarSccTimeoutAction;
        this.polarSccWaitTimeout = builder.polarSccWaitTimeout;
        this.readWriteMode = builder.readWriteMode;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sccMode = builder.sccMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBClusterEndpointRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoAddNewNodes
     */
    public String getAutoAddNewNodes() {
        return this.autoAddNewNodes;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return DBEndpointDescription
     */
    public String getDBEndpointDescription() {
        return this.DBEndpointDescription;
    }

    /**
     * @return DBEndpointId
     */
    public String getDBEndpointId() {
        return this.DBEndpointId;
    }

    /**
     * @return endpointConfig
     */
    public String getEndpointConfig() {
        return this.endpointConfig;
    }

    /**
     * @return nodes
     */
    public String getNodes() {
        return this.nodes;
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
     * @return polarSccTimeoutAction
     */
    public String getPolarSccTimeoutAction() {
        return this.polarSccTimeoutAction;
    }

    /**
     * @return polarSccWaitTimeout
     */
    public String getPolarSccWaitTimeout() {
        return this.polarSccWaitTimeout;
    }

    /**
     * @return readWriteMode
     */
    public String getReadWriteMode() {
        return this.readWriteMode;
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
     * @return sccMode
     */
    public String getSccMode() {
        return this.sccMode;
    }

    public static final class Builder extends Request.Builder<ModifyDBClusterEndpointRequest, Builder> {
        private String autoAddNewNodes; 
        private String DBClusterId; 
        private String DBEndpointDescription; 
        private String DBEndpointId; 
        private String endpointConfig; 
        private String nodes; 
        private String ownerAccount; 
        private Long ownerId; 
        private String polarSccTimeoutAction; 
        private String polarSccWaitTimeout; 
        private String readWriteMode; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String sccMode; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBClusterEndpointRequest request) {
            super(request);
            this.autoAddNewNodes = request.autoAddNewNodes;
            this.DBClusterId = request.DBClusterId;
            this.DBEndpointDescription = request.DBEndpointDescription;
            this.DBEndpointId = request.DBEndpointId;
            this.endpointConfig = request.endpointConfig;
            this.nodes = request.nodes;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.polarSccTimeoutAction = request.polarSccTimeoutAction;
            this.polarSccWaitTimeout = request.polarSccWaitTimeout;
            this.readWriteMode = request.readWriteMode;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sccMode = request.sccMode;
        } 

        /**
         * <p>Specifies whether to enable automatic association of newly added nodes with the cluster endpoint. Valid values:</p>
         * <ul>
         * <li><strong>Enable</strong>: enables automatic association of newly added nodes with the cluster endpoint.</li>
         * <li><strong>Disable</strong> (default): disables automatic association of newly added nodes with the cluster endpoint.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        public Builder autoAddNewNodes(String autoAddNewNodes) {
            this.putQueryParameter("AutoAddNewNodes", autoAddNewNodes);
            this.autoAddNewNodes = autoAddNewNodes;
            return this;
        }

        /**
         * <p>The ID of the cluster.</p>
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
         * <p>The name of the custom cluster endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder DBEndpointDescription(String DBEndpointDescription) {
            this.putQueryParameter("DBEndpointDescription", DBEndpointDescription);
            this.DBEndpointDescription = DBEndpointDescription;
            return this;
        }

        /**
         * <p>The ID of the endpoint.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pe-**************</p>
         */
        public Builder DBEndpointId(String DBEndpointId) {
            this.putQueryParameter("DBEndpointId", DBEndpointId);
            this.DBEndpointId = DBEndpointId;
            return this;
        }

        /**
         * <p>The advanced configurations of the cluster endpoint, which are in the JSON format. You can configure the consistency level, transaction splitting, and connection pool settings, and specify whether the primary node accepts read requests.</p>
         * <ul>
         * <li><p>The load balancing policy. Format: <code>{\&quot;LoadBalancePolicy\&quot;:\&quot;Load balancing policy\&quot;}</code>. Valid values:</p>
         * <ul>
         * <li><strong>0</strong> (default): connections-based load balancing</li>
         * <li><strong>1</strong>: active requests-based load balancing</li>
         * </ul>
         * </li>
         * <li><p>Specifies whether to allow the primary node to accept read requests. Format: <code>{\&quot;MasterAcceptReads\&quot;:\&quot;Specification about whether to allow the primary node to accept read requests\&quot;}</code>. Valid values:</p>
         * <ul>
         * <li><strong>on</strong> (default): allows the primary node to accept read requests.</li>
         * <li><strong>off</strong>: does not allow the primary node to accept read requests.</li>
         * </ul>
         * </li>
         * <li><p>Specifies whether to enable the transaction splitting feature. Format: <code>{\&quot;DistributedTransaction\&quot;:\&quot;Specification about whether to enable the transaction splitting feature\&quot;}</code>. Valid values:</p>
         * <ul>
         * <li><strong>on</strong> (default): enables the transaction splitting feature.</li>
         * <li><strong>off</strong>: disables the transaction splitting feature.</li>
         * </ul>
         * </li>
         * <li><p>The consistency level. Format: <code>{\&quot;ConsistLevel\&quot;:\&quot;Consistency level\&quot;}</code>. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: eventual consistency (weak)</li>
         * <li><strong>1</strong> (default): session consistency (medium)</li>
         * <li><strong>2</strong>: global consistency (strong)</li>
         * </ul>
         * </li>
         * <li><p>The global consistency timeout. Format: <code>{\&quot;ConsistTimeout\&quot;:\&quot;Global consistency timeout\&quot;}</code>. Valid values: 0 to 60,000. Default value: 20. Unit: ms.</p>
         * </li>
         * <li><p>The session consistency timeout. Format: <code>{\&quot;ConsistSessionTimeout\&quot;:\&quot;Session consistency timeout\&quot;}</code>. Valid values: 0 to 60,000. Default value: 0. Unit: ms.</p>
         * </li>
         * <li><p>The global (or session) consistency timeout policy. Format: <code>{\&quot;ConsistTimeoutAction\&quot;:\&quot;Consistency timeout policy\&quot;}</code>. Valid values:</p>
         * <ul>
         * <li><strong>0</strong> (default): PolarProxy sends read requests to the primary node.</li>
         * <li><strong>1</strong>: PolarProxy returns the &quot;wait replication complete timeout, please retry&quot; error message to the application.</li>
         * </ul>
         * </li>
         * <li><p>Specifies whether to enable the connection pool feature. Format: <code>{\&quot;ConnectionPersist\&quot;:\&quot;Specification about whether to enable the connection pool feature\&quot;}</code>. Valid values:</p>
         * <ul>
         * <li><strong>off</strong> (default): disables the connection pool feature.</li>
         * <li><strong>Session</strong>: enables the session-level connection pool.</li>
         * <li><strong>Transaction</strong>: enables the transaction-level connection pool.</li>
         * </ul>
         * </li>
         * <li><p>Specifies whether to enable the parallel query feature. Format: <code>{\&quot;MaxParallelDegree\&quot;:\&quot;Specification about whether to enable the parallel query feature\&quot;}</code>. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: enables the parallel query feature.</li>
         * <li><strong>off</strong> (default): disables the parallel query feature.</li>
         * </ul>
         * </li>
         * <li><p>Specifies whether to enable the automatic request distribution among row store and column store nodes feature. Format: <code>{\&quot;EnableHtapImci\&quot;:\&quot;Specification about whether to enable automatic request distribution among row store and column store nodes feature\&quot;}</code>. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: enables the automatic request distribution among row store and column store nodes feature.</li>
         * <li><strong>off</strong> (default): disables the automatic request distribution among row store and column store nodes feature.</li>
         * </ul>
         * </li>
         * <li><p>Specifies whether to enable the overload protection feature. Format: <code>{\&quot;EnableOverloadThrottle\&quot;:\&quot;Specification about whether to enable the overload protection feature\&quot;}</code>. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: enables the overload protection feature.</li>
         * <li><strong>off</strong> (default): disables the overload protection feature.</li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>You can configure the transaction splitting, connection pool, and overload protection settings, and specify whether the primary node accepts read requests settings for the cluster endpoint of a PolarDB for MySQL cluster only if ReadWriteMode of the cluster endpoint is set to Read and Write (Automatic Read/Write Splitting).</p>
         * </li>
         * <li><p>If ReadWriteMode of the cluster endpoint of a PolarDB for MySQL cluster is set to <strong>Read-only</strong>, you can specify the <strong>Connections-based Load Balancing</strong> or <strong>Active Request-based Load Balancing</strong> policy for the cluster endpoint. If ReadWriteMode of the cluster endpoint of a PolarDB for MySQL cluster is set to <strong>Read/Write (Automatic Read/Write Splitting)</strong>, you can specify only the <strong>Active Request-based Load Balancing</strong> policy for the cluster endpoint.</p>
         * </li>
         * <li><p>You can enable automatic request distribution among column store and row store nodes for the cluster endpoint of a PolarDB for MySQL cluster if ReadWriteMode of the cluster endpoint is set to <strong>Read and Write (Automatic Read/Write Splitting)</strong>, or if the ReadWriteMode of the cluster endpoint is set to <strong>Read-only</strong> and the load balancing policy is set to <strong>Active requests-based load balancing</strong>.</p>
         * </li>
         * <li><p>Only PolarDB for MySQL supports global consistency.</p>
         * </li>
         * <li><p>You can set the consistency level of the cluster endpoint of a PolarDB for MySQL cluster only to <strong>0</strong> if <strong>ReadWriteMode</strong> of the cluster endpoint is set to <strong>ReadOnly</strong>.</p>
         * </li>
         * <li><p>You can configure the settings for the consistency level, transaction splitting, and connection pool features, and specify whether the primary node accepts read requests settings at a time. Example: <code>{\&quot;ConsistLevel\&quot;:\&quot;1\&quot;,\&quot;DistributedTransaction\&quot;:\&quot;on\&quot;,\&quot;ConnectionPersist\&quot;:\&quot;Session\&quot;,\&quot;MasterAcceptReads\&quot;:\&quot;on\&quot;}</code>.</p>
         * </li>
         * <li><p>The configuration for transaction splitting is limited by the configuration for the consistency level. For example, if you set the consistency level to <strong>0</strong>, you cannot enable transaction splitting. If you set the consistency level to <strong>1</strong> or <strong>2</strong>, you can enable transaction splitting.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ConsistLevel&quot;:&quot;1&quot;,&quot;DistributedTransaction&quot;:&quot;on&quot;,&quot;MasterAcceptReads&quot;:&quot;off&quot;,&quot;ConnectionPersist&quot;: &quot;on&quot;}</p>
         */
        public Builder endpointConfig(String endpointConfig) {
            this.putQueryParameter("EndpointConfig", endpointConfig);
            this.endpointConfig = endpointConfig;
            return this;
        }

        /**
         * <p>The reader nodes to be associated with the endpoint. If you need to specify multiple reader nodes, separate the reader nodes with commas (,). If you do not specify this parameter, the predefined nodes are used by default.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>You must specify the node ID for each PolarDB for MySQL cluster.</p>
         * </li>
         * <li><p>You must specify the role name of each node for each PolarDB for PostgreSQL or PolarDB for Oracle cluster. Example: <code>Writer,Reader1,Reader2</code>.</p>
         * </li>
         * <li><p>If you set <strong>ReadWriteMode</strong> to <strong>ReadOnly</strong>, only one node can be associated with the cluster endpoint. If the only node becomes faulty, the cluster endpoint may be unavailable for up to an hour. We recommend that you do not associate only one node with the cluster endpoint in production environments. We recommend that you associate at least two nodes with the cluster endpoint to improve service availability.</p>
         * </li>
         * <li><p>If you set <strong>ReadWriteMode</strong> to <strong>ReadWrite</strong>, you must associate at least two nodes with the cluster endpoint.</p>
         * <ul>
         * <li>No limits are imposed on the two nodes that you select for each PolarDB for MySQL cluster. If the two nodes are read-only nodes, write requests are forwarded to the primary node.</li>
         * <li>The following limit applies to PolarDB for PostgreSQL and PolarDB for Oracle clusters: One of the selected nodes must be the primary node.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pi-**************,pi-*************</p>
         */
        public Builder nodes(String nodes) {
            this.putQueryParameter("Nodes", nodes);
            this.nodes = nodes;
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
         * <p>Global consistency timeout policy. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: sends the request to the primary node.</li>
         * <li><strong>2</strong>: downgrades the consistency level of a query to inconsistent read when a global consistent read in the query times out. No error message is returned to the client.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder polarSccTimeoutAction(String polarSccTimeoutAction) {
            this.putQueryParameter("PolarSccTimeoutAction", polarSccTimeoutAction);
            this.polarSccTimeoutAction = polarSccTimeoutAction;
            return this;
        }

        /**
         * <p>Global consistency timeout.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder polarSccWaitTimeout(String polarSccWaitTimeout) {
            this.putQueryParameter("PolarSccWaitTimeout", polarSccWaitTimeout);
            this.polarSccWaitTimeout = polarSccWaitTimeout;
            return this;
        }

        /**
         * <p>The read/write mode. Valid values:</p>
         * <ul>
         * <li><strong>ReadWrite</strong>: The cluster endpoint handles read and write requests. Automatic read/write splitting is enabled.</li>
         * <li><strong>ReadOnly</strong>: The cluster endpoint handles read-only requests.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ReadWrite</p>
         */
        public Builder readWriteMode(String readWriteMode) {
            this.putQueryParameter("ReadWriteMode", readWriteMode);
            this.readWriteMode = readWriteMode;
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
         * <p>Specifies whether to enable the global consistency (high-performance mode) feature for the nodes. Valid values:</p>
         * <ul>
         * <li><strong>ON</strong></li>
         * <li><strong>OFF</strong></li>
         * </ul>
         * <p>Valid values:</p>
         * <ul>
         * <li>on</li>
         * <li>off</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder sccMode(String sccMode) {
            this.putQueryParameter("SccMode", sccMode);
            this.sccMode = sccMode;
            return this;
        }

        @Override
        public ModifyDBClusterEndpointRequest build() {
            return new ModifyDBClusterEndpointRequest(this);
        } 

    } 

}
