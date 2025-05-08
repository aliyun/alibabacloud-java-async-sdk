// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alimt20181012.models;

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
 * {@link TranslateImageBatchRequest} extends {@link RequestModel}
 *
 * <p>TranslateImageBatchRequest</p>
 */
public class TranslateImageBatchRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustomTaskId")
    private String customTaskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Ext")
    private String ext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Field")
    private String field;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageUrls")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageUrls;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceLanguage")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceLanguage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetLanguage")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetLanguage;

    private TranslateImageBatchRequest(Builder builder) {
        super(builder);
        this.customTaskId = builder.customTaskId;
        this.ext = builder.ext;
        this.field = builder.field;
        this.imageUrls = builder.imageUrls;
        this.sourceLanguage = builder.sourceLanguage;
        this.targetLanguage = builder.targetLanguage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TranslateImageBatchRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customTaskId
     */
    public String getCustomTaskId() {
        return this.customTaskId;
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
     * @return imageUrls
     */
    public String getImageUrls() {
        return this.imageUrls;
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

    public static final class Builder extends Request.Builder<TranslateImageBatchRequest, Builder> {
        private String customTaskId; 
        private String ext; 
        private String field; 
        private String imageUrls; 
        private String sourceLanguage; 
        private String targetLanguage; 

        private Builder() {
            super();
        } 

        private Builder(TranslateImageBatchRequest request) {
            super(request);
            this.customTaskId = request.customTaskId;
            this.ext = request.ext;
            this.field = request.field;
            this.imageUrls = request.imageUrls;
            this.sourceLanguage = request.sourceLanguage;
            this.targetLanguage = request.targetLanguage;
        } 

        /**
         * CustomTaskId.
         */
        public Builder customTaskId(String customTaskId) {
            this.putBodyParameter("CustomTaskId", customTaskId);
            this.customTaskId = customTaskId;
            return this;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/1.jpg,https://example.com/2.jpg,https://example.com/3.jpg">https://example.com/1.jpg,https://example.com/2.jpg,https://example.com/3.jpg</a></p>
         */
        public Builder imageUrls(String imageUrls) {
            this.putBodyParameter("ImageUrls", imageUrls);
            this.imageUrls = imageUrls;
            return this;
        }

        /**
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

        @Override
        public TranslateImageBatchRequest build() {
            return new TranslateImageBatchRequest(this);
        } 

    } 

}
