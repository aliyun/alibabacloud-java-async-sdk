// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alimt20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TranslateRequest} extends {@link RequestModel}
 *
 * <p>TranslateRequest</p>
 */
public class TranslateRequest extends Request {
    @Query
    @NameInMap("Context")
    private String context;

    @Body
    @NameInMap("FormatType")
    @Validation(required = true)
    private String formatType;

    @Body
    @NameInMap("Scene")
    @Validation(required = true)
    private String scene;

    @Body
    @NameInMap("SourceLanguage")
    @Validation(required = true)
    private String sourceLanguage;

    @Body
    @NameInMap("SourceText")
    @Validation(required = true)
    private String sourceText;

    @Body
    @NameInMap("TargetLanguage")
    @Validation(required = true)
    private String targetLanguage;

    private TranslateRequest(Builder builder) {
        super(builder);
        this.context = builder.context;
        this.formatType = builder.formatType;
        this.scene = builder.scene;
        this.sourceLanguage = builder.sourceLanguage;
        this.sourceText = builder.sourceText;
        this.targetLanguage = builder.targetLanguage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TranslateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return context
     */
    public String getContext() {
        return this.context;
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

    public static final class Builder extends Request.Builder<TranslateRequest, Builder> {
        private String context; 
        private String formatType; 
        private String scene; 
        private String sourceLanguage; 
        private String sourceText; 
        private String targetLanguage; 

        private Builder() {
            super();
        } 

        private Builder(TranslateRequest request) {
            super(request);
            this.context = request.context;
            this.formatType = request.formatType;
            this.scene = request.scene;
            this.sourceLanguage = request.sourceLanguage;
            this.sourceText = request.sourceText;
            this.targetLanguage = request.targetLanguage;
        } 

        /**
         * 新增context
         */
        public Builder context(String context) {
            this.putQueryParameter("Context", context);
            this.context = context;
            return this;
        }

        /**
         * FormatType.
         */
        public Builder formatType(String formatType) {
            this.putBodyParameter("FormatType", formatType);
            this.formatType = formatType;
            return this;
        }

        /**
         * Scene.
         */
        public Builder scene(String scene) {
            this.putBodyParameter("Scene", scene);
            this.scene = scene;
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
        public TranslateRequest build() {
            return new TranslateRequest(this);
        } 

    } 

}
