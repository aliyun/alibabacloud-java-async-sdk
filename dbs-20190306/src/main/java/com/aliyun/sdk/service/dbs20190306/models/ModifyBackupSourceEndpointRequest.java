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
 * {@link ModifyBackupSourceEndpointRequest} extends {@link RequestModel}
 *
 * <p>ModifyBackupSourceEndpointRequest</p>
 */
public class ModifyBackupSourceEndpointRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupGatewayId")
    private Long backupGatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupObjects")
    private String backupObjects;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupPlanId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String backupPlanId;

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
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

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

    private ModifyBackupSourceEndpointRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.backupGatewayId = builder.backupGatewayId;
        this.backupObjects = builder.backupObjects;
        this.backupPlanId = builder.backupPlanId;
        this.clientToken = builder.clientToken;
        this.crossAliyunId = builder.crossAliyunId;
        this.crossRoleName = builder.crossRoleName;
        this.ownerId = builder.ownerId;
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

    public static ModifyBackupSourceEndpointRequest create() {
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
     * @return backupObjects
     */
    public String getBackupObjects() {
        return this.backupObjects;
    }

    /**
     * @return backupPlanId
     */
    public String getBackupPlanId() {
        return this.backupPlanId;
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
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
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

    public static final class Builder extends Request.Builder<ModifyBackupSourceEndpointRequest, Builder> {
        private String regionId; 
        private Long backupGatewayId; 
        private String backupObjects; 
        private String backupPlanId; 
        private String clientToken; 
        private String crossAliyunId; 
        private String crossRoleName; 
        private String ownerId; 
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

        private Builder(ModifyBackupSourceEndpointRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.backupGatewayId = request.backupGatewayId;
            this.backupObjects = request.backupObjects;
            this.backupPlanId = request.backupPlanId;
            this.clientToken = request.clientToken;
            this.crossAliyunId = request.crossAliyunId;
            this.crossRoleName = request.crossRoleName;
            this.ownerId = request.ownerId;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The backup gateway ID. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to obtain the ID.</p>
         * <blockquote>
         * <p> If you set <strong>SourceEndpointInstanceType</strong> to Agent, this parameter is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>21321323213</p>
         */
        public Builder backupGatewayId(Long backupGatewayId) {
            this.putQueryParameter("BackupGatewayId", backupGatewayId);
            this.backupGatewayId = backupGatewayId;
            return this;
        }

        /**
         * <p>The backup object. If you set SourceEndpointInstanceType to Agent, this parameter is optional. Otherwise, it is required. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to obtain the backup object.</p>
         * 
         * <strong>example:</strong>
         * <p>[{ &quot;DBName&quot;:&quot;Name of the database to be backed up&quot;, &quot;SchemaName&quot;:&quot;Name of the schema to be backed up&quot;, &quot;TableIncludes&quot;:[{ &quot;TableName&quot;:&quot;Name of the table to be backed up&quot; }], &quot;TableExcludes&quot;:[{&quot;TableName&quot;:&quot;Name of the table to be excluded during the backup&quot; }] } ]</p>
         */
        public Builder backupObjects(String backupObjects) {
            this.putQueryParameter("BackupObjects", backupObjects);
            this.backupObjects = backupObjects;
            return this;
        }

        /**
         * <p>The ID of the backup schedule. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to obtain it.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dbs1h****usfa</p>
         */
        public Builder backupPlanId(String backupPlanId) {
            this.putQueryParameter("BackupPlanId", backupPlanId);
            this.backupPlanId = backupPlanId;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
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
         * <p>The unique ID (UID) of the Alibaba Cloud account to which the backup schedule belongs. You can call the <a href="https://help.aliyun.com/document_detail/2869838.html">DescribeRestoreTaskList</a> operation to obtain the UID.</p>
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
         * <p>The name of the RAM role that is used to perform backups across Alibaba Cloud accounts. You can call the <a href="https://help.aliyun.com/document_detail/2869838.html">DescribeRestoreTaskList</a> operation to obtain the RAM role.</p>
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
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The name of the database.</p>
         * <ul>
         * <li>This parameter is required if the database is a PostgreSQL or MongoDB database.</li>
         * <li>This parameter is required if the database is an SQL Server database that is connected to DBS over a DBS backup gateway.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder sourceEndpointDatabaseName(String sourceEndpointDatabaseName) {
            this.putQueryParameter("SourceEndpointDatabaseName", sourceEndpointDatabaseName);
            this.sourceEndpointDatabaseName = sourceEndpointDatabaseName;
            return this;
        }

        /**
         * <p>The endpoint of the database. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to obtain the endpoint.</p>
         * <blockquote>
         * <p> If you set <strong>SourceEndpointInstanceType</strong> to Express, Agent, or Other, this parameter is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100.<em>.</em>.10:3306</p>
         */
        public Builder sourceEndpointIP(String sourceEndpointIP) {
            this.putQueryParameter("SourceEndpointIP", sourceEndpointIP);
            this.sourceEndpointIP = sourceEndpointIP;
            return this;
        }

        /**
         * <p>The database instance ID. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to obtain the ID.</p>
         * <blockquote>
         * <p> If you set <strong>SourceEndpointInstanceType</strong> to RDS, ECS, DDS, or Express, this parameter is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rm-bp1p8c29479jv****</p>
         */
        public Builder sourceEndpointInstanceID(String sourceEndpointInstanceID) {
            this.putQueryParameter("SourceEndpointInstanceID", sourceEndpointInstanceID);
            this.sourceEndpointInstanceID = sourceEndpointInstanceID;
            return this;
        }

        /**
         * <p>The location of the database. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to obtain it. Valid values:</p>
         * <ul>
         * <li><strong>RDS</strong></li>
         * <li><strong>ECS</strong></li>
         * <li><strong>Express</strong>: The database is connected to DBS via Express Connect, VPN Gateway, or Smart Access Gateway.</li>
         * <li><strong>Agent</strong>: The database is connected to DBS over a DBS backup gateway.</li>
         * <li><strong>DDS</strong>: The database is an ApsaraDB for MongoDB database.</li>
         * <li><strong>Other</strong>: The database is connected to DBS using the IP address and port of the database.</li>
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
         * <p>The SID of the Oracle source database. If the database is an Oracle database, this parameter is required.</p>
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
         * <p>This parameter is required except that the database is an SQL Server database that is connected to DBS over a DBS backup gateway or a Redis database.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder sourceEndpointPassword(String sourceEndpointPassword) {
            this.putQueryParameter("SourceEndpointPassword", sourceEndpointPassword);
            this.sourceEndpointPassword = sourceEndpointPassword;
            return this;
        }

        /**
         * <p>The port that is used to connect to the database. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to obtain the port.</p>
         * <blockquote>
         * <p> If you set <strong>SourceEndpointInstanceType</strong> to Express, Agent, Other, or ECS, this parameter is required.</p>
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
         * <p>The region in which the database you want to back up resides. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to obtain the region.</p>
         * <blockquote>
         * <p> If you set <strong>SourceEndpointInstanceType</strong> to RDS, ECS, DDS, Express, or Agent, this parameter is required.</p>
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
         * <p>The account that is used to log on to the database. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to obtain the account.</p>
         * <p>If the database is an SQL Server database connected to DBS over a DBS backup gateway or a Redis database, this parameter is optional. Otherwise, it is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder sourceEndpointUserName(String sourceEndpointUserName) {
            this.putQueryParameter("SourceEndpointUserName", sourceEndpointUserName);
            this.sourceEndpointUserName = sourceEndpointUserName;
            return this;
        }

        @Override
        public ModifyBackupSourceEndpointRequest build() {
            return new ModifyBackupSourceEndpointRequest(this);
        } 

    } 

}
