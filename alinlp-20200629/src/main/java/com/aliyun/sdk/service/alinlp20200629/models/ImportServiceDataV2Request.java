// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportServiceDataV2Request} extends {@link RequestModel}
 *
 * <p>ImportServiceDataV2Request</p>
 */
public class ImportServiceDataV2Request extends Request {
    @Body
    @NameInMap("DataType")
    private String dataType;

    @Body
    @NameInMap("Documents")
    private java.util.List < Documents> documents;

    @Body
    @NameInMap("ServiceId")
    @Validation(required = true)
    private Long serviceId;

    private ImportServiceDataV2Request(Builder builder) {
        super(builder);
        this.dataType = builder.dataType;
        this.documents = builder.documents;
        this.serviceId = builder.serviceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportServiceDataV2Request create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataType
     */
    public String getDataType() {
        return this.dataType;
    }

    /**
     * @return documents
     */
    public java.util.List < Documents> getDocuments() {
        return this.documents;
    }

    /**
     * @return serviceId
     */
    public Long getServiceId() {
        return this.serviceId;
    }

    public static final class Builder extends Request.Builder<ImportServiceDataV2Request, Builder> {
        private String dataType; 
        private java.util.List < Documents> documents; 
        private Long serviceId; 

        private Builder() {
            super();
        } 

        private Builder(ImportServiceDataV2Request request) {
            super(request);
            this.dataType = request.dataType;
            this.documents = request.documents;
            this.serviceId = request.serviceId;
        } 

        /**
         * DataType.
         */
        public Builder dataType(String dataType) {
            this.putBodyParameter("DataType", dataType);
            this.dataType = dataType;
            return this;
        }

        /**
         * Documents.
         */
        public Builder documents(java.util.List < Documents> documents) {
            String documentsShrink = shrink(documents, "Documents", "json");
            this.putBodyParameter("Documents", documentsShrink);
            this.documents = documents;
            return this;
        }

        /**
         * ServiceId.
         */
        public Builder serviceId(Long serviceId) {
            this.putBodyParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        @Override
        public ImportServiceDataV2Request build() {
            return new ImportServiceDataV2Request(this);
        } 

    } 

    public static class Documents extends TeaModel {
        @NameInMap("BizParams")
        private java.util.Map < String, String > bizParams;

        @NameInMap("DocId")
        private String docId;

        @NameInMap("FileExtension")
        private String fileExtension;

        @NameInMap("FileName")
        private String fileName;

        @NameInMap("FilePath")
        private String filePath;

        @NameInMap("Version")
        private String version;

        private Documents(Builder builder) {
            this.bizParams = builder.bizParams;
            this.docId = builder.docId;
            this.fileExtension = builder.fileExtension;
            this.fileName = builder.fileName;
            this.filePath = builder.filePath;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Documents create() {
            return builder().build();
        }

        /**
         * @return bizParams
         */
        public java.util.Map < String, String > getBizParams() {
            return this.bizParams;
        }

        /**
         * @return docId
         */
        public String getDocId() {
            return this.docId;
        }

        /**
         * @return fileExtension
         */
        public String getFileExtension() {
            return this.fileExtension;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return filePath
         */
        public String getFilePath() {
            return this.filePath;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private java.util.Map < String, String > bizParams; 
            private String docId; 
            private String fileExtension; 
            private String fileName; 
            private String filePath; 
            private String version; 

            /**
             * BizParams.
             */
            public Builder bizParams(java.util.Map < String, String > bizParams) {
                this.bizParams = bizParams;
                return this;
            }

            /**
             * DocId.
             */
            public Builder docId(String docId) {
                this.docId = docId;
                return this;
            }

            /**
             * FileExtension.
             */
            public Builder fileExtension(String fileExtension) {
                this.fileExtension = fileExtension;
                return this;
            }

            /**
             * FileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * FilePath.
             */
            public Builder filePath(String filePath) {
                this.filePath = filePath;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Documents build() {
                return new Documents(this);
            } 

        } 

    }
}
