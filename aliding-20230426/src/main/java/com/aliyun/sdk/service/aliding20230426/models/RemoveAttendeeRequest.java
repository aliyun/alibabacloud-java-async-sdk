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
 * {@link RemoveAttendeeRequest} extends {@link RequestModel}
 *
 * <p>RemoveAttendeeRequest</p>
 */
public class RemoveAttendeeRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AttendeesToRemove")
    private java.util.List<String> attendeesToRemove;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CalendarId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String calendarId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EventId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eventId;

    private RemoveAttendeeRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.attendeesToRemove = builder.attendeesToRemove;
        this.calendarId = builder.calendarId;
        this.eventId = builder.eventId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveAttendeeRequest create() {
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
     * @return attendeesToRemove
     */
    public java.util.List<String> getAttendeesToRemove() {
        return this.attendeesToRemove;
    }

    /**
     * @return calendarId
     */
    public String getCalendarId() {
        return this.calendarId;
    }

    /**
     * @return eventId
     */
    public String getEventId() {
        return this.eventId;
    }

    public static final class Builder extends Request.Builder<RemoveAttendeeRequest, Builder> {
        private AccountContext accountContext; 
        private java.util.List<String> attendeesToRemove; 
        private String calendarId; 
        private String eventId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveAttendeeRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.attendeesToRemove = request.attendeesToRemove;
            this.calendarId = request.calendarId;
            this.eventId = request.eventId;
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
         * AttendeesToRemove.
         */
        public Builder attendeesToRemove(java.util.List<String> attendeesToRemove) {
            String attendeesToRemoveShrink = shrink(attendeesToRemove, "AttendeesToRemove", "json");
            this.putBodyParameter("AttendeesToRemove", attendeesToRemoveShrink);
            this.attendeesToRemove = attendeesToRemove;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>primary</p>
         */
        public Builder calendarId(String calendarId) {
            this.putBodyParameter("CalendarId", calendarId);
            this.calendarId = calendarId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>iiiP35sJadba8aBSgjrwPRKgiEiF</p>
         */
        public Builder eventId(String eventId) {
            this.putBodyParameter("EventId", eventId);
            this.eventId = eventId;
            return this;
        }

        @Override
        public RemoveAttendeeRequest build() {
            return new RemoveAttendeeRequest(this);
        } 

    } 

    /**
     * 
     * {@link RemoveAttendeeRequest} extends {@link TeaModel}
     *
     * <p>RemoveAttendeeRequest</p>
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
             * <p>123456</p>
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
