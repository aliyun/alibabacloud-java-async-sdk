// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

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
 * {@link ConfigureBackupPlanRequest} extends {@link RequestModel}
 *
 * <p>ConfigureBackupPlanRequest</p>
 */
public class ConfigureBackupPlanRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoStartBackup")
    private Boolean autoStartBackup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupGatewayId")
    private Long backupGatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupLogIntervalSeconds")
    private Integer backupLogIntervalSeconds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupObjects")
    private String backupObjects;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupPeriod")
    private String backupPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupPlanId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String backupPlanId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupPlanName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String backupPlanName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupRateLimit")
    private Long backupRateLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupRetentionPeriod")
    private Integer backupRetentionPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupSpeedLimit")
    private Long backupSpeedLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupStartTime")
    private String backupStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupStorageEncryptMethod")
    private String backupStorageEncryptMethod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupStorageType")
    private String backupStorageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupStrategyType")
    private String backupStrategyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrossAliyunId")
    private String crossAliyunId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrossRoleName")
    private String crossRoleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DuplicationArchivePeriod")
    private Integer duplicationArchivePeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DuplicationInfrequentAccessPeriod")
    private Integer duplicationInfrequentAccessPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableBackupLog")
    private Boolean enableBackupLog;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableMysqlPhysicalBackupBinlog")
    private String enableMysqlPhysicalBackupBinlog;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableSourceEndpointSsl")
    private String enableSourceEndpointSsl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OSSBucketName")
    private String OSSBucketName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceEndpointDatabaseName")
    private String sourceEndpointDatabaseName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceEndpointIP")
    private String sourceEndpointIP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceEndpointInstanceID")
    private String sourceEndpointInstanceID;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceEndpointInstanceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceEndpointInstanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceEndpointOracleHome")
    private String sourceEndpointOracleHome;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceEndpointOracleSID")
    private String sourceEndpointOracleSID;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceEndpointPassword")
    private String sourceEndpointPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceEndpointPort")
    private Integer sourceEndpointPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceEndpointRegion")
    private String sourceEndpointRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceEndpointUserName")
    private String sourceEndpointUserName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SslCaPem")
    private String sslCaPem;

    private ConfigureBackupPlanRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
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
        this.backupStorageEncryptMethod = builder.backupStorageEncryptMethod;
        this.backupStorageType = builder.backupStorageType;
        this.backupStrategyType = builder.backupStrategyType;
        this.clientToken = builder.clientToken;
        this.crossAliyunId = builder.crossAliyunId;
        this.crossRoleName = builder.crossRoleName;
        this.duplicationArchivePeriod = builder.duplicationArchivePeriod;
        this.duplicationInfrequentAccessPeriod = builder.duplicationInfrequentAccessPeriod;
        this.enableBackupLog = builder.enableBackupLog;
        this.enableMysqlPhysicalBackupBinlog = builder.enableMysqlPhysicalBackupBinlog;
        this.enableSourceEndpointSsl = builder.enableSourceEndpointSsl;
        this.OSSBucketName = builder.OSSBucketName;
        this.ownerId = builder.ownerId;
        this.resourceGroupId = builder.resourceGroupId;
        this.sourceEndpointDatabaseName = builder.sourceEndpointDatabaseName;
        this.sourceEndpointIP = builder.sourceEndpointIP;
        this.sourceEndpointInstanceID = builder.sourceEndpointInstanceID;
        this.sourceEndpointInstanceType = builder.sourceEndpointInstanceType;
        this.sourceEndpointOracleHome = builder.sourceEndpointOracleHome;
        this.sourceEndpointOracleSID = builder.sourceEndpointOracleSID;
        this.sourceEndpointPassword = builder.sourceEndpointPassword;
        this.sourceEndpointPort = builder.sourceEndpointPort;
        this.sourceEndpointRegion = builder.sourceEndpointRegion;
        this.sourceEndpointUserName = builder.sourceEndpointUserName;
        this.sslCaPem = builder.sslCaPem;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return backupStorageEncryptMethod
     */
    public String getBackupStorageEncryptMethod() {
        return this.backupStorageEncryptMethod;
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
     * @return enableMysqlPhysicalBackupBinlog
     */
    public String getEnableMysqlPhysicalBackupBinlog() {
        return this.enableMysqlPhysicalBackupBinlog;
    }

    /**
     * @return enableSourceEndpointSsl
     */
    public String getEnableSourceEndpointSsl() {
        return this.enableSourceEndpointSsl;
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
     * @return sourceEndpointOracleHome
     */
    public String getSourceEndpointOracleHome() {
        return this.sourceEndpointOracleHome;
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

    /**
     * @return sslCaPem
     */
    public String getSslCaPem() {
        return this.sslCaPem;
    }

    public static final class Builder extends Request.Builder<ConfigureBackupPlanRequest, Builder> {
        private String regionId; 
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
        private String backupStorageEncryptMethod; 
        private String backupStorageType; 
        private String backupStrategyType; 
        private String clientToken; 
        private String crossAliyunId; 
        private String crossRoleName; 
        private Integer duplicationArchivePeriod; 
        private Integer duplicationInfrequentAccessPeriod; 
        private Boolean enableBackupLog; 
        private String enableMysqlPhysicalBackupBinlog; 
        private String enableSourceEndpointSsl; 
        private String OSSBucketName; 
        private String ownerId; 
        private String resourceGroupId; 
        private String sourceEndpointDatabaseName; 
        private String sourceEndpointIP; 
        private String sourceEndpointInstanceID; 
        private String sourceEndpointInstanceType; 
        private String sourceEndpointOracleHome; 
        private String sourceEndpointOracleSID; 
        private String sourceEndpointPassword; 
        private Integer sourceEndpointPort; 
        private String sourceEndpointRegion; 
        private String sourceEndpointUserName; 
        private String sslCaPem; 

        private Builder() {
            super();
        } 

        private Builder(ConfigureBackupPlanRequest request) {
            super(request);
            this.regionId = request.regionId;
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
            this.backupStorageEncryptMethod = request.backupStorageEncryptMethod;
            this.backupStorageType = request.backupStorageType;
            this.backupStrategyType = request.backupStrategyType;
            this.clientToken = request.clientToken;
            this.crossAliyunId = request.crossAliyunId;
            this.crossRoleName = request.crossRoleName;
            this.duplicationArchivePeriod = request.duplicationArchivePeriod;
            this.duplicationInfrequentAccessPeriod = request.duplicationInfrequentAccessPeriod;
            this.enableBackupLog = request.enableBackupLog;
            this.enableMysqlPhysicalBackupBinlog = request.enableMysqlPhysicalBackupBinlog;
            this.enableSourceEndpointSsl = request.enableSourceEndpointSsl;
            this.OSSBucketName = request.OSSBucketName;
            this.ownerId = request.ownerId;
            this.resourceGroupId = request.resourceGroupId;
            this.sourceEndpointDatabaseName = request.sourceEndpointDatabaseName;
            this.sourceEndpointIP = request.sourceEndpointIP;
            this.sourceEndpointInstanceID = request.sourceEndpointInstanceID;
            this.sourceEndpointInstanceType = request.sourceEndpointInstanceType;
            this.sourceEndpointOracleHome = request.sourceEndpointOracleHome;
            this.sourceEndpointOracleSID = request.sourceEndpointOracleSID;
            this.sourceEndpointPassword = request.sourceEndpointPassword;
            this.sourceEndpointPort = request.sourceEndpointPort;
            this.sourceEndpointRegion = request.sourceEndpointRegion;
            this.sourceEndpointUserName = request.sourceEndpointUserName;
            this.sslCaPem = request.sslCaPem;
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
         * <p>Specifies whether to enable automatic backup. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables automatic backup</li>
         * <li><strong>false</strong>: disables automatic backup</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoStartBackup(Boolean autoStartBackup) {
            this.putQueryParameter("AutoStartBackup", autoStartBackup);
            this.autoStartBackup = autoStartBackup;
            return this;
        }

        /**
         * <p>The ID of the backup gateway. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to query the value of this parameter.</p>
         * <blockquote>
         * <p>This parameter is required when <strong>SourceEndpointInstanceType</strong> is set to <strong>agent</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>23313123312</p>
         */
        public Builder backupGatewayId(Long backupGatewayId) {
            this.putQueryParameter("BackupGatewayId", backupGatewayId);
            this.backupGatewayId = backupGatewayId;
            return this;
        }

        /**
         * <p>The interval for incremental backup, in seconds.</p>
         * <blockquote>
         * <p>This parameter is supported only for physical backup.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder backupLogIntervalSeconds(Integer backupLogIntervalSeconds) {
            this.putQueryParameter("BackupLogIntervalSeconds", backupLogIntervalSeconds);
            this.backupLogIntervalSeconds = backupLogIntervalSeconds;
            return this;
        }

        /**
         * <p>The objects to be backed up. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to query the value of this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>[     {         &quot;DBName&quot;:&quot;DatabaseToBackUp&quot;,         &quot;SchemaName&quot;:&quot;SchemaToBackUp&quot;,         &quot;TableIncludes&quot;:[{             &quot;TableName&quot;:&quot;TableToBackUp&quot;         }],         &quot;TableExcludes&quot;:[{             &quot;TableName&quot;:&quot;TableToExclude&quot;         }]     } ]</p>
         */
        public Builder backupObjects(String backupObjects) {
            this.putQueryParameter("BackupObjects", backupObjects);
            this.backupObjects = backupObjects;
            return this;
        }

        /**
         * <p>The full backup cycle. Valid values:</p>
         * <ul>
         * <li><strong>Monday</strong>: Monday</li>
         * <li><strong>Tuesday</strong>: Tuesday</li>
         * <li><strong>Wednesday</strong>: Wednesday</li>
         * <li><strong>Thursday</strong>: Thursday</li>
         * <li><strong>Friday</strong>: Friday</li>
         * <li><strong>Saturday</strong>: Saturday</li>
         * <li><strong>Sunday</strong>: Sunday</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Monday</p>
         */
        public Builder backupPeriod(String backupPeriod) {
            this.putQueryParameter("BackupPeriod", backupPeriod);
            this.backupPeriod = backupPeriod;
            return this;
        }

        /**
         * <p>The ID of the backup plan. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to query the value of this parameter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dbstooi0*******</p>
         */
        public Builder backupPlanId(String backupPlanId) {
            this.putQueryParameter("BackupPlanId", backupPlanId);
            this.backupPlanId = backupPlanId;
            return this;
        }

        /**
         * <p>The custom name of the backup plan. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to query the value of this parameter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dbstooi0*******</p>
         */
        public Builder backupPlanName(String backupPlanName) {
            this.putQueryParameter("BackupPlanName", backupPlanName);
            this.backupPlanName = backupPlanName;
            return this;
        }

        /**
         * <p>The network bandwidth throttling. Unit: KB/s. Maximum value: 10 GB.</p>
         * <blockquote>
         * <p>This parameter takes effect only for MySQL physical backup.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>262144</p>
         */
        public Builder backupRateLimit(Long backupRateLimit) {
            this.putQueryParameter("BackupRateLimit", backupRateLimit);
            this.backupRateLimit = backupRateLimit;
            return this;
        }

        /**
         * <p>The retention period of backup data. Valid values: 0 to 1825. Default value: 730. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>730</p>
         */
        public Builder backupRetentionPeriod(Integer backupRetentionPeriod) {
            this.putQueryParameter("BackupRetentionPeriod", backupRetentionPeriod);
            this.backupRetentionPeriod = backupRetentionPeriod;
            return this;
        }

        /**
         * <p>The disk I/O limit. Unit: KB/s.</p>
         * <blockquote>
         * <p>This parameter takes effect only for MySQL physical backup.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>262144</p>
         */
        public Builder backupSpeedLimit(Long backupSpeedLimit) {
            this.putQueryParameter("BackupSpeedLimit", backupSpeedLimit);
            this.backupSpeedLimit = backupSpeedLimit;
            return this;
        }

        /**
         * <p>The start time of the full backup. The time is in the <i>HH:mm</i>Z format and displayed in UTC. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to query the value of this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>14:22</p>
         */
        public Builder backupStartTime(String backupStartTime) {
            this.putQueryParameter("BackupStartTime", backupStartTime);
            this.backupStartTime = backupStartTime;
            return this;
        }

        /**
         * <p>The encryption method for backup storage.</p>
         * 
         * <strong>example:</strong>
         * <p>encrypted</p>
         */
        public Builder backupStorageEncryptMethod(String backupStorageEncryptMethod) {
            this.putQueryParameter("BackupStorageEncryptMethod", backupStorageEncryptMethod);
            this.backupStorageEncryptMethod = backupStorageEncryptMethod;
            return this;
        }

        /**
         * <p>The built-in storage type. Valid values:</p>
         * <ul>
         * <li>Empty string (default): Backup data is stored in your OSS bucket.</li>
         * <li>system: Backup data is stored in the built-in OSS bucket of DBS.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder backupStorageType(String backupStorageType) {
            this.putQueryParameter("BackupStorageType", backupStorageType);
            this.backupStorageType = backupStorageType;
            return this;
        }

        /**
         * <p>The full backup epoch. Valid values:</p>
         * <ul>
         * <li><strong>simple</strong>: periodic backup, which is used together with BackupPeriod and BackupStartTime</li>
         * <li><strong>manual</strong>: manual backup</li>
         * </ul>
         * <blockquote>
         * <p>Default value: <strong>simple</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>simple</p>
         */
        public Builder backupStrategyType(String backupStrategyType) {
            this.putQueryParameter("BackupStrategyType", backupStrategyType);
            this.backupStrategyType = backupStrategyType;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request and prevent duplicate submissions. You can use the client to generate the value, and you must ensure that the value is unique among different requests. The value can be up to 64 ASCII characters in length and cannot contain non-ASCII characters.</p>
         * 
         * <strong>example:</strong>
         * <p>ETnLKlblzczshOTUbOCzxxxxxxx</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The UID of the Alibaba Cloud account for cross-account backup. You can call the <a href="https://help.aliyun.com/document_detail/2869838.html">DescribeRestoreTaskList</a> operation to query the value of this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>2xxx7778xxxxxxxxxx</p>
         */
        public Builder crossAliyunId(String crossAliyunId) {
            this.putQueryParameter("CrossAliyunId", crossAliyunId);
            this.crossAliyunId = crossAliyunId;
            return this;
        }

        /**
         * <p>The name of the RAM role for cross-account backup. You can call the <a href="https://help.aliyun.com/document_detail/2869838.html">DescribeRestoreTaskList</a> operation to query the value of this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>test123</p>
         */
        public Builder crossRoleName(String crossRoleName) {
            this.putQueryParameter("CrossRoleName", crossRoleName);
            this.crossRoleName = crossRoleName;
            return this;
        }

        /**
         * <p>The period after which backup data is transitioned to Archive storage. Default value: 365. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>365</p>
         */
        public Builder duplicationArchivePeriod(Integer duplicationArchivePeriod) {
            this.putQueryParameter("DuplicationArchivePeriod", duplicationArchivePeriod);
            this.duplicationArchivePeriod = duplicationArchivePeriod;
            return this;
        }

        /**
         * <p>The period after which backup data is transitioned to Infrequent Access (IA) storage. Default value: 180. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>180</p>
         */
        public Builder duplicationInfrequentAccessPeriod(Integer duplicationInfrequentAccessPeriod) {
            this.putQueryParameter("DuplicationInfrequentAccessPeriod", duplicationInfrequentAccessPeriod);
            this.duplicationInfrequentAccessPeriod = duplicationInfrequentAccessPeriod;
            return this;
        }

        /**
         * <p>Specifies whether to enable incremental log backup. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables incremental log backup</li>
         * <li><strong>false</strong>: disables incremental log backup</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableBackupLog(Boolean enableBackupLog) {
            this.putQueryParameter("EnableBackupLog", enableBackupLog);
            this.enableBackupLog = enableBackupLog;
            return this;
        }

        /**
         * <p>Specifies whether to enable log backup for MySQL physical backup.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableMysqlPhysicalBackupBinlog(String enableMysqlPhysicalBackupBinlog) {
            this.putQueryParameter("EnableMysqlPhysicalBackupBinlog", enableMysqlPhysicalBackupBinlog);
            this.enableMysqlPhysicalBackupBinlog = enableMysqlPhysicalBackupBinlog;
            return this;
        }

        /**
         * <p>Specifies whether to enable an SSL-encrypted connection to the source database instance.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableSourceEndpointSsl(String enableSourceEndpointSsl) {
            this.putQueryParameter("EnableSourceEndpointSsl", enableSourceEndpointSsl);
            this.enableSourceEndpointSsl = enableSourceEndpointSsl;
            return this;
        }

        /**
         * <p>The name of the OSS bucket.</p>
         * <blockquote>
         * <p>By default, the system automatically generates a new name.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>TestOssBucket</p>
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
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzecovzti****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The name of the database. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to query the value of this parameter.</p>
         * <blockquote>
         * <p>This parameter is required when the database engine is <strong>PostgreSQL</strong> or <strong>MongoDB</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>testRDS</p>
         */
        public Builder sourceEndpointDatabaseName(String sourceEndpointDatabaseName) {
            this.putQueryParameter("SourceEndpointDatabaseName", sourceEndpointDatabaseName);
            this.sourceEndpointDatabaseName = sourceEndpointDatabaseName;
            return this;
        }

        /**
         * <p>The database connection address. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to query the value of this parameter.</p>
         * <blockquote>
         * <p>This parameter is required when <strong>SourceEndpointInstanceType</strong> is set to <strong>express</strong>, <strong>agent</strong>, or <strong>other</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5*******.mysql.rds.aliyuncs.com</p>
         */
        public Builder sourceEndpointIP(String sourceEndpointIP) {
            this.putQueryParameter("SourceEndpointIP", sourceEndpointIP);
            this.sourceEndpointIP = sourceEndpointIP;
            return this;
        }

        /**
         * <p>The database instance ID. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to query the value of this parameter.</p>
         * <blockquote>
         * <p>This parameter is required when <strong>SourceEndpoint</strong>.<strong>InstanceType</strong> is set to <strong>RDS</strong>, <strong>ECS</strong>, <strong>DDS</strong>, or <strong>Express</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5*********</p>
         */
        public Builder sourceEndpointInstanceID(String sourceEndpointInstanceID) {
            this.putQueryParameter("SourceEndpointInstanceID", sourceEndpointInstanceID);
            this.sourceEndpointInstanceID = sourceEndpointInstanceID;
            return this;
        }

        /**
         * <p>The location of the database. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to query the value of this parameter. Valid values:</p>
         * <ul>
         * <li><strong>RDS</strong></li>
         * <li><strong>ECS</strong></li>
         * <li><strong>Express</strong>: databases connected over Express Connect circuits, VPN gateways, or Smart Access Gateway (SAG)</li>
         * <li><strong>Agent</strong>: databases connected over backup gateways</li>
         * <li><strong>DDS</strong>: ApsaraDB for MongoDB</li>
         * <li><strong>Other</strong>: databases connected by using IP addresses and port numbers</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        public Builder sourceEndpointInstanceType(String sourceEndpointInstanceType) {
            this.putQueryParameter("SourceEndpointInstanceType", sourceEndpointInstanceType);
            this.sourceEndpointInstanceType = sourceEndpointInstanceType;
            return this;
        }

        /**
         * <p>Oracle Home</p>
         * 
         * <strong>example:</strong>
         * <p>/home/test</p>
         */
        public Builder sourceEndpointOracleHome(String sourceEndpointOracleHome) {
            this.putQueryParameter("SourceEndpointOracleHome", sourceEndpointOracleHome);
            this.sourceEndpointOracleHome = sourceEndpointOracleHome;
            return this;
        }

        /**
         * <p>The Oracle system identifier (SID).</p>
         * <blockquote>
         * <p>This parameter is required when the database engine is Oracle.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder sourceEndpointOracleSID(String sourceEndpointOracleSID) {
            this.putQueryParameter("SourceEndpointOracleSID", sourceEndpointOracleSID);
            this.sourceEndpointOracleSID = sourceEndpointOracleSID;
            return this;
        }

        /**
         * <p>The password of the database account.</p>
         * <blockquote>
         * <p>This parameter is not required when the database engine is <strong>Redis</strong>, or when the database is connected over a backup gateway (<strong>agent</strong>) and the database engine is <strong>SQL Server</strong>. This parameter is required in other scenarios.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>testPassword</p>
         */
        public Builder sourceEndpointPassword(String sourceEndpointPassword) {
            this.putQueryParameter("SourceEndpointPassword", sourceEndpointPassword);
            this.sourceEndpointPassword = sourceEndpointPassword;
            return this;
        }

        /**
         * <p>The port number of the database. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to query the value of this parameter.</p>
         * <blockquote>
         * <p>This parameter is required when <strong>SourceEndpoint</strong>.<strong>InstanceType</strong> is set to <strong>express</strong>, <strong>agent</strong>, <strong>other</strong>, or <strong>ECS</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        public Builder sourceEndpointPort(Integer sourceEndpointPort) {
            this.putQueryParameter("SourceEndpointPort", sourceEndpointPort);
            this.sourceEndpointPort = sourceEndpointPort;
            return this;
        }

        /**
         * <p>The region of the database. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to query the value of this parameter.</p>
         * <blockquote>
         * <p>This parameter is required when <strong>SourceEndpointInstanceType</strong> is set to RDS, ECS, DDS, Express, or Agent.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder sourceEndpointRegion(String sourceEndpointRegion) {
            this.putQueryParameter("SourceEndpointRegion", sourceEndpointRegion);
            this.sourceEndpointRegion = sourceEndpointRegion;
            return this;
        }

        /**
         * <p>The username of the database account.</p>
         * <blockquote>
         * <p>This parameter is not required when the database engine is <strong>Redis</strong>, or when the database is connected over a backup gateway (<strong>agent</strong>) and the database engine is <strong>SQL Server</strong>. This parameter is required in other scenarios.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>testRDS</p>
         */
        public Builder sourceEndpointUserName(String sourceEndpointUserName) {
            this.putQueryParameter("SourceEndpointUserName", sourceEndpointUserName);
            this.sourceEndpointUserName = sourceEndpointUserName;
            return this;
        }

        /**
         * <p>The PEM certificate for the SSL-encrypted connection to the source database.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE----- ... -----END CERTIFICATE-----</p>
         */
        public Builder sslCaPem(String sslCaPem) {
            this.putQueryParameter("SslCaPem", sslCaPem);
            this.sslCaPem = sslCaPem;
            return this;
        }

        @Override
        public ConfigureBackupPlanRequest build() {
            return new ConfigureBackupPlanRequest(this);
        } 

    } 

}
