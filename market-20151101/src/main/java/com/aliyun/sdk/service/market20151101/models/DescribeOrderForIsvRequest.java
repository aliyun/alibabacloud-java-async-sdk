// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.market20151101.models;

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
 * {@link DescribeOrderForIsvRequest} extends {@link RequestModel}
 *
 * <p>DescribeOrderForIsvRequest</p>
 */
public class DescribeOrderForIsvRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String orderId;

    private DescribeOrderForIsvRequest(Builder builder) {
        super(builder);
        this.orderId = builder.orderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOrderForIsvRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeOrderForIsvRequest, Builder> {
        private String orderId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeOrderForIsvRequest request) {
            super(request);
            this.orderId = request.orderId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>202*********415</p>
         */
        public Builder orderId(String orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        @Override
        public DescribeOrderForIsvRequest build() {
            return new DescribeOrderForIsvRequest(this);
        } 

    } 

}
