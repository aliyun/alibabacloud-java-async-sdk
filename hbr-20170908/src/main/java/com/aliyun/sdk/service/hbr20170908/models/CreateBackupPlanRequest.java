// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBackupPlanRequest} extends {@link RequestModel}
 *
 * <p>CreateBackupPlanRequest</p>
 */
public class CreateBackupPlanRequest extends Request {
    @Query
    @NameInMap("BackupType")
    @Validation(required = true)
    private String backupType;

    @Query
    @NameInMap("Bucket")
    private String bucket;

    @Query
    @NameInMap("CreateTime")
    private Long createTime;

    @Body
    @NameInMap("Exclude")
    private String exclude;

    @Query
    @NameInMap("FileSystemId")
    private String fileSystemId;

    @Body
    @NameInMap("Include")
    private String include;

    @Query
    @NameInMap("InstanceGroupId")
    private String instanceGroupId;

    @Body
    @NameInMap("InstanceId")
    private String instanceId;

    @Body
    @NameInMap("InstanceName")
    private String instanceName;

    @Body
    @NameInMap("Options")
    private String options;

    @Body
    @NameInMap("OtsDetail")
    private OtsDetail otsDetail;

    @Body
    @NameInMap("Path")
    private java.util.List < String > path;

    @Query
    @NameInMap("PlanName")
    @Validation(required = true)
    private String planName;

    @Query
    @NameInMap("Prefix")
    private String prefix;

    @Query
    @NameInMap("Retention")
    private Long retention;

    @Query
    @NameInMap("Schedule")
    @Validation(required = true)
    private String schedule;

    @Query
    @NameInMap("SourceType")
    @Validation(required = true)
    private String sourceType;

    @Body
    @NameInMap("SpeedLimit")
    private String speedLimit;

    @Query
    @NameInMap("VaultId")
    private String vaultId;

    private CreateBackupPlanRequest(Builder builder) {
        super(builder);
        this.backupType = builder.backupType;
        this.bucket = builder.bucket;
        this.createTime = builder.createTime;
        this.exclude = builder.exclude;
        this.fileSystemId = builder.fileSystemId;
        this.include = builder.include;
        this.instanceGroupId = builder.instanceGroupId;
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.options = builder.options;
        this.otsDetail = builder.otsDetail;
        this.path = builder.path;
        this.planName = builder.planName;
        this.prefix = builder.prefix;
        this.retention = builder.retention;
        this.schedule = builder.schedule;
        this.sourceType = builder.sourceType;
        this.speedLimit = builder.speedLimit;
        this.vaultId = builder.vaultId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBackupPlanRequest create() {
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
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return exclude
     */
    public String getExclude() {
        return this.exclude;
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @return include
     */
    public String getInclude() {
        return this.include;
    }

    /**
     * @return instanceGroupId
     */
    public String getInstanceGroupId() {
        return this.instanceGroupId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
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
    public OtsDetail getOtsDetail() {
        return this.otsDetail;
    }

    /**
     * @return path
     */
    public java.util.List < String > getPath() {
        return this.path;
    }

    /**
     * @return planName
     */
    public String getPlanName() {
        return this.planName;
    }

    /**
     * @return prefix
     */
    public String getPrefix() {
        return this.prefix;
    }

    /**
     * @return retention
     */
    public Long getRetention() {
        return this.retention;
    }

    /**
     * @return schedule
     */
    public String getSchedule() {
        return this.schedule;
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

    public static final class Builder extends Request.Builder<CreateBackupPlanRequest, Builder> {
        private String backupType; 
        private String bucket; 
        private Long createTime; 
        private String exclude; 
        private String fileSystemId; 
        private String include; 
        private String instanceGroupId; 
        private String instanceId; 
        private String instanceName; 
        private String options; 
        private OtsDetail otsDetail; 
        private java.util.List < String > path; 
        private String planName; 
        private String prefix; 
        private Long retention; 
        private String schedule; 
        private String sourceType; 
        private String speedLimit; 
        private String vaultId; 

        private Builder() {
            super();
        } 

        private Builder(CreateBackupPlanRequest response) {
            super(response);
            this.backupType = response.backupType;
            this.bucket = response.bucket;
            this.createTime = response.createTime;
            this.exclude = response.exclude;
            this.fileSystemId = response.fileSystemId;
            this.include = response.include;
            this.instanceGroupId = response.instanceGroupId;
            this.instanceId = response.instanceId;
            this.instanceName = response.instanceName;
            this.options = response.options;
            this.otsDetail = response.otsDetail;
            this.path = response.path;
            this.planName = response.planName;
            this.prefix = response.prefix;
            this.retention = response.retention;
            this.schedule = response.schedule;
            this.sourceType = response.sourceType;
            this.speedLimit = response.speedLimit;
            this.vaultId = response.vaultId;
        } 

        /**
         * BackupType.
         */
        public Builder backupType(String backupType) {
            this.putQueryParameter("BackupType", backupType);
            this.backupType = backupType;
            return this;
        }

        /**
         * Bucket.
         */
        public Builder bucket(String bucket) {
            this.putQueryParameter("Bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(Long createTime) {
            this.putQueryParameter("CreateTime", createTime);
            this.createTime = createTime;
            return this;
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
         * FileSystemId.
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
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
         * InstanceGroupId.
         */
        public Builder instanceGroupId(String instanceGroupId) {
            this.putQueryParameter("InstanceGroupId", instanceGroupId);
            this.instanceGroupId = instanceGroupId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.putBodyParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * Options.
         */
        public Builder options(String options) {
            this.putBodyParameter("Options", options);
            this.options = options;
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
         * Path.
         */
        public Builder path(java.util.List < String > path) {
            this.putBodyParameter("Path", path);
            this.path = path;
            return this;
        }

        /**
         * PlanName.
         */
        public Builder planName(String planName) {
            this.putQueryParameter("PlanName", planName);
            this.planName = planName;
            return this;
        }

        /**
         * Prefix.
         */
        public Builder prefix(String prefix) {
            this.putQueryParameter("Prefix", prefix);
            this.prefix = prefix;
            return this;
        }

        /**
         * Retention.
         */
        public Builder retention(Long retention) {
            this.putQueryParameter("Retention", retention);
            this.retention = retention;
            return this;
        }

        /**
         * Schedule.
         */
        public Builder schedule(String schedule) {
            this.putQueryParameter("Schedule", schedule);
            this.schedule = schedule;
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
         * SpeedLimit.
         */
        public Builder speedLimit(String speedLimit) {
            this.putBodyParameter("SpeedLimit", speedLimit);
            this.speedLimit = speedLimit;
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
        public CreateBackupPlanRequest build() {
            return new CreateBackupPlanRequest(this);
        } 

    } 

}
