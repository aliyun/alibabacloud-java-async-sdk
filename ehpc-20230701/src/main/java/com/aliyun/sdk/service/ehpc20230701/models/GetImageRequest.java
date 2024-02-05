// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20230701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetImageRequest} extends {@link RequestModel}
 *
 * <p>GetImageRequest</p>
 */
public class GetImageRequest extends Request {
    @Query
    @NameInMap("ImageId")
    @Validation(required = true)
    private String imageId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private GetImageRequest(Builder builder) {
        super(builder);
        this.imageId = builder.imageId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetImageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<GetImageRequest, Builder> {
        private String imageId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetImageRequest request) {
            super(request);
            this.imageId = request.imageId;
            this.regionId = request.regionId;
        } 

        /**
         * ImageId.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetImageRequest build() {
            return new GetImageRequest(this);
        } 

    } 

}
