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
 * {@link CreateAndStartBackupPlanRequest} extends {@link RequestModel}
 *
 * <p>CreateAndStartBackupPlanRequest</p>
 */
public class CreateAndStartBackupPlanRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupGatewayId")
    private Long backupGatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupLogIntervalSeconds")
    private Integer backupLogIntervalSeconds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupMethod")
    @com.aliyun.core.annotation.Validation(required = true)
    private String backupMethod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupObjects")
    private String backupObjects;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupPeriod")
    private String backupPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupPlanId")
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
    @com.aliyun.core.annotation.NameInMap("DatabaseRegion")
    private String databaseRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabaseType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String databaseType;

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
    @com.aliyun.core.annotation.NameInMap("FromApp")
    private String fromApp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceClass")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OSSBucketName")
    private String OSSBucketName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayType")
    private String payType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private String period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

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
    @com.aliyun.core.annotation.NameInMap("StorageRegion")
    private String storageRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageType")
    private String storageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UsedTime")
    private Integer usedTime;

    private CreateAndStartBackupPlanRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.backupGatewayId = builder.backupGatewayId;
        this.backupLogIntervalSeconds = builder.backupLogIntervalSeconds;
        this.backupMethod = builder.backupMethod;
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
        this.databaseRegion = builder.databaseRegion;
        this.databaseType = builder.databaseType;
        this.duplicationArchivePeriod = builder.duplicationArchivePeriod;
        this.duplicationInfrequentAccessPeriod = builder.duplicationInfrequentAccessPeriod;
        this.enableBackupLog = builder.enableBackupLog;
        this.fromApp = builder.fromApp;
        this.instanceClass = builder.instanceClass;
        this.instanceType = builder.instanceType;
        this.OSSBucketName = builder.OSSBucketName;
        this.ownerId = builder.ownerId;
        this.payType = builder.payType;
        this.period = builder.period;
        this.region = builder.region;
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
        this.storageRegion = builder.storageRegion;
        this.storageType = builder.storageType;
        this.usedTime = builder.usedTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAndStartBackupPlanRequest create() {
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
     * @return backupMethod
     */
    public String getBackupMethod() {
        return this.backupMethod;
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
     * @return databaseRegion
     */
    public String getDatabaseRegion() {
        return this.databaseRegion;
    }

    /**
     * @return databaseType
     */
    public String getDatabaseType() {
        return this.databaseType;
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
     * @return fromApp
     */
    public String getFromApp() {
        return this.fromApp;
    }

    /**
     * @return instanceClass
     */
    public String getInstanceClass() {
        return this.instanceClass;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
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
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return period
     */
    public String getPeriod() {
        return this.period;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
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

    /**
     * @return storageRegion
     */
    public String getStorageRegion() {
        return this.storageRegion;
    }

    /**
     * @return storageType
     */
    public String getStorageType() {
        return this.storageType;
    }

    /**
     * @return usedTime
     */
    public Integer getUsedTime() {
        return this.usedTime;
    }

    public static final class Builder extends Request.Builder<CreateAndStartBackupPlanRequest, Builder> {
        private String regionId; 
        private Long backupGatewayId; 
        private Integer backupLogIntervalSeconds; 
        private String backupMethod; 
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
        private String databaseRegion; 
        private String databaseType; 
        private Integer duplicationArchivePeriod; 
        private Integer duplicationInfrequentAccessPeriod; 
        private Boolean enableBackupLog; 
        private String fromApp; 
        private String instanceClass; 
        private String instanceType; 
        private String OSSBucketName; 
        private String ownerId; 
        private String payType; 
        private String period; 
        private String region; 
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
        private String storageRegion; 
        private String storageType; 
        private Integer usedTime; 

        private Builder() {
            super();
        } 

        private Builder(CreateAndStartBackupPlanRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.backupGatewayId = request.backupGatewayId;
            this.backupLogIntervalSeconds = request.backupLogIntervalSeconds;
            this.backupMethod = request.backupMethod;
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
            this.databaseRegion = request.databaseRegion;
            this.databaseType = request.databaseType;
            this.duplicationArchivePeriod = request.duplicationArchivePeriod;
            this.duplicationInfrequentAccessPeriod = request.duplicationInfrequentAccessPeriod;
            this.enableBackupLog = request.enableBackupLog;
            this.fromApp = request.fromApp;
            this.instanceClass = request.instanceClass;
            this.instanceType = request.instanceType;
            this.OSSBucketName = request.OSSBucketName;
            this.ownerId = request.ownerId;
            this.payType = request.payType;
            this.period = request.period;
            this.region = request.region;
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
            this.storageRegion = request.storageRegion;
            this.storageType = request.storageType;
            this.usedTime = request.usedTime;
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
         * <p>The backup gateway ID.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If <strong>SourceEndpointInstanceType</strong> is set to <strong>Agent</strong>, this parameter is required.****</p>
         * </li>
         * <li><p>For more information about how to install a backup gateway, see <a href="https://help.aliyun.com/document_detail/93250.html">Install a backup gateway</a>.</p>
         * </li>
         * <li><p>You can query a list of existing backup gateways by calling the <a href="https://help.aliyun.com/document_detail/2869840.html">DescribeBackupGatewayList</a> operation.</p>
         * </li>
         * </ul>
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
         * <p>The interval at which you want to perform incremental log backups. Unit: seconds.</p>
         * <blockquote>
         * <p> This parameter is required only if you set BackupMethod to <strong>physical</strong>.</p>
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
         * <p>The method that is used to generate the backup file. Valid values:</p>
         * <ul>
         * <li><strong>logical</strong>: logical backup</li>
         * <li><strong>physical</strong>: physical backup</li>
         * <li><strong>duplication</strong>: dump backup</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>logical</p>
         */
        public Builder backupMethod(String backupMethod) {
            this.putQueryParameter("BackupMethod", backupMethod);
            this.backupMethod = backupMethod;
            return this;
        }

        /**
         * <p>The object to be backed up.</p>
         * 
         * <strong>example:</strong>
         * <p>[ { &quot;DBName&quot;:&quot;Name of the database to be backed up&quot;, &quot;SchemaName&quot;:&quot;Name of the schema to be backed up&quot;, &quot;TableIncludes&quot;:[{ &quot;TableName&quot;:&quot;Name of the table to be backed up&quot; }], &quot;TableExcludes&quot;:[{ &quot;TableName&quot;:&quot;Name of the table that you do not want to back up&quot; }] } ]</p>
         */
        public Builder backupObjects(String backupObjects) {
            this.putQueryParameter("BackupObjects", backupObjects);
            this.backupObjects = backupObjects;
            return this;
        }

        /**
         * <p>The day of the week on which you want to perform full backup. Valid values:</p>
         * <ul>
         * <li><strong>Monday</strong></li>
         * <li><strong>Tuesday</strong></li>
         * <li><strong>Wednesday</strong></li>
         * <li><strong>Thursday</strong></li>
         * <li><strong>Friday</strong></li>
         * <li><strong>Saturday</strong></li>
         * <li><strong>Sunday</strong></li>
         * </ul>
         * <blockquote>
         * <p> You can specify multiple values. Separate multiple values with commas (,).</p>
         * </blockquote>
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
         * <p>The ID of the backup schedule.</p>
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
         * <p>The name of the backup schedule.</p>
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
         * <p>The network bandwidth throttling. Unit: KB/s. DBS allows a maximum bandwidth of 10 GB/s.</p>
         * <blockquote>
         * <p> This parameter takes effect only when physical backups for MySQL databases are performed.</p>
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
         * <p>The number of days for which the backup data is retained. Valid values: 0 to 1825. Default value: 730.</p>
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
         * <p>The I/O limit for the disk. Unit: KB/s.</p>
         * <blockquote>
         * <p> This parameter takes effect only when physical backups for MySQL databases are performed.</p>
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
         * <p>The start time of full backup tasks. Specify the value in the <em>HH:mm</em> format. The time must be in UTC.</p>
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
         * <p>The storage type. Valid values:</p>
         * <ul>
         * <li>Empty: If you do not specify this parameter, the system stores backup data in your OSS bucket.</li>
         * <li>system : The system stores backup data in the built-in OSS bucket of DBS.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>N/A</p>
         */
        public Builder backupStorageType(String backupStorageType) {
            this.putQueryParameter("BackupStorageType", backupStorageType);
            this.backupStorageType = backupStorageType;
            return this;
        }

        /**
         * <p>The backup method that you want to use for full backups. Valid values:</p>
         * <ul>
         * <li><strong>simple</strong>: scheduled backup. If you specify this value for the BackupStrategyType parameter, you must also specify the BackupPeriod and BackupStartTime parameters.</li>
         * <li><strong>Manual</strong>: manual backup.</li>
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
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>DBS</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The unique ID (UID) of the Alibaba Cloud account to which the source database belongs.</p>
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
         * <p>The name of the RAM role that is used to perform backups across Alibaba Cloud accounts.</p>
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
         * <p>The region in which the database that you want to back up resides.</p>
         * <blockquote>
         * <p>This parameter is required if the <strong>PayType</strong> parameter is set to <strong>postpay</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder databaseRegion(String databaseRegion) {
            this.putQueryParameter("DatabaseRegion", databaseRegion);
            this.databaseRegion = databaseRegion;
            return this;
        }

        /**
         * <p>The type of the source database. Valid values:</p>
         * <ul>
         * <li><strong>MySQL</strong></li>
         * <li><strong>MSSQL</strong></li>
         * <li><strong>Oracle</strong></li>
         * <li><strong>MariaDB</strong></li>
         * <li><strong>PostgreSQL</strong></li>
         * <li><strong>DRDS</strong></li>
         * <li><strong>MongoDB</strong></li>
         * <li><strong>Redis</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        public Builder databaseType(String databaseType) {
            this.putQueryParameter("DatabaseType", databaseType);
            this.databaseType = databaseType;
            return this;
        }

        /**
         * <p>The number of days after which the storage class of the backup data is changed to Archive. Default value: 365.</p>
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
         * <p>The number of days after which the storage class of the backup data is changed to Infrequent Access (IA). Default value: 180.</p>
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
         * <p>Specifies whether to enable the incremental log backup feature. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables the incremental log backup feature.</li>
         * <li><strong>false</strong>: disables the incremental log backup feature.</li>
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
         * <p>The request source. Default value: OpenApi. You do not need to set this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>OpenApi</p>
         */
        public Builder fromApp(String fromApp) {
            this.putQueryParameter("FromApp", fromApp);
            this.fromApp = fromApp;
            return this;
        }

        /**
         * <p>The type of the backup schedule. Valid values:</p>
         * <ul>
         * <li><strong>micro</strong></li>
         * <li><strong>small</strong></li>
         * <li><strong>medium</strong></li>
         * <li><strong>large</strong></li>
         * <li><strong>xlarge</strong></li>
         * </ul>
         * <blockquote>
         * <p> A backup schedule type with higher specifications offers higher backup and restoration performance. For more information, see <a href="https://help.aliyun.com/document_detail/84372.html">Select a backup schedule type</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>micro</p>
         */
        public Builder instanceClass(String instanceClass) {
            this.putQueryParameter("InstanceClass", instanceClass);
            this.instanceClass = instanceClass;
            return this;
        }

        /**
         * <p>The type of the source database instance. Valid values:</p>
         * <ul>
         * <li><strong>RDS</strong>: ApsaraDB RDS.</li>
         * <li><strong>PolarDB</strong>: PolarDB.</li>
         * <li><strong>DDS</strong>: ApsaraDB for MongoDB.</li>
         * <li><strong>Kvstore</strong>: ApsaraDB for Redis.</li>
         * <li><strong>Other</strong>: Database connected by using an IP address and a port number.</li>
         * <li><strong>dg</strong>: Self-managed database that has no public IP address or port number and is connected over Database Gateway.</li>
         * </ul>
         * <blockquote>
         * <p> If <strong>PayType</strong> is set to <strong>postpay</strong>, this parameter is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The name of the Object Storage Service (OSS) bucket used to store backup files. By default, the system automatically generates a name for the OSS bucket.</p>
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
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li><strong>postpay</strong>: pay-as-you-go.</li>
         * <li><strong>prepay</strong>: subscription.</li>
         * </ul>
         * <blockquote>
         * <p> The default value is <strong>prepay</strong>. You can set this parameter to <strong>postpay</strong> only if you set <strong>BackupMethod</strong> to <strong>duplication</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Postpaid</p>
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * <p>Specifies whether to use yearly subscription or monthly subscription for the instance. Valid values:</p>
         * <ul>
         * <li><strong>Year</strong>: yearly subscription</li>
         * <li><strong>Month</strong>: monthly subscription</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Year</p>
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The ID of the region in which you want to store the backup data. You can query the supported regions of DBS by calling the <a href="https://help.aliyun.com/document_detail/2869853.html">DescribeRegions</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
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
         * <p>The name of the database.</p>
         * <blockquote>
         * <p>This parameter is required if the DatabaseType parameter is set to <strong>PostgreSQL</strong> or <strong>MongoDB</strong>.</p>
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
         * <p>The endpoint of the database.</p>
         * <blockquote>
         * <p>This parameter is required if the <strong>SourceEndpointInstanceType</strong> parameter is set to <strong>Express</strong>, <strong>Agent</strong>, or <strong>Other</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5xxxxxxx.mysql.rds.aliyuncs.com</p>
         */
        public Builder sourceEndpointIP(String sourceEndpointIP) {
            this.putQueryParameter("SourceEndpointIP", sourceEndpointIP);
            this.sourceEndpointIP = sourceEndpointIP;
            return this;
        }

        /**
         * <p>The ID of the database instance.</p>
         * <blockquote>
         * <p>This parameter is required if the <strong>SourceEndpointInstanceType</strong> parameter is set to <strong>RDS</strong>, <strong>ECS</strong>, <strong>DDS</strong>, or <strong>Express</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5xxxxxxxxxx</p>
         */
        public Builder sourceEndpointInstanceID(String sourceEndpointInstanceID) {
            this.putQueryParameter("SourceEndpointInstanceID", sourceEndpointInstanceID);
            this.sourceEndpointInstanceID = sourceEndpointInstanceID;
            return this;
        }

        /**
         * <p>The location of the source database. Valid values:</p>
         * <ul>
         * <li><strong>RDS</strong>: The database is on an ApsaraDB RDS instance.</li>
         * <li><strong>ECS</strong>: The database is on an Elastic Compute Service (ECS) instance.</li>
         * <li><strong>Express</strong>: The database is connected to DBS by using Express Connect, VPN Gateway, or Smart Access Gateway.</li>
         * <li><strong>Agent</strong>: The database is connected to DBS over a DBS backup gateway.</li>
         * <li><strong>DDS</strong>: The database is on an ApsaraDB for MongoDB instance.</li>
         * <li><strong>Other</strong>: The database is connected to DBS by using an IP address and a port number.</li>
         * <li><strong>dg</strong>: The database is a self-managed database that has no public IP address or port number and is connected to DBS over Database Gateway.</li>
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
         * <p>The system ID (SID) of the Oracle database. This parameter is required if the source database is an Oracle database.</p>
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
         * <p>The password of the account that is used to connect to the database.</p>
         * <blockquote>
         * <p>This parameter is required except that the database is an SQL Server database that is connected to DBS over a DBS backup gateway or a Redis database.</p>
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
         * <p>The port of the database.</p>
         * <blockquote>
         * <p>This parameter is required if the <strong>SourceEndpointInstanceType</strong> parameter is set to <strong>Express</strong>, <strong>Agent</strong>, <strong>Other</strong>, or <strong>ECS</strong>.</p>
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
         * <p>The region in which the database that you want to back up resides.</p>
         * <blockquote>
         * <p>This parameter is required if the <strong>SourceEndpointInstanceType</strong> parameter is set to <strong>RDS</strong>, <strong>ECS</strong>, <strong>DDS</strong>, <strong>Express</strong>, or <strong>Agent</strong>.</p>
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
         * <p>The username of the account that is used to connect to the database.</p>
         * <blockquote>
         * <p>This parameter is required except that the database is an SQL Server database that is connected to DBS over a DBS backup gateway or a Redis database.</p>
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
         * <p>The region in which you want to store the backup data.</p>
         * <blockquote>
         * <p>This parameter is required if the <strong>PayType</strong> parameter is set to <strong>postpay</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder storageRegion(String storageRegion) {
            this.putQueryParameter("StorageRegion", storageRegion);
            this.storageRegion = storageRegion;
            return this;
        }

        /**
         * <p>This parameter is unavailable.</p>
         * 
         * <strong>example:</strong>
         * <p>N/A</p>
         */
        public Builder storageType(String storageType) {
            this.putQueryParameter("StorageType", storageType);
            this.storageType = storageType;
            return this;
        }

        /**
         * <p>The subscription duration. Valid values:</p>
         * <ul>
         * <li>If <strong>Period</strong> is set to <strong>Year</strong>, the valid values of <strong>UsedTime</strong> range from 1 to 5.</li>
         * <li>If <strong>Period</strong> is set to <strong>Month</strong>, the valid values of <strong>UsedTime</strong> range from 1 to 11.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder usedTime(Integer usedTime) {
            this.putQueryParameter("UsedTime", usedTime);
            this.usedTime = usedTime;
            return this;
        }

        @Override
        public CreateAndStartBackupPlanRequest build() {
            return new CreateAndStartBackupPlanRequest(this);
        } 

    } 

}
