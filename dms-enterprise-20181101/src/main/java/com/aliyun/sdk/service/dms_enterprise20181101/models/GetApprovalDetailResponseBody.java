// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetApprovalDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetApprovalDetailResponseBody</p>
 */
public class GetApprovalDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApprovalDetail")
    private ApprovalDetail approvalDetail;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetApprovalDetailResponseBody(Builder builder) {
        this.approvalDetail = builder.approvalDetail;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApprovalDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return approvalDetail
     */
    public ApprovalDetail getApprovalDetail() {
        return this.approvalDetail;
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
        private ApprovalDetail approvalDetail; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * The approval details of the ticket.
         */
        public Builder approvalDetail(ApprovalDetail approvalDetail) {
            this.approvalDetail = approvalDetail;
            return this;
        }

        /**
         * The error code returned if the request failed.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message returned if the request failed.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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

        public GetApprovalDetailResponseBody build() {
            return new GetApprovalDetailResponseBody(this);
        } 

    } 

    public static class CurrentHandler extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("NickName")
        private String nickName;

        private CurrentHandler(Builder builder) {
            this.id = builder.id;
            this.nickName = builder.nickName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CurrentHandler create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return nickName
         */
        public String getNickName() {
            return this.nickName;
        }

        public static final class Builder {
            private Long id; 
            private String nickName; 

            /**
             * The ID of the user.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The nickname of the user.
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            public CurrentHandler build() {
                return new CurrentHandler(this);
            } 

        } 

    }
    public static class CurrentHandlers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentHandler")
        private java.util.List < CurrentHandler> currentHandler;

        private CurrentHandlers(Builder builder) {
            this.currentHandler = builder.currentHandler;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CurrentHandlers create() {
            return builder().build();
        }

        /**
         * @return currentHandler
         */
        public java.util.List < CurrentHandler> getCurrentHandler() {
            return this.currentHandler;
        }

        public static final class Builder {
            private java.util.List < CurrentHandler> currentHandler; 

            /**
             * CurrentHandler.
             */
            public Builder currentHandler(java.util.List < CurrentHandler> currentHandler) {
                this.currentHandler = currentHandler;
                return this;
            }

            public CurrentHandlers build() {
                return new CurrentHandlers(this);
            } 

        } 

    }
    public static class ReasonList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Reasons")
        private java.util.List < String > reasons;

        private ReasonList(Builder builder) {
            this.reasons = builder.reasons;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReasonList create() {
            return builder().build();
        }

        /**
         * @return reasons
         */
        public java.util.List < String > getReasons() {
            return this.reasons;
        }

        public static final class Builder {
            private java.util.List < String > reasons; 

            /**
             * Reasons.
             */
            public Builder reasons(java.util.List < String > reasons) {
                this.reasons = reasons;
                return this;
            }

            public ReasonList build() {
                return new ReasonList(this);
            } 

        } 

    }
    public static class AuditUserIdList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuditUserIds")
        private java.util.List < String > auditUserIds;

        private AuditUserIdList(Builder builder) {
            this.auditUserIds = builder.auditUserIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuditUserIdList create() {
            return builder().build();
        }

        /**
         * @return auditUserIds
         */
        public java.util.List < String > getAuditUserIds() {
            return this.auditUserIds;
        }

        public static final class Builder {
            private java.util.List < String > auditUserIds; 

            /**
             * AuditUserIds.
             */
            public Builder auditUserIds(java.util.List < String > auditUserIds) {
                this.auditUserIds = auditUserIds;
                return this;
            }

            public AuditUserIdList build() {
                return new AuditUserIdList(this);
            } 

        } 

    }
    public static class WorkflowNode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuditUserIdList")
        private AuditUserIdList auditUserIdList;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("OperateComment")
        private String operateComment;

        @com.aliyun.core.annotation.NameInMap("OperateTime")
        private String operateTime;

        @com.aliyun.core.annotation.NameInMap("OperatorId")
        private Long operatorId;

        @com.aliyun.core.annotation.NameInMap("WorkflowInsCode")
        private String workflowInsCode;

        private WorkflowNode(Builder builder) {
            this.auditUserIdList = builder.auditUserIdList;
            this.nodeName = builder.nodeName;
            this.operateComment = builder.operateComment;
            this.operateTime = builder.operateTime;
            this.operatorId = builder.operatorId;
            this.workflowInsCode = builder.workflowInsCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkflowNode create() {
            return builder().build();
        }

        /**
         * @return auditUserIdList
         */
        public AuditUserIdList getAuditUserIdList() {
            return this.auditUserIdList;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return operateComment
         */
        public String getOperateComment() {
            return this.operateComment;
        }

        /**
         * @return operateTime
         */
        public String getOperateTime() {
            return this.operateTime;
        }

        /**
         * @return operatorId
         */
        public Long getOperatorId() {
            return this.operatorId;
        }

        /**
         * @return workflowInsCode
         */
        public String getWorkflowInsCode() {
            return this.workflowInsCode;
        }

        public static final class Builder {
            private AuditUserIdList auditUserIdList; 
            private String nodeName; 
            private String operateComment; 
            private String operateTime; 
            private Long operatorId; 
            private String workflowInsCode; 

            /**
             * The IDs of the approvers.
             */
            public Builder auditUserIdList(AuditUserIdList auditUserIdList) {
                this.auditUserIdList = auditUserIdList;
                return this;
            }

            /**
             * The name of the approval node.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * The remarks of the approval.
             */
            public Builder operateComment(String operateComment) {
                this.operateComment = operateComment;
                return this;
            }

            /**
             * The time when the ticket was submitted.
             */
            public Builder operateTime(String operateTime) {
                this.operateTime = operateTime;
                return this;
            }

            /**
             * The ID of the user who submitted the ticket.
             */
            public Builder operatorId(Long operatorId) {
                this.operatorId = operatorId;
                return this;
            }

            /**
             * The approval status of the ticket. Valid values:
             * <p>
             * 
             * *   **START**: The ticket was submitted.
             * *   **ERROR**: An error occurred.
             * *   **AUDITING**: The ticket is being reviewed.
             * *   **REJECT**: The ticket was rejected.
             * *   **CANCEL**: The ticket was revoked.
             * *   **APPROVED**: The ticket was approved.
             */
            public Builder workflowInsCode(String workflowInsCode) {
                this.workflowInsCode = workflowInsCode;
                return this;
            }

            public WorkflowNode build() {
                return new WorkflowNode(this);
            } 

        } 

    }
    public static class WorkflowNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("WorkflowNode")
        private java.util.List < WorkflowNode> workflowNode;

        private WorkflowNodes(Builder builder) {
            this.workflowNode = builder.workflowNode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkflowNodes create() {
            return builder().build();
        }

        /**
         * @return workflowNode
         */
        public java.util.List < WorkflowNode> getWorkflowNode() {
            return this.workflowNode;
        }

        public static final class Builder {
            private java.util.List < WorkflowNode> workflowNode; 

            /**
             * WorkflowNode.
             */
            public Builder workflowNode(java.util.List < WorkflowNode> workflowNode) {
                this.workflowNode = workflowNode;
                return this;
            }

            public WorkflowNodes build() {
                return new WorkflowNodes(this);
            } 

        } 

    }
    public static class ApprovalDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuditId")
        private Long auditId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CurrentHandlers")
        private CurrentHandlers currentHandlers;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private Long orderId;

        @com.aliyun.core.annotation.NameInMap("OrderType")
        private String orderType;

        @com.aliyun.core.annotation.NameInMap("ReasonList")
        private ReasonList reasonList;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private Long templateId;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("WorkflowInsCode")
        private String workflowInsCode;

        @com.aliyun.core.annotation.NameInMap("WorkflowNodes")
        private WorkflowNodes workflowNodes;

        private ApprovalDetail(Builder builder) {
            this.auditId = builder.auditId;
            this.createTime = builder.createTime;
            this.currentHandlers = builder.currentHandlers;
            this.description = builder.description;
            this.orderId = builder.orderId;
            this.orderType = builder.orderType;
            this.reasonList = builder.reasonList;
            this.templateId = builder.templateId;
            this.title = builder.title;
            this.workflowInsCode = builder.workflowInsCode;
            this.workflowNodes = builder.workflowNodes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApprovalDetail create() {
            return builder().build();
        }

        /**
         * @return auditId
         */
        public Long getAuditId() {
            return this.auditId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return currentHandlers
         */
        public CurrentHandlers getCurrentHandlers() {
            return this.currentHandlers;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return orderId
         */
        public Long getOrderId() {
            return this.orderId;
        }

        /**
         * @return orderType
         */
        public String getOrderType() {
            return this.orderType;
        }

        /**
         * @return reasonList
         */
        public ReasonList getReasonList() {
            return this.reasonList;
        }

        /**
         * @return templateId
         */
        public Long getTemplateId() {
            return this.templateId;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return workflowInsCode
         */
        public String getWorkflowInsCode() {
            return this.workflowInsCode;
        }

        /**
         * @return workflowNodes
         */
        public WorkflowNodes getWorkflowNodes() {
            return this.workflowNodes;
        }

        public static final class Builder {
            private Long auditId; 
            private String createTime; 
            private CurrentHandlers currentHandlers; 
            private String description; 
            private Long orderId; 
            private String orderType; 
            private ReasonList reasonList; 
            private Long templateId; 
            private String title; 
            private String workflowInsCode; 
            private WorkflowNodes workflowNodes; 

            /**
             * The ID of the approval process.
             */
            public Builder auditId(Long auditId) {
                this.auditId = auditId;
                return this;
            }

            /**
             * The time when the approval process was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The information about the approver.
             */
            public Builder currentHandlers(CurrentHandlers currentHandlers) {
                this.currentHandlers = currentHandlers;
                return this;
            }

            /**
             * The description of the approval process.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the ticket.
             */
            public Builder orderId(Long orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * The type of the ticket. Valid values:
             * <p>
             * 
             * *   **NDDL**: a schema design ticket
             * *   **DATA_TRACK**: a data tracking ticket
             * *   **TABLE_SYNC**: a table synchronization ticket
             * *   **PERM_APPLY**: a permission application ticket
             * *   **DATA_EXPORT**: a data export ticket
             * *   **DATA_CORRECT**: a data change ticket
             * *   **OWNER_APPLY**: an owner role application ticket
             * *   **SENSITIVITY**: a column sensitivity level change ticket
             */
            public Builder orderType(String orderType) {
                this.orderType = orderType;
                return this;
            }

            /**
             * The reasons for the approval.
             */
            public Builder reasonList(ReasonList reasonList) {
                this.reasonList = reasonList;
                return this;
            }

            /**
             * The ID of the workflow template.
             */
            public Builder templateId(Long templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * The title of the approval process.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * The approval status of the ticket. Valid values:
             * <p>
             * 
             * *   **AUDITING**: The ticket is being reviewed.
             * *   **REJECT**: The ticket was rejected.
             * *   **CANCEL**: The ticket was revoked.
             * *   **APPROVED**: The ticket was approved.
             * 
             * > An approval process contains multiple approval nodes, and this parameter is returned for each approval node.
             */
            public Builder workflowInsCode(String workflowInsCode) {
                this.workflowInsCode = workflowInsCode;
                return this;
            }

            /**
             * The details of approval nodes.
             */
            public Builder workflowNodes(WorkflowNodes workflowNodes) {
                this.workflowNodes = workflowNodes;
                return this;
            }

            public ApprovalDetail build() {
                return new ApprovalDetail(this);
            } 

        } 

    }
}
