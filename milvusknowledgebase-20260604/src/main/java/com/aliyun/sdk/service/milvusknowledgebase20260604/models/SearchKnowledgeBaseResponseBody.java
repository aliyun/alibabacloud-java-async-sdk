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
 * {@link SearchKnowledgeBaseResponseBody} extends {@link TeaModel}
 *
 * <p>SearchKnowledgeBaseResponseBody</p>
 */
public class SearchKnowledgeBaseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("evidenceNextToken")
    private String evidenceNextToken;

    @com.aliyun.core.annotation.NameInMap("evidenceResults")
    private java.util.List<EvidenceResults> evidenceResults;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("queryLabels")
    private java.util.List<String> queryLabels;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("results")
    private java.util.List<Results> results;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Long totalCount;

    private SearchKnowledgeBaseResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.evidenceNextToken = builder.evidenceNextToken;
        this.evidenceResults = builder.evidenceResults;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.queryLabels = builder.queryLabels;
        this.requestId = builder.requestId;
        this.results = builder.results;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchKnowledgeBaseResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return evidenceNextToken
     */
    public String getEvidenceNextToken() {
        return this.evidenceNextToken;
    }

    /**
     * @return evidenceResults
     */
    public java.util.List<EvidenceResults> getEvidenceResults() {
        return this.evidenceResults;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return queryLabels
     */
    public java.util.List<String> getQueryLabels() {
        return this.queryLabels;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return results
     */
    public java.util.List<Results> getResults() {
        return this.results;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private Integer code; 
        private String evidenceNextToken; 
        private java.util.List<EvidenceResults> evidenceResults; 
        private Integer httpStatusCode; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List<String> queryLabels; 
        private String requestId; 
        private java.util.List<Results> results; 
        private Boolean success; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(SearchKnowledgeBaseResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.evidenceNextToken = model.evidenceNextToken;
            this.evidenceResults = model.evidenceResults;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.queryLabels = model.queryLabels;
            this.requestId = model.requestId;
            this.results = model.results;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The access denial details.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;PolicyType&quot;:&quot;AccountLevelIdentityBasedPolicy&quot;,&quot;NoPermissionType&quot;:&quot;ImplicitDeny&quot;,&quot;AuthAction&quot;:&quot;milvusknowledgebase:SearchKnowledgeBase&quot;}</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Optional. Conditionally returned. Required when includeWiki is set to true. The cursor for the next page of evidence. Null for the last page. Not used for legacy results pagination. Null is allowed. The not-equal-to condition can be omitted. Constraints: {&quot;minLength&quot;:1,&quot;maxLength&quot;:4096}.</p>
         * 
         * <strong>example:</strong>
         * <p>example-opaque-next-token</p>
         */
        public Builder evidenceNextToken(String evidenceNextToken) {
            this.evidenceNextToken = evidenceNextToken;
            return this;
        }

        /**
         * <p>Optional. Conditionally returned. Returned only when includeWiki is set to true. The current page of unified and merged evidence. Constraints: {&quot;minItems&quot;:0,&quot;maxItems&quot;:100}.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;evidenceId&quot;:&quot;wiki_section_page_1_sec_1_rev_7&quot;,&quot;kind&quot;:&quot;wiki_section&quot;,&quot;knowledgeBaseId&quot;:&quot;example_kb&quot;,&quot;documentId&quot;:null,&quot;chunkId&quot;:null,&quot;pageId&quot;:&quot;page_1&quot;,&quot;sectionId&quot;:&quot;sec_1&quot;,&quot;entityId&quot;:null,&quot;relationId&quot;:null,&quot;revisionId&quot;:&quot;rev_7&quot;,&quot;batchId&quot;:&quot;batch_7&quot;,&quot;title&quot;:&quot;Warranty instructions&quot;,&quot;content&quot;:&quot;The warranty period for Product A is 18 months.&quot;,&quot;score&quot;:0.62,&quot;sourceRefs&quot;:[{&quot;documentId&quot;:&quot;doc_manual&quot;,&quot;chunkId&quot;:&quot;chunk_1&quot;,&quot;sourceRevisionId&quot;:&quot;source_rev_7&quot;,&quot;version&quot;:&quot;DRAFT&quot;}],&quot;sourceRefCount&quot;:1,&quot;sourceRefsTruncated&quot;:false,&quot;sourceTaskId&quot;:&quot;11111111111111111111111111111111&quot;}]</p>
         */
        public Builder evidenceResults(java.util.List<EvidenceResults> evidenceResults) {
            this.evidenceResults = evidenceResults;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of items per page.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The query labels.</p>
         */
        public Builder queryLabels(java.util.List<String> queryLabels) {
            this.queryLabels = queryLabels;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>019FCC42-90DE-56D3-A10D-3C06995DED17</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of retrieval results.</p>
         */
        public Builder results(java.util.List<Results> results) {
            this.results = results;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of results.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public SearchKnowledgeBaseResponseBody build() {
            return new SearchKnowledgeBaseResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SearchKnowledgeBaseResponseBody} extends {@link TeaModel}
     *
     * <p>SearchKnowledgeBaseResponseBody</p>
     */
    public static class SourceRefs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("chunkId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String chunkId;

        @com.aliyun.core.annotation.NameInMap("documentId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String documentId;

        @com.aliyun.core.annotation.NameInMap("documentName")
        private String documentName;

        @com.aliyun.core.annotation.NameInMap("mediaEndMs")
        private Long mediaEndMs;

        @com.aliyun.core.annotation.NameInMap("mediaStartMs")
        private Long mediaStartMs;

        @com.aliyun.core.annotation.NameInMap("pageNumber")
        private Long pageNumber;

        @com.aliyun.core.annotation.NameInMap("sourceRevisionId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String sourceRevisionId;

        @com.aliyun.core.annotation.NameInMap("version")
        @com.aliyun.core.annotation.Validation(required = true)
        private String version;

        private SourceRefs(Builder builder) {
            this.chunkId = builder.chunkId;
            this.documentId = builder.documentId;
            this.documentName = builder.documentName;
            this.mediaEndMs = builder.mediaEndMs;
            this.mediaStartMs = builder.mediaStartMs;
            this.pageNumber = builder.pageNumber;
            this.sourceRevisionId = builder.sourceRevisionId;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceRefs create() {
            return builder().build();
        }

        /**
         * @return chunkId
         */
        public String getChunkId() {
            return this.chunkId;
        }

        /**
         * @return documentId
         */
        public String getDocumentId() {
            return this.documentId;
        }

        /**
         * @return documentName
         */
        public String getDocumentName() {
            return this.documentName;
        }

        /**
         * @return mediaEndMs
         */
        public Long getMediaEndMs() {
            return this.mediaEndMs;
        }

        /**
         * @return mediaStartMs
         */
        public Long getMediaStartMs() {
            return this.mediaStartMs;
        }

        /**
         * @return pageNumber
         */
        public Long getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return sourceRevisionId
         */
        public String getSourceRevisionId() {
            return this.sourceRevisionId;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String chunkId; 
            private String documentId; 
            private String documentName; 
            private Long mediaEndMs; 
            private Long mediaStartMs; 
            private Long pageNumber; 
            private String sourceRevisionId; 
            private String version; 

            private Builder() {
            } 

            private Builder(SourceRefs model) {
                this.chunkId = model.chunkId;
                this.documentId = model.documentId;
                this.documentName = model.documentName;
                this.mediaEndMs = model.mediaEndMs;
                this.mediaStartMs = model.mediaStartMs;
                this.pageNumber = model.pageNumber;
                this.sourceRevisionId = model.sourceRevisionId;
                this.version = model.version;
            } 

            /**
             * <p>Required. Always returned. The opaque business ID generated by the server. Validates ownership and does not accept arbitrary paths. Constraints: {&quot;minLength&quot;:1,&quot;maxLength&quot;:128,&quot;pattern&quot;:&quot;^[A-Za-z0-9][A-Za-z0-9_-]{0,127}$&quot;}.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>example_value</p>
             */
            public Builder chunkId(String chunkId) {
                this.chunkId = chunkId;
                return this;
            }

            /**
             * <p>Required. Always returned. The opaque business ID generated by the server. Validates ownership and does not accept arbitrary paths. Constraints: {&quot;minLength&quot;:1,&quot;maxLength&quot;:128,&quot;pattern&quot;:&quot;^[A-Za-z0-9][A-Za-z0-9_-]{0,127}$&quot;}.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>example_value</p>
             */
            public Builder documentId(String documentId) {
                this.documentId = documentId;
                return this;
            }

            /**
             * <p>Optional. Conditionally returned. The document name returned only after authorization. Constraints: {&quot;maxLength&quot;:1024}.</p>
             * 
             * <strong>example:</strong>
             * <p>example_value</p>
             */
            public Builder documentName(String documentName) {
                this.documentName = documentName;
                return this;
            }

            /**
             * <p>Optional. Conditionally returned. Null is allowed. The semantics of null values follow the field description. Null is allowed. The not-equal-to condition can be omitted. Constraints: {&quot;minimum&quot;:0,&quot;maximum&quot;:9223372036854775807}.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder mediaEndMs(Long mediaEndMs) {
                this.mediaEndMs = mediaEndMs;
                return this;
            }

            /**
             * <p>Optional. Conditionally returned. Null is allowed. The semantics of null values follow the field description. Null is allowed. The not-equal-to condition can be omitted. Constraints: {&quot;minimum&quot;:0,&quot;maximum&quot;:9223372036854775807}.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder mediaStartMs(Long mediaStartMs) {
                this.mediaStartMs = mediaStartMs;
                return this;
            }

            /**
             * <p>Optional. Conditionally returned. Null is allowed. The semantics of null values follow the field description. Null is allowed. The not-equal-to condition can be omitted. Constraints: {&quot;minimum&quot;:1,&quot;maximum&quot;:9223372036854775807}.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>Required. Always returned. The opaque business ID generated by the server. Validates ownership and does not accept arbitrary paths. Constraints: {&quot;minLength&quot;:1,&quot;maxLength&quot;:128,&quot;pattern&quot;:&quot;^[A-Za-z0-9][A-Za-z0-9_-]{0,127}$&quot;}.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>example_value</p>
             */
            public Builder sourceRevisionId(String sourceRevisionId) {
                this.sourceRevisionId = sourceRevisionId;
                return this;
            }

            /**
             * <p>Required. Always returned. The display name of the version. Does not fall back to draft if invalid or unavailable. Constraints: {&quot;maxLength&quot;:64,&quot;pattern&quot;:&quot;^(DRAFT|LATEST_PUBLISHED|v[1-9][0-9]*)$&quot;,&quot;default&quot;:&quot;DRAFT&quot;}.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>DRAFT</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public SourceRefs build() {
                return new SourceRefs(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchKnowledgeBaseResponseBody} extends {@link TeaModel}
     *
     * <p>SearchKnowledgeBaseResponseBody</p>
     */
    public static class EvidenceResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("batchId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String batchId;

        @com.aliyun.core.annotation.NameInMap("chunkId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String chunkId;

        @com.aliyun.core.annotation.NameInMap("content")
        @com.aliyun.core.annotation.Validation(required = true)
        private String content;

        @com.aliyun.core.annotation.NameInMap("documentId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String documentId;

        @com.aliyun.core.annotation.NameInMap("entityId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String entityId;

        @com.aliyun.core.annotation.NameInMap("evidenceId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String evidenceId;

        @com.aliyun.core.annotation.NameInMap("kind")
        @com.aliyun.core.annotation.Validation(required = true)
        private String kind;

        @com.aliyun.core.annotation.NameInMap("knowledgeBaseId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String knowledgeBaseId;

        @com.aliyun.core.annotation.NameInMap("pageId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String pageId;

        @com.aliyun.core.annotation.NameInMap("relationId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String relationId;

        @com.aliyun.core.annotation.NameInMap("revisionId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String revisionId;

        @com.aliyun.core.annotation.NameInMap("score")
        @com.aliyun.core.annotation.Validation(required = true)
        private Double score;

        @com.aliyun.core.annotation.NameInMap("sectionId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String sectionId;

        @com.aliyun.core.annotation.NameInMap("sourceRefCount")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long sourceRefCount;

        @com.aliyun.core.annotation.NameInMap("sourceRefs")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<SourceRefs> sourceRefs;

        @com.aliyun.core.annotation.NameInMap("sourceRefsTruncated")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean sourceRefsTruncated;

        @com.aliyun.core.annotation.NameInMap("sourceTaskId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String sourceTaskId;

        @com.aliyun.core.annotation.NameInMap("title")
        @com.aliyun.core.annotation.Validation(required = true)
        private String title;

        private EvidenceResults(Builder builder) {
            this.batchId = builder.batchId;
            this.chunkId = builder.chunkId;
            this.content = builder.content;
            this.documentId = builder.documentId;
            this.entityId = builder.entityId;
            this.evidenceId = builder.evidenceId;
            this.kind = builder.kind;
            this.knowledgeBaseId = builder.knowledgeBaseId;
            this.pageId = builder.pageId;
            this.relationId = builder.relationId;
            this.revisionId = builder.revisionId;
            this.score = builder.score;
            this.sectionId = builder.sectionId;
            this.sourceRefCount = builder.sourceRefCount;
            this.sourceRefs = builder.sourceRefs;
            this.sourceRefsTruncated = builder.sourceRefsTruncated;
            this.sourceTaskId = builder.sourceTaskId;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EvidenceResults create() {
            return builder().build();
        }

        /**
         * @return batchId
         */
        public String getBatchId() {
            return this.batchId;
        }

        /**
         * @return chunkId
         */
        public String getChunkId() {
            return this.chunkId;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return documentId
         */
        public String getDocumentId() {
            return this.documentId;
        }

        /**
         * @return entityId
         */
        public String getEntityId() {
            return this.entityId;
        }

        /**
         * @return evidenceId
         */
        public String getEvidenceId() {
            return this.evidenceId;
        }

        /**
         * @return kind
         */
        public String getKind() {
            return this.kind;
        }

        /**
         * @return knowledgeBaseId
         */
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        /**
         * @return pageId
         */
        public String getPageId() {
            return this.pageId;
        }

        /**
         * @return relationId
         */
        public String getRelationId() {
            return this.relationId;
        }

        /**
         * @return revisionId
         */
        public String getRevisionId() {
            return this.revisionId;
        }

        /**
         * @return score
         */
        public Double getScore() {
            return this.score;
        }

        /**
         * @return sectionId
         */
        public String getSectionId() {
            return this.sectionId;
        }

        /**
         * @return sourceRefCount
         */
        public Long getSourceRefCount() {
            return this.sourceRefCount;
        }

        /**
         * @return sourceRefs
         */
        public java.util.List<SourceRefs> getSourceRefs() {
            return this.sourceRefs;
        }

        /**
         * @return sourceRefsTruncated
         */
        public Boolean getSourceRefsTruncated() {
            return this.sourceRefsTruncated;
        }

        /**
         * @return sourceTaskId
         */
        public String getSourceTaskId() {
            return this.sourceTaskId;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String batchId; 
            private String chunkId; 
            private String content; 
            private String documentId; 
            private String entityId; 
            private String evidenceId; 
            private String kind; 
            private String knowledgeBaseId; 
            private String pageId; 
            private String relationId; 
            private String revisionId; 
            private Double score; 
            private String sectionId; 
            private Long sourceRefCount; 
            private java.util.List<SourceRefs> sourceRefs; 
            private Boolean sourceRefsTruncated; 
            private String sourceTaskId; 
            private String title; 

            private Builder() {
            } 

            private Builder(EvidenceResults model) {
                this.batchId = model.batchId;
                this.chunkId = model.chunkId;
                this.content = model.content;
                this.documentId = model.documentId;
                this.entityId = model.entityId;
                this.evidenceId = model.evidenceId;
                this.kind = model.kind;
                this.knowledgeBaseId = model.knowledgeBaseId;
                this.pageId = model.pageId;
                this.relationId = model.relationId;
                this.revisionId = model.revisionId;
                this.score = model.score;
                this.sectionId = model.sectionId;
                this.sourceRefCount = model.sourceRefCount;
                this.sourceRefs = model.sourceRefs;
                this.sourceRefsTruncated = model.sourceRefsTruncated;
                this.sourceTaskId = model.sourceTaskId;
                this.title = model.title;
            } 

            /**
             * <p>Required. Always returned. Null is allowed. The semantics of null values follow the field description. Null is allowed. The not-equal-to condition can be omitted. Constraints: {&quot;minLength&quot;:1,&quot;maxLength&quot;:128,&quot;pattern&quot;:&quot;^[A-Za-z0-9][A-Za-z0-9_-]{0,127}$&quot;}.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder batchId(String batchId) {
                this.batchId = batchId;
                return this;
            }

            /**
             * <p>Required. Always returned. Null is allowed. The semantics of null values follow the field description. Null is allowed. The not-equal-to condition can be omitted. Constraints: {&quot;minLength&quot;:1,&quot;maxLength&quot;:128,&quot;pattern&quot;:&quot;^[A-Za-z0-9][A-Za-z0-9_-]{0,127}$&quot;}.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder chunkId(String chunkId) {
                this.chunkId = chunkId;
                return this;
            }

            /**
             * <p>Required. Always returned. The readable evidence text. Constraints: {&quot;maxLength&quot;:65535}.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>The warranty period for Product A is 18 months</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>Required. Always returned. Null is allowed. The semantics of null values follow the field description. Null is allowed. The not-equal-to condition can be omitted. Constraints: {&quot;minLength&quot;:1,&quot;maxLength&quot;:128,&quot;pattern&quot;:&quot;^[A-Za-z0-9][A-Za-z0-9_-]{0,127}$&quot;}.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder documentId(String documentId) {
                this.documentId = documentId;
                return this;
            }

            /**
             * <p>Required. Always returned. Null is allowed. The semantics of null values follow the field description. Null is allowed. The not-equal-to condition can be omitted. Constraints: {&quot;minLength&quot;:1,&quot;maxLength&quot;:128,&quot;pattern&quot;:&quot;^[A-Za-z0-9][A-Za-z0-9_-]{0,127}$&quot;}.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * <p>Required. Always returned. The opaque business ID generated by the server. Validates ownership and does not accept arbitrary paths. Constraints: {&quot;minLength&quot;:1,&quot;maxLength&quot;:128,&quot;pattern&quot;:&quot;^[A-Za-z0-9][A-Za-z0-9_-]{0,127}$&quot;}.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>wiki_section_page_1_sec_1_rev_7</p>
             */
            public Builder evidenceId(String evidenceId) {
                this.evidenceId = evidenceId;
                return this;
            }

            /**
             * <p>Required. Always returned. The actual evidence object type. Constraints: {&quot;enum&quot;:[&quot;raw&quot;,&quot;wiki_page&quot;,&quot;wiki_section&quot;,&quot;graph_fact&quot;],&quot;maxLength&quot;:64}.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>wiki_section</p>
             */
            public Builder kind(String kind) {
                this.kind = kind;
                return this;
            }

            /**
             * <p>Required. Always returned. The opaque business ID generated by the server. Validates ownership and does not accept arbitrary paths. Constraints: {&quot;minLength&quot;:1,&quot;maxLength&quot;:128,&quot;pattern&quot;:&quot;^[A-Za-z0-9][A-Za-z0-9_-]{0,127}$&quot;}.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>example_kb</p>
             */
            public Builder knowledgeBaseId(String knowledgeBaseId) {
                this.knowledgeBaseId = knowledgeBaseId;
                return this;
            }

            /**
             * <p>Required. Always returned. Null is allowed. The semantics of null values follow the field description. Null is allowed. The not-equal-to condition can be omitted. Constraints: {&quot;minLength&quot;:1,&quot;maxLength&quot;:128,&quot;pattern&quot;:&quot;^[A-Za-z0-9][A-Za-z0-9_-]{0,127}$&quot;}.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>page_1</p>
             */
            public Builder pageId(String pageId) {
                this.pageId = pageId;
                return this;
            }

            /**
             * <p>Required. Always returned. Null is allowed. The semantics of null values follow the field description. Null is allowed. The not-equal-to condition can be omitted. Constraints: {&quot;minLength&quot;:1,&quot;maxLength&quot;:128,&quot;pattern&quot;:&quot;^[A-Za-z0-9][A-Za-z0-9_-]{0,127}$&quot;}.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder relationId(String relationId) {
                this.relationId = relationId;
                return this;
            }

            /**
             * <p>Required. Always returned. The opaque business ID generated by the server. Validates ownership and does not accept arbitrary paths. Constraints: {&quot;minLength&quot;:1,&quot;maxLength&quot;:128,&quot;pattern&quot;:&quot;^[A-Za-z0-9][A-Za-z0-9_-]{0,127}$&quot;}.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>example_value</p>
             */
            public Builder revisionId(String revisionId) {
                this.revisionId = revisionId;
                return this;
            }

            /**
             * <p>Required. Always returned. The finite numerical value used for unified ranking. For hybrid, it is the relevance of the existing Dealer.rerank. For rerank, it is the text and model hybrid relevance of the existing Dealer.rerank_by_model, along the semanticWeight and rank feature, which is not a relevance probability. The minScore is applied according to the existing unified scoring rules. Can be null for non-ranking fact evidence. Null is allowed. The not-equal-to condition can be omitted.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0.62</p>
             */
            public Builder score(Double score) {
                this.score = score;
                return this;
            }

            /**
             * <p>Required. Always returned. Null is allowed. The semantics of null values follow the field description. Null is allowed. The not-equal-to condition can be omitted. Constraints: {&quot;minLength&quot;:1,&quot;maxLength&quot;:128,&quot;pattern&quot;:&quot;^[A-Za-z0-9][A-Za-z0-9_-]{0,127}$&quot;}.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>sec_1</p>
             */
            public Builder sectionId(String sectionId) {
                this.sectionId = sectionId;
                return this;
            }

            /**
             * <p>Required. Always returned. The total number of source chunk references. Authorization is performed on the full set. Constraints: {&quot;minimum&quot;:1,&quot;maximum&quot;:9223372036854775807}.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sourceRefCount(Long sourceRefCount) {
                this.sourceRefCount = sourceRefCount;
                return this;
            }

            /**
             * <p>Required. Always returned. The actually supported sources. Constraints: {&quot;minItems&quot;:1,&quot;maxItems&quot;:1000}.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;documentId&quot;:&quot;doc_manual&quot;,&quot;chunkId&quot;:&quot;chunk_1&quot;,&quot;sourceRevisionId&quot;:&quot;source_rev_7&quot;,&quot;version&quot;:&quot;DRAFT&quot;,&quot;contentHash&quot;:&quot;aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa&quot;}]</p>
             */
            public Builder sourceRefs(java.util.List<SourceRefs> sourceRefs) {
                this.sourceRefs = sourceRefs;
                return this;
            }

            /**
             * <p>Required. Always returned. True when a single sourceRefs contains only the first 1000 items. You can paginate and verify by using sourceTaskId.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder sourceRefsTruncated(Boolean sourceRefsTruncated) {
                this.sourceRefsTruncated = sourceRefsTruncated;
                return this;
            }

            /**
             * <p>Required. Always returned. The entry point for complete sources. Must be a non-null locator when sourceRefsTruncated is true. The source operation references held by the artifact or revision remain readable, and archiving task details does not delete this source manifest. Null is allowed. The not-equal-to condition can be omitted. Constraints: {&quot;minLength&quot;:32,&quot;maxLength&quot;:32,&quot;pattern&quot;:&quot;^[0-9a-f]{32}$&quot;}.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder sourceTaskId(String sourceTaskId) {
                this.sourceTaskId = sourceTaskId;
                return this;
            }

            /**
             * <p>Required. Always returned. The display title after authorization. Constraints: {&quot;maxLength&quot;:1024}.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Warranty instructions</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public EvidenceResults build() {
                return new EvidenceResults(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchKnowledgeBaseResponseBody} extends {@link TeaModel}
     *
     * <p>SearchKnowledgeBaseResponseBody</p>
     */
    public static class Images extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("imageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private Images(Builder builder) {
            this.imageId = builder.imageId;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Images create() {
            return builder().build();
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String imageId; 
            private String url; 

            private Builder() {
            } 

            private Builder(Images model) {
                this.imageId = model.imageId;
                this.url = model.url;
            } 

            /**
             * <p>The image ID.</p>
             * 
             * <strong>example:</strong>
             * <p>kd-620ad908ec651-41253795bafd7a1c</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The temporary access URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/signed-image">https://example.com/signed-image</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Images build() {
                return new Images(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchKnowledgeBaseResponseBody} extends {@link TeaModel}
     *
     * <p>SearchKnowledgeBaseResponseBody</p>
     */
    public static class Locations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bottom")
        private Integer bottom;

        @com.aliyun.core.annotation.NameInMap("left")
        private Integer left;

        @com.aliyun.core.annotation.NameInMap("pageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("right")
        private Integer right;

        @com.aliyun.core.annotation.NameInMap("top")
        private Integer top;

        private Locations(Builder builder) {
            this.bottom = builder.bottom;
            this.left = builder.left;
            this.pageNumber = builder.pageNumber;
            this.right = builder.right;
            this.top = builder.top;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Locations create() {
            return builder().build();
        }

        /**
         * @return bottom
         */
        public Integer getBottom() {
            return this.bottom;
        }

        /**
         * @return left
         */
        public Integer getLeft() {
            return this.left;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return right
         */
        public Integer getRight() {
            return this.right;
        }

        /**
         * @return top
         */
        public Integer getTop() {
            return this.top;
        }

        public static final class Builder {
            private Integer bottom; 
            private Integer left; 
            private Integer pageNumber; 
            private Integer right; 
            private Integer top; 

            private Builder() {
            } 

            private Builder(Locations model) {
                this.bottom = model.bottom;
                this.left = model.left;
                this.pageNumber = model.pageNumber;
                this.right = model.right;
                this.top = model.top;
            } 

            /**
             * <p>The bottom edge.</p>
             * 
             * <strong>example:</strong>
             * <p>364</p>
             */
            public Builder bottom(Integer bottom) {
                this.bottom = bottom;
                return this;
            }

            /**
             * <p>The left edge.</p>
             * 
             * <strong>example:</strong>
             * <p>13</p>
             */
            public Builder left(Integer left) {
                this.left = left;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The right edge.</p>
             * 
             * <strong>example:</strong>
             * <p>566</p>
             */
            public Builder right(Integer right) {
                this.right = right;
                return this;
            }

            /**
             * <p>The top edge.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder top(Integer top) {
                this.top = top;
                return this;
            }

            public Locations build() {
                return new Locations(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchKnowledgeBaseResponseBody} extends {@link TeaModel}
     *
     * <p>SearchKnowledgeBaseResponseBody</p>
     */
    public static class MediaTimeline extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endMs")
        private Long endMs;

        @com.aliyun.core.annotation.NameInMap("startMs")
        private Long startMs;

        @com.aliyun.core.annotation.NameInMap("text")
        private String text;

        private MediaTimeline(Builder builder) {
            this.endMs = builder.endMs;
            this.startMs = builder.startMs;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaTimeline create() {
            return builder().build();
        }

        /**
         * @return endMs
         */
        public Long getEndMs() {
            return this.endMs;
        }

        /**
         * @return startMs
         */
        public Long getStartMs() {
            return this.startMs;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private Long endMs; 
            private Long startMs; 
            private String text; 

            private Builder() {
            } 

            private Builder(MediaTimeline model) {
                this.endMs = model.endMs;
                this.startMs = model.startMs;
                this.text = model.text;
            } 

            /**
             * <p>The end time of the segment.</p>
             * 
             * <strong>example:</strong>
             * <p>4200</p>
             */
            public Builder endMs(Long endMs) {
                this.endMs = endMs;
                return this;
            }

            /**
             * <p>The start time of the segment.</p>
             * 
             * <strong>example:</strong>
             * <p>1250</p>
             */
            public Builder startMs(Long startMs) {
                this.startMs = startMs;
                return this;
            }

            /**
             * <p>The text of the segment.</p>
             * 
             * <strong>example:</strong>
             * <p>The first sentence</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public MediaTimeline build() {
                return new MediaTimeline(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchKnowledgeBaseResponseBody} extends {@link TeaModel}
     *
     * <p>SearchKnowledgeBaseResponseBody</p>
     */
    public static class ScoreDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("keywordScore")
        private Float keywordScore;

        @com.aliyun.core.annotation.NameInMap("semanticScore")
        private Float semanticScore;

        private ScoreDetails(Builder builder) {
            this.keywordScore = builder.keywordScore;
            this.semanticScore = builder.semanticScore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScoreDetails create() {
            return builder().build();
        }

        /**
         * @return keywordScore
         */
        public Float getKeywordScore() {
            return this.keywordScore;
        }

        /**
         * @return semanticScore
         */
        public Float getSemanticScore() {
            return this.semanticScore;
        }

        public static final class Builder {
            private Float keywordScore; 
            private Float semanticScore; 

            private Builder() {
            } 

            private Builder(ScoreDetails model) {
                this.keywordScore = model.keywordScore;
                this.semanticScore = model.semanticScore;
            } 

            /**
             * <p>The keyword relevance score.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0000000014285714</p>
             */
            public Builder keywordScore(Float keywordScore) {
                this.keywordScore = keywordScore;
                return this;
            }

            /**
             * <p>The semantic relevance score.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5227377</p>
             */
            public Builder semanticScore(Float semanticScore) {
                this.semanticScore = semanticScore;
                return this;
            }

            public ScoreDetails build() {
                return new ScoreDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchKnowledgeBaseResponseBody} extends {@link TeaModel}
     *
     * <p>SearchKnowledgeBaseResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("chunkId")
        private String chunkId;

        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("contentType")
        private String contentType;

        @com.aliyun.core.annotation.NameInMap("documentId")
        private String documentId;

        @com.aliyun.core.annotation.NameInMap("documentName")
        private String documentName;

        @com.aliyun.core.annotation.NameInMap("images")
        private java.util.List<Images> images;

        @com.aliyun.core.annotation.NameInMap("knowledgeBaseId")
        private String knowledgeBaseId;

        @com.aliyun.core.annotation.NameInMap("locations")
        private java.util.List<Locations> locations;

        @com.aliyun.core.annotation.NameInMap("mediaEndMs")
        private Long mediaEndMs;

        @com.aliyun.core.annotation.NameInMap("mediaStartMs")
        private Long mediaStartMs;

        @com.aliyun.core.annotation.NameInMap("mediaTimeline")
        private java.util.List<MediaTimeline> mediaTimeline;

        @com.aliyun.core.annotation.NameInMap("parentChunkId")
        private String parentChunkId;

        @com.aliyun.core.annotation.NameInMap("scalarFields")
        private Object scalarFields;

        @com.aliyun.core.annotation.NameInMap("score")
        private Float score;

        @com.aliyun.core.annotation.NameInMap("scoreDetails")
        private ScoreDetails scoreDetails;

        @com.aliyun.core.annotation.NameInMap("tags")
        private java.util.List<String> tags;

        private Results(Builder builder) {
            this.chunkId = builder.chunkId;
            this.content = builder.content;
            this.contentType = builder.contentType;
            this.documentId = builder.documentId;
            this.documentName = builder.documentName;
            this.images = builder.images;
            this.knowledgeBaseId = builder.knowledgeBaseId;
            this.locations = builder.locations;
            this.mediaEndMs = builder.mediaEndMs;
            this.mediaStartMs = builder.mediaStartMs;
            this.mediaTimeline = builder.mediaTimeline;
            this.parentChunkId = builder.parentChunkId;
            this.scalarFields = builder.scalarFields;
            this.score = builder.score;
            this.scoreDetails = builder.scoreDetails;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return chunkId
         */
        public String getChunkId() {
            return this.chunkId;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
        }

        /**
         * @return documentId
         */
        public String getDocumentId() {
            return this.documentId;
        }

        /**
         * @return documentName
         */
        public String getDocumentName() {
            return this.documentName;
        }

        /**
         * @return images
         */
        public java.util.List<Images> getImages() {
            return this.images;
        }

        /**
         * @return knowledgeBaseId
         */
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        /**
         * @return locations
         */
        public java.util.List<Locations> getLocations() {
            return this.locations;
        }

        /**
         * @return mediaEndMs
         */
        public Long getMediaEndMs() {
            return this.mediaEndMs;
        }

        /**
         * @return mediaStartMs
         */
        public Long getMediaStartMs() {
            return this.mediaStartMs;
        }

        /**
         * @return mediaTimeline
         */
        public java.util.List<MediaTimeline> getMediaTimeline() {
            return this.mediaTimeline;
        }

        /**
         * @return parentChunkId
         */
        public String getParentChunkId() {
            return this.parentChunkId;
        }

        /**
         * @return scalarFields
         */
        public Object getScalarFields() {
            return this.scalarFields;
        }

        /**
         * @return score
         */
        public Float getScore() {
            return this.score;
        }

        /**
         * @return scoreDetails
         */
        public ScoreDetails getScoreDetails() {
            return this.scoreDetails;
        }

        /**
         * @return tags
         */
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String chunkId; 
            private String content; 
            private String contentType; 
            private String documentId; 
            private String documentName; 
            private java.util.List<Images> images; 
            private String knowledgeBaseId; 
            private java.util.List<Locations> locations; 
            private Long mediaEndMs; 
            private Long mediaStartMs; 
            private java.util.List<MediaTimeline> mediaTimeline; 
            private String parentChunkId; 
            private Object scalarFields; 
            private Float score; 
            private ScoreDetails scoreDetails; 
            private java.util.List<String> tags; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.chunkId = model.chunkId;
                this.content = model.content;
                this.contentType = model.contentType;
                this.documentId = model.documentId;
                this.documentName = model.documentName;
                this.images = model.images;
                this.knowledgeBaseId = model.knowledgeBaseId;
                this.locations = model.locations;
                this.mediaEndMs = model.mediaEndMs;
                this.mediaStartMs = model.mediaStartMs;
                this.mediaTimeline = model.mediaTimeline;
                this.parentChunkId = model.parentChunkId;
                this.scalarFields = model.scalarFields;
                this.score = model.score;
                this.scoreDetails = model.scoreDetails;
                this.tags = model.tags;
            } 

            /**
             * <p>The chunk ID.</p>
             * 
             * <strong>example:</strong>
             * <p>7f0de3e041322a1d</p>
             */
            public Builder chunkId(String chunkId) {
                this.chunkId = chunkId;
                return this;
            }

            /**
             * <p>The chunk content.</p>
             * 
             * <strong>example:</strong>
             * <p>Tax amount 1.59</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The content type.</p>
             * 
             * <strong>example:</strong>
             * <p>table</p>
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * <p>The document ID.</p>
             * 
             * <strong>example:</strong>
             * <p>539ddb688fe811f182f637422a0713b5</p>
             */
            public Builder documentId(String documentId) {
                this.documentId = documentId;
                return this;
            }

            /**
             * <p>The document name.</p>
             * 
             * <strong>example:</strong>
             * <p>invoice.pdf</p>
             */
            public Builder documentName(String documentName) {
                this.documentName = documentName;
                return this;
            }

            /**
             * <p>The list of associated images.</p>
             */
            public Builder images(java.util.List<Images> images) {
                this.images = images;
                return this;
            }

            /**
             * <p>The ID of the knowledge base.</p>
             * 
             * <strong>example:</strong>
             * <p>kd-xxxxxxxxxx</p>
             */
            public Builder knowledgeBaseId(String knowledgeBaseId) {
                this.knowledgeBaseId = knowledgeBaseId;
                return this;
            }

            /**
             * <p>The list of document locations.</p>
             */
            public Builder locations(java.util.List<Locations> locations) {
                this.locations = locations;
                return this;
            }

            /**
             * <p>The end time of the audio or video chunk in the original media, in milliseconds. This parameter is not returned for non-media chunks.</p>
             * 
             * <strong>example:</strong>
             * <p>8400</p>
             */
            public Builder mediaEndMs(Long mediaEndMs) {
                this.mediaEndMs = mediaEndMs;
                return this;
            }

            /**
             * <p>The start time of the audio or video chunk in the original media, in milliseconds. This parameter is not returned for non-media chunks.</p>
             * 
             * <strong>example:</strong>
             * <p>1250</p>
             */
            public Builder mediaStartMs(Long mediaStartMs) {
                this.mediaStartMs = mediaStartMs;
                return this;
            }

            /**
             * <p>The time range of each sentence or paragraph within the chunk in the original media. This parameter is not returned for non-audio chunks.</p>
             */
            public Builder mediaTimeline(java.util.List<MediaTimeline> mediaTimeline) {
                this.mediaTimeline = mediaTimeline;
                return this;
            }

            /**
             * <p>The parent chunk ID.</p>
             * 
             * <strong>example:</strong>
             * <p>parent-chunk-id</p>
             */
            public Builder parentChunkId(String parentChunkId) {
                this.parentChunkId = parentChunkId;
                return this;
            }

            /**
             * <p>The scalar columns of the structured knowledge base. The columns are returned by their original names and are not used for retrieval.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;question&quot;:&quot;How do I reset it?&quot;,&quot;category&quot;:&quot;account&quot;}</p>
             */
            public Builder scalarFields(Object scalarFields) {
                this.scalarFields = scalarFields;
                return this;
            }

            /**
             * <p>The overall relevance score.</p>
             * 
             * <strong>example:</strong>
             * <p>0.26136884</p>
             */
            public Builder score(Float score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The relevance score details.</p>
             */
            public Builder scoreDetails(ScoreDetails scoreDetails) {
                this.scoreDetails = scoreDetails;
                return this;
            }

            /**
             * <p>The list of tags.</p>
             */
            public Builder tags(java.util.List<String> tags) {
                this.tags = tags;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
}
