// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMeetingRoomsScheduleRequest} extends {@link RequestModel}
 *
 * <p>GetMeetingRoomsScheduleRequest</p>
 */
public class GetMeetingRoomsScheduleRequest extends Request {
    @Header
    @NameInMap("AccountContext")
    private AccountContext accountContext;

    @Body
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Body
    @NameInMap("RoomIds")
    @Validation(required = true)
    private java.util.List < String > roomIds;

    @Body
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    private GetMeetingRoomsScheduleRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.endTime = builder.endTime;
        this.roomIds = builder.roomIds;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMeetingRoomsScheduleRequest create() {
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
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return roomIds
     */
    public java.util.List < String > getRoomIds() {
        return this.roomIds;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<GetMeetingRoomsScheduleRequest, Builder> {
        private AccountContext accountContext; 
        private String endTime; 
        private java.util.List < String > roomIds; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(GetMeetingRoomsScheduleRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.endTime = request.endTime;
            this.roomIds = request.roomIds;
            this.startTime = request.startTime;
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
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * RoomIds.
         */
        public Builder roomIds(java.util.List < String > roomIds) {
            String roomIdsShrink = shrink(roomIds, "RoomIds", "json");
            this.putBodyParameter("RoomIds", roomIdsShrink);
            this.roomIds = roomIds;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public GetMeetingRoomsScheduleRequest build() {
            return new GetMeetingRoomsScheduleRequest(this);
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
