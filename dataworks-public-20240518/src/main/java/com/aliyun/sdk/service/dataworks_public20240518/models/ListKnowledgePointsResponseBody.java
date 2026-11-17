// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link ListKnowledgePointsResponseBody} extends {@link TeaModel}
 *
 * <p>ListKnowledgePointsResponseBody</p>
 */
public class ListKnowledgePointsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListKnowledgePointsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListKnowledgePointsResponseBody create() {
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
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
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
        private Integer maxResults; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListKnowledgePointsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The business error code. This field may be omitted if the request succeeds. If the request fails, the common error response protocol applies.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidParameter</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The summaries of the knowledge points on the current page and the cursor for the next page.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The maximum number of knowledge bases to return per page. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A human-readable description of the business error. This field may be omitted if the request succeeds. Provide the RequestId when troubleshooting failures.</p>
         * 
         * <strong>example:</strong>
         * <p>The request parameters are invalid.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The unique identifier of the request. You can use the ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>00000000-0000-4000-8000-000000000001</p>
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

        public ListKnowledgePointsResponseBody build() {
            return new ListKnowledgePointsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListKnowledgePointsResponseBody} extends {@link TeaModel}
     *
     * <p>ListKnowledgePointsResponseBody</p>
     */
    public static class KnowledgePoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
        private String knowledgeBaseId;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private KnowledgePoints(Builder builder) {
            this.id = builder.id;
            this.knowledgeBaseId = builder.knowledgeBaseId;
            this.summary = builder.summary;
            this.title = builder.title;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KnowledgePoints create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return knowledgeBaseId
         */
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
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
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String id; 
            private String knowledgeBaseId; 
            private String summary; 
            private String title; 
            private String type; 

            private Builder() {
            } 

            private Builder(KnowledgePoints model) {
                this.id = model.id;
                this.knowledgeBaseId = model.knowledgeBaseId;
                this.summary = model.summary;
                this.title = model.title;
                this.type = model.type;
            } 

            /**
             * <p>The read identifier of the current knowledge point. For GRAPH, it is the ID of the local graph entry node. For WIKI, it is the page ID. For KNOWLEDGE_CONTENT, it is the content ID. Use this value as is in the GetKnowledgePoint operation without parsing or concatenation.</p>
             * 
             * <strong>example:</strong>
             * <p>node-sales</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The ID of the knowledge base to which the knowledge point belongs. This ID is used together with Type and Id to locate the knowledge point.</p>
             * 
             * <strong>example:</strong>
             * <p>12345678-1234-4234-8234-123456789abc</p>
             */
            public Builder knowledgeBaseId(String knowledgeBaseId) {
                this.knowledgeBaseId = knowledgeBaseId;
                return this;
            }

            /**
             * <p>The readable summary of the knowledge point. The summary is not guaranteed to contain the complete content. To obtain the details, call the GetKnowledgePoint operation.</p>
             * 
             * <strong>example:</strong>
             * <p>Sales metrics and their associated order tables</p>
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            /**
             * <p>The readable title of the knowledge point. For GRAPH, the name of the entry node is used.</p>
             * 
             * <strong>example:</strong>
             * <p>Sales</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The read category of the knowledge point. Valid values:</p>
             * <ul>
             * <li>GRAPH: local graph.</li>
             * <li>WIKI: topic page.</li>
             * <li>KNOWLEDGE_CONTENT: knowledge content.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>GRAPH</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public KnowledgePoints build() {
                return new KnowledgePoints(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListKnowledgePointsResponseBody} extends {@link TeaModel}
     *
     * <p>ListKnowledgePointsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KnowledgePoints")
        private java.util.List<KnowledgePoints> knowledgePoints;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        private Data(Builder builder) {
            this.knowledgePoints = builder.knowledgePoints;
            this.nextToken = builder.nextToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return knowledgePoints
         */
        public java.util.List<KnowledgePoints> getKnowledgePoints() {
            return this.knowledgePoints;
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        public static final class Builder {
            private java.util.List<KnowledgePoints> knowledgePoints; 
            private String nextToken; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.knowledgePoints = model.knowledgePoints;
                this.nextToken = model.nextToken;
            } 

            /**
             * <p>The summaries of the knowledge points that the current caller has permission to read on the current page. The KnowledgeBaseId, Type, and Id of each item can be directly used in the GetKnowledgePoint operation.</p>
             */
            public Builder knowledgePoints(java.util.List<KnowledgePoints> knowledgePoints) {
                this.knowledgePoints = knowledgePoints;
                return this;
            }

            /**
             * <p>The pagination cursor. Do not specify this parameter for the first page. For subsequent pages, pass the NextToken value returned in the previous response as is, and keep the knowledge base, type, and page size unchanged. An empty cursor indicates that no more data is available. If the current page is empty but the cursor is not empty, continue querying.</p>
             * 
             * <strong>example:</strong>
             * <p>eyJvZmZzZXQiOjIwfQ</p>
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
