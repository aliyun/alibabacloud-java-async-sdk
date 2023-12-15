// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePublicAntChainAccountRequest} extends {@link RequestModel}
 *
 * <p>CreatePublicAntChainAccountRequest</p>
 */
public class CreatePublicAntChainAccountRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Account")
    private String account;

    @Body
    @NameInMap("AccountPubKey")
    private String accountPubKey;

    @Body
    @NameInMap("AccountRecoverPubKey")
    private String accountRecoverPubKey;

    @Body
    @NameInMap("Bizid")
    private String bizid;

    private CreatePublicAntChainAccountRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.account = builder.account;
        this.accountPubKey = builder.accountPubKey;
        this.accountRecoverPubKey = builder.accountRecoverPubKey;
        this.bizid = builder.bizid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePublicAntChainAccountRequest create() {
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
     * @return bizid
     */
    public String getBizid() {
        return this.bizid;
    }

    public static final class Builder extends Request.Builder<CreatePublicAntChainAccountRequest, Builder> {
        private String regionId; 
        private String account; 
        private String accountPubKey; 
        private String accountRecoverPubKey; 
        private String bizid; 

        private Builder() {
            super();
        } 

        private Builder(CreatePublicAntChainAccountRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.account = request.account;
            this.accountPubKey = request.accountPubKey;
            this.accountRecoverPubKey = request.accountRecoverPubKey;
            this.bizid = request.bizid;
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
         * Bizid.
         */
        public Builder bizid(String bizid) {
            this.putBodyParameter("Bizid", bizid);
            this.bizid = bizid;
            return this;
        }

        @Override
        public CreatePublicAntChainAccountRequest build() {
            return new CreatePublicAntChainAccountRequest(this);
        } 

    } 

}
