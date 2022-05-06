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
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.restoreSize = request.restoreSize;
            this.retention = request.retention;
            this.zoneId = request.zoneId;
        } 

        /**
         * BackupFile.
         */
        public Builder backupFile(String backupFile) {
            this.putQueryParameter("BackupFile", backupFile);
            this.backupFile = backupFile;
            return this;
        }

        /**
         * BucketRegion.
         */
        public Builder bucketRegion(String bucketRegion) {
            this.putQueryParameter("BucketRegion", bucketRegion);
            this.bucketRegion = bucketRegion;
            return this;
        }

        /**
         * Comment.
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * EngineVersion.
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * RestoreSize.
         */
        public Builder restoreSize(Integer restoreSize) {
            this.putQueryParameter("RestoreSize", restoreSize);
            this.restoreSize = restoreSize;
            return this;
        }

        /**
         * Retention.
         */
        public Builder retention(Integer retention) {
            this.putQueryParameter("Retention", retention);
            this.retention = retention;
            return this;
        }

        /**
         * ZoneId.
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
