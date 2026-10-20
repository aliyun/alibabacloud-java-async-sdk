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
 * {@link UpdateTieredCacheRequest} extends {@link RequestModel}
 *
 * <p>UpdateTieredCacheRequest</p>
 */
public class UpdateTieredCacheRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CacheArchitectureMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cacheArchitectureMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    private UpdateTieredCacheRequest(Builder builder) {
        super(builder);
        this.cacheArchitectureMode = builder.cacheArchitectureMode;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTieredCacheRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cacheArchitectureMode
     */
    public String getCacheArchitectureMode() {
        return this.cacheArchitectureMode;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    public static final class Builder extends Request.Builder<UpdateTieredCacheRequest, Builder> {
        private String cacheArchitectureMode; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTieredCacheRequest request) {
            super(request);
            this.cacheArchitectureMode = request.cacheArchitectureMode;
            this.siteId = request.siteId;
        } 

        /**
         * <p>The multi-tier cache architecture mode. Valid values:</p>
         * <ul>
         * <li>edge: the edge cache layer</li>
         * <li>edge_smart: the edge cache layer and the intelligent cache layer</li>
         * <li>edge_regional: the edge cache layer and the regional cache layer</li>
         * <li>edge_regional_smart: the edge cache layer, the regional cache layer, and the intelligent cache layer</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>edge_smart</p>
         */
        public Builder cacheArchitectureMode(String cacheArchitectureMode) {
            this.putQueryParameter("CacheArchitectureMode", cacheArchitectureMode);
            this.cacheArchitectureMode = cacheArchitectureMode;
            return this;
        }

        /**
         * <p>The site ID. You can call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to query the site ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890123</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        @Override
        public UpdateTieredCacheRequest build() {
            return new UpdateTieredCacheRequest(this);
        } 

    } 

}
