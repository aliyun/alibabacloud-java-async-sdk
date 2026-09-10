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
 * {@link DescribeBackupPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupPolicyResponseBody</p>
 */
public class DescribeBackupPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AdvancedDataPolicies")
    private AdvancedDataPolicies advancedDataPolicies;

    @com.aliyun.core.annotation.NameInMap("AdvancedPolicyOption")
    private String advancedPolicyOption;

    @com.aliyun.core.annotation.NameInMap("BackupFrequency")
    private String backupFrequency;

    @com.aliyun.core.annotation.NameInMap("BackupPolicyLevel")
    private String backupPolicyLevel;

    @com.aliyun.core.annotation.NameInMap("BackupRetentionPolicyOnClusterDeletion")
    private String backupRetentionPolicyOnClusterDeletion;

    @com.aliyun.core.annotation.NameInMap("DataLevel1BackupFrequency")
    private String dataLevel1BackupFrequency;

    @com.aliyun.core.annotation.NameInMap("DataLevel1BackupPeriod")
    private String dataLevel1BackupPeriod;

    @com.aliyun.core.annotation.NameInMap("DataLevel1BackupRetentionPeriod")
    private String dataLevel1BackupRetentionPeriod;

    @com.aliyun.core.annotation.NameInMap("DataLevel1BackupTime")
    private String dataLevel1BackupTime;

    @com.aliyun.core.annotation.NameInMap("DataLevel2BackupAnotherRegionRegion")
    private String dataLevel2BackupAnotherRegionRegion;

    @com.aliyun.core.annotation.NameInMap("DataLevel2BackupAnotherRegionRetentionPeriod")
    private String dataLevel2BackupAnotherRegionRetentionPeriod;

    @com.aliyun.core.annotation.NameInMap("DataLevel2BackupPeriod")
    private String dataLevel2BackupPeriod;

    @com.aliyun.core.annotation.NameInMap("DataLevel2BackupRetentionPeriod")
    private String dataLevel2BackupRetentionPeriod;

    @com.aliyun.core.annotation.NameInMap("EnableCrossRegionImmutableBackup")
    private Boolean enableCrossRegionImmutableBackup;

    @com.aliyun.core.annotation.NameInMap("EnableImmutableBackup")
    private Boolean enableImmutableBackup;

    @com.aliyun.core.annotation.NameInMap("PreferredBackupPeriod")
    private String preferredBackupPeriod;

    @com.aliyun.core.annotation.NameInMap("PreferredBackupTime")
    private String preferredBackupTime;

    @com.aliyun.core.annotation.NameInMap("PreferredNextBackupTime")
    private String preferredNextBackupTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeBackupPolicyResponseBody(Builder builder) {
        this.advancedDataPolicies = builder.advancedDataPolicies;
        this.advancedPolicyOption = builder.advancedPolicyOption;
        this.backupFrequency = builder.backupFrequency;
        this.backupPolicyLevel = builder.backupPolicyLevel;
        this.backupRetentionPolicyOnClusterDeletion = builder.backupRetentionPolicyOnClusterDeletion;
        this.dataLevel1BackupFrequency = builder.dataLevel1BackupFrequency;
        this.dataLevel1BackupPeriod = builder.dataLevel1BackupPeriod;
        this.dataLevel1BackupRetentionPeriod = builder.dataLevel1BackupRetentionPeriod;
        this.dataLevel1BackupTime = builder.dataLevel1BackupTime;
        this.dataLevel2BackupAnotherRegionRegion = builder.dataLevel2BackupAnotherRegionRegion;
        this.dataLevel2BackupAnotherRegionRetentionPeriod = builder.dataLevel2BackupAnotherRegionRetentionPeriod;
        this.dataLevel2BackupPeriod = builder.dataLevel2BackupPeriod;
        this.dataLevel2BackupRetentionPeriod = builder.dataLevel2BackupRetentionPeriod;
        this.enableCrossRegionImmutableBackup = builder.enableCrossRegionImmutableBackup;
        this.enableImmutableBackup = builder.enableImmutableBackup;
        this.preferredBackupPeriod = builder.preferredBackupPeriod;
        this.preferredBackupTime = builder.preferredBackupTime;
        this.preferredNextBackupTime = builder.preferredNextBackupTime;
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
     * @return advancedDataPolicies
     */
    public AdvancedDataPolicies getAdvancedDataPolicies() {
        return this.advancedDataPolicies;
    }

    /**
     * @return advancedPolicyOption
     */
    public String getAdvancedPolicyOption() {
        return this.advancedPolicyOption;
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
     * @return enableCrossRegionImmutableBackup
     */
    public Boolean getEnableCrossRegionImmutableBackup() {
        return this.enableCrossRegionImmutableBackup;
    }

    /**
     * @return enableImmutableBackup
     */
    public Boolean getEnableImmutableBackup() {
        return this.enableImmutableBackup;
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
     * @return preferredNextBackupTime
     */
    public String getPreferredNextBackupTime() {
        return this.preferredNextBackupTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AdvancedDataPolicies advancedDataPolicies; 
        private String advancedPolicyOption; 
        private String backupFrequency; 
        private String backupPolicyLevel; 
        private String backupRetentionPolicyOnClusterDeletion; 
        private String dataLevel1BackupFrequency; 
        private String dataLevel1BackupPeriod; 
        private String dataLevel1BackupRetentionPeriod; 
        private String dataLevel1BackupTime; 
        private String dataLevel2BackupAnotherRegionRegion; 
        private String dataLevel2BackupAnotherRegionRetentionPeriod; 
        private String dataLevel2BackupPeriod; 
        private String dataLevel2BackupRetentionPeriod; 
        private Boolean enableCrossRegionImmutableBackup; 
        private Boolean enableImmutableBackup; 
        private String preferredBackupPeriod; 
        private String preferredBackupTime; 
        private String preferredNextBackupTime; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeBackupPolicyResponseBody model) {
            this.advancedDataPolicies = model.advancedDataPolicies;
            this.advancedPolicyOption = model.advancedPolicyOption;
            this.backupFrequency = model.backupFrequency;
            this.backupPolicyLevel = model.backupPolicyLevel;
            this.backupRetentionPolicyOnClusterDeletion = model.backupRetentionPolicyOnClusterDeletion;
            this.dataLevel1BackupFrequency = model.dataLevel1BackupFrequency;
            this.dataLevel1BackupPeriod = model.dataLevel1BackupPeriod;
            this.dataLevel1BackupRetentionPeriod = model.dataLevel1BackupRetentionPeriod;
            this.dataLevel1BackupTime = model.dataLevel1BackupTime;
            this.dataLevel2BackupAnotherRegionRegion = model.dataLevel2BackupAnotherRegionRegion;
            this.dataLevel2BackupAnotherRegionRetentionPeriod = model.dataLevel2BackupAnotherRegionRetentionPeriod;
            this.dataLevel2BackupPeriod = model.dataLevel2BackupPeriod;
            this.dataLevel2BackupRetentionPeriod = model.dataLevel2BackupRetentionPeriod;
            this.enableCrossRegionImmutableBackup = model.enableCrossRegionImmutableBackup;
            this.enableImmutableBackup = model.enableImmutableBackup;
            this.preferredBackupPeriod = model.preferredBackupPeriod;
            this.preferredBackupTime = model.preferredBackupTime;
            this.preferredNextBackupTime = model.preferredNextBackupTime;
            this.requestId = model.requestId;
        } 

        /**
         * AdvancedDataPolicies.
         */
        public Builder advancedDataPolicies(AdvancedDataPolicies advancedDataPolicies) {
            this.advancedDataPolicies = advancedDataPolicies;
            return this;
        }

        /**
         * <p>The advanced backup policy option. Valid values:</p>
         * <ul>
         * <li><strong>enable</strong>: Advanced backup is enabled.</li>
         * <li><strong>disable</strong>: Advanced backup is not enabled but can be enabled.</li>
         * <li><strong>notSupport</strong>: Advanced backup is not supported.<blockquote>
         * <ul>
         * <li>This parameter is not supported for PolarDB for PostgreSQL (Compatible with Oracle) or PolarDB for PostgreSQL.</li>
         * </ul>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>disable</p>
         */
        public Builder advancedPolicyOption(String advancedPolicyOption) {
            this.advancedPolicyOption = advancedPolicyOption;
            return this;
        }

        /**
         * <p>The backup frequency. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong> (default): regular backup. A backup is performed once a day at a scheduled time.</li>
         * <li><strong>2/24H</strong>: enhanced backup. A backup is performed every 2 hours.</li>
         * <li><strong>3/24H</strong>: enhanced backup. A backup is performed every 3 hours.</li>
         * <li><strong>4/24H</strong>: enhanced backup. A backup is performed every 4 hours.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>After enhanced backup is enabled, all backups completed within 24 hours are retained. For backups older than 24 hours, only the first backup completed after 00:00 each day is retained, and all others are deleted.</li>
         * <li>After enhanced backup is enabled, the backup cycle parameter <strong>PreferredBackupPeriod</strong> is set to all days of the week by default (Monday through Sunday).</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder backupFrequency(String backupFrequency) {
            this.backupFrequency = backupFrequency;
            return this;
        }

        /**
         * <p>The current backup policy level. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: regular backup</li>
         * <li><strong>Advanced</strong>: advanced backup<blockquote>
         * <ul>
         * <li>This parameter is not supported for PolarDB for PostgreSQL (Compatible with Oracle) or PolarDB for PostgreSQL.</li>
         * </ul>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder backupPolicyLevel(String backupPolicyLevel) {
            this.backupPolicyLevel = backupPolicyLevel;
            return this;
        }

        /**
         * <p>Specifies whether to retain backups when the cluster is deleted. Valid values:</p>
         * <ul>
         * <li><strong>ALL</strong>: All backups are retained with long-term retention (LTR).</li>
         * <li><strong>LATEST</strong>: The last backup is retained with long-term retention (LTR).</li>
         * <li><strong>NONE</strong> (default): No backups are retained.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NONE</p>
         */
        public Builder backupRetentionPolicyOnClusterDeletion(String backupRetentionPolicyOnClusterDeletion) {
            this.backupRetentionPolicyOnClusterDeletion = backupRetentionPolicyOnClusterDeletion;
            return this;
        }

        /**
         * <p>The backup frequency. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong> (default): regular backup. A backup is performed once a day at a scheduled time.</li>
         * <li><strong>2/24H</strong>: high-frequency backup. A backup is performed every 2 hours.</li>
         * <li><strong>3/24H</strong>: high-frequency backup. A backup is performed every 3 hours.</li>
         * <li><strong>4/24H</strong>: high-frequency backup. A backup is performed every 4 hours.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><ul>
         * <li>This parameter is not supported for PolarDB for PostgreSQL (Compatible with Oracle) or PolarDB for PostgreSQL.</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li>If the region of your PolarDB for MySQL cluster does not support the cross-region backup feature, this parameter is not supported. For the regions that support cross-region backup, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li>After advanced backup is enabled, use the AdvancedDataPolicies parameter instead of this parameter.</li>
         * </ul>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder dataLevel1BackupFrequency(String dataLevel1BackupFrequency) {
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
         * <li>At least two days must be selected. Separate multiple values with commas (,).</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li>This parameter is not supported for PolarDB for PostgreSQL (Compatible with Oracle) or PolarDB for PostgreSQL.</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li>If the region of your PolarDB for MySQL cluster does not support the cross-region backup feature, this parameter is not supported. For the regions that support cross-region backup, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li>After advanced backup is enabled, use the AdvancedDataPolicies parameter instead of this parameter.</li>
         * </ul>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Monday,Tuesday</p>
         */
        public Builder dataLevel1BackupPeriod(String dataLevel1BackupPeriod) {
            this.dataLevel1BackupPeriod = dataLevel1BackupPeriod;
            return this;
        }

        /**
         * <p>The retention period of level-1 backups. Valid values: 3 to 14. Unit: days.</p>
         * <blockquote>
         * <p>After advanced backup is enabled, use the AdvancedDataPolicies parameter instead of this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder dataLevel1BackupRetentionPeriod(String dataLevel1BackupRetentionPeriod) {
            this.dataLevel1BackupRetentionPeriod = dataLevel1BackupRetentionPeriod;
            return this;
        }

        /**
         * <p>The time period during which automatic backups are performed. The value is in the <code>hh:mmZ-hh:mmZ</code> format (UTC). The start and end times must be on the hour and exactly 1 hour apart. Example: <code>14:00Z-15:00Z</code>.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter is not supported for PolarDB for PostgreSQL (Compatible with Oracle) or PolarDB for PostgreSQL.</li>
         * <li>If the region of your PolarDB for MySQL cluster does not support the cross-region backup feature, this parameter is not supported. For the regions that support cross-region backup, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>15:00Z-16:00Z</p>
         */
        public Builder dataLevel1BackupTime(String dataLevel1BackupTime) {
            this.dataLevel1BackupTime = dataLevel1BackupTime;
            return this;
        }

        /**
         * <p>The cross-region backup region for level-2 backups. For the regions that support cross-region backup, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</p>
         * <blockquote>
         * <p>After advanced backup is enabled, use the AdvancedDataPolicies parameter instead of this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder dataLevel2BackupAnotherRegionRegion(String dataLevel2BackupAnotherRegionRegion) {
            this.dataLevel2BackupAnotherRegionRegion = dataLevel2BackupAnotherRegionRegion;
            return this;
        }

        /**
         * <p>The retention epoch of cross-region backups for level-2 backups. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: The level-2 backup feature is shutdown.</p>
         * </li>
         * <li><p><strong>30 to 7300</strong>: The retention epoch of level-2 backups. Unit: days.</p>
         * </li>
         * <li><p><strong>-1</strong>: Level-2 backups are retained with long-term retention (LTR).</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><ul>
         * <li>When a cluster is created, the default value is <strong>0</strong>, which means the cross-region backup feature for level-2 backups is shutdown.</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li>After advanced backup is enabled, use the AdvancedDataPolicies parameter instead of this parameter.</li>
         * </ul>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder dataLevel2BackupAnotherRegionRetentionPeriod(String dataLevel2BackupAnotherRegionRetentionPeriod) {
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
         * <li>At least two days must be selected. Separate multiple values with commas (,).</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li>This parameter is not supported for PolarDB for PostgreSQL (Compatible with Oracle) or PolarDB for PostgreSQL.</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li>If the region of your PolarDB for MySQL cluster does not support the cross-region backup feature, this parameter is not supported. For the regions that support cross-region backup, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li>After advanced backup is enabled, use the AdvancedDataPolicies parameter instead of this parameter.</li>
         * </ul>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Monday,Tuesday</p>
         */
        public Builder dataLevel2BackupPeriod(String dataLevel2BackupPeriod) {
            this.dataLevel2BackupPeriod = dataLevel2BackupPeriod;
            return this;
        }

        /**
         * <p>The retention epoch of level-2 backups. Valid values:</p>
         * <ul>
         * <li>0: The level-2 backup feature is shutdown.</li>
         * <li>30 to 7300: The retention epoch of level-2 backups. Unit: days.</li>
         * <li>-1: Level-2 backups are retained with long-term retention (LTR).</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><ul>
         * <li>When a cluster is created, the default value is <strong>0</strong>, which means the level-2 backup feature is shutdown.</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li>After advanced backup is enabled, use the AdvancedDataPolicies parameter instead of this parameter.</li>
         * </ul>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder dataLevel2BackupRetentionPeriod(String dataLevel2BackupRetentionPeriod) {
            this.dataLevel2BackupRetentionPeriod = dataLevel2BackupRetentionPeriod;
            return this;
        }

        /**
         * <p>Indicates whether immutable cross-region backup is enabled.</p>
         */
        public Builder enableCrossRegionImmutableBackup(Boolean enableCrossRegionImmutableBackup) {
            this.enableCrossRegionImmutableBackup = enableCrossRegionImmutableBackup;
            return this;
        }

        /**
         * <p>Indicates whether immutable backup is enabled.</p>
         */
        public Builder enableImmutableBackup(Boolean enableImmutableBackup) {
            this.enableImmutableBackup = enableImmutableBackup;
            return this;
        }

        /**
         * <p>The data backup cycle. Valid values:</p>
         * <ul>
         * <li>Monday</li>
         * <li>Tuesday</li>
         * <li>Wednesday</li>
         * <li>Thursday</li>
         * <li>Friday</li>
         * <li>Saturday</li>
         * <li>Sunday<blockquote>
         * <p>After advanced backup is enabled, use the AdvancedDataPolicies parameter instead of this parameter.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday</p>
         */
        public Builder preferredBackupPeriod(String preferredBackupPeriod) {
            this.preferredBackupPeriod = preferredBackupPeriod;
            return this;
        }

        /**
         * <p>The time period during which automatic backups are performed. The value is in the <code>HH:mmZ-HH:mmZ</code> format (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>07:00Z-08:00Z</p>
         */
        public Builder preferredBackupTime(String preferredBackupTime) {
            this.preferredBackupTime = preferredBackupTime;
            return this;
        }

        /**
         * <p>The time of the next backup. The value is in the <code>YYYY-MM-DDThh:mmZ</code> format (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-16T07:30Z</p>
         */
        public Builder preferredNextBackupTime(String preferredNextBackupTime) {
            this.preferredNextBackupTime = preferredNextBackupTime;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EADFCE0F-9FB5-4685-B395-1440B******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBackupPolicyResponseBody build() {
            return new DescribeBackupPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBackupPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupPolicyResponseBody</p>
     */
    public static class AdvancedDataPolicy extends TeaModel {
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

        private AdvancedDataPolicy(Builder builder) {
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

        public static AdvancedDataPolicy create() {
            return builder().build();
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

            private Builder(AdvancedDataPolicy model) {
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
             * AutoCreated.
             */
            public Builder autoCreated(Boolean autoCreated) {
                this.autoCreated = autoCreated;
                return this;
            }

            /**
             * BakType.
             */
            public Builder bakType(String bakType) {
                this.bakType = bakType;
                return this;
            }

            /**
             * DestRegion.
             */
            public Builder destRegion(String destRegion) {
                this.destRegion = destRegion;
                return this;
            }

            /**
             * DestType.
             */
            public Builder destType(String destType) {
                this.destType = destType;
                return this;
            }

            /**
             * DumpAction.
             */
            public Builder dumpAction(String dumpAction) {
                this.dumpAction = dumpAction;
                return this;
            }

            /**
             * FilterKey.
             */
            public Builder filterKey(String filterKey) {
                this.filterKey = filterKey;
                return this;
            }

            /**
             * FilterType.
             */
            public Builder filterType(String filterType) {
                this.filterType = filterType;
                return this;
            }

            /**
             * FilterValue.
             */
            public Builder filterValue(String filterValue) {
                this.filterValue = filterValue;
                return this;
            }

            /**
             * OnlyPreserveOneEachDay.
             */
            public Builder onlyPreserveOneEachDay(Boolean onlyPreserveOneEachDay) {
                this.onlyPreserveOneEachDay = onlyPreserveOneEachDay;
                return this;
            }

            /**
             * OnlyPreserveOneEachHour.
             */
            public Builder onlyPreserveOneEachHour(Boolean onlyPreserveOneEachHour) {
                this.onlyPreserveOneEachHour = onlyPreserveOneEachHour;
                return this;
            }

            /**
             * PolicyId.
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * RetentionType.
             */
            public Builder retentionType(String retentionType) {
                this.retentionType = retentionType;
                return this;
            }

            /**
             * RetentionValue.
             */
            public Builder retentionValue(String retentionValue) {
                this.retentionValue = retentionValue;
                return this;
            }

            /**
             * SrcRegion.
             */
            public Builder srcRegion(String srcRegion) {
                this.srcRegion = srcRegion;
                return this;
            }

            /**
             * SrcType.
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

            public AdvancedDataPolicy build() {
                return new AdvancedDataPolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeBackupPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupPolicyResponseBody</p>
     */
    public static class AdvancedDataPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdvancedDataPolicy")
        private java.util.List<AdvancedDataPolicy> advancedDataPolicy;

        private AdvancedDataPolicies(Builder builder) {
            this.advancedDataPolicy = builder.advancedDataPolicy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdvancedDataPolicies create() {
            return builder().build();
        }

        /**
         * @return advancedDataPolicy
         */
        public java.util.List<AdvancedDataPolicy> getAdvancedDataPolicy() {
            return this.advancedDataPolicy;
        }

        public static final class Builder {
            private java.util.List<AdvancedDataPolicy> advancedDataPolicy; 

            private Builder() {
            } 

            private Builder(AdvancedDataPolicies model) {
                this.advancedDataPolicy = model.advancedDataPolicy;
            } 

            /**
             * AdvancedDataPolicy.
             */
            public Builder advancedDataPolicy(java.util.List<AdvancedDataPolicy> advancedDataPolicy) {
                this.advancedDataPolicy = advancedDataPolicy;
                return this;
            }

            public AdvancedDataPolicies build() {
                return new AdvancedDataPolicies(this);
            } 

        } 

    }
}
