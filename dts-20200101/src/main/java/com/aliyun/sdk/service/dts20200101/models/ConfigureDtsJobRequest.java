// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigureDtsJobRequest} extends {@link RequestModel}
 *
 * <p>ConfigureDtsJobRequest</p>
 */
public class ConfigureDtsJobRequest extends Request {
    @Query
    @NameInMap("Checkpoint")
    private String checkpoint;

    @Query
    @NameInMap("DataInitialization")
    @Validation(required = true)
    private Boolean dataInitialization;

    @Query
    @NameInMap("DataSynchronization")
    @Validation(required = true)
    private Boolean dataSynchronization;

    @Body
    @NameInMap("DbList")
    @Validation(required = true)
    private String dbList;

    @Query
    @NameInMap("DelayNotice")
    private Boolean delayNotice;

    @Query
    @NameInMap("DelayPhone")
    private String delayPhone;

    @Query
    @NameInMap("DelayRuleTime")
    @Validation(maximum = 10000000000D, minimum = 1)
    private Long delayRuleTime;

    @Query
    @NameInMap("DestinationEndpointDataBaseName")
    private String destinationEndpointDataBaseName;

    @Query
    @NameInMap("DestinationEndpointEngineName")
    private String destinationEndpointEngineName;

    @Query
    @NameInMap("DestinationEndpointIP")
    private String destinationEndpointIP;

    @Query
    @NameInMap("DestinationEndpointInstanceID")
    private String destinationEndpointInstanceID;

    @Query
    @NameInMap("DestinationEndpointInstanceType")
    @Validation(required = true)
    private String destinationEndpointInstanceType;

    @Query
    @NameInMap("DestinationEndpointOracleSID")
    private String destinationEndpointOracleSID;

    @Query
    @NameInMap("DestinationEndpointPassword")
    private String destinationEndpointPassword;

    @Query
    @NameInMap("DestinationEndpointPort")
    private String destinationEndpointPort;

    @Query
    @NameInMap("DestinationEndpointRegion")
    private String destinationEndpointRegion;

    @Query
    @NameInMap("DestinationEndpointUserName")
    private String destinationEndpointUserName;

    @Query
    @NameInMap("DtsInstanceId")
    private String dtsInstanceId;

    @Query
    @NameInMap("DtsJobId")
    private String dtsJobId;

    @Query
    @NameInMap("DtsJobName")
    @Validation(required = true)
    private String dtsJobName;

    @Query
    @NameInMap("ErrorNotice")
    private Boolean errorNotice;

    @Query
    @NameInMap("ErrorPhone")
    private String errorPhone;

    @Query
    @NameInMap("JobType")
    @Validation(required = true)
    private String jobType;

    @Query
    @NameInMap("OwnerId")
    private String ownerId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Reserve")
    private String reserve;

    @Query
    @NameInMap("SourceEndpointDatabaseName")
    private String sourceEndpointDatabaseName;

    @Query
    @NameInMap("SourceEndpointEngineName")
    private String sourceEndpointEngineName;

    @Query
    @NameInMap("SourceEndpointIP")
    private String sourceEndpointIP;

    @Query
    @NameInMap("SourceEndpointInstanceID")
    private String sourceEndpointInstanceID;

    @Query
    @NameInMap("SourceEndpointInstanceType")
    @Validation(required = true)
    private String sourceEndpointInstanceType;

    @Query
    @NameInMap("SourceEndpointOracleSID")
    private String sourceEndpointOracleSID;

    @Query
    @NameInMap("SourceEndpointOwnerID")
    private String sourceEndpointOwnerID;

    @Query
    @NameInMap("SourceEndpointPassword")
    private String sourceEndpointPassword;

    @Query
    @NameInMap("SourceEndpointPort")
    private String sourceEndpointPort;

    @Query
    @NameInMap("SourceEndpointRegion")
    private String sourceEndpointRegion;

    @Query
    @NameInMap("SourceEndpointRole")
    private String sourceEndpointRole;

    @Query
    @NameInMap("SourceEndpointUserName")
    private String sourceEndpointUserName;

