// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link DescribeSupabaseBackupPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSupabaseBackupPolicyResponseBody</p>
 */
public class DescribeSupabaseBackupPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BackupInterval")
    private Integer backupInterval;

    @com.aliyun.core.annotation.NameInMap("BackupRetentionPeriod")
    private Integer backupRetentionPeriod;

    @com.aliyun.core.annotation.NameInMap("EnableRecoveryPoint")
    private Boolean enableRecoveryPoint;

    @com.aliyun.core.annotation.NameInMap("PreferredBackupPeriod")
    private String preferredBackupPeriod;

    @com.aliyun.core.annotation.NameInMap("PreferredBackupTime")
    private String preferredBackupTime;

    @com.aliyun.core.annotation.NameInMap("RecoveryPointPeriod")
    private String recoveryPointPeriod;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeSupabaseBackupPolicyResponseBody(Builder builder) {
        this.backupInterval = builder.backupInterval;
        this.backupRetentionPeriod = builder.backupRetentionPeriod;
        this.enableRecoveryPoint = builder.enableRecoveryPoint;
        this.preferredBackupPeriod = builder.preferredBackupPeriod;
        this.preferredBackupTime = builder.preferredBackupTime;
        this.recoveryPointPeriod = builder.recoveryPointPeriod;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSupabaseBackupPolicyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupInterval
     */
    public Integer getBackupInterval() {
        return this.backupInterval;
    }

    /**
     * @return backupRetentionPeriod
     */
    public Integer getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    /**
     * @return enableRecoveryPoint
     */
    public Boolean getEnableRecoveryPoint() {
        return this.enableRecoveryPoint;
    }

    /**
     * @return preferredBackupPeriod
     */
    public String getPreferredBackupPeriod() {
        return this.preferredBackupPeriod;
    }

    /**
     * @return preferredBackupTime
     */
    public String getPreferredBackupTime() {
        return this.preferredBackupTime;
    }

    /**
     * @return recoveryPointPeriod
     */
    public String getRecoveryPointPeriod() {
        return this.recoveryPointPeriod;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer backupInterval; 
        private Integer backupRetentionPeriod; 
        private Boolean enableRecoveryPoint; 
        private String preferredBackupPeriod; 
        private String preferredBackupTime; 
        private String recoveryPointPeriod; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeSupabaseBackupPolicyResponseBody model) {
            this.backupInterval = model.backupInterval;
            this.backupRetentionPeriod = model.backupRetentionPeriod;
            this.enableRecoveryPoint = model.enableRecoveryPoint;
            this.preferredBackupPeriod = model.preferredBackupPeriod;
            this.preferredBackupTime = model.preferredBackupTime;
            this.recoveryPointPeriod = model.recoveryPointPeriod;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The interval between automatic recovery points, in minutes. A value greater than 0 indicates that automatic recovery points are enabled. If the feature is disabled, -1 is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        public Builder backupInterval(Integer backupInterval) {
            this.backupInterval = backupInterval;
            return this;
        }

        /**
         * <p>The data backup retention period, in days.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder backupRetentionPeriod(Integer backupRetentionPeriod) {
            this.backupRetentionPeriod = backupRetentionPeriod;
            return this;
        }

        /**
         * <p>Indicates whether automatic recovery points are enabled. Valid values:</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Disabled.</li>
         * </ul>
         */
        public Builder enableRecoveryPoint(Boolean enableRecoveryPoint) {
            this.enableRecoveryPoint = enableRecoveryPoint;
            return this;
        }

        /**
         * <p>The data backup cycle. Separate multiple values with commas (,). Valid values: Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, and Sunday.</p>
         * 
         * <strong>example:</strong>
         * <p>Wednesday,Friday</p>
         */
        public Builder preferredBackupPeriod(String preferredBackupPeriod) {
            this.preferredBackupPeriod = preferredBackupPeriod;
            return this;
        }

        /**
         * <p>The data backup time window in UTC. The format is HH:mmZ-HH:mmZ.</p>
         * 
         * <strong>example:</strong>
         * <p>01:00Z-02:00Z</p>
         */
        public Builder preferredBackupTime(String preferredBackupTime) {
            this.preferredBackupTime = preferredBackupTime;
            return this;
        }

        /**
         * <p>The interval for the automatic creation of recovery points, in hours. Valid values: 1/6 (10 minutes), 1/2 (30 minutes), 1, 2, 4, and 8. This value is valid only when EnableRecoveryPoint is set to true. If automatic recovery points are shutdown, 0 is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder recoveryPointPeriod(String recoveryPointPeriod) {
            this.recoveryPointPeriod = recoveryPointPeriod;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ABB39CC3-4488-4857-905D-2E4A051D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeSupabaseBackupPolicyResponseBody build() {
            return new DescribeSupabaseBackupPolicyResponseBody(this);
        } 

    } 

}
