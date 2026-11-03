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
         * <p>The list of translation features. Valid values: speech and visual. You can select both. At least one feature must be specified. Duplicate values are not allowed.</p>
         * <p>This parameter is required.</p>
         */
        public Builder capabilities(java.util.List<String> capabilities) {
            String capabilitiesShrink = shrink(capabilities, "Capabilities", "json");
            this.putBodyParameter("Capabilities", capabilitiesShrink);
            this.capabilities = capabilities;
            return this;
        }

        /**
         * <p>Specifies whether to enable the quality check for on-screen text processing. This parameter takes effect only when visual is included and explicitly set to true. If only speech is selected, this parameter is ignored. No quality check is performed, no quality check fields are returned, and no error is reported for this parameter. Enabling the quality check may increase the waiting time. Do not enable it unless necessary. Default value: false.</p>
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
         * <p>Valid only when visual is included. Specifies whether to only erase the on-screen text without translation. Valid values:</p>
         * <ul>
         * <li>true: Erases the on-screen text without translation.</li>
         * <li>false: Translates the on-screen text.
         * Default value: false.</li>
         * </ul>
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
         * <p>Valid only when visual is included. Specifies whether to erase brand logos. Valid values:</p>
         * <ul>
         * <li>true: Erases brand logos.</li>
         * <li>false: Retains brand logos.
         * Default value: false. This parameter is independent of EraseOnly.</li>
         * </ul>
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
         * <p>The original language of the video. For supported languages, see Language support.</p>
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
         * <p>Valid only when speech is included. Valid values:</p>
         * <ul>
         * <li>erase: Erases only the original subtitles.</li>
         * <li>replace: Replaces the original subtitles with translated subtitles. This erases the original subtitles and adds subtitles synchronized with the translated speech.</li>
         * <li>If not specified, the original subtitles are not processed. This means the original subtitles are neither erased nor replaced with new subtitles.</li>
         * </ul>
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
         * <p>Required when speech is included. Optional when only visual is selected and EraseOnly is set to true. If provided in this case, it is ignored. Required in all other cases.</p>
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
         * <p>The URL of the video. Supported formats: MP4 and MOV. Maximum size: 200 MB.</p>
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
