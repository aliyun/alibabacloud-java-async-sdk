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
    @com.aliyun.core.annotation.NameInMap("AiTableMcpEndpoint")
    @com.aliyun.core.annotation.Validation(maxLength = 2048)
    private String aiTableMcpEndpoint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChatMemberStaleTtlSeconds")
    @com.aliyun.core.annotation.Validation(maximum = 2147483647)
    private Integer chatMemberStaleTtlSeconds;

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
    @com.aliyun.core.annotation.NameInMap("SelectionMode")
    private String selectionMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SelectionRules")
    private String selectionRules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SheetMcpEndpoint")
    @com.aliyun.core.annotation.Validation(maxLength = 2048)
    private String sheetMcpEndpoint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceDeleteSyncEnabled")
    private Boolean sourceDeleteSyncEnabled;

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
        this.aiTableMcpEndpoint = builder.aiTableMcpEndpoint;
        this.chatMemberStaleTtlSeconds = builder.chatMemberStaleTtlSeconds;
        this.clientId = builder.clientId;
        this.clientSecret = builder.clientSecret;
        this.feishuChatMemberStaleTtlSeconds = builder.feishuChatMemberStaleTtlSeconds;
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.linkId = builder.linkId;
        this.mcpEndpoint = builder.mcpEndpoint;
        this.regionId = builder.regionId;
        this.selectionMode = builder.selectionMode;
        this.selectionRules = builder.selectionRules;
        this.sheetMcpEndpoint = builder.sheetMcpEndpoint;
        this.sourceDeleteSyncEnabled = builder.sourceDeleteSyncEnabled;
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
     * @return aiTableMcpEndpoint
     */
    public String getAiTableMcpEndpoint() {
        return this.aiTableMcpEndpoint;
    }

    /**
     * @return chatMemberStaleTtlSeconds
     */
    public Integer getChatMemberStaleTtlSeconds() {
        return this.chatMemberStaleTtlSeconds;
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
     * @return selectionMode
     */
    public String getSelectionMode() {
        return this.selectionMode;
    }

    /**
     * @return selectionRules
     */
    public String getSelectionRules() {
        return this.selectionRules;
    }

    /**
     * @return sheetMcpEndpoint
     */
    public String getSheetMcpEndpoint() {
        return this.sheetMcpEndpoint;
    }

    /**
     * @return sourceDeleteSyncEnabled
     */
    public Boolean getSourceDeleteSyncEnabled() {
        return this.sourceDeleteSyncEnabled;
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
        private String aiTableMcpEndpoint; 
        private Integer chatMemberStaleTtlSeconds; 
        private String clientId; 
        private String clientSecret; 
        private Integer feishuChatMemberStaleTtlSeconds; 
        private String knowledgeBaseId; 
        private String linkId; 
        private String mcpEndpoint; 
        private String regionId; 
        private String selectionMode; 
        private String selectionRules; 
        private String sheetMcpEndpoint; 
        private Boolean sourceDeleteSyncEnabled; 
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
            this.aiTableMcpEndpoint = request.aiTableMcpEndpoint;
            this.chatMemberStaleTtlSeconds = request.chatMemberStaleTtlSeconds;
            this.clientId = request.clientId;
            this.clientSecret = request.clientSecret;
            this.feishuChatMemberStaleTtlSeconds = request.feishuChatMemberStaleTtlSeconds;
            this.knowledgeBaseId = request.knowledgeBaseId;
            this.linkId = request.linkId;
            this.mcpEndpoint = request.mcpEndpoint;
            this.regionId = request.regionId;
            this.selectionMode = request.selectionMode;
            this.selectionRules = request.selectionRules;
            this.sheetMcpEndpoint = request.sheetMcpEndpoint;
            this.sourceDeleteSyncEnabled = request.sourceDeleteSyncEnabled;
            this.syncEnabled = request.syncEnabled;
            this.syncIntervalMinutes = request.syncIntervalMinutes;
            this.userAccessToken = request.userAccessToken;
            this.userId = request.userId;
            this.userRefreshToken = request.userRefreshToken;
        } 

        /**
         * <p>The endpoint of the DingTalk AI Tables MCP server. An empty string indicates deletion.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://mcp-gw.dingtalk.com/server/example">https://mcp-gw.dingtalk.com/server/example</a></p>
         */
        public Builder aiTableMcpEndpoint(String aiTableMcpEndpoint) {
            this.putQueryParameter("AiTableMcpEndpoint", aiTableMcpEndpoint);
            this.aiTableMcpEndpoint = aiTableMcpEndpoint;
            return this;
        }

        /**
         * <p>The validity period of the successful group member snapshot used for fallback reuse, in seconds. This parameter applies to DingTalk and Lark synchronization links. If this field is explicitly configured, it takes precedence. If not configured, Lark uses FeishuChatMemberStaleTtlSeconds. A value of -1 indicates that the snapshot never expires. A value of 0 disables snapshot fallback reuse. A positive integer indicates the maximum age of successful snapshots in the same workspace, enterprise, and group allowed for reuse. If omitted, the original value is retained. Explicitly passing -1 restores the default behavior.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        public Builder chatMemberStaleTtlSeconds(Integer chatMemberStaleTtlSeconds) {
            this.putQueryParameter("ChatMemberStaleTtlSeconds", chatMemberStaleTtlSeconds);
            this.chatMemberStaleTtlSeconds = chatMemberStaleTtlSeconds;
            return this;
        }

        /**
         * <p>The client identifier.</p>
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
         * <p>The client secret information.</p>
         * 
         * <strong>example:</strong>
         * <p>example-client-secret</p>
         */
        public Builder clientSecret(String clientSecret) {
            this.putQueryParameter("ClientSecret", clientSecret);
            this.clientSecret = clientSecret;
            return this;
        }

        /**
         * <p>The validity period of the successful Lark group member snapshot used for fallback reuse, in seconds. This parameter can only be explicitly set for Lark synchronization links. A value of -1 indicates that the snapshot never expires. A value of 0 disables snapshot fallback reuse. A positive integer indicates the maximum age of the snapshot allowed for reuse. If omitted, the original value is retained. Explicitly passing -1 restores the default behavior.</p>
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
         * <p>This parameter applies only to DingTalk sources and must be set together with SelectionRules. Valid values: ALL: Synchronizes files in the source directory that are not excluded by excludes. The includes parameter must be an empty array. SELECTED: Synchronizes only files that match includes and are not excluded by excludes. If includes is empty, no files are selected. If this parameter is not provided, the original configuration is retained. If both parameters are provided, the original rules are replaced. This parameter cannot be modified at the same time as SyncEnabled. The new configuration takes effect starting from the next synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECTED</p>
         */
        public Builder selectionMode(String selectionMode) {
            this.putQueryParameter("SelectionMode", selectionMode);
            this.selectionMode = selectionMode;
            return this;
        }

        /**
         * <p>The file path filtering rules in JSON format. It only contains two required string arrays: includes and excludes. Paths are relative to SourceDir, and exclusion rules take precedence. GLOB is supported: * and ? do not cross directories, and ** matches zero or more directory levels when it occupies a path segment alone. The two arrays can contain a maximum of 256 entries in total. Each entry must be 1 to 512 characters in length. The maximum size of the JSON text is 65,536 UTF-8 bytes. After a file is removed from the synchronization scope, the corresponding documents imported by this synchronization link are cleared, without affecting the source files and documents of other synchronization links.</p>
         */
        public Builder selectionRules(String selectionRules) {
            this.putQueryParameter("SelectionRules", selectionRules);
            this.selectionRules = selectionRules;
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
         * <p>Specifies whether to synchronize deletions from the source.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder sourceDeleteSyncEnabled(Boolean sourceDeleteSyncEnabled) {
            this.putQueryParameter("SourceDeleteSyncEnabled", sourceDeleteSyncEnabled);
            this.sourceDeleteSyncEnabled = sourceDeleteSyncEnabled;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic synchronization. This parameter can only be modified individually and cannot be changed along with other configurations.</p>
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
         * <p>The automatic synchronization interval, in minutes.</p>
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
         * <p>example-user-access-token</p>
         */
        public Builder userAccessToken(String userAccessToken) {
            this.putQueryParameter("UserAccessToken", userAccessToken);
            this.userAccessToken = userAccessToken;
            return this;
        }

        /**
         * <p>The ID of the DingTalk operator.</p>
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
         * <p>The new Lark user refresh token. It must be provided together with UserAccessToken. Passing two empty strings indicates deletion.</p>
         * 
         * <strong>example:</strong>
         * <p>example-user-refresh-token</p>
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
