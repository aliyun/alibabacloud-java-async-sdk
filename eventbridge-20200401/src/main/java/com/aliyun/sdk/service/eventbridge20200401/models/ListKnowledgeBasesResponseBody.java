// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link ListKnowledgeBasesResponseBody} extends {@link TeaModel}
 *
 * <p>ListKnowledgeBasesResponseBody</p>
 */
public class ListKnowledgeBasesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListKnowledgeBasesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListKnowledgeBasesResponseBody create() {
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
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListKnowledgeBasesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response code. A value of Success indicates that the call was successful. If the call failed, a specific error code is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The query result of the knowledge base list, including knowledge base entries and pagination information.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message returned by the operation. The value Operation success is returned if the call was successful. A specific error description is returned if the call failed.</p>
         * 
         * <strong>example:</strong>
         * <p>Operation success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>34AD682D-5B91-5773-8132-AA38C130****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. A value of true indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListKnowledgeBasesResponseBody build() {
            return new ListKnowledgeBasesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListKnowledgeBasesResponseBody} extends {@link TeaModel}
     *
     * <p>ListKnowledgeBasesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KnowledgeBases")
        private java.util.List<KnowledgeBase> knowledgeBases;

        @com.aliyun.core.annotation.NameInMap("MaxResults")
        private Integer maxResults;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.knowledgeBases = builder.knowledgeBases;
            this.maxResults = builder.maxResults;
            this.nextToken = builder.nextToken;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return knowledgeBases
         */
        public java.util.List<KnowledgeBase> getKnowledgeBases() {
            return this.knowledgeBases;
        }

        /**
         * @return maxResults
         */
        public Integer getMaxResults() {
            return this.maxResults;
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<KnowledgeBase> knowledgeBases; 
            private Integer maxResults; 
            private String nextToken; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.knowledgeBases = model.knowledgeBases;
                this.maxResults = model.maxResults;
                this.nextToken = model.nextToken;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The list of knowledge base entries.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;KnowledgeBaseName&quot;:&quot;my-knowledge-base&quot;,&quot;Status&quot;:&quot;ACTIVE&quot;}]</p>
             */
            public Builder knowledgeBases(java.util.List<KnowledgeBase> knowledgeBases) {
                this.knowledgeBases = knowledgeBases;
                return this;
            }

            /**
             * <p>The maximum number of results per page that was applied to this request.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * <p>The pagination token (an opaque string) for the next page. Pass this value as the NextToken parameter in the next request to retrieve the next page. An empty value indicates that no more data is available.</p>
             * 
             * <strong>example:</strong>
             * <p>ca1eb85f5d99c7d6a97e6****</p>
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * <p>The total number of knowledge bases that match the filter conditions. Use an empty NextToken value as the termination condition for pagination.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
