// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alimt20190107.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TranslateECommerceRequest} extends {@link RequestModel}
 *
 * <p>TranslateECommerceRequest</p>
 */
public class TranslateECommerceRequest extends Request {
    @Query
    @NameInMap("FormatType")
    @Validation(required = true)
    private String formatType;

    @Query
    @NameInMap("Scene")
    @Validation(required = true)
    private String scene;

    @Query
    @NameInMap("SourceLanguage")
    @Validation(required = true)
    private String sourceLanguage;

    @Query
    @NameInMap("SourceText")
    @Validation(required = true)
    private String sourceText;

    @Query
    @NameInMap("TargetLanguage")
    @Validation(required = true)
    private String targetLanguage;

    private TranslateECommerceRequest(Builder builder) {
        super(builder);
        this.formatType = builder.formatType;
        this.scene = builder.scene;
        this.sourceLanguage = builder.sourceLanguage;
        this.sourceText = builder.sourceText;
        this.targetLanguage = builder.targetLanguage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TranslateECommerceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return formatType
     */
    public String getFormatType() {
        return this.formatType;
    }

    /**
     * @return scene
     */
    public String getScene() {
        return this.scene;
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

    public static final class Builder extends Request.Builder<TranslateECommerceRequest, Builder> {
        private String formatType; 
        private String scene; 
        private String sourceLanguage; 
        private String sourceText; 
        private String targetLanguage; 

        private Builder() {
            super();
        } 

        private Builder(TranslateECommerceRequest request) {
            super(request);
            this.formatType = request.formatType;
            this.scene = request.scene;
            this.sourceLanguage = request.sourceLanguage;
            this.sourceText = request.sourceText;
            this.targetLanguage = request.targetLanguage;
        } 

        /**
         * FormatType.
         */
        public Builder formatType(String formatType) {
            this.putQueryParameter("FormatType", formatType);
            this.formatType = formatType;
            return this;
        }

        /**
         * Scene.
         */
        public Builder scene(String scene) {
            this.putQueryParameter("Scene", scene);
            this.scene = scene;
            return this;
        }

        /**
         * SourceLanguage.
         */
        public Builder sourceLanguage(String sourceLanguage) {
            this.putQueryParameter("SourceLanguage", sourceLanguage);
            this.sourceLanguage = sourceLanguage;
            return this;
        }

        /**
         * SourceText.
         */
        public Builder sourceText(String sourceText) {
            this.putQueryParameter("SourceText", sourceText);
            this.sourceText = sourceText;
            return this;
        }

        /**
         * TargetLanguage.
         */
        public Builder targetLanguage(String targetLanguage) {
            this.putQueryParameter("TargetLanguage", targetLanguage);
            this.targetLanguage = targetLanguage;
            return this;
        }

        @Override
        public TranslateECommerceRequest build() {
            return new TranslateECommerceRequest(this);
        } 

    } 

}
