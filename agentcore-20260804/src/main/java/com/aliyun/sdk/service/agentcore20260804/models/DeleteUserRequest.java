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
 * {@link DeleteUserRequest} extends {@link RequestModel}
 *
 * <p>DeleteUserRequest</p>
 */
public class DeleteUserRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentCoreUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentCoreUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private DeleteUserRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.agentCoreUserId = builder.agentCoreUserId;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteUserRequest create() {
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
     * @return agentCoreUserId
     */
    public String getAgentCoreUserId() {
        return this.agentCoreUserId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<DeleteUserRequest, Builder> {
        private String workspaceId; 
        private String agentCoreUserId; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(DeleteUserRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.agentCoreUserId = request.agentCoreUserId;
            this.clientToken = request.clientToken;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-123456</p>
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
         * <p>usr-123456</p>
         */
        public Builder agentCoreUserId(String agentCoreUserId) {
            this.putPathParameter("agentCoreUserId", agentCoreUserId);
            this.agentCoreUserId = agentCoreUserId;
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
        public DeleteUserRequest build() {
            return new DeleteUserRequest(this);
        } 

    } 

}
