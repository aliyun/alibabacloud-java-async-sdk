// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
         * <p>Specifies whether to automatically associate newly added nodes with the cluster endpoint. Default value: Disable. Valid values:</p>
         * <ul>
         * <li><strong>Enable</strong></li>
         * <li><strong>Disable</strong></li>
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
         * <p>The advanced configurations of the cluster endpoint, which are in the JSON format. You can specify the configurations of the following attributes: consistency level, transaction splitting, connection pool, and primary node accepts read requests.</p>
         * <ul>
         * <li><p>Specifies the load balancing policy in the format of <code>{\&quot;LoadBalancePolicy\&quot;:\&quot;Selected value\&quot;}</code>. Default value: 0. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: connections-based load balancing</li>
         * <li><strong>1</strong>: active requests-based load balancing</li>
         * </ul>
         * </li>
         * <li><p>Specifies whether to enable the primary node accepts read requests feature in the format of <code>{\&quot;MasterAcceptReads\&quot;:\&quot;Selected value\&quot;}</code>. Default value: on. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * </li>
         * <li><p>Specifies whether to enable the transaction splitting feature in the format of <code>{\&quot;DistributedTransaction\&quot;:\&quot;Selected value\&quot;}</code>. Default value: on. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * </li>
         * <li><p>Specifies the consistency level in the format of <code>{\&quot;ConsistLevel\&quot;:\&quot;Selected value\&quot;}</code>. Default value: 1. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: eventual consistency (weak)</li>
         * <li><strong>1</strong>: session consistency (medium)</li>
         * <li><strong>2</strong>: global consistency (strong)</li>
         * </ul>
         * </li>
         * <li><p>Specifies the connection pool in the format of <code>{\&quot;ConnectionPersist\&quot;:\&quot;Selected value\&quot;}</code>. Default value: off. Valid values:</p>
         * <ul>
         * <li><strong>off</strong>: disables the connection pool.</li>
         * <li><strong>Session</strong>: enables the session-level connection pool.</li>
         * <li><strong>Transaction</strong>: enables the transaction-level connection pool.</li>
         * </ul>
         * </li>
         * <li><p>Specifies whether to enable the parallel query feature in the format of <code>{\&quot;MaxParallelDegree\&quot;:\&quot;Selected value\&quot;}</code>. Default value: off. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * </li>
         * <li><p>Specifies whether to enable the automatic request distribution between row store and column store nodes feature in the format of <code>{\&quot;EnableHtapImci\&quot;:\&quot;Selected value\&quot;}</code>. Default value: off. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * </li>
         * <li><p>Specifies whether to enable the overload protection feature in the format of <code>{\&quot;EnableOverloadThrottle\&quot;:\&quot;Selected value\&quot;}</code>. Default value: off. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>You can specify the transaction splitting, primary node accepts read requests, connection pool, and overload protection features for a PolarDB for MySQL cluster only if ReadWriteMode is set to ReadWrite for the cluster endpoint.</p>
         * </li>
         * <li><p>If the read /write mode of a PolarDB for MySQL cluster is set to <strong>Read-only</strong>, the <strong>Connection-based SLB</strong> and <strong>Active Request-based SLB</strong> SLB policies are supported. The <strong>Read-write (Automatic read /write splitting) <strong>mode of the cluster supports</strong> Active Request-based SLB</strong> policy.</p>
         * </li>
         * <li><p>If ReadWriteMode is set to <strong>ReadWrite</strong> for the cluster endpoint of a PolarDB for MySQL cluster or if ReadWriteMode is set to <strong>ReadOnly</strong> and the load balancing policy is set to <strong>active requests-based load balancing</strong>, the automatic request distribution between row store and column store nodes feature is supported.</p>
         * </li>
         * <li><p>Only PolarDB for MySQL supports global consistency.</p>
         * </li>
         * <li><p>If the <strong>ReadWriteMode</strong> parameter is set to <strong>ReadOnly</strong>, the consistency level must be <strong>0</strong>.</p>
         * </li>
         * <li><p>You can specify the consistency level, transaction splitting, connection pool, and primary node accepts read requests features at a time, such as <code>{\&quot;ConsistLevel\&quot;:\&quot;1\&quot;,\&quot;DistributedTransaction\&quot;:\&quot;on\&quot;,\&quot;ConnectionPersist\&quot;:\&quot;Session\&quot;,\&quot;MasterAcceptReads\&quot;:\&quot;on\&quot;}</code>.</p>
         * </li>
         * <li><p>The transaction splitting settings are restricted by the consistency level settings. For example, if you set the consistency level to <strong>0</strong>, transaction splitting cannot be enabled. If you set the consistency level to <strong>1</strong> or <strong>2</strong>, transaction splitting can be enabled.</p>
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
         * PolarSccTimeoutAction.
         */
        public Builder polarSccTimeoutAction(String polarSccTimeoutAction) {
            this.putQueryParameter("PolarSccTimeoutAction", polarSccTimeoutAction);
            this.polarSccTimeoutAction = polarSccTimeoutAction;
            return this;
        }

        /**
         * PolarSccWaitTimeout.
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
         * SccMode.
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
