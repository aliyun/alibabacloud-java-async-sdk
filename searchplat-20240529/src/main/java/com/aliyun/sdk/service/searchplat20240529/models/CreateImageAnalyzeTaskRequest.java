// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchplat20240529.models;

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
 * {@link CreateImageAnalyzeTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateImageAnalyzeTaskRequest</p>
 */
public class CreateImageAnalyzeTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspace_name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("service_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("document")
    private Document document;

    private CreateImageAnalyzeTaskRequest(Builder builder) {
        super(builder);
        this.workspaceName = builder.workspaceName;
        this.serviceId = builder.serviceId;
        this.document = builder.document;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateImageAnalyzeTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return document
     */
    public Document getDocument() {
        return this.document;
    }

    public static final class Builder extends Request.Builder<CreateImageAnalyzeTaskRequest, Builder> {
        private String workspaceName; 
        private String serviceId; 
        private Document document; 

        private Builder() {
            super();
        } 

        private Builder(CreateImageAnalyzeTaskRequest request) {
            super(request);
            this.workspaceName = request.workspaceName;
            this.serviceId = request.serviceId;
            this.document = request.document;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder workspaceName(String workspaceName) {
            this.putPathParameter("workspace_name", workspaceName);
            this.workspaceName = workspaceName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder serviceId(String serviceId) {
            this.putPathParameter("service_id", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * document.
         */
        public Builder document(Document document) {
            this.putBodyParameter("document", document);
            this.document = document;
            return this;
        }

        @Override
        public CreateImageAnalyzeTaskRequest build() {
            return new CreateImageAnalyzeTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateImageAnalyzeTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateImageAnalyzeTaskRequest</p>
     */
    public static class Document extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("file_name")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("file_type")
        private String fileType;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private Document(Builder builder) {
            this.content = builder.content;
            this.fileName = builder.fileName;
            this.fileType = builder.fileType;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Document create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileType
         */
        public String getFileType() {
            return this.fileType;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String content; 
            private String fileName; 
            private String fileType; 
            private String url; 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * file_name.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * file_type.
             */
            public Builder fileType(String fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Document build() {
                return new Document(this);
            } 

        } 

    }
}
