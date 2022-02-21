// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EncodeBlindWatermarkRequest} extends {@link RequestModel}
 *
 * <p>EncodeBlindWatermarkRequest</p>
 */
public class EncodeBlindWatermarkRequest extends Request {
    @Query
    @NameInMap("Content")
    private String content;

    @Query
    @NameInMap("ImageQuality")
    private String imageQuality;

    @Query
    @NameInMap("ImageUri")
    @Validation(required = true)
    private String imageUri;

    @Query
    @NameInMap("Model")
    private String model;

    @Query
    @NameInMap("Project")
    @Validation(required = true)
    private String project;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("TargetImageType")
    private String targetImageType;

    @Query
    @NameInMap("TargetUri")
    @Validation(required = true)
    private String targetUri;

    @Query
    @NameInMap("WatermarkUri")
    private String watermarkUri;

    private EncodeBlindWatermarkRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
        this.imageQuality = builder.imageQuality;
        this.imageUri = builder.imageUri;
        this.model = builder.model;
        this.project = builder.project;
        this.regionId = builder.regionId;
        this.targetImageType = builder.targetImageType;
        this.targetUri = builder.targetUri;
        this.watermarkUri = builder.watermarkUri;
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
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return imageQuality
     */
    public String getImageQuality() {
        return this.imageQuality;
    }

    /**
     * @return imageUri
     */
    public String getImageUri() {
        return this.imageUri;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return targetImageType
     */
    public String getTargetImageType() {
        return this.targetImageType;
    }

    /**
     * @return targetUri
     */
    public String getTargetUri() {
        return this.targetUri;
    }

    /**
     * @return watermarkUri
     */
    public String getWatermarkUri() {
        return this.watermarkUri;
    }

    public static final class Builder extends Request.Builder<EncodeBlindWatermarkRequest, Builder> {
        private String content; 
        private String imageQuality; 
        private String imageUri; 
        private String model; 
        private String project; 
        private String regionId; 
        private String targetImageType; 
        private String targetUri; 
        private String watermarkUri; 

        private Builder() {
            super();
        } 

        private Builder(EncodeBlindWatermarkRequest response) {
            super(response);
            this.content = response.content;
            this.imageQuality = response.imageQuality;
            this.imageUri = response.imageUri;
            this.model = response.model;
            this.project = response.project;
            this.regionId = response.regionId;
            this.targetImageType = response.targetImageType;
            this.targetUri = response.targetUri;
            this.watermarkUri = response.watermarkUri;
        } 

        /**
         * Content.
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * ImageQuality.
         */
        public Builder imageQuality(String imageQuality) {
            this.putQueryParameter("ImageQuality", imageQuality);
            this.imageQuality = imageQuality;
            return this;
        }

        /**
         * ImageUri.
         */
        public Builder imageUri(String imageUri) {
            this.putQueryParameter("ImageUri", imageUri);
            this.imageUri = imageUri;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(String model) {
            this.putQueryParameter("Model", model);
            this.model = model;
            return this;
        }

        /**
         * Project.
         */
        public Builder project(String project) {
            this.putQueryParameter("Project", project);
            this.project = project;
            return this;
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
         * TargetImageType.
         */
        public Builder targetImageType(String targetImageType) {
            this.putQueryParameter("TargetImageType", targetImageType);
            this.targetImageType = targetImageType;
            return this;
        }

        /**
         * TargetUri.
         */
        public Builder targetUri(String targetUri) {
            this.putQueryParameter("TargetUri", targetUri);
            this.targetUri = targetUri;
            return this;
        }

        /**
         * WatermarkUri.
         */
        public Builder watermarkUri(String watermarkUri) {
            this.putQueryParameter("WatermarkUri", watermarkUri);
            this.watermarkUri = watermarkUri;
            return this;
        }

        @Override
        public EncodeBlindWatermarkRequest build() {
            return new EncodeBlindWatermarkRequest(this);
        } 

    } 

}
