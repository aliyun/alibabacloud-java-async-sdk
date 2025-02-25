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
 * {@link CreateSubscribedCalendarRequest} extends {@link RequestModel}
 *
 * <p>CreateSubscribedCalendarRequest</p>
 */
public class CreateSubscribedCalendarRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Managers")
    private java.util.List<String> managers;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SubscribeScope")
    @com.aliyun.core.annotation.Validation(required = true)
    private SubscribeScope subscribeScope;

    private CreateSubscribedCalendarRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.description = builder.description;
        this.managers = builder.managers;
        this.name = builder.name;
        this.subscribeScope = builder.subscribeScope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSubscribedCalendarRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return managers
     */
    public java.util.List<String> getManagers() {
        return this.managers;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return subscribeScope
     */
    public SubscribeScope getSubscribeScope() {
        return this.subscribeScope;
    }

    public static final class Builder extends Request.Builder<CreateSubscribedCalendarRequest, Builder> {
        private AccountContext accountContext; 
        private String description; 
        private java.util.List<String> managers; 
        private String name; 
        private SubscribeScope subscribeScope; 

        private Builder() {
            super();
        } 

        private Builder(CreateSubscribedCalendarRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.description = request.description;
            this.managers = request.managers;
            this.name = request.name;
            this.subscribeScope = request.subscribeScope;
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
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Managers.
         */
        public Builder managers(java.util.List<String> managers) {
            String managersShrink = shrink(managers, "Managers", "json");
            this.putBodyParameter("Managers", managersShrink);
            this.managers = managers;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder subscribeScope(SubscribeScope subscribeScope) {
            String subscribeScopeShrink = shrink(subscribeScope, "SubscribeScope", "json");
            this.putBodyParameter("SubscribeScope", subscribeScopeShrink);
            this.subscribeScope = subscribeScope;
            return this;
        }

        @Override
        public CreateSubscribedCalendarRequest build() {
            return new CreateSubscribedCalendarRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateSubscribedCalendarRequest} extends {@link TeaModel}
     *
     * <p>CreateSubscribedCalendarRequest</p>
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
    /**
     * 
     * {@link CreateSubscribedCalendarRequest} extends {@link TeaModel}
     *
     * <p>CreateSubscribedCalendarRequest</p>
     */
    public static class SubscribeScope extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CorpIds")
        private java.util.List<String> corpIds;

        @com.aliyun.core.annotation.NameInMap("OpenConversationIds")
        private java.util.List<String> openConversationIds;

        @com.aliyun.core.annotation.NameInMap("UserIds")
        private java.util.List<String> userIds;

        private SubscribeScope(Builder builder) {
            this.corpIds = builder.corpIds;
            this.openConversationIds = builder.openConversationIds;
            this.userIds = builder.userIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubscribeScope create() {
            return builder().build();
        }

        /**
         * @return corpIds
         */
        public java.util.List<String> getCorpIds() {
            return this.corpIds;
        }

        /**
         * @return openConversationIds
         */
        public java.util.List<String> getOpenConversationIds() {
            return this.openConversationIds;
        }

        /**
         * @return userIds
         */
        public java.util.List<String> getUserIds() {
            return this.userIds;
        }

        public static final class Builder {
            private java.util.List<String> corpIds; 
            private java.util.List<String> openConversationIds; 
            private java.util.List<String> userIds; 

            /**
             * CorpIds.
             */
            public Builder corpIds(java.util.List<String> corpIds) {
                this.corpIds = corpIds;
                return this;
            }

            /**
             * OpenConversationIds.
             */
            public Builder openConversationIds(java.util.List<String> openConversationIds) {
                this.openConversationIds = openConversationIds;
                return this;
            }

            /**
             * UserIds.
             */
            public Builder userIds(java.util.List<String> userIds) {
                this.userIds = userIds;
                return this;
            }

            public SubscribeScope build() {
                return new SubscribeScope(this);
            } 

        } 

    }
}
