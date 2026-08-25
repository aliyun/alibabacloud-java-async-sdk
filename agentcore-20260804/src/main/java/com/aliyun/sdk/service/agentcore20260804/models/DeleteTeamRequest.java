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
 * {@link DeleteTeamRequest} extends {@link RequestModel}
 *
 * <p>DeleteTeamRequest</p>
 */
public class DeleteTeamRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("teamId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String teamId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private DeleteTeamRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.teamId = builder.teamId;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTeamRequest create() {
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
     * @return teamId
     */
    public String getTeamId() {
        return this.teamId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<DeleteTeamRequest, Builder> {
        private String workspaceId; 
        private String teamId; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTeamRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.teamId = request.teamId;
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
         * <p>tm-123456</p>
         */
        public Builder teamId(String teamId) {
            this.putPathParameter("teamId", teamId);
            this.teamId = teamId;
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
        public DeleteTeamRequest build() {
            return new DeleteTeamRequest(this);
        } 

    } 

}
