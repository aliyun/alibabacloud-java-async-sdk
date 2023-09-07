// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLogBackupPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLogBackupPolicyResponseBody</p>
 */
public class DescribeLogBackupPolicyResponseBody extends TeaModel {
    @NameInMap("EnableBackupLog")
    private Integer enableBackupLog;

    @NameInMap("LogBackupAnotherRegionRegion")
    private String logBackupAnotherRegionRegion;

    @NameInMap("LogBackupAnotherRegionRetentionPeriod")
    private String logBackupAnotherRegionRetentionPeriod;

    @NameInMap("LogBackupRetentionPeriod")
    private Integer logBackupRetentionPeriod;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeLogBackupPolicyResponseBody(Builder builder) {
        this.enableBackupLog = builder.enableBackupLog;
        this.logBackupAnotherRegionRegion = builder.logBackupAnotherRegionRegion;
        this.logBackupAnotherRegionRetentionPeriod = builder.logBackupAnotherRegionRetentionPeriod;
        this.logBackupRetentionPeriod = builder.logBackupRetentionPeriod;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLogBackupPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return enableBackupLog
     */
    public Integer getEnableBackupLog() {
        return this.enableBackupLog;
    }

    /**
     * @return logBackupAnotherRegionRegion
     */
    public String getLogBackupAnotherRegionRegion() {
        return this.logBackupAnotherRegionRegion;
    }

    /**
     * @return logBackupAnotherRegionRetentionPeriod
     */
    public String getLogBackupAnotherRegionRetentionPeriod() {
        return this.logBackupAnotherRegionRetentionPeriod;
    }

    /**
     * @return logBackupRetentionPeriod
     */
    public Integer getLogBackupRetentionPeriod() {
        return this.logBackupRetentionPeriod;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer enableBackupLog; 
        private String logBackupAnotherRegionRegion; 
        private String logBackupAnotherRegionRetentionPeriod; 
        private Integer logBackupRetentionPeriod; 
        private String requestId; 

        /**
         * Indicates whether the log backup feature was enabled. Valid values:
         * <p>
         * 
         * *   0: disabled.
         * *   1: enabled. By default, the log backup feature is enabled and cannot be disabled.
         */
        public Builder enableBackupLog(Integer enableBackupLog) {
            this.enableBackupLog = enableBackupLog;
            return this;
        }

        /**
         * LogBackupAnotherRegionRegion.
         */
        public Builder logBackupAnotherRegionRegion(String logBackupAnotherRegionRegion) {
            this.logBackupAnotherRegionRegion = logBackupAnotherRegionRegion;
            return this;
        }

        /**
         * LogBackupAnotherRegionRetentionPeriod.
         */
        public Builder logBackupAnotherRegionRetentionPeriod(String logBackupAnotherRegionRetentionPeriod) {
            this.logBackupAnotherRegionRetentionPeriod = logBackupAnotherRegionRetentionPeriod;
            return this;
        }

        /**
         * The retention period of the logs. Valid values:
         * <p>
         * 
         * *   7 to 7300: The logs are retained for 7 to 7,300 days.
         * *   \-1: The logs are permanently retained.
         */
        public Builder logBackupRetentionPeriod(Integer logBackupRetentionPeriod) {
            this.logBackupRetentionPeriod = logBackupRetentionPeriod;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLogBackupPolicyResponseBody build() {
            return new DescribeLogBackupPolicyResponseBody(this);
        } 

    } 

}
