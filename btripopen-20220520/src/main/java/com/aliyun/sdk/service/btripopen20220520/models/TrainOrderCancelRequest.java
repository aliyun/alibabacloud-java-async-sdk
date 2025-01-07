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
 * {@link TrainOrderCancelRequest} extends {@link RequestModel}
 *
 * <p>TrainOrderCancelRequest</p>
 */
public class TrainOrderCancelRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("change_order_id")
    private String changeOrderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("order_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String orderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("out_change_order_id")
    private String outChangeOrderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("out_order_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outOrderId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private TrainOrderCancelRequest(Builder builder) {
        super(builder);
        this.changeOrderId = builder.changeOrderId;
        this.orderId = builder.orderId;
        this.outChangeOrderId = builder.outChangeOrderId;
        this.outOrderId = builder.outOrderId;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TrainOrderCancelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return changeOrderId
     */
    public String getChangeOrderId() {
        return this.changeOrderId;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return outChangeOrderId
     */
    public String getOutChangeOrderId() {
        return this.outChangeOrderId;
    }

    /**
     * @return outOrderId
     */
    public String getOutOrderId() {
        return this.outOrderId;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<TrainOrderCancelRequest, Builder> {
        private String changeOrderId; 
        private String orderId; 
        private String outChangeOrderId; 
        private String outOrderId; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(TrainOrderCancelRequest request) {
            super(request);
            this.changeOrderId = request.changeOrderId;
            this.orderId = request.orderId;
            this.outChangeOrderId = request.outChangeOrderId;
            this.outOrderId = request.outOrderId;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * change_order_id.
         */
        public Builder changeOrderId(String changeOrderId) {
            this.putBodyParameter("change_order_id", changeOrderId);
            this.changeOrderId = changeOrderId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1002145190081005400</p>
         */
        public Builder orderId(String orderId) {
            this.putBodyParameter("order_id", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * out_change_order_id.
         */
        public Builder outChangeOrderId(String outChangeOrderId) {
            this.putBodyParameter("out_change_order_id", outChangeOrderId);
            this.outChangeOrderId = outChangeOrderId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder outOrderId(String outOrderId) {
            this.putBodyParameter("out_order_id", outOrderId);
            this.outOrderId = outOrderId;
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
        public TrainOrderCancelRequest build() {
            return new TrainOrderCancelRequest(this);
        } 

    } 

}
