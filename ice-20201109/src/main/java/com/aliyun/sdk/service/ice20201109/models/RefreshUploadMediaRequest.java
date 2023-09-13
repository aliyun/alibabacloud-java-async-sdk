// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefreshUploadMediaRequest} extends {@link RequestModel}
 *
 * <p>RefreshUploadMediaRequest</p>
 */
public class RefreshUploadMediaRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("MediaId")
    private String mediaId;

    private RefreshUploadMediaRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.mediaId = builder.mediaId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshUploadMediaRequest create() {
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
     * @return mediaId
     */
    public String getMediaId() {
        return this.mediaId;
    }

    public static final class Builder extends Request.Builder<RefreshUploadMediaRequest, Builder> {
        private String regionId; 
        private String mediaId; 

        private Builder() {
            super();
        } 

        private Builder(RefreshUploadMediaRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.mediaId = request.mediaId;
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
         * MediaId.
         */
        public Builder mediaId(String mediaId) {
            this.putQueryParameter("MediaId", mediaId);
            this.mediaId = mediaId;
            return this;
        }

        @Override
        public RefreshUploadMediaRequest build() {
            return new RefreshUploadMediaRequest(this);
        } 

    } 

}
