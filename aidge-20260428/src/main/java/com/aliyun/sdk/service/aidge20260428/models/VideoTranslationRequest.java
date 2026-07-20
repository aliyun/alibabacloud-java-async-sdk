// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aidge20260428.models;

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
 * {@link VideoTranslationRequest} extends {@link RequestModel}
 *
 * <p>VideoTranslationRequest</p>
 */
public class VideoTranslationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Capabilities")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> capabilities;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceLanguage")
    private String sourceLanguage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetLanguage")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetLanguage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VideoUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String videoUrl;

    private VideoTranslationRequest(Builder builder) {
        super(builder);
        this.capabilities = builder.capabilities;
        this.sourceLanguage = builder.sourceLanguage;
        this.targetLanguage = builder.targetLanguage;
        this.videoUrl = builder.videoUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VideoTranslationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return capabilities
     */
    public java.util.List<String> getCapabilities() {
        return this.capabilities;
    }

    /**
     * @return sourceLanguage
     */
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    /**
     * @return targetLanguage
     */
    public String getTargetLanguage() {
        return this.targetLanguage;
    }

    /**
     * @return videoUrl
     */
    public String getVideoUrl() {
        return this.videoUrl;
    }

    public static final class Builder extends Request.Builder<VideoTranslationRequest, Builder> {
        private java.util.List<String> capabilities; 
        private String sourceLanguage; 
        private String targetLanguage; 
        private String videoUrl; 

        private Builder() {
            super();
        } 

        private Builder(VideoTranslationRequest request) {
            super(request);
            this.capabilities = request.capabilities;
            this.sourceLanguage = request.sourceLanguage;
            this.targetLanguage = request.targetLanguage;
            this.videoUrl = request.videoUrl;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder capabilities(java.util.List<String> capabilities) {
            String capabilitiesShrink = shrink(capabilities, "Capabilities", "json");
            this.putBodyParameter("Capabilities", capabilitiesShrink);
            this.capabilities = capabilities;
            return this;
        }

        /**
         * SourceLanguage.
         */
        public Builder sourceLanguage(String sourceLanguage) {
            this.putBodyParameter("SourceLanguage", sourceLanguage);
            this.sourceLanguage = sourceLanguage;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ru</p>
         */
        public Builder targetLanguage(String targetLanguage) {
            this.putBodyParameter("TargetLanguage", targetLanguage);
            this.targetLanguage = targetLanguage;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/video.mp4">https://example.com/video.mp4</a></p>
         */
        public Builder videoUrl(String videoUrl) {
            this.putBodyParameter("VideoUrl", videoUrl);
            this.videoUrl = videoUrl;
            return this;
        }

        @Override
        public VideoTranslationRequest build() {
            return new VideoTranslationRequest(this);
        } 

    } 

}
