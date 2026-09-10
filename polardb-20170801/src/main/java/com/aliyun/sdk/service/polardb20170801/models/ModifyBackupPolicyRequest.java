// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link ModifyBackupPolicyRequest} extends {@link RequestModel}
 *
 * <p>ModifyBackupPolicyRequest</p>
 */
public class ModifyBackupPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdvancedDataPolicies")
    private java.util.List<AdvancedDataPolicies> advancedDataPolicies;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupFrequency")
    private String backupFrequency;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupPolicyLevel")
    private String backupPolicyLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupRetentionPolicyOnClusterDeletion")
    private String backupRetentionPolicyOnClusterDeletion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataLevel1BackupFrequency")
    private String dataLevel1BackupFrequency;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataLevel1BackupPeriod")
    private String dataLevel1BackupPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataLevel1BackupRetentionPeriod")
    private String dataLevel1BackupRetentionPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataLevel1BackupTime")
    private String dataLevel1BackupTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataLevel2BackupAnotherRegionRegion")
    private String dataLevel2BackupAnotherRegionRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataLevel2BackupAnotherRegionRetentionPeriod")
    private String dataLevel2BackupAnotherRegionRetentionPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataLevel2BackupPeriod")
    private String dataLevel2BackupPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataLevel2BackupRetentionPeriod")
    private String dataLevel2BackupRetentionPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreferredBackupPeriod")
    private String preferredBackupPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreferredBackupTime")
    private String preferredBackupTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ModifyBackupPolicyRequest(Builder builder) {
        super(builder);
        this.advancedDataPolicies = builder.advancedDataPolicies;
        this.backupFrequency = builder.backupFrequency;
        this.backupPolicyLevel = builder.backupPolicyLevel;
        this.backupRetentionPolicyOnClusterDeletion = builder.backupRetentionPolicyOnClusterDeletion;
        this.DBClusterId = builder.DBClusterId;
        this.dataLevel1BackupFrequency = builder.dataLevel1BackupFrequency;
        this.dataLevel1BackupPeriod = builder.dataLevel1BackupPeriod;
        this.dataLevel1BackupRetentionPeriod = builder.dataLevel1BackupRetentionPeriod;
        this.dataLevel1BackupTime = builder.dataLevel1BackupTime;
        this.dataLevel2BackupAnotherRegionRegion = builder.dataLevel2BackupAnotherRegionRegion;
        this.dataLevel2BackupAnotherRegionRetentionPeriod = builder.dataLevel2BackupAnotherRegionRetentionPeriod;
        this.dataLevel2BackupPeriod = builder.dataLevel2BackupPeriod;
        this.dataLevel2BackupRetentionPeriod = builder.dataLevel2BackupRetentionPeriod;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.preferredBackupPeriod = builder.preferredBackupPeriod;
        this.preferredBackupTime = builder.preferredBackupTime;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyBackupPolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return advancedDataPolicies
     */
    public java.util.List<AdvancedDataPolicies> getAdvancedDataPolicies() {
        return this.advancedDataPolicies;
    }

    /**
     * @return backupFrequency
     */
    public String getBackupFrequency() {
        return this.backupFrequency;
    }

    /**
     * @return backupPolicyLevel
     */
    public String getBackupPolicyLevel() {
        return this.backupPolicyLevel;
    }

    /**
     * @return backupRetentionPolicyOnClusterDeletion
     */
    public String getBackupRetentionPolicyOnClusterDeletion() {
        return this.backupRetentionPolicyOnClusterDeletion;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return dataLevel1BackupFrequency
     */
    public String getDataLevel1BackupFrequency() {
        return this.dataLevel1BackupFrequency;
    }

    /**
     * @return dataLevel1BackupPeriod
     */
    public String getDataLevel1BackupPeriod() {
        return this.dataLevel1BackupPeriod;
    }

    /**
     * @return dataLevel1BackupRetentionPeriod
     */
    public String getDataLevel1BackupRetentionPeriod() {
        return this.dataLevel1BackupRetentionPeriod;
    }

    /**
     * @return dataLevel1BackupTime
     */
    public String getDataLevel1BackupTime() {
        return this.dataLevel1BackupTime;
    }

    /**
     * @return dataLevel2BackupAnotherRegionRegion
     */
    public String getDataLevel2BackupAnotherRegionRegion() {
        return this.dataLevel2BackupAnotherRegionRegion;
    }

    /**
     * @return dataLevel2BackupAnotherRegionRetentionPeriod
     */
    public String getDataLevel2BackupAnotherRegionRetentionPeriod() {
        return this.dataLevel2BackupAnotherRegionRetentionPeriod;
    }

    /**
     * @return dataLevel2BackupPeriod
     */
    public String getDataLevel2BackupPeriod() {
        return this.dataLevel2BackupPeriod;
    }

    /**
     * @return dataLevel2BackupRetentionPeriod
     */
    public String getDataLevel2BackupRetentionPeriod() {
        return this.dataLevel2BackupRetentionPeriod;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<ModifyBackupPolicyRequest, Builder> {
        private java.util.List<AdvancedDataPolicies> advancedDataPolicies; 
        private String backupFrequency; 
        private String backupPolicyLevel; 
        private String backupRetentionPolicyOnClusterDeletion; 
        private String DBClusterId; 
        private String dataLevel1BackupFrequency; 
        private String dataLevel1BackupPeriod; 
        private String dataLevel1BackupRetentionPeriod; 
        private String dataLevel1BackupTime; 
        private String dataLevel2BackupAnotherRegionRegion; 
        private String dataLevel2BackupAnotherRegionRetentionPeriod; 
        private String dataLevel2BackupPeriod; 
        private String dataLevel2BackupRetentionPeriod; 
        private String ownerAccount; 
        private Long ownerId; 
        private String preferredBackupPeriod; 
        private String preferredBackupTime; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyBackupPolicyRequest request) {
            super(request);
            this.advancedDataPolicies = request.advancedDataPolicies;
            this.backupFrequency = request.backupFrequency;
            this.backupPolicyLevel = request.backupPolicyLevel;
            this.backupRetentionPolicyOnClusterDeletion = request.backupRetentionPolicyOnClusterDeletion;
            this.DBClusterId = request.DBClusterId;
            this.dataLevel1BackupFrequency = request.dataLevel1BackupFrequency;
            this.dataLevel1BackupPeriod = request.dataLevel1BackupPeriod;
            this.dataLevel1BackupRetentionPeriod = request.dataLevel1BackupRetentionPeriod;
            this.dataLevel1BackupTime = request.dataLevel1BackupTime;
            this.dataLevel2BackupAnotherRegionRegion = request.dataLevel2BackupAnotherRegionRegion;
            this.dataLevel2BackupAnotherRegionRetentionPeriod = request.dataLevel2BackupAnotherRegionRetentionPeriod;
            this.dataLevel2BackupPeriod = request.dataLevel2BackupPeriod;
            this.dataLevel2BackupRetentionPeriod = request.dataLevel2BackupRetentionPeriod;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.preferredBackupPeriod = request.preferredBackupPeriod;
            this.preferredBackupTime = request.preferredBackupTime;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The advanced backup policy.</p>
         * <blockquote>
         * <ul>
         * <li><ul>
         * <li>PolarDB for PostgreSQL (Compatible with Oracle) and PolarDB for PostgreSQL do not support this parameter.</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li>Only clusters with BackupPolicyLevel set to Advanced support this parameter.</li>
         * </ul>
         * </li>
         * </ul>
         * </blockquote>
         */
        public Builder advancedDataPolicies(java.util.List<AdvancedDataPolicies> advancedDataPolicies) {
            String advancedDataPoliciesShrink = shrink(advancedDataPolicies, "AdvancedDataPolicies", "json");
            this.putQueryParameter("AdvancedDataPolicies", advancedDataPoliciesShrink);
            this.advancedDataPolicies = advancedDataPolicies;
            return this;
        }

        /**
         * <p>The backup frequency. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong> (default): regular backup. Automatic backup is performed once a day at a scheduled time.</li>
         * <li><strong>2/24H</strong>: high-frequency backup. Backup is performed every 2 hours.</li>
         * <li><strong>3/24H</strong>: high-frequency backup. Backup is performed every 3 hours.</li>
         * <li><strong>4/24H</strong>: high-frequency backup. Backup is performed every 4 hours.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><ul>
         * <li>After high-frequency backup is enabled, all backups completed within 24 hours are retained. For backups older than 24 hours, only the first backup completed after 00:00 each day is retained, and all others are deleted.</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li>After high-frequency backup is enabled, the backup cycle parameter PreferredBackupPeriod defaults to all days of the week (Monday through Sunday).</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li>If the region of your PolarDB for MySQL cluster supports the cross-region backup feature, this parameter is not supported. For regions that support cross-region backup, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li>After advanced backup is enabled, this parameter no longer takes effect. Use the AdvancedDataPolicies parameter instead.</li>
         * </ul>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder backupFrequency(String backupFrequency) {
            this.putQueryParameter("BackupFrequency", backupFrequency);
            this.backupFrequency = backupFrequency;
            return this;
        }

        /**
         * <p>The backup policy level. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: regular backup.</li>
         * <li><strong>Advanced</strong>: advanced backup.<blockquote>
         * <ul>
         * <li><ul>
         * <li>PolarDB for PostgreSQL (Compatible with Oracle) and PolarDB for PostgreSQL do not support this parameter.</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li>You can check the AdvancedPolicyOption response parameter of the <a href="https://help.aliyun.com/document_detail/2319231.html">DescribeBackupPolicy</a> operation to determine whether the cluster supports advanced backup. If the cluster supports advanced backup, you can apply to use this feature through <a href="~611727~~">Advanced backup settings</a>.</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li>After advanced backup is enabled, rollback to regular backup is <strong>not supported</strong>.</li>
         * </ul>
         * </li>
         * </ul>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder backupPolicyLevel(String backupPolicyLevel) {
            this.putQueryParameter("BackupPolicyLevel", backupPolicyLevel);
            this.backupPolicyLevel = backupPolicyLevel;
            return this;
        }

        /**
         * <p>Specifies whether to retain backups when the cluster is deleted. Valid values:</p>
         * <ul>
         * <li><p><strong>ALL</strong>: Long-term retention (LTR) of all backups.</p>
         * </li>
         * <li><p><strong>LATEST</strong>: Long-term retention (LTR) of only the last backup.</p>
         * </li>
         * <li><p><strong>NONE</strong>: Does not retain any backups.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Default value: NONE.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>NONE</p>
         */
        public Builder backupRetentionPolicyOnClusterDeletion(String backupRetentionPolicyOnClusterDeletion) {
            this.putQueryParameter("BackupRetentionPolicyOnClusterDeletion", backupRetentionPolicyOnClusterDeletion);
            this.backupRetentionPolicyOnClusterDeletion = backupRetentionPolicyOnClusterDeletion;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/98094.html">DescribeDBClusters</a> operation to query information about all clusters in a specific region, including cluster IDs.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-bp13wz9586voc****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The backup frequency. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong> (default): regular backup. Automatic backup is performed once a day at a scheduled time.</li>
         * <li><strong>2/24H</strong>: high-frequency backup. Backup is performed every 2 hours.</li>
         * <li><strong>3/24H</strong>: high-frequency backup. Backup is performed every 3 hours.</li>
         * <li><strong>4/24H</strong>: high-frequency backup. Backup is performed every 4 hours.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><ul>
         * <li>PolarDB for PostgreSQL (Compatible with Oracle) and PolarDB for PostgreSQL do not support this parameter.</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li>If the region of your PolarDB for MySQL cluster does not support the cross-region backup feature, this parameter is not supported. For regions that support cross-region backup, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li>After advanced backup is enabled, this parameter no longer takes effect. Use the AdvancedDataPolicies parameter instead.</li>
         * </ul>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder dataLevel1BackupFrequency(String dataLevel1BackupFrequency) {
            this.putQueryParameter("DataLevel1BackupFrequency", dataLevel1BackupFrequency);
            this.dataLevel1BackupFrequency = dataLevel1BackupFrequency;
            return this;
        }

        /**
         * <p>The level-1 backup cycle. Valid values: </p>
         * <ul>
         * <li><strong>Monday</strong></li>
         * <li><strong>Tuesday</strong></li>
         * <li><strong>Wednesday</strong></li>
         * <li><strong>Thursday</strong></li>
         * <li><strong>Friday</strong></li>
         * <li><strong>Saturday</strong></li>
         * <li><strong>Sunday</strong></li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><ul>
         * <li>Select at least 2 days. Separate multiple values with commas (,).</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li>PolarDB for PostgreSQL (Compatible with Oracle) and PolarDB for PostgreSQL do not support this parameter.</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li>If the region of your PolarDB for MySQL cluster does not support the cross-region backup feature, this parameter is not supported. For regions that support cross-region backup, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li>After advanced backup is enabled, this parameter no longer takes effect. Use the AdvancedDataPolicies parameter instead.</li>
         * </ul>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Monday,Tuesday</p>
         */
        public Builder dataLevel1BackupPeriod(String dataLevel1BackupPeriod) {
            this.putQueryParameter("DataLevel1BackupPeriod", dataLevel1BackupPeriod);
            this.dataLevel1BackupPeriod = dataLevel1BackupPeriod;
            return this;
        }

        /**
         * <p>The retention period of level-1 backups. Valid values: 3 to 14. Unit: days.</p>
         * <blockquote>
         * <ul>
         * <li>After advanced backup is enabled, this parameter no longer takes effect. Use the AdvancedDataPolicies parameter instead.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder dataLevel1BackupRetentionPeriod(String dataLevel1BackupRetentionPeriod) {
            this.putQueryParameter("DataLevel1BackupRetentionPeriod", dataLevel1BackupRetentionPeriod);
            this.dataLevel1BackupRetentionPeriod = dataLevel1BackupRetentionPeriod;
            return this;
        }

        /**
         * <p>The time period during which automatic backup is performed. Specify the time period in the <code>hh:mmZ-hh:mmZ</code> format in UTC. The values must be on the hour with an interval of 1 hour, such as <code>14:00Z-15:00Z</code>.</p>
         * <blockquote>
         * <ul>
         * <li>PolarDB for PostgreSQL (Compatible with Oracle) and PolarDB for PostgreSQL do not support this parameter.</li>
         * <li>If the region of your PolarDB for MySQL cluster does not support the cross-region backup feature, this parameter is not supported. For regions that support cross-region backup, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>15:00Z-16:00Z</p>
         */
        public Builder dataLevel1BackupTime(String dataLevel1BackupTime) {
            this.putQueryParameter("DataLevel1BackupTime", dataLevel1BackupTime);
            this.dataLevel1BackupTime = dataLevel1BackupTime;
            return this;
        }

        /**
         * <p>The destination region for cross-region level-2 backups. For regions that support cross-region backup, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</p>
         * <blockquote>
         * <ul>
         * <li>After advanced backup is enabled, this parameter no longer takes effect. Use the AdvancedDataPolicies parameter instead.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder dataLevel2BackupAnotherRegionRegion(String dataLevel2BackupAnotherRegionRegion) {
            this.putQueryParameter("DataLevel2BackupAnotherRegionRegion", dataLevel2BackupAnotherRegionRegion);
            this.dataLevel2BackupAnotherRegionRegion = dataLevel2BackupAnotherRegionRegion;
            return this;
        }

        /**
         * <p>The retention period of cross-region backups for level-2 backups. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: Disables the level-2 cross-region backup feature.</p>
         * </li>
         * <li><p><strong>30 to 7300</strong>: The retention period of level-2 backups. Unit: days.</p>
         * </li>
         * <li><p><strong>-1</strong>: Long-term retention (LTR) of level-2 backups.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><ul>
         * <li>When a cluster is created, the default value is <strong>0</strong>, which means the level-2 cross-region backup feature is disabled.</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li>After advanced backup is enabled, this parameter no longer takes effect. Use the AdvancedDataPolicies parameter instead.</li>
         * </ul>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder dataLevel2BackupAnotherRegionRetentionPeriod(String dataLevel2BackupAnotherRegionRetentionPeriod) {
            this.putQueryParameter("DataLevel2BackupAnotherRegionRetentionPeriod", dataLevel2BackupAnotherRegionRetentionPeriod);
            this.dataLevel2BackupAnotherRegionRetentionPeriod = dataLevel2BackupAnotherRegionRetentionPeriod;
            return this;
        }

        /**
         * <p>The level-2 backup cycle. Valid values: </p>
         * <ul>
         * <li><strong>Monday</strong></li>
         * <li><strong>Tuesday</strong></li>
         * <li><strong>Wednesday</strong></li>
         * <li><strong>Thursday</strong></li>
         * <li><strong>Friday</strong></li>
         * <li><strong>Saturday</strong></li>
         * <li><strong>Sunday</strong></li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><ul>
         * <li>Select at least 2 days. Separate multiple values with commas (,).</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li>PolarDB for PostgreSQL (Compatible with Oracle) and PolarDB for PostgreSQL do not support this parameter.</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li>If the region of your PolarDB for MySQL cluster does not support the cross-region backup feature, this parameter is not supported. For regions that support cross-region backup, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li>After advanced backup is enabled, this parameter no longer takes effect. Use the AdvancedDataPolicies parameter instead.</li>
         * </ul>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Monday,Tuesday</p>
         */
        public Builder dataLevel2BackupPeriod(String dataLevel2BackupPeriod) {
            this.putQueryParameter("DataLevel2BackupPeriod", dataLevel2BackupPeriod);
            this.dataLevel2BackupPeriod = dataLevel2BackupPeriod;
            return this;
        }

        /**
         * <p>The retention period of level-2 backups. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: Disables the level-2 backup feature.</p>
         * </li>
         * <li><p><strong>30 to 7300</strong>: The retention period of level-2 backups. Unit: days.</p>
         * </li>
         * <li><p><strong>-1</strong>: Long-term retention (LTR) of level-2 backups.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><ul>
         * <li>When a cluster is created, the default value is <strong>0</strong>, which means the level-2 backup feature is disabled.</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li>After advanced backup is enabled, this parameter no longer takes effect. Use the AdvancedDataPolicies parameter instead.</li>
         * </ul>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder dataLevel2BackupRetentionPeriod(String dataLevel2BackupRetentionPeriod) {
            this.putQueryParameter("DataLevel2BackupRetentionPeriod", dataLevel2BackupRetentionPeriod);
            this.dataLevel2BackupRetentionPeriod = dataLevel2BackupRetentionPeriod;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The backup cycle. Valid values: </p>
         * <ul>
         * <li><strong>Monday</strong></li>
         * <li><strong>Tuesday</strong></li>
         * <li><strong>Wednesday</strong></li>
         * <li><strong>Thursday</strong></li>
         * <li><strong>Friday</strong></li>
         * <li><strong>Saturday</strong></li>
         * <li><strong>Sunday</strong></li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><ul>
         * <li>Select at least 2 days. Separate multiple values with commas (,).</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li>If the region of your PolarDB for MySQL cluster supports the cross-region backup feature, this parameter is not supported. For regions that support cross-region backup, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li>After advanced backup is enabled, this parameter no longer takes effect. Use the AdvancedDataPolicies parameter instead.</li>
         * </ul>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Monday,Tuesday</p>
         */
        public Builder preferredBackupPeriod(String preferredBackupPeriod) {
            this.putQueryParameter("PreferredBackupPeriod", preferredBackupPeriod);
            this.preferredBackupPeriod = preferredBackupPeriod;
            return this;
        }

        /**
         * <p>The time period during which automatic backup is performed. Specify the time period in the <code>hh:mmZ-hh:mmZ</code> format in UTC. The values must be on the hour with an interval of 1 hour, such as <code>14:00Z-15:00Z</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>15:00Z-16:00Z</p>
         */
        public Builder preferredBackupTime(String preferredBackupTime) {
            this.putQueryParameter("PreferredBackupTime", preferredBackupTime);
            this.preferredBackupTime = preferredBackupTime;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public ModifyBackupPolicyRequest build() {
            return new ModifyBackupPolicyRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyBackupPolicyRequest} extends {@link TeaModel}
     *
     * <p>ModifyBackupPolicyRequest</p>
     */
    public static class AdvancedDataPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionType")
        private String actionType;

        @com.aliyun.core.annotation.NameInMap("AutoCreated")
        private Boolean autoCreated;

        @com.aliyun.core.annotation.NameInMap("BakType")
        private String bakType;

        @com.aliyun.core.annotation.NameInMap("DestRegion")
        private String destRegion;

        @com.aliyun.core.annotation.NameInMap("DestType")
        private String destType;

        @com.aliyun.core.annotation.NameInMap("DumpAction")
        private String dumpAction;

        @com.aliyun.core.annotation.NameInMap("FilterKey")
        private String filterKey;

        @com.aliyun.core.annotation.NameInMap("FilterType")
        private String filterType;

        @com.aliyun.core.annotation.NameInMap("FilterValue")
        private String filterValue;

        @com.aliyun.core.annotation.NameInMap("OnlyPreserveOneEachDay")
        private Boolean onlyPreserveOneEachDay;

        @com.aliyun.core.annotation.NameInMap("OnlyPreserveOneEachHour")
        private Boolean onlyPreserveOneEachHour;

        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private String policyId;

        @com.aliyun.core.annotation.NameInMap("RetentionType")
        private String retentionType;

        @com.aliyun.core.annotation.NameInMap("RetentionValue")
        private String retentionValue;

        @com.aliyun.core.annotation.NameInMap("SrcRegion")
        private String srcRegion;

        @com.aliyun.core.annotation.NameInMap("SrcType")
        private String srcType;

        @com.aliyun.core.annotation.NameInMap("StorageClass")
        private String storageClass;

        private AdvancedDataPolicies(Builder builder) {
            this.actionType = builder.actionType;
            this.autoCreated = builder.autoCreated;
            this.bakType = builder.bakType;
            this.destRegion = builder.destRegion;
            this.destType = builder.destType;
            this.dumpAction = builder.dumpAction;
            this.filterKey = builder.filterKey;
            this.filterType = builder.filterType;
            this.filterValue = builder.filterValue;
            this.onlyPreserveOneEachDay = builder.onlyPreserveOneEachDay;
            this.onlyPreserveOneEachHour = builder.onlyPreserveOneEachHour;
            this.policyId = builder.policyId;
            this.retentionType = builder.retentionType;
            this.retentionValue = builder.retentionValue;
            this.srcRegion = builder.srcRegion;
            this.srcType = builder.srcType;
            this.storageClass = builder.storageClass;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdvancedDataPolicies create() {
            return builder().build();
        }

        /**
         * @return actionType
         */
        public String getActionType() {
            return this.actionType;
        }

        /**
         * @return autoCreated
         */
        public Boolean getAutoCreated() {
            return this.autoCreated;
        }

        /**
         * @return bakType
         */
        public String getBakType() {
            return this.bakType;
        }

        /**
         * @return destRegion
         */
        public String getDestRegion() {
            return this.destRegion;
        }

        /**
         * @return destType
         */
        public String getDestType() {
            return this.destType;
        }

        /**
         * @return dumpAction
         */
        public String getDumpAction() {
            return this.dumpAction;
        }

        /**
         * @return filterKey
         */
        public String getFilterKey() {
            return this.filterKey;
        }

        /**
         * @return filterType
         */
        public String getFilterType() {
            return this.filterType;
        }

        /**
         * @return filterValue
         */
        public String getFilterValue() {
            return this.filterValue;
        }

        /**
         * @return onlyPreserveOneEachDay
         */
        public Boolean getOnlyPreserveOneEachDay() {
            return this.onlyPreserveOneEachDay;
        }

        /**
         * @return onlyPreserveOneEachHour
         */
        public Boolean getOnlyPreserveOneEachHour() {
            return this.onlyPreserveOneEachHour;
        }

        /**
         * @return policyId
         */
        public String getPolicyId() {
            return this.policyId;
        }

        /**
         * @return retentionType
         */
        public String getRetentionType() {
            return this.retentionType;
        }

        /**
         * @return retentionValue
         */
        public String getRetentionValue() {
            return this.retentionValue;
        }

        /**
         * @return srcRegion
         */
        public String getSrcRegion() {
            return this.srcRegion;
        }

        /**
         * @return srcType
         */
        public String getSrcType() {
            return this.srcType;
        }

        /**
         * @return storageClass
         */
        public String getStorageClass() {
            return this.storageClass;
        }

        public static final class Builder {
            private String actionType; 
            private Boolean autoCreated; 
            private String bakType; 
            private String destRegion; 
            private String destType; 
            private String dumpAction; 
            private String filterKey; 
            private String filterType; 
            private String filterValue; 
            private Boolean onlyPreserveOneEachDay; 
            private Boolean onlyPreserveOneEachHour; 
            private String policyId; 
            private String retentionType; 
            private String retentionValue; 
            private String srcRegion; 
            private String srcType; 
            private String storageClass; 

            private Builder() {
            } 

            private Builder(AdvancedDataPolicies model) {
                this.actionType = model.actionType;
                this.autoCreated = model.autoCreated;
                this.bakType = model.bakType;
                this.destRegion = model.destRegion;
                this.destType = model.destType;
                this.dumpAction = model.dumpAction;
                this.filterKey = model.filterKey;
                this.filterType = model.filterType;
                this.filterValue = model.filterValue;
                this.onlyPreserveOneEachDay = model.onlyPreserveOneEachDay;
                this.onlyPreserveOneEachHour = model.onlyPreserveOneEachHour;
                this.policyId = model.policyId;
                this.retentionType = model.retentionType;
                this.retentionValue = model.retentionValue;
                this.srcRegion = model.srcRegion;
                this.srcType = model.srcType;
                this.storageClass = model.storageClass;
            } 

            /**
             * <p>The action type. Valid values:</p>
             * <ul>
             * <li><strong>CREATE</strong>: create</li>
             * <li><strong>UPDATE</strong>: update</li>
             * <li><strong>DELETE</strong>: delete</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CREATE</p>
             */
            public Builder actionType(String actionType) {
                this.actionType = actionType;
                return this;
            }

            /**
             * <p>Indicates whether the backup policy is automatically generated by the system.</p>
             * <blockquote>
             * <p>This parameter value is automatically generated. You do not need to specify it.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder autoCreated(Boolean autoCreated) {
                this.autoCreated = autoCreated;
                return this;
            }

            /**
             * <p>The backup type. Valid values:</p>
             * <ul>
             * <li><strong>F</strong>: full backup.<blockquote>
             * <p>This parameter cannot be modified and is fixed to F.</p>
             * </blockquote>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>F</p>
             */
            public Builder bakType(String bakType) {
                this.bakType = bakType;
                return this;
            }

            /**
             * <p>The destination region of the backup policy.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder destRegion(String destRegion) {
                this.destRegion = destRegion;
                return this;
            }

            /**
             * <p>The destination type of the backup policy. Valid values:</p>
             * <ul>
             * <li><strong>level1</strong>: level-1 backup</li>
             * <li><strong>level2</strong>: level-2 backup</li>
             * <li><strong>level2Cross</strong>: level-2 cross-region backup</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>level2</p>
             */
            public Builder destType(String destType) {
                this.destType = destType;
                return this;
            }

            /**
             * <p>The method for converting level-1 backups to level-2 backups. Valid values:</p>
             * <ul>
             * <li><strong>copy</strong>: copy</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>copy</p>
             */
            public Builder dumpAction(String dumpAction) {
                this.dumpAction = dumpAction;
                return this;
            }

            /**
             * <p>The scheduling type. Valid values:</p>
             * <ul>
             * <li><strong>dayOfWeek</strong>: scheduled by week</li>
             * <li><strong>dayOfMonth</strong>: scheduled by month</li>
             * <li><strong>dayOfYear</strong>: scheduled by year</li>
             * <li><strong>backupInterval</strong>: scheduled at fixed intervals</li>
             * </ul>
             * <blockquote>
             * <p>This parameter is required only when FilterType is set to <strong>crontab</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>dayOfWeek</p>
             */
            public Builder filterKey(String filterKey) {
                this.filterKey = filterKey;
                return this;
            }

            /**
             * <p>The filter type of the advanced policy. Valid values:</p>
             * <ul>
             * <li><strong>crontab</strong>: periodic scheduling</li>
             * <li><strong>event</strong>: event-based scheduling</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>crontab</p>
             */
            public Builder filterType(String filterType) {
                this.filterType = filterType;
                return this;
            }

            /**
             * <p>The backup cycle.</p>
             * 
             * <strong>example:</strong>
             * <p>1,2,3,4,5,6,7</p>
             */
            public Builder filterValue(String filterValue) {
                this.filterValue = filterValue;
                return this;
            }

            /**
             * <p>The 24-hour backup data retention policy. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Only the first backup set of the day is retained for backups older than 24 hours.</li>
             * <li><strong>false</strong>: All backup sets are retained.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder onlyPreserveOneEachDay(Boolean onlyPreserveOneEachDay) {
                this.onlyPreserveOneEachDay = onlyPreserveOneEachDay;
                return this;
            }

            /**
             * <p>The hourly backup data retention policy. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Only the earliest backup set within each hour is retained for backups older than 1 hour.</li>
             * <li><strong>false</strong>: All backup sets are retained.</li>
             * </ul>
             * <blockquote>
             * <p>This parameter cannot be modified and is fixed to true.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder onlyPreserveOneEachHour(Boolean onlyPreserveOneEachHour) {
                this.onlyPreserveOneEachHour = onlyPreserveOneEachHour;
                return this;
            }

            /**
             * <p>The backup policy ID. You can call the <a href="https://help.aliyun.com/document_detail/2319231.html">DescribeBackupPolicy</a> operation to query the backup policy ID.</p>
             * 
             * <strong>example:</strong>
             * <p>71930ac2e9f15e41615e10627c******</p>
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * <p>The retention type of backup sets. Valid values:</p>
             * <ul>
             * <li><strong>never</strong>: never expires</li>
             * <li><strong>delay</strong>: expires after a fixed number of days</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>delay</p>
             */
            public Builder retentionType(String retentionType) {
                this.retentionType = retentionType;
                return this;
            }

            /**
             * <p>The number of days to retain backups.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder retentionValue(String retentionValue) {
                this.retentionValue = retentionValue;
                return this;
            }

            /**
             * <p>The source region of the backup policy.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder srcRegion(String srcRegion) {
                this.srcRegion = srcRegion;
                return this;
            }

            /**
             * <p>The source type of the backup policy. Valid values:</p>
             * <ul>
             * <li><strong>db</strong>: database cluster</li>
             * <li><strong>level1</strong>: level-1 backup</li>
             * <li><strong>level2</strong>: level-2 backup</li>
             * <li><strong>level2Cross</strong>: level-2 cross-region backup</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>level1</p>
             */
            public Builder srcType(String srcType) {
                this.srcType = srcType;
                return this;
            }

            /**
             * StorageClass.
             */
            public Builder storageClass(String storageClass) {
                this.storageClass = storageClass;
                return this;
            }

            public AdvancedDataPolicies build() {
                return new AdvancedDataPolicies(this);
            } 

        } 

    }
}
