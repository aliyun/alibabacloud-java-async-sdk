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
 * {@link ImageUpscaleRequest} extends {@link RequestModel}
 *
 * <p>ImageUpscaleRequest</p>
 */
public class ImageUpscaleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpscaleFactor")
    private Integer upscaleFactor;

    private ImageUpscaleRequest(Builder builder) {
        super(builder);
        this.imageUrl = builder.imageUrl;
        this.upscaleFactor = builder.upscaleFactor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImageUpscaleRequest create() {
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
     * @return upscaleFactor
     */
    public Integer getUpscaleFactor() {
        return this.upscaleFactor;
    }

    public static final class Builder extends Request.Builder<ImageUpscaleRequest, Builder> {
        private String imageUrl; 
        private Integer upscaleFactor; 

        private Builder() {
            super();
        } 

        private Builder(ImageUpscaleRequest request) {
            super(request);
            this.imageUrl = request.imageUrl;
            this.upscaleFactor = request.upscaleFactor;
        } 

        /**
         * <p>The URL of the original image. It must be a publicly accessible image URL. You cannot use private network addresses such as localhost. The width and height of the input image must be greater than 100 pixels and less than 3000 pixels. The width and height of the upscaled image must not exceed 3000 pixels.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example.jpg">http://example.jpg</a></p>
         */
        public Builder imageUrl(String imageUrl) {
            this.putQueryParameter("ImageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * <p>The upscaling factor of the image. Valid values: 2 and 4. Default value: 2.</p>
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
        public ImageUpscaleRequest build() {
            return new ImageUpscaleRequest(this);
        } 

    } 

}
