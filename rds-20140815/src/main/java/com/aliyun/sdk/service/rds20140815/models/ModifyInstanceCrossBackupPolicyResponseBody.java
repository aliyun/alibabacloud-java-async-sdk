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
 * {@link ModifyInstanceCrossBackupPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyInstanceCrossBackupPolicyResponseBody</p>
 */
public class ModifyInstanceCrossBackupPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BackupEnabled")
    private String backupEnabled;

    @com.aliyun.core.annotation.NameInMap("CrossBackupRegion")
    private String crossBackupRegion;

    @com.aliyun.core.annotation.NameInMap("CrossBackupType")
    private String crossBackupType;

    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("LogBackupEnabled")
    private String logBackupEnabled;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RetentType")
    private Integer retentType;

    @com.aliyun.core.annotation.NameInMap("Retention")
    private Integer retention;

    private ModifyInstanceCrossBackupPolicyResponseBody(Builder builder) {
        this.backupEnabled = builder.backupEnabled;
        this.crossBackupRegion = builder.crossBackupRegion;
        this.crossBackupType = builder.crossBackupType;
        this.DBInstanceId = builder.DBInstanceId;
        this.logBackupEnabled = builder.logBackupEnabled;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.retentType = builder.retentType;
        this.retention = builder.retention;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceCrossBackupPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return backupEnabled
     */
    public String getBackupEnabled() {
        return this.backupEnabled;
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
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return logBackupEnabled
     */
    public String getLogBackupEnabled() {
        return this.logBackupEnabled;
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
        private String crossBackupRegion; 
        private String crossBackupType; 
        private String DBInstanceId; 
        private String logBackupEnabled; 
        private String regionId; 
        private String requestId; 
        private Integer retentType; 
        private Integer retention; 

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
         * <p>The ID of the region in which the cross-region backup files of the instance are stored.</p>
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
         * <p>The region ID of the source instance. You can call the <a href="https://help.aliyun.com/document_detail/26243.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>50A6059D-6DBB-46C6-A851-1EE93C9013CF</p>
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

        public ModifyInstanceCrossBackupPolicyResponseBody build() {
            return new ModifyInstanceCrossBackupPolicyResponseBody(this);
        } 

    } 

}
