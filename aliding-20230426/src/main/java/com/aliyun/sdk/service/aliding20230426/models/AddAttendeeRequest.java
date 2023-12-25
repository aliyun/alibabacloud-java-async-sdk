// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddAttendeeRequest} extends {@link RequestModel}
 *
 * <p>AddAttendeeRequest</p>
 */
public class AddAttendeeRequest extends Request {
    @Header
    @NameInMap("AccountContext")
    private AccountContext accountContext;

    @Body
    @NameInMap("AttendeesToAdd")
    @Validation(required = true)
    private java.util.List < AttendeesToAdd> attendeesToAdd;

    @Body
    @NameInMap("CalendarId")
    @Validation(required = true)
    private String calendarId;

    @Body
    @NameInMap("EventId")
    @Validation(required = true)
    private String eventId;

    @Body
    @NameInMap("chatNotification")
    private Boolean chatNotification;

    @Body
    @NameInMap("pushNotification")
    private Boolean pushNotification;

    private AddAttendeeRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.attendeesToAdd = builder.attendeesToAdd;
        this.calendarId = builder.calendarId;
        this.eventId = builder.eventId;
        this.chatNotification = builder.chatNotification;
        this.pushNotification = builder.pushNotification;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddAttendeeRequest create() {
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
     * @return attendeesToAdd
     */
    public java.util.List < AttendeesToAdd> getAttendeesToAdd() {
        return this.attendeesToAdd;
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
     * @return chatNotification
     */
    public Boolean getChatNotification() {
        return this.chatNotification;
    }

    /**
     * @return pushNotification
     */
    public Boolean getPushNotification() {
        return this.pushNotification;
    }

    public static final class Builder extends Request.Builder<AddAttendeeRequest, Builder> {
        private AccountContext accountContext; 
        private java.util.List < AttendeesToAdd> attendeesToAdd; 
        private String calendarId; 
        private String eventId; 
        private Boolean chatNotification; 
        private Boolean pushNotification; 

        private Builder() {
            super();
        } 

        private Builder(AddAttendeeRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.attendeesToAdd = request.attendeesToAdd;
            this.calendarId = request.calendarId;
            this.eventId = request.eventId;
            this.chatNotification = request.chatNotification;
            this.pushNotification = request.pushNotification;
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
         * AttendeesToAdd.
         */
        public Builder attendeesToAdd(java.util.List < AttendeesToAdd> attendeesToAdd) {
            String attendeesToAddShrink = shrink(attendeesToAdd, "AttendeesToAdd", "json");
            this.putBodyParameter("AttendeesToAdd", attendeesToAddShrink);
            this.attendeesToAdd = attendeesToAdd;
            return this;
        }

        /**
         * CalendarId.
         */
        public Builder calendarId(String calendarId) {
            this.putBodyParameter("CalendarId", calendarId);
            this.calendarId = calendarId;
            return this;
        }

        /**
         * EventId.
         */
        public Builder eventId(String eventId) {
            this.putBodyParameter("EventId", eventId);
            this.eventId = eventId;
            return this;
        }

        /**
         * chatNotification.
         */
        public Builder chatNotification(Boolean chatNotification) {
            this.putBodyParameter("chatNotification", chatNotification);
            this.chatNotification = chatNotification;
            return this;
        }

        /**
         * pushNotification.
         */
        public Builder pushNotification(Boolean pushNotification) {
            this.putBodyParameter("pushNotification", pushNotification);
            this.pushNotification = pushNotification;
            return this;
        }

        @Override
        public AddAttendeeRequest build() {
            return new AddAttendeeRequest(this);
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
    public static class AttendeesToAdd extends TeaModel {
        @NameInMap("id")
        private String id;

        @NameInMap("isOptional")
        private Boolean isOptional;

        private AttendeesToAdd(Builder builder) {
            this.id = builder.id;
            this.isOptional = builder.isOptional;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttendeesToAdd create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return isOptional
         */
        public Boolean getIsOptional() {
            return this.isOptional;
        }

        public static final class Builder {
            private String id; 
            private Boolean isOptional; 

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * isOptional.
             */
            public Builder isOptional(Boolean isOptional) {
                this.isOptional = isOptional;
                return this;
            }

            public AttendeesToAdd build() {
                return new AttendeesToAdd(this);
            } 

        } 

    }
}
