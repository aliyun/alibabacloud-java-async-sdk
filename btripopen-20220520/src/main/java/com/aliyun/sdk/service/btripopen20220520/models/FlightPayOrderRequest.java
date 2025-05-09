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
 * {@link FlightPayOrderRequest} extends {@link RequestModel}
 *
 * <p>FlightPayOrderRequest</p>
 */
public class FlightPayOrderRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("corp_pay_price")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long corpPayPrice;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dis_order_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String disOrderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("extra")
    private java.util.Map<String, String> extra;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("personal_pay_price")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long personalPayPrice;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("total_pay_price")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long totalPayPrice;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private FlightPayOrderRequest(Builder builder) {
        super(builder);
        this.corpPayPrice = builder.corpPayPrice;
        this.disOrderId = builder.disOrderId;
        this.extra = builder.extra;
        this.personalPayPrice = builder.personalPayPrice;
        this.totalPayPrice = builder.totalPayPrice;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FlightPayOrderRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return corpPayPrice
     */
    public Long getCorpPayPrice() {
        return this.corpPayPrice;
    }

    /**
     * @return disOrderId
     */
    public String getDisOrderId() {
        return this.disOrderId;
    }

    /**
     * @return extra
     */
    public java.util.Map<String, String> getExtra() {
        return this.extra;
    }

    /**
     * @return personalPayPrice
     */
    public Long getPersonalPayPrice() {
        return this.personalPayPrice;
    }

    /**
     * @return totalPayPrice
     */
    public Long getTotalPayPrice() {
        return this.totalPayPrice;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<FlightPayOrderRequest, Builder> {
        private Long corpPayPrice; 
        private String disOrderId; 
        private java.util.Map<String, String> extra; 
        private Long personalPayPrice; 
        private Long totalPayPrice; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(FlightPayOrderRequest request) {
            super(request);
            this.corpPayPrice = request.corpPayPrice;
            this.disOrderId = request.disOrderId;
            this.extra = request.extra;
            this.personalPayPrice = request.personalPayPrice;
            this.totalPayPrice = request.totalPayPrice;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder corpPayPrice(Long corpPayPrice) {
            this.putBodyParameter("corp_pay_price", corpPayPrice);
            this.corpPayPrice = corpPayPrice;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dis123</p>
         */
        public Builder disOrderId(String disOrderId) {
            this.putBodyParameter("dis_order_id", disOrderId);
            this.disOrderId = disOrderId;
            return this;
        }

        /**
         * extra.
         */
        public Builder extra(java.util.Map<String, String> extra) {
            String extraShrink = shrink(extra, "extra", "json");
            this.putBodyParameter("extra", extraShrink);
            this.extra = extra;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder personalPayPrice(Long personalPayPrice) {
            this.putBodyParameter("personal_pay_price", personalPayPrice);
            this.personalPayPrice = personalPayPrice;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalPayPrice(Long totalPayPrice) {
            this.putBodyParameter("total_pay_price", totalPayPrice);
            this.totalPayPrice = totalPayPrice;
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
        public FlightPayOrderRequest build() {
            return new FlightPayOrderRequest(this);
        } 

    } 

}
