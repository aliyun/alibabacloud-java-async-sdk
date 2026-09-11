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
         * <p>The Alibaba Cloud account ID. You do not need to specify this parameter because it will be deprecated.</p>
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
         * <p>The start position of incremental data migration. The value is a UNIX timestamp in seconds.</p>
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
         * <p>The name of the migration task. The name can be up to 32 characters in length. Specify a descriptive name for easy identification. Uniqueness is not required.</p>
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
         * <p>The objects to be migrated. The value is a JSON string that supports regular expressions. For more information, see <a href="~141901~">Migration object configuration</a>.</p>
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
         * <p>The reserved parameter of DTS. The value is a JSON string. You can specify this parameter to meet special requirements, such as whether to automatically start the precheck. For more information, see <a href="https://help.aliyun.com/document_detail/176470.html">MigrationReserved parameter description</a>.</p>
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
         * <p>The region ID of the data migration instance. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
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
         * <p>The resource group ID.</p>
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
             * <p>待迁入的数据库名称或鉴权数据库名称。 </p>
             * <blockquote>
             * <ul>
             * <li>当<strong>DestinationEndpoint.EngineName</strong>取值为<strong>PostgreSQL</strong>、<strong>DRDS</strong>或<strong>MongoDB</strong>时，本参数才可用且必须传入。</li>
             * </ul>
             * </blockquote>
             * <ul>
             * <li>当<strong>DestinationEndpoint.EngineName</strong>取值为<strong>PostgreSQL</strong>或<strong>DRDS</strong>时，传入待迁移的数据库名称；取值为<strong>MongoDB</strong>时，传入数据库账号的鉴权数据库名称。</li>
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
             * <p>目标库的数据库类型。取值：<strong>MySQL</strong>、<strong>DRDS</strong>、<strong>SQLServer</strong>、<strong>PostgreSQL</strong>、<strong>PPAS</strong>、<strong>MongoDB</strong>、<strong>Redis</strong>、<strong>POLARDB</strong>、<strong>polardb_pg</strong></p>
             * <blockquote>
             * <p>当<strong>DestinationEndpoint.InstanceType</strong>取值为<strong>RDS</strong>、<strong>POLARDB</strong>、<strong>ECS</strong>、<strong>LocalInstance</strong>或<strong>Express</strong>时，本参数才可用且必须传入。</p>
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
             * <p>目标库的连接地址。</p>
             * <blockquote>
             * <p>当<strong>DestinationEndpoint.InstanceType</strong>取值为<strong>LocalInstance</strong>或<strong>Express</strong>时，本参数才可用且必须传入。</p>
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
             * <p>目标实例ID。</p>
             * <blockquote>
             * <p>当<strong>DestinationEndpoint.InstanceType</strong>取值为<strong>RDS</strong>、<strong>ECS</strong>、<strong>MongoDB</strong>、<strong>Redis</strong>、<strong>DRDS</strong>、<strong>PetaData</strong>、<strong>OceanBase</strong>、<strong>POLARDB</strong>、<strong>PolarDB_o</strong>、<strong>AnalyticDB</strong>或<strong>Greenplum</strong>时，本参数才可用且必须传入对应的实例ID（例如取值为<strong>ECS</strong>，则需要传入ECS实例ID）。</p>
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
             * <p>目标库的实例类型，取值：</p>
             * <ul>
             * <li><strong>ECS</strong>：ECS上的自建数据库。</li>
             * <li><strong>LocalInstance</strong>：有公网IP的自建数据库。</li>
             * <li><strong>RDS</strong>：阿里云RDS实例。</li>
             * <li><strong>DRDS</strong>：阿里云PolarDB-X实例。</li>
             * <li><strong>MongoDB</strong>：阿里云MongoDB实例。</li>
             * <li><strong>Redis</strong>：阿里云Redis实例。</li>
             * <li><strong>PetaData</strong>：阿里云HybridDB for MySQL实例。</li>
             * <li><strong>POLARDB</strong>：阿里云PolarDB MySQL、PolarDB PostgreSQL。</li>
             * <li><strong>PolarDB_o</strong>：阿里云PolarDB O引擎集群。</li>
             * <li><strong>AnalyticDB</strong>：阿里云云原生数据仓库AnalyticDB MySQL 3.0和2.0版本。</li>
             * <li><strong>Greenplum</strong>：阿里云云原生数据仓库AnalyticDB PostgreSQL。</li>
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
             * <p>Oracle数据库的SID信息。</p>
             * <blockquote>
             * <p>当<strong>DestinationEndpoint.EngineName</strong>取值为<strong>Oracle</strong>，且<strong>Oracle</strong>数据库为非RAC实例时，本参数才可用且必须传入。</p>
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
             * <p>目标库数据库账号的密码。</p>
             * 
             * <strong>example:</strong>
             * <p>Test123456</p>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * <p>目标库的服务端口。</p>
             * <blockquote>
             * <p>当<strong>DestinationEndpoint.InstanceType</strong>取值为<strong>ECS</strong>、<strong>LocalInstance</strong>或<strong>Express</strong>时，本参数才可用且必须传入。</p>
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
             * <p>目标库所属的地域ID。</p>
             * <blockquote>
             * <p>当<strong>DestinationEndpoint.InstanceType</strong>取值为<strong>LocalInstance</strong>时，您可以传入<strong>cn-hangzhou</strong>或者离自建数据库地物理距离最近的地域ID，详情请参见<a href="https://help.aliyun.com/document_detail/141033.html">支持的地域列表</a>。</p>
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
             * <p>目标库的数据库账号。</p>
             * <p>说明 迁移不同的数据库所需的权限有所差异，详情请参见迁移方案概览中对应的配置案例。</p>
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
             * <p>是否进行全量数据迁移，取值：</p>
             * <ul>
             * <li><strong>true</strong>：是。</li>
             * <li><strong>false</strong>：否。</li>
             * </ul>
             * <blockquote>
             * <p>DTS对全量数据迁移的支持情况因数据库类型不同而有所差异，详情请参见<a href="https://help.aliyun.com/document_detail/26618.html">支持的数据库和迁移类型</a>。</p>
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
             * <p>是否进行增量数据迁移，取值：</p>
             * <ul>
             * <li><strong>true</strong>：是。</li>
             * <li><strong>false</strong>：否。</li>
             * </ul>
             * <blockquote>
             * <p>DTS对增量数据迁移的支持情况因数据库类型不同而有所差异，详情请参见<a href="https://help.aliyun.com/document_detail/26618.html">支持的数据库和迁移类型</a>。</p>
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
             * <p>是否进行结构迁移，取值：</p>
             * <ul>
             * <li><strong>true</strong>：是。</li>
             * <li><strong>false</strong>：否。</li>
             * </ul>
             * <blockquote>
             * <p>DTS对结构迁移的支持情况因数据库类型不同而有所差异，详情请参见<a href="https://help.aliyun.com/document_detail/26618.html">支持的数据库和迁移类型</a>。</p>
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
             * <p>待迁移的数据库名称或鉴权数据库名称。</p>
             * <blockquote>
             * <ul>
             * <li>当<strong>SourceEndpoint.EngineName</strong>取值为<strong>PostgreSQL</strong>或<strong>MongoDB</strong>时，本参数才可用且必须传入。</li>
             * </ul>
             * </blockquote>
             * <ul>
             * <li>当<strong>SourceEndpoint.EngineName</strong>取值为<strong>PostgreSQL</strong>时，传入待迁移的数据库名称；取值为<strong>MongoDB</strong>时，传入数据库账号的鉴权数据库名称。</li>
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
             * <p>源库的数据库类型，取值：<strong>MySQL</strong>、<strong>TiDB</strong>、<strong>SQLServer</strong>、<strong>PostgreSQL</strong>、<strong>Oracle</strong>、<strong>MongoDB</strong>、<strong>Redis</strong>、<strong>POLARDB</strong>、<strong>polardb_pg</strong>。</p>
             * <blockquote>
             * <p>当<strong>DestinationEndpoint.InstanceType</strong>取值为<strong>RDS</strong>、<strong>POLARDB</strong>、<strong>ECS</strong>、<strong>LocalInstance</strong>或<strong>Express</strong>时，本参数才可用且必须传入。</p>
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
             * <p>源库的连接地址。</p>
             * <blockquote>
             * <p>当<strong>SourceEndpoint.InstanceType</strong>取值为<strong>LocalInstance</strong>或<strong>Express</strong>时，本参数才可用且必须传入。</p>
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
             * <p>源库的实例ID。</p>
             * <blockquote>
             * <ul>
             * <li>当<strong>SourceEndpoint.InstanceType</strong>取值为<strong>RDS</strong>、<strong>ECS</strong>、<strong>Express</strong>、<strong>MongoDB</strong>、<strong>POLARDB</strong>或<strong>PolarDB_o</strong>时，本参数才可用且必须传入对应的实例ID（例如取值为<strong>ECS</strong>，则本参数传入ECS实例的ID）。</li>
             * </ul>
             * </blockquote>
             * <ul>
             * <li>当<strong>SourceEndpoint.InstanceType</strong>取值为<strong>Express</strong>时，本参数传入VPC ID（即专有网络ID）。</li>
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
             * <p>源库的实例类型，取值：</p>
             * <ul>
             * <li><strong>RDS</strong>：阿里云RDS实例。</li>
             * <li><strong>ECS</strong>：ECS上的自建数据库。</li>
             * <li><strong>LocalInstance</strong>：有公网IP的自建数据库。</li>
             * <li><strong>Express</strong>：通过专线/VPN网关/智能接入网关接入的自建数据库。</li>
             * <li><strong>dg</strong>：通过数据库网关DG接入的自建数据库。</li>
             * <li><strong>cen</strong>：通过云企业网CEN接入的自建数据库。</li>
             * <li><strong>MongoDB</strong>：阿里云MongoDB实例。</li>
             * <li><strong>POLARDB</strong>：阿里云PolarDB MySQL、PolarDB PostgreSQL。</li>
             * <li><strong>PolarDB_o</strong>：阿里云PolarDB O引擎集群。</li>
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
             * <p>Oracle数据库的SID信息。</p>
             * <blockquote>
             * <p>当<strong>SourceEndpoint.EngineName</strong>取值为<strong>Oracle</strong>，且Oracle数据库为非RAC实例时，本参数才可用且必须传入。</p>
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
             * <p>源实例所属的阿里云账号ID。</p>
             * <blockquote>
             * <p>仅在配置跨阿里云账号的数据迁移时本参数才可用，且必须传入。</p>
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
             * <p>源库数据库账号对应的密码。</p>
             * 
             * <strong>example:</strong>
             * <p>Test123456</p>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * <p>源库的服务端口。</p>
             * <blockquote>
             * <p>当<strong>SourceEndpoint.InstanceType</strong>取值为<strong>ECS</strong>、<strong>LocalInstance</strong>或<strong>Express</strong>时，本参数才可用且必须传入。</p>
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
             * <p>源库所属的地域ID。</p>
             * <blockquote>
             * <p>当<strong>SourceEndpoint.InstanceType</strong>取值为<strong>LocalInstance</strong>时，您可以传入<strong>cn-hangzhou</strong>或者离自建数据库地物理距离最近的地域ID，详情请参见<a href="https://help.aliyun.com/document_detail/141033.html">支持的地域列表</a>。</p>
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
             * <p>当源实例与目标实例所属阿里云账号不同时，需传入该参数，来指定源实例的授权角色，以允许目标实例阿里云账号访问源实例的实例信息。</p>
             * <blockquote>
             * <p>角色所需的权限及授权方式，请参见<a href="https://help.aliyun.com/document_detail/48468.html">跨阿里云账号数据迁移或同步时如何配置RAM授权</a>。</p>
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
             * <p>源库的数据库账号。</p>
             * <p>说明 迁移不同的数据库所需的权限有所差异，详情请参见迁移方案概览中对应的配置案例。</p>
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
