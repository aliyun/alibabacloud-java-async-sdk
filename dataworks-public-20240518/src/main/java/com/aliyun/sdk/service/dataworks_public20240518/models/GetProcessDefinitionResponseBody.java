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
         * ProcessDefinition.
         */
        public Builder processDefinition(ProcessDefinition processDefinition) {
            this.processDefinition = processDefinition;
            return this;
        }

        /**
         * RequestId.
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
            public Builder extensionProperties(java.util.Map<String, ?> extensionProperties) {
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
             * IsSystem.
             */
            public Builder isSystem(Boolean isSystem) {
                this.isSystem = isSystem;
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

            public ProcessDefinition build() {
                return new ProcessDefinition(this);
            } 

        } 

    }
}
