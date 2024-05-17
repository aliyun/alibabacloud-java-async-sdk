// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLogBackupPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLogBackupPolicyResponseBody</p>
 */
public class DescribeLogBackupPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EnableBackupLog")
    private Integer enableBackupLog;

    @com.aliyun.core.annotation.NameInMap("LogBackupAnotherRegionRegion")
    private String logBackupAnotherRegionRegion;

    @com.aliyun.core.annotation.NameInMap("LogBackupAnotherRegionRetentionPeriod")
    private String logBackupAnotherRegionRetentionPeriod;

    @com.aliyun.core.annotation.NameInMap("LogBackupRetentionPeriod")
    private Integer logBackupRetentionPeriod;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * Indicates whether the log backup feature is enabled. Valid values:
         * <p>
         * 
         * *   0: The log backup feature is disabled.
         * *   1: The log backup feature is enabled. By default, the log backup feature is enabled and cannot be disabled.
         */
        public Builder enableBackupLog(Integer enableBackupLog) {
            this.enableBackupLog = enableBackupLog;
            return this;
        }

        /**
         * The region in which you want to store cross-region log backups. For more information about regions that support the cross-region backup feature, see [Overview](~~72672~~).
         */
        public Builder logBackupAnotherRegionRegion(String logBackupAnotherRegionRegion) {
            this.logBackupAnotherRegionRegion = logBackupAnotherRegionRegion;
            return this;
        }

        /**
         * The retention period of cross-region log backups. Valid values:
         * <p>
         * 
         * *   **0**: The cross-region backup feature is disabled.
         * *   **30 to 7300**: Cross-region log backups are retained for 30 to 7,300 days.
         * *   **-1**: The log backups are permanently retained.
         * 
         * >  When you create a cluster, the default value of this parameter is **0**.
         */
        public Builder logBackupAnotherRegionRetentionPeriod(String logBackupAnotherRegionRetentionPeriod) {
            this.logBackupAnotherRegionRetentionPeriod = logBackupAnotherRegionRetentionPeriod;
            return this;
        }

        /**
         * The retention period of the log backups. Valid values:
         * <p>
         * 
         * *   3 to 7300: The log backups are retained for 3 to 7,300 days.
         * *   \-1: The log backups are permanently retained.
         */
        public Builder logBackupRetentionPeriod(Integer logBackupRetentionPeriod) {
            this.logBackupRetentionPeriod = logBackupRetentionPeriod;
            return this;
        }

        /**
         * The request ID.
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
