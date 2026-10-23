// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link UpdateAgenticDataSourceRequest} extends {@link RequestModel}
 *
 * <p>UpdateAgenticDataSourceRequest</p>
 */
public class UpdateAgenticDataSourceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Alias")
    private String alias;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthAccount")
    private String authAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthPassword")
    private String authPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthType")
    private Integer authType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CatalogName")
    private String catalogName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateMode")
    private String createMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataSourceUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataSourceUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbType")
    private String dbType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnvType")
    private String envType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Host")
    private String host;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceResourceId")
    private String instanceResourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KmsSecret")
    private String kmsSecret;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    private String policyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Port")
    private Integer port;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleArn")
    private String roleArn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Schema")
    private String schema;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnowflakeRole")
    private String snowflakeRole;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnowflakeWarehouse")
    private String snowflakeWarehouse;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SyncAlias")
    private Integer syncAlias;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseSsl")
    private Integer useSsl;

    private UpdateAgenticDataSourceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.alias = builder.alias;
        this.authAccount = builder.authAccount;
        this.authPassword = builder.authPassword;
        this.authType = builder.authType;
        this.catalogName = builder.catalogName;
        this.createMode = builder.createMode;
        this.dataSourceUuid = builder.dataSourceUuid;
        this.dbType = builder.dbType;
        this.envType = builder.envType;
        this.host = builder.host;
        this.instanceResourceId = builder.instanceResourceId;
        this.kmsSecret = builder.kmsSecret;
        this.policyId = builder.policyId;
        this.port = builder.port;
        this.roleArn = builder.roleArn;
        this.schema = builder.schema;
        this.snowflakeRole = builder.snowflakeRole;
        this.snowflakeWarehouse = builder.snowflakeWarehouse;
        this.syncAlias = builder.syncAlias;
        this.useSsl = builder.useSsl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAgenticDataSourceRequest create() {
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
     * @return alias
     */
    public String getAlias() {
        return this.alias;
    }

    /**
     * @return authAccount
     */
    public String getAuthAccount() {
        return this.authAccount;
    }

    /**
     * @return authPassword
     */
    public String getAuthPassword() {
        return this.authPassword;
    }

    /**
     * @return authType
     */
    public Integer getAuthType() {
        return this.authType;
    }

    /**
     * @return catalogName
     */
    public String getCatalogName() {
        return this.catalogName;
    }

    /**
     * @return createMode
     */
    public String getCreateMode() {
        return this.createMode;
    }

    /**
     * @return dataSourceUuid
     */
    public String getDataSourceUuid() {
        return this.dataSourceUuid;
    }

    /**
     * @return dbType
     */
    public String getDbType() {
        return this.dbType;
    }

    /**
     * @return envType
     */
    public String getEnvType() {
        return this.envType;
    }

    /**
     * @return host
     */
    public String getHost() {
        return this.host;
    }

    /**
     * @return instanceResourceId
     */
    public String getInstanceResourceId() {
        return this.instanceResourceId;
    }

    /**
     * @return kmsSecret
     */
    public String getKmsSecret() {
        return this.kmsSecret;
    }

    /**
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * @return port
     */
    public Integer getPort() {
        return this.port;
    }

    /**
     * @return roleArn
     */
    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * @return schema
     */
    public String getSchema() {
        return this.schema;
    }

    /**
     * @return snowflakeRole
     */
    public String getSnowflakeRole() {
        return this.snowflakeRole;
    }

    /**
     * @return snowflakeWarehouse
     */
    public String getSnowflakeWarehouse() {
        return this.snowflakeWarehouse;
    }

    /**
     * @return syncAlias
     */
    public Integer getSyncAlias() {
        return this.syncAlias;
    }

    /**
     * @return useSsl
     */
    public Integer getUseSsl() {
        return this.useSsl;
    }

    public static final class Builder extends Request.Builder<UpdateAgenticDataSourceRequest, Builder> {
        private String regionId; 
        private String alias; 
        private String authAccount; 
        private String authPassword; 
        private Integer authType; 
        private String catalogName; 
        private String createMode; 
        private String dataSourceUuid; 
        private String dbType; 
        private String envType; 
        private String host; 
        private String instanceResourceId; 
        private String kmsSecret; 
        private String policyId; 
        private Integer port; 
        private String roleArn; 
        private String schema; 
        private String snowflakeRole; 
        private String snowflakeWarehouse; 
        private Integer syncAlias; 
        private Integer useSsl; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAgenticDataSourceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.alias = request.alias;
            this.authAccount = request.authAccount;
            this.authPassword = request.authPassword;
            this.authType = request.authType;
            this.catalogName = request.catalogName;
            this.createMode = request.createMode;
            this.dataSourceUuid = request.dataSourceUuid;
            this.dbType = request.dbType;
            this.envType = request.envType;
            this.host = request.host;
            this.instanceResourceId = request.instanceResourceId;
            this.kmsSecret = request.kmsSecret;
            this.policyId = request.policyId;
            this.port = request.port;
            this.roleArn = request.roleArn;
            this.schema = request.schema;
            this.snowflakeRole = request.snowflakeRole;
            this.snowflakeWarehouse = request.snowflakeWarehouse;
            this.syncAlias = request.syncAlias;
            this.useSsl = request.useSsl;
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
         * <p>The new display name of the data source. If you do not specify this parameter, the alias is not updated.</p>
         * 
         * <strong>example:</strong>
         * <p>demo_mysql</p>
         */
        public Builder alias(String alias) {
            this.putQueryParameter("Alias", alias);
            this.alias = alias;
            return this;
        }

        /**
         * <p>The new logon username. If you do not specify this parameter, the authentication account is not updated.</p>
         * 
         * <strong>example:</strong>
         * <p>db_user</p>
         */
        public Builder authAccount(String authAccount) {
            this.putQueryParameter("AuthAccount", authAccount);
            this.authAccount = authAccount;
            return this;
        }

        /**
         * <p>The new logon password. If you do not specify this parameter, the authentication password is not updated. This is sensitive information. Do not record or disclose it.</p>
         * 
         * <strong>example:</strong>
         * <p>P@ss****</p>
         */
        public Builder authPassword(String authPassword) {
            this.putQueryParameter("AuthPassword", authPassword);
            this.authPassword = authPassword;
            return this;
        }

        /**
         * <p>Optional. Valid values:</p>
         * <ul>
         * <li>-1: No authentication required.</li>
         * <li>0: Username and password.</li>
         * <li>1: Password only.</li>
         * <li>2: Password-free.
         * If you do not specify this parameter, the authentication type is not updated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder authType(Integer authType) {
            this.putQueryParameter("AuthType", authType);
            this.authType = authType;
            return this;
        }

        /**
         * <p>The new name of the metadata catalog. If you do not specify this parameter, the catalog name is not updated. The name can be up to 128 characters in length. It must start with a Chinese character, a letter, or an underscore, and can contain digits and hyphens. It cannot contain only digits.</p>
         * 
         * <strong>example:</strong>
         * <p>demo_catalog</p>
         */
        public Builder catalogName(String catalogName) {
            this.putQueryParameter("CatalogName", catalogName);
            this.catalogName = catalogName;
            return this;
        }

        /**
         * <p>The registration method. Valid values:</p>
         * <ul>
         * <li>INSTANCE_ID: Select an existing cloud instance.</li>
         * <li>HOST_PORT: Register by endpoint and port.
         * If you do not specify this parameter, the creation mode is not updated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HOST_PORT</p>
         */
        public Builder createMode(String createMode) {
            this.putQueryParameter("CreateMode", createMode);
            this.createMode = createMode;
            return this;
        }

        /**
         * <p>The UUID of the data source to be updated.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou_a1b2c3d4e5f6</p>
         */
        public Builder dataSourceUuid(String dataSourceUuid) {
            this.putQueryParameter("DataSourceUuid", dataSourceUuid);
            this.dataSourceUuid = dataSourceUuid;
            return this;
        }

        /**
         * <p>Modifying the data source type is not supported. Do not specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>MYSQL</p>
         */
        public Builder dbType(String dbType) {
            this.putQueryParameter("DbType", dbType);
            this.dbType = dbType;
            return this;
        }

        /**
         * <p>The environment type. Valid values: product, pre, dev, test, sit, uat, pet, and stag. If you do not specify this parameter, the environment type is not updated.</p>
         * 
         * <strong>example:</strong>
         * <p>product</p>
         */
        public Builder envType(String envType) {
            this.putQueryParameter("EnvType", envType);
            this.envType = envType;
            return this;
        }

        /**
         * <p>Optional. The new domain name or IP address of the database. Do not include the protocol, path, or port. If you do not specify this parameter, the host is not updated.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql.example.com</p>
         */
        public Builder host(String host) {
            this.putQueryParameter("Host", host);
            this.host = host;
            return this;
        }

        /**
         * <p>The new ID of the cloud resource instance. If you do not specify this parameter, the instance resource ID is not updated.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp1234567890</p>
         */
        public Builder instanceResourceId(String instanceResourceId) {
            this.putQueryParameter("InstanceResourceId", instanceResourceId);
            this.instanceResourceId = instanceResourceId;
            return this;
        }

        /**
         * <p>The new name of the KMS-managed credential. If you do not specify this parameter, the KMS secret is not updated.</p>
         * 
         * <strong>example:</strong>
         * <p>datasource-secret</p>
         */
        public Builder kmsSecret(String kmsSecret) {
            this.putQueryParameter("KmsSecret", kmsSecret);
            this.kmsSecret = kmsSecret;
            return this;
        }

        /**
         * <p>Optional. The new ID of the data access security policy. If you do not specify this parameter, the policy ID is not updated.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-usr-example</p>
         */
        public Builder policyId(String policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * <p>Optional. The new service port of the database. If you do not specify this parameter, the service port is not updated.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        public Builder port(Integer port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * <p>The new ARN of the Alibaba Cloud RAM role. If you do not specify this parameter, the role ARN is not updated.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::123456789012****:role/DataSourceRole</p>
         */
        public Builder roleArn(String roleArn) {
            this.putQueryParameter("RoleArn", roleArn);
            this.roleArn = roleArn;
            return this;
        }

        /**
         * <p>Optional. For ADB_POSTGRESQL, DRDS, POSTGRESQL, and POLARDB_POSTGRESQL, specify the database name. For ORACLE, specify the SID or service name, and prefix the service name with a forward slash (/). For POLARDB_ORACLE, specify the SID. For MAXCOMPUTE, specify the project name. For other types, leave this parameter empty. If you do not specify this parameter, the schema is not updated.</p>
         * 
         * <strong>example:</strong>
         * <p>postgres</p>
         */
        public Builder schema(String schema) {
            this.putQueryParameter("Schema", schema);
            this.schema = schema;
            return this;
        }

        /**
         * <p>The name of the Snowflake role. This parameter takes effect only when DbType is set to SNOWFLAKE.</p>
         * 
         * <strong>example:</strong>
         * <p>ROLE</p>
         */
        public Builder snowflakeRole(String snowflakeRole) {
            this.putQueryParameter("SnowflakeRole", snowflakeRole);
            this.snowflakeRole = snowflakeRole;
            return this;
        }

        /**
         * <p>The name of the Snowflake compute warehouse. This parameter takes effect only when DbType is set to SNOWFLAKE.</p>
         * 
         * <strong>example:</strong>
         * <p>WAREHOUSE</p>
         */
        public Builder snowflakeWarehouse(String snowflakeWarehouse) {
            this.putQueryParameter("SnowflakeWarehouse", snowflakeWarehouse);
            this.snowflakeWarehouse = snowflakeWarehouse;
            return this;
        }

        /**
         * <p>Specifies whether to use the cloud instance name as the data source name. Valid values:</p>
         * <ul>
         * <li>1: Yes.</li>
         * <li>0: No.
         * If you do not specify this parameter, the sync alias setting is not updated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder syncAlias(Integer syncAlias) {
            this.putQueryParameter("SyncAlias", syncAlias);
            this.syncAlias = syncAlias;
            return this;
        }

        /**
         * <p>The new SSL setting. Valid values:</p>
         * <ul>
         * <li>1: Enable.</li>
         * <li>0: Disable.</li>
         * <li>-1: Use default settings.
         * If you do not specify this parameter, the SSL setting is not updated. SSL is supported only for ADB_MYSQL, CLICKHOUSE, MARIADB, MYSQL, OCEANBASEX, POLARDB, SELECTDB, and STARROCKS.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder useSsl(Integer useSsl) {
            this.putQueryParameter("UseSsl", useSsl);
            this.useSsl = useSsl;
            return this;
        }

        @Override
        public UpdateAgenticDataSourceRequest build() {
            return new UpdateAgenticDataSourceRequest(this);
        } 

    } 

}
