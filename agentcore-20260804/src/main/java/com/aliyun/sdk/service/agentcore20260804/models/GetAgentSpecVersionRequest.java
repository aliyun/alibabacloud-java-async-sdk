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
 * {@link GetAgentSpecVersionRequest} extends {@link RequestModel}
 *
 * <p>GetAgentSpecVersionRequest</p>
 */
public class GetAgentSpecVersionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentSpecName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentSpecName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentSpecVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentSpecVersion;

    private GetAgentSpecVersionRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.agentSpecName = builder.agentSpecName;
        this.agentSpecVersion = builder.agentSpecVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentSpecVersionRequest create() {
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
     * @return agentSpecName
     */
    public String getAgentSpecName() {
        return this.agentSpecName;
    }

    /**
     * @return agentSpecVersion
     */
    public String getAgentSpecVersion() {
        return this.agentSpecVersion;
    }

    public static final class Builder extends Request.Builder<GetAgentSpecVersionRequest, Builder> {
        private String workspaceId; 
        private String agentSpecName; 
        private String agentSpecVersion; 

        private Builder() {
            super();
        } 

        private Builder(GetAgentSpecVersionRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.agentSpecName = request.agentSpecName;
            this.agentSpecVersion = request.agentSpecVersion;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
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
         * <p>my-worker</p>
         */
        public Builder agentSpecName(String agentSpecName) {
            this.putPathParameter("agentSpecName", agentSpecName);
            this.agentSpecName = agentSpecName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        public Builder agentSpecVersion(String agentSpecVersion) {
            this.putPathParameter("agentSpecVersion", agentSpecVersion);
            this.agentSpecVersion = agentSpecVersion;
            return this;
        }

        @Override
        public GetAgentSpecVersionRequest build() {
            return new GetAgentSpecVersionRequest(this);
        } 

    } 

}
