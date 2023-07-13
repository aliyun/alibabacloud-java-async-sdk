// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLocalImageRequest} extends {@link RequestModel}
 *
 * <p>DeleteLocalImageRequest</p>
 */
public class DeleteLocalImageRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
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

    private DeleteLocalImageRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clusterId = builder.clusterId;
        this.containerType = builder.containerType;
        this.imageName = builder.imageName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLocalImageRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteLocalImageRequest, Builder> {
        private String regionId; 
        private String clusterId; 
        private String containerType; 
        private String imageName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLocalImageRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clusterId = request.clusterId;
            this.containerType = request.containerType;
            this.imageName = request.imageName;
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
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * ContainerType.
         */
        public Builder containerType(String containerType) {
            this.putQueryParameter("ContainerType", containerType);
            this.containerType = containerType;
            return this;
        }

        /**
         * ImageName.
         */
        public Builder imageName(String imageName) {
            this.putQueryParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        @Override
        public DeleteLocalImageRequest build() {
            return new DeleteLocalImageRequest(this);
        } 

    } 

}
