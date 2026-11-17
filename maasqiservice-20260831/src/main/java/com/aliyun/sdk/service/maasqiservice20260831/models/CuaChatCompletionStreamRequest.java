// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maasqiservice20260831.models;

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
 * {@link CuaChatCompletionStreamRequest} extends {@link RequestModel}
 *
 * <p>CuaChatCompletionStreamRequest</p>
 */
public class CuaChatCompletionStreamRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("X-QI-Agent-Api-Key")
    @com.aliyun.core.annotation.Validation(required = true)
    private String xQIAgentApiKey;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("X-QI-Instance-Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String xQIInstanceId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("X-QI-Request-Id")
    private String xQIRequestId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("X-QI-Session-Id")
    private String xQISessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("messages")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Messages> messages;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("metadata")
    private Metadata metadata;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("model")
    private String model;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("stream")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean stream;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("streamOptions")
    private StreamOptions streamOptions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tools")
    private java.util.List<java.util.Map<String, ?>> tools;

    private CuaChatCompletionStreamRequest(Builder builder) {
        super(builder);
        this.xQIAgentApiKey = builder.xQIAgentApiKey;
        this.xQIInstanceId = builder.xQIInstanceId;
        this.xQIRequestId = builder.xQIRequestId;
        this.xQISessionId = builder.xQISessionId;
        this.messages = builder.messages;
        this.metadata = builder.metadata;
        this.model = builder.model;
        this.stream = builder.stream;
        this.streamOptions = builder.streamOptions;
        this.tools = builder.tools;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CuaChatCompletionStreamRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return xQIAgentApiKey
     */
    public String getXQIAgentApiKey() {
        return this.xQIAgentApiKey;
    }

    /**
     * @return xQIInstanceId
     */
    public String getXQIInstanceId() {
        return this.xQIInstanceId;
    }

    /**
     * @return xQIRequestId
     */
    public String getXQIRequestId() {
        return this.xQIRequestId;
    }

    /**
     * @return xQISessionId
     */
    public String getXQISessionId() {
        return this.xQISessionId;
    }

    /**
     * @return messages
     */
    public java.util.List<Messages> getMessages() {
        return this.messages;
    }

    /**
     * @return metadata
     */
    public Metadata getMetadata() {
        return this.metadata;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return stream
     */
    public Boolean getStream() {
        return this.stream;
    }

    /**
     * @return streamOptions
     */
    public StreamOptions getStreamOptions() {
        return this.streamOptions;
    }

    /**
     * @return tools
     */
    public java.util.List<java.util.Map<String, ?>> getTools() {
        return this.tools;
    }

    public static final class Builder extends Request.Builder<CuaChatCompletionStreamRequest, Builder> {
        private String xQIAgentApiKey; 
        private String xQIInstanceId; 
        private String xQIRequestId; 
        private String xQISessionId; 
        private java.util.List<Messages> messages; 
        private Metadata metadata; 
        private String model; 
        private Boolean stream; 
        private StreamOptions streamOptions; 
        private java.util.List<java.util.Map<String, ?>> tools; 

        private Builder() {
            super();
        } 

        private Builder(CuaChatCompletionStreamRequest request) {
            super(request);
            this.xQIAgentApiKey = request.xQIAgentApiKey;
            this.xQIInstanceId = request.xQIInstanceId;
            this.xQIRequestId = request.xQIRequestId;
            this.xQISessionId = request.xQISessionId;
            this.messages = request.messages;
            this.metadata = request.metadata;
            this.model = request.model;
            this.stream = request.stream;
            this.streamOptions = request.streamOptions;
            this.tools = request.tools;
        } 

        /**
         * <p>The instance access key, which must match the instance. According to the original documentation, you can pass the original qis_ key or the Bearer format. It cannot replace the POP AK signature.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>qis_<instance_api_key></p>
         */
        public Builder xQIAgentApiKey(String xQIAgentApiKey) {
            this.putHeaderParameter("X-QI-Agent-Api-Key", xQIAgentApiKey);
            this.xQIAgentApiKey = xQIAgentApiKey;
            return this;
        }

        /**
         * <p>The ID of the target published CUA standard instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CUA_<instance_id></p>
         */
        public Builder xQIInstanceId(String xQIInstanceId) {
            this.putHeaderParameter("X-QI-Instance-Id", xQIInstanceId);
            this.xQIInstanceId = xQIInstanceId;
            return this;
        }

        /**
         * <p>The request ID. We recommend that you explicitly generate it. Reuse it for retries of the same step, and use a new ID for a new step.</p>
         * 
         * <strong>example:</strong>
         * <p>request_id</p>
         */
        public Builder xQIRequestId(String xQIRequestId) {
            this.putHeaderParameter("X-QI-Request-Id", xQIRequestId);
            this.xQIRequestId = xQIRequestId;
            return this;
        }

        /**
         * <p>The session ID. It can be omitted in the first round. In subsequent rounds, reuse the qi_session_id returned in the body.</p>
         * 
         * <strong>example:</strong>
         * <p>session-cua-1</p>
         */
        public Builder xQISessionId(String xQISessionId) {
            this.putHeaderParameter("X-QI-Session-Id", xQISessionId);
            this.xQISessionId = xQISessionId;
            return this;
        }

        /**
         * <p>The messages. In the first round, only one user message is allowed. In subsequent rounds, only one tool message followed by one user message is allowed. Exactly one screenshot is required for each step.</p>
         * <p>This parameter is required.</p>
         */
        public Builder messages(java.util.List<Messages> messages) {
            this.putBodyParameter("messages", messages);
            this.messages = messages;
            return this;
        }

        /**
         * <p>The auxiliary information of the current screenshot and the running modes supported by the service instructions.</p>
         */
        public Builder metadata(Metadata metadata) {
            this.putBodyParameter("metadata", metadata);
            this.metadata = metadata;
            return this;
        }

        /**
         * <p>The model. This is a compatibility field. You can omit it or pass an empty string. The actual model is determined by the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder model(String model) {
            this.putBodyParameter("model", model);
            this.model = model;
            return this;
        }

        /**
         * <p>Specifies whether to enable streaming. Set this parameter to true for this SSE API operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder stream(Boolean stream) {
            this.putBodyParameter("stream", stream);
            this.stream = stream;
            return this;
        }

        /**
         * <p>The SSE settings.</p>
         */
        public Builder streamOptions(StreamOptions streamOptions) {
            this.putBodyParameter("streamOptions", streamOptions);
            this.streamOptions = streamOptions;
            return this;
        }

        /**
         * <p>The tools. You can only omit this parameter or pass an empty array. CUA uses the fixed computer_use tool, and custom tools are not allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder tools(java.util.List<java.util.Map<String, ?>> tools) {
            this.putBodyParameter("tools", tools);
            this.tools = tools;
            return this;
        }

        @Override
        public CuaChatCompletionStreamRequest build() {
            return new CuaChatCompletionStreamRequest(this);
        } 

    } 

    /**
     * 
     * {@link CuaChatCompletionStreamRequest} extends {@link TeaModel}
     *
     * <p>CuaChatCompletionStreamRequest</p>
     */
    public static class ImageUrl extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("url")
        @com.aliyun.core.annotation.Validation(required = true)
        private String url;

        private ImageUrl(Builder builder) {
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageUrl create() {
            return builder().build();
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String url; 

            private Builder() {
            } 

            private Builder(ImageUrl model) {
                this.url = model.url;
            } 

            /**
             * <p>The accessible HTTP(S) URL or complete image data URL. HTTPS is recommended.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>data:image/jpeg;base64,<BASE64_OF_CURRENT_SCREENSHOT></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public ImageUrl build() {
                return new ImageUrl(this);
            } 

        } 

    }
    /**
     * 
     * {@link CuaChatCompletionStreamRequest} extends {@link TeaModel}
     *
     * <p>CuaChatCompletionStreamRequest</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("imageData")
        private String imageData;

        @com.aliyun.core.annotation.NameInMap("imageUrl")
        private ImageUrl imageUrl;

        @com.aliyun.core.annotation.NameInMap("text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private Content(Builder builder) {
            this.imageData = builder.imageData;
            this.imageUrl = builder.imageUrl;
            this.text = builder.text;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return imageData
         */
        public String getImageData() {
            return this.imageData;
        }

        /**
         * @return imageUrl
         */
        public ImageUrl getImageUrl() {
            return this.imageUrl;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String imageData; 
            private ImageUrl imageUrl; 
            private String text; 
            private String type; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.imageData = model.imageData;
                this.imageUrl = model.imageUrl;
                this.text = model.text;
                this.type = model.type;
            } 

            /**
             * <p>The compatibility field for input_image. It uses a complete Base64 image data URL. Raw Base64 without a prefix is not accepted.</p>
             * 
             * <strong>example:</strong>
             * <p>data:image/png;base64,<IMAGE_BASE64></p>
             */
            public Builder imageData(String imageData) {
                this.imageData = imageData;
                return this;
            }

            /**
             * <p>The screenshot reference. The URL object format is recommended. The backend is also compatible with the image_url string.</p>
             */
            public Builder imageUrl(ImageUrl imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * <p>The text content. In the first round, the user must provide a non-empty task objective. For the tool role, enter the actual execution result.</p>
             * 
             * <strong>example:</strong>
             * <p>Observe the desktop, open the browser, and find the settings page</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * <p>The content type. For text, use text or input_text. For screenshots, use image_url or input_image.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>image_url</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
    /**
     * 
     * {@link CuaChatCompletionStreamRequest} extends {@link TeaModel}
     *
     * <p>CuaChatCompletionStreamRequest</p>
     */
    public static class Messages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<Content> content;

        @com.aliyun.core.annotation.NameInMap("role")
        @com.aliyun.core.annotation.Validation(required = true)
        private String role;

        @com.aliyun.core.annotation.NameInMap("toolCallId")
        private String toolCallId;

        private Messages(Builder builder) {
            this.content = builder.content;
            this.role = builder.role;
            this.toolCallId = builder.toolCallId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Messages create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public java.util.List<Content> getContent() {
            return this.content;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return toolCallId
         */
        public String getToolCallId() {
            return this.toolCallId;
        }

        public static final class Builder {
            private java.util.List<Content> content; 
            private String role; 
            private String toolCallId; 

            private Builder() {
            } 

            private Builder(Messages model) {
                this.content = model.content;
                this.role = model.role;
                this.toolCallId = model.toolCallId;
            } 

            /**
             * <p>The message content. The user role uses a multimodal array. The tool role supports an array of text items, a non-empty string, or an object to return execution results.</p>
             * <p>This parameter is required.</p>
             */
            public Builder content(java.util.List<Content> content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The role of the message. Only user and tool are supported. Do not pass system, assistant, or complete history.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>user</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>The tool call ID. This parameter is required when role is set to tool. It must be equal to the computer_use call ID returned in the previous step of the same session.</p>
             * 
             * <strong>example:</strong>
             * <p>call_ID_RETURNED_IN_THE_PREVIOUS_ROUND</p>
             */
            public Builder toolCallId(String toolCallId) {
                this.toolCallId = toolCallId;
                return this;
            }

            public Messages build() {
                return new Messages(this);
            } 

        } 

    }
    /**
     * 
     * {@link CuaChatCompletionStreamRequest} extends {@link TeaModel}
     *
     * <p>CuaChatCompletionStreamRequest</p>
     */
    public static class Metadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("actionMode")
        private String actionMode;

        @com.aliyun.core.annotation.NameInMap("screenHeight")
        private Integer screenHeight;

        @com.aliyun.core.annotation.NameInMap("screenWidth")
        private Integer screenWidth;

        private Metadata(Builder builder) {
            this.actionMode = builder.actionMode;
            this.screenHeight = builder.screenHeight;
            this.screenWidth = builder.screenWidth;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Metadata create() {
            return builder().build();
        }

        /**
         * @return actionMode
         */
        public String getActionMode() {
            return this.actionMode;
        }

        /**
         * @return screenHeight
         */
        public Integer getScreenHeight() {
            return this.screenHeight;
        }

        /**
         * @return screenWidth
         */
        public Integer getScreenWidth() {
            return this.screenWidth;
        }

        public static final class Builder {
            private String actionMode; 
            private Integer screenHeight; 
            private Integer screenWidth; 

            private Builder() {
            } 

            private Builder(Metadata model) {
                this.actionMode = model.actionMode;
                this.screenHeight = model.screenHeight;
                this.screenWidth = model.screenWidth;
            } 

            /**
             * <p>The action mode. Valid values: gui-only and gui+cli. This parameter is case-sensitive and fixed within a session, and is supplemented by subsequent service instructions.</p>
             * 
             * <strong>example:</strong>
             * <p>gui-only / gui+cli</p>
             */
            public Builder actionMode(String actionMode) {
                this.actionMode = actionMode;
                return this;
            }

            /**
             * <p>The pixel height of the uploaded screenshot. If provided, it must be a positive integer.</p>
             * 
             * <strong>example:</strong>
             * <p>1080</p>
             */
            public Builder screenHeight(Integer screenHeight) {
                this.screenHeight = screenHeight;
                return this;
            }

            /**
             * <p>The pixel width of the uploaded screenshot. If provided, it must be a positive integer.</p>
             * 
             * <strong>example:</strong>
             * <p>1920</p>
             */
            public Builder screenWidth(Integer screenWidth) {
                this.screenWidth = screenWidth;
                return this;
            }

            public Metadata build() {
                return new Metadata(this);
            } 

        } 

    }
    /**
     * 
     * {@link CuaChatCompletionStreamRequest} extends {@link TeaModel}
     *
     * <p>CuaChatCompletionStreamRequest</p>
     */
    public static class StreamOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("includeUsage")
        private Boolean includeUsage;

        private StreamOptions(Builder builder) {
            this.includeUsage = builder.includeUsage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StreamOptions create() {
            return builder().build();
        }

        /**
         * @return includeUsage
         */
        public Boolean getIncludeUsage() {
            return this.includeUsage;
        }

        public static final class Builder {
            private Boolean includeUsage; 

            private Builder() {
            } 

            private Builder(StreamOptions model) {
                this.includeUsage = model.includeUsage;
            } 

            /**
             * <p>Specifies whether to return an independent usage event before the end marker. If set to true, an independent usage event is returned, and choices is an empty array.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder includeUsage(Boolean includeUsage) {
                this.includeUsage = includeUsage;
                return this;
            }

            public StreamOptions build() {
                return new StreamOptions(this);
            } 

        } 

    }
}
