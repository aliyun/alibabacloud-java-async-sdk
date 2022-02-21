// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteImagesRequest} extends {@link RequestModel}
 *
 * <p>DeleteImagesRequest</p>
 */
public class DeleteImagesRequest extends Request {
    @Query
    @NameInMap("ImageId")
    @Validation(required = true)
    private java.util.List < String > imageId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DeleteImagesRequest(Builder builder) {
        super(builder);
        this.imageId = builder.imageId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteImagesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageId
     */
    public java.util.List < String > getImageId() {
        return this.imageId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteImagesRequest, Builder> {
        private java.util.List < String > imageId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteImagesRequest response) {
            super(response);
            this.imageId = response.imageId;
            this.regionId = response.regionId;
        } 

        /**
         * ImageId.
         */
        public Builder imageId(java.util.List < String > imageId) {
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
        public DeleteImagesRequest build() {
            return new DeleteImagesRequest(this);
        } 

    } 

}