    @Query
    @NameInMap("StructureInitialization")
    @Validation(required = true)
    private Boolean structureInitialization;

    @Query
    @NameInMap("SynchronizationDirection")
    private String synchronizationDirection;

    private ConfigureDtsJobRequest(Builder builder) {
        super(builder);
        this.checkpoint = builder.checkpoint;
        this.dataInitialization = builder.dataInitialization;
        this.dataSynchronization = builder.dataSynchronization;
        this.dbList = builder.dbList;
        this.delayNotice = builder.delayNotice;
        this.delayPhone = builder.delayPhone;
        this.delayRuleTime = builder.delayRuleTime;
        this.destinationEndpointDataBaseName = builder.destinationEndpointDataBaseName;
        this.destinationEndpointEngineName = builder.destinationEndpointEngineName;
        this.destinationEndpointIP = builder.destinationEndpointIP;
        this.destinationEndpointInstanceID = builder.destinationEndpointInstanceID;
        this.destinationEndpointInstanceType = builder.destinationEndpointInstanceType;
        this.destinationEndpointOracleSID = builder.destinationEndpointOracleSID;
        this.destinationEndpointPassword = builder.destinationEndpointPassword;
        this.destinationEndpointPort = builder.destinationEndpointPort;
        this.destinationEndpointRegion = builder.destinationEndpointRegion;
        this.destinationEndpointUserName = builder.destinationEndpointUserName;
        this.dtsInstanceId = builder.dtsInstanceId;
        this.dtsJobId = builder.dtsJobId;
        this.dtsJobName = builder.dtsJobName;
        this.errorNotice = builder.errorNotice;
        this.errorPhone = builder.errorPhone;
        this.jobType = builder.jobType;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.reserve = builder.reserve;
        this.sourceEndpointDatabaseName = builder.sourceEndpointDatabaseName;
        this.sourceEndpointEngineName = builder.sourceEndpointEngineName;
        this.sourceEndpointIP = builder.sourceEndpointIP;
        this.sourceEndpointInstanceID = builder.sourceEndpointInstanceID;
        this.sourceEndpointInstanceType = builder.sourceEndpointInstanceType;
        this.sourceEndpointOracleSID = builder.sourceEndpointOracleSID;
        this.sourceEndpointOwnerID = builder.sourceEndpointOwnerID;
        this.sourceEndpointPassword = builder.sourceEndpointPassword;
        this.sourceEndpointPort = builder.sourceEndpointPort;
        this.sourceEndpointRegion = builder.sourceEndpointRegion;
        this.sourceEndpointRole = builder.sourceEndpointRole;
        this.sourceEndpointUserName = builder.sourceEndpointUserName;
        this.structureInitialization = builder.structureInitialization;
        this.synchronizationDirection = builder.synchronizationDirection;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigureDtsJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return dataSynchronization
     */
    public Boolean getDataSynchronization() {
        return this.dataSynchronization;
    }

    /**
     * @return dbList
     */
    public String getDbList() {
        return this.dbList;
    }

    /**
     * @return delayNotice
     */
    public Boolean getDelayNotice() {
        return this.delayNotice;
    }

    /**
     * @return delayPhone
     */
    public String getDelayPhone() {
        return this.delayPhone;
    }

    /**
     * @return delayRuleTime
     */
    public Long getDelayRuleTime() {
        return this.delayRuleTime;
    }

    /**
     * @return destinationEndpointDataBaseName
     */
    public String getDestinationEndpointDataBaseName() {
        return this.destinationEndpointDataBaseName;
    }

    /**
     * @return destinationEndpointEngineName
     */
    public String getDestinationEndpointEngineName() {
        return this.destinationEndpointEngineName;
    }

    /**
     * @return destinationEndpointIP
     */
    public String getDestinationEndpointIP() {
        return this.destinationEndpointIP;
    }

    /**
     * @return destinationEndpointInstanceID
     */
    public String getDestinationEndpointInstanceID() {
        return this.destinationEndpointInstanceID;
    }

    /**
     * @return destinationEndpointInstanceType
     */
    public String getDestinationEndpointInstanceType() {
        return this.destinationEndpointInstanceType;
    }

    /**
     * @return destinationEndpointOracleSID
     */
    public String getDestinationEndpointOracleSID() {
        return this.destinationEndpointOracleSID;
    }

    /**
     * @return destinationEndpointPassword
     */
    public String getDestinationEndpointPassword() {
        return this.destinationEndpointPassword;
    }

    /**
     * @return destinationEndpointPort
     */
    public String getDestinationEndpointPort() {
        return this.destinationEndpointPort;
    }

    /**
     * @return destinationEndpointRegion
     */
    public String getDestinationEndpointRegion() {
        return this.destinationEndpointRegion;
    }

    /**
     * @return destinationEndpointUserName
     */
    public String getDestinationEndpointUserName() {
        return this.destinationEndpointUserName;
    }

    /**
     * @return dtsInstanceId
     */
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
    }

