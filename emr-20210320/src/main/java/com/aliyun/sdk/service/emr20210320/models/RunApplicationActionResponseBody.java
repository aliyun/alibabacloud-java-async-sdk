// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
 * {@link RunApplicationActionResponseBody} extends {@link TeaModel}
 *
 * <p>RunApplicationActionResponseBody</p>
 */
public class RunApplicationActionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AbnInstances")
    private java.util.List<AbnInstances> abnInstances;

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
    public java.util.List<AbnInstances> getAbnInstances() {
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
        private java.util.List<AbnInstances> abnInstances; 
        private String operationId; 
        private String requestId; 

        /**
         * <p>The abnormal nodes.</p>
         */
        public Builder abnInstances(java.util.List<AbnInstances> abnInstances) {
            this.abnInstances = abnInstances;
            return this;
        }

        /**
         * <p>The operation ID.</p>
         * 
         * <strong>example:</strong>
         * <p>op-13c37a77c505****</p>
         */
        public Builder operationId(String operationId) {
            this.operationId = operationId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9E3A7161-EB7B-172B-8D18-FFB06BA3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RunApplicationActionResponseBody build() {
            return new RunApplicationActionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RunApplicationActionResponseBody} extends {@link TeaModel}
     *
     * <p>RunApplicationActionResponseBody</p>
     */
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
             * <p>The ID of the abnormal node.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp1cudc25w2bfwl5****</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The name of the abnormal node.</p>
             * 
             * <strong>example:</strong>
             * <p>core1-1</p>
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
