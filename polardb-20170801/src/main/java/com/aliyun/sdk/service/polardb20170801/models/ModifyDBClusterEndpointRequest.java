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
         * <p>Specifies whether to automatically add new nodes to the endpoint. Valid values:</p>
         * <ul>
         * <li><p><strong>Enable</strong>: Automatically adds new nodes.</p>
         * </li>
         * <li><p><strong>Disable</strong>: Does not automatically add new nodes. This is the default value.</p>
         * </li>
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
         * <p>The ID of the cluster endpoint.</p>
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
         * <p>The advanced configurations of the cluster endpoint in JSON format. You can set the consistency level, transaction splitting, whether the primary node accepts read requests, the connection pool, and other settings.</p>
         * <ul>
         * <li><p>Sets the load balancing policy. Format: <code>{\\&quot;LoadBalancePolicy\\&quot;:\\&quot;policy\\&quot;}</code>. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: Connections-based load balancing (default)</p>
         * </li>
         * <li><p><strong>1</strong>: Active requests-based load balancing</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>Specifies whether the primary node accepts read requests. Format: <code>{\\&quot;MasterAcceptReads\\&quot;:\\&quot;value\\&quot;}</code>. Valid values:</p>
         * <ul>
         * <li><p><strong>on</strong>: The primary node accepts read requests (default).</p>
         * </li>
         * <li><p><strong>off</strong>: The primary node does not accept read requests.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>Enables or disables transaction splitting. Format: <code>{\\&quot;DistributedTransaction\\&quot;:\\&quot;value\\&quot;}</code>. Valid values:</p>
         * <ul>
         * <li><p><strong>on</strong>: Enables transaction splitting (default).</p>
         * </li>
         * <li><p><strong>off</strong>: Disables transaction splitting.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>Sets the consistency level. Format: <code>{\\&quot;ConsistLevel\\&quot;:\\&quot;level\\&quot;}</code>. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: Eventual consistency (weak)</p>
         * </li>
         * <li><p><strong>1</strong>: Session consistency (medium) (default)</p>
         * </li>
         * <li><p><strong>2</strong>: Global consistency (strong)</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>Sets the timeout period for a global consistency read. Format: <code>{\\&quot;ConsistTimeout\\&quot;:\\&quot;timeout\\&quot;}</code>. Valid values: 0 to 60000. Default value: 20. Unit: ms.</p>
         * </li>
         * <li><p>Sets the timeout period for a session consistency read. Format: <code>{\\&quot;ConsistSessionTimeout\\&quot;:\\&quot;timeout\\&quot;}</code>. Valid values: 0 to 60000. Default value: 0. Unit: ms.</p>
         * </li>
         * <li><p>Sets the policy for handling timeouts of global or session consistency reads. Format: <code>{\\&quot;ConsistTimeoutAction\\&quot;:\\&quot;policy\\&quot;}</code>. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: Forwards read requests to the primary node (default).</p>
         * </li>
         * <li><p><strong>1</strong>: The proxy returns the error message \<code>wait replication complete timeout, please retry\\</code> to the application.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>Sets the connection pool type. Format: <code>{\\&quot;ConnectionPersist\\&quot;:\\&quot;type\\&quot;}</code>. Valid values:</p>
         * <ul>
         * <li><p><strong>off</strong>: Disables the connection pool (default).</p>
         * </li>
         * <li><p><strong>Session</strong>: Enables the session-level connection pool.</p>
         * </li>
         * <li><p><strong>Transaction</strong>: Enables the transaction-level connection pool.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>Enables or disables parallel query. Format: <code>{\\&quot;MaxParallelDegree\\&quot;:\\&quot;value\\&quot;}</code>. Valid values:</p>
         * <ul>
         * <li><p><strong>on</strong>: Enables parallel query.</p>
         * </li>
         * <li><p><strong>off</strong>: Disables parallel query (default).</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>Enables or disables automatic routing of requests to the row store or column store. Format: <code>{\\&quot;EnableHtapImci\\&quot;:\\&quot;value\\&quot;}</code>. Valid values:</p>
         * <ul>
         * <li><p><strong>on</strong>: Enables automatic routing.</p>
         * </li>
         * <li><p><strong>off</strong>: Disables automatic routing (default).</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>Enables or disables overload protection. Format: <code>{\\&quot;EnableOverloadThrottle\\&quot;:\\&quot;value\\&quot;}</code>. Valid values:</p>
         * <ul>
         * <li><p><strong>on</strong>: Enables overload protection.</p>
         * </li>
         * <li><p><strong>off</strong>: Disables overload protection (default).</p>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><p>You can set transaction splitting, whether the primary node accepts read requests, the connection pool, and overload protection only when the read/write mode of the cluster endpoint for PolarDB for MySQL is set to ReadWrite (automatic read/write splitting).</p>
         * </li>
         * <li><p>If the read/write mode of a cluster endpoint for PolarDB for MySQL is <strong>ReadOnly</strong>, both <strong>connections-based</strong> and <strong>active requests-based</strong> load balancing policies are supported. If the read/write mode is <strong>ReadWrite</strong> (automatic read/write splitting), only the <strong>active requests-based</strong> load balancing policy is supported.</p>
         * </li>
         * <li><p>You can enable automatic routing to the row store or column store if the read/write mode of the cluster endpoint for PolarDB for MySQL is <strong>ReadWrite</strong> (automatic read/write splitting), or if the read/write mode is <strong>ReadOnly</strong> and the load balancing policy is <strong>active requests-based</strong>.</p>
         * </li>
         * <li><p>Only PolarDB for MySQL supports global consistency.</p>
         * </li>
         * <li><p>If you set the <strong>ReadWriteMode</strong> parameter to <strong>ReadOnly</strong>, you can only set the consistency level to <strong>0</strong>.</p>
         * </li>
         * <li><p>You can set the consistency level, transaction splitting, whether the primary node accepts read requests, and the connection pool at the same time. For example: <code>{\\&quot;ConsistLevel\\&quot;:\\&quot;1\\&quot;,\\&quot;DistributedTransaction\\&quot;:\\&quot;on\\&quot;,\\&quot;ConnectionPersist\\&quot;:\\&quot;Session\\&quot;,\\&quot;MasterAcceptReads\\&quot;:\\&quot;on\\&quot;}</code>.</p>
         * </li>
         * <li><p>The transaction splitting setting is constrained by the consistency level. For example, you cannot enable transaction splitting if the consistency level is <strong>0</strong> (eventual consistency). You can enable transaction splitting if the consistency level is <strong>1</strong> (session consistency) or <strong>2</strong> (global consistency).</p>
         * </li>
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
         * <p>The nodes to be added to the endpoint for read request distribution. Separate multiple node IDs with commas (,). The original nodes are used by default.</p>
         * <blockquote>
         * <ul>
         * <li><p>For PolarDB for MySQL, specify the node IDs.</p>
         * </li>
         * <li><p>For PolarDB for PostgreSQL and PolarDB for PostgreSQL (Oracle Compatible), specify the node roles, such as <code>Writer,Reader1,Reader2</code>.</p>
         * </li>
         * <li><p>If you set <strong>ReadWriteMode</strong> to <strong>ReadOnly</strong>, you can attach only one node. However, if this node fails, the endpoint may be unavailable for up to one hour. Do not use this configuration in a production environment. Select at least two nodes to improve availability.</p>
         * </li>
         * <li><p>If you set <strong>ReadWriteMode</strong> to <strong>ReadWrite</strong>, you must select at least two nodes.
         * \* For PolarDB for MySQL, you can select any two nodes. If both nodes are read-only nodes, write requests are sent to the primary node.
         * \* For PolarDB for PostgreSQL and PolarDB for PostgreSQL (Oracle Compatible), you must include the primary node.</p>
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
         * <p>The policy for handling global consistency timeouts. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: Forwards the request to the primary node.</p>
         * </li>
         * <li><p><strong>2</strong>: Degrades the request. If a global consistency read times out, the query is automatically degraded to a regular request. The client does not receive an error message.</p>
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
         * <li><p><strong>ReadWrite</strong>: Read/write (automatic read/write splitting)</p>
         * </li>
         * <li><p><strong>ReadOnly</strong>: Read-only</p>
         * </li>
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
         * <li><p><strong>ON</strong>: Enable</p>
         * </li>
         * <li><p><strong>OFF</strong>: Disable</p>
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
