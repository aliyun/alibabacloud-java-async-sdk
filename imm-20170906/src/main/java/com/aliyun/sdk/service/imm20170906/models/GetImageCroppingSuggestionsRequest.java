// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetImageCroppingSuggestionsRequest} extends {@link RequestModel}
 *
 * <p>GetImageCroppingSuggestionsRequest</p>
 */
public class GetImageCroppingSuggestionsRequest extends Request {
    @Query
    @NameInMap("AspectRatios")
    @Validation(required = true)
    private String aspectRatios;

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

    private GetImageCroppingSuggestionsRequest(Builder builder) {
        super(builder);
        this.aspectRatios = builder.aspectRatios;
        this.imageUri = builder.imageUri;
        this.project = builder.project;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetImageCroppingSuggestionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aspectRatios
     */
    public String getAspectRatios() {
        return this.aspectRatios;
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

    public static final class Builder extends Request.Builder<GetImageCroppingSuggestionsRequest, Builder> {
        private String aspectRatios; 
        private String imageUri; 
        private String project; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetImageCroppingSuggestionsRequest response) {
            super(response);
            this.aspectRatios = response.aspectRatios;
            this.imageUri = response.imageUri;
            this.project = response.project;
            this.regionId = response.regionId;
        } 

        /**
         * AspectRatios.
         */
        public Builder aspectRatios(String aspectRatios) {
            this.putQueryParameter("AspectRatios", aspectRatios);
            this.aspectRatios = aspectRatios;
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
        public GetImageCroppingSuggestionsRequest build() {
            return new GetImageCroppingSuggestionsRequest(this);
        } 

    } 

}
