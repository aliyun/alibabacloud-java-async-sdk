// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListWorkFlowNodesResponseBody} extends {@link TeaModel}
 *
 * <p>ListWorkFlowNodesResponseBody</p>
 */
public class ListWorkFlowNodesResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("WorkflowNodes")
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

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * WorkflowNodes.
         */
        public Builder workflowNodes(WorkflowNodes workflowNodes) {
            this.workflowNodes = workflowNodes;
            return this;
        }

        public ListWorkFlowNodesResponseBody build() {
            return new ListWorkFlowNodesResponseBody(this);
        } 

    } 

    public static class AuditUser extends TeaModel {
        @NameInMap("NickName")
        private String nickName;

        @NameInMap("RealName")
        private String realName;

        @NameInMap("UserId")
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

            /**
             * NickName.
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * RealName.
             */
            public Builder realName(String realName) {
                this.realName = realName;
                return this;
            }

            /**
             * UserId.
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
    public static class AuditUsers extends TeaModel {
        @NameInMap("AuditUser")
        private java.util.List < AuditUser> auditUser;

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
        public java.util.List < AuditUser> getAuditUser() {
            return this.auditUser;
        }

        public static final class Builder {
            private java.util.List < AuditUser> auditUser; 

            /**
             * AuditUser.
             */
            public Builder auditUser(java.util.List < AuditUser> auditUser) {
                this.auditUser = auditUser;
                return this;
            }

            public AuditUsers build() {
                return new AuditUsers(this);
            } 

        } 

    }
    public static class WorkflowNode extends TeaModel {
        @NameInMap("AuditUsers")
        private AuditUsers auditUsers;

        @NameInMap("Comment")
        private String comment;

        @NameInMap("CreateUserId")
        private Long createUserId;

        @NameInMap("CreateUserNickName")
        private String createUserNickName;

        @NameInMap("NodeId")
        private Long nodeId;

        @NameInMap("NodeName")
        private String nodeName;

        @NameInMap("NodeType")
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

            /**
             * AuditUsers.
             */
            public Builder auditUsers(AuditUsers auditUsers) {
                this.auditUsers = auditUsers;
                return this;
            }

            /**
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * CreateUserId.
             */
            public Builder createUserId(Long createUserId) {
                this.createUserId = createUserId;
                return this;
            }

            /**
             * CreateUserNickName.
             */
            public Builder createUserNickName(String createUserNickName) {
                this.createUserNickName = createUserNickName;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(Long nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * NodeName.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * NodeType.
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
}
