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
         * <p>业务状态码；成功为200</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>物理实例ID</p>
         * 
         * <strong>example:</strong>
         * <p>plan_example</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>错误描述</p>
         * 
         * <strong>example:</strong>
         * <p>请求的资源不存在</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>按拓扑顺序排列的可见节点，数量由实际动态图决定</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder nodes(java.util.List<Nodes> nodes) {
            this.nodes = nodes;
            return this;
        }

        /**
         * <p>请求追踪ID</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>状态版本</p>
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
             * <p>节点结果结论，无结论时为空</p>
             * 
             * <strong>example:</strong>
             * <p>分析完成</p>
             */
            public Builder conclusion(String conclusion) {
                this.conclusion = conclusion;
                return this;
            }

            /**
             * <p>从首次运行到终态的整秒数，缺时间时为空</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>节点首次运行时间，历史或未运行节点为空</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-14T08:00:00Z</p>
             */
            public Builder enteredAt(String enteredAt) {
                this.enteredAt = enteredAt;
                return this;
            }

            /**
             * <p>节点实际进入终态的时间，未结束时为空</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-14T08:02:03Z</p>
             */
            public Builder finishedAt(String finishedAt) {
                this.finishedAt = finishedAt;
                return this;
            }

            /**
             * <p>节点负责人展示名称，未知时为空</p>
             * 
             * <strong>example:</strong>
             * <p>客户成功经理助理</p>
             */
            public Builder handler(String handler) {
                this.handler = handler;
                return this;
            }

            /**
             * <p>节点在工作流图中的泳道位置</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder lane(Long lane) {
                this.lane = lane;
                return this;
            }

            /**
             * <p>所属节点key（nodeKey），不是会话ID</p>
             * 
             * <strong>example:</strong>
             * <p>query.amount</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>节点展示名称</p>
             * 
             * <strong>example:</strong>
             * <p>查询签单金额</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>节点在返回拓扑列表中的展示序号，从1开始</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder nodeOrder(Long nodeOrder) {
                this.nodeOrder = nodeOrder;
                return this;
            }

            /**
             * <p>实际节点类型，例如AGENT或HUMAN</p>
             * 
             * <strong>example:</strong>
             * <p>AGENT</p>
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * <p>节点在工作流图中的层级，从0开始</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder rank(Long rank) {
                this.rank = rank;
                return this;
            }

            /**
             * <p>原始节点运行状态，例如READY、RUNNING、WAITING、SUCCEEDED或FAILED</p>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>等待原因：HUMAN_INPUT、HUMAN_STEP、REVIEW、MANUAL_PAUSE或UNBLOCK；未等待时为空</p>
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
