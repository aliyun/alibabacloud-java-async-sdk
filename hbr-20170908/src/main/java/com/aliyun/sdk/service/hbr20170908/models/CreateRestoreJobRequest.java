// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRestoreJobRequest} extends {@link RequestModel}
 *
 * <p>CreateRestoreJobRequest</p>
 */
public class CreateRestoreJobRequest extends Request {
    @Body
    @NameInMap("Exclude")
    private String exclude;

    @Body
    @NameInMap("Include")
    private String include;

    @Body
    @NameInMap("OtsDetail")
    private OtsDetail otsDetail;

    @Query
    @NameInMap("RestoreType")
    @Validation(required = true)
    private String restoreType;

    @Query
    @NameInMap("SnapshotHash")
    private String snapshotHash;

    @Query
    @NameInMap("SnapshotId")
    private String snapshotId;

    @Query
    @NameInMap("SourceType")
    @Validation(required = true)
    private String sourceType;

    @Query
    @NameInMap("TargetBucket")
    private String targetBucket;

    @Query
    @NameInMap("TargetCreateTime")
    private Long targetCreateTime;

    @Query
    @NameInMap("TargetFileSystemId")
    private String targetFileSystemId;

    @Body
    @NameInMap("TargetInstanceId")
    private String targetInstanceId;

    @Query
    @NameInMap("TargetInstanceName")
    private String targetInstanceName;

    @Body
    @NameInMap("TargetPath")
    private String targetPath;

    @Query
    @NameInMap("TargetPrefix")
    private String targetPrefix;

    @Query
    @NameInMap("TargetTableName")
    private String targetTableName;

    @Query
    @NameInMap("TargetTime")
    private Long targetTime;

    @Query
    @NameInMap("VaultId")
    private String vaultId;

