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
 * {@link AiTryOnRequest} extends {@link RequestModel}
 *
 * <p>AiTryOnRequest</p>
 */
public class AiTryOnRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClothImageUrl")
    private String clothImageUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClothType")
    private String clothType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mode")
    private String mode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelImageUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelImageUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelTemplateUrl")
    private String modelTemplateUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PoseTemplateUrl")
    private String poseTemplateUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ratio")
    private String ratio;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Resolution")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resolution;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TryonType")
    private String tryonType;

    private AiTryOnRequest(Builder builder) {
        super(builder);
        this.clothImageUrl = builder.clothImageUrl;
        this.clothType = builder.clothType;
        this.mode = builder.mode;
        this.modelImageUrl = builder.modelImageUrl;
        this.modelTemplateUrl = builder.modelTemplateUrl;
        this.poseTemplateUrl = builder.poseTemplateUrl;
        this.ratio = builder.ratio;
        this.resolution = builder.resolution;
        this.tryonType = builder.tryonType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AiTryOnRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clothImageUrl
     */
    public String getClothImageUrl() {
        return this.clothImageUrl;
    }

    /**
     * @return clothType
     */
    public String getClothType() {
        return this.clothType;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return modelImageUrl
     */
    public String getModelImageUrl() {
        return this.modelImageUrl;
    }

    /**
     * @return modelTemplateUrl
     */
    public String getModelTemplateUrl() {
        return this.modelTemplateUrl;
    }

    /**
     * @return poseTemplateUrl
     */
    public String getPoseTemplateUrl() {
        return this.poseTemplateUrl;
    }

    /**
     * @return ratio
     */
    public String getRatio() {
        return this.ratio;
    }

    /**
     * @return resolution
     */
    public String getResolution() {
        return this.resolution;
    }

    /**
     * @return tryonType
     */
    public String getTryonType() {
        return this.tryonType;
    }

    public static final class Builder extends Request.Builder<AiTryOnRequest, Builder> {
        private String clothImageUrl; 
        private String clothType; 
        private String mode; 
        private String modelImageUrl; 
        private String modelTemplateUrl; 
        private String poseTemplateUrl; 
        private String ratio; 
        private String resolution; 
        private String tryonType; 

        private Builder() {
            super();
        } 

        private Builder(AiTryOnRequest request) {
            super(request);
            this.clothImageUrl = request.clothImageUrl;
            this.clothType = request.clothType;
            this.mode = request.mode;
            this.modelImageUrl = request.modelImageUrl;
            this.modelTemplateUrl = request.modelTemplateUrl;
            this.poseTemplateUrl = request.poseTemplateUrl;
            this.ratio = request.ratio;
            this.resolution = request.resolution;
            this.tryonType = request.tryonType;
        } 

        /**
         * <p>The list of product image URLs. This parameter is required for single-item and multi-item outfit scenarios.   </p>
         * <ul>
         * <li>Single-item try-on: Pass images of the same product from different angles. The standard edition supports up to two product images, but requires that all images contain one and only one main product. We recommend that you use product images with a white background.   </li>
         * <li>Multi-item outfit: Pass images of all products to be worn. The standard edition supports up to two product images (each image can contain multiple products). A single outfit can include up to six clothing items and accessories.<br>Note: For the clothing replacement, face replacement, and posture replacement modes, specify only one mode per call. Do not upload parameters for multiple modes at the same time.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p><a href="https://ae01.alicdn.com/kf/S3470dc9f4be09a6cbed34e90dc8fs.jpg">https://ae01.alicdn.com/kf/S3470dc9f4be09a6cbed34e90dc8fs.jpg</a></p>
         */
        public Builder clothImageUrl(String clothImageUrl) {
            this.putQueryParameter("ClothImageUrl", clothImageUrl);
            this.clothImageUrl = clothImageUrl;
            return this;
        }

        /**
         * <p>Specifies the types of products to try on. You can specify multiple types at a time. If you do not specify this parameter, the system automatically identifies all supported categories in the product image.<br>Valid values: tops, outwear, bottoms, dresses, tops and bottoms, socks, shoes, hats, earrings, necklaces, braceles, scarves, bags, and glasses.</p>
         * 
         * <strong>example:</strong>
         * <p>tops</p>
         */
        public Builder clothType(String clothType) {
            this.putQueryParameter("ClothType", clothType);
            this.clothType = clothType;
            return this;
        }

        /**
         * <p>The try-on mode, which determines the maximum number of product images and outfit items. Currently, only <code>lite</code> is supported.</p>
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
         * <p>The URL of the model scene image. You can specify only one image.   </p>
         * <ul>
         * <li>The image must support public network access over HTTP or HTTPS.   </li>
         * <li>Supported formats: JPG, JPEG, PNG, BMP, and WEBP.   </li>
         * <li>The width and height must be between 256 and 2049 pixels.   </li>
         * <li>The size of a single file cannot exceed 10 MB.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/model.jpg%5C%5C">https://example.com/model.jpg\\</a></p>
         */
        public Builder modelImageUrl(String modelImageUrl) {
            this.putQueryParameter("ModelImageUrl", modelImageUrl);
            this.modelImageUrl = modelImageUrl;
            return this;
        }

        /**
         * <p>The URL of the model template image. You can specify only one image. This image provides reference identity information such as gender, skin color, age, and body type.<br>This parameter is required for the model skin replacement scenario. Do not specify this parameter for the clothing replacement or posture replacement scenarios. For the clothing replacement, face replacement, and posture replacement modes, specify only one mode per call. Do not upload parameters for multiple modes at the same time.<br>We recommend that you use the official model templates. Experience URL: <a href="https://ecoa.console.aliyun.com/translate?category=assetOptimize&apiType=VirtualTryOn">E-commerce Operation Assistant Aidge console</a></p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxxx">https://xxxx</a></p>
         */
        public Builder modelTemplateUrl(String modelTemplateUrl) {
            this.putQueryParameter("ModelTemplateUrl", modelTemplateUrl);
            this.modelTemplateUrl = modelTemplateUrl;
            return this;
        }

        /**
         * <p>The URL of the posture template image. You can specify only one image. This image provides a reference for the person\&quot;s posture.
         * This parameter is required for the posture fission scenario.
         * If this parameter is specified, the image is generated based on the template posture.
         * If this parameter is not specified, the posture in the scene image is used if a model scene image is provided. Otherwise, the posture in the model source image is preserved.
         * Note: For the clothing replacement, face replacement, and posture replacement modes, specify only one mode per call. Do not upload parameters for multiple modes at the same time.
         * We recommend that you use the official posture templates. Experience URL: <a href="https://ecoa.console.aliyun.com/translate?category=assetOptimize&apiType=VirtualTryOn">E-commerce Operation Assistant Aidge console</a></p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxxx">https://xxxx</a></p>
         */
        public Builder poseTemplateUrl(String poseTemplateUrl) {
            this.putQueryParameter("PoseTemplateUrl", poseTemplateUrl);
            this.poseTemplateUrl = poseTemplateUrl;
            return this;
        }

        /**
         * <p>The aspect ratio of the output image. By default, the aspect ratio is the same as that of the original image specified by ModelImageUrl. Valid values: 1:1, 2:3, 3:4, and 9:16.</p>
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
         * <p>The resolution of the output image.</p>
         * <ul>
         * <li>Synchronous API: supports 1K.</li>
         * <li>Asynchronous API: supports 1K and 2K. The asynchronous API only supports single-item outfit scenarios.</li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>This parameter takes effect only in try-on scenarios and specifies the number of products to try on. Default value: <code>singletryon</code>.<br>Valid values:   </p>
         * <ul>
         * <li><code>singletryon</code>: single-item try-on.   </li>
         * <li><code>multitryon</code>: multi-item outfit.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>singletryon</p>
         */
        public Builder tryonType(String tryonType) {
            this.putQueryParameter("TryonType", tryonType);
            this.tryonType = tryonType;
            return this;
        }

        @Override
        public AiTryOnRequest build() {
            return new AiTryOnRequest(this);
        } 

    } 

}
