// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_cnp20230828.models;

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
 * {@link ListExperimentsRequest} extends {@link RequestModel}
 *
 * <p>ListExperimentsRequest</p>
 */
public class ListExperimentsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private Integer order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlanId")
    private Long planId;

    private ListExperimentsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.order = builder.order;
        this.planId = builder.planId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExperimentsRequest create() {
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
     * @return order
     */
    public Integer getOrder() {
        return this.order;
    }

    /**
     * @return planId
     */
    public Long getPlanId() {
        return this.planId;
    }

    public static final class Builder extends Request.Builder<ListExperimentsRequest, Builder> {
        private String regionId; 
        private Integer order; 
        private Long planId; 

        private Builder() {
            super();
        } 

        private Builder(ListExperimentsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.order = request.order;
            this.planId = request.planId;
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
         * <p>Order</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder order(Integer order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>Plan ID</p>
         * 
         * <strong>example:</strong>
         * <p>189</p>
         */
        public Builder planId(Long planId) {
            this.putQueryParameter("PlanId", planId);
            this.planId = planId;
            return this;
        }

        @Override
        public ListExperimentsRequest build() {
            return new ListExperimentsRequest(this);
        } 

    } 

}
