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
 * {@link CheckCreateDdrDBInstanceRequest} extends {@link RequestModel}
 *
 * <p>CheckCreateDdrDBInstanceRequest</p>
 */
public class CheckCreateDdrDBInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupSetId")
    private String backupSetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceClass")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceStorage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer DBInstanceStorage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Engine")
    @com.aliyun.core.annotation.Validation(required = true)
    private String engine;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EngineVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String engineVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RestoreTime")
    private String restoreTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RestoreType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String restoreType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceDBInstanceName")
    private String sourceDBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceRegion")
    private String sourceRegion;

    private CheckCreateDdrDBInstanceRequest(Builder builder) {
        super(builder);
        this.backupSetId = builder.backupSetId;
        this.DBInstanceClass = builder.DBInstanceClass;
        this.DBInstanceStorage = builder.DBInstanceStorage;
        this.engine = builder.engine;
        this.engineVersion = builder.engineVersion;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.restoreTime = builder.restoreTime;
        this.restoreType = builder.restoreType;
        this.sourceDBInstanceName = builder.sourceDBInstanceName;
        this.sourceRegion = builder.sourceRegion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckCreateDdrDBInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupSetId
     */
    public String getBackupSetId() {
        return this.backupSetId;
    }

    /**
     * @return DBInstanceClass
     */
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    /**
     * @return DBInstanceStorage
     */
    public Integer getDBInstanceStorage() {
        return this.DBInstanceStorage;
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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

    /**
     * @return restoreTime
     */
    public String getRestoreTime() {
        return this.restoreTime;
    }

    /**
     * @return restoreType
     */
    public String getRestoreType() {
        return this.restoreType;
    }

    /**
     * @return sourceDBInstanceName
     */
    public String getSourceDBInstanceName() {
        return this.sourceDBInstanceName;
    }

    /**
     * @return sourceRegion
     */
    public String getSourceRegion() {
        return this.sourceRegion;
    }

    public static final class Builder extends Request.Builder<CheckCreateDdrDBInstanceRequest, Builder> {
        private String backupSetId; 
        private String DBInstanceClass; 
        private Integer DBInstanceStorage; 
        private String engine; 
        private String engineVersion; 
        private Long ownerId; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String restoreTime; 
        private String restoreType; 
        private String sourceDBInstanceName; 
        private String sourceRegion; 

        private Builder() {
            super();
        } 

        private Builder(CheckCreateDdrDBInstanceRequest request) {
            super(request);
            this.backupSetId = request.backupSetId;
            this.DBInstanceClass = request.DBInstanceClass;
            this.DBInstanceStorage = request.DBInstanceStorage;
            this.engine = request.engine;
            this.engineVersion = request.engineVersion;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.restoreTime = request.restoreTime;
            this.restoreType = request.restoreType;
            this.sourceDBInstanceName = request.sourceDBInstanceName;
            this.sourceRegion = request.sourceRegion;
        } 

        /**
         * <p>The ID of the backup set that is used for the restoration. You can call the DescribeCrossRegionBackups operation to query the backup set ID.</p>
         * <blockquote>
         * <p> This parameter must be specified when the <strong>RestoreType</strong> parameter is set to <strong>0</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>14358</p>
         */
        public Builder backupSetId(String backupSetId) {
            this.putQueryParameter("BackupSetId", backupSetId);
            this.backupSetId = backupSetId;
            return this;
        }

        /**
         * <p>The instance type of the destination instance. For more information, see <a href="https://help.aliyun.com/document_detail/26312.html">Primary ApsaraDB RDS instance types</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rds.mysql.s1.small</p>
         */
        public Builder DBInstanceClass(String DBInstanceClass) {
            this.putQueryParameter("DBInstanceClass", DBInstanceClass);
            this.DBInstanceClass = DBInstanceClass;
            return this;
        }

        /**
         * <p>The storage capacity of the destination instance. Valid values: <strong>5 to 2000</strong>. Unit: GB. You can increase the storage capacity in increments of 5 GB. For more information, see <a href="https://help.aliyun.com/document_detail/26312.html">Primary instance types</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder DBInstanceStorage(Integer DBInstanceStorage) {
            this.putQueryParameter("DBInstanceStorage", DBInstanceStorage);
            this.DBInstanceStorage = DBInstanceStorage;
            return this;
        }

        /**
         * <p>The database engine of the destination instance. Valid values:</p>
         * <ul>
         * <li><strong>MySQL</strong></li>
         * <li><strong>SQLServer</strong></li>
         * <li><strong>PostgreSQL</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * <p>The major engine version of the destination instance. The value of this parameter varies based on the value of <strong>Engine</strong>.</p>
         * <ul>
         * <li>Valid values when Engine is set to MySQL: <strong>5.5, 5.6, 5.7, and 8.0</strong></li>
         * <li>Valid values when Engine is set to SQLServer: <strong>2008r2, 08r2_ent_ha, 2012, 2012_ent_ha, 2012_std_ha, 2012_web, 2014_std_ha, 2016_ent_ha, 2016_std_ha, 2016_web, 2017_std_ha, 2017_ent, 2019_std_ha, and 2019_ent</strong></li>
         * <li>PostgreSQL: <strong>10.0, 11.0, 12.0, 13.0, 14.0, and 15.0</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5.6</p>
         */
        public Builder engineVersion(String engineVersion) {
            this.putQueryParameter("EngineVersion", engineVersion);
            this.engineVersion = engineVersion;
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
         * <p>The region ID of the destination instance. You can call the DescribeRegions operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The resource group ID. You can call the DescribeDBInstanceAttribute to query the resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmy****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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

        /**
         * <p>The point in time to which you want to restore data. The point in time that you specify must be earlier than the current time. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * <blockquote>
         * <p>If you set <strong>RestoreType</strong> to <strong>1</strong>, you must also specify this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2019-05-30T03:29:10Z</p>
         */
        public Builder restoreTime(String restoreTime) {
            this.putQueryParameter("RestoreTime", restoreTime);
            this.restoreTime = restoreTime;
            return this;
        }

        /**
         * <p>The method that is used to restore data. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: restores data from a backup set. If you set this parameter to 0, you must also specify the <strong>BackupSetId</strong> parameter.</li>
         * <li><strong>1</strong>: restores data to a point in time. If you set this parameter to 1, you must also specify the <strong>RestoreTime</strong>, <strong>SourceRegion</strong>, and <strong>SourceDBInstanceName</strong> parameters.</li>
         * </ul>
         * <p>Default value: <strong>0</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder restoreType(String restoreType) {
            this.putQueryParameter("RestoreType", restoreType);
            this.restoreType = restoreType;
            return this;
        }

        /**
         * <p>The ID of the source instance if you want to restore data to a point in time.</p>
         * <blockquote>
         * <p> This parameter must be specified when the <strong>RestoreType</strong> parameter is set to <strong>1</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5xxxxxxx</p>
         */
        public Builder sourceDBInstanceName(String sourceDBInstanceName) {
            this.putQueryParameter("SourceDBInstanceName", sourceDBInstanceName);
            this.sourceDBInstanceName = sourceDBInstanceName;
            return this;
        }

        /**
         * <p>The region ID of the source instance if you want to restore data to a point in time.</p>
         * <blockquote>
         * <p>If you set <strong>RestoreType</strong> to <strong>1</strong>, you must also specify this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder sourceRegion(String sourceRegion) {
            this.putQueryParameter("SourceRegion", sourceRegion);
            this.sourceRegion = sourceRegion;
            return this;
        }

        @Override
        public CheckCreateDdrDBInstanceRequest build() {
            return new CheckCreateDdrDBInstanceRequest(this);
        } 

    } 

}
