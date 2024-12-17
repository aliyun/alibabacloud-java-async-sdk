// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link HotelOrderChangeDetailRequest} extends {@link RequestModel}
 *
 * <p>HotelOrderChangeDetailRequest</p>
 */
public class HotelOrderChangeDetailRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("btrip_user_id")
    private String btripUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("change_order_id")
    private String changeOrderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dis_order_id")
    private String disOrderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sale_order_id")
    private String saleOrderId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private HotelOrderChangeDetailRequest(Builder builder) {
        super(builder);
        this.btripUserId = builder.btripUserId;
        this.changeOrderId = builder.changeOrderId;
        this.disOrderId = builder.disOrderId;
        this.saleOrderId = builder.saleOrderId;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HotelOrderChangeDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return btripUserId
     */
    public String getBtripUserId() {
        return this.btripUserId;
    }

    /**
     * @return changeOrderId
     */
    public String getChangeOrderId() {
        return this.changeOrderId;
    }

    /**
     * @return disOrderId
     */
    public String getDisOrderId() {
        return this.disOrderId;
    }

    /**
     * @return saleOrderId
     */
    public String getSaleOrderId() {
        return this.saleOrderId;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<HotelOrderChangeDetailRequest, Builder> {
        private String btripUserId; 
        private String changeOrderId; 
        private String disOrderId; 
        private String saleOrderId; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(HotelOrderChangeDetailRequest request) {
            super(request);
            this.btripUserId = request.btripUserId;
            this.changeOrderId = request.changeOrderId;
            this.disOrderId = request.disOrderId;
            this.saleOrderId = request.saleOrderId;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * btrip_user_id.
         */
        public Builder btripUserId(String btripUserId) {
            this.putBodyParameter("btrip_user_id", btripUserId);
            this.btripUserId = btripUserId;
            return this;
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
         * dis_order_id.
         */
        public Builder disOrderId(String disOrderId) {
            this.putBodyParameter("dis_order_id", disOrderId);
            this.disOrderId = disOrderId;
            return this;
        }

        /**
         * sale_order_id.
         */
        public Builder saleOrderId(String saleOrderId) {
            this.putBodyParameter("sale_order_id", saleOrderId);
            this.saleOrderId = saleOrderId;
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
        public HotelOrderChangeDetailRequest build() {
            return new HotelOrderChangeDetailRequest(this);
        } 

    } 

}
