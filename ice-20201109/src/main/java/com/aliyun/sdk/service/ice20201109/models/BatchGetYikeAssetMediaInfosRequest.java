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
 * {@link BatchGetYikeAssetMediaInfosRequest} extends {@link RequestModel}
 *
 * <p>BatchGetYikeAssetMediaInfosRequest</p>
 */
public class BatchGetYikeAssetMediaInfosRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaIds")
    private String mediaIds;

    private BatchGetYikeAssetMediaInfosRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.mediaIds = builder.mediaIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchGetYikeAssetMediaInfosRequest create() {
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

    public static final class Builder extends Request.Builder<BatchGetYikeAssetMediaInfosRequest, Builder> {
        private String regionId; 
        private String mediaIds; 

        private Builder() {
            super();
        } 

        private Builder(BatchGetYikeAssetMediaInfosRequest request) {
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
        public BatchGetYikeAssetMediaInfosRequest build() {
            return new BatchGetYikeAssetMediaInfosRequest(this);
        } 

    } 

}
