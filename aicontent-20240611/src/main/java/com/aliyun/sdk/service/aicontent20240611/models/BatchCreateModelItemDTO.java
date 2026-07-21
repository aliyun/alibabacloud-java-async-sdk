// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link BatchCreateModelItemDTO} extends {@link TeaModel}
 *
 * <p>BatchCreateModelItemDTO</p>
 */
public class BatchCreateModelItemDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("extensions")
    private String extensions;

    @com.aliyun.core.annotation.NameInMap("inOut")
    private String inOut;

    @com.aliyun.core.annotation.NameInMap("maxInputLength")
    private String maxInputLength;

    @com.aliyun.core.annotation.NameInMap("maxOutputLength")
    private String maxOutputLength;

    @com.aliyun.core.annotation.NameInMap("modelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelId;

    @com.aliyun.core.annotation.NameInMap("modelType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelType;

    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.NameInMap("tags")
    private String tags;

    private BatchCreateModelItemDTO(Builder builder) {
        this.description = builder.description;
        this.extensions = builder.extensions;
        this.inOut = builder.inOut;
        this.maxInputLength = builder.maxInputLength;
        this.maxOutputLength = builder.maxOutputLength;
        this.modelId = builder.modelId;
        this.modelType = builder.modelType;
        this.name = builder.name;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchCreateModelItemDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return extensions
     */
    public String getExtensions() {
        return this.extensions;
    }

    /**
     * @return inOut
     */
    public String getInOut() {
        return this.inOut;
    }

    /**
     * @return maxInputLength
     */
    public String getMaxInputLength() {
        return this.maxInputLength;
    }

    /**
     * @return maxOutputLength
     */
    public String getMaxOutputLength() {
        return this.maxOutputLength;
    }

    /**
     * @return modelId
     */
    public String getModelId() {
        return this.modelId;
    }

    /**
     * @return modelType
     */
    public String getModelType() {
        return this.modelType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    public static final class Builder {
        private String description; 
        private String extensions; 
        private String inOut; 
        private String maxInputLength; 
        private String maxOutputLength; 
        private String modelId; 
        private String modelType; 
        private String name; 
        private String tags; 

        private Builder() {
        } 

        private Builder(BatchCreateModelItemDTO model) {
            this.description = model.description;
            this.extensions = model.extensions;
            this.inOut = model.inOut;
            this.maxInputLength = model.maxInputLength;
            this.maxOutputLength = model.maxOutputLength;
            this.modelId = model.modelId;
            this.modelType = model.modelType;
            this.name = model.name;
            this.tags = model.tags;
        } 

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * extensions.
         */
        public Builder extensions(String extensions) {
            this.extensions = extensions;
            return this;
        }

        /**
         * inOut.
         */
        public Builder inOut(String inOut) {
            this.inOut = inOut;
            return this;
        }

        /**
         * maxInputLength.
         */
        public Builder maxInputLength(String maxInputLength) {
            this.maxInputLength = maxInputLength;
            return this;
        }

        /**
         * maxOutputLength.
         */
        public Builder maxOutputLength(String maxOutputLength) {
            this.maxOutputLength = maxOutputLength;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-max</p>
         */
        public Builder modelId(String modelId) {
            this.modelId = modelId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Chat</p>
         */
        public Builder modelType(String modelType) {
            this.modelType = modelType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-max</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * tags.
         */
        public Builder tags(String tags) {
            this.tags = tags;
            return this;
        }

        public BatchCreateModelItemDTO build() {
            return new BatchCreateModelItemDTO(this);
        } 

    } 

}
