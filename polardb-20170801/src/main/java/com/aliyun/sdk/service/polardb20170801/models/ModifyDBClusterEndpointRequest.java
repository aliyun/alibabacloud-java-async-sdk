// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    @com.aliyun.core.annotation.NameInMap("ReadWriteMode")
    private String readWriteMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

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
        this.readWriteMode = builder.readWriteMode;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
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

    public static final class Builder extends Request.Builder<ModifyDBClusterEndpointRequest, Builder> {
        private String autoAddNewNodes; 
        private String DBClusterId; 
        private String DBEndpointDescription; 
        private String DBEndpointId; 
        private String endpointConfig; 
        private String nodes; 
        private String ownerAccount; 
        private Long ownerId; 
        private String readWriteMode; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

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
            this.readWriteMode = request.readWriteMode;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * Specifies whether to automatically associate newly added nodes with the cluster endpoint. Default value: Disable. Valid values:
         * <p>
         * 
         * *   **Enable**
         * *   **Disable**
         */
        public Builder autoAddNewNodes(String autoAddNewNodes) {
            this.putQueryParameter("AutoAddNewNodes", autoAddNewNodes);
            this.autoAddNewNodes = autoAddNewNodes;
            return this;
        }

        /**
         * The ID of the cluster.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * The name of the custom cluster endpoint.
         */
        public Builder DBEndpointDescription(String DBEndpointDescription) {
            this.putQueryParameter("DBEndpointDescription", DBEndpointDescription);
            this.DBEndpointDescription = DBEndpointDescription;
            return this;
        }

        /**
         * The ID of the endpoint.
         */
        public Builder DBEndpointId(String DBEndpointId) {
            this.putQueryParameter("DBEndpointId", DBEndpointId);
            this.DBEndpointId = DBEndpointId;
            return this;
        }

        /**
         * The advanced configurations of the cluster endpoint, which are in the JSON format. You can specify the configurations of the following attributes: consistency level, transaction splitting, connection pool, and primary node accepts read requests.
         * <p>
         * 
         * *   Specifies the load balancing policy in the format of `{\"LoadBalancePolicy\":\"Selected value\"}`. Default value: 0. Valid values:
         * 
         *     *   **0**: connections-based load balancing
         *     *   **1**: active requests-based load balancing
         * 
         * *   Specifies whether to enable the primary node accepts read requests feature in the format of `{\"MasterAcceptReads\":\"Selected value\"}`. Default value: on. Valid values:
         * 
         *     *   **on**
         *     *   **off**
         * 
         * *   Specifies whether to enable the transaction splitting feature in the format of `{\"DistributedTransaction\":\"Selected value\"}`. Default value: on. Valid values:
         * 
         *     *   **on**
         *     *   **off**
         * 
         * *   Specifies the consistency level in the format of `{\"ConsistLevel\":\"Selected value\"}`. Default value: 1. Valid values:
         * 
         *     *   **0**: eventual consistency (weak)
         *     *   **1**: session consistency (medium)
         *     *   **2**: global consistency (strong)
         * 
         * *   Specifies the connection pool in the format of `{\"ConnectionPersist\":\"Selected value\"}`. Default value: off. Valid values:
         * 
         *     *   **off**: disables the connection pool.
         *     *   **Session**: enables the session-level connection pool.
         *     *   **Transaction**: enables the transaction-level connection pool.
         * 
         * *   Specifies whether to enable the parallel query feature in the format of `{\"MaxParallelDegree\":\"Selected value\"}`. Default value: off. Valid values:
         * 
         *     *   **on**
         *     *   **off**
         * 
         * *   Specifies whether to enable the automatic request distribution between row store and column store nodes feature in the format of `{\"EnableHtapImci\":\"Selected value\"}`. Default value: off. Valid values:
         * 
         *     *   **on**
         *     *   **off**
         * 
         * *   Specifies whether to enable the overload protection feature in the format of `{\"EnableOverloadThrottle\":\"Selected value\"}`. Default value: off. Valid values:
         * 
         *     *   **on**
         *     *   **off**
         * 
         * > 
         * 
         * *   You can specify the transaction splitting, primary node accepts read requests, connection pool, and overload protection features for a PolarDB for MySQL cluster only if ReadWriteMode is set to ReadWrite for the cluster endpoint.
         * 
         * *   If the read /write mode of a PolarDB for MySQL cluster is set to **Read-only**, the **Connection-based SLB** and **Active Request-based SLB** SLB policies are supported. The **Read-write (Automatic read /write splitting) **mode of the cluster supports** Active Request-based SLB** policy.
         * *   If ReadWriteMode is set to **ReadWrite** for the cluster endpoint of a PolarDB for MySQL cluster or if ReadWriteMode is set to **ReadOnly** and the load balancing policy is set to **active requests-based load balancing**, the automatic request distribution between row store and column store nodes feature is supported.
         * *   Only PolarDB for MySQL supports global consistency.
         * *   If the **ReadWriteMode** parameter is set to **ReadOnly**, the consistency level must be **0**.
         * *   You can specify the consistency level, transaction splitting, connection pool, and primary node accepts read requests features at a time, such as `{\"ConsistLevel\":\"1\",\"DistributedTransaction\":\"on\",\"ConnectionPersist\":\"Session\",\"MasterAcceptReads\":\"on\"}`.
         * *   The transaction splitting settings are restricted by the consistency level settings. For example, if you set the consistency level to **0**, transaction splitting cannot be enabled. If you set the consistency level to **1** or **2**, transaction splitting can be enabled.
         */
        public Builder endpointConfig(String endpointConfig) {
            this.putQueryParameter("EndpointConfig", endpointConfig);
            this.endpointConfig = endpointConfig;
            return this;
        }

        /**
         * The reader nodes to be associated with the endpoint. If you need to specify multiple reader nodes, separate the reader nodes with commas (,). If you do not specify this parameter, the predefined nodes are used by default.
         * <p>
         * 
         * > 
         * 
         * *   You must specify the node ID for each PolarDB for MySQL cluster.
         * 
         * *   You must specify the role name of each node for each PolarDB for PostgreSQL or PolarDB for Oracle cluster. Example: `Writer,Reader1,Reader2`.
         * 
         * *   If you set **ReadWriteMode** to **ReadOnly**, only one node can be associated with the cluster endpoint. If the only node becomes faulty, the cluster endpoint may be unavailable for up to an hour. We recommend that you do not associate only one node with the cluster endpoint in production environments. We recommend that you associate at least two nodes with the cluster endpoint to improve service availability.
         * 
         * *   If you set **ReadWriteMode** to **ReadWrite**, you must associate at least two nodes with the cluster endpoint.
         * 
         *     *   No limits are imposed on the two nodes that you select for each PolarDB for MySQL cluster. If the two nodes are read-only nodes, write requests are forwarded to the primary node.
         *     *   The following limit applies to PolarDB for PostgreSQL and PolarDB for Oracle clusters: One of the selected nodes must be the primary node.
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
         * The read/write mode. Valid values:
         * <p>
         * 
         * *   **ReadWrite**: The cluster endpoint handles read and write requests. Automatic read/write splitting is enabled.
         * *   **ReadOnly**: The cluster endpoint handles read-only requests.
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

        @Override
        public ModifyDBClusterEndpointRequest build() {
            return new ModifyDBClusterEndpointRequest(this);
        } 

    } 

}
