// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ProcessPublicCloudIDEContractTransactionRequest} extends {@link RequestModel}
 *
 * <p>ProcessPublicCloudIDEContractTransactionRequest</p>
 */
public class ProcessPublicCloudIDEContractTransactionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Bizid")
    private String bizid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Transaction")
    private String transaction;

    private ProcessPublicCloudIDEContractTransactionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizid = builder.bizid;
        this.transaction = builder.transaction;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ProcessPublicCloudIDEContractTransactionRequest create() {
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
     * @return bizid
     */
    public String getBizid() {
        return this.bizid;
    }

    /**
     * @return transaction
     */
    public String getTransaction() {
        return this.transaction;
    }

    public static final class Builder extends Request.Builder<ProcessPublicCloudIDEContractTransactionRequest, Builder> {
        private String regionId; 
        private String bizid; 
        private String transaction; 

        private Builder() {
            super();
        } 

        private Builder(ProcessPublicCloudIDEContractTransactionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizid = request.bizid;
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
         * Bizid.
         */
        public Builder bizid(String bizid) {
            this.putBodyParameter("Bizid", bizid);
            this.bizid = bizid;
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
        public ProcessPublicCloudIDEContractTransactionRequest build() {
            return new ProcessPublicCloudIDEContractTransactionRequest(this);
        } 

    } 

}
