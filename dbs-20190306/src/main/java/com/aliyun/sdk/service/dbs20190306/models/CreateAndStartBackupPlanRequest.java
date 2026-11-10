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
         * <p>The ID of the backup gateway.</p>
         * <blockquote>
         * <ul>
         * <li><p>This parameter is required if <strong>SourceEndpoint</strong>.<strong>InstanceType</strong> is set to <strong>agent</strong>.</p>
         * </li>
         * <li><p>For more information about how to create a backup gateway, see <a href="https://help.aliyun.com/document_detail/93250.html">Add a backup gateway</a>.</p>
         * </li>
         * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/2869840.html">DescribeBackupGatewayList</a> operation to view the list of existing backup gateways.</p>
         * </li>
         * </ul>
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
         * <p>The interval for incremental backups, in seconds.</p>
         * <blockquote>
         * <p>This parameter is required only for <strong>physical backups</strong>.</p>
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
         * <p>The backup method. Valid values:</p>
         * <ul>
         * <li><p><strong>logical</strong>: logical backup</p>
         * </li>
         * <li><p><strong>physical</strong>: physical backup</p>
         * </li>
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
         * <p>The backup objects.</p>
         * 
         * <strong>example:</strong>
         * <p>[     {         &quot;DBName&quot;:&quot;待备份库名&quot;,         &quot;SchemaName&quot;:&quot;待备份 Schema 名&quot;,         &quot;TableIncludes&quot;:[{             &quot;TableName&quot;:&quot;待备份表表名&quot;         }],         &quot;TableExcludes&quot;:[{             &quot;TableName&quot;:&quot;待备份库名不需要备份表的表名&quot;         }]     } ]</p>
         */
        public Builder backupObjects(String backupObjects) {
            this.putQueryParameter("BackupObjects", backupObjects);
            this.backupObjects = backupObjects;
            return this;
        }

        /**
         * <p>The full backup cycle. Valid values:</p>
         * <ul>
         * <li><p><strong>Monday</strong></p>
         * </li>
         * <li><p><strong>Tuesday</strong></p>
         * </li>
         * <li><p><strong>Wednesday</strong></p>
         * </li>
         * <li><p><strong>Thursday</strong></p>
         * </li>
         * <li><p><strong>Friday</strong></p>
         * </li>
         * <li><p><strong>Saturday</strong></p>
         * </li>
         * <li><p><strong>Sunday</strong></p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>You can select multiple values. Separate them with commas (,).</p>
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
         * <p>The ID of the backup plan.</p>
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
         * <p>The custom name of the backup plan.</p>
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
         * <p>The network bandwidth throttling limit, in KB/s. The maximum allowed value is 10 GB.</p>
         * <blockquote>
         * <p>This parameter is valid only for MySQL physical backups.</p>
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
         * <p>The retention period for backup data, in days. Valid values: 0 to 1825. Default value: 730.</p>
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
         * <p>The disk I/O limit, in KB/s.</p>
         * <blockquote>
         * <p>This parameter is valid only for MySQL physical backups.</p>
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
         * <p>The start time for the full backup. The time is in the <em>HH:mm</em> format and is in UTC.</p>
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
         * <p>The built-in storage type:</p>
         * <ul>
         * <li><p>Empty (default): Backup data is stored in your OSS bucket.</p>
         * </li>
         * <li><p>system: Backup data is stored in the built-in OSS bucket of DBS.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        public Builder backupStorageType(String backupStorageType) {
            this.putQueryParameter("BackupStorageType", backupStorageType);
            this.backupStorageType = backupStorageType;
            return this;
        }

        /**
         * <p>The full backup strategy. Valid values:</p>
         * <ul>
         * <li><p><strong>simple</strong>: periodic backup. Use this value with BackupPeriod and BackupStartTime.</p>
         * </li>
         * <li><p><strong>manual</strong>: manual backup.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>The default value is <strong>simple</strong>.</p>
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
         * <p>A client token used to ensure the idempotence of the request. This prevents duplicate requests.</p>
         * 
         * <strong>example:</strong>
         * <p>ASDASDASDSADASFCZXVZ</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The UID of the Alibaba Cloud account for cross-account backup.</p>
         * 
         * <strong>example:</strong>
         * <p>1648821913******</p>
         */
        public Builder crossAliyunId(String crossAliyunId) {
            this.putQueryParameter("CrossAliyunId", crossAliyunId);
            this.crossAliyunId = crossAliyunId;
            return this;
        }

        /**
         * <p>The name of the RAM role for cross-account backup.</p>
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
         * <p>The region where the database is located.</p>
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
         * <p>The database type. Valid values:</p>
         * <ul>
         * <li><p><strong>MySQL</strong></p>
         * </li>
         * <li><p><strong>MSSQL</strong></p>
         * </li>
         * <li><p><strong>Oracle</strong></p>
         * </li>
         * <li><p><strong>MariaDB</strong></p>
         * </li>
         * <li><p><strong>PostgreSQL</strong></p>
         * </li>
         * <li><p><strong>DRDS</strong></p>
         * </li>
         * <li><p><strong>MongoDB</strong></p>
         * </li>
         * <li><p><strong>Redis</strong></p>
         * </li>
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
         * <p>The time after which backup data is converted to archive storage, in days. Default value: 365.</p>
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
         * <p>The time after which backup data is converted to Infrequent Access (IA) storage, in days. Default value: 180.</p>
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
         * <li><p><strong>true</strong></p>
         * </li>
         * <li><p><strong>false</strong></p>
         * </li>
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
         * <p>The source of the request. The default value is OpenApi. You do not need to set this parameter.</p>
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
         * <p>The specification of the backup plan. Valid values:</p>
         * <ul>
         * <li><p><strong>micro</strong></p>
         * </li>
         * <li><p><strong>small</strong></p>
         * </li>
         * <li><p><strong>medium</strong></p>
         * </li>
         * <li><p><strong>large</strong></p>
         * </li>
         * <li><p><strong>xlarge</strong></p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Higher specifications provide better backup and recovery performance. For more information, see <a href="https://help.aliyun.com/document_detail/84372.html">Specifications</a>.</p>
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
         * <p>The database instance type. Valid values:</p>
         * <ul>
         * <li><p><strong>RDS</strong></p>
         * </li>
         * <li><p><strong>PolarDB</strong></p>
         * </li>
         * <li><p><strong>DDS</strong>: Alibaba Cloud MongoDB</p>
         * </li>
         * <li><p><strong>Kvstore</strong>: Alibaba Cloud Redis</p>
         * </li>
         * <li><p><strong>Other</strong>: A database connected over an IP address and port.</p>
         * </li>
         * <li><p><strong>dg</strong>: A self-managed database without a public IP address or port, connected through Database Gateway (DG).</p>
         * </li>
         * </ul>
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
         * <p>The name of the Object Storage Service (OSS) bucket.
         * Default: The system automatically generates a new name.</p>
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
         * <p>The payment method. Valid value:</p>
         * <p><strong>prepay</strong>: subscription</p>
         * 
         * <strong>example:</strong>
         * <p>prepay</p>
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * <p>The billing cycle of the subscription instance. Valid values:</p>
         * <ul>
         * <li><p><strong>Year</strong></p>
         * </li>
         * <li><p><strong>Month</strong></p>
         * </li>
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
         * <p>The region where DBS is available. To view the available regions, call the <a href="https://help.aliyun.com/document_detail/2869853.html">DescribeRegions</a> operation.</p>
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
         * <p>The database name.</p>
         * <blockquote>
         * <p>This parameter is required if the database type is <strong>PostgreSQL</strong> or <strong>MongoDB</strong>.</p>
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
         * <p>The database endpoint.</p>
         * <blockquote>
         * <p>This parameter is required if <strong>SourceEndpoint</strong>.<strong>InstanceType</strong> is set to <strong>express</strong>, <strong>agent</strong>, or <strong>other</strong>.</p>
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
         * <p>This parameter is required if <strong>SourceEndpoint</strong>.<strong>InstanceType</strong> is set to <strong>RDS</strong>, <strong>ECS</strong>, <strong>DDS</strong>, or <strong>Express</strong>.</p>
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
         * <p>The location of the database. Valid values:</p>
         * <ul>
         * <li><p><strong>RDS</strong></p>
         * </li>
         * <li><p><strong>ECS</strong></p>
         * </li>
         * <li><p><strong>Express</strong>: A database connected through a leased line, VPN Gateway, or Smart Access Gateway.</p>
         * </li>
         * <li><p><strong>Agent</strong>: A database connected through a backup gateway.</p>
         * </li>
         * <li><p><strong>DDS</strong>: Alibaba Cloud MongoDB</p>
         * </li>
         * <li><p><strong>Other</strong>: A database connected directly over an IP address and port.</p>
         * </li>
         * <li><p><strong>dg</strong>: A self-managed database without a public IP address or port, connected through Database Gateway (DG).</p>
         * </li>
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
         * <p>The Oracle system ID (SID). This parameter is required if the database type is Oracle.</p>
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
         * <p>The password for the database account.</p>
         * <blockquote>
         * <p>This parameter is optional if the database type is <strong>Redis</strong>, or if the database location is <strong>agent</strong> and the database type is <strong>MSSQL</strong>. In all other cases, this parameter is required.</p>
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
         * <p>The database port.</p>
         * <blockquote>
         * <p>This parameter is required if <strong>SourceEndpoint</strong>.<strong>InstanceType</strong> is set to <strong>express</strong>, <strong>agent</strong>, <strong>other</strong>, or <strong>ECS</strong>.</p>
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
         * <p>The region where the database is located.</p>
         * <blockquote>
         * <p>This parameter is required if <strong>SourceEndpoint</strong>.<strong>InstanceType</strong> is set to <strong>RDS</strong>, <strong>ECS</strong>, <strong>DDS</strong>, <strong>Express</strong>, or <strong>Agent</strong>.</p>
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
         * <p>The database account.</p>
         * <blockquote>
         * <p>This parameter is optional if the database type is <strong>Redis</strong>, or if the database location is <strong>agent</strong> and the database type is <strong>MSSQL</strong>. In all other cases, this parameter is required.</p>
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
         * <p>The storage region.</p>
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
         * <p>This parameter is not yet available.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        public Builder storageType(String storageType) {
            this.putQueryParameter("StorageType", storageType);
            this.storageType = storageType;
            return this;
        }

        /**
         * <p>The subscription duration. Valid values:</p>
         * <ul>
         * <li><p>If <strong>Period</strong> is set to <strong>Year</strong>, the value of <strong>UsedTime</strong> can be 1 to 5.</p>
         * </li>
         * <li><p>If <strong>Period</strong> is set to <strong>Month</strong>, the value of <strong>UsedTime</strong> can be 1 to 11.</p>
         * </li>
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
