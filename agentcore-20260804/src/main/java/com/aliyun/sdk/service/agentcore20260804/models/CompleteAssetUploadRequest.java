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
 * {@link CompleteAssetUploadRequest} extends {@link RequestModel}
 *
 * <p>CompleteAssetUploadRequest</p>
 */
public class CompleteAssetUploadRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("knowledgeBaseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String knowledgeBaseId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("assetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String assetId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private CompleteAssetUploadRequestBody body;

    private CompleteAssetUploadRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.assetId = builder.assetId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CompleteAssetUploadRequest create() {
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
     * @return knowledgeBaseId
     */
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * @return assetId
     */
    public String getAssetId() {
        return this.assetId;
    }

    /**
     * @return body
     */
    public CompleteAssetUploadRequestBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CompleteAssetUploadRequest, Builder> {
        private String workspaceId; 
        private String knowledgeBaseId; 
        private String assetId; 
        private CompleteAssetUploadRequestBody body; 

        private Builder() {
            super();
        } 

        private Builder(CompleteAssetUploadRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.knowledgeBaseId = request.knowledgeBaseId;
            this.assetId = request.assetId;
            this.body = request.body;
        } 

        /**
         * <p>The system parses the tenantId from the trusted gateway call identity by using Magic and verifies workspace ownership. Knowledge bases are created or accessed within this tenant and workspace. You cannot perform cross-tenant queries based solely on the knowledgeBaseId.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-2f5f9c5a8d0e4c3b</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The knowledge base to which the asset belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>kb-2f5f9c5a8d0e4c3b</p>
         */
        public Builder knowledgeBaseId(String knowledgeBaseId) {
            this.putPathParameter("knowledgeBaseId", knowledgeBaseId);
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        /**
         * <p>The asset to which the upload to be confirmed belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>asset-001</p>
         */
        public Builder assetId(String assetId) {
            this.putPathParameter("assetId", assetId);
            this.assetId = assetId;
            return this;
        }

        /**
         * <p>Specifies the upload session returned by BeginAssetUpload to prevent delayed confirmations from affecting subsequent uploads.</p>
         * <p>This parameter is required.</p>
         */
        public Builder body(CompleteAssetUploadRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public CompleteAssetUploadRequest build() {
            return new CompleteAssetUploadRequest(this);
        } 

    } 

    /**
     * 
     * {@link CompleteAssetUploadRequest} extends {@link TeaModel}
     *
     * <p>CompleteAssetUploadRequest</p>
     */
    public static class CompleteAssetUploadRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("uploadId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String uploadId;

        private CompleteAssetUploadRequestBody(Builder builder) {
            this.uploadId = builder.uploadId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CompleteAssetUploadRequestBody create() {
            return builder().build();
        }

        /**
         * @return uploadId
         */
        public String getUploadId() {
            return this.uploadId;
        }

        public static final class Builder {
            private String uploadId; 

            private Builder() {
            } 

            private Builder(CompleteAssetUploadRequestBody model) {
                this.uploadId = model.uploadId;
            } 

            /**
             * <p>The uploadId returned by BeginAssetUpload. It must match the current upload session and the current upload target generation of the asset.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>upload-001</p>
             */
            public Builder uploadId(String uploadId) {
                this.uploadId = uploadId;
                return this;
            }

            public CompleteAssetUploadRequestBody build() {
                return new CompleteAssetUploadRequestBody(this);
            } 

        } 

    }
}
