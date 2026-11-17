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
 * {@link CameraChatCompletionStreamRequest} extends {@link RequestModel}
 *
 * <p>CameraChatCompletionStreamRequest</p>
 */
public class CameraChatCompletionStreamRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("X-QI-Agent-Api-Key")
    @com.aliyun.core.annotation.Validation(required = true)
    private String xQIAgentApiKey;

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
    @com.aliyun.core.annotation.NameInMap("sceneId")
    private String sceneId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("stream")
    private Boolean stream;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-QI-Instance-Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String xQIInstanceId;

    private CameraChatCompletionStreamRequest(Builder builder) {
        super(builder);
        this.xQIAgentApiKey = builder.xQIAgentApiKey;
        this.xQIRequestId = builder.xQIRequestId;
        this.xQISessionId = builder.xQISessionId;
        this.messages = builder.messages;
        this.sceneId = builder.sceneId;
        this.stream = builder.stream;
        this.xQIInstanceId = builder.xQIInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CameraChatCompletionStreamRequest create() {
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
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    /**
     * @return stream
     */
    public Boolean getStream() {
        return this.stream;
    }

    /**
     * @return xQIInstanceId
     */
    public String getXQIInstanceId() {
        return this.xQIInstanceId;
    }

    public static final class Builder extends Request.Builder<CameraChatCompletionStreamRequest, Builder> {
        private String xQIAgentApiKey; 
        private String xQIRequestId; 
        private String xQISessionId; 
        private java.util.List<Messages> messages; 
        private String sceneId; 
        private Boolean stream; 
        private String xQIInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(CameraChatCompletionStreamRequest request) {
            super(request);
            this.xQIAgentApiKey = request.xQIAgentApiKey;
            this.xQIRequestId = request.xQIRequestId;
            this.xQISessionId = request.xQISessionId;
            this.messages = request.messages;
            this.sceneId = request.sceneId;
            this.stream = request.stream;
            this.xQIInstanceId = request.xQIInstanceId;
        } 

        /**
         * <p>The access key of the specified Camera instance. Provide the raw value without the Bearer prefix. This key is not an AccessKey secret and cannot replace an OpenAPI signature.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>qis_xxx</p>
         */
        public Builder xQIAgentApiKey(String xQIAgentApiKey) {
            this.putHeaderParameter("X-QI-Agent-Api-Key", xQIAgentApiKey);
            this.xQIAgentApiKey = xQIAgentApiKey;
            return this;
        }

        /**
         * <p>The request ID. A trusted POP ID is preferred. If no trusted POP ID is available, this header is required. The <code>requestId</code> field in the request body is not accepted. For the format and retry rules, refer to the supplementary instructions.</p>
         * 
         * <strong>example:</strong>
         * <p>camera-request-001</p>
         */
        public Builder xQIRequestId(String xQIRequestId) {
            this.putHeaderParameter("X-QI-Request-Id", xQIRequestId);
            this.xQIRequestId = xQIRequestId;
            return this;
        }

        /**
         * <p>The optional session ID. If omitted, a session ID is generated. Reuse the original value for continuation and successful replay. For the format and retrieval method, refer to the supplementary instructions.</p>
         * 
         * <strong>example:</strong>
         * <p>camera-session-001</p>
         */
        public Builder xQISessionId(String xQISessionId) {
            this.putHeaderParameter("X-QI-Session-Id", xQISessionId);
            this.xQISessionId = xQISessionId;
            return this;
        }

        /**
         * <p>Required. Provide only one <code>role=user</code> message and one image. Multiple images, custom text, and videos are not supported, and you cannot invoke tools.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;role&quot;:&quot;user&quot;,&quot;content&quot;:[{&quot;type&quot;:&quot;image_url&quot;,&quot;image_url&quot;:{&quot;url&quot;:&quot;<a href="https://example.com/images/person.jpg%22%7D%7D%5D%7D%5D">https://example.com/images/person.jpg&quot;}}]}]</a></p>
         */
        public Builder messages(java.util.List<Messages> messages) {
            this.putBodyParameter("messages", messages);
            this.messages = messages;
            return this;
        }

        /**
         * <p>The HTTP JSON key is <code>scene_id</code>. Required for person recognition. The value must be non-empty, contain no leading or trailing whitespace, and be up to 50 characters in length. Reuse the same scene for person recognition. Omit this field for food recognition.</p>
         * 
         * <strong>example:</strong>
         * <p>meeting-room-001</p>
         */
        public Builder sceneId(String sceneId) {
            this.putBodyParameter("sceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        /**
         * <p>Specifies whether to return an SSE response. If set to <code>true</code>, an SSE response is returned. If set to <code>false</code> or omitted, a complete JSON detection result is returned. SSE transmits the final result and does not output token by token.</p>
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
         * <p>The ID of the published CameraStandard instance. This ID must correspond to the <code>X-QI-Agent-Api-Key</code> header. The recognition scene, model, and thresholds are derived from the published configuration of this instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CAMERA_xxx</p>
         */
        public Builder xQIInstanceId(String xQIInstanceId) {
            this.putHeaderParameter("x-QI-Instance-Id", xQIInstanceId);
            this.xQIInstanceId = xQIInstanceId;
            return this;
        }

        @Override
        public CameraChatCompletionStreamRequest build() {
            return new CameraChatCompletionStreamRequest(this);
        } 

    } 

    /**
     * 
     * {@link CameraChatCompletionStreamRequest} extends {@link TeaModel}
     *
     * <p>CameraChatCompletionStreamRequest</p>
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
             * <p>A publicly accessible HTTPS URL or a complete Base64 image data URL. Signed URLs must remain valid during execution. Both the image and the request body are subject to size limits. Use a URL for large images.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/images/person.jpg">https://example.com/images/person.jpg</a></p>
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
     * {@link CameraChatCompletionStreamRequest} extends {@link TeaModel}
     *
     * <p>CameraChatCompletionStreamRequest</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("imageUrl")
        @com.aliyun.core.annotation.Validation(required = true)
        private ImageUrl imageUrl;

        @com.aliyun.core.annotation.NameInMap("type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private Content(Builder builder) {
            this.imageUrl = builder.imageUrl;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return imageUrl
         */
        public ImageUrl getImageUrl() {
            return this.imageUrl;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private ImageUrl imageUrl; 
            private String type; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.imageUrl = model.imageUrl;
                this.type = model.type;
            } 

            /**
             * <p>The HTTP JSON key is <code>image_url</code>. Required. Contains the <code>url</code> field for the image address.</p>
             * <p>This parameter is required.</p>
             */
            public Builder imageUrl(ImageUrl imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * <p>Required. Fixed to <code>image_url</code>.</p>
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
     * {@link CameraChatCompletionStreamRequest} extends {@link TeaModel}
     *
     * <p>CameraChatCompletionStreamRequest</p>
     */
    public static class Messages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<Content> content;

        @com.aliyun.core.annotation.NameInMap("role")
        @com.aliyun.core.annotation.Validation(required = true)
        private String role;

        private Messages(Builder builder) {
            this.content = builder.content;
            this.role = builder.role;
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

        public static final class Builder {
            private java.util.List<Content> content; 
            private String role; 

            private Builder() {
            } 

            private Builder(Messages model) {
                this.content = model.content;
                this.role = model.role;
            } 

            /**
             * <p>Required. Contains one <code>image_url</code> image. Do not place custom recognition prompts here.</p>
             * <p>This parameter is required.</p>
             */
            public Builder content(java.util.List<Content> content) {
                this.content = content;
                return this;
            }

            /**
             * <p>Required. Fixed to <code>user</code>.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>user</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            public Messages build() {
                return new Messages(this);
            } 

        } 

    }
}
