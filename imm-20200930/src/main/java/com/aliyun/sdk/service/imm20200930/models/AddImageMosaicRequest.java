// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.List < Targets> targets;

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
    public java.util.List < Targets> getTargets() {
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
        private java.util.List < Targets> targets; 

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
         * CredentialConfig.
         */
        public Builder credentialConfig(CredentialConfig credentialConfig) {
            String credentialConfigShrink = shrink(credentialConfig, "CredentialConfig", "json");
            this.putQueryParameter("CredentialConfig", credentialConfigShrink);
            this.credentialConfig = credentialConfig;
            return this;
        }

        /**
         * ImageFormat.
         */
        public Builder imageFormat(String imageFormat) {
            this.putQueryParameter("ImageFormat", imageFormat);
            this.imageFormat = imageFormat;
            return this;
        }

        /**
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * Quality.
         */
        public Builder quality(Integer quality) {
            this.putQueryParameter("Quality", quality);
            this.quality = quality;
            return this;
        }

        /**
         * SourceURI.
         */
        public Builder sourceURI(String sourceURI) {
            this.putQueryParameter("SourceURI", sourceURI);
            this.sourceURI = sourceURI;
            return this;
        }

        /**
         * TargetURI.
         */
        public Builder targetURI(String targetURI) {
            this.putQueryParameter("TargetURI", targetURI);
            this.targetURI = targetURI;
            return this;
        }

        /**
         * Targets.
         */
        public Builder targets(java.util.List < Targets> targets) {
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
             * Height.
             */
            public Builder height(Float height) {
                this.height = height;
                return this;
            }

            /**
             * ReferPos.
             */
            public Builder referPos(String referPos) {
                this.referPos = referPos;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Float width) {
                this.width = width;
                return this;
            }

            /**
             * X.
             */
            public Builder x(Float x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
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
             * BlurRadius.
             */
            public Builder blurRadius(Integer blurRadius) {
                this.blurRadius = blurRadius;
                return this;
            }

            /**
             * Boundary.
             */
            public Builder boundary(Boundary boundary) {
                this.boundary = boundary;
                return this;
            }

            /**
             * Color.
             */
            public Builder color(String color) {
                this.color = color;
                return this;
            }

            /**
             * MosaicRadius.
             */
            public Builder mosaicRadius(Integer mosaicRadius) {
                this.mosaicRadius = mosaicRadius;
                return this;
            }

            /**
             * Sigma.
             */
            public Builder sigma(Integer sigma) {
                this.sigma = sigma;
                return this;
            }

            /**
             * Type.
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
