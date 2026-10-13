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
 * {@link CancelContextDatabaseSyncRunRequest} extends {@link RequestModel}
 *
 * <p>CancelContextDatabaseSyncRunRequest</p>
 */
public class CancelContextDatabaseSyncRunRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RunId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String runId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private CancelContextDatabaseSyncRunRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.runId = builder.runId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelContextDatabaseSyncRunRequest create() {
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
     * @return runId
     */
    public String getRunId() {
        return this.runId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CancelContextDatabaseSyncRunRequest, Builder> {
        private String clientToken; 
        private String runId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CancelContextDatabaseSyncRunRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.runId = request.runId;
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
         * <p>The run ID, a system-generated UUID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        public Builder runId(String runId) {
            this.putQueryParameter("RunId", runId);
            this.runId = runId;
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
        public CancelContextDatabaseSyncRunRequest build() {
            return new CancelContextDatabaseSyncRunRequest(this);
        } 

    } 

}
