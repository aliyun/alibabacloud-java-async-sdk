// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDeviceAlarmRequest} extends {@link RequestModel}
 *
 * <p>CreateDeviceAlarmRequest</p>
 */
public class CreateDeviceAlarmRequest extends Request {
    @Query
    @NameInMap("Alarm")
    @Validation(required = true)
    private Integer alarm;

    @Query
    @NameInMap("ChannelId")
    @Validation(required = true)
    private Integer channelId;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private Long endTime;

    @Query
    @NameInMap("Expire")
    private Long expire;

    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    @Query
    @NameInMap("ObjectType")
    @Validation(required = true)
    private Integer objectType;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private Long startTime;

    @Query
    @NameInMap("SubAlarm")
    @Validation(required = true)
    private Integer subAlarm;

    private CreateDeviceAlarmRequest(Builder builder) {
        super(builder);
        this.alarm = builder.alarm;
        this.channelId = builder.channelId;
        this.endTime = builder.endTime;
        this.expire = builder.expire;
        this.id = builder.id;
        this.objectType = builder.objectType;
        this.ownerId = builder.ownerId;
        this.startTime = builder.startTime;
        this.subAlarm = builder.subAlarm;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDeviceAlarmRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alarm
     */
    public Integer getAlarm() {
        return this.alarm;
    }

    /**
     * @return channelId
     */
    public Integer getChannelId() {
        return this.channelId;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return expire
     */
    public Long getExpire() {
        return this.expire;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return objectType
     */
    public Integer getObjectType() {
        return this.objectType;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return subAlarm
     */
    public Integer getSubAlarm() {
        return this.subAlarm;
    }

    public static final class Builder extends Request.Builder<CreateDeviceAlarmRequest, Builder> {
        private Integer alarm; 
        private Integer channelId; 
        private Long endTime; 
        private Long expire; 
        private String id; 
        private Integer objectType; 
        private Long ownerId; 
        private Long startTime; 
        private Integer subAlarm; 

        private Builder() {
            super();
        } 

        private Builder(CreateDeviceAlarmRequest response) {
            super(response);
            this.alarm = response.alarm;
            this.channelId = response.channelId;
            this.endTime = response.endTime;
            this.expire = response.expire;
            this.id = response.id;
            this.objectType = response.objectType;
            this.ownerId = response.ownerId;
            this.startTime = response.startTime;
            this.subAlarm = response.subAlarm;
        } 

        /**
         * Alarm.
         */
        public Builder alarm(Integer alarm) {
            this.putQueryParameter("Alarm", alarm);
            this.alarm = alarm;
            return this;
        }

        /**
         * ChannelId.
         */
        public Builder channelId(Integer channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Expire.
         */
        public Builder expire(Long expire) {
            this.putQueryParameter("Expire", expire);
            this.expire = expire;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * ObjectType.
         */
        public Builder objectType(Integer objectType) {
            this.putQueryParameter("ObjectType", objectType);
            this.objectType = objectType;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * SubAlarm.
         */
        public Builder subAlarm(Integer subAlarm) {
            this.putQueryParameter("SubAlarm", subAlarm);
            this.subAlarm = subAlarm;
            return this;
        }

        @Override
        public CreateDeviceAlarmRequest build() {
            return new CreateDeviceAlarmRequest(this);
        } 

    } 

}
