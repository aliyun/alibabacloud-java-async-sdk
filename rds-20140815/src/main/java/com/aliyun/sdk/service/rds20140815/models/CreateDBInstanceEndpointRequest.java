// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDBInstanceEndpointRequest} extends {@link RequestModel}
 *
 * <p>CreateDBInstanceEndpointRequest</p>
 */
public class CreateDBInstanceEndpointRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("ConnectionStringPrefix")
    @Validation(required = true)
    private String connectionStringPrefix;

    @Query
    @NameInMap("DBInstanceEndpointDescription")
    private String DBInstanceEndpointDescription;

    @Query
    @NameInMap("DBInstanceEndpointType")
    @Validation(required = true)
    private String DBInstanceEndpointType;

    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("NodeItems")
    @Validation(required = true)
    private java.util.List < NodeItems> nodeItems;

    @Query
    @NameInMap("Port")
    @Validation(required = true)
    private String port;

    @Query
    @NameInMap("PrivateIpAddress")
    private String privateIpAddress;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("VSwitchId")
    @Validation(required = true)
    private String vSwitchId;

    @Query
    @NameInMap("VpcId")
    @Validation(required = true)
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
    public java.util.List < NodeItems> getNodeItems() {
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
        private java.util.List < NodeItems> nodeItems; 
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
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.
         * <p>
         * 
         * The token can contain only ASCII characters and cannot exceed 64 characters in length.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The prefix of the internal endpoint.
         * <p>
         * 
         * When you create any type of endpoint, an internal endpoint is automatically created for the endpoint. This parameter specifies the prefix of the internal endpoint.
         */
        public Builder connectionStringPrefix(String connectionStringPrefix) {
            this.putQueryParameter("ConnectionStringPrefix", connectionStringPrefix);
            this.connectionStringPrefix = connectionStringPrefix;
            return this;
        }

        /**
         * The user-defined description of the endpoint.
         */
        public Builder DBInstanceEndpointDescription(String DBInstanceEndpointDescription) {
            this.putQueryParameter("DBInstanceEndpointDescription", DBInstanceEndpointDescription);
            this.DBInstanceEndpointDescription = DBInstanceEndpointDescription;
            return this;
        }

        /**
         * The type of the endpoint. Valid values:
         * <p>
         * 
         * *   Primary: read/write endpoint of the instance
         * *   Readonly: read-only endpoint of the instance
         */
        public Builder DBInstanceEndpointType(String DBInstanceEndpointType) {
            this.putQueryParameter("DBInstanceEndpointType", DBInstanceEndpointType);
            this.DBInstanceEndpointType = DBInstanceEndpointType;
            return this;
        }

        /**
         * The instance ID. You can call the [DescribeDBInstances](~~610396~~) operation to query the ID of the instance.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The information about the node that is configured for the endpoint.
         */
        public Builder nodeItems(java.util.List < NodeItems> nodeItems) {
            String nodeItemsShrink = shrink(nodeItems, "NodeItems", "json");
            this.putQueryParameter("NodeItems", nodeItemsShrink);
            this.nodeItems = nodeItems;
            return this;
        }

        /**
         * The port number of the internal endpoint. You can specify the port number for the internal endpoint.
         * <p>
         * 
         * Valid values: 3000 to 5999.
         */
        public Builder port(String port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * The IP address of the internal endpoint.
         */
        public Builder privateIpAddress(String privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * The ID of the resource group. You can call the [DescribeDBInstanceAttribute](~~610394~~) to obtain the ID of the resource group.
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
         * The vSwitch ID of the internal endpoint.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * The virtual private cloud (VPC) ID of the internal endpoint.
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

    public static class NodeItems extends TeaModel {
        @NameInMap("DBInstanceId")
        @Validation(required = true)
        private String DBInstanceId;

        @NameInMap("NodeId")
        @Validation(required = true)
        private String nodeId;

        @NameInMap("Weight")
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
             * The instance ID. You can call the [DescribeDBInstances](~~610396~~) operation to query the ID of the instance.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * The node ID.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * The weight of the node. Read requests are distributed based on the weight.
             * <p>
             * 
             * Valid values: 0 to 100.
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
