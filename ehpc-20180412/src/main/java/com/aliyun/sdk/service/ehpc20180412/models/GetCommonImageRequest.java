// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCommonImageRequest} extends {@link RequestModel}
 *
 * <p>GetCommonImageRequest</p>
 */
public class GetCommonImageRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("ContainType")
    private String containType;

    @Query
    @NameInMap("ImageName")
    private String imageName;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private GetCommonImageRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.containType = builder.containType;
        this.imageName = builder.imageName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCommonImageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return containType
     */
    public String getContainType() {
        return this.containType;
    }

    /**
     * @return imageName
     */
    public String getImageName() {
        return this.imageName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetCommonImageRequest, Builder> {
        private String clusterId; 
        private String containType; 
        private String imageName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetCommonImageRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.containType = request.containType;
            this.imageName = request.imageName;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the cluster to which you want to store the image.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The image type.
         */
        public Builder containType(String containType) {
            this.putQueryParameter("ContainType", containType);
            this.containType = containType;
            return this;
        }

        /**
         * The name of the image that you want to obtain.
         */
        public Builder imageName(String imageName) {
            this.putQueryParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * The region ID of the cluster. You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetCommonImageRequest build() {
            return new GetCommonImageRequest(this);
        } 

    } 

}
