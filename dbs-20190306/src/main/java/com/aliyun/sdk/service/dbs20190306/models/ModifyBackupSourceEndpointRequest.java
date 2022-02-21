// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyBackupSourceEndpointRequest} extends {@link RequestModel}
 *
 * <p>ModifyBackupSourceEndpointRequest</p>
 */
public class ModifyBackupSourceEndpointRequest extends Request {
    @Query
    @NameInMap("BackupGatewayId")
    private Long backupGatewayId;

    @Query
    @NameInMap("BackupObjects")
    private String backupObjects;

    @Query
    @NameInMap("BackupPlanId")
    @Validation(required = true)
    private String backupPlanId;

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
    @NameInMap("OwnerId")
    private String ownerId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SourceEndpointDatabaseName")
    private String sourceEndpointDatabaseName;

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
    @NameInMap("SourceEndpointPassword")
    private String sourceEndpointPassword;

    @Query
    @NameInMap("SourceEndpointPort")
    private Integer sourceEndpointPort;

    @Query
    @NameInMap("SourceEndpointRegion")
    private String sourceEndpointRegion;

    @Query
    @NameInMap("SourceEndpointUserName")
    private String sourceEndpointUserName;

    private ModifyBackupSourceEndpointRequest(Builder builder) {
        super(builder);
        this.backupGatewayId = builder.backupGatewayId;
        this.backupObjects = builder.backupObjects;
        this.backupPlanId = builder.backupPlanId;
        this.clientToken = builder.clientToken;
        this.crossAliyunId = builder.crossAliyunId;
        this.crossRoleName = builder.crossRoleName;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.sourceEndpointDatabaseName = builder.sourceEndpointDatabaseName;
        this.sourceEndpointIP = builder.sourceEndpointIP;
        this.sourceEndpointInstanceID = builder.sourceEndpointInstanceID;
        this.sourceEndpointInstanceType = builder.sourceEndpointInstanceType;
        this.sourceEndpointOracleSID = builder.sourceEndpointOracleSID;
        this.sourceEndpointPassword = builder.sourceEndpointPassword;
        this.sourceEndpointPort = builder.sourceEndpointPort;
        this.sourceEndpointRegion = builder.sourceEndpointRegion;
        this.sourceEndpointUserName = builder.sourceEndpointUserName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyBackupSourceEndpointRequest create() {
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
     * @return backupObjects
     */
    public String getBackupObjects() {
        return this.backupObjects;
    }

    /**
     * @return backupPlanId
     */
    public String getBackupPlanId() {
        return this.backupPlanId;
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
     * @return sourceEndpointDatabaseName
     */
    public String getSourceEndpointDatabaseName() {
        return this.sourceEndpointDatabaseName;
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
     * @return sourceEndpointPassword
     */
    public String getSourceEndpointPassword() {
        return this.sourceEndpointPassword;
    }

    /**
     * @return sourceEndpointPort
     */
    public Integer getSourceEndpointPort() {
        return this.sourceEndpointPort;
    }

    /**
     * @return sourceEndpointRegion
     */
    public String getSourceEndpointRegion() {
        return this.sourceEndpointRegion;
    }

    /**
     * @return sourceEndpointUserName
     */
    public String getSourceEndpointUserName() {
        return this.sourceEndpointUserName;
    }

    public static final class Builder extends Request.Builder<ModifyBackupSourceEndpointRequest, Builder> {
        private Long backupGatewayId; 
        private String backupObjects; 
        private String backupPlanId; 
        private String clientToken; 
        private String crossAliyunId; 
        private String crossRoleName; 
        private String ownerId; 
        private String regionId; 
        private String sourceEndpointDatabaseName; 
        private String sourceEndpointIP; 
        private String sourceEndpointInstanceID; 
        private String sourceEndpointInstanceType; 
        private String sourceEndpointOracleSID; 
        private String sourceEndpointPassword; 
        private Integer sourceEndpointPort; 
        private String sourceEndpointRegion; 
        private String sourceEndpointUserName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyBackupSourceEndpointRequest response) {
            super(response);
            this.backupGatewayId = response.backupGatewayId;
            this.backupObjects = response.backupObjects;
            this.backupPlanId = response.backupPlanId;
            this.clientToken = response.clientToken;
            this.crossAliyunId = response.crossAliyunId;
            this.crossRoleName = response.crossRoleName;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
            this.sourceEndpointDatabaseName = response.sourceEndpointDatabaseName;
            this.sourceEndpointIP = response.sourceEndpointIP;
            this.sourceEndpointInstanceID = response.sourceEndpointInstanceID;
            this.sourceEndpointInstanceType = response.sourceEndpointInstanceType;
            this.sourceEndpointOracleSID = response.sourceEndpointOracleSID;
            this.sourceEndpointPassword = response.sourceEndpointPassword;
            this.sourceEndpointPort = response.sourceEndpointPort;
            this.sourceEndpointRegion = response.sourceEndpointRegion;
            this.sourceEndpointUserName = response.sourceEndpointUserName;
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
         * BackupObjects.
         */
        public Builder backupObjects(String backupObjects) {
            this.putQueryParameter("BackupObjects", backupObjects);
            this.backupObjects = backupObjects;
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
         * SourceEndpointDatabaseName.
         */
        public Builder sourceEndpointDatabaseName(String sourceEndpointDatabaseName) {
            this.putQueryParameter("SourceEndpointDatabaseName", sourceEndpointDatabaseName);
            this.sourceEndpointDatabaseName = sourceEndpointDatabaseName;
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
        public Builder sourceEndpointPort(Integer sourceEndpointPort) {
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
         * SourceEndpointUserName.
         */
        public Builder sourceEndpointUserName(String sourceEndpointUserName) {
            this.putQueryParameter("SourceEndpointUserName", sourceEndpointUserName);
            this.sourceEndpointUserName = sourceEndpointUserName;
            return this;
        }

        @Override
        public ModifyBackupSourceEndpointRequest build() {
            return new ModifyBackupSourceEndpointRequest(this);
        } 

    } 

}
