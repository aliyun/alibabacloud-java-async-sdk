// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigureSynchronizationJobRequest} extends {@link RequestModel}
 *
 * <p>ConfigureSynchronizationJobRequest</p>
 */
public class ConfigureSynchronizationJobRequest extends Request {
    @Query
    @NameInMap("DestinationEndpoint")
    private DestinationEndpoint destinationEndpoint;

    @Query
    @NameInMap("PartitionKey")
    private PartitionKey partitionKey;

    @Query
    @NameInMap("SourceEndpoint")
    private SourceEndpoint sourceEndpoint;

    @Query
    @NameInMap("AccountId")
    private String accountId;

    @Query
    @NameInMap("Checkpoint")
    private String checkpoint;

    @Query
    @NameInMap("DataInitialization")
    @Validation(required = true)
    private Boolean dataInitialization;

    @Query
    @NameInMap("MigrationReserved")
    private String migrationReserved;

    @Query
    @NameInMap("OwnerId")
    private String ownerId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("StructureInitialization")
    @Validation(required = true)
    private Boolean structureInitialization;

    @Query
    @NameInMap("SynchronizationDirection")
    private String synchronizationDirection;

    @Query
    @NameInMap("SynchronizationJobId")
    @Validation(required = true)
    private String synchronizationJobId;

    @Query
    @NameInMap("SynchronizationJobName")
    private String synchronizationJobName;

    @Body
    @NameInMap("SynchronizationObjects")
    @Validation(required = true)
    private String synchronizationObjects;

