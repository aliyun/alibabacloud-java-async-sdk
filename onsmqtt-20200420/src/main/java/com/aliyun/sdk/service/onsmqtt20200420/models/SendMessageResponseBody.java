// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

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
 * {@link SendMessageResponseBody} extends {@link TeaModel}
 *
 * <p>SendMessageResponseBody</p>
 */
public class SendMessageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MsgId")
    private String msgId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The unique message ID that is returned by the ApsaraMQ for MQTT broker after the message is sent.</p>
         * 
         * <strong>example:</strong>
         * <p>0B736D997B7F45FF54E61C1C1B58****</p>
         */
        public Builder msgId(String msgId) {
            this.msgId = msgId;
            return this;
        }

        /**
         * <p>The unique ID that the system generates for the request. This parameter is a common parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>020F6A43-19E6-4B6E-B846-44EB31DF****</p>
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
