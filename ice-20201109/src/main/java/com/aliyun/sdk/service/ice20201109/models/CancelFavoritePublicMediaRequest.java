// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CancelFavoritePublicMediaRequest} extends {@link RequestModel}
 *
 * <p>CancelFavoritePublicMediaRequest</p>
 */
public class CancelFavoritePublicMediaRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaIds")
    private String mediaIds;

    private CancelFavoritePublicMediaRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.mediaIds = builder.mediaIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelFavoritePublicMediaRequest create() {
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
     * @return mediaIds
     */
    public String getMediaIds() {
        return this.mediaIds;
    }

    public static final class Builder extends Request.Builder<CancelFavoritePublicMediaRequest, Builder> {
        private String regionId; 
        private String mediaIds; 

        private Builder() {
            super();
        } 

        private Builder(CancelFavoritePublicMediaRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.mediaIds = request.mediaIds;
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
         * MediaIds.
         */
        public Builder mediaIds(String mediaIds) {
            this.putQueryParameter("MediaIds", mediaIds);
            this.mediaIds = mediaIds;
            return this;
        }

        @Override
        public CancelFavoritePublicMediaRequest build() {
            return new CancelFavoritePublicMediaRequest(this);
        } 

    } 

}
