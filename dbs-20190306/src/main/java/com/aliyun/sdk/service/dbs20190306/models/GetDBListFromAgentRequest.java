// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDBListFromAgentRequest} extends {@link RequestModel}
 *
 * <p>GetDBListFromAgentRequest</p>
 */
public class GetDBListFromAgentRequest extends Request {
    @Query
    @NameInMap("BackupGatewayId")
    private Long backupGatewayId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("OwnerId")
    private String ownerId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SourceEndpointRegion")
    private String sourceEndpointRegion;

    @Query
    @NameInMap("TaskId")
    private Long taskId;

    private GetDBListFromAgentRequest(Builder builder) {
        super(builder);
        this.backupGatewayId = builder.backupGatewayId;
        this.clientToken = builder.clientToken;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.sourceEndpointRegion = builder.sourceEndpointRegion;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDBListFromAgentRequest create() {
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
     * @return sourceEndpointRegion
     */
    public String getSourceEndpointRegion() {
        return this.sourceEndpointRegion;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<GetDBListFromAgentRequest, Builder> {
        private Long backupGatewayId; 
        private String clientToken; 
        private String ownerId; 
        private String regionId; 
        private String sourceEndpointRegion; 
        private Long taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetDBListFromAgentRequest request) {
            super(request);
            this.backupGatewayId = request.backupGatewayId;
            this.clientToken = request.clientToken;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.sourceEndpointRegion = request.sourceEndpointRegion;
            this.taskId = request.taskId;
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
         * SourceEndpointRegion.
         */
        public Builder sourceEndpointRegion(String sourceEndpointRegion) {
            this.putQueryParameter("SourceEndpointRegion", sourceEndpointRegion);
            this.sourceEndpointRegion = sourceEndpointRegion;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(Long taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public GetDBListFromAgentRequest build() {
            return new GetDBListFromAgentRequest(this);
        } 

    } 

}
