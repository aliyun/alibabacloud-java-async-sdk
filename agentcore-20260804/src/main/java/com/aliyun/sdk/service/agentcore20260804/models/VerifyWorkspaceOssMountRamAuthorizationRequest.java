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
 * {@link VerifyWorkspaceOssMountRamAuthorizationRequest} extends {@link RequestModel}
 *
 * <p>VerifyWorkspaceOssMountRamAuthorizationRequest</p>
 */
public class VerifyWorkspaceOssMountRamAuthorizationRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("bucketName")
    private String bucketName;

    private VerifyWorkspaceOssMountRamAuthorizationRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.bucketName = builder.bucketName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyWorkspaceOssMountRamAuthorizationRequest create() {
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
     * @return bucketName
     */
    public String getBucketName() {
        return this.bucketName;
    }

    public static final class Builder extends Request.Builder<VerifyWorkspaceOssMountRamAuthorizationRequest, Builder> {
        private String workspaceId; 
        private String bucketName; 

        private Builder() {
            super();
        } 

        private Builder(VerifyWorkspaceOssMountRamAuthorizationRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.bucketName = request.bucketName;
        } 

        /**
         * <p>The workspace ID.</p>
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
         * <p>The name of the OSS bucket.</p>
         */
        public Builder bucketName(String bucketName) {
            this.putQueryParameter("bucketName", bucketName);
            this.bucketName = bucketName;
            return this;
        }

        @Override
        public VerifyWorkspaceOssMountRamAuthorizationRequest build() {
            return new VerifyWorkspaceOssMountRamAuthorizationRequest(this);
        } 

    } 

}
