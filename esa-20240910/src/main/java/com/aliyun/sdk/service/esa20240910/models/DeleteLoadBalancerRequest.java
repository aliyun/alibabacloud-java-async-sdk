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
 * {@link DeleteLoadBalancerRequest} extends {@link RequestModel}
 *
 * <p>DeleteLoadBalancerRequest</p>
 */
public class DeleteLoadBalancerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    private DeleteLoadBalancerRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLoadBalancerRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteLoadBalancerRequest, Builder> {
        private Long id; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLoadBalancerRequest request) {
            super(request);
            this.id = request.id;
            this.siteId = request.siteId;
        } 

        /**
         * <p>The ID of the load balancer, used to uniquely identify the load balancer to be queried. This ID is returned directly upon creation of the load balancer and can also be obtained through the <a href="~~ListLoadBalancers~~">ListLoadBalancers</a> interface for querying all load balancers under a site.</p>
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
         * <p>The ID of the site, which can be obtained by calling the <a href="~~ListSites~~">ListSites</a> interface.</p>
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
        public DeleteLoadBalancerRequest build() {
            return new DeleteLoadBalancerRequest(this);
        } 

    } 

}
