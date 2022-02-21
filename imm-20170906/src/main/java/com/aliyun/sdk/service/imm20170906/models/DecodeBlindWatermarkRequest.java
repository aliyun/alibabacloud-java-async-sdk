// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DecodeBlindWatermarkRequest} extends {@link RequestModel}
 *
 * <p>DecodeBlindWatermarkRequest</p>
 */
public class DecodeBlindWatermarkRequest extends Request {
    @Query
    @NameInMap("ImageQuality")
    private Integer imageQuality;

    @Query
    @NameInMap("ImageUri")
    @Validation(required = true)
    private String imageUri;

    @Query
    @NameInMap("Model")
    private String model;

    @Query
    @NameInMap("OriginalImageUri")
    private String originalImageUri;

    @Query
    @NameInMap("Project")
    @Validation(required = true)
    private String project;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("TargetUri")
    private String targetUri;

    private DecodeBlindWatermarkRequest(Builder builder) {
        super(builder);
        this.imageQuality = builder.imageQuality;
        this.imageUri = builder.imageUri;
        this.model = builder.model;
        this.originalImageUri = builder.originalImageUri;
        this.project = builder.project;
        this.regionId = builder.regionId;
        this.targetUri = builder.targetUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DecodeBlindWatermarkRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageQuality
     */
    public Integer getImageQuality() {
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
     * @return originalImageUri
     */
    public String getOriginalImageUri() {
        return this.originalImageUri;
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
     * @return targetUri
     */
    public String getTargetUri() {
        return this.targetUri;
    }

    public static final class Builder extends Request.Builder<DecodeBlindWatermarkRequest, Builder> {
        private Integer imageQuality; 
        private String imageUri; 
        private String model; 
        private String originalImageUri; 
        private String project; 
        private String regionId; 
        private String targetUri; 

        private Builder() {
            super();
        } 

        private Builder(DecodeBlindWatermarkRequest response) {
            super(response);
            this.imageQuality = response.imageQuality;
            this.imageUri = response.imageUri;
            this.model = response.model;
            this.originalImageUri = response.originalImageUri;
            this.project = response.project;
            this.regionId = response.regionId;
            this.targetUri = response.targetUri;
        } 

        /**
         * ImageQuality.
         */
        public Builder imageQuality(Integer imageQuality) {
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
         * OriginalImageUri.
         */
        public Builder originalImageUri(String originalImageUri) {
            this.putQueryParameter("OriginalImageUri", originalImageUri);
            this.originalImageUri = originalImageUri;
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
         * TargetUri.
         */
        public Builder targetUri(String targetUri) {
            this.putQueryParameter("TargetUri", targetUri);
            this.targetUri = targetUri;
            return this;
        }

        @Override
        public DecodeBlindWatermarkRequest build() {
            return new DecodeBlindWatermarkRequest(this);
        } 

    } 

}
