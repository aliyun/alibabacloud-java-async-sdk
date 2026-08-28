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
 * {@link UploadAgentSpecViaOssRequest} extends {@link RequestModel}
 *
 * <p>UploadAgentSpecViaOssRequest</p>
 */
public class UploadAgentSpecViaOssRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private UploadAgentSpecViaOssRequestBody body;

    private UploadAgentSpecViaOssRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadAgentSpecViaOssRequest create() {
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
    public UploadAgentSpecViaOssRequestBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UploadAgentSpecViaOssRequest, Builder> {
        private String workspaceId; 
        private UploadAgentSpecViaOssRequestBody body; 

        private Builder() {
            super();
        } 

        private Builder(UploadAgentSpecViaOssRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.body = request.body;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * body.
         */
        public Builder body(UploadAgentSpecViaOssRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public UploadAgentSpecViaOssRequest build() {
            return new UploadAgentSpecViaOssRequest(this);
        } 

    } 

    /**
     * 
     * {@link UploadAgentSpecViaOssRequest} extends {@link TeaModel}
     *
     * <p>UploadAgentSpecViaOssRequest</p>
     */
    public static class UploadAgentSpecViaOssRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ossObjectName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String ossObjectName;

        @com.aliyun.core.annotation.NameInMap("overwrite")
        private Boolean overwrite;

        @com.aliyun.core.annotation.NameInMap("publish")
        private Boolean publish;

        private UploadAgentSpecViaOssRequestBody(Builder builder) {
            this.ossObjectName = builder.ossObjectName;
            this.overwrite = builder.overwrite;
            this.publish = builder.publish;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UploadAgentSpecViaOssRequestBody create() {
            return builder().build();
        }

        /**
         * @return ossObjectName
         */
        public String getOssObjectName() {
            return this.ossObjectName;
        }

        /**
         * @return overwrite
         */
        public Boolean getOverwrite() {
            return this.overwrite;
        }

        /**
         * @return publish
         */
        public Boolean getPublish() {
            return this.publish;
        }

        public static final class Builder {
            private String ossObjectName; 
            private Boolean overwrite; 
            private Boolean publish; 

            private Builder() {
            } 

            private Builder(UploadAgentSpecViaOssRequestBody model) {
                this.ossObjectName = model.ossObjectName;
                this.overwrite = model.overwrite;
                this.publish = model.publish;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>agentspec/export/user1/ns1/2024-01-01/uuid/123456.zip</p>
             */
            public Builder ossObjectName(String ossObjectName) {
                this.ossObjectName = ossObjectName;
                return this;
            }

            /**
             * overwrite.
             */
            public Builder overwrite(Boolean overwrite) {
                this.overwrite = overwrite;
                return this;
            }

            /**
             * publish.
             */
            public Builder publish(Boolean publish) {
                this.publish = publish;
                return this;
            }

            public UploadAgentSpecViaOssRequestBody build() {
                return new UploadAgentSpecViaOssRequestBody(this);
            } 

        } 

    }
}
