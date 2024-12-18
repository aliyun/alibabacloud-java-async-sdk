// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link CreateDBInstanceEndpointRequest} extends {@link RequestModel}
 *
 * <p>CreateDBInstanceEndpointRequest</p>
 */
public class CreateDBInstanceEndpointRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectionStringPrefix")
    @com.aliyun.core.annotation.Validation(required = true)
    private String connectionStringPrefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceEndpointDescription")
    private String DBInstanceEndpointDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceEndpointType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceEndpointType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeItems")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<NodeItems> nodeItems;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Port")
    @com.aliyun.core.annotation.Validation(required = true)
    private String port;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivateIpAddress")
    private String privateIpAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    private CreateDBInstanceEndpointRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.connectionStringPrefix = builder.connectionStringPrefix;
        this.DBInstanceEndpointDescription = builder.DBInstanceEndpointDescription;
        this.DBInstanceEndpointType = builder.DBInstanceEndpointType;
        this.DBInstanceId = builder.DBInstanceId;
        this.nodeItems = builder.nodeItems;
        this.port = builder.port;
        this.privateIpAddress = builder.privateIpAddress;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDBInstanceEndpointRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return connectionStringPrefix
     */
    public String getConnectionStringPrefix() {
        return this.connectionStringPrefix;
    }

    /**
     * @return DBInstanceEndpointDescription
     */
    public String getDBInstanceEndpointDescription() {
        return this.DBInstanceEndpointDescription;
    }

    /**
     * @return DBInstanceEndpointType
     */
    public String getDBInstanceEndpointType() {
        return this.DBInstanceEndpointType;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return nodeItems
     */
    public java.util.List<NodeItems> getNodeItems() {
        return this.nodeItems;
    }

    /**
     * @return port
     */
    public String getPort() {
        return this.port;
    }

    /**
     * @return privateIpAddress
     */
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<CreateDBInstanceEndpointRequest, Builder> {
        private String clientToken; 
        private String connectionStringPrefix; 
        private String DBInstanceEndpointDescription; 
        private String DBInstanceEndpointType; 
        private String DBInstanceId; 
        private java.util.List<NodeItems> nodeItems; 
        private String port; 
        private String privateIpAddress; 
        private String resourceGroupId; 
        private Long resourceOwnerId; 
        private String vSwitchId; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDBInstanceEndpointRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.connectionStringPrefix = request.connectionStringPrefix;
            this.DBInstanceEndpointDescription = request.DBInstanceEndpointDescription;
            this.DBInstanceEndpointType = request.DBInstanceEndpointType;
            this.DBInstanceId = request.DBInstanceId;
            this.nodeItems = request.nodeItems;
            this.port = request.port;
            this.privateIpAddress = request.privateIpAddress;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.vSwitchId = request.vSwitchId;
            this.vpcId = request.vpcId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.</p>
         * <p>The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>6000170000591aed949d0f****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The prefix of the internal endpoint.</p>
         * <p>When you create any type of endpoint, an internal endpoint is automatically created for the endpoint. This parameter specifies the prefix of the internal endpoint.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-****-ro</p>
         */
        public Builder connectionStringPrefix(String connectionStringPrefix) {
            this.putQueryParameter("ConnectionStringPrefix", connectionStringPrefix);
            this.connectionStringPrefix = connectionStringPrefix;
            return this;
        }

        /**
         * <p>The user-defined description of the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>for readonly business</p>
         */
        public Builder DBInstanceEndpointDescription(String DBInstanceEndpointDescription) {
            this.putQueryParameter("DBInstanceEndpointDescription", DBInstanceEndpointDescription);
            this.DBInstanceEndpointDescription = DBInstanceEndpointDescription;
            return this;
        }

        /**
         * <p>The endpoint type. Valid values:</p>
         * <ul>
         * <li>Primary: read/write endpoint of the instance</li>
         * <li>Readonly: read-only endpoint of the instance</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Readonly</p>
         */
        public Builder DBInstanceEndpointType(String DBInstanceEndpointType) {
            this.putQueryParameter("DBInstanceEndpointType", DBInstanceEndpointType);
            this.DBInstanceEndpointType = DBInstanceEndpointType;
            return this;
        }

        /**
         * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The information about the endpoint.</p>
         * <p>This parameter is required.</p>
         */
        public Builder nodeItems(java.util.List<NodeItems> nodeItems) {
            String nodeItemsShrink = shrink(nodeItems, "NodeItems", "json");
            this.putQueryParameter("NodeItems", nodeItemsShrink);
            this.nodeItems = nodeItems;
            return this;
        }

        /**
         * <p>The port number of the internal endpoint. You can specify the port number for the internal endpoint.</p>
         * <p>Valid values: 3000 to 5999.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        public Builder port(String port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * <p>The IP address of the internal endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.XX.XX</p>
         */
        public Builder privateIpAddress(String privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * <p>The resource group ID. You can call the DescribeDBInstanceAttribute operation to obtain the ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmy****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
         * <p>The vSwitch ID of the internal endpoint.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1kqp****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The VPC ID of the internal endpoint.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-xxxmmxjqqi****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public CreateDBInstanceEndpointRequest build() {
            return new CreateDBInstanceEndpointRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateDBInstanceEndpointRequest} extends {@link TeaModel}
     *
     * <p>CreateDBInstanceEndpointRequest</p>
     */
    public static class NodeItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String DBInstanceId;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private Long weight;

        private NodeItems(Builder builder) {
            this.DBInstanceId = builder.DBInstanceId;
            this.nodeId = builder.nodeId;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeItems create() {
            return builder().build();
        }

        /**
         * @return DBInstanceId
         */
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return weight
         */
        public Long getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String DBInstanceId; 
            private String nodeId; 
            private Long weight; 

            /**
             * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-****</p>
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * <p>The node ID.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>rn-xxxx-****</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The weight of the node. Read requests are distributed based on the weight.</p>
             * <p>Valid values: 0 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder weight(Long weight) {
                this.weight = weight;
                return this;
            }

            public NodeItems build() {
                return new NodeItems(this);
            } 

        } 

    }
}
