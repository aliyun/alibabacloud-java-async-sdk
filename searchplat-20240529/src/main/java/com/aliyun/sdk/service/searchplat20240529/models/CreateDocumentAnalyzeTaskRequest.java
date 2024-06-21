// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchplat20240529.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDocumentAnalyzeTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateDocumentAnalyzeTaskRequest</p>
 */
public class CreateDocumentAnalyzeTaskRequest extends Request {
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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("output")
    private Output output;

    private CreateDocumentAnalyzeTaskRequest(Builder builder) {
        super(builder);
        this.workspaceName = builder.workspaceName;
        this.serviceId = builder.serviceId;
        this.document = builder.document;
        this.output = builder.output;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDocumentAnalyzeTaskRequest create() {
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

    /**
     * @return output
     */
    public Output getOutput() {
        return this.output;
    }

    public static final class Builder extends Request.Builder<CreateDocumentAnalyzeTaskRequest, Builder> {
        private String workspaceName; 
        private String serviceId; 
        private Document document; 
        private Output output; 

        private Builder() {
            super();
        } 

        private Builder(CreateDocumentAnalyzeTaskRequest request) {
            super(request);
            this.workspaceName = request.workspaceName;
            this.serviceId = request.serviceId;
            this.document = request.document;
            this.output = request.output;
        } 

        /**
         * workspace_name.
         */
        public Builder workspaceName(String workspaceName) {
            this.putPathParameter("workspace_name", workspaceName);
            this.workspaceName = workspaceName;
            return this;
        }

        /**
         * service_id.
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

        /**
         * output.
         */
        public Builder output(Output output) {
            this.putBodyParameter("output", output);
            this.output = output;
            return this;
        }

        @Override
        public CreateDocumentAnalyzeTaskRequest build() {
            return new CreateDocumentAnalyzeTaskRequest(this);
        } 

    } 

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
    public static class Output extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("image_storage")
        private String imageStorage;

        private Output(Builder builder) {
            this.imageStorage = builder.imageStorage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Output create() {
            return builder().build();
        }

        /**
         * @return imageStorage
         */
        public String getImageStorage() {
            return this.imageStorage;
        }

        public static final class Builder {
            private String imageStorage; 

            /**
             * image_storage.
             */
            public Builder imageStorage(String imageStorage) {
                this.imageStorage = imageStorage;
                return this;
            }

            public Output build() {
                return new Output(this);
            } 

        } 

    }
}
