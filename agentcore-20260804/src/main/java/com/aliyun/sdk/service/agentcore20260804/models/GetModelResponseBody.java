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
 * {@link GetModelResponseBody} extends {@link TeaModel}
 *
 * <p>GetModelResponseBody</p>
 */
public class GetModelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetModelResponseBody(Builder builder) {
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

    public static GetModelResponseBody create() {
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
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetModelResponseBody model) {
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

        public GetModelResponseBody build() {
            return new GetModelResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetModelResponseBody} extends {@link TeaModel}
     *
     * <p>GetModelResponseBody</p>
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
     * {@link GetModelResponseBody} extends {@link TeaModel}
     *
     * <p>GetModelResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("capabilities")
        private Capabilities capabilities;

        @com.aliyun.core.annotation.NameInMap("connectionId")
        private String connectionId;

        @com.aliyun.core.annotation.NameInMap("contextSize")
        private Long contextSize;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("maxTokens")
        private Long maxTokens;

        @com.aliyun.core.annotation.NameInMap("modelId")
        private String modelId;

        @com.aliyun.core.annotation.NameInMap("modelName")
        private String modelName;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        private String updatedAt;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        private Data(Builder builder) {
            this.capabilities = builder.capabilities;
            this.connectionId = builder.connectionId;
            this.contextSize = builder.contextSize;
            this.createdAt = builder.createdAt;
            this.description = builder.description;
            this.maxTokens = builder.maxTokens;
            this.modelId = builder.modelId;
            this.modelName = builder.modelName;
            this.regionId = builder.regionId;
            this.updatedAt = builder.updatedAt;
            this.workspaceId = builder.workspaceId;
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
         * @return connectionId
         */
        public String getConnectionId() {
            return this.connectionId;
        }

        /**
         * @return contextSize
         */
        public Long getContextSize() {
            return this.contextSize;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return maxTokens
         */
        public Long getMaxTokens() {
            return this.maxTokens;
        }

        /**
         * @return modelId
         */
        public String getModelId() {
            return this.modelId;
        }

        /**
         * @return modelName
         */
        public String getModelName() {
            return this.modelName;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private Capabilities capabilities; 
            private String connectionId; 
            private Long contextSize; 
            private String createdAt; 
            private String description; 
            private Long maxTokens; 
            private String modelId; 
            private String modelName; 
            private String regionId; 
            private String updatedAt; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.capabilities = model.capabilities;
                this.connectionId = model.connectionId;
                this.contextSize = model.contextSize;
                this.createdAt = model.createdAt;
                this.description = model.description;
                this.maxTokens = model.maxTokens;
                this.modelId = model.modelId;
                this.modelName = model.modelName;
                this.regionId = model.regionId;
                this.updatedAt = model.updatedAt;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * capabilities.
             */
            public Builder capabilities(Capabilities capabilities) {
                this.capabilities = capabilities;
                return this;
            }

            /**
             * connectionId.
             */
            public Builder connectionId(String connectionId) {
                this.connectionId = connectionId;
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
             * createdAt.
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
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
             * modelId.
             */
            public Builder modelId(String modelId) {
                this.modelId = modelId;
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
             * regionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * updatedAt.
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            /**
             * workspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
