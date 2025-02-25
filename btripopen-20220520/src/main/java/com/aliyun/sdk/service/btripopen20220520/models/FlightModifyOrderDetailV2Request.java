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
 * {@link FlightModifyOrderDetailV2Request} extends {@link RequestModel}
 *
 * <p>FlightModifyOrderDetailV2Request</p>
 */
public class FlightModifyOrderDetailV2Request extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("isv_name")
    private String isvName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("modify_apply_id")
    private String modifyApplyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("need_query_service_fee")
    private Boolean needQueryServiceFee;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("order_id")
    private String orderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("out_modify_apply_id")
    private String outModifyApplyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("out_order_id")
    private String outOrderId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private FlightModifyOrderDetailV2Request(Builder builder) {
        super(builder);
        this.isvName = builder.isvName;
        this.modifyApplyId = builder.modifyApplyId;
        this.needQueryServiceFee = builder.needQueryServiceFee;
        this.orderId = builder.orderId;
        this.outModifyApplyId = builder.outModifyApplyId;
        this.outOrderId = builder.outOrderId;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FlightModifyOrderDetailV2Request create() {
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
     * @return modifyApplyId
     */
    public String getModifyApplyId() {
        return this.modifyApplyId;
    }

    /**
     * @return needQueryServiceFee
     */
    public Boolean getNeedQueryServiceFee() {
        return this.needQueryServiceFee;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return outModifyApplyId
     */
    public String getOutModifyApplyId() {
        return this.outModifyApplyId;
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

    public static final class Builder extends Request.Builder<FlightModifyOrderDetailV2Request, Builder> {
        private String isvName; 
        private String modifyApplyId; 
        private Boolean needQueryServiceFee; 
        private String orderId; 
        private String outModifyApplyId; 
        private String outOrderId; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(FlightModifyOrderDetailV2Request request) {
            super(request);
            this.isvName = request.isvName;
            this.modifyApplyId = request.modifyApplyId;
            this.needQueryServiceFee = request.needQueryServiceFee;
            this.orderId = request.orderId;
            this.outModifyApplyId = request.outModifyApplyId;
            this.outOrderId = request.outOrderId;
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
         * modify_apply_id.
         */
        public Builder modifyApplyId(String modifyApplyId) {
            this.putQueryParameter("modify_apply_id", modifyApplyId);
            this.modifyApplyId = modifyApplyId;
            return this;
        }

        /**
         * need_query_service_fee.
         */
        public Builder needQueryServiceFee(Boolean needQueryServiceFee) {
            this.putQueryParameter("need_query_service_fee", needQueryServiceFee);
            this.needQueryServiceFee = needQueryServiceFee;
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
         * out_modify_apply_id.
         */
        public Builder outModifyApplyId(String outModifyApplyId) {
            this.putQueryParameter("out_modify_apply_id", outModifyApplyId);
            this.outModifyApplyId = outModifyApplyId;
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
         * x-acs-btrip-corp-token.
         */
        public Builder xAcsBtripCorpToken(String xAcsBtripCorpToken) {
            this.putHeaderParameter("x-acs-btrip-corp-token", xAcsBtripCorpToken);
            this.xAcsBtripCorpToken = xAcsBtripCorpToken;
            return this;
        }

        @Override
        public FlightModifyOrderDetailV2Request build() {
            return new FlightModifyOrderDetailV2Request(this);
        } 

    } 

}
