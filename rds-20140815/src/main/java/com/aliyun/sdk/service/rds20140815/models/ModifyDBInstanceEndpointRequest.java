// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBInstanceEndpointRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBInstanceEndpointRequest</p>
 */
public class ModifyDBInstanceEndpointRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DBInstanceEndpointDescription")
    private String DBInstanceEndpointDescription;

    @Query
    @NameInMap("DBInstanceEndpointId")
    @Validation(required = true)
    private String DBInstanceEndpointId;

    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("NodeItems")
    private java.util.List < NodeItems> nodeItems;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ModifyDBInstanceEndpointRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.DBInstanceEndpointDescription = builder.DBInstanceEndpointDescription;
        this.DBInstanceEndpointId = builder.DBInstanceEndpointId;
        this.DBInstanceId = builder.DBInstanceId;
        this.nodeItems = builder.nodeItems;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBInstanceEndpointRequest create() {
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
     * @return DBInstanceEndpointDescription
     */
    public String getDBInstanceEndpointDescription() {
        return this.DBInstanceEndpointDescription;
    }

    /**
     * @return DBInstanceEndpointId
     */
    public String getDBInstanceEndpointId() {
        return this.DBInstanceEndpointId;
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
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<ModifyDBInstanceEndpointRequest, Builder> {
        private String clientToken; 
        private String DBInstanceEndpointDescription; 
        private String DBInstanceEndpointId; 
        private String DBInstanceId; 
        private java.util.List < NodeItems> nodeItems; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBInstanceEndpointRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.DBInstanceEndpointDescription = request.DBInstanceEndpointDescription;
            this.DBInstanceEndpointId = request.DBInstanceEndpointId;
            this.DBInstanceId = request.DBInstanceId;
            this.nodeItems = request.nodeItems;
            this.resourceOwnerId = request.resourceOwnerId;
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
         * The user-defined description of the endpoint.
         */
        public Builder DBInstanceEndpointDescription(String DBInstanceEndpointDescription) {
            this.putQueryParameter("DBInstanceEndpointDescription", DBInstanceEndpointDescription);
            this.DBInstanceEndpointDescription = DBInstanceEndpointDescription;
            return this;
        }

        /**
         * The endpoint ID of the instance. You can call the [DescribeDBInstanceEndpoints](~~610488~~) operation to query the endpoint ID of the instance.
         */
        public Builder DBInstanceEndpointId(String DBInstanceEndpointId) {
            this.putQueryParameter("DBInstanceEndpointId", DBInstanceEndpointId);
            this.DBInstanceEndpointId = DBInstanceEndpointId;
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public ModifyDBInstanceEndpointRequest build() {
            return new ModifyDBInstanceEndpointRequest(this);
        } 

    } 

    public static class NodeItems extends TeaModel {
        @NameInMap("DBInstanceId")
        private String DBInstanceId;

        @NameInMap("NodeId")
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
             * <p>
             * 
             * You can use one of the following methods to query the ID of the node:
             * 
             * *   Log on to the ApsaraDB RDS console, go to the instance details page, and then view the ID of the node in the instance topology section.
             * *   Call the [DescribeDBInstanceAttribute](~~610394~~) operation to query the ID of the node.
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
