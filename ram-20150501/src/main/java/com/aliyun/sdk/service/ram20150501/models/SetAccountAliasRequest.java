// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetAccountAliasRequest} extends {@link RequestModel}
 *
 * <p>SetAccountAliasRequest</p>
 */
public class SetAccountAliasRequest extends Request {
    @Query
    @NameInMap("AccountAlias")
    private String accountAlias;

    private SetAccountAliasRequest(Builder builder) {
        super(builder);
        this.accountAlias = builder.accountAlias;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetAccountAliasRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountAlias
     */
    public String getAccountAlias() {
        return this.accountAlias;
    }

    public static final class Builder extends Request.Builder<SetAccountAliasRequest, Builder> {
        private String accountAlias; 

        private Builder() {
            super();
        } 

        private Builder(SetAccountAliasRequest response) {
            super(response);
            this.accountAlias = response.accountAlias;
        } 

        /**
         * AccountAlias.
         */
        public Builder accountAlias(String accountAlias) {
            this.putQueryParameter("AccountAlias", accountAlias);
            this.accountAlias = accountAlias;
            return this;
        }

        @Override
        public SetAccountAliasRequest build() {
            return new SetAccountAliasRequest(this);
        } 

    } 

}
