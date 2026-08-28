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
 * {@link GetAgentIMChannelRequest} extends {@link RequestModel}
 *
 * <p>GetAgentIMChannelRequest</p>
 */
public class GetAgentIMChannelRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("imChannelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imChannelId;

    private GetAgentIMChannelRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.agentId = builder.agentId;
        this.imChannelId = builder.imChannelId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentIMChannelRequest create() {
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
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
    }

    /**
     * @return imChannelId
     */
    public String getImChannelId() {
        return this.imChannelId;
    }

    public static final class Builder extends Request.Builder<GetAgentIMChannelRequest, Builder> {
        private String workspaceId; 
        private String agentId; 
        private String imChannelId; 

        private Builder() {
            super();
        } 

        private Builder(GetAgentIMChannelRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.agentId = request.agentId;
            this.imChannelId = request.imChannelId;
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
         * <p>agent-1</p>
         */
        public Builder agentId(String agentId) {
            this.putPathParameter("agentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>imc-1</p>
         */
        public Builder imChannelId(String imChannelId) {
            this.putPathParameter("imChannelId", imChannelId);
            this.imChannelId = imChannelId;
            return this;
        }

        @Override
        public GetAgentIMChannelRequest build() {
            return new GetAgentIMChannelRequest(this);
        } 

    } 

}
