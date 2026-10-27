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
 * {@link GetIdentityProviderServiceProviderRequest} extends {@link RequestModel}
 *
 * <p>GetIdentityProviderServiceProviderRequest</p>
 */
public class GetIdentityProviderServiceProviderRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("identityProviderType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String identityProviderType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("protocol")
    @com.aliyun.core.annotation.Validation(required = true)
    private String protocol;

    private GetIdentityProviderServiceProviderRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.identityProviderType = builder.identityProviderType;
        this.protocol = builder.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIdentityProviderServiceProviderRequest create() {
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

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    public static final class Builder extends Request.Builder<GetIdentityProviderServiceProviderRequest, Builder> {
        private String workspaceId; 
        private String identityProviderType; 
        private String protocol; 

        private Builder() {
            super();
        } 

        private Builder(GetIdentityProviderServiceProviderRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.identityProviderType = request.identityProviderType;
            this.protocol = request.protocol;
        } 

        /**
         * <p>必填，目标 Workspace 的标识；请求地域需与目标 Workspace 一致。</p>
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
         * <p>本接口仅支持 CustomSSO。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CustomSSO</p>
         */
        public Builder identityProviderType(String identityProviderType) {
            this.putPathParameter("identityProviderType", identityProviderType);
            this.identityProviderType = identityProviderType;
            return this;
        }

        /**
         * <p>查询参数必填，仅支持精确值 SAML；响应返回 SAML。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SAML</p>
         */
        public Builder protocol(String protocol) {
            this.putQueryParameter("protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        @Override
        public GetIdentityProviderServiceProviderRequest build() {
            return new GetIdentityProviderServiceProviderRequest(this);
        } 

    } 

}
