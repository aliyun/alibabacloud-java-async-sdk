// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CompareImageFacesRequest} extends {@link RequestModel}
 *
 * <p>CompareImageFacesRequest</p>
 */
public class CompareImageFacesRequest extends Request {
    @Query
    @NameInMap("FaceIdA")
    private String faceIdA;

    @Query
    @NameInMap("FaceIdB")
    private String faceIdB;

    @Query
    @NameInMap("ImageUriA")
    private String imageUriA;

    @Query
    @NameInMap("ImageUriB")
    private String imageUriB;

    @Query
    @NameInMap("Project")
    @Validation(required = true)
    private String project;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SetId")
    private String setId;

    private CompareImageFacesRequest(Builder builder) {
        super(builder);
        this.faceIdA = builder.faceIdA;
        this.faceIdB = builder.faceIdB;
        this.imageUriA = builder.imageUriA;
        this.imageUriB = builder.imageUriB;
        this.project = builder.project;
        this.regionId = builder.regionId;
        this.setId = builder.setId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CompareImageFacesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return faceIdA
     */
    public String getFaceIdA() {
        return this.faceIdA;
    }

    /**
     * @return faceIdB
     */
    public String getFaceIdB() {
        return this.faceIdB;
    }

    /**
     * @return imageUriA
     */
    public String getImageUriA() {
        return this.imageUriA;
    }

    /**
     * @return imageUriB
     */
    public String getImageUriB() {
        return this.imageUriB;
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
     * @return setId
     */
    public String getSetId() {
        return this.setId;
    }

    public static final class Builder extends Request.Builder<CompareImageFacesRequest, Builder> {
        private String faceIdA; 
        private String faceIdB; 
        private String imageUriA; 
        private String imageUriB; 
        private String project; 
        private String regionId; 
        private String setId; 

        private Builder() {
            super();
        } 

        private Builder(CompareImageFacesRequest response) {
            super(response);
            this.faceIdA = response.faceIdA;
            this.faceIdB = response.faceIdB;
            this.imageUriA = response.imageUriA;
            this.imageUriB = response.imageUriB;
            this.project = response.project;
            this.regionId = response.regionId;
            this.setId = response.setId;
        } 

        /**
         * FaceIdA.
         */
        public Builder faceIdA(String faceIdA) {
            this.putQueryParameter("FaceIdA", faceIdA);
            this.faceIdA = faceIdA;
            return this;
        }

        /**
         * FaceIdB.
         */
        public Builder faceIdB(String faceIdB) {
            this.putQueryParameter("FaceIdB", faceIdB);
            this.faceIdB = faceIdB;
            return this;
        }

        /**
         * ImageUriA.
         */
        public Builder imageUriA(String imageUriA) {
            this.putQueryParameter("ImageUriA", imageUriA);
            this.imageUriA = imageUriA;
            return this;
        }

        /**
         * ImageUriB.
         */
        public Builder imageUriB(String imageUriB) {
            this.putQueryParameter("ImageUriB", imageUriB);
            this.imageUriB = imageUriB;
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
         * SetId.
         */
        public Builder setId(String setId) {
            this.putQueryParameter("SetId", setId);
            this.setId = setId;
            return this;
        }

        @Override
        public CompareImageFacesRequest build() {
            return new CompareImageFacesRequest(this);
        } 

    } 

}
