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
    @com.aliyun.core.annotation.NameInMap("FeishuChatMemberStaleTtlSeconds")
    @com.aliyun.core.annotation.Validation(maximum = 2147483647)
    private Integer feishuChatMemberStaleTtlSeconds;

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
    @com.aliyun.core.annotation.NameInMap("UserAccessToken")
    private String userAccessToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(maxLength = 255)
    private String userId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserRefreshToken")
    private String userRefreshToken;

    private UpdateKBSyncLinkRequest(Builder builder) {
        super(builder);
        this.clientId = builder.clientId;
        this.clientSecret = builder.clientSecret;
        this.feishuChatMemberStaleTtlSeconds = builder.feishuChatMemberStaleTtlSeconds;
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.linkId = builder.linkId;
        this.mcpEndpoint = builder.mcpEndpoint;
        this.regionId = builder.regionId;
        this.sheetMcpEndpoint = builder.sheetMcpEndpoint;
        this.syncEnabled = builder.syncEnabled;
        this.syncIntervalMinutes = builder.syncIntervalMinutes;
        this.userAccessToken = builder.userAccessToken;
        this.userId = builder.userId;
        this.userRefreshToken = builder.userRefreshToken;
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
     * @return feishuChatMemberStaleTtlSeconds
     */
    public Integer getFeishuChatMemberStaleTtlSeconds() {
        return this.feishuChatMemberStaleTtlSeconds;
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
     * @return userAccessToken
     */
    public String getUserAccessToken() {
        return this.userAccessToken;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return userRefreshToken
     */
    public String getUserRefreshToken() {
        return this.userRefreshToken;
    }

    public static final class Builder extends Request.Builder<UpdateKBSyncLinkRequest, Builder> {
        private String clientId; 
        private String clientSecret; 
        private Integer feishuChatMemberStaleTtlSeconds; 
        private String knowledgeBaseId; 
        private String linkId; 
        private String mcpEndpoint; 
        private String regionId; 
        private String sheetMcpEndpoint; 
        private Boolean syncEnabled; 
        private Integer syncIntervalMinutes; 
        private String userAccessToken; 
        private String userId; 
        private String userRefreshToken; 

        private Builder() {
            super();
        } 

        private Builder(UpdateKBSyncLinkRequest request) {
            super(request);
            this.clientId = request.clientId;
            this.clientSecret = request.clientSecret;
            this.feishuChatMemberStaleTtlSeconds = request.feishuChatMemberStaleTtlSeconds;
            this.knowledgeBaseId = request.knowledgeBaseId;
            this.linkId = request.linkId;
            this.mcpEndpoint = request.mcpEndpoint;
            this.regionId = request.regionId;
            this.sheetMcpEndpoint = request.sheetMcpEndpoint;
            this.syncEnabled = request.syncEnabled;
            this.syncIntervalMinutes = request.syncIntervalMinutes;
            this.userAccessToken = request.userAccessToken;
            this.userId = request.userId;
            this.userRefreshToken = request.userRefreshToken;
        } 

        /**
         * <p>The client ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cli_xxxxxxbe8</p>
         */
        public Builder clientId(String clientId) {
            this.putQueryParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * <p>The client secret.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder clientSecret(String clientSecret) {
            this.putQueryParameter("ClientSecret", clientSecret);
            this.clientSecret = clientSecret;
            return this;
        }

        /**
         * <p>The validity period of a successful Lark group member snapshot used for fallback reuse, in seconds. This parameter can be explicitly set only for FEISHU synchronization links. A value of -1 indicates that the snapshot never expires. A value of 0 disables snapshot fallback reuse. A positive integer indicates the maximum age of a snapshot allowed for reuse. If this parameter is omitted, the original value is retained. Explicitly passing -1 restores the default behavior.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        public Builder feishuChatMemberStaleTtlSeconds(Integer feishuChatMemberStaleTtlSeconds) {
            this.putQueryParameter("FeishuChatMemberStaleTtlSeconds", feishuChatMemberStaleTtlSeconds);
            this.feishuChatMemberStaleTtlSeconds = feishuChatMemberStaleTtlSeconds;
            return this;
        }

        /**
         * <p>The unique identifier of the knowledge base.</p>
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
         * <p>The ID of the synchronization link.</p>
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
         * <p>The endpoint of the DingTalk Docs MCP server.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://mcp-gw.dingtalk.com/server/1a2b3cxxxxxx789?key=d5e6fxxxxxx876">https://mcp-gw.dingtalk.com/server/1a2b3cxxxxxx789?key=d5e6fxxxxxx876</a></p>
         */
        public Builder mcpEndpoint(String mcpEndpoint) {
            this.putQueryParameter("McpEndpoint", mcpEndpoint);
            this.mcpEndpoint = mcpEndpoint;
            return this;
        }

        /**
         * <p>The region ID.</p>
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
         * <p>The endpoint of the DingTalk Sheets MCP server.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://mcp-gw.dingtalk.com/server/1a2b3cxxxxxx567?key=d5e6fxxxxxx543">https://mcp-gw.dingtalk.com/server/1a2b3cxxxxxx567?key=d5e6fxxxxxx543</a></p>
         */
        public Builder sheetMcpEndpoint(String sheetMcpEndpoint) {
            this.putQueryParameter("SheetMcpEndpoint", sheetMcpEndpoint);
            this.sheetMcpEndpoint = sheetMcpEndpoint;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic synchronization. This parameter must be modified individually and cannot be changed along with other configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
         * <p>The new Lark user access token.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder userAccessToken(String userAccessToken) {
            this.putQueryParameter("UserAccessToken", userAccessToken);
            this.userAccessToken = userAccessToken;
            return this;
        }

        /**
         * <p>The ID of the DingTalk user that performs the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>123***56</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * <p>The new Lark user refresh token. Pass this parameter together with UserAccessToken. Passing empty strings for both parameters indicates deletion.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder userRefreshToken(String userRefreshToken) {
            this.putQueryParameter("UserRefreshToken", userRefreshToken);
            this.userRefreshToken = userRefreshToken;
            return this;
        }

        @Override
        public UpdateKBSyncLinkRequest build() {
            return new UpdateKBSyncLinkRequest(this);
        } 

    } 

}
