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
 * {@link CreateKBSyncLinkRequest} extends {@link RequestModel}
 *
 * <p>CreateKBSyncLinkRequest</p>
 */
public class CreateKBSyncLinkRequest extends Request {
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
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientSecret")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientSecret;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FeishuChatMemberStaleTtlSeconds")
    @com.aliyun.core.annotation.Validation(maximum = 2147483647)
    private Integer feishuChatMemberStaleTtlSeconds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String knowledgeBaseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LinkName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String linkName;

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
    @com.aliyun.core.annotation.NameInMap("SourceDir")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 2048)
    private String sourceDir;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SyncIntervalMinutes")
    private Integer syncIntervalMinutes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TenantId")
    @com.aliyun.core.annotation.Validation(maxLength = 255)
    private String tenantId;

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

    private CreateKBSyncLinkRequest(Builder builder) {
        super(builder);
        this.aiTableMcpEndpoint = builder.aiTableMcpEndpoint;
        this.chatMemberStaleTtlSeconds = builder.chatMemberStaleTtlSeconds;
        this.clientId = builder.clientId;
        this.clientSecret = builder.clientSecret;
        this.description = builder.description;
        this.feishuChatMemberStaleTtlSeconds = builder.feishuChatMemberStaleTtlSeconds;
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.linkName = builder.linkName;
        this.mcpEndpoint = builder.mcpEndpoint;
        this.regionId = builder.regionId;
        this.selectionMode = builder.selectionMode;
        this.selectionRules = builder.selectionRules;
        this.sheetMcpEndpoint = builder.sheetMcpEndpoint;
        this.sourceDeleteSyncEnabled = builder.sourceDeleteSyncEnabled;
        this.sourceDir = builder.sourceDir;
        this.sourceType = builder.sourceType;
        this.syncIntervalMinutes = builder.syncIntervalMinutes;
        this.tenantId = builder.tenantId;
        this.userAccessToken = builder.userAccessToken;
        this.userId = builder.userId;
        this.userRefreshToken = builder.userRefreshToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateKBSyncLinkRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * @return linkName
     */
    public String getLinkName() {
        return this.linkName;
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
     * @return sourceDir
     */
    public String getSourceDir() {
        return this.sourceDir;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return syncIntervalMinutes
     */
    public Integer getSyncIntervalMinutes() {
        return this.syncIntervalMinutes;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
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

    public static final class Builder extends Request.Builder<CreateKBSyncLinkRequest, Builder> {
        private String aiTableMcpEndpoint; 
        private Integer chatMemberStaleTtlSeconds; 
        private String clientId; 
        private String clientSecret; 
        private String description; 
        private Integer feishuChatMemberStaleTtlSeconds; 
        private String knowledgeBaseId; 
        private String linkName; 
        private String mcpEndpoint; 
        private String regionId; 
        private String selectionMode; 
        private String selectionRules; 
        private String sheetMcpEndpoint; 
        private Boolean sourceDeleteSyncEnabled; 
        private String sourceDir; 
        private String sourceType; 
        private Integer syncIntervalMinutes; 
        private String tenantId; 
        private String userAccessToken; 
        private String userId; 
        private String userRefreshToken; 

        private Builder() {
            super();
        } 

        private Builder(CreateKBSyncLinkRequest request) {
            super(request);
            this.aiTableMcpEndpoint = request.aiTableMcpEndpoint;
            this.chatMemberStaleTtlSeconds = request.chatMemberStaleTtlSeconds;
            this.clientId = request.clientId;
            this.clientSecret = request.clientSecret;
            this.description = request.description;
            this.feishuChatMemberStaleTtlSeconds = request.feishuChatMemberStaleTtlSeconds;
            this.knowledgeBaseId = request.knowledgeBaseId;
            this.linkName = request.linkName;
            this.mcpEndpoint = request.mcpEndpoint;
            this.regionId = request.regionId;
            this.selectionMode = request.selectionMode;
            this.selectionRules = request.selectionRules;
            this.sheetMcpEndpoint = request.sheetMcpEndpoint;
            this.sourceDeleteSyncEnabled = request.sourceDeleteSyncEnabled;
            this.sourceDir = request.sourceDir;
            this.sourceType = request.sourceType;
            this.syncIntervalMinutes = request.syncIntervalMinutes;
            this.tenantId = request.tenantId;
            this.userAccessToken = request.userAccessToken;
            this.userId = request.userId;
            this.userRefreshToken = request.userRefreshToken;
        } 

        /**
         * <p>The endpoint of the DingTalk AI table MCP server.</p>
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
         * <p>The TTL of a successful snapshot of chat members for fallback reuse, in seconds. This parameter applies to DINGTALK and FEISHU synchronization links. If this parameter is explicitly configured, it takes precedence. If it is not configured, Feishu uses the value of FeishuChatMemberStaleTtlSeconds. A value of -1 indicates that the snapshot never expires. A value of 0 indicates that snapshot fallback reuse is disabled. A positive integer indicates the maximum age of a successful snapshot in the same workspace, enterprise, and chat group allowed for reuse. If this parameter is omitted, Feishu uses the legacy dedicated field. If neither is configured, the default value is -1.</p>
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
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
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
         * <p>The description of the synchronization link.</p>
         * 
         * <strong>example:</strong>
         * <p>testDesc</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The time-to-live (TTL) of a successful snapshot of Feishu chat members for fallback reuse, in seconds. This parameter can be explicitly set only for FEISHU synchronization links. A value of -1 indicates that the snapshot never expires. A value of 0 indicates that snapshot fallback reuse is disabled. A positive integer indicates the maximum age of a snapshot allowed for reuse. Default value: -1. If this parameter is omitted, the default value -1 takes effect.</p>
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
         * <p>The name of the synchronization link.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testName</p>
         */
        public Builder linkName(String linkName) {
            this.putQueryParameter("LinkName", linkName);
            this.linkName = linkName;
            return this;
        }

        /**
         * <p>The endpoint of the DingTalk document MCP server.</p>
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
         * <p>The synchronization scope mode. This parameter applies only to DINGTALK sources and must be set together with SelectionRules. Valid values:</p>
         * <ul>
         * <li>ALL: Synchronizes files in the source directory that are not excluded by excludes. The includes array must be empty.</li>
         * <li>SELECTED: Synchronizes only files that match includes and are not excluded by excludes. If includes is empty, no files are selected.
         * New configurations take effect starting from the next synchronization.</li>
         * </ul>
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
         * <p>The file path filtering rules in JSON format. This parameter contains only two required string arrays: includes and excludes. Paths are relative to SourceDir, and exclusion rules take precedence. GLOB is supported: * and ? do not cross directories, and ** matches zero or more directory levels when it occupies a path segment alone. The two arrays can contain a maximum of 256 entries in total. Each entry must be 1 to 512 characters in length. The maximum size of the JSON text is 65,536 UTF-8 bytes. After a file is removed from the synchronization scope, the corresponding document imported by this synchronization link is cleaned up, without affecting the source file or documents of other synchronization links.</p>
         */
        public Builder selectionRules(String selectionRules) {
            this.putQueryParameter("SelectionRules", selectionRules);
            this.selectionRules = selectionRules;
            return this;
        }

        /**
         * <p>The endpoint of the DingTalk sheet MCP server.</p>
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
         * <p>Specifies whether to enable synchronization for source deletions.</p>
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
         * <p>The address of the source directory for synchronization.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.feishu.cn/wiki/space/xxxxxx">https://example.feishu.cn/wiki/space/xxxxxx</a></p>
         */
        public Builder sourceDir(String sourceDir) {
            this.putQueryParameter("SourceDir", sourceDir);
            this.sourceDir = sourceDir;
            return this;
        }

        /**
         * <p>The data source type. Valid values: OSS, DINGTALK, FEISHU, and SHAREPOINT.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FEISHU</p>
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>The synchronization interval, in minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder syncIntervalMinutes(Integer syncIntervalMinutes) {
            this.putQueryParameter("SyncIntervalMinutes", syncIntervalMinutes);
            this.syncIntervalMinutes = syncIntervalMinutes;
            return this;
        }

        /**
         * <p>The ID of the source tenant. This parameter is required and must be set to the Entra tenant ID when SourceType is set to SHAREPOINT, the tenant_key when SourceType is set to FEISHU, or the corpId when SourceType is set to DINGTALK. This parameter is not required when SourceType is set to OSS.</p>
         * 
         * <strong>example:</strong>
         * <p>63eexxxx-xxxx-xxxx-xxxx-xxxxxx090f82</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>The Feishu user access token. This token is used only when the application identity cannot expand chat members because the bot is not in the chat group.</p>
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
         * <p>The Feishu user refresh token. This token must be provided together with UserAccessToken to automatically rotate the fallback identity for expanding chat members.</p>
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
        public CreateKBSyncLinkRequest build() {
            return new CreateKBSyncLinkRequest(this);
        } 

    } 

}
