// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAntChainAccountRequest} extends {@link RequestModel}
 *
 * <p>CreateAntChainAccountRequest</p>
 */
public class CreateAntChainAccountRequest extends Request {
    @Body
    @NameInMap("Account")
    @Validation(required = true)
    private String account;

    @Body
    @NameInMap("AccountPubKey")
    @Validation(required = true)
    private String accountPubKey;

    @Body
    @NameInMap("AccountRecoverPubKey")
    @Validation(required = true)
    private String accountRecoverPubKey;

    @Body
    @NameInMap("AntChainId")
    @Validation(required = true)
    private String antChainId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private CreateAntChainAccountRequest(Builder builder) {
        super(builder);
        this.account = builder.account;
        this.accountPubKey = builder.accountPubKey;
        this.accountRecoverPubKey = builder.accountRecoverPubKey;
        this.antChainId = builder.antChainId;
        this.regionId = builder.regionId;
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

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateAntChainAccountRequest, Builder> {
        private String account; 
        private String accountPubKey; 
        private String accountRecoverPubKey; 
        private String antChainId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAntChainAccountRequest response) {
            super(response);
            this.account = response.account;
            this.accountPubKey = response.accountPubKey;
            this.accountRecoverPubKey = response.accountRecoverPubKey;
            this.antChainId = response.antChainId;
            this.regionId = response.regionId;
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

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateAntChainAccountRequest build() {
            return new CreateAntChainAccountRequest(this);
        } 

    } 

}
