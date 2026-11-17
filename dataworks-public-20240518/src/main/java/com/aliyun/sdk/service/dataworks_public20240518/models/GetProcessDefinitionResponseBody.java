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
         * <p>The process definition.</p>
         */
        public Builder processDefinition(ProcessDefinition processDefinition) {
            this.processDefinition = processDefinition;
            return this;
        }

        /**
         * <p>The API request ID.</p>
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
             * <p><strong>The type of approver for the node</strong>. Valid values:</p>
             * <ul>
             * <li>DataWorksProjectRole: Workspace role.</li>
             * <li>DataWorksProjectMember: Workspace member.</li>
             * <li>TableAdministrator: Table owner.</li>
             * <li>TableOrProjectAdministrator: Table or workspace administrator.</li>
             * <li>AliyunResourceOwner: Alibaba Cloud account.</li>
             * <li>MaxComputeRole: MaxCompute administrator.</li>
             * <li>DLFAdmin: DLF legacy administrator.</li>
             * <li>DLFNextAdmin: DLFNext administrator.</li>
             * <li>TenantRole: Tenant role.</li>
             * <li>EmrAdministrator: EMR administrator.</li>
             * <li>LindormAdministrator: Lindorm administrator.</li>
             * <li>AliyunRamUser: RAM user.</li>
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
             * <p><strong>The semantics vary based on the <code>AccountType</code> value</strong>:</p>
             * <ul>
             * <li>DataWorksProjectMember: Specifies the user ID of the workspace member.</li>
             * <li>DataWorksProjectRole: Specifies the code of the workspace role.</li>
             * <li>MaxComputeRole: Specifies the MaxCompute role.</li>
             * <li>TenantRole: Specifies the code of the tenant role.</li>
             * <li>AliyunRamUser: Specifies the RAM user ID.</li>
             * </ul>
             */
            public Builder assignees(java.util.List<String> assignees) {
                this.assignees = assignees;
                return this;
            }

            /**
             * <p>The additional declarations required for different <code>AccountType</code> values:</p>
             * <ul>
             * <li>DataWorksProjectMember: The key is <code>projectId</code>, and the value is the user ID of the workspace member. Separate multiple values with commas.</li>
             * <li>MaxComputeRole: The key is the MaxCompute project, and the value is the role name in MaxCompute. Separate multiple values with commas.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;449656&quot;: &quot;role_project_admin,role_project_pe&quot;}</p>
             */
            public Builder extensionProperties(java.util.Map<String, ?> extensionProperties) {
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
             * <p><strong>The node name.</strong></p>
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
             * <p>The notification channel. Valid values:</p>
             * <ul>
             * <li>Mail</li>
             * <li>Sms</li>
             * <li>DingRobot</li>
             * <li>Weixin</li>
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
             * <p>The extended information in JSON format, such as <code>{&quot;atAll&quot;:&quot;true&quot;}</code>, which specifies whether to mention all members.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;atAll&quot;:&quot;true&quot;}</p>
             */
            public Builder extension(String extension) {
                this.extension = extension;
                return this;
            }

            /**
             * <p>The receiver. If <code>Channel</code> is set to <code>DingRobot</code> or <code>Weixin</code>, you must specify <code>WebhookUrl</code>.</p>
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
             * <p>The conditional expression in the <code>((#type==\\&quot;typeValue\\&quot;))</code> format, such as <code>((#odpsProject==\\&quot;PX_BEIJING_TEST\\&quot;))</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>((#odpsProject==\&quot;PX_BEIJING_TEST\&quot;))</p>
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * <p>The effective stage of the rule. Valid values:</p>
             * <ul>
             * <li><code>Deployment</code>: Used to determine whether the approval policy is matched when an application is submitted.</li>
             * <li><code>Running</code>: Used to determine whether to skip approval while the approval process runs. This value is supported only for the MaxCompute type.</li>
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
             * <p>The condition type. Valid values:</p>
             * <ul>
             * <li><code>odpsProject</code> </li>
             * <li><code>hologresInstanceId</code></li>
             * <li><code>sensibleLevel</code> </li>
             * <li><code>tableGuid</code> </li>
             * <li><code>projectId</code></li>
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
             * <p>The list of approval nodes.</p>
             */
            public Builder approvalNodes(java.util.List<ApprovalNodes> approvalNodes) {
                this.approvalNodes = approvalNodes;
                return this;
            }

            /**
             * <p>The description of the business process.</p>
             * 
             * <strong>example:</strong>
             * <p>Order business data approval process</p>
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
             * <p>The process definition ID.</p>
             * 
             * <strong>example:</strong>
             * <p>210001039767</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Indicates whether the policy is the default system policy.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isSystem(Boolean isSystem) {
                this.isSystem = isSystem;
                return this;
            }

            /**
             * <p>The name of the process definition.</p>
             * 
             * <strong>example:</strong>
             * <p>MaxCompute table approval</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The notification service configurations.</p>
             */
            public Builder notificationServices(java.util.List<NotificationServices> notificationServices) {
                this.notificationServices = notificationServices;
                return this;
            }

            /**
             * <p>The list of effective rules for the approval policy.</p>
             */
            public Builder ruleConditions(java.util.List<RuleConditions> ruleConditions) {
                this.ruleConditions = ruleConditions;
                return this;
            }

            /**
             * <p>The subtype. Valid values:</p>
             * <ul>
             * <li>Table</li>
             * <li>Column</li>
             * <li>Database</li>
             * <li>Schema</li>
             * <li>Default</li>
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
             * <p>The process definition type. Valid values:</p>
             * <ul>
             * <li>MaxCompute</li>
             * <li>DataService</li>
             * <li>Extension</li>
             * <li>Hologres</li>
             * <li>DlfV1: Custom creation is not supported.</li>
             * <li>Emr: Custom creation is not supported.</li>
             * <li>DataAssetGovernance: Custom creation is not supported.</li>
             * <li>Lindorm: Custom creation is not supported.</li>
             * <li>StarRocks: Custom creation is not supported.</li>
             * <li>DlfNext: Custom creation is not supported.</li>
             * <li>DataWorks: Custom creation is not supported.</li>
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
