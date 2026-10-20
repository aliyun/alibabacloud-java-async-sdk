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
    @com.aliyun.core.annotation.NameInMap("EnableQualityCheck")
    private Boolean enableQualityCheck;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EraseOnly")
    private Boolean eraseOnly;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RemoveLogo")
    private Boolean removeLogo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceLanguage")
    private String sourceLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubtitleMode")
    private String subtitleMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetLanguage")
    private String targetLanguage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VideoUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String videoUrl;

    private VideoTranslationRequest(Builder builder) {
        super(builder);
        this.capabilities = builder.capabilities;
        this.enableQualityCheck = builder.enableQualityCheck;
        this.eraseOnly = builder.eraseOnly;
        this.removeLogo = builder.removeLogo;
        this.sourceLanguage = builder.sourceLanguage;
        this.subtitleMode = builder.subtitleMode;
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
     * @return enableQualityCheck
     */
    public Boolean getEnableQualityCheck() {
        return this.enableQualityCheck;
    }

    /**
     * @return eraseOnly
     */
    public Boolean getEraseOnly() {
        return this.eraseOnly;
    }

    /**
     * @return removeLogo
     */
    public Boolean getRemoveLogo() {
        return this.removeLogo;
    }

    /**
     * @return sourceLanguage
     */
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    /**
     * @return subtitleMode
     */
    public String getSubtitleMode() {
        return this.subtitleMode;
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
        private Boolean enableQualityCheck; 
        private Boolean eraseOnly; 
        private Boolean removeLogo; 
        private String sourceLanguage; 
        private String subtitleMode; 
        private String targetLanguage; 
        private String videoUrl; 

        private Builder() {
            super();
        } 

        private Builder(VideoTranslationRequest request) {
            super(request);
            this.capabilities = request.capabilities;
            this.enableQualityCheck = request.enableQualityCheck;
            this.eraseOnly = request.eraseOnly;
            this.removeLogo = request.removeLogo;
            this.sourceLanguage = request.sourceLanguage;
            this.subtitleMode = request.subtitleMode;
            this.targetLanguage = request.targetLanguage;
            this.videoUrl = request.videoUrl;
        } 

        /**
         * <p>The list of translation features. Valid values: <code>speech</code> and <code>visual</code>. You can select both. At least one feature must be specified. Duplicate values are not allowed.</p>
         * <p>This parameter is required.</p>
         */
        public Builder capabilities(java.util.List<String> capabilities) {
            String capabilitiesShrink = shrink(capabilities, "Capabilities", "json");
            this.putBodyParameter("Capabilities", capabilitiesShrink);
            this.capabilities = capabilities;
            return this;
        }

        /**
         * <p>Specifies whether to enable the quality check for on-screen text processing. Default value: <code>false</code>. The quality check is enabled only when <code>visual</code> is included and this parameter is explicitly set to <code>true</code>. If only <code>speech</code> is selected, this parameter is ignored. No quality check is performed, no quality check fields are returned, and no errors are reported due to this parameter. Enabling the quality check may increase the waiting time. Do not enable it unless necessary.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableQualityCheck(Boolean enableQualityCheck) {
            this.putBodyParameter("EnableQualityCheck", enableQualityCheck);
            this.enableQualityCheck = enableQualityCheck;
            return this;
        }

        /**
         * <p>Specifies whether to only erase the source language text on the screen without translating it. This parameter is valid only when <code>visual</code> is included. Valid values: <code>true</code> (only erases the text) and <code>false</code> (translates the on-screen text). Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder eraseOnly(Boolean eraseOnly) {
            this.putQueryParameter("EraseOnly", eraseOnly);
            this.eraseOnly = eraseOnly;
            return this;
        }

        /**
         * <p>Specifies whether to remove the brand logo. This parameter is valid only when <code>visual</code> is included. Valid values: <code>true</code> (removes the brand logo) and <code>false</code> (retains the logo). Default value: <code>false</code>. This parameter is independent of <code>EraseOnly</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder removeLogo(Boolean removeLogo) {
            this.putQueryParameter("RemoveLogo", removeLogo);
            this.removeLogo = removeLogo;
            return this;
        }

        /**
         * <p>The source language. For supported languages, see Language support.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder sourceLanguage(String sourceLanguage) {
            this.putBodyParameter("SourceLanguage", sourceLanguage);
            this.sourceLanguage = sourceLanguage;
            return this;
        }

        /**
         * <p>The subtitle processing mode. This parameter is valid only when <code>speech</code> is included. Valid values: <code>erase</code> (removes only the original subtitles) and <code>replace</code> (removes the original subtitles and adds new subtitles). If this parameter is omitted, the original subtitles are not processed and no new subtitles are added.</p>
         * 
         * <strong>example:</strong>
         * <p>erase</p>
         */
        public Builder subtitleMode(String subtitleMode) {
            this.putQueryParameter("SubtitleMode", subtitleMode);
            this.subtitleMode = subtitleMode;
            return this;
        }

        /**
         * <p>The target language. This parameter is required.</p>
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
         * <p>The video URL. Supported formats: MP4 and MOV. Maximum size: 200 MB.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://cdn.example.com/product-demo.mp4">https://cdn.example.com/product-demo.mp4</a></p>
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
