// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendMessageToGroupResponseBody} extends {@link TeaModel}
 *
 * <p>SendMessageToGroupResponseBody</p>
 */
public class SendMessageToGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private SendMessageToGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendMessageToGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public SendMessageToGroupResponseBody build() {
            return new SendMessageToGroupResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("MessageId")
        private String messageId;

        private Result(Builder builder) {
            this.messageId = builder.messageId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return messageId
         */
        public String getMessageId() {
            return this.messageId;
        }

        public static final class Builder {
            private String messageId; 

            /**
             * 用于长连接建连的token
             */
            public Builder messageId(String messageId) {
                this.messageId = messageId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
