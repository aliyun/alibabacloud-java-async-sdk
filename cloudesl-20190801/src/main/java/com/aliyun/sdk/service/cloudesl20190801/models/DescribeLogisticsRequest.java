// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20190801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLogisticsRequest} extends {@link RequestModel}
 *
 * <p>DescribeLogisticsRequest</p>
 */
public class DescribeLogisticsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrderId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String orderId;

    private DescribeLogisticsRequest(Builder builder) {
        super(builder);
        this.orderId = builder.orderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLogisticsRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeLogisticsRequest, Builder> {
        private String orderId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLogisticsRequest request) {
            super(request);
            this.orderId = request.orderId;
        } 

        /**
         * OrderId.
         */
        public Builder orderId(String orderId) {
            this.putBodyParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        @Override
        public DescribeLogisticsRequest build() {
            return new DescribeLogisticsRequest(this);
        } 

    } 

}
