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
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

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

    private CreateRestoreTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.backupGatewayId = builder.backupGatewayId;
        this.backupPlanId = builder.backupPlanId;
        this.backupSetId = builder.backupSetId;
        this.clientToken = builder.clientToken;
        this.crossAliyunId = builder.crossAliyunId;
        this.crossRoleName = builder.crossRoleName;
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
        this.ownerId = builder.ownerId;
        this.restoreDir = builder.restoreDir;
        this.restoreHome = builder.restoreHome;
        this.restoreObjects = builder.restoreObjects;
        this.restoreTaskName = builder.restoreTaskName;
        this.restoreTime = builder.restoreTime;
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
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
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

    public static final class Builder extends Request.Builder<CreateRestoreTaskRequest, Builder> {
        private String regionId; 
        private Long backupGatewayId; 
        private String backupPlanId; 
        private String backupSetId; 
        private String clientToken; 
        private String crossAliyunId; 
        private String crossRoleName; 
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
        private String ownerId; 
        private String restoreDir; 
        private String restoreHome; 
        private String restoreObjects; 
        private String restoreTaskName; 
        private Long restoreTime; 

        private Builder() {
            super();
        } 

        private Builder(CreateRestoreTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.backupGatewayId = request.backupGatewayId;
            this.backupPlanId = request.backupPlanId;
            this.backupSetId = request.backupSetId;
            this.clientToken = request.clientToken;
            this.crossAliyunId = request.crossAliyunId;
            this.crossRoleName = request.crossRoleName;
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
            this.ownerId = request.ownerId;
            this.restoreDir = request.restoreDir;
            this.restoreHome = request.restoreHome;
            this.restoreObjects = request.restoreObjects;
            this.restoreTaskName = request.restoreTaskName;
            this.restoreTime = request.restoreTime;
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
         * <p>This parameter is required if the DestinationEndpointInstanceType parameter is set to Agent.</p>
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
         * <p>The ID of the backup schedule.</p>
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
         * <p>The ID of the full backup set.</p>
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
         * <p>The client token that is used to ensure the idempotence of the request.</p>
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
         * <p>The unique ID (UID) of the Alibaba Cloud account to which the source database belongs.</p>
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
         * <p>The name of the database.</p>
         * <blockquote>
         * <p>This parameter is required if the database is a PostgreSQL database or a MongoDB database.</p>
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
         * <p>The endpoint that is used to connect to the database.</p>
         * <blockquote>
         * <p>This parameter is required if the DestinationEndpointInstanceType parameter is set to Express, Agent, or Other.</p>
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
         * <p>The ID of the database instance.</p>
         * <blockquote>
         * <p>This parameter is required if the DestinationEndpointInstanceType parameter is set to RDS, ECS, DDS, or Express.</p>
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
         * <li><strong>RDS</strong>: The database is deployed on an ApsaraDB RDS instance.</li>
         * <li><strong>ECS</strong>: The database is deployed on an Elastic Compute Service (ECS) instance.</li>
         * <li><strong>Express</strong>: The database is connected to Database Backup (DBS) by using Express Connect, VPN Gateway, or Smart Access Gateway.</li>
         * <li><strong>Agent</strong>: The database is connected over a DBS backup gateway.</li>
         * <li><strong>DDS</strong>: The database is an ApsaraDB for MongoDB database.</li>
         * <li><strong>Other</strong>: The database is connected to DBS by using the IP address and port of the database.</li>
         * <li><strong>dg</strong>: The database is a self-managed database that does not have public IP addresses or port numbers and is connected to DBS over Database Gateway.</li>
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
         * <p>The system ID (SID) of the Oracle database.</p>
         * <blockquote>
         * <p>This parameter is required if the source database is an Oracle database.</p>
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
         * <p>The password of the account that is used to connect to the source database.</p>
         * <blockquote>
         * <p>This parameter is required except that the database is an SQL Server database that is connected to DBS over a DBS backup gateway or a Redis database.</p>
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
         * <p>The port of the database.</p>
         * <blockquote>
         * <p>This parameter is required if the DestinationEndpointInstanceType parameter is set to Express, Agent, Other, or ECS.</p>
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
         * <p>The region ID of the destination database instance.</p>
         * <blockquote>
         * <p> You must specify this parameter if <strong>DestinationEndpointInstanceType</strong> is set to RDS, ECS, DDS, Express, or Agent.</p>
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
         * <p>The username of the account that is used to connect to the database.</p>
         * <blockquote>
         * <p>This parameter is required except that the database is an SQL Server database that is connected to DBS over a DBS backup gateway or a Redis database.</p>
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
         * <p>The method of processing objects with the same name. Valid values:</p>
         * <ul>
         * <li>failure: The restore task fails if the system detects objects with the same name. This is the default value.</li>
         * <li>renamenew: The restore task renames objects with the same name starting from the second occurrence.</li>
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
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>This parameter is required if the DestinationEndpointInstanceType parameter is set to Agent and the backup object of the backup schedule is a MySQL database.</p>
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
         * <p>The program directory of the database.</p>
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
         * <blockquote>
         * <p>This parameter is required except that the DestinationEndpointInstanceType parameter is set to Agent. For information about the parameter definition, see RestoreObjects.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[ { &quot;DBName&quot;:&quot;Name of the database to be restored&quot;, &quot;NewDBName&quot;:&quot;Name of the database to which the objects will be restored&quot;, &quot;SchemaName&quot;:&quot;Schema name of the database to be restored&quot;, &quot;NewSchemaName&quot;:&quot;Schema name of the destination database to which the objects will be restored&quot;}]</p>
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
         * <p>The time to run the restore task, such as 1554560477000.</p>
         * 
         * <strong>example:</strong>
         * <p>1554560477000</p>
         */
        public Builder restoreTime(Long restoreTime) {
            this.putQueryParameter("RestoreTime", restoreTime);
            this.restoreTime = restoreTime;
            return this;
        }

        @Override
        public CreateRestoreTaskRequest build() {
            return new CreateRestoreTaskRequest(this);
        } 

    } 

}
