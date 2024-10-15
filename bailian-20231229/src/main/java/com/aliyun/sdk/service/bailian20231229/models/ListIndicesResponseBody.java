// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListIndicesResponseBody} extends {@link TeaModel}
 *
 * <p>ListIndicesResponseBody</p>
 */
public class ListIndicesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListIndicesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIndicesResponseBody create() {
        return builder().build();
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
     * @return status
     */
    public String getStatus() {
        return this.status;
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
        private String message; 
        private String requestId; 
        private String status; 
        private Boolean success; 

        /**
         * <p>HTTP status code</p>
         * 
         * <strong>example:</strong>
         * <p>Index.InvalidParameter</p>
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
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Required parameter(%s) missing or invalid, please check the request parameters.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>17204B98-xxxx-4F9A-8464-2446A84821CA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Indications whether the API call is successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListIndicesResponseBody build() {
            return new ListIndicesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListIndicesResponseBody} extends {@link TeaModel}
     *
     * <p>ListIndicesResponseBody</p>
     */
    public static class Indices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChunkSize")
        private Integer chunkSize;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DocumentIds")
        private java.util.List < String > documentIds;

        @com.aliyun.core.annotation.NameInMap("EmbeddingModelName")
        private String embeddingModelName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OverlapSize")
        private Integer overlapSize;

        @com.aliyun.core.annotation.NameInMap("RerankMinScore")
        private String rerankMinScore;

        @com.aliyun.core.annotation.NameInMap("RerankModelName")
        private String rerankModelName;

        @com.aliyun.core.annotation.NameInMap("Separator")
        private String separator;

        @com.aliyun.core.annotation.NameInMap("SinkInstanceId")
        private String sinkInstanceId;

        @com.aliyun.core.annotation.NameInMap("SinkRegion")
        private String sinkRegion;

        @com.aliyun.core.annotation.NameInMap("SinkType")
        private String sinkType;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("StructureType")
        private String structureType;

        private Indices(Builder builder) {
            this.chunkSize = builder.chunkSize;
            this.description = builder.description;
            this.documentIds = builder.documentIds;
            this.embeddingModelName = builder.embeddingModelName;
            this.id = builder.id;
            this.name = builder.name;
            this.overlapSize = builder.overlapSize;
            this.rerankMinScore = builder.rerankMinScore;
            this.rerankModelName = builder.rerankModelName;
            this.separator = builder.separator;
            this.sinkInstanceId = builder.sinkInstanceId;
            this.sinkRegion = builder.sinkRegion;
            this.sinkType = builder.sinkType;
            this.sourceType = builder.sourceType;
            this.structureType = builder.structureType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Indices create() {
            return builder().build();
        }

        /**
         * @return chunkSize
         */
        public Integer getChunkSize() {
            return this.chunkSize;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return documentIds
         */
        public java.util.List < String > getDocumentIds() {
            return this.documentIds;
        }

        /**
         * @return embeddingModelName
         */
        public String getEmbeddingModelName() {
            return this.embeddingModelName;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return overlapSize
         */
        public Integer getOverlapSize() {
            return this.overlapSize;
        }

        /**
         * @return rerankMinScore
         */
        public String getRerankMinScore() {
            return this.rerankMinScore;
        }

        /**
         * @return rerankModelName
         */
        public String getRerankModelName() {
            return this.rerankModelName;
        }

        /**
         * @return separator
         */
        public String getSeparator() {
            return this.separator;
        }

        /**
         * @return sinkInstanceId
         */
        public String getSinkInstanceId() {
            return this.sinkInstanceId;
        }

        /**
         * @return sinkRegion
         */
        public String getSinkRegion() {
            return this.sinkRegion;
        }

        /**
         * @return sinkType
         */
        public String getSinkType() {
            return this.sinkType;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return structureType
         */
        public String getStructureType() {
            return this.structureType;
        }

        public static final class Builder {
            private Integer chunkSize; 
            private String description; 
            private java.util.List < String > documentIds; 
            private String embeddingModelName; 
            private String id; 
            private String name; 
            private Integer overlapSize; 
            private String rerankMinScore; 
            private String rerankModelName; 
            private String separator; 
            private String sinkInstanceId; 
            private String sinkRegion; 
            private String sinkType; 
            private String sourceType; 
            private String structureType; 

            /**
             * <p>The estimated length of chunks. Valid values: [1-2048].</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder chunkSize(Integer chunkSize) {
                this.chunkSize = chunkSize;
                return this;
            }

            /**
             * <p>The description of the knowledge base.</p>
             * 
             * <strong>example:</strong>
             * <p>If each RAM user belongs to a RAM group, the configuration is considered compliant.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The list of the primary key IDs of the documents.</p>
             */
            public Builder documentIds(java.util.List < String > documentIds) {
                this.documentIds = documentIds;
                return this;
            }

            /**
             * <p>The name of the embedding model. Valid values:</p>
             * <ul>
             * <li>text-embedding-v2</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>conv-rewrite-qwen-1.8b</p>
             */
            public Builder embeddingModelName(String embeddingModelName) {
                this.embeddingModelName = embeddingModelName;
                return this;
            }

            /**
             * <p>The primary key ID of the knowledge base, which is the <code>Data.Id</code> parameter returned by the <a href="https://help.aliyun.com/zh/model-studio/developer-reference/api-bailian-2023-12-29-createindex">CreateIndex</a> operation.</p>
             * 
             * <strong>example:</strong>
             * <p>259899</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the knowledge base.</p>
             * 
             * <strong>example:</strong>
             * <p>temp_mUB4j</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The overlap length. Valid values: [0-1024].</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder overlapSize(Integer overlapSize) {
                this.overlapSize = overlapSize;
                return this;
            }

            /**
             * <p>Similarity Threshold Valid values: [0.01-1.00].</p>
             * 
             * <strong>example:</strong>
             * <p>0.01</p>
             */
            public Builder rerankMinScore(String rerankMinScore) {
                this.rerankMinScore = rerankMinScore;
                return this;
            }

            /**
             * <p>The name of the rank model. Valid values:</p>
             * <ul>
             * <li>gte-rerank-hybrid</li>
             * <li>gte-rerank</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>gte-rerank-hybrid</p>
             */
            public Builder rerankModelName(String rerankModelName) {
                this.rerankModelName = rerankModelName;
                return this;
            }

            /**
             * <p>The clause identifier. Separate multiple clause identifiers with |. Valid values:</p>
             * <ul>
             * <li>\n: line break</li>
             * <li>，: Chinese comma</li>
             * <li>,: English comma</li>
             * <li>。 : Chinese full stop</li>
             * <li>.: English full stop</li>
             * <li>！ : Chinese exclamation point</li>
             * <li>! : English exclamation point</li>
             * <li>；: Chinese semicolon</li>
             * <li>;: English semicolon</li>
             * <li>？ : Chinese question mark</li>
             * <li>?: English question mark</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>\n</p>
             */
            public Builder separator(String separator) {
                this.separator = separator;
                return this;
            }

            /**
             * <p>The ID of the vector storage instance.</p>
             * 
             * <strong>example:</strong>
             * <p>gp-bp1gq62t1788yw2ol</p>
             */
            public Builder sinkInstanceId(String sinkInstanceId) {
                this.sinkInstanceId = sinkInstanceId;
                return this;
            }

            /**
             * <p>The region of the vector storage instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder sinkRegion(String sinkRegion) {
                this.sinkRegion = sinkRegion;
                return this;
            }

            /**
             * <p>The vector storage type of the knowledge base. Valid values:</p>
             * <ul>
             * <li>ES: Built-in vector database.</li>
             * <li>BUILT_IN: Built-in vector database.</li>
             * <li>ADB: AnalyticDB for PostgreSQL database.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>es</p>
             */
            public Builder sinkType(String sinkType) {
                this.sinkType = sinkType;
                return this;
            }

            /**
             * <p>The data type of <a href="https://bailian.console.aliyun.com/#/data-center">Data Management</a>. For unstructured knowledge base, possible values:</p>
             * <ul>
             * <li>DATA_CENTER_CATEGORY: The category type.</li>
             * <li>DATA_CENTER_FILE: The document type.</li>
             * </ul>
             * <p>For structured knowledge base, possible values:</p>
             * <ul>
             * <li>DATA_CENTER_STRUCTURED_TABLE: The data table type.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DATA_CENTER_FILE</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>The vector storage type of the knowledge base. Valid values:</p>
             * <ul>
             * <li>UNSTRUCTURED</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>structured</p>
             */
            public Builder structureType(String structureType) {
                this.structureType = structureType;
                return this;
            }

            public Indices build() {
                return new Indices(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListIndicesResponseBody} extends {@link TeaModel}
     *
     * <p>ListIndicesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Indices")
        private java.util.List < Indices> indices;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.indices = builder.indices;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return indices
         */
        public java.util.List < Indices> getIndices() {
            return this.indices;
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
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < Indices> indices; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * <p>The list of knowledge bases.</p>
             */
            public Builder indices(java.util.List < Indices> indices) {
                this.indices = indices;
                return this;
            }

            /**
             * <p>The specified page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The specified number of documents on each page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of knowledge bases returned.</p>
             * 
             * <strong>example:</strong>
             * <p>48</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
