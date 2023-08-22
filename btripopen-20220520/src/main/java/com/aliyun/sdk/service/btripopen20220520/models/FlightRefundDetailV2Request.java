// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FlightRefundDetailV2Request} extends {@link RequestModel}
 *
 * <p>FlightRefundDetailV2Request</p>
 */
public class FlightRefundDetailV2Request extends Request {
    @Query
    @NameInMap("isv_name")
    private String isvName;

    @Query
    @NameInMap("order_id")
    private String orderId;

    @Query
    @NameInMap("refund_apply_id")
    private String refundApplyId;

    @Header
    @NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private FlightRefundDetailV2Request(Builder builder) {
        super(builder);
        this.isvName = builder.isvName;
        this.orderId = builder.orderId;
        this.refundApplyId = builder.refundApplyId;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FlightRefundDetailV2Request create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isvName
     */
    public String getIsvName() {
        return this.isvName;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return refundApplyId
     */
    public String getRefundApplyId() {
        return this.refundApplyId;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<FlightRefundDetailV2Request, Builder> {
        private String isvName; 
        private String orderId; 
        private String refundApplyId; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(FlightRefundDetailV2Request request) {
            super(request);
            this.isvName = request.isvName;
            this.orderId = request.orderId;
            this.refundApplyId = request.refundApplyId;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * isv_name.
         */
        public Builder isvName(String isvName) {
            this.putQueryParameter("isv_name", isvName);
            this.isvName = isvName;
            return this;
        }

        /**
         * order_id.
         */
        public Builder orderId(String orderId) {
            this.putQueryParameter("order_id", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * refund_apply_id.
         */
        public Builder refundApplyId(String refundApplyId) {
            this.putQueryParameter("refund_apply_id", refundApplyId);
            this.refundApplyId = refundApplyId;
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
        public FlightRefundDetailV2Request build() {
            return new FlightRefundDetailV2Request(this);
        } 

    } 

}
