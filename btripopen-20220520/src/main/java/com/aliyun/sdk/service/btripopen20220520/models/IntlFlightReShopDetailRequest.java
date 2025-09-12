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
 * {@link IntlFlightReShopDetailRequest} extends {@link RequestModel}
 *
 * <p>IntlFlightReShopDetailRequest</p>
 */
public class IntlFlightReShopDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("order_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String orderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("out_order_id")
    private String outOrderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("out_re_shop_apply_id")
    private String outReShopApplyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("re_shop_apply_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String reShopApplyId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private IntlFlightReShopDetailRequest(Builder builder) {
        super(builder);
        this.orderId = builder.orderId;
        this.outOrderId = builder.outOrderId;
        this.outReShopApplyId = builder.outReShopApplyId;
        this.reShopApplyId = builder.reShopApplyId;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IntlFlightReShopDetailRequest create() {
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

    /**
     * @return outOrderId
     */
    public String getOutOrderId() {
        return this.outOrderId;
    }

    /**
     * @return outReShopApplyId
     */
    public String getOutReShopApplyId() {
        return this.outReShopApplyId;
    }

    /**
     * @return reShopApplyId
     */
    public String getReShopApplyId() {
        return this.reShopApplyId;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<IntlFlightReShopDetailRequest, Builder> {
        private String orderId; 
        private String outOrderId; 
        private String outReShopApplyId; 
        private String reShopApplyId; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(IntlFlightReShopDetailRequest request) {
            super(request);
            this.orderId = request.orderId;
            this.outOrderId = request.outOrderId;
            this.outReShopApplyId = request.outReShopApplyId;
            this.reShopApplyId = request.reShopApplyId;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1017035200254689390</p>
         */
        public Builder orderId(String orderId) {
            this.putQueryParameter("order_id", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * out_order_id.
         */
        public Builder outOrderId(String outOrderId) {
            this.putQueryParameter("out_order_id", outOrderId);
            this.outOrderId = outOrderId;
            return this;
        }

        /**
         * out_re_shop_apply_id.
         */
        public Builder outReShopApplyId(String outReShopApplyId) {
            this.putQueryParameter("out_re_shop_apply_id", outReShopApplyId);
            this.outReShopApplyId = outReShopApplyId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10002612002</p>
         */
        public Builder reShopApplyId(String reShopApplyId) {
            this.putQueryParameter("re_shop_apply_id", reShopApplyId);
            this.reShopApplyId = reShopApplyId;
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
        public IntlFlightReShopDetailRequest build() {
            return new IntlFlightReShopDetailRequest(this);
        } 

    } 

}
