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
         * <p>Specifies whether to automatically add new nodes to this endpoint. Valid values:</p>
         * <ul>
         * <li><p>Enable: New nodes are automatically added to this endpoint.</p>
         * </li>
         * <li><p>Disable: New nodes are not automatically added to this endpoint. This is the default value.</p>
         * </li>
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
         * <p>A client token that is used to ensure the idempotence of the request. The client generates the value, which must be unique among different requests. The token is case-sensitive and can be up to 64 ASCII characters in length.</p>
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
         * <p>The advanced configurations of the cluster endpoint, specified in the JSON format. This parameter supports settings for consistency level, transaction splitting, offloading reads from the primary node, and the connection pool.</p>
         * <ul>
         * <li><p>Sets the load balancing policy. The format is {&quot;LoadBalancePolicy&quot;:&quot;policy&quot;}. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: Connections-based load balancing. This is the default value.</p>
         * </li>
         * <li><p><strong>1</strong>: Active requests-based load balancing.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>Sets the consistency level. The format is <code>{&quot;ConsistLevel&quot;:&quot;level&quot;}</code>. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: Eventual consistency.</p>
         * </li>
         * <li><p><strong>1</strong>: Session consistency. This is the default value.</p>
         * </li>
         * <li><p><strong>2</strong>: Global consistency.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>Sets transaction splitting. The format is <code>{&quot;DistributedTransaction&quot;:&quot;on/off&quot;}</code>. Valid values:</p>
         * <ul>
         * <li><p><strong>on</strong>: Enables transaction splitting. This is the default value.</p>
         * </li>
         * <li><p><strong>off</strong>: Disables transaction splitting.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>Specifies whether the primary node accepts read requests. The format is <code>{&quot;MasterAcceptReads&quot;:&quot;on/off&quot;}</code>. Valid values:</p>
         * <ul>
         * <li><p><strong>on</strong>: The primary node accepts read requests.</p>
         * </li>
         * <li><p><strong>off</strong>: The primary node does not accept read requests. This is the default value.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>Sets the connection pool. The format is <code>{&quot;ConnectionPersist&quot;:&quot;type&quot;}</code>. Valid values:</p>
         * <ul>
         * <li><p><strong>off</strong>: Disables the connection pool. This is the default value.</p>
         * </li>
         * <li><p><strong>Session</strong>: Enables the session-level connection pool.</p>
         * </li>
         * <li><p><strong>Transaction</strong>: Enables transaction-level connection pooling.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>Sets parallel query. The format is {&quot;MaxParallelDegree&quot;:&quot;degree&quot;}. Valid values:</p>
         * <ul>
         * <li><p>A specific number of concurrent queries. Example: &quot;MaxParallelDegree&quot;:&quot;2&quot;.</p>
         * </li>
         * <li><p><strong>off</strong>: Disables parallel query. This is the default value.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>Sets automatic routing for row store and column store. The format is {&quot;EnableHtapImci&quot;:&quot;on/off&quot;}. Valid values:</p>
         * <ul>
         * <li><p><strong>on</strong>: Enables automatic routing for row store and column store.</p>
         * </li>
         * <li><p><strong>off</strong>: Disables automatic routing for row store and column store. This is the default value.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>Specifies whether to enable overload protection. The format is {&quot;EnableOverloadThrottle&quot;:&quot;on/off&quot;}. Valid values:</p>
         * <ul>
         * <li><p><strong>on</strong>: Enables overload protection.</p>
         * </li>
         * <li><p><strong>off</strong>: Disables overload protection. This is the default value.</p>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><p>You can set transaction splitting, specify whether the primary node accepts read requests, configure the connection pool, and enable overload protection only when the read/write mode of the cluster endpoint for a PolarDB for MySQL cluster is set to \<em>\<em>ReadWrite\</em>\</em> (automatic read/write splitting).</p>
         * </li>
         * <li><p>When the read/write mode of the cluster endpoint for a PolarDB for MySQL cluster is set to <strong>ReadOnly</strong>, both <strong>connections-based load balancing</strong> and <strong>active requests-based load balancing</strong> are supported. When the read/write mode is set to <strong>ReadWrite</strong> (automatic read/write splitting), only <strong>active requests-based load balancing</strong> is supported.</p>
         * </li>
         * <li><p>You can enable automatic routing for row store and column store when the read/write mode of the cluster endpoint for a PolarDB for MySQL cluster is set to <strong>ReadWrite</strong> (automatic read/write splitting), or when the read/write mode is set to <strong>ReadOnly</strong> and the load balancing policy is set to <strong>active requests-based load balancing</strong>.</p>
         * </li>
         * <li><p>Only PolarDB for MySQL supports setting the consistency level to global consistency.</p>
         * </li>
         * <li><p>If you set the <strong>ReadWriteMode</strong> parameter to <strong>ReadOnly</strong>, you can only set the consistency level to <strong>0</strong>.</p>
         * </li>
         * <li><p>You can configure the consistency level, transaction splitting, whether the primary node accepts reads, and the connection pool at the same time. For example: <code>{&quot;ConsistLevel&quot;:&quot;1&quot;,&quot;DistributedTransaction&quot;:&quot;on&quot;,&quot;ConnectionPersist&quot;:&quot;Session&quot;,&quot;MasterAcceptReads&quot;:&quot;on&quot;}</code>.</p>
         * </li>
         * <li><p>The transaction splitting setting is constrained by the consistency level. For example, if the consistency level is set to <strong>0</strong>, you cannot enable transaction splitting. If the consistency level is set to <strong>1</strong> or <strong>2</strong>, you can enable transaction splitting.</p>
         * </li>
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
         * <p>The type of the custom cluster endpoint. The value is fixed to <strong>Custom</strong>.</p>
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
         * <p>The read-only nodes to be added to the endpoint. Separate multiple node IDs with commas (,). By default, all nodes are added.</p>
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
         * <li><p>0: Sends the request to the primary node.</p>
         * </li>
         * <li><p>2: Degrades to regular requests. If a global consistency read times out, the query is automatically degraded to a regular request, and the client does not receive an error message.</p>
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
         * <li><p>ReadWrite: read and write (automatic read/write splitting).</p>
         * </li>
         * <li><p>ReadOnly: read-only. This is the default value.</p>
         * </li>
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
         * <p>Specifies whether to enable the global consistency (high-performance mode) feature for the node. Valid values:</p>
         * <ul>
         * <li><p>ON: Enables the feature.</p>
         * </li>
         * <li><p>OFF: Disables the feature.</p>
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
