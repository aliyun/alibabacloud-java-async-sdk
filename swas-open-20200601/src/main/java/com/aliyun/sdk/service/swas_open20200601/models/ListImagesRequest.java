// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListImagesRequest} extends {@link RequestModel}
 *
 * <p>ListImagesRequest</p>
 */
public class ListImagesRequest extends Request {
    @Query
    @NameInMap("ImageIds")
    private String imageIds;

    @Query
    @NameInMap("ImageType")
    private String imageType;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ListImagesRequest(Builder builder) {
        super(builder);
        this.imageIds = builder.imageIds;
        this.imageType = builder.imageType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListImagesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageIds
     */
    public String getImageIds() {
        return this.imageIds;
    }

    /**
     * @return imageType
     */
    public String getImageType() {
        return this.imageType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListImagesRequest, Builder> {
        private String imageIds; 
        private String imageType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListImagesRequest request) {
            super(request);
            this.imageIds = request.imageIds;
            this.imageType = request.imageType;
            this.regionId = request.regionId;
        } 

        /**
         * The IDs of the images. The value can be a JSON array that consists of up to 50 image IDs, in the format of `["xxx", "yyy", … "zzz"]`. Separate the image IDs with commas (,).
         */
        public Builder imageIds(String imageIds) {
            this.putQueryParameter("ImageIds", imageIds);
            this.imageIds = imageIds;
            return this;
        }

        /**
         * The type of the image. Valid values:
         * <p>
         * 
         * *   system
         * *   app
         * *   custom
         */
        public Builder imageType(String imageType) {
            this.putQueryParameter("ImageType", imageType);
            this.imageType = imageType;
            return this;
        }

        /**
         * The region ID of the images. You can call the [ListRegions](~~189315~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListImagesRequest build() {
            return new ListImagesRequest(this);
        } 

    } 

}
