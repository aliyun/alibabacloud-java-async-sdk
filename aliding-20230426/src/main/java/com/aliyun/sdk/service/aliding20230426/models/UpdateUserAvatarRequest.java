// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateUserAvatarRequest} extends {@link RequestModel}
 *
 * <p>UpdateUserAvatarRequest</p>
 */
public class UpdateUserAvatarRequest extends Request {
    @Header
    @NameInMap("AccountContext")
    private AccountContext accountContext;

    @Body
    @NameInMap("AvatarMediaId")
    private String avatarMediaId;

    private UpdateUserAvatarRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.avatarMediaId = builder.avatarMediaId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUserAvatarRequest create() {
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
     * @return avatarMediaId
     */
    public String getAvatarMediaId() {
        return this.avatarMediaId;
    }

    public static final class Builder extends Request.Builder<UpdateUserAvatarRequest, Builder> {
        private AccountContext accountContext; 
        private String avatarMediaId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUserAvatarRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.avatarMediaId = request.avatarMediaId;
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
         * AvatarMediaId.
         */
        public Builder avatarMediaId(String avatarMediaId) {
            this.putBodyParameter("AvatarMediaId", avatarMediaId);
            this.avatarMediaId = avatarMediaId;
            return this;
        }

        @Override
        public UpdateUserAvatarRequest build() {
            return new UpdateUserAvatarRequest(this);
        } 

    } 

    public static class AccountContext extends TeaModel {
        @NameInMap("accountId")
        @Validation(required = true)
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

            /**
             * accountId.
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
