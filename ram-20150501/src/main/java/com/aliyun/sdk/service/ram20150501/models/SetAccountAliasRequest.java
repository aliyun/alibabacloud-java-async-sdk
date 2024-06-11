// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetAccountAliasRequest} extends {@link RequestModel}
 *
 * <p>SetAccountAliasRequest</p>
 */
public class SetAccountAliasRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountAlias")
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

        private Builder(SetAccountAliasRequest request) {
            super(request);
            this.accountAlias = request.accountAlias;
        } 

        /**
         * The alias of the Alibaba Cloud account.
         * <p>
         * 
         * The alias must be 3 to 32 characters in length, and can contain lowercase letters, digits, and hyphens (-).
         * 
         * > It cannot start or end with a hyphen (-), and cannot contain consecutive hyphens (-).
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
