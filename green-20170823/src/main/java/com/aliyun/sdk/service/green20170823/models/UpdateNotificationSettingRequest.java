// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateNotificationSettingRequest} extends {@link RequestModel}
 *
 * <p>UpdateNotificationSettingRequest</p>
 */
public class UpdateNotificationSettingRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("RealtimeMessageList")
    private String realtimeMessageList;

    @Query
    @NameInMap("ReminderModeList")
    @Validation(required = true)
    private String reminderModeList;

    @Query
    @NameInMap("ScheduleMessageTime")
    @Validation(required = true)
    private Integer scheduleMessageTime;

    @Query
    @NameInMap("ScheduleMessageTimeZone")
    @Validation(required = true)
    private Integer scheduleMessageTimeZone;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private UpdateNotificationSettingRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.realtimeMessageList = builder.realtimeMessageList;
        this.reminderModeList = builder.reminderModeList;
        this.scheduleMessageTime = builder.scheduleMessageTime;
        this.scheduleMessageTimeZone = builder.scheduleMessageTimeZone;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateNotificationSettingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return realtimeMessageList
     */
    public String getRealtimeMessageList() {
        return this.realtimeMessageList;
    }

    /**
     * @return reminderModeList
     */
    public String getReminderModeList() {
        return this.reminderModeList;
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

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<UpdateNotificationSettingRequest, Builder> {
        private String lang; 
        private String realtimeMessageList; 
        private String reminderModeList; 
        private Integer scheduleMessageTime; 
        private Integer scheduleMessageTimeZone; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(UpdateNotificationSettingRequest request) {
            super(request);
            this.lang = request.lang;
            this.realtimeMessageList = request.realtimeMessageList;
            this.reminderModeList = request.reminderModeList;
            this.scheduleMessageTime = request.scheduleMessageTime;
            this.scheduleMessageTimeZone = request.scheduleMessageTimeZone;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * RealtimeMessageList.
         */
        public Builder realtimeMessageList(String realtimeMessageList) {
            this.putQueryParameter("RealtimeMessageList", realtimeMessageList);
            this.realtimeMessageList = realtimeMessageList;
            return this;
        }

        /**
         * ReminderModeList.
         */
        public Builder reminderModeList(String reminderModeList) {
            this.putQueryParameter("ReminderModeList", reminderModeList);
            this.reminderModeList = reminderModeList;
            return this;
        }

        /**
         * ScheduleMessageTime.
         */
        public Builder scheduleMessageTime(Integer scheduleMessageTime) {
            this.putQueryParameter("ScheduleMessageTime", scheduleMessageTime);
            this.scheduleMessageTime = scheduleMessageTime;
            return this;
        }

        /**
         * ScheduleMessageTimeZone.
         */
        public Builder scheduleMessageTimeZone(Integer scheduleMessageTimeZone) {
            this.putQueryParameter("ScheduleMessageTimeZone", scheduleMessageTimeZone);
            this.scheduleMessageTimeZone = scheduleMessageTimeZone;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public UpdateNotificationSettingRequest build() {
            return new UpdateNotificationSettingRequest(this);
        } 

    } 

}
