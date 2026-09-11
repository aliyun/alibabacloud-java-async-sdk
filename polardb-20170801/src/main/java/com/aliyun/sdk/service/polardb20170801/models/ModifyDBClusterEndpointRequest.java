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
         * <p>Specifies whether new nodes are automatically added to the endpoint. Valid values: </p>
         * <ul>
         * <li><strong>Enable</strong>: New nodes are automatically added.</li>
         * <li><strong>Disable</strong>: New nodes are not automatically added. (Default)</li>
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
         * <p>The cluster ID.</p>
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
         * <p>The name of the endpoint.</p>
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
         * <p>The cluster endpoint ID.</p>
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
         * <p>The advanced configuration of the cluster endpoint in JSON format. You can configure the consistency level, transaction splitting, whether the primary node accepts read requests, and connection pooling.</p>
         * <ul>
         * <li><p>To set the load balancing policy, use the format <code>{\\&quot;LoadBalancePolicy\\&quot;:\\&quot;Load balancing policy\\&quot;}</code>. Valid values:   </p>
         * <ul>
         * <li><strong>0</strong>: connection-based load balancing (default)</li>
         * <li><strong>1</strong>: active-request-based load balancing</li>
         * </ul>
         * </li>
         * <li><p>To set whether the primary node accepts read requests, use the format <code>{\\&quot;MasterAcceptReads\\&quot;:\\&quot;Whether the primary node accepts reads\\&quot;}</code>. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: The primary node accepts read requests. (Default)</li>
         * <li><strong>off</strong>: The primary node does not accept read requests.</li>
         * </ul>
         * </li>
         * <li><p>To set transaction splitting, use the format <code>{\\&quot;DistributedTransaction\\&quot;:\\&quot;Transaction splitting\\&quot;}</code>. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: Transaction splitting is enabled. (Default)</li>
         * <li><strong>off</strong>: Transaction splitting is disabled.</li>
         * </ul>
         * </li>
         * <li><p>To set the consistency level, use the format <code>{\\&quot;ConsistLevel\\&quot;:\\&quot;Consistency level\\&quot;}</code>. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: eventual consistency (weak)</li>
         * <li><strong>1</strong>: session consistency (medium) (default)</li>
         * <li><strong>2</strong>: global consistency (strong)</li>
         * </ul>
         * </li>
         * <li><p>To set the global consistency read timeout period, use the format <code>{\\&quot;ConsistTimeout\\&quot;:\\&quot;Global consistency read timeout\\&quot;}</code>. Valid values: 0 to 60000. Default value: 20. Unit: ms.</p>
         * </li>
         * <li><p>To set the session consistency read timeout period, use the format <code>{\\&quot;ConsistSessionTimeout\\&quot;:\\&quot;Session consistency read timeout\\&quot;}</code>. Valid values: 0 to 60000. Default value: 0. Unit: ms.</p>
         * </li>
         * <li><p>To set the global (or session) consistency read timeout policy, use the format <code>{\\&quot;ConsistTimeoutAction\\&quot;:\\&quot;Global consistency read timeout policy\\&quot;}</code>. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Forward the read request to the primary node. (Default)</li>
         * <li><strong>1</strong>: The proxy returns the error message <code>wait replication complete timeout, please retry</code> to the application.</li>
         * </ul>
         * </li>
         * <li><p>To set the connection pool, use the format <code>{\\&quot;ConnectionPersist\\&quot;:\\&quot;Connection pool\\&quot;}</code>. Valid values:</p>
         * <ul>
         * <li><strong>off</strong>: The connection pool is disabled. (Default)</li>
         * <li><strong>Session</strong>: The session-level connection pool is enabled.</li>
         * <li><strong>Transaction</strong>: The transaction-level connection pooling is enabled.</li>
         * </ul>
         * </li>
         * <li><p>To set parallel query, use the format <code>{\\&quot;MaxParallelDegree\\&quot;:\\&quot;Parallel query\\&quot;}</code>. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: Parallel query is enabled.</li>
         * <li><strong>off</strong>: Parallel query is disabled. (Default)</li>
         * </ul>
         * </li>
         * <li><p>To set automatic request distribution among row offload reads from primary nodes, use the format <code>{\\&quot;EnableHtapImci\\&quot;:\\&quot;Automatic request distribution among row store and column store\\&quot;}</code>. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: Automatic request distribution among row offload reads from primary nodes is enabled.</li>
         * <li><strong>off</strong>: Automatic request distribution among row offload reads from primary nodes is disabled. (Default)</li>
         * </ul>
         * </li>
         * <li><p>To set whether to enable overload protection, use the format <code>{\\&quot;EnableOverloadThrottle\\&quot;:\\&quot;Whether to enable overload protection\\&quot;}</code>. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: Overload protection is enabled.</li>
         * <li><strong>off</strong>: Overload protection is disabled. (Default)</li>
         * </ul>
         * </li>
         * <li><p>To set node weights, use the format <code>{\\&quot;NodesWeight\\&quot;:{\\&quot;Node ID\\&quot;:\\&quot;Weight value\\&quot;}}</code>.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>Transaction splitting, whether the primary node accepts read requests, connection pooling, and overload protection can be configured only when the read/write mode of the PolarDB for MySQL cluster endpoint is <strong>ReadWrite (automatic read/write splitting)</strong>.</li>
         * <li>When the read/write mode of the PolarDB for MySQL cluster endpoint is <strong>ReadOnly</strong>, both <strong>connection-based load balancing</strong> and <strong>active-request-based load balancing</strong> policies are supported. The <strong>ReadWrite (automatic read/write splitting)</strong> mode supports only the <strong>active-request-based load balancing</strong> policy.</li>
         * <li>Automatic request distribution among row offload reads from primary nodes can be configured when the read/write mode of the PolarDB for MySQL cluster endpoint is <strong>ReadWrite (automatic read/write splitting)</strong>, or when the read/write mode is <strong>ReadOnly</strong> and the load balancing policy is <strong>active-request-based load balancing</strong>.</li>
         * <li>Only PolarDB for MySQL supports setting the consistency level to global consistency.</li>
         * <li>If <strong>ReadWriteMode</strong> is set to <strong>ReadOnly</strong>, the consistency level can only be set to <strong>0</strong>.</li>
         * <li>You can configure the consistency level, transaction splitting, whether the primary node accepts read requests, and connection pooling at the same time. Example: <code>{\\&quot;ConsistLevel\\&quot;:\\&quot;1\\&quot;,\\&quot;DistributedTransaction\\&quot;:\\&quot;on\\&quot;,\\&quot;ConnectionPersist\\&quot;:\\&quot;Session\\&quot;,\\&quot;MasterAcceptReads\\&quot;:\\&quot;on\\&quot;}</code>.</li>
         * <li>Transaction splitting is constrained by the consistency level. For example, transaction splitting cannot be enabled when the consistency level is <strong>0</strong>. Transaction splitting can be enabled when the consistency level is <strong>1</strong> or <strong>2</strong>.</li>
         * </ul>
         * </blockquote>
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
         * <p>The read load nodes to add to the endpoint. Separate multiple nodes with commas (,). Default value: the existing nodes.</p>
         * <blockquote>
         * <ul>
         * <li>For PolarDB for MySQL, specify node IDs.</li>
         * <li>For PolarDB for PostgreSQL and PolarDB for PostgreSQL (Compatible with Oracle), specify node role names, such as <code>Writer,Reader1,Reader2</code>.</li>
         * <li>If <strong>ReadWriteMode</strong> is set to <strong>ReadOnly</strong>, you can mount only one node. However, if this node fails, the endpoint may be unavailable for up to 1 hour. Do not use this configuration in production environments. Select at least 2 nodes to improve availability.</li>
         * <li>If <strong>ReadWriteMode</strong> is set to <strong>ReadWrite</strong>, select at least 2 nodes.<ul>
         * <li>PolarDB for MySQL allows you to select any two nodes. If both nodes are read-only nodes, write requests are forwarded to the primary node.</li>
         * <li>PolarDB for PostgreSQL and PolarDB for PostgreSQL (Compatible with Oracle) require the primary node to be included.</li>
         * </ul>
         * </li>
         * </ul>
         * </blockquote>
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
         * <p>The timeout policy for global consistency. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: Send the request to the primary node.</p>
         * </li>
         * <li><p><strong>2</strong>: Timeout degradation. When the global consistency read times out, the query is automatically degraded to regular requests, and the client does not receive an error message.</p>
         * </li>
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
         * <p>The timeout period for global consistency.</p>
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
         * <li><strong>ReadWrite</strong>: read/write (automatic read/write splitting)</li>
         * <li><strong>ReadOnly</strong>: read-only</li>
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
         * <p>Specifies whether to enable the global consistency (high-performance mode) feature for the node. Valid values:</p>
         * <ul>
         * <li><p><strong>ON</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>OFF</strong>: Disabled.</p>
         * </li>
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
