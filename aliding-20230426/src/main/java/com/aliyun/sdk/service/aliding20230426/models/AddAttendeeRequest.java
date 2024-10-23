// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddAttendeeRequest} extends {@link RequestModel}
 *
 * <p>AddAttendeeRequest</p>
 */
public class AddAttendeeRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AttendeesToAdd")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < AttendeesToAdd> attendeesToAdd;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CalendarId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String calendarId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EventId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eventId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("chatNotification")
    private Boolean chatNotification;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pushNotification")
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
         * <p>This parameter is required.</p>
         */
        public Builder attendeesToAdd(java.util.List < AttendeesToAdd> attendeesToAdd) {
            String attendeesToAddShrink = shrink(attendeesToAdd, "AttendeesToAdd", "json");
            this.putBodyParameter("AttendeesToAdd", attendeesToAddShrink);
            this.attendeesToAdd = attendeesToAdd;
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
         * <p>cnNTbW1YbU9sL2p6aFJZdEgvdlQrQT08</p>
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

    /**
     * 
     * {@link AddAttendeeRequest} extends {@link TeaModel}
     *
     * <p>AddAttendeeRequest</p>
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
    /**
     * 
     * {@link AddAttendeeRequest} extends {@link TeaModel}
     *
     * <p>AddAttendeeRequest</p>
     */
    public static class AttendeesToAdd extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("isOptional")
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
