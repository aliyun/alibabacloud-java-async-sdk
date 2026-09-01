// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link UpdateKBSyncLinkRequest} extends {@link RequestModel}
 *
 * <p>UpdateKBSyncLinkRequest</p>
 */
public class UpdateKBSyncLinkRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientId")
    private String clientId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientSecret")
    private String clientSecret;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String knowledgeBaseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LinkId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String linkId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("McpEndpoint")
    @com.aliyun.core.annotation.Validation(maxLength = 2048)
    private String mcpEndpoint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SheetMcpEndpoint")
    @com.aliyun.core.annotation.Validation(maxLength = 2048)
    private String sheetMcpEndpoint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SyncEnabled")
    private Boolean syncEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SyncIntervalMinutes")
    private Integer syncIntervalMinutes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(maxLength = 255)
    private String userId;

    private UpdateKBSyncLinkRequest(Builder builder) {
        super(builder);
        this.clientId = builder.clientId;
        this.clientSecret = builder.clientSecret;
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.linkId = builder.linkId;
        this.mcpEndpoint = builder.mcpEndpoint;
        this.regionId = builder.regionId;
        this.sheetMcpEndpoint = builder.sheetMcpEndpoint;
        this.syncEnabled = builder.syncEnabled;
        this.syncIntervalMinutes = builder.syncIntervalMinutes;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateKBSyncLinkRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientId
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * @return clientSecret
     */
    public String getClientSecret() {
        return this.clientSecret;
    }

    /**
     * @return knowledgeBaseId
     */
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * @return linkId
     */
    public String getLinkId() {
        return this.linkId;
    }

    /**
     * @return mcpEndpoint
     */
    public String getMcpEndpoint() {
        return this.mcpEndpoint;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sheetMcpEndpoint
     */
    public String getSheetMcpEndpoint() {
        return this.sheetMcpEndpoint;
    }

    /**
     * @return syncEnabled
     */
    public Boolean getSyncEnabled() {
        return this.syncEnabled;
    }

    /**
     * @return syncIntervalMinutes
     */
    public Integer getSyncIntervalMinutes() {
        return this.syncIntervalMinutes;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<UpdateKBSyncLinkRequest, Builder> {
        private String clientId; 
        private String clientSecret; 
        private String knowledgeBaseId; 
        private String linkId; 
        private String mcpEndpoint; 
        private String regionId; 
        private String sheetMcpEndpoint; 
        private Boolean syncEnabled; 
        private Integer syncIntervalMinutes; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateKBSyncLinkRequest request) {
            super(request);
            this.clientId = request.clientId;
            this.clientSecret = request.clientSecret;
            this.knowledgeBaseId = request.knowledgeBaseId;
            this.linkId = request.linkId;
            this.mcpEndpoint = request.mcpEndpoint;
            this.regionId = request.regionId;
            this.sheetMcpEndpoint = request.sheetMcpEndpoint;
            this.syncEnabled = request.syncEnabled;
            this.syncIntervalMinutes = request.syncIntervalMinutes;
            this.userId = request.userId;
        } 

        /**
         * ClientId.
         */
        public Builder clientId(String clientId) {
            this.putQueryParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * ClientSecret.
         */
        public Builder clientSecret(String clientSecret) {
            this.putQueryParameter("ClientSecret", clientSecret);
            this.clientSecret = clientSecret;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pkb-xxxxx</p>
         */
        public Builder knowledgeBaseId(String knowledgeBaseId) {
            this.putQueryParameter("KnowledgeBaseId", knowledgeBaseId);
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pkbl-xxxxx</p>
         */
        public Builder linkId(String linkId) {
            this.putQueryParameter("LinkId", linkId);
            this.linkId = linkId;
            return this;
        }

        /**
         * McpEndpoint.
         */
        public Builder mcpEndpoint(String mcpEndpoint) {
            this.putQueryParameter("McpEndpoint", mcpEndpoint);
            this.mcpEndpoint = mcpEndpoint;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SheetMcpEndpoint.
         */
        public Builder sheetMcpEndpoint(String sheetMcpEndpoint) {
            this.putQueryParameter("SheetMcpEndpoint", sheetMcpEndpoint);
            this.sheetMcpEndpoint = sheetMcpEndpoint;
            return this;
        }

        /**
         * SyncEnabled.
         */
        public Builder syncEnabled(Boolean syncEnabled) {
            this.putQueryParameter("SyncEnabled", syncEnabled);
            this.syncEnabled = syncEnabled;
            return this;
        }

        /**
         * <p>20</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder syncIntervalMinutes(Integer syncIntervalMinutes) {
            this.putQueryParameter("SyncIntervalMinutes", syncIntervalMinutes);
            this.syncIntervalMinutes = syncIntervalMinutes;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public UpdateKBSyncLinkRequest build() {
            return new UpdateKBSyncLinkRequest(this);
        } 

    } 

}
