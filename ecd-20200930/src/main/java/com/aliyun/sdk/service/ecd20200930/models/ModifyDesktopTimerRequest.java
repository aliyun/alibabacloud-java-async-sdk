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
         * The cloud computer ID. You can specify 1 to 20 IDs.
         */
        public Builder desktopId(java.util.List < String > desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * The details of the scheduled task for the cloud desktops.
         */
        public Builder desktopTimers(java.util.List < DesktopTimers> desktopTimers) {
            this.putQueryParameter("DesktopTimers", desktopTimers);
            this.desktopTimers = desktopTimers;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Specifies whether to use DesktopTimers. If you want to use a timer, **set this parameter to true**.
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
             * Specifies whether to allow end users to configure scheduled tasks on an Alibaba Cloud Workspace client.
             */
            public Builder allowClientSetting(Boolean allowClientSetting) {
                this.allowClientSetting = allowClientSetting;
                return this;
            }

            /**
             * The cron expression of the scheduled task.
             * <p>
             * 
             * >  You must specify the time in UTC format. For example, if you want to specify 00:00 of UTC+8, use the following cron expression: 0 0 16. \* 1,2,3,4,5,6,7
             */
            public Builder cronExpression(String cronExpression) {
                this.cronExpression = cronExpression;
                return this;
            }

            /**
             * Specifies whether to forcefully execute the scheduled task. A value of true indicates that the system forcefully executes the scheduled task regardless of the connection status of the cloud desktop.
             */
            public Builder enforce(Boolean enforce) {
                this.enforce = enforce;
                return this;
            }

            /**
             * The interval. Unit: minutes.
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * The type of the scheduled operation. This parameter is valid only when TimerType is set to NoConnect.
             * <p>
             * 
             * Valid values:
             * 
             * *   Hibernate
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     hibernates the cloud desktops
             * 
             *     <!-- -->
             * 
             *     .
             * 
             * *   Shutdown
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     stops the cloud desktops
             * 
             *     <!-- -->
             * 
             *     .
             */
            public Builder operationType(String operationType) {
                this.operationType = operationType;
                return this;
            }

            /**
             * Indicates which type of disk that is used by the cloud desktop is reset.
             * <p>
             * 
             * Valid values:
             * 
             * *   RESET_TYPE_SYSTEM
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     resets the system disks
             * 
             *     <!-- -->
             * 
             *     .
             * 
             * *   RESET_TYPE_BOTH
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     resets the data disks and system disks.
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
             * *   NoOperationDisconnect: Disconnects the cloud desktops when no operations are performed on the cloud desktops.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   LogoutShutdown: Stops the cloud desktops when end users log out of Alibaba Cloud Workspace clients.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   NoConnect: Disconnets the cloud desktops when end users perform one of the actions that is specified by the OperationType parameter.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   TimerBoot: Starts the cloud desktops at a scheduled point in time.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   TimerReset: Resets the cloud desktops at a scheduled point in time.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   LoginAutoConnect: automatically connects to cloud desktops when end users log on to Alibaba Cloud Workspace clients.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   NoOperationShutdown: Stops the cloud desktops when no operations are performed on the cloud desktops.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   TimerShutdown: Stops the cloud desktops at a scheduled point in time.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   NoOperationReboot: Restarts the cloud desktops when no operations are performed on the cloud desktops.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   TimerReboot: Restarts the cloud desktops at a scheduled point in time.
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
