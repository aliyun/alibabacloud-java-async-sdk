// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imarketing20220704.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfirmSampleShippedRequest} extends {@link RequestModel}
 *
 * <p>ConfirmSampleShippedRequest</p>
 */
public class ConfirmSampleShippedRequest extends Request {
    @Body
    @NameInMap("BuyerAddress")
    @Validation(required = true)
    private String buyerAddress;

    @Body
    @NameInMap("BuyerName")
    @Validation(required = true)
    private String buyerName;

    @Body
    @NameInMap("BuyerPhoneNumber")
    @Validation(required = true)
    private String buyerPhoneNumber;

    @Body
    @NameInMap("ChannelId")
    @Validation(required = true)
    private String channelId;

    @Body
    @NameInMap("TradeId")
    @Validation(required = true)
    private String tradeId;

    private ConfirmSampleShippedRequest(Builder builder) {
        super(builder);
        this.buyerAddress = builder.buyerAddress;
        this.buyerName = builder.buyerName;
        this.buyerPhoneNumber = builder.buyerPhoneNumber;
        this.channelId = builder.channelId;
        this.tradeId = builder.tradeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfirmSampleShippedRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return buyerAddress
     */
    public String getBuyerAddress() {
        return this.buyerAddress;
    }

    /**
     * @return buyerName
     */
    public String getBuyerName() {
        return this.buyerName;
    }

    /**
     * @return buyerPhoneNumber
     */
    public String getBuyerPhoneNumber() {
        return this.buyerPhoneNumber;
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

    public static final class Builder extends Request.Builder<ConfirmSampleShippedRequest, Builder> {
        private String buyerAddress; 
        private String buyerName; 
        private String buyerPhoneNumber; 
        private String channelId; 
        private String tradeId; 

        private Builder() {
            super();
        } 

        private Builder(ConfirmSampleShippedRequest request) {
            super(request);
            this.buyerAddress = request.buyerAddress;
            this.buyerName = request.buyerName;
            this.buyerPhoneNumber = request.buyerPhoneNumber;
            this.channelId = request.channelId;
            this.tradeId = request.tradeId;
        } 

        /**
         * BuyerAddress.
         */
        public Builder buyerAddress(String buyerAddress) {
            this.putBodyParameter("BuyerAddress", buyerAddress);
            this.buyerAddress = buyerAddress;
            return this;
        }

        /**
         * BuyerName.
         */
        public Builder buyerName(String buyerName) {
            this.putBodyParameter("BuyerName", buyerName);
            this.buyerName = buyerName;
            return this;
        }

        /**
         * BuyerPhoneNumber.
         */
        public Builder buyerPhoneNumber(String buyerPhoneNumber) {
            this.putBodyParameter("BuyerPhoneNumber", buyerPhoneNumber);
            this.buyerPhoneNumber = buyerPhoneNumber;
            return this;
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
        public ConfirmSampleShippedRequest build() {
            return new ConfirmSampleShippedRequest(this);
        } 

    } 

}
