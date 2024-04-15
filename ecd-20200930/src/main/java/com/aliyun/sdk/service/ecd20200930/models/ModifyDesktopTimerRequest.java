// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDesktopTimerRequest} extends {@link RequestModel}
 *
 * <p>ModifyDesktopTimerRequest</p>
 */
public class ModifyDesktopTimerRequest extends Request {
    @Query
    @NameInMap("DesktopId")
    @Validation(required = true)
    private java.util.List < String > desktopId;

    @Query
    @NameInMap("DesktopTimers")
    private java.util.List < DesktopTimers> desktopTimers;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("UseDesktopTimers")
    private Boolean useDesktopTimers;

    private ModifyDesktopTimerRequest(Builder builder) {
        super(builder);
        this.desktopId = builder.desktopId;
        this.desktopTimers = builder.desktopTimers;
        this.regionId = builder.regionId;
        this.useDesktopTimers = builder.useDesktopTimers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDesktopTimerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desktopId
     */
    public java.util.List < String > getDesktopId() {
        return this.desktopId;
    }

    /**
     * @return desktopTimers
     */
    public java.util.List < DesktopTimers> getDesktopTimers() {
        return this.desktopTimers;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return useDesktopTimers
     */
    public Boolean getUseDesktopTimers() {
        return this.useDesktopTimers;
    }

    public static final class Builder extends Request.Builder<ModifyDesktopTimerRequest, Builder> {
        private java.util.List < String > desktopId; 
        private java.util.List < DesktopTimers> desktopTimers; 
        private String regionId; 
        private Boolean useDesktopTimers; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDesktopTimerRequest request) {
            super(request);
            this.desktopId = request.desktopId;
            this.desktopTimers = request.desktopTimers;
            this.regionId = request.regionId;
            this.useDesktopTimers = request.useDesktopTimers;
        } 

        /**
         * The IDs of the cloud computers.
         */
        public Builder desktopId(java.util.List < String > desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * The details of the scheduled task on cloud computers.
         */
        public Builder desktopTimers(java.util.List < DesktopTimers> desktopTimers) {
            this.putQueryParameter("DesktopTimers", desktopTimers);
            this.desktopTimers = desktopTimers;
            return this;
        }

        /**
         * The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Specifies whether to use the `DesktopTimers`** parameter. Set the value to `true`**.
         */
        public Builder useDesktopTimers(Boolean useDesktopTimers) {
            this.putQueryParameter("UseDesktopTimers", useDesktopTimers);
            this.useDesktopTimers = useDesktopTimers;
            return this;
        }

        @Override
        public ModifyDesktopTimerRequest build() {
            return new ModifyDesktopTimerRequest(this);
        } 

    } 

    public static class DesktopTimers extends TeaModel {
        @NameInMap("AllowClientSetting")
        private Boolean allowClientSetting;

        @NameInMap("CronExpression")
        private String cronExpression;

        @NameInMap("Enforce")
        private Boolean enforce;

        @NameInMap("Interval")
        private Integer interval;

        @NameInMap("OperationType")
        private String operationType;

        @NameInMap("ResetType")
        private String resetType;

        @NameInMap("TimerType")
        private String timerType;

        private DesktopTimers(Builder builder) {
            this.allowClientSetting = builder.allowClientSetting;
            this.cronExpression = builder.cronExpression;
            this.enforce = builder.enforce;
            this.interval = builder.interval;
            this.operationType = builder.operationType;
            this.resetType = builder.resetType;
            this.timerType = builder.timerType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DesktopTimers create() {
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
         * @return operationType
         */
        public String getOperationType() {
            return this.operationType;
        }

        /**
         * @return resetType
         */
        public String getResetType() {
            return this.resetType;
        }

        /**
         * @return timerType
         */
        public String getTimerType() {
            return this.timerType;
        }

        public static final class Builder {
            private Boolean allowClientSetting; 
            private String cronExpression; 
            private Boolean enforce; 
            private Integer interval; 
            private String operationType; 
            private String resetType; 
            private String timerType; 

            /**
             * Specifies whether to allow end users to configure the scheduled task.
             */
            public Builder allowClientSetting(Boolean allowClientSetting) {
                this.allowClientSetting = allowClientSetting;
                return this;
            }

            /**
             * The cron expression of the schedule.
             * <p>
             * 
             * > The time must be in UTC. For example, for 24:00 (UTC+8), you must set the value to 0 0 16 ? \* 1,2,3,4,5,6,7
             */
            public Builder cronExpression(String cronExpression) {
                this.cronExpression = cronExpression;
                return this;
            }

            /**
             * Specifies whether to forcibly execute the scheduled task.
             * <p>
             * 
             * Valid values:
             * 
             * *   true: forcibly executes the scheduled task regardless of the status and connection of the cloud computers.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   false: does not forcibly execute the scheduled task.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder enforce(Boolean enforce) {
                this.enforce = enforce;
                return this;
            }

            /**
             * The interval at which the scheduled task is executed. Unit: minutes.
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * The operations that scheduled tasks support. This parameter is valid only when TimerType is set to NoConnect.
             * <p>
             * 
             * Valid values:
             * 
             * *   Hibernate: hibernates the cloud computers.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   Shutdown: stops the cloud computers.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder operationType(String operationType) {
                this.operationType = operationType;
                return this;
            }

            /**
             * The reset type of the cloud computers.
             * <p>
             * 
             * Valid values:
             * 
             * *   RESET_TYPE_SYSTE: resets the system disk.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   RESET_TYPE_BOTH: resets data and user disks.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder resetType(String resetType) {
                this.resetType = resetType;
                return this;
            }

            /**
             * The type of the scheduled task.
             * <p>
             * 
             * Valid values:
             * 
             * *   NoOperationDisconnect: Disconnects the cloud computers without performing operations on the cloud computers.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   LogoutShutdown: Stops the cloud computers when end users log out Alibaba Cloud Workspace clients.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   NoConnect: Disconnects the cloud computers when end users perform one of the actions that is specified by the OperationType parameter.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   TimerBoot: Starts the cloud computers on schedule.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   TimerReset: Resets the cloud computers on schedule.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   LoginAutoConnect: automatically connects to the cloud computers when end users log on to Alibaba Cloud Workspace clients.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   NoOperationShutdown: Stops the cloud computers without performing operations on the cloud computers.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   TimerShutdown: Stops the cloud computers on schedule.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   NoOperationReboot: Restarts the cloud computers without performing operations on the cloud computers.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   TimerReboot: Restarts the cloud computers on schedule.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder timerType(String timerType) {
                this.timerType = timerType;
                return this;
            }

            public DesktopTimers build() {
                return new DesktopTimers(this);
            } 

        } 

    }
}
