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
 * {@link PushMessageToAndroidResponseBody} extends {@link TeaModel}
 *
 * <p>PushMessageToAndroidResponseBody</p>
 */
public class PushMessageToAndroidResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MessageId")
    private String messageId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private PushMessageToAndroidResponseBody(Builder builder) {
        this.messageId = builder.messageId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushMessageToAndroidResponseBody create() {
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

        private Builder(PushMessageToAndroidResponseBody model) {
            this.messageId = model.messageId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the message pushed.</p>
         * 
         * <strong>example:</strong>
         * <p>501029</p>
         */
        public Builder messageId(String messageId) {
            this.messageId = messageId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>9998B3CC-ED9E-4CB3-A8FB-DCC61296BFBC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PushMessageToAndroidResponseBody build() {
            return new PushMessageToAndroidResponseBody(this);
        } 

    } 

}
