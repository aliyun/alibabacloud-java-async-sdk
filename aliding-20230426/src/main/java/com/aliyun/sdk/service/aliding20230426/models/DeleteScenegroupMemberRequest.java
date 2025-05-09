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
 * {@link DeleteScenegroupMemberRequest} extends {@link RequestModel}
 *
 * <p>DeleteScenegroupMemberRequest</p>
 */
public class DeleteScenegroupMemberRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OpenConversationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String openConversationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userIds;

    private DeleteScenegroupMemberRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.openConversationId = builder.openConversationId;
        this.userIds = builder.userIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteScenegroupMemberRequest create() {
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
     * @return openConversationId
     */
    public String getOpenConversationId() {
        return this.openConversationId;
    }

    /**
     * @return userIds
     */
    public String getUserIds() {
        return this.userIds;
    }

    public static final class Builder extends Request.Builder<DeleteScenegroupMemberRequest, Builder> {
        private AccountContext accountContext; 
        private String openConversationId; 
        private String userIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteScenegroupMemberRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.openConversationId = request.openConversationId;
            this.userIds = request.userIds;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cidvkLfbOyIiSYqjgvAiWwFow==</p>
         */
        public Builder openConversationId(String openConversationId) {
            this.putBodyParameter("OpenConversationId", openConversationId);
            this.openConversationId = openConversationId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123xxx,223xxx</p>
         */
        public Builder userIds(String userIds) {
            this.putBodyParameter("UserIds", userIds);
            this.userIds = userIds;
            return this;
        }

        @Override
        public DeleteScenegroupMemberRequest build() {
            return new DeleteScenegroupMemberRequest(this);
        } 

    } 

    /**
     * 
     * {@link DeleteScenegroupMemberRequest} extends {@link TeaModel}
     *
     * <p>DeleteScenegroupMemberRequest</p>
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
