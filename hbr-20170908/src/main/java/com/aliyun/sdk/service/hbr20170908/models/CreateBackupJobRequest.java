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
 * {@link CreateBackupJobRequest} extends {@link RequestModel}
 *
 * <p>CreateBackupJobRequest</p>
 */
public class CreateBackupJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupType")
    private String backupType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContainerClusterId")
    private String containerClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContainerResources")
    private String containerResources;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrossAccountRoleName")
    private String crossAccountRoleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrossAccountType")
    private String crossAccountType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrossAccountUserId")
    private Long crossAccountUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Detail")
    private java.util.Map<String, ?> detail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Exclude")
    private String exclude;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Include")
    private String include;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InitiatedByAck")
    private Boolean initiatedByAck;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobName")
    private String jobName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Options")
    private String options;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Retention")
    private Long retention;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpeedLimit")
    private String speedLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VaultId")
    private String vaultId;

    private CreateBackupJobRequest(Builder builder) {
        super(builder);
        this.backupType = builder.backupType;
        this.clusterId = builder.clusterId;
        this.containerClusterId = builder.containerClusterId;
        this.containerResources = builder.containerResources;
        this.crossAccountRoleName = builder.crossAccountRoleName;
        this.crossAccountType = builder.crossAccountType;
        this.crossAccountUserId = builder.crossAccountUserId;
        this.detail = builder.detail;
        this.exclude = builder.exclude;
        this.include = builder.include;
        this.initiatedByAck = builder.initiatedByAck;
        this.instanceId = builder.instanceId;
        this.jobName = builder.jobName;
        this.options = builder.options;
        this.retention = builder.retention;
        this.sourceType = builder.sourceType;
        this.speedLimit = builder.speedLimit;
        this.vaultId = builder.vaultId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBackupJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupType
     */
    public String getBackupType() {
        return this.backupType;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return containerClusterId
     */
    public String getContainerClusterId() {
        return this.containerClusterId;
    }

    /**
     * @return containerResources
     */
    public String getContainerResources() {
        return this.containerResources;
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
     * @return detail
     */
    public java.util.Map<String, ?> getDetail() {
        return this.detail;
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
     * @return initiatedByAck
     */
    public Boolean getInitiatedByAck() {
        return this.initiatedByAck;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return jobName
     */
    public String getJobName() {
        return this.jobName;
    }

    /**
     * @return options
     */
    public String getOptions() {
        return this.options;
    }

    /**
     * @return retention
     */
    public Long getRetention() {
        return this.retention;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return speedLimit
     */
    public String getSpeedLimit() {
        return this.speedLimit;
    }

    /**
     * @return vaultId
     */
    public String getVaultId() {
        return this.vaultId;
    }

    public static final class Builder extends Request.Builder<CreateBackupJobRequest, Builder> {
        private String backupType; 
        private String clusterId; 
        private String containerClusterId; 
        private String containerResources; 
        private String crossAccountRoleName; 
        private String crossAccountType; 
        private Long crossAccountUserId; 
        private java.util.Map<String, ?> detail; 
        private String exclude; 
        private String include; 
        private Boolean initiatedByAck; 
        private String instanceId; 
        private String jobName; 
        private String options; 
        private Long retention; 
        private String sourceType; 
        private String speedLimit; 
        private String vaultId; 

        private Builder() {
            super();
        } 

        private Builder(CreateBackupJobRequest request) {
            super(request);
            this.backupType = request.backupType;
            this.clusterId = request.clusterId;
            this.containerClusterId = request.containerClusterId;
            this.containerResources = request.containerResources;
            this.crossAccountRoleName = request.crossAccountRoleName;
            this.crossAccountType = request.crossAccountType;
            this.crossAccountUserId = request.crossAccountUserId;
            this.detail = request.detail;
            this.exclude = request.exclude;
            this.include = request.include;
            this.initiatedByAck = request.initiatedByAck;
            this.instanceId = request.instanceId;
            this.jobName = request.jobName;
            this.options = request.options;
            this.retention = request.retention;
            this.sourceType = request.sourceType;
            this.speedLimit = request.speedLimit;
            this.vaultId = request.vaultId;
        } 

        /**
         * <p>The backup type. This parameter is required only if you set the SourceType parameter to UDM_ECS.</p>
         * <ul>
         * <li><strong>COMPLETE</strong>: full backup</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INCREMENTAL</p>
         */
        public Builder backupType(String backupType) {
            this.putQueryParameter("BackupType", backupType);
            this.backupType = backupType;
            return this;
        }

        /**
         * <p>You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>cl-00068btz******oku</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>cc-000xxxxxxxxxxxxxxi00</p>
         */
        public Builder containerClusterId(String containerClusterId) {
            this.putQueryParameter("ContainerClusterId", containerClusterId);
            this.containerClusterId = containerClusterId;
            return this;
        }

        /**
         * <p>You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;resourceType&quot;:&quot;PV&quot;,&quot;backupMethod&quot;:&quot;FILE&quot;,&quot;resourceId&quot;:&quot;674dac6d-74cd-47e9-a675-09e2f10d2c45&quot;,&quot;resourceInfo&quot;:&quot;{\&quot;pv_name\&quot;:\&quot;nas-650dac6d-74cd-47e9-a675-09e2f10d2c45\&quot;,\&quot;pv_size\&quot;:\&quot;8Gi\&quot;,\&quot;storage_class\&quot;:\&quot;alibabacloud-cnfs-nas\&quot;,\&quot;pvc_name\&quot;:\&quot;data-postgresql-default-0\&quot;,\&quot;namespace\&quot;:\&quot;database\&quot;}&quot;,&quot;host&quot;:&quot;cn-huhehaote.192.168.13.133&quot;,&quot;hostPrefix&quot;:&quot;6f5e758e-8d35-4584-b9ce-8333adfc7547/volumes/kubernetes.io~csi/nas-670dac6d-74cd-47e9-a675-09e2f10d2c45/mount&quot;,&quot;pvPath&quot;:&quot;/&quot;}]</p>
         */
        public Builder containerResources(String containerResources) {
            this.putQueryParameter("ContainerResources", containerResources);
            this.containerResources = containerResources;
            return this;
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
         * <p>158975xxxxxx4625</p>
         */
        public Builder crossAccountUserId(Long crossAccountUserId) {
            this.putQueryParameter("CrossAccountUserId", crossAccountUserId);
            this.crossAccountUserId = crossAccountUserId;
            return this;
        }

        /**
         * <p>This parameter is required only if you set the <strong>SourceType</strong> parameter to <strong>UDM_ECS</strong>. The value is a JSON string. Valid values:</p>
         * <ul>
         * <li><p>doCopy: specifies whether to enable remote replication.</p>
         * </li>
         * <li><p>destinationRegionId: the destination region for remote replication.</p>
         * </li>
         * <li><p>destinationRetention: the retention period of the backup point for remote replication.</p>
         * </li>
         * <li><p>diskIdList: the IDs of the disks that are to be backed up. If this parameter is left empty, all disks are backed up.</p>
         * </li>
         * <li><p>snapshotGroup: specifies whether to use a snapshot-consistent group. This parameter is valid only if all disks of the ECS instance are Enterprise SSDs (ESSDs).</p>
         * </li>
         * <li><p>appConsistent: specifies whether to use the application-consistent backup feature. This parameter must be used with the preScriptPath and postScriptPath parameters.</p>
         * </li>
         * <li><p>preScriptPath: the path to the pre-freeze scripts.</p>
         * </li>
         * <li><p>postScriptPath: the path to the post-thaw scripts.</p>
         * </li>
         * <li><p>enableWriters: This parameter is required only if you set the <strong>AppConsistent</strong> parameter to <strong>true</strong>. This parameter specifies whether to create application-consistent snapshots.</p>
         * <ul>
         * <li>true: creates application-consistent snapshots.</li>
         * <li>false: creates file system-consistent snapshots.</li>
         * </ul>
         * </li>
         * <li><p>enableFsFreeze: This parameter is required only if you set the <strong>AppConsistent</strong> parameter to <strong>true</strong>. This parameter specifies whether to enable Linux fsfreeze to put file systems into the read-only state before application-consistent snapshots are created. Default value: true.</p>
         * </li>
         * <li><p>timeoutSeconds: This parameter is required only if you set the <strong>AppConsistent</strong> parameter to <strong>true</strong>. This parameter specifies the I/O freeze timeout period. Default value: 30. Unit: seconds.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;doCopy&quot;: false,
         *     &quot;destinationRegionId&quot;: &quot;&quot;,
         *     &quot;destinationRetention&quot;: null,
         *     &quot;diskIdList&quot;: [],
         *     &quot;snapshotGroup&quot;: false,
         *     &quot;appConsistent&quot;: false,
         *     &quot;enableWriters&quot;: true,
         *     &quot;preScriptPath&quot;: &quot;&quot;,
         *     &quot;postScriptPath&quot;: &quot;&quot;,
         *     &quot;enableFsFreeze&quot;: true,
         *     &quot;timeoutInSeconds&quot;: 60
         * }</p>
         */
        public Builder detail(java.util.Map<String, ?> detail) {
            String detailShrink = shrink(detail, "Detail", "json");
            this.putQueryParameter("Detail", detailShrink);
            this.detail = detail;
            return this;
        }

        /**
         * <p>This parameter does not take effect if you set the <strong>SourceType</strong> parameter to <strong>UDM_ECS</strong>. This parameter specifies the paths to the files that are excluded from the backup job. The value can be up to 255 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;/var&quot;, &quot;/proc&quot;]</p>
         */
        public Builder exclude(String exclude) {
            this.putQueryParameter("Exclude", exclude);
            this.exclude = exclude;
            return this;
        }

        /**
         * <p>This parameter does not take effect if you set the <strong>SourceType</strong> parameter to <strong>UDM_ECS</strong>. This parameter specifies the paths to the files that are backed up. The value can be up to 255 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;/home/alice/<em>.pdf&quot;, &quot;/home/bob/</em>.txt&quot;]</p>
         */
        public Builder include(String include) {
            this.putQueryParameter("Include", include);
            this.include = include;
            return this;
        }

        /**
         * <p>false or left empty</p>
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
         * <p>This parameter is required only if you set the <strong>SourceType</strong> parameter to <strong>UDM_ECS</strong>. This parameter specifies the ID of the ECS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1xxxxxxxxxxxxxxysm</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The name of the backup job.</p>
         * 
         * <strong>example:</strong>
         * <p>k8s-backup-infra-20220131150046-hbr</p>
         */
        public Builder jobName(String jobName) {
            this.putQueryParameter("JobName", jobName);
            this.jobName = jobName;
            return this;
        }

        /**
         * <p>You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;UseVSS&quot;:false}</p>
         */
        public Builder options(String options) {
            this.putQueryParameter("Options", options);
            this.options = options;
            return this;
        }

        /**
         * <p>The retention period of the backup data. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder retention(Long retention) {
            this.putQueryParameter("Retention", retention);
            this.retention = retention;
            return this;
        }

        /**
         * <p>The type of the data source. Valid values:</p>
         * <ul>
         * <li><strong>UDM_ECS</strong>: Elastic Compute Service (ECS) instance</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CONTAINER</p>
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>This parameter does not take effect if you set the <strong>SourceType</strong> parameter to <strong>UDM_ECS</strong>. This parameter specifies the throttling rules. Format: <code>{start}|{end}|{bandwidth}</code>. Separate multiple throttling rules with vertical bars (|). A specified time range cannot overlap with another time range.</p>
         * <ul>
         * <li><strong>start</strong>: the start hour.</li>
         * <li><strong>end</strong>: the end hour.</li>
         * <li><strong>bandwidth</strong>: the bandwidth. Unit: KB/s.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0:24:NaN</p>
         */
        public Builder speedLimit(String speedLimit) {
            this.putQueryParameter("SpeedLimit", speedLimit);
            this.speedLimit = speedLimit;
            return this;
        }

        /**
         * <p>The ID of the backup vault. This parameter is not required if you set the SourceType parameter to UDM_ECS.</p>
         * 
         * <strong>example:</strong>
         * <p>v-000xxxxxxxxxxxxxxy1v</p>
         */
        public Builder vaultId(String vaultId) {
            this.putQueryParameter("VaultId", vaultId);
            this.vaultId = vaultId;
            return this;
        }

        @Override
        public CreateBackupJobRequest build() {
            return new CreateBackupJobRequest(this);
        } 

    } 

}
