// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link DeleteModelConnectionRequest} extends {@link RequestModel}
 *
 * <p>DeleteModelConnectionRequest</p>
 */
public class DeleteModelConnectionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("connectionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String connectionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private DeleteModelConnectionRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.connectionId = builder.connectionId;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteModelConnectionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return connectionId
     */
    public String getConnectionId() {
        return this.connectionId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<DeleteModelConnectionRequest, Builder> {
        private String workspaceId; 
        private String connectionId; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(DeleteModelConnectionRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.connectionId = request.connectionId;
            this.clientToken = request.clientToken;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-1</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mc-1</p>
         */
        public Builder connectionId(String connectionId) {
            this.putPathParameter("connectionId", connectionId);
            this.connectionId = connectionId;
            return this;
        }

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public DeleteModelConnectionRequest build() {
            return new DeleteModelConnectionRequest(this);
        } 

    } 

}
