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
    private java.util.List<Sources> sources;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.Map<String, ?> tags;

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
    public java.util.List<Sources> getSources() {
        return this.sources;
    }

    /**
     * @return tags
     */
    public java.util.Map<String, ?> getTags() {
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
        private java.util.List<Sources> sources; 
        private java.util.Map<String, ?> tags; 
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
         * <p>The alignment value, in pixels, for the width or height of the images to be stitched. The value can range from 1 to 4096.</p>
         * <ul>
         * <li><p>If you set <strong>Direction</strong> to <code>vertical</code>, this parameter specifies the width alignment.</p>
         * </li>
         * <li><p>If you set <strong>Direction</strong> to <code>horizontal</code>, this parameter specifies the height alignment.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If you do not specify this parameter, the width or height of the first image is used for alignment by default.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>192</p>
         */
        public Builder align(Long align) {
            this.putQueryParameter("Align", align);
            this.align = align;
            return this;
        }

        /**
         * <p>The fill color for the areas specified by <code>Padding</code> and <code>Margin</code>. The value can be in the <code>#FFFFFF</code> format or a keyword such as <code>red</code> or <code>alpha</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>red</p>
         */
        public Builder backgroundColor(String backgroundColor) {
            this.putQueryParameter("BackgroundColor", backgroundColor);
            this.backgroundColor = backgroundColor;
            return this;
        }

        /**
         * <p>The chained authorization configuration. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Use chained authorization to access resources of other entities</a>.</p>
         */
        public Builder credentialConfig(CredentialConfig credentialConfig) {
            String credentialConfigShrink = shrink(credentialConfig, "CredentialConfig", "json");
            this.putQueryParameter("CredentialConfig", credentialConfigShrink);
            this.credentialConfig = credentialConfig;
            return this;
        }

        /**
         * <p>The image stitching method. Valid values:</p>
         * <ul>
         * <li><p>vertical (default): Stitches images vertically. The widths of all images must be the same.</p>
         * </li>
         * <li><p>horizontal: Stitches images horizontally. The heights of all images must be the same.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vertical</p>
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * <p>The compression format of the output image. Valid values:</p>
         * <ul>
         * <li><p>jpg (default)</p>
         * </li>
         * <li><p>png</p>
         * </li>
         * <li><p>webp</p>
         * </li>
         * </ul>
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
         * <p>The blank margin, in pixels, of the stitched image. The default value is 0.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder margin(Long margin) {
            this.putQueryParameter("Margin", margin);
            this.margin = margin;
            return this;
        }

        /**
         * <p>The message notification configuration. For information about the format of asynchronous notification messages, see <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous notification message format</a>.</p>
         */
        public Builder notification(Notification notification) {
            String notificationShrink = shrink(notification, "Notification", "json");
            this.putQueryParameter("Notification", notificationShrink);
            this.notification = notification;
            return this;
        }

        /**
         * <p>The space, in pixels, between sub-images in the stitched image. The default value is 0.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder padding(Long padding) {
            this.putQueryParameter("Padding", padding);
            this.padding = padding;
            return this;
        }

        /**
         * <p>The project name. For more information about how to obtain the project name, see <a href="https://help.aliyun.com/document_detail/478153.html">Create a project</a>.</p>
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
         * <p>The compression quality of the output image. This parameter is valid only for JPG and WebP images. The value range is 0 to 100. The default value is 80.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder quality(Long quality) {
            this.putQueryParameter("Quality", quality);
            this.quality = quality;
            return this;
        }

        /**
         * <p>The scaling method used when the width or height of an image is aligned. Valid values:</p>
         * <ul>
         * <li><p>fit (default): Scales the image without adding black bars. Only proportional scaling is supported.</p>
         * </li>
         * <li><p>stretch: Stretches the image to fill the space.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>stretch</p>
         */
        public Builder scaleType(String scaleType) {
            this.putQueryParameter("ScaleType", scaleType);
            this.scaleType = scaleType;
            return this;
        }

        /**
         * <p>The list of input images. The images are stitched in the order of their URIs in the list.</p>
         * <p>This parameter is required.</p>
         */
        public Builder sources(java.util.List<Sources> sources) {
            String sourcesShrink = shrink(sources, "Sources", "json");
            this.putQueryParameter("Sources", sourcesShrink);
            this.sources = sources;
            return this;
        }

        /**
         * <p>Custom tags used to search for and filter asynchronous tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;User&quot;: &quot;Jane&quot;
         * }</p>
         */
        public Builder tags(java.util.Map<String, ?> tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The OSS URI where the output image is stored.</p>
         * <p>The URI must be in the oss\://${bucketname}/${objectname} format. ${bucketname} is the name of the OSS bucket that is in the same region as the project. ${objectname} is the path of the file, including the file name.</p>
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
         * <p>The custom information. This information is returned in the asynchronous notification message. Use this information to associate the notification message with your system. The maximum length is 2,048 bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>test-data</p>
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

    /**
     * 
     * {@link CreateImageSplicingTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateImageSplicingTaskRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(Sources model) {
                this.rotate = model.rotate;
                this.URI = model.URI;
            } 

            /**
             * <p>The rotation angle of the image. Valid values:</p>
             * <ul>
             * <li><p>0 (default)</p>
             * </li>
             * <li><p>90</p>
             * </li>
             * <li><p>180</p>
             * </li>
             * <li><p>270</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder rotate(Long rotate) {
                this.rotate = rotate;
                return this;
            }

            /**
             * <p>The OSS URI of the source image.</p>
             * <p>The URI must be in the oss\://${Bucket}/${Object} format. <code>${Bucket}</code> is the name of the OSS bucket that is in the same region as the project. <code>${Object}</code> is the full path of the file, including the file name extension.</p>
             * <p>Supported image formats: JPG and PNG.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://examplebucket/sampleobject.jpg</p>
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
