// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Event} extends {@link TeaModel}
 *
 * <p>Event</p>
 */
public class Event extends TeaModel {
    @NameInMap("AlarmStatus")
    private String alarmStatus;

    @NameInMap("Count")
    private Long count;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("DeviceId")
    private String deviceId;

    @NameInMap("EventName")
    private String eventName;

    @NameInMap("EventObject")
    private String eventObject;

    @NameInMap("EventObjectId")
    private String eventObjectId;

    @NameInMap("EventType")
    private String eventType;

    @NameInMap("Message")
    private String message;

    @NameInMap("ResourceDevice")
    private ResourceDevice resourceDevice;

    @NameInMap("TemplateId")
    private String templateId;

    @NameInMap("UpdateTime")
    private String updateTime;

    private Event(Builder builder) {
        this.alarmStatus = builder.alarmStatus;
        this.count = builder.count;
        this.createTime = builder.createTime;
        this.deviceId = builder.deviceId;
        this.eventName = builder.eventName;
        this.eventObject = builder.eventObject;
        this.eventObjectId = builder.eventObjectId;
        this.eventType = builder.eventType;
        this.message = builder.message;
        this.resourceDevice = builder.resourceDevice;
        this.templateId = builder.templateId;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Event create() {
        return builder().build();
    }

    /**
     * @return alarmStatus
     */
    public String getAlarmStatus() {
        return this.alarmStatus;
    }

    /**
     * @return count
     */
    public Long getCount() {
        return this.count;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return eventName
     */
    public String getEventName() {
        return this.eventName;
    }

    /**
     * @return eventObject
     */
    public String getEventObject() {
        return this.eventObject;
    }

    /**
     * @return eventObjectId
     */
    public String getEventObjectId() {
        return this.eventObjectId;
    }

    /**
     * @return eventType
     */
    public String getEventType() {
        return this.eventType;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return resourceDevice
     */
    public ResourceDevice getResourceDevice() {
        return this.resourceDevice;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private String alarmStatus; 
        private Long count; 
        private String createTime; 
        private String deviceId; 
        private String eventName; 
        private String eventObject; 
        private String eventObjectId; 
        private String eventType; 
        private String message; 
        private ResourceDevice resourceDevice; 
        private String templateId; 
        private String updateTime; 

        /**
         * AlarmStatus.
         */
        public Builder alarmStatus(String alarmStatus) {
            this.alarmStatus = alarmStatus;
            return this;
        }

        /**
         * Count.
         */
        public Builder count(Long count) {
            this.count = count;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * DeviceId.
         */
        public Builder deviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        /**
         * EventName.
         */
        public Builder eventName(String eventName) {
            this.eventName = eventName;
            return this;
        }

        /**
         * EventObject.
         */
        public Builder eventObject(String eventObject) {
            this.eventObject = eventObject;
            return this;
        }

        /**
         * EventObjectId.
         */
        public Builder eventObjectId(String eventObjectId) {
            this.eventObjectId = eventObjectId;
            return this;
        }

        /**
         * EventType.
         */
        public Builder eventType(String eventType) {
            this.eventType = eventType;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * ResourceDevice.
         */
        public Builder resourceDevice(ResourceDevice resourceDevice) {
            this.resourceDevice = resourceDevice;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }

        /**
         * UpdateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public Event build() {
            return new Event(this);
        } 

    } 

    public static class ResourceDevice extends TeaModel {
        @NameInMap("HostName")
        private String hostName;

        @NameInMap("PhysicalSpace")
        private String physicalSpace;

        private ResourceDevice(Builder builder) {
            this.hostName = builder.hostName;
            this.physicalSpace = builder.physicalSpace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceDevice create() {
            return builder().build();
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return physicalSpace
         */
        public String getPhysicalSpace() {
            return this.physicalSpace;
        }

        public static final class Builder {
            private String hostName; 
            private String physicalSpace; 

            /**
             * HostName.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * PhysicalSpace.
             */
            public Builder physicalSpace(String physicalSpace) {
                this.physicalSpace = physicalSpace;
                return this;
            }

            public ResourceDevice build() {
                return new ResourceDevice(this);
            } 

        } 

    }
}
