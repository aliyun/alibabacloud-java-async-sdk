// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeInstanceCrossBackupPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceCrossBackupPolicyResponseBody</p>
 */
public class DescribeInstanceCrossBackupPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BackupEnabled")
    private String backupEnabled;

    @com.aliyun.core.annotation.NameInMap("BackupEnabledTime")
    private String backupEnabledTime;

    @com.aliyun.core.annotation.NameInMap("CrossBackupRegion")
    private String crossBackupRegion;

    @com.aliyun.core.annotation.NameInMap("CrossBackupType")
    private String crossBackupType;

    @com.aliyun.core.annotation.NameInMap("DBInstanceDescription")
    private String DBInstanceDescription;

    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("DBInstanceStatus")
    private String DBInstanceStatus;

    @com.aliyun.core.annotation.NameInMap("Engine")
    private String engine;

    @com.aliyun.core.annotation.NameInMap("EngineVersion")
    private String engineVersion;

    @com.aliyun.core.annotation.NameInMap("LockMode")
    private String lockMode;

    @com.aliyun.core.annotation.NameInMap("LogBackupEnabled")
    private String logBackupEnabled;

    @com.aliyun.core.annotation.NameInMap("LogBackupEnabledTime")
    private String logBackupEnabledTime;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RetentType")
    private Integer retentType;

    @com.aliyun.core.annotation.NameInMap("Retention")
    private Integer retention;

    private DescribeInstanceCrossBackupPolicyResponseBody(Builder builder) {
        this.backupEnabled = builder.backupEnabled;
        this.backupEnabledTime = builder.backupEnabledTime;
        this.crossBackupRegion = builder.crossBackupRegion;
        this.crossBackupType = builder.crossBackupType;
        this.DBInstanceDescription = builder.DBInstanceDescription;
        this.DBInstanceId = builder.DBInstanceId;
        this.DBInstanceStatus = builder.DBInstanceStatus;
        this.engine = builder.engine;
        this.engineVersion = builder.engineVersion;
        this.lockMode = builder.lockMode;
        this.logBackupEnabled = builder.logBackupEnabled;
        this.logBackupEnabledTime = builder.logBackupEnabledTime;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.retentType = builder.retentType;
        this.retention = builder.retention;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceCrossBackupPolicyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupEnabled
     */
    public String getBackupEnabled() {
        return this.backupEnabled;
    }

    /**
     * @return backupEnabledTime
     */
    public String getBackupEnabledTime() {
        return this.backupEnabledTime;
    }

    /**
     * @return crossBackupRegion
     */
    public String getCrossBackupRegion() {
        return this.crossBackupRegion;
    }

    /**
     * @return crossBackupType
     */
    public String getCrossBackupType() {
        return this.crossBackupType;
    }

    /**
     * @return DBInstanceDescription
     */
    public String getDBInstanceDescription() {
        return this.DBInstanceDescription;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return DBInstanceStatus
     */
    public String getDBInstanceStatus() {
        return this.DBInstanceStatus;
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return engineVersion
     */
    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * @return lockMode
     */
    public String getLockMode() {
        return this.lockMode;
    }

    /**
     * @return logBackupEnabled
     */
    public String getLogBackupEnabled() {
        return this.logBackupEnabled;
    }

    /**
     * @return logBackupEnabledTime
     */
    public String getLogBackupEnabledTime() {
        return this.logBackupEnabledTime;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return retentType
     */
    public Integer getRetentType() {
        return this.retentType;
    }

    /**
     * @return retention
     */
    public Integer getRetention() {
        return this.retention;
    }

    public static final class Builder {
        private String backupEnabled; 
        private String backupEnabledTime; 
        private String crossBackupRegion; 
        private String crossBackupType; 
        private String DBInstanceDescription; 
        private String DBInstanceId; 
        private String DBInstanceStatus; 
        private String engine; 
        private String engineVersion; 
        private String lockMode; 
        private String logBackupEnabled; 
        private String logBackupEnabledTime; 
        private String regionId; 
        private String requestId; 
        private Integer retentType; 
        private Integer retention; 

        private Builder() {
        } 

        private Builder(DescribeInstanceCrossBackupPolicyResponseBody model) {
            this.backupEnabled = model.backupEnabled;
            this.backupEnabledTime = model.backupEnabledTime;
            this.crossBackupRegion = model.crossBackupRegion;
            this.crossBackupType = model.crossBackupType;
            this.DBInstanceDescription = model.DBInstanceDescription;
            this.DBInstanceId = model.DBInstanceId;
            this.DBInstanceStatus = model.DBInstanceStatus;
            this.engine = model.engine;
            this.engineVersion = model.engineVersion;
            this.lockMode = model.lockMode;
            this.logBackupEnabled = model.logBackupEnabled;
            this.logBackupEnabledTime = model.logBackupEnabledTime;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.retentType = model.retentType;
            this.retention = model.retention;
        } 

        /**
         * <p>The status of the cross-region backup feature on the instance. Valid values:</p>
         * <ul>
         * <li><strong>Disable</strong></li>
         * <li><strong>Enable</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        public Builder backupEnabled(String backupEnabled) {
            this.backupEnabled = backupEnabled;
            return this;
        }

        /**
         * <p>The point in time at which the cross-region backup feature is enabled. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-06-12T05:44:21Z</p>
         */
        public Builder backupEnabledTime(String backupEnabledTime) {
            this.backupEnabledTime = backupEnabledTime;
            return this;
        }

        /**
         * <p>The ID of the destination region where the cross-region backup files of the instance are stored.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder crossBackupRegion(String crossBackupRegion) {
            this.crossBackupRegion = crossBackupRegion;
            return this;
        }

        /**
         * <p>The policy that is used to save the cross-region backup files of the instance. Default value: <strong>1</strong>. The value 1 indicates that all cross-region backup files are saved.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder crossBackupType(String crossBackupType) {
            this.crossBackupType = crossBackupType;
            return this;
        }

        /**
         * <p>The name of the instance. It must be 2 to 256 characters in length. The value can contain letters, digits, underscores (_), and hyphens (-), and must start with a letter.</p>
         * <blockquote>
         * <p> The value cannot start with http:// or https://.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Test database</p>
         */
        public Builder DBInstanceDescription(String DBInstanceDescription) {
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5xxxxxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The status of the instance. For more information, see <a href="https://help.aliyun.com/document_detail/26315.html">Instance state table</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder DBInstanceStatus(String DBInstanceStatus) {
            this.DBInstanceStatus = DBInstanceStatus;
            return this;
        }

        /**
         * <p>The database engine of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql</p>
         */
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * <p>The database engine version.</p>
         * 
         * <strong>example:</strong>
         * <p>5.6</p>
         */
        public Builder engineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * <p>The lock status of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Unlock</strong>: The instance is not locked.</li>
         * <li><strong>ManualLock</strong>: The instance is manually locked.</li>
         * <li><strong>LockByExpiration</strong>: The instance is automatically locked due to instance expiration.</li>
         * <li><strong>LockByRestoration</strong>: The instance is automatically locked before a rollback.</li>
         * <li><strong>LockByDiskQuota</strong>: The instance is automatically locked because its storage capacity is exhausted and the instance is inaccessible.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Unlock</p>
         */
        public Builder lockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }

        /**
         * <p>The status of the cross-region log backup feature on the instance. Valid values:</p>
         * <ul>
         * <li><strong>Disable</strong></li>
         * <li><strong>Enable</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        public Builder logBackupEnabled(String logBackupEnabled) {
            this.logBackupEnabled = logBackupEnabled;
            return this;
        }

        /**
         * <p>The time when cross-region log backup was enabled on the instance. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-06-12T05:44:21Z</p>
         */
        public Builder logBackupEnabledTime(String logBackupEnabledTime) {
            this.logBackupEnabledTime = logBackupEnabledTime;
            return this;
        }

        /**
         * <p>The region ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CB7667B2-72C8-497B-9BD8-3B343CEF51AB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The policy that is used to retain the cross-region backup files of the instance. Default value: <strong>1</strong>. The value 1 indicates that the cross-region backup files of the instance are retained based on the specified retention period.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder retentType(Integer retentType) {
            this.retentType = retentType;
            return this;
        }

        /**
         * <p>The number of days for which the cross-region backup files of the instance are retained. Valid values: <strong>7 to 1825</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder retention(Integer retention) {
            this.retention = retention;
            return this;
        }

        public DescribeInstanceCrossBackupPolicyResponseBody build() {
            return new DescribeInstanceCrossBackupPolicyResponseBody(this);
        } 

    } 

}
