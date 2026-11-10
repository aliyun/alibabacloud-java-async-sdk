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
 * {@link CreateRestoreTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateRestoreTaskRequest</p>
 */
public class CreateRestoreTaskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoOpenDatabase")
    private String autoOpenDatabase;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoShutdownDatabase")
    private String autoShutdownDatabase;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupGatewayId")
    private Long backupGatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupPlanId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String backupPlanId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupSetId")
    private String backupSetId;

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
    @com.aliyun.core.annotation.NameInMap("DestDatabaseInstanceClass")
    private String destDatabaseInstanceClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestDatabaseInstanceDatabaseVersion")
    private String destDatabaseInstanceDatabaseVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestDatabaseInstanceRegion")
    private String destDatabaseInstanceRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestDatabaseInstanceStorageSize")
    private String destDatabaseInstanceStorageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestDatabaseInstanceType")
    private String destDatabaseInstanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestDatabaseInstanceVSwitch")
    private String destDatabaseInstanceVSwitch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestDatabaseInstanceVpc")
    private String destDatabaseInstanceVpc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationEndpointDatabaseName")
    private String destinationEndpointDatabaseName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationEndpointIP")
    private String destinationEndpointIP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationEndpointInstanceID")
    private String destinationEndpointInstanceID;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationEndpointInstanceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String destinationEndpointInstanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationEndpointOracleSID")
    private String destinationEndpointOracleSID;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationEndpointPassword")
    private String destinationEndpointPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationEndpointPort")
    private Integer destinationEndpointPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationEndpointRegion")
    private String destinationEndpointRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationEndpointUserName")
    private String destinationEndpointUserName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DuplicateConflict")
    private String duplicateConflict;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableDestinationEndpointSsl")
    private Boolean enableDestinationEndpointSsl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RestoreDestinationMode")
    private String restoreDestinationMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RestoreDir")
    private String restoreDir;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RestoreHome")
    private String restoreHome;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RestoreObjects")
    private String restoreObjects;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RestoreTaskName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String restoreTaskName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RestoreTime")
    private Long restoreTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SslCaPem")
    private String sslCaPem;

    private CreateRestoreTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.autoOpenDatabase = builder.autoOpenDatabase;
        this.autoShutdownDatabase = builder.autoShutdownDatabase;
        this.backupGatewayId = builder.backupGatewayId;
        this.backupPlanId = builder.backupPlanId;
        this.backupSetId = builder.backupSetId;
        this.clientToken = builder.clientToken;
        this.crossAliyunId = builder.crossAliyunId;
        this.crossRoleName = builder.crossRoleName;
        this.destDatabaseInstanceClass = builder.destDatabaseInstanceClass;
        this.destDatabaseInstanceDatabaseVersion = builder.destDatabaseInstanceDatabaseVersion;
        this.destDatabaseInstanceRegion = builder.destDatabaseInstanceRegion;
        this.destDatabaseInstanceStorageSize = builder.destDatabaseInstanceStorageSize;
        this.destDatabaseInstanceType = builder.destDatabaseInstanceType;
        this.destDatabaseInstanceVSwitch = builder.destDatabaseInstanceVSwitch;
        this.destDatabaseInstanceVpc = builder.destDatabaseInstanceVpc;
        this.destinationEndpointDatabaseName = builder.destinationEndpointDatabaseName;
        this.destinationEndpointIP = builder.destinationEndpointIP;
        this.destinationEndpointInstanceID = builder.destinationEndpointInstanceID;
        this.destinationEndpointInstanceType = builder.destinationEndpointInstanceType;
        this.destinationEndpointOracleSID = builder.destinationEndpointOracleSID;
        this.destinationEndpointPassword = builder.destinationEndpointPassword;
        this.destinationEndpointPort = builder.destinationEndpointPort;
        this.destinationEndpointRegion = builder.destinationEndpointRegion;
        this.destinationEndpointUserName = builder.destinationEndpointUserName;
        this.duplicateConflict = builder.duplicateConflict;
        this.enableDestinationEndpointSsl = builder.enableDestinationEndpointSsl;
        this.ownerId = builder.ownerId;
        this.restoreDestinationMode = builder.restoreDestinationMode;
        this.restoreDir = builder.restoreDir;
        this.restoreHome = builder.restoreHome;
        this.restoreObjects = builder.restoreObjects;
        this.restoreTaskName = builder.restoreTaskName;
        this.restoreTime = builder.restoreTime;
        this.sslCaPem = builder.sslCaPem;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRestoreTaskRequest create() {
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
     * @return autoOpenDatabase
     */
    public String getAutoOpenDatabase() {
        return this.autoOpenDatabase;
    }

    /**
     * @return autoShutdownDatabase
     */
    public String getAutoShutdownDatabase() {
        return this.autoShutdownDatabase;
    }

    /**
     * @return backupGatewayId
     */
    public Long getBackupGatewayId() {
        return this.backupGatewayId;
    }

    /**
     * @return backupPlanId
     */
    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    /**
     * @return backupSetId
     */
    public String getBackupSetId() {
        return this.backupSetId;
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
     * @return destDatabaseInstanceClass
     */
    public String getDestDatabaseInstanceClass() {
        return this.destDatabaseInstanceClass;
    }

    /**
     * @return destDatabaseInstanceDatabaseVersion
     */
    public String getDestDatabaseInstanceDatabaseVersion() {
        return this.destDatabaseInstanceDatabaseVersion;
    }

    /**
     * @return destDatabaseInstanceRegion
     */
    public String getDestDatabaseInstanceRegion() {
        return this.destDatabaseInstanceRegion;
    }

    /**
     * @return destDatabaseInstanceStorageSize
     */
    public String getDestDatabaseInstanceStorageSize() {
        return this.destDatabaseInstanceStorageSize;
    }

    /**
     * @return destDatabaseInstanceType
     */
    public String getDestDatabaseInstanceType() {
        return this.destDatabaseInstanceType;
    }

    /**
     * @return destDatabaseInstanceVSwitch
     */
    public String getDestDatabaseInstanceVSwitch() {
        return this.destDatabaseInstanceVSwitch;
    }

    /**
     * @return destDatabaseInstanceVpc
     */
    public String getDestDatabaseInstanceVpc() {
        return this.destDatabaseInstanceVpc;
    }

    /**
     * @return destinationEndpointDatabaseName
     */
    public String getDestinationEndpointDatabaseName() {
        return this.destinationEndpointDatabaseName;
    }

    /**
     * @return destinationEndpointIP
     */
    public String getDestinationEndpointIP() {
        return this.destinationEndpointIP;
    }

    /**
     * @return destinationEndpointInstanceID
     */
    public String getDestinationEndpointInstanceID() {
        return this.destinationEndpointInstanceID;
    }

    /**
     * @return destinationEndpointInstanceType
     */
    public String getDestinationEndpointInstanceType() {
        return this.destinationEndpointInstanceType;
    }

    /**
     * @return destinationEndpointOracleSID
     */
    public String getDestinationEndpointOracleSID() {
        return this.destinationEndpointOracleSID;
    }

    /**
     * @return destinationEndpointPassword
     */
    public String getDestinationEndpointPassword() {
        return this.destinationEndpointPassword;
    }

    /**
     * @return destinationEndpointPort
     */
    public Integer getDestinationEndpointPort() {
        return this.destinationEndpointPort;
    }

    /**
     * @return destinationEndpointRegion
     */
    public String getDestinationEndpointRegion() {
        return this.destinationEndpointRegion;
    }

    /**
     * @return destinationEndpointUserName
     */
    public String getDestinationEndpointUserName() {
        return this.destinationEndpointUserName;
    }

    /**
     * @return duplicateConflict
     */
    public String getDuplicateConflict() {
        return this.duplicateConflict;
    }

    /**
     * @return enableDestinationEndpointSsl
     */
    public Boolean getEnableDestinationEndpointSsl() {
        return this.enableDestinationEndpointSsl;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return restoreDestinationMode
     */
    public String getRestoreDestinationMode() {
        return this.restoreDestinationMode;
    }

    /**
     * @return restoreDir
     */
    public String getRestoreDir() {
        return this.restoreDir;
    }

    /**
     * @return restoreHome
     */
    public String getRestoreHome() {
        return this.restoreHome;
    }

    /**
     * @return restoreObjects
     */
    public String getRestoreObjects() {
        return this.restoreObjects;
    }

    /**
     * @return restoreTaskName
     */
    public String getRestoreTaskName() {
        return this.restoreTaskName;
    }

    /**
     * @return restoreTime
     */
    public Long getRestoreTime() {
        return this.restoreTime;
    }

    /**
     * @return sslCaPem
     */
    public String getSslCaPem() {
        return this.sslCaPem;
    }

    public static final class Builder extends Request.Builder<CreateRestoreTaskRequest, Builder> {
        private String regionId; 
        private String autoOpenDatabase; 
        private String autoShutdownDatabase; 
        private Long backupGatewayId; 
        private String backupPlanId; 
        private String backupSetId; 
        private String clientToken; 
        private String crossAliyunId; 
        private String crossRoleName; 
        private String destDatabaseInstanceClass; 
        private String destDatabaseInstanceDatabaseVersion; 
        private String destDatabaseInstanceRegion; 
        private String destDatabaseInstanceStorageSize; 
        private String destDatabaseInstanceType; 
        private String destDatabaseInstanceVSwitch; 
        private String destDatabaseInstanceVpc; 
        private String destinationEndpointDatabaseName; 
        private String destinationEndpointIP; 
        private String destinationEndpointInstanceID; 
        private String destinationEndpointInstanceType; 
        private String destinationEndpointOracleSID; 
        private String destinationEndpointPassword; 
        private Integer destinationEndpointPort; 
        private String destinationEndpointRegion; 
        private String destinationEndpointUserName; 
        private String duplicateConflict; 
        private Boolean enableDestinationEndpointSsl; 
        private String ownerId; 
        private String restoreDestinationMode; 
        private String restoreDir; 
        private String restoreHome; 
        private String restoreObjects; 
        private String restoreTaskName; 
        private Long restoreTime; 
        private String sslCaPem; 

        private Builder() {
            super();
        } 

        private Builder(CreateRestoreTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.autoOpenDatabase = request.autoOpenDatabase;
            this.autoShutdownDatabase = request.autoShutdownDatabase;
            this.backupGatewayId = request.backupGatewayId;
            this.backupPlanId = request.backupPlanId;
            this.backupSetId = request.backupSetId;
            this.clientToken = request.clientToken;
            this.crossAliyunId = request.crossAliyunId;
            this.crossRoleName = request.crossRoleName;
            this.destDatabaseInstanceClass = request.destDatabaseInstanceClass;
            this.destDatabaseInstanceDatabaseVersion = request.destDatabaseInstanceDatabaseVersion;
            this.destDatabaseInstanceRegion = request.destDatabaseInstanceRegion;
            this.destDatabaseInstanceStorageSize = request.destDatabaseInstanceStorageSize;
            this.destDatabaseInstanceType = request.destDatabaseInstanceType;
            this.destDatabaseInstanceVSwitch = request.destDatabaseInstanceVSwitch;
            this.destDatabaseInstanceVpc = request.destDatabaseInstanceVpc;
            this.destinationEndpointDatabaseName = request.destinationEndpointDatabaseName;
            this.destinationEndpointIP = request.destinationEndpointIP;
            this.destinationEndpointInstanceID = request.destinationEndpointInstanceID;
            this.destinationEndpointInstanceType = request.destinationEndpointInstanceType;
            this.destinationEndpointOracleSID = request.destinationEndpointOracleSID;
            this.destinationEndpointPassword = request.destinationEndpointPassword;
            this.destinationEndpointPort = request.destinationEndpointPort;
            this.destinationEndpointRegion = request.destinationEndpointRegion;
            this.destinationEndpointUserName = request.destinationEndpointUserName;
            this.duplicateConflict = request.duplicateConflict;
            this.enableDestinationEndpointSsl = request.enableDestinationEndpointSsl;
            this.ownerId = request.ownerId;
            this.restoreDestinationMode = request.restoreDestinationMode;
            this.restoreDir = request.restoreDir;
            this.restoreHome = request.restoreHome;
            this.restoreObjects = request.restoreObjects;
            this.restoreTaskName = request.restoreTaskName;
            this.restoreTime = request.restoreTime;
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
         * <p>Specifies whether to automatically start the instance after an Oracle physical backup is restored.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoOpenDatabase(String autoOpenDatabase) {
            this.putQueryParameter("AutoOpenDatabase", autoOpenDatabase);
            this.autoOpenDatabase = autoOpenDatabase;
            return this;
        }

        /**
         * <p>Specifies whether to automatically shut down the instance after an Oracle physical backup is restored.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoShutdownDatabase(String autoShutdownDatabase) {
            this.putQueryParameter("AutoShutdownDatabase", autoShutdownDatabase);
            this.autoShutdownDatabase = autoShutdownDatabase;
            return this;
        }

        /**
         * <p>The ID of the backup gateway.</p>
         * <blockquote>
         * <p>This parameter is required if <strong>DestinationEndpointInstanceType</strong> is set to Agent.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4312****</p>
         */
        public Builder backupGatewayId(Long backupGatewayId) {
            this.putQueryParameter("BackupGatewayId", backupGatewayId);
            this.backupGatewayId = backupGatewayId;
            return this;
        }

        /**
         * <p>The ID of the backup plan.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dbs1hvb0ww****</p>
         */
        public Builder backupPlanId(String backupPlanId) {
            this.putQueryParameter("BackupPlanId", backupPlanId);
            this.backupPlanId = backupPlanId;
            return this;
        }

        /**
         * <p>The ID of the full backup set used for restoration. This parameter and RestoreTime are mutually exclusive.</p>
         * 
         * <strong>example:</strong>
         * <p>dbs1hvb0w*****</p>
         */
        public Builder backupSetId(String backupSetId) {
            this.putQueryParameter("BackupSetId", backupSetId);
            this.backupSetId = backupSetId;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request and prevent duplicate submissions.</p>
         * 
         * <strong>example:</strong>
         * <p>ETnLKlblzczshOTUbOC********</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The UID of the Alibaba Cloud account used for cross-account backup.</p>
         * 
         * <strong>example:</strong>
         * <p>2749528728********</p>
         */
        public Builder crossAliyunId(String crossAliyunId) {
            this.putQueryParameter("CrossAliyunId", crossAliyunId);
            this.crossAliyunId = crossAliyunId;
            return this;
        }

        /**
         * <p>The name of the RAM role used for cross-account backup.</p>
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
         * <p>The instance specifications of the new database instance to which data is restored.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql.x4.large.2</p>
         */
        public Builder destDatabaseInstanceClass(String destDatabaseInstanceClass) {
            this.putQueryParameter("DestDatabaseInstanceClass", destDatabaseInstanceClass);
            this.destDatabaseInstanceClass = destDatabaseInstanceClass;
            return this;
        }

        /**
         * <p>The database engine version of the new database instance to which data is restored.</p>
         * 
         * <strong>example:</strong>
         * <p>8.0</p>
         */
        public Builder destDatabaseInstanceDatabaseVersion(String destDatabaseInstanceDatabaseVersion) {
            this.putQueryParameter("DestDatabaseInstanceDatabaseVersion", destDatabaseInstanceDatabaseVersion);
            this.destDatabaseInstanceDatabaseVersion = destDatabaseInstanceDatabaseVersion;
            return this;
        }

        /**
         * <p>The region of the new database instance to which data is restored.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder destDatabaseInstanceRegion(String destDatabaseInstanceRegion) {
            this.putQueryParameter("DestDatabaseInstanceRegion", destDatabaseInstanceRegion);
            this.destDatabaseInstanceRegion = destDatabaseInstanceRegion;
            return this;
        }

        /**
         * <p>The instance storage size of the new database to recover.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder destDatabaseInstanceStorageSize(String destDatabaseInstanceStorageSize) {
            this.putQueryParameter("DestDatabaseInstanceStorageSize", destDatabaseInstanceStorageSize);
            this.destDatabaseInstanceStorageSize = destDatabaseInstanceStorageSize;
            return this;
        }

        /**
         * <p>The instance type of the new database to which data is restored.</p>
         * 
         * <strong>example:</strong>
         * <p>rds</p>
         */
        public Builder destDatabaseInstanceType(String destDatabaseInstanceType) {
            this.putQueryParameter("DestDatabaseInstanceType", destDatabaseInstanceType);
            this.destDatabaseInstanceType = destDatabaseInstanceType;
            return this;
        }

        /**
         * <p>The vSwitch of the new database instance to which data is restored.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-xx</p>
         */
        public Builder destDatabaseInstanceVSwitch(String destDatabaseInstanceVSwitch) {
            this.putQueryParameter("DestDatabaseInstanceVSwitch", destDatabaseInstanceVSwitch);
            this.destDatabaseInstanceVSwitch = destDatabaseInstanceVSwitch;
            return this;
        }

        /**
         * <p>The VPC of the new database instance to which data is restored.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-xx</p>
         */
        public Builder destDatabaseInstanceVpc(String destDatabaseInstanceVpc) {
            this.putQueryParameter("DestDatabaseInstanceVpc", destDatabaseInstanceVpc);
            this.destDatabaseInstanceVpc = destDatabaseInstanceVpc;
            return this;
        }

        /**
         * <p>The name of the database.</p>
         * <blockquote>
         * <p>This parameter is required if the database engine is PostgreSQL or MongoDB.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder destinationEndpointDatabaseName(String destinationEndpointDatabaseName) {
            this.putQueryParameter("DestinationEndpointDatabaseName", destinationEndpointDatabaseName);
            this.destinationEndpointDatabaseName = destinationEndpointDatabaseName;
            return this;
        }

        /**
         * <p>The database connection address.</p>
         * <blockquote>
         * <p>This parameter is required if <strong>DestinationEndpointInstanceType</strong> is set to Express, Agent, or Other.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rm-bp*****9jv8pxero.mysql.rds.aliyuncs.com</p>
         */
        public Builder destinationEndpointIP(String destinationEndpointIP) {
            this.putQueryParameter("DestinationEndpointIP", destinationEndpointIP);
            this.destinationEndpointIP = destinationEndpointIP;
            return this;
        }

        /**
         * <p>The instance ID of the database.</p>
         * <blockquote>
         * <p>This parameter is required if <strong>DestinationEndpointInstanceType</strong> is set to RDS, ECS, DDS, or Express.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rm-bp1p8c29*****</p>
         */
        public Builder destinationEndpointInstanceID(String destinationEndpointInstanceID) {
            this.putQueryParameter("DestinationEndpointInstanceID", destinationEndpointInstanceID);
            this.destinationEndpointInstanceID = destinationEndpointInstanceID;
            return this;
        }

        /**
         * <p>The location of the database. Valid values:</p>
         * <ul>
         * <li><strong>RDS</strong></li>
         * <li><strong>ECS</strong></li>
         * <li><strong>Express</strong>: databases connected over Express Connect circuits, VPN gateways, or Smart Access Gateway (SAG)</li>
         * <li><strong>Agent</strong>: databases connected over backup gateways</li>
         * <li><strong>DDS</strong>: ApsaraDB for MongoDB</li>
         * <li><strong>Other</strong>: databases connected by using IP addresses and port numbers</li>
         * <li><strong>dg</strong>: self-managed databases that have no public IP addresses or port numbers and are connected over Database Gateway</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        public Builder destinationEndpointInstanceType(String destinationEndpointInstanceType) {
            this.putQueryParameter("DestinationEndpointInstanceType", destinationEndpointInstanceType);
            this.destinationEndpointInstanceType = destinationEndpointInstanceType;
            return this;
        }

        /**
         * <p>The Oracle SID.</p>
         * <blockquote>
         * <p>This parameter is required if the database engine is Oracle.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder destinationEndpointOracleSID(String destinationEndpointOracleSID) {
            this.putQueryParameter("DestinationEndpointOracleSID", destinationEndpointOracleSID);
            this.destinationEndpointOracleSID = destinationEndpointOracleSID;
            return this;
        }

        /**
         * <p>The password of the database account.</p>
         * <blockquote>
         * <p>This parameter is not required if the database engine is Redis, or if the database is connected over a backup gateway and the database engine is SQL Server. In other scenarios, this parameter is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        public Builder destinationEndpointPassword(String destinationEndpointPassword) {
            this.putQueryParameter("DestinationEndpointPassword", destinationEndpointPassword);
            this.destinationEndpointPassword = destinationEndpointPassword;
            return this;
        }

        /**
         * <p>The port number of the database.</p>
         * <blockquote>
         * <p>This parameter is required if <strong>DestinationEndpointInstanceType</strong> is set to Express, Agent, Other, or ECS.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        public Builder destinationEndpointPort(Integer destinationEndpointPort) {
            this.putQueryParameter("DestinationEndpointPort", destinationEndpointPort);
            this.destinationEndpointPort = destinationEndpointPort;
            return this;
        }

        /**
         * <p>The region of the database instance.</p>
         * <blockquote>
         * <p>This parameter is required if <strong>DestinationEndpointInstanceType</strong> is set to RDS, ECS, DDS, Express, or Agent.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder destinationEndpointRegion(String destinationEndpointRegion) {
            this.putQueryParameter("DestinationEndpointRegion", destinationEndpointRegion);
            this.destinationEndpointRegion = destinationEndpointRegion;
            return this;
        }

        /**
         * <p>The username of the database account.</p>
         * <blockquote>
         * <p>This parameter is not required if the database engine is Redis, or if the database is connected over a backup gateway and the database engine is SQL Server. In other scenarios, this parameter is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder destinationEndpointUserName(String destinationEndpointUserName) {
            this.putQueryParameter("DestinationEndpointUserName", destinationEndpointUserName);
            this.destinationEndpointUserName = destinationEndpointUserName;
            return this;
        }

        /**
         * <p>The method used to handle conflicts between objects with the same name. Valid values:</p>
         * <ul>
         * <li><strong>renamenew</strong>: renames the object if an object with the same name exists.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>renamenew</p>
         */
        public Builder duplicateConflict(String duplicateConflict) {
            this.putQueryParameter("DuplicateConflict", duplicateConflict);
            this.duplicateConflict = duplicateConflict;
            return this;
        }

        /**
         * <p>Specifies whether to connect to the destination by using an SSL-encrypted connection.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableDestinationEndpointSsl(Boolean enableDestinationEndpointSsl) {
            this.putQueryParameter("EnableDestinationEndpointSsl", enableDestinationEndpointSsl);
            this.enableDestinationEndpointSsl = enableDestinationEndpointSsl;
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
         * <p>The method used to restore data to the destination. Valid values:</p>
         * <ul>
         * <li><strong>EXIST_INSTANCE</strong>: restores data to an existing instance.</li>
         * <li><strong>NEW_INSTANCE</strong>: restores data to a new instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EXIST_INSTANCE</p>
         */
        public Builder restoreDestinationMode(String restoreDestinationMode) {
            this.putQueryParameter("RestoreDestinationMode", restoreDestinationMode);
            this.restoreDestinationMode = restoreDestinationMode;
            return this;
        }

        /**
         * <p>This parameter is required if <strong>DestinationEndpointInstanceType</strong> is set to Agent and the backup plan is for MySQL.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder restoreDir(String restoreDir) {
            this.putQueryParameter("RestoreDir", restoreDir);
            this.restoreDir = restoreDir;
            return this;
        }

        /**
         * <p>The directory of the database program.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder restoreHome(String restoreHome) {
            this.putQueryParameter("RestoreHome", restoreHome);
            this.restoreHome = restoreHome;
            return this;
        }

        /**
         * <p>The objects to be restored.</p>
         * <ul>
         * <li>For more information, see the definition of the <strong>RestoreObjects</strong> parameter below. This parameter is not required if the database is connected over a backup gateway. In other scenarios, this parameter is required.</li>
         * <li>Template: <code>[{ &quot;DBName&quot;: &quot;Name of the database to be restored&quot;, &quot;NewDBName&quot;: &quot;Name of the destination database&quot; }]</code></li>
         * </ul>
         * <blockquote>
         * <p>Restoring objects by calling this API operation only supports restoration at the database level. To restore specific tables, go to the console. For more information, see <a href="https://help.aliyun.com/document_detail/85543.html">Restore a database</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Example of MySQL table-level restoration:
         * [{\&quot;DBName\&quot;:\&quot;dbname\&quot;, \&quot;NewDBName\&quot;:\&quot;dbname1\&quot;}]</p>
         */
        public Builder restoreObjects(String restoreObjects) {
            this.putQueryParameter("RestoreObjects", restoreObjects);
            this.restoreObjects = restoreObjects;
            return this;
        }

        /**
         * <p>The name of the restore task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder restoreTaskName(String restoreTaskName) {
            this.putQueryParameter("RestoreTaskName", restoreTaskName);
            this.restoreTaskName = restoreTaskName;
            return this;
        }

        /**
         * <p>The point in time to which you want to restore the database. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1554560477000</p>
         */
        public Builder restoreTime(Long restoreTime) {
            this.putQueryParameter("RestoreTime", restoreTime);
            this.restoreTime = restoreTime;
            return this;
        }

        /**
         * <p>The credential for the SSL-encrypted connection to the destination.</p>
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
        public CreateRestoreTaskRequest build() {
            return new CreateRestoreTaskRequest(this);
        } 

    } 

}
