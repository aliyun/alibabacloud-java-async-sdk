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
 * {@link CreateModelRequest} extends {@link RequestModel}
 *
 * <p>CreateModelRequest</p>
 */
public class CreateModelRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private CreateModelRequestBody body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private CreateModelRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.body = builder.body;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateModelRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return body
     */
    public CreateModelRequestBody getBody() {
        return this.body;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<CreateModelRequest, Builder> {
        private String workspaceId; 
        private CreateModelRequestBody body; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(CreateModelRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.body = request.body;
            this.clientToken = request.clientToken;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-1</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * body.
         */
        public Builder body(CreateModelRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public CreateModelRequest build() {
            return new CreateModelRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateModelRequest} extends {@link TeaModel}
     *
     * <p>CreateModelRequest</p>
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
     * {@link CreateModelRequest} extends {@link TeaModel}
     *
     * <p>CreateModelRequest</p>
     */
    public static class CreateModelRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("capabilities")
        private Capabilities capabilities;

        @com.aliyun.core.annotation.NameInMap("connectionId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String connectionId;

        @com.aliyun.core.annotation.NameInMap("contextSize")
        private Long contextSize;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("maxTokens")
        private Long maxTokens;

        @com.aliyun.core.annotation.NameInMap("modelName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String modelName;

        private CreateModelRequestBody(Builder builder) {
            this.capabilities = builder.capabilities;
            this.connectionId = builder.connectionId;
            this.contextSize = builder.contextSize;
            this.description = builder.description;
            this.maxTokens = builder.maxTokens;
            this.modelName = builder.modelName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateModelRequestBody create() {
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
         * @return modelName
         */
        public String getModelName() {
            return this.modelName;
        }

        public static final class Builder {
            private Capabilities capabilities; 
            private String connectionId; 
            private Long contextSize; 
            private String description; 
            private Long maxTokens; 
            private String modelName; 

            private Builder() {
            } 

            private Builder(CreateModelRequestBody model) {
                this.capabilities = model.capabilities;
                this.connectionId = model.connectionId;
                this.contextSize = model.contextSize;
                this.description = model.description;
                this.maxTokens = model.maxTokens;
                this.modelName = model.modelName;
            } 

            /**
             * capabilities.
             */
            public Builder capabilities(Capabilities capabilities) {
                this.capabilities = capabilities;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>mc-1</p>
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen-max</p>
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            public CreateModelRequestBody build() {
                return new CreateModelRequestBody(this);
            } 

        } 

    }
}
