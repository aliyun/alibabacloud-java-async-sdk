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
 * {@link GetIdentityProviderRequest} extends {@link RequestModel}
 *
 * <p>GetIdentityProviderRequest</p>
 */
public class GetIdentityProviderRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("identityProviderType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String identityProviderType;

    private GetIdentityProviderRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.identityProviderType = builder.identityProviderType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIdentityProviderRequest create() {
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
     * @return identityProviderType
     */
    public String getIdentityProviderType() {
        return this.identityProviderType;
    }

    public static final class Builder extends Request.Builder<GetIdentityProviderRequest, Builder> {
        private String workspaceId; 
        private String identityProviderType; 

        private Builder() {
            super();
        } 

        private Builder(GetIdentityProviderRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.identityProviderType = request.identityProviderType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-123456</p>
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
         * <p>DingTalk</p>
         */
        public Builder identityProviderType(String identityProviderType) {
            this.putPathParameter("identityProviderType", identityProviderType);
            this.identityProviderType = identityProviderType;
            return this;
        }

        @Override
        public GetIdentityProviderRequest build() {
            return new GetIdentityProviderRequest(this);
        } 

    } 

}
