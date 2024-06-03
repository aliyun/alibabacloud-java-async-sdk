// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunApplicationActionResponseBody} extends {@link TeaModel}
 *
 * <p>RunApplicationActionResponseBody</p>
 */
public class RunApplicationActionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AbnInstances")
    private java.util.List < AbnInstances> abnInstances;

    @com.aliyun.core.annotation.NameInMap("OperationId")
    private String operationId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RunApplicationActionResponseBody(Builder builder) {
        this.abnInstances = builder.abnInstances;
        this.operationId = builder.operationId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunApplicationActionResponseBody create() {
        return builder().build();
    }

    /**
     * @return abnInstances
     */
    public java.util.List < AbnInstances> getAbnInstances() {
        return this.abnInstances;
    }

    /**
     * @return operationId
     */
    public String getOperationId() {
        return this.operationId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < AbnInstances> abnInstances; 
        private String operationId; 
        private String requestId; 

        /**
         * The abnormal nodes.
         */
        public Builder abnInstances(java.util.List < AbnInstances> abnInstances) {
            this.abnInstances = abnInstances;
            return this;
        }

        /**
         * The operation ID.
         */
        public Builder operationId(String operationId) {
            this.operationId = operationId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RunApplicationActionResponseBody build() {
            return new RunApplicationActionResponseBody(this);
        } 

    } 

    public static class AbnInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        private AbnInstances(Builder builder) {
            this.nodeId = builder.nodeId;
            this.nodeName = builder.nodeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AbnInstances create() {
            return builder().build();
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        public static final class Builder {
            private String nodeId; 
            private String nodeName; 

            /**
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * NodeName.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            public AbnInstances build() {
                return new AbnInstances(this);
            } 

        } 

    }
}
