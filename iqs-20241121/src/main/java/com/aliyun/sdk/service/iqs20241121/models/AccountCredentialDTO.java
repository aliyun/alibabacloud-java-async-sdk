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
 * {@link AccountCredentialDTO} extends {@link TeaModel}
 *
 * <p>AccountCredentialDTO</p>
 */
public class AccountCredentialDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accountId")
    private String accountId;

    @com.aliyun.core.annotation.NameInMap("callerIdentity")
    private String callerIdentity;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    private AccountCredentialDTO(Builder builder) {
        this.accountId = builder.accountId;
        this.callerIdentity = builder.callerIdentity;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AccountCredentialDTO create() {
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

    /**
     * @return callerIdentity
     */
    public String getCallerIdentity() {
        return this.callerIdentity;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    public static final class Builder {
        private String accountId; 
        private String callerIdentity; 
        private Long id; 

        private Builder() {
        } 

        private Builder(AccountCredentialDTO model) {
            this.accountId = model.accountId;
            this.callerIdentity = model.callerIdentity;
            this.id = model.id;
        } 

        /**
         * accountId.
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * callerIdentity.
         */
        public Builder callerIdentity(String callerIdentity) {
            this.callerIdentity = callerIdentity;
            return this;
        }

        /**
         * id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public AccountCredentialDTO build() {
            return new AccountCredentialDTO(this);
        } 

    } 

}
