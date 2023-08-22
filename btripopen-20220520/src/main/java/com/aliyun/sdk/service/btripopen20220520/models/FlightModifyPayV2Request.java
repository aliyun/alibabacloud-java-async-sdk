// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FlightModifyPayV2Request} extends {@link RequestModel}
 *
 * <p>FlightModifyPayV2Request</p>
 */
public class FlightModifyPayV2Request extends Request {
    @Body
    @NameInMap("ext_params")
    private java.util.Map < String, ? > extParams;

    @Body
    @NameInMap("isv_name")
    private String isvName;

    @Body
    @NameInMap("modify_pay_amount")
    private Long modifyPayAmount;

    @Body
    @NameInMap("order_id")
    private Long orderId;

    @Body
    @NameInMap("out_order_id")
    private String outOrderId;

    @Body
    @NameInMap("out_sub_order_id")
    private String outSubOrderId;

    @Body
    @NameInMap("sub_order_id")
    private Long subOrderId;

    @Header
    @NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private FlightModifyPayV2Request(Builder builder) {
        super(builder);
        this.extParams = builder.extParams;
        this.isvName = builder.isvName;
        this.modifyPayAmount = builder.modifyPayAmount;
        this.orderId = builder.orderId;
        this.outOrderId = builder.outOrderId;
        this.outSubOrderId = builder.outSubOrderId;
        this.subOrderId = builder.subOrderId;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FlightModifyPayV2Request create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return extParams
     */
    public java.util.Map < String, ? > getExtParams() {
        return this.extParams;
    }

    /**
     * @return isvName
     */
    public String getIsvName() {
        return this.isvName;
    }

    /**
     * @return modifyPayAmount
     */
    public Long getModifyPayAmount() {
        return this.modifyPayAmount;
    }

    /**
     * @return orderId
     */
    public Long getOrderId() {
        return this.orderId;
    }

    /**
     * @return outOrderId
     */
    public String getOutOrderId() {
        return this.outOrderId;
    }

    /**
     * @return outSubOrderId
     */
    public String getOutSubOrderId() {
        return this.outSubOrderId;
    }

    /**
     * @return subOrderId
     */
    public Long getSubOrderId() {
        return this.subOrderId;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<FlightModifyPayV2Request, Builder> {
        private java.util.Map < String, ? > extParams; 
        private String isvName; 
        private Long modifyPayAmount; 
        private Long orderId; 
        private String outOrderId; 
        private String outSubOrderId; 
        private Long subOrderId; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(FlightModifyPayV2Request request) {
            super(request);
            this.extParams = request.extParams;
            this.isvName = request.isvName;
            this.modifyPayAmount = request.modifyPayAmount;
            this.orderId = request.orderId;
            this.outOrderId = request.outOrderId;
            this.outSubOrderId = request.outSubOrderId;
            this.subOrderId = request.subOrderId;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * ext_params.
         */
        public Builder extParams(java.util.Map < String, ? > extParams) {
            String extParamsShrink = shrink(extParams, "ext_params", "json");
            this.putBodyParameter("ext_params", extParamsShrink);
            this.extParams = extParams;
            return this;
        }

        /**
         * isv_name.
         */
        public Builder isvName(String isvName) {
            this.putBodyParameter("isv_name", isvName);
            this.isvName = isvName;
            return this;
        }

        /**
         * modify_pay_amount.
         */
        public Builder modifyPayAmount(Long modifyPayAmount) {
            this.putBodyParameter("modify_pay_amount", modifyPayAmount);
            this.modifyPayAmount = modifyPayAmount;
            return this;
        }

        /**
         * order_id.
         */
        public Builder orderId(Long orderId) {
            this.putBodyParameter("order_id", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * out_order_id.
         */
        public Builder outOrderId(String outOrderId) {
            this.putBodyParameter("out_order_id", outOrderId);
            this.outOrderId = outOrderId;
            return this;
        }

        /**
         * out_sub_order_id.
         */
        public Builder outSubOrderId(String outSubOrderId) {
            this.putBodyParameter("out_sub_order_id", outSubOrderId);
            this.outSubOrderId = outSubOrderId;
            return this;
        }

        /**
         * sub_order_id.
         */
        public Builder subOrderId(Long subOrderId) {
            this.putBodyParameter("sub_order_id", subOrderId);
            this.subOrderId = subOrderId;
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
        public FlightModifyPayV2Request build() {
            return new FlightModifyPayV2Request(this);
        } 

    } 

}
