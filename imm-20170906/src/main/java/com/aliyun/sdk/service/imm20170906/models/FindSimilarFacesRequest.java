// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FindSimilarFacesRequest} extends {@link RequestModel}
 *
 * <p>FindSimilarFacesRequest</p>
 */
public class FindSimilarFacesRequest extends Request {
    @Query
    @NameInMap("FaceId")
    private String faceId;

    @Query
    @NameInMap("ImageUri")
    private String imageUri;

    @Query
    @NameInMap("Limit")
    private Integer limit;

    @Query
    @NameInMap("MinSimilarity")
    private Float minSimilarity;

    @Query
    @NameInMap("Project")
    @Validation(required = true)
    private String project;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResponseFormat")
    private String responseFormat;

    @Query
    @NameInMap("SetId")
    @Validation(required = true)
    private String setId;

    private FindSimilarFacesRequest(Builder builder) {
        super(builder);
        this.faceId = builder.faceId;
        this.imageUri = builder.imageUri;
        this.limit = builder.limit;
        this.minSimilarity = builder.minSimilarity;
        this.project = builder.project;
        this.regionId = builder.regionId;
        this.responseFormat = builder.responseFormat;
        this.setId = builder.setId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FindSimilarFacesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return faceId
     */
    public String getFaceId() {
        return this.faceId;
    }

    /**
     * @return imageUri
     */
    public String getImageUri() {
        return this.imageUri;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return minSimilarity
     */
    public Float getMinSimilarity() {
        return this.minSimilarity;
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
     * @return responseFormat
     */
    public String getResponseFormat() {
        return this.responseFormat;
    }

    /**
     * @return setId
     */
    public String getSetId() {
        return this.setId;
    }

    public static final class Builder extends Request.Builder<FindSimilarFacesRequest, Builder> {
        private String faceId; 
        private String imageUri; 
        private Integer limit; 
        private Float minSimilarity; 
        private String project; 
        private String regionId; 
        private String responseFormat; 
        private String setId; 

        private Builder() {
            super();
        } 

        private Builder(FindSimilarFacesRequest response) {
            super(response);
            this.faceId = response.faceId;
            this.imageUri = response.imageUri;
            this.limit = response.limit;
            this.minSimilarity = response.minSimilarity;
            this.project = response.project;
            this.regionId = response.regionId;
            this.responseFormat = response.responseFormat;
            this.setId = response.setId;
        } 

        /**
         * FaceId.
         */
        public Builder faceId(String faceId) {
            this.putQueryParameter("FaceId", faceId);
            this.faceId = faceId;
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
         * Limit.
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * MinSimilarity.
         */
        public Builder minSimilarity(Float minSimilarity) {
            this.putQueryParameter("MinSimilarity", minSimilarity);
            this.minSimilarity = minSimilarity;
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
         * ResponseFormat.
         */
        public Builder responseFormat(String responseFormat) {
            this.putQueryParameter("ResponseFormat", responseFormat);
            this.responseFormat = responseFormat;
            return this;
        }

        /**
         * SetId.
         */
        public Builder setId(String setId) {
            this.putQueryParameter("SetId", setId);
            this.setId = setId;
            return this;
        }

        @Override
        public FindSimilarFacesRequest build() {
            return new FindSimilarFacesRequest(this);
        } 

    } 

}
