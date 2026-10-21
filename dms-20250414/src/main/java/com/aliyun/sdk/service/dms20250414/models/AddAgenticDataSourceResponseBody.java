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
 * {@link AddAgenticDataSourceResponseBody} extends {@link TeaModel}
 *
 * <p>AddAgenticDataSourceResponseBody</p>
 */
public class AddAgenticDataSourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private AddAgenticDataSourceResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddAgenticDataSourceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(AddAgenticDataSourceResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The details of the created data source.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code returned when the call fails. This parameter is empty if the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidParameter</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned when the call fails. This parameter is empty if the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>The parameter is invalid</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The request ID, which is used to trace the call.</p>
         * 
         * <strong>example:</strong>
         * <p>request-1234567890</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public AddAgenticDataSourceResponseBody build() {
            return new AddAgenticDataSourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AddAgenticDataSourceResponseBody} extends {@link TeaModel}
     *
     * <p>AddAgenticDataSourceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("AuthAccount")
        private String authAccount;

        @com.aliyun.core.annotation.NameInMap("AuthPassword")
        private String authPassword;

        @com.aliyun.core.annotation.NameInMap("AuthType")
        private Integer authType;

        @com.aliyun.core.annotation.NameInMap("CatalogName")
        private String catalogName;

        @com.aliyun.core.annotation.NameInMap("CreateMode")
        private String createMode;

        @com.aliyun.core.annotation.NameInMap("DataSourceUuid")
        private String dataSourceUuid;

        @com.aliyun.core.annotation.NameInMap("DbType")
        private String dbType;

        @com.aliyun.core.annotation.NameInMap("EnvType")
        private String envType;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("InstanceResourceId")
        private String instanceResourceId;

        @com.aliyun.core.annotation.NameInMap("InstanceSource")
        private String instanceSource;

        @com.aliyun.core.annotation.NameInMap("KmsSecret")
        private String kmsSecret;

        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private String policyId;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceAccountId")
        private String resourceAccountId;

        @com.aliyun.core.annotation.NameInMap("RoleArn")
        private String roleArn;

        @com.aliyun.core.annotation.NameInMap("Schema")
        private String schema;

        @com.aliyun.core.annotation.NameInMap("State")
        private Integer state;

        @com.aliyun.core.annotation.NameInMap("SyncAlias")
        private Integer syncAlias;

        @com.aliyun.core.annotation.NameInMap("UseSsl")
        private Integer useSsl;

        private Data(Builder builder) {
            this.alias = builder.alias;
            this.authAccount = builder.authAccount;
            this.authPassword = builder.authPassword;
            this.authType = builder.authType;
            this.catalogName = builder.catalogName;
            this.createMode = builder.createMode;
            this.dataSourceUuid = builder.dataSourceUuid;
            this.dbType = builder.dbType;
            this.envType = builder.envType;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.host = builder.host;
            this.instanceResourceId = builder.instanceResourceId;
            this.instanceSource = builder.instanceSource;
            this.kmsSecret = builder.kmsSecret;
            this.policyId = builder.policyId;
            this.port = builder.port;
            this.regionId = builder.regionId;
            this.resourceAccountId = builder.resourceAccountId;
            this.roleArn = builder.roleArn;
            this.schema = builder.schema;
            this.state = builder.state;
            this.syncAlias = builder.syncAlias;
            this.useSsl = builder.useSsl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
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
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceAccountId
         */
        public String getResourceAccountId() {
            return this.resourceAccountId;
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
         * @return state
         */
        public Integer getState() {
            return this.state;
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

        public static final class Builder {
            private String alias; 
            private String authAccount; 
            private String authPassword; 
            private Integer authType; 
            private String catalogName; 
            private String createMode; 
            private String dataSourceUuid; 
            private String dbType; 
            private String envType; 
            private String gmtCreate; 
            private String gmtModified; 
            private String host; 
            private String instanceResourceId; 
            private String instanceSource; 
            private String kmsSecret; 
            private String policyId; 
            private Integer port; 
            private String regionId; 
            private String resourceAccountId; 
            private String roleArn; 
            private String schema; 
            private Integer state; 
            private Integer syncAlias; 
            private Integer useSsl; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.alias = model.alias;
                this.authAccount = model.authAccount;
                this.authPassword = model.authPassword;
                this.authType = model.authType;
                this.catalogName = model.catalogName;
                this.createMode = model.createMode;
                this.dataSourceUuid = model.dataSourceUuid;
                this.dbType = model.dbType;
                this.envType = model.envType;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.host = model.host;
                this.instanceResourceId = model.instanceResourceId;
                this.instanceSource = model.instanceSource;
                this.kmsSecret = model.kmsSecret;
                this.policyId = model.policyId;
                this.port = model.port;
                this.regionId = model.regionId;
                this.resourceAccountId = model.resourceAccountId;
                this.roleArn = model.roleArn;
                this.schema = model.schema;
                this.state = model.state;
                this.syncAlias = model.syncAlias;
                this.useSsl = model.useSsl;
            } 

            /**
             * <p>The display name of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>demo_mysql</p>
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * <p>The logon username for the data source. This parameter is empty if username authentication is not used.</p>
             * 
             * <strong>example:</strong>
             * <p>db_user</p>
             */
            public Builder authAccount(String authAccount) {
                this.authAccount = authAccount;
                return this;
            }

            /**
             * <p>The masked value of the password or token. The actual value is not returned.</p>
             * 
             * <strong>example:</strong>
             * <p>P@ss****</p>
             */
            public Builder authPassword(String authPassword) {
                this.authPassword = authPassword;
                return this;
            }

            /**
             * <p>The authentication method. Valid values:</p>
             * <ul>
             * <li>-1: no authentication required</li>
             * <li>0: username and password</li>
             * <li>1: password only</li>
             * <li>2: password-free</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder authType(Integer authType) {
                this.authType = authType;
                return this;
            }

            /**
             * <p>The name of the metadata catalog associated with the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>demo_catalog</p>
             */
            public Builder catalogName(String catalogName) {
                this.catalogName = catalogName;
                return this;
            }

            /**
             * <p>The registration method of the data source. Valid values:</p>
             * <ul>
             * <li>INSTANCE_ID: select an existing cloud instance</li>
             * <li>HOST_PORT: register by endpoint and port</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>HOST_PORT</p>
             */
            public Builder createMode(String createMode) {
                this.createMode = createMode;
                return this;
            }

            /**
             * <p>The unique identifier of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou_a1b2c3d4e5f6</p>
             */
            public Builder dataSourceUuid(String dataSourceUuid) {
                this.dataSourceUuid = dataSourceUuid;
                return this;
            }

            /**
             * <p>The type of the data source. Valid values: MYSQL, POSTGRESQL, ORACLE, SQLSERVER, MARIADB, POLARDB, POLARDB_POSTGRESQL, POLARDB_ORACLE, OCEANBASEX, DRDS, ADB_MYSQL, ADB_POSTGRESQL, CLICKHOUSE, SELECTDB, STARROCKS, HOLOGRES, MAXCOMPUTE, ES_REST, and TRINO.</p>
             * 
             * <strong>example:</strong>
             * <p>MYSQL</p>
             */
            public Builder dbType(String dbType) {
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
                this.envType = envType;
                return this;
            }

            /**
             * <p>The time when the data source was created. The time is in the yyyy-MM-dd HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-13 14:30:00</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the data source was last modified. The time is in the yyyy-MM-dd HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-13 14:35:00</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The endpoint of the data source. A masked value may be returned in sensitive scenarios.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql.example.com</p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>The ID of the cloud resource instance. This parameter may be empty for data sources registered by endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bp1234567890</p>
             */
            public Builder instanceResourceId(String instanceResourceId) {
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
             * 
             * <strong>example:</strong>
             * <p>RDS</p>
             */
            public Builder instanceSource(String instanceSource) {
                this.instanceSource = instanceSource;
                return this;
            }

            /**
             * <p>The name of the KMS-managed credential. This parameter is empty if KMS is not used. This is sensitive information.</p>
             * 
             * <strong>example:</strong>
             * <p>datasource-secret</p>
             */
            public Builder kmsSecret(String kmsSecret) {
                this.kmsSecret = kmsSecret;
                return this;
            }

            /**
             * <p>The ID of the data access security policy in use. This parameter is empty if no policy is configured.</p>
             * 
             * <strong>example:</strong>
             * <p>sp-usr-example</p>
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * <p>The connection port of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The region where the data source resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the resource belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>123456789012****</p>
             */
            public Builder resourceAccountId(String resourceAccountId) {
                this.resourceAccountId = resourceAccountId;
                return this;
            }

            /**
             * <p>The ARN of the RAM role used to access the data source. This parameter is empty if role authorization is not used.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::123456789012****:role/DataSourceRole</p>
             */
            public Builder roleArn(String roleArn) {
                this.roleArn = roleArn;
                return this;
            }

            /**
             * <p>The name of the connection target. For ADB_POSTGRESQL, DRDS, POSTGRESQL, and POLARDB_POSTGRESQL, this indicates the database name. For ORACLE, this indicates the SID or service name. For POLARDB_ORACLE, this indicates the SID. For MAXCOMPUTE, this indicates the project. For other types, this parameter is usually empty.</p>
             * 
             * <strong>example:</strong>
             * <p>postgres</p>
             */
            public Builder schema(String schema) {
                this.schema = schema;
                return this;
            }

            /**
             * <p>The status of the data source. Valid values:</p>
             * <ul>
             * <li>0: normal</li>
             * <li>-1: deleted</li>
             * <li>-2: disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder state(Integer state) {
                this.state = state;
                return this;
            }

            /**
             * <p>Indicates whether the cloud instance name is used as the data source name. Valid values:</p>
             * <ul>
             * <li>1: yes</li>
             * <li>0: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder syncAlias(Integer syncAlias) {
                this.syncAlias = syncAlias;
                return this;
            }

            /**
             * <p>The SSL settings. Valid values:</p>
             * <ul>
             * <li>1: enabled</li>
             * <li>0: disabled</li>
             * <li>-1: default settings</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder useSsl(Integer useSsl) {
                this.useSsl = useSsl;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
