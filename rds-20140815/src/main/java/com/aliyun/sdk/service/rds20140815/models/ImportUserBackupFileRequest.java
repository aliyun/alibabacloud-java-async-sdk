// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportUserBackupFileRequest} extends {@link RequestModel}
 *
 * <p>ImportUserBackupFileRequest</p>
 */
public class ImportUserBackupFileRequest extends Request {
    @Query
    @NameInMap("BackupFile")
    @Validation(required = true)
    private String backupFile;

    @Query
    @NameInMap("BucketRegion")
    @Validation(required = true)
    private String bucketRegion;

    @Query
    @NameInMap("Comment")
    @Validation(maxLength = 256, minLength = 2)
    private String comment;

    @Query
    @NameInMap("EngineVersion")
    private String engineVersion;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RestoreSize")
    private Integer restoreSize;

    @Query
    @NameInMap("Retention")
    private Integer retention;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    private ImportUserBackupFileRequest(Builder builder) {
        super(builder);
        this.backupFile = builder.backupFile;
        this.bucketRegion = builder.bucketRegion;
        this.comment = builder.comment;
        this.engineVersion = builder.engineVersion;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.restoreSize = builder.restoreSize;
        this.retention = builder.retention;
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
     * @return comment
     */
    public String getComment() {
        return this.comment;
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
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<ImportUserBackupFileRequest, Builder> {
        private String backupFile; 
        private String bucketRegion; 
        private String comment; 
        private String engineVersion; 
        private Long ownerId; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Integer restoreSize; 
        private Integer retention; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(ImportUserBackupFileRequest request) {
            super(request);
            this.backupFile = request.backupFile;
            this.bucketRegion = request.bucketRegion;
            this.comment = request.comment;
            this.engineVersion = request.engineVersion;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.restoreSize = request.restoreSize;
            this.retention = request.retention;
            this.zoneId = request.zoneId;
        } 

        /**
         * A JSON array that consists of the information about the full backup file stored as an object in an OSS bucket. Example: `{"Bucket":"test", "Object":"test/test_db_employees.xb","Location":"ap-southeast-1"}`
         * <p>
         * 
         * The JSON array contains the following fields:
         * 
         * *   **Bucket**: The name of the OSS bucket in which the full backup file is stored as an object. You can call the [GetBucket](~~31965~~) operation to query the name of the bucket.
         * *   **Object**: The path of the full backup file that is stored as an object in the OSS bucket. You can call the [GetObject](~~31980~~) operation to query the path of the object.
         * *   **Location**: The ID of the region in which the OSS bucket is located. You can call the [GetBucketLocation](~~31967~~) operation to query the region of the bucket.
         */
        public Builder backupFile(String backupFile) {
            this.putQueryParameter("BackupFile", backupFile);
            this.backupFile = backupFile;
            return this;
        }

        /**
         * The region ID of the OSS bucket where the full backup file of the self-managed MySQL database is located. You can call the [DescribeRegions](~~26243~~) operation to query the most recent region list.
         */
        public Builder bucketRegion(String bucketRegion) {
            this.putQueryParameter("BucketRegion", bucketRegion);
            this.bucketRegion = bucketRegion;
            return this;
        }

        /**
         * The description of the full backup file.
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * The version of the database engine that is run on the self-managed MySQL database and ApsaraDB RDS for MySQL instance. Set the value to **5.7**.
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
         * The region ID of the instance. You can call the [DescribeRegions](~~26243~~) operation to query the most recent region list.
         * <p>
         * 
         * > 
         * 
         * *   The value of this parameter is the ID of the region in which you want to create the instance.
         * 
         * *   The value of this parameter must be consistent with the value of **BucketRegion**.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceGroupId.
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
         * The amount of storage that is required to restore the data of the full backup file. Unit: GB.
         * <p>
         * 
         * > 
         * 
         * *   The default value of this parameter is 5 times the size of the full backup file.
         * 
         * *   The minimum value of this parameter is 20.
         */
        public Builder restoreSize(Integer restoreSize) {
            this.putQueryParameter("RestoreSize", restoreSize);
            this.restoreSize = restoreSize;
            return this;
        }

        /**
         * The retention period of the full backup file. Unit: days. Valid values: any **non-zero** positive integer.
         */
        public Builder retention(Integer retention) {
            this.putQueryParameter("Retention", retention);
            this.retention = retention;
            return this;
        }

        /**
         * The ID of the zone. You can call the [DescribeRegions](~~26243~~) operation to query the ID of the zone.
         * <p>
         * 
         * > 
         * 
         * *   If you specify this parameter, the system creates a snapshot in single-digit seconds, which greatly reduces the time that is required to import the full backup file.
         * 
         * *   When you call the [CreateDBInstance](~~26228~~) operation to create an instance by using the full backup file, the instance is created in the zone that you specify for this parameter.
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
