// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RemoveMeetingRoomsRequest} extends {@link RequestModel}
 *
 * <p>RemoveMeetingRoomsRequest</p>
 */
public class RemoveMeetingRoomsRequest extends Request {
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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MeetingRoomsToRemove")
    private java.util.List < MeetingRoomsToRemove> meetingRoomsToRemove;

    private RemoveMeetingRoomsRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.calendarId = builder.calendarId;
        this.eventId = builder.eventId;
        this.meetingRoomsToRemove = builder.meetingRoomsToRemove;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveMeetingRoomsRequest create() {
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
     * @return meetingRoomsToRemove
     */
    public java.util.List < MeetingRoomsToRemove> getMeetingRoomsToRemove() {
        return this.meetingRoomsToRemove;
    }

    public static final class Builder extends Request.Builder<RemoveMeetingRoomsRequest, Builder> {
        private AccountContext accountContext; 
        private String calendarId; 
        private String eventId; 
        private java.util.List < MeetingRoomsToRemove> meetingRoomsToRemove; 

        private Builder() {
            super();
        } 

        private Builder(RemoveMeetingRoomsRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.calendarId = request.calendarId;
            this.eventId = request.eventId;
            this.meetingRoomsToRemove = request.meetingRoomsToRemove;
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
         * <p>U5Kxxxxx</p>
         */
        public Builder eventId(String eventId) {
            this.putBodyParameter("EventId", eventId);
            this.eventId = eventId;
            return this;
        }

        /**
         * MeetingRoomsToRemove.
         */
        public Builder meetingRoomsToRemove(java.util.List < MeetingRoomsToRemove> meetingRoomsToRemove) {
            String meetingRoomsToRemoveShrink = shrink(meetingRoomsToRemove, "MeetingRoomsToRemove", "json");
            this.putBodyParameter("MeetingRoomsToRemove", meetingRoomsToRemoveShrink);
            this.meetingRoomsToRemove = meetingRoomsToRemove;
            return this;
        }

        @Override
        public RemoveMeetingRoomsRequest build() {
            return new RemoveMeetingRoomsRequest(this);
        } 

    } 

    /**
     * 
     * {@link RemoveMeetingRoomsRequest} extends {@link TeaModel}
     *
     * <p>RemoveMeetingRoomsRequest</p>
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
     * {@link RemoveMeetingRoomsRequest} extends {@link TeaModel}
     *
     * <p>RemoveMeetingRoomsRequest</p>
     */
    public static class MeetingRoomsToRemove extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RoomId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String roomId;

        private MeetingRoomsToRemove(Builder builder) {
            this.roomId = builder.roomId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MeetingRoomsToRemove create() {
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>U5Kxxxxx</p>
             */
            public Builder roomId(String roomId) {
                this.roomId = roomId;
                return this;
            }

            public MeetingRoomsToRemove build() {
                return new MeetingRoomsToRemove(this);
            } 

        } 

    }
}
