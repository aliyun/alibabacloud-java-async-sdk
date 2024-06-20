// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth_intl20220809.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWeb3TransactionLabelsRequest} extends {@link RequestModel}
 *
 * <p>DescribeWeb3TransactionLabelsRequest</p>
 */
public class DescribeWeb3TransactionLabelsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChainShortName")
    private String chainShortName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MerchantBizId")
    private String merchantBizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Transaction")
    private String transaction;

    private DescribeWeb3TransactionLabelsRequest(Builder builder) {
        super(builder);
        this.chainShortName = builder.chainShortName;
        this.merchantBizId = builder.merchantBizId;
        this.transaction = builder.transaction;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWeb3TransactionLabelsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return transaction
     */
    public String getTransaction() {
        return this.transaction;
    }

    public static final class Builder extends Request.Builder<DescribeWeb3TransactionLabelsRequest, Builder> {
        private String chainShortName; 
        private String merchantBizId; 
        private String transaction; 

        private Builder() {
            super();
        } 

        private Builder(DescribeWeb3TransactionLabelsRequest request) {
            super(request);
            this.chainShortName = request.chainShortName;
            this.merchantBizId = request.merchantBizId;
            this.transaction = request.transaction;
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

        /**
         * The Transaction hash.
         */
        public Builder transaction(String transaction) {
            this.putQueryParameter("Transaction", transaction);
            this.transaction = transaction;
            return this;
        }

        @Override
        public DescribeWeb3TransactionLabelsRequest build() {
            return new DescribeWeb3TransactionLabelsRequest(this);
        } 

    } 

}
