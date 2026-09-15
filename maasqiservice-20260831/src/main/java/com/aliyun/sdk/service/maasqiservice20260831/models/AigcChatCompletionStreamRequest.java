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
         * X-QI-Session-Id.
         */
        public Builder xQISessionId(String xQISessionId) {
            this.putHeaderParameter("X-QI-Session-Id", xQISessionId);
            this.xQISessionId = xQISessionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;role&quot;:&quot;user&quot;,&quot;content&quot;:&quot;生成一张水墨山水画&quot;}]</p>
         */
        public Builder messages(java.util.List<Messages> messages) {
            this.putBodyParameter("messages", messages);
            this.messages = messages;
            return this;
        }

        /**
         * metadata.
         */
        public Builder metadata(Metadata metadata) {
            this.putBodyParameter("metadata", metadata);
            this.metadata = metadata;
            return this;
        }

        /**
         * model.
         */
        public Builder model(String model) {
            this.putBodyParameter("model", model);
            this.model = model;
            return this;
        }

        /**
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
         * streamOptions.
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
             * url.
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
             * url.
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
             * imageUrl.
             */
            public Builder imageUrl(ImageUrl imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * videoUrl.
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
             * content.
             */
            public Builder content(java.util.List<Content> content) {
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
             * guidanceScale.
             */
            public Builder guidanceScale(Double guidanceScale) {
                this.guidanceScale = guidanceScale;
                return this;
            }

            /**
             * n.
             */
            public Builder n(Long n) {
                this.n = n;
                return this;
            }

            /**
             * negativePrompt.
             */
            public Builder negativePrompt(String negativePrompt) {
                this.negativePrompt = negativePrompt;
                return this;
            }

            /**
             * numInferenceSteps.
             */
            public Builder numInferenceSteps(Long numInferenceSteps) {
                this.numInferenceSteps = numInferenceSteps;
                return this;
            }

            /**
             * seed.
             */
            public Builder seed(Long seed) {
                this.seed = seed;
                return this;
            }

            /**
             * size.
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
             * parameters.
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
             * includeUsage.
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
