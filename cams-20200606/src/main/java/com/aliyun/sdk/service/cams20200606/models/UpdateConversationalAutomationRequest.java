// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateConversationalAutomationRequest} extends {@link RequestModel}
 *
 * <p>UpdateConversationalAutomationRequest</p>
 */
public class UpdateConversationalAutomationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Commands")
    private java.util.List < Commands> commands;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustSpaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String custSpaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableWelcomeMessage")
    private Boolean enableWelcomeMessage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String phoneNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Prompts")
    private java.util.List < String > prompts;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private UpdateConversationalAutomationRequest(Builder builder) {
        super(builder);
        this.commands = builder.commands;
        this.custSpaceId = builder.custSpaceId;
        this.enableWelcomeMessage = builder.enableWelcomeMessage;
        this.ownerId = builder.ownerId;
        this.phoneNumber = builder.phoneNumber;
        this.prompts = builder.prompts;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateConversationalAutomationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return commands
     */
    public java.util.List < Commands> getCommands() {
        return this.commands;
    }

    /**
     * @return custSpaceId
     */
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    /**
     * @return enableWelcomeMessage
     */
    public Boolean getEnableWelcomeMessage() {
        return this.enableWelcomeMessage;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * @return prompts
     */
    public java.util.List < String > getPrompts() {
        return this.prompts;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<UpdateConversationalAutomationRequest, Builder> {
        private java.util.List < Commands> commands; 
        private String custSpaceId; 
        private Boolean enableWelcomeMessage; 
        private Long ownerId; 
        private String phoneNumber; 
        private java.util.List < String > prompts; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateConversationalAutomationRequest request) {
            super(request);
            this.commands = request.commands;
            this.custSpaceId = request.custSpaceId;
            this.enableWelcomeMessage = request.enableWelcomeMessage;
            this.ownerId = request.ownerId;
            this.phoneNumber = request.phoneNumber;
            this.prompts = request.prompts;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The commands.</p>
         */
        public Builder commands(java.util.List < Commands> commands) {
            String commandsShrink = shrink(commands, "Commands", "json");
            this.putQueryParameter("Commands", commandsShrink);
            this.commands = commands;
            return this;
        }

        /**
         * <p>The space ID of the RAM user within the independent software vendor (ISV) account or the instance ID of the customer of Alibaba Cloud.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2993****</p>
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putQueryParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * <p>Specifies whether to enable the welcoming message.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableWelcomeMessage(Boolean enableWelcomeMessage) {
            this.putQueryParameter("EnableWelcomeMessage", enableWelcomeMessage);
            this.enableWelcomeMessage = enableWelcomeMessage;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The phone number of the enterprise.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>86130000***</p>
         */
        public Builder phoneNumber(String phoneNumber) {
            this.putQueryParameter("PhoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * <p>The opening remarks.</p>
         */
        public Builder prompts(java.util.List < String > prompts) {
            String promptsShrink = shrink(prompts, "Prompts", "json");
            this.putQueryParameter("Prompts", promptsShrink);
            this.prompts = prompts;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public UpdateConversationalAutomationRequest build() {
            return new UpdateConversationalAutomationRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateConversationalAutomationRequest} extends {@link TeaModel}
     *
     * <p>UpdateConversationalAutomationRequest</p>
     */
    public static class Commands extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommandDescription")
        private String commandDescription;

        @com.aliyun.core.annotation.NameInMap("CommandName")
        private String commandName;

        private Commands(Builder builder) {
            this.commandDescription = builder.commandDescription;
            this.commandName = builder.commandName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Commands create() {
            return builder().build();
        }

        /**
         * @return commandDescription
         */
        public String getCommandDescription() {
            return this.commandDescription;
        }

        /**
         * @return commandName
         */
        public String getCommandName() {
            return this.commandName;
        }

        public static final class Builder {
            private String commandDescription; 
            private String commandName; 

            /**
             * <p>The description of the command.</p>
             * 
             * <strong>example:</strong>
             * <p>Command 1.</p>
             */
            public Builder commandDescription(String commandDescription) {
                this.commandDescription = commandDescription;
                return this;
            }

            /**
             * <p>The command name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder commandName(String commandName) {
                this.commandName = commandName;
                return this;
            }

            public Commands build() {
                return new Commands(this);
            } 

        } 

    }
}
