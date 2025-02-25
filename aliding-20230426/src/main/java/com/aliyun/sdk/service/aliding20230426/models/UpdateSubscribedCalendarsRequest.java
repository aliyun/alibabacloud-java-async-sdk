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
 * {@link UpdateSubscribedCalendarsRequest} extends {@link RequestModel}
 *
 * <p>UpdateSubscribedCalendarsRequest</p>
 */
public class UpdateSubscribedCalendarsRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CalendarId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String calendarId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Managers")
    private java.util.List<String> managers;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SubscribeScope")
    private SubscribeScope subscribeScope;

    private UpdateSubscribedCalendarsRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.calendarId = builder.calendarId;
        this.description = builder.description;
        this.managers = builder.managers;
        this.name = builder.name;
        this.subscribeScope = builder.subscribeScope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSubscribedCalendarsRequest create() {
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
     * @return calendarId
     */
    public String getCalendarId() {
        return this.calendarId;
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

    public static final class Builder extends Request.Builder<UpdateSubscribedCalendarsRequest, Builder> {
        private AccountContext accountContext; 
        private String calendarId; 
        private String description; 
        private java.util.List<String> managers; 
        private String name; 
        private SubscribeScope subscribeScope; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSubscribedCalendarsRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.calendarId = request.calendarId;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>M5MjkxNDUxQHVzZXJzLmRpbmd0YWxrLmNv</p>
         */
        public Builder calendarId(String calendarId) {
            this.putBodyParameter("CalendarId", calendarId);
            this.calendarId = calendarId;
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
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * SubscribeScope.
         */
        public Builder subscribeScope(SubscribeScope subscribeScope) {
            String subscribeScopeShrink = shrink(subscribeScope, "SubscribeScope", "json");
            this.putBodyParameter("SubscribeScope", subscribeScopeShrink);
            this.subscribeScope = subscribeScope;
            return this;
        }

        @Override
        public UpdateSubscribedCalendarsRequest build() {
            return new UpdateSubscribedCalendarsRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateSubscribedCalendarsRequest} extends {@link TeaModel}
     *
     * <p>UpdateSubscribedCalendarsRequest</p>
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
     * {@link UpdateSubscribedCalendarsRequest} extends {@link TeaModel}
     *
     * <p>UpdateSubscribedCalendarsRequest</p>
     */
    public static class SubscribeScope extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserIds")
        private java.util.List<String> userIds;

        private SubscribeScope(Builder builder) {
            this.userIds = builder.userIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubscribeScope create() {
            return builder().build();
        }

        /**
         * @return userIds
         */
        public java.util.List<String> getUserIds() {
            return this.userIds;
        }

        public static final class Builder {
            private java.util.List<String> userIds; 

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
