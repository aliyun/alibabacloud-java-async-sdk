// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailianmodelonchip20240816.models;

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
 * {@link HalfLLMAppCallResponseBody} extends {@link TeaModel}
 *
 * <p>HalfLLMAppCallResponseBody</p>
 */
public class HalfLLMAppCallResponseBody extends TeaModel {
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
    private String success;

    private HalfLLMAppCallResponseBody(Builder builder) {
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

    public static HalfLLMAppCallResponseBody create() {
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String httpStatusCode; 
        private String message; 
        private String requestId; 
        private String success; 

        private Builder() {
        } 

        private Builder(HalfLLMAppCallResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

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
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public HalfLLMAppCallResponseBody build() {
            return new HalfLLMAppCallResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link HalfLLMAppCallResponseBody} extends {@link TeaModel}
     *
     * <p>HalfLLMAppCallResponseBody</p>
     */
    public static class Message extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("role")
        private String role;

        private Message(Builder builder) {
            this.content = builder.content;
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Message create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        public static final class Builder {
            private String content; 
            private String role; 

            private Builder() {
            } 

            private Builder(Message model) {
                this.content = model.content;
                this.role = model.role;
            } 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            public Message build() {
                return new Message(this);
            } 

        } 

    }
    /**
     * 
     * {@link HalfLLMAppCallResponseBody} extends {@link TeaModel}
     *
     * <p>HalfLLMAppCallResponseBody</p>
     */
    public static class Choices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("finishReason")
        private String finishReason;

        @com.aliyun.core.annotation.NameInMap("message")
        private Message message;

        private Choices(Builder builder) {
            this.finishReason = builder.finishReason;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Choices create() {
            return builder().build();
        }

        /**
         * @return finishReason
         */
        public String getFinishReason() {
            return this.finishReason;
        }

        /**
         * @return message
         */
        public Message getMessage() {
            return this.message;
        }

        public static final class Builder {
            private String finishReason; 
            private Message message; 

            private Builder() {
            } 

            private Builder(Choices model) {
                this.finishReason = model.finishReason;
                this.message = model.message;
            } 

            /**
             * finishReason.
             */
            public Builder finishReason(String finishReason) {
                this.finishReason = finishReason;
                return this;
            }

            /**
             * message.
             */
            public Builder message(Message message) {
                this.message = message;
                return this;
            }

            public Choices build() {
                return new Choices(this);
            } 

        } 

    }
    /**
     * 
     * {@link HalfLLMAppCallResponseBody} extends {@link TeaModel}
     *
     * <p>HalfLLMAppCallResponseBody</p>
     */
    public static class Output extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("choices")
        private java.util.List<Choices> choices;

        private Output(Builder builder) {
            this.choices = builder.choices;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Output create() {
            return builder().build();
        }

        /**
         * @return choices
         */
        public java.util.List<Choices> getChoices() {
            return this.choices;
        }

        public static final class Builder {
            private java.util.List<Choices> choices; 

            private Builder() {
            } 

            private Builder(Output model) {
                this.choices = model.choices;
            } 

            /**
             * choices.
             */
            public Builder choices(java.util.List<Choices> choices) {
                this.choices = choices;
                return this;
            }

            public Output build() {
                return new Output(this);
            } 

        } 

    }
    /**
     * 
     * {@link HalfLLMAppCallResponseBody} extends {@link TeaModel}
     *
     * <p>HalfLLMAppCallResponseBody</p>
     */
    public static class Rt extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("firstRt")
        private Long firstRt;

        @com.aliyun.core.annotation.NameInMap("totalRt")
        private Long totalRt;

        private Rt(Builder builder) {
            this.firstRt = builder.firstRt;
            this.totalRt = builder.totalRt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rt create() {
            return builder().build();
        }

        /**
         * @return firstRt
         */
        public Long getFirstRt() {
            return this.firstRt;
        }

        /**
         * @return totalRt
         */
        public Long getTotalRt() {
            return this.totalRt;
        }

        public static final class Builder {
            private Long firstRt; 
            private Long totalRt; 

            private Builder() {
            } 

            private Builder(Rt model) {
                this.firstRt = model.firstRt;
                this.totalRt = model.totalRt;
            } 

            /**
             * firstRt.
             */
            public Builder firstRt(Long firstRt) {
                this.firstRt = firstRt;
                return this;
            }

            /**
             * totalRt.
             */
            public Builder totalRt(Long totalRt) {
                this.totalRt = totalRt;
                return this;
            }

            public Rt build() {
                return new Rt(this);
            } 

        } 

    }
    /**
     * 
     * {@link HalfLLMAppCallResponseBody} extends {@link TeaModel}
     *
     * <p>HalfLLMAppCallResponseBody</p>
     */
    public static class Usages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("inputTokens")
        private Long inputTokens;

        @com.aliyun.core.annotation.NameInMap("outputTokens")
        private Long outputTokens;

        private Usages(Builder builder) {
            this.inputTokens = builder.inputTokens;
            this.outputTokens = builder.outputTokens;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Usages create() {
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

        public static final class Builder {
            private Long inputTokens; 
            private Long outputTokens; 

            private Builder() {
            } 

            private Builder(Usages model) {
                this.inputTokens = model.inputTokens;
                this.outputTokens = model.outputTokens;
            } 

            /**
             * inputTokens.
             */
            public Builder inputTokens(Long inputTokens) {
                this.inputTokens = inputTokens;
                return this;
            }

            /**
             * outputTokens.
             */
            public Builder outputTokens(Long outputTokens) {
                this.outputTokens = outputTokens;
                return this;
            }

            public Usages build() {
                return new Usages(this);
            } 

        } 

    }
    /**
     * 
     * {@link HalfLLMAppCallResponseBody} extends {@link TeaModel}
     *
     * <p>HalfLLMAppCallResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("output")
        private Output output;

        @com.aliyun.core.annotation.NameInMap("requestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("rt")
        private Rt rt;

        @com.aliyun.core.annotation.NameInMap("sessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("usages")
        private Usages usages;

        private Data(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
            this.output = builder.output;
            this.requestId = builder.requestId;
            this.rt = builder.rt;
            this.sessionId = builder.sessionId;
            this.usages = builder.usages;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
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
         * @return output
         */
        public Output getOutput() {
            return this.output;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return rt
         */
        public Rt getRt() {
            return this.rt;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return usages
         */
        public Usages getUsages() {
            return this.usages;
        }

        public static final class Builder {
            private String code; 
            private String message; 
            private Output output; 
            private String requestId; 
            private Rt rt; 
            private String sessionId; 
            private Usages usages; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.code = model.code;
                this.message = model.message;
                this.output = model.output;
                this.requestId = model.requestId;
                this.rt = model.rt;
                this.sessionId = model.sessionId;
                this.usages = model.usages;
            } 

            /**
             * code.
             */
            public Builder code(String code) {
                this.code = code;
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
             * output.
             */
            public Builder output(Output output) {
                this.output = output;
                return this;
            }

            /**
             * requestId.
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * rt.
             */
            public Builder rt(Rt rt) {
                this.rt = rt;
                return this;
            }

            /**
             * sessionId.
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * usages.
             */
            public Builder usages(Usages usages) {
                this.usages = usages;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
