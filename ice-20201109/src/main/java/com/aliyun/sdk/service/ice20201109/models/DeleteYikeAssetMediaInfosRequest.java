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
 * {@link DeleteYikeAssetMediaInfosRequest} extends {@link RequestModel}
 *
 * <p>DeleteYikeAssetMediaInfosRequest</p>
 */
public class DeleteYikeAssetMediaInfosRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogicDelete")
    private Boolean logicDelete;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaIds")
    private String mediaIds;

    private DeleteYikeAssetMediaInfosRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.logicDelete = builder.logicDelete;
        this.mediaIds = builder.mediaIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteYikeAssetMediaInfosRequest create() {
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
     * @return logicDelete
     */
    public Boolean getLogicDelete() {
        return this.logicDelete;
    }

    /**
     * @return mediaIds
     */
    public String getMediaIds() {
        return this.mediaIds;
    }

    public static final class Builder extends Request.Builder<DeleteYikeAssetMediaInfosRequest, Builder> {
        private String regionId; 
        private Boolean logicDelete; 
        private String mediaIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteYikeAssetMediaInfosRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.logicDelete = request.logicDelete;
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
         * LogicDelete.
         */
        public Builder logicDelete(Boolean logicDelete) {
            this.putQueryParameter("LogicDelete", logicDelete);
            this.logicDelete = logicDelete;
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
        public DeleteYikeAssetMediaInfosRequest build() {
            return new DeleteYikeAssetMediaInfosRequest(this);
        } 

    } 

}
