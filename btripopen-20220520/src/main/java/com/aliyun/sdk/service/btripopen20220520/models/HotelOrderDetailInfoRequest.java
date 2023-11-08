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
    @NameInMap("btrip_order_id")
    private String btripOrderId;

    @Query
    @NameInMap("dis_order_id")
    private String disOrderId;

    @Header
    @NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private HotelOrderDetailInfoRequest(Builder builder) {
        super(builder);
        this.btripOrderId = builder.btripOrderId;
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
     * @return btripOrderId
     */
    public String getBtripOrderId() {
        return this.btripOrderId;
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
        private String btripOrderId; 
        private String disOrderId; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(HotelOrderDetailInfoRequest request) {
            super(request);
            this.btripOrderId = request.btripOrderId;
            this.disOrderId = request.disOrderId;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * btrip_order_id.
         */
        public Builder btripOrderId(String btripOrderId) {
            this.putQueryParameter("btrip_order_id", btripOrderId);
            this.btripOrderId = btripOrderId;
            return this;
        }

        /**
         * dis_order_id.
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
