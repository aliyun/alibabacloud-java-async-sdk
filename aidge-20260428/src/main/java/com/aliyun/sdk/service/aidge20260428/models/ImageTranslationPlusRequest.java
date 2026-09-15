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
 * {@link ImageTranslationPlusRequest} extends {@link RequestModel}
 *
 * <p>ImageTranslationPlusRequest</p>
 */
public class ImageTranslationPlusRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Glossary")
    private String glossary;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IncludingProductArea")
    private Boolean includingProductArea;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceLanguage")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceLanguage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetLanguage")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetLanguage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TranslatingBrandInTheProduct")
    private Boolean translatingBrandInTheProduct;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UseImageEditor")
    private Boolean useImageEditor;

    private ImageTranslationPlusRequest(Builder builder) {
        super(builder);
        this.glossary = builder.glossary;
        this.imageUrl = builder.imageUrl;
        this.includingProductArea = builder.includingProductArea;
        this.sourceLanguage = builder.sourceLanguage;
        this.targetLanguage = builder.targetLanguage;
        this.translatingBrandInTheProduct = builder.translatingBrandInTheProduct;
        this.useImageEditor = builder.useImageEditor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImageTranslationPlusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return glossary
     */
    public String getGlossary() {
        return this.glossary;
    }

    /**
     * @return imageUrl
     */
    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     * @return includingProductArea
     */
    public Boolean getIncludingProductArea() {
        return this.includingProductArea;
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
     * @return translatingBrandInTheProduct
     */
    public Boolean getTranslatingBrandInTheProduct() {
        return this.translatingBrandInTheProduct;
    }

    /**
     * @return useImageEditor
     */
    public Boolean getUseImageEditor() {
        return this.useImageEditor;
    }

    public static final class Builder extends Request.Builder<ImageTranslationPlusRequest, Builder> {
        private String glossary; 
        private String imageUrl; 
        private Boolean includingProductArea; 
        private String sourceLanguage; 
        private String targetLanguage; 
        private Boolean translatingBrandInTheProduct; 
        private Boolean useImageEditor; 

        private Builder() {
            super();
        } 

        private Builder(ImageTranslationPlusRequest request) {
            super(request);
            this.glossary = request.glossary;
            this.imageUrl = request.imageUrl;
            this.includingProductArea = request.includingProductArea;
            this.sourceLanguage = request.sourceLanguage;
            this.targetLanguage = request.targetLanguage;
            this.translatingBrandInTheProduct = request.translatingBrandInTheProduct;
            this.useImageEditor = request.useImageEditor;
        } 

        /**
         * <p>The ID of the intervention glossary. This parameter is optional.</p>
         * 
         * <strong>example:</strong>
         * <p>glossary-001</p>
         */
        public Builder glossary(String glossary) {
            this.putBodyParameter("Glossary", glossary);
            this.glossary = glossary;
            return this;
        }

        /**
         * <p>The URL of the original image. This parameter is required.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://img.alicdn.com/example.png">https://img.alicdn.com/example.png</a></p>
         */
        public Builder imageUrl(String imageUrl) {
            this.putBodyParameter("ImageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * <p>Specifies whether to translate text on the product body. This parameter is optional. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder includingProductArea(Boolean includingProductArea) {
            this.putBodyParameter("IncludingProductArea", includingProductArea);
            this.includingProductArea = includingProductArea;
            return this;
        }

        /**
         * <p>The source language. This parameter is required.</p>
         * <p>This parameter is required.</p>
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
         * <p>en</p>
         */
        public Builder targetLanguage(String targetLanguage) {
            this.putBodyParameter("TargetLanguage", targetLanguage);
            this.targetLanguage = targetLanguage;
            return this;
        }

        /**
         * <p>Specifies whether to translate brand text on the product. This parameter is optional. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder translatingBrandInTheProduct(Boolean translatingBrandInTheProduct) {
            this.putBodyParameter("TranslatingBrandInTheProduct", translatingBrandInTheProduct);
            this.translatingBrandInTheProduct = translatingBrandInTheProduct;
            return this;
        }

        /**
         * <p>Specifies whether to use the image translation editor protocol. This parameter is optional.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder useImageEditor(Boolean useImageEditor) {
            this.putBodyParameter("UseImageEditor", useImageEditor);
            this.useImageEditor = useImageEditor;
            return this;
        }

        @Override
        public ImageTranslationPlusRequest build() {
            return new ImageTranslationPlusRequest(this);
        } 

    } 

}
