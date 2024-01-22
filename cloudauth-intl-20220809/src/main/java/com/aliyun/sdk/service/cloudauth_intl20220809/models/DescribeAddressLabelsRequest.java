// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth_intl20220809.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAddressLabelsRequest} extends {@link RequestModel}
 *
 * <p>DescribeAddressLabelsRequest</p>
 */
public class DescribeAddressLabelsRequest extends Request {
    @Query
    @NameInMap("Address")
    private String address;

    @Query
    @NameInMap("Coin")
    private String coin;

    @Query
    @NameInMap("MerchantBizId")
    private String merchantBizId;

    private DescribeAddressLabelsRequest(Builder builder) {
        super(builder);
        this.address = builder.address;
        this.coin = builder.coin;
        this.merchantBizId = builder.merchantBizId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAddressLabelsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * @return coin
     */
    public String getCoin() {
        return this.coin;
    }

    /**
     * @return merchantBizId
     */
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

    public static final class Builder extends Request.Builder<DescribeAddressLabelsRequest, Builder> {
        private String address; 
        private String coin; 
        private String merchantBizId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAddressLabelsRequest request) {
            super(request);
            this.address = request.address;
            this.coin = request.coin;
            this.merchantBizId = request.merchantBizId;
        } 

        /**
         * Address.
         */
        public Builder address(String address) {
            this.putQueryParameter("Address", address);
            this.address = address;
            return this;
        }

        /**
         * Coin.
         */
        public Builder coin(String coin) {
            this.putQueryParameter("Coin", coin);
            this.coin = coin;
            return this;
        }

        /**
         * MerchantBizId.
         */
        public Builder merchantBizId(String merchantBizId) {
            this.putQueryParameter("MerchantBizId", merchantBizId);
            this.merchantBizId = merchantBizId;
            return this;
        }

        @Override
        public DescribeAddressLabelsRequest build() {
            return new DescribeAddressLabelsRequest(this);
        } 

    } 

}
