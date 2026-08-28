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
 * {@link DeleteAgentSpecRequest} extends {@link RequestModel}
 *
 * <p>DeleteAgentSpecRequest</p>
 */
public class DeleteAgentSpecRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentSpecName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentSpecName;

    private DeleteAgentSpecRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.agentSpecName = builder.agentSpecName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAgentSpecRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteAgentSpecRequest, Builder> {
        private String workspaceId; 
        private String agentSpecName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAgentSpecRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.agentSpecName = request.agentSpecName;
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

        @Override
        public DeleteAgentSpecRequest build() {
            return new DeleteAgentSpecRequest(this);
        } 

    } 

}
