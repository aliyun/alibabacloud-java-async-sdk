// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateGetDBListFromAgentTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateGetDBListFromAgentTaskRequest</p>
 */
public class CreateGetDBListFromAgentTaskRequest extends Request {
    @Query
    @NameInMap("BackupGatewayId")
    private Long backupGatewayId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DatabaseType")
    private String databaseType;

    @Query
    @NameInMap("OwnerId")
    private String ownerId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SourceEndpointIP")
    private String sourceEndpointIP;

    @Query
    @NameInMap("SourceEndpointPort")
    private Integer sourceEndpointPort;

    @Query
    @NameInMap("SourceEndpointRegion")
    private String sourceEndpointRegion;

    private CreateGetDBListFromAgentTaskRequest(Builder builder) {
        super(builder);
        this.backupGatewayId = builder.backupGatewayId;
        this.clientToken = builder.clientToken;
        this.databaseType = builder.databaseType;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.sourceEndpointIP = builder.sourceEndpointIP;
        this.sourceEndpointPort = builder.sourceEndpointPort;
        this.sourceEndpointRegion = builder.sourceEndpointRegion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGetDBListFromAgentTaskRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return databaseType
     */
    public String getDatabaseType() {
        return this.databaseType;
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
     * @return sourceEndpointIP
     */
    public String getSourceEndpointIP() {
        return this.sourceEndpointIP;
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

    public static final class Builder extends Request.Builder<CreateGetDBListFromAgentTaskRequest, Builder> {
        private Long backupGatewayId; 
        private String clientToken; 
        private String databaseType; 
        private String ownerId; 
        private String regionId; 
        private String sourceEndpointIP; 
        private Integer sourceEndpointPort; 
        private String sourceEndpointRegion; 

        private Builder() {
            super();
        } 

        private Builder(CreateGetDBListFromAgentTaskRequest response) {
            super(response);
            this.backupGatewayId = response.backupGatewayId;
            this.clientToken = response.clientToken;
            this.databaseType = response.databaseType;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
            this.sourceEndpointIP = response.sourceEndpointIP;
            this.sourceEndpointPort = response.sourceEndpointPort;
            this.sourceEndpointRegion = response.sourceEndpointRegion;
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
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DatabaseType.
         */
        public Builder databaseType(String databaseType) {
            this.putQueryParameter("DatabaseType", databaseType);
            this.databaseType = databaseType;
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
         * SourceEndpointIP.
         */
        public Builder sourceEndpointIP(String sourceEndpointIP) {
            this.putQueryParameter("SourceEndpointIP", sourceEndpointIP);
            this.sourceEndpointIP = sourceEndpointIP;
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

        @Override
        public CreateGetDBListFromAgentTaskRequest build() {
            return new CreateGetDBListFromAgentTaskRequest(this);
        } 

    } 

}
