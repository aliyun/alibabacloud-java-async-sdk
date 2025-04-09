// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchplat20240529.models;

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
 * {@link GetDocumentSplitResponseBody} extends {@link TeaModel}
 *
 * <p>GetDocumentSplitResponseBody</p>
 */
public class GetDocumentSplitResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("latency")
    private Integer latency;

    @com.aliyun.core.annotation.NameInMap("request_id")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("usage")
    private Usage usage;

    private GetDocumentSplitResponseBody(Builder builder) {
        this.latency = builder.latency;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.usage = builder.usage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDocumentSplitResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return latency
     */
    public Integer getLatency() {
        return this.latency;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return usage
     */
    public Usage getUsage() {
        return this.usage;
    }

    public static final class Builder {
        private Integer latency; 
        private String requestId; 
        private Result result; 
        private Usage usage; 

        private Builder() {
        } 

        private Builder(GetDocumentSplitResponseBody model) {
            this.latency = model.latency;
            this.requestId = model.requestId;
            this.result = model.result;
            this.usage = model.usage;
        } 

        /**
         * latency.
         */
        public Builder latency(Integer latency) {
            this.latency = latency;
            return this;
        }

        /**
         * request_id.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * usage.
         */
        public Builder usage(Usage usage) {
            this.usage = usage;
            return this;
        }

        public GetDocumentSplitResponseBody build() {
            return new GetDocumentSplitResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDocumentSplitResponseBody} extends {@link TeaModel}
     *
     * <p>GetDocumentSplitResponseBody</p>
     */
    public static class Chunks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("meta")
        private java.util.Map<String, String> meta;

        private Chunks(Builder builder) {
            this.content = builder.content;
            this.meta = builder.meta;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Chunks create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return meta
         */
        public java.util.Map<String, String> getMeta() {
            return this.meta;
        }

        public static final class Builder {
            private String content; 
            private java.util.Map<String, String> meta; 

            private Builder() {
            } 

            private Builder(Chunks model) {
                this.content = model.content;
                this.meta = model.meta;
            } 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * meta.
             */
            public Builder meta(java.util.Map<String, String> meta) {
                this.meta = meta;
                return this;
            }

            public Chunks build() {
                return new Chunks(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDocumentSplitResponseBody} extends {@link TeaModel}
     *
     * <p>GetDocumentSplitResponseBody</p>
     */
    public static class RichTexts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("meta")
        private java.util.Map<String, String> meta;

        private RichTexts(Builder builder) {
            this.content = builder.content;
            this.meta = builder.meta;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RichTexts create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return meta
         */
        public java.util.Map<String, String> getMeta() {
            return this.meta;
        }

        public static final class Builder {
            private String content; 
            private java.util.Map<String, String> meta; 

            private Builder() {
            } 

            private Builder(RichTexts model) {
                this.content = model.content;
                this.meta = model.meta;
            } 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * meta.
             */
            public Builder meta(java.util.Map<String, String> meta) {
                this.meta = meta;
                return this;
            }

            public RichTexts build() {
                return new RichTexts(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDocumentSplitResponseBody} extends {@link TeaModel}
     *
     * <p>GetDocumentSplitResponseBody</p>
     */
    public static class Sentences extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("meta")
        private java.util.Map<String, String> meta;

        private Sentences(Builder builder) {
            this.content = builder.content;
            this.meta = builder.meta;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sentences create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return meta
         */
        public java.util.Map<String, String> getMeta() {
            return this.meta;
        }

        public static final class Builder {
            private String content; 
            private java.util.Map<String, String> meta; 

            private Builder() {
            } 

            private Builder(Sentences model) {
                this.content = model.content;
                this.meta = model.meta;
            } 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * meta.
             */
            public Builder meta(java.util.Map<String, String> meta) {
                this.meta = meta;
                return this;
            }

            public Sentences build() {
                return new Sentences(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDocumentSplitResponseBody} extends {@link TeaModel}
     *
     * <p>GetDocumentSplitResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("chunks")
        private java.util.List<Chunks> chunks;

        @com.aliyun.core.annotation.NameInMap("nodes")
        private java.util.List<java.util.Map<String, String>> nodes;

        @com.aliyun.core.annotation.NameInMap("rich_texts")
        private java.util.List<RichTexts> richTexts;

        @com.aliyun.core.annotation.NameInMap("sentences")
        private java.util.List<Sentences> sentences;

        private Result(Builder builder) {
            this.chunks = builder.chunks;
            this.nodes = builder.nodes;
            this.richTexts = builder.richTexts;
            this.sentences = builder.sentences;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return chunks
         */
        public java.util.List<Chunks> getChunks() {
            return this.chunks;
        }

        /**
         * @return nodes
         */
        public java.util.List<java.util.Map<String, String>> getNodes() {
            return this.nodes;
        }

        /**
         * @return richTexts
         */
        public java.util.List<RichTexts> getRichTexts() {
            return this.richTexts;
        }

        /**
         * @return sentences
         */
        public java.util.List<Sentences> getSentences() {
            return this.sentences;
        }

        public static final class Builder {
            private java.util.List<Chunks> chunks; 
            private java.util.List<java.util.Map<String, String>> nodes; 
            private java.util.List<RichTexts> richTexts; 
            private java.util.List<Sentences> sentences; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.chunks = model.chunks;
                this.nodes = model.nodes;
                this.richTexts = model.richTexts;
                this.sentences = model.sentences;
            } 

            /**
             * chunks.
             */
            public Builder chunks(java.util.List<Chunks> chunks) {
                this.chunks = chunks;
                return this;
            }

            /**
             * nodes.
             */
            public Builder nodes(java.util.List<java.util.Map<String, String>> nodes) {
                this.nodes = nodes;
                return this;
            }

            /**
             * rich_texts.
             */
            public Builder richTexts(java.util.List<RichTexts> richTexts) {
                this.richTexts = richTexts;
                return this;
            }

            /**
             * sentences.
             */
            public Builder sentences(java.util.List<Sentences> sentences) {
                this.sentences = sentences;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDocumentSplitResponseBody} extends {@link TeaModel}
     *
     * <p>GetDocumentSplitResponseBody</p>
     */
    public static class Usage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("token_count")
        private Long tokenCount;

        private Usage(Builder builder) {
            this.tokenCount = builder.tokenCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Usage create() {
            return builder().build();
        }

        /**
         * @return tokenCount
         */
        public Long getTokenCount() {
            return this.tokenCount;
        }

        public static final class Builder {
            private Long tokenCount; 

            private Builder() {
            } 

            private Builder(Usage model) {
                this.tokenCount = model.tokenCount;
            } 

            /**
             * token_count.
             */
            public Builder tokenCount(Long tokenCount) {
                this.tokenCount = tokenCount;
                return this;
            }

            public Usage build() {
                return new Usage(this);
            } 

        } 

    }
}
