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
 * {@link ListIdentityProviderSCIMCredentialsRequest} extends {@link RequestModel}
 *
 * <p>ListIdentityProviderSCIMCredentialsRequest</p>
 */
public class ListIdentityProviderSCIMCredentialsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private ListIdentityProviderSCIMCredentialsRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIdentityProviderSCIMCredentialsRequest create() {
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

    public static final class Builder extends Request.Builder<ListIdentityProviderSCIMCredentialsRequest, Builder> {
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListIdentityProviderSCIMCredentialsRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The ID of the target workspace. This parameter is required. The request region must be the same as the region of the target workspace.</p>
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

        @Override
        public ListIdentityProviderSCIMCredentialsRequest build() {
            return new ListIdentityProviderSCIMCredentialsRequest(this);
        } 

    } 

}
