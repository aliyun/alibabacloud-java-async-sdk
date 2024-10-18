// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
         * <p>The width or height with which the input images must align. Valid values: 1 to 4096. Unit: px.</p>
         * <ul>
         * <li>If you set <strong>Direction</strong> to <code>vertical</code>, this parameter specifies the width with which the input images must align.</li>
         * <li>If you set <strong>Direction</strong> to <code>horizontal</code>, this parameter specifies the height with which the input images must align.</li>
         * </ul>
         * <blockquote>
         * <p> If you do not specify this parameter, the width or height of the first input image is used.</p>
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
         * <p>The padding color of the spaces specified by <code>Padding</code> and <code>Margin</code>. Colors encoded in the <code>#FFFFFF</code> format and colors that are related to preset keywords such as <code>red</code> and <code>alpha</code> are supported.</p>
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
         * <p>The authorization chain. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Use authorization chains to access resources of other entities</a>.</p>
         */
        public Builder credentialConfig(CredentialConfig credentialConfig) {
            String credentialConfigShrink = shrink(credentialConfig, "CredentialConfig", "json");
            this.putQueryParameter("CredentialConfig", credentialConfigShrink);
            this.credentialConfig = credentialConfig;
            return this;
        }

        /**
         * <p>The splicing method. Valid values:</p>
         * <ul>
         * <li>vertical (default): All input images are vertically aligned and have the same width.</li>
         * <li>horizontal: All input images are horizontally aligned and have the same height.</li>
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
         * <li>jpg (default)</li>
         * <li>png</li>
         * <li>webp</li>
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
         * <p>The empty space or border around the edges of the output image. Default value: 0. Unit: px.</p>
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
         * <p>The notification settings. For more information, click Notification. For information about the asynchronous notification format, see <a href="https://help.aliyun.com/document_detail/471456.html">Asynchronous notification format</a>.</p>
         */
        public Builder notification(Notification notification) {
            String notificationShrink = shrink(notification, "Notification", "json");
            this.putQueryParameter("Notification", notificationShrink);
            this.notification = notification;
            return this;
        }

        /**
         * <p>The space between component images in the output image. Default value: 0. Unit: px.</p>
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
         * <p>The name of the project. You can obtain the name of the project from the response of the <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a> operation.</p>
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
         * <p>The compression quality of the output image. This parameter takes effect only for JPG and WebP images. Valid values: 0 to 100. Default value: 80.</p>
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
         * <p>The scaling mode of the input images that are vertically or horizontally aligned. Valid values:</p>
         * <ul>
         * <li>fit (default): Input images are scaled proportionally, and black edges are not retained.</li>
         * <li>stretch: Input images are stretched to fill the space.</li>
         * <li>horizon: Input images are horizontally stretched.</li>
         * <li>vertical: Input images are vertically stretched.</li>
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
         * <p>The input images. The images are sliced in the order of the input image URIs.</p>
         * <p>This parameter is required.</p>
         */
        public Builder sources(java.util.List < Sources> sources) {
            String sourcesShrink = shrink(sources, "Sources", "json");
            this.putQueryParameter("Sources", sourcesShrink);
            this.sources = sources;
            return this;
        }

        /**
         * <p>The custom tags. You can search for or filter asynchronous tasks by custom tag.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;User&quot;: &quot;Jane&quot;
         * }</p>
         */
        public Builder tags(java.util.Map < String, ? > tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The OSS bucket in which you want to store the output image.</p>
         * <p>Specify the value in the oss://${bucketname}/${objectname} format. ${bucketname} specifies the name of the OSS bucket that resides in the same region as the current project. ${objectname} specifies the path to the output image.</p>
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
         * <p>The user data, which is returned as asynchronous notifications to help manage notifications within your system. The maximum length of the user data is 2,048 bytes.</p>
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

            /**
             * <p>The rotation angle. Valid values:</p>
             * <ul>
             * <li>0 (default)</li>
             * <li>90</li>
             * <li>180</li>
             * <li>270</li>
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
             * <p>The Object Storage Service (OSS) bucket in which you store the input images.</p>
             * <p>Specify the value in the oss://${Bucket}/${Object} format. <code>${Bucket}</code> specifies the name of the OSS bucket that resides in the same region as the current project. <code>${Object}</code> specifies the complete path to the input images that have an extension.</p>
             * <p>The following image formats are supported: jpg and png.</p>
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
