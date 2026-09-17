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
 * {@link SearchKnowledgeBaseResponseBody} extends {@link TeaModel}
 *
 * <p>SearchKnowledgeBaseResponseBody</p>
 */
public class SearchKnowledgeBaseResponseBody extends TeaModel {
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

    private SearchKnowledgeBaseResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
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

        private Builder(SearchKnowledgeBaseResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response code. A value of Success indicates a successful call. If the call fails, a specific error code is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The search results, including the list of matched chunks and the time spent.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message. A value of Operation success is returned for a successful call. A specific error description is returned for a failed call.</p>
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
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Chunks")
        private java.util.List<KnowledgeBaseSearchChunk> chunks;

        @com.aliyun.core.annotation.NameInMap("TimeSpent")
        private Long timeSpent;

        private Data(Builder builder) {
            this.chunks = builder.chunks;
            this.timeSpent = builder.timeSpent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return chunks
         */
        public java.util.List<KnowledgeBaseSearchChunk> getChunks() {
            return this.chunks;
        }

        /**
         * @return timeSpent
         */
        public Long getTimeSpent() {
            return this.timeSpent;
        }

        public static final class Builder {
            private java.util.List<KnowledgeBaseSearchChunk> chunks; 
            private Long timeSpent; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.chunks = model.chunks;
                this.timeSpent = model.timeSpent;
            } 

            /**
             * <p>The list of matched chunks, sorted by relevance.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;DocumentId&quot;:&quot;doc-bp1xxxxxxxxxxxx&quot;,&quot;ChunkSeq&quot;:3,&quot;Content&quot;:&quot;EventBridge supports event routing&quot;}]</p>
             */
            public Builder chunks(java.util.List<KnowledgeBaseSearchChunk> chunks) {
                this.chunks = chunks;
                return this;
            }

            /**
             * <p>The server-side processing duration of this search. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>128</p>
             */
            public Builder timeSpent(Long timeSpent) {
                this.timeSpent = timeSpent;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
