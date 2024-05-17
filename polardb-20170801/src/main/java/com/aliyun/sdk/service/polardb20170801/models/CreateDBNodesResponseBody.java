// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDBNodesResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDBNodesResponseBody</p>
 */
public class CreateDBNodesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("DBNodeIds")
    private DBNodeIds DBNodeIds;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateDBNodesResponseBody(Builder builder) {
        this.DBClusterId = builder.DBClusterId;
        this.DBNodeIds = builder.DBNodeIds;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDBNodesResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return DBNodeIds
     */
    public DBNodeIds getDBNodeIds() {
        return this.DBNodeIds;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String DBClusterId; 
        private DBNodeIds DBNodeIds; 
        private String orderId; 
        private String requestId; 

        /**
         * The ID of the cluster.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * Details about the nodes.
         */
        public Builder DBNodeIds(DBNodeIds DBNodeIds) {
            this.DBNodeIds = DBNodeIds;
            return this;
        }

        /**
         * The ID of the order.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDBNodesResponseBody build() {
            return new CreateDBNodesResponseBody(this);
        } 

    } 

    public static class DBNodeIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBNodeId")
        private java.util.List < String > DBNodeId;

        private DBNodeIds(Builder builder) {
            this.DBNodeId = builder.DBNodeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBNodeIds create() {
            return builder().build();
        }

        /**
         * @return DBNodeId
         */
        public java.util.List < String > getDBNodeId() {
            return this.DBNodeId;
        }

        public static final class Builder {
            private java.util.List < String > DBNodeId; 

            /**
             * DBNodeId.
             */
            public Builder DBNodeId(java.util.List < String > DBNodeId) {
                this.DBNodeId = DBNodeId;
                return this;
            }

            public DBNodeIds build() {
                return new DBNodeIds(this);
            } 

        } 

    }
}
