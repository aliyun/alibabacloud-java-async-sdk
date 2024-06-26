// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ProcessCloudIDEContractTransactionRequest} extends {@link RequestModel}
 *
 * <p>ProcessCloudIDEContractTransactionRequest</p>
 */
public class ProcessCloudIDEContractTransactionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AntChainId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String antChainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Transaction")
    @com.aliyun.core.annotation.Validation(required = true)
    private String transaction;

    private ProcessCloudIDEContractTransactionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.antChainId = builder.antChainId;
        this.transaction = builder.transaction;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ProcessCloudIDEContractTransactionRequest create() {
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
     * @return transaction
     */
    public String getTransaction() {
        return this.transaction;
    }

    public static final class Builder extends Request.Builder<ProcessCloudIDEContractTransactionRequest, Builder> {
        private String regionId; 
        private String antChainId; 
        private String transaction; 

        private Builder() {
            super();
        } 

        private Builder(ProcessCloudIDEContractTransactionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.antChainId = request.antChainId;
            this.transaction = request.transaction;
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
         * Transaction.
         */
        public Builder transaction(String transaction) {
            this.putBodyParameter("Transaction", transaction);
            this.transaction = transaction;
            return this;
        }

        @Override
        public ProcessCloudIDEContractTransactionRequest build() {
            return new ProcessCloudIDEContractTransactionRequest(this);
        } 

    } 

}
