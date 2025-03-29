// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteImagesFromLibRequest} extends {@link RequestModel}
 *
 * <p>DeleteImagesFromLibRequest</p>
 */
public class DeleteImagesFromLibRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageIds")
    private String imageIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LibId")
    private String libId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DeleteImagesFromLibRequest(Builder builder) {
        super(builder);
        this.imageIds = builder.imageIds;
        this.libId = builder.libId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteImagesFromLibRequest create() {
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
     * @return libId
     */
    public String getLibId() {
        return this.libId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteImagesFromLibRequest, Builder> {
        private String imageIds; 
        private String libId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteImagesFromLibRequest request) {
            super(request);
            this.imageIds = request.imageIds;
            this.libId = request.libId;
            this.regionId = request.regionId;
        } 

        /**
         * ImageIds.
         */
        public Builder imageIds(String imageIds) {
            this.putBodyParameter("ImageIds", imageIds);
            this.imageIds = imageIds;
            return this;
        }

        /**
         * LibId.
         */
        public Builder libId(String libId) {
            this.putBodyParameter("LibId", libId);
            this.libId = libId;
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
        public DeleteImagesFromLibRequest build() {
            return new DeleteImagesFromLibRequest(this);
        } 

    } 

}
