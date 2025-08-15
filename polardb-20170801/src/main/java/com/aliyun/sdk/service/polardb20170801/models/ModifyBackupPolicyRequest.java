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
         * AdvancedDataPolicies.
         */
        public Builder advancedDataPolicies(java.util.List<AdvancedDataPolicies> advancedDataPolicies) {
            String advancedDataPoliciesShrink = shrink(advancedDataPolicies, "AdvancedDataPolicies", "json");
            this.putQueryParameter("AdvancedDataPolicies", advancedDataPoliciesShrink);
            this.advancedDataPolicies = advancedDataPolicies;
            return this;
        }

        /**
         * <p>The backup frequency. Default value: Normal. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: standard backup. The system backs up data once a day.</li>
         * <li><strong>2/24H</strong>: enhanced backup. The system backs up data every 2 hours.</li>
         * <li><strong>3/24H</strong>: enhanced backup. The system backs up data every 3 hours.</li>
         * <li><strong>4/24H</strong>: enhanced backup. The system backs up data every 4 hours.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>If you enable enhanced backup, all backups are retained for 24 hours. For backup files that are created earlier than the previous 24 hours, the system permanently retains only the first backup that is created after 00:00 every day and deletes the rest.</li>
         * <li>If you enable enhanced backup, <strong>PreferredBackupPeriod</strong> is automatically set to all days in a week (from Monday to Sunday).</li>
         * <li>This parameter is invalid if the region where your PolarDB for MySQL cluster is deployed supports the cross-region backup feature. For information about the regions that support the cross-region backup feature, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</li>
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
         * BackupPolicyLevel.
         */
        public Builder backupPolicyLevel(String backupPolicyLevel) {
            this.putQueryParameter("BackupPolicyLevel", backupPolicyLevel);
            this.backupPolicyLevel = backupPolicyLevel;
            return this;
        }

        /**
         * <p>Specifies whether to retain backups when a cluster is deleted. Valid values:</p>
         * <ul>
         * <li><strong>ALL</strong>: permanently retains all backups.</li>
         * <li><strong>LATEST</strong>: permanently retains the most recent backup.</li>
         * <li><strong>NONE</strong>: does not retain backups.</li>
         * </ul>
         * <blockquote>
         * <p> The default value of the parameter is NONE.</p>
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
         * <p>The ID of the cluster.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/98094.html">DescribeDBClusters</a> operation to query information about all clusters that are deployed in a specified region, such as the cluster ID.</p>
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
         * <p>The frequency of level-1 backups. Default value: Normal. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: standard backup. The system backs up data once a day.</li>
         * <li><strong>2/24H</strong>: enhanced backup. The system backs up data every 2 hours.</li>
         * <li><strong>3/24H</strong>: enhanced backup. The system backs up data every 3 hours.</li>
         * <li><strong>4/24H</strong>: enhanced backup. The system backs up data every 4 hours.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>This parameter is invalid for PolarDB for Oracle clusters or PolarDB for PostgreSQL clusters.</li>
         * <li>This parameter is invalid if the region where your PolarDB for MySQL cluster is deployed does not support the cross-region backup feature. For information about the regions that support the cross-region backup feature, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</li>
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
         * <p>The backup cycle of level-1 backups. Valid values:</p>
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
         * <li>You need to specify at least two values. Separate multiple values with commas (,).</li>
         * <li>This parameter is invalid for PolarDB for Oracle clusters or PolarDB for PostgreSQL clusters.</li>
         * <li>This parameter is invalid if the region where your PolarDB for MySQL cluster is deployed does not support the cross-region backup feature. For information about the regions that support the cross-region backup feature, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</li>
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
         * <p>The time period during which automatic backup for level-1 backup is performed. The time period is in the <code>hh:mmZ-hh:mmZ</code> format and is displayed in UTC. The start time and end time are on the hour and have an interval of 1 hour. Example: <code>14:00Z-15:00Z</code>.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter is invalid for PolarDB for Oracle clusters or PolarDB for PostgreSQL clusters.</li>
         * <li>This parameter is invalid if the region where your PolarDB for MySQL cluster is deployed does not support the cross-region backup feature. For information about the regions that support the cross-region backup feature, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</li>
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
         * <p>The region where the cross-region level-2 backup is stored. For information about regions that support the cross-region backup feature, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</p>
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
         * <p>The retention period of cross-region level-2 backups. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The cross-region level-2 backup feature is disabled.</li>
         * <li><strong>30 to 7300</strong>: Cross-region level-2 backups are retained for 30 to 7,300 days.</li>
         * <li><strong>1</strong>: Cross-region level-2 backups are permanently retained.</li>
         * </ul>
         * <blockquote>
         * <p> The default value of the parameter is <strong>0</strong>.</p>
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
         * <p>The backup cycle of level-2 backups. Valid values:</p>
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
         * <li>You need to specify at least two values. Separate multiple values with commas (,).</li>
         * <li>This parameter is invalid for PolarDB for Oracle clusters or PolarDB for PostgreSQL clusters.</li>
         * <li>This parameter is invalid if the region where your PolarDB for MySQL cluster is deployed does not support the cross-region backup feature. For information about the regions that support the cross-region backup feature, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</li>
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
         * <li><strong>0</strong>: The level-2 backup feature is disabled.</li>
         * <li><strong>30 to 7300</strong>: Level-2 backups are retained for 30 to 7,300 days.</li>
         * <li><strong>1</strong>: Level-2 backups are permanently retained.</li>
         * </ul>
         * <blockquote>
         * <p> The default value of this parameter is <strong>0</strong>.</p>
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
         * <p>The backup cycle. Valid values:</p>
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
         * <li>You need to specify at least two values. Separate multiple values with commas (,).</li>
         * <li>This parameter is invalid if the region where your PolarDB for MySQL cluster is deployed supports the cross-region backup feature. For information about the regions that support the cross-region backup feature, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</li>
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
         * <p>The time period during which automatic backup for level-1 backup is performed. The format is <code>hh:mmZ-hh:mmZ</code> format. The time is displayed in UTC. The start time and end time are on the hour and with an interval of one hour. Example: <code>14:00Z-15:00Z</code>.</p>
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
            } 

            /**
             * ActionType.
             */
            public Builder actionType(String actionType) {
                this.actionType = actionType;
                return this;
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

            public AdvancedDataPolicies build() {
                return new AdvancedDataPolicies(this);
            } 

        } 

    }
}
