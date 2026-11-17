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
 * {@link AigcChatCompletionStreamRequest} extends {@link RequestModel}
 *
 * <p>AigcChatCompletionStreamRequest</p>
 */
public class AigcChatCompletionStreamRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("X-QI-Agent-Api-Key")
    @com.aliyun.core.annotation.Validation(required = true)
    private String xQIAgentApiKey;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("X-QI-Instance-Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String xQIInstanceId;

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

    private AigcChatCompletionStreamRequest(Builder builder) {
        super(builder);
        this.xQIAgentApiKey = builder.xQIAgentApiKey;
        this.xQIInstanceId = builder.xQIInstanceId;
        this.xQISessionId = builder.xQISessionId;
        this.messages = builder.messages;
        this.metadata = builder.metadata;
        this.model = builder.model;
        this.stream = builder.stream;
        this.streamOptions = builder.streamOptions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AigcChatCompletionStreamRequest create() {
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

    public static final class Builder extends Request.Builder<AigcChatCompletionStreamRequest, Builder> {
        private String xQIAgentApiKey; 
        private String xQIInstanceId; 
        private String xQISessionId; 
        private java.util.List<Messages> messages; 
        private Metadata metadata; 
        private String model; 
        private Boolean stream; 
        private StreamOptions streamOptions; 

        private Builder() {
            super();
        } 

        private Builder(AigcChatCompletionStreamRequest request) {
            super(request);
            this.xQIAgentApiKey = request.xQIAgentApiKey;
            this.xQIInstanceId = request.xQIInstanceId;
            this.xQISessionId = request.xQISessionId;
            this.messages = request.messages;
            this.metadata = request.metadata;
            this.model = request.model;
            this.stream = request.stream;
            this.streamOptions = request.streamOptions;
        } 

        /**
         * <p>The instance access key. It must belong to the Creative Agent instance being called. This key is different from the AccessKey Secret used for OpenAPI signatures. Do not disclose it.</p>
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
         * <p>The published Creative Agent instance ID. It must correspond to X-QI-Agent-Api-Key.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AIGC_xxx</p>
         */
        public Builder xQIInstanceId(String xQIInstanceId) {
            this.putHeaderParameter("X-QI-Instance-Id", xQIInstanceId);
            this.xQIInstanceId = xQIInstanceId;
            return this;
        }

        /**
         * <p>The session ID. You can omit it in the first turn. Obtain it from the qi_session_id field in the SSE response and pass it back in subsequent turns. Use letters, digits, periods, underscores, colons, or hyphens, with a maximum length of 128 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>session-xxx</p>
         */
        public Builder xQISessionId(String xQISessionId) {
            this.putHeaderParameter("X-QI-Session-Id", xQISessionId);
            this.xQISessionId = xQISessionId;
            return this;
        }

        /**
         * <p>The conversation message array. Creative Agent uses the last user message as the current objective and executes it in combination with the session history.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;role&quot;:&quot;user&quot;,&quot;content&quot;:&quot;Generate an ink wash landscape painting&quot;}]</p>
         */
        public Builder messages(java.util.List<Messages> messages) {
            this.putBodyParameter("messages", messages);
            this.messages = messages;
            return this;
        }

        /**
         * <p>The extended input for the current image creation. Use the parameters object to set generation parameters. Do not use it to pass model addresses or keys.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;parameters&quot;:{&quot;size&quot;:&quot;1024*1024&quot;,&quot;n&quot;:1}}</p>
         */
        public Builder metadata(Metadata metadata) {
            this.putBodyParameter("metadata", metadata);
            this.metadata = metadata;
            return this;
        }

        /**
         * <p>A compatibility placeholder field. You can omit it or pass an empty string. You cannot use this field to switch the model used by the instance. The model field in the response is an empty string.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot; &quot;</p>
         */
        public Builder model(String model) {
            this.putBodyParameter("model", model);
            this.model = model;
            return this;
        }

        /**
         * <p>Specifies whether to use SSE streaming responses. You must set this parameter to true for this operation.</p>
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
         * <p>The HTTP JSON key is stream_options. Set include_usage to obtain the token usage for the current call.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;include_usage&quot;:true}</p>
         */
        public Builder streamOptions(StreamOptions streamOptions) {
            this.putBodyParameter("streamOptions", streamOptions);
            this.streamOptions = streamOptions;
            return this;
        }

        @Override
        public AigcChatCompletionStreamRequest build() {
            return new AigcChatCompletionStreamRequest(this);
        } 

    } 

    /**
     * 
     * {@link AigcChatCompletionStreamRequest} extends {@link TeaModel}
     *
     * <p>AigcChatCompletionStreamRequest</p>
     */
    public static class ImageUrl extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("url")
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
             * <p>The publicly accessible HTTPS URL of the reference image, or a complete Base64 image data URL (such as data:image/png;base64,...). Signed URLs must be valid during request execution. For expired or unauthorized images, you must re-upload them or update the links.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/input.png">https://example.com/input.png</a></p>
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
     * {@link AigcChatCompletionStreamRequest} extends {@link TeaModel}
     *
     * <p>AigcChatCompletionStreamRequest</p>
     */
    public static class VideoUrl extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private VideoUrl(Builder builder) {
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoUrl create() {
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

            private Builder(VideoUrl model) {
                this.url = model.url;
            } 

            /**
             * <p>The video URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/input.mp4">https://example.com/input.mp4</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public VideoUrl build() {
                return new VideoUrl(this);
            } 

        } 

    }
    /**
     * 
     * {@link AigcChatCompletionStreamRequest} extends {@link TeaModel}
     *
     * <p>AigcChatCompletionStreamRequest</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("imageUrl")
        private ImageUrl imageUrl;

        @com.aliyun.core.annotation.NameInMap("text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("videoUrl")
        private VideoUrl videoUrl;

        private Content(Builder builder) {
            this.imageUrl = builder.imageUrl;
            this.text = builder.text;
            this.type = builder.type;
            this.videoUrl = builder.videoUrl;
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

        /**
         * @return videoUrl
         */
        public VideoUrl getVideoUrl() {
            return this.videoUrl;
        }

        public static final class Builder {
            private ImageUrl imageUrl; 
            private String text; 
            private String type; 
            private VideoUrl videoUrl; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.imageUrl = model.imageUrl;
                this.text = model.text;
                this.type = model.type;
                this.videoUrl = model.videoUrl;
            } 

            /**
             * <p>The reference image when type is image_url. HTTPS URLs or Base64 data URLs are supported.</p>
             */
            public Builder imageUrl(ImageUrl imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * <p>The generation or editing objective when type is text.</p>
             * 
             * <strong>example:</strong>
             * <p>Change the background of the reference image to a seaside sunset</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * <p>The content part type: text, image_url, or video_url.</p>
             * 
             * <strong>example:</strong>
             * <p>text</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The video input when type is video_url. Only the Planner of the dedicated edition of Creative Agent accepts it. The lite edition of Creative Agent rejects it.</p>
             */
            public Builder videoUrl(VideoUrl videoUrl) {
                this.videoUrl = videoUrl;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
    /**
     * 
     * {@link AigcChatCompletionStreamRequest} extends {@link TeaModel}
     *
     * <p>AigcChatCompletionStreamRequest</p>
     */
    public static class Messages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private java.util.List<Content> content;

        @com.aliyun.core.annotation.NameInMap("role")
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
             * <p>The message content. You can pass text. A multimodal array can contain text, image_url, or video_url. The lite edition of Creative Agent performs image-to-image generation when a reference image is provided and text-to-image generation when no reference image is provided. It does not accept videos.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;type&quot;:&quot;text&quot;,&quot;text&quot;:&quot;Generate a night view of a futuristic city after rain&quot;}]</p>
             */
            public Builder content(java.util.List<Content> content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The message role. Place the current generation objective in a user message. The history can include user, assistant, and tool messages.</p>
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
    /**
     * 
     * {@link AigcChatCompletionStreamRequest} extends {@link TeaModel}
     *
     * <p>AigcChatCompletionStreamRequest</p>
     */
    public static class Parameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("guidanceScale")
        private Double guidanceScale;

        @com.aliyun.core.annotation.NameInMap("n")
        private Long n;

        @com.aliyun.core.annotation.NameInMap("negativePrompt")
        private String negativePrompt;

        @com.aliyun.core.annotation.NameInMap("numInferenceSteps")
        private Long numInferenceSteps;

        @com.aliyun.core.annotation.NameInMap("seed")
        private Long seed;

        @com.aliyun.core.annotation.NameInMap("size")
        private String size;

        private Parameters(Builder builder) {
            this.guidanceScale = builder.guidanceScale;
            this.n = builder.n;
            this.negativePrompt = builder.negativePrompt;
            this.numInferenceSteps = builder.numInferenceSteps;
            this.seed = builder.seed;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameters create() {
            return builder().build();
        }

        /**
         * @return guidanceScale
         */
        public Double getGuidanceScale() {
            return this.guidanceScale;
        }

        /**
         * @return n
         */
        public Long getN() {
            return this.n;
        }

        /**
         * @return negativePrompt
         */
        public String getNegativePrompt() {
            return this.negativePrompt;
        }

        /**
         * @return numInferenceSteps
         */
        public Long getNumInferenceSteps() {
            return this.numInferenceSteps;
        }

        /**
         * @return seed
         */
        public Long getSeed() {
            return this.seed;
        }

        /**
         * @return size
         */
        public String getSize() {
            return this.size;
        }

        public static final class Builder {
            private Double guidanceScale; 
            private Long n; 
            private String negativePrompt; 
            private Long numInferenceSteps; 
            private Long seed; 
            private String size; 

            private Builder() {
            } 

            private Builder(Parameters model) {
                this.guidanceScale = model.guidanceScale;
                this.n = model.n;
                this.negativePrompt = model.negativePrompt;
                this.numInferenceSteps = model.numInferenceSteps;
                this.seed = model.seed;
                this.size = model.size;
            } 

            /**
             * <p>The guidance scale, which must be a finite number from 0 to 20.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder guidanceScale(Double guidanceScale) {
                this.guidanceScale = guidanceScale;
                return this;
            }

            /**
             * <p>The number of images to generate for the current request, which must be an integer from 1 to 6.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder n(Long n) {
                this.n = n;
                return this;
            }

            /**
             * <p>The negative prompt, which is used to describe content that you do not want to appear in the results.</p>
             * 
             * <strong>example:</strong>
             * <p>Low quality, blurry, text, watermark</p>
             */
            public Builder negativePrompt(String negativePrompt) {
                this.negativePrompt = negativePrompt;
                return this;
            }

            /**
             * <p>The number of model inference iterations, which must be an integer from 1 to 200.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder numInferenceSteps(Long numInferenceSteps) {
                this.numInferenceSteps = numInferenceSteps;
                return this;
            }

            /**
             * <p>The random seed, which must be an integer from 0 to 2147483647.</p>
             * 
             * <strong>example:</strong>
             * <p>42</p>
             */
            public Builder seed(Long seed) {
                this.seed = seed;
                return this;
            }

            /**
             * <p>The output pixel size, such as 1024<em>1024 or 1280</em>720. 1024x1024 is also accepted. Specifying this parameter overrides the default aspect ratio size for the current request. Use the width and height supported by the model.</p>
             * 
             * <strong>example:</strong>
             * <p>1024*1024</p>
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            public Parameters build() {
                return new Parameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link AigcChatCompletionStreamRequest} extends {@link TeaModel}
     *
     * <p>AigcChatCompletionStreamRequest</p>
     */
    public static class Metadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("parameters")
        private Parameters parameters;

        private Metadata(Builder builder) {
            this.parameters = builder.parameters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Metadata create() {
            return builder().build();
        }

        /**
         * @return parameters
         */
        public Parameters getParameters() {
            return this.parameters;
        }

        public static final class Builder {
            private Parameters parameters; 

            private Builder() {
            } 

            private Builder(Metadata model) {
                this.parameters = model.parameters;
            } 

            /**
             * <p>The image parameters for the current request. Only size, n, seed, negative_prompt, num_inference_steps, and guidance_scale are supported. Omitted fields use the default configurations. response_format is not supported.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;size&quot;:&quot;1024*1024&quot;,&quot;n&quot;:1,&quot;num_inference_steps&quot;:8}</p>
             */
            public Builder parameters(Parameters parameters) {
                this.parameters = parameters;
                return this;
            }

            public Metadata build() {
                return new Metadata(this);
            } 

        } 

    }
    /**
     * 
     * {@link AigcChatCompletionStreamRequest} extends {@link TeaModel}
     *
     * <p>AigcChatCompletionStreamRequest</p>
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
             * <p>The HTTP JSON key is include_usage. When set to true, an independent usage block is returned before the end marker, and its choices field is an empty array. Token usage does not represent the number of images or the final bill.</p>
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
