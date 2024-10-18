// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyDBInstanceEndpointRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBInstanceEndpointRequest</p>
 */
public class ModifyDBInstanceEndpointRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceEndpointDescription")
    private String DBInstanceEndpointDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceEndpointId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceEndpointId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeItems")
    private java.util.List < NodeItems> nodeItems;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
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
         * <p>The endpoint ID of the instance. You can call the DescribeDBInstanceEndpoints operation to query the endpoint ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ep-****</p>
         */
        public Builder DBInstanceEndpointId(String DBInstanceEndpointId) {
            this.putQueryParameter("DBInstanceEndpointId", DBInstanceEndpointId);
            this.DBInstanceEndpointId = DBInstanceEndpointId;
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

    /**
     * 
     * {@link ModifyDBInstanceEndpointRequest} extends {@link TeaModel}
     *
     * <p>ModifyDBInstanceEndpointRequest</p>
     */
    public static class NodeItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceId")
        private String DBInstanceId;

        @com.aliyun.core.annotation.NameInMap("NodeId")
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
             * <p>You can query the node ID by using the following methods:</p>
             * <ul>
             * <li>Log on the ApsaraDB RDS console, go to the instance details page, and then view the ID of the node in the instance topology in the lower part of the instance details page.</li>
             * <li>Call the DescribeDBInstanceAttribute operation to query the node ID.</li>
             * </ul>
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
