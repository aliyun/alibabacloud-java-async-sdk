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
 * {@link SendMessageResponseBody} extends {@link TeaModel}
 *
 * <p>SendMessageResponseBody</p>
 */
public class SendMessageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MessageBodyMD5")
    private String messageBodyMD5;

    @com.aliyun.core.annotation.NameInMap("MessageId")
    private String messageId;

    @com.aliyun.core.annotation.NameInMap("ReceiptHandle")
    private String receiptHandle;

    private SendMessageResponseBody(Builder builder) {
        this.messageBodyMD5 = builder.messageBodyMD5;
        this.messageId = builder.messageId;
        this.receiptHandle = builder.receiptHandle;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendMessageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return receiptHandle
     */
    public String getReceiptHandle() {
        return this.receiptHandle;
    }

    public static final class Builder {
        private String messageBodyMD5; 
        private String messageId; 
        private String receiptHandle; 

        private Builder() {
        } 

        private Builder(SendMessageResponseBody model) {
            this.messageBodyMD5 = model.messageBodyMD5;
            this.messageId = model.messageId;
            this.receiptHandle = model.receiptHandle;
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

        /**
         * ReceiptHandle.
         */
        public Builder receiptHandle(String receiptHandle) {
            this.receiptHandle = receiptHandle;
            return this;
        }

        public SendMessageResponseBody build() {
            return new SendMessageResponseBody(this);
        } 

    } 

}
