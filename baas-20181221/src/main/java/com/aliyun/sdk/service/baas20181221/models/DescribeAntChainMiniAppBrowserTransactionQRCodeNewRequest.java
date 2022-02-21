// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainMiniAppBrowserTransactionQRCodeNewRequest} extends {@link RequestModel}
 *
 * <p>DescribeAntChainMiniAppBrowserTransactionQRCodeNewRequest</p>
 */
public class DescribeAntChainMiniAppBrowserTransactionQRCodeNewRequest extends Request {
    @Body
    @NameInMap("AntChainId")
    @Validation(required = true)
    private String antChainId;

    @Body
    @NameInMap("ContractId")
    private String contractId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("TransactionHash")
    @Validation(required = true)
    private String transactionHash;

    private DescribeAntChainMiniAppBrowserTransactionQRCodeNewRequest(Builder builder) {
        super(builder);
        this.antChainId = builder.antChainId;
        this.contractId = builder.contractId;
        this.regionId = builder.regionId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return transactionHash
     */
    public String getTransactionHash() {
        return this.transactionHash;
    }

    public static final class Builder extends Request.Builder<DescribeAntChainMiniAppBrowserTransactionQRCodeNewRequest, Builder> {
        private String antChainId; 
        private String contractId; 
        private String regionId; 
        private String transactionHash; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAntChainMiniAppBrowserTransactionQRCodeNewRequest response) {
            super(response);
            this.antChainId = response.antChainId;
            this.contractId = response.contractId;
            this.regionId = response.regionId;
            this.transactionHash = response.transactionHash;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
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
