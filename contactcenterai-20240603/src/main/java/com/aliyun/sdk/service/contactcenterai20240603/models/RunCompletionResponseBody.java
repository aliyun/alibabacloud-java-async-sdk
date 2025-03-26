// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.contactcenterai20240603.models;

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

    @com.aliyun.core.annotation.NameInMap("inputTokens")
    private String inputTokens;

    @com.aliyun.core.annotation.NameInMap("outputTokens")
    private String outputTokens;

    @com.aliyun.core.annotation.NameInMap("totalTokens")
    private String totalTokens;

    private RunCompletionResponseBody(Builder builder) {
        this.finishReason = builder.finishReason;
        this.requestId = builder.requestId;
        this.text = builder.text;
        this.inputTokens = builder.inputTokens;
        this.outputTokens = builder.outputTokens;
        this.totalTokens = builder.totalTokens;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunCompletionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return inputTokens
     */
    public String getInputTokens() {
        return this.inputTokens;
    }

    /**
     * @return outputTokens
     */
    public String getOutputTokens() {
        return this.outputTokens;
    }

    /**
     * @return totalTokens
     */
    public String getTotalTokens() {
        return this.totalTokens;
    }

    public static final class Builder {
        private String finishReason; 
        private String requestId; 
        private String text; 
        private String inputTokens; 
        private String outputTokens; 
        private String totalTokens; 

        private Builder() {
        } 

        private Builder(RunCompletionResponseBody model) {
            this.finishReason = model.finishReason;
            this.requestId = model.requestId;
            this.text = model.text;
            this.inputTokens = model.inputTokens;
            this.outputTokens = model.outputTokens;
            this.totalTokens = model.totalTokens;
        } 

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

        /**
         * inputTokens.
         */
        public Builder inputTokens(String inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }

        /**
         * outputTokens.
         */
        public Builder outputTokens(String outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }

        /**
         * totalTokens.
         */
        public Builder totalTokens(String totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }

        public RunCompletionResponseBody build() {
            return new RunCompletionResponseBody(this);
        } 

    } 

}
