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
 * {@link GetServiceEndpointApiKeyRequest} extends {@link RequestModel}
 *
 * <p>GetServiceEndpointApiKeyRequest</p>
 */
public class GetServiceEndpointApiKeyRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("serviceEndpointId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceEndpointId;

    private GetServiceEndpointApiKeyRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.serviceEndpointId = builder.serviceEndpointId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceEndpointApiKeyRequest create() {
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
     * @return serviceEndpointId
     */
    public String getServiceEndpointId() {
        return this.serviceEndpointId;
    }

    public static final class Builder extends Request.Builder<GetServiceEndpointApiKeyRequest, Builder> {
        private String workspaceId; 
        private String serviceEndpointId; 

        private Builder() {
            super();
        } 

        private Builder(GetServiceEndpointApiKeyRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.serviceEndpointId = request.serviceEndpointId;
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
         * <p>se-1</p>
         */
        public Builder serviceEndpointId(String serviceEndpointId) {
            this.putPathParameter("serviceEndpointId", serviceEndpointId);
            this.serviceEndpointId = serviceEndpointId;
            return this;
        }

        @Override
        public GetServiceEndpointApiKeyRequest build() {
            return new GetServiceEndpointApiKeyRequest(this);
        } 

    } 

}
