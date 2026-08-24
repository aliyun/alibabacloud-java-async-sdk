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
 * {@link ListKVCacheStoreAvailableHpnZonesRequest} extends {@link RequestModel}
 *
 * <p>ListKVCacheStoreAvailableHpnZonesRequest</p>
 */
public class ListKVCacheStoreAvailableHpnZonesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KvcsIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> kvcsIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ListKVCacheStoreAvailableHpnZonesRequest(Builder builder) {
        super(builder);
        this.kvcsIds = builder.kvcsIds;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListKVCacheStoreAvailableHpnZonesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return kvcsIds
     */
    public java.util.List<String> getKvcsIds() {
        return this.kvcsIds;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListKVCacheStoreAvailableHpnZonesRequest, Builder> {
        private java.util.List<String> kvcsIds; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListKVCacheStoreAvailableHpnZonesRequest request) {
            super(request);
            this.kvcsIds = request.kvcsIds;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder kvcsIds(java.util.List<String> kvcsIds) {
            this.putQueryParameter("KvcsIds", kvcsIds);
            this.kvcsIds = kvcsIds;
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
        public ListKVCacheStoreAvailableHpnZonesRequest build() {
            return new ListKVCacheStoreAvailableHpnZonesRequest(this);
        } 

    } 

}
