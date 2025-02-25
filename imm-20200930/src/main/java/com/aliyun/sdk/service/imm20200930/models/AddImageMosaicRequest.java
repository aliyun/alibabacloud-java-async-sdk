// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link AddImageMosaicRequest} extends {@link RequestModel}
 *
 * <p>AddImageMosaicRequest</p>
 */
public class AddImageMosaicRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CredentialConfig")
    private CredentialConfig credentialConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageFormat")
    private String imageFormat;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Quality")
    private Integer quality;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceURI")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceURI;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetURI")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetURI;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Targets")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Targets> targets;

    private AddImageMosaicRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.credentialConfig = builder.credentialConfig;
        this.imageFormat = builder.imageFormat;
        this.projectName = builder.projectName;
        this.quality = builder.quality;
        this.sourceURI = builder.sourceURI;
        this.targetURI = builder.targetURI;
        this.targets = builder.targets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddImageMosaicRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return credentialConfig
     */
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    /**
     * @return imageFormat
     */
    public String getImageFormat() {
        return this.imageFormat;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return quality
     */
    public Integer getQuality() {
        return this.quality;
    }

    /**
     * @return sourceURI
     */
    public String getSourceURI() {
        return this.sourceURI;
    }

    /**
     * @return targetURI
     */
    public String getTargetURI() {
        return this.targetURI;
    }

    /**
     * @return targets
     */
    public java.util.List<Targets> getTargets() {
        return this.targets;
    }

    public static final class Builder extends Request.Builder<AddImageMosaicRequest, Builder> {
        private String regionId; 
        private CredentialConfig credentialConfig; 
        private String imageFormat; 
        private String projectName; 
        private Integer quality; 
        private String sourceURI; 
        private String targetURI; 
        private java.util.List<Targets> targets; 

        private Builder() {
            super();
        } 

        private Builder(AddImageMosaicRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.credentialConfig = request.credentialConfig;
            this.imageFormat = request.imageFormat;
            this.projectName = request.projectName;
            this.quality = request.quality;
            this.sourceURI = request.sourceURI;
            this.targetURI = request.targetURI;
            this.targets = request.targets;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p><strong>If you do not have special requirements, leave this parameter empty.</strong></p>
         * <p>The configurations of authorization chains. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Use authorization chains to access resources of other entities</a>.</p>
         */
        public Builder credentialConfig(CredentialConfig credentialConfig) {
            String credentialConfigShrink = shrink(credentialConfig, "CredentialConfig", "json");
            this.putQueryParameter("CredentialConfig", credentialConfigShrink);
            this.credentialConfig = credentialConfig;
            return this;
        }

        /**
         * <p>The encoding of the output image. By default, the output image uses the same encoding as the input image. Valid values: jpg, png, and webp.</p>
         * 
         * <strong>example:</strong>
         * <p>jpg</p>
         */
        public Builder imageFormat(String imageFormat) {
            this.putQueryParameter("ImageFormat", imageFormat);
            this.imageFormat = imageFormat;
            return this;
        }

        /**
         * <p>The name of the project.<a href="~~478153~~"></a></p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-project</p>
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>The quality of the output image. This parameter applies only to JPG and WebP images. Valid values: 0 to 100. Default value: 80.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder quality(Integer quality) {
            this.putQueryParameter("Quality", quality);
            this.quality = quality;
            return this;
        }

        /**
         * <p>The OSS URI of the input image.</p>
         * <p>Specify the OSS URI in the oss://${Bucket}/${Object} format, where <code>${Bucket}</code> is the name of the bucket in the same region as the current project and <code>${Object}</code> is the path of the object with the extension included.</p>
         * <p>Supported formats of input images include JPG, PNG, TIFF, JP2, and BMP.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://examplebucket/sampleobject.jpg</p>
         */
        public Builder sourceURI(String sourceURI) {
            this.putQueryParameter("SourceURI", sourceURI);
            this.sourceURI = sourceURI;
            return this;
        }

        /**
         * <p>The OSS URI of the output image.</p>
         * <p>Specify the OSS URI in the oss://${Bucket}/${Object} format, where <code>${Bucket}</code> is the name of the bucket in the same region as the current project and <code>${Object}</code> is the path of the object with the extension included.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://examplebucket/outputImage.jpg</p>
         */
        public Builder targetURI(String targetURI) {
            this.putQueryParameter("TargetURI", targetURI);
            this.targetURI = targetURI;
            return this;
        }

        /**
         * <p>The bounding boxes and processing parameters.</p>
         * <p>This parameter is required.</p>
         */
        public Builder targets(java.util.List<Targets> targets) {
            String targetsShrink = shrink(targets, "Targets", "json");
            this.putQueryParameter("Targets", targetsShrink);
            this.targets = targets;
            return this;
        }

        @Override
        public AddImageMosaicRequest build() {
            return new AddImageMosaicRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddImageMosaicRequest} extends {@link TeaModel}
     *
     * <p>AddImageMosaicRequest</p>
     */
    public static class Boundary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Height")
        @com.aliyun.core.annotation.Validation(required = true)
        private Float height;

        @com.aliyun.core.annotation.NameInMap("ReferPos")
        private String referPos;

        @com.aliyun.core.annotation.NameInMap("Width")
        @com.aliyun.core.annotation.Validation(required = true)
        private Float width;

        @com.aliyun.core.annotation.NameInMap("X")
        @com.aliyun.core.annotation.Validation(required = true)
        private Float x;

        @com.aliyun.core.annotation.NameInMap("Y")
        @com.aliyun.core.annotation.Validation(required = true)
        private Float y;

        private Boundary(Builder builder) {
            this.height = builder.height;
            this.referPos = builder.referPos;
            this.width = builder.width;
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Boundary create() {
            return builder().build();
        }

        /**
         * @return height
         */
        public Float getHeight() {
            return this.height;
        }

        /**
         * @return referPos
         */
        public String getReferPos() {
            return this.referPos;
        }

        /**
         * @return width
         */
        public Float getWidth() {
            return this.width;
        }

        /**
         * @return x
         */
        public Float getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Float getY() {
            return this.y;
        }

        public static final class Builder {
            private Float height; 
            private String referPos; 
            private Float width; 
            private Float x; 
            private Float y; 

            /**
             * <p>The height of the bounding box. The value can be an integer greater than or equal to 0 or a decimal within the range of [0,1):</p>
             * <ul>
             * <li>An integer value greater than or equal to 0 indicates the height of the bounding box in pixels.</li>
             * <li>A decimal value within the range of [0,1) indicates the height of the bounding box as a ratio of its height to the image height.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder height(Float height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The reference position of the bounding box on the image. Valid values:</p>
             * <ul>
             * <li>topright: the upper-right corner.</li>
             * <li>topleft: the upper-left corner. This is the default value.</li>
             * <li>bottomright: the lower-right corner.</li>
             * <li>bottomleft: the lower-left corner.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>topleft</p>
             */
            public Builder referPos(String referPos) {
                this.referPos = referPos;
                return this;
            }

            /**
             * <p>The width of the bounding box. The value can be an integer greater than or equal to 0 or a decimal within the range of [0,1):</p>
             * <ul>
             * <li>An integer value greater than or equal to 0 indicates the width of the bounding box in pixels.</li>
             * <li>A decimal value within the range of [0,1) indicates the width of the bounding box as a ratio of its width to the image width.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder width(Float width) {
                this.width = width;
                return this;
            }

            /**
             * <p>The horizontal offset relative to the reference position. The value can be an integer greater than or equal to 0 or a decimal within the range of [0,1):</p>
             * <ul>
             * <li>An integer value greater than or equal to 0 indicates the horizontal offset in pixels.</li>
             * <li>A decimal value within the range of [0,1) indicates the horizontal offset as a ratio of the offset to the image width.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder x(Float x) {
                this.x = x;
                return this;
            }

            /**
             * <p>The vertical offset relative to the reference position. The value can be an integer greater than or equal to 0 or a decimal within the range of [0,1):</p>
             * <ul>
             * <li>An integer value greater than or equal to 0 indicates the vertical offset in pixels.</li>
             * <li>A decimal value within the range of [0,1) indicates the vertical offset as a ratio of the offset to the image height.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder y(Float y) {
                this.y = y;
                return this;
            }

            public Boundary build() {
                return new Boundary(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddImageMosaicRequest} extends {@link TeaModel}
     *
     * <p>AddImageMosaicRequest</p>
     */
    public static class Targets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BlurRadius")
        private Integer blurRadius;

        @com.aliyun.core.annotation.NameInMap("Boundary")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boundary boundary;

        @com.aliyun.core.annotation.NameInMap("Color")
        private String color;

        @com.aliyun.core.annotation.NameInMap("MosaicRadius")
        private Integer mosaicRadius;

        @com.aliyun.core.annotation.NameInMap("Sigma")
        private Integer sigma;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private Targets(Builder builder) {
            this.blurRadius = builder.blurRadius;
            this.boundary = builder.boundary;
            this.color = builder.color;
            this.mosaicRadius = builder.mosaicRadius;
            this.sigma = builder.sigma;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Targets create() {
            return builder().build();
        }

        /**
         * @return blurRadius
         */
        public Integer getBlurRadius() {
            return this.blurRadius;
        }

        /**
         * @return boundary
         */
        public Boundary getBoundary() {
            return this.boundary;
        }

        /**
         * @return color
         */
        public String getColor() {
            return this.color;
        }

        /**
         * @return mosaicRadius
         */
        public Integer getMosaicRadius() {
            return this.mosaicRadius;
        }

        /**
         * @return sigma
         */
        public Integer getSigma() {
            return this.sigma;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer blurRadius; 
            private Boundary boundary; 
            private String color; 
            private Integer mosaicRadius; 
            private Integer sigma; 
            private String type; 

            /**
             * <p>The radius of the Gaussian blur. Valid values: 1 to 50. Default value: 3. Unit: pixels.</p>
             * <blockquote>
             * <p> This parameter takes effect only for a Gaussian blur.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder blurRadius(Integer blurRadius) {
                this.blurRadius = blurRadius;
                return this;
            }

            /**
             * <p>The position of the bounding box.</p>
             * <p>This parameter is required.</p>
             */
            public Builder boundary(Boundary boundary) {
                this.boundary = boundary;
                return this;
            }

            /**
             * <p>The color of the color shape. You can specify a color by using a color code such as<code>#RRGGBB</code> or preset color names such as <code>red</code> and <code>white</code>. The default value is #FFFFFF, which is white.</p>
             * <blockquote>
             * <p> This parameter takes effect only for solid color shapes.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>#FFFFFF</p>
             */
            public Builder color(String color) {
                this.color = color;
                return this;
            }

            /**
             * <p>The radius of the mosaic. Default value: 5. Unit: pixels.</p>
             * <blockquote>
             * <p> This parameter does not take effect for Gaussian blurs and solid color shapes.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder mosaicRadius(Integer mosaicRadius) {
                this.mosaicRadius = mosaicRadius;
                return this;
            }

            /**
             * <p>The standard deviation of the Gaussian blur. The value must be greater than 0. Default value: 5.</p>
             * <blockquote>
             * <p> This parameter takes effect only for a Gaussian blur.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder sigma(Integer sigma) {
                this.sigma = sigma;
                return this;
            }

            /**
             * <p>The type of the mosaic effect. Valid values:</p>
             * <ul>
             * <li>square: squares.</li>
             * <li>diamond: diamonds.</li>
             * <li>hexagon: hexagons.</li>
             * <li>blur: Gaussian blurs.</li>
             * <li>pure: solid color shapes.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>square</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Targets build() {
                return new Targets(this);
            } 

        } 

    }
}
