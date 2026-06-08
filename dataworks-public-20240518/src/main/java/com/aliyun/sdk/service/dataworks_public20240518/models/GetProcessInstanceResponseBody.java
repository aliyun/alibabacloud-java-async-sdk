// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link GetProcessInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetProcessInstanceResponseBody</p>
 */
public class GetProcessInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ProcessInstance")
    private ProcessInstance processInstance;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetProcessInstanceResponseBody(Builder builder) {
        this.processInstance = builder.processInstance;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProcessInstanceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return processInstance
     */
    public ProcessInstance getProcessInstance() {
        return this.processInstance;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ProcessInstance processInstance; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetProcessInstanceResponseBody model) {
            this.processInstance = model.processInstance;
            this.requestId = model.requestId;
        } 

        /**
         * ProcessInstance.
         */
        public Builder processInstance(ProcessInstance processInstance) {
            this.processInstance = processInstance;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetProcessInstanceResponseBody build() {
            return new GetProcessInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetProcessInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetProcessInstanceResponseBody</p>
     */
    public static class ApprovalNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountType")
        private String accountType;

        @com.aliyun.core.annotation.NameInMap("Assignees")
        private java.util.List<String> assignees;

        @com.aliyun.core.annotation.NameInMap("ExtensionProperties")
        private String extensionProperties;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private ApprovalNodes(Builder builder) {
            this.accountType = builder.accountType;
            this.assignees = builder.assignees;
            this.extensionProperties = builder.extensionProperties;
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApprovalNodes create() {
            return builder().build();
        }

        /**
         * @return accountType
         */
        public String getAccountType() {
            return this.accountType;
        }

        /**
         * @return assignees
         */
        public java.util.List<String> getAssignees() {
            return this.assignees;
        }

        /**
         * @return extensionProperties
         */
        public String getExtensionProperties() {
            return this.extensionProperties;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String accountType; 
            private java.util.List<String> assignees; 
            private String extensionProperties; 
            private String id; 
            private String name; 

            private Builder() {
            } 

            private Builder(ApprovalNodes model) {
                this.accountType = model.accountType;
                this.assignees = model.assignees;
                this.extensionProperties = model.extensionProperties;
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * AccountType.
             */
            public Builder accountType(String accountType) {
                this.accountType = accountType;
                return this;
            }

            /**
             * Assignees.
             */
            public Builder assignees(java.util.List<String> assignees) {
                this.assignees = assignees;
                return this;
            }

            /**
             * ExtensionProperties.
             */
            public Builder extensionProperties(String extensionProperties) {
                this.extensionProperties = extensionProperties;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public ApprovalNodes build() {
                return new ApprovalNodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetProcessInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetProcessInstanceResponseBody</p>
     */
    public static class NotificationServices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Channel")
        private String channel;

        @com.aliyun.core.annotation.NameInMap("Extension")
        private String extension;

        @com.aliyun.core.annotation.NameInMap("Receiver")
        private String receiver;

        private NotificationServices(Builder builder) {
            this.channel = builder.channel;
            this.extension = builder.extension;
            this.receiver = builder.receiver;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NotificationServices create() {
            return builder().build();
        }

        /**
         * @return channel
         */
        public String getChannel() {
            return this.channel;
        }

        /**
         * @return extension
         */
        public String getExtension() {
            return this.extension;
        }

        /**
         * @return receiver
         */
        public String getReceiver() {
            return this.receiver;
        }

        public static final class Builder {
            private String channel; 
            private String extension; 
            private String receiver; 

            private Builder() {
            } 

            private Builder(NotificationServices model) {
                this.channel = model.channel;
                this.extension = model.extension;
                this.receiver = model.receiver;
            } 

            /**
             * Channel.
             */
            public Builder channel(String channel) {
                this.channel = channel;
                return this;
            }

            /**
             * Extension.
             */
            public Builder extension(String extension) {
                this.extension = extension;
                return this;
            }

            /**
             * Receiver.
             */
            public Builder receiver(String receiver) {
                this.receiver = receiver;
                return this;
            }

            public NotificationServices build() {
                return new NotificationServices(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetProcessInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetProcessInstanceResponseBody</p>
     */
    public static class RuleConditions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Expression")
        private String expression;

        @com.aliyun.core.annotation.NameInMap("Scope")
        private String scope;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private RuleConditions(Builder builder) {
            this.expression = builder.expression;
            this.scope = builder.scope;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleConditions create() {
            return builder().build();
        }

        /**
         * @return expression
         */
        public String getExpression() {
            return this.expression;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String expression; 
            private String scope; 
            private String type; 

            private Builder() {
            } 

            private Builder(RuleConditions model) {
                this.expression = model.expression;
                this.scope = model.scope;
                this.type = model.type;
            } 

            /**
             * Expression.
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * Scope.
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public RuleConditions build() {
                return new RuleConditions(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetProcessInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetProcessInstanceResponseBody</p>
     */
    public static class ApprovalProcessDefinition extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApprovalNodes")
        private java.util.List<ApprovalNodes> approvalNodes;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NotificationServices")
        private java.util.List<NotificationServices> notificationServices;

        @com.aliyun.core.annotation.NameInMap("RuleConditions")
        private java.util.List<RuleConditions> ruleConditions;

        @com.aliyun.core.annotation.NameInMap("SubType")
        private String subType;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private ApprovalProcessDefinition(Builder builder) {
            this.approvalNodes = builder.approvalNodes;
            this.description = builder.description;
            this.enabled = builder.enabled;
            this.id = builder.id;
            this.name = builder.name;
            this.notificationServices = builder.notificationServices;
            this.ruleConditions = builder.ruleConditions;
            this.subType = builder.subType;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApprovalProcessDefinition create() {
            return builder().build();
        }

        /**
         * @return approvalNodes
         */
        public java.util.List<ApprovalNodes> getApprovalNodes() {
            return this.approvalNodes;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return notificationServices
         */
        public java.util.List<NotificationServices> getNotificationServices() {
            return this.notificationServices;
        }

        /**
         * @return ruleConditions
         */
        public java.util.List<RuleConditions> getRuleConditions() {
            return this.ruleConditions;
        }

        /**
         * @return subType
         */
        public String getSubType() {
            return this.subType;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<ApprovalNodes> approvalNodes; 
            private String description; 
            private Boolean enabled; 
            private String id; 
            private String name; 
            private java.util.List<NotificationServices> notificationServices; 
            private java.util.List<RuleConditions> ruleConditions; 
            private String subType; 
            private String type; 

            private Builder() {
            } 

            private Builder(ApprovalProcessDefinition model) {
                this.approvalNodes = model.approvalNodes;
                this.description = model.description;
                this.enabled = model.enabled;
                this.id = model.id;
                this.name = model.name;
                this.notificationServices = model.notificationServices;
                this.ruleConditions = model.ruleConditions;
                this.subType = model.subType;
                this.type = model.type;
            } 

            /**
             * ApprovalNodes.
             */
            public Builder approvalNodes(java.util.List<ApprovalNodes> approvalNodes) {
                this.approvalNodes = approvalNodes;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NotificationServices.
             */
            public Builder notificationServices(java.util.List<NotificationServices> notificationServices) {
                this.notificationServices = notificationServices;
                return this;
            }

            /**
             * RuleConditions.
             */
            public Builder ruleConditions(java.util.List<RuleConditions> ruleConditions) {
                this.ruleConditions = ruleConditions;
                return this;
            }

            /**
             * SubType.
             */
            public Builder subType(String subType) {
                this.subType = subType;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ApprovalProcessDefinition build() {
                return new ApprovalProcessDefinition(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetProcessInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetProcessInstanceResponseBody</p>
     */
    public static class ApprovalNode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountType")
        private String accountType;

        @com.aliyun.core.annotation.NameInMap("Assignees")
        private java.util.List<String> assignees;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private ApprovalNode(Builder builder) {
            this.accountType = builder.accountType;
            this.assignees = builder.assignees;
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApprovalNode create() {
            return builder().build();
        }

        /**
         * @return accountType
         */
        public String getAccountType() {
            return this.accountType;
        }

        /**
         * @return assignees
         */
        public java.util.List<String> getAssignees() {
            return this.assignees;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String accountType; 
            private java.util.List<String> assignees; 
            private String id; 
            private String name; 

            private Builder() {
            } 

            private Builder(ApprovalNode model) {
                this.accountType = model.accountType;
                this.assignees = model.assignees;
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * AccountType.
             */
            public Builder accountType(String accountType) {
                this.accountType = accountType;
                return this;
            }

            /**
             * Assignees.
             */
            public Builder assignees(java.util.List<String> assignees) {
                this.assignees = assignees;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public ApprovalNode build() {
                return new ApprovalNode(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetProcessInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetProcessInstanceResponseBody</p>
     */
    public static class TaskCandidates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MemberName")
        private String memberName;

        @com.aliyun.core.annotation.NameInMap("MemberUserId")
        private String memberUserId;

        private TaskCandidates(Builder builder) {
            this.memberName = builder.memberName;
            this.memberUserId = builder.memberUserId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskCandidates create() {
            return builder().build();
        }

        /**
         * @return memberName
         */
        public String getMemberName() {
            return this.memberName;
        }

        /**
         * @return memberUserId
         */
        public String getMemberUserId() {
            return this.memberUserId;
        }

        public static final class Builder {
            private String memberName; 
            private String memberUserId; 

            private Builder() {
            } 

            private Builder(TaskCandidates model) {
                this.memberName = model.memberName;
                this.memberUserId = model.memberUserId;
            } 

            /**
             * MemberName.
             */
            public Builder memberName(String memberName) {
                this.memberName = memberName;
                return this;
            }

            /**
             * MemberUserId.
             */
            public Builder memberUserId(String memberUserId) {
                this.memberUserId = memberUserId;
                return this;
            }

            public TaskCandidates build() {
                return new TaskCandidates(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetProcessInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetProcessInstanceResponseBody</p>
     */
    public static class ApprovalTasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApprovalComment")
        private String approvalComment;

        @com.aliyun.core.annotation.NameInMap("ApprovalDecision")
        private String approvalDecision;

        @com.aliyun.core.annotation.NameInMap("ApprovalNode")
        private ApprovalNode approvalNode;

        @com.aliyun.core.annotation.NameInMap("Assignee")
        private String assignee;

        @com.aliyun.core.annotation.NameInMap("AssigneeName")
        private String assigneeName;

        @com.aliyun.core.annotation.NameInMap("CompleteTime")
        private Long completeTime;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskCandidates")
        private java.util.List<TaskCandidates> taskCandidates;

        private ApprovalTasks(Builder builder) {
            this.approvalComment = builder.approvalComment;
            this.approvalDecision = builder.approvalDecision;
            this.approvalNode = builder.approvalNode;
            this.assignee = builder.assignee;
            this.assigneeName = builder.assigneeName;
            this.completeTime = builder.completeTime;
            this.createTime = builder.createTime;
            this.id = builder.id;
            this.status = builder.status;
            this.taskCandidates = builder.taskCandidates;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApprovalTasks create() {
            return builder().build();
        }

        /**
         * @return approvalComment
         */
        public String getApprovalComment() {
            return this.approvalComment;
        }

        /**
         * @return approvalDecision
         */
        public String getApprovalDecision() {
            return this.approvalDecision;
        }

        /**
         * @return approvalNode
         */
        public ApprovalNode getApprovalNode() {
            return this.approvalNode;
        }

        /**
         * @return assignee
         */
        public String getAssignee() {
            return this.assignee;
        }

        /**
         * @return assigneeName
         */
        public String getAssigneeName() {
            return this.assigneeName;
        }

        /**
         * @return completeTime
         */
        public Long getCompleteTime() {
            return this.completeTime;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskCandidates
         */
        public java.util.List<TaskCandidates> getTaskCandidates() {
            return this.taskCandidates;
        }

        public static final class Builder {
            private String approvalComment; 
            private String approvalDecision; 
            private ApprovalNode approvalNode; 
            private String assignee; 
            private String assigneeName; 
            private Long completeTime; 
            private Long createTime; 
            private String id; 
            private String status; 
            private java.util.List<TaskCandidates> taskCandidates; 

            private Builder() {
            } 

            private Builder(ApprovalTasks model) {
                this.approvalComment = model.approvalComment;
                this.approvalDecision = model.approvalDecision;
                this.approvalNode = model.approvalNode;
                this.assignee = model.assignee;
                this.assigneeName = model.assigneeName;
                this.completeTime = model.completeTime;
                this.createTime = model.createTime;
                this.id = model.id;
                this.status = model.status;
                this.taskCandidates = model.taskCandidates;
            } 

            /**
             * ApprovalComment.
             */
            public Builder approvalComment(String approvalComment) {
                this.approvalComment = approvalComment;
                return this;
            }

            /**
             * ApprovalDecision.
             */
            public Builder approvalDecision(String approvalDecision) {
                this.approvalDecision = approvalDecision;
                return this;
            }

            /**
             * ApprovalNode.
             */
            public Builder approvalNode(ApprovalNode approvalNode) {
                this.approvalNode = approvalNode;
                return this;
            }

            /**
             * Assignee.
             */
            public Builder assignee(String assignee) {
                this.assignee = assignee;
                return this;
            }

            /**
             * AssigneeName.
             */
            public Builder assigneeName(String assigneeName) {
                this.assigneeName = assigneeName;
                return this;
            }

            /**
             * CompleteTime.
             */
            public Builder completeTime(Long completeTime) {
                this.completeTime = completeTime;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TaskCandidates.
             */
            public Builder taskCandidates(java.util.List<TaskCandidates> taskCandidates) {
                this.taskCandidates = taskCandidates;
                return this;
            }

            public ApprovalTasks build() {
                return new ApprovalTasks(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetProcessInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetProcessInstanceResponseBody</p>
     */
    public static class ProcessInstance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Applicator")
        private String applicator;

        @com.aliyun.core.annotation.NameInMap("ApplicatorName")
        private String applicatorName;

        @com.aliyun.core.annotation.NameInMap("ApprovalProcessDefinition")
        private ApprovalProcessDefinition approvalProcessDefinition;

        @com.aliyun.core.annotation.NameInMap("ApprovalTasks")
        private java.util.List<ApprovalTasks> approvalTasks;

        @com.aliyun.core.annotation.NameInMap("AuthErrorMessage")
        private String authErrorMessage;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Object startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private ProcessInstance(Builder builder) {
            this.applicator = builder.applicator;
            this.applicatorName = builder.applicatorName;
            this.approvalProcessDefinition = builder.approvalProcessDefinition;
            this.approvalTasks = builder.approvalTasks;
            this.authErrorMessage = builder.authErrorMessage;
            this.id = builder.id;
            this.reason = builder.reason;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProcessInstance create() {
            return builder().build();
        }

        /**
         * @return applicator
         */
        public String getApplicator() {
            return this.applicator;
        }

        /**
         * @return applicatorName
         */
        public String getApplicatorName() {
            return this.applicatorName;
        }

        /**
         * @return approvalProcessDefinition
         */
        public ApprovalProcessDefinition getApprovalProcessDefinition() {
            return this.approvalProcessDefinition;
        }

        /**
         * @return approvalTasks
         */
        public java.util.List<ApprovalTasks> getApprovalTasks() {
            return this.approvalTasks;
        }

        /**
         * @return authErrorMessage
         */
        public String getAuthErrorMessage() {
            return this.authErrorMessage;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return startTime
         */
        public Object getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String applicator; 
            private String applicatorName; 
            private ApprovalProcessDefinition approvalProcessDefinition; 
            private java.util.List<ApprovalTasks> approvalTasks; 
            private String authErrorMessage; 
            private String id; 
            private String reason; 
            private Object startTime; 
            private String status; 
            private String title; 

            private Builder() {
            } 

            private Builder(ProcessInstance model) {
                this.applicator = model.applicator;
                this.applicatorName = model.applicatorName;
                this.approvalProcessDefinition = model.approvalProcessDefinition;
                this.approvalTasks = model.approvalTasks;
                this.authErrorMessage = model.authErrorMessage;
                this.id = model.id;
                this.reason = model.reason;
                this.startTime = model.startTime;
                this.status = model.status;
                this.title = model.title;
            } 

            /**
             * Applicator.
             */
            public Builder applicator(String applicator) {
                this.applicator = applicator;
                return this;
            }

            /**
             * ApplicatorName.
             */
            public Builder applicatorName(String applicatorName) {
                this.applicatorName = applicatorName;
                return this;
            }

            /**
             * ApprovalProcessDefinition.
             */
            public Builder approvalProcessDefinition(ApprovalProcessDefinition approvalProcessDefinition) {
                this.approvalProcessDefinition = approvalProcessDefinition;
                return this;
            }

            /**
             * ApprovalTasks.
             */
            public Builder approvalTasks(java.util.List<ApprovalTasks> approvalTasks) {
                this.approvalTasks = approvalTasks;
                return this;
            }

            /**
             * AuthErrorMessage.
             */
            public Builder authErrorMessage(String authErrorMessage) {
                this.authErrorMessage = authErrorMessage;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Object startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public ProcessInstance build() {
                return new ProcessInstance(this);
            } 

        } 

    }
}
