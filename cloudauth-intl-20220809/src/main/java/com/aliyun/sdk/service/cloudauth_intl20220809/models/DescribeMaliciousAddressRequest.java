// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth_intl20220809.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMaliciousAddressRequest} extends {@link RequestModel}
 *
 * <p>DescribeMaliciousAddressRequest</p>
 */
public class DescribeMaliciousAddressRequest extends Request {
    @Query
    @NameInMap("Coin")
    private String coin;

    @Query
    @NameInMap("End")
    private String end;

    @Query
    @NameInMap("MerchantBizId")
    private String merchantBizId;

    @Query
    @NameInMap("Start")
    private String start;

    private DescribeMaliciousAddressRequest(Builder builder) {
        super(builder);
        this.coin = builder.coin;
        this.end = builder.end;
        this.merchantBizId = builder.merchantBizId;
        this.start = builder.start;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMaliciousAddressRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return coin
     */
    public String getCoin() {
        return this.coin;
    }

    /**
     * @return end
     */
    public String getEnd() {
        return this.end;
    }

    /**
     * @return merchantBizId
     */
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

    /**
     * @return start
     */
    public String getStart() {
        return this.start;
    }

    public static final class Builder extends Request.Builder<DescribeMaliciousAddressRequest, Builder> {
        private String coin; 
        private String end; 
        private String merchantBizId; 
        private String start; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMaliciousAddressRequest request) {
            super(request);
            this.coin = request.coin;
            this.end = request.end;
            this.merchantBizId = request.merchantBizId;
            this.start = request.start;
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
         * End.
         */
        public Builder end(String end) {
            this.putQueryParameter("End", end);
            this.end = end;
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

        /**
         * Start.
         */
        public Builder start(String start) {
            this.putQueryParameter("Start", start);
            this.start = start;
            return this;
        }

        @Override
        public DescribeMaliciousAddressRequest build() {
            return new DescribeMaliciousAddressRequest(this);
        } 

    } 

}
