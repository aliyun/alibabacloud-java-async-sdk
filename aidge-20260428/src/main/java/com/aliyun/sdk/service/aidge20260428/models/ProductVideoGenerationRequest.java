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
 * {@link ProductVideoGenerationRequest} extends {@link RequestModel}
 *
 * <p>ProductVideoGenerationRequest</p>
 */
public class ProductVideoGenerationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("aspect_ratio")
    private String aspectRatio;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("duration")
    private Long duration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("product_images")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> productImages;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("product_title")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productTitle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resolution")
    private String resolution;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("script")
    private String script;

    private ProductVideoGenerationRequest(Builder builder) {
        super(builder);
        this.aspectRatio = builder.aspectRatio;
        this.duration = builder.duration;
        this.productImages = builder.productImages;
        this.productTitle = builder.productTitle;
        this.resolution = builder.resolution;
        this.script = builder.script;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ProductVideoGenerationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aspectRatio
     */
    public String getAspectRatio() {
        return this.aspectRatio;
    }

    /**
     * @return duration
     */
    public Long getDuration() {
        return this.duration;
    }

    /**
     * @return productImages
     */
    public java.util.List<String> getProductImages() {
        return this.productImages;
    }

    /**
     * @return productTitle
     */
    public String getProductTitle() {
        return this.productTitle;
    }

    /**
     * @return resolution
     */
    public String getResolution() {
        return this.resolution;
    }

    /**
     * @return script
     */
    public String getScript() {
        return this.script;
    }

    public static final class Builder extends Request.Builder<ProductVideoGenerationRequest, Builder> {
        private String aspectRatio; 
        private Long duration; 
        private java.util.List<String> productImages; 
        private String productTitle; 
        private String resolution; 
        private String script; 

        private Builder() {
            super();
        } 

        private Builder(ProductVideoGenerationRequest request) {
            super(request);
            this.aspectRatio = request.aspectRatio;
            this.duration = request.duration;
            this.productImages = request.productImages;
            this.productTitle = request.productTitle;
            this.resolution = request.resolution;
            this.script = request.script;
        } 

        /**
         * <p>The aspect ratio of the video. Default value: 9:16. Valid values: 16:9, 1:1, 3:4, and 9:16.</p>
         * 
         * <strong>example:</strong>
         * <p>9:16</p>
         */
        public Builder aspectRatio(String aspectRatio) {
            this.putQueryParameter("aspect_ratio", aspectRatio);
            this.aspectRatio = aspectRatio;
            return this;
        }

        /**
         * <p>The duration of the video in seconds. Default value: 15. If no script is provided, the value must be an integer from 5 to 15. If a script is provided, the value must be an integer from 5 to 30. A value of 15.0 is treated as 15.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder duration(Long duration) {
            this.putQueryParameter("duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * <p>The public URLs of the product images. At least one image is required. After leading and trailing whitespaces are removed, each URL must start with http:// or https://.</p>
         * <p>This parameter is required.</p>
         */
        public Builder productImages(java.util.List<String> productImages) {
            String productImagesShrink = shrink(productImages, "product_images", "json");
            this.putQueryParameter("product_images", productImagesShrink);
            this.productImages = productImages;
            return this;
        }

        /**
         * <p>The product title. This parameter is required.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>White minimalist ceramic mug</p>
         */
        public Builder productTitle(String productTitle) {
            this.putQueryParameter("product_title", productTitle);
            this.productTitle = productTitle;
            return this;
        }

        /**
         * <p>The resolution of the video. Default value: 720P. Valid values: 720P and 1080P. The value is case-insensitive and is automatically converted to uppercase by the service.</p>
         * 
         * <strong>example:</strong>
         * <p>720P</p>
         */
        public Builder resolution(String resolution) {
            this.putQueryParameter("resolution", resolution);
            this.resolution = resolution;
            return this;
        }

        /**
         * <p>The existing storyboard script. If this parameter is not provided or is left blank, automatic planning is used.</p>
         * 
         * <strong>example:</strong>
         * <p>create a dog</p>
         */
        public Builder script(String script) {
            this.putQueryParameter("script", script);
            this.script = script;
            return this;
        }

        @Override
        public ProductVideoGenerationRequest build() {
            return new ProductVideoGenerationRequest(this);
        } 

    } 

}
