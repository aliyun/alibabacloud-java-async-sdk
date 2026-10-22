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
 * {@link ValidateAgentCodePackageFromOssRequest} extends {@link RequestModel}
 *
 * <p>ValidateAgentCodePackageFromOssRequest</p>
 */
public class ValidateAgentCodePackageFromOssRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private ValidateAgentCodePackageFromOssRequestBody body;

    private ValidateAgentCodePackageFromOssRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValidateAgentCodePackageFromOssRequest create() {
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
    public ValidateAgentCodePackageFromOssRequestBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<ValidateAgentCodePackageFromOssRequest, Builder> {
        private String workspaceId; 
        private ValidateAgentCodePackageFromOssRequestBody body; 

        private Builder() {
            super();
        } 

        private Builder(ValidateAgentCodePackageFromOssRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.body = request.body;
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
         * <p>The request body.</p>
         * <p>This parameter is required.</p>
         */
        public Builder body(ValidateAgentCodePackageFromOssRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public ValidateAgentCodePackageFromOssRequest build() {
            return new ValidateAgentCodePackageFromOssRequest(this);
        } 

    } 

    /**
     * 
     * {@link ValidateAgentCodePackageFromOssRequest} extends {@link TeaModel}
     *
     * <p>ValidateAgentCodePackageFromOssRequest</p>
     */
    public static class ValidateAgentCodePackageFromOssRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ossBucketName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String ossBucketName;

        @com.aliyun.core.annotation.NameInMap("ossObjectName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String ossObjectName;

        private ValidateAgentCodePackageFromOssRequestBody(Builder builder) {
            this.ossBucketName = builder.ossBucketName;
            this.ossObjectName = builder.ossObjectName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ValidateAgentCodePackageFromOssRequestBody create() {
            return builder().build();
        }

        /**
         * @return ossBucketName
         */
        public String getOssBucketName() {
            return this.ossBucketName;
        }

        /**
         * @return ossObjectName
         */
        public String getOssObjectName() {
            return this.ossObjectName;
        }

        public static final class Builder {
            private String ossBucketName; 
            private String ossObjectName; 

            private Builder() {
            } 

            private Builder(ValidateAgentCodePackageFromOssRequestBody model) {
                this.ossBucketName = model.ossBucketName;
                this.ossObjectName = model.ossObjectName;
            } 

            /**
             * <p>The name of the source OSS bucket.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>my-agent-bucket</p>
             */
            public Builder ossBucketName(String ossBucketName) {
                this.ossBucketName = ossBucketName;
                return this;
            }

            /**
             * <p>The full object key of the source code package.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>packages/main.zip</p>
             */
            public Builder ossObjectName(String ossObjectName) {
                this.ossObjectName = ossObjectName;
                return this;
            }

            public ValidateAgentCodePackageFromOssRequestBody build() {
                return new ValidateAgentCodePackageFromOssRequestBody(this);
            } 

        } 

    }
}
