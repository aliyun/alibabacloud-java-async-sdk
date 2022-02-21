// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScalingCommonConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScalingCommonConfigResponseBody</p>
 */
public class DescribeScalingCommonConfigResponseBody extends TeaModel {
    @NameInMap("AutoScalingConfigDecommissionQueryInterval")
    private Long autoScalingConfigDecommissionQueryInterval;

    @NameInMap("AutoScalingConfigSystemDiskSize")
    private Integer autoScalingConfigSystemDiskSize;

    @NameInMap("AutoScalingCoolDownTime")
    private Integer autoScalingCoolDownTime;

    @NameInMap("AutoScalingGroupMaxSizeLimit")
    private Integer autoScalingGroupMaxSizeLimit;

    @NameInMap("AutoScalingGroupMinSizeLimit")
    private Integer autoScalingGroupMinSizeLimit;

    @NameInMap("AutoScalingHookHeartbeatDefaultTime")
    private Integer autoScalingHookHeartbeatDefaultTime;

    @NameInMap("AutoScalingMNSScalingThreadSleepTime")
    private Long autoScalingMNSScalingThreadSleepTime;

    @NameInMap("AutoScalingRuleAlarmDelayLimit")
    private Integer autoScalingRuleAlarmDelayLimit;

    @NameInMap("AutoScalingRuleAlarmSilentTime")
    private Integer autoScalingRuleAlarmSilentTime;

