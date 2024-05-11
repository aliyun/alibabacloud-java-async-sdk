// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateImageSplicingTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateImageSplicingTaskRequest</p>
 */
public class CreateImageSplicingTaskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Align")
    private Long align;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackgroundColor")
    private String backgroundColor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CredentialConfig")
    private CredentialConfig credentialConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Direction")
    private String direction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageFormat")
    private String imageFormat;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Margin")
    private Long margin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Notification")
    private Notification notification;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Padding")
    private Long padding;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Quality")
    private Long quality;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScaleType")
    private String scaleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sources")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Sources> sources;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.Map < String, ? > tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetURI")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetURI;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private CreateImageSplicingTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.align = builder.align;
        this.backgroundColor = builder.backgroundColor;
        this.credentialConfig = builder.credentialConfig;
        this.direction = builder.direction;
        this.imageFormat = builder.imageFormat;
        this.margin = builder.margin;
        this.notification = builder.notification;
        this.padding = builder.padding;
        this.projectName = builder.projectName;
        this.quality = builder.quality;
        this.scaleType = builder.scaleType;
        this.sources = builder.sources;
        this.tags = builder.tags;
        this.targetURI = builder.targetURI;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateImageSplicingTaskRequest create() {
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
     * @return align
     */
    public Long getAlign() {
        return this.align;
    }

    /**
     * @return backgroundColor
     */
    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    /**
     * @return credentialConfig
     */
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    /**
     * @return direction
     */
    public String getDirection() {
        return this.direction;
    }

    /**
     * @return imageFormat
     */
    public String getImageFormat() {
        return this.imageFormat;
    }

    /**
     * @return margin
     */
    public Long getMargin() {
        return this.margin;
    }

    /**
     * @return notification
     */
    public Notification getNotification() {
        return this.notification;
    }

    /**
     * @return padding
     */
    public Long getPadding() {
        return this.padding;
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
    public Long getQuality() {
        return this.quality;
    }

    /**
     * @return scaleType
     */
    public String getScaleType() {
        return this.scaleType;
    }

    /**
     * @return sources
     */
    public java.util.List < Sources> getSources() {
        return this.sources;
    }

    /**
     * @return tags
     */
    public java.util.Map < String, ? > getTags() {
        return this.tags;
    }

    /**
     * @return targetURI
     */
    public String getTargetURI() {
        return this.targetURI;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<CreateImageSplicingTaskRequest, Builder> {
        private String regionId; 
        private Long align; 
        private String backgroundColor; 
        private CredentialConfig credentialConfig; 
        private String direction; 
        private String imageFormat; 
        private Long margin; 
        private Notification notification; 
        private Long padding; 
        private String projectName; 
        private Long quality; 
        private String scaleType; 
        private java.util.List < Sources> sources; 
        private java.util.Map < String, ? > tags; 
        private String targetURI; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(CreateImageSplicingTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.align = request.align;
            this.backgroundColor = request.backgroundColor;
            this.credentialConfig = request.credentialConfig;
            this.direction = request.direction;
            this.imageFormat = request.imageFormat;
            this.margin = request.margin;
            this.notification = request.notification;
            this.padding = request.padding;
            this.projectName = request.projectName;
            this.quality = request.quality;
            this.scaleType = request.scaleType;
            this.sources = request.sources;
            this.tags = request.tags;
            this.targetURI = request.targetURI;
            this.userData = request.userData;
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
         * Align.
         */
        public Builder align(Long align) {
            this.putQueryParameter("Align", align);
            this.align = align;
            return this;
        }

        /**
         * BackgroundColor.
         */
        public Builder backgroundColor(String backgroundColor) {
            this.putQueryParameter("BackgroundColor", backgroundColor);
            this.backgroundColor = backgroundColor;
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
         * Direction.
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
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
         * Margin.
         */
        public Builder margin(Long margin) {
            this.putQueryParameter("Margin", margin);
            this.margin = margin;
            return this;
        }

        /**
         * Notification.
         */
        public Builder notification(Notification notification) {
            String notificationShrink = shrink(notification, "Notification", "json");
            this.putQueryParameter("Notification", notificationShrink);
            this.notification = notification;
            return this;
        }

        /**
         * Padding.
         */
        public Builder padding(Long padding) {
            this.putQueryParameter("Padding", padding);
            this.padding = padding;
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
        public Builder quality(Long quality) {
            this.putQueryParameter("Quality", quality);
            this.quality = quality;
            return this;
        }

        /**
         * ScaleType.
         */
        public Builder scaleType(String scaleType) {
            this.putQueryParameter("ScaleType", scaleType);
            this.scaleType = scaleType;
            return this;
        }

        /**
         * Sources.
         */
        public Builder sources(java.util.List < Sources> sources) {
            String sourcesShrink = shrink(sources, "Sources", "json");
            this.putQueryParameter("Sources", sourcesShrink);
            this.sources = sources;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.Map < String, ? > tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
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
         * UserData.
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public CreateImageSplicingTaskRequest build() {
            return new CreateImageSplicingTaskRequest(this);
        } 

    } 

    public static class Sources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Rotate")
        private Long rotate;

        @com.aliyun.core.annotation.NameInMap("URI")
        @com.aliyun.core.annotation.Validation(required = true)
        private String URI;

        private Sources(Builder builder) {
            this.rotate = builder.rotate;
            this.URI = builder.URI;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sources create() {
            return builder().build();
        }

        /**
         * @return rotate
         */
        public Long getRotate() {
            return this.rotate;
        }

        /**
         * @return URI
         */
        public String getURI() {
            return this.URI;
        }

        public static final class Builder {
            private Long rotate; 
            private String URI; 

            /**
             * Rotate.
             */
            public Builder rotate(Long rotate) {
                this.rotate = rotate;
                return this;
            }

            /**
             * URI.
             */
            public Builder URI(String URI) {
                this.URI = URI;
                return this;
            }

            public Sources build() {
                return new Sources(this);
            } 

        } 

    }
}
