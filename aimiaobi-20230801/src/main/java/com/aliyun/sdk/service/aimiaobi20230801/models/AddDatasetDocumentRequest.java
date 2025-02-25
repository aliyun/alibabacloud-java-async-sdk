// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link AddDatasetDocumentRequest} extends {@link RequestModel}
 *
 * <p>AddDatasetDocumentRequest</p>
 */
public class AddDatasetDocumentRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DatasetId")
    private Long datasetId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DatasetName")
    private String datasetName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Document")
    @com.aliyun.core.annotation.Validation(required = true)
    private Document document;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private AddDatasetDocumentRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.datasetId = builder.datasetId;
        this.datasetName = builder.datasetName;
        this.document = builder.document;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDatasetDocumentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return datasetId
     */
    public Long getDatasetId() {
        return this.datasetId;
    }

    /**
     * @return datasetName
     */
    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * @return document
     */
    public Document getDocument() {
        return this.document;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<AddDatasetDocumentRequest, Builder> {
        private String regionId; 
        private Long datasetId; 
        private String datasetName; 
        private Document document; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(AddDatasetDocumentRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.datasetId = request.datasetId;
            this.datasetName = request.datasetName;
            this.document = request.document;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * DatasetId.
         */
        public Builder datasetId(Long datasetId) {
            this.putBodyParameter("DatasetId", datasetId);
            this.datasetId = datasetId;
            return this;
        }

        /**
         * DatasetName.
         */
        public Builder datasetName(String datasetName) {
            this.putBodyParameter("DatasetName", datasetName);
            this.datasetName = datasetName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder document(Document document) {
            String documentShrink = shrink(document, "Document", "json");
            this.putBodyParameter("Document", documentShrink);
            this.document = document;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-xx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public AddDatasetDocumentRequest build() {
            return new AddDatasetDocumentRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddDatasetDocumentRequest} extends {@link TeaModel}
     *
     * <p>AddDatasetDocumentRequest</p>
     */
    public static class MultimodalMedias extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileUrl")
        private String fileUrl;

        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        @com.aliyun.core.annotation.NameInMap("MediaType")
        private String mediaType;

        private MultimodalMedias(Builder builder) {
            this.fileUrl = builder.fileUrl;
            this.mediaId = builder.mediaId;
            this.mediaType = builder.mediaType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MultimodalMedias create() {
            return builder().build();
        }

        /**
         * @return fileUrl
         */
        public String getFileUrl() {
            return this.fileUrl;
        }

        /**
         * @return mediaId
         */
        public String getMediaId() {
            return this.mediaId;
        }

        /**
         * @return mediaType
         */
        public String getMediaType() {
            return this.mediaType;
        }

        public static final class Builder {
            private String fileUrl; 
            private String mediaId; 
            private String mediaType; 

            /**
             * FileUrl.
             */
            public Builder fileUrl(String fileUrl) {
                this.fileUrl = fileUrl;
                return this;
            }

            /**
             * MediaId.
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * MediaType.
             */
            public Builder mediaType(String mediaType) {
                this.mediaType = mediaType;
                return this;
            }

            public MultimodalMedias build() {
                return new MultimodalMedias(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddDatasetDocumentRequest} extends {@link TeaModel}
     *
     * <p>AddDatasetDocumentRequest</p>
     */
    public static class Document extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("DisableHandleMultimodalMedia")
        private Boolean disableHandleMultimodalMedia;

        @com.aliyun.core.annotation.NameInMap("DocId")
        private String docId;

        @com.aliyun.core.annotation.NameInMap("DocType")
        private String docType;

        @com.aliyun.core.annotation.NameInMap("DocUuid")
        private String docUuid;

        @com.aliyun.core.annotation.NameInMap("Extend1")
        private String extend1;

        @com.aliyun.core.annotation.NameInMap("Extend2")
        private String extend2;

        @com.aliyun.core.annotation.NameInMap("Extend3")
        private String extend3;

        @com.aliyun.core.annotation.NameInMap("MultimodalIndexName")
        private String multimodalIndexName;

        @com.aliyun.core.annotation.NameInMap("MultimodalMedias")
        private java.util.List<MultimodalMedias> multimodalMedias;

        @com.aliyun.core.annotation.NameInMap("PubTime")
        private String pubTime;

        @com.aliyun.core.annotation.NameInMap("SourceFrom")
        private String sourceFrom;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Document(Builder builder) {
            this.content = builder.content;
            this.disableHandleMultimodalMedia = builder.disableHandleMultimodalMedia;
            this.docId = builder.docId;
            this.docType = builder.docType;
            this.docUuid = builder.docUuid;
            this.extend1 = builder.extend1;
            this.extend2 = builder.extend2;
            this.extend3 = builder.extend3;
            this.multimodalIndexName = builder.multimodalIndexName;
            this.multimodalMedias = builder.multimodalMedias;
            this.pubTime = builder.pubTime;
            this.sourceFrom = builder.sourceFrom;
            this.summary = builder.summary;
            this.title = builder.title;
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
         * @return disableHandleMultimodalMedia
         */
        public Boolean getDisableHandleMultimodalMedia() {
            return this.disableHandleMultimodalMedia;
        }

        /**
         * @return docId
         */
        public String getDocId() {
            return this.docId;
        }

        /**
         * @return docType
         */
        public String getDocType() {
            return this.docType;
        }

        /**
         * @return docUuid
         */
        public String getDocUuid() {
            return this.docUuid;
        }

        /**
         * @return extend1
         */
        public String getExtend1() {
            return this.extend1;
        }

        /**
         * @return extend2
         */
        public String getExtend2() {
            return this.extend2;
        }

        /**
         * @return extend3
         */
        public String getExtend3() {
            return this.extend3;
        }

        /**
         * @return multimodalIndexName
         */
        public String getMultimodalIndexName() {
            return this.multimodalIndexName;
        }

        /**
         * @return multimodalMedias
         */
        public java.util.List<MultimodalMedias> getMultimodalMedias() {
            return this.multimodalMedias;
        }

        /**
         * @return pubTime
         */
        public String getPubTime() {
            return this.pubTime;
        }

        /**
         * @return sourceFrom
         */
        public String getSourceFrom() {
            return this.sourceFrom;
        }

        /**
         * @return summary
         */
        public String getSummary() {
            return this.summary;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String content; 
            private Boolean disableHandleMultimodalMedia; 
            private String docId; 
            private String docType; 
            private String docUuid; 
            private String extend1; 
            private String extend2; 
            private String extend3; 
            private String multimodalIndexName; 
            private java.util.List<MultimodalMedias> multimodalMedias; 
            private String pubTime; 
            private String sourceFrom; 
            private String summary; 
            private String title; 
            private String url; 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * DisableHandleMultimodalMedia.
             */
            public Builder disableHandleMultimodalMedia(Boolean disableHandleMultimodalMedia) {
                this.disableHandleMultimodalMedia = disableHandleMultimodalMedia;
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
             * DocType.
             */
            public Builder docType(String docType) {
                this.docType = docType;
                return this;
            }

            /**
             * DocUuid.
             */
            public Builder docUuid(String docUuid) {
                this.docUuid = docUuid;
                return this;
            }

            /**
             * Extend1.
             */
            public Builder extend1(String extend1) {
                this.extend1 = extend1;
                return this;
            }

            /**
             * Extend2.
             */
            public Builder extend2(String extend2) {
                this.extend2 = extend2;
                return this;
            }

            /**
             * Extend3.
             */
            public Builder extend3(String extend3) {
                this.extend3 = extend3;
                return this;
            }

            /**
             * MultimodalIndexName.
             */
            public Builder multimodalIndexName(String multimodalIndexName) {
                this.multimodalIndexName = multimodalIndexName;
                return this;
            }

            /**
             * MultimodalMedias.
             */
            public Builder multimodalMedias(java.util.List<MultimodalMedias> multimodalMedias) {
                this.multimodalMedias = multimodalMedias;
                return this;
            }

            /**
             * PubTime.
             */
            public Builder pubTime(String pubTime) {
                this.pubTime = pubTime;
                return this;
            }

            /**
             * SourceFrom.
             */
            public Builder sourceFrom(String sourceFrom) {
                this.sourceFrom = sourceFrom;
                return this;
            }

            /**
             * Summary.
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * Url.
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