    @NameInMap("AutoScalingRuleMinDelayLimit")
    private Integer autoScalingRuleMinDelayLimit;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeScalingCommonConfigResponseBody(Builder builder) {
        this.autoScalingConfigDecommissionQueryInterval = builder.autoScalingConfigDecommissionQueryInterval;
        this.autoScalingConfigSystemDiskSize = builder.autoScalingConfigSystemDiskSize;
        this.autoScalingCoolDownTime = builder.autoScalingCoolDownTime;
        this.autoScalingGroupMaxSizeLimit = builder.autoScalingGroupMaxSizeLimit;
        this.autoScalingGroupMinSizeLimit = builder.autoScalingGroupMinSizeLimit;
        this.autoScalingHookHeartbeatDefaultTime = builder.autoScalingHookHeartbeatDefaultTime;
        this.autoScalingMNSScalingThreadSleepTime = builder.autoScalingMNSScalingThreadSleepTime;
        this.autoScalingRuleAlarmDelayLimit = builder.autoScalingRuleAlarmDelayLimit;
        this.autoScalingRuleAlarmSilentTime = builder.autoScalingRuleAlarmSilentTime;
        this.autoScalingRuleMinDelayLimit = builder.autoScalingRuleMinDelayLimit;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScalingCommonConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return autoScalingConfigDecommissionQueryInterval
     */
    public Long getAutoScalingConfigDecommissionQueryInterval() {
        return this.autoScalingConfigDecommissionQueryInterval;
    }

    /**
     * @return autoScalingConfigSystemDiskSize
     */
    public Integer getAutoScalingConfigSystemDiskSize() {
        return this.autoScalingConfigSystemDiskSize;
    }

    /**
     * @return autoScalingCoolDownTime
     */
    public Integer getAutoScalingCoolDownTime() {
        return this.autoScalingCoolDownTime;
    }

    /**
     * @return autoScalingGroupMaxSizeLimit
     */
    public Integer getAutoScalingGroupMaxSizeLimit() {
        return this.autoScalingGroupMaxSizeLimit;
    }

    /**
     * @return autoScalingGroupMinSizeLimit
     */
    public Integer getAutoScalingGroupMinSizeLimit() {
        return this.autoScalingGroupMinSizeLimit;
    }

    /**
     * @return autoScalingHookHeartbeatDefaultTime
     */
    public Integer getAutoScalingHookHeartbeatDefaultTime() {
        return this.autoScalingHookHeartbeatDefaultTime;
    }

    /**
     * @return autoScalingMNSScalingThreadSleepTime
     */
    public Long getAutoScalingMNSScalingThreadSleepTime() {
        return this.autoScalingMNSScalingThreadSleepTime;
    }

    /**
     * @return autoScalingRuleAlarmDelayLimit
     */
    public Integer getAutoScalingRuleAlarmDelayLimit() {
        return this.autoScalingRuleAlarmDelayLimit;
    }

    /**
     * @return autoScalingRuleAlarmSilentTime
     */
    public Integer getAutoScalingRuleAlarmSilentTime() {
        return this.autoScalingRuleAlarmSilentTime;
    }

    /**
     * @return autoScalingRuleMinDelayLimit
     */
    public Integer getAutoScalingRuleMinDelayLimit() {
        return this.autoScalingRuleMinDelayLimit;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long autoScalingConfigDecommissionQueryInterval; 
        private Integer autoScalingConfigSystemDiskSize; 
        private Integer autoScalingCoolDownTime; 
        private Integer autoScalingGroupMaxSizeLimit; 
        private Integer autoScalingGroupMinSizeLimit; 
        private Integer autoScalingHookHeartbeatDefaultTime; 
        private Long autoScalingMNSScalingThreadSleepTime; 
        private Integer autoScalingRuleAlarmDelayLimit; 
        private Integer autoScalingRuleAlarmSilentTime; 
        private Integer autoScalingRuleMinDelayLimit; 
        private String requestId; 

        /**
         * AutoScalingConfigDecommissionQueryInterval.
         */
        public Builder autoScalingConfigDecommissionQueryInterval(Long autoScalingConfigDecommissionQueryInterval) {
            this.autoScalingConfigDecommissionQueryInterval = autoScalingConfigDecommissionQueryInterval;
            return this;
        }

        /**
         * AutoScalingConfigSystemDiskSize.
         */
        public Builder autoScalingConfigSystemDiskSize(Integer autoScalingConfigSystemDiskSize) {
            this.autoScalingConfigSystemDiskSize = autoScalingConfigSystemDiskSize;
            return this;
        }

        /**
         * AutoScalingCoolDownTime.
         */
        public Builder autoScalingCoolDownTime(Integer autoScalingCoolDownTime) {
            this.autoScalingCoolDownTime = autoScalingCoolDownTime;
            return this;
        }

        /**
         * AutoScalingGroupMaxSizeLimit.
         */
        public Builder autoScalingGroupMaxSizeLimit(Integer autoScalingGroupMaxSizeLimit) {
            this.autoScalingGroupMaxSizeLimit = autoScalingGroupMaxSizeLimit;
            return this;
        }

        /**
         * AutoScalingGroupMinSizeLimit.
         */
        public Builder autoScalingGroupMinSizeLimit(Integer autoScalingGroupMinSizeLimit) {
            this.autoScalingGroupMinSizeLimit = autoScalingGroupMinSizeLimit;
            return this;
        }

        /**
         * AutoScalingHookHeartbeatDefaultTime.
         */
        public Builder autoScalingHookHeartbeatDefaultTime(Integer autoScalingHookHeartbeatDefaultTime) {
            this.autoScalingHookHeartbeatDefaultTime = autoScalingHookHeartbeatDefaultTime;
            return this;
        }

        /**
         * AutoScalingMNSScalingThreadSleepTime.
         */
        public Builder autoScalingMNSScalingThreadSleepTime(Long autoScalingMNSScalingThreadSleepTime) {
            this.autoScalingMNSScalingThreadSleepTime = autoScalingMNSScalingThreadSleepTime;
            return this;
        }

        /**
         * AutoScalingRuleAlarmDelayLimit.
         */
        public Builder autoScalingRuleAlarmDelayLimit(Integer autoScalingRuleAlarmDelayLimit) {
            this.autoScalingRuleAlarmDelayLimit = autoScalingRuleAlarmDelayLimit;
            return this;
        }

        /**
         * AutoScalingRuleAlarmSilentTime.
         */
        public Builder autoScalingRuleAlarmSilentTime(Integer autoScalingRuleAlarmSilentTime) {
            this.autoScalingRuleAlarmSilentTime = autoScalingRuleAlarmSilentTime;
            return this;
        }

        /**
         * AutoScalingRuleMinDelayLimit.
         */
        public Builder autoScalingRuleMinDelayLimit(Integer autoScalingRuleMinDelayLimit) {
            this.autoScalingRuleMinDelayLimit = autoScalingRuleMinDelayLimit;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeScalingCommonConfigResponseBody build() {
            return new DescribeScalingCommonConfigResponseBody(this);
        } 

    } 

}
