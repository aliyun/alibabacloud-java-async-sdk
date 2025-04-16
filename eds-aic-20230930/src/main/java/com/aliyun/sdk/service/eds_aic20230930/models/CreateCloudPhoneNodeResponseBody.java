// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link CreateCloudPhoneNodeResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCloudPhoneNodeResponseBody</p>
 */
public class CreateCloudPhoneNodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NodeInfos")
    private java.util.List<NodeInfos> nodeInfos;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateCloudPhoneNodeResponseBody(Builder builder) {
        this.nodeInfos = builder.nodeInfos;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCloudPhoneNodeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nodeInfos
     */
    public java.util.List<NodeInfos> getNodeInfos() {
        return this.nodeInfos;
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
        private java.util.List<NodeInfos> nodeInfos; 
        private String orderId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateCloudPhoneNodeResponseBody model) {
            this.nodeInfos = model.nodeInfos;
            this.orderId = model.orderId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The cloud phone matrixes.</p>
         */
        public Builder nodeInfos(java.util.List<NodeInfos> nodeInfos) {
            this.nodeInfos = nodeInfos;
            return this;
        }

        /**
         * <p>The order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>223684716098****</p>
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>69BCBBE4-FCF2-59B8-AD9D-531EB422****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateCloudPhoneNodeResponseBody build() {
            return new CreateCloudPhoneNodeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateCloudPhoneNodeResponseBody} extends {@link TeaModel}
     *
     * <p>CreateCloudPhoneNodeResponseBody</p>
     */
    public static class NodeInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceIds")
        private java.util.List<String> instanceIds;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        private NodeInfos(Builder builder) {
            this.instanceIds = builder.instanceIds;
            this.nodeId = builder.nodeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeInfos create() {
            return builder().build();
        }

        /**
         * @return instanceIds
         */
        public java.util.List<String> getInstanceIds() {
            return this.instanceIds;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        public static final class Builder {
            private java.util.List<String> instanceIds; 
            private String nodeId; 

            private Builder() {
            } 

            private Builder(NodeInfos model) {
                this.instanceIds = model.instanceIds;
                this.nodeId = model.nodeId;
            } 

            /**
             * <p>The IDs of the cloud phone instances.</p>
             */
            public Builder instanceIds(java.util.List<String> instanceIds) {
                this.instanceIds = instanceIds;
                return this;
            }

            /**
             * <p>The ID of the cloud phone matrix.</p>
             * 
             * <strong>example:</strong>
             * <p>cpn-e5kxgjyt8s1mb****</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            public NodeInfos build() {
                return new NodeInfos(this);
            } 

        } 

    }
}
