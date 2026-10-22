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
 * {@link GetAgentCodePackageUploadUrlRequest} extends {@link RequestModel}
 *
 * <p>GetAgentCodePackageUploadUrlRequest</p>
 */
public class GetAgentCodePackageUploadUrlRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private GetAgentCodePackageUploadUrlRequestBody body;

    private GetAgentCodePackageUploadUrlRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentCodePackageUploadUrlRequest create() {
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
    public GetAgentCodePackageUploadUrlRequestBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<GetAgentCodePackageUploadUrlRequest, Builder> {
        private String workspaceId; 
        private GetAgentCodePackageUploadUrlRequestBody body; 

        private Builder() {
            super();
        } 

        private Builder(GetAgentCodePackageUploadUrlRequest request) {
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
        public Builder body(GetAgentCodePackageUploadUrlRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public GetAgentCodePackageUploadUrlRequest build() {
            return new GetAgentCodePackageUploadUrlRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetAgentCodePackageUploadUrlRequest} extends {@link TeaModel}
     *
     * <p>GetAgentCodePackageUploadUrlRequest</p>
     */
    public static class GetAgentCodePackageUploadUrlRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("fileName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("fileSize")
        @com.aliyun.core.annotation.Validation(required = true, maximum = 500000000, minimum = 1)
        private Long fileSize;

        @com.aliyun.core.annotation.NameInMap("format")
        @com.aliyun.core.annotation.Validation(required = true)
        private String format;

        private GetAgentCodePackageUploadUrlRequestBody(Builder builder) {
            this.fileName = builder.fileName;
            this.fileSize = builder.fileSize;
            this.format = builder.format;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GetAgentCodePackageUploadUrlRequestBody create() {
            return builder().build();
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileSize
         */
        public Long getFileSize() {
            return this.fileSize;
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        public static final class Builder {
            private String fileName; 
            private Long fileSize; 
            private String format; 

            private Builder() {
            } 

            private Builder(GetAgentCodePackageUploadUrlRequestBody model) {
                this.fileName = model.fileName;
                this.fileSize = model.fileSize;
                this.format = model.format;
            } 

            /**
             * <p>The filename of the code package.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>main.zip</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The declared compressed size of the code package.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder fileSize(Long fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * <p>The format of the code package.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>zip</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            public GetAgentCodePackageUploadUrlRequestBody build() {
                return new GetAgentCodePackageUploadUrlRequestBody(this);
            } 

        } 

    }
}
