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
 * {@link UpdateChatConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateChatConfigurationResponseBody</p>
 */
public class UpdateChatConfigurationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChatConfiguration")
    private ChatConfiguration chatConfiguration;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateChatConfigurationResponseBody(Builder builder) {
        this.chatConfiguration = builder.chatConfiguration;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateChatConfigurationResponseBody create() {
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

        private Builder(UpdateChatConfigurationResponseBody model) {
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

        public UpdateChatConfigurationResponseBody build() {
            return new UpdateChatConfigurationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateChatConfigurationResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateChatConfigurationResponseBody</p>
     */
    public static class ChatConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedDate")
        private String createdDate;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("UpdatedDate")
        private String updatedDate;

        private ChatConfiguration(Builder builder) {
            this.createdDate = builder.createdDate;
            this.name = builder.name;
            this.updatedDate = builder.updatedDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChatConfiguration create() {
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
         * @return updatedDate
         */
        public String getUpdatedDate() {
            return this.updatedDate;
        }

        public static final class Builder {
            private String createdDate; 
            private String name; 
            private String updatedDate; 

            private Builder() {
            } 

            private Builder(ChatConfiguration model) {
                this.createdDate = model.createdDate;
                this.name = model.name;
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
