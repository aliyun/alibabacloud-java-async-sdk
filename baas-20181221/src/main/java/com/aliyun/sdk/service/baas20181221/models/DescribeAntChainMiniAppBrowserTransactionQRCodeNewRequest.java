// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainMiniAppBrowserTransactionQRCodeNewRequest} extends {@link RequestModel}
 *
 * <p>DescribeAntChainMiniAppBrowserTransactionQRCodeNewRequest</p>
 */
public class DescribeAntChainMiniAppBrowserTransactionQRCodeNewRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AntChainId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String antChainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ContractId")
    private String contractId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TransactionHash")
    @com.aliyun.core.annotation.Validation(required = true)
    private String transactionHash;

    private DescribeAntChainMiniAppBrowserTransactionQRCodeNewRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.antChainId = builder.antChainId;
        this.contractId = builder.contractId;
        this.transactionHash = builder.transactionHash;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAntChainMiniAppBrowserTransactionQRCodeNewRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return antChainId
     */
    public String getAntChainId() {
        return this.antChainId;
    }

    /**
     * @return contractId
     */
    public String getContractId() {
        return this.contractId;
    }

    /**
     * @return transactionHash
     */
    public String getTransactionHash() {
        return this.transactionHash;
    }

    public static final class Builder extends Request.Builder<DescribeAntChainMiniAppBrowserTransactionQRCodeNewRequest, Builder> {
        private String regionId; 
        private String antChainId; 
        private String contractId; 
        private String transactionHash; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAntChainMiniAppBrowserTransactionQRCodeNewRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.antChainId = request.antChainId;
            this.contractId = request.contractId;
            this.transactionHash = request.transactionHash;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * AntChainId.
         */
        public Builder antChainId(String antChainId) {
            this.putBodyParameter("AntChainId", antChainId);
            this.antChainId = antChainId;
            return this;
        }

        /**
         * ContractId.
         */
        public Builder contractId(String contractId) {
            this.putBodyParameter("ContractId", contractId);
            this.contractId = contractId;
            return this;
        }

        /**
         * TransactionHash.
         */
        public Builder transactionHash(String transactionHash) {
            this.putBodyParameter("TransactionHash", transactionHash);
            this.transactionHash = transactionHash;
            return this;
        }

        @Override
        public DescribeAntChainMiniAppBrowserTransactionQRCodeNewRequest build() {
            return new DescribeAntChainMiniAppBrowserTransactionQRCodeNewRequest(this);
        } 

    } 

}
