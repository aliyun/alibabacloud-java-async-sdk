// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link ListInstanceNodesResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstanceNodesResponseBody</p>
 */
public class ListInstanceNodesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("nodes")
    private java.util.List<Nodes> nodes;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("stateVersion")
    private Long stateVersion;

    private ListInstanceNodesResponseBody(Builder builder) {
        this.code = builder.code;
        this.instanceId = builder.instanceId;
        this.message = builder.message;
        this.nodes = builder.nodes;
        this.requestId = builder.requestId;
        this.stateVersion = builder.stateVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceNodesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nodes
     */
    public java.util.List<Nodes> getNodes() {
        return this.nodes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return stateVersion
     */
    public Long getStateVersion() {
        return this.stateVersion;
    }

    public static final class Builder {
        private String code; 
        private String instanceId; 
        private String message; 
        private java.util.List<Nodes> nodes; 
        private String requestId; 
        private Long stateVersion; 

        private Builder() {
        } 

        private Builder(ListInstanceNodesResponseBody model) {
            this.code = model.code;
            this.instanceId = model.instanceId;
            this.message = model.message;
            this.nodes = model.nodes;
            this.requestId = model.requestId;
            this.stateVersion = model.stateVersion;
        } 

        /**
         * <p>The business status code. A value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The physical instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>plan_example</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The error description.</p>
         * 
         * <strong>example:</strong>
         * <p>The requested resource does not exist</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The visible nodes arranged in topological order. The number of nodes is determined by the actual dynamic graph.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder nodes(java.util.List<Nodes> nodes) {
            this.nodes = nodes;
            return this;
        }

        /**
         * <p>The request tracking ID.</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The state version.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder stateVersion(Long stateVersion) {
            this.stateVersion = stateVersion;
            return this;
        }

        public ListInstanceNodesResponseBody build() {
            return new ListInstanceNodesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInstanceNodesResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceNodesResponseBody</p>
     */
    public static class Nodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("conclusion")
        private String conclusion;

        @com.aliyun.core.annotation.NameInMap("duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("enteredAt")
        private String enteredAt;

        @com.aliyun.core.annotation.NameInMap("finishedAt")
        private String finishedAt;

        @com.aliyun.core.annotation.NameInMap("handler")
        private String handler;

        @com.aliyun.core.annotation.NameInMap("lane")
        private Long lane;

        @com.aliyun.core.annotation.NameInMap("nodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("nodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("nodeOrder")
        private Long nodeOrder;

        @com.aliyun.core.annotation.NameInMap("nodeType")
        private String nodeType;

        @com.aliyun.core.annotation.NameInMap("rank")
        private Long rank;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("waitType")
        private String waitType;

        private Nodes(Builder builder) {
            this.conclusion = builder.conclusion;
            this.duration = builder.duration;
            this.enteredAt = builder.enteredAt;
            this.finishedAt = builder.finishedAt;
            this.handler = builder.handler;
            this.lane = builder.lane;
            this.nodeId = builder.nodeId;
            this.nodeName = builder.nodeName;
            this.nodeOrder = builder.nodeOrder;
            this.nodeType = builder.nodeType;
            this.rank = builder.rank;
            this.status = builder.status;
            this.waitType = builder.waitType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Nodes create() {
            return builder().build();
        }

        /**
         * @return conclusion
         */
        public String getConclusion() {
            return this.conclusion;
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return enteredAt
         */
        public String getEnteredAt() {
            return this.enteredAt;
        }

        /**
         * @return finishedAt
         */
        public String getFinishedAt() {
            return this.finishedAt;
        }

        /**
         * @return handler
         */
        public String getHandler() {
            return this.handler;
        }

        /**
         * @return lane
         */
        public Long getLane() {
            return this.lane;
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

        /**
         * @return nodeOrder
         */
        public Long getNodeOrder() {
            return this.nodeOrder;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        /**
         * @return rank
         */
        public Long getRank() {
            return this.rank;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return waitType
         */
        public String getWaitType() {
            return this.waitType;
        }

        public static final class Builder {
            private String conclusion; 
            private Long duration; 
            private String enteredAt; 
            private String finishedAt; 
            private String handler; 
            private Long lane; 
            private String nodeId; 
            private String nodeName; 
            private Long nodeOrder; 
            private String nodeType; 
            private Long rank; 
            private String status; 
            private String waitType; 

            private Builder() {
            } 

            private Builder(Nodes model) {
                this.conclusion = model.conclusion;
                this.duration = model.duration;
                this.enteredAt = model.enteredAt;
                this.finishedAt = model.finishedAt;
                this.handler = model.handler;
                this.lane = model.lane;
                this.nodeId = model.nodeId;
                this.nodeName = model.nodeName;
                this.nodeOrder = model.nodeOrder;
                this.nodeType = model.nodeType;
                this.rank = model.rank;
                this.status = model.status;
                this.waitType = model.waitType;
            } 

            /**
             * <p>The conclusion of the node result. This field is empty if there is no conclusion.</p>
             * 
             * <strong>example:</strong>
             * <p>Analysis completed</p>
             */
            public Builder conclusion(String conclusion) {
                this.conclusion = conclusion;
                return this;
            }

            /**
             * <p>The total number of seconds from the first run to the desired state. This field is empty if the time is missing.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The time when the node was first run. This field is empty for historical or unrun nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-14T08:00:00Z</p>
             */
            public Builder enteredAt(String enteredAt) {
                this.enteredAt = enteredAt;
                return this;
            }

            /**
             * <p>The time when the node actually entered the desired state. This field is empty if the node has not finished.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-14T08:02:03Z</p>
             */
            public Builder finishedAt(String finishedAt) {
                this.finishedAt = finishedAt;
                return this;
            }

            /**
             * <p>The display name of the node assignee. This field is empty if the assignee is unknown.</p>
             * 
             * <strong>example:</strong>
             * <p>Assistant Customer Success Manager (CSM)</p>
             */
            public Builder handler(String handler) {
                this.handler = handler;
                return this;
            }

            /**
             * <p>The lane position of the node in the workflow graph.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder lane(Long lane) {
                this.lane = lane;
                return this;
            }

            /**
             * <p>The key of the node (nodeKey). This is not the session ID.</p>
             * 
             * <strong>example:</strong>
             * <p>query.amount</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The display name of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>Query signed contract amount</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>The display sequence number of the node in the returned topology list, starting from 1.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder nodeOrder(Long nodeOrder) {
                this.nodeOrder = nodeOrder;
                return this;
            }

            /**
             * <p>The actual node type, such as AGENT or HUMAN.</p>
             * 
             * <strong>example:</strong>
             * <p>AGENT</p>
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * <p>The level of the node in the workflow graph, starting from 0.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder rank(Long rank) {
                this.rank = rank;
                return this;
            }

            /**
             * <p>The original running status of the node, such as READY, RUNNING, WAITING, SUCCEEDED, or FAILED.</p>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The reason for waiting, such as HUMAN_INPUT, HUMAN_STEP, REVIEW, MANUAL_PAUSE, or UNBLOCK. This field is empty if the node is not waiting.</p>
             * 
             * <strong>example:</strong>
             * <p>REVIEW</p>
             */
            public Builder waitType(String waitType) {
                this.waitType = waitType;
                return this;
            }

            public Nodes build() {
                return new Nodes(this);
            } 

        } 

    }
}
