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
         * <p>The ID of the Alibaba Cloud account. You do not need to specify this parameter. This parameter is pending deprecation.</p>
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
         * <p>The start checkpoint for incremental data migration. The value is a UNIX timestamp in seconds.</p>
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
         * <p>The ID of the data migration instance. You can call the <strong>DescribeMigrationJobs</strong> operation to query the instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dtsxxxxxxxx</p>
         */
        public Builder migrationJobId(String migrationJobId) {
            this.putQueryParameter("MigrationJobId", migrationJobId);
            this.migrationJobId = migrationJobId;
            return this;
        }

        /**
         * <p>The name of the migration task. The name can be up to 32 characters in length. Specify a descriptive name for easy identification. The name does not need to be unique.</p>
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
         * <p>The objects to be migrated. The value is a JSON string and supports specific regular expressions. For more information, see <a href="~141901~">Configure migration objects</a>.</p>
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
         * <p>The reserved parameters of DTS. The value is a JSON string. You can specify this parameter to meet specific requirements, such as specifying whether to automatically start a precheck. For more information, see <a href="https://help.aliyun.com/document_detail/176470.html">MigrationReserved parameter description</a>.</p>
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
         * <p>The ID of the region where the data migration instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
         * <blockquote>
         * <p>The region ID must be the same as the region ID of the destination database.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
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

            private Builder() {
            } 

            private Builder(DestinationEndpoint model) {
                this.dataBaseName = model.dataBaseName;
                this.engineName = model.engineName;
                this.ip = model.ip;
                this.instanceID = model.instanceID;
                this.instanceType = model.instanceType;
                this.oracleSID = model.oracleSID;
                this.password = model.password;
                this.port = model.port;
                this.region = model.region;
                this.userName = model.userName;
            } 

            /**
             * <p>The name of the destination database or the authentication database. </p>
             * <blockquote>
             * <ul>
             * <li>This parameter is available and required only when <strong>DestinationEndpoint.EngineName</strong> is set to <strong>PostgreSQL</strong>, <strong>DRDS</strong>, or <strong>MongoDB</strong>.</li>
             * </ul>
             * </blockquote>
             * <ul>
             * <li>When <strong>DestinationEndpoint.EngineName</strong> is set to <strong>PostgreSQL</strong> or <strong>DRDS</strong>, specify the name of the database to be migrated. When it is set to <strong>MongoDB</strong>, specify the name of the authentication database for the database account.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>dtstestdatabase</p>
             */
            public Builder dataBaseName(String dataBaseName) {
                this.dataBaseName = dataBaseName;
                return this;
            }

            /**
             * <p>The database engine of the destination database. Valid values: <strong>MySQL</strong>, <strong>DRDS</strong>, <strong>SQLServer</strong>, <strong>PostgreSQL</strong>, <strong>PPAS</strong>, <strong>MongoDB</strong>, <strong>Redis</strong>, <strong>POLARDB</strong>, and <strong>polardb_pg</strong>.</p>
             * <blockquote>
             * <p>This parameter is available and required only when <strong>DestinationEndpoint.InstanceType</strong> is set to <strong>RDS</strong>, <strong>POLARDB</strong>, <strong>ECS</strong>, <strong>LocalInstance</strong>, or <strong>Express</strong>.</p>
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
             * <p>The endpoint of the destination database.</p>
             * <blockquote>
             * <p>This parameter is available and required only when <strong>DestinationEndpoint.InstanceType</strong> is set to <strong>LocalInstance</strong> or <strong>Express</strong>.</p>
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
             * <p>The ID of the destination instance.</p>
             * <blockquote>
             * <p>This parameter is available and required only when <strong>DestinationEndpoint.InstanceType</strong> is set to <strong>RDS</strong>, <strong>ECS</strong>, <strong>MongoDB</strong>, <strong>Redis</strong>, <strong>DRDS</strong>, <strong>PetaData</strong>, <strong>OceanBase</strong>, <strong>POLARDB</strong>, <strong>PolarDB_o</strong>, <strong>AnalyticDB</strong>, or <strong>Greenplum</strong>. You must specify the corresponding instance ID. For example, if the value is <strong>ECS</strong>, specify the ID of the ECS instance.</p>
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
             * <p>The instance type of the destination database. Valid values:</p>
             * <ul>
             * <li><strong>ECS</strong>: Self-managed database hosted on ECS.</li>
             * <li><strong>LocalInstance</strong>: Self-managed database with a public IP address.</li>
             * <li><strong>RDS</strong>: ApsaraDB RDS instance.</li>
             * <li><strong>DRDS</strong>: PolarDB-X instance.</li>
             * <li><strong>MongoDB</strong>: ApsaraDB for MongoDB instance.</li>
             * <li><strong>Redis</strong>: ApsaraDB for Redis instance.</li>
             * <li><strong>PetaData</strong>: HybridDB for MySQL instance.</li>
             * <li><strong>POLARDB</strong>: PolarDB for MySQL or PolarDB for PostgreSQL cluster.</li>
             * <li><strong>PolarDB_o</strong>: PolarDB for Oracle cluster.</li>
             * <li><strong>AnalyticDB</strong>: AnalyticDB for MySQL 3.0 or 2.0 cluster.</li>
             * <li><strong>Greenplum</strong>: AnalyticDB for PostgreSQL cluster.</li>
             * </ul>
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
             * <p>The SID of the Oracle database.</p>
             * <blockquote>
             * <p>This parameter is available and required only when <strong>DestinationEndpoint.EngineName</strong> is set to <strong>Oracle</strong> and the Oracle database is a non-Real Application Cluster instance.</p>
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
             * <p>The password of the destination database account.</p>
             * 
             * <strong>example:</strong>
             * <p>Test123456</p>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * <p>The service port number of the destination database.</p>
             * <blockquote>
             * <p>This parameter is available and required only when <strong>DestinationEndpoint.InstanceType</strong> is set to <strong>ECS</strong>, <strong>LocalInstance</strong>, or <strong>Express</strong>.</p>
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
             * <p>The ID of the region where the destination database resides.</p>
             * <blockquote>
             * <p>When <strong>DestinationEndpoint.InstanceType</strong> is set to <strong>LocalInstance</strong>, you can specify <strong>cn-hangzhou</strong> or the ID of the region that is closest to your self-managed database. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The database account of the destination database.</p>
             * <p>Note: The required permissions vary based on the database engine. For more information, see the corresponding configuration examples in the migration overview.</p>
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

            private Builder() {
            } 

            private Builder(MigrationMode model) {
                this.dataIntialization = model.dataIntialization;
                this.dataSynchronization = model.dataSynchronization;
                this.structureIntialization = model.structureIntialization;
            } 

            /**
             * <p>Specifies whether to perform full data migration. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Yes.</li>
             * <li><strong>false</strong>: No.</li>
             * </ul>
             * <blockquote>
             * <p>The support for full data migration varies based on the database engine. For more information, see <a href="https://help.aliyun.com/document_detail/26618.html">Supported databases and migration types</a>.</p>
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
             * <p>Specifies whether to perform incremental data migration. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Yes.</li>
             * <li><strong>false</strong>: No.</li>
             * </ul>
             * <blockquote>
             * <p>The support for incremental data migration varies based on the database engine. For more information, see <a href="https://help.aliyun.com/document_detail/26618.html">Supported databases and migration types</a>.</p>
             * </blockquote>
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
             * <p>Specifies whether to perform schema migration. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Yes.</li>
             * <li><strong>false</strong>: No.</li>
             * </ul>
             * <blockquote>
             * <p>The support for schema migration varies based on the database engine. For more information, see <a href="https://help.aliyun.com/document_detail/26618.html">Supported databases and migration types</a>.</p>
             * </blockquote>
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

            private Builder() {
            } 

            private Builder(SourceEndpoint model) {
                this.databaseName = model.databaseName;
                this.engineName = model.engineName;
                this.ip = model.ip;
                this.instanceID = model.instanceID;
                this.instanceType = model.instanceType;
                this.oracleSID = model.oracleSID;
                this.ownerID = model.ownerID;
                this.password = model.password;
                this.port = model.port;
                this.region = model.region;
                this.role = model.role;
                this.userName = model.userName;
            } 

            /**
             * <p>The name of the database to be migrated or the authentication database.</p>
             * <blockquote>
             * <ul>
             * <li>This parameter is available and required only when <strong>SourceEndpoint.EngineName</strong> is set to <strong>PostgreSQL</strong> or <strong>MongoDB</strong>.</li>
             * </ul>
             * </blockquote>
             * <ul>
             * <li>When <strong>SourceEndpoint.EngineName</strong> is set to <strong>PostgreSQL</strong>, specify the name of the database to be migrated. When it is set to <strong>MongoDB</strong>, specify the name of the authentication database for the database account.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>dtstestdatabase</p>
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * <p>The database engine of the source database. Valid values: <strong>MySQL</strong>, <strong>TiDB</strong>, <strong>SQLServer</strong>, <strong>PostgreSQL</strong>, <strong>Oracle</strong>, <strong>MongoDB</strong>, <strong>Redis</strong>, <strong>POLARDB</strong>, and <strong>polardb_pg</strong>.</p>
             * <blockquote>
             * <p>This parameter is available and required only when <strong>DestinationEndpoint.InstanceType</strong> is set to <strong>RDS</strong>, <strong>POLARDB</strong>, <strong>ECS</strong>, <strong>LocalInstance</strong>, or <strong>Express</strong>.</p>
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
             * <p>The endpoint of the source database.</p>
             * <blockquote>
             * <p>This parameter is available and required only when <strong>SourceEndpoint.InstanceType</strong> is set to <strong>LocalInstance</strong> or <strong>Express</strong>.</p>
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
             * <p>The ID of the source instance.</p>
             * <blockquote>
             * <ul>
             * <li>This parameter is available and required only when <strong>SourceEndpoint.InstanceType</strong> is set to <strong>RDS</strong>, <strong>ECS</strong>, <strong>Express</strong>, <strong>MongoDB</strong>, <strong>POLARDB</strong>, or <strong>PolarDB_o</strong>. You must specify the corresponding instance ID. For example, if the value is <strong>ECS</strong>, specify the ID of the ECS instance.</li>
             * </ul>
             * </blockquote>
             * <ul>
             * <li>When <strong>SourceEndpoint.InstanceType</strong> is set to <strong>Express</strong>, specify the VPC ID.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>bp-rmxxxxxxxx</p>
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * <p>The instance type of the source database. Valid values:</p>
             * <ul>
             * <li><strong>RDS</strong>: ApsaraDB RDS instance.</li>
             * <li><strong>ECS</strong>: Self-managed database hosted on Elastic Compute Service (ECS).</li>
             * <li><strong>LocalInstance</strong>: Self-managed database with a public IP address.</li>
             * <li><strong>Express</strong>: Self-managed database connected over Express Connect, VPN Gateway, or Smart Access Gateway.</li>
             * <li><strong>dg</strong>: Self-managed database connected over Database Gateway.</li>
             * <li><strong>cen</strong>: Self-managed database connected over Cloud Enterprise Network (CEN).</li>
             * <li><strong>MongoDB</strong>: ApsaraDB for MongoDB instance.</li>
             * <li><strong>POLARDB</strong>: PolarDB for MySQL or PolarDB for PostgreSQL cluster.</li>
             * <li><strong>PolarDB_o</strong>: PolarDB for Oracle cluster.</li>
             * </ul>
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
             * <p>The system ID (SID) of the Oracle database.</p>
             * <blockquote>
             * <p>This parameter is available and required only when <strong>SourceEndpoint.EngineName</strong> is set to <strong>Oracle</strong> and the Oracle database is a non-Real Application Cluster instance.</p>
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
             * <p>The Alibaba Cloud account ID to which the source instance belongs.</p>
             * <blockquote>
             * <p>This parameter is active and required only when you configure a cross-account data migration task.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>140692647406****</p>
             */
            public Builder ownerID(String ownerID) {
                this.ownerID = ownerID;
                return this;
            }

            /**
             * <p>The password of the source database account.</p>
             * 
             * <strong>example:</strong>
             * <p>Test123456</p>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * <p>The service port number of the source database.</p>
             * <blockquote>
             * <p>This parameter is available and required only when <strong>SourceEndpoint.InstanceType</strong> is set to <strong>ECS</strong>, <strong>LocalInstance</strong>, or <strong>Express</strong>.</p>
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
             * <p>The ID of the region where the source database resides.</p>
             * <blockquote>
             * <p>When <strong>SourceEndpoint.InstanceType</strong> is set to <strong>LocalInstance</strong>, you can specify <strong>cn-hangzhou</strong> or the ID of the region that is closest to your self-managed database. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The RAM role that is authorized to the destination Alibaba Cloud account to access the source instance. This parameter is required when the source and destination instances belong to different Alibaba Cloud accounts.</p>
             * <blockquote>
             * <p>For more information about the required permissions and authorization method, see <a href="https://help.aliyun.com/document_detail/48468.html">Configure RAM authorization for cross-account data migration or synchronization</a>.</p>
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
             * <p>The database account of the source database.</p>
             * <p>Note: The required permissions vary based on the database engine. For more information, see the corresponding configuration examples in the migration overview.</p>
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
