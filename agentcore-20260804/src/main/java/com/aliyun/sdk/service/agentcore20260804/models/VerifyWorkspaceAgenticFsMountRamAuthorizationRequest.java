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
 * {@link VerifyWorkspaceAgenticFsMountRamAuthorizationRequest} extends {@link RequestModel}
 *
 * <p>VerifyWorkspaceAgenticFsMountRamAuthorizationRequest</p>
 */
public class VerifyWorkspaceAgenticFsMountRamAuthorizationRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("server")
    @com.aliyun.core.annotation.Validation(required = true)
    private String server;

    private VerifyWorkspaceAgenticFsMountRamAuthorizationRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.server = builder.server;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyWorkspaceAgenticFsMountRamAuthorizationRequest create() {
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
     * @return server
     */
    public String getServer() {
        return this.server;
    }

    public static final class Builder extends Request.Builder<VerifyWorkspaceAgenticFsMountRamAuthorizationRequest, Builder> {
        private String workspaceId; 
        private String server; 

        private Builder() {
            super();
        } 

        private Builder(VerifyWorkspaceAgenticFsMountRamAuthorizationRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.server = request.server;
        } 

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-0123456789abcdef01234</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The domain name of the target AccessPoint, obtained from the DomainName field of NAS ListAccessPoints. Do not include the protocol, port, or path.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-0123456789abcdef0.0123456789-vlm36.cn-hangzhou.nas.aliyuncs.com</p>
         */
        public Builder server(String server) {
            this.putQueryParameter("server", server);
            this.server = server;
            return this;
        }

        @Override
        public VerifyWorkspaceAgenticFsMountRamAuthorizationRequest build() {
            return new VerifyWorkspaceAgenticFsMountRamAuthorizationRequest(this);
        } 

    } 

}
