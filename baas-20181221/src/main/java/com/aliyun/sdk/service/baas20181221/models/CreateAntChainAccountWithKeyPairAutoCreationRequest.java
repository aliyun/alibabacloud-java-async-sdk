// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAntChainAccountWithKeyPairAutoCreationRequest} extends {@link RequestModel}
 *
 * <p>CreateAntChainAccountWithKeyPairAutoCreationRequest</p>
 */
public class CreateAntChainAccountWithKeyPairAutoCreationRequest extends Request {
    @Body
    @NameInMap("Account")
    @Validation(required = true)
    private String account;

    @Body
    @NameInMap("AntChainId")
    @Validation(required = true)
    private String antChainId;

    @Body
    @NameInMap("Password")
    @Validation(required = true)
    private String password;

    @Body
    @NameInMap("RecoverPassword")
    @Validation(required = true)
    private String recoverPassword;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private CreateAntChainAccountWithKeyPairAutoCreationRequest(Builder builder) {
        super(builder);
        this.account = builder.account;
        this.antChainId = builder.antChainId;
        this.password = builder.password;
        this.recoverPassword = builder.recoverPassword;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAntChainAccountWithKeyPairAutoCreationRequest create() {
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
     * @return antChainId
     */
    public String getAntChainId() {
        return this.antChainId;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return recoverPassword
     */
    public String getRecoverPassword() {
        return this.recoverPassword;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateAntChainAccountWithKeyPairAutoCreationRequest, Builder> {
        private String account; 
        private String antChainId; 
        private String password; 
        private String recoverPassword; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAntChainAccountWithKeyPairAutoCreationRequest response) {
            super(response);
            this.account = response.account;
            this.antChainId = response.antChainId;
            this.password = response.password;
            this.recoverPassword = response.recoverPassword;
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
         * AntChainId.
         */
        public Builder antChainId(String antChainId) {
            this.putBodyParameter("AntChainId", antChainId);
            this.antChainId = antChainId;
            return this;
        }

        /**
         * Password.
         */
        public Builder password(String password) {
            this.putBodyParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * RecoverPassword.
         */
        public Builder recoverPassword(String recoverPassword) {
            this.putBodyParameter("RecoverPassword", recoverPassword);
            this.recoverPassword = recoverPassword;
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
        public CreateAntChainAccountWithKeyPairAutoCreationRequest build() {
            return new CreateAntChainAccountWithKeyPairAutoCreationRequest(this);
        } 

    } 

}
