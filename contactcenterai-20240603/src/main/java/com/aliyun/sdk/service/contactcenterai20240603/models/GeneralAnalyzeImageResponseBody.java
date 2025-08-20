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
 * {@link GeneralAnalyzeImageResponseBody} extends {@link TeaModel}
 *
 * <p>GeneralAnalyzeImageResponseBody</p>
 */
public class GeneralAnalyzeImageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("finishReason")
    private String finishReason;

    @com.aliyun.core.annotation.NameInMap("inputTokens")
    private Integer inputTokens;

    @com.aliyun.core.annotation.NameInMap("outputTokens")
    private Integer outputTokens;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("text")
    private String text;

    @com.aliyun.core.annotation.NameInMap("totalTokens")
    private Integer totalTokens;

    private GeneralAnalyzeImageResponseBody(Builder builder) {
        this.finishReason = builder.finishReason;
        this.inputTokens = builder.inputTokens;
        this.outputTokens = builder.outputTokens;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.text = builder.text;
        this.totalTokens = builder.totalTokens;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GeneralAnalyzeImageResponseBody create() {
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
     * @return inputTokens
     */
    public Integer getInputTokens() {
        return this.inputTokens;
    }

    /**
     * @return outputTokens
     */
    public Integer getOutputTokens() {
        return this.outputTokens;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return text
     */
    public String getText() {
        return this.text;
    }

    /**
     * @return totalTokens
     */
    public Integer getTotalTokens() {
        return this.totalTokens;
    }

    public static final class Builder {
        private String finishReason; 
        private Integer inputTokens; 
        private Integer outputTokens; 
        private String requestId; 
        private Boolean success; 
        private String text; 
        private Integer totalTokens; 

        private Builder() {
        } 

        private Builder(GeneralAnalyzeImageResponseBody model) {
            this.finishReason = model.finishReason;
            this.inputTokens = model.inputTokens;
            this.outputTokens = model.outputTokens;
            this.requestId = model.requestId;
            this.success = model.success;
            this.text = model.text;
            this.totalTokens = model.totalTokens;
        } 

        /**
         * finishReason.
         */
        public Builder finishReason(String finishReason) {
            this.finishReason = finishReason;
            return this;
        }

        /**
         * inputTokens.
         */
        public Builder inputTokens(Integer inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }

        /**
         * outputTokens.
         */
        public Builder outputTokens(Integer outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>2D718325-92F9-5588-803B-C4A69A5F0AE1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * text.
         */
        public Builder text(String text) {
            this.text = text;
            return this;
        }

        /**
         * totalTokens.
         */
        public Builder totalTokens(Integer totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }

        public GeneralAnalyzeImageResponseBody build() {
            return new GeneralAnalyzeImageResponseBody(this);
        } 

    } 

}
