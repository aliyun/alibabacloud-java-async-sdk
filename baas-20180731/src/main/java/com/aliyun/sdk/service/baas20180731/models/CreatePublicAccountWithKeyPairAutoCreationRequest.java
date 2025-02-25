// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePublicAccountWithKeyPairAutoCreationRequest} extends {@link RequestModel}
 *
 * <p>CreatePublicAccountWithKeyPairAutoCreationRequest</p>
 */
public class CreatePublicAccountWithKeyPairAutoCreationRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Account")
    private String account;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Bizid")
    private String bizid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RecoverPassword")
    private String recoverPassword;

    private CreatePublicAccountWithKeyPairAutoCreationRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.account = builder.account;
        this.bizid = builder.bizid;
        this.password = builder.password;
        this.recoverPassword = builder.recoverPassword;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePublicAccountWithKeyPairAutoCreationRequest create() {
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
     * @return bizid
     */
    public String getBizid() {
        return this.bizid;
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

    public static final class Builder extends Request.Builder<CreatePublicAccountWithKeyPairAutoCreationRequest, Builder> {
        private String regionId; 
        private String account; 
        private String bizid; 
        private String password; 
        private String recoverPassword; 

        private Builder() {
            super();
        } 

        private Builder(CreatePublicAccountWithKeyPairAutoCreationRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.account = request.account;
            this.bizid = request.bizid;
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
         * Bizid.
         */
        public Builder bizid(String bizid) {
            this.putBodyParameter("Bizid", bizid);
            this.bizid = bizid;
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
        public CreatePublicAccountWithKeyPairAutoCreationRequest build() {
            return new CreatePublicAccountWithKeyPairAutoCreationRequest(this);
        } 

    } 

}
