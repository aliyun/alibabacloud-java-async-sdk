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
 * {@link CreateWorkflowInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateWorkflowInstanceResponseBody</p>
 */
public class CreateWorkflowInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("businessId")
    private String businessId;

    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("collaborationGroupId")
    private String collaborationGroupId;

    @com.aliyun.core.annotation.NameInMap("createdAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("currentNode")
    private CurrentNode currentNode;

    @com.aliyun.core.annotation.NameInMap("currentNodes")
    private java.util.List<CurrentNodes> currentNodes;

    @com.aliyun.core.annotation.NameInMap("endedAt")
    private String endedAt;

    @com.aliyun.core.annotation.NameInMap("initiator")
    private String initiator;

    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("pauseScope")
    private String pauseScope;

    @com.aliyun.core.annotation.NameInMap("planId")
    private String planId;

    @com.aliyun.core.annotation.NameInMap("progress")
    private Progress progress;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("reviewStatus")
    private String reviewStatus;

    @com.aliyun.core.annotation.NameInMap("revision")
    private Long revision;

    @com.aliyun.core.annotation.NameInMap("runId")
    private String runId;

    @com.aliyun.core.annotation.NameInMap("runtimeStatus")
    private String runtimeStatus;

    @com.aliyun.core.annotation.NameInMap("startedAt")
    private String startedAt;

    @com.aliyun.core.annotation.NameInMap("stateVersion")
    private Long stateVersion;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("templateId")
    private String templateId;

    @com.aliyun.core.annotation.NameInMap("title")
    private String title;

    @com.aliyun.core.annotation.NameInMap("workItemId")
    private String workItemId;

    private CreateWorkflowInstanceResponseBody(Builder builder) {
        this.businessId = builder.businessId;
        this.code = builder.code;
        this.collaborationGroupId = builder.collaborationGroupId;
        this.createdAt = builder.createdAt;
        this.currentNode = builder.currentNode;
        this.currentNodes = builder.currentNodes;
        this.endedAt = builder.endedAt;
        this.initiator = builder.initiator;
        this.instanceId = builder.instanceId;
        this.message = builder.message;
        this.pauseScope = builder.pauseScope;
        this.planId = builder.planId;
        this.progress = builder.progress;
        this.requestId = builder.requestId;
        this.reviewStatus = builder.reviewStatus;
        this.revision = builder.revision;
        this.runId = builder.runId;
        this.runtimeStatus = builder.runtimeStatus;
        this.startedAt = builder.startedAt;
        this.stateVersion = builder.stateVersion;
        this.status = builder.status;
        this.templateId = builder.templateId;
        this.title = builder.title;
        this.workItemId = builder.workItemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWorkflowInstanceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessId
     */
    public String getBusinessId() {
        return this.businessId;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return collaborationGroupId
     */
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return currentNode
     */
    public CurrentNode getCurrentNode() {
        return this.currentNode;
    }

    /**
     * @return currentNodes
     */
    public java.util.List<CurrentNodes> getCurrentNodes() {
        return this.currentNodes;
    }

    /**
     * @return endedAt
     */
    public String getEndedAt() {
        return this.endedAt;
    }

    /**
     * @return initiator
     */
    public String getInitiator() {
        return this.initiator;
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
     * @return pauseScope
     */
    public String getPauseScope() {
        return this.pauseScope;
    }

    /**
     * @return planId
     */
    public String getPlanId() {
        return this.planId;
    }

    /**
     * @return progress
     */
    public Progress getProgress() {
        return this.progress;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return reviewStatus
     */
    public String getReviewStatus() {
        return this.reviewStatus;
    }

    /**
     * @return revision
     */
    public Long getRevision() {
        return this.revision;
    }

    /**
     * @return runId
     */
    public String getRunId() {
        return this.runId;
    }

    /**
     * @return runtimeStatus
     */
    public String getRuntimeStatus() {
        return this.runtimeStatus;
    }

    /**
     * @return startedAt
     */
    public String getStartedAt() {
        return this.startedAt;
    }

    /**
     * @return stateVersion
     */
    public Long getStateVersion() {
        return this.stateVersion;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return workItemId
     */
    public String getWorkItemId() {
        return this.workItemId;
    }

    public static final class Builder {
        private String businessId; 
        private String code; 
        private String collaborationGroupId; 
        private String createdAt; 
        private CurrentNode currentNode; 
        private java.util.List<CurrentNodes> currentNodes; 
        private String endedAt; 
        private String initiator; 
        private String instanceId; 
        private String message; 
        private String pauseScope; 
        private String planId; 
        private Progress progress; 
        private String requestId; 
        private String reviewStatus; 
        private Long revision; 
        private String runId; 
        private String runtimeStatus; 
        private String startedAt; 
        private Long stateVersion; 
        private String status; 
        private String templateId; 
        private String title; 
        private String workItemId; 

        private Builder() {
        } 

        private Builder(CreateWorkflowInstanceResponseBody model) {
            this.businessId = model.businessId;
            this.code = model.code;
            this.collaborationGroupId = model.collaborationGroupId;
            this.createdAt = model.createdAt;
            this.currentNode = model.currentNode;
            this.currentNodes = model.currentNodes;
            this.endedAt = model.endedAt;
            this.initiator = model.initiator;
            this.instanceId = model.instanceId;
            this.message = model.message;
            this.pauseScope = model.pauseScope;
            this.planId = model.planId;
            this.progress = model.progress;
            this.requestId = model.requestId;
            this.reviewStatus = model.reviewStatus;
            this.revision = model.revision;
            this.runId = model.runId;
            this.runtimeStatus = model.runtimeStatus;
            this.startedAt = model.startedAt;
            this.stateVersion = model.stateVersion;
            this.status = model.status;
            this.templateId = model.templateId;
            this.title = model.title;
            this.workItemId = model.workItemId;
        } 

        /**
         * <p>空间内唯一外部需求编号</p>
         * 
         * <strong>example:</strong>
         * <p>REQ-1001</p>
         */
        public Builder businessId(String businessId) {
            this.businessId = businessId;
            return this;
        }

        /**
         * <p>业务状态码，来自统一 POP 响应包装</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>协作空间 ID</p>
         * 
         * <strong>example:</strong>
         * <p>cg_20261016_abc123</p>
         */
        public Builder collaborationGroupId(String collaborationGroupId) {
            this.collaborationGroupId = collaborationGroupId;
            return this;
        }

        /**
         * <p>逻辑实例创建时间，ISO8601</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-16T10:30:00+08:00</p>
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>首个活动节点，终态为 null</p>
         */
        public Builder currentNode(CurrentNode currentNode) {
            this.currentNode = currentNode;
            return this;
        }

        /**
         * <p>全部活动节点，支持并行 DAG</p>
         */
        public Builder currentNodes(java.util.List<CurrentNodes> currentNodes) {
            this.currentNodes = currentNodes;
            return this;
        }

        /**
         * <p>当前计划终态时间，未结束为 null</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-16T10:30:00+08:00</p>
         */
        public Builder endedAt(String endedAt) {
            this.endedAt = endedAt;
            return this;
        }

        /**
         * <p>外部发起人标签，不参与鉴权</p>
         * 
         * <strong>example:</strong>
         * <p>外部发起人张三</p>
         */
        public Builder initiator(String initiator) {
            this.initiator = initiator;
            return this;
        }

        /**
         * <p>稳定逻辑实例 ID，工作项重启不改变</p>
         * 
         * <strong>example:</strong>
         * <p>wfi_20261016_abc123</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>用户可见错误描述，来自统一 POP 响应包装</p>
         * 
         * <strong>example:</strong>
         * <p>请求的资源不存在</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>原始计划暂停范围</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        public Builder pauseScope(String pauseScope) {
            this.pauseScope = pauseScope;
            return this;
        }

        /**
         * <p>当前物理计划修订 ID</p>
         * 
         * <strong>example:</strong>
         * <p>plan_20261016_abc123</p>
         */
        public Builder planId(String planId) {
            this.planId = planId;
            return this;
        }

        /**
         * <p>可见图进度</p>
         */
        public Builder progress(Progress progress) {
            this.progress = progress;
            return this;
        }

        /**
         * <p>请求追踪 ID</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>原始计划审核状态</p>
         * 
         * <strong>example:</strong>
         * <p>APPROVED</p>
         */
        public Builder reviewStatus(String reviewStatus) {
            this.reviewStatus = reviewStatus;
            return this;
        }

        /**
         * <p>当前物理计划修订号</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder revision(Long revision) {
            this.revision = revision;
            return this;
        }

        /**
         * <p>当前运行 ID，重启后会改变</p>
         * 
         * <strong>example:</strong>
         * <p>run_20261016_abc123</p>
         */
        public Builder runId(String runId) {
            this.runId = runId;
            return this;
        }

        /**
         * <p>原始 BUILDING/RUNNING/SUCCEEDED/FAILED/CANCELLED</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        public Builder runtimeStatus(String runtimeStatus) {
            this.runtimeStatus = runtimeStatus;
            return this;
        }

        /**
         * <p>当前计划节点首次开始时间，未执行为 null</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-16T10:30:00+08:00</p>
         */
        public Builder startedAt(String startedAt) {
            this.startedAt = startedAt;
            return this;
        }

        /**
         * <p>运行状态版本</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder stateVersion(Long stateVersion) {
            this.stateVersion = stateVersion;
            return this;
        }

        /**
         * <p>Running/Completed/Failed/Terminated</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>创建时绑定的工作流模板 ID</p>
         * 
         * <strong>example:</strong>
         * <p>wft_20261016_abc123</p>
         */
        public Builder templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>当前需求标题</p>
         * 
         * <strong>example:</strong>
         * <p>季度经营分析报告</p>
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * <p>关联工作项 ID</p>
         * 
         * <strong>example:</strong>
         * <p>wi_20261016_abc123</p>
         */
        public Builder workItemId(String workItemId) {
            this.workItemId = workItemId;
            return this;
        }

        public CreateWorkflowInstanceResponseBody build() {
            return new CreateWorkflowInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateWorkflowInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>CreateWorkflowInstanceResponseBody</p>
     */
    public static class CurrentNode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("handler")
        private String handler;

        @com.aliyun.core.annotation.NameInMap("handlerId")
        private String handlerId;

        @com.aliyun.core.annotation.NameInMap("nodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("nodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("nodeType")
        private String nodeType;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private CurrentNode(Builder builder) {
            this.handler = builder.handler;
            this.handlerId = builder.handlerId;
            this.nodeId = builder.nodeId;
            this.nodeName = builder.nodeName;
            this.nodeType = builder.nodeType;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CurrentNode create() {
            return builder().build();
        }

        /**
         * @return handler
         */
        public String getHandler() {
            return this.handler;
        }

        /**
         * @return handlerId
         */
        public String getHandlerId() {
            return this.handlerId;
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
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String handler; 
            private String handlerId; 
            private String nodeId; 
            private String nodeName; 
            private String nodeType; 
            private String status; 

            private Builder() {
            } 

            private Builder(CurrentNode model) {
                this.handler = model.handler;
                this.handlerId = model.handlerId;
                this.nodeId = model.nodeId;
                this.nodeName = model.nodeName;
                this.nodeType = model.nodeType;
                this.status = model.status;
            } 

            /**
             * <p>当前处理人展示名</p>
             * 
             * <strong>example:</strong>
             * <p>张三</p>
             */
            public Builder handler(String handler) {
                this.handler = handler;
                return this;
            }

            /**
             * <p>处理人或数字员工标识</p>
             * 
             * <strong>example:</strong>
             * <p>user_10086</p>
             */
            public Builder handlerId(String handlerId) {
                this.handlerId = handlerId;
                return this;
            }

            /**
             * <p>真实运行节点 nodeKey</p>
             * 
             * <strong>example:</strong>
             * <p>node_key_confirm</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>节点展示名</p>
             * 
             * <strong>example:</strong>
             * <p>需求确认</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>真实节点类型 AGENT/HUMAN/CONDITION</p>
             * 
             * <strong>example:</strong>
             * <p>AGENT</p>
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * <p>节点运行状态</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public CurrentNode build() {
                return new CurrentNode(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateWorkflowInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>CreateWorkflowInstanceResponseBody</p>
     */
    public static class CurrentNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("handler")
        private String handler;

        @com.aliyun.core.annotation.NameInMap("handlerId")
        private String handlerId;

        @com.aliyun.core.annotation.NameInMap("nodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("nodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("nodeType")
        private String nodeType;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private CurrentNodes(Builder builder) {
            this.handler = builder.handler;
            this.handlerId = builder.handlerId;
            this.nodeId = builder.nodeId;
            this.nodeName = builder.nodeName;
            this.nodeType = builder.nodeType;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CurrentNodes create() {
            return builder().build();
        }

        /**
         * @return handler
         */
        public String getHandler() {
            return this.handler;
        }

        /**
         * @return handlerId
         */
        public String getHandlerId() {
            return this.handlerId;
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
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String handler; 
            private String handlerId; 
            private String nodeId; 
            private String nodeName; 
            private String nodeType; 
            private String status; 

            private Builder() {
            } 

            private Builder(CurrentNodes model) {
                this.handler = model.handler;
                this.handlerId = model.handlerId;
                this.nodeId = model.nodeId;
                this.nodeName = model.nodeName;
                this.nodeType = model.nodeType;
                this.status = model.status;
            } 

            /**
             * <p>当前处理人展示名</p>
             * 
             * <strong>example:</strong>
             * <p>张三</p>
             */
            public Builder handler(String handler) {
                this.handler = handler;
                return this;
            }

            /**
             * <p>处理人或数字员工标识</p>
             * 
             * <strong>example:</strong>
             * <p>user_10086</p>
             */
            public Builder handlerId(String handlerId) {
                this.handlerId = handlerId;
                return this;
            }

            /**
             * <p>真实运行节点 nodeKey</p>
             * 
             * <strong>example:</strong>
             * <p>node_key_confirm</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>节点展示名</p>
             * 
             * <strong>example:</strong>
             * <p>需求确认</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>真实节点类型 AGENT/HUMAN/CONDITION</p>
             * 
             * <strong>example:</strong>
             * <p>AGENT</p>
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * <p>节点运行状态</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public CurrentNodes build() {
                return new CurrentNodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateWorkflowInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>CreateWorkflowInstanceResponseBody</p>
     */
    public static class Progress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("completedCount")
        private Long completedCount;

        @com.aliyun.core.annotation.NameInMap("totalCount")
        private Long totalCount;

        private Progress(Builder builder) {
            this.completedCount = builder.completedCount;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Progress create() {
            return builder().build();
        }

        /**
         * @return completedCount
         */
        public Long getCompletedCount() {
            return this.completedCount;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long completedCount; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Progress model) {
                this.completedCount = model.completedCount;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>已成功或跳过的可见节点数</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder completedCount(Long completedCount) {
                this.completedCount = completedCount;
                return this;
            }

            /**
             * <p>当前图可见节点总数，非固定六节点</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Progress build() {
                return new Progress(this);
            } 

        } 

    }
}
