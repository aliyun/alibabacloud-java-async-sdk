// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CompleteContinuouslyPushResponseBody} extends {@link TeaModel}
 *
 * <p>CompleteContinuouslyPushResponseBody</p>
 */
public class CompleteContinuouslyPushResponseBody extends TeaModel {
    @NameInMap("MessageId")
    private String messageId;

    @NameInMap("RequestId")
    private String requestId;

    private CompleteContinuouslyPushResponseBody(Builder builder) {
        this.messageId = builder.messageId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CompleteContinuouslyPushResponseBody create() {
        return builder().build();
    }

    /**
     * @return messageId
     */
    public String getMessageId() {
        return this.messageId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String messageId; 
        private String requestId; 

        /**
         * MessageId.
         */
        public Builder messageId(String messageId) {
            this.messageId = messageId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CompleteContinuouslyPushResponseBody build() {
            return new CompleteContinuouslyPushResponseBody(this);
        } 

    } 

}
