// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link ListPredefinedModelsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPredefinedModelsResponseBody</p>
 */
public class ListPredefinedModelsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private ListPredefinedModelsResponseBody(Builder builder) {
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

    public static ListPredefinedModelsResponseBody create() {
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
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
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
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListPredefinedModelsResponseBody model) {
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
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
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
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListPredefinedModelsResponseBody build() {
            return new ListPredefinedModelsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPredefinedModelsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPredefinedModelsResponseBody</p>
     */
    public static class Capabilities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("audio")
        private Boolean audio;

        @com.aliyun.core.annotation.NameInMap("document")
        private Boolean document;

        @com.aliyun.core.annotation.NameInMap("multiToolCall")
        private Boolean multiToolCall;

        @com.aliyun.core.annotation.NameInMap("reasoning")
        private Boolean reasoning;

        @com.aliyun.core.annotation.NameInMap("streamToolCall")
        private Boolean streamToolCall;

        @com.aliyun.core.annotation.NameInMap("toolCall")
        private Boolean toolCall;

        @com.aliyun.core.annotation.NameInMap("video")
        private Boolean video;

        @com.aliyun.core.annotation.NameInMap("vision")
        private Boolean vision;

        private Capabilities(Builder builder) {
            this.audio = builder.audio;
            this.document = builder.document;
            this.multiToolCall = builder.multiToolCall;
            this.reasoning = builder.reasoning;
            this.streamToolCall = builder.streamToolCall;
            this.toolCall = builder.toolCall;
            this.video = builder.video;
            this.vision = builder.vision;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Capabilities create() {
            return builder().build();
        }

        /**
         * @return audio
         */
        public Boolean getAudio() {
            return this.audio;
        }

        /**
         * @return document
         */
        public Boolean getDocument() {
            return this.document;
        }

        /**
         * @return multiToolCall
         */
        public Boolean getMultiToolCall() {
            return this.multiToolCall;
        }

        /**
         * @return reasoning
         */
        public Boolean getReasoning() {
            return this.reasoning;
        }

        /**
         * @return streamToolCall
         */
        public Boolean getStreamToolCall() {
            return this.streamToolCall;
        }

        /**
         * @return toolCall
         */
        public Boolean getToolCall() {
            return this.toolCall;
        }

        /**
         * @return video
         */
        public Boolean getVideo() {
            return this.video;
        }

        /**
         * @return vision
         */
        public Boolean getVision() {
            return this.vision;
        }

        public static final class Builder {
            private Boolean audio; 
            private Boolean document; 
            private Boolean multiToolCall; 
            private Boolean reasoning; 
            private Boolean streamToolCall; 
            private Boolean toolCall; 
            private Boolean video; 
            private Boolean vision; 

            private Builder() {
            } 

            private Builder(Capabilities model) {
                this.audio = model.audio;
                this.document = model.document;
                this.multiToolCall = model.multiToolCall;
                this.reasoning = model.reasoning;
                this.streamToolCall = model.streamToolCall;
                this.toolCall = model.toolCall;
                this.video = model.video;
                this.vision = model.vision;
            } 

            /**
             * audio.
             */
            public Builder audio(Boolean audio) {
                this.audio = audio;
                return this;
            }

            /**
             * document.
             */
            public Builder document(Boolean document) {
                this.document = document;
                return this;
            }

            /**
             * multiToolCall.
             */
            public Builder multiToolCall(Boolean multiToolCall) {
                this.multiToolCall = multiToolCall;
                return this;
            }

            /**
             * reasoning.
             */
            public Builder reasoning(Boolean reasoning) {
                this.reasoning = reasoning;
                return this;
            }

            /**
             * streamToolCall.
             */
            public Builder streamToolCall(Boolean streamToolCall) {
                this.streamToolCall = streamToolCall;
                return this;
            }

            /**
             * toolCall.
             */
            public Builder toolCall(Boolean toolCall) {
                this.toolCall = toolCall;
                return this;
            }

            /**
             * video.
             */
            public Builder video(Boolean video) {
                this.video = video;
                return this;
            }

            /**
             * vision.
             */
            public Builder vision(Boolean vision) {
                this.vision = vision;
                return this;
            }

            public Capabilities build() {
                return new Capabilities(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPredefinedModelsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPredefinedModelsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("capabilities")
        private Capabilities capabilities;

        @com.aliyun.core.annotation.NameInMap("contextSize")
        private Long contextSize;

        @com.aliyun.core.annotation.NameInMap("maxTokens")
        private Long maxTokens;

        @com.aliyun.core.annotation.NameInMap("modelName")
        private String modelName;

        @com.aliyun.core.annotation.NameInMap("releaseDate")
        private String releaseDate;

        private Data(Builder builder) {
            this.capabilities = builder.capabilities;
            this.contextSize = builder.contextSize;
            this.maxTokens = builder.maxTokens;
            this.modelName = builder.modelName;
            this.releaseDate = builder.releaseDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return capabilities
         */
        public Capabilities getCapabilities() {
            return this.capabilities;
        }

        /**
         * @return contextSize
         */
        public Long getContextSize() {
            return this.contextSize;
        }

        /**
         * @return maxTokens
         */
        public Long getMaxTokens() {
            return this.maxTokens;
        }

        /**
         * @return modelName
         */
        public String getModelName() {
            return this.modelName;
        }

        /**
         * @return releaseDate
         */
        public String getReleaseDate() {
            return this.releaseDate;
        }

        public static final class Builder {
            private Capabilities capabilities; 
            private Long contextSize; 
            private Long maxTokens; 
            private String modelName; 
            private String releaseDate; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.capabilities = model.capabilities;
                this.contextSize = model.contextSize;
                this.maxTokens = model.maxTokens;
                this.modelName = model.modelName;
                this.releaseDate = model.releaseDate;
            } 

            /**
             * capabilities.
             */
            public Builder capabilities(Capabilities capabilities) {
                this.capabilities = capabilities;
                return this;
            }

            /**
             * contextSize.
             */
            public Builder contextSize(Long contextSize) {
                this.contextSize = contextSize;
                return this;
            }

            /**
             * maxTokens.
             */
            public Builder maxTokens(Long maxTokens) {
                this.maxTokens = maxTokens;
                return this;
            }

            /**
             * modelName.
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            /**
             * releaseDate.
             */
            public Builder releaseDate(String releaseDate) {
                this.releaseDate = releaseDate;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
