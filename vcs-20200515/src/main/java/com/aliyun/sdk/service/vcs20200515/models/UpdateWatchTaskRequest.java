// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateWatchTaskRequest} extends {@link RequestModel}
 *
 * <p>UpdateWatchTaskRequest</p>
 */
public class UpdateWatchTaskRequest extends Request {
    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("DeviceList")
    private String deviceList;

    @Body
    @NameInMap("MessageReceiver")
    private String messageReceiver;

    @Body
    @NameInMap("ScheduleCycleDates")
    private String scheduleCycleDates;

    @Body
    @NameInMap("ScheduleTimes")
    private String scheduleTimes;

    @Body
    @NameInMap("ScheduleType")
    private String scheduleType;

    @Body
    @NameInMap("TaskName")
    private String taskName;

    @Body
    @NameInMap("WatchPolicyIds")
    private String watchPolicyIds;

    @Body
    @NameInMap("WatchTaskId")
    @Validation(required = true)
    private String watchTaskId;

    private UpdateWatchTaskRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.deviceList = builder.deviceList;
        this.messageReceiver = builder.messageReceiver;
        this.scheduleCycleDates = builder.scheduleCycleDates;
        this.scheduleTimes = builder.scheduleTimes;
        this.scheduleType = builder.scheduleType;
        this.taskName = builder.taskName;
        this.watchPolicyIds = builder.watchPolicyIds;
        this.watchTaskId = builder.watchTaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWatchTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return deviceList
     */
    public String getDeviceList() {
        return this.deviceList;
    }

    /**
     * @return messageReceiver
     */
    public String getMessageReceiver() {
        return this.messageReceiver;
    }

    /**
     * @return scheduleCycleDates
     */
    public String getScheduleCycleDates() {
        return this.scheduleCycleDates;
    }

    /**
     * @return scheduleTimes
     */
    public String getScheduleTimes() {
        return this.scheduleTimes;
    }

    /**
     * @return scheduleType
     */
    public String getScheduleType() {
        return this.scheduleType;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return watchPolicyIds
     */
    public String getWatchPolicyIds() {
        return this.watchPolicyIds;
    }

    /**
     * @return watchTaskId
     */
    public String getWatchTaskId() {
        return this.watchTaskId;
    }

    public static final class Builder extends Request.Builder<UpdateWatchTaskRequest, Builder> {
        private String description; 
        private String deviceList; 
        private String messageReceiver; 
        private String scheduleCycleDates; 
        private String scheduleTimes; 
        private String scheduleType; 
        private String taskName; 
        private String watchPolicyIds; 
        private String watchTaskId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWatchTaskRequest response) {
            super(response);
            this.description = response.description;
            this.deviceList = response.deviceList;
            this.messageReceiver = response.messageReceiver;
            this.scheduleCycleDates = response.scheduleCycleDates;
            this.scheduleTimes = response.scheduleTimes;
            this.scheduleType = response.scheduleType;
            this.taskName = response.taskName;
            this.watchPolicyIds = response.watchPolicyIds;
            this.watchTaskId = response.watchTaskId;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * DeviceList.
         */
        public Builder deviceList(String deviceList) {
            this.putBodyParameter("DeviceList", deviceList);
            this.deviceList = deviceList;
            return this;
        }

        /**
         * MessageReceiver.
         */
        public Builder messageReceiver(String messageReceiver) {
            this.putBodyParameter("MessageReceiver", messageReceiver);
            this.messageReceiver = messageReceiver;
            return this;
        }

        /**
         * ScheduleCycleDates.
         */
        public Builder scheduleCycleDates(String scheduleCycleDates) {
            this.putBodyParameter("ScheduleCycleDates", scheduleCycleDates);
            this.scheduleCycleDates = scheduleCycleDates;
            return this;
        }

        /**
         * ScheduleTimes.
         */
        public Builder scheduleTimes(String scheduleTimes) {
            this.putBodyParameter("ScheduleTimes", scheduleTimes);
            this.scheduleTimes = scheduleTimes;
            return this;
        }

        /**
         * ScheduleType.
         */
        public Builder scheduleType(String scheduleType) {
            this.putBodyParameter("ScheduleType", scheduleType);
            this.scheduleType = scheduleType;
            return this;
        }

        /**
         * TaskName.
         */
        public Builder taskName(String taskName) {
            this.putBodyParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * WatchPolicyIds.
         */
        public Builder watchPolicyIds(String watchPolicyIds) {
            this.putBodyParameter("WatchPolicyIds", watchPolicyIds);
            this.watchPolicyIds = watchPolicyIds;
            return this;
        }

        /**
         * WatchTaskId.
         */
        public Builder watchTaskId(String watchTaskId) {
            this.putBodyParameter("WatchTaskId", watchTaskId);
            this.watchTaskId = watchTaskId;
            return this;
        }

        @Override
        public UpdateWatchTaskRequest build() {
            return new UpdateWatchTaskRequest(this);
        } 

    } 

}
