// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alimt20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TranslateImageRequest} extends {@link RequestModel}
 *
 * <p>TranslateImageRequest</p>
 */
public class TranslateImageRequest extends Request {
    @Body
    @NameInMap("Ext")
    private String ext;

    @Body
    @NameInMap("Field")
    private String field;

    @Body
    @NameInMap("ImageBase64")
    private String imageBase64;

    @Body
    @NameInMap("ImageUrl")
    private String imageUrl;

    @Body
    @NameInMap("SourceLanguage")
    private String sourceLanguage;

    @Body
    @NameInMap("TargetLanguage")
    private String targetLanguage;

    private TranslateImageRequest(Builder builder) {
        super(builder);
        this.ext = builder.ext;
        this.field = builder.field;
        this.imageBase64 = builder.imageBase64;
        this.imageUrl = builder.imageUrl;
        this.sourceLanguage = builder.sourceLanguage;
        this.targetLanguage = builder.targetLanguage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TranslateImageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ext
     */
    public String getExt() {
        return this.ext;
    }

    /**
     * @return field
     */
    public String getField() {
        return this.field;
    }

    /**
     * @return imageBase64
     */
    public String getImageBase64() {
        return this.imageBase64;
    }

    /**
     * @return imageUrl
     */
    public String getImageUrl() {
        return this.imageUrl;
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

    public static final class Builder extends Request.Builder<TranslateImageRequest, Builder> {
        private String ext; 
        private String field; 
        private String imageBase64; 
        private String imageUrl; 
        private String sourceLanguage; 
        private String targetLanguage; 

        private Builder() {
            super();
        } 

        private Builder(TranslateImageRequest request) {
            super(request);
            this.ext = request.ext;
            this.field = request.field;
            this.imageBase64 = request.imageBase64;
            this.imageUrl = request.imageUrl;
            this.sourceLanguage = request.sourceLanguage;
            this.targetLanguage = request.targetLanguage;
        } 

        /**
         * Ext.
         */
        public Builder ext(String ext) {
            this.putBodyParameter("Ext", ext);
            this.ext = ext;
            return this;
        }

        /**
         * Field.
         */
        public Builder field(String field) {
            this.putBodyParameter("Field", field);
            this.field = field;
            return this;
        }

        /**
         * ImageBase64.
         */
        public Builder imageBase64(String imageBase64) {
            this.putBodyParameter("ImageBase64", imageBase64);
            this.imageBase64 = imageBase64;
            return this;
        }

        /**
         * ImageUrl.
         */
        public Builder imageUrl(String imageUrl) {
            this.putBodyParameter("ImageUrl", imageUrl);
            this.imageUrl = imageUrl;
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
         * TargetLanguage.
         */
        public Builder targetLanguage(String targetLanguage) {
            this.putBodyParameter("TargetLanguage", targetLanguage);
            this.targetLanguage = targetLanguage;
            return this;
        }

        @Override
        public TranslateImageRequest build() {
            return new TranslateImageRequest(this);
        } 

    } 

}
