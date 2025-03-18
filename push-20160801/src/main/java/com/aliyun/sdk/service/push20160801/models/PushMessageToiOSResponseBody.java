// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

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
 * {@link PushMessageToiOSResponseBody} extends {@link TeaModel}
 *
 * <p>PushMessageToiOSResponseBody</p>
 */
public class PushMessageToiOSResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MessageId")
    private String messageId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private PushMessageToiOSResponseBody(Builder builder) {
        this.messageId = builder.messageId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushMessageToiOSResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(PushMessageToiOSResponseBody model) {
            this.messageId = model.messageId;
            this.requestId = model.requestId;
        } 

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

        public PushMessageToiOSResponseBody build() {
            return new PushMessageToiOSResponseBody(this);
        } 

    } 

}
