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
 * {@link FindCustomAgentImagePreparationRequest} extends {@link RequestModel}
 *
 * <p>FindCustomAgentImagePreparationRequest</p>
 */
public class FindCustomAgentImagePreparationRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientToken;

    private FindCustomAgentImagePreparationRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FindCustomAgentImagePreparationRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<FindCustomAgentImagePreparationRequest, Builder> {
        private String workspaceId; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(FindCustomAgentImagePreparationRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.clientToken = request.clientToken;
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
         * <p>The client token submitted when creating or explicitly updating the image. Do not specify AgentId or the operation type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>image-update-20261022-001</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public FindCustomAgentImagePreparationRequest build() {
            return new FindCustomAgentImagePreparationRequest(this);
        } 

    } 

}
