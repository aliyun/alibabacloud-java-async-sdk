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
 * {@link AddDocumentsRequest} extends {@link RequestModel}
 *
 * <p>AddDocumentsRequest</p>
 */
public class AddDocumentsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("datasetId")
    private String datasetId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Dedup")
    private Dedup dedup;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Documents")
    private java.util.List<Documents> documents;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImportType")
    private String importType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
    private String knowledgeBaseId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MetaFields")
    private Object metaFields;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StrategyId")
    private String strategyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dingTalkConfiguration")
    private DingTalkConfiguration dingTalkConfiguration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("parentId")
    private String parentId;

    private AddDocumentsRequest(Builder builder) {
        super(builder);
        this.datasetId = builder.datasetId;
        this.dedup = builder.dedup;
        this.documents = builder.documents;
        this.importType = builder.importType;
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.metaFields = builder.metaFields;
        this.strategyId = builder.strategyId;
        this.dingTalkConfiguration = builder.dingTalkConfiguration;
        this.parentId = builder.parentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDocumentsRequest create() {
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
     * @return dedup
     */
    public Dedup getDedup() {
        return this.dedup;
    }

    /**
     * @return documents
     */
    public java.util.List<Documents> getDocuments() {
        return this.documents;
    }

    /**
     * @return importType
     */
    public String getImportType() {
        return this.importType;
    }

    /**
     * @return knowledgeBaseId
     */
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * @return metaFields
     */
    public Object getMetaFields() {
        return this.metaFields;
    }

    /**
     * @return strategyId
     */
    public String getStrategyId() {
        return this.strategyId;
    }

    /**
     * @return dingTalkConfiguration
     */
    public DingTalkConfiguration getDingTalkConfiguration() {
        return this.dingTalkConfiguration;
    }

    /**
     * @return parentId
     */
    public String getParentId() {
        return this.parentId;
    }

    public static final class Builder extends Request.Builder<AddDocumentsRequest, Builder> {
        private String datasetId; 
        private Dedup dedup; 
        private java.util.List<Documents> documents; 
        private String importType; 
        private String knowledgeBaseId; 
        private Object metaFields; 
        private String strategyId; 
        private DingTalkConfiguration dingTalkConfiguration; 
        private String parentId; 

        private Builder() {
            super();
        } 

        private Builder(AddDocumentsRequest request) {
            super(request);
            this.datasetId = request.datasetId;
            this.dedup = request.dedup;
            this.documents = request.documents;
            this.importType = request.importType;
            this.knowledgeBaseId = request.knowledgeBaseId;
            this.metaFields = request.metaFields;
            this.strategyId = request.strategyId;
            this.dingTalkConfiguration = request.dingTalkConfiguration;
            this.parentId = request.parentId;
        } 

        /**
         * <p>The knowledge base ID.</p>
         * 
         * <strong>example:</strong>
         * <p>kd-03ec1e2385fcf</p>
         */
        public Builder datasetId(String datasetId) {
            this.putPathParameter("datasetId", datasetId);
            this.datasetId = datasetId;
            return this;
        }

        /**
         * <p>The deduplication configuration.</p>
         */
        public Builder dedup(Dedup dedup) {
            this.putBodyParameter("Dedup", dedup);
            this.dedup = dedup;
            return this;
        }

        /**
         * <p>The list of documents.</p>
         */
        public Builder documents(java.util.List<Documents> documents) {
            this.putBodyParameter("Documents", documents);
            this.documents = documents;
            return this;
        }

        /**
         * <p>The import type.</p>
         * 
         * <strong>example:</strong>
         * <p>LOCAL_UPLOAD</p>
         */
        public Builder importType(String importType) {
            this.putBodyParameter("ImportType", importType);
            this.importType = importType;
            return this;
        }

        /**
         * <p>The knowledge base ID.</p>
         * 
         * <strong>example:</strong>
         * <p>kb-3bd02617e9be335f</p>
         */
        public Builder knowledgeBaseId(String knowledgeBaseId) {
            this.putBodyParameter("KnowledgeBaseId", knowledgeBaseId);
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        /**
         * <p>The batch label configuration. The key must be a label field that is already defined in the knowledge base. The value supports string, int64, float32, bool, and list types.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;department&quot;:&quot;legal&quot;,&quot;topics&quot;:[&quot;policy&quot;,&quot;contract&quot;],&quot;reviewed&quot;:true}</p>
         */
        public Builder metaFields(Object metaFields) {
            this.putBodyParameter("MetaFields", metaFields);
            this.metaFields = metaFields;
            return this;
        }

        /**
         * <p>The processing strategy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>kb-strategy-7043984ca395eabd</p>
         */
        public Builder strategyId(String strategyId) {
            this.putBodyParameter("StrategyId", strategyId);
            this.strategyId = strategyId;
            return this;
        }

        /**
         * <p>Not supported. Ignore this parameter.</p>
         */
        public Builder dingTalkConfiguration(DingTalkConfiguration dingTalkConfiguration) {
            this.putBodyParameter("dingTalkConfiguration", dingTalkConfiguration);
            this.dingTalkConfiguration = dingTalkConfiguration;
            return this;
        }

        /**
         * <p>Defaults to root when omitted.</p>
         * 
         * <strong>example:</strong>
         * <p>root</p>
         */
        public Builder parentId(String parentId) {
            this.putBodyParameter("parentId", parentId);
            this.parentId = parentId;
            return this;
        }

        @Override
        public AddDocumentsRequest build() {
            return new AddDocumentsRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddDocumentsRequest} extends {@link TeaModel}
     *
     * <p>AddDocumentsRequest</p>
     */
    public static class Dedup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContentDedup")
        private Boolean contentDedup;

        @com.aliyun.core.annotation.NameInMap("DocNameDedup")
        private Boolean docNameDedup;

        private Dedup(Builder builder) {
            this.contentDedup = builder.contentDedup;
            this.docNameDedup = builder.docNameDedup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dedup create() {
            return builder().build();
        }

        /**
         * @return contentDedup
         */
        public Boolean getContentDedup() {
            return this.contentDedup;
        }

        /**
         * @return docNameDedup
         */
        public Boolean getDocNameDedup() {
            return this.docNameDedup;
        }

        public static final class Builder {
            private Boolean contentDedup; 
            private Boolean docNameDedup; 

            private Builder() {
            } 

            private Builder(Dedup model) {
                this.contentDedup = model.contentDedup;
                this.docNameDedup = model.docNameDedup;
            } 

            /**
             * <p>Specifies whether to enable content deduplication.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder contentDedup(Boolean contentDedup) {
                this.contentDedup = contentDedup;
                return this;
            }

            /**
             * <p>Specifies whether to enable document name deduplication.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder docNameDedup(Boolean docNameDedup) {
                this.docNameDedup = docNameDedup;
                return this;
            }

            public Dedup build() {
                return new Dedup(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddDocumentsRequest} extends {@link TeaModel}
     *
     * <p>AddDocumentsRequest</p>
     */
    public static class Documents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("StrategyId")
        private String strategyId;

        private Documents(Builder builder) {
            this.name = builder.name;
            this.path = builder.path;
            this.size = builder.size;
            this.strategyId = builder.strategyId;
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

        /**
         * @return strategyId
         */
        public String getStrategyId() {
            return this.strategyId;
        }

        public static final class Builder {
            private String name; 
            private String path; 
            private Long size; 
            private String strategyId; 

            private Builder() {
            } 

            private Builder(Documents model) {
                this.name = model.name;
                this.path = model.path;
                this.size = model.size;
                this.strategyId = model.strategyId;
            } 

            /**
             * <p>The document name.</p>
             * 
             * <strong>example:</strong>
             * <p>CHANGELOG.md</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The document path. This is the file name or relative path used during upload, which must be consistent with the pre-signed URL request.</p>
             * 
             * <strong>example:</strong>
             * <p>2026_06_23_17_49_52WwGSUezpG2u2iHWxyYGzkf9KtormhkxN/CHANGELOG.md</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The file size.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The processing strategy ID.</p>
             * 
             * <strong>example:</strong>
             * <p>kb-strategy-7043984ca395eabd</p>
             */
            public Builder strategyId(String strategyId) {
                this.strategyId = strategyId;
                return this;
            }

            public Documents build() {
                return new Documents(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddDocumentsRequest} extends {@link TeaModel}
     *
     * <p>AddDocumentsRequest</p>
     */
    public static class DingTalkConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("appId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("appPassword")
        private String appPassword;

        @com.aliyun.core.annotation.NameInMap("dingDocMcpLink")
        private String dingDocMcpLink;

        @com.aliyun.core.annotation.NameInMap("dingTableMcpLink")
        private String dingTableMcpLink;

        @com.aliyun.core.annotation.NameInMap("knowledgeId")
        private String knowledgeId;

        @com.aliyun.core.annotation.NameInMap("knowledgeType")
        private String knowledgeType;

        @com.aliyun.core.annotation.NameInMap("userId")
        private String userId;

        private DingTalkConfiguration(Builder builder) {
            this.appId = builder.appId;
            this.appPassword = builder.appPassword;
            this.dingDocMcpLink = builder.dingDocMcpLink;
            this.dingTableMcpLink = builder.dingTableMcpLink;
            this.knowledgeId = builder.knowledgeId;
            this.knowledgeType = builder.knowledgeType;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DingTalkConfiguration create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appPassword
         */
        public String getAppPassword() {
            return this.appPassword;
        }

        /**
         * @return dingDocMcpLink
         */
        public String getDingDocMcpLink() {
            return this.dingDocMcpLink;
        }

        /**
         * @return dingTableMcpLink
         */
        public String getDingTableMcpLink() {
            return this.dingTableMcpLink;
        }

        /**
         * @return knowledgeId
         */
        public String getKnowledgeId() {
            return this.knowledgeId;
        }

        /**
         * @return knowledgeType
         */
        public String getKnowledgeType() {
            return this.knowledgeType;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String appId; 
            private String appPassword; 
            private String dingDocMcpLink; 
            private String dingTableMcpLink; 
            private String knowledgeId; 
            private String knowledgeType; 
            private String userId; 

            private Builder() {
            } 

            private Builder(DingTalkConfiguration model) {
                this.appId = model.appId;
                this.appPassword = model.appPassword;
                this.dingDocMcpLink = model.dingDocMcpLink;
                this.dingTableMcpLink = model.dingTableMcpLink;
                this.knowledgeId = model.knowledgeId;
                this.knowledgeType = model.knowledgeType;
                this.userId = model.userId;
            } 

            /**
             * <p>Not supported. Ignore this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>ignore</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>Not supported. Ignore this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>ignore</p>
             */
            public Builder appPassword(String appPassword) {
                this.appPassword = appPassword;
                return this;
            }

            /**
             * <p>Not supported. Ignore this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>ignore</p>
             */
            public Builder dingDocMcpLink(String dingDocMcpLink) {
                this.dingDocMcpLink = dingDocMcpLink;
                return this;
            }

            /**
             * <p>Not supported. Ignore this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>ignore</p>
             */
            public Builder dingTableMcpLink(String dingTableMcpLink) {
                this.dingTableMcpLink = dingTableMcpLink;
                return this;
            }

            /**
             * <p>Not supported. Ignore this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>ignore</p>
             */
            public Builder knowledgeId(String knowledgeId) {
                this.knowledgeId = knowledgeId;
                return this;
            }

            /**
             * <p>Not supported. Ignore this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>ignore</p>
             */
            public Builder knowledgeType(String knowledgeType) {
                this.knowledgeType = knowledgeType;
                return this;
            }

            /**
             * <p>Not supported. Ignore this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>ignore</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public DingTalkConfiguration build() {
                return new DingTalkConfiguration(this);
            } 

        } 

    }
}
