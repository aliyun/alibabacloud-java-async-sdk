// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link GetWorkspaceDiscoveryEndpointsRequest} extends {@link RequestModel}
 *
 * <p>GetWorkspaceDiscoveryEndpointsRequest</p>
 */
public class GetWorkspaceDiscoveryEndpointsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    private GetWorkspaceDiscoveryEndpointsRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkspaceDiscoveryEndpointsRequest create() {
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

    public static final class Builder extends Request.Builder<GetWorkspaceDiscoveryEndpointsRequest, Builder> {
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(GetWorkspaceDiscoveryEndpointsRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
        } 

        /**
         * workspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public GetWorkspaceDiscoveryEndpointsRequest build() {
            return new GetWorkspaceDiscoveryEndpointsRequest(this);
        } 

    } 

}
