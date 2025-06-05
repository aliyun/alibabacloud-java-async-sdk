// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link AuthorizeSkillRequest} extends {@link RequestModel}
 *
 * <p>AuthorizeSkillRequest</p>
 */
public class AuthorizeSkillRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PermissionCodes")
    private java.util.List<String> permissionCodes;

    private AuthorizeSkillRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.permissionCodes = builder.permissionCodes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthorizeSkillRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountContext
     */
    public AccountContext getAccountContext() {
        return this.accountContext;
    }

    /**
     * @return permissionCodes
     */
    public java.util.List<String> getPermissionCodes() {
        return this.permissionCodes;
    }

    public static final class Builder extends Request.Builder<AuthorizeSkillRequest, Builder> {
        private AccountContext accountContext; 
        private java.util.List<String> permissionCodes; 

        private Builder() {
            super();
        } 

        private Builder(AuthorizeSkillRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.permissionCodes = request.permissionCodes;
        } 

        /**
         * AccountContext.
         */
        public Builder accountContext(AccountContext accountContext) {
            String accountContextShrink = shrink(accountContext, "AccountContext", "json");
            this.putHeaderParameter("AccountContext", accountContextShrink);
            this.accountContext = accountContext;
            return this;
        }

        /**
         * PermissionCodes.
         */
        public Builder permissionCodes(java.util.List<String> permissionCodes) {
            String permissionCodesShrink = shrink(permissionCodes, "PermissionCodes", "json");
            this.putBodyParameter("PermissionCodes", permissionCodesShrink);
            this.permissionCodes = permissionCodes;
            return this;
        }

        @Override
        public AuthorizeSkillRequest build() {
            return new AuthorizeSkillRequest(this);
        } 

    } 

    /**
     * 
     * {@link AuthorizeSkillRequest} extends {@link TeaModel}
     *
     * <p>AuthorizeSkillRequest</p>
     */
    public static class AccountContext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accountId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String accountId;

        private AccountContext(Builder builder) {
            this.accountId = builder.accountId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccountContext create() {
            return builder().build();
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

            private Builder(AccountContext model) {
                this.accountId = model.accountId;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>012345</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            public AccountContext build() {
                return new AccountContext(this);
            } 

        } 

    }
}
