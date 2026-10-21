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
         * <p>The list of translation features. Valid values: speech and visual. You can select both. At least one feature is required. Duplicate values are not accepted.</p>
         * <p>This parameter is required.</p>
         */
        public Builder capabilities(java.util.List<String> capabilities) {
            String capabilitiesShrink = shrink(capabilities, "Capabilities", "json");
            this.putBodyParameter("Capabilities", capabilitiesShrink);
            this.capabilities = capabilities;
            return this;
        }

        /**
         * <p>Specifies whether to enable quality inspection for on-screen text processing. Effective only when visual is included and this parameter is explicitly set to true. If only speech is selected, this parameter is ignored, no quality inspection is performed, no quality inspection fields are returned, and no error is reported due to this parameter. Enabling quality inspection may increase the processing time. Do not enable it unless necessary. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableQualityCheck(Boolean enableQualityCheck) {
            this.putBodyParameter("EnableQualityCheck", enableQualityCheck);
            this.enableQualityCheck = enableQualityCheck;
            return this;
        }

        /**
         * <p>Applicable only when visual is included. Specifies whether to erase on-screen text without translation. Valid values: true: erases on-screen text without translation. false: translates on-screen text. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder eraseOnly(Boolean eraseOnly) {
            this.putQueryParameter("EraseOnly", eraseOnly);
            this.eraseOnly = eraseOnly;
            return this;
        }

        /**
         * <p>Applicable only when visual is included. Specifies whether to erase brand logos. Valid values: true: erases brand logos. false: retains brand logos. Default value: false. This parameter is independent of EraseOnly.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder removeLogo(Boolean removeLogo) {
            this.putQueryParameter("RemoveLogo", removeLogo);
            this.removeLogo = removeLogo;
            return this;
        }

        /**
         * <p>The original language of the video (source language). For supported languages, see Language support.</p>
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
         * <p>Applicable only when speech is included. Valid values: erase: erases the original subtitles only. replace: replaces the original subtitles with translated subtitles, which means erasing the original subtitles and adding subtitles synchronized with the translated speech. If not specified, the original subtitles are not processed, which means neither erasing the original subtitles nor adding new subtitles.</p>
         * 
         * <strong>example:</strong>
         * <p>replace</p>
         */
        public Builder subtitleMode(String subtitleMode) {
            this.putQueryParameter("SubtitleMode", subtitleMode);
            this.subtitleMode = subtitleMode;
            return this;
        }

        /**
         * <p>Required when speech is included. Optional when only visual is included and EraseOnly is set to true. If specified in this case, it is ignored. Required in other cases.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
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
