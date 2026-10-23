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
 * {@link GenerateProductContentRequest} extends {@link RequestModel}
 *
 * <p>GenerateProductContentRequest</p>
 */
public class GenerateProductContentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BulletPointCount")
    private Integer bulletPointCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContentType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableTranslation")
    private Boolean enableTranslation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxLength")
    private Integer maxLength;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinLength")
    private Integer minLength;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Operation")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Platform")
    private String platform;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductAttributes")
    private String productAttributes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCategory")
    private String productCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceLanguage")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceText")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceText;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetLanguage")
    private String targetLanguage;

    private GenerateProductContentRequest(Builder builder) {
        super(builder);
        this.bulletPointCount = builder.bulletPointCount;
        this.contentType = builder.contentType;
        this.enableTranslation = builder.enableTranslation;
        this.maxLength = builder.maxLength;
        this.minLength = builder.minLength;
        this.operation = builder.operation;
        this.platform = builder.platform;
        this.productAttributes = builder.productAttributes;
        this.productCategory = builder.productCategory;
        this.sourceLanguage = builder.sourceLanguage;
        this.sourceText = builder.sourceText;
        this.targetLanguage = builder.targetLanguage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateProductContentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bulletPointCount
     */
    public Integer getBulletPointCount() {
        return this.bulletPointCount;
    }

    /**
     * @return contentType
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * @return enableTranslation
     */
    public Boolean getEnableTranslation() {
        return this.enableTranslation;
    }

    /**
     * @return maxLength
     */
    public Integer getMaxLength() {
        return this.maxLength;
    }

    /**
     * @return minLength
     */
    public Integer getMinLength() {
        return this.minLength;
    }

    /**
     * @return operation
     */
    public String getOperation() {
        return this.operation;
    }

    /**
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    /**
     * @return productAttributes
     */
    public String getProductAttributes() {
        return this.productAttributes;
    }

    /**
     * @return productCategory
     */
    public String getProductCategory() {
        return this.productCategory;
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

    public static final class Builder extends Request.Builder<GenerateProductContentRequest, Builder> {
        private Integer bulletPointCount; 
        private String contentType; 
        private Boolean enableTranslation; 
        private Integer maxLength; 
        private Integer minLength; 
        private String operation; 
        private String platform; 
        private String productAttributes; 
        private String productCategory; 
        private String sourceLanguage; 
        private String sourceText; 
        private String targetLanguage; 

        private Builder() {
            super();
        } 

        private Builder(GenerateProductContentRequest request) {
            super(request);
            this.bulletPointCount = request.bulletPointCount;
            this.contentType = request.contentType;
            this.enableTranslation = request.enableTranslation;
            this.maxLength = request.maxLength;
            this.minLength = request.minLength;
            this.operation = request.operation;
            this.platform = request.platform;
            this.productAttributes = request.productAttributes;
            this.productCategory = request.productCategory;
            this.sourceLanguage = request.sourceLanguage;
            this.sourceText = request.sourceText;
            this.targetLanguage = request.targetLanguage;
        } 

        /**
         * BulletPointCount.
         */
        public Builder bulletPointCount(Integer bulletPointCount) {
            this.putQueryParameter("BulletPointCount", bulletPointCount);
            this.bulletPointCount = bulletPointCount;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>description</p>
         */
        public Builder contentType(String contentType) {
            this.putQueryParameter("ContentType", contentType);
            this.contentType = contentType;
            return this;
        }

        /**
         * EnableTranslation.
         */
        public Builder enableTranslation(Boolean enableTranslation) {
            this.putQueryParameter("EnableTranslation", enableTranslation);
            this.enableTranslation = enableTranslation;
            return this;
        }

        /**
         * MaxLength.
         */
        public Builder maxLength(Integer maxLength) {
            this.putQueryParameter("MaxLength", maxLength);
            this.maxLength = maxLength;
            return this;
        }

        /**
         * MinLength.
         */
        public Builder minLength(Integer minLength) {
            this.putQueryParameter("MinLength", minLength);
            this.minLength = minLength;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>generate</p>
         */
        public Builder operation(String operation) {
            this.putQueryParameter("Operation", operation);
            this.operation = operation;
            return this;
        }

        /**
         * Platform.
         */
        public Builder platform(String platform) {
            this.putQueryParameter("Platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * ProductAttributes.
         */
        public Builder productAttributes(String productAttributes) {
            this.putQueryParameter("ProductAttributes", productAttributes);
            this.productAttributes = productAttributes;
            return this;
        }

        /**
         * ProductCategory.
         */
        public Builder productCategory(String productCategory) {
            this.putQueryParameter("ProductCategory", productCategory);
            this.productCategory = productCategory;
            return this;
        }

        /**
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>不锈钢蒸锅28cm三层大容量家用厨房必备蒸煮两用锅具</p>
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
        public GenerateProductContentRequest build() {
            return new GenerateProductContentRequest(this);
        } 

    } 

}
