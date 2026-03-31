// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

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
 * {@link GetChatConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>GetChatConfigurationResponseBody</p>
 */
public class GetChatConfigurationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChatConfiguration")
    private ChatConfiguration chatConfiguration;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetChatConfigurationResponseBody(Builder builder) {
        this.chatConfiguration = builder.chatConfiguration;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetChatConfigurationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chatConfiguration
     */
    public ChatConfiguration getChatConfiguration() {
        return this.chatConfiguration;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ChatConfiguration chatConfiguration; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetChatConfigurationResponseBody model) {
            this.chatConfiguration = model.chatConfiguration;
            this.requestId = model.requestId;
        } 

        /**
         * ChatConfiguration.
         */
        public Builder chatConfiguration(ChatConfiguration chatConfiguration) {
            this.chatConfiguration = chatConfiguration;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetChatConfigurationResponseBody build() {
            return new GetChatConfigurationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetChatConfigurationResponseBody} extends {@link TeaModel}
     *
     * <p>GetChatConfigurationResponseBody</p>
     */
    public static class ChatConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Configuration")
        private String configuration;

        @com.aliyun.core.annotation.NameInMap("CreatedDate")
        private String createdDate;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Outputs")
        private String outputs;

        @com.aliyun.core.annotation.NameInMap("RamRole")
        private String ramRole;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UpdatedDate")
        private String updatedDate;

        private ChatConfiguration(Builder builder) {
            this.configuration = builder.configuration;
            this.createdDate = builder.createdDate;
            this.name = builder.name;
            this.outputs = builder.outputs;
            this.ramRole = builder.ramRole;
            this.resourceGroupId = builder.resourceGroupId;
            this.type = builder.type;
            this.updatedDate = builder.updatedDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChatConfiguration create() {
            return builder().build();
        }

        /**
         * @return configuration
         */
        public String getConfiguration() {
            return this.configuration;
        }

        /**
         * @return createdDate
         */
        public String getCreatedDate() {
            return this.createdDate;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return outputs
         */
        public String getOutputs() {
            return this.outputs;
        }

        /**
         * @return ramRole
         */
        public String getRamRole() {
            return this.ramRole;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return updatedDate
         */
        public String getUpdatedDate() {
            return this.updatedDate;
        }

        public static final class Builder {
            private String configuration; 
            private String createdDate; 
            private String name; 
            private String outputs; 
            private String ramRole; 
            private String resourceGroupId; 
            private String type; 
            private String updatedDate; 

            private Builder() {
            } 

            private Builder(ChatConfiguration model) {
                this.configuration = model.configuration;
                this.createdDate = model.createdDate;
                this.name = model.name;
                this.outputs = model.outputs;
                this.ramRole = model.ramRole;
                this.resourceGroupId = model.resourceGroupId;
                this.type = model.type;
                this.updatedDate = model.updatedDate;
            } 

            /**
             * Configuration.
             */
            public Builder configuration(String configuration) {
                this.configuration = configuration;
                return this;
            }

            /**
             * CreatedDate.
             */
            public Builder createdDate(String createdDate) {
                this.createdDate = createdDate;
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
             * Outputs.
             */
            public Builder outputs(String outputs) {
                this.outputs = outputs;
                return this;
            }

            /**
             * RamRole.
             */
            public Builder ramRole(String ramRole) {
                this.ramRole = ramRole;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * UpdatedDate.
             */
            public Builder updatedDate(String updatedDate) {
                this.updatedDate = updatedDate;
                return this;
            }

            public ChatConfiguration build() {
                return new ChatConfiguration(this);
            } 

        } 

    }
}
