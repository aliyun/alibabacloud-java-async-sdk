// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendCustomMessageToAllResponseBody} extends {@link TeaModel}
 *
 * <p>SendCustomMessageToAllResponseBody</p>
 */
public class SendCustomMessageToAllResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private SendCustomMessageToAllResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendCustomMessageToAllResponseBody create() {
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
         * API请求的返回结果结构体。
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public SendCustomMessageToAllResponseBody build() {
            return new SendCustomMessageToAllResponseBody(this);
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
             * 消息的唯一ID标识。由数字、大小写字母组成，长度不超过20。
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
