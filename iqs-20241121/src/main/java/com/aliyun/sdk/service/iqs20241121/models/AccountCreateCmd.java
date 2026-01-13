// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241121.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AccountCreateCmd} extends {@link TeaModel}
 *
 * <p>AccountCreateCmd</p>
 */
public class AccountCreateCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accountId")
    private String accountId;

    private AccountCreateCmd(Builder builder) {
        this.accountId = builder.accountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AccountCreateCmd create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    public static final class Builder {
        private String accountId; 

        private Builder() {
        } 

        private Builder(AccountCreateCmd model) {
            this.accountId = model.accountId;
        } 

        /**
         * accountId.
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        public AccountCreateCmd build() {
            return new AccountCreateCmd(this);
        } 

    } 

}
