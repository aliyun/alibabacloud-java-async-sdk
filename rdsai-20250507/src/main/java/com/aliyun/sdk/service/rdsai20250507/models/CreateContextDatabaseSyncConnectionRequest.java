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
 * {@link CreateContextDatabaseSyncConnectionRequest} extends {@link RequestModel}
 *
 * <p>CreateContextDatabaseSyncConnectionRequest</p>
 */
public class CreateContextDatabaseSyncConnectionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthKind")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authKind;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisplayName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String displayName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PluginId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pluginId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private CreateContextDatabaseSyncConnectionRequest(Builder builder) {
        super(builder);
        this.authKind = builder.authKind;
        this.clientToken = builder.clientToken;
        this.displayName = builder.displayName;
        this.pluginId = builder.pluginId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateContextDatabaseSyncConnectionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authKind
     */
    public String getAuthKind() {
        return this.authKind;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return pluginId
     */
    public String getPluginId() {
        return this.pluginId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateContextDatabaseSyncConnectionRequest, Builder> {
        private String authKind; 
        private String clientToken; 
        private String displayName; 
        private String pluginId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateContextDatabaseSyncConnectionRequest request) {
            super(request);
            this.authKind = request.authKind;
            this.clientToken = request.clientToken;
            this.displayName = request.displayName;
            this.pluginId = request.pluginId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The authorization method. Valid values: app, pasted-url, static-secret, and none.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app</p>
         */
        public Builder authKind(String authKind) {
            this.putQueryParameter("AuthKind", authKind);
            this.authKind = authKind;
            return this;
        }

        /**
         * <p>The idempotency token.</p>
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
         * <p>The display name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>R&amp;D team DingTalk data source</p>
         */
        public Builder displayName(String displayName) {
            this.putQueryParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>The plugin ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dingtalk</p>
         */
        public Builder pluginId(String pluginId) {
            this.putQueryParameter("PluginId", pluginId);
            this.pluginId = pluginId;
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
        public CreateContextDatabaseSyncConnectionRequest build() {
            return new CreateContextDatabaseSyncConnectionRequest(this);
        } 

    } 

}
