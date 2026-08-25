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
 * {@link GetUserRequest} extends {@link RequestModel}
 *
 * <p>GetUserRequest</p>
 */
public class GetUserRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentCoreUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentCoreUserId;

    private GetUserRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.agentCoreUserId = builder.agentCoreUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserRequest create() {
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

    public static final class Builder extends Request.Builder<GetUserRequest, Builder> {
        private String workspaceId; 
        private String agentCoreUserId; 

        private Builder() {
            super();
        } 

        private Builder(GetUserRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.agentCoreUserId = request.agentCoreUserId;
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

        @Override
        public GetUserRequest build() {
            return new GetUserRequest(this);
        } 

    } 

}
