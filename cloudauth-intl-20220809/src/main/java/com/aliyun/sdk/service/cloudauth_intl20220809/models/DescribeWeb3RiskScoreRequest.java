// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth_intl20220809.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWeb3RiskScoreRequest} extends {@link RequestModel}
 *
 * <p>DescribeWeb3RiskScoreRequest</p>
 */
public class DescribeWeb3RiskScoreRequest extends Request {
    @Query
    @NameInMap("ChainShortName")
    private String chainShortName;

    @Query
    @NameInMap("Depth")
    private Integer depth;

    @Query
    @NameInMap("MerchantBizId")
    private String merchantBizId;

    @Query
    @NameInMap("ObjectId")
    private String objectId;

    @Query
    @NameInMap("ObjectType")
    private String objectType;

    private DescribeWeb3RiskScoreRequest(Builder builder) {
        super(builder);
        this.chainShortName = builder.chainShortName;
        this.depth = builder.depth;
        this.merchantBizId = builder.merchantBizId;
        this.objectId = builder.objectId;
        this.objectType = builder.objectType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWeb3RiskScoreRequest create() {
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
     * @return depth
     */
    public Integer getDepth() {
        return this.depth;
    }

    /**
     * @return merchantBizId
     */
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

    /**
     * @return objectId
     */
    public String getObjectId() {
        return this.objectId;
    }

    /**
     * @return objectType
     */
    public String getObjectType() {
        return this.objectType;
    }

    public static final class Builder extends Request.Builder<DescribeWeb3RiskScoreRequest, Builder> {
        private String chainShortName; 
        private Integer depth; 
        private String merchantBizId; 
        private String objectId; 
        private String objectType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeWeb3RiskScoreRequest request) {
            super(request);
            this.chainShortName = request.chainShortName;
            this.depth = request.depth;
            this.merchantBizId = request.merchantBizId;
            this.objectId = request.objectId;
            this.objectType = request.objectType;
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
         * minimum: 1
         * <p>
         * maximum: 100
         * the maximum depth for risk analysis. For UTXO-based blockchains, default and maximum is enforced at 100.
         * For account-based blockchains, default and maximum is enforced at 6
         */
        public Builder depth(Integer depth) {
            this.putQueryParameter("Depth", depth);
            this.depth = depth;
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
         * For TRANSACTION objects, you need to provide the transaction hash。
         * <p>
         * For ADDRESS objects, you need to provide the address or reference address hash。
         */
        public Builder objectId(String objectId) {
            this.putQueryParameter("ObjectId", objectId);
            this.objectId = objectId;
            return this;
        }

        /**
         * The object of the analysis.
         * <p>
         * [ TRANSACTION, ADDRESS ]
         */
        public Builder objectType(String objectType) {
            this.putQueryParameter("ObjectType", objectType);
            this.objectType = objectType;
            return this;
        }

        @Override
        public DescribeWeb3RiskScoreRequest build() {
            return new DescribeWeb3RiskScoreRequest(this);
        } 

    } 

}
