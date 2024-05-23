// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alimt20180807.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MachineTranslateGeneralRequest} extends {@link RequestModel}
 *
 * <p>MachineTranslateGeneralRequest</p>
 */
public class MachineTranslateGeneralRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ContentFormat")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contentFormat;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceLanguage")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceLanguage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceText")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceText;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetLanguage")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetLanguage;

    private MachineTranslateGeneralRequest(Builder builder) {
        super(builder);
        this.contentFormat = builder.contentFormat;
        this.sourceLanguage = builder.sourceLanguage;
        this.sourceText = builder.sourceText;
        this.targetLanguage = builder.targetLanguage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MachineTranslateGeneralRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contentFormat
     */
    public String getContentFormat() {
        return this.contentFormat;
    }

    /**
     * @return sourceLanguage
     */
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    /**
     * @return sourceText
     */
    public String getSourceText() {
        return this.sourceText;
    }

    /**
     * @return targetLanguage
     */
    public String getTargetLanguage() {
        return this.targetLanguage;
    }

    public static final class Builder extends Request.Builder<MachineTranslateGeneralRequest, Builder> {
        private String contentFormat; 
        private String sourceLanguage; 
        private String sourceText; 
        private String targetLanguage; 

        private Builder() {
            super();
        } 

        private Builder(MachineTranslateGeneralRequest request) {
            super(request);
            this.contentFormat = request.contentFormat;
            this.sourceLanguage = request.sourceLanguage;
            this.sourceText = request.sourceText;
            this.targetLanguage = request.targetLanguage;
        } 

        /**
         * ContentFormat.
         */
        public Builder contentFormat(String contentFormat) {
            this.putBodyParameter("ContentFormat", contentFormat);
            this.contentFormat = contentFormat;
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
         * SourceText.
         */
        public Builder sourceText(String sourceText) {
            this.putBodyParameter("SourceText", sourceText);
            this.sourceText = sourceText;
            return this;
        }

        /**
         * TargetLanguage.
         */
        public Builder targetLanguage(String targetLanguage) {
            this.putBodyParameter("TargetLanguage", targetLanguage);
            this.targetLanguage = targetLanguage;
            return this;
        }

        @Override
        public MachineTranslateGeneralRequest build() {
            return new MachineTranslateGeneralRequest(this);
        } 

    } 

}
