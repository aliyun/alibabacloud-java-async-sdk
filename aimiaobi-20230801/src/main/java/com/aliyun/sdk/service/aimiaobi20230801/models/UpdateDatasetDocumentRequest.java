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
 * {@link UpdateDatasetDocumentRequest} extends {@link RequestModel}
 *
 * <p>UpdateDatasetDocumentRequest</p>
 */
public class UpdateDatasetDocumentRequest extends Request {
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
    private String workspaceId;

    private UpdateDatasetDocumentRequest(Builder builder) {
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

    public static UpdateDatasetDocumentRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateDatasetDocumentRequest, Builder> {
        private String regionId; 
        private Long datasetId; 
        private String datasetName; 
        private Document document; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDatasetDocumentRequest request) {
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
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public UpdateDatasetDocumentRequest build() {
            return new UpdateDatasetDocumentRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateDatasetDocumentRequest} extends {@link TeaModel}
     *
     * <p>UpdateDatasetDocumentRequest</p>
     */
    public static class Document extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DocId")
        private String docId;

        @com.aliyun.core.annotation.NameInMap("DocUuid")
        private String docUuid;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private Document(Builder builder) {
            this.docId = builder.docId;
            this.docUuid = builder.docUuid;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Document create() {
            return builder().build();
        }

        /**
         * @return docId
         */
        public String getDocId() {
            return this.docId;
        }

        /**
         * @return docUuid
         */
        public String getDocUuid() {
            return this.docUuid;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String docId; 
            private String docUuid; 
            private String title; 

            private Builder() {
            } 

            private Builder(Document model) {
                this.docId = model.docId;
                this.docUuid = model.docUuid;
                this.title = model.title;
            } 

            /**
             * DocId.
             */
            public Builder docId(String docId) {
                this.docId = docId;
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
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Document build() {
                return new Document(this);
            } 

        } 

    }
}
