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
 * {@link EcomVideoRecreationRequest} extends {@link RequestModel}
 *
 * <p>EcomVideoRecreationRequest</p>
 */
public class EcomVideoRecreationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Input")
    @com.aliyun.core.annotation.Validation(required = true)
    private Input input;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Output")
    private Output output;

    private EcomVideoRecreationRequest(Builder builder) {
        super(builder);
        this.input = builder.input;
        this.output = builder.output;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EcomVideoRecreationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return input
     */
    public Input getInput() {
        return this.input;
    }

    /**
     * @return output
     */
    public Output getOutput() {
        return this.output;
    }

    public static final class Builder extends Request.Builder<EcomVideoRecreationRequest, Builder> {
        private Input input; 
        private Output output; 

        private Builder() {
            super();
        } 

        private Builder(EcomVideoRecreationRequest request) {
            super(request);
            this.input = request.input;
            this.output = request.output;
        } 

        /**
         * <p>The input parameters for video multiplication.</p>
         * <p>This parameter is required.</p>
         */
        public Builder input(Input input) {
            String inputShrink = shrink(input, "Input", "json");
            this.putQueryParameter("Input", inputShrink);
            this.input = input;
            return this;
        }

        /**
         * <p>The output specifications for the final video.</p>
         */
        public Builder output(Output output) {
            String outputShrink = shrink(output, "Output", "json");
            this.putQueryParameter("Output", outputShrink);
            this.output = output;
            return this;
        }

        @Override
        public EcomVideoRecreationRequest build() {
            return new EcomVideoRecreationRequest(this);
        } 

    } 

    /**
     * 
     * {@link EcomVideoRecreationRequest} extends {@link TeaModel}
     *
     * <p>EcomVideoRecreationRequest</p>
     */
    public static class ProductInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Detail")
        private String detail;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private ProductInfo(Builder builder) {
            this.category = builder.category;
            this.detail = builder.detail;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProductInfo create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String category; 
            private String detail; 
            private String title; 

            private Builder() {
            } 

            private Builder(ProductInfo model) {
                this.category = model.category;
                this.detail = model.detail;
                this.title = model.title;
            } 

            /**
             * <p>The product category.<br>Example: Womenswear/Sun-protective clothing</p>
             * 
             * <strong>example:</strong>
             * <p>Women\&quot;s clothing/sun protection clothing</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The actual product information (SKU, brand, color, material, size, specifications, logo, and usage), used to constrain voiceover facts.<br>Example: Light yellow, cooling fabric, sun protection to the back of the hand, UPF50+</p>
             * 
             * <strong>example:</strong>
             * <p>Light moon yellow, cool-touch fabric, sun protection extending to the back of the hand, UPF50+</p>
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The name of the target product. This parameter is required for product replacement mode. Maximum length: 200 characters.<br>Example: Light yellow cooling sun-protective jacket</p>
             * 
             * <strong>example:</strong>
             * <p>Light moon yellow cool-touch sun protection clothing</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public ProductInfo build() {
                return new ProductInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link EcomVideoRecreationRequest} extends {@link TeaModel}
     *
     * <p>EcomVideoRecreationRequest</p>
     */
    public static class Input extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChangeDescription")
        private String changeDescription;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("PersonReferenceImageUrls")
        private java.util.List<String> personReferenceImageUrls;

        @com.aliyun.core.annotation.NameInMap("ProductImageUrls")
        private java.util.List<String> productImageUrls;

        @com.aliyun.core.annotation.NameInMap("ProductInfo")
        private ProductInfo productInfo;

        @com.aliyun.core.annotation.NameInMap("SourceVideoUrl")
        @com.aliyun.core.annotation.Validation(required = true)
        private String sourceVideoUrl;

        private Input(Builder builder) {
            this.changeDescription = builder.changeDescription;
            this.mode = builder.mode;
            this.personReferenceImageUrls = builder.personReferenceImageUrls;
            this.productImageUrls = builder.productImageUrls;
            this.productInfo = builder.productInfo;
            this.sourceVideoUrl = builder.sourceVideoUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Input create() {
            return builder().build();
        }

        /**
         * @return changeDescription
         */
        public String getChangeDescription() {
            return this.changeDescription;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return personReferenceImageUrls
         */
        public java.util.List<String> getPersonReferenceImageUrls() {
            return this.personReferenceImageUrls;
        }

        /**
         * @return productImageUrls
         */
        public java.util.List<String> getProductImageUrls() {
            return this.productImageUrls;
        }

        /**
         * @return productInfo
         */
        public ProductInfo getProductInfo() {
            return this.productInfo;
        }

        /**
         * @return sourceVideoUrl
         */
        public String getSourceVideoUrl() {
            return this.sourceVideoUrl;
        }

        public static final class Builder {
            private String changeDescription; 
            private String mode; 
            private java.util.List<String> personReferenceImageUrls; 
            private java.util.List<String> productImageUrls; 
            private ProductInfo productInfo; 
            private String sourceVideoUrl; 

            private Builder() {
            } 

            private Builder(Input model) {
                this.changeDescription = model.changeDescription;
                this.mode = model.mode;
                this.personReferenceImageUrls = model.personReferenceImageUrls;
                this.productImageUrls = model.productImageUrls;
                this.productInfo = model.productInfo;
                this.sourceVideoUrl = model.sourceVideoUrl;
            } 

            /**
             * <p>The description or supplementary constraints for the target person in person replacement mode. The value must be 1 to 500 characters in length. This parameter is required if PersonReferenceImageUrls is not provided.<br>Example: The target person is an adult male. Retain the original clothing and actions.</p>
             * 
             * <strong>example:</strong>
             * <p>The target character is an adult male, with the original costume and movements preserved.</p>
             */
            public Builder changeDescription(String changeDescription) {
                this.changeDescription = changeDescription;
                return this;
            }

            /**
             * <p>The replacement mode. Valid values: <code>product_replacement</code> (default) and <code>person_replacement</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>product_replacement</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The URLs of reference images for the target person in person replacement mode. You can specify 1 to 5 images, which must be of the same person. Arrange the images in the following order: facial close-up, front view, 45-degree view, side view, and back view.<br>Example: [&quot;<a href="https://example.com/person.jpg%22%5D">https://example.com/person.jpg&quot;]</a></p>
             */
            public Builder personReferenceImageUrls(java.util.List<String> personReferenceImageUrls) {
                this.personReferenceImageUrls = personReferenceImageUrls;
                return this;
            }

            /**
             * <p>The URLs of target product images. This parameter is required for product replacement mode. You can upload 1 to 8 images for the same SKU. Use images with a clear subject, no occlusion, and a clean background.<br>Example: [&quot;<a href="https://example.com/product.png%22%5D">https://example.com/product.png&quot;]</a></p>
             */
            public Builder productImageUrls(java.util.List<String> productImageUrls) {
                this.productImageUrls = productImageUrls;
                return this;
            }

            /**
             * <p>The target product information. Specify this parameter to improve voiceover accuracy.</p>
             */
            public Builder productInfo(ProductInfo productInfo) {
                this.productInfo = productInfo;
                return this;
            }

            /**
             * <p>The HTTP(S) URL of the reference video. The video duration must be 2 to 360 seconds. The URL must remain accessible during task execution. A validity period of at least 24 hours is recommended.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/source.mp4">https://example.com/source.mp4</a></p>
             */
            public Builder sourceVideoUrl(String sourceVideoUrl) {
                this.sourceVideoUrl = sourceVideoUrl;
                return this;
            }

            public Input build() {
                return new Input(this);
            } 

        } 

    }
    /**
     * 
     * {@link EcomVideoRecreationRequest} extends {@link TeaModel}
     *
     * <p>EcomVideoRecreationRequest</p>
     */
    public static class Output extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private Integer duration;

        @com.aliyun.core.annotation.NameInMap("Quality")
        private String quality;

        @com.aliyun.core.annotation.NameInMap("Ratio")
        private String ratio;

        private Output(Builder builder) {
            this.duration = builder.duration;
            this.quality = builder.quality;
            this.ratio = builder.ratio;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Output create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return quality
         */
        public String getQuality() {
            return this.quality;
        }

        /**
         * @return ratio
         */
        public String getRatio() {
            return this.ratio;
        }

        public static final class Builder {
            private Integer duration; 
            private String quality; 
            private String ratio; 

            private Builder() {
            } 

            private Builder(Output model) {
                this.duration = model.duration;
                this.quality = model.quality;
                this.ratio = model.ratio;
            } 

            /**
             * <p>The target duration in seconds. Set to <code>&quot;auto&quot;</code> (default) to let the system decide. For product replacement, specify an integer from 5 to 60. For person replacement, only <code>&quot;auto&quot;</code> is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>-1</p>
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The output resolution. Default value: <code>720p</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>720p、1080p</p>
             */
            public Builder quality(String quality) {
                this.quality = quality;
                return this;
            }

            /**
             * <p>The output aspect ratio. Default value: <code>auto</code> (automatically matches the original video).</p>
             * 
             * <strong>example:</strong>
             * <p>auto、9:16、3:4、1:1、4:3、16:9</p>
             */
            public Builder ratio(String ratio) {
                this.ratio = ratio;
                return this;
            }

            public Output build() {
                return new Output(this);
            } 

        } 

    }
}
