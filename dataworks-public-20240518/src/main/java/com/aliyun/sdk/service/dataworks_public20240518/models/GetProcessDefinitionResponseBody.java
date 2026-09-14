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
 * {@link GetProcessDefinitionResponseBody} extends {@link TeaModel}
 *
 * <p>GetProcessDefinitionResponseBody</p>
 */
public class GetProcessDefinitionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ProcessDefinition")
    private ProcessDefinition processDefinition;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetProcessDefinitionResponseBody(Builder builder) {
        this.processDefinition = builder.processDefinition;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProcessDefinitionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return processDefinition
     */
    public ProcessDefinition getProcessDefinition() {
        return this.processDefinition;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ProcessDefinition processDefinition; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetProcessDefinitionResponseBody model) {
            this.processDefinition = model.processDefinition;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Process definition</p>
         */
        public Builder processDefinition(ProcessDefinition processDefinition) {
            this.processDefinition = processDefinition;
            return this;
        }

        /**
         * <p>API request ID</p>
         * 
         * <strong>example:</strong>
         * <p>0bc5df3a17***903790e8e8a</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetProcessDefinitionResponseBody build() {
            return new GetProcessDefinitionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetProcessDefinitionResponseBody} extends {@link TeaModel}
     *
     * <p>GetProcessDefinitionResponseBody</p>
     */
    public static class ApprovalNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountType")
        private String accountType;

        @com.aliyun.core.annotation.NameInMap("Assignees")
        private java.util.List<String> assignees;

        @com.aliyun.core.annotation.NameInMap("ExtensionProperties")
        private java.util.Map<String, ?> extensionProperties;

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
        public java.util.Map<String, ?> getExtensionProperties() {
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
            private java.util.Map<String, ?> extensionProperties; 
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
             * <p><strong>Node approver type</strong>:</p>
             * <ul>
             * <li><p>DataWorksProjectRole project role</p>
             * </li>
             * <li><p>DataWorksProjectMember project member</p>
             * </li>
             * <li><p>TableAdministrator table administrator</p>
             * </li>
             * <li><p>TableOrProjectAdministrator Table or project administrator</p>
             * </li>
             * <li><p>AliyunResourceOwner Alibaba Cloud account</p>
             * </li>
             * <li><p>MaxComputeRole MC Administrator</p>
             * </li>
             * <li><p>DLFAdmin and DlfLegacy administrator</p>
             * </li>
             * <li><p>DLFNext Administrator</p>
             * </li>
             * <li><p>TenantRole tenant role</p>
             * </li>
             * <li><p>EmrAdministrator Emr administrator</p>
             * </li>
             * <li><p>LindormAdministrator Lindorm Administrator</p>
             * </li>
             * <li><p>AliyunRamUser RAM user</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TableOrProjectAdministrator</p>
             */
            public Builder accountType(String accountType) {
                this.accountType = accountType;
                return this;
            }

            /**
             * <p><strong><code>AccountType</code> has different semantics for different types</strong>:</p>
             * <ul>
             * <li><p>DataWorksProjectMember specifies the project member\&quot;s UserId.</p>
             * </li>
             * <li><p>DataWorksProjectRole specifies the code of the project role.</p>
             * </li>
             * <li><p>MaxComputeRole specifies the MaxCompute role.</p>
             * </li>
             * <li><p>TenantRole specifies the tenant role code.</p>
             * </li>
             * <li><p>AliyunRamUser specifies the RAM user ID.</p>
             * </li>
             * </ul>
             */
            public Builder assignees(java.util.List<String> assignees) {
                this.assignees = assignees;
                return this;
            }

            /**
             * <p>When <code>AccountType </code>is set to different types, you must provide different additional declarations:</p>
             * <ul>
             * <li><p>DataWorksProjectMember: The key is projectId, and the value is the UserIds of project members, separated by commas.</p>
             * </li>
             * <li><p>MaxComputeRole: The key is a MaxCompute project and the value is a role name in MaxCompute. Multiple role names are separated by a comma.</p>
             * </li>
             * </ul>
             */
            public Builder extensionProperties(java.util.Map<String, ?> extensionProperties) {
                this.extensionProperties = extensionProperties;
                return this;
            }

            /**
             * <p>Node ID</p>
             * 
             * <strong>example:</strong>
             * <p>7a809b6a-2a62-4c6c-9c23-c2a145e3877d</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p><strong>Node Name</strong></p>
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
     * {@link GetProcessDefinitionResponseBody} extends {@link TeaModel}
     *
     * <p>GetProcessDefinitionResponseBody</p>
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
             * <p>Notification channel, an enumeration:</p>
             * <ul>
             * <li><p>Mail</p>
             * </li>
             * <li><p>Sms</p>
             * </li>
             * <li><p>DingRobot</p>
             * </li>
             * <li><p>Weixin</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DingRobot</p>
             */
            public Builder channel(String channel) {
                this.channel = channel;
                return this;
            }

            /**
             * <p>Additional information in JSON format, such as <code>{&quot;atAll&quot;:&quot;true&quot;}</code> to specify whether to @all members.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;atAll&quot;:&quot;true&quot;}</p>
             */
            public Builder extension(String extension) {
                this.extension = extension;
                return this;
            }

            /**
             * <p>You must specify WebhookUrl when Channel is DingRobot or Weixin.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://dingtalk.com">https://dingtalk.com</a></p>
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
     * {@link GetProcessDefinitionResponseBody} extends {@link TeaModel}
     *
     * <p>GetProcessDefinitionResponseBody</p>
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
             * <p>A conditional expression is in the format <code>((#type==\\&quot;typeValue\\&quot;))</code>, such as <code>((#odpsProject==\\&quot;PX_BEIJING_TEST\\&quot;))</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>((#odpsProject==\&quot;PX_BEIJING_TEST\&quot;))</p>
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * <p>rule effective stage:</p>
             * <ul>
             * <li><p><code>Deployment</code> determines whether an application matches this approval policy upon submission.</p>
             * </li>
             * <li><p><code>Running</code> is used to determine whether an approval process is approval-free. This feature is supported only for the MaxCompute type.</p>
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
             * <p>The condition type. This is an enumeration:</p>
             * <ul>
             * <li><p><code>odpsProject</code>,</p>
             * </li>
             * <li><p><code>hologresInstanceId</code></p>
             * </li>
             * <li><p><code>sensibleLevel</code>,</p>
             * </li>
             * <li><p><code>tableGuid</code>,</p>
             * </li>
             * <li><p><code>projectId</code></p>
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
     * {@link GetProcessDefinitionResponseBody} extends {@link TeaModel}
     *
     * <p>GetProcessDefinitionResponseBody</p>
     */
    public static class ProcessDefinition extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApprovalNodes")
        private java.util.List<ApprovalNodes> approvalNodes;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("IsSystem")
        private Boolean isSystem;

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

        private ProcessDefinition(Builder builder) {
            this.approvalNodes = builder.approvalNodes;
            this.description = builder.description;
            this.enabled = builder.enabled;
            this.id = builder.id;
            this.isSystem = builder.isSystem;
            this.name = builder.name;
            this.notificationServices = builder.notificationServices;
            this.ruleConditions = builder.ruleConditions;
            this.subType = builder.subType;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProcessDefinition create() {
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
         * @return isSystem
         */
        public Boolean getIsSystem() {
            return this.isSystem;
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
            private Boolean isSystem; 
            private String name; 
            private java.util.List<NotificationServices> notificationServices; 
            private java.util.List<RuleConditions> ruleConditions; 
            private String subType; 
            private String type; 

            private Builder() {
            } 

            private Builder(ProcessDefinition model) {
                this.approvalNodes = model.approvalNodes;
                this.description = model.description;
                this.enabled = model.enabled;
                this.id = model.id;
                this.isSystem = model.isSystem;
                this.name = model.name;
                this.notificationServices = model.notificationServices;
                this.ruleConditions = model.ruleConditions;
                this.subType = model.subType;
                this.type = model.type;
            } 

            /**
             * <p>Approval node list</p>
             */
            public Builder approvalNodes(java.util.List<ApprovalNodes> approvalNodes) {
                this.approvalNodes = approvalNodes;
                return this;
            }

            /**
             * <p>The description of the business process.</p>
             * 
             * <strong>example:</strong>
             * <p>订单业务数据审批流程</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Enable</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>Process definition ID</p>
             * 
             * <strong>example:</strong>
             * <p>210001039767</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>System Default Policy</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isSystem(Boolean isSystem) {
                this.isSystem = isSystem;
                return this;
            }

            /**
             * <p>Process definition name</p>
             * 
             * <strong>example:</strong>
             * <p>MaxCompute 表审批</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Notification Service Statement</p>
             */
            public Builder notificationServices(java.util.List<NotificationServices> notificationServices) {
                this.notificationServices = notificationServices;
                return this;
            }

            /**
             * <p>List of rule conditions</p>
             */
            public Builder ruleConditions(java.util.List<RuleConditions> ruleConditions) {
                this.ruleConditions = ruleConditions;
                return this;
            }

            /**
             * <p>Subtype:</p>
             * <ul>
             * <li><p>Table</p>
             * </li>
             * <li><p>Column</p>
             * </li>
             * <li><p>Database</p>
             * </li>
             * <li><p>Schema</p>
             * </li>
             * <li><p>Default</p>
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
             * <p>Process definition type. Valid values:</p>
             * <ul>
             * <li><p>MaxCompute</p>
             * </li>
             * <li><p>DataService</p>
             * </li>
             * <li><p>Extension</p>
             * </li>
             * <li><p>Hologres</p>
             * </li>
             * <li><p>DlfV1 (Custom creation not supported).</p>
             * </li>
             * <li><p>EMR (Custom creation not supported).</p>
             * </li>
             * <li><p>DataAssetGovernance (Custom creation not supported).</p>
             * </li>
             * <li><p>Lindorm (Custom creation not supported).</p>
             * </li>
             * <li><p>StarRocks (Custom creation not supported).</p>
             * </li>
             * <li><p>DlfNext (Custom creation not supported).</p>
             * </li>
             * <li><p>DataWorks (Custom creation not supported).</p>
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

            public ProcessDefinition build() {
                return new ProcessDefinition(this);
            } 

        } 

    }
}
