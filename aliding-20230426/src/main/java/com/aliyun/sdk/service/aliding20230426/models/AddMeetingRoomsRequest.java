// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddMeetingRoomsRequest} extends {@link RequestModel}
 *
 * <p>AddMeetingRoomsRequest</p>
 */
public class AddMeetingRoomsRequest extends Request {
    @Header
    @NameInMap("AccountContext")
    private AccountContext accountContext;

    @Body
    @NameInMap("CalendarId")
    @Validation(required = true)
    private String calendarId;

    @Body
    @NameInMap("EventId")
    @Validation(required = true)
    private String eventId;

    @Body
    @NameInMap("MeetingRoomsToAdd")
    @Validation(required = true)
    private java.util.List < MeetingRoomsToAdd> meetingRoomsToAdd;

    private AddMeetingRoomsRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.calendarId = builder.calendarId;
        this.eventId = builder.eventId;
        this.meetingRoomsToAdd = builder.meetingRoomsToAdd;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddMeetingRoomsRequest create() {
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
     * @return meetingRoomsToAdd
     */
    public java.util.List < MeetingRoomsToAdd> getMeetingRoomsToAdd() {
        return this.meetingRoomsToAdd;
    }

    public static final class Builder extends Request.Builder<AddMeetingRoomsRequest, Builder> {
        private AccountContext accountContext; 
        private String calendarId; 
        private String eventId; 
        private java.util.List < MeetingRoomsToAdd> meetingRoomsToAdd; 

        private Builder() {
            super();
        } 

        private Builder(AddMeetingRoomsRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.calendarId = request.calendarId;
            this.eventId = request.eventId;
            this.meetingRoomsToAdd = request.meetingRoomsToAdd;
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
         * MeetingRoomsToAdd.
         */
        public Builder meetingRoomsToAdd(java.util.List < MeetingRoomsToAdd> meetingRoomsToAdd) {
            String meetingRoomsToAddShrink = shrink(meetingRoomsToAdd, "MeetingRoomsToAdd", "json");
            this.putBodyParameter("MeetingRoomsToAdd", meetingRoomsToAddShrink);
            this.meetingRoomsToAdd = meetingRoomsToAdd;
            return this;
        }

        @Override
        public AddMeetingRoomsRequest build() {
            return new AddMeetingRoomsRequest(this);
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
    public static class MeetingRoomsToAdd extends TeaModel {
        @NameInMap("RoomId")
        private String roomId;

        private MeetingRoomsToAdd(Builder builder) {
            this.roomId = builder.roomId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MeetingRoomsToAdd create() {
            return builder().build();
        }

        /**
         * @return roomId
         */
        public String getRoomId() {
            return this.roomId;
        }

        public static final class Builder {
            private String roomId; 

            /**
             * RoomId.
             */
            public Builder roomId(String roomId) {
                this.roomId = roomId;
                return this;
            }

            public MeetingRoomsToAdd build() {
                return new MeetingRoomsToAdd(this);
            } 

        } 

    }
}
