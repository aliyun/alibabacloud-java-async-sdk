// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.acc20240402.models;

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
 * {@link GetImageCacheRequest} extends {@link RequestModel}
 *
 * <p>GetImageCacheRequest</p>
 */
public class GetImageCacheRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageCacheId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageCacheId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private GetImageCacheRequest(Builder builder) {
        super(builder);
        this.imageCacheId = builder.imageCacheId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetImageCacheRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageCacheId
     */
    public String getImageCacheId() {
        return this.imageCacheId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetImageCacheRequest, Builder> {
        private String imageCacheId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetImageCacheRequest request) {
            super(request);
            this.imageCacheId = request.imageCacheId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>imc-bp1dj*****</p>
         */
        public Builder imageCacheId(String imageCacheId) {
            this.putQueryParameter("ImageCacheId", imageCacheId);
            this.imageCacheId = imageCacheId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetImageCacheRequest build() {
            return new GetImageCacheRequest(this);
        } 

    } 

}
