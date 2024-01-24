// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imarketing20220704.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryOrderRequest} extends {@link RequestModel}
 *
 * <p>QueryOrderRequest</p>
 */
public class QueryOrderRequest extends Request {
    @Body
    @NameInMap("ChannelId")
    @Validation(required = true)
    private String channelId;

    @Body
    @NameInMap("ChannelTradeId")
    private String channelTradeId;

    @Body
    @NameInMap("TradeId")
    private String tradeId;

    private QueryOrderRequest(Builder builder) {
        super(builder);
        this.channelId = builder.channelId;
        this.channelTradeId = builder.channelTradeId;
        this.tradeId = builder.tradeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryOrderRequest create() {
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
     * @return channelTradeId
     */
    public String getChannelTradeId() {
        return this.channelTradeId;
    }

    /**
     * @return tradeId
     */
    public String getTradeId() {
        return this.tradeId;
    }

    public static final class Builder extends Request.Builder<QueryOrderRequest, Builder> {
        private String channelId; 
        private String channelTradeId; 
        private String tradeId; 

        private Builder() {
            super();
        } 

        private Builder(QueryOrderRequest request) {
            super(request);
            this.channelId = request.channelId;
            this.channelTradeId = request.channelTradeId;
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
         * ChannelTradeId.
         */
        public Builder channelTradeId(String channelTradeId) {
            this.putBodyParameter("ChannelTradeId", channelTradeId);
            this.channelTradeId = channelTradeId;
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
        public QueryOrderRequest build() {
            return new QueryOrderRequest(this);
        } 

    } 

}
