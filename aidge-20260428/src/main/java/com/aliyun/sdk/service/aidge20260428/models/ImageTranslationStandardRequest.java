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
 * {@link ImageTranslationStandardRequest} extends {@link RequestModel}
 *
 * <p>ImageTranslationStandardRequest</p>
 */
public class ImageTranslationStandardRequest extends Request {
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

    private ImageTranslationStandardRequest(Builder builder) {
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

    public static ImageTranslationStandardRequest create() {
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

    public static final class Builder extends Request.Builder<ImageTranslationStandardRequest, Builder> {
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

        private Builder(ImageTranslationStandardRequest request) {
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
         * <p>The ID of the intervention glossary. This parameter is optional. You must create the glossary in the console and provide its ID. If the provided intervention glossary ID is empty, the translation results will not be modified.</p>
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
         * <ul>
         * <li>Image URL: Must be publicly accessible over the Internet.</li>
         * <li>Formats: PNG, JPEG, JPG, BMP, and WEBP.</li>
         * <li>Pixels: Both width and height must not exceed 4,000.</li>
         * <li>File size: The original file must be 10 MB or smaller.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://images-na.ssl-images-amazon.com/images/I/41bKsNBDcwL.jpg">https://images-na.ssl-images-amazon.com/images/I/41bKsNBDcwL.jpg</a></p>
         */
        public Builder imageUrl(String imageUrl) {
            this.putQueryParameter("ImageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * <p>Specifies whether to translate the text on the product subject in the image. This parameter is optional. Default value: false. This helps protect information and prevents embedded information such as product names from being translated.</p>
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
         * <p>The source language code. This parameter is required.<br>&lt;props=&quot;china&quot;&gt;For supported language pairs, see <a href="https://www.alibabacloud.com/help/en/document_detail/3041883.html">Language pair mapping table</a>.<br>&lt;props=&quot;intl&quot;&gt;For supported language pairs, see <a href="https://www.alibabacloud.com/help/zh/aidge/language-direction-mapping">Language pair mapping table</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder sourceLanguage(String sourceLanguage) {
            this.putQueryParameter("SourceLanguage", sourceLanguage);
            this.sourceLanguage = sourceLanguage;
            return this;
        }

        /**
         * <p>The target language code. This parameter is required.<br>&lt;props=&quot;china&quot;&gt;For supported language pairs, see <a href="https://www.alibabacloud.com/help/en/document_detail/3041883.html">Language pair mapping table</a>.<br>&lt;props=&quot;intl&quot;&gt;For supported language pairs, see <a href="https://www.alibabacloud.com/help/zh/aidge/language-direction-mapping">Language pair mapping table</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ko</p>
         */
        public Builder targetLanguage(String targetLanguage) {
            this.putQueryParameter("TargetLanguage", targetLanguage);
            this.targetLanguage = targetLanguage;
            return this;
        }

        /**
         * <p>Specifies whether to translate brand names in the image. This parameter is optional. Default value: false. This helps protect brand name information from being translated.</p>
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
         * <p>Specifies whether to return layer information such as text position, font, and color. If set to true, layer information is returned and can be used to integrate with image editors for secondary editing. Default value: false.</p>
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
        public ImageTranslationStandardRequest build() {
            return new ImageTranslationStandardRequest(this);
        } 

    } 

}
