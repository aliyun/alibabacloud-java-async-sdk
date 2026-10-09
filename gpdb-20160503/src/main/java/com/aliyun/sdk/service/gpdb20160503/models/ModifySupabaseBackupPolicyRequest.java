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
 * {@link ModifySupabaseBackupPolicyRequest} extends {@link RequestModel}
 *
 * <p>ModifySupabaseBackupPolicyRequest</p>
 */
public class ModifySupabaseBackupPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupRetentionPeriod")
    private Integer backupRetentionPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableRecoveryPoint")
    private Boolean enableRecoveryPoint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreferredBackupPeriod")
    @com.aliyun.core.annotation.Validation(required = true)
    private String preferredBackupPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreferredBackupTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String preferredBackupTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecoveryPointPeriod")
    private String recoveryPointPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ModifySupabaseBackupPolicyRequest(Builder builder) {
        super(builder);
        this.backupRetentionPeriod = builder.backupRetentionPeriod;
        this.enableRecoveryPoint = builder.enableRecoveryPoint;
        this.preferredBackupPeriod = builder.preferredBackupPeriod;
        this.preferredBackupTime = builder.preferredBackupTime;
        this.projectId = builder.projectId;
        this.recoveryPointPeriod = builder.recoveryPointPeriod;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySupabaseBackupPolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return recoveryPointPeriod
     */
    public String getRecoveryPointPeriod() {
        return this.recoveryPointPeriod;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifySupabaseBackupPolicyRequest, Builder> {
        private Integer backupRetentionPeriod; 
        private Boolean enableRecoveryPoint; 
        private String preferredBackupPeriod; 
        private String preferredBackupTime; 
        private String projectId; 
        private String recoveryPointPeriod; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifySupabaseBackupPolicyRequest request) {
            super(request);
            this.backupRetentionPeriod = request.backupRetentionPeriod;
            this.enableRecoveryPoint = request.enableRecoveryPoint;
            this.preferredBackupPeriod = request.preferredBackupPeriod;
            this.preferredBackupTime = request.preferredBackupTime;
            this.projectId = request.projectId;
            this.recoveryPointPeriod = request.recoveryPointPeriod;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The data backup retention period. Unit: days. Valid values: 1 to 7.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder backupRetentionPeriod(Integer backupRetentionPeriod) {
            this.putQueryParameter("BackupRetentionPeriod", backupRetentionPeriod);
            this.backupRetentionPeriod = backupRetentionPeriod;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic recovery points. Valid values:</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Disabled.
         * If this parameter is not specified, false is used.</li>
         * </ul>
         */
        public Builder enableRecoveryPoint(Boolean enableRecoveryPoint) {
            this.putQueryParameter("EnableRecoveryPoint", enableRecoveryPoint);
            this.enableRecoveryPoint = enableRecoveryPoint;
            return this;
        }

        /**
         * <p>The data backup cycle. Separate multiple values with commas (,). Valid values: Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, and Sunday.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Wednesday,Friday</p>
         */
        public Builder preferredBackupPeriod(String preferredBackupPeriod) {
            this.putQueryParameter("PreferredBackupPeriod", preferredBackupPeriod);
            this.preferredBackupPeriod = preferredBackupPeriod;
            return this;
        }

        /**
         * <p>The start time of the data backup. The time is in UTC and follows the HH:mmZ format, such as 01:00Z. The HH:mmZ-HH:mmZ time range format is also supported, and the server uses the start time of the range.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>01:00Z</p>
         */
        public Builder preferredBackupTime(String preferredBackupTime) {
            this.putQueryParameter("PreferredBackupTime", preferredBackupTime);
            this.preferredBackupTime = preferredBackupTime;
            return this;
        }

        /**
         * <p>Instance ID of the Supabase instance. You can obtain instance ID on the Supabase page in the console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sbp-263****</p>
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The interval for the automatic creation of recovery points. Unit: hours. Valid values: 1/6 (10 minutes), 1/2 (30 minutes), 1, 2, 4, and 8. This parameter takes effect only when EnableRecoveryPoint is set to true. If this parameter is not specified, the default value 1 is used. If EnableRecoveryPoint is set to false, this parameter is ignored.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder recoveryPointPeriod(String recoveryPointPeriod) {
            this.putQueryParameter("RecoveryPointPeriod", recoveryPointPeriod);
            this.recoveryPointPeriod = recoveryPointPeriod;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> operation to query available region IDs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifySupabaseBackupPolicyRequest build() {
            return new ModifySupabaseBackupPolicyRequest(this);
        } 

    } 

}
