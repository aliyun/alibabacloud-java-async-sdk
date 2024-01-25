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
    @Query
    @NameInMap("CrossAccountRoleName")
    private String crossAccountRoleName;

    @Query
    @NameInMap("CrossAccountType")
    private String crossAccountType;

    @Query
    @NameInMap("CrossAccountUserId")
    private Long crossAccountUserId;

    @Body
    @NameInMap("Exclude")
    private String exclude;

    @Query
    @NameInMap("FailbackDetail")
    private java.util.Map < String, ? > failbackDetail;

    @Body
    @NameInMap("Include")
    private String include;

    @Query
    @NameInMap("InitiatedByAck")
    private Boolean initiatedByAck;

    @Query
    @NameInMap("Options")
    private String options;

    @Body
    @NameInMap("OtsDetail")
    private OtsTableRestoreDetail otsDetail;

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
    @NameInMap("TargetContainer")
    private String targetContainer;

    @Query
    @NameInMap("TargetContainerClusterId")
    private String targetContainerClusterId;

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
    @NameInMap("UdmDetail")
    private java.util.Map < String, ? > udmDetail;

    @Query
    @NameInMap("UdmRegionId")
    private String udmRegionId;

    @Query
    @NameInMap("VaultId")
    private String vaultId;

    private CreateRestoreJobRequest(Builder builder) {
        super(builder);
        this.crossAccountRoleName = builder.crossAccountRoleName;
        this.crossAccountType = builder.crossAccountType;
        this.crossAccountUserId = builder.crossAccountUserId;
        this.exclude = builder.exclude;
        this.failbackDetail = builder.failbackDetail;
        this.include = builder.include;
        this.initiatedByAck = builder.initiatedByAck;
        this.options = builder.options;
        this.otsDetail = builder.otsDetail;
        this.restoreType = builder.restoreType;
        this.snapshotHash = builder.snapshotHash;
        this.snapshotId = builder.snapshotId;
        this.sourceType = builder.sourceType;
        this.targetBucket = builder.targetBucket;
        this.targetContainer = builder.targetContainer;
        this.targetContainerClusterId = builder.targetContainerClusterId;
        this.targetCreateTime = builder.targetCreateTime;
        this.targetFileSystemId = builder.targetFileSystemId;
        this.targetInstanceId = builder.targetInstanceId;
        this.targetInstanceName = builder.targetInstanceName;
        this.targetPath = builder.targetPath;
        this.targetPrefix = builder.targetPrefix;
        this.targetTableName = builder.targetTableName;
        this.targetTime = builder.targetTime;
        this.udmDetail = builder.udmDetail;
        this.udmRegionId = builder.udmRegionId;
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
     * @return crossAccountRoleName
     */
    public String getCrossAccountRoleName() {
        return this.crossAccountRoleName;
    }

    /**
     * @return crossAccountType
     */
    public String getCrossAccountType() {
        return this.crossAccountType;
    }

    /**
     * @return crossAccountUserId
     */
    public Long getCrossAccountUserId() {
        return this.crossAccountUserId;
    }

    /**
     * @return exclude
     */
    public String getExclude() {
        return this.exclude;
    }

    /**
     * @return failbackDetail
     */
    public java.util.Map < String, ? > getFailbackDetail() {
        return this.failbackDetail;
    }

    /**
     * @return include
     */
    public String getInclude() {
        return this.include;
    }

    /**
     * @return initiatedByAck
     */
    public Boolean getInitiatedByAck() {
        return this.initiatedByAck;
    }

    /**
     * @return options
     */
    public String getOptions() {
        return this.options;
    }

    /**
     * @return otsDetail
     */
    public OtsTableRestoreDetail getOtsDetail() {
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
     * @return targetContainer
     */
    public String getTargetContainer() {
        return this.targetContainer;
    }

    /**
     * @return targetContainerClusterId
     */
    public String getTargetContainerClusterId() {
        return this.targetContainerClusterId;
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
     * @return udmDetail
     */
    public java.util.Map < String, ? > getUdmDetail() {
        return this.udmDetail;
    }

    /**
     * @return udmRegionId
     */
    public String getUdmRegionId() {
        return this.udmRegionId;
    }

    /**
     * @return vaultId
     */
    public String getVaultId() {
        return this.vaultId;
    }

    public static final class Builder extends Request.Builder<CreateRestoreJobRequest, Builder> {
        private String crossAccountRoleName; 
        private String crossAccountType; 
        private Long crossAccountUserId; 
        private String exclude; 
        private java.util.Map < String, ? > failbackDetail; 
        private String include; 
        private Boolean initiatedByAck; 
        private String options; 
        private OtsTableRestoreDetail otsDetail; 
        private String restoreType; 
        private String snapshotHash; 
        private String snapshotId; 
        private String sourceType; 
        private String targetBucket; 
        private String targetContainer; 
        private String targetContainerClusterId; 
        private Long targetCreateTime; 
        private String targetFileSystemId; 
        private String targetInstanceId; 
        private String targetInstanceName; 
        private String targetPath; 
        private String targetPrefix; 
        private String targetTableName; 
        private Long targetTime; 
        private java.util.Map < String, ? > udmDetail; 
        private String udmRegionId; 
        private String vaultId; 

        private Builder() {
            super();
        } 

        private Builder(CreateRestoreJobRequest request) {
            super(request);
            this.crossAccountRoleName = request.crossAccountRoleName;
            this.crossAccountType = request.crossAccountType;
            this.crossAccountUserId = request.crossAccountUserId;
            this.exclude = request.exclude;
            this.failbackDetail = request.failbackDetail;
            this.include = request.include;
            this.initiatedByAck = request.initiatedByAck;
            this.options = request.options;
            this.otsDetail = request.otsDetail;
            this.restoreType = request.restoreType;
            this.snapshotHash = request.snapshotHash;
            this.snapshotId = request.snapshotId;
            this.sourceType = request.sourceType;
            this.targetBucket = request.targetBucket;
            this.targetContainer = request.targetContainer;
            this.targetContainerClusterId = request.targetContainerClusterId;
            this.targetCreateTime = request.targetCreateTime;
            this.targetFileSystemId = request.targetFileSystemId;
            this.targetInstanceId = request.targetInstanceId;
            this.targetInstanceName = request.targetInstanceName;
            this.targetPath = request.targetPath;
            this.targetPrefix = request.targetPrefix;
            this.targetTableName = request.targetTableName;
            this.targetTime = request.targetTime;
            this.udmDetail = request.udmDetail;
            this.udmRegionId = request.udmRegionId;
            this.vaultId = request.vaultId;
        } 

        /**
         * The name of the RAM role that is created within the source Alibaba Cloud account and assigned to the current Alibaba Cloud account to authorize the current Alibaba Cloud account to back up data across Alibaba Cloud accounts.
         */
        public Builder crossAccountRoleName(String crossAccountRoleName) {
            this.putQueryParameter("CrossAccountRoleName", crossAccountRoleName);
            this.crossAccountRoleName = crossAccountRoleName;
            return this;
        }

        /**
         * Specifies whether data is backed up within the same Alibaba Cloud account or across Alibaba Cloud accounts. Valid values:
         * <p>
         * 
         * *   SELF_ACCOUNT: Data is backed up within the same Alibaba Cloud account.
         * *   CROSS_ACCOUNT: Data is backed up across Alibaba Cloud accounts.
         */
        public Builder crossAccountType(String crossAccountType) {
            this.putQueryParameter("CrossAccountType", crossAccountType);
            this.crossAccountType = crossAccountType;
            return this;
        }

        /**
         * The ID of the source Alibaba Cloud account that authorizes the current Alibaba Cloud account to back up data across Alibaba Cloud accounts.
         */
        public Builder crossAccountUserId(Long crossAccountUserId) {
            this.putQueryParameter("CrossAccountUserId", crossAccountUserId);
            this.crossAccountUserId = crossAccountUserId;
            return this;
        }

        /**
         * The paths to the files that you do not want to restore. No files in the specified paths are restored. The value must be 1 to 255 characters in length.
         */
        public Builder exclude(String exclude) {
            this.putBodyParameter("Exclude", exclude);
            this.exclude = exclude;
            return this;
        }

        /**
         * FailbackDetail.
         */
        public Builder failbackDetail(java.util.Map < String, ? > failbackDetail) {
            String failbackDetailShrink = shrink(failbackDetail, "FailbackDetail", "json");
            this.putQueryParameter("FailbackDetail", failbackDetailShrink);
            this.failbackDetail = failbackDetail;
            return this;
        }

        /**
         * The paths to the files that you want to restore. All files in the specified paths are restored. The value must be 1 to 255 characters in length.
         */
        public Builder include(String include) {
            this.putBodyParameter("Include", include);
            this.include = include;
            return this;
        }

        /**
         * Specifies whether to initiate the request by using Container Service for Kubernetes (ACK). Default value: false.
         */
        public Builder initiatedByAck(Boolean initiatedByAck) {
            this.putQueryParameter("InitiatedByAck", initiatedByAck);
            this.initiatedByAck = initiatedByAck;
            return this;
        }

        /**
         * Options.
         */
        public Builder options(String options) {
            this.putQueryParameter("Options", options);
            this.options = options;
            return this;
        }

        /**
         * The details about the Tablestore instance.
         */
        public Builder otsDetail(OtsTableRestoreDetail otsDetail) {
            String otsDetailShrink = shrink(otsDetail, "OtsDetail", "json");
            this.putBodyParameter("OtsDetail", otsDetailShrink);
            this.otsDetail = otsDetail;
            return this;
        }

        /**
         * The type of the restore destination. Valid values:
         * <p>
         * 
         * *   **ECS_FILE**: restores data to Elastic Compute Service (ECS) files.
         * *   **OSS**: restores data to Object Storage Service (OSS) buckets.
         * *   **NAS**: restores data to Apsara File Storage NAS file systems.
         * *   **OTS_TABLE**: restores data to Tablestore instances.
         * *   **UDM_ECS_ROLLBACK**: restores data to ECS instances.
         */
        public Builder restoreType(String restoreType) {
            this.putQueryParameter("RestoreType", restoreType);
            this.restoreType = restoreType;
            return this;
        }

        /**
         * The hash value of the backup snapshot.
         */
        public Builder snapshotHash(String snapshotHash) {
            this.putQueryParameter("SnapshotHash", snapshotHash);
            this.snapshotHash = snapshotHash;
            return this;
        }

        /**
         * The ID of the backup snapshot.
         */
        public Builder snapshotId(String snapshotId) {
            this.putQueryParameter("SnapshotId", snapshotId);
            this.snapshotId = snapshotId;
            return this;
        }

        /**
         * The type of the data source. Valid values:
         * <p>
         * 
         * *   **ECS_FILE**: ECS files
         * *   **OSS**: OSS buckets
         * *   **NAS**: NAS file systems
         * *   **OTS_TABLE**: Tablestore instances
         * *   **UDM_ECS**: ECS instances
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * This parameter is required only if the **RestoreType** parameter is set to **OSS**. This parameter specifies the name of the OSS bucket to which you want to restore data.
         */
        public Builder targetBucket(String targetBucket) {
            this.putQueryParameter("TargetBucket", targetBucket);
            this.targetBucket = targetBucket;
            return this;
        }

        /**
         * The details about the container to which you want to restore data.
         */
        public Builder targetContainer(String targetContainer) {
            this.putQueryParameter("TargetContainer", targetContainer);
            this.targetContainer = targetContainer;
            return this;
        }

        /**
         * The ID of the container cluster to which you want to restore data.
         */
        public Builder targetContainerClusterId(String targetContainerClusterId) {
            this.putQueryParameter("TargetContainerClusterId", targetContainerClusterId);
            this.targetContainerClusterId = targetContainerClusterId;
            return this;
        }

        /**
         * This parameter is required only if the **RestoreType** parameter is set to **NAS**. This parameter specifies the time when the file system is created.
         */
        public Builder targetCreateTime(Long targetCreateTime) {
            this.putQueryParameter("TargetCreateTime", targetCreateTime);
            this.targetCreateTime = targetCreateTime;
            return this;
        }

        /**
         * This parameter is required only if the **RestoreType** parameter is set to **NAS**. This parameter specifies the ID of the file system to which you want to restore data.
         */
        public Builder targetFileSystemId(String targetFileSystemId) {
            this.putQueryParameter("TargetFileSystemId", targetFileSystemId);
            this.targetFileSystemId = targetFileSystemId;
            return this;
        }

        /**
         * This parameter is required only if the **RestoreType** parameter is set to **ECS_FILE**. This parameter specifies the ID of the ECS instance to which you want to restore data.
         */
        public Builder targetInstanceId(String targetInstanceId) {
            this.putBodyParameter("TargetInstanceId", targetInstanceId);
            this.targetInstanceId = targetInstanceId;
            return this;
        }

        /**
         * The name of the Tablestore instance to which you want to restore data.
         */
        public Builder targetInstanceName(String targetInstanceName) {
            this.putQueryParameter("TargetInstanceName", targetInstanceName);
            this.targetInstanceName = targetInstanceName;
            return this;
        }

        /**
         * This parameter is required only if the **RestoreType** parameter is set to **ECS_FILE**. This parameter specifies the destination file path.
         */
        public Builder targetPath(String targetPath) {
            this.putBodyParameter("TargetPath", targetPath);
            this.targetPath = targetPath;
            return this;
        }

        /**
         * This parameter is required only if the **RestoreType** parameter is set to **OSS**. This parameter specifies the prefix of objects that you want to restore.
         */
        public Builder targetPrefix(String targetPrefix) {
            this.putQueryParameter("TargetPrefix", targetPrefix);
            this.targetPrefix = targetPrefix;
            return this;
        }

        /**
         * The name of the table that stores the restored data.
         */
        public Builder targetTableName(String targetTableName) {
            this.putQueryParameter("TargetTableName", targetTableName);
            this.targetTableName = targetTableName;
            return this;
        }

        /**
         * The time when data is restored to the Tablestore instance. The value must be a UNIX timestamp. Unit: seconds.
         */
        public Builder targetTime(Long targetTime) {
            this.putQueryParameter("TargetTime", targetTime);
            this.targetTime = targetTime;
            return this;
        }

        /**
         * The details of ECS instance backup.
         */
        public Builder udmDetail(java.util.Map < String, ? > udmDetail) {
            String udmDetailShrink = shrink(udmDetail, "UdmDetail", "json");
            this.putQueryParameter("UdmDetail", udmDetailShrink);
            this.udmDetail = udmDetail;
            return this;
        }

        /**
         * This parameter is required only if you set the **SourceType** parameter to **UDM_ECS**. This parameter specifies the region to which you want to restore data.
         */
        public Builder udmRegionId(String udmRegionId) {
            this.putQueryParameter("UdmRegionId", udmRegionId);
            this.udmRegionId = udmRegionId;
            return this;
        }

        /**
         * The ID of the backup vault to which the backup snapshot belongs.
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

}
