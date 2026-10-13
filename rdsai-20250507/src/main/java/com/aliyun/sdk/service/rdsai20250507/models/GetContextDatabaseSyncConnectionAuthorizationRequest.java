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
 * {@link GetContextDatabaseSyncConnectionAuthorizationRequest} extends {@link RequestModel}
 *
 * <p>GetContextDatabaseSyncConnectionAuthorizationRequest</p>
 */
public class GetContextDatabaseSyncConnectionAuthorizationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String connectionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private GetContextDatabaseSyncConnectionAuthorizationRequest(Builder builder) {
        super(builder);
        this.connectionId = builder.connectionId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetContextDatabaseSyncConnectionAuthorizationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return connectionId
     */
    public String getConnectionId() {
        return this.connectionId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<GetContextDatabaseSyncConnectionAuthorizationRequest, Builder> {
        private String connectionId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(GetContextDatabaseSyncConnectionAuthorizationRequest request) {
            super(request);
            this.connectionId = request.connectionId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The connection ID, which is a system-generated UUID.</p>
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
        public GetContextDatabaseSyncConnectionAuthorizationRequest build() {
            return new GetContextDatabaseSyncConnectionAuthorizationRequest(this);
        } 

    } 

}
