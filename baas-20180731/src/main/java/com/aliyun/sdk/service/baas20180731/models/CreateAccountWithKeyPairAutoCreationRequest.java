// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAccountWithKeyPairAutoCreationRequest} extends {@link RequestModel}
 *
 * <p>CreateAccountWithKeyPairAutoCreationRequest</p>
 */
public class CreateAccountWithKeyPairAutoCreationRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Account")
    private String account;

    @Body
    @NameInMap("Bizid")
    private String bizid;

    @Body
    @NameInMap("Password")
    private String password;

    private CreateAccountWithKeyPairAutoCreationRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.account = builder.account;
        this.bizid = builder.bizid;
        this.password = builder.password;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAccountWithKeyPairAutoCreationRequest create() {
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

    public static final class Builder extends Request.Builder<CreateAccountWithKeyPairAutoCreationRequest, Builder> {
        private String regionId; 
        private String account; 
        private String bizid; 
        private String password; 

        private Builder() {
            super();
        } 

        private Builder(CreateAccountWithKeyPairAutoCreationRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.account = request.account;
            this.bizid = request.bizid;
            this.password = request.password;
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

        @Override
        public CreateAccountWithKeyPairAutoCreationRequest build() {
            return new CreateAccountWithKeyPairAutoCreationRequest(this);
        } 

    } 

}
