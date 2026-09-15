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
 * {@link VisionFlowRequest} extends {@link RequestModel}
 *
 * <p>VisionFlowRequest</p>
 */
public class VisionFlowRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ability")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Integer> ability;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackGroundType")
    private String backGroundType;

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
    @com.aliyun.core.annotation.NameInMap("IsFilter")
    private Boolean isFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mask")
    private String mask;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NonobjectDetectElements")
    private java.util.List<Integer> nonobjectDetectElements;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NonobjectRemoveElements")
    private java.util.List<Integer> nonobjectRemoveElements;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObjectDetectElements")
    private java.util.List<Integer> objectDetectElements;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObjectRemoveElements")
    private java.util.List<Integer> objectRemoveElements;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceLanguage")
    private String sourceLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetHeight")
    private Integer targetHeight;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetLanguage")
    private String targetLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetWidth")
    private Integer targetWidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TranslatingBrandInTheProduct")
    private Boolean translatingBrandInTheProduct;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpscaleFactor")
    private Integer upscaleFactor;

    private VisionFlowRequest(Builder builder) {
        super(builder);
        this.ability = builder.ability;
        this.backGroundType = builder.backGroundType;
        this.glossary = builder.glossary;
        this.imageUrl = builder.imageUrl;
        this.includingProductArea = builder.includingProductArea;
        this.isFilter = builder.isFilter;
        this.mask = builder.mask;
        this.nonobjectDetectElements = builder.nonobjectDetectElements;
        this.nonobjectRemoveElements = builder.nonobjectRemoveElements;
        this.objectDetectElements = builder.objectDetectElements;
        this.objectRemoveElements = builder.objectRemoveElements;
        this.sourceLanguage = builder.sourceLanguage;
        this.targetHeight = builder.targetHeight;
        this.targetLanguage = builder.targetLanguage;
        this.targetWidth = builder.targetWidth;
        this.translatingBrandInTheProduct = builder.translatingBrandInTheProduct;
        this.upscaleFactor = builder.upscaleFactor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VisionFlowRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ability
     */
    public java.util.List<Integer> getAbility() {
        return this.ability;
    }

    /**
     * @return backGroundType
     */
    public String getBackGroundType() {
        return this.backGroundType;
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
     * @return isFilter
     */
    public Boolean getIsFilter() {
        return this.isFilter;
    }

    /**
     * @return mask
     */
    public String getMask() {
        return this.mask;
    }

    /**
     * @return nonobjectDetectElements
     */
    public java.util.List<Integer> getNonobjectDetectElements() {
        return this.nonobjectDetectElements;
    }

    /**
     * @return nonobjectRemoveElements
     */
    public java.util.List<Integer> getNonobjectRemoveElements() {
        return this.nonobjectRemoveElements;
    }

    /**
     * @return objectDetectElements
     */
    public java.util.List<Integer> getObjectDetectElements() {
        return this.objectDetectElements;
    }

    /**
     * @return objectRemoveElements
     */
    public java.util.List<Integer> getObjectRemoveElements() {
        return this.objectRemoveElements;
    }

    /**
     * @return sourceLanguage
     */
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    /**
     * @return targetHeight
     */
    public Integer getTargetHeight() {
        return this.targetHeight;
    }

    /**
     * @return targetLanguage
     */
    public String getTargetLanguage() {
        return this.targetLanguage;
    }

    /**
     * @return targetWidth
     */
    public Integer getTargetWidth() {
        return this.targetWidth;
    }

    /**
     * @return translatingBrandInTheProduct
     */
    public Boolean getTranslatingBrandInTheProduct() {
        return this.translatingBrandInTheProduct;
    }

    /**
     * @return upscaleFactor
     */
    public Integer getUpscaleFactor() {
        return this.upscaleFactor;
    }

    public static final class Builder extends Request.Builder<VisionFlowRequest, Builder> {
        private java.util.List<Integer> ability; 
        private String backGroundType; 
        private String glossary; 
        private String imageUrl; 
        private Boolean includingProductArea; 
        private Boolean isFilter; 
        private String mask; 
        private java.util.List<Integer> nonobjectDetectElements; 
        private java.util.List<Integer> nonobjectRemoveElements; 
        private java.util.List<Integer> objectDetectElements; 
        private java.util.List<Integer> objectRemoveElements; 
        private String sourceLanguage; 
        private Integer targetHeight; 
        private String targetLanguage; 
        private Integer targetWidth; 
        private Boolean translatingBrandInTheProduct; 
        private Integer upscaleFactor; 

        private Builder() {
            super();
        } 

        private Builder(VisionFlowRequest request) {
            super(request);
            this.ability = request.ability;
            this.backGroundType = request.backGroundType;
            this.glossary = request.glossary;
            this.imageUrl = request.imageUrl;
            this.includingProductArea = request.includingProductArea;
            this.isFilter = request.isFilter;
            this.mask = request.mask;
            this.nonobjectDetectElements = request.nonobjectDetectElements;
            this.nonobjectRemoveElements = request.nonobjectRemoveElements;
            this.objectDetectElements = request.objectDetectElements;
            this.objectRemoveElements = request.objectRemoveElements;
            this.sourceLanguage = request.sourceLanguage;
            this.targetHeight = request.targetHeight;
            this.targetLanguage = request.targetLanguage;
            this.targetWidth = request.targetWidth;
            this.translatingBrandInTheProduct = request.translatingBrandInTheProduct;
            this.upscaleFactor = request.upscaleFactor;
        } 

        /**
         * <p>The AI capabilities to apply (1 = Intelligent Element Detection, 2 = Intelligent Matting, 3 = Intelligent Removal, 4 = Image Translation Pro, 5 = Intelligent Cropping, 6 = HD Upscaling). Multiple selections allowed.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[1,2,3,4]</p>
         */
        public Builder ability(java.util.List<Integer> ability) {
            String abilityShrink = shrink(ability, "Ability", "json");
            this.putQueryParameter("Ability", abilityShrink);
            this.ability = ability;
            return this;
        }

        /**
         * <p>The background type of the output image. Valid values: WHITE_BACKGROUND (white background) and TRANSPARENT (transparent background). This parameter is required when the Intelligent Matting capability is selected.</p>
         * 
         * <strong>example:</strong>
         * <p>WHITE_BACKGROUND</p>
         */
        public Builder backGroundType(String backGroundType) {
            this.putQueryParameter("BackGroundType", backGroundType);
            this.backGroundType = backGroundType;
            return this;
        }

        /**
         * <p>The glossary ID. Optional. Create a glossary separately in the console and provide its ID. If left empty, translation results are not modified.</p>
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
         * <p>The URL of the image to process. This parameter is required. Resolution must be greater than 256 × 256, long side no greater than 1920 pixels, short side no greater than 1080 pixels. Maximum size: 5 MB. Supported formats: png, jpeg, jpg, bmp, and webp.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://ae01.alicdn.com/kf/S342f0070dc9f4be09a6cbed34e90dc8fs.jpg">https://ae01.alicdn.com/kf/S342f0070dc9f4be09a6cbed34e90dc8fs.jpg</a></p>
         */
        public Builder imageUrl(String imageUrl) {
            this.putQueryParameter("ImageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * <p>Specifies whether to translate text on the image subject. Optional. Default value: false. Helps protect embedded information such as product names from being translated.</p>
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
         * <p>Specifies whether images with the detected elements proceed to subsequent processing. A value of true indicates that images containing the elements proceed to subsequent processing. A value of false indicates that they do not. This parameter is required when the Intelligent Element Detection capability is selected.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isFilter(Boolean isFilter) {
            this.putQueryParameter("IsFilter", isFilter);
            this.isFilter = isFilter;
            return this;
        }

        /**
         * <p>The specific removal region in RLE format. Optional. If provided, this parameter takes priority and the ObjectRemoveElements and NonobjectRemoveElements parameters are ignored.</p>
         * 
         * <strong>example:</strong>
         * <p>474556 160 475356 160</p>
         */
        public Builder mask(String mask) {
            this.putQueryParameter("Mask", mask);
            this.mask = mask;
            return this;
        }

        /**
         * <p>The elements to detect on the non-subject area of the image (1 = Watermark, 2 = Logo, 3 = Text, 4 = Text-bearing color block). Multiple selections allowed. When the Intelligent Element Detection capability is selected, at least one of NonobjectDetectElements or ObjectDetectElements is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[1,2,3]</p>
         */
        public Builder nonobjectDetectElements(java.util.List<Integer> nonobjectDetectElements) {
            String nonobjectDetectElementsShrink = shrink(nonobjectDetectElements, "NonobjectDetectElements", "json");
            this.putQueryParameter("NonobjectDetectElements", nonobjectDetectElementsShrink);
            this.nonobjectDetectElements = nonobjectDetectElements;
            return this;
        }

        /**
         * <p>The elements to remove from the non-subject area of the image (1 = Transparent text block, 2 = Specific name, 3 = Text, 4 = Overlay patch). Multiple selections allowed. When the Intelligent Removal capability is selected, at least one of NonobjectRemoveElements or ObjectRemoveElements is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[1,2,4]</p>
         */
        public Builder nonobjectRemoveElements(java.util.List<Integer> nonobjectRemoveElements) {
            String nonobjectRemoveElementsShrink = shrink(nonobjectRemoveElements, "NonobjectRemoveElements", "json");
            this.putQueryParameter("NonobjectRemoveElements", nonobjectRemoveElementsShrink);
            this.nonobjectRemoveElements = nonobjectRemoveElements;
            return this;
        }

        /**
         * <p>The elements to detect on the image subject (1 = Watermark, 2 = Logo, 3 = Text, 4 = Text-bearing color block). Multiple selections allowed. When the Intelligent Element Detection capability is selected, at least one of ObjectDetectElements or NonobjectDetectElements is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[1,2,3,4]</p>
         */
        public Builder objectDetectElements(java.util.List<Integer> objectDetectElements) {
            String objectDetectElementsShrink = shrink(objectDetectElements, "ObjectDetectElements", "json");
            this.putQueryParameter("ObjectDetectElements", objectDetectElementsShrink);
            this.objectDetectElements = objectDetectElements;
            return this;
        }

        /**
         * <p>The elements to remove from the image subject (1 = Transparent text block, 2 = Specific name, 3 = Text, 4 = Overlay patch). Multiple selections allowed. When the Intelligent Removal capability is selected, at least one of ObjectRemoveElements or NonobjectRemoveElements is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[1,2,4]</p>
         */
        public Builder objectRemoveElements(java.util.List<Integer> objectRemoveElements) {
            String objectRemoveElementsShrink = shrink(objectRemoveElements, "ObjectRemoveElements", "json");
            this.putQueryParameter("ObjectRemoveElements", objectRemoveElementsShrink);
            this.objectRemoveElements = objectRemoveElements;
            return this;
        }

        /**
         * <p>The source language code. Optional. For supported language pairs, refer to the supported translation language pairs list.</p>
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
         * <p>The desired height of the cropped image, in pixels. Valid values: 100 to 5000. This parameter is required when the Intelligent Cropping capability is selected.</p>
         * 
         * <strong>example:</strong>
         * <p>800</p>
         */
        public Builder targetHeight(Integer targetHeight) {
            this.putQueryParameter("TargetHeight", targetHeight);
            this.targetHeight = targetHeight;
            return this;
        }

        /**
         * <p>The target language code. Optional. For supported language pairs, refer to the supported translation language pairs list.</p>
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
         * <p>The desired width of the cropped image, in pixels. Valid values: 100 to 5000. This parameter is required when the Intelligent Cropping capability is selected.</p>
         * 
         * <strong>example:</strong>
         * <p>800</p>
         */
        public Builder targetWidth(Integer targetWidth) {
            this.putQueryParameter("TargetWidth", targetWidth);
            this.targetWidth = targetWidth;
            return this;
        }

        /**
         * <p>Specifies whether to translate brand names in the image. Optional. Default value: false. Helps protect brand name information from being translated.</p>
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
         * <p>The image upscaling factor. Optional. Default value: 2. Valid values: 2 to 4. This parameter is required when the HD Upscaling capability is selected.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder upscaleFactor(Integer upscaleFactor) {
            this.putQueryParameter("UpscaleFactor", upscaleFactor);
            this.upscaleFactor = upscaleFactor;
            return this;
        }

        @Override
        public VisionFlowRequest build() {
            return new VisionFlowRequest(this);
        } 

    } 

}
