// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PreviewWorkflowResponseBody} extends {@link TeaModel}
 *
 * <p>PreviewWorkflowResponseBody</p>
 */
public class PreviewWorkflowResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("WorkflowDetail")
    private WorkflowDetail workflowDetail;

    private PreviewWorkflowResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.workflowDetail = builder.workflowDetail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PreviewWorkflowResponseBody create() {
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
     * @return workflowDetail
     */
    public WorkflowDetail getWorkflowDetail() {
        return this.workflowDetail;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private WorkflowDetail workflowDetail; 

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
         * WorkflowDetail.
         */
        public Builder workflowDetail(WorkflowDetail workflowDetail) {
            this.workflowDetail = workflowDetail;
            return this;
        }

        public PreviewWorkflowResponseBody build() {
            return new PreviewWorkflowResponseBody(this);
        } 

    } 

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
    public static class AuditUserList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuditUser")
        private java.util.List < AuditUser> auditUser;

        private AuditUserList(Builder builder) {
            this.auditUser = builder.auditUser;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuditUserList create() {
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

            public AuditUserList build() {
                return new AuditUserList(this);
            } 

        } 

    }
    public static class WorkflowNode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuditUserList")
        private AuditUserList auditUserList;

        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private String nodeType;

        private WorkflowNode(Builder builder) {
            this.auditUserList = builder.auditUserList;
            this.comment = builder.comment;
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
         * @return auditUserList
         */
        public AuditUserList getAuditUserList() {
            return this.auditUserList;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
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
            private AuditUserList auditUserList; 
            private String comment; 
            private String nodeName; 
            private String nodeType; 

            /**
             * AuditUserList.
             */
            public Builder auditUserList(AuditUserList auditUserList) {
                this.auditUserList = auditUserList;
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
    public static class WorkflowNodeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("WorkflowNode")
        private java.util.List < WorkflowNode> workflowNode;

        private WorkflowNodeList(Builder builder) {
            this.workflowNode = builder.workflowNode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkflowNodeList create() {
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

            public WorkflowNodeList build() {
                return new WorkflowNodeList(this);
            } 

        } 

    }
    public static class WorkflowDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("WfCateName")
        private String wfCateName;

        @com.aliyun.core.annotation.NameInMap("WorkflowNodeList")
        private WorkflowNodeList workflowNodeList;

        private WorkflowDetail(Builder builder) {
            this.comment = builder.comment;
            this.wfCateName = builder.wfCateName;
            this.workflowNodeList = builder.workflowNodeList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkflowDetail create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return wfCateName
         */
        public String getWfCateName() {
            return this.wfCateName;
        }

        /**
         * @return workflowNodeList
         */
        public WorkflowNodeList getWorkflowNodeList() {
            return this.workflowNodeList;
        }

        public static final class Builder {
            private String comment; 
            private String wfCateName; 
            private WorkflowNodeList workflowNodeList; 

            /**
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * WfCateName.
             */
            public Builder wfCateName(String wfCateName) {
                this.wfCateName = wfCateName;
                return this;
            }

            /**
             * WorkflowNodeList.
             */
            public Builder workflowNodeList(WorkflowNodeList workflowNodeList) {
                this.workflowNodeList = workflowNodeList;
                return this;
            }

            public WorkflowDetail build() {
                return new WorkflowDetail(this);
            } 

        } 

    }
}