    private CreateRestoreJobRequest(Builder builder) {
        super(builder);
        this.exclude = builder.exclude;
        this.include = builder.include;
        this.otsDetail = builder.otsDetail;
        this.restoreType = builder.restoreType;
        this.snapshotHash = builder.snapshotHash;
        this.snapshotId = builder.snapshotId;
        this.sourceType = builder.sourceType;
        this.targetBucket = builder.targetBucket;
        this.targetCreateTime = builder.targetCreateTime;
        this.targetFileSystemId = builder.targetFileSystemId;
        this.targetInstanceId = builder.targetInstanceId;
        this.targetInstanceName = builder.targetInstanceName;
        this.targetPath = builder.targetPath;
        this.targetPrefix = builder.targetPrefix;
        this.targetTableName = builder.targetTableName;
        this.targetTime = builder.targetTime;
        this.vaultId = builder.vaultId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRestoreJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return exclude
     */
    public String getExclude() {
        return this.exclude;
    }

    /**
     * @return include
     */
    public String getInclude() {
        return this.include;
    }

    /**
     * @return otsDetail
     */
    public OtsDetail getOtsDetail() {
        return this.otsDetail;
    }

    /**
     * @return restoreType
     */
    public String getRestoreType() {
        return this.restoreType;
    }

    /**
     * @return snapshotHash
     */
    public String getSnapshotHash() {
        return this.snapshotHash;
    }

    /**
     * @return snapshotId
     */
    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return targetBucket
     */
    public String getTargetBucket() {
        return this.targetBucket;
    }

    /**
     * @return targetCreateTime
     */
    public Long getTargetCreateTime() {
        return this.targetCreateTime;
    }

    /**
     * @return targetFileSystemId
     */
    public String getTargetFileSystemId() {
        return this.targetFileSystemId;
    }

    /**
     * @return targetInstanceId
     */
    public String getTargetInstanceId() {
        return this.targetInstanceId;
    }

    /**
     * @return targetInstanceName
     */
    public String getTargetInstanceName() {
        return this.targetInstanceName;
    }

    /**
     * @return targetPath
     */
    public String getTargetPath() {
        return this.targetPath;
    }

    /**
     * @return targetPrefix
     */
    public String getTargetPrefix() {
        return this.targetPrefix;
    }

    /**
     * @return targetTableName
     */
    public String getTargetTableName() {
        return this.targetTableName;
    }

    /**
     * @return targetTime
     */
    public Long getTargetTime() {
        return this.targetTime;
    }

    /**
     * @return vaultId
     */
    public String getVaultId() {
        return this.vaultId;
    }

    public static final class Builder extends Request.Builder<CreateRestoreJobRequest, Builder> {
        private String exclude; 
        private String include; 
        private OtsDetail otsDetail; 
        private String restoreType; 
        private String snapshotHash; 
        private String snapshotId; 
        private String sourceType; 
        private String targetBucket; 
        private Long targetCreateTime; 
        private String targetFileSystemId; 
        private String targetInstanceId; 
        private String targetInstanceName; 
        private String targetPath; 
        private String targetPrefix; 
        private String targetTableName; 
        private Long targetTime; 
        private String vaultId; 

        private Builder() {
            super();
        } 

        private Builder(CreateRestoreJobRequest response) {
            super(response);
            this.exclude = response.exclude;
            this.include = response.include;
            this.otsDetail = response.otsDetail;
            this.restoreType = response.restoreType;
            this.snapshotHash = response.snapshotHash;
            this.snapshotId = response.snapshotId;
            this.sourceType = response.sourceType;
            this.targetBucket = response.targetBucket;
            this.targetCreateTime = response.targetCreateTime;
            this.targetFileSystemId = response.targetFileSystemId;
            this.targetInstanceId = response.targetInstanceId;
            this.targetInstanceName = response.targetInstanceName;
            this.targetPath = response.targetPath;
            this.targetPrefix = response.targetPrefix;
            this.targetTableName = response.targetTableName;
            this.targetTime = response.targetTime;
            this.vaultId = response.vaultId;
        } 

        /**
         * Exclude.
         */
        public Builder exclude(String exclude) {
            this.putBodyParameter("Exclude", exclude);
            this.exclude = exclude;
            return this;
        }

        /**
         * Include.
         */
        public Builder include(String include) {
            this.putBodyParameter("Include", include);
            this.include = include;
            return this;
        }

        /**
         * OtsDetail.
         */
        public Builder otsDetail(OtsDetail otsDetail) {
            this.putBodyParameter("OtsDetail", otsDetail);
            this.otsDetail = otsDetail;
            return this;
        }

        /**
         * RestoreType.
         */
        public Builder restoreType(String restoreType) {
            this.putQueryParameter("RestoreType", restoreType);
            this.restoreType = restoreType;
            return this;
        }

        /**
         * SnapshotHash.
         */
        public Builder snapshotHash(String snapshotHash) {
            this.putQueryParameter("SnapshotHash", snapshotHash);
            this.snapshotHash = snapshotHash;
            return this;
        }

        /**
         * SnapshotId.
         */
        public Builder snapshotId(String snapshotId) {
            this.putQueryParameter("SnapshotId", snapshotId);
            this.snapshotId = snapshotId;
            return this;
        }

        /**
         * SourceType.
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * TargetBucket.
         */
        public Builder targetBucket(String targetBucket) {
            this.putQueryParameter("TargetBucket", targetBucket);
            this.targetBucket = targetBucket;
            return this;
        }

        /**
         * TargetCreateTime.
         */
        public Builder targetCreateTime(Long targetCreateTime) {
            this.putQueryParameter("TargetCreateTime", targetCreateTime);
            this.targetCreateTime = targetCreateTime;
            return this;
        }

        /**
         * TargetFileSystemId.
         */
        public Builder targetFileSystemId(String targetFileSystemId) {
            this.putQueryParameter("TargetFileSystemId", targetFileSystemId);
            this.targetFileSystemId = targetFileSystemId;
            return this;
        }

        /**
         * TargetInstanceId.
         */
        public Builder targetInstanceId(String targetInstanceId) {
            this.putBodyParameter("TargetInstanceId", targetInstanceId);
            this.targetInstanceId = targetInstanceId;
            return this;
        }

        /**
         * TargetInstanceName.
         */
        public Builder targetInstanceName(String targetInstanceName) {
            this.putQueryParameter("TargetInstanceName", targetInstanceName);
            this.targetInstanceName = targetInstanceName;
            return this;
        }

        /**
         * TargetPath.
         */
        public Builder targetPath(String targetPath) {
            this.putBodyParameter("TargetPath", targetPath);
            this.targetPath = targetPath;
            return this;
        }

        /**
         * TargetPrefix.
         */
        public Builder targetPrefix(String targetPrefix) {
            this.putQueryParameter("TargetPrefix", targetPrefix);
            this.targetPrefix = targetPrefix;
            return this;
        }

        /**
         * TargetTableName.
         */
        public Builder targetTableName(String targetTableName) {
            this.putQueryParameter("TargetTableName", targetTableName);
            this.targetTableName = targetTableName;
            return this;
        }

        /**
         * TargetTime.
         */
        public Builder targetTime(Long targetTime) {
            this.putQueryParameter("TargetTime", targetTime);
            this.targetTime = targetTime;
            return this;
        }

        /**
         * VaultId.
         */
        public Builder vaultId(String vaultId) {
            this.putQueryParameter("VaultId", vaultId);
            this.vaultId = vaultId;
            return this;
        }

        @Override
        public CreateRestoreJobRequest build() {
            return new CreateRestoreJobRequest(this);
        } 

    } 

    public static class OtsDetail extends TeaModel {
        @NameInMap("BatchChannelCount")
        private Integer batchChannelCount;

        @NameInMap("OverwriteExisting")
        private Boolean overwriteExisting;

        private OtsDetail(Builder builder) {
            this.batchChannelCount = builder.batchChannelCount;
            this.overwriteExisting = builder.overwriteExisting;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OtsDetail create() {
            return builder().build();
        }

        /**
         * @return batchChannelCount
         */
        public Integer getBatchChannelCount() {
            return this.batchChannelCount;
        }

        /**
         * @return overwriteExisting
         */
        public Boolean getOverwriteExisting() {
            return this.overwriteExisting;
        }

        public static final class Builder {
            private Integer batchChannelCount; 
            private Boolean overwriteExisting; 

            /**
             * BatchChannelCount.
             */
            public Builder batchChannelCount(Integer batchChannelCount) {
                this.batchChannelCount = batchChannelCount;
                return this;
            }

            /**
             * OverwriteExisting.
             */
            public Builder overwriteExisting(Boolean overwriteExisting) {
                this.overwriteExisting = overwriteExisting;
                return this;
            }

            public OtsDetail build() {
                return new OtsDetail(this);
            } 

        } 

    }
}
