// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link SendMessageToGroupResponseBody} extends {@link TeaModel}
 *
 * <p>SendMessageToGroupResponseBody</p>
 */
public class SendMessageToGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(SendMessageToGroupResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>16A96B9A-****-CB92E68F4CD8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public SendMessageToGroupResponseBody build() {
            return new SendMessageToGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SendMessageToGroupResponseBody} extends {@link TeaModel}
     *
     * <p>SendMessageToGroupResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MessageId")
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

            private Builder() {
            } 

            private Builder(Result model) {
                this.messageId = model.messageId;
            } 

            /**
             * <p>The ID of the message.</p>
             * 
             * <strong>example:</strong>
             * <p>qt***</p>
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
