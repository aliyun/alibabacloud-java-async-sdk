// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth_intl20220809.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTransactionsListRequest} extends {@link RequestModel}
 *
 * <p>DescribeTransactionsListRequest</p>
 */
public class DescribeTransactionsListRequest extends Request {
    @Query
    @NameInMap("Address")
    private String address;

    @Query
    @NameInMap("Coin")
    private String coin;

    @Query
    @NameInMap("EndTimestamp")
    private Long endTimestamp;

    @Query
    @NameInMap("MerchantBizId")
    private String merchantBizId;

    @Query
    @NameInMap("Page")
    private Long page;

    @Query
    @NameInMap("StartTimestamp")
    private Long startTimestamp;

    @Query
    @NameInMap("Type")
    private String type;

    private DescribeTransactionsListRequest(Builder builder) {
        super(builder);
        this.address = builder.address;
        this.coin = builder.coin;
        this.endTimestamp = builder.endTimestamp;
        this.merchantBizId = builder.merchantBizId;
        this.page = builder.page;
        this.startTimestamp = builder.startTimestamp;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTransactionsListRequest create() {
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
     * @return endTimestamp
     */
    public Long getEndTimestamp() {
        return this.endTimestamp;
    }

    /**
     * @return merchantBizId
     */
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

    /**
     * @return page
     */
    public Long getPage() {
        return this.page;
    }

    /**
     * @return startTimestamp
     */
    public Long getStartTimestamp() {
        return this.startTimestamp;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribeTransactionsListRequest, Builder> {
        private String address; 
        private String coin; 
        private Long endTimestamp; 
        private String merchantBizId; 
        private Long page; 
        private Long startTimestamp; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTransactionsListRequest request) {
            super(request);
            this.address = request.address;
            this.coin = request.coin;
            this.endTimestamp = request.endTimestamp;
            this.merchantBizId = request.merchantBizId;
            this.page = request.page;
            this.startTimestamp = request.startTimestamp;
            this.type = request.type;
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
         * EndTimestamp.
         */
        public Builder endTimestamp(Long endTimestamp) {
            this.putQueryParameter("EndTimestamp", endTimestamp);
            this.endTimestamp = endTimestamp;
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
         * Page.
         */
        public Builder page(Long page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * StartTimestamp.
         */
        public Builder startTimestamp(Long startTimestamp) {
            this.putQueryParameter("StartTimestamp", startTimestamp);
            this.startTimestamp = startTimestamp;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeTransactionsListRequest build() {
            return new DescribeTransactionsListRequest(this);
        } 

    } 

}
