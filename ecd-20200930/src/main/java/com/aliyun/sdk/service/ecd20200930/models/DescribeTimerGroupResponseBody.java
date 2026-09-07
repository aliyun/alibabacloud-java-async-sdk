// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DescribeTimerGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTimerGroupResponseBody</p>
 */
public class DescribeTimerGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeTimerGroupResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTimerGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeTimerGroupResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The configuration group information.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeTimerGroupResponseBody build() {
            return new DescribeTimerGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTimerGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTimerGroupResponseBody</p>
     */
    public static class SegmentTimers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppointmentTimer")
        private Long appointmentTimer;

        @com.aliyun.core.annotation.NameInMap("CreateSnapshot")
        private Boolean createSnapshot;

        @com.aliyun.core.annotation.NameInMap("EndCronExpression")
        private String endCronExpression;

        @com.aliyun.core.annotation.NameInMap("Enforce")
        private Boolean enforce;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("Interval")
        private Integer interval;

        @com.aliyun.core.annotation.NameInMap("IpSegments")
        private java.util.List<String> ipSegments;

        @com.aliyun.core.annotation.NameInMap("LockScreenTime")
        private Integer lockScreenTime;

        @com.aliyun.core.annotation.NameInMap("NotificationTime")
        private Integer notificationTime;

        @com.aliyun.core.annotation.NameInMap("OperationType")
        private String operationType;

        @com.aliyun.core.annotation.NameInMap("PatchId")
        private String patchId;

        @com.aliyun.core.annotation.NameInMap("ProcessWhitelist")
        private java.util.List<String> processWhitelist;

        @com.aliyun.core.annotation.NameInMap("ResetType")
        private String resetType;

        @com.aliyun.core.annotation.NameInMap("StartCronExpression")
        private String startCronExpression;

        @com.aliyun.core.annotation.NameInMap("TimerOrder")
        private Integer timerOrder;

        @com.aliyun.core.annotation.NameInMap("Timezone")
        private String timezone;

        @com.aliyun.core.annotation.NameInMap("TriggerType")
        private String triggerType;

        @com.aliyun.core.annotation.NameInMap("VerificationNotificationTime")
        private Integer verificationNotificationTime;

        @com.aliyun.core.annotation.NameInMap("VerificationTime")
        private Integer verificationTime;

