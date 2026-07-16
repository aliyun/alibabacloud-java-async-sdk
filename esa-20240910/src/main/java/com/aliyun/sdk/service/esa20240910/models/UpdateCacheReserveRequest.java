// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link UpdateCacheReserveRequest} extends {@link RequestModel}
 *
 * <p>UpdateCacheReserveRequest</p>
 */
public class UpdateCacheReserveRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CacheReserveInstanceId")
    private String cacheReserveInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enable")
    private String enable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    private UpdateCacheReserveRequest(Builder builder) {
        super(builder);
        this.cacheReserveInstanceId = builder.cacheReserveInstanceId;
        this.enable = builder.enable;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCacheReserveRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cacheReserveInstanceId
     */
    public String getCacheReserveInstanceId() {
        return this.cacheReserveInstanceId;
    }

    /**
     * @return enable
     */
    public String getEnable() {
        return this.enable;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    public static final class Builder extends Request.Builder<UpdateCacheReserveRequest, Builder> {
        private String cacheReserveInstanceId; 
        private String enable; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCacheReserveRequest request) {
            super(request);
            this.cacheReserveInstanceId = request.cacheReserveInstanceId;
            this.enable = request.enable;
            this.siteId = request.siteId;
        } 

        /**
         * CacheReserveInstanceId.
         */
        public Builder cacheReserveInstanceId(String cacheReserveInstanceId) {
            this.putQueryParameter("CacheReserveInstanceId", cacheReserveInstanceId);
            this.cacheReserveInstanceId = cacheReserveInstanceId;
            return this;
        }

        /**
         * Enable.
         */
        public Builder enable(String enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456****</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        @Override
        public UpdateCacheReserveRequest build() {
            return new UpdateCacheReserveRequest(this);
        } 

    } 

}
