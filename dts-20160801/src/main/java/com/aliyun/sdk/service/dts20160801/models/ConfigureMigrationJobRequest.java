// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigureMigrationJobRequest} extends {@link RequestModel}
 *
 * <p>ConfigureMigrationJobRequest</p>
 */
public class ConfigureMigrationJobRequest extends Request {
    @Query
    @NameInMap("DestinationEndpoint")
    private DestinationEndpoint destinationEndpoint;

    @Query
    @NameInMap("MigrationMode")
    private MigrationMode migrationMode;

    @Query
    @NameInMap("SourceEndpoint")
    private SourceEndpoint sourceEndpoint;

    @Query
    @NameInMap("Checkpoint")
    private String checkpoint;

    @Query
    @NameInMap("MigrationJobId")
    @Validation(required = true)
    private String migrationJobId;

    @Query
    @NameInMap("MigrationJobName")
    @Validation(required = true)
    private String migrationJobName;

    @Query
    @NameInMap("MigrationObject")
    @Validation(required = true)
    private String migrationObject;

    @Query
    @NameInMap("MigrationReserved")
    private String migrationReserved;

    @Query
    @NameInMap("OwnerId")
    private String ownerId;

    private ConfigureMigrationJobRequest(Builder builder) {
        super(builder);
        this.destinationEndpoint = builder.destinationEndpoint;
        this.migrationMode = builder.migrationMode;
        this.sourceEndpoint = builder.sourceEndpoint;
        this.checkpoint = builder.checkpoint;
        this.migrationJobId = builder.migrationJobId;
        this.migrationJobName = builder.migrationJobName;
        this.migrationObject = builder.migrationObject;
        this.migrationReserved = builder.migrationReserved;
        this.ownerId = builder.ownerId;
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

    public static final class Builder extends Request.Builder<ConfigureMigrationJobRequest, Builder> {
        private DestinationEndpoint destinationEndpoint; 
        private MigrationMode migrationMode; 
        private SourceEndpoint sourceEndpoint; 
        private String checkpoint; 
        private String migrationJobId; 
        private String migrationJobName; 
        private String migrationObject; 
        private String migrationReserved; 
        private String ownerId; 

        private Builder() {
            super();
        } 

        private Builder(ConfigureMigrationJobRequest request) {
            super(request);
            this.destinationEndpoint = request.destinationEndpoint;
            this.migrationMode = request.migrationMode;
            this.sourceEndpoint = request.sourceEndpoint;
            this.checkpoint = request.checkpoint;
            this.migrationJobId = request.migrationJobId;
            this.migrationJobName = request.migrationJobName;
            this.migrationObject = request.migrationObject;
            this.migrationReserved = request.migrationReserved;
            this.ownerId = request.ownerId;
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
         * Checkpoint.
         */
        public Builder checkpoint(String checkpoint) {
            this.putQueryParameter("Checkpoint", checkpoint);
            this.checkpoint = checkpoint;
            return this;
        }

        /**
         * MigrationJobId.
         */
        public Builder migrationJobId(String migrationJobId) {
            this.putQueryParameter("MigrationJobId", migrationJobId);
            this.migrationJobId = migrationJobId;
            return this;
        }

        /**
         * MigrationJobName.
         */
        public Builder migrationJobName(String migrationJobName) {
            this.putQueryParameter("MigrationJobName", migrationJobName);
            this.migrationJobName = migrationJobName;
            return this;
        }

        /**
         * MigrationObject.
         */
        public Builder migrationObject(String migrationObject) {
            this.putQueryParameter("MigrationObject", migrationObject);
            this.migrationObject = migrationObject;
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

        @Override
        public ConfigureMigrationJobRequest build() {
            return new ConfigureMigrationJobRequest(this);
        } 

    } 

    public static class DestinationEndpoint extends TeaModel {
        @NameInMap("DataBaseName")
        private String dataBaseName;

        @NameInMap("EngineName")
        private String engineName;

        @NameInMap("IP")
        private String ip;

        @NameInMap("InstanceID")
        private String instanceID;

        @NameInMap("InstanceType")
        @Validation(required = true)
        private String instanceType;

        @NameInMap("Password")
        @Validation(required = true)
        private String password;

        @NameInMap("Port")
        private String port;

        @NameInMap("Region")
        private String region;

        @NameInMap("UserName")
        @Validation(required = true)
        private String userName;

        private DestinationEndpoint(Builder builder) {
            this.dataBaseName = builder.dataBaseName;
            this.engineName = builder.engineName;
            this.ip = builder.ip;
            this.instanceID = builder.instanceID;
            this.instanceType = builder.instanceType;
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
            private String password; 
            private String port; 
            private String region; 
            private String userName; 

            /**
             * DataBaseName.
             */
            public Builder dataBaseName(String dataBaseName) {
                this.dataBaseName = dataBaseName;
                return this;
            }

            /**
             * EngineName.
             */
            public Builder engineName(String engineName) {
                this.engineName = engineName;
                return this;
            }

            /**
             * IP.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * InstanceID.
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
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
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
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
    public static class MigrationMode extends TeaModel {
        @NameInMap("DataIntialization")
        @Validation(required = true)
        private Boolean dataIntialization;

        @NameInMap("DataSynchronization")
        @Validation(required = true)
        private Boolean dataSynchronization;

        @NameInMap("StructureIntialization")
        @Validation(required = true)
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
             * DataIntialization.
             */
            public Builder dataIntialization(Boolean dataIntialization) {
                this.dataIntialization = dataIntialization;
                return this;
            }

            /**
             * DataSynchronization.
             */
            public Builder dataSynchronization(Boolean dataSynchronization) {
                this.dataSynchronization = dataSynchronization;
                return this;
            }

            /**
             * StructureIntialization.
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
    public static class SourceEndpoint extends TeaModel {
        @NameInMap("DatabaseName")
        private String databaseName;

        @NameInMap("EngineName")
        private String engineName;

        @NameInMap("IP")
        private String ip;

        @NameInMap("InstanceID")
        private String instanceID;

        @NameInMap("InstanceType")
        @Validation(required = true)
        private String instanceType;

        @NameInMap("OracleSID")
        private String oracleSID;

        @NameInMap("OwnerID")
        private String ownerID;

        @NameInMap("Password")
        @Validation(required = true)
        private String password;

        @NameInMap("Port")
        private String port;

        @NameInMap("Region")
        private String region;

        @NameInMap("Role")
        private String role;

        @NameInMap("UserName")
        @Validation(required = true)
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
             * DatabaseName.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * EngineName.
             */
            public Builder engineName(String engineName) {
                this.engineName = engineName;
                return this;
            }

            /**
             * IP.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * InstanceID.
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
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
             * OracleSID.
             */
            public Builder oracleSID(String oracleSID) {
                this.oracleSID = oracleSID;
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
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
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
