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
 * {@link UpdateProcessDefinitionRequest} extends {@link RequestModel}
 *
 * <p>UpdateProcessDefinitionRequest</p>
 */
public class UpdateProcessDefinitionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApprovalNodes")
    private java.util.List<ApprovalNodes> approvalNodes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NotificationServices")
    private java.util.List<NotificationServices> notificationServices;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RuleConditions")
    private java.util.List<RuleConditions> ruleConditions;

    private UpdateProcessDefinitionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.approvalNodes = builder.approvalNodes;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.id = builder.id;
        this.name = builder.name;
        this.notificationServices = builder.notificationServices;
        this.ruleConditions = builder.ruleConditions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateProcessDefinitionRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateProcessDefinitionRequest, Builder> {
        private String regionId; 
        private java.util.List<ApprovalNodes> approvalNodes; 
        private String clientToken; 
        private String description; 
        private String id; 
        private String name; 
        private java.util.List<NotificationServices> notificationServices; 
        private java.util.List<RuleConditions> ruleConditions; 

        private Builder() {
            super();
        } 

        private Builder(UpdateProcessDefinitionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.approvalNodes = request.approvalNodes;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.id = request.id;
            this.name = request.name;
            this.notificationServices = request.notificationServices;
            this.ruleConditions = request.ruleConditions;
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
         * <p>A list of approval nodes. This parameter does not apply to system policies.</p>
         */
        public Builder approvalNodes(java.util.List<ApprovalNodes> approvalNodes) {
            String approvalNodesShrink = shrink(approvalNodes, "ApprovalNodes", "json");
            this.putBodyParameter("ApprovalNodes", approvalNodesShrink);
            this.approvalNodes = approvalNodes;
            return this;
        }

        /**
         * <p>An idempotent parameter. It ensures that retried requests do not result in duplicate operations.</p>
         * 
         * <strong>example:</strong>
         * <p>1AFAE64E-D1BE-432B-A9****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The description of the process definition.</p>
         * 
         * <strong>example:</strong>
         * <p>lwt_ide_simple 项目 MaxCompute 表审批策略</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the process definition.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>177554881536128</p>
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The name of the process definition.</p>
         * 
         * <strong>example:</strong>
         * <p>MaxCompute 表审批</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The notification service configurations.</p>
         */
        public Builder notificationServices(java.util.List<NotificationServices> notificationServices) {
            String notificationServicesShrink = shrink(notificationServices, "NotificationServices", "json");
            this.putBodyParameter("NotificationServices", notificationServicesShrink);
            this.notificationServices = notificationServices;
            return this;
        }

        /**
         * <p>A list of rule conditions. This parameter does not apply to system policies.</p>
         */
        public Builder ruleConditions(java.util.List<RuleConditions> ruleConditions) {
            String ruleConditionsShrink = shrink(ruleConditions, "RuleConditions", "json");
            this.putBodyParameter("RuleConditions", ruleConditionsShrink);
            this.ruleConditions = ruleConditions;
            return this;
        }

        @Override
        public UpdateProcessDefinitionRequest build() {
            return new UpdateProcessDefinitionRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateProcessDefinitionRequest} extends {@link TeaModel}
     *
     * <p>UpdateProcessDefinitionRequest</p>
     */
    public static class ApprovalNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountType")
        private String accountType;

        @com.aliyun.core.annotation.NameInMap("Assignees")
        private String assignees;

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
        public String getAssignees() {
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
            private String assignees; 
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
             * <p>The approver type for the node. Valid values:</p>
             * <ul>
             * <li><p><code>DataWorksProjectRole</code>: A workspace role.</p>
             * </li>
             * <li><p><code>DataWorksProjectMember</code>: A workspace member.</p>
             * </li>
             * <li><p><code>TableAdministrator</code>: A table administrator.</p>
             * </li>
             * <li><p><code>TableOrProjectAdministrator</code>: The administrator of the table or project.</p>
             * </li>
             * <li><p><code>AliyunResourceOwner</code>: An Alibaba Cloud account.</p>
             * </li>
             * <li><p><code>MaxComputeRole</code>: A MaxCompute administrator.</p>
             * </li>
             * <li><p><code>DLFAdmin</code>: A DlfLegacy administrator.</p>
             * </li>
             * <li><p><code>DLFNextAdmin</code>: A DLFNext administrator.</p>
             * </li>
             * <li><p><code>TenantRole</code>: A tenant role.</p>
             * </li>
             * <li><p><code>EmrAdministrator</code>: An EMR administrator.</p>
             * </li>
             * <li><p><code>LindormAdministrator</code>: A Lindorm administrator.</p>
             * </li>
             * <li><p><code>AliyunRamUser</code>: A RAM user.</p>
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
             * <p>Specifies the approvers. The required value depends on the <code>AccountType</code>:</p>
             * <ul>
             * <li><p>If <code>AccountType</code> is <code>DataWorksProjectMember</code>, this parameter specifies the user IDs of workspace members.</p>
             * </li>
             * <li><p>If <code>AccountType</code> is <code>DataWorksProjectRole</code>, this parameter specifies the codes of workspace roles.</p>
             * </li>
             * <li><p>If <code>AccountType</code> is <code>MaxComputeRole</code>, this parameter specifies the MaxCompute roles.</p>
             * </li>
             * <li><p>If <code>AccountType</code> is <code>TenantRole</code>, this parameter specifies the codes of tenant roles.</p>
             * </li>
             * <li><p>If <code>AccountType</code> is <code>AliyunRamUser</code>, this parameter specifies the user IDs of RAM users.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DataWorksProjectMember</p>
             */
            public Builder assignees(String assignees) {
                this.assignees = assignees;
                return this;
            }

            /**
             * <p>Additional properties that are required for specific <code>AccountType</code> values:</p>
             * <ul>
             * <li><p>If <code>AccountType</code> is <code>DataWorksProjectMember</code>: The key is <code>projectId</code> and the value is the user ID of a workspace member. Use commas (,) to separate multiple user IDs.</p>
             * </li>
             * <li><p>If <code>AccountType</code> is <code>MaxComputeRole</code>: The key is the MaxCompute project name and the value is the role name in MaxCompute. Use commas (,) to separate multiple role names.</p>
             * </li>
             * </ul>
             */
            public Builder extensionProperties(java.util.Map<String, ?> extensionProperties) {
                this.extensionProperties = extensionProperties;
                return this;
            }

            /**
             * <p>The name of the node.</p>
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
     * {@link UpdateProcessDefinitionRequest} extends {@link TeaModel}
     *
     * <p>UpdateProcessDefinitionRequest</p>
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
             * <p>Mail</p>
             */
            public Builder channel(String channel) {
                this.channel = channel;
                return this;
            }

            /**
             * <p>Additional information in JSON format. For example, use {&quot;atAll&quot;:&quot;true&quot;} to specify whether to notify all members.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;atAll&quot;:&quot;true&quot;}</p>
             */
            public Builder extension(String extension) {
                this.extension = extension;
                return this;
            }

            /**
             * <p>The webhook URL. This parameter is required when <code>Channel</code> is set to <code>DingRobot</code> or <code>Weixin</code>.</p>
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
     * {@link UpdateProcessDefinitionRequest} extends {@link TeaModel}
     *
     * <p>UpdateProcessDefinitionRequest</p>
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
             * <p>The conditional expression. Format: ((#type==\&quot;typeValue\&quot;)). For example: ((#odpsProject==\&quot;PX_BEIJING_TEST\&quot;)).</p>
             * 
             * <strong>example:</strong>
             * <p>((#odpsProject==\&quot;PX_BEIJING_TEST\&quot;))</p>
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * <p>The phase in which the rule takes effect. Valid values:</p>
             * <ul>
             * <li><p><strong>Deployment</strong>: Determines whether the approval policy applies when an application is submitted.</p>
             * </li>
             * <li><p><strong>Running</strong>: Determines whether to skip the approval during the approval process. This phase is supported only for MaxCompute.</p>
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
             * <p>The type of the condition. Valid values:</p>
             * <ul>
             * <li><p><code>odpsProject</code></p>
             * </li>
             * <li><p><code>hologresInstanceId</code></p>
             * </li>
             * <li><p><code>sensibleLevel</code></p>
             * </li>
             * <li><p><code>tableGuid</code></p>
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
}
