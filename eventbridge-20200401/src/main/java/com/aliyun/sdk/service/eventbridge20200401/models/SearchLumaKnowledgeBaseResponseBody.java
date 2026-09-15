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
 * {@link SearchLumaKnowledgeBaseResponseBody} extends {@link TeaModel}
 *
 * <p>SearchLumaKnowledgeBaseResponseBody</p>
 */
public class SearchLumaKnowledgeBaseResponseBody extends TeaModel {
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

    private SearchLumaKnowledgeBaseResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchLumaKnowledgeBaseResponseBody create() {
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

        private Builder(SearchLumaKnowledgeBaseResponseBody model) {
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
         * <p>The retrieval result from the knowledge base bound to the Agent.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message returned by the operation. The value is Operation success if the call succeeds, or a specific error description if the call fails.</p>
         * 
         * <strong>example:</strong>
         * <p>Operation success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The unique identifier of the request, used for troubleshooting and ticket feedback.</p>
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

        public SearchLumaKnowledgeBaseResponseBody build() {
            return new SearchLumaKnowledgeBaseResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SearchLumaKnowledgeBaseResponseBody} extends {@link TeaModel}
     *
     * <p>SearchLumaKnowledgeBaseResponseBody</p>
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
             * <p>The list of matched text chunks, sorted by relevance.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;DocumentId&quot;:&quot;doc-bp1xxxxxxxxxxxx&quot;,&quot;ChunkSeq&quot;:3,&quot;Content&quot;:&quot;EventBridge supports event routing&quot;}]</p>
             */
            public Builder chunks(java.util.List<KnowledgeBaseSearchChunk> chunks) {
                this.chunks = chunks;
                return this;
            }

            /**
             * <p>The time spent on the retrieval, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1200</p>
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
