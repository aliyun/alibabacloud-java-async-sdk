// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20180418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImagesRequest} extends {@link RequestModel}
 *
 * <p>DescribeImagesRequest</p>
 */
public class DescribeImagesRequest extends Request {
    @Query
    @NameInMap("DockerVersion")
    private String dockerVersion;

    @Query
    @NameInMap("ImageName")
    private String imageName;

    @Query
    @NameInMap("RegionID")
    private String regionID;

    private DescribeImagesRequest(Builder builder) {
        super(builder);
        this.dockerVersion = builder.dockerVersion;
        this.imageName = builder.imageName;
        this.regionID = builder.regionID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImagesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dockerVersion
     */
    public String getDockerVersion() {
        return this.dockerVersion;
    }

    /**
     * @return imageName
     */
    public String getImageName() {
        return this.imageName;
    }

    /**
     * @return regionID
     */
    public String getRegionID() {
        return this.regionID;
    }

    public static final class Builder extends Request.Builder<DescribeImagesRequest, Builder> {
        private String dockerVersion; 
        private String imageName; 
        private String regionID; 

        private Builder() {
            super();
        } 

        private Builder(DescribeImagesRequest response) {
            super(response);
            this.dockerVersion = response.dockerVersion;
            this.imageName = response.imageName;
            this.regionID = response.regionID;
        } 

        /**
         * DockerVersion.
         */
        public Builder dockerVersion(String dockerVersion) {
            this.putQueryParameter("DockerVersion", dockerVersion);
            this.dockerVersion = dockerVersion;
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

        /**
         * RegionID.
         */
        public Builder regionID(String regionID) {
            this.putQueryParameter("RegionID", regionID);
            this.regionID = regionID;
            return this;
        }

        @Override
        public DescribeImagesRequest build() {
            return new DescribeImagesRequest(this);
        } 

    } 

}
