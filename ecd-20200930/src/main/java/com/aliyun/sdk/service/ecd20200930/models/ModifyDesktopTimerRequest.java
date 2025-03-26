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
 * {@link ModifyDesktopTimerRequest} extends {@link RequestModel}
 *
 * <p>ModifyDesktopTimerRequest</p>
 */
public class ModifyDesktopTimerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopId")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> desktopId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopTimers")
    private java.util.List<DesktopTimers> desktopTimers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseDesktopTimers")
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
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

    /**
     * @return desktopTimers
     */
    public java.util.List<DesktopTimers> getDesktopTimers() {
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
        private java.util.List<String> desktopId; 
        private java.util.List<DesktopTimers> desktopTimers; 
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
         * <p>The IDs of the cloud computers.</p>
         * <p>This parameter is required.</p>
         */
        public Builder desktopId(java.util.List<String> desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * <p>The details of the scheduled task on cloud computers.</p>
         */
        public Builder desktopTimers(java.util.List<DesktopTimers> desktopTimers) {
            this.putQueryParameter("DesktopTimers", desktopTimers);
            this.desktopTimers = desktopTimers;
            return this;
        }

        /**
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Specifies whether to use the <code>DesktopTimers</code>** parameter. Set the value to <code>true</code>**.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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

    /**
     * 
     * {@link ModifyDesktopTimerRequest} extends {@link TeaModel}
     *
     * <p>ModifyDesktopTimerRequest</p>
     */
    public static class DesktopTimers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowClientSetting")
        private Boolean allowClientSetting;

        @com.aliyun.core.annotation.NameInMap("CronExpression")
        private String cronExpression;

        @com.aliyun.core.annotation.NameInMap("Enforce")
        private Boolean enforce;

        @com.aliyun.core.annotation.NameInMap("Interval")
        private Integer interval;

        @com.aliyun.core.annotation.NameInMap("OperationType")
        private String operationType;

        @com.aliyun.core.annotation.NameInMap("ResetType")
        private String resetType;

        @com.aliyun.core.annotation.NameInMap("TimerType")
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

            private Builder() {
            } 

            private Builder(DesktopTimers model) {
                this.allowClientSetting = model.allowClientSetting;
                this.cronExpression = model.cronExpression;
                this.enforce = model.enforce;
                this.interval = model.interval;
                this.operationType = model.operationType;
                this.resetType = model.resetType;
                this.timerType = model.timerType;
            } 

            /**
             * <p>Specifies whether to allow end users to configure the scheduled task.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder allowClientSetting(Boolean allowClientSetting) {
                this.allowClientSetting = allowClientSetting;
                return this;
            }

            /**
             * <p>The cron expression of the schedule.</p>
             * <blockquote>
             * <p>The time must be in UTC. For example, for 24:00 (UTC+8), you must set the value to 0 0 16 ? * 1,2,3,4,5,6,7</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0 0 16 ? * 1,2,3,4,5,6,7</p>
             */
            public Builder cronExpression(String cronExpression) {
                this.cronExpression = cronExpression;
                return this;
            }

            /**
             * <p>Specifies whether to forcibly execute the scheduled task.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>true: forcibly executes the scheduled task regardless of the status and connection of the cloud computers.</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>false: does not forcibly execute the scheduled task.</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enforce(Boolean enforce) {
                this.enforce = enforce;
                return this;
            }

            /**
             * <p>The interval at which the scheduled task is executed. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * <p>The operations that scheduled tasks support. This parameter is valid only when TimerType is set to NoConnect.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>Hibernate: hibernates the cloud computers.</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>Shutdown: stops the cloud computers.</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Shutdown</p>
             */
            public Builder operationType(String operationType) {
                this.operationType = operationType;
                return this;
            }

            /**
             * <p>The reset type of the cloud computers.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>RESET_TYPE_SYSTE: resets the system disk.</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>RESET_TYPE_BOTH: resets data and user disks.</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RESET_TYPE_SYSTEM</p>
             */
            public Builder resetType(String resetType) {
                this.resetType = resetType;
                return this;
            }

            /**
             * <p>The type of the scheduled task.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>NoOperationDisconnect: Disconnects the cloud computers without performing operations on the cloud computers.</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>LogoutShutdown: Stops the cloud computers when end users log out Alibaba Cloud Workspace clients.</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>NoConnect: Disconnects the cloud computers when end users perform one of the actions that is specified by the OperationType parameter.</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>TimerBoot: Starts the cloud computers on schedule.</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>TimerReset: Resets the cloud computers on schedule.</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>LoginAutoConnect: automatically connects to the cloud computers when end users log on to Alibaba Cloud Workspace clients.</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>NoOperationShutdown: Stops the cloud computers without performing operations on the cloud computers.</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>TimerShutdown: Stops the cloud computers on schedule.</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>NoOperationReboot: Restarts the cloud computers without performing operations on the cloud computers.</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>TimerReboot: Restarts the cloud computers on schedule.</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TimerBoot</p>
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
