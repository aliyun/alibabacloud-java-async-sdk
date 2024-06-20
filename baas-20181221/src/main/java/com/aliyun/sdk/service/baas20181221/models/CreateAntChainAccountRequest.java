// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAntChainAccountRequest} extends {@link RequestModel}
 *
 * <p>CreateAntChainAccountRequest</p>
 */
public class CreateAntChainAccountRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Account")
    @com.aliyun.core.annotation.Validation(required = true)
    private String account;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccountPubKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountPubKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccountRecoverPubKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountRecoverPubKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AntChainId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String antChainId;

    private CreateAntChainAccountRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.account = builder.account;
        this.accountPubKey = builder.accountPubKey;
        this.accountRecoverPubKey = builder.accountRecoverPubKey;
        this.antChainId = builder.antChainId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAntChainAccountRequest create() {
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
     * @return antChainId
     */
    public String getAntChainId() {
        return this.antChainId;
    }

    public static final class Builder extends Request.Builder<CreateAntChainAccountRequest, Builder> {
        private String regionId; 
        private String account; 
        private String accountPubKey; 
        private String accountRecoverPubKey; 
        private String antChainId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAntChainAccountRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.account = request.account;
            this.accountPubKey = request.accountPubKey;
            this.accountRecoverPubKey = request.accountRecoverPubKey;
            this.antChainId = request.antChainId;
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
         * AntChainId.
         */
        public Builder antChainId(String antChainId) {
            this.putBodyParameter("AntChainId", antChainId);
            this.antChainId = antChainId;
            return this;
        }

        @Override
        public CreateAntChainAccountRequest build() {
            return new CreateAntChainAccountRequest(this);
        } 

    } 

}
