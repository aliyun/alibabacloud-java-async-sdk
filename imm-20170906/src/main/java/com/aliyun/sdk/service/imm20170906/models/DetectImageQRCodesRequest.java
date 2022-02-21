// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetectImageQRCodesRequest} extends {@link RequestModel}
 *
 * <p>DetectImageQRCodesRequest</p>
 */
public class DetectImageQRCodesRequest extends Request {
    @Query
    @NameInMap("ImageUri")
    @Validation(required = true)
    private String imageUri;

    @Query
    @NameInMap("Project")
    @Validation(required = true)
    private String project;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DetectImageQRCodesRequest(Builder builder) {
        super(builder);
        this.imageUri = builder.imageUri;
        this.project = builder.project;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetectImageQRCodesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageUri
     */
    public String getImageUri() {
        return this.imageUri;
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

    public static final class Builder extends Request.Builder<DetectImageQRCodesRequest, Builder> {
        private String imageUri; 
        private String project; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DetectImageQRCodesRequest response) {
            super(response);
            this.imageUri = response.imageUri;
            this.project = response.project;
            this.regionId = response.regionId;
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

        @Override
        public DetectImageQRCodesRequest build() {
            return new DetectImageQRCodesRequest(this);
        } 

    } 

}
