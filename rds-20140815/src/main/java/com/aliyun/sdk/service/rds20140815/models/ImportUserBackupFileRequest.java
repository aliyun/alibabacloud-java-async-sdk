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
 * {@link ImportUserBackupFileRequest} extends {@link RequestModel}
 *
 * <p>ImportUserBackupFileRequest</p>
 */
public class ImportUserBackupFileRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupFile")
    private String backupFile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BucketRegion")
    private String bucketRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BuildReplication")
    private Boolean buildReplication;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Comment")
    @com.aliyun.core.annotation.Validation(maxLength = 256, minLength = 2)
    private String comment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EngineVersion")
    private String engineVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MasterInfo")
    private String masterInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mode")
    private String mode;

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
    @com.aliyun.core.annotation.NameInMap("RestoreSize")
    private Integer restoreSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Retention")
    private Integer retention;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceInfo")
    private String sourceInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private ImportUserBackupFileRequest(Builder builder) {
        super(builder);
        this.backupFile = builder.backupFile;
        this.bucketRegion = builder.bucketRegion;
        this.buildReplication = builder.buildReplication;
        this.comment = builder.comment;
        this.DBInstanceId = builder.DBInstanceId;
        this.engineVersion = builder.engineVersion;
        this.masterInfo = builder.masterInfo;
        this.mode = builder.mode;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.restoreSize = builder.restoreSize;
        this.retention = builder.retention;
        this.sourceInfo = builder.sourceInfo;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportUserBackupFileRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupFile
     */
    public String getBackupFile() {
        return this.backupFile;
    }

    /**
     * @return bucketRegion
     */
    public String getBucketRegion() {
        return this.bucketRegion;
    }

    /**
     * @return buildReplication
     */
    public Boolean getBuildReplication() {
        return this.buildReplication;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return engineVersion
     */
    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * @return masterInfo
     */
    public String getMasterInfo() {
        return this.masterInfo;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
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
     * @return restoreSize
     */
    public Integer getRestoreSize() {
        return this.restoreSize;
    }

    /**
     * @return retention
     */
    public Integer getRetention() {
        return this.retention;
    }

    /**
     * @return sourceInfo
     */
    public String getSourceInfo() {
        return this.sourceInfo;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<ImportUserBackupFileRequest, Builder> {
        private String backupFile; 
        private String bucketRegion; 
        private Boolean buildReplication; 
        private String comment; 
        private String DBInstanceId; 
        private String engineVersion; 
        private String masterInfo; 
        private String mode; 
        private Long ownerId; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Integer restoreSize; 
        private Integer retention; 
        private String sourceInfo; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(ImportUserBackupFileRequest request) {
            super(request);
            this.backupFile = request.backupFile;
            this.bucketRegion = request.bucketRegion;
            this.buildReplication = request.buildReplication;
            this.comment = request.comment;
            this.DBInstanceId = request.DBInstanceId;
            this.engineVersion = request.engineVersion;
            this.masterInfo = request.masterInfo;
            this.mode = request.mode;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.restoreSize = request.restoreSize;
            this.retention = request.retention;
            this.sourceInfo = request.sourceInfo;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>A JSON array that describes the backup file information in the OSS bucket. Example:
         * <code>{&quot;Bucket&quot;:&quot;test&quot;, &quot;Object&quot;:&quot;test/test_db_employees.xb&quot;,&quot;Location&quot;:&quot;ap-southeast-1&quot;}</code></p>
         * <p>The following list describes the parameters in the array:</p>
         * <ul>
         * <li><strong>Bucket</strong>: the name of the OSS bucket that stores the backup file. You can call <a href="https://help.aliyun.com/document_detail/31965.html">GetBucket</a> to query the bucket name.</li>
         * <li><strong>Object</strong>: the full path of the backup file in the directory. You can call <a href="https://help.aliyun.com/document_detail/31980.html">GetObject</a> to query the path.</li>
         * <li><strong>Location</strong>: the region ID of the OSS bucket. You can call <a href="https://help.aliyun.com/document_detail/31967.html">GetBucketLocation</a> to query the region ID.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Bucket&quot;:&quot;test&quot;, &quot;Object&quot;:&quot;test/test_db_employees.xb&quot;,&quot;Location&quot;:&quot;ap-southeast-1&quot;}</p>
         */
        public Builder backupFile(String backupFile) {
            this.putQueryParameter("BackupFile", backupFile);
            this.backupFile = backupFile;
            return this;
        }

        /**
         * <p>The region ID of the OSS bucket that stores the backup file of the self-managed MySQL 5.7 database. You can call DescribeRegions to query the region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder bucketRegion(String bucketRegion) {
            this.putQueryParameter("BucketRegion", bucketRegion);
            this.bucketRegion = bucketRegion;
            return this;
        }

        /**
         * <p>Specifies whether to automatically set up replication. Valid values:</p>
         * <ul>
         * <li>true: automatically sets up replication. The <code>MasterInfo</code> parameter is required.</li>
         * <li>false: does not set up replication.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter takes effect only for native replication instances. You must specify the <code>DBInstanceId</code> parameter when you call this operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder buildReplication(Boolean buildReplication) {
            this.putQueryParameter("BuildReplication", buildReplication);
            this.buildReplication = buildReplication;
            return this;
        }

        /**
         * <p>The description of the user backup to be imported.</p>
         * 
         * <strong>example:</strong>
         * <p>BackupTest</p>
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The version of the MySQL database engine. Valid values: <strong>5.7</strong> and <strong>8.0</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>5.7</p>
         */
        public Builder engineVersion(String engineVersion) {
            this.putQueryParameter("EngineVersion", engineVersion);
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * <p>A JSON array that contains the master information for setting up MySQL replication (case-sensitive). Example:</p>
         * <pre><code>{&quot;masterIp&quot;:&quot;172.20.xx.xx&quot;,&quot;masterPort&quot;:&quot;3306&quot;,&quot;masterUser&quot;:&quot;replica&quot;,&quot;masterPassword&quot;:&quot;W33uopkehBQ=&quot;}
         * </code></pre>
         * <p>The following list describes the parameters in the array:</p>
         * <ul>
         * <li><code>masterIp</code>: the IP address of the primary database.</li>
         * <li><code>masterPort</code>: the port of the primary database.</li>
         * <li><code>masterUser</code>: the replication account of the primary database.</li>
         * <li><code>masterPassword</code>: the password of the replication account for the primary database. The password must be Base64-encoded.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter takes effect only for native replication instances. You must specify the <code>DBInstanceId</code> parameter when you call this operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;masterIp&quot;:&quot;172.20.xx.xx&quot;,&quot;masterPort&quot;:&quot;3306&quot;,&quot;masterUser&quot;:&quot;replica&quot;,&quot;masterPassword&quot;:&quot;W33uopkehBQ=&quot;}</p>
         */
        public Builder masterInfo(String masterInfo) {
            this.putQueryParameter("MasterInfo", masterInfo);
            this.masterInfo = masterInfo;
            return this;
        }

        /**
         * <p>The import mode. Valid values:</p>
         * <ul>
         * <li>oss: imports the backup from OSS.</li>
         * <li>stream: imports the backup over the network.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oss</p>
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
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
         * <p>The region ID of the ApsaraDB RDS instance. You can call DescribeRegions to query the region ID.</p>
         * <blockquote>
         * <ul>
         * <li>The value of this parameter specifies the region ID in which you want to create the ApsaraDB RDS instance.</li>
         * <li>The value must be the same as the value of the <strong>BucketRegion</strong> parameter.</li>
         * </ul>
         * </blockquote>
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
         * <p>The resource group ID. You can call DescribeDBInstanceAttribute to query the resource group ID.</p>
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
         * <p>The storage space required to restore the user backup. Unit: GB.</p>
         * <blockquote>
         * <ul>
         * <li>The default value is five times the size of the backup file.</li>
         * <li>The minimum value is 20.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder restoreSize(Integer restoreSize) {
            this.putQueryParameter("RestoreSize", restoreSize);
            this.restoreSize = restoreSize;
            return this;
        }

        /**
         * <p>The retention period of the user backup file. Unit: days. The value must be an integer greater than <strong>0</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder retention(Integer retention) {
            this.putQueryParameter("Retention", retention);
            this.retention = retention;
            return this;
        }

        /**
         * <p>A JSON array that provides the source information for the full backup (case-sensitive). Example:</p>
         * <pre><code>{&quot;sourceIp&quot;:&quot;172.20.xx
         * .xx&quot;,&quot;sourcePort&quot;:&quot;9999&quot;}
         * </code></pre>
         * <p>The following list describes the parameters in the array:</p>
         * <ul>
         * <li><p><code>sourceIp</code>: the source IP address.</p>
         * </li>
         * <li><p><code>sourcePort</code>: the Netcat listening port on the source.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter takes effect only for native replication instances. You must specify the <code>DBInstanceId</code> parameter when you call this operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;sourceIp&quot;:&quot;172.20.xx.xx&quot;,&quot;sourcePort&quot;:&quot;9999&quot;}</p>
         */
        public Builder sourceInfo(String sourceInfo) {
            this.putQueryParameter("SourceInfo", sourceInfo);
            this.sourceInfo = sourceInfo;
            return this;
        }

        /**
         * <p>The zone ID. You can call DescribeRegions to query the zone ID.</p>
         * <blockquote>
         * <ul>
         * <li>After you specify a zone, the system creates a second-level snapshot in the zone, which significantly reduces the time required for backup import.</li>
         * <li>When you call CreateDBInstance to create an instance from the user backup, this zone is the zone in which the new instance resides.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-b</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public ImportUserBackupFileRequest build() {
            return new ImportUserBackupFileRequest(this);
        } 

    } 

}
