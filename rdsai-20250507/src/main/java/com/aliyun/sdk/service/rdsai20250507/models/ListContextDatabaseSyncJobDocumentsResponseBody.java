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
 * {@link ListContextDatabaseSyncJobDocumentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListContextDatabaseSyncJobDocumentsResponseBody</p>
 */
public class ListContextDatabaseSyncJobDocumentsResponseBody extends TeaModel {
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

    private ListContextDatabaseSyncJobDocumentsResponseBody(Builder builder) {
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

    public static ListContextDatabaseSyncJobDocumentsResponseBody create() {
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

        private Builder(ListContextDatabaseSyncJobDocumentsResponseBody model) {
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
         * <p>Indicates whether the request is successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListContextDatabaseSyncJobDocumentsResponseBody build() {
            return new ListContextDatabaseSyncJobDocumentsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListContextDatabaseSyncJobDocumentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListContextDatabaseSyncJobDocumentsResponseBody</p>
     */
    public static class Documents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContentHash")
        private String contentHash;

        @com.aliyun.core.annotation.NameInMap("CtxdbDocumentId")
        private String ctxdbDocumentId;

        @com.aliyun.core.annotation.NameInMap("ProviderDocumentId")
        private String providerDocumentId;

        @com.aliyun.core.annotation.NameInMap("RetiredAt")
        private String retiredAt;

        @com.aliyun.core.annotation.NameInMap("SourceUpdateTime")
        private String sourceUpdateTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdatedAt")
        private String updatedAt;

        private Documents(Builder builder) {
            this.contentHash = builder.contentHash;
            this.ctxdbDocumentId = builder.ctxdbDocumentId;
            this.providerDocumentId = builder.providerDocumentId;
            this.retiredAt = builder.retiredAt;
            this.sourceUpdateTime = builder.sourceUpdateTime;
            this.status = builder.status;
            this.updatedAt = builder.updatedAt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Documents create() {
            return builder().build();
        }

        /**
         * @return contentHash
         */
        public String getContentHash() {
            return this.contentHash;
        }

        /**
         * @return ctxdbDocumentId
         */
        public String getCtxdbDocumentId() {
            return this.ctxdbDocumentId;
        }

        /**
         * @return providerDocumentId
         */
        public String getProviderDocumentId() {
            return this.providerDocumentId;
        }

        /**
         * @return retiredAt
         */
        public String getRetiredAt() {
            return this.retiredAt;
        }

        /**
         * @return sourceUpdateTime
         */
        public String getSourceUpdateTime() {
            return this.sourceUpdateTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public static final class Builder {
            private String contentHash; 
            private String ctxdbDocumentId; 
            private String providerDocumentId; 
            private String retiredAt; 
            private String sourceUpdateTime; 
            private String status; 
            private String updatedAt; 

            private Builder() {
            } 

            private Builder(Documents model) {
                this.contentHash = model.contentHash;
                this.ctxdbDocumentId = model.ctxdbDocumentId;
                this.providerDocumentId = model.providerDocumentId;
                this.retiredAt = model.retiredAt;
                this.sourceUpdateTime = model.sourceUpdateTime;
                this.status = model.status;
                this.updatedAt = model.updatedAt;
            } 

            /**
             * <p>The content hash.</p>
             * 
             * <strong>example:</strong>
             * <p>sha256:4b3b7b2e5f6a1c9d8e0f1234567890abcdef1234567890abcdef1234567890ab</p>
             */
            public Builder contentHash(String contentHash) {
                this.contentHash = contentHash;
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
             * <p>The retirement time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-23T10:00:00+08:00</p>
             */
            public Builder retiredAt(String retiredAt) {
                this.retiredAt = retiredAt;
                return this;
            }

            /**
             * <p>The source update time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-23T10:00:00+08:00</p>
             */
            public Builder sourceUpdateTime(String sourceUpdateTime) {
                this.sourceUpdateTime = sourceUpdateTime;
                return this;
            }

            /**
             * <p>The status.</p>
             * 
             * <strong>example:</strong>
             * <p>completed</p>
             */
            public Builder status(String status) {
                this.status = status;
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

            public Documents build() {
                return new Documents(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListContextDatabaseSyncJobDocumentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListContextDatabaseSyncJobDocumentsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Documents")
        private java.util.List<Documents> documents;

        @com.aliyun.core.annotation.NameInMap("Page")
        private Integer page;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private Data(Builder builder) {
            this.documents = builder.documents;
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
         * @return documents
         */
        public java.util.List<Documents> getDocuments() {
            return this.documents;
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
            private java.util.List<Documents> documents; 
            private Integer page; 
            private Integer pageSize; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.documents = model.documents;
                this.page = model.page;
                this.pageSize = model.pageSize;
                this.total = model.total;
            } 

            /**
             * <p>The list of documents.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;ProviderDocumentId&quot;:&quot;doc-1234567890&quot;, &quot;Status&quot;:&quot;completed&quot;, &quot;ContentHash&quot;:&quot;sha256:4b3b7b2e5f6a1c9d8e0f1234567890abcdef1234567890abcdef1234567890ab&quot;, &quot;SourceUpdateTime&quot;:&quot;2026-09-23T10:00:00+08:00&quot;}]</p>
             */
            public Builder documents(java.util.List<Documents> documents) {
                this.documents = documents;
                return this;
            }

            /**
             * <p>The page number, starting from 1.</p>
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
