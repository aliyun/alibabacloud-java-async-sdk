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
 * {@link ListWorkFlowNodesResponseBody} extends {@link TeaModel}
 *
 * <p>ListWorkFlowNodesResponseBody</p>
 */
public class ListWorkFlowNodesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("WorkflowNodes")
    private WorkflowNodes workflowNodes;

    private ListWorkFlowNodesResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.workflowNodes = builder.workflowNodes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkFlowNodesResponseBody create() {
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

    /**
     * @return workflowNodes
     */
    public WorkflowNodes getWorkflowNodes() {
        return this.workflowNodes;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private WorkflowNodes workflowNodes; 

        private Builder() {
        } 

        private Builder(ListWorkFlowNodesResponseBody model) {
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
            this.workflowNodes = model.workflowNodes;
        } 

        /**
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CFD8FE00-36D9-4C1B-940D-65A7B73D9066</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The details of approval nodes.</p>
         */
        public Builder workflowNodes(WorkflowNodes workflowNodes) {
            this.workflowNodes = workflowNodes;
            return this;
        }

        public ListWorkFlowNodesResponseBody build() {
            return new ListWorkFlowNodesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListWorkFlowNodesResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkFlowNodesResponseBody</p>
     */
    public static class AuditUser extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NickName")
        private String nickName;

        @com.aliyun.core.annotation.NameInMap("RealName")
        private String realName;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private Long userId;

        private AuditUser(Builder builder) {
            this.nickName = builder.nickName;
            this.realName = builder.realName;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuditUser create() {
            return builder().build();
        }

        /**
         * @return nickName
         */
        public String getNickName() {
            return this.nickName;
        }

        /**
         * @return realName
         */
        public String getRealName() {
            return this.realName;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String nickName; 
            private String realName; 
            private Long userId; 

            private Builder() {
            } 

            private Builder(AuditUser model) {
                this.nickName = model.nickName;
                this.realName = model.realName;
                this.userId = model.userId;
            } 

            /**
             * <p>The nickname of the approver.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * <p>The real name of the approver.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder realName(String realName) {
                this.realName = realName;
                return this;
            }

            /**
             * <p>The ID of the approver. The ID is different from the ID of the Alibaba Cloud account of the approver.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            public AuditUser build() {
                return new AuditUser(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListWorkFlowNodesResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkFlowNodesResponseBody</p>
     */
    public static class AuditUsers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuditUser")
        private java.util.List<AuditUser> auditUser;

        private AuditUsers(Builder builder) {
            this.auditUser = builder.auditUser;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuditUsers create() {
            return builder().build();
        }

        /**
         * @return auditUser
         */
        public java.util.List<AuditUser> getAuditUser() {
            return this.auditUser;
        }

        public static final class Builder {
            private java.util.List<AuditUser> auditUser; 

            private Builder() {
            } 

            private Builder(AuditUsers model) {
                this.auditUser = model.auditUser;
            } 

            /**
             * AuditUser.
             */
            public Builder auditUser(java.util.List<AuditUser> auditUser) {
                this.auditUser = auditUser;
                return this;
            }

            public AuditUsers build() {
                return new AuditUsers(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListWorkFlowNodesResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkFlowNodesResponseBody</p>
     */
    public static class WorkflowNode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuditUsers")
        private AuditUsers auditUsers;

        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("CreateUserId")
        private Long createUserId;

        @com.aliyun.core.annotation.NameInMap("CreateUserNickName")
        private String createUserNickName;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private Long nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private String nodeType;

        private WorkflowNode(Builder builder) {
            this.auditUsers = builder.auditUsers;
            this.comment = builder.comment;
            this.createUserId = builder.createUserId;
            this.createUserNickName = builder.createUserNickName;
            this.nodeId = builder.nodeId;
            this.nodeName = builder.nodeName;
            this.nodeType = builder.nodeType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkflowNode create() {
            return builder().build();
        }

        /**
         * @return auditUsers
         */
        public AuditUsers getAuditUsers() {
            return this.auditUsers;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return createUserId
         */
        public Long getCreateUserId() {
            return this.createUserId;
        }

        /**
         * @return createUserNickName
         */
        public String getCreateUserNickName() {
            return this.createUserNickName;
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
        public String getNodeType() {
            return this.nodeType;
        }

        public static final class Builder {
            private AuditUsers auditUsers; 
            private String comment; 
            private Long createUserId; 
            private String createUserNickName; 
            private Long nodeId; 
            private String nodeName; 
            private String nodeType; 

            private Builder() {
            } 

            private Builder(WorkflowNode model) {
                this.auditUsers = model.auditUsers;
                this.comment = model.comment;
                this.createUserId = model.createUserId;
                this.createUserNickName = model.createUserNickName;
                this.nodeId = model.nodeId;
                this.nodeName = model.nodeName;
                this.nodeType = model.nodeType;
            } 

            /**
             * <p>The details about approvers.</p>
             */
            public Builder auditUsers(AuditUsers auditUsers) {
                this.auditUsers = auditUsers;
                return this;
            }

            /**
             * <p>The description of the approval template.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The ID of the creator. This ID is different from the ID of the Alibaba Cloud account of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder createUserId(Long createUserId) {
                this.createUserId = createUserId;
                return this;
            }

            /**
             * <p>The name of the user who creates the approval node.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder createUserNickName(String createUserNickName) {
                this.createUserNickName = createUserNickName;
                return this;
            }

            /**
             * <p>The ID of the approval node.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder nodeId(Long nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The name of the approval node.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>The type of the approval node. Valid values:</p>
             * <ul>
             * <li>SYS: The approval node is predefined by the system.</li>
             * <li>USER_LIST: The approval node is created by a user.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SYS</p>
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            public WorkflowNode build() {
                return new WorkflowNode(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListWorkFlowNodesResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkFlowNodesResponseBody</p>
     */
    public static class WorkflowNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("WorkflowNode")
        private java.util.List<WorkflowNode> workflowNode;

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
        public java.util.List<WorkflowNode> getWorkflowNode() {
            return this.workflowNode;
        }

        public static final class Builder {
            private java.util.List<WorkflowNode> workflowNode; 

            private Builder() {
            } 

            private Builder(WorkflowNodes model) {
                this.workflowNode = model.workflowNode;
            } 

            /**
             * WorkflowNode.
             */
            public Builder workflowNode(java.util.List<WorkflowNode> workflowNode) {
                this.workflowNode = workflowNode;
                return this;
            }

            public WorkflowNodes build() {
                return new WorkflowNodes(this);
            } 

        } 

    }
}
