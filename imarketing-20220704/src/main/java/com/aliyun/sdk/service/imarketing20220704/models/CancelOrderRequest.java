// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imarketing20220704.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelOrderRequest} extends {@link RequestModel}
 *
 * <p>CancelOrderRequest</p>
 */
public class CancelOrderRequest extends Request {
    @Body
    @NameInMap("ChannelId")
    @Validation(required = true)
    private String channelId;

    @Body
    @NameInMap("TradeId")
    @Validation(required = true)
    private String tradeId;

    private CancelOrderRequest(Builder builder) {
        super(builder);
        this.channelId = builder.channelId;
        this.tradeId = builder.tradeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelOrderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return tradeId
     */
    public String getTradeId() {
        return this.tradeId;
    }

    public static final class Builder extends Request.Builder<CancelOrderRequest, Builder> {
        private String channelId; 
        private String tradeId; 

        private Builder() {
            super();
        } 

        private Builder(CancelOrderRequest request) {
            super(request);
            this.channelId = request.channelId;
            this.tradeId = request.tradeId;
        } 

        /**
         * ChannelId.
         */
        public Builder channelId(String channelId) {
            this.putBodyParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * TradeId.
         */
        public Builder tradeId(String tradeId) {
            this.putBodyParameter("TradeId", tradeId);
            this.tradeId = tradeId;
            return this;
        }

        @Override
        public CancelOrderRequest build() {
            return new CancelOrderRequest(this);
        } 

    } 

}
