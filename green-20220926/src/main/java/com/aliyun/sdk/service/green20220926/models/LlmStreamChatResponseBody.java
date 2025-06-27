// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link LlmStreamChatResponseBody} extends {@link TeaModel}
 *
 * <p>LlmStreamChatResponseBody</p>
 */
public class LlmStreamChatResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Choices")
    private java.util.List<Choices> choices;

    @com.aliyun.core.annotation.NameInMap("Created")
    private Long created;

    @com.aliyun.core.annotation.NameInMap("Error")
    private Error error;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("Model")
    private String model;

    @com.aliyun.core.annotation.NameInMap("Object")
    private String object;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SystemFingerprint")
    private String systemFingerprint;

    @com.aliyun.core.annotation.NameInMap("Usage")
    private String usage;

    private LlmStreamChatResponseBody(Builder builder) {
        this.choices = builder.choices;
        this.created = builder.created;
        this.error = builder.error;
        this.id = builder.id;
        this.model = builder.model;
        this.object = builder.object;
        this.requestId = builder.requestId;
        this.systemFingerprint = builder.systemFingerprint;
        this.usage = builder.usage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LlmStreamChatResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return choices
     */
    public java.util.List<Choices> getChoices() {
        return this.choices;
    }

    /**
     * @return created
     */
    public Long getCreated() {
        return this.created;
    }

    /**
     * @return error
     */
    public Error getError() {
        return this.error;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return object
     */
    public String getObject() {
        return this.object;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return systemFingerprint
     */
    public String getSystemFingerprint() {
        return this.systemFingerprint;
    }

    /**
     * @return usage
     */
    public String getUsage() {
        return this.usage;
    }

    public static final class Builder {
        private java.util.List<Choices> choices; 
        private Long created; 
        private Error error; 
        private String id; 
        private String model; 
        private String object; 
        private String requestId; 
        private String systemFingerprint; 
        private String usage; 

        private Builder() {
        } 

        private Builder(LlmStreamChatResponseBody model) {
            this.choices = model.choices;
            this.created = model.created;
            this.error = model.error;
            this.id = model.id;
            this.model = model.model;
            this.object = model.object;
            this.requestId = model.requestId;
            this.systemFingerprint = model.systemFingerprint;
            this.usage = model.usage;
        } 

        /**
         * Choices.
         */
        public Builder choices(java.util.List<Choices> choices) {
            this.choices = choices;
            return this;
        }

        /**
         * Created.
         */
        public Builder created(Long created) {
            this.created = created;
            return this;
        }

        /**
         * Error.
         */
        public Builder error(Error error) {
            this.error = error;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(String model) {
            this.model = model;
            return this;
        }

        /**
         * Object.
         */
        public Builder object(String object) {
            this.object = object;
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
         * SystemFingerprint.
         */
        public Builder systemFingerprint(String systemFingerprint) {
            this.systemFingerprint = systemFingerprint;
            return this;
        }

        /**
         * Usage.
         */
        public Builder usage(String usage) {
            this.usage = usage;
            return this;
        }

        public LlmStreamChatResponseBody build() {
            return new LlmStreamChatResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link LlmStreamChatResponseBody} extends {@link TeaModel}
     *
     * <p>LlmStreamChatResponseBody</p>
     */
    public static class Delta extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        private Delta(Builder builder) {
            this.content = builder.content;
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Delta create() {
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

            private Builder(Delta model) {
                this.content = model.content;
                this.role = model.role;
            } 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            public Delta build() {
                return new Delta(this);
            } 

        } 

    }
    /**
     * 
     * {@link LlmStreamChatResponseBody} extends {@link TeaModel}
     *
     * <p>LlmStreamChatResponseBody</p>
     */
    public static class Choices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Delta")
        private Delta delta;

        @com.aliyun.core.annotation.NameInMap("FinishReason")
        private String finishReason;

        @com.aliyun.core.annotation.NameInMap("Index")
        private Long index;

        @com.aliyun.core.annotation.NameInMap("Logprobs")
        private String logprobs;

        private Choices(Builder builder) {
            this.delta = builder.delta;
            this.finishReason = builder.finishReason;
            this.index = builder.index;
            this.logprobs = builder.logprobs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Choices create() {
            return builder().build();
        }

        /**
         * @return delta
         */
        public Delta getDelta() {
            return this.delta;
        }

        /**
         * @return finishReason
         */
        public String getFinishReason() {
            return this.finishReason;
        }

        /**
         * @return index
         */
        public Long getIndex() {
            return this.index;
        }

        /**
         * @return logprobs
         */
        public String getLogprobs() {
            return this.logprobs;
        }

        public static final class Builder {
            private Delta delta; 
            private String finishReason; 
            private Long index; 
            private String logprobs; 

            private Builder() {
            } 

            private Builder(Choices model) {
                this.delta = model.delta;
                this.finishReason = model.finishReason;
                this.index = model.index;
                this.logprobs = model.logprobs;
            } 

            /**
             * Delta.
             */
            public Builder delta(Delta delta) {
                this.delta = delta;
                return this;
            }

            /**
             * FinishReason.
             */
            public Builder finishReason(String finishReason) {
                this.finishReason = finishReason;
                return this;
            }

            /**
             * Index.
             */
            public Builder index(Long index) {
                this.index = index;
                return this;
            }

            /**
             * Logprobs.
             */
            public Builder logprobs(String logprobs) {
                this.logprobs = logprobs;
                return this;
            }

            public Choices build() {
                return new Choices(this);
            } 

        } 

    }
    /**
     * 
     * {@link LlmStreamChatResponseBody} extends {@link TeaModel}
     *
     * <p>LlmStreamChatResponseBody</p>
     */
    public static class Error extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Param")
        private String param;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Error(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
            this.param = builder.param;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Error create() {
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
         * @return param
         */
        public String getParam() {
            return this.param;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String code; 
            private String message; 
            private String param; 
            private String type; 

            private Builder() {
            } 

            private Builder(Error model) {
                this.code = model.code;
                this.message = model.message;
                this.param = model.param;
                this.type = model.type;
            } 

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
             * Param.
             */
            public Builder param(String param) {
                this.param = param;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Error build() {
                return new Error(this);
            } 

        } 

    }
}
