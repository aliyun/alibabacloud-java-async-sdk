// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth_intl20220809.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWeb3AddressLabelsRequest} extends {@link RequestModel}
 *
 * <p>DescribeWeb3AddressLabelsRequest</p>
 */
public class DescribeWeb3AddressLabelsRequest extends Request {
    @Query
    @NameInMap("Address")
    private String address;

    @Query
    @NameInMap("ChainShortName")
    private String chainShortName;

    @Query
    @NameInMap("MerchantBizId")
    private String merchantBizId;

    private DescribeWeb3AddressLabelsRequest(Builder builder) {
        super(builder);
        this.address = builder.address;
        this.chainShortName = builder.chainShortName;
        this.merchantBizId = builder.merchantBizId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWeb3AddressLabelsRequest create() {
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
     * @return chainShortName
     */
    public String getChainShortName() {
        return this.chainShortName;
    }

    /**
     * @return merchantBizId
     */
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

    public static final class Builder extends Request.Builder<DescribeWeb3AddressLabelsRequest, Builder> {
        private String address; 
        private String chainShortName; 
        private String merchantBizId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeWeb3AddressLabelsRequest request) {
            super(request);
            this.address = request.address;
            this.chainShortName = request.chainShortName;
            this.merchantBizId = request.merchantBizId;
        } 

        /**
         * The address hash.
         */
        public Builder address(String address) {
            this.putQueryParameter("Address", address);
            this.address = address;
            return this;
        }

        /**
         * This is the short name of blockchain。
         * <p>
         * [ ETH, MATIC, BNB ]
         */
        public Builder chainShortName(String chainShortName) {
            this.putQueryParameter("ChainShortName", chainShortName);
            this.chainShortName = chainShortName;
            return this;
        }

        /**
         * A unique business ID for tracing purpose. For example，the sequence ID from the merchant\"s business-related database.
         */
        public Builder merchantBizId(String merchantBizId) {
            this.putQueryParameter("MerchantBizId", merchantBizId);
            this.merchantBizId = merchantBizId;
            return this;
        }

        @Override
        public DescribeWeb3AddressLabelsRequest build() {
            return new DescribeWeb3AddressLabelsRequest(this);
        } 

    } 

}
