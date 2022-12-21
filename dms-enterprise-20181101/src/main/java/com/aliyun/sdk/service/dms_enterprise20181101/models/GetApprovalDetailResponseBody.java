// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetApprovalDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetApprovalDetailResponseBody</p>
 */
public class GetApprovalDetailResponseBody extends TeaModel {
    @NameInMap("ApprovalDetail")
    private ApprovalDetail approvalDetail;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * - **true**: The request was successful.
         * - **false**: The request failed.
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
        @NameInMap("Id")
        private Long id;

        @NameInMap("NickName")
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
        @NameInMap("CurrentHandler")
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
        @NameInMap("Reasons")
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
        @NameInMap("AuditUserIds")
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
        @NameInMap("AuditUserIdList")
        private AuditUserIdList auditUserIdList;

        @NameInMap("NodeName")
        private String nodeName;

        @NameInMap("OperateComment")
        private String operateComment;

        @NameInMap("OperateTime")
        private String operateTime;

        @NameInMap("OperatorId")
        private Long operatorId;

        @NameInMap("WorkflowInsCode")
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
             * *   **AUDITING**: The ticket is being processed.
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
        @NameInMap("WorkflowNode")
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
        @NameInMap("AuditId")
        private Long auditId;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("CurrentHandlers")
        private CurrentHandlers currentHandlers;

        @NameInMap("Description")
        private String description;

        @NameInMap("OrderId")
        private Long orderId;

        @NameInMap("OrderType")
        private String orderType;

        @NameInMap("ReasonList")
        private ReasonList reasonList;

        @NameInMap("TemplateId")
        private Long templateId;

        @NameInMap("Title")
        private String title;

        @NameInMap("WorkflowInsCode")
        private String workflowInsCode;

        @NameInMap("WorkflowNodes")
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
             * - **NDDL**: The ticket is used to change the schema design.
             * - **DATA_TRACK**: The ticket is used to track data.
             * - **TABLE_SYNC**: The ticket is used to synchronize databases and tables.
             * - **PERM_APPLY**: The ticket is used to apply for permissions.
             * - **DATA_EXPORT**: The ticket is used to export data.
             * - **DATA_CORRECT**: The ticket is used to change data.
             * - **OWNER_APPLY**: The ticket is used to apply for the owner role of a resource.
             * - **SENSITIVITY**: The ticket is used to change column sensitivity levels.
             */
            public Builder orderType(String orderType) {
                this.orderType = orderType;
                return this;
            }

            /**
             * The reason for the approval.
             */
            public Builder reasonList(ReasonList reasonList) {
                this.reasonList = reasonList;
                return this;
            }

            /**
             * The ID of the approval template.
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
             * - **AUDITING**: The ticket is being processed.
             * - **REJECT**: The ticket was rejected.
             * - **CANCEL**: The ticket was revoked.
             * - **APPROVED**: The ticket was approved.
             * 
             * >  If an approval process contains multiple approval nodes, this parameter is returned for each approval node.
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
