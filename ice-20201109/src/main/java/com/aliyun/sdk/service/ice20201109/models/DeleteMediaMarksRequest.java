// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMediaMarksRequest} extends {@link RequestModel}
 *
 * <p>DeleteMediaMarksRequest</p>
 */
public class DeleteMediaMarksRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("MediaId")
    private String mediaId;

    @Query
    @NameInMap("MediaMarkIds")
    private String mediaMarkIds;

    private DeleteMediaMarksRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.mediaId = builder.mediaId;
        this.mediaMarkIds = builder.mediaMarkIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMediaMarksRequest create() {
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

    /**
     * @return mediaMarkIds
     */
    public String getMediaMarkIds() {
        return this.mediaMarkIds;
    }

    public static final class Builder extends Request.Builder<DeleteMediaMarksRequest, Builder> {
        private String regionId; 
        private String mediaId; 
        private String mediaMarkIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMediaMarksRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.mediaId = request.mediaId;
            this.mediaMarkIds = request.mediaMarkIds;
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

        /**
         * MediaMarkIds.
         */
        public Builder mediaMarkIds(String mediaMarkIds) {
            this.putQueryParameter("MediaMarkIds", mediaMarkIds);
            this.mediaMarkIds = mediaMarkIds;
            return this;
        }

        @Override
        public DeleteMediaMarksRequest build() {
            return new DeleteMediaMarksRequest(this);
        } 

    } 

}
