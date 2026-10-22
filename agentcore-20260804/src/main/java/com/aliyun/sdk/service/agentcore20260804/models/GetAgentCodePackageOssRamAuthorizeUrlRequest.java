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
 * {@link GetAgentCodePackageOssRamAuthorizeUrlRequest} extends {@link RequestModel}
 *
 * <p>GetAgentCodePackageOssRamAuthorizeUrlRequest</p>
 */
public class GetAgentCodePackageOssRamAuthorizeUrlRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ossBucketName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ossBucketName;

    private GetAgentCodePackageOssRamAuthorizeUrlRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.ossBucketName = builder.ossBucketName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentCodePackageOssRamAuthorizeUrlRequest create() {
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

    public static final class Builder extends Request.Builder<GetAgentCodePackageOssRamAuthorizeUrlRequest, Builder> {
        private String workspaceId; 
        private String ossBucketName; 

        private Builder() {
            super();
        } 

        private Builder(GetAgentCodePackageOssRamAuthorizeUrlRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.ossBucketName = request.ossBucketName;
        } 

        /**
         * <p>The workspace ID.</p>
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
         * <p>The name of the source OSS bucket.</p>
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
        public GetAgentCodePackageOssRamAuthorizeUrlRequest build() {
            return new GetAgentCodePackageOssRamAuthorizeUrlRequest(this);
        } 

    } 

}
