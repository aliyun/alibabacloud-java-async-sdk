// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HotelOrderDetailInfoRequest} extends {@link RequestModel}
 *
 * <p>HotelOrderDetailInfoRequest</p>
 */
public class HotelOrderDetailInfoRequest extends Request {
    @Query
    @NameInMap("dis_order_id")
    @Validation(required = true)
    private String disOrderId;

    @Header
    @NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private HotelOrderDetailInfoRequest(Builder builder) {
        super(builder);
        this.disOrderId = builder.disOrderId;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HotelOrderDetailInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return disOrderId
     */
    public String getDisOrderId() {
        return this.disOrderId;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<HotelOrderDetailInfoRequest, Builder> {
        private String disOrderId; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(HotelOrderDetailInfoRequest request) {
            super(request);
            this.disOrderId = request.disOrderId;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * 分销商订单id
         */
        public Builder disOrderId(String disOrderId) {
            this.putQueryParameter("dis_order_id", disOrderId);
            this.disOrderId = disOrderId;
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
        public HotelOrderDetailInfoRequest build() {
            return new HotelOrderDetailInfoRequest(this);
        } 

    } 

}
