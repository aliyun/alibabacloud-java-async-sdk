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
 * {@link CreateCustomAgentDebugTokenRequest} extends {@link RequestModel}
 *
 * <p>CreateCustomAgentDebugTokenRequest</p>
 */
public class CreateCustomAgentDebugTokenRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("networkType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String networkType;

    private CreateCustomAgentDebugTokenRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.agentId = builder.agentId;
        this.networkType = builder.networkType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustomAgentDebugTokenRequest create() {
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
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
    }

    public static final class Builder extends Request.Builder<CreateCustomAgentDebugTokenRequest, Builder> {
        private String workspaceId; 
        private String agentId; 
        private String networkType; 

        private Builder() {
            super();
        } 

        private Builder(CreateCustomAgentDebugTokenRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.agentId = request.agentId;
            this.networkType = request.networkType;
        } 

        /**
         * <p>The ID of the workspace to which the high-code agent belongs.</p>
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
         * <p>The ID of the high-code agent to debug locally.</p>
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
         * <p>The network type used for local debugging. INTERNET indicates public network access. INTRANET indicates access over a virtual private cloud (VPC).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>INTERNET</p>
         */
        public Builder networkType(String networkType) {
            this.putQueryParameter("networkType", networkType);
            this.networkType = networkType;
            return this;
        }

        @Override
        public CreateCustomAgentDebugTokenRequest build() {
            return new CreateCustomAgentDebugTokenRequest(this);
        } 

    } 

}
