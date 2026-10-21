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
 * {@link AddAgenticDataSourceRequest} extends {@link RequestModel}
 *
 * <p>AddAgenticDataSourceRequest</p>
 */
public class AddAgenticDataSourceRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("DbType")
    @com.aliyun.core.annotation.Validation(required = true)
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
    @com.aliyun.core.annotation.NameInMap("InstanceSource")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceSource;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private AddAgenticDataSourceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.alias = builder.alias;
        this.authAccount = builder.authAccount;
        this.authPassword = builder.authPassword;
        this.authType = builder.authType;
        this.catalogName = builder.catalogName;
        this.createMode = builder.createMode;
        this.dbType = builder.dbType;
        this.envType = builder.envType;
        this.host = builder.host;
        this.instanceResourceId = builder.instanceResourceId;
        this.instanceSource = builder.instanceSource;
        this.kmsSecret = builder.kmsSecret;
        this.policyId = builder.policyId;
        this.port = builder.port;
        this.roleArn = builder.roleArn;
        this.schema = builder.schema;
        this.snowflakeRole = builder.snowflakeRole;
        this.snowflakeWarehouse = builder.snowflakeWarehouse;
        this.syncAlias = builder.syncAlias;
        this.useSsl = builder.useSsl;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddAgenticDataSourceRequest create() {
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
     * @return instanceSource
     */
    public String getInstanceSource() {
        return this.instanceSource;
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

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<AddAgenticDataSourceRequest, Builder> {
        private String regionId; 
        private String alias; 
        private String authAccount; 
        private String authPassword; 
        private Integer authType; 
        private String catalogName; 
        private String createMode; 
        private String dbType; 
        private String envType; 
        private String host; 
        private String instanceResourceId; 
        private String instanceSource; 
        private String kmsSecret; 
        private String policyId; 
        private Integer port; 
        private String roleArn; 
        private String schema; 
        private String snowflakeRole; 
        private String snowflakeWarehouse; 
        private Integer syncAlias; 
        private Integer useSsl; 
        private String vSwitchId; 
        private String vpcId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(AddAgenticDataSourceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.alias = request.alias;
            this.authAccount = request.authAccount;
            this.authPassword = request.authPassword;
            this.authType = request.authType;
            this.catalogName = request.catalogName;
            this.createMode = request.createMode;
            this.dbType = request.dbType;
            this.envType = request.envType;
            this.host = request.host;
            this.instanceResourceId = request.instanceResourceId;
            this.instanceSource = request.instanceSource;
            this.kmsSecret = request.kmsSecret;
            this.policyId = request.policyId;
            this.port = request.port;
            this.roleArn = request.roleArn;
            this.schema = request.schema;
            this.snowflakeRole = request.snowflakeRole;
            this.snowflakeWarehouse = request.snowflakeWarehouse;
            this.syncAlias = request.syncAlias;
            this.useSsl = request.useSsl;
            this.vSwitchId = request.vSwitchId;
            this.vpcId = request.vpcId;
            this.zoneId = request.zoneId;
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
         * <p>The display name of the data source. If you do not specify this parameter, the server generates a name.</p>
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
         * <p>The logon username. You can leave this parameter empty for authentication methods that do not require a username.</p>
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
         * <p>The logon password. This is sensitive information. Do not record or disclose it.</p>
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
         * <p>Optional. The authentication type. Valid values:</p>
         * <ul>
         * <li>-1: No authentication required.</li>
         * <li>0: Username and password.</li>
         * <li>1: Password only.</li>
         * <li>2: Password-free.</li>
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
         * <p>The name of the metadata catalog. If you do not specify this parameter, the name is automatically generated. The name can be up to 128 characters in length. It must start with a Chinese character, a letter, or an underscore, and can contain digits and hyphens. It cannot contain only digits.</p>
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
         * <p>The entry method. Valid values:</p>
         * <ul>
         * <li>INSTANCE_ID: Select an existing cloud instance.</li>
         * <li>HOST_PORT: Enter the endpoint and port.
         * If you do not specify this parameter, HOST_PORT is used.</li>
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
         * <p>The type of the data source. Use uppercase letters. Do not pass numbers. Valid values: MYSQL, POSTGRESQL, ORACLE, SQLSERVER, MARIADB, POLARDB, POLARDB_POSTGRESQL, POLARDB_ORACLE, OCEANBASEX, DRDS, ADB_MYSQL, ADB_POSTGRESQL, CLICKHOUSE, SELECTDB, STARROCKS, HOLOGRES, MAXCOMPUTE, ES_REST, and TRINO.</p>
         * <p>This parameter is required.</p>
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
         * <p>The environment type. Valid values: product, pre, dev, test, sit, uat, pet, and stag.</p>
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
         * <p>Optional. The domain name or IP address of the database. Do not include the protocol, path, or port. You can leave this parameter empty if you select an existing cloud instance and the address is automatically populated.</p>
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
         * <p>The ID of the cloud resource instance. This parameter is required when you select an existing cloud instance. You can leave this parameter empty when you enter an endpoint.</p>
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
         * <p>The source of the data source. Valid values:</p>
         * <ul>
         * <li>RDS: An ApsaraDB instance.</li>
         * <li>PUBLIC_OWN: A self-managed database on the Internet.</li>
         * <li>ECS_OWN: A self-managed database on an ECS instance.</li>
         * <li>GATEWAY: A database accessed through Database Gateway.</li>
         * <li>VPC_IDC: A database accessed through a VPC or data center.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        public Builder instanceSource(String instanceSource) {
            this.putQueryParameter("InstanceSource", instanceSource);
            this.instanceSource = instanceSource;
            return this;
        }

        /**
         * <p>The name of the credential. Specify this parameter when you use Key Management Service (KMS) to manage database credentials. Leave this parameter empty in other scenarios.</p>
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
         * <p>Optional. The ID of the data access security policy. This policy is used to control the access and protection rules for the data source.</p>
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
         * <p>Optional. The service port of the database. You can leave this parameter empty if you select an existing cloud instance and the port is automatically populated.</p>
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
         * <p>The complete ARN of the Resource Access Management (RAM) role. Specify this parameter when you use a RAM role to access the data source. Leave this parameter empty in other scenarios.</p>
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
         * <p>Optional. For ADB_POSTGRESQL, DRDS, POSTGRESQL, and POLARDB_POSTGRESQL, enter the database name. For ORACLE, enter the SID or service name, and prefix the service name with a forward slash (/). For POLARDB_ORACLE, enter the SID. For MAXCOMPUTE, enter the project name. Leave this parameter empty for other types.</p>
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
         * This parameter takes effect only when you select a cloud database instance.</li>
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
         * <p>Specifies whether to use SSL. Valid values:</p>
         * <ul>
         * <li>1: Enable.</li>
         * <li>0: Disable.</li>
         * <li>-1: Use the default setting.
         * Only ADB_MYSQL, CLICKHOUSE, MARIADB, MYSQL, OCEANBASEX, POLARDB, SELECTDB, and STARROCKS support SSL. Leave this parameter empty for other types.</li>
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

        /**
         * <p>The ID of the destination vSwitch. Specify this parameter when you access MaxCompute through a VPC. Leave this parameter empty in other scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1234567890</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The ID of the destination VPC. Specify this parameter when you access MaxCompute through a VPC. Leave this parameter empty in other scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1234567890</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The ID of the destination zone. Specify this parameter when you access MaxCompute through a VPC. Leave this parameter empty in other scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public AddAgenticDataSourceRequest build() {
            return new AddAgenticDataSourceRequest(this);
        } 

    } 

}
