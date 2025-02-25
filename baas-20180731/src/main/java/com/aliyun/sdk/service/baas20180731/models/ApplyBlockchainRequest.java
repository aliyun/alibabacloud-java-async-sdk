// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyBlockchainRequest} extends {@link RequestModel}
 *
 * <p>ApplyBlockchainRequest</p>
 */
public class ApplyBlockchainRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Account")
    private String account;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccountPubKey")
    private String accountPubKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccountRecoverPubKey")
    private String accountRecoverPubKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Blockchain")
    private String blockchain;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UploadReq")
    private String uploadReq;

    private ApplyBlockchainRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.account = builder.account;
        this.accountPubKey = builder.accountPubKey;
        this.accountRecoverPubKey = builder.accountRecoverPubKey;
        this.blockchain = builder.blockchain;
        this.uploadReq = builder.uploadReq;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyBlockchainRequest create() {
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
     * @return account
     */
    public String getAccount() {
        return this.account;
    }

    /**
     * @return accountPubKey
     */
    public String getAccountPubKey() {
        return this.accountPubKey;
    }

    /**
     * @return accountRecoverPubKey
     */
    public String getAccountRecoverPubKey() {
        return this.accountRecoverPubKey;
    }

    /**
     * @return blockchain
     */
    public String getBlockchain() {
        return this.blockchain;
    }

    /**
     * @return uploadReq
     */
    public String getUploadReq() {
        return this.uploadReq;
    }

    public static final class Builder extends Request.Builder<ApplyBlockchainRequest, Builder> {
        private String regionId; 
        private String account; 
        private String accountPubKey; 
        private String accountRecoverPubKey; 
        private String blockchain; 
        private String uploadReq; 

        private Builder() {
            super();
        } 

        private Builder(ApplyBlockchainRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.account = request.account;
            this.accountPubKey = request.accountPubKey;
            this.accountRecoverPubKey = request.accountRecoverPubKey;
            this.blockchain = request.blockchain;
            this.uploadReq = request.uploadReq;
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
         * Account.
         */
        public Builder account(String account) {
            this.putBodyParameter("Account", account);
            this.account = account;
            return this;
        }

        /**
         * AccountPubKey.
         */
        public Builder accountPubKey(String accountPubKey) {
            this.putBodyParameter("AccountPubKey", accountPubKey);
            this.accountPubKey = accountPubKey;
            return this;
        }

        /**
         * AccountRecoverPubKey.
         */
        public Builder accountRecoverPubKey(String accountRecoverPubKey) {
            this.putBodyParameter("AccountRecoverPubKey", accountRecoverPubKey);
            this.accountRecoverPubKey = accountRecoverPubKey;
            return this;
        }

        /**
         * Blockchain.
         */
        public Builder blockchain(String blockchain) {
            this.putBodyParameter("Blockchain", blockchain);
            this.blockchain = blockchain;
            return this;
        }

        /**
         * UploadReq.
         */
        public Builder uploadReq(String uploadReq) {
            this.putBodyParameter("UploadReq", uploadReq);
            this.uploadReq = uploadReq;
            return this;
        }

        @Override
        public ApplyBlockchainRequest build() {
            return new ApplyBlockchainRequest(this);
        } 

    } 

}
