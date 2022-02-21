// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateWatchTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateWatchTaskRequest</p>
 */
public class CreateWatchTaskRequest extends Request {
    @Body
    @NameInMap("CorpId")
    @Validation(required = true)
    private String corpId;

    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("DeviceList")
    private String deviceList;

    @Body
    @NameInMap("MessageReceiver")
    @Validation(required = true)
    private String messageReceiver;

    @Body
    @NameInMap("ScheduleCycleDates")
    private String scheduleCycleDates;

    @Body
    @NameInMap("ScheduleTimes")
    private String scheduleTimes;

    @Body
    @NameInMap("ScheduleType")
    @Validation(required = true)
    private String scheduleType;

    @Body
    @NameInMap("TaskName")
    private String taskName;

    @Body
    @NameInMap("WatchPolicyIds")
    @Validation(required = true)
    private String watchPolicyIds;

    private CreateWatchTaskRequest(Builder builder) {
        super(builder);
        this.corpId = builder.corpId;
        this.description = builder.description;
        this.deviceList = builder.deviceList;
        this.messageReceiver = builder.messageReceiver;
        this.scheduleCycleDates = builder.scheduleCycleDates;
        this.scheduleTimes = builder.scheduleTimes;
        this.scheduleType = builder.scheduleType;
        this.taskName = builder.taskName;
        this.watchPolicyIds = builder.watchPolicyIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWatchTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return corpId
     */
    public String getCorpId() {
        return this.corpId;
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

    public static final class Builder extends Request.Builder<CreateWatchTaskRequest, Builder> {
        private String corpId; 
        private String description; 
        private String deviceList; 
        private String messageReceiver; 
        private String scheduleCycleDates; 
        private String scheduleTimes; 
        private String scheduleType; 
        private String taskName; 
        private String watchPolicyIds; 

        private Builder() {
            super();
        } 

        private Builder(CreateWatchTaskRequest response) {
            super(response);
            this.corpId = response.corpId;
            this.description = response.description;
            this.deviceList = response.deviceList;
            this.messageReceiver = response.messageReceiver;
            this.scheduleCycleDates = response.scheduleCycleDates;
            this.scheduleTimes = response.scheduleTimes;
            this.scheduleType = response.scheduleType;
            this.taskName = response.taskName;
            this.watchPolicyIds = response.watchPolicyIds;
        } 

        /**
         * CorpId.
         */
        public Builder corpId(String corpId) {
            this.putBodyParameter("CorpId", corpId);
            this.corpId = corpId;
            return this;
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

        @Override
        public CreateWatchTaskRequest build() {
            return new CreateWatchTaskRequest(this);
        } 

    } 

}
