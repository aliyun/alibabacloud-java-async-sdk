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
 * {@link ModifyDBClusterEndpointZonalRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBClusterEndpointZonalRequest</p>
 */
public class ModifyDBClusterEndpointZonalRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoAddNewNodes")
    private String autoAddNewNodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

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

    private ModifyDBClusterEndpointZonalRequest(Builder builder) {
        super(builder);
        this.autoAddNewNodes = builder.autoAddNewNodes;
        this.clientToken = builder.clientToken;
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

    public static ModifyDBClusterEndpointZonalRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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

    public static final class Builder extends Request.Builder<ModifyDBClusterEndpointZonalRequest, Builder> {
        private String autoAddNewNodes; 
        private String clientToken; 
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

        private Builder(ModifyDBClusterEndpointZonalRequest request) {
            super(request);
            this.autoAddNewNodes = request.autoAddNewNodes;
            this.clientToken = request.clientToken;
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
         * <p>Specifies whether to automatically add new nodes to this endpoint. Valid values: </p>
         * <ul>
         * <li><strong>Enable</strong>: Yes.</li>
         * <li><strong>Disable</strong>: No (default).</li>
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
         * <p>The client token that is used to ensure the idempotence of the request and prevent duplicate submissions. You can generate the value of this parameter on the client side. The value must be unique across different requests and is case-sensitive. The value can contain a maximum of 64 ASCII characters.</p>
         * 
         * <strong>example:</strong>
         * <p>6000170000591aed949d0f******************</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The edge cloud cluster ID. You can call DescribeDBClustersZonal to query the ID. The ID of a common PolarDB cluster returned by DescribeDBClusters is not supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-**************</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The endpoint name.</p>
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
         * <p>pe-****************</p>
         */
        public Builder DBEndpointId(String DBEndpointId) {
            this.putQueryParameter("DBEndpointId", DBEndpointId);
            this.DBEndpointId = DBEndpointId;
            return this;
        }

        /**
         * <p>The advanced configurations of the cluster endpoint. The value is in JSON format. You can configure the consistency level, transaction splitting, whether to offload offload reads from primary node, and the connection pool.</p>
         * <ul>
         * <li><p>To set the load balancing policy, use the format <code>{&quot;LoadBalancePolicy&quot;:&quot;Load balancing policy&quot;}</code>. Valid values:   </p>
         * <ul>
         * <li><strong>0</strong>: load balancing based on the number of connections (default).</li>
         * <li><strong>1</strong>: load balancing based on the number of active requests.</li>
         * </ul>
         * </li>
         * <li><p>To set whether to offload offload reads from primary node, use the format <code>{&quot;MasterAcceptReads&quot;:&quot;Whether to offload offload reads from primary node&quot;}</code>. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: The primary node accepts reads (default).</li>
         * <li><strong>off</strong>: Reads are offloaded from the primary node.</li>
         * </ul>
         * </li>
         * <li><p>To set transaction splitting, use the format <code>{&quot;DistributedTransaction&quot;:&quot;Transaction splitting&quot;}</code>. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: enables transaction splitting (default).</li>
         * <li><strong>off</strong>: disables transaction splitting.</li>
         * </ul>
         * </li>
         * <li><p>To set the consistency level, use the format <code>{&quot;ConsistLevel&quot;:&quot;Consistency level&quot;}</code>. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: eventual consistency (weak).</li>
         * <li><strong>1</strong>: session consistency (medium) (default).</li>
         * <li><strong>2</strong>: global consistency (strong).</li>
         * </ul>
         * </li>
         * <li><p>To set the global consistency read timeout period, use the format <code>{&quot;ConsistTimeout&quot;:&quot;Global consistency read timeout period&quot;}</code>. Valid values: 0 to 60000. Default value: 20. Unit: milliseconds.</p>
         * </li>
         * <li><p>To set the session consistency read timeout period, use the format <code>{&quot;ConsistSessionTimeout&quot;:&quot;Session consistency read timeout period&quot;}</code>. Valid values: 0 to 60000. Default value: 0. Unit: milliseconds.</p>
         * </li>
         * <li><p>To set the global (or session) consistency read timeout policy, use the format <code>{&quot;ConsistTimeoutAction&quot;:&quot;Global consistency read timeout policy&quot;}</code>. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: forwards read requests to the primary node (default).</li>
         * <li><strong>1</strong>: The proxy returns an error message <code>wait replication complete timeout, please retry</code> to the application.</li>
         * </ul>
         * </li>
         * <li><p>To set the connection pool, use the format <code>{&quot;ConnectionPersist&quot;:&quot;Connection pool&quot;}</code>. Valid values:</p>
         * <ul>
         * <li><strong>off</strong>: disables the connection pool (default).</li>
         * <li><strong>Session</strong>: enables the session-level connection pool.</li>
         * <li><strong>Transaction</strong>: enables transaction-level connection pooling.</li>
         * </ul>
         * </li>
         * <li><p>To set parallel query, use the format <code>{&quot;MaxParallelDegree&quot;:&quot;Parallel query&quot;}</code>. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: enables parallel query.</li>
         * <li><strong>off</strong>: disables parallel query (default).</li>
         * </ul>
         * </li>
         * <li><p>To set automatic request distribution between row store and column store nodes, use the format <code>{&quot;EnableHtapImci&quot;:&quot;Automatic request distribution between row store and column store nodes&quot;}</code>. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: enables automatic request distribution between row store and column store nodes.</li>
         * <li><strong>off</strong>: disables automatic request distribution between row store and column store nodes (default).</li>
         * </ul>
         * </li>
         * <li><p>To set whether to enable overload protection, use the format <code>{&quot;EnableOverloadThrottle&quot;:&quot;Whether to enable overload protection&quot;}</code>. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: enables overload protection.</li>
         * <li><strong>off</strong>: disables overload protection (default).</li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>You can configure transaction splitting, whether to offload offload reads from primary node, the connection pool, and whether to enable overload protection only when the read/write mode of the PolarDB for MySQL cluster endpoint is set to <strong>Read/write (automatic read/write splitting)</strong>.</li>
         * <li>When the read/write mode of the PolarDB for MySQL cluster endpoint is set to <strong>Read-only</strong>, both <strong>load balancing based on the number of connections</strong> and <strong>load balancing based on the number of active requests</strong> are supported. Cluster endpoints in <strong>Read/write (automatic read/write splitting)</strong> mode support only <strong>load balancing based on the number of active requests</strong>.</li>
         * <li>You can configure automatic request distribution between row store and column store nodes when the read/write mode of the PolarDB for MySQL cluster endpoint is set to <strong>Read/write (automatic read/write splitting)</strong>, or when the read/write mode is set to <strong>Read-only</strong> and the load balancing policy is set to <strong>load balancing based on the number of active requests</strong>.</li>
         * <li>Only PolarDB for MySQL supports setting the consistency level to global consistency.</li>
         * <li>If <strong>ReadWriteMode</strong> is set to <strong>ReadOnly</strong>, the consistency level can only be set to <strong>0</strong>.</li>
         * <li>You can configure the consistency level, transaction splitting, whether to offload offload reads from primary node, and the connection pool at the same time. Example: <code>{&quot;ConsistLevel&quot;:&quot;1&quot;,&quot;DistributedTransaction&quot;:&quot;on&quot;,&quot;ConnectionPersist&quot;:&quot;Session&quot;,&quot;MasterAcceptReads&quot;:&quot;on&quot;}</code>.</li>
         * <li>The transaction splitting configuration is restricted by the consistency level configuration. For example, if the consistency level is set to <strong>0</strong>, transaction splitting cannot be enabled. If the consistency level is set to <strong>1</strong> or <strong>2</strong>, transaction splitting can be enabled.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;DistributedTransaction&quot;:&quot;off&quot;,&quot;ConsistLevel&quot;:&quot;0&quot;,&quot;LoadBalanceStrategy&quot;:&quot;load&quot;,&quot;MasterAcceptReads&quot;:&quot;on&quot;}</p>
         */
        public Builder endpointConfig(String endpointConfig) {
            this.putQueryParameter("EndpointConfig", endpointConfig);
            this.endpointConfig = endpointConfig;
            return this;
        }

        /**
         * <p>The read-only nodes to be added to the destination endpoint. Separate multiple nodes with commas (,). Default value: the original nodes.</p>
         * <blockquote>
         * <ul>
         * <li>For PolarDB for MySQL, you must specify node IDs.</li>
         * <li>For PolarDB for PostgreSQL and PolarDB for PostgreSQL (Compatible with Oracle), you must specify node role names, such as <code>Writer,Reader1,Reader2</code>.</li>
         * <li>If <strong>ReadWriteMode</strong> is set to <strong>ReadOnly</strong>, you can mount only one node. However, if this node fails, the endpoint may be unavailable for up to 1 hour. Do not use this configuration in production environments. Therefore, select at least two nodes to improve availability.</li>
         * <li>If <strong>ReadWriteMode</strong> is set to <strong>ReadWrite</strong>, you must select at least two nodes.<ul>
         * <li>For PolarDB for MySQL, you can select any two nodes. If both nodes are read-only nodes, write requests are forwarded to the primary node.</li>
         * <li>For PolarDB for PostgreSQL and PolarDB for PostgreSQL (Compatible with Oracle), the primary node must be included.</li>
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
         * <p>The global consistency timeout policy. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: send the request to the primary node.</p>
         * </li>
         * <li><p><strong>2</strong>: timeout degradation. If a global consistency read times out, the current query operation is automatically downgraded to regular requests, and the client does not receive an error message.</p>
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
         * <p>The global consistency timeout period.</p>
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
         * <li><strong>ReadWrite</strong>: read/write (automatic read/write splitting).</li>
         * <li><strong>ReadOnly</strong>: read-only.</li>
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
         * <p>Specifies whether to enable the global consistency (high-performance mode) feature for the node. Valid values: on (enabled) and off (disabled).</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder sccMode(String sccMode) {
            this.putQueryParameter("SccMode", sccMode);
            this.sccMode = sccMode;
            return this;
        }

        @Override
        public ModifyDBClusterEndpointZonalRequest build() {
            return new ModifyDBClusterEndpointZonalRequest(this);
        } 

    } 

}
