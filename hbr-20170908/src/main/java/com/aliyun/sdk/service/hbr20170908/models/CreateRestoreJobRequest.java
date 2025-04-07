// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

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
    private java.util.Map<String, ?> failbackDetail;

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
    private java.util.Map<String, ?> udmDetail;

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
    public java.util.Map<String, ?> getFailbackDetail() {
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
    public java.util.Map<String, ?> getUdmDetail() {
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
        private java.util.Map<String, ?> failbackDetail; 
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
        private java.util.Map<String, ?> udmDetail; 
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
         * <p>The name of the role created in the RAM of the original account for cross-account backup managed by the current account.</p>
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
         * <p>Cross-account backup type. Supported values:</p>
         * <ul>
         * <li>SELF_ACCOUNT: Backup within the same account</li>
         * <li>CROSS_ACCOUNT: Cross-account backup</li>
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
         * <p>The original account ID managed by the current account for cross-account backup.</p>
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
         * <p>The path not to be restored. All documents under this path will not be restored. Maximum length is 255 characters.</p>
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
         * <p>Details of restoring to the local environment.</p>
         */
        public Builder failbackDetail(java.util.Map<String, ?> failbackDetail) {
            String failbackDetailShrink = shrink(failbackDetail, "FailbackDetail", "json");
            this.putQueryParameter("FailbackDetail", failbackDetailShrink);
            this.failbackDetail = failbackDetail;
            return this;
        }

        /**
         * <p>The path to be restored. All documents under this path will be restored. Maximum length is 255 characters.</p>
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
         * <p>Indicates whether it is called by the container service. Default is false.</p>
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
         * <p>Parameters for the restore job.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;includes&quot;:[],&quot;excludes&quot;:[],&quot;conflictPolicy&quot;:&quot;OVERWRITE_EXISTING&quot;}</p>
         */
        public Builder options(String options) {
            this.putQueryParameter("Options", options);
            this.options = options;
            return this;
        }

        /**
         * <p>Details of the Table Store instance.</p>
         */
        public Builder otsDetail(OtsTableRestoreDetail otsDetail) {
            String otsDetailShrink = shrink(otsDetail, "OtsDetail", "json");
            this.putBodyParameter("OtsDetail", otsDetailShrink);
            this.otsDetail = otsDetail;
            return this;
        }

        /**
         * <p>The type of the restore destination data source. Possible values:</p>
         * <ul>
         * <li><strong>ECS_FILE</strong>: Restore to ECS file.</li>
         * <li><strong>OSS</strong>: Restore to Alibaba Cloud OSS.</li>
         * <li><strong>NAS</strong>: Restore to Alibaba Cloud NAS.</li>
         * <li><strong>OTS_TABLE</strong>: Restore to Alibaba Cloud OTS.</li>
         * <li><strong>UDM_ECS_ROLLBACK</strong>: Restore to Alibaba Cloud ECS whole machine.</li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>The HASH value of the backup snapshot.</p>
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
         * <p>The type of the data source. Possible values:</p>
         * <ul>
         * <li><strong>ECS_FILE</strong>: Restore ECS file.</li>
         * <li><strong>OSS</strong>: Restore Alibaba Cloud OSS.</li>
         * <li><strong>NAS</strong>: Restore Alibaba Cloud NAS.</li>
         * <li><strong>OTS_TABLE</strong>: Restore to Alibaba Cloud OTS.</li>
         * <li><strong>UDM_ECS</strong>: Restore to Alibaba Cloud ECS whole machine.</li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>Valid only when <strong>RestoreType</strong> is <strong>OSS</strong>. Indicates the name of the OSS bucket at the restore destination.</p>
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
         * <p>Details of the target container.</p>
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
         * <p>The ID of the target container cluster.</p>
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
         * <p>Valid only when <strong>RestoreType</strong> is <strong>NAS</strong>. Indicates the creation time of the file system at the restore destination.</p>
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
         * <p>Valid only when <strong>RestoreType</strong> is <strong>NAS</strong>. Indicates the ID of the file system at the restore destination.</p>
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
         * <p>Valid only when <strong>RestoreType</strong> is <strong>ECS_FILE</strong>. Indicates the ECS instance ID at the restore destination.</p>
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
         * <p>The name of the target Table Store instance.</p>
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
         * <p>Valid only when <strong>RestoreType</strong> is <strong>ECS_FILE</strong>. Indicates the file path at the restore destination.</p>
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
         * <p>Valid only when <strong>RestoreType</strong> is <strong>OSS</strong>. Indicates the object prefix at the restore destination.</p>
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
         * <p>The name of the data table in the target Table Store.</p>
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
         * <p>The time of the Table Store to be restored. UNIX timestamp, in seconds.</p>
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
         * <p>The parameter is valid only when the SourceType is set to UDM_ECS. It represents the details of the entire machine backup and is a JSON string. Depending on the value of RestoreType, different details must be passed as follows:</p>
         * <ul>
         * <li><strong>UDM_ECS_DISK</strong>: ECS disk cloning.<ul>
         * <li><strong>targetInstanceId</strong>: string (required). Specifies the target ECS instance ID to which the cloned disk will be attached.</li>
         * <li><strong>diskCategory</strong>: string (required). Specifies the type of the target disk.</li>
         * <li><strong>diskPerformanceLevel</strong>: string. When diskCategory is &quot;essd&quot;, this indicates the disk performance level, supporting PL0, PL1, PL2, and PL3, with PL1 as the default.</li>
         * </ul>
         * </li>
         * <li><strong>UDM_ECS_DISK_ROLLBACK</strong>: ECS disk rollback.<ul>
         * <li><strong>sourceInstanceId</strong>: string (required). Specifies the source ECS instance ID.</li>
         * <li><strong>forceRestore</strong>: bool (default: false). Indicates whether to force restore. NOTE: If forceRestore is set to true, the disk restoration will proceed even if the backup disk has been unmounted from the original ECS instance or mounted to another instance. Exercise caution when using this option.</li>
         * <li><strong>bootAfterRestore</strong>: bool (default: false). Indicates whether to start the ECS instance after restoration.</li>
         * </ul>
         * </li>
         * <li><strong>UDM_ECS</strong>: Full ECS cloning.<ul>
         * <li><strong>bootAfterRestore</strong>: bool (default: false). Indicates whether to start the ECS instance after restoration.</li>
         * <li><strong>diskCategory</strong>: string (required). Specifies the type of the target disk.</li>
         * <li><strong>diskPerformanceLevel</strong>: string. When diskCategory is &quot;essd&quot;, this indicates the disk performance level (PL0/PL1/PL2/PL3), defaulting to PL1.</li>
         * <li><strong>instanceType</strong>: string (required). Specifies the specification of the target ECS instance.</li>
         * <li><strong>restoredNetwork</strong>: string (required). Specifies the vSwitch ID for the target ECS instance.</li>
         * <li><strong>securityGroup</strong>: string (required). Specifies the security group ID for the target ECS instance.</li>
         * <li><strong>restoredName:</strong> string (required). Specifies the instance name of the target ECS instance.</li>
         * <li><strong>restoredHostName</strong>: string (required). Specifies the host name of the target ECS instance.</li>
         * <li><strong>allocatePublicIp</strong>: bool (default: false). Indicates whether to assign a public IP to the target ECS instance.</li>
         * <li><strong>privateIpAddress</strong>: string. Specifies the internal IP address of the target ECS instance. If not specified, an IP will be assigned via DHCP.</li>
         * </ul>
         * </li>
         * <li><strong>UDM_ECS_ROLLBACK</strong>: Full ECS rollback.<ul>
         * <li><strong>sourceInstanceId</strong>: string (required). Specifies the source ECS instance ID.</li>
         * <li><strong>forceRestore</strong>: bool (default: false). Indicates whether to force restore. NOTE: If forceRestore is set to true, the disk restoration will proceed even if the backup disk has been unmounted from the original ECS instance or mounted to another instance. Exercise caution when using this option.</li>
         * <li><strong>bootAfterRestore</strong>: bool (default: false). Indicates whether to start the ECS instance after restoration.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;sourceInstanceId&quot;:&quot;i-uf62te6pm3iwsyxyz66q&quot;,&quot;bootAfterRestore&quot;:false}</p>
         */
        public Builder udmDetail(java.util.Map<String, ?> udmDetail) {
            String udmDetailShrink = shrink(udmDetail, "UdmDetail", "json");
            this.putQueryParameter("UdmDetail", udmDetailShrink);
            this.udmDetail = udmDetail;
            return this;
        }

        /**
         * <p>Valid only when <strong>SourceType</strong> is <strong>UDM_ECS</strong>. Indicates the target region for the restore.</p>
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
         * <p>The ID of the backup vault that the snapshot belongs to.</p>
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
