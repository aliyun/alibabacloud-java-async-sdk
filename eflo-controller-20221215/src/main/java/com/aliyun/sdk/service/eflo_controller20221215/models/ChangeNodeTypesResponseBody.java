// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

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
 * {@link ChangeNodeTypesResponseBody} extends {@link TeaModel}
 *
 * <p>ChangeNodeTypesResponseBody</p>
 */
public class ChangeNodeTypesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NodeResponse")
    private java.util.List<NodeResponse> nodeResponse;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private ChangeNodeTypesResponseBody(Builder builder) {
        this.nodeResponse = builder.nodeResponse;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeNodeTypesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nodeResponse
     */
    public java.util.List<NodeResponse> getNodeResponse() {
        return this.nodeResponse;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private java.util.List<NodeResponse> nodeResponse; 
        private String requestId; 
        private String taskId; 

        private Builder() {
        } 

        private Builder(ChangeNodeTypesResponseBody model) {
            this.nodeResponse = model.nodeResponse;
            this.requestId = model.requestId;
            this.taskId = model.taskId;
        } 

        /**
         * NodeResponse.
         */
        public Builder nodeResponse(java.util.List<NodeResponse> nodeResponse) {
            this.nodeResponse = nodeResponse;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public ChangeNodeTypesResponseBody build() {
            return new ChangeNodeTypesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ChangeNodeTypesResponseBody} extends {@link TeaModel}
     *
     * <p>ChangeNodeTypesResponseBody</p>
     */
    public static class NodeResponse extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        private NodeResponse(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
            this.nodeId = builder.nodeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeResponse create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        public static final class Builder {
            private String code; 
            private String message; 
            private String nodeId; 

            private Builder() {
            } 

            private Builder(NodeResponse model) {
                this.code = model.code;
                this.message = model.message;
                this.nodeId = model.nodeId;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            public NodeResponse build() {
                return new NodeResponse(this);
            } 

        } 

    }
}
