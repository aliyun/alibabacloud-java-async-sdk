// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mseap20210118.models;

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
 * {@link GetOrderSummaryForPartnerRequest} extends {@link RequestModel}
 *
 * <p>GetOrderSummaryForPartnerRequest</p>
 */
public class GetOrderSummaryForPartnerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    private GetOrderSummaryForPartnerRequest(Builder builder) {
        super(builder);
        this.orderId = builder.orderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOrderSummaryForPartnerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    public static final class Builder extends Request.Builder<GetOrderSummaryForPartnerRequest, Builder> {
        private String orderId; 

        private Builder() {
            super();
        } 

        private Builder(GetOrderSummaryForPartnerRequest request) {
            super(request);
            this.orderId = request.orderId;
        } 

        /**
         * OrderId.
         */
        public Builder orderId(String orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        @Override
        public GetOrderSummaryForPartnerRequest build() {
            return new GetOrderSummaryForPartnerRequest(this);
        } 

    } 

}
