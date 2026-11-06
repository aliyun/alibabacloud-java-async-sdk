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
 * {@link GetAgentVersionRequest} extends {@link RequestModel}
 *
 * <p>GetAgentVersionRequest</p>
 */
public class GetAgentVersionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentVersion;

    private GetAgentVersionRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.agentId = builder.agentId;
        this.agentVersion = builder.agentVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentVersionRequest create() {
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
     * @return agentVersion
     */
    public String getAgentVersion() {
        return this.agentVersion;
    }

    public static final class Builder extends Request.Builder<GetAgentVersionRequest, Builder> {
        private String workspaceId; 
        private String agentId; 
        private String agentVersion; 

        private Builder() {
            super();
        } 

        private Builder(GetAgentVersionRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.agentId = request.agentId;
            this.agentVersion = request.agentVersion;
        } 

        /**
         * <p>智能体所在的 AgentCore 工作空间 ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-0123456789abcdef01234</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>托管智能体或自定义智能体 ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-0123456789abcdef0123456789abcdef</p>
         */
        public Builder agentId(String agentId) {
            this.putPathParameter("agentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * <p>系统生成的版本号，例如 v1，即 CreateAgentVersion 或 ListAgentVersions 返回的 agentVersion，不是 versionName。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        public Builder agentVersion(String agentVersion) {
            this.putPathParameter("agentVersion", agentVersion);
            this.agentVersion = agentVersion;
            return this;
        }

        @Override
        public GetAgentVersionRequest build() {
            return new GetAgentVersionRequest(this);
        } 

    } 

}
