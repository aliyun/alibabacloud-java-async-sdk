// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateRestoreJobRequest} extends {@link RequestModel}
 *
 * <p>CreateRestoreJobRequest</p>
 */
public class CreateRestoreJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrossAccountRoleName")
    private String crossAccountRoleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrossAccountType")
    private String crossAccountType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrossAccountUserId")
    private Long crossAccountUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Exclude")
    private String exclude;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FailbackDetail")
    private java.util.Map < String, ? > failbackDetail;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Include")
    private String include;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InitiatedByAck")
    private Boolean initiatedByAck;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Options")
    private String options;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OtsDetail")
    private OtsTableRestoreDetail otsDetail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RestoreType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String restoreType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnapshotHash")
    private String snapshotHash;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnapshotId")
    private String snapshotId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetBucket")
    private String targetBucket;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetContainer")
    private String targetContainer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetContainerClusterId")
    private String targetContainerClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetCreateTime")
    private Long targetCreateTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetFileSystemId")
    private String targetFileSystemId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetInstanceId")
    private String targetInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetInstanceName")
    private String targetInstanceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetPath")
    private String targetPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetPrefix")
    private String targetPrefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetTableName")
    private String targetTableName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetTime")
    private Long targetTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UdmDetail")
    private java.util.Map < String, ? > udmDetail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UdmRegionId")
    private String udmRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VaultId")
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
         * <p>The name of the RAM role that is created within the source Alibaba Cloud account and assigned to the current Alibaba Cloud account to authorize the current Alibaba Cloud account to back up data across Alibaba Cloud accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>BackupRole</p>
         */
        public Builder crossAccountRoleName(String crossAccountRoleName) {
            this.putQueryParameter("CrossAccountRoleName", crossAccountRoleName);
            this.crossAccountRoleName = crossAccountRoleName;
            return this;
        }

        /**
         * <p>Specifies whether data is backed up within the same Alibaba Cloud account or across Alibaba Cloud accounts. Valid values:</p>
         * <ul>
         * <li>SELF_ACCOUNT: Data is backed up within the same Alibaba Cloud account.</li>
         * <li>CROSS_ACCOUNT: Data is backed up across Alibaba Cloud accounts.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SELF_ACCOUNT</p>
         */
        public Builder crossAccountType(String crossAccountType) {
            this.putQueryParameter("CrossAccountType", crossAccountType);
            this.crossAccountType = crossAccountType;
            return this;
        }

        /**
         * <p>The ID of the source Alibaba Cloud account that authorizes the current Alibaba Cloud account to back up data across Alibaba Cloud accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>158975xxxxx4625</p>
         */
        public Builder crossAccountUserId(Long crossAccountUserId) {
            this.putQueryParameter("CrossAccountUserId", crossAccountUserId);
            this.crossAccountUserId = crossAccountUserId;
            return this;
        }

        /**
         * <p>The paths to the files that you do not want to restore. No files in the specified paths are restored. The value must be 1 to 255 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;/var&quot;, &quot;/proc&quot;]</p>
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
         * <p>The paths to the files that you want to restore. All files in the specified paths are restored. The value must be 1 to 255 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;/home/alice/<em>.pdf&quot;, &quot;/home/bob/</em>.txt&quot;]</p>
         */
        public Builder include(String include) {
            this.putBodyParameter("Include", include);
            this.include = include;
            return this;
        }

        /**
         * <p>Specifies whether to initiate the request by using Container Service for Kubernetes (ACK). Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
         * <p>The details about the Tablestore instance.</p>
         */
        public Builder otsDetail(OtsTableRestoreDetail otsDetail) {
            String otsDetailShrink = shrink(otsDetail, "OtsDetail", "json");
            this.putBodyParameter("OtsDetail", otsDetailShrink);
            this.otsDetail = otsDetail;
            return this;
        }

        /**
         * <p>The type of the restore destination. Valid values:</p>
         * <ul>
         * <li><strong>ECS_FILE</strong>: restores data to Elastic Compute Service (ECS) files.</li>
         * <li><strong>OSS</strong>: restores data to Object Storage Service (OSS) buckets.</li>
         * <li><strong>NAS</strong>: restores data to Apsara File Storage NAS file systems.</li>
         * <li><strong>OTS_TABLE</strong>: restores data to Tablestore instances.</li>
         * <li><strong>UDM_ECS_ROLLBACK</strong>: restores data to ECS instances.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ECS_FILE</p>
         */
        public Builder restoreType(String restoreType) {
            this.putQueryParameter("RestoreType", restoreType);
            this.restoreType = restoreType;
            return this;
        }

        /**
         * <p>The hash value of the backup snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>f2fe...</p>
         */
        public Builder snapshotHash(String snapshotHash) {
            this.putQueryParameter("SnapshotHash", snapshotHash);
            this.snapshotHash = snapshotHash;
            return this;
        }

        /**
         * <p>The ID of the backup snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>s-********************</p>
         */
        public Builder snapshotId(String snapshotId) {
            this.putQueryParameter("SnapshotId", snapshotId);
            this.snapshotId = snapshotId;
            return this;
        }

        /**
         * <p>The type of the data source. Valid values:</p>
         * <ul>
         * <li><strong>ECS_FILE</strong>: ECS files</li>
         * <li><strong>OSS</strong>: OSS buckets</li>
         * <li><strong>NAS</strong>: NAS file systems</li>
         * <li><strong>OTS_TABLE</strong>: Tablestore instances</li>
         * <li><strong>UDM_ECS</strong>: ECS instances</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ECS_FILE</p>
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>This parameter is required only if the <strong>RestoreType</strong> parameter is set to <strong>OSS</strong>. This parameter specifies the name of the OSS bucket to which you want to restore data.</p>
         * 
         * <strong>example:</strong>
         * <p>hbr-backup-oss</p>
         */
        public Builder targetBucket(String targetBucket) {
            this.putQueryParameter("TargetBucket", targetBucket);
            this.targetBucket = targetBucket;
            return this;
        }

        /**
         * <p>The details about the container to which you want to restore data.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;host&quot;:&quot;k8s-node1&quot;,&quot;hostPrefix&quot;:&quot;/var/lib/kubelet/pods/4acb31fe-8577-40ff-bc8c-eccabd835f73/volumes/kubernetes.io~csi/pvc-b050b00e-ef17-4792-aab1-1642355cf1f4/mount&quot;,&quot;pvPath&quot;:&quot;/&quot;}</p>
         */
        public Builder targetContainer(String targetContainer) {
            this.putQueryParameter("TargetContainer", targetContainer);
            this.targetContainer = targetContainer;
            return this;
        }

        /**
         * <p>The ID of the container cluster to which you want to restore data.</p>
         * 
         * <strong>example:</strong>
         * <p>cc-000amjsc7o1h9506oob7</p>
         */
        public Builder targetContainerClusterId(String targetContainerClusterId) {
            this.putQueryParameter("TargetContainerClusterId", targetContainerClusterId);
            this.targetContainerClusterId = targetContainerClusterId;
            return this;
        }

        /**
         * <p>This parameter is required only if the <strong>RestoreType</strong> parameter is set to <strong>NAS</strong>. This parameter specifies the time when the file system is created.</p>
         * 
         * <strong>example:</strong>
         * <p>1554347313</p>
         */
        public Builder targetCreateTime(Long targetCreateTime) {
            this.putQueryParameter("TargetCreateTime", targetCreateTime);
            this.targetCreateTime = targetCreateTime;
            return this;
        }

        /**
         * <p>This parameter is required only if the <strong>RestoreType</strong> parameter is set to <strong>NAS</strong>. This parameter specifies the ID of the file system to which you want to restore data.</p>
         * 
         * <strong>example:</strong>
         * <p>005494</p>
         */
        public Builder targetFileSystemId(String targetFileSystemId) {
            this.putQueryParameter("TargetFileSystemId", targetFileSystemId);
            this.targetFileSystemId = targetFileSystemId;
            return this;
        }

        /**
         * <p>This parameter is required only if the <strong>RestoreType</strong> parameter is set to <strong>ECS_FILE</strong>. This parameter specifies the ID of the ECS instance to which you want to restore data.</p>
         * 
         * <strong>example:</strong>
         * <p>i-*********************</p>
         */
        public Builder targetInstanceId(String targetInstanceId) {
            this.putBodyParameter("TargetInstanceId", targetInstanceId);
            this.targetInstanceId = targetInstanceId;
            return this;
        }

        /**
         * <p>The name of the Tablestore instance to which you want to restore data.</p>
         * 
         * <strong>example:</strong>
         * <p>instancename</p>
         */
        public Builder targetInstanceName(String targetInstanceName) {
            this.putQueryParameter("TargetInstanceName", targetInstanceName);
            this.targetInstanceName = targetInstanceName;
            return this;
        }

        /**
         * <p>This parameter is required only if the <strong>RestoreType</strong> parameter is set to <strong>ECS_FILE</strong>. This parameter specifies the destination file path.</p>
         * 
         * <strong>example:</strong>
         * <p>C:\</p>
         */
        public Builder targetPath(String targetPath) {
            this.putBodyParameter("TargetPath", targetPath);
            this.targetPath = targetPath;
            return this;
        }

        /**
         * <p>This parameter is required only if the <strong>RestoreType</strong> parameter is set to <strong>OSS</strong>. This parameter specifies the prefix of objects that you want to restore.</p>
         * 
         * <strong>example:</strong>
         * <p>hbr</p>
         */
        public Builder targetPrefix(String targetPrefix) {
            this.putQueryParameter("TargetPrefix", targetPrefix);
            this.targetPrefix = targetPrefix;
            return this;
        }

        /**
         * <p>The name of the table that stores the restored data.</p>
         * 
         * <strong>example:</strong>
         * <p>tablename</p>
         */
        public Builder targetTableName(String targetTableName) {
            this.putQueryParameter("TargetTableName", targetTableName);
            this.targetTableName = targetTableName;
            return this;
        }

        /**
         * <p>The time when data is restored to the Tablestore instance. The value must be a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1642496881</p>
         */
        public Builder targetTime(Long targetTime) {
            this.putQueryParameter("TargetTime", targetTime);
            this.targetTime = targetTime;
            return this;
        }

        /**
         * <p>The details of ECS instance backup.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;sourceInstanceId&quot;:&quot;i-uf62te6pm3iwsyxyz66q&quot;,&quot;bootAfterRestore&quot;:false}</p>
         */
        public Builder udmDetail(java.util.Map < String, ? > udmDetail) {
            String udmDetailShrink = shrink(udmDetail, "UdmDetail", "json");
            this.putQueryParameter("UdmDetail", udmDetailShrink);
            this.udmDetail = udmDetail;
            return this;
        }

        /**
         * <p>This parameter is required only if you set the <strong>SourceType</strong> parameter to <strong>UDM_ECS</strong>. This parameter specifies the region to which you want to restore data.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder udmRegionId(String udmRegionId) {
            this.putQueryParameter("UdmRegionId", udmRegionId);
            this.udmRegionId = udmRegionId;
            return this;
        }

        /**
         * <p>The ID of the backup vault to which the backup snapshot belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>v-*********************</p>
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
