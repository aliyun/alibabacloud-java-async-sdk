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
 * {@link DescribeBackupPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupPolicyResponseBody</p>
 */
public class DescribeBackupPolicyResponseBody extends TeaModel {
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

    private DescribeBackupPolicyResponseBody(Builder builder) {
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

    public static DescribeBackupPolicyResponseBody create() {
        return builder().build();
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
        private Integer backupRetentionPeriod; 
        private Boolean enableRecoveryPoint; 
        private String preferredBackupPeriod; 
        private String preferredBackupTime; 
        private String recoveryPointPeriod; 
        private String requestId; 

        /**
         * <p>The number of days for which data backup files are retained.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder backupRetentionPeriod(Integer backupRetentionPeriod) {
            this.backupRetentionPeriod = backupRetentionPeriod;
            return this;
        }

        /**
         * <p>Indicates whether automatic point-in-time backup is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Automatic point-in-time backup is enabled.</li>
         * <li><strong>false</strong>: Automatic point-in-time backup is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableRecoveryPoint(Boolean enableRecoveryPoint) {
            this.enableRecoveryPoint = enableRecoveryPoint;
            return this;
        }

        /**
         * <p>The cycle based on which backups are performed. If more than one day of the week is specified, the days of the week are separated by commas (,). Valid values:</p>
         * <ul>
         * <li><strong>Monday</strong></li>
         * <li><strong>Tuesday</strong></li>
         * <li><strong>Wednesday</strong></li>
         * <li><strong>Thursday</strong></li>
         * <li><strong>Friday</strong></li>
         * <li><strong>Saturday</strong></li>
         * <li><strong>Sunday</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Wednesday,Friday</p>
         */
        public Builder preferredBackupPeriod(String preferredBackupPeriod) {
            this.preferredBackupPeriod = preferredBackupPeriod;
            return this;
        }

        /**
         * <p>The backup time. The time is in the HH:mmZ-HH:mmZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>12:00Z-13:00Z</p>
         */
        public Builder preferredBackupTime(String preferredBackupTime) {
            this.preferredBackupTime = preferredBackupTime;
            return this;
        }

        /**
         * <p>The frequency of the point-in-time backup. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: per hour</li>
         * <li><strong>2</strong>: per 2 hours</li>
         * <li><strong>4</strong>: per 4 hours</li>
         * <li><strong>8</strong>: per 8 hours</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder recoveryPointPeriod(String recoveryPointPeriod) {
            this.recoveryPointPeriod = recoveryPointPeriod;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>9E6B3287-A3E2-5A87-B8D8-E9**********</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBackupPolicyResponseBody build() {
            return new DescribeBackupPolicyResponseBody(this);
        } 

    } 

}
