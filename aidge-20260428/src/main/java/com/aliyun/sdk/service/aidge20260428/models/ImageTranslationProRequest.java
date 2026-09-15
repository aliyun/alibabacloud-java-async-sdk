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
 * {@link ImageTranslationProRequest} extends {@link RequestModel}
 *
 * <p>ImageTranslationProRequest</p>
 */
public class ImageTranslationProRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Async")
    private Boolean async;

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

    private ImageTranslationProRequest(Builder builder) {
        super(builder);
        this.async = builder.async;
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

    public static ImageTranslationProRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return async
     */
    public Boolean getAsync() {
        return this.async;
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

    public static final class Builder extends Request.Builder<ImageTranslationProRequest, Builder> {
        private Boolean async; 
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

        private Builder(ImageTranslationProRequest request) {
            super(request);
            this.async = request.async;
            this.glossary = request.glossary;
            this.imageUrl = request.imageUrl;
            this.includingProductArea = request.includingProductArea;
            this.sourceLanguage = request.sourceLanguage;
            this.targetLanguage = request.targetLanguage;
            this.translatingBrandInTheProduct = request.translatingBrandInTheProduct;
            this.useImageEditor = request.useImageEditor;
        } 

        /**
         * <p>Specifies whether to use asynchronous mode. Default value: false (synchronous mode). If you set this parameter to true, the API immediately returns a TaskId. Use the query translation result API to retrieve the final result.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder async(Boolean async) {
            this.putBodyParameter("Async", async);
            this.async = async;
            return this;
        }

        /**
         * <p>The ID of the intervention glossary. This parameter is optional. Create the glossary in the console and provide its ID. If the glossary ID is empty, the translation results are not modified.</p>
         * 
         * <strong>example:</strong>
         * <p>glossary_1</p>
         */
        public Builder glossary(String glossary) {
            this.putBodyParameter("Glossary", glossary);
            this.glossary = glossary;
            return this;
        }

        /**
         * <p>The URL of the original image. This parameter is required.</p>
         * <p>Image requirements:</p>
         * <ul>
         * <li>Image URL: Must be publicly accessible.</li>
         * <li>Format: png, jpeg, jpg, bmp, or webp.</li>
         * <li>Pixels: Width and height must not exceed 4000 pixels each.</li>
         * <li>File size: The original file must be 10 MB or smaller.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://img.alicdn.com/imgextra/i3/O1CN01HTDhDi28Fd85ZYs7H_!!6000000007903-0-tps-800-800.jpg">https://img.alicdn.com/imgextra/i3/O1CN01HTDhDi28Fd85ZYs7H_!!6000000007903-0-tps-800-800.jpg</a></p>
         */
        public Builder imageUrl(String imageUrl) {
            this.putBodyParameter("ImageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * <p>Specifies whether to translate text on the image subject. This parameter is optional. Default value: false. This helps protect information such as embedded product names from being translated.</p>
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
         * <p>The source language code. This parameter is required. For supported language directions, see <a href="https://www.alibabacloud.com/help/en/document_detail/3041883.html">Language Direction Mapping Table</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder sourceLanguage(String sourceLanguage) {
            this.putBodyParameter("SourceLanguage", sourceLanguage);
            this.sourceLanguage = sourceLanguage;
            return this;
        }

        /**
         * <p>The target language code. This parameter is required. For supported language directions, see <a href="https://www.alibabacloud.com/help/en/document_detail/3041883.html">Language Direction Mapping Table</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ko</p>
         */
        public Builder targetLanguage(String targetLanguage) {
            this.putBodyParameter("TargetLanguage", targetLanguage);
            this.targetLanguage = targetLanguage;
            return this;
        }

        /**
         * <p>Specifies whether to translate brand names on the image. This parameter is optional. Default value: false. This helps protect brand name information from being translated.</p>
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
         * <p>Specifies whether to return layout information such as text position, font, and color. Set this parameter to true to retrieve layer information for secondary editing with an image editor. Default value: false.</p>
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
        public ImageTranslationProRequest build() {
            return new ImageTranslationProRequest(this);
        } 

    } 

}
