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
    @com.aliyun.core.annotation.NameInMap("EnableSourceEndpointSsl")
    private String enableSourceEndpointSsl;

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

    private ModifyBackupSourceEndpointRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.backupGatewayId = builder.backupGatewayId;
        this.backupObjects = builder.backupObjects;
        this.backupPlanId = builder.backupPlanId;
        this.clientToken = builder.clientToken;
        this.crossAliyunId = builder.crossAliyunId;
        this.crossRoleName = builder.crossRoleName;
        this.enableSourceEndpointSsl = builder.enableSourceEndpointSsl;
        this.ownerId = builder.ownerId;
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
     * @return enableSourceEndpointSsl
     */
    public String getEnableSourceEndpointSsl() {
        return this.enableSourceEndpointSsl;
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

    public static final class Builder extends Request.Builder<ModifyBackupSourceEndpointRequest, Builder> {
        private String regionId; 
        private Long backupGatewayId; 
        private String backupObjects; 
        private String backupPlanId; 
        private String clientToken; 
        private String crossAliyunId; 
        private String crossRoleName; 
        private String enableSourceEndpointSsl; 
        private String ownerId; 
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

        private Builder(ModifyBackupSourceEndpointRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.backupGatewayId = request.backupGatewayId;
            this.backupObjects = request.backupObjects;
            this.backupPlanId = request.backupPlanId;
            this.clientToken = request.clientToken;
            this.crossAliyunId = request.crossAliyunId;
            this.crossRoleName = request.crossRoleName;
            this.enableSourceEndpointSsl = request.enableSourceEndpointSsl;
            this.ownerId = request.ownerId;
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
         * <p>The backup gateway ID. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to get this value.</p>
         * <blockquote>
         * <p>This parameter is required if the <strong>SourceEndpointInstanceType</strong> parameter is set to <code>Agent</code>.</p>
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
         * <p>Backup objects: This parameter is optional if the database is located on an agent, but required for all other scenarios. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to obtain the value of this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>[{  &quot;DBName&quot;:&quot;待备份库名&quot;, &quot;SchemaName&quot;:&quot;待备份 Schema 名&quot;, &quot;TableIncludes&quot;:[{ &quot;TableName&quot;:&quot;待备份表表名&quot; }],  &quot;TableExcludes&quot;:[{&quot;TableName&quot;:&quot;待备份库名不需要备份表的表名&quot; }] } ]</p>
         */
        public Builder backupObjects(String backupObjects) {
            this.putQueryParameter("BackupObjects", backupObjects);
            this.backupObjects = backupObjects;
            return this;
        }

        /**
         * <p>The backup plan ID. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to get this value.</p>
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
         * <p>A client-generated token to ensure request idempotence.</p>
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
         * <p>The UID for cross-account backup.</p>
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
         * <p>The RAM role name for cross-account backup.</p>
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
         * <p>Specifies whether to use an SSL connection to back up the source database.</p>
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
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The database name.</p>
         * <ul>
         * <li><p>This parameter is required for PostgreSQL and MongoDB databases.</p>
         * </li>
         * <li><p>This parameter is also required for Microsoft SQL Server databases when the <strong>SourceEndpointInstanceType</strong> parameter is set to \&quot;Agent\&quot;.</p>
         * </li>
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
         * <p>The IP address of the database. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to get this value.</p>
         * <blockquote>
         * <p>This parameter is required if the <strong>SourceEndpointInstanceType</strong> parameter is set to <code>Express</code>, <code>Agent</code>, or <code>Other</code>.</p>
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
         * <p>The database instance ID. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to get this value.</p>
         * <blockquote>
         * <p>This parameter is required if the <strong>SourceEndpointInstanceType</strong> parameter is set to <code>RDS</code>, <code>ECS</code>, <code>DDS</code>, or <code>Express</code>.</p>
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
         * <p>The type of the source instance. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to get this value. Valid values:</p>
         * <ul>
         * <li><p><strong>RDS</strong>: an RDS instance</p>
         * </li>
         * <li><p><strong>ECS</strong>: a self-managed database on an ECS instance</p>
         * </li>
         * <li><p><strong>Express</strong>: a database connected over a leased line, VPN Gateway, or Smart Access Gateway</p>
         * </li>
         * <li><p><strong>Agent</strong>: a database connected over a backup gateway</p>
         * </li>
         * <li><p><strong>DDS</strong>: an ApsaraDB for MongoDB instance</p>
         * </li>
         * <li><p><strong>Other</strong>: a database connected over an IP address and port</p>
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
         * <p>The Oracle Home path.</p>
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
         * <p>The Oracle SID. This parameter is required for Oracle databases.</p>
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
         * <p>This parameter is required for all database engines except for Redis and Microsoft SQL Server (when the <strong>SourceEndpointInstanceType</strong> parameter is set to \&quot;Agent\&quot;).</p>
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
         * <p>The database port. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to get this value.</p>
         * <blockquote>
         * <p>This parameter is required if the <strong>SourceEndpointInstanceType</strong> parameter is set to <code>Express</code>, <code>Agent</code>, <code>Other</code>, or <code>ECS</code>.</p>
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
         * <p>The database region. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to get this value.</p>
         * <blockquote>
         * <p>This parameter is required if the <strong>SourceEndpointInstanceType</strong> parameter is set to <code>RDS</code>, <code>ECS</code>, <code>DDS</code>, <code>Express</code>, or <code>Agent</code>.</p>
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
         * <p>The username of the database account. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to get this value.</p>
         * <p>This parameter is required for all database engines except for Redis and Microsoft SQL Server (when the <strong>SourceEndpointInstanceType</strong> parameter is set to \&quot;Agent\&quot;).</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder sourceEndpointUserName(String sourceEndpointUserName) {
            this.putQueryParameter("SourceEndpointUserName", sourceEndpointUserName);
            this.sourceEndpointUserName = sourceEndpointUserName;
            return this;
        }

        /**
         * <p>The PEM certificate for the SSL connection.</p>
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
        public ModifyBackupSourceEndpointRequest build() {
            return new ModifyBackupSourceEndpointRequest(this);
        } 

    } 

}
