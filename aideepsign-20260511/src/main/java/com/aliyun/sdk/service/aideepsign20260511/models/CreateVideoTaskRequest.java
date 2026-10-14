// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aideepsign20260511.models;

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
 * {@link CreateVideoTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateVideoTaskRequest</p>
 */
public class CreateVideoTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Media")
    private java.util.List<Media> media;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Audio")
    private Boolean audio;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Duration")
    private Integer duration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Model")
    private String model;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Prompt")
    private String prompt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromptExtend")
    private Boolean promptExtend;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ratio")
    private String ratio;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Resolution")
    private String resolution;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Seed")
    private Integer seed;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Watermark")
    private Boolean watermark;

    private CreateVideoTaskRequest(Builder builder) {
        super(builder);
        this.media = builder.media;
        this.audio = builder.audio;
        this.clientToken = builder.clientToken;
        this.duration = builder.duration;
        this.model = builder.model;
        this.prompt = builder.prompt;
        this.promptExtend = builder.promptExtend;
        this.ratio = builder.ratio;
        this.resolution = builder.resolution;
        this.seed = builder.seed;
        this.watermark = builder.watermark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVideoTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return media
     */
    public java.util.List<Media> getMedia() {
        return this.media;
    }

    /**
     * @return audio
     */
    public Boolean getAudio() {
        return this.audio;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return duration
     */
    public Integer getDuration() {
        return this.duration;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return prompt
     */
    public String getPrompt() {
        return this.prompt;
    }

    /**
     * @return promptExtend
     */
    public Boolean getPromptExtend() {
        return this.promptExtend;
    }

    /**
     * @return ratio
     */
    public String getRatio() {
        return this.ratio;
    }

    /**
     * @return resolution
     */
    public String getResolution() {
        return this.resolution;
    }

    /**
     * @return seed
     */
    public Integer getSeed() {
        return this.seed;
    }

    /**
     * @return watermark
     */
    public Boolean getWatermark() {
        return this.watermark;
    }

    public static final class Builder extends Request.Builder<CreateVideoTaskRequest, Builder> {
        private java.util.List<Media> media; 
        private Boolean audio; 
        private String clientToken; 
        private Integer duration; 
        private String model; 
        private String prompt; 
        private Boolean promptExtend; 
        private String ratio; 
        private String resolution; 
        private Integer seed; 
        private Boolean watermark; 

        private Builder() {
            super();
        } 

        private Builder(CreateVideoTaskRequest request) {
            super(request);
            this.media = request.media;
            this.audio = request.audio;
            this.clientToken = request.clientToken;
            this.duration = request.duration;
            this.model = request.model;
            this.prompt = request.prompt;
            this.promptExtend = request.promptExtend;
            this.ratio = request.ratio;
            this.resolution = request.resolution;
            this.seed = request.seed;
            this.watermark = request.watermark;
        } 

        /**
         * Media.
         */
        public Builder media(java.util.List<Media> media) {
            this.putQueryParameter("Media", media);
            this.media = media;
            return this;
        }

        /**
         * <p>Specifies whether to include an audio track. Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder audio(Boolean audio) {
            this.putQueryParameter("Audio", audio);
            this.audio = audio;
            return this;
        }

        /**
         * <p>The idempotency parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>f47ac10b-58cc-4372-a567-0e02b2c3d479</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The video duration in seconds. Valid values: an integer from 2 to 30, -1 (intelligent duration), and 0 (server default of 5 seconds).</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder duration(Integer duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * <p>The model name. Valid values: wan3.0-video (default) and wan3.0-video-prime (high-speed version).</p>
         * 
         * <strong>example:</strong>
         * <p>wan3.0-video</p>
         */
        public Builder model(String model) {
            this.putQueryParameter("Model", model);
            this.model = model;
            return this;
        }

        /**
         * <p>The video description prompt. You must specify either this parameter or Media. For text-to-video generation, only Prompt is required.</p>
         * 
         * <strong>example:</strong>
         * <p>A meeting room full of cats</p>
         */
        public Builder prompt(String prompt) {
            this.putQueryParameter("Prompt", prompt);
            this.prompt = prompt;
            return this;
        }

        /**
         * <p>Specifies whether to enable intelligent rewriting (prompt_extend). Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder promptExtend(Boolean promptExtend) {
            this.putQueryParameter("PromptExtend", promptExtend);
            this.promptExtend = promptExtend;
            return this;
        }

        /**
         * <p>The aspect ratio. Valid values: adaptive (default), 16:9, 4:3, 1:1, 3:4, and 9:16.</p>
         * 
         * <strong>example:</strong>
         * <p>adaptive</p>
         */
        public Builder ratio(String ratio) {
            this.putQueryParameter("Ratio", ratio);
            this.ratio = ratio;
            return this;
        }

        /**
         * <p>The resolution. Valid values: 1080P (default), 720P, and 480P.</p>
         * 
         * <strong>example:</strong>
         * <p>1080P</p>
         */
        public Builder resolution(String resolution) {
            this.putQueryParameter("Resolution", resolution);
            this.resolution = resolution;
            return this;
        }

        /**
         * <p>The random seed. Valid values: -1 (random), an integer from 0 to 2147483647, and 0 (server default of random).</p>
         * 
         * <strong>example:</strong>
         * <p>42</p>
         */
        public Builder seed(Integer seed) {
            this.putQueryParameter("Seed", seed);
            this.seed = seed;
            return this;
        }

        /**
         * <p>Specifies whether to add a Model Studio watermark. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder watermark(Boolean watermark) {
            this.putQueryParameter("Watermark", watermark);
            this.watermark = watermark;
            return this;
        }

        @Override
        public CreateVideoTaskRequest build() {
            return new CreateVideoTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateVideoTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateVideoTaskRequest</p>
     */
    public static class Media extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Media(Builder builder) {
            this.type = builder.type;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Media create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String type; 
            private String url; 

            private Builder() {
            } 

            private Builder(Media model) {
                this.type = model.type;
                this.url = model.url;
            } 

            /**
             * <p>The media type for the first item. Valid values: first_frame, last_frame, reference_image, reference_video, reference_audio, file, and link.</p>
             * 
             * <strong>example:</strong>
             * <p>JPEG</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The media URL for the first item. You can specify a public HTTP or HTTPS URL, a temporary oss:// URL, or inline data in the format of data:{mime};base64,....</p>
             * 
             * <strong>example:</strong>
             * <p>Image URL</p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Media build() {
                return new Media(this);
            } 

        } 

    }
}
