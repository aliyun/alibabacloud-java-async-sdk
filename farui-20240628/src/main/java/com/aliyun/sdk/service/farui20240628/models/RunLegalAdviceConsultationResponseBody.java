// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.farui20240628.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RunLegalAdviceConsultationResponseBody} extends {@link TeaModel}
 *
 * <p>RunLegalAdviceConsultationResponseBody</p>
 */
public class RunLegalAdviceConsultationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResponseMarkdown")
    private String responseMarkdown;

    @com.aliyun.core.annotation.NameInMap("Round")
    private Integer round;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Usage")
    private Usage usage;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private String httpStatusCode;

    private RunLegalAdviceConsultationResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.responseMarkdown = builder.responseMarkdown;
        this.round = builder.round;
        this.status = builder.status;
        this.success = builder.success;
        this.usage = builder.usage;
        this.httpStatusCode = builder.httpStatusCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunLegalAdviceConsultationResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return responseMarkdown
     */
    public String getResponseMarkdown() {
        return this.responseMarkdown;
    }

    /**
     * @return round
     */
    public Integer getRound() {
        return this.round;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return usage
     */
    public Usage getUsage() {
        return this.usage;
    }

    /**
     * @return httpStatusCode
     */
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private String responseMarkdown; 
        private Integer round; 
        private String status; 
        private Boolean success; 
        private Usage usage; 
        private String httpStatusCode; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * ResponseMarkdown.
         */
        public Builder responseMarkdown(String responseMarkdown) {
            this.responseMarkdown = responseMarkdown;
            return this;
        }

        /**
         * Round.
         */
        public Builder round(Integer round) {
            this.round = round;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Usage.
         */
        public Builder usage(Usage usage) {
            this.usage = usage;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        public RunLegalAdviceConsultationResponseBody build() {
            return new RunLegalAdviceConsultationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RunLegalAdviceConsultationResponseBody} extends {@link TeaModel}
     *
     * <p>RunLegalAdviceConsultationResponseBody</p>
     */
    public static class Usage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InputTokens")
        private Integer inputTokens;

        @com.aliyun.core.annotation.NameInMap("OutputTokens")
        private Integer outputTokens;

        @com.aliyun.core.annotation.NameInMap("TotalTokens")
        private Integer totalTokens;

        private Usage(Builder builder) {
            this.inputTokens = builder.inputTokens;
            this.outputTokens = builder.outputTokens;
            this.totalTokens = builder.totalTokens;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Usage create() {
            return builder().build();
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
         * @return totalTokens
         */
        public Integer getTotalTokens() {
            return this.totalTokens;
        }

        public static final class Builder {
            private Integer inputTokens; 
            private Integer outputTokens; 
            private Integer totalTokens; 

            /**
             * InputTokens.
             */
            public Builder inputTokens(Integer inputTokens) {
                this.inputTokens = inputTokens;
                return this;
            }

            /**
             * OutputTokens.
             */
            public Builder outputTokens(Integer outputTokens) {
                this.outputTokens = outputTokens;
                return this;
            }

            /**
             * TotalTokens.
             */
            public Builder totalTokens(Integer totalTokens) {
                this.totalTokens = totalTokens;
                return this;
            }

            public Usage build() {
                return new Usage(this);
            } 

        } 

    }
}
