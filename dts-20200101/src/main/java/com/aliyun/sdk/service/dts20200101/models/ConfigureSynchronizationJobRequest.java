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
    @NameInMap("DestinationEndpoint")
    private DestinationEndpoint destinationEndpoint;

    @NameInMap("PartitionKey")
    private PartitionKey partitionKey;

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
        private Boolean structureInitialization; 
        private String synchronizationDirection; 
        private String synchronizationJobId; 
        private String synchronizationJobName; 
        private String synchronizationObjects; 

        private Builder() {
            super();
        } 

        private Builder(ConfigureSynchronizationJobRequest response) {
            super(response);
            this.destinationEndpoint = response.destinationEndpoint;
            this.partitionKey = response.partitionKey;
            this.sourceEndpoint = response.sourceEndpoint;
            this.accountId = response.accountId;
            this.checkpoint = response.checkpoint;
            this.dataInitialization = response.dataInitialization;
            this.migrationReserved = response.migrationReserved;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
            this.structureInitialization = response.structureInitialization;
            this.synchronizationDirection = response.synchronizationDirection;
            this.synchronizationJobId = response.synchronizationJobId;
            this.synchronizationJobName = response.synchronizationJobName;
            this.synchronizationObjects = response.synchronizationObjects;
        } 

        /**
         * DestinationEndpoint.
         */
        public Builder destinationEndpoint(DestinationEndpoint destinationEndpoint) {
            this.destinationEndpoint = destinationEndpoint;
            return this;
        }

        /**
         * PartitionKey.
         */
        public Builder partitionKey(PartitionKey partitionKey) {
            this.partitionKey = partitionKey;
            return this;
        }

        /**
         * SourceEndpoint.
         */
        public Builder sourceEndpoint(SourceEndpoint sourceEndpoint) {
            this.sourceEndpoint = sourceEndpoint;
            return this;
        }

        /**
         * AccountId.
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * Checkpoint.
         */
        public Builder checkpoint(String checkpoint) {
            this.putQueryParameter("Checkpoint", checkpoint);
            this.checkpoint = checkpoint;
            return this;
        }

        /**
         * DataInitialization.
         */
        public Builder dataInitialization(Boolean dataInitialization) {
            this.putQueryParameter("DataInitialization", dataInitialization);
            this.dataInitialization = dataInitialization;
            return this;
        }

        /**
         * MigrationReserved.
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
         * StructureInitialization.
         */
        public Builder structureInitialization(Boolean structureInitialization) {
            this.putQueryParameter("StructureInitialization", structureInitialization);
            this.structureInitialization = structureInitialization;
            return this;
        }

        /**
         * SynchronizationDirection.
         */
        public Builder synchronizationDirection(String synchronizationDirection) {
            this.putQueryParameter("SynchronizationDirection", synchronizationDirection);
            this.synchronizationDirection = synchronizationDirection;
            return this;
        }

        /**
         * SynchronizationJobId.
         */
        public Builder synchronizationJobId(String synchronizationJobId) {
            this.putQueryParameter("SynchronizationJobId", synchronizationJobId);
            this.synchronizationJobId = synchronizationJobId;
            return this;
        }

        /**
         * SynchronizationJobName.
         */
        public Builder synchronizationJobName(String synchronizationJobName) {
            this.putQueryParameter("SynchronizationJobName", synchronizationJobName);
            this.synchronizationJobName = synchronizationJobName;
            return this;
        }

        /**
         * SynchronizationObjects.
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
        private String IP;

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
            this.IP = builder.IP;
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
         * @return IP
         */
        public String getIP() {
            return this.IP;
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
            private String IP; 
            private String instanceId; 
            private String instanceType; 
            private String password; 
            private String port; 
            private String userName; 

            /**
             * DataBaseName.
             */
            public Builder dataBaseName(String dataBaseName) {
                this.dataBaseName = dataBaseName;
                return this;
            }

            /**
             * IP.
             */
            public Builder IP(String IP) {
                this.IP = IP;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * Password.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * UserName.
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
             * ModifyTime_Day.
             */
            public Builder modifyTimeDay(Boolean modifyTimeDay) {
                this.modifyTimeDay = modifyTimeDay;
                return this;
            }

            /**
             * ModifyTime_Hour.
             */
            public Builder modifyTimeHour(Boolean modifyTimeHour) {
                this.modifyTimeHour = modifyTimeHour;
                return this;
            }

            /**
             * ModifyTime_Minute.
             */
            public Builder modifyTimeMinute(Boolean modifyTimeMinute) {
                this.modifyTimeMinute = modifyTimeMinute;
                return this;
            }

            /**
             * ModifyTime_Month.
             */
            public Builder modifyTimeMonth(Boolean modifyTimeMonth) {
                this.modifyTimeMonth = modifyTimeMonth;
                return this;
            }

            /**
             * ModifyTime_Year.
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
        private String IP;

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
            this.IP = builder.IP;
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
         * @return IP
         */
        public String getIP() {
            return this.IP;
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
            private String IP; 
            private String instanceId; 
            private String instanceType; 
            private String ownerID; 
            private String password; 
            private String port; 
            private String role; 
            private String userName; 

            /**
             * DatabaseName.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * IP.
             */
            public Builder IP(String IP) {
                this.IP = IP;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * OwnerID.
             */
            public Builder ownerID(String ownerID) {
                this.ownerID = ownerID;
                return this;
            }

            /**
             * Password.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * UserName.
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
