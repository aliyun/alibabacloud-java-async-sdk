// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRestoreTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateRestoreTaskRequest</p>
 */
public class CreateRestoreTaskRequest extends Request {
    @Query
    @NameInMap("BackupGatewayId")
    private Long backupGatewayId;

    @Query
    @NameInMap("BackupPlanId")
    @Validation(required = true)
    private String backupPlanId;

    @Query
    @NameInMap("BackupSetId")
    private String backupSetId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("CrossAliyunId")
    private String crossAliyunId;

    @Query
    @NameInMap("CrossRoleName")
    private String crossRoleName;

    @Query
    @NameInMap("DestinationEndpointDatabaseName")
    private String destinationEndpointDatabaseName;

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
    private Integer destinationEndpointPort;

    @Query
    @NameInMap("DestinationEndpointRegion")
    private String destinationEndpointRegion;

    @Query
    @NameInMap("DestinationEndpointUserName")
    private String destinationEndpointUserName;

    @Query
    @NameInMap("DuplicateConflict")
    private String duplicateConflict;

    @Query
    @NameInMap("OwnerId")
    private String ownerId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("RestoreDir")
    private String restoreDir;

    @Query
    @NameInMap("RestoreHome")
    private String restoreHome;

    @Query
    @NameInMap("RestoreObjects")
    private String restoreObjects;

    @Query
    @NameInMap("RestoreTaskName")
    @Validation(required = true)
    private String restoreTaskName;

    @Query
    @NameInMap("RestoreTime")
    private Long restoreTime;

