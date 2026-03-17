// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link DescribeDeviceAutoUpgradePolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDeviceAutoUpgradePolicyResponseBody</p>
 */
public class DescribeDeviceAutoUpgradePolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CronExpression")
    private String cronExpression;

    @com.aliyun.core.annotation.NameInMap("Duration")
    private String duration;

    @com.aliyun.core.annotation.NameInMap("Jitter")
    private String jitter;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SerialNumber")
    private String serialNumber;

    @com.aliyun.core.annotation.NameInMap("SmartAGId")
    private String smartAGId;

    @com.aliyun.core.annotation.NameInMap("TimeZone")
    private String timeZone;

    @com.aliyun.core.annotation.NameInMap("UpgradeType")
    private String upgradeType;

    private DescribeDeviceAutoUpgradePolicyResponseBody(Builder builder) {
        this.cronExpression = builder.cronExpression;
        this.duration = builder.duration;
        this.jitter = builder.jitter;
        this.requestId = builder.requestId;
        this.serialNumber = builder.serialNumber;
        this.smartAGId = builder.smartAGId;
        this.timeZone = builder.timeZone;
        this.upgradeType = builder.upgradeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDeviceAutoUpgradePolicyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cronExpression
     */
    public String getCronExpression() {
        return this.cronExpression;
    }

    /**
     * @return duration
     */
    public String getDuration() {
        return this.duration;
    }

    /**
     * @return jitter
     */
    public String getJitter() {
        return this.jitter;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serialNumber
     */
    public String getSerialNumber() {
        return this.serialNumber;
    }

    /**
     * @return smartAGId
     */
    public String getSmartAGId() {
        return this.smartAGId;
    }

    /**
     * @return timeZone
     */
    public String getTimeZone() {
        return this.timeZone;
    }

    /**
     * @return upgradeType
     */
    public String getUpgradeType() {
        return this.upgradeType;
    }

    public static final class Builder {
        private String cronExpression; 
        private String duration; 
        private String jitter; 
        private String requestId; 
        private String serialNumber; 
        private String smartAGId; 
        private String timeZone; 
        private String upgradeType; 

        private Builder() {
        } 

        private Builder(DescribeDeviceAutoUpgradePolicyResponseBody model) {
            this.cronExpression = model.cronExpression;
            this.duration = model.duration;
            this.jitter = model.jitter;
            this.requestId = model.requestId;
            this.serialNumber = model.serialNumber;
            this.smartAGId = model.smartAGId;
            this.timeZone = model.timeZone;
            this.upgradeType = model.upgradeType;
        } 

        /**
         * <p>The time when upgrades start. The time was configured by using a cron expression.</p>
         * <p>Example value: <code>0 0 4 1/1 * ?</code>. The example value indicates that upgrades start at 04:00:00 (UTC+8) on the first day of each month.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 4 1/1 * ?</p>
         */
        public Builder cronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }

        /**
         * <p>The time period during which upgrades are performed.</p>
         * <p>Valid values: <strong>30 to 120</strong>.</p>
         * <p>Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder duration(String duration) {
            this.duration = duration;
            return this;
        }

        /**
         * <p>The time differences between upgrades. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder jitter(String jitter) {
            this.jitter = jitter;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0E20FBB8-BCFC-4F5E-BD94-77FF6A2133D0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The serial number of the SAG instance.</p>
         * 
         * <strong>example:</strong>
         * <p>sage62x022502****</p>
         */
        public Builder serialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }

        /**
         * <p>The ID of the SAG instance.</p>
         * 
         * <strong>example:</strong>
         * <p>sag-kxe2cv7hot7qrv****</p>
         */
        public Builder smartAGId(String smartAGId) {
            this.smartAGId = smartAGId;
            return this;
        }

        /**
         * <p>The time zone in which the trigger period takes effect.</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        public Builder timeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }

        /**
         * <p>The update type. Valid values:</p>
         * <ul>
         * <li><strong>scheduled</strong>: scheduled upgrade.</li>
         * <li><strong>boot</strong>: automatic upgrade upon instance startup.</li>
         * <li><strong>manual</strong>: manual upgrade.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>scheduled</p>
         */
        public Builder upgradeType(String upgradeType) {
            this.upgradeType = upgradeType;
            return this;
        }

        public DescribeDeviceAutoUpgradePolicyResponseBody build() {
            return new DescribeDeviceAutoUpgradePolicyResponseBody(this);
        } 

    } 

}
