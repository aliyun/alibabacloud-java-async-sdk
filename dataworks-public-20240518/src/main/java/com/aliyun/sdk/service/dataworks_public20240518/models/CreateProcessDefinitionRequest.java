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
 * {@link CreateProcessDefinitionRequest} extends {@link RequestModel}
 *
 * <p>CreateProcessDefinitionRequest</p>
 */
public class CreateProcessDefinitionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApprovalNodes")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<ApprovalNodes> approvalNodes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(required = true)
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NotificationServices")
    private java.util.List<NotificationServices> notificationServices;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RuleConditions")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<RuleConditions> ruleConditions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SubType")
    private String subType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private CreateProcessDefinitionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.approvalNodes = builder.approvalNodes;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.enabled = builder.enabled;
        this.name = builder.name;
        this.notificationServices = builder.notificationServices;
        this.ruleConditions = builder.ruleConditions;
        this.subType = builder.subType;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProcessDefinitionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return approvalNodes
     */
    public java.util.List<ApprovalNodes> getApprovalNodes() {
        return this.approvalNodes;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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

    public static final class Builder extends Request.Builder<CreateProcessDefinitionRequest, Builder> {
        private String regionId; 
        private java.util.List<ApprovalNodes> approvalNodes; 
        private String clientToken; 
        private String description; 
        private Boolean enabled; 
        private String name; 
        private java.util.List<NotificationServices> notificationServices; 
        private java.util.List<RuleConditions> ruleConditions; 
        private String subType; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateProcessDefinitionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.approvalNodes = request.approvalNodes;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.enabled = request.enabled;
            this.name = request.name;
            this.notificationServices = request.notificationServices;
            this.ruleConditions = request.ruleConditions;
            this.subType = request.subType;
            this.type = request.type;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder approvalNodes(java.util.List<ApprovalNodes> approvalNodes) {
            String approvalNodesShrink = shrink(approvalNodes, "ApprovalNodes", "json");
            this.putBodyParameter("ApprovalNodes", approvalNodesShrink);
            this.approvalNodes = approvalNodes;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Enabled.
         */
        public Builder enabled(Boolean enabled) {
            this.putBodyParameter("Enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * NotificationServices.
         */
        public Builder notificationServices(java.util.List<NotificationServices> notificationServices) {
            String notificationServicesShrink = shrink(notificationServices, "NotificationServices", "json");
            this.putBodyParameter("NotificationServices", notificationServicesShrink);
            this.notificationServices = notificationServices;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder ruleConditions(java.util.List<RuleConditions> ruleConditions) {
            String ruleConditionsShrink = shrink(ruleConditions, "RuleConditions", "json");
            this.putBodyParameter("RuleConditions", ruleConditionsShrink);
            this.ruleConditions = ruleConditions;
            return this;
        }

        /**
         * SubType.
         */
        public Builder subType(String subType) {
            this.putBodyParameter("SubType", subType);
            this.subType = subType;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateProcessDefinitionRequest build() {
            return new CreateProcessDefinitionRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateProcessDefinitionRequest} extends {@link TeaModel}
     *
     * <p>CreateProcessDefinitionRequest</p>
     */
    public static class ApprovalNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountType")
        private String accountType;

        @com.aliyun.core.annotation.NameInMap("Assignees")
        private java.util.List<String> assignees;

        @com.aliyun.core.annotation.NameInMap("ExtensionProperties")
        private java.util.Map<String, ?> extensionProperties;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private ApprovalNodes(Builder builder) {
            this.accountType = builder.accountType;
            this.assignees = builder.assignees;
            this.extensionProperties = builder.extensionProperties;
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String accountType; 
            private java.util.List<String> assignees; 
            private java.util.Map<String, ?> extensionProperties; 
            private String name; 

            private Builder() {
            } 

            private Builder(ApprovalNodes model) {
                this.accountType = model.accountType;
                this.assignees = model.assignees;
                this.extensionProperties = model.extensionProperties;
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
             * <p>This parameter is required.</p>
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
     * {@link CreateProcessDefinitionRequest} extends {@link TeaModel}
     *
     * <p>CreateProcessDefinitionRequest</p>
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
     * {@link CreateProcessDefinitionRequest} extends {@link TeaModel}
     *
     * <p>CreateProcessDefinitionRequest</p>
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
}
