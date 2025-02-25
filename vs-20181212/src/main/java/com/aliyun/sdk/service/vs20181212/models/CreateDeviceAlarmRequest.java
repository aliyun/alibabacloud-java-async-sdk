// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link CreateDeviceAlarmRequest} extends {@link RequestModel}
 *
 * <p>CreateDeviceAlarmRequest</p>
 */
public class CreateDeviceAlarmRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Alarm")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer alarm;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer channelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Expire")
    private Long expire;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObjectType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer objectType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubAlarm")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(CreateDeviceAlarmRequest request) {
            super(request);
            this.alarm = request.alarm;
            this.channelId = request.channelId;
            this.endTime = request.endTime;
            this.expire = request.expire;
            this.id = request.id;
            this.objectType = request.objectType;
            this.ownerId = request.ownerId;
            this.startTime = request.startTime;
            this.subAlarm = request.subAlarm;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder alarm(Integer alarm) {
            this.putQueryParameter("Alarm", alarm);
            this.alarm = alarm;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder channelId(Integer channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1632314789000</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>348*****380-cn-qingdao</p>
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1632121707000</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
