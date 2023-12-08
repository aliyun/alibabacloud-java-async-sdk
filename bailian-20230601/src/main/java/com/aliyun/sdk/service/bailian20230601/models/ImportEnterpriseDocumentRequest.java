// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportEnterpriseDocumentRequest} extends {@link RequestModel}
 *
 * <p>ImportEnterpriseDocumentRequest</p>
 */
public class ImportEnterpriseDocumentRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    @Validation(required = true)
    private String agentKey;

    @Query
    @NameInMap("DataType")
    private Integer dataType;

    @Query
    @NameInMap("DocumentList")
    @Validation(required = true)
    private java.util.List < DocumentList> documentList;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("StoreId")
    private Long storeId;

    @Query
    @NameInMap("Tags")
    private java.util.List < String > tags;

    private ImportEnterpriseDocumentRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.dataType = builder.dataType;
        this.documentList = builder.documentList;
        this.ownerId = builder.ownerId;
        this.storeId = builder.storeId;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportEnterpriseDocumentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return dataType
     */
    public Integer getDataType() {
        return this.dataType;
    }

    /**
     * @return documentList
     */
    public java.util.List < DocumentList> getDocumentList() {
        return this.documentList;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return storeId
     */
    public Long getStoreId() {
        return this.storeId;
    }

    /**
     * @return tags
     */
    public java.util.List < String > getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<ImportEnterpriseDocumentRequest, Builder> {
        private String agentKey; 
        private Integer dataType; 
        private java.util.List < DocumentList> documentList; 
        private Long ownerId; 
        private Long storeId; 
        private java.util.List < String > tags; 

        private Builder() {
            super();
        } 

        private Builder(ImportEnterpriseDocumentRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.dataType = request.dataType;
            this.documentList = request.documentList;
            this.ownerId = request.ownerId;
            this.storeId = request.storeId;
            this.tags = request.tags;
        } 

        /**
         * AgentKey.
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * DataType.
         */
        public Builder dataType(Integer dataType) {
            this.putQueryParameter("DataType", dataType);
            this.dataType = dataType;
            return this;
        }

        /**
         * DocumentList.
         */
        public Builder documentList(java.util.List < DocumentList> documentList) {
            String documentListShrink = shrink(documentList, "DocumentList", "json");
            this.putQueryParameter("DocumentList", documentListShrink);
            this.documentList = documentList;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * StoreId.
         */
        public Builder storeId(Long storeId) {
            this.putQueryParameter("StoreId", storeId);
            this.storeId = storeId;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.List < String > tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        @Override
        public ImportEnterpriseDocumentRequest build() {
            return new ImportEnterpriseDocumentRequest(this);
        } 

    } 

    public static class DocumentList extends TeaModel {
        @NameInMap("BizId")
        private String bizId;

        @NameInMap("FileCanDownload")
        private Boolean fileCanDownload;

        @NameInMap("FileLink")
        @Validation(required = true)
        private String fileLink;

        @NameInMap("FileName")
        @Validation(required = true)
        private String fileName;

        @NameInMap("FilePreviewLink")
        private String filePreviewLink;

        private DocumentList(Builder builder) {
            this.bizId = builder.bizId;
            this.fileCanDownload = builder.fileCanDownload;
            this.fileLink = builder.fileLink;
            this.fileName = builder.fileName;
            this.filePreviewLink = builder.filePreviewLink;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DocumentList create() {
            return builder().build();
        }

        /**
         * @return bizId
         */
        public String getBizId() {
            return this.bizId;
        }

        /**
         * @return fileCanDownload
         */
        public Boolean getFileCanDownload() {
            return this.fileCanDownload;
        }

        /**
         * @return fileLink
         */
        public String getFileLink() {
            return this.fileLink;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return filePreviewLink
         */
        public String getFilePreviewLink() {
            return this.filePreviewLink;
        }

        public static final class Builder {
            private String bizId; 
            private Boolean fileCanDownload; 
            private String fileLink; 
            private String fileName; 
            private String filePreviewLink; 

            /**
             * BizId.
             */
            public Builder bizId(String bizId) {
                this.bizId = bizId;
                return this;
            }

            /**
             * FileCanDownload.
             */
            public Builder fileCanDownload(Boolean fileCanDownload) {
                this.fileCanDownload = fileCanDownload;
                return this;
            }

            /**
             * FileLink.
             */
            public Builder fileLink(String fileLink) {
                this.fileLink = fileLink;
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
             * FilePreviewLink.
             */
            public Builder filePreviewLink(String filePreviewLink) {
                this.filePreviewLink = filePreviewLink;
                return this;
            }

            public DocumentList build() {
                return new DocumentList(this);
            } 

        } 

    }
}
