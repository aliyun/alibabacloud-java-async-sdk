// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link GetTaskInstanceRelationResponseBody} extends {@link TeaModel}
 *
 * <p>GetTaskInstanceRelationResponseBody</p>
 */
public class GetTaskInstanceRelationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("NodeList")
    private NodeList nodeList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetTaskInstanceRelationResponseBody model) {
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.nodeList = model.nodeList;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code returned if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The information about the nodes in the execution record of the task flow.</p>
         */
        public Builder nodeList(NodeList nodeList) {
            this.nodeList = nodeList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>028BF827-3801-5869-8548-F4A039256304</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request is successful.</li>
         * <li><strong>false</strong>: The request fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetTaskInstanceRelationResponseBody build() {
            return new GetTaskInstanceRelationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTaskInstanceRelationResponseBody} extends {@link TeaModel}
     *
     * <p>GetTaskInstanceRelationResponseBody</p>
     */
    public static class Node extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BusinessTime")
        private String businessTime;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("ExecuteTime")
        private Long executeTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private Long nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private Integer nodeType;

        @com.aliyun.core.annotation.NameInMap("Status")
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

            private Builder() {
            } 

            private Builder(Node model) {
                this.businessTime = model.businessTime;
                this.endTime = model.endTime;
                this.executeTime = model.executeTime;
                this.id = model.id;
                this.message = model.message;
                this.nodeId = model.nodeId;
                this.nodeName = model.nodeName;
                this.nodeType = model.nodeType;
                this.status = model.status;
            } 

            /**
             * <p>The business time of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-11-09 14:37:26</p>
             */
            public Builder businessTime(String businessTime) {
                this.businessTime = businessTime;
                return this;
            }

            /**
             * <p>The time when the execution of the task flow was complete. The time is displayed in the yyyy-MM-DD HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-11-11 14:38:57</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The amount of time consumed for running the node. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>170655</p>
             */
            public Builder executeTime(Long executeTime) {
                this.executeTime = executeTime;
                return this;
            }

            /**
             * <p>The ID of the execution record of the task flow.</p>
             * 
             * <strong>example:</strong>
             * <p>14059</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The description of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>14059</p>
             */
            public Builder nodeId(Long nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The name of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>Spark SQL-1</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>The type of the node. For more information about the valid values for this parameter, see <a href="https://help.aliyun.com/document_detail/424705.html">NodeType parameter</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>36</p>
             */
            public Builder nodeType(Integer nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * <p>The status of the node. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The node is waiting to be scheduled.</li>
             * <li><strong>1</strong>: The node is running.</li>
             * <li><strong>2</strong>: The node is suspended.</li>
             * <li><strong>3</strong>: The node failed to run.</li>
             * <li><strong>4</strong>: The node is run.</li>
             * <li><strong>5</strong>: The node is complete.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>4</p>
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
    /**
     * 
     * {@link GetTaskInstanceRelationResponseBody} extends {@link TeaModel}
     *
     * <p>GetTaskInstanceRelationResponseBody</p>
     */
    public static class NodeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Node")
        private java.util.List<Node> node;

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
        public java.util.List<Node> getNode() {
            return this.node;
        }

        public static final class Builder {
            private java.util.List<Node> node; 

            private Builder() {
            } 

            private Builder(NodeList model) {
                this.node = model.node;
            } 

            /**
             * Node.
             */
            public Builder node(java.util.List<Node> node) {
                this.node = node;
                return this;
            }

            public NodeList build() {
                return new NodeList(this);
            } 

        } 

    }
}
