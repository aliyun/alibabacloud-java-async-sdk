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
         * <p>Load balancer ID. When querying multiple load balancers, separate the IDs with commas. A maximum of 100 load balancer IDs can be passed at once. Load balancer IDs can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2868897.html">ListLoadBalancers</a> interface.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>99874066052****,100892832360****</p>
         */
        public Builder loadBalancerIds(String loadBalancerIds) {
            this.putQueryParameter("LoadBalancerIds", loadBalancerIds);
            this.loadBalancerIds = loadBalancerIds;
            return this;
        }

        /**
         * <p>Source address pool type. Various source address pools are configured under the load balancer, including default pools, fallback pools, and primary region pools. Only the status of origins in the default pool affects the status of the load balancer itself. Passing <code>default_pool</code> means only querying the status of origins in the default source address pool under the load balancer.</p>
         * 
         * <strong>example:</strong>
         * <p>default_pool</p>
         */
        public Builder poolType(String poolType) {
            this.putQueryParameter("PoolType", poolType);
            this.poolType = poolType;
            return this;
        }

        /**
         * <p>Site ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1159101787****</p>
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
