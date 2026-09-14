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
         * <p>Details of the approval process instance.</p>
         */
        public Builder processInstance(ProcessInstance processInstance) {
            this.processInstance = processInstance;
            return this;
        }

        /**
         * <p>The request ID. Use this ID to locate logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>0bc5df3a17****903790e8e8a</p>
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
             * <p>The type of the approver for the node. Valid values:</p>
             * <ul>
             * <li><p><code>DataWorksProjectRole</code>: A workspace role</p>
             * </li>
             * <li><p><code>DataWorksProjectMember</code>: A workspace member</p>
             * </li>
             * <li><p><code>TableAdministrator</code>: A table administrator</p>
             * </li>
             * <li><p><code>TableOrProjectAdministrator</code>: A table or workspace administrator</p>
             * </li>
             * <li><p><code>AliyunResourceOwner</code>: An Alibaba Cloud account</p>
             * </li>
             * <li><p><code>MaxComputeRole</code>: A MaxCompute role</p>
             * </li>
             * <li><p><code>DLFAdmin</code>: A DlfLegacy administrator</p>
             * </li>
             * <li><p><code>DLFNextAdmin</code>: A DLFNext administrator</p>
             * </li>
             * <li><p><code>TenantRole</code>: A tenant role</p>
             * </li>
             * <li><p><code>EmrAdministrator</code>: An Emr administrator</p>
             * </li>
             * <li><p><code>LindormAdministrator</code>: A Lindorm administrator</p>
             * </li>
             * <li><p><code>AliyunRamUser</code>: A RAM user</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DataWorksProjectRole</p>
             */
            public Builder accountType(String accountType) {
                this.accountType = accountType;
                return this;
            }

            /**
             * <p>The specified approvers.</p>
             * <p>The contents of this parameter depend on the <code>AccountType</code> value:</p>
             * <ul>
             * <li><p>If <code>AccountType</code> is <code>DataWorksProjectMember</code>, this parameter contains the user IDs of workspace members.</p>
             * </li>
             * <li><p>If <code>AccountType</code> is <code>DataWorksProjectRole</code>, this parameter contains the codes of workspace roles.</p>
             * </li>
             * <li><p>If <code>AccountType</code> is <code>MaxComputeRole</code>, this parameter contains the MaxCompute roles.</p>
             * </li>
             * <li><p>If <code>AccountType</code> is <code>TenantRole</code>, this parameter contains the codes of tenant roles.</p>
             * </li>
             * <li><p>If <code>AccountType</code> is <code>AliyunRamUser</code>, this parameter contains the user IDs of RAM users.</p>
             * </li>
             * </ul>
             */
            public Builder assignees(java.util.List<String> assignees) {
                this.assignees = assignees;
                return this;
            }

            /**
             * <p>The extended description of the approval node.</p>
             * 
             * <strong>example:</strong>
             * <p>none</p>
             */
            public Builder extensionProperties(String extensionProperties) {
                this.extensionProperties = extensionProperties;
                return this;
            }

            /**
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>7a809b6a-2a62-4c6c-9c23-c2a145e3877d</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The node name.</p>
             * 
             * <strong>example:</strong>
             * <p>default-name</p>
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
             * <p>The notification channel. Valid values:</p>
             * <ul>
             * <li><p><code>Mail</code></p>
             * </li>
             * <li><p><code>Sms</code></p>
             * </li>
             * <li><p><code>DingRobot</code></p>
             * </li>
             * <li><p><code>Weixin</code></p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Mail</p>
             */
            public Builder channel(String channel) {
                this.channel = channel;
                return this;
            }

            /**
             * <p>Additional information in JSON format. For example, <code>{&quot;atAll&quot;:&quot;true&quot;}</code> indicates whether to @all members.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;atAll&quot;:&quot;true&quot;}</p>
             */
            public Builder extension(String extension) {
                this.extension = extension;
                return this;
            }

            /**
             * <p>If <code>Channel</code> is set to <code>DingRobot</code> or <code>Weixin</code>, the value of this parameter must be the webhook URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://dingtalk">https://dingtalk</a></p>
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
             * <p>The expression of the rule condition. Format: <code>((#type==\\&quot;typeValue\\&quot;))</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>((#odpsProject==\&quot;PX_BEIJING_TEST\&quot;))</p>
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * <p>The rule scope. Valid values:</p>
             * <ul>
             * <li><p><code>Deployment</code>: Determines whether the policy applies when a request is submitted.</p>
             * </li>
             * <li><p><code>Running</code>: Determines whether to skip approval while the process instance runs. This value is supported only for MaxCompute approval policies.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Deployment</p>
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * <p>The type of the rule condition. Valid values:</p>
             * <ul>
             * <li><p><code>odpsProject</code>: Applies to a specific MaxCompute project.</p>
             * </li>
             * <li><p><code>hologresInstanceId</code>: Applies to a specific Hologres instance.</p>
             * </li>
             * <li><p><code>sensibleLevel</code>: Applies to a specific security level.</p>
             * </li>
             * <li><p><code>tableGuid</code>: Applies to a specific table.</p>
             * </li>
             * <li><p><code>projectId</code>: Applies to a specific workspace.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>odpsProject</p>
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
             * <p>The approval nodes.</p>
             */
            public Builder approvalNodes(java.util.List<ApprovalNodes> approvalNodes) {
                this.approvalNodes = approvalNodes;
                return this;
            }

            /**
             * <p>The description of the approval policy.</p>
             * 
             * <strong>example:</strong>
             * <p>流程定义描述</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether the policy is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The approval policy ID.</p>
             * 
             * <strong>example:</strong>
             * <p>323861511451222099</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the approval policy.</p>
             * 
             * <strong>example:</strong>
             * <p>SYSTEM_GENERATE_DEFAULT</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The notification services.</p>
             */
            public Builder notificationServices(java.util.List<NotificationServices> notificationServices) {
                this.notificationServices = notificationServices;
                return this;
            }

            /**
             * <p>The rules that determine when the approval policy takes effect.</p>
             */
            public Builder ruleConditions(java.util.List<RuleConditions> ruleConditions) {
                this.ruleConditions = ruleConditions;
                return this;
            }

            /**
             * <p>The subtype of the approval policy. Valid values:</p>
             * <ul>
             * <li><p><code>Table</code></p>
             * </li>
             * <li><p><code>Column</code></p>
             * </li>
             * <li><p><code>Database</code></p>
             * </li>
             * <li><p><code>Schema</code></p>
             * </li>
             * <li><p><code>Default</code></p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Table</p>
             */
            public Builder subType(String subType) {
                this.subType = subType;
                return this;
            }

            /**
             * <p>The type of the approval policy. Valid values:</p>
             * <ul>
             * <li><p><code>MaxCompute</code></p>
             * </li>
             * <li><p><code>DataService</code></p>
             * </li>
             * <li><p><code>DlfV1</code> (Custom creation is not supported)</p>
             * </li>
             * <li><p><code>Extension</code></p>
             * </li>
             * <li><p><code>Hologres</code></p>
             * </li>
             * <li><p><code>Emr</code> (Custom creation is not supported)</p>
             * </li>
             * <li><p><code>DataAssetGovernance</code> (Custom creation is not supported)</p>
             * </li>
             * <li><p><code>Lindorm</code> (Custom creation is not supported)</p>
             * </li>
             * <li><p><code>StarRocks</code> (Custom creation is not supported)</p>
             * </li>
             * <li><p><code>DlfNext</code> (Custom creation is not supported)</p>
             * </li>
             * <li><p><code>DataWorks</code> (Custom creation is not supported)</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>MaxCompute</p>
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
             * <p>The type of the approver for the node. Valid values:</p>
             * <ul>
             * <li><p><code>DataWorksProjectRole</code>: A workspace role</p>
             * </li>
             * <li><p><code>DataWorksProjectMember</code>: A workspace member</p>
             * </li>
             * <li><p><code>TableAdministrator</code>: A table administrator</p>
             * </li>
             * <li><p><code>TableOrProjectAdministrator</code>: A table or workspace administrator</p>
             * </li>
             * <li><p><code>AliyunResourceOwner</code>: An Alibaba Cloud account</p>
             * </li>
             * <li><p><code>MaxComputeRole</code>: A MaxCompute role</p>
             * </li>
             * <li><p><code>DLFAdmin</code>: A DlfLegacy administrator</p>
             * </li>
             * <li><p><code>DLFNextAdmin</code>: A DLFNext administrator</p>
             * </li>
             * <li><p><code>TenantRole</code>: A tenant role</p>
             * </li>
             * <li><p><code>EmrAdministrator</code>: An Emr administrator</p>
             * </li>
             * <li><p><code>LindormAdministrator</code>: A Lindorm administrator</p>
             * </li>
             * <li><p><code>AliyunRamUser</code>: A RAM user</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DataWorksProjectRole</p>
             */
            public Builder accountType(String accountType) {
                this.accountType = accountType;
                return this;
            }

            /**
             * <p>The specified approvers.</p>
             * <p>The contents of this parameter depend on the <code>AccountType</code> value:</p>
             * <ul>
             * <li><p>If <code>AccountType</code> is <code>DataWorksProjectMember</code>, this parameter contains the user IDs of workspace members.</p>
             * </li>
             * <li><p>If <code>AccountType</code> is <code>DataWorksProjectRole</code>, this parameter contains the codes of workspace roles.</p>
             * </li>
             * <li><p>If <code>AccountType</code> is <code>MaxComputeRole</code>, this parameter contains the MaxCompute roles.</p>
             * </li>
             * <li><p>If <code>AccountType</code> is <code>TenantRole</code>, this parameter contains the codes of tenant roles.</p>
             * </li>
             * <li><p>If <code>AccountType</code> is <code>AliyunRamUser</code>, this parameter contains the user IDs of RAM users.</p>
             * </li>
             * </ul>
             */
            public Builder assignees(java.util.List<String> assignees) {
                this.assignees = assignees;
                return this;
            }

            /**
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>7a809b6a-2a62-4c6c-9c23-c2a145e3877d</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The node name.</p>
             * 
             * <strong>example:</strong>
             * <p>default-name</p>
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
             * <p>The name of the approver.</p>
             * 
             * <strong>example:</strong>
             * <p>李四</p>
             */
            public Builder memberName(String memberName) {
                this.memberName = memberName;
                return this;
            }

            /**
             * <p>The user ID of the approver.</p>
             * 
             * <strong>example:</strong>
             * <p>207947397776614297</p>
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
             * <p>The approval comment.</p>
             * 
             * <strong>example:</strong>
             * <p>同意</p>
             */
            public Builder approvalComment(String approvalComment) {
                this.approvalComment = approvalComment;
                return this;
            }

            /**
             * <p>The approval decision. Valid values:</p>
             * <ul>
             * <li><p><code>Agree</code></p>
             * </li>
             * <li><p><code>Deny</code></p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Deny</p>
             */
            public Builder approvalDecision(String approvalDecision) {
                this.approvalDecision = approvalDecision;
                return this;
            }

            /**
             * <p>The approval node from the corresponding approval policy.</p>
             */
            public Builder approvalNode(ApprovalNode approvalNode) {
                this.approvalNode = approvalNode;
                return this;
            }

            /**
             * <p>The user ID of the actual approver.</p>
             * 
             * <strong>example:</strong>
             * <p>207947399706614297</p>
             */
            public Builder assignee(String assignee) {
                this.assignee = assignee;
                return this;
            }

            /**
             * <p>The name of the actual approver.</p>
             * 
             * <strong>example:</strong>
             * <p>李四</p>
             */
            public Builder assigneeName(String assigneeName) {
                this.assigneeName = assigneeName;
                return this;
            }

            /**
             * <p>The time when the task was completed.</p>
             * 
             * <strong>example:</strong>
             * <p>1715590800000</p>
             */
            public Builder completeTime(Long completeTime) {
                this.completeTime = completeTime;
                return this;
            }

            /**
             * <p>The time when the task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1715587200000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The approval task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>task_001</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The status of the task. Valid values:</p>
             * <ul>
             * <li><p><code>Completed</code>: The task is complete.</p>
             * </li>
             * <li><p><code>Pending</code>: The task is pending.</p>
             * </li>
             * <li><p><code>Aborted</code>: The task is aborted.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Aborted</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The candidate approvers for the task.</p>
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
             * <p>The user ID of the applicant.</p>
             * 
             * <strong>example:</strong>
             * <p>1107558004253538</p>
             */
            public Builder applicator(String applicator) {
                this.applicator = applicator;
                return this;
            }

            /**
             * <p>The username of the applicant\&quot;s Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>test_account</p>
             */
            public Builder applicatorName(String applicatorName) {
                this.applicatorName = applicatorName;
                return this;
            }

            /**
             * <p>The approval policy applied to this process instance.</p>
             */
            public Builder approvalProcessDefinition(ApprovalProcessDefinition approvalProcessDefinition) {
                this.approvalProcessDefinition = approvalProcessDefinition;
                return this;
            }

            /**
             * <p>The approval tasks.</p>
             */
            public Builder approvalTasks(java.util.List<ApprovalTasks> approvalTasks) {
                this.approvalTasks = approvalTasks;
                return this;
            }

            /**
             * <p>The authorization failure message.</p>
             * <p><strong>Note</strong>: This parameter is returned only if the authorization fails.</p>
             * 
             * <strong>example:</strong>
             * <p>S-400007:ODPS acl auth failed. odps table acl auth failed</p>
             */
            public Builder authErrorMessage(String authErrorMessage) {
                this.authErrorMessage = authErrorMessage;
                return this;
            }

            /**
             * <p>The process instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>332066440109224007</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The reason for the request.</p>
             * 
             * <strong>example:</strong>
             * <p>业务需要</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The time when the approval process started.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-05-25 10:20:18 CST</p>
             */
            public Builder startTime(Object startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status of the process instance. Valid values:</p>
             * <ul>
             * <li><p><code>Completed</code>: The request is approved.</p>
             * </li>
             * <li><p><code>Running</code>: The request is in the approval process.</p>
             * </li>
             * <li><p><code>Aborted</code>: The request is withdrawn.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>completed</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The name of the process instance.</p>
             * 
             * <strong>example:</strong>
             * <p>MaxCompute表权限申请</p>
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
