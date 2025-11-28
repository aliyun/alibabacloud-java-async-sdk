// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lto20210707.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryBlockchainMetadataRequest} extends {@link RequestModel}
 *
 * <p>QueryBlockchainMetadataRequest</p>
 */
public class QueryBlockchainMetadataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizChainId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizChainId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContractName")
    private String contractName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InvokeType")
    private String invokeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotDataDID")
    @com.aliyun.core.annotation.Validation(required = true)
    private String iotDataDID;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransactionId")
    private String transactionId;

    private QueryBlockchainMetadataRequest(Builder builder) {
        super(builder);
        this.bizChainId = builder.bizChainId;
        this.contractName = builder.contractName;
        this.invokeType = builder.invokeType;
        this.iotDataDID = builder.iotDataDID;
        this.regionId = builder.regionId;
        this.transactionId = builder.transactionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryBlockchainMetadataRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizChainId
     */
    public String getBizChainId() {
        return this.bizChainId;
    }

    /**
     * @return contractName
     */
    public String getContractName() {
        return this.contractName;
    }

    /**
     * @return invokeType
     */
    public String getInvokeType() {
        return this.invokeType;
    }

    /**
     * @return iotDataDID
     */
    public String getIotDataDID() {
        return this.iotDataDID;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return transactionId
     */
    public String getTransactionId() {
        return this.transactionId;
    }

    public static final class Builder extends Request.Builder<QueryBlockchainMetadataRequest, Builder> {
        private String bizChainId; 
        private String contractName; 
        private String invokeType; 
        private String iotDataDID; 
        private String regionId; 
        private String transactionId; 

        private Builder() {
            super();
        } 

        private Builder(QueryBlockchainMetadataRequest request) {
            super(request);
            this.bizChainId = request.bizChainId;
            this.contractName = request.contractName;
            this.invokeType = request.invokeType;
            this.iotDataDID = request.iotDataDID;
            this.regionId = request.regionId;
            this.transactionId = request.transactionId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder bizChainId(String bizChainId) {
            this.putQueryParameter("BizChainId", bizChainId);
            this.bizChainId = bizChainId;
            return this;
        }

        /**
         * ContractName.
         */
        public Builder contractName(String contractName) {
            this.putQueryParameter("ContractName", contractName);
            this.contractName = contractName;
            return this;
        }

        /**
         * InvokeType.
         */
        public Builder invokeType(String invokeType) {
            this.putQueryParameter("InvokeType", invokeType);
            this.invokeType = invokeType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder iotDataDID(String iotDataDID) {
            this.putQueryParameter("IotDataDID", iotDataDID);
            this.iotDataDID = iotDataDID;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * TransactionId.
         */
        public Builder transactionId(String transactionId) {
            this.putQueryParameter("TransactionId", transactionId);
            this.transactionId = transactionId;
            return this;
        }

        @Override
        public QueryBlockchainMetadataRequest build() {
            return new QueryBlockchainMetadataRequest(this);
        } 

    } 

}
