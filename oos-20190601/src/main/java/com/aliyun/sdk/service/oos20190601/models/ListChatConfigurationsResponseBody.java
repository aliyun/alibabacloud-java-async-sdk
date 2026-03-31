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
 * {@link ListChatConfigurationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListChatConfigurationsResponseBody</p>
 */
public class ListChatConfigurationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChatConfigurations")
    private java.util.List<ChatConfigurations> chatConfigurations;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListChatConfigurationsResponseBody(Builder builder) {
        this.chatConfigurations = builder.chatConfigurations;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListChatConfigurationsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chatConfigurations
     */
    public java.util.List<ChatConfigurations> getChatConfigurations() {
        return this.chatConfigurations;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ChatConfigurations> chatConfigurations; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListChatConfigurationsResponseBody model) {
            this.chatConfigurations = model.chatConfigurations;
            this.requestId = model.requestId;
        } 

        /**
         * ChatConfigurations.
         */
        public Builder chatConfigurations(java.util.List<ChatConfigurations> chatConfigurations) {
            this.chatConfigurations = chatConfigurations;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListChatConfigurationsResponseBody build() {
            return new ListChatConfigurationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListChatConfigurationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListChatConfigurationsResponseBody</p>
     */
    public static class ChatConfigurations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedDate")
        private String createdDate;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Outputs")
        private String outputs;

        @com.aliyun.core.annotation.NameInMap("RamRole")
        private String ramRole;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UpdatedDate")
        private String updatedDate;

        private ChatConfigurations(Builder builder) {
            this.createdDate = builder.createdDate;
            this.name = builder.name;
            this.outputs = builder.outputs;
            this.ramRole = builder.ramRole;
            this.type = builder.type;
            this.updatedDate = builder.updatedDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChatConfigurations create() {
            return builder().build();
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
            private String createdDate; 
            private String name; 
            private String outputs; 
            private String ramRole; 
            private String type; 
            private String updatedDate; 

            private Builder() {
            } 

            private Builder(ChatConfigurations model) {
                this.createdDate = model.createdDate;
                this.name = model.name;
                this.outputs = model.outputs;
                this.ramRole = model.ramRole;
                this.type = model.type;
                this.updatedDate = model.updatedDate;
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

            public ChatConfigurations build() {
                return new ChatConfigurations(this);
            } 

        } 

    }
}
