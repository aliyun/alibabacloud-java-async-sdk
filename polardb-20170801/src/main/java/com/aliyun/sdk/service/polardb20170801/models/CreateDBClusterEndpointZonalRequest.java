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
 * {@link CreateDBClusterEndpointZonalRequest} extends {@link RequestModel}
 *
 * <p>CreateDBClusterEndpointZonalRequest</p>
 */
public class CreateDBClusterEndpointZonalRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("EndpointConfig")
    private String endpointConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endpointType;

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

    private CreateDBClusterEndpointZonalRequest(Builder builder) {
        super(builder);
        this.autoAddNewNodes = builder.autoAddNewNodes;
        this.clientToken = builder.clientToken;
        this.DBClusterId = builder.DBClusterId;
        this.DBEndpointDescription = builder.DBEndpointDescription;
        this.endpointConfig = builder.endpointConfig;
        this.endpointType = builder.endpointType;
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

    public static CreateDBClusterEndpointZonalRequest create() {
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
     * @return endpointConfig
     */
    public String getEndpointConfig() {
        return this.endpointConfig;
    }

    /**
     * @return endpointType
     */
    public String getEndpointType() {
        return this.endpointType;
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

    public static final class Builder extends Request.Builder<CreateDBClusterEndpointZonalRequest, Builder> {
        private String autoAddNewNodes; 
        private String clientToken; 
        private String DBClusterId; 
        private String DBEndpointDescription; 
        private String endpointConfig; 
        private String endpointType; 
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

        private Builder(CreateDBClusterEndpointZonalRequest request) {
            super(request);
            this.autoAddNewNodes = request.autoAddNewNodes;
            this.clientToken = request.clientToken;
            this.DBClusterId = request.DBClusterId;
            this.DBEndpointDescription = request.DBEndpointDescription;
            this.endpointConfig = request.endpointConfig;
            this.endpointType = request.endpointType;
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
         * <p>Specifies whether new nodes are automatically added to this endpoint. Valid values:</p>
         * <ul>
         * <li>Enable: New nodes are automatically added to this endpoint.</li>
         * <li>Disable (default): New nodes are not automatically added to this endpoint.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Disable</p>
         */
        public Builder autoAddNewNodes(String autoAddNewNodes) {
            this.putQueryParameter("AutoAddNewNodes", autoAddNewNodes);
            this.autoAddNewNodes = autoAddNewNodes;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request and prevent repeated submissions. The token is generated by the client, must be unique across requests, is case-sensitive, and cannot exceed 64 ASCII characters in length.</p>
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
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-***************</p>
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
         * <p>The advanced configurations of the cluster endpoint in JSON format. You can configure the consistency level, transaction splitting, offload reads from primary node, and connection pool settings.</p>
         * <ul>
         * <li>Configure the load balancing policy. Format: {\&quot;LoadBalancePolicy\&quot;:\&quot;Load balancing policy\&quot;}. Valid values:<ul>
         * <li><strong>0</strong>: connection-based load balancing (default).</li>
         * <li><strong>1</strong>: active-request-based load balancing.</li>
         * </ul>
         * </li>
         * <li>Configure the consistency level. Format: <code>{&quot;ConsistLevel&quot;:&quot;Consistency level&quot;}</code>. Valid values:<ul>
         * <li><strong>0</strong>: eventual consistency.</li>
         * <li><strong>1</strong>: session consistency (default).</li>
         * <li><strong>2</strong>: global consistency.</li>
         * </ul>
         * </li>
         * <li>Configure transaction splitting. Format: <code>{&quot;DistributedTransaction&quot;:&quot;Transaction splitting&quot;}</code>. Valid values:<ul>
         * <li><strong>on</strong>: enables transaction splitting (default).</li>
         * <li><strong>off</strong>: disables transaction splitting.</li>
         * </ul>
         * </li>
         * <li>Configure whether the primary node accepts read requests. Format: <code>{&quot;MasterAcceptReads&quot;:&quot;Offload reads from primary node&quot;}</code>. Valid values:<ul>
         * <li><strong>on</strong>: the primary node accepts read requests.</li>
         * <li><strong>off</strong>: the primary node does not accept read requests (default).</li>
         * </ul>
         * </li>
         * <li>Configure the connection pool. Format: <code>{&quot;ConnectionPersist&quot;:&quot;Connection pool&quot;}</code>. Valid values:<ul>
         * <li><strong>off</strong>: disables the connection pool (default).</li>
         * <li><strong>Session</strong>: enables the session-level connection pool.</li>
         * <li><strong>Transaction</strong>: enables the transaction-level connection pooling.</li>
         * </ul>
         * </li>
         * <li>Configure parallel query. Format: {\&quot;MaxParallelDegree\&quot;:\&quot;Parallel query\&quot;}. Valid values:<ul>
         * <li>A specific degree of parallelism. Example: &quot;MaxParallelDegree&quot;:&quot;2&quot;.</li>
         * <li><strong>off</strong>: disables parallel query (default).</li>
         * </ul>
         * </li>
         * <li>Configure automatic request distribution among row store and column store nodes. Format: {\&quot;EnableHtapImci\&quot;:\&quot;Automatic request distribution among row store and column store\&quot;}. Valid values:<ul>
         * <li><strong>on</strong>: enables automatic request distribution among row store and column store nodes.</li>
         * <li><strong>off</strong>: disables automatic request distribution among row store and column store nodes (default).</li>
         * </ul>
         * </li>
         * <li>Configure whether to enable overload protection. Format: {\&quot;EnableOverloadThrottle\&quot;:\&quot;Enable overload protection\&quot;}. Valid values:<ul>
         * <li><strong>on</strong>: enables overload protection.</li>
         * <li><strong>off</strong>: disables overload protection (default).</li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>Transaction splitting, offload reads from primary node, connection pool, and overload protection can be configured only when the read/write mode of the PolarDB for MySQL cluster endpoint is set to <strong>read/write (automatic read/write splitting)</strong>.</li>
         * <li>When the read/write mode of the PolarDB for MySQL cluster endpoint is <strong>read-only</strong>, both <strong>connection-based load balancing</strong> and <strong>active-request-based load balancing</strong> are supported. When the read/write mode is <strong>read/write (automatic read/write splitting)</strong>, only <strong>active-request-based load balancing</strong> is supported.</li>
         * <li>Automatic request distribution among row store and column store nodes can be configured when the read/write mode of the PolarDB for MySQL cluster endpoint is <strong>read/write (automatic read/write splitting)</strong>, or when the read/write mode is <strong>read-only</strong> and the load balancing policy is <strong>active-request-based load balancing</strong>.</li>
         * <li>Only PolarDB for MySQL supports setting the consistency level to global consistency.</li>
         * <li>If the <strong>ReadWriteMode</strong> parameter is set to <strong>ReadOnly</strong>, the consistency level can only be set to <strong>0</strong>.</li>
         * <li>You can configure the consistency level, transaction splitting, offload reads from primary node, and connection pool at the same time. Example: <code>{&quot;ConsistLevel&quot;:&quot;1&quot;,&quot;DistributedTransaction&quot;:&quot;on&quot;,&quot;ConnectionPersist&quot;:&quot;Session&quot;,&quot;MasterAcceptReads&quot;:&quot;on&quot;}</code>.</li>
         * <li>The transaction splitting setting is constrained by the consistency level. For example, when the consistency level is set to <strong>0</strong>, transaction splitting cannot be enabled. When the consistency level is set to <strong>1</strong> or <strong>2</strong>, transaction splitting can be enabled.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ConsistLevel&quot;: &quot;1&quot;,&quot;DistributedTransaction&quot;: &quot;on&quot;}</p>
         */
        public Builder endpointConfig(String endpointConfig) {
            this.putQueryParameter("EndpointConfig", endpointConfig);
            this.endpointConfig = endpointConfig;
            return this;
        }

        /**
         * <p>The type of the custom cluster endpoint. Set the value to <strong>Custom</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Custom</p>
         */
        public Builder endpointType(String endpointType) {
            this.putQueryParameter("EndpointType", endpointType);
            this.endpointType = endpointType;
            return this;
        }

        /**
         * <p>The read load nodes to add to the endpoint. Separate multiple nodes with commas (,). By default, all nodes are included.</p>
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
         * <li><p>0: Sends the request to the primary node.</p>
         * </li>
         * <li><p>2: Timeout degradation. When a global consistency read times out, the query is automatically degraded to regular requests, and the client does not receive an error message.</p>
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
         * <li>ReadWrite: read/write (automatic read/write splitting).</li>
         * <li>ReadOnly (default): read-only.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ReadOnly</p>
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
         * <p>Specifies whether to enable global consistency (high-performance mode) for the node. Valid values:</p>
         * <ul>
         * <li><p>ON: Enabled.</p>
         * </li>
         * <li><p>OFF: Disabled.</p>
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
        public CreateDBClusterEndpointZonalRequest build() {
            return new CreateDBClusterEndpointZonalRequest(this);
        } 

    } 

}
