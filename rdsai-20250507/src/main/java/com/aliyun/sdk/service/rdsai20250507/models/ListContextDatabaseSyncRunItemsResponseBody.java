// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link ListContextDatabaseSyncRunItemsResponseBody} extends {@link TeaModel}
 *
 * <p>ListContextDatabaseSyncRunItemsResponseBody</p>
 */
public class ListContextDatabaseSyncRunItemsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Long httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListContextDatabaseSyncRunItemsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListContextDatabaseSyncRunItemsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Long httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListContextDatabaseSyncRunItemsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample value</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder httpStatusCode(Long httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The message.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample value</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>id-001</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request succeeded.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListContextDatabaseSyncRunItemsResponseBody build() {
            return new ListContextDatabaseSyncRunItemsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListContextDatabaseSyncRunItemsResponseBody} extends {@link TeaModel}
     *
     * <p>ListContextDatabaseSyncRunItemsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArtifactIndex")
        private Integer artifactIndex;

        @com.aliyun.core.annotation.NameInMap("CtxdbDocumentId")
        private String ctxdbDocumentId;

        @com.aliyun.core.annotation.NameInMap("Decision")
        private String decision;

        @com.aliyun.core.annotation.NameInMap("DecisionCategory")
        private String decisionCategory;

        @com.aliyun.core.annotation.NameInMap("ProviderDocumentId")
        private String providerDocumentId;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("SizeBytes")
        private Long sizeBytes;

        @com.aliyun.core.annotation.NameInMap("SourcePath")
        private String sourcePath;

        @com.aliyun.core.annotation.NameInMap("SourceRecordId")
        private String sourceRecordId;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("UpdatedAt")
        private String updatedAt;

        private Items(Builder builder) {
            this.artifactIndex = builder.artifactIndex;
            this.ctxdbDocumentId = builder.ctxdbDocumentId;
            this.decision = builder.decision;
            this.decisionCategory = builder.decisionCategory;
            this.providerDocumentId = builder.providerDocumentId;
            this.reason = builder.reason;
            this.sizeBytes = builder.sizeBytes;
            this.sourcePath = builder.sourcePath;
            this.sourceRecordId = builder.sourceRecordId;
            this.title = builder.title;
            this.updatedAt = builder.updatedAt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return artifactIndex
         */
        public Integer getArtifactIndex() {
            return this.artifactIndex;
        }

        /**
         * @return ctxdbDocumentId
         */
        public String getCtxdbDocumentId() {
            return this.ctxdbDocumentId;
        }

        /**
         * @return decision
         */
        public String getDecision() {
            return this.decision;
        }

        /**
         * @return decisionCategory
         */
        public String getDecisionCategory() {
            return this.decisionCategory;
        }

        /**
         * @return providerDocumentId
         */
        public String getProviderDocumentId() {
            return this.providerDocumentId;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return sizeBytes
         */
        public Long getSizeBytes() {
            return this.sizeBytes;
        }

        /**
         * @return sourcePath
         */
        public String getSourcePath() {
            return this.sourcePath;
        }

        /**
         * @return sourceRecordId
         */
        public String getSourceRecordId() {
            return this.sourceRecordId;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public static final class Builder {
            private Integer artifactIndex; 
            private String ctxdbDocumentId; 
            private String decision; 
            private String decisionCategory; 
            private String providerDocumentId; 
            private String reason; 
            private Long sizeBytes; 
            private String sourcePath; 
            private String sourceRecordId; 
            private String title; 
            private String updatedAt; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.artifactIndex = model.artifactIndex;
                this.ctxdbDocumentId = model.ctxdbDocumentId;
                this.decision = model.decision;
                this.decisionCategory = model.decisionCategory;
                this.providerDocumentId = model.providerDocumentId;
                this.reason = model.reason;
                this.sizeBytes = model.sizeBytes;
                this.sourcePath = model.sourcePath;
                this.sourceRecordId = model.sourceRecordId;
                this.title = model.title;
                this.updatedAt = model.updatedAt;
            } 

            /**
             * <p>The document shard index.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder artifactIndex(Integer artifactIndex) {
                this.artifactIndex = artifactIndex;
                return this;
            }

            /**
             * <p>The ContextDB document ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cd-as1llqmkol****</p>
             */
            public Builder ctxdbDocumentId(String ctxdbDocumentId) {
                this.ctxdbDocumentId = ctxdbDocumentId;
                return this;
            }

            /**
             * <p>The fine-grained execution status of the current synchronization item, which indicates the processing result of a single document in the current run. Common valid values include uploaded, uploaded-pending-review, upload-accepted, upload-busy, metadata-updating, metadata-updated, migrated, failed, source-failed, replace, warning, deferred, resume, skip, skipped, unsupported, and cancelled.</p>
             * 
             * <strong>example:</strong>
             * <p>uploaded</p>
             */
            public Builder decision(String decision) {
                this.decision = decision;
                return this;
            }

            /**
             * <p>The aggregated display status of the current synchronization item. Known mappings include success, failure, processing, and skipped. Unknown Decision values are passed through as-is.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder decisionCategory(String decisionCategory) {
                this.decisionCategory = decisionCategory;
                return this;
            }

            /**
             * <p>The source document ID.</p>
             * 
             * <strong>example:</strong>
             * <p>doc-1234567890</p>
             */
            public Builder providerDocumentId(String providerDocumentId) {
                this.providerDocumentId = providerDocumentId;
                return this;
            }

            /**
             * <p>The processing reason or failure reason.</p>
             * 
             * <strong>example:</strong>
             * <p>The data source authorization has expired</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The size in bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>1048576</p>
             */
            public Builder sizeBytes(Long sizeBytes) {
                this.sizeBytes = sizeBytes;
                return this;
            }

            /**
             * <p>The source path.</p>
             * 
             * <strong>example:</strong>
             * <p>/Development Documents/Project Plan</p>
             */
            public Builder sourcePath(String sourcePath) {
                this.sourcePath = sourcePath;
                return this;
            }

            /**
             * <p>The source record ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sr-as1llqmkol****</p>
             */
            public Builder sourceRecordId(String sourceRecordId) {
                this.sourceRecordId = sourceRecordId;
                return this;
            }

            /**
             * <p>The title.</p>
             * 
             * <strong>example:</strong>
             * <p>Project Plan</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-23T10:00:00+08:00</p>
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListContextDatabaseSyncRunItemsResponseBody} extends {@link TeaModel}
     *
     * <p>ListContextDatabaseSyncRunItemsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Items")
        private java.util.List<Items> items;

        @com.aliyun.core.annotation.NameInMap("Page")
        private Integer page;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private Data(Builder builder) {
            this.items = builder.items;
            this.page = builder.page;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List<Items> getItems() {
            return this.items;
        }

        /**
         * @return page
         */
        public Integer getPage() {
            return this.page;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<Items> items; 
            private Integer page; 
            private Integer pageSize; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.items = model.items;
                this.page = model.page;
                this.pageSize = model.pageSize;
                this.total = model.total;
            } 

            /**
             * <p>The data list.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;SourceRecordId&quot;:&quot;sr-as1llqmkol****&quot;, &quot;ArtifactIndex&quot;:0, &quot;ProviderDocumentId&quot;:&quot;doc-1234567890&quot;, &quot;Title&quot;:&quot;Project Plan&quot;}]</p>
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            /**
             * <p>The page number. Pages start from 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder page(Integer page) {
                this.page = page;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
