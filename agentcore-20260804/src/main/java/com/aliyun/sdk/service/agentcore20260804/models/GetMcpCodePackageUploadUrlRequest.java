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
 * {@link GetMcpCodePackageUploadUrlRequest} extends {@link RequestModel}
 *
 * <p>GetMcpCodePackageUploadUrlRequest</p>
 */
public class GetMcpCodePackageUploadUrlRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private GetMcpCodePackageUploadUrlRequestBody body;

    private GetMcpCodePackageUploadUrlRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMcpCodePackageUploadUrlRequest create() {
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
    public GetMcpCodePackageUploadUrlRequestBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<GetMcpCodePackageUploadUrlRequest, Builder> {
        private String workspaceId; 
        private GetMcpCodePackageUploadUrlRequestBody body; 

        private Builder() {
            super();
        } 

        private Builder(GetMcpCodePackageUploadUrlRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.body = request.body;
        } 

        /**
         * <p>The AgentCore workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace-id</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The request body.</p>
         */
        public Builder body(GetMcpCodePackageUploadUrlRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public GetMcpCodePackageUploadUrlRequest build() {
            return new GetMcpCodePackageUploadUrlRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetMcpCodePackageUploadUrlRequest} extends {@link TeaModel}
     *
     * <p>GetMcpCodePackageUploadUrlRequest</p>
     */
    public static class GetMcpCodePackageUploadUrlRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("fileName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String fileName;

        private GetMcpCodePackageUploadUrlRequestBody(Builder builder) {
            this.fileName = builder.fileName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GetMcpCodePackageUploadUrlRequestBody create() {
            return builder().build();
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        public static final class Builder {
            private String fileName; 

            private Builder() {
            } 

            private Builder(GetMcpCodePackageUploadUrlRequestBody model) {
                this.fileName = model.fileName;
            } 

            /**
             * <p>The file name of the ZIP code package.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>server.zip</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            public GetMcpCodePackageUploadUrlRequestBody build() {
                return new GetMcpCodePackageUploadUrlRequestBody(this);
            } 

        } 

    }
}
