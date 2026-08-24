// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kvcachestore20260617.models;

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
 * {@link DeleteKVCacheStoreRequest} extends {@link RequestModel}
 *
 * <p>DeleteKVCacheStoreRequest</p>
 */
public class DeleteKVCacheStoreRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KvcsId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String kvcsId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DeleteKVCacheStoreRequest(Builder builder) {
        super(builder);
        this.kvcsId = builder.kvcsId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteKVCacheStoreRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return kvcsId
     */
    public String getKvcsId() {
        return this.kvcsId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteKVCacheStoreRequest, Builder> {
        private String kvcsId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteKVCacheStoreRequest request) {
            super(request);
            this.kvcsId = request.kvcsId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>kvcs-your-id</p>
         */
        public Builder kvcsId(String kvcsId) {
            this.putQueryParameter("KvcsId", kvcsId);
            this.kvcsId = kvcsId;
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
        public DeleteKVCacheStoreRequest build() {
            return new DeleteKVCacheStoreRequest(this);
        } 

    } 

}
