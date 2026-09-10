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
    @com.aliyun.core.annotation.NameInMap("SheetMcpEndpoint")
    @com.aliyun.core.annotation.Validation(maxLength = 2048)
    private String sheetMcpEndpoint;

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
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(maxLength = 255)
    private String userId;

    private CreateKBSyncLinkRequest(Builder builder) {
        super(builder);
        this.clientId = builder.clientId;
        this.clientSecret = builder.clientSecret;
        this.description = builder.description;
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.linkName = builder.linkName;
        this.mcpEndpoint = builder.mcpEndpoint;
        this.regionId = builder.regionId;
        this.sheetMcpEndpoint = builder.sheetMcpEndpoint;
        this.sourceDir = builder.sourceDir;
        this.sourceType = builder.sourceType;
        this.syncIntervalMinutes = builder.syncIntervalMinutes;
        this.tenantId = builder.tenantId;
        this.userId = builder.userId;
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
     * @return sheetMcpEndpoint
     */
    public String getSheetMcpEndpoint() {
        return this.sheetMcpEndpoint;
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
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<CreateKBSyncLinkRequest, Builder> {
        private String clientId; 
        private String clientSecret; 
        private String description; 
        private String knowledgeBaseId; 
        private String linkName; 
        private String mcpEndpoint; 
        private String regionId; 
        private String sheetMcpEndpoint; 
        private String sourceDir; 
        private String sourceType; 
        private Integer syncIntervalMinutes; 
        private String tenantId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(CreateKBSyncLinkRequest request) {
            super(request);
            this.clientId = request.clientId;
            this.clientSecret = request.clientSecret;
            this.description = request.description;
            this.knowledgeBaseId = request.knowledgeBaseId;
            this.linkName = request.linkName;
            this.mcpEndpoint = request.mcpEndpoint;
            this.regionId = request.regionId;
            this.sheetMcpEndpoint = request.sheetMcpEndpoint;
            this.sourceDir = request.sourceDir;
            this.sourceType = request.sourceType;
            this.syncIntervalMinutes = request.syncIntervalMinutes;
            this.tenantId = request.tenantId;
            this.userId = request.userId;
        } 

        /**
         * <p>The client ID.</p>
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
         * <hr>
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
         * <p>The DingTalk document MCP Server endpoint.</p>
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
         * <p>The DingTalk spreadsheet MCP Server endpoint.</p>
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
         * <p>The source directory address for synchronization.</p>
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
         * <p>The data source type. Valid values: FEISHU and SHAREPOINT.</p>
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
         * <p>The synchronization interval. Unit: minutes.</p>
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
         * <p>The tenant ID. This parameter is required when SourceType is set to SHAREPOINT.</p>
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
         * <p>The DingTalk operator user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123***56</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public CreateKBSyncLinkRequest build() {
            return new CreateKBSyncLinkRequest(this);
        } 

    } 

}
