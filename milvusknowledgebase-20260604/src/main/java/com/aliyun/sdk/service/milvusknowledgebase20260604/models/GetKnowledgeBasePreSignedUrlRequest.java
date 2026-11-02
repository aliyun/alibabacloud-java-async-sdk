// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.milvusknowledgebase20260604.models;

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
 * {@link GetKnowledgeBasePreSignedUrlRequest} extends {@link RequestModel}
 *
 * <p>GetKnowledgeBasePreSignedUrlRequest</p>
 */
public class GetKnowledgeBasePreSignedUrlRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("datasetId")
    private String datasetId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Documents")
    private java.util.List<Documents> documents;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExpiresIn")
    private Integer expiresIn;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
    private String knowledgeBaseId;

    private GetKnowledgeBasePreSignedUrlRequest(Builder builder) {
        super(builder);
        this.datasetId = builder.datasetId;
        this.documents = builder.documents;
        this.expiresIn = builder.expiresIn;
        this.knowledgeBaseId = builder.knowledgeBaseId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetKnowledgeBasePreSignedUrlRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return datasetId
     */
    public String getDatasetId() {
        return this.datasetId;
    }

    /**
     * @return documents
     */
    public java.util.List<Documents> getDocuments() {
        return this.documents;
    }

    /**
     * @return expiresIn
     */
    public Integer getExpiresIn() {
        return this.expiresIn;
    }

    /**
     * @return knowledgeBaseId
     */
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    public static final class Builder extends Request.Builder<GetKnowledgeBasePreSignedUrlRequest, Builder> {
        private String datasetId; 
        private java.util.List<Documents> documents; 
        private Integer expiresIn; 
        private String knowledgeBaseId; 

        private Builder() {
            super();
        } 

        private Builder(GetKnowledgeBasePreSignedUrlRequest request) {
            super(request);
            this.datasetId = request.datasetId;
            this.documents = request.documents;
            this.expiresIn = request.expiresIn;
            this.knowledgeBaseId = request.knowledgeBaseId;
        } 

        /**
         * <p>The knowledge base ID.</p>
         * 
         * <strong>example:</strong>
         * <p>kb-3bd02617e9be335f</p>
         */
        public Builder datasetId(String datasetId) {
            this.putPathParameter("datasetId", datasetId);
            this.datasetId = datasetId;
            return this;
        }

        /**
         * <p>The list of files to upload. You can specify 1 to 100 files.</p>
         */
        public Builder documents(java.util.List<Documents> documents) {
            this.putBodyParameter("Documents", documents);
            this.documents = documents;
            return this;
        }

        /**
         * <p>The validity period of the pre-signed URL in seconds. Default value: <code>3600</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        public Builder expiresIn(Integer expiresIn) {
            this.putBodyParameter("ExpiresIn", expiresIn);
            this.expiresIn = expiresIn;
            return this;
        }

        /**
         * <p>The knowledge base ID. Either this parameter or datasetId must be specified. This parameter takes priority.</p>
         * 
         * <strong>example:</strong>
         * <p>kb-3bd02617e9be335f</p>
         */
        public Builder knowledgeBaseId(String knowledgeBaseId) {
            this.putBodyParameter("KnowledgeBaseId", knowledgeBaseId);
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        @Override
        public GetKnowledgeBasePreSignedUrlRequest build() {
            return new GetKnowledgeBasePreSignedUrlRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetKnowledgeBasePreSignedUrlRequest} extends {@link TeaModel}
     *
     * <p>GetKnowledgeBasePreSignedUrlRequest</p>
     */
    public static class Documents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        private Documents(Builder builder) {
            this.name = builder.name;
            this.path = builder.path;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Documents create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        public static final class Builder {
            private String name; 
            private String path; 
            private Long size; 

            private Builder() {
            } 

            private Builder(Documents model) {
                this.name = model.name;
                this.path = model.path;
                this.size = model.size;
            } 

            /**
             * <p>The display name of the file. If not specified, the file name from Path is used.</p>
             * 
             * <strong>example:</strong>
             * <p>CHANGELOG.md</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The file name or relative path for local upload scenarios. The value cannot start with <code>direct_upload/</code> or <code>uploaded/</code>, cannot contain empty segments, <code>.</code>, or <code>..</code>, and must be 1024 bytes or less.</p>
             * 
             * <strong>example:</strong>
             * <p>contract-2026.md</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The file size in bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            public Documents build() {
                return new Documents(this);
            } 

        } 

    }
}
