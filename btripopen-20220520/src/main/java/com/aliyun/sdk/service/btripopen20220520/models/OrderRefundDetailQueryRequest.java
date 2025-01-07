// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link OrderRefundDetailQueryRequest} extends {@link RequestModel}
 *
 * <p>OrderRefundDetailQueryRequest</p>
 */
public class OrderRefundDetailQueryRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cooperator_order_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cooperatorOrderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("order_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String orderId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private OrderRefundDetailQueryRequest(Builder builder) {
        super(builder);
        this.cooperatorOrderId = builder.cooperatorOrderId;
        this.orderId = builder.orderId;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OrderRefundDetailQueryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cooperatorOrderId
     */
    public String getCooperatorOrderId() {
        return this.cooperatorOrderId;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<OrderRefundDetailQueryRequest, Builder> {
        private String cooperatorOrderId; 
        private String orderId; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(OrderRefundDetailQueryRequest request) {
            super(request);
            this.cooperatorOrderId = request.cooperatorOrderId;
            this.orderId = request.orderId;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ZLJD12241231000002</p>
         */
        public Builder cooperatorOrderId(String cooperatorOrderId) {
            this.putBodyParameter("cooperator_order_id", cooperatorOrderId);
            this.cooperatorOrderId = cooperatorOrderId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1012000000000000</p>
         */
        public Builder orderId(String orderId) {
            this.putBodyParameter("order_id", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * x-acs-btrip-corp-token.
         */
        public Builder xAcsBtripCorpToken(String xAcsBtripCorpToken) {
            this.putHeaderParameter("x-acs-btrip-corp-token", xAcsBtripCorpToken);
            this.xAcsBtripCorpToken = xAcsBtripCorpToken;
            return this;
        }

        @Override
        public OrderRefundDetailQueryRequest build() {
            return new OrderRefundDetailQueryRequest(this);
        } 

    } 

}
