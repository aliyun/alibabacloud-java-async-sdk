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
 * {@link GetModelConnectionRequest} extends {@link RequestModel}
 *
 * <p>GetModelConnectionRequest</p>
 */
public class GetModelConnectionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("connectionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String connectionId;

    private GetModelConnectionRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.connectionId = builder.connectionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetModelConnectionRequest create() {
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
     * @return connectionId
     */
    public String getConnectionId() {
        return this.connectionId;
    }

    public static final class Builder extends Request.Builder<GetModelConnectionRequest, Builder> {
        private String workspaceId; 
        private String connectionId; 

        private Builder() {
            super();
        } 

        private Builder(GetModelConnectionRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.connectionId = request.connectionId;
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
         * <p>mc-1</p>
         */
        public Builder connectionId(String connectionId) {
            this.putPathParameter("connectionId", connectionId);
            this.connectionId = connectionId;
            return this;
        }

        @Override
        public GetModelConnectionRequest build() {
            return new GetModelConnectionRequest(this);
        } 

    } 

}
