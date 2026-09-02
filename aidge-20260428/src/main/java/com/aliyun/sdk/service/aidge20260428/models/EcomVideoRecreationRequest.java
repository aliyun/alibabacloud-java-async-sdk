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
         * <p>This parameter is required.</p>
         */
        public Builder input(Input input) {
            String inputShrink = shrink(input, "Input", "json");
            this.putQueryParameter("Input", inputShrink);
            this.input = input;
            return this;
        }

        /**
         * Output.
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
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * Detail.
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * Title.
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
             * ChangeDescription.
             */
            public Builder changeDescription(String changeDescription) {
                this.changeDescription = changeDescription;
                return this;
            }

            /**
             * Mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * PersonReferenceImageUrls.
             */
            public Builder personReferenceImageUrls(java.util.List<String> personReferenceImageUrls) {
                this.personReferenceImageUrls = personReferenceImageUrls;
                return this;
            }

            /**
             * ProductImageUrls.
             */
            public Builder productImageUrls(java.util.List<String> productImageUrls) {
                this.productImageUrls = productImageUrls;
                return this;
            }

            /**
             * ProductInfo.
             */
            public Builder productInfo(ProductInfo productInfo) {
                this.productInfo = productInfo;
                return this;
            }

            /**
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
             * Duration.
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * Quality.
             */
            public Builder quality(String quality) {
                this.quality = quality;
                return this;
            }

            /**
             * Ratio.
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
