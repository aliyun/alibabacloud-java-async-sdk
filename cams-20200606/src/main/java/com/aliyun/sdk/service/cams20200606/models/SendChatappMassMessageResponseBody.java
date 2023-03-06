// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendChatappMassMessageResponseBody} extends {@link TeaModel}
 *
 * <p>SendChatappMassMessageResponseBody</p>
 */
public class SendChatappMassMessageResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("GroupMessageId")
    private String groupMessageId;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private SendChatappMassMessageResponseBody(Builder builder) {
        this.code = builder.code;
        this.groupMessageId = builder.groupMessageId;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendChatappMassMessageResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return groupMessageId
     */
    public String getGroupMessageId() {
        return this.groupMessageId;
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

    public static final class Builder {
        private String code; 
        private String groupMessageId; 
        private String message; 
        private String requestId; 

        /**
         * The HTTP status code returned.
         * <p>
         * 
         * *   A value of OK indicates that the call is successful.
         * *   Other values indicate that the call fails. For more information, see [Error codes](~~196974~~).
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The ID of the group of messages.
         */
        public Builder groupMessageId(String groupMessageId) {
            this.groupMessageId = groupMessageId;
            return this;
        }

        /**
         * The error message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SendChatappMassMessageResponseBody build() {
            return new SendChatappMassMessageResponseBody(this);
        } 

    } 

}
