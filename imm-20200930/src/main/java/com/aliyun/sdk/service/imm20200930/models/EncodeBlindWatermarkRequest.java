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
 * {@link EncodeBlindWatermarkRequest} extends {@link RequestModel}
 *
 * <p>EncodeBlindWatermarkRequest</p>
 */
public class EncodeBlindWatermarkRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageQuality")
    private Integer imageQuality;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceURI")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceURI;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrengthLevel")
    private String strengthLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetURI")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetURI;

    private EncodeBlindWatermarkRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.content = builder.content;
        this.imageQuality = builder.imageQuality;
        this.projectName = builder.projectName;
        this.sourceURI = builder.sourceURI;
        this.strengthLevel = builder.strengthLevel;
        this.targetURI = builder.targetURI;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EncodeBlindWatermarkRequest create() {
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
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return imageQuality
     */
    public Integer getImageQuality() {
        return this.imageQuality;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return sourceURI
     */
    public String getSourceURI() {
        return this.sourceURI;
    }

    /**
     * @return strengthLevel
     */
    public String getStrengthLevel() {
        return this.strengthLevel;
    }

    /**
     * @return targetURI
     */
    public String getTargetURI() {
        return this.targetURI;
    }

    public static final class Builder extends Request.Builder<EncodeBlindWatermarkRequest, Builder> {
        private String regionId; 
        private String content; 
        private Integer imageQuality; 
        private String projectName; 
        private String sourceURI; 
        private String strengthLevel; 
        private String targetURI; 

        private Builder() {
            super();
        } 

        private Builder(EncodeBlindWatermarkRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.content = request.content;
            this.imageQuality = request.imageQuality;
            this.projectName = request.projectName;
            this.sourceURI = request.sourceURI;
            this.strengthLevel = request.strengthLevel;
            this.targetURI = request.targetURI;
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
         * <p>The text content of watermarks. It can be up to 256 characters in length.</p>
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * <p>This parameter takes effect only if the input image format is JPG.</p>
         * <p>The storage quality of the output image that carries the watermarks. Default value: 90. Valid values: 70 to 100. The higher the quality, the larger the image size and the higher the watermark resolution quality.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        public Builder imageQuality(Integer imageQuality) {
            this.putQueryParameter("ImageQuality", imageQuality);
            this.imageQuality = imageQuality;
            return this;
        }

        /**
         * <p>The name of the project. For more information, see <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a>.</p>
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
         * <p>The Object Storage Service (OSS) URI of the image.</p>
         * <p>Specify the value in the oss://${Bucket}/${Object} format. <code>${Bucket}</code> specifies the name of the OSS bucket that resides in the same region with the current project. <code>${Object}</code> specifies the path of the object with the extension included.</p>
         * <p>Supported image formats: JPG, PNG, BMP, TIFF, and WebP.</p>
         * <p>Image size limit: 10,000 px maximum and 80 px x 80 px minimum.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket/test-object.jpg</p>
         */
        public Builder sourceURI(String sourceURI) {
            this.putQueryParameter("SourceURI", sourceURI);
            this.sourceURI = sourceURI;
            return this;
        }

        /**
         * <p>The watermark strength level. The higher the strength, the more resistant the watermarked image is to attacks, but the more the image is distorted. Default value: low. Valid values: [low, medium, high].</p>
         * 
         * <strong>example:</strong>
         * <p>low</p>
         */
        public Builder strengthLevel(String strengthLevel) {
            this.putQueryParameter("StrengthLevel", strengthLevel);
            this.strengthLevel = strengthLevel;
            return this;
        }

        /**
         * <p>The URI of the output image in OSS.</p>
         * <p>Specify the URI in the oss://${Bucket}/${Object} format, where <code>${Bucket}</code> is the name of the bucket in the same region as the current project and <code>${Object}</code> is the path of the object with the extension included.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li>The format of the output image is the same as that of the input image.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket/target-object.jpg</p>
         */
        public Builder targetURI(String targetURI) {
            this.putQueryParameter("TargetURI", targetURI);
            this.targetURI = targetURI;
            return this;
        }

        @Override
        public EncodeBlindWatermarkRequest build() {
            return new EncodeBlindWatermarkRequest(this);
        } 

    } 

}
