// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MassPushResponseBody} extends {@link TeaModel}
 *
 * <p>MassPushResponseBody</p>
 */
public class MassPushResponseBody extends TeaModel {
    @NameInMap("MessageIds")
    private MessageIds messageIds;

    @NameInMap("RequestId")
    private String requestId;

    private MassPushResponseBody(Builder builder) {
        this.messageIds = builder.messageIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MassPushResponseBody create() {
        return builder().build();
    }

    /**
     * @return messageIds
     */
    public MessageIds getMessageIds() {
        return this.messageIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private MessageIds messageIds; 
        private String requestId; 

        /**
         * MessageIds.
         */
        public Builder messageIds(MessageIds messageIds) {
            this.messageIds = messageIds;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public MassPushResponseBody build() {
            return new MassPushResponseBody(this);
        } 

    } 

    public static class MessageIds extends TeaModel {
        @NameInMap("MessageId")
        private java.util.List < String > messageId;

        private MessageIds(Builder builder) {
            this.messageId = builder.messageId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MessageIds create() {
            return builder().build();
        }

        /**
         * @return messageId
         */
        public java.util.List < String > getMessageId() {
            return this.messageId;
        }

        public static final class Builder {
            private java.util.List < String > messageId; 

            /**
             * MessageId.
             */
            public Builder messageId(java.util.List < String > messageId) {
                this.messageId = messageId;
                return this;
            }

            public MessageIds build() {
                return new MessageIds(this);
            } 

        } 

    }
}
