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
 * {@link GetLoadBalancerRequest} extends {@link RequestModel}
 *
 * <p>GetLoadBalancerRequest</p>
 */
public class GetLoadBalancerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    private GetLoadBalancerRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLoadBalancerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    public static final class Builder extends Request.Builder<GetLoadBalancerRequest, Builder> {
        private Long id; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(GetLoadBalancerRequest request) {
            super(request);
            this.id = request.id;
            this.siteId = request.siteId;
        } 

        /**
         * <p>The ID of the load balancer, used to uniquely identify the load balancer to be queried. This ID is returned directly when the load balancer is created, or it can be obtained through the <a href="https://help.aliyun.com/document_detail/2868897.html">ListLoadBalancers</a> interface for querying all load balancers under a site.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>99867648760****</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The site ID, which can be obtained by calling the <a href="~~ListSites~~">ListSites</a> interface.</p>
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
        public GetLoadBalancerRequest build() {
            return new GetLoadBalancerRequest(this);
        } 

    } 

}
