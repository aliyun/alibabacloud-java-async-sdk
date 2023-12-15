// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

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
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Account")
    private String account;

    @Body
    @NameInMap("AntChainId")
    private String antChainId;

    @Body
    @NameInMap("Password")
    private String password;

    @Body
    @NameInMap("RecoverPassword")
    private String recoverPassword;

    private CreateAntChainAccountWithKeyPairAutoCreationRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.account = builder.account;
        this.antChainId = builder.antChainId;
        this.password = builder.password;
        this.recoverPassword = builder.recoverPassword;
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

    public static final class Builder extends Request.Builder<CreateAntChainAccountWithKeyPairAutoCreationRequest, Builder> {
        private String regionId; 
        private String account; 
        private String antChainId; 
        private String password; 
        private String recoverPassword; 

        private Builder() {
            super();
        } 

        private Builder(CreateAntChainAccountWithKeyPairAutoCreationRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.account = request.account;
            this.antChainId = request.antChainId;
            this.password = request.password;
            this.recoverPassword = request.recoverPassword;
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

        @Override
        public CreateAntChainAccountWithKeyPairAutoCreationRequest build() {
            return new CreateAntChainAccountWithKeyPairAutoCreationRequest(this);
        } 

    } 

}
