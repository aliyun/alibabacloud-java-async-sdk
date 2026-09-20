// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

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
    private String backupRetentionPeriod;

    @com.aliyun.core.annotation.NameInMap("PreferredBackupEndTimeUTC")
    private String preferredBackupEndTimeUTC;

    @com.aliyun.core.annotation.NameInMap("PreferredBackupPeriod")
    private String preferredBackupPeriod;

    @com.aliyun.core.annotation.NameInMap("PreferredBackupStartTimeUTC")
    private String preferredBackupStartTimeUTC;

    @com.aliyun.core.annotation.NameInMap("PreferredBackupTime")
    private String preferredBackupTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeBackupPolicyResponseBody(Builder builder) {
        this.backupRetentionPeriod = builder.backupRetentionPeriod;
        this.preferredBackupEndTimeUTC = builder.preferredBackupEndTimeUTC;
        this.preferredBackupPeriod = builder.preferredBackupPeriod;
        this.preferredBackupStartTimeUTC = builder.preferredBackupStartTimeUTC;
        this.preferredBackupTime = builder.preferredBackupTime;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupPolicyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupRetentionPeriod
     */
    public String getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    /**
     * @return preferredBackupEndTimeUTC
     */
    public String getPreferredBackupEndTimeUTC() {
        return this.preferredBackupEndTimeUTC;
    }

    /**
     * @return preferredBackupPeriod
     */
    public String getPreferredBackupPeriod() {
        return this.preferredBackupPeriod;
    }

    /**
     * @return preferredBackupStartTimeUTC
     */
    public String getPreferredBackupStartTimeUTC() {
        return this.preferredBackupStartTimeUTC;
    }

    /**
     * @return preferredBackupTime
     */
    public String getPreferredBackupTime() {
        return this.preferredBackupTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String backupRetentionPeriod; 
        private String preferredBackupEndTimeUTC; 
        private String preferredBackupPeriod; 
        private String preferredBackupStartTimeUTC; 
        private String preferredBackupTime; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeBackupPolicyResponseBody model) {
            this.backupRetentionPeriod = model.backupRetentionPeriod;
            this.preferredBackupEndTimeUTC = model.preferredBackupEndTimeUTC;
            this.preferredBackupPeriod = model.preferredBackupPeriod;
            this.preferredBackupStartTimeUTC = model.preferredBackupStartTimeUTC;
            this.preferredBackupTime = model.preferredBackupTime;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The number of days for which backups are retained.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder backupRetentionPeriod(String backupRetentionPeriod) {
            this.backupRetentionPeriod = backupRetentionPeriod;
            return this;
        }

        /**
         * <p>The UTC time when the backup ends.</p>
         * 
         * <strong>example:</strong>
         * <p>18:00Z</p>
         */
        public Builder preferredBackupEndTimeUTC(String preferredBackupEndTimeUTC) {
            this.preferredBackupEndTimeUTC = preferredBackupEndTimeUTC;
            return this;
        }

        /**
         * <p>The backup cycle. For example, Friday indicates that the backup is performed every Friday.</p>
         * 
         * <strong>example:</strong>
         * <p>Friday</p>
         */
        public Builder preferredBackupPeriod(String preferredBackupPeriod) {
            this.preferredBackupPeriod = preferredBackupPeriod;
            return this;
        }

        /**
         * <p>The UTC time when the backup starts.</p>
         * 
         * <strong>example:</strong>
         * <p>17:00Z</p>
         */
        public Builder preferredBackupStartTimeUTC(String preferredBackupStartTimeUTC) {
            this.preferredBackupStartTimeUTC = preferredBackupStartTimeUTC;
            return this;
        }

        /**
         * <p>The backup time range in the current time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>01:00-02:00</p>
         */
        public Builder preferredBackupTime(String preferredBackupTime) {
            this.preferredBackupTime = preferredBackupTime;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>94AC38B6-7C6D-45B2-BC03-B8750071A482</p>
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
