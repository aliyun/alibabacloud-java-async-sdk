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
 * {@link PublishMessageResponseBody} extends {@link TeaModel}
 *
 * <p>PublishMessageResponseBody</p>
 */
public class PublishMessageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MessageBodyMD5")
    private String messageBodyMD5;

    @com.aliyun.core.annotation.NameInMap("MessageId")
    private String messageId;

    private PublishMessageResponseBody(Builder builder) {
        this.messageBodyMD5 = builder.messageBodyMD5;
        this.messageId = builder.messageId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishMessageResponseBody create() {
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

    public static final class Builder {
        private String messageBodyMD5; 
        private String messageId; 

        private Builder() {
        } 

        private Builder(PublishMessageResponseBody model) {
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

        public PublishMessageResponseBody build() {
            return new PublishMessageResponseBody(this);
        } 

    } 

}
