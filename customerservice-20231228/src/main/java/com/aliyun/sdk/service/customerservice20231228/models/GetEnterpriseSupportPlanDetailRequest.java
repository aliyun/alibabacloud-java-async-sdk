// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.customerservice20231228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEnterpriseSupportPlanDetailRequest} extends {@link RequestModel}
 *
 * <p>GetEnterpriseSupportPlanDetailRequest</p>
 */
public class GetEnterpriseSupportPlanDetailRequest extends Request {
    @Body
    @NameInMap("freeOrderApplyCodes")
    private java.util.List < String > freeOrderApplyCodes;

    @Body
    @NameInMap("orderIds")
    private java.util.List < Long > orderIds;

    private GetEnterpriseSupportPlanDetailRequest(Builder builder) {
        super(builder);
        this.freeOrderApplyCodes = builder.freeOrderApplyCodes;
        this.orderIds = builder.orderIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEnterpriseSupportPlanDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return freeOrderApplyCodes
     */
    public java.util.List < String > getFreeOrderApplyCodes() {
        return this.freeOrderApplyCodes;
    }

    /**
     * @return orderIds
     */
    public java.util.List < Long > getOrderIds() {
        return this.orderIds;
    }

    public static final class Builder extends Request.Builder<GetEnterpriseSupportPlanDetailRequest, Builder> {
        private java.util.List < String > freeOrderApplyCodes; 
        private java.util.List < Long > orderIds; 

        private Builder() {
            super();
        } 

        private Builder(GetEnterpriseSupportPlanDetailRequest request) {
            super(request);
            this.freeOrderApplyCodes = request.freeOrderApplyCodes;
            this.orderIds = request.orderIds;
        } 

        /**
         * freeOrderApplyCodes.
         */
        public Builder freeOrderApplyCodes(java.util.List < String > freeOrderApplyCodes) {
            this.putBodyParameter("freeOrderApplyCodes", freeOrderApplyCodes);
            this.freeOrderApplyCodes = freeOrderApplyCodes;
            return this;
        }

        /**
         * orderIds.
         */
        public Builder orderIds(java.util.List < Long > orderIds) {
            this.putBodyParameter("orderIds", orderIds);
            this.orderIds = orderIds;
            return this;
        }

        @Override
        public GetEnterpriseSupportPlanDetailRequest build() {
            return new GetEnterpriseSupportPlanDetailRequest(this);
        } 

    } 

}
