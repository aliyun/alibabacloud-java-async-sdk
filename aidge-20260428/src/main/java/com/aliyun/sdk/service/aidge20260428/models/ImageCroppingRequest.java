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
 * {@link ImageCroppingRequest} extends {@link RequestModel}
 *
 * <p>ImageCroppingRequest</p>
 */
public class ImageCroppingRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetHeight")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer targetHeight;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetWidth")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer targetWidth;

    private ImageCroppingRequest(Builder builder) {
        super(builder);
        this.imageUrl = builder.imageUrl;
        this.targetHeight = builder.targetHeight;
        this.targetWidth = builder.targetWidth;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImageCroppingRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageUrl
     */
    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     * @return targetHeight
     */
    public Integer getTargetHeight() {
        return this.targetHeight;
    }

    /**
     * @return targetWidth
     */
    public Integer getTargetWidth() {
        return this.targetWidth;
    }

    public static final class Builder extends Request.Builder<ImageCroppingRequest, Builder> {
        private String imageUrl; 
        private Integer targetHeight; 
        private Integer targetWidth; 

        private Builder() {
            super();
        } 

        private Builder(ImageCroppingRequest request) {
            super(request);
            this.imageUrl = request.imageUrl;
            this.targetHeight = request.targetHeight;
            this.targetWidth = request.targetWidth;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://jv-comfyui-image.tiangong.tech/dify_upload/xxx.jpg">https://jv-comfyui-image.tiangong.tech/dify_upload/xxx.jpg</a></p>
         */
        public Builder imageUrl(String imageUrl) {
            this.putQueryParameter("ImageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder targetHeight(Integer targetHeight) {
            this.putQueryParameter("TargetHeight", targetHeight);
            this.targetHeight = targetHeight;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder targetWidth(Integer targetWidth) {
            this.putQueryParameter("TargetWidth", targetWidth);
            this.targetWidth = targetWidth;
            return this;
        }

        @Override
        public ImageCroppingRequest build() {
            return new ImageCroppingRequest(this);
        } 

    } 

}
