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
 * {@link VerifyAgentCodePackageOssRamAuthorizationRequest} extends {@link RequestModel}
 *
 * <p>VerifyAgentCodePackageOssRamAuthorizationRequest</p>
 */
public class VerifyAgentCodePackageOssRamAuthorizationRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ossBucketName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ossBucketName;

    private VerifyAgentCodePackageOssRamAuthorizationRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.ossBucketName = builder.ossBucketName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyAgentCodePackageOssRamAuthorizationRequest create() {
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
     * @return ossBucketName
     */
    public String getOssBucketName() {
        return this.ossBucketName;
    }

    public static final class Builder extends Request.Builder<VerifyAgentCodePackageOssRamAuthorizationRequest, Builder> {
        private String workspaceId; 
        private String ossBucketName; 

        private Builder() {
            super();
        } 

        private Builder(VerifyAgentCodePackageOssRamAuthorizationRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.ossBucketName = request.ossBucketName;
        } 

        /**
         * <p>目标 Workspace，地域沿用调用 endpoint。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-a1b2c3d4e5f6</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>与 Workspace 同账号、同地域；不修改 Workspace 默认 OSS 绑定。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent-bucket</p>
         */
        public Builder ossBucketName(String ossBucketName) {
            this.putQueryParameter("ossBucketName", ossBucketName);
            this.ossBucketName = ossBucketName;
            return this;
        }

        @Override
        public VerifyAgentCodePackageOssRamAuthorizationRequest build() {
            return new VerifyAgentCodePackageOssRamAuthorizationRequest(this);
        } 

    } 

}
