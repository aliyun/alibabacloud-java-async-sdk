// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

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
 * {@link GetDBListFromAgentRequest} extends {@link RequestModel}
 *
 * <p>GetDBListFromAgentRequest</p>
 */
public class GetDBListFromAgentRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupGatewayId")
    private Long backupGatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupGatewayIdentifier")
    private String backupGatewayIdentifier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceEndpointRegion")
    private String sourceEndpointRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private Long taskId;

    private GetDBListFromAgentRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.backupGatewayId = builder.backupGatewayId;
        this.backupGatewayIdentifier = builder.backupGatewayIdentifier;
        this.clientToken = builder.clientToken;
        this.ownerId = builder.ownerId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return backupGatewayId
     */
    public Long getBackupGatewayId() {
        return this.backupGatewayId;
    }

    /**
     * @return backupGatewayIdentifier
     */
    public String getBackupGatewayIdentifier() {
        return this.backupGatewayIdentifier;
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
        private String regionId; 
        private Long backupGatewayId; 
        private String backupGatewayIdentifier; 
        private String clientToken; 
        private String ownerId; 
        private String sourceEndpointRegion; 
        private Long taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetDBListFromAgentRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.backupGatewayId = request.backupGatewayId;
            this.backupGatewayIdentifier = request.backupGatewayIdentifier;
            this.clientToken = request.clientToken;
            this.ownerId = request.ownerId;
            this.sourceEndpointRegion = request.sourceEndpointRegion;
            this.taskId = request.taskId;
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
         * <p>The ID of the backup gateway. You can call the <a href="https://help.aliyun.com/document_detail/2869840.html">DescribeBackupGatewayList</a> operation to obtain the value of this parameter.</p>
         * <blockquote>
         * <p>This parameter is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>160***</p>
         */
        public Builder backupGatewayId(Long backupGatewayId) {
            this.putQueryParameter("BackupGatewayId", backupGatewayId);
            this.backupGatewayId = backupGatewayId;
            return this;
        }

        /**
         * <p>The unique identifier of the backup gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>4DF900B7082BC3****489D765C8D2ABE</p>
         */
        public Builder backupGatewayIdentifier(String backupGatewayIdentifier) {
            this.putQueryParameter("BackupGatewayIdentifier", backupGatewayIdentifier);
            this.backupGatewayIdentifier = backupGatewayIdentifier;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request and prevent duplicate submissions. The token is generated by the client and must be unique across different requests. It can be up to 64 ASCII characters in length and cannot contain non-ASCII characters.</p>
         * 
         * <strong>example:</strong>
         * <p>ETnLKlblzczshOTUbOCzxxxxxxxxxx</p>
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
         * <p>The region ID of the backup gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder sourceEndpointRegion(String sourceEndpointRegion) {
            this.putQueryParameter("SourceEndpointRegion", sourceEndpointRegion);
            this.sourceEndpointRegion = sourceEndpointRegion;
            return this;
        }

        /**
         * <p>The ID of the asynchronous task. Call the <a href="https://help.aliyun.com/document_detail/2869847.html">CreateGetDBListFromAgentTask</a> operation to obtain the value of this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
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
