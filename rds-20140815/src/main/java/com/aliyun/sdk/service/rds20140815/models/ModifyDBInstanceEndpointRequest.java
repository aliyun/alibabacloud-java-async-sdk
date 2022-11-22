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
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Endpoint 用户自定义描述
         */
        public Builder DBInstanceEndpointDescription(String DBInstanceEndpointDescription) {
            this.putQueryParameter("DBInstanceEndpointDescription", DBInstanceEndpointDescription);
            this.DBInstanceEndpointDescription = DBInstanceEndpointDescription;
            return this;
        }

        /**
         * EndpointId
         */
        public Builder DBInstanceEndpointId(String DBInstanceEndpointId) {
            this.putQueryParameter("DBInstanceEndpointId", DBInstanceEndpointId);
            this.DBInstanceEndpointId = DBInstanceEndpointId;
            return this;
        }

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * NodeItems.
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
             * DBInstanceId.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * Weight.
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
