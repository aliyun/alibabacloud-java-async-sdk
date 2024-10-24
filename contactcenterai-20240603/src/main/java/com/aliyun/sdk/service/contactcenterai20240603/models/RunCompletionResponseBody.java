// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.contactcenterai20240603.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RunCompletionResponseBody} extends {@link TeaModel}
 *
 * <p>RunCompletionResponseBody</p>
 */
public class RunCompletionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FinishReason")
    private String finishReason;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Text")
    private String text;

    private RunCompletionResponseBody(Builder builder) {
        this.finishReason = builder.finishReason;
        this.requestId = builder.requestId;
        this.text = builder.text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunCompletionResponseBody create() {
        return builder().build();
    }

    /**
     * @return finishReason
     */
    public String getFinishReason() {
        return this.finishReason;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return text
     */
    public String getText() {
        return this.text;
    }

    public static final class Builder {
        private String finishReason; 
        private String requestId; 
        private String text; 

        /**
         * FinishReason.
         */
        public Builder finishReason(String finishReason) {
            this.finishReason = finishReason;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Text.
         */
        public Builder text(String text) {
            this.text = text;
            return this;
        }

        public RunCompletionResponseBody build() {
            return new RunCompletionResponseBody(this);
        } 

    } 

}