    /**
     * @return dtsJobId
     */
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    /**
     * @return dtsJobName
     */
    public String getDtsJobName() {
        return this.dtsJobName;
    }

    /**
     * @return errorNotice
     */
    public Boolean getErrorNotice() {
        return this.errorNotice;
    }

    /**
     * @return errorPhone
     */
    public String getErrorPhone() {
        return this.errorPhone;
    }

    /**
     * @return jobType
     */
    public String getJobType() {
        return this.jobType;
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
     * @return reserve
     */
    public String getReserve() {
        return this.reserve;
    }

    /**
     * @return sourceEndpointDatabaseName
     */
    public String getSourceEndpointDatabaseName() {
        return this.sourceEndpointDatabaseName;
    }

    /**
     * @return sourceEndpointEngineName
     */
    public String getSourceEndpointEngineName() {
        return this.sourceEndpointEngineName;
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
     * @return sourceEndpointOracleSID
     */
    public String getSourceEndpointOracleSID() {
        return this.sourceEndpointOracleSID;
    }

    /**
     * @return sourceEndpointOwnerID
     */
    public String getSourceEndpointOwnerID() {
        return this.sourceEndpointOwnerID;
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
    public String getSourceEndpointPort() {
        return this.sourceEndpointPort;
    }

    /**
     * @return sourceEndpointRegion
     */
    public String getSourceEndpointRegion() {
        return this.sourceEndpointRegion;
    }

    /**
     * @return sourceEndpointRole
     */
    public String getSourceEndpointRole() {
        return this.sourceEndpointRole;
    }

    /**
     * @return sourceEndpointUserName
     */
    public String getSourceEndpointUserName() {
        return this.sourceEndpointUserName;
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

    public static final class Builder extends Request.Builder<ConfigureDtsJobRequest, Builder> {
        private String checkpoint; 
        private Boolean dataInitialization; 
        private Boolean dataSynchronization; 
        private String dbList; 
        private Boolean delayNotice; 
        private String delayPhone; 
        private Long delayRuleTime; 
        private String destinationEndpointDataBaseName; 
        private String destinationEndpointEngineName; 
        private String destinationEndpointIP; 
        private String destinationEndpointInstanceID; 
        private String destinationEndpointInstanceType; 
        private String destinationEndpointOracleSID; 
        private String destinationEndpointPassword; 
        private String destinationEndpointPort; 
        private String destinationEndpointRegion; 
        private String destinationEndpointUserName; 
        private String dtsInstanceId; 
        private String dtsJobId; 
        private String dtsJobName; 
        private Boolean errorNotice; 
        private String errorPhone; 
        private String jobType; 
        private String ownerId; 
        private String regionId; 
        private String reserve; 
        private String sourceEndpointDatabaseName; 
        private String sourceEndpointEngineName; 
        private String sourceEndpointIP; 
        private String sourceEndpointInstanceID; 
        private String sourceEndpointInstanceType; 
        private String sourceEndpointOracleSID; 
        private String sourceEndpointOwnerID; 
        private String sourceEndpointPassword; 
        private String sourceEndpointPort; 
        private String sourceEndpointRegion; 
        private String sourceEndpointRole; 
        private String sourceEndpointUserName; 
        private Boolean structureInitialization; 
        private String synchronizationDirection; 

        private Builder() {
            super();
        } 

        private Builder(ConfigureDtsJobRequest response) {
            super(response);
            this.checkpoint = response.checkpoint;
            this.dataInitialization = response.dataInitialization;
            this.dataSynchronization = response.dataSynchronization;
            this.dbList = response.dbList;
            this.delayNotice = response.delayNotice;
            this.delayPhone = response.delayPhone;
            this.delayRuleTime = response.delayRuleTime;
            this.destinationEndpointDataBaseName = response.destinationEndpointDataBaseName;
            this.destinationEndpointEngineName = response.destinationEndpointEngineName;
            this.destinationEndpointIP = response.destinationEndpointIP;
            this.destinationEndpointInstanceID = response.destinationEndpointInstanceID;
            this.destinationEndpointInstanceType = response.destinationEndpointInstanceType;
            this.destinationEndpointOracleSID = response.destinationEndpointOracleSID;
            this.destinationEndpointPassword = response.destinationEndpointPassword;
            this.destinationEndpointPort = response.destinationEndpointPort;
            this.destinationEndpointRegion = response.destinationEndpointRegion;
            this.destinationEndpointUserName = response.destinationEndpointUserName;
            this.dtsInstanceId = response.dtsInstanceId;
            this.dtsJobId = response.dtsJobId;
            this.dtsJobName = response.dtsJobName;
            this.errorNotice = response.errorNotice;
            this.errorPhone = response.errorPhone;
            this.jobType = response.jobType;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
            this.reserve = response.reserve;
            this.sourceEndpointDatabaseName = response.sourceEndpointDatabaseName;
            this.sourceEndpointEngineName = response.sourceEndpointEngineName;
            this.sourceEndpointIP = response.sourceEndpointIP;
            this.sourceEndpointInstanceID = response.sourceEndpointInstanceID;
            this.sourceEndpointInstanceType = response.sourceEndpointInstanceType;
            this.sourceEndpointOracleSID = response.sourceEndpointOracleSID;
            this.sourceEndpointOwnerID = response.sourceEndpointOwnerID;
            this.sourceEndpointPassword = response.sourceEndpointPassword;
            this.sourceEndpointPort = response.sourceEndpointPort;
            this.sourceEndpointRegion = response.sourceEndpointRegion;
            this.sourceEndpointRole = response.sourceEndpointRole;
            this.sourceEndpointUserName = response.sourceEndpointUserName;
            this.structureInitialization = response.structureInitialization;
            this.synchronizationDirection = response.synchronizationDirection;
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
         * DataSynchronization.
         */
        public Builder dataSynchronization(Boolean dataSynchronization) {
            this.putQueryParameter("DataSynchronization", dataSynchronization);
            this.dataSynchronization = dataSynchronization;
            return this;
        }

        /**
         * DbList.
         */
        public Builder dbList(String dbList) {
            this.putBodyParameter("DbList", dbList);
            this.dbList = dbList;
            return this;
        }

        /**
         * DelayNotice.
         */
        public Builder delayNotice(Boolean delayNotice) {
            this.putQueryParameter("DelayNotice", delayNotice);
            this.delayNotice = delayNotice;
            return this;
        }

        /**
         * DelayPhone.
         */
        public Builder delayPhone(String delayPhone) {
            this.putQueryParameter("DelayPhone", delayPhone);
            this.delayPhone = delayPhone;
            return this;
        }

        /**
         * DelayRuleTime.
         */
        public Builder delayRuleTime(Long delayRuleTime) {
            this.putQueryParameter("DelayRuleTime", delayRuleTime);
            this.delayRuleTime = delayRuleTime;
            return this;
        }

        /**
         * DestinationEndpointDataBaseName.
         */
        public Builder destinationEndpointDataBaseName(String destinationEndpointDataBaseName) {
            this.putQueryParameter("DestinationEndpointDataBaseName", destinationEndpointDataBaseName);
            this.destinationEndpointDataBaseName = destinationEndpointDataBaseName;
            return this;
        }

        /**
         * DestinationEndpointEngineName.
         */
        public Builder destinationEndpointEngineName(String destinationEndpointEngineName) {
            this.putQueryParameter("DestinationEndpointEngineName", destinationEndpointEngineName);
            this.destinationEndpointEngineName = destinationEndpointEngineName;
            return this;
        }

        /**
         * DestinationEndpointIP.
         */
        public Builder destinationEndpointIP(String destinationEndpointIP) {
            this.putQueryParameter("DestinationEndpointIP", destinationEndpointIP);
            this.destinationEndpointIP = destinationEndpointIP;
            return this;
        }

        /**
         * DestinationEndpointInstanceID.
         */
        public Builder destinationEndpointInstanceID(String destinationEndpointInstanceID) {
            this.putQueryParameter("DestinationEndpointInstanceID", destinationEndpointInstanceID);
            this.destinationEndpointInstanceID = destinationEndpointInstanceID;
            return this;
        }

        /**
         * DestinationEndpointInstanceType.
         */
        public Builder destinationEndpointInstanceType(String destinationEndpointInstanceType) {
            this.putQueryParameter("DestinationEndpointInstanceType", destinationEndpointInstanceType);
            this.destinationEndpointInstanceType = destinationEndpointInstanceType;
            return this;
        }

        /**
         * DestinationEndpointOracleSID.
         */
        public Builder destinationEndpointOracleSID(String destinationEndpointOracleSID) {
            this.putQueryParameter("DestinationEndpointOracleSID", destinationEndpointOracleSID);
            this.destinationEndpointOracleSID = destinationEndpointOracleSID;
            return this;
        }

        /**
         * DestinationEndpointPassword.
         */
        public Builder destinationEndpointPassword(String destinationEndpointPassword) {
            this.putQueryParameter("DestinationEndpointPassword", destinationEndpointPassword);
            this.destinationEndpointPassword = destinationEndpointPassword;
            return this;
        }

        /**
         * DestinationEndpointPort.
         */
        public Builder destinationEndpointPort(String destinationEndpointPort) {
            this.putQueryParameter("DestinationEndpointPort", destinationEndpointPort);
            this.destinationEndpointPort = destinationEndpointPort;
            return this;
        }

        /**
         * DestinationEndpointRegion.
         */
        public Builder destinationEndpointRegion(String destinationEndpointRegion) {
            this.putQueryParameter("DestinationEndpointRegion", destinationEndpointRegion);
            this.destinationEndpointRegion = destinationEndpointRegion;
            return this;
        }

        /**
         * DestinationEndpointUserName.
         */
        public Builder destinationEndpointUserName(String destinationEndpointUserName) {
            this.putQueryParameter("DestinationEndpointUserName", destinationEndpointUserName);
            this.destinationEndpointUserName = destinationEndpointUserName;
            return this;
        }

        /**
         * DtsInstanceId.
         */
        public Builder dtsInstanceId(String dtsInstanceId) {
            this.putQueryParameter("DtsInstanceId", dtsInstanceId);
            this.dtsInstanceId = dtsInstanceId;
            return this;
        }

        /**
         * DtsJobId.
         */
        public Builder dtsJobId(String dtsJobId) {
            this.putQueryParameter("DtsJobId", dtsJobId);
            this.dtsJobId = dtsJobId;
            return this;
        }

        /**
         * DtsJobName.
         */
        public Builder dtsJobName(String dtsJobName) {
            this.putQueryParameter("DtsJobName", dtsJobName);
            this.dtsJobName = dtsJobName;
            return this;
        }

        /**
         * ErrorNotice.
         */
        public Builder errorNotice(Boolean errorNotice) {
            this.putQueryParameter("ErrorNotice", errorNotice);
            this.errorNotice = errorNotice;
            return this;
        }

        /**
         * ErrorPhone.
         */
        public Builder errorPhone(String errorPhone) {
            this.putQueryParameter("ErrorPhone", errorPhone);
            this.errorPhone = errorPhone;
            return this;
        }

        /**
         * JobType.
         */
        public Builder jobType(String jobType) {
            this.putQueryParameter("JobType", jobType);
            this.jobType = jobType;
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
         * Reserve.
         */
        public Builder reserve(String reserve) {
            this.putBodyParameter("Reserve", reserve);
            this.reserve = reserve;
            return this;
        }

        /**
         * SourceEndpointDatabaseName.
         */
        public Builder sourceEndpointDatabaseName(String sourceEndpointDatabaseName) {
            this.putQueryParameter("SourceEndpointDatabaseName", sourceEndpointDatabaseName);
            this.sourceEndpointDatabaseName = sourceEndpointDatabaseName;
            return this;
        }

        /**
         * SourceEndpointEngineName.
         */
        public Builder sourceEndpointEngineName(String sourceEndpointEngineName) {
            this.putQueryParameter("SourceEndpointEngineName", sourceEndpointEngineName);
            this.sourceEndpointEngineName = sourceEndpointEngineName;
            return this;
        }

        /**
         * SourceEndpointIP.
         */
        public Builder sourceEndpointIP(String sourceEndpointIP) {
            this.putQueryParameter("SourceEndpointIP", sourceEndpointIP);
            this.sourceEndpointIP = sourceEndpointIP;
            return this;
        }

        /**
         * SourceEndpointInstanceID.
         */
        public Builder sourceEndpointInstanceID(String sourceEndpointInstanceID) {
            this.putQueryParameter("SourceEndpointInstanceID", sourceEndpointInstanceID);
            this.sourceEndpointInstanceID = sourceEndpointInstanceID;
            return this;
        }

        /**
         * SourceEndpointInstanceType.
         */
        public Builder sourceEndpointInstanceType(String sourceEndpointInstanceType) {
            this.putQueryParameter("SourceEndpointInstanceType", sourceEndpointInstanceType);
            this.sourceEndpointInstanceType = sourceEndpointInstanceType;
            return this;
        }

        /**
         * SourceEndpointOracleSID.
         */
        public Builder sourceEndpointOracleSID(String sourceEndpointOracleSID) {
            this.putQueryParameter("SourceEndpointOracleSID", sourceEndpointOracleSID);
            this.sourceEndpointOracleSID = sourceEndpointOracleSID;
            return this;
        }

        /**
         * SourceEndpointOwnerID.
         */
        public Builder sourceEndpointOwnerID(String sourceEndpointOwnerID) {
            this.putQueryParameter("SourceEndpointOwnerID", sourceEndpointOwnerID);
            this.sourceEndpointOwnerID = sourceEndpointOwnerID;
            return this;
        }

        /**
         * SourceEndpointPassword.
         */
        public Builder sourceEndpointPassword(String sourceEndpointPassword) {
            this.putQueryParameter("SourceEndpointPassword", sourceEndpointPassword);
            this.sourceEndpointPassword = sourceEndpointPassword;
            return this;
        }

        /**
         * SourceEndpointPort.
         */
        public Builder sourceEndpointPort(String sourceEndpointPort) {
            this.putQueryParameter("SourceEndpointPort", sourceEndpointPort);
            this.sourceEndpointPort = sourceEndpointPort;
            return this;
        }

        /**
         * SourceEndpointRegion.
         */
        public Builder sourceEndpointRegion(String sourceEndpointRegion) {
            this.putQueryParameter("SourceEndpointRegion", sourceEndpointRegion);
            this.sourceEndpointRegion = sourceEndpointRegion;
            return this;
        }

        /**
         * SourceEndpointRole.
         */
        public Builder sourceEndpointRole(String sourceEndpointRole) {
            this.putQueryParameter("SourceEndpointRole", sourceEndpointRole);
            this.sourceEndpointRole = sourceEndpointRole;
            return this;
        }

        /**
         * SourceEndpointUserName.
         */
        public Builder sourceEndpointUserName(String sourceEndpointUserName) {
            this.putQueryParameter("SourceEndpointUserName", sourceEndpointUserName);
            this.sourceEndpointUserName = sourceEndpointUserName;
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

        @Override
        public ConfigureDtsJobRequest build() {
            return new ConfigureDtsJobRequest(this);
        } 

    } 

}