    private CreateRestoreTaskRequest(Builder builder) {
        super(builder);
        this.backupGatewayId = builder.backupGatewayId;
        this.backupPlanId = builder.backupPlanId;
        this.backupSetId = builder.backupSetId;
        this.clientToken = builder.clientToken;
        this.crossAliyunId = builder.crossAliyunId;
        this.crossRoleName = builder.crossRoleName;
        this.destinationEndpointDatabaseName = builder.destinationEndpointDatabaseName;
        this.destinationEndpointIP = builder.destinationEndpointIP;
        this.destinationEndpointInstanceID = builder.destinationEndpointInstanceID;
        this.destinationEndpointInstanceType = builder.destinationEndpointInstanceType;
        this.destinationEndpointOracleSID = builder.destinationEndpointOracleSID;
        this.destinationEndpointPassword = builder.destinationEndpointPassword;
        this.destinationEndpointPort = builder.destinationEndpointPort;
        this.destinationEndpointRegion = builder.destinationEndpointRegion;
        this.destinationEndpointUserName = builder.destinationEndpointUserName;
        this.duplicateConflict = builder.duplicateConflict;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.restoreDir = builder.restoreDir;
        this.restoreHome = builder.restoreHome;
        this.restoreObjects = builder.restoreObjects;
        this.restoreTaskName = builder.restoreTaskName;
        this.restoreTime = builder.restoreTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRestoreTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupGatewayId
     */
    public Long getBackupGatewayId() {
        return this.backupGatewayId;
    }

    /**
     * @return backupPlanId
     */
    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    /**
     * @return backupSetId
     */
    public String getBackupSetId() {
        return this.backupSetId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return crossAliyunId
     */
    public String getCrossAliyunId() {
        return this.crossAliyunId;
    }

    /**
     * @return crossRoleName
     */
    public String getCrossRoleName() {
        return this.crossRoleName;
    }

    /**
     * @return destinationEndpointDatabaseName
     */
    public String getDestinationEndpointDatabaseName() {
        return this.destinationEndpointDatabaseName;
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
    public Integer getDestinationEndpointPort() {
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
     * @return duplicateConflict
     */
    public String getDuplicateConflict() {
        return this.duplicateConflict;
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
     * @return restoreDir
     */
    public String getRestoreDir() {
        return this.restoreDir;
    }

    /**
     * @return restoreHome
     */
    public String getRestoreHome() {
        return this.restoreHome;
    }

    /**
     * @return restoreObjects
     */
    public String getRestoreObjects() {
        return this.restoreObjects;
    }

    /**
     * @return restoreTaskName
     */
    public String getRestoreTaskName() {
        return this.restoreTaskName;
    }

    /**
     * @return restoreTime
     */
    public Long getRestoreTime() {
        return this.restoreTime;
    }

    public static final class Builder extends Request.Builder<CreateRestoreTaskRequest, Builder> {
        private Long backupGatewayId; 
        private String backupPlanId; 
        private String backupSetId; 
        private String clientToken; 
        private String crossAliyunId; 
        private String crossRoleName; 
        private String destinationEndpointDatabaseName; 
        private String destinationEndpointIP; 
        private String destinationEndpointInstanceID; 
        private String destinationEndpointInstanceType; 
        private String destinationEndpointOracleSID; 
        private String destinationEndpointPassword; 
        private Integer destinationEndpointPort; 
        private String destinationEndpointRegion; 
        private String destinationEndpointUserName; 
        private String duplicateConflict; 
        private String ownerId; 
        private String regionId; 
        private String restoreDir; 
        private String restoreHome; 
        private String restoreObjects; 
        private String restoreTaskName; 
        private Long restoreTime; 

        private Builder() {
            super();
        } 

        private Builder(CreateRestoreTaskRequest response) {
            super(response);
            this.backupGatewayId = response.backupGatewayId;
            this.backupPlanId = response.backupPlanId;
            this.backupSetId = response.backupSetId;
            this.clientToken = response.clientToken;
            this.crossAliyunId = response.crossAliyunId;
            this.crossRoleName = response.crossRoleName;
            this.destinationEndpointDatabaseName = response.destinationEndpointDatabaseName;
            this.destinationEndpointIP = response.destinationEndpointIP;
            this.destinationEndpointInstanceID = response.destinationEndpointInstanceID;
            this.destinationEndpointInstanceType = response.destinationEndpointInstanceType;
            this.destinationEndpointOracleSID = response.destinationEndpointOracleSID;
            this.destinationEndpointPassword = response.destinationEndpointPassword;
            this.destinationEndpointPort = response.destinationEndpointPort;
            this.destinationEndpointRegion = response.destinationEndpointRegion;
            this.destinationEndpointUserName = response.destinationEndpointUserName;
            this.duplicateConflict = response.duplicateConflict;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
            this.restoreDir = response.restoreDir;
            this.restoreHome = response.restoreHome;
            this.restoreObjects = response.restoreObjects;
            this.restoreTaskName = response.restoreTaskName;
            this.restoreTime = response.restoreTime;
        } 

        /**
         * BackupGatewayId.
         */
        public Builder backupGatewayId(Long backupGatewayId) {
            this.putQueryParameter("BackupGatewayId", backupGatewayId);
            this.backupGatewayId = backupGatewayId;
            return this;
        }

        /**
         * BackupPlanId.
         */
        public Builder backupPlanId(String backupPlanId) {
            this.putQueryParameter("BackupPlanId", backupPlanId);
            this.backupPlanId = backupPlanId;
            return this;
        }

        /**
         * BackupSetId.
         */
        public Builder backupSetId(String backupSetId) {
            this.putQueryParameter("BackupSetId", backupSetId);
            this.backupSetId = backupSetId;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * CrossAliyunId.
         */
        public Builder crossAliyunId(String crossAliyunId) {
            this.putQueryParameter("CrossAliyunId", crossAliyunId);
            this.crossAliyunId = crossAliyunId;
            return this;
        }

        /**
         * CrossRoleName.
         */
        public Builder crossRoleName(String crossRoleName) {
            this.putQueryParameter("CrossRoleName", crossRoleName);
            this.crossRoleName = crossRoleName;
            return this;
        }

        /**
         * DestinationEndpointDatabaseName.
         */
        public Builder destinationEndpointDatabaseName(String destinationEndpointDatabaseName) {
            this.putQueryParameter("DestinationEndpointDatabaseName", destinationEndpointDatabaseName);
            this.destinationEndpointDatabaseName = destinationEndpointDatabaseName;
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
        public Builder destinationEndpointPort(Integer destinationEndpointPort) {
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
         * DuplicateConflict.
         */
        public Builder duplicateConflict(String duplicateConflict) {
            this.putQueryParameter("DuplicateConflict", duplicateConflict);
            this.duplicateConflict = duplicateConflict;
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
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RestoreDir.
         */
        public Builder restoreDir(String restoreDir) {
            this.putQueryParameter("RestoreDir", restoreDir);
            this.restoreDir = restoreDir;
            return this;
        }

        /**
         * RestoreHome.
         */
        public Builder restoreHome(String restoreHome) {
            this.putQueryParameter("RestoreHome", restoreHome);
            this.restoreHome = restoreHome;
            return this;
        }

        /**
         * RestoreObjects.
         */
        public Builder restoreObjects(String restoreObjects) {
            this.putQueryParameter("RestoreObjects", restoreObjects);
            this.restoreObjects = restoreObjects;
            return this;
        }

        /**
         * RestoreTaskName.
         */
        public Builder restoreTaskName(String restoreTaskName) {
            this.putQueryParameter("RestoreTaskName", restoreTaskName);
            this.restoreTaskName = restoreTaskName;
            return this;
        }

        /**
         * RestoreTime.
         */
        public Builder restoreTime(Long restoreTime) {
            this.putQueryParameter("RestoreTime", restoreTime);
            this.restoreTime = restoreTime;
            return this;
        }

        @Override
        public CreateRestoreTaskRequest build() {
            return new CreateRestoreTaskRequest(this);
        } 

    } 

}