    private ConfigureSynchronizationJobRequest(Builder builder) {
        super(builder);
        this.destinationEndpoint = builder.destinationEndpoint;
        this.partitionKey = builder.partitionKey;
        this.sourceEndpoint = builder.sourceEndpoint;
        this.accountId = builder.accountId;
        this.checkpoint = builder.checkpoint;
        this.dataInitialization = builder.dataInitialization;
        this.migrationReserved = builder.migrationReserved;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.structureInitialization = builder.structureInitialization;
        this.synchronizationDirection = builder.synchronizationDirection;
        this.synchronizationJobId = builder.synchronizationJobId;
        this.synchronizationJobName = builder.synchronizationJobName;
        this.synchronizationObjects = builder.synchronizationObjects;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigureSynchronizationJobRequest create() {
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
     * @return partitionKey
     */
    public PartitionKey getPartitionKey() {
        return this.partitionKey;
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
     * @return dataInitialization
     */
    public Boolean getDataInitialization() {
        return this.dataInitialization;
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

    /**
     * @return structureInitialization
     */
    public Boolean getStructureInitialization() {
        return this.structureInitialization;
    }

    /**
     * @return synchronizationDirection
     */
    public String getSynchronizationDirection() {
        return this.synchronizationDirection;
    }

    /**
     * @return synchronizationJobId
     */
    public String getSynchronizationJobId() {
        return this.synchronizationJobId;
    }

    /**
     * @return synchronizationJobName
     */
    public String getSynchronizationJobName() {
        return this.synchronizationJobName;
    }

    /**
     * @return synchronizationObjects
     */
    public String getSynchronizationObjects() {
        return this.synchronizationObjects;
    }

    public static final class Builder extends Request.Builder<ConfigureSynchronizationJobRequest, Builder> {
        private DestinationEndpoint destinationEndpoint; 
        private PartitionKey partitionKey; 
        private SourceEndpoint sourceEndpoint; 
        private String accountId; 
        private String checkpoint; 
        private Boolean dataInitialization; 
        private String migrationReserved; 
        private String ownerId; 
        private String regionId; 
        private String resourceGroupId; 
        private Boolean structureInitialization; 
        private String synchronizationDirection; 
        private String synchronizationJobId; 
        private String synchronizationJobName; 
        private String synchronizationObjects; 

        private Builder() {
            super();
        } 

        private Builder(ConfigureSynchronizationJobRequest request) {
            super(request);
            this.destinationEndpoint = request.destinationEndpoint;
            this.partitionKey = request.partitionKey;
            this.sourceEndpoint = request.sourceEndpoint;
            this.accountId = request.accountId;
            this.checkpoint = request.checkpoint;
            this.dataInitialization = request.dataInitialization;
            this.migrationReserved = request.migrationReserved;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.structureInitialization = request.structureInitialization;
            this.synchronizationDirection = request.synchronizationDirection;
            this.synchronizationJobId = request.synchronizationJobId;
            this.synchronizationJobName = request.synchronizationJobName;
            this.synchronizationObjects = request.synchronizationObjects;
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
         * PartitionKey.
         */
        public Builder partitionKey(PartitionKey partitionKey) {
            this.putQueryParameter("PartitionKey", partitionKey);
            this.partitionKey = partitionKey;
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
         * The ID of the Alibaba Cloud account. You do not need to specify this parameter because this parameter will be removed in the future.
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * The synchronization checkpoint.
         */
        public Builder checkpoint(String checkpoint) {
            this.putQueryParameter("Checkpoint", checkpoint);
            this.checkpoint = checkpoint;
            return this;
        }

        /**
         * Specifies whether to perform initial full data synchronization. Valid values:
         * <p>
         * 
         * *   **true**: yes
         * *   **false**: no
         * 
         * >  Default value: **true**.
         */
        public Builder dataInitialization(Boolean dataInitialization) {
            this.putQueryParameter("DataInitialization", dataInitialization);
            this.dataInitialization = dataInitialization;
            return this;
        }

        /**
         * The reserved parameter of DTS. The value is a JSON string. You can specify this parameter to meet special requirements, for example, whether to automatically start a precheck. For more information, see [MigrationReserved](~~176470~~).
         * <p>
         * 
         * >  This parameter can be used for data synchronization between ApsaraDB for Redis Enterprise Edition instances. For more information, see [Use OpenAPI Explorer to configure one-way or two-way data synchronization between ApsaraDB for Redis Enterprise Edition instances](~~155967~~).
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * Specifies whether to perform initial schema synchronization. Valid values:
         * <p>
         * 
         * *   **true**: yes
         * *   **false**: no
         * 
         * >  Default value: **true**.
         */
        public Builder structureInitialization(Boolean structureInitialization) {
            this.putQueryParameter("StructureInitialization", structureInitialization);
            this.structureInitialization = structureInitialization;
            return this;
        }

        /**
         * The synchronization direction. Valid values:
         * <p>
         * 
         * *   **Forward**
         * *   **Reverse**
         * 
         * > 
         * *   Default value: **Forward**.
         * *   The value **Reverse** takes effect only if the topology of the data synchronization instance is two-way synchronization.
         */
        public Builder synchronizationDirection(String synchronizationDirection) {
            this.putQueryParameter("SynchronizationDirection", synchronizationDirection);
            this.synchronizationDirection = synchronizationDirection;
            return this;
        }

        /**
         * The ID of the data synchronization instance. You can call the [DescribeSynchronizationJobs](~~49454~~) operation to query the instance ID.
         */
        public Builder synchronizationJobId(String synchronizationJobId) {
            this.putQueryParameter("SynchronizationJobId", synchronizationJobId);
            this.synchronizationJobId = synchronizationJobId;
            return this;
        }

        /**
         * The name of the data synchronization task.
         * <p>
         * 
         * >  We recommend that you specify an informative name for easy identification. You do not need to use a unique task name.
         */
        public Builder synchronizationJobName(String synchronizationJobName) {
            this.putQueryParameter("SynchronizationJobName", synchronizationJobName);
            this.synchronizationJobName = synchronizationJobName;
            return this;
        }

        /**
         * The objects that you want to synchronize. The value is a JSON string and can contain regular expressions. For more information, see [SynchronizationObjects](~~141901~~).
         */
        public Builder synchronizationObjects(String synchronizationObjects) {
            this.putBodyParameter("SynchronizationObjects", synchronizationObjects);
            this.synchronizationObjects = synchronizationObjects;
            return this;
        }

        @Override
        public ConfigureSynchronizationJobRequest build() {
            return new ConfigureSynchronizationJobRequest(this);
        } 

    } 

    public static class DestinationEndpoint extends TeaModel {
        @NameInMap("DataBaseName")
        private String dataBaseName;

        @NameInMap("IP")
        private String ip;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("Password")
        private String password;

        @NameInMap("Port")
        private String port;

        @NameInMap("UserName")
        private String userName;

        private DestinationEndpoint(Builder builder) {
            this.dataBaseName = builder.dataBaseName;
            this.ip = builder.ip;
            this.instanceId = builder.instanceId;
            this.instanceType = builder.instanceType;
            this.password = builder.password;
            this.port = builder.port;
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
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
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
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String dataBaseName; 
            private String ip; 
            private String instanceId; 
            private String instanceType; 
            private String password; 
            private String port; 
            private String userName; 

            /**
             * The name of the database to which the synchronization object in the destination instance belongs.
             */
            public Builder dataBaseName(String dataBaseName) {
                this.dataBaseName = dataBaseName;
                return this;
            }

            /**
             * The IP address of the destination database.
             * <p>
             * 
             * >  You must specify this parameter only if the **DestinationEndpoint.InstanceType** parameter is set to **Express**, **dg**, or **cen**.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The ID of the destination instance.
             * <p>
             * 
             * >  If the **DestinationEndpoint.InstanceType** parameter is set to **MaxCompute** or **DataHub**, you must specify the name of the MaxCompute project or the DataHub project.
             * 
             * If the destination instance is an AnalyticDB for MySQL cluster, specify the ID of the AnalyticDB for MySQL cluster.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The type of the destination instance. Valid values:
             * <p>
             * 
             * *   **Redis**: ApsaraDB for Redis instance
             * *   **RDS**: ApsaraDB RDS instance
             * *   **PolarDB**: PolarDB for MySQL cluster or PolarDB O Edition cluster
             * *   **ECS**: self-managed database that is hosted on ECS
             * *   **Express**: self-managed database that is connected over Express Connect
             * *   **DataHub**: DataHub project
             * *   **MaxCompute**: MaxCompute project
             * *   **AnalyticDB**: AnalyticDB for MySQL cluster V3.0 or V2.0
             * *   **Greenplum**: AnalyticDB for PostgreSQL instance
             * 
             * >  The default value is **RDS**.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The password of the destination database account.
             * <p>
             * 
             * > 
             * *   If the **DestinationEndpoint.InstanceType** parameter is set to **ECS**, **Express**, **dg**, or **cen**, you must specify the DestinationEndpoint.Password parameter.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * The service port number of the destination database.
             * <p>
             * 
             * >  You must specify this parameter only if the **DestinationEndpoint.InstanceType** parameter is set to **ECS**, **Express**, **dg**, or **cen**.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The database account of the destination database.
             * <p>
             * 
             * > 
             * *   The permissions that are required for database accounts vary with the synchronization scenario. For more information, see [Overview of data synchronization scenarios](~~140954~~).
             * *   If the **DestinationEndpoint.InstanceType** parameter is set to **ECS**, **Express**, **dg**, or **cen**, you must specify the DestinationEndpoint.UserName parameter.
             * *   If the **DestinationEndpoint.InstanceType** parameter is set to RDS and the database version is MySQL 5.5 or MySQL 5.6, you do not need to specify the DestinationEndpoint.UserName and **DestinationEndpoint.Password** parameters.
             * *   If the **DestinationEndpoint.InstanceType** parameter is set to **Redis**, you do not need to specify the DestinationEndpoint.UserName parameter.
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
    public static class PartitionKey extends TeaModel {
        @NameInMap("ModifyTime_Day")
        private Boolean modifyTimeDay;

        @NameInMap("ModifyTime_Hour")
        private Boolean modifyTimeHour;

        @NameInMap("ModifyTime_Minute")
        private Boolean modifyTimeMinute;

        @NameInMap("ModifyTime_Month")
        private Boolean modifyTimeMonth;

        @NameInMap("ModifyTime_Year")
        private Boolean modifyTimeYear;

        private PartitionKey(Builder builder) {
            this.modifyTimeDay = builder.modifyTimeDay;
            this.modifyTimeHour = builder.modifyTimeHour;
            this.modifyTimeMinute = builder.modifyTimeMinute;
            this.modifyTimeMonth = builder.modifyTimeMonth;
            this.modifyTimeYear = builder.modifyTimeYear;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PartitionKey create() {
            return builder().build();
        }

        /**
         * @return modifyTimeDay
         */
        public Boolean getModifyTimeDay() {
            return this.modifyTimeDay;
        }

        /**
         * @return modifyTimeHour
         */
        public Boolean getModifyTimeHour() {
            return this.modifyTimeHour;
        }

        /**
         * @return modifyTimeMinute
         */
        public Boolean getModifyTimeMinute() {
            return this.modifyTimeMinute;
        }

        /**
         * @return modifyTimeMonth
         */
        public Boolean getModifyTimeMonth() {
            return this.modifyTimeMonth;
        }

        /**
         * @return modifyTimeYear
         */
        public Boolean getModifyTimeYear() {
            return this.modifyTimeYear;
        }

        public static final class Builder {
            private Boolean modifyTimeDay; 
            private Boolean modifyTimeHour; 
            private Boolean modifyTimeMinute; 
            private Boolean modifyTimeMonth; 
            private Boolean modifyTimeYear; 

            /**
             * Specifies whether the incremental data table contains partitions defined by the modifytime_day field. Valid values: **true** and **false**.
             * <p>
             * 
             * >  This parameter is available only if the **DestinationEndpoint.InstanceType** parameter is set to **MaxCompute**.
             */
            public Builder modifyTimeDay(Boolean modifyTimeDay) {
                this.modifyTimeDay = modifyTimeDay;
                return this;
            }

            /**
             * Specifies whether the incremental data table contains partitions defined by the modifytime_hour field. Valid values: **true** and **false**.
             * <p>
             * 
             * >  This parameter is available only if the **DestinationEndpoint.InstanceType** parameter is set to **MaxCompute**.
             */
            public Builder modifyTimeHour(Boolean modifyTimeHour) {
                this.modifyTimeHour = modifyTimeHour;
                return this;
            }

            /**
             * Specifies whether the incremental data table contains partitions defined by the modifytime_minute field. Valid values: **true** and **false**.
             * <p>
             * 
             * >  This parameter is available only if the **DestinationEndpoint.InstanceType** parameter is set to **MaxCompute**.
             */
            public Builder modifyTimeMinute(Boolean modifyTimeMinute) {
                this.modifyTimeMinute = modifyTimeMinute;
                return this;
            }

            /**
             * Specifies whether the incremental data table contains partitions defined by the modifytime_month field. Valid values: **true** and **false**.
             * <p>
             * 
             * >  This parameter is available only if the **DestinationEndpoint.InstanceType** parameter is set to **MaxCompute**.
             */
            public Builder modifyTimeMonth(Boolean modifyTimeMonth) {
                this.modifyTimeMonth = modifyTimeMonth;
                return this;
            }

            /**
             * Specifies whether the incremental data table contains partitions defined by the modifytime_year field. Valid values: **true** and **false**.
             * <p>
             * 
             * >  This parameter is available only if the **DestinationEndpoint.InstanceType** parameter is set to **MaxCompute**.
             */
            public Builder modifyTimeYear(Boolean modifyTimeYear) {
                this.modifyTimeYear = modifyTimeYear;
                return this;
            }

            public PartitionKey build() {
                return new PartitionKey(this);
            } 

        } 

    }
    public static class SourceEndpoint extends TeaModel {
        @NameInMap("DatabaseName")
        private String databaseName;

        @NameInMap("IP")
        private String ip;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("OwnerID")
        private String ownerID;

        @NameInMap("Password")
        private String password;

        @NameInMap("Port")
        private String port;

        @NameInMap("Role")
        private String role;

        @NameInMap("UserName")
        private String userName;

        private SourceEndpoint(Builder builder) {
            this.databaseName = builder.databaseName;
            this.ip = builder.ip;
            this.instanceId = builder.instanceId;
            this.instanceType = builder.instanceType;
            this.ownerID = builder.ownerID;
            this.password = builder.password;
            this.port = builder.port;
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
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
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
            private String ip; 
            private String instanceId; 
            private String instanceType; 
            private String ownerID; 
            private String password; 
            private String port; 
            private String role; 
            private String userName; 

            /**
             * The name of the database to which the synchronization object in the source instance belongs.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * The IP address of the source database.
             * <p>
             * 
             * >  You must specify this parameter only if the **SourceEndpoint.InstanceType** parameter is set to **ECS**, **Express**, **dg**, or **cen**.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The ID of the source instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The type of the source instance. Valid values:
             * <p>
             * 
             * *   **RDS**: ApsaraDB RDS instance
             * *   **Redis**: ApsaraDB for Redis instance
             * *   **PolarDB**: PolarDB for MySQL cluster or PolarDB O Edition cluster
             * *   **ECS**: self-managed database that is hosted on Elastic Compute Service (ECS)
             * *   **Express**: self-managed database that is connected over Express Connect
             * *   **dg**: self-managed database that is connected over Database Gateway
             * *   **cen**: self-managed database that is connected over Cloud Enterprise Network (CEN)
             * 
             * >  The default value is **RDS**.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account that owns the source RDS instance.
             * <p>
             * 
             * >  You can specify this parameter to synchronize data across different Alibaba Cloud accounts. In this case, you also need to specify the **SourceEndpoint.Role** parameter.
             */
            public Builder ownerID(String ownerID) {
                this.ownerID = ownerID;
                return this;
            }

            /**
             * The password of the source database account.
             * <p>
             * 
             * >  You must specify this parameter only if the **SourceEndpoint.InstanceType** parameter is set to **ECS**, **Express**, **dg**, or **cen**.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * The service port number of the source database.
             * <p>
             * 
             * >  You must specify this parameter only if the **SourceEndpoint.InstanceType** parameter is set to **ECS**, **Express**, **dg**, or **cen**.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The name of the RAM role configured for the Alibaba Cloud account that owns the source instance.
             * <p>
             * 
             * >  You must specify this parameter when you synchronize data across different Alibaba Cloud accounts. For information about the permissions and authorization methods of the RAM role, see [Configure RAM authorization for cross-account data migration and synchronization](~~48468~~).
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * The database account of the source database.
             * <p>
             * 
             * > 
             * *   You must specify this parameter only if the **SourceEndpoint.InstanceType** parameter is set to **ECS**, **Express**, **dg**, or **cen**.
             * *   If the **SourceEndpoint.InstanceType** parameter is set to **Redis**, you do not need to specify the database account.
             * *   The permissions that are required for database accounts vary with the synchronization scenario. For more information, see [Overview of data synchronization scenarios](~~140954~~).
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
