// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

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
 * {@link ListLogisticsOrdersRequest} extends {@link RequestModel}
 *
 * <p>ListLogisticsOrdersRequest</p>
 */
public class ListLogisticsOrdersRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("orderId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String orderId;

    private ListLogisticsOrdersRequest(Builder builder) {
        super(builder);
        this.orderId = builder.orderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLogisticsOrdersRequest create() {
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

    public static final class Builder extends Request.Builder<ListLogisticsOrdersRequest, Builder> {
        private String orderId; 

        private Builder() {
            super();
        } 

        private Builder(ListLogisticsOrdersRequest request) {
            super(request);
            this.orderId = request.orderId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6696070566****8593</p>
         */
        public Builder orderId(String orderId) {
            this.putPathParameter("orderId", orderId);
            this.orderId = orderId;
            return this;
        }

        @Override
        public ListLogisticsOrdersRequest build() {
            return new ListLogisticsOrdersRequest(this);
        } 

    } 

}
