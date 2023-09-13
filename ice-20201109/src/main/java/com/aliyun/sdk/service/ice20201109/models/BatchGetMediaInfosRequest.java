// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchGetMediaInfosRequest} extends {@link RequestModel}
 *
 * <p>BatchGetMediaInfosRequest</p>
 */
public class BatchGetMediaInfosRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("AdditionType")
    private String additionType;

    @Query
    @NameInMap("MediaIds")
    private String mediaIds;

    private BatchGetMediaInfosRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.additionType = builder.additionType;
        this.mediaIds = builder.mediaIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchGetMediaInfosRequest create() {
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
     * @return additionType
     */
    public String getAdditionType() {
        return this.additionType;
    }

    /**
     * @return mediaIds
     */
    public String getMediaIds() {
        return this.mediaIds;
    }

    public static final class Builder extends Request.Builder<BatchGetMediaInfosRequest, Builder> {
        private String regionId; 
        private String additionType; 
        private String mediaIds; 

        private Builder() {
            super();
        } 

        private Builder(BatchGetMediaInfosRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.additionType = request.additionType;
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
         * AdditionType.
         */
        public Builder additionType(String additionType) {
            this.putQueryParameter("AdditionType", additionType);
            this.additionType = additionType;
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
        public BatchGetMediaInfosRequest build() {
            return new BatchGetMediaInfosRequest(this);
        } 

    } 

}
