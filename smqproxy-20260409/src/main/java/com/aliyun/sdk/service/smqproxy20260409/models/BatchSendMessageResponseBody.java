// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smqproxy20260409.models;

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
 * {@link BatchSendMessageResponseBody} extends {@link TeaModel}
 *
 * <p>BatchSendMessageResponseBody</p>
 */
public class BatchSendMessageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Messages")
    private java.util.List<Messages> messages;

    private BatchSendMessageResponseBody(Builder builder) {
        this.messages = builder.messages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchSendMessageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return messages
     */
    public java.util.List<Messages> getMessages() {
        return this.messages;
    }

    public static final class Builder {
        private java.util.List<Messages> messages; 

        private Builder() {
        } 

        private Builder(BatchSendMessageResponseBody model) {
            this.messages = model.messages;
        } 

        /**
         * Messages.
         */
        public Builder messages(java.util.List<Messages> messages) {
            this.messages = messages;
            return this;
        }

        public BatchSendMessageResponseBody build() {
            return new BatchSendMessageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchSendMessageResponseBody} extends {@link TeaModel}
     *
     * <p>BatchSendMessageResponseBody</p>
     */
    public static class Messages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MessageBodyMD5")
        private String messageBodyMD5;

        @com.aliyun.core.annotation.NameInMap("MessageId")
        private String messageId;

        private Messages(Builder builder) {
            this.messageBodyMD5 = builder.messageBodyMD5;
            this.messageId = builder.messageId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Messages create() {
            return builder().build();
        }

        /**
         * @return messageBodyMD5
         */
        public String getMessageBodyMD5() {
            return this.messageBodyMD5;
        }

        /**
         * @return messageId
         */
        public String getMessageId() {
            return this.messageId;
        }

        public static final class Builder {
            private String messageBodyMD5; 
            private String messageId; 

            private Builder() {
            } 

            private Builder(Messages model) {
                this.messageBodyMD5 = model.messageBodyMD5;
                this.messageId = model.messageId;
            } 

            /**
             * MessageBodyMD5.
             */
            public Builder messageBodyMD5(String messageBodyMD5) {
                this.messageBodyMD5 = messageBodyMD5;
                return this;
            }

            /**
             * MessageId.
             */
            public Builder messageId(String messageId) {
                this.messageId = messageId;
                return this;
            }

            public Messages build() {
                return new Messages(this);
            } 

        } 

    }
}
