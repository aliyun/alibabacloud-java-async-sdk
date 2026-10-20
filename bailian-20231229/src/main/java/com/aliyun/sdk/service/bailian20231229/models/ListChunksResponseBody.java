// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229.models;

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
 * {@link ListChunksResponseBody} extends {@link TeaModel}
 *
 * <p>ListChunksResponseBody</p>
 */
public class ListChunksResponseBody extends TeaModel {
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

    private ListChunksResponseBody(Builder builder) {
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

    public static ListChunksResponseBody create() {
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

        private Builder() {
        } 

        private Builder(ListChunksResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.status = model.status;
            this.success = model.success;
        } 

        /**
         * <p>The error status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Index.InvalidParameter</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The business data returned by the operation.</p>
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
         * <p>8F97A63B-xxxx-527F-9D6E-467B6A7E8CF1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status code returned by the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Indicates whether the operation was successful. Valid values:</p>
         * <ul>
         * <li>true: Successful.</li>
         * <li>false: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListChunksResponseBody build() {
            return new ListChunksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListChunksResponseBody} extends {@link TeaModel}
     *
     * <p>ListChunksResponseBody</p>
     */
    public static class Nodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Metadata")
        private Object metadata;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Double score;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        private Nodes(Builder builder) {
            this.metadata = builder.metadata;
            this.score = builder.score;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Nodes create() {
            return builder().build();
        }

        /**
         * @return metadata
         */
        public Object getMetadata() {
            return this.metadata;
        }

        /**
         * @return score
         */
        public Double getScore() {
            return this.score;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private Object metadata; 
            private Double score; 
            private String text; 

            private Builder() {
            } 

            private Builder(Nodes model) {
                this.metadata = model.metadata;
                this.score = model.score;
                this.text = model.text;
            } 

            /**
             * <p>&lt;props=&quot;china&quot;&gt;</p>
             * <p>The metadata map of the text chunk.</p>
             * <blockquote>
             * <p>The <code>file_path</code> field in the metadata map of document search knowledge bases is meaningless. Do not use it in your business code.</p>
             * </blockquote>
             * <blockquote>
             * <p>When retrieving a document search knowledge base, if a chunk contains an image, the image is returned through the <code>image_url</code> field in the metadata map, along with an expiration time.</p>
             * </blockquote>
             * <blockquote>
             * <p>When retrieving an audio/video search knowledge base, if a chunk contains audio, the audio is returned through the <code>audio_url</code> field in the metadata map, along with an expiration time.</p>
             * </blockquote>
             * <blockquote>
             * <p>When retrieving an audio/video search knowledge base, if a chunk contains video, the video is returned through the <code>video_url</code> field in the metadata map, along with an expiration time.</p>
             * </blockquote>
             * <p>&lt;props=&quot;intl&quot;&gt;</p>
             * <p>The metadata map of the text chunk.</p>
             * <blockquote>
             * <p>The <code>file_path</code> field in the metadata map of document search knowledge bases is meaningless. Do not use it in your business code.</p>
             * </blockquote>
             * <blockquote>
             * <p>When retrieving a document search knowledge base, if a chunk contains an image, the image is returned through the <code>image_url</code> field in the metadata map, along with an expiration time.</p>
             * </blockquote>
             * <p>.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;file_path&quot;: &quot;<a href="https://bailian-">https://bailian-</a><em><strong>&quot;,
             *   &quot;parent&quot;: &quot;阿里云百炼是一站式的大模型开发及应用构建平台。不论是开发者还是业务人员，都能深入参与大模型应用的设计和构建。您可以通过简单的界面操作，在 5分钟内开发出一款大模型应用，或在几小时内训练出一个专属模型，从而将更多精力专注于应用创新。&quot;,
             *   &quot;is_displayed_chunk_content&quot;: &quot;true&quot;,
             *   &quot;image_url&quot;: [],
             *   &quot;nid&quot;: &quot;83</strong></em>&quot;,
             *   &quot;source&quot;: &quot;0&quot;,
             *   &quot;_score&quot;: 0,
             *   &quot;title&quot;: &quot;&quot;,
             *   &quot;doc_id&quot;: &quot;file_24e***&quot;,
             *   &quot;content&quot;: &quot;阿里云百炼是一站式的大模型开发及应用构建平台。不论是开发者还是业务人员，都能深入参与大模型应用的设计和构建。您可以通过简单的界面操作，在 5分钟内开发出一款大模型应用，或在几小时内训练出一个专属模型，从而将更多精力专注于应用创新。&quot;,
             *   &quot;_rc_score&quot;: 0,
             *   &quot;workspace_id&quot;: &quot;llm-zna***&quot;,
             *   &quot;hier_title&quot;: &quot;&quot;,
             *   &quot;doc_name&quot;: &quot;什么是阿里云百炼&quot;,
             *   &quot;pipeline_id&quot;: &quot;j6b***&quot;,
             *   &quot;_id&quot;: &quot;llm-zna5***&quot;
             * }</p>
             */
            public Builder metadata(Object metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * <p>The similarity score of the text chunk.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder score(Double score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The content of the text chunk.</p>
             * 
             * <strong>example:</strong>
             * <p>阿里云百炼是一站式的大模型开发及应用构建平台。不论是开发者还是业务人员，都能深入参与大模型应用的设计和构建。您可以通过简单的界面操作，在 5分钟内开发出一款大模型应用，或在几小时内训练出一个专属模型，从而将更多精力专注于应用创新。</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public Nodes build() {
                return new Nodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListChunksResponseBody} extends {@link TeaModel}
     *
     * <p>ListChunksResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Nodes")
        private java.util.List<Nodes> nodes;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.nodes = builder.nodes;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return nodes
         */
        public java.util.List<Nodes> getNodes() {
            return this.nodes;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<Nodes> nodes; 
            private Long total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.nodes = model.nodes;
                this.total = model.total;
            } 

            /**
             * <p>The list of text chunks.</p>
             */
            public Builder nodes(java.util.List<Nodes> nodes) {
                this.nodes = nodes;
                return this;
            }

            /**
             * <p>The total number of returned results.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
