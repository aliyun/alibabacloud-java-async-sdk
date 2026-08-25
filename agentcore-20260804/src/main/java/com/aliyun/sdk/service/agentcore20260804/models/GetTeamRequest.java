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
 * {@link GetTeamRequest} extends {@link RequestModel}
 *
 * <p>GetTeamRequest</p>
 */
public class GetTeamRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("teamId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String teamId;

    private GetTeamRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.teamId = builder.teamId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTeamRequest create() {
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

    public static final class Builder extends Request.Builder<GetTeamRequest, Builder> {
        private String workspaceId; 
        private String teamId; 

        private Builder() {
            super();
        } 

        private Builder(GetTeamRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.teamId = request.teamId;
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

        @Override
        public GetTeamRequest build() {
            return new GetTeamRequest(this);
        } 

    } 

}
