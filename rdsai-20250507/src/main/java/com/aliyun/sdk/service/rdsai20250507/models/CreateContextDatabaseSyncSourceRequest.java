// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link CreateContextDatabaseSyncSourceRequest} extends {@link RequestModel}
 *
 * <p>CreateContextDatabaseSyncSourceRequest</p>
 */
public class CreateContextDatabaseSyncSourceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String connectionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.Map<String, ?> sourceConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private CreateContextDatabaseSyncSourceRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.connectionId = builder.connectionId;
        this.name = builder.name;
        this.sourceConfig = builder.sourceConfig;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateContextDatabaseSyncSourceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return connectionId
     */
    public String getConnectionId() {
        return this.connectionId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return sourceConfig
     */
    public java.util.Map<String, ?> getSourceConfig() {
        return this.sourceConfig;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateContextDatabaseSyncSourceRequest, Builder> {
        private String clientToken; 
        private String connectionId; 
        private String name; 
        private java.util.Map<String, ?> sourceConfig; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateContextDatabaseSyncSourceRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.connectionId = request.connectionId;
            this.name = request.name;
            this.sourceConfig = request.sourceConfig;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The idempotence token.</p>
         * 
         * <strong>example:</strong>
         * <p>sync-connection-20260923-001</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The connection ID, a system-generated UUID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        public Builder connectionId(String connectionId) {
            this.putQueryParameter("ConnectionId", connectionId);
            this.connectionId = connectionId;
            return this;
        }

        /**
         * <p>The name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>R&amp;D team document scope</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The datasource config. The structure varies depending on the plug-in.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;folderIds&quot;:[&quot;<a href="https://alidocs.dingtalk.com/i/p/p2N9kLmQxYz****%22%5D,%22pageSize%22:50,%22maxDepth%22:5%7D">https://alidocs.dingtalk.com/i/p/p2N9kLmQxYz****&quot;],&quot;pageSize&quot;:50,&quot;maxDepth&quot;:5}</a></p>
         */
        public Builder sourceConfig(java.util.Map<String, ?> sourceConfig) {
            String sourceConfigShrink = shrink(sourceConfig, "SourceConfig", "json");
            this.putQueryParameter("SourceConfig", sourceConfigShrink);
            this.sourceConfig = sourceConfig;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-as1llqmkol****</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateContextDatabaseSyncSourceRequest build() {
            return new CreateContextDatabaseSyncSourceRequest(this);
        } 

    } 

}
