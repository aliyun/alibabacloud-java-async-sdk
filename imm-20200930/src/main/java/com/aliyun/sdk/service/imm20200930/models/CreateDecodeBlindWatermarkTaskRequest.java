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
 * {@link CreateDecodeBlindWatermarkTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateDecodeBlindWatermarkTaskRequest</p>
 */
public class CreateDecodeBlindWatermarkTaskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageQuality")
    private Integer imageQuality;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Model")
    private String model;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Notification")
    private Notification notification;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OriginalImageURI")
    private String originalImageURI;

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
    private String targetURI;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WatermarkType")
    private String watermarkType;

    private CreateDecodeBlindWatermarkTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.imageQuality = builder.imageQuality;
        this.model = builder.model;
        this.notification = builder.notification;
        this.originalImageURI = builder.originalImageURI;
        this.projectName = builder.projectName;
        this.sourceURI = builder.sourceURI;
        this.strengthLevel = builder.strengthLevel;
        this.targetURI = builder.targetURI;
        this.watermarkType = builder.watermarkType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDecodeBlindWatermarkTaskRequest create() {
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
     * @return imageQuality
     */
    public Integer getImageQuality() {
        return this.imageQuality;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return notification
     */
    public Notification getNotification() {
        return this.notification;
    }

    /**
     * @return originalImageURI
     */
    public String getOriginalImageURI() {
        return this.originalImageURI;
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

    /**
     * @return watermarkType
     */
    public String getWatermarkType() {
        return this.watermarkType;
    }

    public static final class Builder extends Request.Builder<CreateDecodeBlindWatermarkTaskRequest, Builder> {
        private String regionId; 
        private Integer imageQuality; 
        private String model; 
        private Notification notification; 
        private String originalImageURI; 
        private String projectName; 
        private String sourceURI; 
        private String strengthLevel; 
        private String targetURI; 
        private String watermarkType; 

        private Builder() {
            super();
        } 

        private Builder(CreateDecodeBlindWatermarkTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.imageQuality = request.imageQuality;
            this.model = request.model;
            this.notification = request.notification;
            this.originalImageURI = request.originalImageURI;
            this.projectName = request.projectName;
            this.sourceURI = request.sourceURI;
            this.strengthLevel = request.strengthLevel;
            this.targetURI = request.targetURI;
            this.watermarkType = request.watermarkType;
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
         * <p>The quality of the output image. This parameter is also available in the earlier DecodeBlindWatermark operation.</p>
         * <p>Higher image quality indicates a larger image size and higher watermark resolution quality.</p>
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
         * <p>The watermark algorithm model. This parameter is also available in the earlier DecodeBlindWatermark operation. Valid values: FFT, FFT_FULL, DWT, and DWT_IBG. Default value: FFT.</p>
         * <p>If this parameter is left empty, the CreateDecodeBlindWatermarkTask operation is called. Otherwise, the earlier DecodeBlindWatermark operation is called.</p>
         * 
         * <strong>example:</strong>
         * <p>FFT</p>
         */
        public Builder model(String model) {
            this.putQueryParameter("Model", model);
            this.model = model;
            return this;
        }

        /**
         * <p>The notification settings. For information about the asynchronous notification format, see <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous message examples</a>.</p>
         */
        public Builder notification(Notification notification) {
            String notificationShrink = shrink(notification, "Notification", "json");
            this.putQueryParameter("Notification", notificationShrink);
            this.notification = notification;
            return this;
        }

        /**
         * <p>The OSS URI of the image before the blind watermark is added. This parameter is also available in the earlier DecodeBlindWatermark operation.</p>
         * <p>Do not specify this parameter when you set the Model parameter to DWT or DWT_IBG.</p>
         * <p>Specify the OSS URI in the <code>oss://&lt;bucket&gt;/&lt;object&gt;</code> format, where <code>&lt;bucket&gt;</code> is the name of the bucket in the same region as the current project and <code>&lt;object&gt;</code> is the path of the object with the extension included.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://imm-test/testcases/watermarktestbefore.jpg</p>
         */
        public Builder originalImageURI(String originalImageURI) {
            this.putQueryParameter("OriginalImageURI", originalImageURI);
            this.originalImageURI = originalImageURI;
            return this;
        }

        /**
         * <p>The name of the project.<a href="~~478153~~"></a></p>
         * <blockquote>
         * <p> The project specified in the request must match the one in the EncodeBlindWatermark request to encode the blind watermark.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>immtest</p>
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>The OSS URI of the image.</p>
         * <p>Specify the OSS URI in the <code>oss://&lt;bucket&gt;/&lt;object&gt;</code> format, where <code>&lt;bucket&gt;</code> is the name of the bucket in the same region as the current project and <code>&lt;object&gt;</code> is the path of the object with the extension included.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://target/sampleobject.jpg</p>
         */
        public Builder sourceURI(String sourceURI) {
            this.putQueryParameter("SourceURI", sourceURI);
            this.sourceURI = sourceURI;
            return this;
        }

        /**
         * <p>The watermark strength level. The higher the strength level, the more resistant the watermarked image is to attacks, but the more the image is distorted. Valid values: low, medium, and high. Default value: low.</p>
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
         * <p>The OSS URI of the output image. This parameter is also available in the earlier DecodeBlindWatermark operation.</p>
         * <p>Specify the OSS URI in the <code>oss://&lt;bucket&gt;/&lt;object&gt;</code> format, where <code>&lt;bucket&gt;</code> is the name of the bucket in the same region as the current project and <code>&lt;object&gt;</code> is the path of the object with the extension included.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://target/targetobject.jpg</p>
         */
        public Builder targetURI(String targetURI) {
            this.putQueryParameter("TargetURI", targetURI);
            this.targetURI = targetURI;
            return this;
        }

        /**
         * <p>The type of the watermark. Valid value: text.</p>
         * <p>No image watermarks are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        public Builder watermarkType(String watermarkType) {
            this.putQueryParameter("WatermarkType", watermarkType);
            this.watermarkType = watermarkType;
            return this;
        }

        @Override
        public CreateDecodeBlindWatermarkTaskRequest build() {
            return new CreateDecodeBlindWatermarkTaskRequest(this);
        } 

    } 

}
