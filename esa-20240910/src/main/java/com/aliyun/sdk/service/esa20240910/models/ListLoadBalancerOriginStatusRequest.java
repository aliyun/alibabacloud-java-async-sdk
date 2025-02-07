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
 * {@link ListLoadBalancerOriginStatusRequest} extends {@link RequestModel}
 *
 * <p>ListLoadBalancerOriginStatusRequest</p>
 */
public class ListLoadBalancerOriginStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalancerIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String loadBalancerIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PoolType")
    private String poolType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    private ListLoadBalancerOriginStatusRequest(Builder builder) {
        super(builder);
        this.loadBalancerIds = builder.loadBalancerIds;
        this.poolType = builder.poolType;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLoadBalancerOriginStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return loadBalancerIds
     */
    public String getLoadBalancerIds() {
        return this.loadBalancerIds;
    }

    /**
     * @return poolType
     */
    public String getPoolType() {
        return this.poolType;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    public static final class Builder extends Request.Builder<ListLoadBalancerOriginStatusRequest, Builder> {
        private String loadBalancerIds; 
        private String poolType; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(ListLoadBalancerOriginStatusRequest request) {
            super(request);
            this.loadBalancerIds = request.loadBalancerIds;
            this.poolType = request.poolType;
            this.siteId = request.siteId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder loadBalancerIds(String loadBalancerIds) {
            this.putQueryParameter("LoadBalancerIds", loadBalancerIds);
            this.loadBalancerIds = loadBalancerIds;
            return this;
        }

        /**
         * PoolType.
         */
        public Builder poolType(String poolType) {
            this.putQueryParameter("PoolType", poolType);
            this.poolType = poolType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ListLoadBalancerOriginStatus</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        @Override
        public ListLoadBalancerOriginStatusRequest build() {
            return new ListLoadBalancerOriginStatusRequest(this);
        } 

    } 

}
