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
 * {@link ListWorkflowInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListWorkflowInstancesResponseBody</p>
 */
public class ListWorkflowInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("page")
    private Long page;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private ListWorkflowInstancesResponseBody(Builder builder) {
        this.code = builder.code;
        this.items = builder.items;
        this.message = builder.message;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkflowInstancesResponseBody create() {
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
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return page
     */
    public Long getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Items> items; 
        private String message; 
        private Long page; 
        private Long pageSize; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(ListWorkflowInstancesResponseBody model) {
            this.code = model.code;
            this.items = model.items;
            this.message = model.message;
            this.page = model.page;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * <p>The business status code from the unified POP response wrapper.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The list of instances on the current page.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The user-visible error message from the unified POP response wrapper.</p>
         * 
         * <strong>example:</strong>
         * <p>The requested resource does not exist</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Long page) {
            this.page = page;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
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
         * <p>The total number of visible instances after filtering.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListWorkflowInstancesResponseBody build() {
            return new ListWorkflowInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListWorkflowInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkflowInstancesResponseBody</p>
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
             * <p>The display name of the current handler.</p>
             * 
             * <strong>example:</strong>
             * <p>Zhang San</p>
             */
            public Builder handler(String handler) {
                this.handler = handler;
                return this;
            }

            /**
             * <p>The identifier of the handler or digital employee.</p>
             * 
             * <strong>example:</strong>
             * <p>user_10086</p>
             */
            public Builder handlerId(String handlerId) {
                this.handlerId = handlerId;
                return this;
            }

            /**
             * <p>The nodeKey of the actual running node.</p>
             * 
             * <strong>example:</strong>
             * <p>node_key_confirm</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The display name of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>Requirement confirmation</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>The actual node type. Valid values: AGENT, HUMAN, and CONDITION.</p>
             * 
             * <strong>example:</strong>
             * <p>AGENT</p>
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * <p>The running status of the node.</p>
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
     * {@link ListWorkflowInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkflowInstancesResponseBody</p>
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
             * <p>The display name of the current handler.</p>
             * 
             * <strong>example:</strong>
             * <p>Zhang San</p>
             */
            public Builder handler(String handler) {
                this.handler = handler;
                return this;
            }

            /**
             * <p>The identifier of the handler or digital employee.</p>
             * 
             * <strong>example:</strong>
             * <p>user_10086</p>
             */
            public Builder handlerId(String handlerId) {
                this.handlerId = handlerId;
                return this;
            }

            /**
             * <p>The nodeKey of the actual running node.</p>
             * 
             * <strong>example:</strong>
             * <p>node_key_confirm</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The display name of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>Requirement confirmation</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>The actual node type. Valid values: AGENT, HUMAN, and CONDITION.</p>
             * 
             * <strong>example:</strong>
             * <p>AGENT</p>
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * <p>The running status of the node.</p>
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
     * {@link ListWorkflowInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkflowInstancesResponseBody</p>
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
             * <p>The number of visible nodes that have succeeded or been skipped.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder completedCount(Long completedCount) {
                this.completedCount = completedCount;
                return this;
            }

            /**
             * <p>The total number of visible nodes in the current graph. This number is not fixed to six.</p>
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
    /**
     * 
     * {@link ListWorkflowInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkflowInstancesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("businessId")
        private String businessId;

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

        @com.aliyun.core.annotation.NameInMap("pauseScope")
        private String pauseScope;

        @com.aliyun.core.annotation.NameInMap("planId")
        private String planId;

        @com.aliyun.core.annotation.NameInMap("progress")
        private Progress progress;

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

        private Items(Builder builder) {
            this.businessId = builder.businessId;
            this.collaborationGroupId = builder.collaborationGroupId;
            this.createdAt = builder.createdAt;
            this.currentNode = builder.currentNode;
            this.currentNodes = builder.currentNodes;
            this.endedAt = builder.endedAt;
            this.initiator = builder.initiator;
            this.instanceId = builder.instanceId;
            this.pauseScope = builder.pauseScope;
            this.planId = builder.planId;
            this.progress = builder.progress;
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

        public static Items create() {
            return builder().build();
        }

        /**
         * @return businessId
         */
        public String getBusinessId() {
            return this.businessId;
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
            private String collaborationGroupId; 
            private String createdAt; 
            private CurrentNode currentNode; 
            private java.util.List<CurrentNodes> currentNodes; 
            private String endedAt; 
            private String initiator; 
            private String instanceId; 
            private String pauseScope; 
            private String planId; 
            private Progress progress; 
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

            private Builder(Items model) {
                this.businessId = model.businessId;
                this.collaborationGroupId = model.collaborationGroupId;
                this.createdAt = model.createdAt;
                this.currentNode = model.currentNode;
                this.currentNodes = model.currentNodes;
                this.endedAt = model.endedAt;
                this.initiator = model.initiator;
                this.instanceId = model.instanceId;
                this.pauseScope = model.pauseScope;
                this.planId = model.planId;
                this.progress = model.progress;
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
             * <p>The unique external requirement ID in the space.</p>
             * 
             * <strong>example:</strong>
             * <p>REQ-1001</p>
             */
            public Builder businessId(String businessId) {
                this.businessId = businessId;
                return this;
            }

            /**
             * <p>The collaboration space ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cg_20261016_abc123</p>
             */
            public Builder collaborationGroupId(String collaborationGroupId) {
                this.collaborationGroupId = collaborationGroupId;
                return this;
            }

            /**
             * <p>The time when the logical instance was created. The time is in the ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-16T10:30:00+08:00</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The first active node. This value is null if the instance is in a terminal state.</p>
             */
            public Builder currentNode(CurrentNode currentNode) {
                this.currentNode = currentNode;
                return this;
            }

            /**
             * <p>All active nodes. Parallel DAGs are supported.</p>
             */
            public Builder currentNodes(java.util.List<CurrentNodes> currentNodes) {
                this.currentNodes = currentNodes;
                return this;
            }

            /**
             * <p>The time when the current plan reached a terminal state. This value is null if the plan has not ended.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-16T10:30:00+08:00</p>
             */
            public Builder endedAt(String endedAt) {
                this.endedAt = endedAt;
                return this;
            }

            /**
             * <p>The external initiator tag. This tag is not used for authentication.</p>
             * 
             * <strong>example:</strong>
             * <p>External initiator Zhang San</p>
             */
            public Builder initiator(String initiator) {
                this.initiator = initiator;
                return this;
            }

            /**
             * <p>The stable logical instance ID. This ID does not change when the work item is restarted.</p>
             * 
             * <strong>example:</strong>
             * <p>wfi_20261016_abc123</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The original plan pause scope.</p>
             * 
             * <strong>example:</strong>
             * <p>ALL</p>
             */
            public Builder pauseScope(String pauseScope) {
                this.pauseScope = pauseScope;
                return this;
            }

            /**
             * <p>The revision ID of the current physical plan.</p>
             * 
             * <strong>example:</strong>
             * <p>plan_20261016_abc123</p>
             */
            public Builder planId(String planId) {
                this.planId = planId;
                return this;
            }

            /**
             * <p>The progress of the visible graph.</p>
             */
            public Builder progress(Progress progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The original plan review status.</p>
             * 
             * <strong>example:</strong>
             * <p>APPROVED</p>
             */
            public Builder reviewStatus(String reviewStatus) {
                this.reviewStatus = reviewStatus;
                return this;
            }

            /**
             * <p>The revision number of the current physical plan.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder revision(Long revision) {
                this.revision = revision;
                return this;
            }

            /**
             * <p>The current run ID. This ID changes after a restart.</p>
             * 
             * <strong>example:</strong>
             * <p>run_20261016_abc123</p>
             */
            public Builder runId(String runId) {
                this.runId = runId;
                return this;
            }

            /**
             * <p>The original runtime status. Valid values: BUILDING, RUNNING, SUCCEEDED, FAILED, and CANCELLED.</p>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder runtimeStatus(String runtimeStatus) {
                this.runtimeStatus = runtimeStatus;
                return this;
            }

            /**
             * <p>The time when the current plan node started for the first time. This value is null if the node has not been executed.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-16T10:30:00+08:00</p>
             */
            public Builder startedAt(String startedAt) {
                this.startedAt = startedAt;
                return this;
            }

            /**
             * <p>The runtime status version.</p>
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
             * <p>The ID of the workflow template bound at creation.</p>
             * 
             * <strong>example:</strong>
             * <p>wft_20261016_abc123</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The current requirement title.</p>
             * 
             * <strong>example:</strong>
             * <p>Quarterly business analysis report</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The ID of the associated work item.</p>
             * 
             * <strong>example:</strong>
             * <p>wi_20261016_abc123</p>
             */
            public Builder workItemId(String workItemId) {
                this.workItemId = workItemId;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
