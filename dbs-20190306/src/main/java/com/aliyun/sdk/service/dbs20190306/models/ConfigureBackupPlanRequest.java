// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigureBackupPlanRequest} extends {@link RequestModel}
 *
 * <p>ConfigureBackupPlanRequest</p>
 */
public class ConfigureBackupPlanRequest extends Request {
    @Query
    @NameInMap("AutoStartBackup")
    private Boolean autoStartBackup;

    @Query
    @NameInMap("BackupGatewayId")
    private Long backupGatewayId;

    @Query
    @NameInMap("BackupLogIntervalSeconds")
    private Integer backupLogIntervalSeconds;

    @Query
    @NameInMap("BackupObjects")
    private String backupObjects;

    @Query
    @NameInMap("BackupPeriod")
    private String backupPeriod;

    @Query
    @NameInMap("BackupPlanId")
    @Validation(required = true)
    private String backupPlanId;

    @Query
    @NameInMap("BackupPlanName")
    @Validation(required = true)
    private String backupPlanName;

    @Query
    @NameInMap("BackupRateLimit")
    private Long backupRateLimit;

    @Query
    @NameInMap("BackupRetentionPeriod")
    private Integer backupRetentionPeriod;

    @Query
    @NameInMap("BackupSpeedLimit")
    private Long backupSpeedLimit;

    @Query
    @NameInMap("BackupStartTime")
    private String backupStartTime;

    @Query
    @NameInMap("BackupStorageType")
    private String backupStorageType;

    @Query
    @NameInMap("BackupStrategyType")
    private String backupStrategyType;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("CrossAliyunId")
    private String crossAliyunId;

    @Query
    @NameInMap("CrossRoleName")
    private String crossRoleName;

    @Query
    @NameInMap("DuplicationArchivePeriod")
    private Integer duplicationArchivePeriod;

    @Query
    @NameInMap("DuplicationInfrequentAccessPeriod")
    private Integer duplicationInfrequentAccessPeriod;

    @Query
    @NameInMap("EnableBackupLog")
    private Boolean enableBackupLog;

    @Query
    @NameInMap("OSSBucketName")
    private String OSSBucketName;

    @Query
    @NameInMap("OwnerId")
    private String ownerId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("SourceEndpointDatabaseName")
    private String sourceEndpointDatabaseName;

    @Query
    @NameInMap("SourceEndpointIP")
    private String sourceEndpointIP;

    @Query
    @NameInMap("SourceEndpointInstanceID")
    private String sourceEndpointInstanceID;

    @Query
    @NameInMap("SourceEndpointInstanceType")
    @Validation(required = true)
    private String sourceEndpointInstanceType;

    @Query
    @NameInMap("SourceEndpointOracleSID")
    private String sourceEndpointOracleSID;

    @Query
    @NameInMap("SourceEndpointPassword")
    private String sourceEndpointPassword;

    @Query
    @NameInMap("SourceEndpointPort")
    private Integer sourceEndpointPort;

    @Query
    @NameInMap("SourceEndpointRegion")
    private String sourceEndpointRegion;

    @Query
    @NameInMap("SourceEndpointUserName")
    private String sourceEndpointUserName;

