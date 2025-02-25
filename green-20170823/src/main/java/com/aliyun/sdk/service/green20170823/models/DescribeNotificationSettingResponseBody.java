// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNotificationSettingResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNotificationSettingResponseBody</p>
 */
public class DescribeNotificationSettingResponseBody extends TeaModel {
    @NameInMap("Email")
    private String email;

    @NameInMap("Phone")
    private String phone;

    @NameInMap("RealtimeMessageList")
    private java.util.List < String > realtimeMessageList;

    @NameInMap("ReminderModeList")
    private java.util.List < String > reminderModeList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ScheduleMessageTime")
    private Integer scheduleMessageTime;

    @NameInMap("ScheduleMessageTimeZone")
    private Integer scheduleMessageTimeZone;

    private DescribeNotificationSettingResponseBody(Builder builder) {
        this.email = builder.email;
        this.phone = builder.phone;
        this.realtimeMessageList = builder.realtimeMessageList;
        this.reminderModeList = builder.reminderModeList;
        this.requestId = builder.requestId;
        this.scheduleMessageTime = builder.scheduleMessageTime;
        this.scheduleMessageTimeZone = builder.scheduleMessageTimeZone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNotificationSettingResponseBody create() {
        return builder().build();
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * @return realtimeMessageList
     */
    public java.util.List < String > getRealtimeMessageList() {
        return this.realtimeMessageList;
    }

    /**
     * @return reminderModeList
     */
    public java.util.List < String > getReminderModeList() {
        return this.reminderModeList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scheduleMessageTime
     */
    public Integer getScheduleMessageTime() {
        return this.scheduleMessageTime;
    }

    /**
     * @return scheduleMessageTimeZone
     */
    public Integer getScheduleMessageTimeZone() {
        return this.scheduleMessageTimeZone;
    }

    public static final class Builder {
        private String email; 
        private String phone; 
        private java.util.List < String > realtimeMessageList; 
        private java.util.List < String > reminderModeList; 
        private String requestId; 
        private Integer scheduleMessageTime; 
        private Integer scheduleMessageTimeZone; 

        /**
         * Email.
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * Phone.
         */
        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        /**
         * RealtimeMessageList.
         */
        public Builder realtimeMessageList(java.util.List < String > realtimeMessageList) {
            this.realtimeMessageList = realtimeMessageList;
            return this;
        }

        /**
         * ReminderModeList.
         */
        public Builder reminderModeList(java.util.List < String > reminderModeList) {
            this.reminderModeList = reminderModeList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ScheduleMessageTime.
         */
        public Builder scheduleMessageTime(Integer scheduleMessageTime) {
            this.scheduleMessageTime = scheduleMessageTime;
            return this;
        }

        /**
         * ScheduleMessageTimeZone.
         */
        public Builder scheduleMessageTimeZone(Integer scheduleMessageTimeZone) {
            this.scheduleMessageTimeZone = scheduleMessageTimeZone;
            return this;
        }

        public DescribeNotificationSettingResponseBody build() {
            return new DescribeNotificationSettingResponseBody(this);
        } 

    } 

}
