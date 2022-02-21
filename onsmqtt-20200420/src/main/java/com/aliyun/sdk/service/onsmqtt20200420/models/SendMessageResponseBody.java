// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendMessageResponseBody} extends {@link TeaModel}
 *
 * <p>SendMessageResponseBody</p>
 */
public class SendMessageResponseBody extends TeaModel {
    @NameInMap("MsgId")
    private String msgId;

    @NameInMap("RequestId")
    private String requestId;

    private SendMessageResponseBody(Builder builder) {
        this.msgId = builder.msgId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendMessageResponseBody create() {
        return builder().build();
    }

    /**
     * @return msgId
     */
    public String getMsgId() {
        return this.msgId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String msgId; 
        private String requestId; 

        /**
         * MsgId.
         */
        public Builder msgId(String msgId) {
            this.msgId = msgId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SendMessageResponseBody build() {
            return new SendMessageResponseBody(this);
        } 

    } 

}
