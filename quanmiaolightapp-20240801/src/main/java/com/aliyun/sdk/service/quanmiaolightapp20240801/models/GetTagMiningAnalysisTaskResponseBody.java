// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quanmiaolightapp20240801.models;

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
 * {@link GetTagMiningAnalysisTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetTagMiningAnalysisTaskResponseBody</p>
 */
public class GetTagMiningAnalysisTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private String httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetTagMiningAnalysisTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTagMiningAnalysisTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public String getHttpStatusCode() {
        return this.httpStatusCode;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>requestId</p>
         * 
         * <strong>example:</strong>
         * <p>085BE2D2-BB7E-59A6-B688-F2CB32124E7F</p>
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

        public GetTagMiningAnalysisTaskResponseBody build() {
            return new GetTagMiningAnalysisTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTagMiningAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetTagMiningAnalysisTaskResponseBody</p>
     */
    public static class ResultsHeader extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("errorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("errorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("event")
        private String event;

        @com.aliyun.core.annotation.NameInMap("requestId")
        private String requestId;

        private ResultsHeader(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.event = builder.event;
            this.requestId = builder.requestId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultsHeader create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return event
         */
        public String getEvent() {
            return this.event;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorMessage; 
            private String event; 
            private String requestId; 

            /**
             * errorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * errorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * event.
             */
            public Builder event(String event) {
                this.event = event;
                return this;
            }

            /**
             * <p>requestId</p>
             * 
             * <strong>example:</strong>
             * <p>085BE2D2-BB7E-59A6-B688-F2CB32124E7F</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            public ResultsHeader build() {
                return new ResultsHeader(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTagMiningAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetTagMiningAnalysisTaskResponseBody</p>
     */
    public static class Output extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("text")
        private String text;

        private Output(Builder builder) {
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Output create() {
            return builder().build();
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private String text; 

            /**
             * text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public Output build() {
                return new Output(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTagMiningAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetTagMiningAnalysisTaskResponseBody</p>
     */
    public static class Usage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("inputToken")
        private Long inputToken;

        @com.aliyun.core.annotation.NameInMap("outputToken")
        private Long outputToken;

        @com.aliyun.core.annotation.NameInMap("totalToken")
        private Long totalToken;

        private Usage(Builder builder) {
            this.inputToken = builder.inputToken;
            this.outputToken = builder.outputToken;
            this.totalToken = builder.totalToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Usage create() {
            return builder().build();
        }

        /**
         * @return inputToken
         */
        public Long getInputToken() {
            return this.inputToken;
        }

        /**
         * @return outputToken
         */
        public Long getOutputToken() {
            return this.outputToken;
        }

        /**
         * @return totalToken
         */
        public Long getTotalToken() {
            return this.totalToken;
        }

        public static final class Builder {
            private Long inputToken; 
            private Long outputToken; 
            private Long totalToken; 

            /**
             * inputToken.
             */
            public Builder inputToken(Long inputToken) {
                this.inputToken = inputToken;
                return this;
            }

            /**
             * outputToken.
             */
            public Builder outputToken(Long outputToken) {
                this.outputToken = outputToken;
                return this;
            }

            /**
             * totalToken.
             */
            public Builder totalToken(Long totalToken) {
                this.totalToken = totalToken;
                return this;
            }

            public Usage build() {
                return new Usage(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTagMiningAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetTagMiningAnalysisTaskResponseBody</p>
     */
    public static class Payload extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("output")
        private Output output;

        @com.aliyun.core.annotation.NameInMap("usage")
        private Usage usage;

        private Payload(Builder builder) {
            this.output = builder.output;
            this.usage = builder.usage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Payload create() {
            return builder().build();
        }

        /**
         * @return output
         */
        public Output getOutput() {
            return this.output;
        }

        /**
         * @return usage
         */
        public Usage getUsage() {
            return this.usage;
        }

        public static final class Builder {
            private Output output; 
            private Usage usage; 

            /**
             * output.
             */
            public Builder output(Output output) {
                this.output = output;
                return this;
            }

            /**
             * usage.
             */
            public Builder usage(Usage usage) {
                this.usage = usage;
                return this;
            }

            public Payload build() {
                return new Payload(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTagMiningAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetTagMiningAnalysisTaskResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("customId")
        private String customId;

        @com.aliyun.core.annotation.NameInMap("header")
        private ResultsHeader header;

        @com.aliyun.core.annotation.NameInMap("payload")
        private Payload payload;

        private Results(Builder builder) {
            this.customId = builder.customId;
            this.header = builder.header;
            this.payload = builder.payload;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return customId
         */
        public String getCustomId() {
            return this.customId;
        }

        /**
         * @return header
         */
        public ResultsHeader getHeader() {
            return this.header;
        }

        /**
         * @return payload
         */
        public Payload getPayload() {
            return this.payload;
        }

        public static final class Builder {
            private String customId; 
            private ResultsHeader header; 
            private Payload payload; 

            /**
             * customId.
             */
            public Builder customId(String customId) {
                this.customId = customId;
                return this;
            }

            /**
             * header.
             */
            public Builder header(ResultsHeader header) {
                this.header = header;
                return this;
            }

            /**
             * payload.
             */
            public Builder payload(Payload payload) {
                this.payload = payload;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTagMiningAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetTagMiningAnalysisTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("errorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("errorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("results")
        private java.util.List<Results> results;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private Data(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.results = builder.results;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return results
         */
        public java.util.List<Results> getResults() {
            return this.results;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorMessage; 
            private java.util.List<Results> results; 
            private String status; 

            /**
             * errorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * errorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * results.
             */
            public Builder results(java.util.List<Results> results) {
                this.results = results;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
