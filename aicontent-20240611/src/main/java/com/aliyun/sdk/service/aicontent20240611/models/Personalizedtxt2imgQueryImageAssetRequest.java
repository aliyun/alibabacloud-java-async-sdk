// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link Personalizedtxt2imgQueryImageAssetRequest} extends {@link RequestModel}
 *
 * <p>Personalizedtxt2imgQueryImageAssetRequest</p>
 */
public class Personalizedtxt2imgQueryImageAssetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("encodeFormat")
    private String encodeFormat;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("imageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("modelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("promptId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String promptId;

    private Personalizedtxt2imgQueryImageAssetRequest(Builder builder) {
        super(builder);
        this.encodeFormat = builder.encodeFormat;
        this.imageId = builder.imageId;
        this.modelId = builder.modelId;
        this.promptId = builder.promptId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Personalizedtxt2imgQueryImageAssetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return encodeFormat
     */
    public String getEncodeFormat() {
        return this.encodeFormat;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return modelId
     */
    public String getModelId() {
        return this.modelId;
    }

    /**
     * @return promptId
     */
    public String getPromptId() {
        return this.promptId;
    }

    public static final class Builder extends Request.Builder<Personalizedtxt2imgQueryImageAssetRequest, Builder> {
        private String encodeFormat; 
        private String imageId; 
        private String modelId; 
        private String promptId; 

        private Builder() {
            super();
        } 

        private Builder(Personalizedtxt2imgQueryImageAssetRequest request) {
            super(request);
            this.encodeFormat = request.encodeFormat;
            this.imageId = request.imageId;
            this.modelId = request.modelId;
            this.promptId = request.promptId;
        } 

        /**
         * encodeFormat.
         */
        public Builder encodeFormat(String encodeFormat) {
            this.putQueryParameter("encodeFormat", encodeFormat);
            this.encodeFormat = encodeFormat;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0000.png</p>
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("imageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>girl-xxxx-xxxx-xxxx-xxxx</p>
         */
        public Builder modelId(String modelId) {
            this.putQueryParameter("modelId", modelId);
            this.modelId = modelId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx-xxxx-xxxx-xxxx</p>
         */
        public Builder promptId(String promptId) {
            this.putQueryParameter("promptId", promptId);
            this.promptId = promptId;
            return this;
        }

        @Override
        public Personalizedtxt2imgQueryImageAssetRequest build() {
            return new Personalizedtxt2imgQueryImageAssetRequest(this);
        } 

    } 

}
