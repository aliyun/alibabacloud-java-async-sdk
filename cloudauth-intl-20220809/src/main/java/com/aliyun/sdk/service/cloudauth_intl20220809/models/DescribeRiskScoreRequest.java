// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth_intl20220809.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRiskScoreRequest} extends {@link RequestModel}
 *
 * <p>DescribeRiskScoreRequest</p>
 */
public class DescribeRiskScoreRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Address")
    private String address;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Coin")
    private String coin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MerchantBizId")
    private String merchantBizId;

    private DescribeRiskScoreRequest(Builder builder) {
        super(builder);
        this.address = builder.address;
        this.coin = builder.coin;
        this.merchantBizId = builder.merchantBizId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRiskScoreRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeRiskScoreRequest, Builder> {
        private String address; 
        private String coin; 
        private String merchantBizId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRiskScoreRequest request) {
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
        public DescribeRiskScoreRequest build() {
            return new DescribeRiskScoreRequest(this);
        } 

    } 

}
