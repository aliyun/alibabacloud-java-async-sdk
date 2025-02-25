// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserImageRequest} extends {@link RequestModel}
 *
 * <p>GetUserImageRequest</p>
 */
public class GetUserImageRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("ContainerType")
    @Validation(required = true)
    private String containerType;

    @Query
    @NameInMap("ImageName")
    @Validation(required = true)
    private String imageName;

    @Query
    @NameInMap("ImagePath")
    @Validation(required = true)
    private String imagePath;

    @Query
    @NameInMap("OSSBucket")
    @Validation(required = true)
    private String OSSBucket;

    @Query
    @NameInMap("OSSEndPoint")
    @Validation(required = true)
    private String OSSEndPoint;

    private GetUserImageRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clusterId = builder.clusterId;
        this.containerType = builder.containerType;
        this.imageName = builder.imageName;
        this.imagePath = builder.imagePath;
        this.OSSBucket = builder.OSSBucket;
        this.OSSEndPoint = builder.OSSEndPoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserImageRequest create() {
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
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return containerType
     */
    public String getContainerType() {
        return this.containerType;
    }

    /**
     * @return imageName
     */
    public String getImageName() {
        return this.imageName;
    }

    /**
     * @return imagePath
     */
    public String getImagePath() {
        return this.imagePath;
    }

    /**
     * @return OSSBucket
     */
    public String getOSSBucket() {
        return this.OSSBucket;
    }

    /**
     * @return OSSEndPoint
     */
    public String getOSSEndPoint() {
        return this.OSSEndPoint;
    }

    public static final class Builder extends Request.Builder<GetUserImageRequest, Builder> {
        private String regionId; 
        private String clusterId; 
        private String containerType; 
        private String imageName; 
        private String imagePath; 
        private String OSSBucket; 
        private String OSSEndPoint; 

        private Builder() {
            super();
        } 

        private Builder(GetUserImageRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clusterId = request.clusterId;
            this.containerType = request.containerType;
            this.imageName = request.imageName;
            this.imagePath = request.imagePath;
            this.OSSBucket = request.OSSBucket;
            this.OSSEndPoint = request.OSSEndPoint;
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
         * The cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The type of the image. Set the value to singularity.
         */
        public Builder containerType(String containerType) {
            this.putQueryParameter("ContainerType", containerType);
            this.containerType = containerType;
            return this;
        }

        /**
         * The image name.
         */
        public Builder imageName(String imageName) {
            this.putQueryParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * The path where the image is stored in the OSS bucket.
         */
        public Builder imagePath(String imagePath) {
            this.putQueryParameter("ImagePath", imagePath);
            this.imagePath = imagePath;
            return this;
        }

        /**
         * The OSS bucket.
         */
        public Builder OSSBucket(String OSSBucket) {
            this.putQueryParameter("OSSBucket", OSSBucket);
            this.OSSBucket = OSSBucket;
            return this;
        }

        /**
         * The OSS endpoint.
         */
        public Builder OSSEndPoint(String OSSEndPoint) {
            this.putQueryParameter("OSSEndPoint", OSSEndPoint);
            this.OSSEndPoint = OSSEndPoint;
            return this;
        }

        @Override
        public GetUserImageRequest build() {
            return new GetUserImageRequest(this);
        } 

    } 

}
