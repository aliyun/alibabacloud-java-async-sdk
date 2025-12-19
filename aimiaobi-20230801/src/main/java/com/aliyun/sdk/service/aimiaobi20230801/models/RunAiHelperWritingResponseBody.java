// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link RunAiHelperWritingResponseBody} extends {@link TeaModel}
 *
 * <p>RunAiHelperWritingResponseBody</p>
 */
public class RunAiHelperWritingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Header")
    private RunAiHelperWritingResponseBodyHeader header;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private String httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Payload")
    private Payload payload;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private RunAiHelperWritingResponseBody(Builder builder) {
        this.code = builder.code;
        this.header = builder.header;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.payload = builder.payload;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunAiHelperWritingResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return header
     */
    public RunAiHelperWritingResponseBodyHeader getHeader() {
        return this.header;
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
     * @return payload
     */
    public Payload getPayload() {
        return this.payload;
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
        private RunAiHelperWritingResponseBodyHeader header; 
        private String httpStatusCode; 
        private String message; 
        private Payload payload; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(RunAiHelperWritingResponseBody model) {
            this.code = model.code;
            this.header = model.header;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.payload = model.payload;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>业务处理结果状态码</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>流式响应的头部信息，包含事件类型、状态码等元数据</p>
         */
        public Builder header(RunAiHelperWritingResponseBodyHeader header) {
            this.header = header;
            return this;
        }

        /**
         * <p>HTTP响应状态码</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>业务处理结果描述信息</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>包含写作输出内容和Token使用量统计</p>
         */
        public Builder payload(Payload payload) {
            this.payload = payload;
            return this;
        }

        /**
         * <p>本次API请求的唯一标识</p>
         * 
         * <strong>example:</strong>
         * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>请求是否处理成功</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public RunAiHelperWritingResponseBody build() {
            return new RunAiHelperWritingResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RunAiHelperWritingResponseBody} extends {@link TeaModel}
     *
     * <p>RunAiHelperWritingResponseBody</p>
     */
    public static class RunAiHelperWritingResponseBodyHeader extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Event")
        private String event;

        @com.aliyun.core.annotation.NameInMap("SessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("StatusCode")
        private Integer statusCode;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TraceId")
        private String traceId;

        private RunAiHelperWritingResponseBodyHeader(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.event = builder.event;
            this.sessionId = builder.sessionId;
            this.statusCode = builder.statusCode;
            this.taskId = builder.taskId;
            this.traceId = builder.traceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RunAiHelperWritingResponseBodyHeader create() {
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
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return statusCode
         */
        public Integer getStatusCode() {
            return this.statusCode;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return traceId
         */
        public String getTraceId() {
            return this.traceId;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorMessage; 
            private String event; 
            private String sessionId; 
            private Integer statusCode; 
            private String taskId; 
            private String traceId; 

            private Builder() {
            } 

            private Builder(RunAiHelperWritingResponseBodyHeader model) {
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.event = model.event;
                this.sessionId = model.sessionId;
                this.statusCode = model.statusCode;
                this.taskId = model.taskId;
                this.traceId = model.traceId;
            } 

            /**
             * <p>请求错误时的错误码</p>
             * 
             * <strong>example:</strong>
             * <p>InvalidParameter</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>请求错误时的详细错误信息</p>
             * 
             * <strong>example:</strong>
             * <p>参数错误</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>SSE事件类型，如：result-generated(生成结果)、task-finished(任务完成)</p>
             * 
             * <strong>example:</strong>
             * <p>result-generated</p>
             */
            public Builder event(String event) {
                this.event = event;
                return this;
            }

            /**
             * <p>当前写作会话的唯一标识</p>
             * 
             * <strong>example:</strong>
             * <p>session-xxxxx</p>
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * <p>HTTP状态码</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder statusCode(Integer statusCode) {
                this.statusCode = statusCode;
                return this;
            }

            /**
             * <p>写作任务的唯一标识</p>
             * 
             * <strong>example:</strong>
             * <p>task-xxxxx</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>用于问题排查的链路追踪标识</p>
             * 
             * <strong>example:</strong>
             * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
             */
            public Builder traceId(String traceId) {
                this.traceId = traceId;
                return this;
            }

            public RunAiHelperWritingResponseBodyHeader build() {
                return new RunAiHelperWritingResponseBodyHeader(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunAiHelperWritingResponseBody} extends {@link TeaModel}
     *
     * <p>RunAiHelperWritingResponseBody</p>
     */
    public static class Output extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("WritingParams")
        private java.util.Map<String, String> writingParams;

        private Output(Builder builder) {
            this.text = builder.text;
            this.writingParams = builder.writingParams;
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

        /**
         * @return writingParams
         */
        public java.util.Map<String, String> getWritingParams() {
            return this.writingParams;
        }

        public static final class Builder {
            private String text; 
            private java.util.Map<String, String> writingParams; 

            private Builder() {
            } 

            private Builder(Output model) {
                this.text = model.text;
                this.writingParams = model.writingParams;
            } 

            /**
             * <p>AI生成的文章内容，流式返回时为增量文本</p>
             * 
             * <strong>example:</strong>
             * <p>人工智能正在深刻改变我们的生活...</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * <p>返回的写作参数键值对</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;wordCount&quot;: &quot;1000&quot;}</p>
             */
            public Builder writingParams(java.util.Map<String, String> writingParams) {
                this.writingParams = writingParams;
                return this;
            }

            public Output build() {
                return new Output(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunAiHelperWritingResponseBody} extends {@link TeaModel}
     *
     * <p>RunAiHelperWritingResponseBody</p>
     */
    public static class Usage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InputTokens")
        private Long inputTokens;

        @com.aliyun.core.annotation.NameInMap("OutputTokens")
        private Long outputTokens;

        @com.aliyun.core.annotation.NameInMap("TotalTokens")
        private Long totalTokens;

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
        public Long getInputTokens() {
            return this.inputTokens;
        }

        /**
         * @return outputTokens
         */
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        /**
         * @return totalTokens
         */
        public Long getTotalTokens() {
            return this.totalTokens;
        }

        public static final class Builder {
            private Long inputTokens; 
            private Long outputTokens; 
            private Long totalTokens; 

            private Builder() {
            } 

            private Builder(Usage model) {
                this.inputTokens = model.inputTokens;
                this.outputTokens = model.outputTokens;
                this.totalTokens = model.totalTokens;
            } 

            /**
             * <p>输入内容消耗的Token数量</p>
             * 
             * <strong>example:</strong>
             * <p>256</p>
             */
            public Builder inputTokens(Long inputTokens) {
                this.inputTokens = inputTokens;
                return this;
            }

            /**
             * <p>生成内容消耗的Token数量</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder outputTokens(Long outputTokens) {
                this.outputTokens = outputTokens;
                return this;
            }

            /**
             * <p>输入和输出Token的总和</p>
             * 
             * <strong>example:</strong>
             * <p>1280</p>
             */
            public Builder totalTokens(Long totalTokens) {
                this.totalTokens = totalTokens;
                return this;
            }

            public Usage build() {
                return new Usage(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunAiHelperWritingResponseBody} extends {@link TeaModel}
     *
     * <p>RunAiHelperWritingResponseBody</p>
     */
    public static class Payload extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Output")
        private Output output;

        @com.aliyun.core.annotation.NameInMap("Usage")
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

            private Builder() {
            } 

            private Builder(Payload model) {
                this.output = model.output;
                this.usage = model.usage;
            } 

            /**
             * <p>AI生成的写作内容</p>
             */
            public Builder output(Output output) {
                this.output = output;
                return this;
            }

            /**
             * <p>本次请求的Token消耗统计</p>
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
}
