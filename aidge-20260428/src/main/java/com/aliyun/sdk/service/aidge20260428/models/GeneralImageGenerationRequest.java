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
 * {@link GeneralImageGenerationRequest} extends {@link RequestModel}
 *
 * <p>GeneralImageGenerationRequest</p>
 */
public class GeneralImageGenerationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("N")
    private Integer n;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Operation")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Prompt")
    @com.aliyun.core.annotation.Validation(required = true)
    private String prompt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromptExtend")
    private Boolean promptExtend;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ratio")
    private String ratio;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReferenceUrl")
    private java.util.List<String> referenceUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Resolution")
    private String resolution;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scene")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scene;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Watermark")
    private Boolean watermark;

    private GeneralImageGenerationRequest(Builder builder) {
        super(builder);
        this.jobType = builder.jobType;
        this.mode = builder.mode;
        this.n = builder.n;
        this.operation = builder.operation;
        this.prompt = builder.prompt;
        this.promptExtend = builder.promptExtend;
        this.ratio = builder.ratio;
        this.referenceUrl = builder.referenceUrl;
        this.resolution = builder.resolution;
        this.scene = builder.scene;
        this.watermark = builder.watermark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GeneralImageGenerationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobType
     */
    public String getJobType() {
        return this.jobType;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return n
     */
    public Integer getN() {
        return this.n;
    }

    /**
     * @return operation
     */
    public String getOperation() {
        return this.operation;
    }

    /**
     * @return prompt
     */
    public String getPrompt() {
        return this.prompt;
    }

    /**
     * @return promptExtend
     */
    public Boolean getPromptExtend() {
        return this.promptExtend;
    }

    /**
     * @return ratio
     */
    public String getRatio() {
        return this.ratio;
    }

    /**
     * @return referenceUrl
     */
    public java.util.List<String> getReferenceUrl() {
        return this.referenceUrl;
    }

    /**
     * @return resolution
     */
    public String getResolution() {
        return this.resolution;
    }

    /**
     * @return scene
     */
    public String getScene() {
        return this.scene;
    }

    /**
     * @return watermark
     */
    public Boolean getWatermark() {
        return this.watermark;
    }

    public static final class Builder extends Request.Builder<GeneralImageGenerationRequest, Builder> {
        private String jobType; 
        private String mode; 
        private Integer n; 
        private String operation; 
        private String prompt; 
        private Boolean promptExtend; 
        private String ratio; 
        private java.util.List<String> referenceUrl; 
        private String resolution; 
        private String scene; 
        private Boolean watermark; 

        private Builder() {
            super();
        } 

        private Builder(GeneralImageGenerationRequest request) {
            super(request);
            this.jobType = request.jobType;
            this.mode = request.mode;
            this.n = request.n;
            this.operation = request.operation;
            this.prompt = request.prompt;
            this.promptExtend = request.promptExtend;
            this.ratio = request.ratio;
            this.referenceUrl = request.referenceUrl;
            this.resolution = request.resolution;
            this.scene = request.scene;
            this.watermark = request.watermark;
        } 

        /**
         * <p>The task type. Select the generation method.<br>text_to_image: Generate images using only text descriptions.<br>image_to_image: Generate or edit images based on existing images.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>text_to_image</p>
         */
        public Builder jobType(String jobType) {
            this.putQueryParameter("JobType", jobType);
            this.jobType = jobType;
            return this;
        }

        /**
         * <p>The generation mode. The lite mode is faster and more cost-effective. The plus mode produces finer visual effects and supports more reference images.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lite</p>
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * <p>The number of images generated per call. Valid values: 1 to 4. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder n(Integer n) {
            this.putQueryParameter("N", n);
            this.n = n;
            return this;
        }

        /**
         * <p>The specific operation for image generation or editing. Only one operation can be selected. Valid values:<br>[general] scenario</p>
         * <ul>
         * <li><p>general_generate (General generation)</p>
         * </li>
         * <li><p>outpaint (AI outpainting)</p>
         * </li>
         * </ul>
         * <p>[product_ecommerce] scenario</p>
         * <ul>
         * <li><p>scene_generate (Scene image generation)</p>
         * </li>
         * <li><p>product_replace (Product replacement)</p>
         * </li>
         * </ul>
         * <p>[cloth_ecommerce] scenario</p>
         * <ul>
         * <li>model_generate (Model image generation)</li>
         * </ul>
         * <p>[product_ecommerce] scenario &amp; [cloth_ecommerce] scenario</p>
         * <ul>
         * <li><p>detail_generate (Detail image generation)</p>
         * </li>
         * <li><p>selling_point_generate (Selling point image generation)</p>
         * </li>
         * <li><p>scene_variation (Scene variation)</p>
         * </li>
         * <li><p>subject_extract (Subject extraction)</p>
         * </li>
         * <li><p>recolor (Recolor)</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>generate_generate</p>
         */
        public Builder operation(String operation) {
            this.putQueryParameter("Operation", operation);
            this.operation = operation;
            return this;
        }

        /**
         * <p>The content of the image you want to generate. Enter only one prompt, up to 5,000 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>A white ceramic cup placed in a simple studio background</p>
         */
        public Builder prompt(String prompt) {
            this.putQueryParameter("Prompt", prompt);
            this.prompt = prompt;
            return this;
        }

        /**
         * <p>Specifies whether automatic optimization is enabled for the entered prompt. When the optimization is enabled, it completes image details to make the generated effect closer to the description. Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder promptExtend(Boolean promptExtend) {
            this.putQueryParameter("PromptExtend", promptExtend);
            this.promptExtend = promptExtend;
            return this;
        }

        /**
         * <p>The aspect ratio of the image. Valid values: 1:1, 2:3, 3:2, 4:3, 3:4, 16:9, and 9:16. Default value: 1:1.</p>
         * 
         * <strong>example:</strong>
         * <p>1:1</p>
         */
        public Builder ratio(String ratio) {
            this.putQueryParameter("Ratio", ratio);
            this.ratio = ratio;
            return this;
        }

        /**
         * <p>The URLs of the reference images. Enter publicly accessible links.
         * Used only for image-to-image generation. Not supported for text-to-image generation.
         * The number of images that can be uploaded varies by mode: up to 3 images in lite mode, and up to 9 images in plus mode.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;<a href="https://example.com/referece.jpg%22%5D">https://example.com/referece.jpg&quot;]</a></p>
         */
        public Builder referenceUrl(java.util.List<String> referenceUrl) {
            String referenceUrlShrink = shrink(referenceUrl, "ReferenceUrl", "json");
            this.putQueryParameter("ReferenceUrl", referenceUrlShrink);
            this.referenceUrl = referenceUrl;
            return this;
        }

        /**
         * <p>The resolution of the output image. Valid values: 1K and 2K. Default value: 1K.</p>
         * 
         * <strong>example:</strong>
         * <p>1K</p>
         */
        public Builder resolution(String resolution) {
            this.putQueryParameter("Resolution", resolution);
            this.resolution = resolution;
            return this;
        }

        /**
         * <p>The scenario. Valid values: general (general scenario), product_ecommerce (general product scenario), and cloth_ecommerce (apparel and accessories scenario). Only one scenario can be selected.</p>
         * <ul>
         * <li><p>If the task type is text_to_image, only general is supported.</p>
         * </li>
         * <li><p>If the task type is image_to_image, general, product_ecommerce, and cloth_ecommerce are supported.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>general</p>
         */
        public Builder scene(String scene) {
            this.putQueryParameter("Scene", scene);
            this.scene = scene;
            return this;
        }

        /**
         * <p>Specifies whether to add a watermark to the generated image. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder watermark(Boolean watermark) {
            this.putQueryParameter("Watermark", watermark);
            this.watermark = watermark;
            return this;
        }

        @Override
        public GeneralImageGenerationRequest build() {
            return new GeneralImageGenerationRequest(this);
        } 

    } 

}
