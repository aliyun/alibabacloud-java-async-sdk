// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupPolicyResponseBody</p>
 */
public class DescribeBackupPolicyResponseBody extends TeaModel {
    @NameInMap("BackupRetentionPeriod")
    private Integer backupRetentionPeriod;

    @NameInMap("EnableRecoveryPoint")
    private Boolean enableRecoveryPoint;

    @NameInMap("PreferredBackupPeriod")
    private String preferredBackupPeriod;

    @NameInMap("PreferredBackupTime")
    private String preferredBackupTime;

    @NameInMap("RecoveryPointPeriod")
    private String recoveryPointPeriod;

    @NameInMap("RequestId")
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
         * BackupRetentionPeriod.
         */
        public Builder backupRetentionPeriod(Integer backupRetentionPeriod) {
            this.backupRetentionPeriod = backupRetentionPeriod;
            return this;
        }

        /**
         * EnableRecoveryPoint.
         */
        public Builder enableRecoveryPoint(Boolean enableRecoveryPoint) {
            this.enableRecoveryPoint = enableRecoveryPoint;
            return this;
        }

        /**
         * PreferredBackupPeriod.
         */
        public Builder preferredBackupPeriod(String preferredBackupPeriod) {
            this.preferredBackupPeriod = preferredBackupPeriod;
            return this;
        }

        /**
         * PreferredBackupTime.
         */
        public Builder preferredBackupTime(String preferredBackupTime) {
            this.preferredBackupTime = preferredBackupTime;
            return this;
        }

        /**
         * RecoveryPointPeriod.
         */
        public Builder recoveryPointPeriod(String recoveryPointPeriod) {
            this.recoveryPointPeriod = recoveryPointPeriod;
            return this;
        }

        /**
         * RequestId.
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
