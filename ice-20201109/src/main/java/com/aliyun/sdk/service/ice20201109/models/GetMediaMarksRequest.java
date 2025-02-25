// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link GetMediaMarksRequest} extends {@link RequestModel}
 *
 * <p>GetMediaMarksRequest</p>
 */
public class GetMediaMarksRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaId")
    private String mediaId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaMarkIds")
    private String mediaMarkIds;

    private GetMediaMarksRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.mediaId = builder.mediaId;
        this.mediaMarkIds = builder.mediaMarkIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMediaMarksRequest create() {
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

    public static final class Builder extends Request.Builder<GetMediaMarksRequest, Builder> {
        private String regionId; 
        private String mediaId; 
        private String mediaMarkIds; 

        private Builder() {
            super();
        } 

        private Builder(GetMediaMarksRequest request) {
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
         * <p>The ID of the media asset.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
         */
        public Builder mediaId(String mediaId) {
            this.putQueryParameter("MediaId", mediaId);
            this.mediaId = mediaId;
            return this;
        }

        /**
         * <p>The mark ID. You can specify multiple mark IDs separated with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>mark-f82d<em><strong><strong>4994b0915948ef7e16,mark-3d56d</strong></strong></em>4c8fa9ae2a1f9e5d2d60</p>
         */
        public Builder mediaMarkIds(String mediaMarkIds) {
            this.putQueryParameter("MediaMarkIds", mediaMarkIds);
            this.mediaMarkIds = mediaMarkIds;
            return this;
        }

        @Override
        public GetMediaMarksRequest build() {
            return new GetMediaMarksRequest(this);
        } 

    } 

}
