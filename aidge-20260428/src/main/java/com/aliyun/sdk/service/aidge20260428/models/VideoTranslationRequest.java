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
        this.enableQualityCheck = builder.enableQualityCheck;
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
     * @return enableQualityCheck
     */
    public Boolean getEnableQualityCheck() {
        return this.enableQualityCheck;
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
        private Boolean enableQualityCheck; 
        private String sourceLanguage; 
        private String targetLanguage; 
        private String videoUrl; 

        private Builder() {
            super();
        } 

        private Builder(VideoTranslationRequest request) {
            super(request);
            this.capabilities = request.capabilities;
            this.enableQualityCheck = request.enableQualityCheck;
            this.sourceLanguage = request.sourceLanguage;
            this.targetLanguage = request.targetLanguage;
            this.videoUrl = request.videoUrl;
        } 

        /**
         * <p>The list of translation features. Valid values: <code>speech</code> and <code>visual</code>. You can select both. At least one feature is required. Duplicate values are not accepted.</p>
         * <p>This parameter is required.</p>
         */
        public Builder capabilities(java.util.List<String> capabilities) {
            String capabilitiesShrink = shrink(capabilities, "Capabilities", "json");
            this.putBodyParameter("Capabilities", capabilitiesShrink);
            this.capabilities = capabilities;
            return this;
        }

        /**
         * <p>Default value: false. If <code>visual</code> is included and this parameter is explicitly set to true, the quality check for on-screen text processing is enabled. If only <code>speech</code> is selected, this parameter is ignored. No quality check is performed, no quality check fields are returned, and no errors are reported due to this parameter. Enabling the quality check may increase the waiting time. Do not enable it unless necessary.</p>
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
         * <p>The source language. For supported languages, see &quot;Supported languages&quot;.</p>
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
         * <p>The target language. This parameter is required.</p>
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
