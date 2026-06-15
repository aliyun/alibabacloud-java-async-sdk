// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link StartCacheClusterRequest} extends {@link RequestModel}
 *
 * <p>StartCacheClusterRequest</p>
 */
public class StartCacheClusterRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("cacheClusterId")
    private String cacheClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    private StartCacheClusterRequest(Builder builder) {
        super(builder);
        this.cacheClusterId = builder.cacheClusterId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartCacheClusterRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cacheClusterId
     */
    public String getCacheClusterId() {
        return this.cacheClusterId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<StartCacheClusterRequest, Builder> {
        private String cacheClusterId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(StartCacheClusterRequest request) {
            super(request);
            this.cacheClusterId = request.cacheClusterId;
            this.regionId = request.regionId;
        } 

        /**
         * cacheClusterId.
         */
        public Builder cacheClusterId(String cacheClusterId) {
            this.putPathParameter("cacheClusterId", cacheClusterId);
            this.cacheClusterId = cacheClusterId;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public StartCacheClusterRequest build() {
            return new StartCacheClusterRequest(this);
        } 

    } 

}
