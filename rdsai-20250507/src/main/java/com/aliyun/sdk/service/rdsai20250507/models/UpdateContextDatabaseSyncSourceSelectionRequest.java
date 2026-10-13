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
 * {@link UpdateContextDatabaseSyncSourceSelectionRequest} extends {@link RequestModel}
 *
 * <p>UpdateContextDatabaseSyncSourceSelectionRequest</p>
 */
public class UpdateContextDatabaseSyncSourceSelectionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SelectedNodeKeys")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> selectedNodeKeys;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SelectionPolicy")
    private String selectionPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private UpdateContextDatabaseSyncSourceSelectionRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.selectedNodeKeys = builder.selectedNodeKeys;
        this.selectionPolicy = builder.selectionPolicy;
        this.sourceId = builder.sourceId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateContextDatabaseSyncSourceSelectionRequest create() {
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
     * @return selectedNodeKeys
     */
    public java.util.List<String> getSelectedNodeKeys() {
        return this.selectedNodeKeys;
    }

    /**
     * @return selectionPolicy
     */
    public String getSelectionPolicy() {
        return this.selectionPolicy;
    }

    /**
     * @return sourceId
     */
    public String getSourceId() {
        return this.sourceId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<UpdateContextDatabaseSyncSourceSelectionRequest, Builder> {
        private String clientToken; 
        private java.util.List<String> selectedNodeKeys; 
        private String selectionPolicy; 
        private String sourceId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateContextDatabaseSyncSourceSelectionRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.selectedNodeKeys = request.selectedNodeKeys;
            this.selectionPolicy = request.selectionPolicy;
            this.sourceId = request.sourceId;
            this.workspaceId = request.workspaceId;
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
         * <p>The list of selected node identifiers.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;doc:1234567890&quot;]</p>
         */
        public Builder selectedNodeKeys(java.util.List<String> selectedNodeKeys) {
            String selectedNodeKeysShrink = shrink(selectedNodeKeys, "SelectedNodeKeys", "json");
            this.putQueryParameter("SelectedNodeKeys", selectedNodeKeysShrink);
            this.selectedNodeKeys = selectedNodeKeys;
            return this;
        }

        /**
         * <p>The selection policy.</p>
         * 
         * <strong>example:</strong>
         * <p>subtree</p>
         */
        public Builder selectionPolicy(String selectionPolicy) {
            this.putQueryParameter("SelectionPolicy", selectionPolicy);
            this.selectionPolicy = selectionPolicy;
            return this;
        }

        /**
         * <p>The data source ID, which is a system-generated UUID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        public Builder sourceId(String sourceId) {
            this.putQueryParameter("SourceId", sourceId);
            this.sourceId = sourceId;
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
        public UpdateContextDatabaseSyncSourceSelectionRequest build() {
            return new UpdateContextDatabaseSyncSourceSelectionRequest(this);
        } 

    } 

}
