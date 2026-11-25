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
 * {@link CreateDBClusterEndpointRequest} extends {@link RequestModel}
 *
 * <p>CreateDBClusterEndpointRequest</p>
 */
public class CreateDBClusterEndpointRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("PolarFsInstanceId")
    private String polarFsInstanceId;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VPCId")
    private String VPCId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    private CreateDBClusterEndpointRequest(Builder builder) {
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
        this.polarFsInstanceId = builder.polarFsInstanceId;
        this.polarSccTimeoutAction = builder.polarSccTimeoutAction;
        this.polarSccWaitTimeout = builder.polarSccWaitTimeout;
        this.readWriteMode = builder.readWriteMode;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sccMode = builder.sccMode;
        this.VPCId = builder.VPCId;
        this.vSwitchId = builder.vSwitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDBClusterEndpointRequest create() {
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
     * @return polarFsInstanceId
     */
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
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

    /**
     * @return VPCId
     */
    public String getVPCId() {
        return this.VPCId;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static final class Builder extends Request.Builder<CreateDBClusterEndpointRequest, Builder> {
        private String autoAddNewNodes; 
        private String clientToken; 
        private String DBClusterId; 
        private String DBEndpointDescription; 
        private String endpointConfig; 
        private String endpointType; 
        private String nodes; 
        private String ownerAccount; 
        private Long ownerId; 
        private String polarFsInstanceId; 
        private String polarSccTimeoutAction; 
        private String polarSccWaitTimeout; 
        private String readWriteMode; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String sccMode; 
        private String VPCId; 
        private String vSwitchId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDBClusterEndpointRequest request) {
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
            this.polarFsInstanceId = request.polarFsInstanceId;
            this.polarSccTimeoutAction = request.polarSccTimeoutAction;
            this.polarSccWaitTimeout = request.polarSccWaitTimeout;
            this.readWriteMode = request.readWriteMode;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sccMode = request.sccMode;
            this.VPCId = request.VPCId;
            this.vSwitchId = request.vSwitchId;
        } 

        /**
         * <p>Specifies whether to automatically add new nodes to the endpoint. Valid values:</p>
         * <ul>
         * <li><strong>Enable</strong>: New nodes are automatically added to the endpoint.</li>
         * <li><strong>Disable</strong> (default): New nodes are not automatically added to the endpoint.</li>
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
         * <p>The client token that is used to ensure the idempotence of the request and prevent duplicate submissions. You can generate the value of this parameter on the client side. The value must be unique across different requests and is case-sensitive. The value can contain up to 64 ASCII characters.</p>
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
         * <p>pc-**************</p>
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
         * <p>The advanced settings of the cluster endpoint. The value must be in JSON format. You can set the consistency level, transaction splitting, offload reads from primary node, and connection pool.</p>
         * <ul>
         * <li>Set the load balancing policy. Format: <code>{&quot;LoadBalancePolicy&quot;:&quot;load balancing policy&quot;}</code>. Valid values:<ul>
         * <li><strong>0</strong>: load balancing based on the number of connections (default).</li>
         * <li><strong>1</strong>: load balancing based on the number of active requests.</li>
         * </ul>
         * </li>
         * <li>Set the consistency level. Format: <code>{&quot;ConsistLevel&quot;:&quot;consistency level&quot;}</code>. Valid values:<ul>
         * <li><strong>0</strong>: eventual consistency.</li>
         * <li><strong>1</strong>: session consistency (default).</li>
         * <li><strong>2</strong>: global consistency.</li>
         * </ul>
         * </li>
         * <li>Set transaction splitting. Format: <code>{&quot;DistributedTransaction&quot;:&quot;transaction splitting&quot;}</code>. Valid values:<ul>
         * <li><strong>on</strong>: enables transaction splitting (default).</li>
         * <li><strong>off</strong>: shutdown transaction splitting.</li>
         * </ul>
         * </li>
         * <li>Set whether the primary node accepts read requests. Format: <code>{&quot;MasterAcceptReads&quot;:&quot;offload reads from primary node&quot;}</code>. Valid values:<ul>
         * <li><strong>on</strong>: The primary node accepts read requests.</li>
         * <li><strong>off</strong>: The primary node does not accept read requests (default).</li>
         * </ul>
         * </li>
         * <li>Set the connection pool. Format: <code>{&quot;ConnectionPersist&quot;:&quot;connection pool&quot;}</code>. Valid values:<ul>
         * <li><strong>off</strong>: shutdown the connection pool (default).</li>
         * <li><strong>Session</strong>: enables the session-level connection pool.</li>
         * <li><strong>Transaction</strong>: enables transaction-level connection pooling.</li>
         * </ul>
         * </li>
         * <li>Set parallel query. Format: <code>{&quot;MaxParallelDegree&quot;:&quot;parallel query&quot;}</code>. Valid values:<ul>
         * <li>A specific concurrent count. Example: <code>&quot;MaxParallelDegree&quot;:&quot;2&quot;</code>.</li>
         * <li><strong>off</strong>: shutdown parallel query (default).</li>
         * </ul>
         * </li>
         * <li>Set automatic request distribution among row store and column store nodes. Format: <code>{&quot;EnableHtapImci&quot;:&quot;automatic request distribution&quot;}</code>. Valid values:<ul>
         * <li><strong>on</strong>: enables the automatic request distribution feature among row store and column store nodes.</li>
         * <li><strong>off</strong>: shutdown the automatic request distribution feature among row store and column store nodes (default).</li>
         * </ul>
         * </li>
         * <li>Set whether to enable overload protection. Format: <code>{&quot;EnableOverloadThrottle&quot;:&quot;whether to enable overload protection&quot;}</code>. Valid values:<ul>
         * <li><strong>on</strong>: enables overload protection.</li>
         * <li><strong>off</strong>: shutdown overload protection (default).</li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>Transaction splitting, offloading reads from the primary node, connection pool, and overload protection can be set only when the read/write pattern of the PolarDB for MySQL cluster endpoint is set to <strong>read and write (automatic read/write splitting)</strong>.</li>
         * <li>When the read/write pattern of the PolarDB for MySQL cluster endpoint is set to <strong>read-only</strong>, both <strong>load balancing based on the number of connections</strong> and <strong>load balancing based on the number of active requests</strong> are supported. For cluster endpoints in the <strong>read and write (automatic read/write splitting) pattern</strong>, only <strong>load balancing based on the number of active requests</strong> is supported.</li>
         * <li>Automatic request distribution among row store and column store nodes can be set when the read/write pattern of the PolarDB for MySQL cluster endpoint is set to <strong>read and write (automatic read/write splitting)</strong>, or when the read/write pattern is set to <strong>read-only</strong> and the load balancing policy is set to <strong>load balancing based on the number of active requests</strong>.</li>
         * <li>Only PolarDB for MySQL supports setting the consistency level to global consistency.</li>
         * <li>If the parameter <strong>ReadWriteMode</strong> is set to <strong>ReadOnly</strong>, the consistency level can only be set to <strong>0</strong>.</li>
         * <li>You can set the consistency level, transaction splitting, offloading reads from the primary node, and connection pool at the same time. Example: <code>{&quot;ConsistLevel&quot;:&quot;1&quot;,&quot;DistributedTransaction&quot;:&quot;on&quot;,&quot;ConnectionPersist&quot;:&quot;Session&quot;,&quot;MasterAcceptReads&quot;:&quot;on&quot;}</code>.</li>
         * <li>The transaction splitting settings are constrained by the consistency level settings. For example, if the consistency level is set to <strong>0</strong>, transaction splitting cannot be enabled. If the consistency level is set to <strong>1</strong> or <strong>2</strong>, transaction splitting can be enabled.</li>
         * </ul>
         * </blockquote>
         * <blockquote>
         * <p>Note: Clusters with DeployUnit=Advanced (hot standby/multi-master) may not support some advanced endpoint settings. If the OperationDenied.InstanceType error occurs, remove EndpointConfig and retry, or confirm the compatibility of the target cluster deployment type with the selected settings.</p>
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
         * <p>The type of the custom cluster endpoint. Valid values:</p>
         * <ul>
         * <li><p><strong>Custom</strong>: custom cluster endpoint.</p>
         * </li>
         * <li><p><strong>DynamoDB</strong>: DynamoDB endpoint.</p>
         * </li>
         * </ul>
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
         * <p>The read-only nodes to be added to the endpoint. Separate multiple nodes with commas (,). Default value: all nodes. </p>
         * <blockquote>
         * <ul>
         * <li>For PolarDB for MySQL, specify node IDs.</li>
         * <li>For PolarDB for PostgreSQL and PolarDB for PostgreSQL (Compatible with Oracle), specify node role names, such as <code>Writer,Reader1,Reader2</code>.</li>
         * <li>If <strong>ReadWriteMode</strong> is set to <strong>ReadOnly</strong>, you can add only one node. However, if this node fails, the endpoint may be unavailable for up to 1 hour. Do not use this configuration in production environments. Select at least two nodes to improve availability.</li>
         * <li>If <strong>ReadWriteMode</strong> is set to <strong>ReadWrite</strong>, select at least two nodes.<ul>
         * <li>For PolarDB for MySQL, you can select any two nodes. If both nodes are read-only nodes, write requests are forwarded to the primary node.</li>
         * <li>For PolarDB for PostgreSQL and PolarDB for PostgreSQL (Compatible with Oracle), the primary node must be included.</li>
         * </ul>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>pi-**********,pi-*********</p>
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
         * <p>The PolarFS instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pfs-test****</p>
         */
        public Builder polarFsInstanceId(String polarFsInstanceId) {
            this.putQueryParameter("PolarFsInstanceId", polarFsInstanceId);
            this.polarFsInstanceId = polarFsInstanceId;
            return this;
        }

        /**
         * <p>The timeout policy for global consistency. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: sends the request to the primary node.</p>
         * </li>
         * <li><p><strong>2</strong>: degrades the request upon timeout. If a global consistency read times out, the query is automatically downgraded to regular requests, and the client does not receive an error message.</p>
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
         * <p>The read/write mode. Valid values: </p>
         * <ul>
         * <li><strong>ReadWrite</strong>: read and write (automatic read/write splitting). </li>
         * <li><strong>ReadOnly</strong> (default): read-only.</li>
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
         * <li><p><strong>ON</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>OFF</strong>: shutdown</p>
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

        /**
         * <p>vpc-2zehr7ghqovft******
         * Virtual private cloud identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2zehr7ghqovftils0****</p>
         */
        public Builder VPCId(String VPCId) {
            this.putQueryParameter("VPCId", VPCId);
            this.VPCId = VPCId;
            return this;
        }

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-2ze775gnf7jn33ua****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        @Override
        public CreateDBClusterEndpointRequest build() {
            return new CreateDBClusterEndpointRequest(this);
        } 

    } 

}