    private ConfigureBackupPlanRequest(Builder builder) {
        super(builder);
        this.autoStartBackup = builder.autoStartBackup;
        this.backupGatewayId = builder.backupGatewayId;
        this.backupLogIntervalSeconds = builder.backupLogIntervalSeconds;
        this.backupObjects = builder.backupObjects;
        this.backupPeriod = builder.backupPeriod;
        this.backupPlanId = builder.backupPlanId;
        this.backupPlanName = builder.backupPlanName;
        this.backupRateLimit = builder.backupRateLimit;
        this.backupRetentionPeriod = builder.backupRetentionPeriod;
        this.backupSpeedLimit = builder.backupSpeedLimit;
        this.backupStartTime = builder.backupStartTime;
        this.backupStorageType = builder.backupStorageType;
        this.backupStrategyType = builder.backupStrategyType;
        this.clientToken = builder.clientToken;
        this.crossAliyunId = builder.crossAliyunId;
        this.crossRoleName = builder.crossRoleName;
        this.duplicationArchivePeriod = builder.duplicationArchivePeriod;
        this.duplicationInfrequentAccessPeriod = builder.duplicationInfrequentAccessPeriod;
        this.enableBackupLog = builder.enableBackupLog;
        this.OSSBucketName = builder.OSSBucketName;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.sourceEndpointDatabaseName = builder.sourceEndpointDatabaseName;
        this.sourceEndpointIP = builder.sourceEndpointIP;
        this.sourceEndpointInstanceID = builder.sourceEndpointInstanceID;
        this.sourceEndpointInstanceType = builder.sourceEndpointInstanceType;
        this.sourceEndpointOracleSID = builder.sourceEndpointOracleSID;
        this.sourceEndpointPassword = builder.sourceEndpointPassword;
        this.sourceEndpointPort = builder.sourceEndpointPort;
        this.sourceEndpointRegion = builder.sourceEndpointRegion;
        this.sourceEndpointUserName = builder.sourceEndpointUserName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigureBackupPlanRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoStartBackup
     */
    public Boolean getAutoStartBackup() {
        return this.autoStartBackup;
    }

    /**
     * @return backupGatewayId
     */
    public Long getBackupGatewayId() {
        return this.backupGatewayId;
    }

    /**
     * @return backupLogIntervalSeconds
     */
    public Integer getBackupLogIntervalSeconds() {
        return this.backupLogIntervalSeconds;
    }

    /**
     * @return backupObjects
     */
    public String getBackupObjects() {
        return this.backupObjects;
    }

    /**
     * @return backupPeriod
     */
    public String getBackupPeriod() {
        return this.backupPeriod;
    }

    /**
     * @return backupPlanId
     */
    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    /**
     * @return backupPlanName
     */
    public String getBackupPlanName() {
        return this.backupPlanName;
    }

    /**
     * @return backupRateLimit
     */
    public Long getBackupRateLimit() {
        return this.backupRateLimit;
    }

    /**
     * @return backupRetentionPeriod
     */
    public Integer getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    /**
     * @return backupSpeedLimit
     */
    public Long getBackupSpeedLimit() {
        return this.backupSpeedLimit;
    }

    /**
     * @return backupStartTime
     */
    public String getBackupStartTime() {
        return this.backupStartTime;
    }

    /**
     * @return backupStorageType
     */
    public String getBackupStorageType() {
        return this.backupStorageType;
    }

    /**
     * @return backupStrategyType
     */
    public String getBackupStrategyType() {
        return this.backupStrategyType;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return crossAliyunId
     */
    public String getCrossAliyunId() {
        return this.crossAliyunId;
    }

    /**
     * @return crossRoleName
     */
    public String getCrossRoleName() {
        return this.crossRoleName;
    }

    /**
     * @return duplicationArchivePeriod
     */
    public Integer getDuplicationArchivePeriod() {
        return this.duplicationArchivePeriod;
    }

    /**
     * @return duplicationInfrequentAccessPeriod
     */
    public Integer getDuplicationInfrequentAccessPeriod() {
        return this.duplicationInfrequentAccessPeriod;
    }

    /**
     * @return enableBackupLog
     */
    public Boolean getEnableBackupLog() {
        return this.enableBackupLog;
    }

    /**
     * @return OSSBucketName
     */
    public String getOSSBucketName() {
        return this.OSSBucketName;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
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
     * @return sourceEndpointDatabaseName
     */
    public String getSourceEndpointDatabaseName() {
        return this.sourceEndpointDatabaseName;
    }

    /**
     * @return sourceEndpointIP
     */
    public String getSourceEndpointIP() {
        return this.sourceEndpointIP;
    }

    /**
     * @return sourceEndpointInstanceID
     */
    public String getSourceEndpointInstanceID() {
        return this.sourceEndpointInstanceID;
    }

    /**
     * @return sourceEndpointInstanceType
     */
    public String getSourceEndpointInstanceType() {
        return this.sourceEndpointInstanceType;
    }

    /**
     * @return sourceEndpointOracleSID
     */
    public String getSourceEndpointOracleSID() {
        return this.sourceEndpointOracleSID;
    }

    /**
     * @return sourceEndpointPassword
     */
    public String getSourceEndpointPassword() {
        return this.sourceEndpointPassword;
    }

    /**
     * @return sourceEndpointPort
     */
    public Integer getSourceEndpointPort() {
        return this.sourceEndpointPort;
    }

    /**
     * @return sourceEndpointRegion
     */
    public String getSourceEndpointRegion() {
        return this.sourceEndpointRegion;
    }

    /**
     * @return sourceEndpointUserName
     */
    public String getSourceEndpointUserName() {
        return this.sourceEndpointUserName;
    }

    public static final class Builder extends Request.Builder<ConfigureBackupPlanRequest, Builder> {
        private Boolean autoStartBackup; 
        private Long backupGatewayId; 
        private Integer backupLogIntervalSeconds; 
        private String backupObjects; 
        private String backupPeriod; 
        private String backupPlanId; 
        private String backupPlanName; 
        private Long backupRateLimit; 
        private Integer backupRetentionPeriod; 
        private Long backupSpeedLimit; 
        private String backupStartTime; 
        private String backupStorageType; 
        private String backupStrategyType; 
        private String clientToken; 
        private String crossAliyunId; 
        private String crossRoleName; 
        private Integer duplicationArchivePeriod; 
        private Integer duplicationInfrequentAccessPeriod; 
        private Boolean enableBackupLog; 
        private String OSSBucketName; 
        private String ownerId; 
        private String regionId; 
        private String resourceGroupId; 
        private String sourceEndpointDatabaseName; 
        private String sourceEndpointIP; 
        private String sourceEndpointInstanceID; 
        private String sourceEndpointInstanceType; 
        private String sourceEndpointOracleSID; 
        private String sourceEndpointPassword; 
        private Integer sourceEndpointPort; 
        private String sourceEndpointRegion; 
        private String sourceEndpointUserName; 

        private Builder() {
            super();
        } 

        private Builder(ConfigureBackupPlanRequest request) {
            super(request);
            this.autoStartBackup = request.autoStartBackup;
            this.backupGatewayId = request.backupGatewayId;
            this.backupLogIntervalSeconds = request.backupLogIntervalSeconds;
            this.backupObjects = request.backupObjects;
            this.backupPeriod = request.backupPeriod;
            this.backupPlanId = request.backupPlanId;
            this.backupPlanName = request.backupPlanName;
            this.backupRateLimit = request.backupRateLimit;
            this.backupRetentionPeriod = request.backupRetentionPeriod;
            this.backupSpeedLimit = request.backupSpeedLimit;
            this.backupStartTime = request.backupStartTime;
            this.backupStorageType = request.backupStorageType;
            this.backupStrategyType = request.backupStrategyType;
            this.clientToken = request.clientToken;
            this.crossAliyunId = request.crossAliyunId;
            this.crossRoleName = request.crossRoleName;
            this.duplicationArchivePeriod = request.duplicationArchivePeriod;
            this.duplicationInfrequentAccessPeriod = request.duplicationInfrequentAccessPeriod;
            this.enableBackupLog = request.enableBackupLog;
            this.OSSBucketName = request.OSSBucketName;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.sourceEndpointDatabaseName = request.sourceEndpointDatabaseName;
            this.sourceEndpointIP = request.sourceEndpointIP;
            this.sourceEndpointInstanceID = request.sourceEndpointInstanceID;
            this.sourceEndpointInstanceType = request.sourceEndpointInstanceType;
            this.sourceEndpointOracleSID = request.sourceEndpointOracleSID;
            this.sourceEndpointPassword = request.sourceEndpointPassword;
            this.sourceEndpointPort = request.sourceEndpointPort;
            this.sourceEndpointRegion = request.sourceEndpointRegion;
            this.sourceEndpointUserName = request.sourceEndpointUserName;
        } 

        /**
         * AutoStartBackup.
         */
        public Builder autoStartBackup(Boolean autoStartBackup) {
            this.putQueryParameter("AutoStartBackup", autoStartBackup);
            this.autoStartBackup = autoStartBackup;
            return this;
        }

        /**
         * BackupGatewayId.
         */
        public Builder backupGatewayId(Long backupGatewayId) {
            this.putQueryParameter("BackupGatewayId", backupGatewayId);
            this.backupGatewayId = backupGatewayId;
            return this;
        }

        /**
         * BackupLogIntervalSeconds.
         */
        public Builder backupLogIntervalSeconds(Integer backupLogIntervalSeconds) {
            this.putQueryParameter("BackupLogIntervalSeconds", backupLogIntervalSeconds);
            this.backupLogIntervalSeconds = backupLogIntervalSeconds;
            return this;
        }

        /**
         * BackupObjects.
         */
        public Builder backupObjects(String backupObjects) {
            this.putQueryParameter("BackupObjects", backupObjects);
            this.backupObjects = backupObjects;
            return this;
        }

        /**
         * BackupPeriod.
         */
        public Builder backupPeriod(String backupPeriod) {
            this.putQueryParameter("BackupPeriod", backupPeriod);
            this.backupPeriod = backupPeriod;
            return this;
        }

        /**
         * BackupPlanId.
         */
        public Builder backupPlanId(String backupPlanId) {
            this.putQueryParameter("BackupPlanId", backupPlanId);
            this.backupPlanId = backupPlanId;
            return this;
        }

        /**
         * BackupPlanName.
         */
        public Builder backupPlanName(String backupPlanName) {
            this.putQueryParameter("BackupPlanName", backupPlanName);
            this.backupPlanName = backupPlanName;
            return this;
        }

        /**
         * BackupRateLimit.
         */
        public Builder backupRateLimit(Long backupRateLimit) {
            this.putQueryParameter("BackupRateLimit", backupRateLimit);
            this.backupRateLimit = backupRateLimit;
            return this;
        }

        /**
         * BackupRetentionPeriod.
         */
        public Builder backupRetentionPeriod(Integer backupRetentionPeriod) {
            this.putQueryParameter("BackupRetentionPeriod", backupRetentionPeriod);
            this.backupRetentionPeriod = backupRetentionPeriod;
            return this;
        }

        /**
         * BackupSpeedLimit.
         */
        public Builder backupSpeedLimit(Long backupSpeedLimit) {
            this.putQueryParameter("BackupSpeedLimit", backupSpeedLimit);
            this.backupSpeedLimit = backupSpeedLimit;
            return this;
        }

        /**
         * BackupStartTime.
         */
        public Builder backupStartTime(String backupStartTime) {
            this.putQueryParameter("BackupStartTime", backupStartTime);
            this.backupStartTime = backupStartTime;
            return this;
        }

        /**
         * BackupStorageType.
         */
        public Builder backupStorageType(String backupStorageType) {
            this.putQueryParameter("BackupStorageType", backupStorageType);
            this.backupStorageType = backupStorageType;
            return this;
        }

        /**
         * BackupStrategyType.
         */
        public Builder backupStrategyType(String backupStrategyType) {
            this.putQueryParameter("BackupStrategyType", backupStrategyType);
            this.backupStrategyType = backupStrategyType;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * CrossAliyunId.
         */
        public Builder crossAliyunId(String crossAliyunId) {
            this.putQueryParameter("CrossAliyunId", crossAliyunId);
            this.crossAliyunId = crossAliyunId;
            return this;
        }

        /**
         * CrossRoleName.
         */
        public Builder crossRoleName(String crossRoleName) {
            this.putQueryParameter("CrossRoleName", crossRoleName);
            this.crossRoleName = crossRoleName;
            return this;
        }

        /**
         * DuplicationArchivePeriod.
         */
        public Builder duplicationArchivePeriod(Integer duplicationArchivePeriod) {
            this.putQueryParameter("DuplicationArchivePeriod", duplicationArchivePeriod);
            this.duplicationArchivePeriod = duplicationArchivePeriod;
            return this;
        }

        /**
         * DuplicationInfrequentAccessPeriod.
         */
        public Builder duplicationInfrequentAccessPeriod(Integer duplicationInfrequentAccessPeriod) {
            this.putQueryParameter("DuplicationInfrequentAccessPeriod", duplicationInfrequentAccessPeriod);
            this.duplicationInfrequentAccessPeriod = duplicationInfrequentAccessPeriod;
            return this;
        }

        /**
         * EnableBackupLog.
         */
        public Builder enableBackupLog(Boolean enableBackupLog) {
            this.putQueryParameter("EnableBackupLog", enableBackupLog);
            this.enableBackupLog = enableBackupLog;
            return this;
        }

        /**
         * OSSBucketName.
         */
        public Builder OSSBucketName(String OSSBucketName) {
            this.putQueryParameter("OSSBucketName", OSSBucketName);
            this.OSSBucketName = OSSBucketName;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
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
         * SourceEndpointDatabaseName.
         */
        public Builder sourceEndpointDatabaseName(String sourceEndpointDatabaseName) {
            this.putQueryParameter("SourceEndpointDatabaseName", sourceEndpointDatabaseName);
            this.sourceEndpointDatabaseName = sourceEndpointDatabaseName;
            return this;
        }

        /**
         * SourceEndpointIP.
         */
        public Builder sourceEndpointIP(String sourceEndpointIP) {
            this.putQueryParameter("SourceEndpointIP", sourceEndpointIP);
            this.sourceEndpointIP = sourceEndpointIP;
            return this;
        }

        /**
         * SourceEndpointInstanceID.
         */
        public Builder sourceEndpointInstanceID(String sourceEndpointInstanceID) {
            this.putQueryParameter("SourceEndpointInstanceID", sourceEndpointInstanceID);
            this.sourceEndpointInstanceID = sourceEndpointInstanceID;
            return this;
        }

        /**
         * SourceEndpointInstanceType.
         */
        public Builder sourceEndpointInstanceType(String sourceEndpointInstanceType) {
            this.putQueryParameter("SourceEndpointInstanceType", sourceEndpointInstanceType);
            this.sourceEndpointInstanceType = sourceEndpointInstanceType;
            return this;
        }

        /**
         * SourceEndpointOracleSID.
         */
        public Builder sourceEndpointOracleSID(String sourceEndpointOracleSID) {
            this.putQueryParameter("SourceEndpointOracleSID", sourceEndpointOracleSID);
            this.sourceEndpointOracleSID = sourceEndpointOracleSID;
            return this;
        }

        /**
         * SourceEndpointPassword.
         */
        public Builder sourceEndpointPassword(String sourceEndpointPassword) {
            this.putQueryParameter("SourceEndpointPassword", sourceEndpointPassword);
            this.sourceEndpointPassword = sourceEndpointPassword;
            return this;
        }

        /**
         * SourceEndpointPort.
         */
        public Builder sourceEndpointPort(Integer sourceEndpointPort) {
            this.putQueryParameter("SourceEndpointPort", sourceEndpointPort);
            this.sourceEndpointPort = sourceEndpointPort;
            return this;
        }

        /**
         * SourceEndpointRegion.
         */
        public Builder sourceEndpointRegion(String sourceEndpointRegion) {
            this.putQueryParameter("SourceEndpointRegion", sourceEndpointRegion);
            this.sourceEndpointRegion = sourceEndpointRegion;
            return this;
        }

        /**
         * SourceEndpointUserName.
         */
        public Builder sourceEndpointUserName(String sourceEndpointUserName) {
            this.putQueryParameter("SourceEndpointUserName", sourceEndpointUserName);
            this.sourceEndpointUserName = sourceEndpointUserName;
            return this;
        }

        @Override
        public ConfigureBackupPlanRequest build() {
            return new ConfigureBackupPlanRequest(this);
        } 

    } 

}
