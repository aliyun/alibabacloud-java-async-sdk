// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetConversationalAutomationResponseBody} extends {@link TeaModel}
 *
 * <p>GetConversationalAutomationResponseBody</p>
 */
public class GetConversationalAutomationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetConversationalAutomationResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConversationalAutomationResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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

        public GetConversationalAutomationResponseBody build() {
            return new GetConversationalAutomationResponseBody(this);
        } 

    } 

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
             * CommandDescription.
             */
            public Builder commandDescription(String commandDescription) {
                this.commandDescription = commandDescription;
                return this;
            }

            /**
             * CommandName.
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
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Commands")
        private java.util.List < Commands> commands;

        @com.aliyun.core.annotation.NameInMap("EnableWelcomeMessage")
        private Boolean enableWelcomeMessage;

        @com.aliyun.core.annotation.NameInMap("PhoneNumber")
        private String phoneNumber;

        @com.aliyun.core.annotation.NameInMap("Prompts")
        private java.util.List < String > prompts;

        private Data(Builder builder) {
            this.commands = builder.commands;
            this.enableWelcomeMessage = builder.enableWelcomeMessage;
            this.phoneNumber = builder.phoneNumber;
            this.prompts = builder.prompts;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return commands
         */
        public java.util.List < Commands> getCommands() {
            return this.commands;
        }

        /**
         * @return enableWelcomeMessage
         */
        public Boolean getEnableWelcomeMessage() {
            return this.enableWelcomeMessage;
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

        public static final class Builder {
            private java.util.List < Commands> commands; 
            private Boolean enableWelcomeMessage; 
            private String phoneNumber; 
            private java.util.List < String > prompts; 

            /**
             * Commands.
             */
            public Builder commands(java.util.List < Commands> commands) {
                this.commands = commands;
                return this;
            }

            /**
             * EnableWelcomeMessage.
             */
            public Builder enableWelcomeMessage(Boolean enableWelcomeMessage) {
                this.enableWelcomeMessage = enableWelcomeMessage;
                return this;
            }

            /**
             * PhoneNumber.
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * Prompts.
             */
            public Builder prompts(java.util.List < String > prompts) {
                this.prompts = prompts;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
