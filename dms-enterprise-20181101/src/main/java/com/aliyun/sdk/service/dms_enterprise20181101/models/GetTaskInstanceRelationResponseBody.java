// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTaskInstanceRelationResponseBody} extends {@link TeaModel}
 *
 * <p>GetTaskInstanceRelationResponseBody</p>
 */
public class GetTaskInstanceRelationResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("NodeList")
    private NodeList nodeList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetTaskInstanceRelationResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.nodeList = builder.nodeList;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTaskInstanceRelationResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return nodeList
     */
    public NodeList getNodeList() {
        return this.nodeList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private NodeList nodeList; 
        private String requestId; 
        private Boolean success; 

        /**
         * The error code returned if the request fails.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message returned if the request fails.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The information about the nodes in the execution record of the task flow.
         */
        public Builder nodeList(NodeList nodeList) {
            this.nodeList = nodeList;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful. Valid values:
         * <p>
         * 
         * *   **true**: The request is successful.
         * *   **false**: The request fails.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetTaskInstanceRelationResponseBody build() {
            return new GetTaskInstanceRelationResponseBody(this);
        } 

    } 

    public static class Node extends TeaModel {
        @NameInMap("BusinessTime")
        private String businessTime;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("ExecuteTime")
        private Long executeTime;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Message")
        private String message;

        @NameInMap("NodeId")
        private Long nodeId;

        @NameInMap("NodeName")
        private String nodeName;

        @NameInMap("NodeType")
        private Integer nodeType;

        @NameInMap("Status")
        private Integer status;

        private Node(Builder builder) {
            this.businessTime = builder.businessTime;
            this.endTime = builder.endTime;
            this.executeTime = builder.executeTime;
            this.id = builder.id;
            this.message = builder.message;
            this.nodeId = builder.nodeId;
            this.nodeName = builder.nodeName;
            this.nodeType = builder.nodeType;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Node create() {
            return builder().build();
        }

        /**
         * @return businessTime
         */
        public String getBusinessTime() {
            return this.businessTime;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return executeTime
         */
        public Long getExecuteTime() {
            return this.executeTime;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
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
        public Long getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return nodeType
         */
        public Integer getNodeType() {
            return this.nodeType;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String businessTime; 
            private String endTime; 
            private Long executeTime; 
            private Long id; 
            private String message; 
            private Long nodeId; 
            private String nodeName; 
            private Integer nodeType; 
            private Integer status; 

            /**
             * The business time of the node.
             */
            public Builder businessTime(String businessTime) {
                this.businessTime = businessTime;
                return this;
            }

            /**
             * The time when the execution of the task flow was complete. The time is displayed in the yyyy-MM-DD HH:mm:ss format.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The amount of time consumed for running the node. Unit: milliseconds.
             */
            public Builder executeTime(Long executeTime) {
                this.executeTime = executeTime;
                return this;
            }

            /**
             * The ID of the execution record of the task flow.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The description of the task.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The ID of the node.
             */
            public Builder nodeId(Long nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * The name of the node.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * The type of the node. For more information about the valid values for this parameter, see [NodeType parameter](~~424705~~).
             */
            public Builder nodeType(Integer nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * The status of the node. Valid values:
             * <p>
             * 
             * *   **0**: The node is waiting to be scheduled.
             * *   **1**: The node is running.
             * *   **2**: The node is suspended.
             * *   **3**: The node failed to run.
             * *   **4**: The node is run.
             * *   **5**: The node is complete.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public Node build() {
                return new Node(this);
            } 

        } 

    }
    public static class NodeList extends TeaModel {
        @NameInMap("Node")
        private java.util.List < Node> node;

        private NodeList(Builder builder) {
            this.node = builder.node;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeList create() {
            return builder().build();
        }

        /**
         * @return node
         */
        public java.util.List < Node> getNode() {
            return this.node;
        }

        public static final class Builder {
            private java.util.List < Node> node; 

            /**
             * Node.
             */
            public Builder node(java.util.List < Node> node) {
                this.node = node;
                return this;
            }

            public NodeList build() {
                return new NodeList(this);
            } 

        } 

    }
}
