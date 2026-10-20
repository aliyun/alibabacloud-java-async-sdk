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
 * {@link RetrieveResponseBody} extends {@link TeaModel}
 *
 * <p>RetrieveResponseBody</p>
 */
public class RetrieveResponseBody extends TeaModel {
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

    private RetrieveResponseBody(Builder builder) {
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

    public static RetrieveResponseBody create() {
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

        private Builder(RetrieveResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.status = model.status;
            this.success = model.success;
        } 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>Index.InvalidParameter</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The business data field returned by the operation.</p>
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
         * <p>17204B98-7734-4F9A-8464-2446A84821CA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status code returned.</p>
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
         * <li>true: The operation was successful.</li>
         * <li>false: The operation failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public RetrieveResponseBody build() {
            return new RetrieveResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RetrieveResponseBody} extends {@link TeaModel}
     *
     * <p>RetrieveResponseBody</p>
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
             * <p>The file_path field in the metadata map of a document search knowledge base is meaningless. Do not use it in your business code.</p>
             * </blockquote>
             * <blockquote>
             * <p>When you retrieve a document search knowledge base, if a chunk contains an image, the image is returned in the image_url field of the metadata map, along with an expiration time.</p>
             * </blockquote>
             * <blockquote>
             * <p>When you retrieve an audio and video search knowledge base, if a chunk contains audio, the audio is returned in the audio_url field of the metadata map, along with an expiration time.</p>
             * </blockquote>
             * <blockquote>
             * <p>When you retrieve an audio and video search knowledge base, if a chunk contains a video, the video is returned in the video_url field of the metadata map, along with an expiration time.</p>
             * </blockquote>
             * <p>&lt;props=&quot;intl&quot;&gt;</p>
             * <p>The metadata map of the text chunk.</p>
             * <blockquote>
             * <p>The file_path field in the metadata map of a document search knowledge base is meaningless. Do not use it in your business code.</p>
             * </blockquote>
             * <blockquote>
             * <p>When you retrieve a document search knowledge base, if a chunk contains an image, the image is returned in the image_url field of the metadata map, along with an expiration time.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;parent&quot;: &quot;&quot;,
             *   &quot;file_path&quot;: &quot;https://<em><strong>&quot;,
             *   &quot;image_url&quot;: [
             *     &quot;http://</strong></em>&quot;
             *   ],
             *   &quot;nid&quot;: &quot;<em><strong>&quot;,
             *   &quot;title&quot;: &quot;Alibaba Cloud Model Studio Documentation&quot;,
             *   &quot;doc_id&quot;: &quot;doc_</strong></em>&quot;,
             *   &quot;content&quot;: &quot;Alibaba Cloud Model Studio is a one-stop large model development platform based on Tongyi large models, industry large models, and third-party large models. It provides enterprise customers and individual developers with a complete set of model service tools and full-link application development kits, pre-installed with rich capability plugins, and offers convenient integration methods such as APIs and SDKs to efficiently build large model applications.&quot;,
             *   &quot;workspace_id&quot;: &quot;ws_***&quot;,
             *   &quot;hier_title&quot;: &quot;Alibaba Cloud Model Studio Documentation&quot;,
             *   &quot;doc_name&quot;: &quot;Introduction to Alibaba Cloud Model Studio Documentation.pdpf&quot;,
             *   &quot;pipeline_id&quot;: &quot;rhd***&quot;,
             *   &quot;<em>id&quot;: &quot;ws</em>***&quot;
             * }</p>
             */
            public Builder metadata(Object metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * <p>The similarity score of the text chunk. Valid values: 0 to 1.</p>
             * 
             * <strong>example:</strong>
             * <p>0.3</p>
             */
            public Builder score(Double score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The content of the text chunk.</p>
             * 
             * <strong>example:</strong>
             * <p>Alibaba Cloud Model Studio is a one-stop large model development platform based on Tongyi large models, industry large models, and third-party large models. It provides enterprise customers and individual developers with a complete set of model service tools and full-link application development kits, pre-installed with rich capability plugins, and offers convenient integration methods such as APIs and SDKs to efficiently build large model applications</p>
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
     * {@link RetrieveResponseBody} extends {@link TeaModel}
     *
     * <p>RetrieveResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Nodes")
        private java.util.List<Nodes> nodes;

        private Data(Builder builder) {
            this.nodes = builder.nodes;
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

        public static final class Builder {
            private java.util.List<Nodes> nodes; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.nodes = model.nodes;
            } 

            /**
             * <p>The list of matched text chunks.</p>
             */
            public Builder nodes(java.util.List<Nodes> nodes) {
                this.nodes = nodes;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
