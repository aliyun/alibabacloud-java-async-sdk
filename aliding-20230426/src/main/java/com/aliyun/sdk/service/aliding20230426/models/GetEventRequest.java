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
 * {@link GetEventRequest} extends {@link RequestModel}
 *
 * <p>GetEventRequest</p>
 */
public class GetEventRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CalendarId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String calendarId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EventId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eventId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxAttendees")
    private Long maxAttendees;

    private GetEventRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.calendarId = builder.calendarId;
        this.eventId = builder.eventId;
        this.maxAttendees = builder.maxAttendees;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEventRequest create() {
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
     * @return eventId
     */
    public String getEventId() {
        return this.eventId;
    }

    /**
     * @return maxAttendees
     */
    public Long getMaxAttendees() {
        return this.maxAttendees;
    }

    public static final class Builder extends Request.Builder<GetEventRequest, Builder> {
        private AccountContext accountContext; 
        private String calendarId; 
        private String eventId; 
        private Long maxAttendees; 

        private Builder() {
            super();
        } 

        private Builder(GetEventRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.calendarId = request.calendarId;
            this.eventId = request.eventId;
            this.maxAttendees = request.maxAttendees;
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
         * <p>311525211</p>
         */
        public Builder eventId(String eventId) {
            this.putBodyParameter("EventId", eventId);
            this.eventId = eventId;
            return this;
        }

        /**
         * MaxAttendees.
         */
        public Builder maxAttendees(Long maxAttendees) {
            this.putQueryParameter("MaxAttendees", maxAttendees);
            this.maxAttendees = maxAttendees;
            return this;
        }

        @Override
        public GetEventRequest build() {
            return new GetEventRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetEventRequest} extends {@link TeaModel}
     *
     * <p>GetEventRequest</p>
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
