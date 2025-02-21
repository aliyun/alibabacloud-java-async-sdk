// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

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
 * {@link ConfigureMigrationJobRequest} extends {@link RequestModel}
 *
 * <p>ConfigureMigrationJobRequest</p>
 */
public class ConfigureMigrationJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationEndpoint")
    private DestinationEndpoint destinationEndpoint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MigrationMode")
    private MigrationMode migrationMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceEndpoint")
    private SourceEndpoint sourceEndpoint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountId")
    private String accountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Checkpoint")
    private String checkpoint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MigrationJobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String migrationJobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MigrationJobName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String migrationJobName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MigrationObject")
    @com.aliyun.core.annotation.Validation(required = true)
    private String migrationObject;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MigrationReserved")
    private String migrationReserved;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private ConfigureMigrationJobRequest(Builder builder) {
        super(builder);
        this.destinationEndpoint = builder.destinationEndpoint;
        this.migrationMode = builder.migrationMode;
        this.sourceEndpoint = builder.sourceEndpoint;
        this.accountId = builder.accountId;
        this.checkpoint = builder.checkpoint;
        this.migrationJobId = builder.migrationJobId;
        this.migrationJobName = builder.migrationJobName;
        this.migrationObject = builder.migrationObject;
        this.migrationReserved = builder.migrationReserved;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigureMigrationJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return destinationEndpoint
     */
    public DestinationEndpoint getDestinationEndpoint() {
        return this.destinationEndpoint;
    }

    /**
     * @return migrationMode
     */
    public MigrationMode getMigrationMode() {
        return this.migrationMode;
    }

    /**
     * @return sourceEndpoint
     */
    public SourceEndpoint getSourceEndpoint() {
        return this.sourceEndpoint;
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return checkpoint
     */
    public String getCheckpoint() {
        return this.checkpoint;
    }

    /**
     * @return migrationJobId
     */
    public String getMigrationJobId() {
        return this.migrationJobId;
    }

    /**
     * @return migrationJobName
     */
    public String getMigrationJobName() {
        return this.migrationJobName;
    }

    /**
     * @return migrationObject
     */
    public String getMigrationObject() {
        return this.migrationObject;
    }

    /**
     * @return migrationReserved
     */
    public String getMigrationReserved() {
        return this.migrationReserved;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<ConfigureMigrationJobRequest, Builder> {
        private DestinationEndpoint destinationEndpoint; 
        private MigrationMode migrationMode; 
        private SourceEndpoint sourceEndpoint; 
        private String accountId; 
        private String checkpoint; 
        private String migrationJobId; 
        private String migrationJobName; 
        private String migrationObject; 
        private String migrationReserved; 
        private String ownerId; 
        private String regionId; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ConfigureMigrationJobRequest request) {
            super(request);
            this.destinationEndpoint = request.destinationEndpoint;
            this.migrationMode = request.migrationMode;
            this.sourceEndpoint = request.sourceEndpoint;
            this.accountId = request.accountId;
            this.checkpoint = request.checkpoint;
            this.migrationJobId = request.migrationJobId;
            this.migrationJobName = request.migrationJobName;
            this.migrationObject = request.migrationObject;
            this.migrationReserved = request.migrationReserved;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * DestinationEndpoint.
         */
        public Builder destinationEndpoint(DestinationEndpoint destinationEndpoint) {
            this.putQueryParameter("DestinationEndpoint", destinationEndpoint);
            this.destinationEndpoint = destinationEndpoint;
            return this;
        }

        /**
         * MigrationMode.
         */
        public Builder migrationMode(MigrationMode migrationMode) {
            this.putQueryParameter("MigrationMode", migrationMode);
            this.migrationMode = migrationMode;
            return this;
        }

        /**
         * SourceEndpoint.
         */
        public Builder sourceEndpoint(SourceEndpoint sourceEndpoint) {
            this.putQueryParameter("SourceEndpoint", sourceEndpoint);
            this.sourceEndpoint = sourceEndpoint;
            return this;
        }

        /**
         * <p>The objects that you want to migrate. The value is a JSON string and can contain regular expressions.</p>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/141227.html">MigrationObject</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>12323344****</p>
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * <p>Specifies whether to perform incremental data migration. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * <blockquote>
         * <p> For more information about databases that support incremental data migration, see <a href="https://help.aliyun.com/document_detail/26618.html">Supported databases and migration types</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        public Builder checkpoint(String checkpoint) {
            this.putQueryParameter("Checkpoint", checkpoint);
            this.checkpoint = checkpoint;
            return this;
        }

        /**
         * <p>system</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>The operation that you want to perform. Set the value to <strong>ConfigureMigrationJob</strong>.</p>
         */
        public Builder migrationJobId(String migrationJobId) {
            this.putQueryParameter("MigrationJobId", migrationJobId);
            this.migrationJobId = migrationJobId;
            return this;
        }

        /**
         * <p>The ID of the region where the data migration instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">List of supported regions</a>.</p>
         * <blockquote>
         * <p> The region ID of the data migration instance is the same as that of the destination database.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL_TO_RDS</p>
         */
        public Builder migrationJobName(String migrationJobName) {
            this.putQueryParameter("MigrationJobName", migrationJobName);
            this.migrationJobName = migrationJobName;
            return this;
        }

        /**
         * <p>Specifies whether to perform schema migration. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * <blockquote>
         * <p> For more information about databases that support schema migration, see <a href="https://help.aliyun.com/document_detail/26618.html">Supported databases and migration types</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;DBName&quot;:&quot;dtstestdata&quot;,&quot;TableIncludes&quot;:[{&quot;TableName&quot;:&quot;customer&quot;}]}]</p>
         */
        public Builder migrationObject(String migrationObject) {
            this.putBodyParameter("MigrationObject", migrationObject);
            this.migrationObject = migrationObject;
            return this;
        }

        /**
         * <p>Specifies whether to perform full data migration. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * <blockquote>
         * <p> For more information about databases that support full data migration, see <a href="https://help.aliyun.com/document_detail/26618.html">Supported databases and migration types</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{     &quot;autoStartModulesAfterConfig&quot;: &quot;none&quot;,     &quot;targetTableMode&quot;: 2 }</p>
         */
        public Builder migrationReserved(String migrationReserved) {
            this.putQueryParameter("MigrationReserved", migrationReserved);
            this.migrationReserved = migrationReserved;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Resource GroupId</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzawhxxc****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public ConfigureMigrationJobRequest build() {
            return new ConfigureMigrationJobRequest(this);
        } 

    } 

    /**
     * 
     * {@link ConfigureMigrationJobRequest} extends {@link TeaModel}
     *
     * <p>ConfigureMigrationJobRequest</p>
     */
    public static class DestinationEndpoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataBaseName")
        private String dataBaseName;

        @com.aliyun.core.annotation.NameInMap("EngineName")
        private String engineName;

        @com.aliyun.core.annotation.NameInMap("IP")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("InstanceID")
        private String instanceID;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("OracleSID")
        private String oracleSID;

        @com.aliyun.core.annotation.NameInMap("Password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private DestinationEndpoint(Builder builder) {
            this.dataBaseName = builder.dataBaseName;
            this.engineName = builder.engineName;
            this.ip = builder.ip;
            this.instanceID = builder.instanceID;
            this.instanceType = builder.instanceType;
            this.oracleSID = builder.oracleSID;
            this.password = builder.password;
            this.port = builder.port;
            this.region = builder.region;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DestinationEndpoint create() {
            return builder().build();
        }

        /**
         * @return dataBaseName
         */
        public String getDataBaseName() {
            return this.dataBaseName;
        }

        /**
         * @return engineName
         */
        public String getEngineName() {
            return this.engineName;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return instanceID
         */
        public String getInstanceID() {
            return this.instanceID;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return oracleSID
         */
        public String getOracleSID() {
            return this.oracleSID;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String dataBaseName; 
            private String engineName; 
            private String ip; 
            private String instanceID; 
            private String instanceType; 
            private String oracleSID; 
            private String password; 
            private String port; 
            private String region; 
            private String userName; 

            /**
             * <p>The region ID of the destination database.</p>
             * <blockquote>
             * <p> If the <strong>DestinationEndpoint.InstanceType</strong> parameter is set to <strong>LocalInstance</strong>, you can enter <strong>cn-hangzhou</strong> or the ID of the region closest to the self-managed database. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">List of supported regions</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>dtstestdatabase</p>
             */
            public Builder dataBaseName(String dataBaseName) {
                this.dataBaseName = dataBaseName;
                return this;
            }

            /**
             * <p>The authorized RAM role of the source instance. You must specify the RAM role only if the source instance and the destination instance belong to different Alibaba Cloud accounts. You can use the RAM role to allow the Alibaba Cloud account that owns the destination instance to access the source instance.</p>
             * <blockquote>
             * <p> For information about the permissions and authorization methods of the RAM role, see <a href="https://help.aliyun.com/document_detail/48468.html">Configure RAM authorization for cross-account data migration and synchronization</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder engineName(String engineName) {
                this.engineName = engineName;
                return this;
            }

            /**
             * <p>The ID of the instance that hosts the destination database.</p>
             * <blockquote>
             * <p> You must specify the instance ID only if the <strong>DestinationEndpoint.InstanceType</strong> parameter is set to <strong>RDS</strong>, <strong>ECS</strong>, <strong>MongoDB</strong>, <strong>Redis</strong>, <strong>DRDS</strong>, <strong>PetaData</strong>, <strong>OceanBase</strong>, <strong>POLARDB</strong>, <strong>PolarDB_o</strong>, <strong>AnalyticDB</strong>, or <strong>Greenplum</strong>. For example, if the DestinationEndpoint.InstanceType parameter is set to <strong>ECS</strong>, you must specify the ID of the ECS instance.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>172.16.88.***</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the source instance belongs.</p>
             * <blockquote>
             * <p> You must specify this parameter only when you configure data migration across different Alibaba Cloud accounts.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>rm-bp1r46452ai50****</p>
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * <p>The password of the source database account.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>RDS</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The reserved parameter of DTS. The value is a JSON string. You can specify this parameter to meet special requirements, for example, whether to automatically start a precheck. For more information, see <a href="https://help.aliyun.com/document_detail/176470.html">MigrationReserved</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>testsid</p>
             */
            public Builder oracleSID(String oracleSID) {
                this.oracleSID = oracleSID;
                return this;
            }

            /**
             * <p>The service port number of the destination database.</p>
             * <blockquote>
             * <p> You must specify the service port number only if the <strong>DestinationEndpoint.InstanceType</strong> parameter is set to <strong>ECS</strong>, <strong>LocalInstance</strong>, or <strong>Express</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Test123456</p>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * <p>The engine type of the destination database. Valid values: <strong>MySQL</strong>, <strong>DRDS</strong>, <strong>SQLServer</strong>, <strong>PostgreSQL</strong>, <strong>PPAS</strong>, <strong>MongoDB</strong>, <strong>Redis</strong>, <strong>POLARDB</strong>, and <strong>polardb_pg</strong>.</p>
             * <blockquote>
             * <p> You must specify the engine type only if the <strong>DestinationEndpoint.InstanceType</strong> parameter is set to <strong>RDS</strong>, <strong>POLARDB</strong>, <strong>ECS</strong>, <strong>LocalInstance</strong>, or <strong>Express</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The instance type of the destination database. Valid values:</p>
             * <ul>
             * <li><strong>ECS</strong>: self-managed database that is hosted on Elastic Compute Service (ECS)</li>
             * <li><strong>LocalInstance</strong>: self-managed database with a public IP address</li>
             * <li><strong>RDS</strong>: ApsaraDB RDS instance</li>
             * <li><strong>DRDS</strong>: PolarDB-X instance</li>
             * <li><strong>MongoDB</strong>: ApsaraDB for MongoDB instance</li>
             * <li><strong>Redis</strong>: ApsaraDB for Redis instance</li>
             * <li><strong>PetaData</strong>: HybridDB for MySQL instance</li>
             * <li><strong>POLARDB</strong>: PolarDB for MySQL cluster or PolarDB for PostgreSQL cluster</li>
             * <li><strong>PolarDB_o</strong>: PolarDB O Edition cluster</li>
             * <li><strong>AnalyticDB</strong>: AnalyticDB for MySQL cluster V3.0 or V2.0</li>
             * <li><strong>Greenplum</strong>: AnalyticDB for PostgreSQL instance</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The endpoint of the destination database.</p>
             * <blockquote>
             * <p> You must specify the endpoint only if the <strong>DestinationEndpoint.InstanceType</strong> parameter is set to <strong>LocalInstance</strong> or <strong>Express</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>dtstestaccount</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public DestinationEndpoint build() {
                return new DestinationEndpoint(this);
            } 

        } 

    }
    /**
     * 
     * {@link ConfigureMigrationJobRequest} extends {@link TeaModel}
     *
     * <p>ConfigureMigrationJobRequest</p>
     */
    public static class MigrationMode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataIntialization")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean dataIntialization;

        @com.aliyun.core.annotation.NameInMap("DataSynchronization")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean dataSynchronization;

        @com.aliyun.core.annotation.NameInMap("StructureIntialization")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean structureIntialization;

        private MigrationMode(Builder builder) {
            this.dataIntialization = builder.dataIntialization;
            this.dataSynchronization = builder.dataSynchronization;
            this.structureIntialization = builder.structureIntialization;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MigrationMode create() {
            return builder().build();
        }

        /**
         * @return dataIntialization
         */
        public Boolean getDataIntialization() {
            return this.dataIntialization;
        }

        /**
         * @return dataSynchronization
         */
        public Boolean getDataSynchronization() {
            return this.dataSynchronization;
        }

        /**
         * @return structureIntialization
         */
        public Boolean getStructureIntialization() {
            return this.structureIntialization;
        }

        public static final class Builder {
            private Boolean dataIntialization; 
            private Boolean dataSynchronization; 
            private Boolean structureIntialization; 

            /**
             * <p>The database account of the destination database.</p>
             * <blockquote>
             * <p> The permissions that are required for database accounts vary with the migration scenario. For more information, see <a href="https://help.aliyun.com/document_detail/26618.html">Overview of data migration scenarios</a>.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder dataIntialization(Boolean dataIntialization) {
                this.dataIntialization = dataIntialization;
                return this;
            }

            /**
             * <p>The password of the destination database account.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder dataSynchronization(Boolean dataSynchronization) {
                this.dataSynchronization = dataSynchronization;
                return this;
            }

            /**
             * <p>The name of the destination database or the authentication database.</p>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li>You must specify the database name only if the <strong>DestinationEndpoint.EngineName</strong> parameter is set to <strong>PostgreSQL</strong>, <strong>DRDS</strong>, or <strong>MongoDB</strong>.</li>
             * <li>If the <strong>DestinationEndpoint.EngineName</strong> parameter is set to <strong>PostgreSQL</strong> or <strong>DRDS</strong>, specify the name of the destination database. If the DestinationEndpoint.EngineName parameter is set to <strong>MongoDB</strong>, specify the name of the authentication database.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder structureIntialization(Boolean structureIntialization) {
                this.structureIntialization = structureIntialization;
                return this;
            }

            public MigrationMode build() {
                return new MigrationMode(this);
            } 

        } 

    }
    /**
     * 
     * {@link ConfigureMigrationJobRequest} extends {@link TeaModel}
     *
     * <p>ConfigureMigrationJobRequest</p>
     */
    public static class SourceEndpoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatabaseName")
        private String databaseName;

        @com.aliyun.core.annotation.NameInMap("EngineName")
        private String engineName;

        @com.aliyun.core.annotation.NameInMap("IP")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("InstanceID")
        private String instanceID;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("OracleSID")
        private String oracleSID;

        @com.aliyun.core.annotation.NameInMap("OwnerID")
        private String ownerID;

        @com.aliyun.core.annotation.NameInMap("Password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private SourceEndpoint(Builder builder) {
            this.databaseName = builder.databaseName;
            this.engineName = builder.engineName;
            this.ip = builder.ip;
            this.instanceID = builder.instanceID;
            this.instanceType = builder.instanceType;
            this.oracleSID = builder.oracleSID;
            this.ownerID = builder.ownerID;
            this.password = builder.password;
            this.port = builder.port;
            this.region = builder.region;
            this.role = builder.role;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceEndpoint create() {
            return builder().build();
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return engineName
         */
        public String getEngineName() {
            return this.engineName;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return instanceID
         */
        public String getInstanceID() {
            return this.instanceID;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return oracleSID
         */
        public String getOracleSID() {
            return this.oracleSID;
        }

        /**
         * @return ownerID
         */
        public String getOwnerID() {
            return this.ownerID;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String databaseName; 
            private String engineName; 
            private String ip; 
            private String instanceID; 
            private String instanceType; 
            private String oracleSID; 
            private String ownerID; 
            private String password; 
            private String port; 
            private String region; 
            private String role; 
            private String userName; 

            /**
             * <p>The endpoint of the source database.</p>
             * <blockquote>
             * <p> You must specify the endpoint only if the <strong>SourceEndpoint.InstanceType</strong> parameter is set to <strong>LocalInstance</strong> or <strong>Express</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>dtstestdatabase</p>
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * <p>The instance type of the source database. Valid values:</p>
             * <ul>
             * <li><strong>RDS</strong>: ApsaraDB RDS instance</li>
             * <li><strong>ECS</strong>: self-managed database that is hosted on ECS</li>
             * <li><strong>LocalInstance</strong>: self-managed database with a public IP address</li>
             * <li><strong>Express</strong>: self-managed database that is connected over Express Connect, VPN Gateway, or Smart Access Gateway</li>
             * <li><strong>dg</strong>: self-managed database that is connected over Database Gateway</li>
             * <li><strong>cen</strong>: self-managed database that is connected over Cloud Enterprise Network (CEN)</li>
             * <li><strong>MongoDB</strong>: ApsaraDB for MongoDB instance</li>
             * <li><strong>POLARDB</strong>: PolarDB for MySQL cluster or PolarDB for PostgreSQL cluster</li>
             * <li><strong>PolarDB_o</strong>: PolarDB O Edition cluster</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder engineName(String engineName) {
                this.engineName = engineName;
                return this;
            }

            /**
             * <p>rm-bp1i99e8l7913****</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.88.***</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>dtsl3m1213ye7l****</p>
             * 
             * <strong>example:</strong>
             * <p>The name of the data migration task. The name can be up to 32 characters in length. We recommend that you specify an informative name to identify the task. You do not need to use a unique task name.</p>
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * <p>The ID of the data migration instance. You can call the <strong>DescribeMigrationJobs</strong> operation to query the instance ID.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>RDS</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The region ID of the source database.</p>
             * <blockquote>
             * <p> If the <strong>SourceEndpoint.InstanceType</strong> parameter is set to <strong>LocalInstance</strong>, you can enter <strong>cn-hangzhou</strong> or the ID of the region closest to the self-managed database. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">List of supported regions</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>testsid</p>
             */
            public Builder oracleSID(String oracleSID) {
                this.oracleSID = oracleSID;
                return this;
            }

            /**
             * <p>The name of the source database or the authentication database.</p>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li>You must specify the database name only if the <strong>SourceEndpoint.EngineName</strong> parameter is set to <strong>PostgreSQL</strong> or <strong>MongoDB</strong>.</li>
             * <li>If the <strong>SourceEndpoint.EngineName</strong> parameter is set to <strong>PostgreSQL</strong>, specify the name of the source database. If the SourceEndpoint.EngineName parameter is set to <strong>MongoDB</strong>, specify the name of the authentication database.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>140692647406****</p>
             */
            public Builder ownerID(String ownerID) {
                this.ownerID = ownerID;
                return this;
            }

            /**
             * <p>The system ID (SID) of the Oracle database.</p>
             * <blockquote>
             * <p> You must specify this parameter only if the <strong>SourceEndpoint.EngineName</strong> parameter is set to <strong>Oracle</strong> and the <strong>Oracle</strong> database is deployed in a non-RAC architecture.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Test123456</p>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * <p>The engine type of the source database. Valid values: <strong>MySQL</strong>, <strong>TiDB</strong>, <strong>SQLServer</strong>, <strong>PostgreSQL</strong>, <strong>Oracle</strong>, <strong>MongoDB</strong>, <strong>Redis</strong>, <strong>POLARDB</strong>, and <strong>polardb_pg</strong>.</p>
             * <blockquote>
             * <p> You must specify the engine type only if the <strong>DestinationEndpoint.InstanceType</strong> parameter is set to <strong>RDS</strong>, <strong>POLARDB</strong>, <strong>ECS</strong>, <strong>LocalInstance</strong>, or <strong>Express</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The ID of the instance that hosts the source database.</p>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li>You must specify the instance ID only if the <strong>SourceEndpoint.InstanceType</strong> parameter is set to <strong>RDS</strong>, <strong>ECS</strong>, <strong>Express</strong>, <strong>MongoDB</strong>, <strong>POLARDB</strong>, or <strong>PolarDB_o</strong>. For example, if the SourceEndpoint.InstanceType parameter is set to <strong>ECS</strong>, you must specify the ID of the ECS instance.</li>
             * <li>If the <strong>SourceEndpoint.InstanceType</strong> parameter is set to <strong>Express</strong>, you must specify the ID of the virtual private cloud (VPC).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The database account of the source database.</p>
             * <blockquote>
             * <p> The permissions that are required for database accounts vary with the migration scenario. For more information, see <a href="https://help.aliyun.com/document_detail/26618.html">Overview of data migration scenarios</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>ram-for-dts</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>The service port number of the source database.</p>
             * <blockquote>
             * <p> You must specify the service port number only if the <strong>SourceEndpoint.InstanceType</strong> parameter is set to <strong>ECS</strong>, <strong>LocalInstance</strong>, or <strong>Express</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>dtstestaccount</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public SourceEndpoint build() {
                return new SourceEndpoint(this);
            } 

        } 

    }
}
