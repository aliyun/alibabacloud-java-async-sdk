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
 * {@link GetCustomAgentImagePreparationRequest} extends {@link RequestModel}
 *
 * <p>GetCustomAgentImagePreparationRequest</p>
 */
public class GetCustomAgentImagePreparationRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("preparationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String preparationId;

    private GetCustomAgentImagePreparationRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.preparationId = builder.preparationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCustomAgentImagePreparationRequest create() {
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
     * @return preparationId
     */
    public String getPreparationId() {
        return this.preparationId;
    }

    public static final class Builder extends Request.Builder<GetCustomAgentImagePreparationRequest, Builder> {
        private String workspaceId; 
        private String preparationId; 

        private Builder() {
            super();
        } 

        private Builder(GetCustomAgentImagePreparationRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.preparationId = request.preparationId;
        } 

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-example</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The console image preparation task ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-example:1</p>
         */
        public Builder preparationId(String preparationId) {
            this.putPathParameter("preparationId", preparationId);
            this.preparationId = preparationId;
            return this;
        }

        @Override
        public GetCustomAgentImagePreparationRequest build() {
            return new GetCustomAgentImagePreparationRequest(this);
        } 

    } 

}
