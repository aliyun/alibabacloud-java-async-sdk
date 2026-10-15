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
 * {@link ImageTranslationPlusAsyncRequest} extends {@link RequestModel}
 *
 * <p>ImageTranslationPlusAsyncRequest</p>
 */
public class ImageTranslationPlusAsyncRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Glossary")
    private String glossary;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludingProductArea")
    private Boolean includingProductArea;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceLanguage")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetLanguage")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TranslatingBrandInTheProduct")
    private Boolean translatingBrandInTheProduct;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseImageEditor")
    private Boolean useImageEditor;

    private ImageTranslationPlusAsyncRequest(Builder builder) {
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

    public static ImageTranslationPlusAsyncRequest create() {
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

    public static final class Builder extends Request.Builder<ImageTranslationPlusAsyncRequest, Builder> {
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

        private Builder(ImageTranslationPlusAsyncRequest request) {
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
         * <p>The intervention glossary ID. The intervention glossary ID must be created separately and provided in the input parameters. If the provided intervention glossary ID is empty, the translation results will not be modified.</p>
         * 
         * <strong>example:</strong>
         * <p>glossary_1</p>
         */
        public Builder glossary(String glossary) {
            this.putQueryParameter("Glossary", glossary);
            this.glossary = glossary;
            return this;
        }

        /**
         * <p>• Image URL: Must be publicly accessible.<br>• Format: PNG, JPEG, JPG, BMP, or WEBP.<br>• Pixels: Both width and height must not exceed 4,000.<br>• File size: The original file must be less than or equal to 10 MB.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/image.jpg">https://example.com/image.jpg</a></p>
         */
        public Builder imageUrl(String imageUrl) {
            this.putQueryParameter("ImageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * <p>Specifies whether to translate the text on the image subject. This helps you protect information and prevent embedded information, such as product names, from being translated. In the example image, the text in the red box represents the text on the subject, and the text in the blue box represents the text not on the subject.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder includingProductArea(Boolean includingProductArea) {
            this.putQueryParameter("IncludingProductArea", includingProductArea);
            this.includingProductArea = includingProductArea;
            return this;
        }

        /**
         * <p>The source language code. The value auto is supported for automatic detection.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder sourceLanguage(String sourceLanguage) {
            this.putQueryParameter("SourceLanguage", sourceLanguage);
            this.sourceLanguage = sourceLanguage;
            return this;
        }

        /**
         * <p>The target language code. The 12 minor language pairs listed above are recommended.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder targetLanguage(String targetLanguage) {
            this.putQueryParameter("TargetLanguage", targetLanguage);
            this.targetLanguage = targetLanguage;
            return this;
        }

        /**
         * <p>Specifies whether to translate brand names in the image. This prevents brand names from being translated. Default value: false, which indicates that brand names are not translated. In the example image, \&quot;懒角落\&quot; represents a brand name.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder translatingBrandInTheProduct(Boolean translatingBrandInTheProduct) {
            this.putQueryParameter("TranslatingBrandInTheProduct", translatingBrandInTheProduct);
            this.translatingBrandInTheProduct = translatingBrandInTheProduct;
            return this;
        }

        /**
         * <p>Specifies whether to return layout information such as the position, font, and color of the text. This can be used to obtain data when integrating the image editor for secondary editing. You can call the image translation result query API to obtain the complete parameter information.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder useImageEditor(Boolean useImageEditor) {
            this.putQueryParameter("UseImageEditor", useImageEditor);
            this.useImageEditor = useImageEditor;
            return this;
        }

        @Override
        public ImageTranslationPlusAsyncRequest build() {
            return new ImageTranslationPlusAsyncRequest(this);
        } 

    } 

}
