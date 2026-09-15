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
 * {@link UpdateModelRequest} extends {@link RequestModel}
 *
 * <p>UpdateModelRequest</p>
 */
public class UpdateModelRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("modelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateModelRequestBody body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private UpdateModelRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.modelId = builder.modelId;
        this.body = builder.body;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateModelRequest create() {
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
     * @return modelId
     */
    public String getModelId() {
        return this.modelId;
    }

    /**
     * @return body
     */
    public UpdateModelRequestBody getBody() {
        return this.body;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<UpdateModelRequest, Builder> {
        private String workspaceId; 
        private String modelId; 
        private UpdateModelRequestBody body; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(UpdateModelRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.modelId = request.modelId;
            this.body = request.body;
            this.clientToken = request.clientToken;
        } 

        /**
         * <p>The workspace ID.</p>
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
         * <p>The model ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>model-1</p>
         */
        public Builder modelId(String modelId) {
            this.putPathParameter("modelId", modelId);
            this.modelId = modelId;
            return this;
        }

        /**
         * <p>The model update request body. At least one non-null parameter must be provided among description, contextSize, maxTokens, and capabilities.</p>
         */
        public Builder body(UpdateModelRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        /**
         * <p>The client token for idempotency. Not currently supported.</p>
         * 
         * <strong>example:</strong>
         * <p>client-token-1</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public UpdateModelRequest build() {
            return new UpdateModelRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateModelRequest} extends {@link TeaModel}
     *
     * <p>UpdateModelRequest</p>
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
             * <p>Specifies whether the model supports audio input or output. A value of true indicates that it is supported. A value of false indicates that it is not supported.</p>
             */
            public Builder audio(Boolean audio) {
                this.audio = audio;
                return this;
            }

            /**
             * <p>Specifies whether the model supports document input. A value of true indicates that it is supported. A value of false indicates that it is not supported.</p>
             */
            public Builder document(Boolean document) {
                this.document = document;
                return this;
            }

            /**
             * <p>Specifies whether the model supports invoking multiple tools in a single response. A value of true indicates that it is supported. A value of false indicates that it is not supported.</p>
             */
            public Builder multiToolCall(Boolean multiToolCall) {
                this.multiToolCall = multiToolCall;
                return this;
            }

            /**
             * <p>Specifies whether the model supports reasoning. A value of true indicates that it is supported. A value of false indicates that it is not supported. This field is a capability marker and is not used to set reasoning intensity or reasoning token budget.</p>
             */
            public Builder reasoning(Boolean reasoning) {
                this.reasoning = reasoning;
                return this;
            }

            /**
             * <p>Specifies whether the model supports streaming tool invocation. A value of true indicates that it is supported. A value of false indicates that it is not supported.</p>
             */
            public Builder streamToolCall(Boolean streamToolCall) {
                this.streamToolCall = streamToolCall;
                return this;
            }

            /**
             * <p>Specifies whether the model supports tool invocation. A value of true indicates that it is supported. A value of false indicates that it is not supported.</p>
             */
            public Builder toolCall(Boolean toolCall) {
                this.toolCall = toolCall;
                return this;
            }

            /**
             * <p>Specifies whether the model supports video input. A value of true indicates that it is supported. A value of false indicates that it is not supported.</p>
             */
            public Builder video(Boolean video) {
                this.video = video;
                return this;
            }

            /**
             * <p>Specifies whether the model supports image input. A value of true indicates that it is supported. A value of false indicates that it is not supported.</p>
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
     * {@link UpdateModelRequest} extends {@link TeaModel}
     *
     * <p>UpdateModelRequest</p>
     */
    public static class UpdateModelRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("capabilities")
        private Capabilities capabilities;

        @com.aliyun.core.annotation.NameInMap("contextSize")
        private Long contextSize;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("maxTokens")
        private Long maxTokens;

        private UpdateModelRequestBody(Builder builder) {
            this.capabilities = builder.capabilities;
            this.contextSize = builder.contextSize;
            this.description = builder.description;
            this.maxTokens = builder.maxTokens;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateModelRequestBody create() {
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

        public static final class Builder {
            private Capabilities capabilities; 
            private Long contextSize; 
            private String description; 
            private Long maxTokens; 

            private Builder() {
            } 

            private Builder(UpdateModelRequestBody model) {
                this.capabilities = model.capabilities;
                this.contextSize = model.contextSize;
                this.description = model.description;
                this.maxTokens = model.maxTokens;
            } 

            /**
             * <p>The model capability configuration. When an object is provided, it replaces the existing capability configuration as a whole. Capability fields not included in the object are treated as false. Providing an empty object {} sets all capabilities to false. If this parameter is not provided or set to null, the original configuration is retained.</p>
             */
            public Builder capabilities(Capabilities capabilities) {
                this.capabilities = capabilities;
                return this;
            }

            /**
             * <p>The context token limit of the model. The minimum value is 1000. The updated value must not be less than maxTokens. If maxTokens is not provided in this request, the existing value is used for validation. If this parameter is not provided or set to null, the original value is retained.</p>
             * 
             * <strong>example:</strong>
             * <p>131072</p>
             */
            public Builder contextSize(Long contextSize) {
                this.contextSize = contextSize;
                return this;
            }

            /**
             * <p>The model description. The maximum length is 255 characters after leading and trailing whitespace is removed. Providing an empty string clears the description. If this parameter is not provided or set to null, the original value is retained. Modifying only the description does not refresh the model configuration of associated Agents.</p>
             * 
             * <strong>example:</strong>
             * <p>description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The maximum number of output tokens per generation. The value must be a positive integer. If contextSize is configured, the updated maxTokens must not exceed contextSize. If contextSize is not provided in this request, the existing value is used for validation. If this parameter is not provided or set to null, the original value is retained.</p>
             * 
             * <strong>example:</strong>
             * <p>8192</p>
             */
            public Builder maxTokens(Long maxTokens) {
                this.maxTokens = maxTokens;
                return this;
            }

            public UpdateModelRequestBody build() {
                return new UpdateModelRequestBody(this);
            } 

        } 

    }
}
