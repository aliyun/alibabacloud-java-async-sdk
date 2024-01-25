// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBackupJobRequest} extends {@link RequestModel}
 *
 * <p>CreateBackupJobRequest</p>
 */
public class CreateBackupJobRequest extends Request {
    @Query
    @NameInMap("BackupType")
    private String backupType;

    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("ContainerClusterId")
    private String containerClusterId;

    @Query
    @NameInMap("ContainerResources")
    private String containerResources;

    @Query
    @NameInMap("CrossAccountRoleName")
    private String crossAccountRoleName;

    @Query
    @NameInMap("CrossAccountType")
    private String crossAccountType;

    @Query
    @NameInMap("CrossAccountUserId")
    private Long crossAccountUserId;

    @Query
    @NameInMap("Detail")
    private java.util.Map < String, ? > detail;

    @Query
    @NameInMap("Exclude")
    private String exclude;

    @Query
    @NameInMap("Include")
    private String include;

    @Query
    @NameInMap("InitiatedByAck")
    private Boolean initiatedByAck;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("JobName")
    private String jobName;

    @Query
    @NameInMap("Options")
    private String options;

    @Query
    @NameInMap("Retention")
    private Long retention;

    @Query
    @NameInMap("SourceType")
    @Validation(required = true)
    private String sourceType;

    @Query
    @NameInMap("SpeedLimit")
    private String speedLimit;

    @Query
    @NameInMap("VaultId")
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
    public java.util.Map < String, ? > getDetail() {
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
        private java.util.Map < String, ? > detail; 
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
         * The backup type. Valid values:
         * <p>
         * 
         * *   **COMPLETE**: full backup
         * *   **INCREMENTAL**: incremental backup
         */
        public Builder backupType(String backupType) {
            this.putQueryParameter("BackupType", backupType);
            this.backupType = backupType;
            return this;
        }

        /**
         * The ID of the cluster.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The ID of the cluster. This parameter is required only if you set the **SourceType** parameter to **CONTAINER**.
         */
        public Builder containerClusterId(String containerClusterId) {
            this.putQueryParameter("ContainerClusterId", containerClusterId);
            this.containerClusterId = containerClusterId;
            return this;
        }

        /**
         * The cluster resources. This parameter is required only if you set the **SourceType** parameter to **CONTAINER**.
         */
        public Builder containerResources(String containerResources) {
            this.putQueryParameter("ContainerResources", containerResources);
            this.containerResources = containerResources;
            return this;
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
         * Detail.
         */
        public Builder detail(java.util.Map < String, ? > detail) {
            String detailShrink = shrink(detail, "Detail", "json");
            this.putQueryParameter("Detail", detailShrink);
            this.detail = detail;
            return this;
        }

        /**
         * This parameter is required only if you set the **SourceType** parameter to **ECS_FILE**. This parameter specifies the paths to the files that are excluded from the backup job. The value must be 1 to 255 characters in length.
         */
        public Builder exclude(String exclude) {
            this.putQueryParameter("Exclude", exclude);
            this.exclude = exclude;
            return this;
        }

        /**
         * This parameter is required only if you set the **SourceType** parameter to **ECS_FILE**. This parameter specifies the paths to the files that you want to back up. The value must be 1 to 255 characters in length.
         */
        public Builder include(String include) {
            this.putQueryParameter("Include", include);
            this.include = include;
            return this;
        }

        /**
         * This parameter specifies whether to initiate the request by using Container Service for Kubernetes (ACK). Default value: false.
         */
        public Builder initiatedByAck(Boolean initiatedByAck) {
            this.putQueryParameter("InitiatedByAck", initiatedByAck);
            this.initiatedByAck = initiatedByAck;
            return this;
        }

        /**
         * This parameter is required only if you set the **SourceType** parameter to **UDM_ECS**. This parameter specifies the ID of the ECS instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The name of the backup job.
         */
        public Builder jobName(String jobName) {
            this.putQueryParameter("JobName", jobName);
            this.jobName = jobName;
            return this;
        }

        /**
         * This parameter is required only if you set the **SourceType** parameter to **ECS_FILE**. This parameter specifies whether to use Windows Volume Shadow Copy Service (VSS) to define a source path.
         * <p>
         * 
         * *   This parameter is available only for Windows ECS instances.
         * *   If data changes occur in the backup source, the source data must be the same as the data to be backed up before you can set this parameter to `["UseVSS":true]`.
         * *   If you use VSS, you cannot back up data from multiple directories.
         */
        public Builder options(String options) {
            this.putQueryParameter("Options", options);
            this.options = options;
            return this;
        }

        /**
         * The retention period of the backup data. Unit: days.
         */
        public Builder retention(Long retention) {
            this.putQueryParameter("Retention", retention);
            this.retention = retention;
            return this;
        }

        /**
         * The type of the data source. Valid values:
         * <p>
         * 
         * *   **ECS_FILE**: Elastic Compute Service (ECS) files
         * *   **UDM_ECS**: ECS instances
         * *   **CONTAINER**: containers
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * This parameter is required only if you set the **SourceType** parameter to **ECS_FILE**. This parameter specifies the throttling rules. Format: `{start}|{end}|{bandwidth}`. Separate multiple throttling rules with vertical bars (|). A specified time range cannot overlap with another time range.
         * <p>
         * 
         * *   **start**: the start hour.
         * *   **end**: the end hour.
         * *   **bandwidth**: the bandwidth. Unit: KB/s.
         */
        public Builder speedLimit(String speedLimit) {
            this.putQueryParameter("SpeedLimit", speedLimit);
            this.speedLimit = speedLimit;
            return this;
        }

        /**
         * The ID of the backup vault.
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
