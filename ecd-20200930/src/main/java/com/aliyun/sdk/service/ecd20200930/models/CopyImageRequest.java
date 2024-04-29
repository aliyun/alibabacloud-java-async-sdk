// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CopyImageRequest} extends {@link RequestModel}
 *
 * <p>CopyImageRequest</p>
 */
public class CopyImageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationDescription")
    private String destinationDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationImageName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String destinationImageName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String destinationRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private CopyImageRequest(Builder builder) {
        super(builder);
        this.destinationDescription = builder.destinationDescription;
        this.destinationImageName = builder.destinationImageName;
        this.destinationRegionId = builder.destinationRegionId;
        this.imageId = builder.imageId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CopyImageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return destinationDescription
     */
    public String getDestinationDescription() {
        return this.destinationDescription;
    }

    /**
     * @return destinationImageName
     */
    public String getDestinationImageName() {
        return this.destinationImageName;
    }

    /**
     * @return destinationRegionId
     */
    public String getDestinationRegionId() {
        return this.destinationRegionId;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CopyImageRequest, Builder> {
        private String destinationDescription; 
        private String destinationImageName; 
        private String destinationRegionId; 
        private String imageId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CopyImageRequest request) {
            super(request);
            this.destinationDescription = request.destinationDescription;
            this.destinationImageName = request.destinationImageName;
            this.destinationRegionId = request.destinationRegionId;
            this.imageId = request.imageId;
            this.regionId = request.regionId;
        } 

        /**
         * The description of the new image in the destination region. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
         */
        public Builder destinationDescription(String destinationDescription) {
            this.putQueryParameter("DestinationDescription", destinationDescription);
            this.destinationDescription = destinationDescription;
            return this;
        }

        /**
         * The name of the new image. The name must be 2 to 128 characters in length. The name must start with a letter but cannot start with `http://` or `https://`. The name can contain letters, digits, colons (:), underscores (\_), and hyphens (-).
         */
        public Builder destinationImageName(String destinationImageName) {
            this.putQueryParameter("DestinationImageName", destinationImageName);
            this.destinationImageName = destinationImageName;
            return this;
        }

        /**
         * The ID of the destination region. The ID must be different from the current region ID of the image. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.
         */
        public Builder destinationRegionId(String destinationRegionId) {
            this.putQueryParameter("DestinationRegionId", destinationRegionId);
            this.destinationRegionId = destinationRegionId;
            return this;
        }

        /**
         * The ID of the image that is copied to the destination region.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CopyImageRequest build() {
            return new CopyImageRequest(this);
        } 

    } 

}
