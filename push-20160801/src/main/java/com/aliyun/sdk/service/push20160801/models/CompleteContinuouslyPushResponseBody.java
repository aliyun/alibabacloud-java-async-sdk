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
 * {@link CompleteContinuouslyPushResponseBody} extends {@link TeaModel}
 *
 * <p>CompleteContinuouslyPushResponseBody</p>
 */
public class CompleteContinuouslyPushResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MessageId")
    private String messageId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CompleteContinuouslyPushResponseBody(Builder builder) {
        this.messageId = builder.messageId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CompleteContinuouslyPushResponseBody create() {
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

        private Builder(CompleteContinuouslyPushResponseBody model) {
            this.messageId = model.messageId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The message ID for the push request.</p>
         * 
         * <strong>example:</strong>
         * <p>9998B3CC-ED9E-4CB3-A8FB-DCC61296BFBC</p>
         */
        public Builder messageId(String messageId) {
            this.messageId = messageId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>500131</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CompleteContinuouslyPushResponseBody build() {
            return new CompleteContinuouslyPushResponseBody(this);
        } 

    } 

}