        private SegmentTimers(Builder builder) {
            this.appointmentTimer = builder.appointmentTimer;
            this.createSnapshot = builder.createSnapshot;
            this.endCronExpression = builder.endCronExpression;
            this.enforce = builder.enforce;
            this.imageId = builder.imageId;
            this.interval = builder.interval;
            this.ipSegments = builder.ipSegments;
            this.lockScreenTime = builder.lockScreenTime;
            this.notificationTime = builder.notificationTime;
            this.operationType = builder.operationType;
            this.patchId = builder.patchId;
            this.processWhitelist = builder.processWhitelist;
            this.resetType = builder.resetType;
            this.startCronExpression = builder.startCronExpression;
            this.timerOrder = builder.timerOrder;
            this.timezone = builder.timezone;
            this.triggerType = builder.triggerType;
            this.verificationNotificationTime = builder.verificationNotificationTime;
            this.verificationTime = builder.verificationTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SegmentTimers create() {
            return builder().build();
        }

        /**
         * @return appointmentTimer
         */
        public Long getAppointmentTimer() {
            return this.appointmentTimer;
        }

        /**
         * @return createSnapshot
         */
        public Boolean getCreateSnapshot() {
            return this.createSnapshot;
        }

        /**
         * @return endCronExpression
         */
        public String getEndCronExpression() {
            return this.endCronExpression;
        }

        /**
         * @return enforce
         */
        public Boolean getEnforce() {
            return this.enforce;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return interval
         */
        public Integer getInterval() {
            return this.interval;
        }

        /**
         * @return ipSegments
         */
        public java.util.List<String> getIpSegments() {
            return this.ipSegments;
        }

        /**
         * @return lockScreenTime
         */
        public Integer getLockScreenTime() {
            return this.lockScreenTime;
        }

        /**
         * @return notificationTime
         */
        public Integer getNotificationTime() {
            return this.notificationTime;
        }

        /**
         * @return operationType
         */
        public String getOperationType() {
            return this.operationType;
        }

        /**
         * @return patchId
         */
        public String getPatchId() {
            return this.patchId;
        }

        /**
         * @return processWhitelist
         */
        public java.util.List<String> getProcessWhitelist() {
            return this.processWhitelist;
        }

        /**
         * @return resetType
         */
        public String getResetType() {
            return this.resetType;
        }

        /**
         * @return startCronExpression
         */
        public String getStartCronExpression() {
            return this.startCronExpression;
        }

        /**
         * @return timerOrder
         */
        public Integer getTimerOrder() {
            return this.timerOrder;
        }

        /**
         * @return timezone
         */
        public String getTimezone() {
            return this.timezone;
        }

        /**
         * @return triggerType
         */
        public String getTriggerType() {
            return this.triggerType;
        }

        /**
         * @return verificationNotificationTime
         */
        public Integer getVerificationNotificationTime() {
            return this.verificationNotificationTime;
        }

        /**
         * @return verificationTime
         */
        public Integer getVerificationTime() {
            return this.verificationTime;
        }

        public static final class Builder {
            private Long appointmentTimer; 
            private Boolean createSnapshot; 
            private String endCronExpression; 
            private Boolean enforce; 
            private String imageId; 
            private Integer interval; 
            private java.util.List<String> ipSegments; 
            private Integer lockScreenTime; 
            private Integer notificationTime; 
            private String operationType; 
            private String patchId; 
            private java.util.List<String> processWhitelist; 
            private String resetType; 
            private String startCronExpression; 
            private Integer timerOrder; 
            private String timezone; 
            private String triggerType; 
            private Integer verificationNotificationTime; 
            private Integer verificationTime; 

            private Builder() {
            } 

            private Builder(SegmentTimers model) {
                this.appointmentTimer = model.appointmentTimer;
                this.createSnapshot = model.createSnapshot;
                this.endCronExpression = model.endCronExpression;
                this.enforce = model.enforce;
                this.imageId = model.imageId;
                this.interval = model.interval;
                this.ipSegments = model.ipSegments;
                this.lockScreenTime = model.lockScreenTime;
                this.notificationTime = model.notificationTime;
                this.operationType = model.operationType;
                this.patchId = model.patchId;
                this.processWhitelist = model.processWhitelist;
                this.resetType = model.resetType;
                this.startCronExpression = model.startCronExpression;
                this.timerOrder = model.timerOrder;
                this.timezone = model.timezone;
                this.triggerType = model.triggerType;
                this.verificationNotificationTime = model.verificationNotificationTime;
                this.verificationTime = model.verificationTime;
            } 

            /**
             * <p>The appointment timer used for executing scheduled tasks at specified time points. After this parameter is specified, the scheduled task is executed at the specified time points.</p>
             * 
             * <strong>example:</strong>
             * <p>1764660600967</p>
             */
            public Builder appointmentTimer(Long appointmentTimer) {
                this.appointmentTimer = appointmentTimer;
                return this;
            }

            /**
             * <p>Specifies whether to create a snapshot.</p>
             */
            public Builder createSnapshot(Boolean createSnapshot) {
                this.createSnapshot = createSnapshot;
                return this;
            }

            /**
             * <p>The cron expression for the end time of the scheduled task.</p>
             * 
             * <strong>example:</strong>
             * <p>0 0 18 ? * 1-5</p>
             */
            public Builder endCronExpression(String endCronExpression) {
                this.endCronExpression = endCronExpression;
                return this;
            }

            /**
             * <p>Specifies whether to forcefully execute the task. A value of true indicates that the desktop and connection status checks are ignored and the scheduled task is forcefully executed.</p>
             */
            public Builder enforce(Boolean enforce) {
                this.enforce = enforce;
                return this;
            }

            /**
             * <p>The image ID specified for the image change scheduled task.</p>
             * 
             * <strong>example:</strong>
             * <p>m-5b0vjqbiqu010XXXXXX</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The time interval. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * <p>The list of effective IP CIDR blocks.</p>
             */
            public Builder ipSegments(java.util.List<String> ipSegments) {
                this.ipSegments = ipSegments;
                return this;
            }

            /**
             * <p>The duration of inactivity before the screen is locked, used by the no-operation lock screen feature. Unit: minutes. Only AD-joined cloud desktops are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder lockScreenTime(Integer lockScreenTime) {
                this.lockScreenTime = lockScreenTime;
                return this;
            }

            /**
             * <p>The advance notification time before the scheduled task is executed. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder notificationTime(Integer notificationTime) {
                this.notificationTime = notificationTime;
                return this;
            }

            /**
             * <p>The operation type of the scheduled task. Currently, only disconnect scheduled tasks are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>Shutdown</p>
             */
            public Builder operationType(String operationType) {
                this.operationType = operationType;
                return this;
            }

            /**
             * <p>The patch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>KB5082063</p>
             */
            public Builder patchId(String patchId) {
                this.patchId = patchId;
                return this;
            }

            /**
             * <p>The process whitelist for intelligent detection of no-operation scheduled tasks. If a specified process is running, the no-operation scheduled task is not triggered.</p>
             */
            public Builder processWhitelist(java.util.List<String> processWhitelist) {
                this.processWhitelist = processWhitelist;
                return this;
            }

            /**
             * <p>The reset type, which determines whether to reset and the scope of cloud disks to reset.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder resetType(String resetType) {
                this.resetType = resetType;
                return this;
            }

            /**
             * <p>The cron expression for the start time of the scheduled task.</p>
             * 
             * <strong>example:</strong>
             * <p>0 0 8 ? * 1-5</p>
             */
            public Builder startCronExpression(String startCronExpression) {
                this.startCronExpression = startCronExpression;
                return this;
            }

            /**
             * <p>The execution order number of the timer.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder timerOrder(Integer timerOrder) {
                this.timerOrder = timerOrder;
                return this;
            }

            /**
             * <p>The time zone used by the scheduled task.</p>
             * 
             * <strong>example:</strong>
             * <p>Asia/Shanghai</p>
             */
            public Builder timezone(String timezone) {
                this.timezone = timezone;
                return this;
            }

            /**
             * <p>The trigger configuration type of the no-operation scheduled task.</p>
             * 
             * <strong>example:</strong>
             * <p>Standard</p>
             */
            public Builder triggerType(String triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            /**
             * <p>The advance notification time before verification is executed. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder verificationNotificationTime(Integer verificationNotificationTime) {
                this.verificationNotificationTime = verificationNotificationTime;
                return this;
            }

            /**
             * <p>The verification wait duration. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>600</p>
             */
            public Builder verificationTime(Integer verificationTime) {
                this.verificationTime = verificationTime;
                return this;
            }

            public SegmentTimers build() {
                return new SegmentTimers(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeTimerGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTimerGroupResponseBody</p>
     */
    public static class ConfigTimers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowClientSetting")
        private Boolean allowClientSetting;

        @com.aliyun.core.annotation.NameInMap("CronExpression")
        private String cronExpression;

        @com.aliyun.core.annotation.NameInMap("Enforce")
        private Boolean enforce;

        @com.aliyun.core.annotation.NameInMap("Interval")
        private Integer interval;

        @com.aliyun.core.annotation.NameInMap("NotificationTime")
        private Integer notificationTime;

        @com.aliyun.core.annotation.NameInMap("OperationType")
        private String operationType;

        @com.aliyun.core.annotation.NameInMap("ProcessWhitelist")
        private java.util.List<String> processWhitelist;

        @com.aliyun.core.annotation.NameInMap("ResetType")
        private String resetType;

        @com.aliyun.core.annotation.NameInMap("SegmentTimers")
        private java.util.List<SegmentTimers> segmentTimers;

        @com.aliyun.core.annotation.NameInMap("TimerType")
        private String timerType;

        @com.aliyun.core.annotation.NameInMap("TriggerType")
        private String triggerType;

        private ConfigTimers(Builder builder) {
            this.allowClientSetting = builder.allowClientSetting;
            this.cronExpression = builder.cronExpression;
            this.enforce = builder.enforce;
            this.interval = builder.interval;
            this.notificationTime = builder.notificationTime;
            this.operationType = builder.operationType;
            this.processWhitelist = builder.processWhitelist;
            this.resetType = builder.resetType;
            this.segmentTimers = builder.segmentTimers;
            this.timerType = builder.timerType;
            this.triggerType = builder.triggerType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigTimers create() {
            return builder().build();
        }

        /**
         * @return allowClientSetting
         */
        public Boolean getAllowClientSetting() {
            return this.allowClientSetting;
        }

        /**
         * @return cronExpression
         */
        public String getCronExpression() {
            return this.cronExpression;
        }

        /**
         * @return enforce
         */
        public Boolean getEnforce() {
            return this.enforce;
        }

        /**
         * @return interval
         */
        public Integer getInterval() {
            return this.interval;
        }

        /**
         * @return notificationTime
         */
        public Integer getNotificationTime() {
            return this.notificationTime;
        }

        /**
         * @return operationType
         */
        public String getOperationType() {
            return this.operationType;
        }

        /**
         * @return processWhitelist
         */
        public java.util.List<String> getProcessWhitelist() {
            return this.processWhitelist;
        }

        /**
         * @return resetType
         */
        public String getResetType() {
            return this.resetType;
        }

        /**
         * @return segmentTimers
         */
        public java.util.List<SegmentTimers> getSegmentTimers() {
            return this.segmentTimers;
        }

        /**
         * @return timerType
         */
        public String getTimerType() {
            return this.timerType;
        }

        /**
         * @return triggerType
         */
        public String getTriggerType() {
            return this.triggerType;
        }

        public static final class Builder {
            private Boolean allowClientSetting; 
            private String cronExpression; 
            private Boolean enforce; 
            private Integer interval; 
            private Integer notificationTime; 
            private String operationType; 
            private java.util.List<String> processWhitelist; 
            private String resetType; 
            private java.util.List<SegmentTimers> segmentTimers; 
            private String timerType; 
            private String triggerType; 

            private Builder() {
            } 

            private Builder(ConfigTimers model) {
                this.allowClientSetting = model.allowClientSetting;
                this.cronExpression = model.cronExpression;
                this.enforce = model.enforce;
                this.interval = model.interval;
                this.notificationTime = model.notificationTime;
                this.operationType = model.operationType;
                this.processWhitelist = model.processWhitelist;
                this.resetType = model.resetType;
                this.segmentTimers = model.segmentTimers;
                this.timerType = model.timerType;
                this.triggerType = model.triggerType;
            } 

            /**
             * <p>Specifies whether end users are allowed to configure scheduled tasks on their own.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder allowClientSetting(Boolean allowClientSetting) {
                this.allowClientSetting = allowClientSetting;
                return this;
            }

            /**
             * <p>The cron expression of the scheduled task.</p>
             * 
             * <strong>example:</strong>
             * <p>0 0 16 ? * 1,2,3,4,5,6,7</p>
             */
            public Builder cronExpression(String cronExpression) {
                this.cronExpression = cronExpression;
                return this;
            }

            /**
             * <p>Specifies whether to forcefully execute the task. A value of true indicates that the desktop and connection status checks are ignored and the scheduled task is forcefully executed.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enforce(Boolean enforce) {
                this.enforce = enforce;
                return this;
            }

            /**
             * <p>The time interval. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * <p>The advance notification time before the scheduled task is executed. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder notificationTime(Integer notificationTime) {
                this.notificationTime = notificationTime;
                return this;
            }

            /**
             * <p>The type of the disconnect scheduled task.</p>
             * 
             * <strong>example:</strong>
             * <p>Shutdown</p>
             */
            public Builder operationType(String operationType) {
                this.operationType = operationType;
                return this;
            }

            /**
             * <p>The process whitelist for intelligent detection of no-operation scheduled tasks. If a specified process is running, the no-operation scheduled task is not triggered.</p>
             */
            public Builder processWhitelist(java.util.List<String> processWhitelist) {
                this.processWhitelist = processWhitelist;
                return this;
            }

            /**
             * <p>The reset type of the reset scheduled task.</p>
             * 
             * <strong>example:</strong>
             * <p>RESET_TYPE_SYSTEM</p>
             */
            public Builder resetType(String resetType) {
                this.resetType = resetType;
                return this;
            }

            /**
             * <p>The list of segment timer configurations.</p>
             */
            public Builder segmentTimers(java.util.List<SegmentTimers> segmentTimers) {
                this.segmentTimers = segmentTimers;
                return this;
            }

            /**
             * <p>The type of the scheduled task.</p>
             * 
             * <strong>example:</strong>
             * <p>TimerBoot</p>
             */
            public Builder timerType(String timerType) {
                this.timerType = timerType;
                return this;
            }

            /**
             * <p>The trigger configuration type of the no-operation scheduled task.</p>
             * 
             * <strong>example:</strong>
             * <p>Standard</p>
             */
            public Builder triggerType(String triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            public ConfigTimers build() {
                return new ConfigTimers(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeTimerGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTimerGroupResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindCount")
        private Integer bindCount;

        @com.aliyun.core.annotation.NameInMap("BindCountMap")
        private java.util.Map<String, Integer> bindCountMap;

        @com.aliyun.core.annotation.NameInMap("ConfigTimers")
        private java.util.List<ConfigTimers> configTimers;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("InnerTimerDesc")
        private String innerTimerDesc;

        @com.aliyun.core.annotation.NameInMap("InnerTimerName")
        private String innerTimerName;

        @com.aliyun.core.annotation.NameInMap("IsBind")
        private Boolean isBind;

        @com.aliyun.core.annotation.NameInMap("IsUpdate")
        private Boolean isUpdate;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ProductType")
        private String productType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Data(Builder builder) {
            this.bindCount = builder.bindCount;
            this.bindCountMap = builder.bindCountMap;
            this.configTimers = builder.configTimers;
            this.description = builder.description;
            this.groupId = builder.groupId;
            this.innerTimerDesc = builder.innerTimerDesc;
            this.innerTimerName = builder.innerTimerName;
            this.isBind = builder.isBind;
            this.isUpdate = builder.isUpdate;
            this.name = builder.name;
            this.productType = builder.productType;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bindCount
         */
        public Integer getBindCount() {
            return this.bindCount;
        }

        /**
         * @return bindCountMap
         */
        public java.util.Map<String, Integer> getBindCountMap() {
            return this.bindCountMap;
        }

        /**
         * @return configTimers
         */
        public java.util.List<ConfigTimers> getConfigTimers() {
            return this.configTimers;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return innerTimerDesc
         */
        public String getInnerTimerDesc() {
            return this.innerTimerDesc;
        }

        /**
         * @return innerTimerName
         */
        public String getInnerTimerName() {
            return this.innerTimerName;
        }

        /**
         * @return isBind
         */
        public Boolean getIsBind() {
            return this.isBind;
        }

        /**
         * @return isUpdate
         */
        public Boolean getIsUpdate() {
            return this.isUpdate;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return productType
         */
        public String getProductType() {
            return this.productType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer bindCount; 
            private java.util.Map<String, Integer> bindCountMap; 
            private java.util.List<ConfigTimers> configTimers; 
            private String description; 
            private String groupId; 
            private String innerTimerDesc; 
            private String innerTimerName; 
            private Boolean isBind; 
            private Boolean isUpdate; 
            private String name; 
            private String productType; 
            private String status; 
            private String type; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.bindCount = model.bindCount;
                this.bindCountMap = model.bindCountMap;
                this.configTimers = model.configTimers;
                this.description = model.description;
                this.groupId = model.groupId;
                this.innerTimerDesc = model.innerTimerDesc;
                this.innerTimerName = model.innerTimerName;
                this.isBind = model.isBind;
                this.isUpdate = model.isUpdate;
                this.name = model.name;
                this.productType = model.productType;
                this.status = model.status;
                this.type = model.type;
            } 

            /**
             * <p>The number of resources bound to the configuration group.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder bindCount(Integer bindCount) {
                this.bindCount = bindCount;
                return this;
            }

            /**
             * <p>The quantity information of resources bound to the configuration.</p>
             */
            public Builder bindCountMap(java.util.Map<String, Integer> bindCountMap) {
                this.bindCountMap = bindCountMap;
                return this;
            }

            /**
             * <p>The configuration information of scheduled tasks. This is a list structure.</p>
             */
            public Builder configTimers(java.util.List<ConfigTimers> configTimers) {
                this.configTimers = configTimers;
                return this;
            }

            /**
             * <p>The description of the configuration group.</p>
             * 
             * <strong>example:</strong>
             * <p>ScheduledTask</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The configuration group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cg-75aazkg2tnqb2*****</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The code of the system scheduled task description, used for frontend display.</p>
             * 
             * <strong>example:</strong>
             * <p>INNER_TIMER_10_MINUTES_HIBERNATE_NO_UPDATE_DESC</p>
             */
            public Builder innerTimerDesc(String innerTimerDesc) {
                this.innerTimerDesc = innerTimerDesc;
                return this;
            }

            /**
             * <p>The mapping code of the system scheduled task name, used for frontend display.</p>
             * 
             * <strong>example:</strong>
             * <p>INNER_TIMER_10_MINUTES_HIBERNATE_NO_UPDATE</p>
             */
            public Builder innerTimerName(String innerTimerName) {
                this.innerTimerName = innerTimerName;
                return this;
            }

            /**
             * <p>Used for system scheduled task check. The current scheduled task does not support unbinding or binding.</p>
             */
            public Builder isBind(Boolean isBind) {
                this.isBind = isBind;
                return this;
            }

            /**
             * <p>Used for system scheduled task check. The current scheduled task does not support modification.</p>
             */
            public Builder isUpdate(Boolean isUpdate) {
                this.isUpdate = isUpdate;
                return this;
            }

            /**
             * <p>The name of the configuration group.</p>
             * 
             * <strong>example:</strong>
             * <p>ScheduledTask</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The product type used by the configuration group.</p>
             * 
             * <strong>example:</strong>
             * <p>CLOUD_DESKTOP</p>
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * <p>The status of the configuration group.</p>
             * 
             * <strong>example:</strong>
             * <p>AVAILABLE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of the configuration group.</p>
             * 
             * <strong>example:</strong>
             * <p>Timer</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
