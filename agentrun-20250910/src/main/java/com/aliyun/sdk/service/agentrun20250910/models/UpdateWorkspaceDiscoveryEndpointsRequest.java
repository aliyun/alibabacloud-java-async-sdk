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
 * {@link UpdateWorkspaceDiscoveryEndpointsRequest} extends {@link RequestModel}
 *
 * <p>UpdateWorkspaceDiscoveryEndpointsRequest</p>
 */
public class UpdateWorkspaceDiscoveryEndpointsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateDiscoveryEndpointsInput body;

    private UpdateWorkspaceDiscoveryEndpointsRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWorkspaceDiscoveryEndpointsRequest create() {
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
     * @return body
     */
    public UpdateDiscoveryEndpointsInput getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateWorkspaceDiscoveryEndpointsRequest, Builder> {
        private String workspaceId; 
        private UpdateDiscoveryEndpointsInput body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWorkspaceDiscoveryEndpointsRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.body = request.body;
        } 

        /**
         * workspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * body.
         */
        public Builder body(UpdateDiscoveryEndpointsInput body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public UpdateWorkspaceDiscoveryEndpointsRequest build() {
            return new UpdateWorkspaceDiscoveryEndpointsRequest(this);
        } 

    } 

}
