// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FlightModifyCancelV2Request} extends {@link RequestModel}
 *
 * <p>FlightModifyCancelV2Request</p>
 */
public class FlightModifyCancelV2Request extends Request {
    @Body
    @NameInMap("isv_name")
    private String isvName;

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

    private FlightModifyCancelV2Request(Builder builder) {
        super(builder);
        this.isvName = builder.isvName;
        this.orderId = builder.orderId;
        this.outOrderId = builder.outOrderId;
        this.outSubOrderId = builder.outSubOrderId;
        this.subOrderId = builder.subOrderId;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FlightModifyCancelV2Request create() {
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

    public static final class Builder extends Request.Builder<FlightModifyCancelV2Request, Builder> {
        private String isvName; 
        private Long orderId; 
        private String outOrderId; 
        private String outSubOrderId; 
        private Long subOrderId; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(FlightModifyCancelV2Request request) {
            super(request);
            this.isvName = request.isvName;
            this.orderId = request.orderId;
            this.outOrderId = request.outOrderId;
            this.outSubOrderId = request.outSubOrderId;
            this.subOrderId = request.subOrderId;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
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
        public FlightModifyCancelV2Request build() {
            return new FlightModifyCancelV2Request(this);
        } 

    } 

}
