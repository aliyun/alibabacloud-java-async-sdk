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
 * {@link CreateAgentVersionRequest} extends {@link RequestModel}
 *
 * <p>CreateAgentVersionRequest</p>
 */
public class CreateAgentVersionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private CreateAgentVersionRequestBody body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private CreateAgentVersionRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.agentId = builder.agentId;
        this.body = builder.body;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAgentVersionRequest create() {
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
     * @return body
     */
    public CreateAgentVersionRequestBody getBody() {
        return this.body;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<CreateAgentVersionRequest, Builder> {
        private String workspaceId; 
        private String agentId; 
        private CreateAgentVersionRequestBody body; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(CreateAgentVersionRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.agentId = request.agentId;
            this.body = request.body;
            this.clientToken = request.clientToken;
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
         * <p>保存版本的请求体。</p>
         */
        public Builder body(CreateAgentVersionRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        /**
         * <p>客户端生成的幂等令牌，当前为预留参数，后端暂不提供持久化幂等保证。</p>
         * 
         * <strong>example:</strong>
         * <p>c2d8a6f0-3b1e-4a7d-9f25-6e4b0c1a8d37</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public CreateAgentVersionRequest build() {
            return new CreateAgentVersionRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateAgentVersionRequest} extends {@link TeaModel}
     *
     * <p>CreateAgentVersionRequest</p>
     */
    public static class CreateAgentVersionRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("versionName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String versionName;

        private CreateAgentVersionRequestBody(Builder builder) {
            this.description = builder.description;
            this.versionName = builder.versionName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateAgentVersionRequestBody create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return versionName
         */
        public String getVersionName() {
            return this.versionName;
        }

        public static final class Builder {
            private String description; 
            private String versionName; 

            private Builder() {
            } 

            private Builder(CreateAgentVersionRequestBody model) {
                this.description = model.description;
                this.versionName = model.versionName;
            } 

            /**
             * <p>版本描述，最多 1024 个字符，保存后不可修改。</p>
             * 
             * <strong>example:</strong>
             * <p>生产环境稳定版本</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>用户自定义的展示名称，去除首尾空白后为 1 至 128 个字符，可包含中文、大小写字母、空格和标点，不能包含控制字符。同一 Agent 下未删除的版本名称唯一，区分大小写，保存后不可修改。版本号 agentVersion 由系统生成，不由此字段决定。</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>生产稳定版 V1.0</p>
             */
            public Builder versionName(String versionName) {
                this.versionName = versionName;
                return this;
            }

            public CreateAgentVersionRequestBody build() {
                return new CreateAgentVersionRequestBody(this);
            } 

        } 

    }
}
