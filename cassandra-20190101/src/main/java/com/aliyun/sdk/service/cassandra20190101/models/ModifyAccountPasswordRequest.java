// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cassandra20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAccountPasswordRequest} extends {@link RequestModel}
 *
 * <p>ModifyAccountPasswordRequest</p>
 */
public class ModifyAccountPasswordRequest extends Request {
    @Query
    @NameInMap("Account")
    @Validation(required = true)
    private String account;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("Password")
    @Validation(required = true)
    private String password;

    private ModifyAccountPasswordRequest(Builder builder) {
        super(builder);
        this.account = builder.account;
        this.clusterId = builder.clusterId;
        this.password = builder.password;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAccountPasswordRequest create() {
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
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    public static final class Builder extends Request.Builder<ModifyAccountPasswordRequest, Builder> {
        private String account; 
        private String clusterId; 
        private String password; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAccountPasswordRequest response) {
            super(response);
            this.account = response.account;
            this.clusterId = response.clusterId;
            this.password = response.password;
        } 

        /**
         * Account.
         */
        public Builder account(String account) {
            this.putQueryParameter("Account", account);
            this.account = account;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Password.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        @Override
        public ModifyAccountPasswordRequest build() {
            return new ModifyAccountPasswordRequest(this);
        } 

    } 

}
