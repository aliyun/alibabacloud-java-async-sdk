// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link ChatWithKnowledgeBaseResponseBody} extends {@link TeaModel}
 *
 * <p>ChatWithKnowledgeBaseResponseBody</p>
 */
public class ChatWithKnowledgeBaseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChatCompletion")
    private ChatCompletion chatCompletion;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("MultiCollectionRecallResult")
    private MultiCollectionRecallResult multiCollectionRecallResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private ChatWithKnowledgeBaseResponseBody(Builder builder) {
        this.chatCompletion = builder.chatCompletion;
        this.message = builder.message;
        this.multiCollectionRecallResult = builder.multiCollectionRecallResult;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChatWithKnowledgeBaseResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chatCompletion
     */
    public ChatCompletion getChatCompletion() {
        return this.chatCompletion;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return multiCollectionRecallResult
     */
    public MultiCollectionRecallResult getMultiCollectionRecallResult() {
        return this.multiCollectionRecallResult;
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

    public static final class Builder {
        private ChatCompletion chatCompletion; 
        private String message; 
        private MultiCollectionRecallResult multiCollectionRecallResult; 
        private String requestId; 
        private String status; 

        private Builder() {
        } 

        private Builder(ChatWithKnowledgeBaseResponseBody model) {
            this.chatCompletion = model.chatCompletion;
            this.message = model.message;
            this.multiCollectionRecallResult = model.multiCollectionRecallResult;
            this.requestId = model.requestId;
            this.status = model.status;
        } 

        /**
         * <p>model response.</p>
         */
        public Builder chatCompletion(ChatCompletion chatCompletion) {
            this.chatCompletion = chatCompletion;
            return this;
        }

        /**
         * <p>The returned information.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Retrieve information from multiple knowledge bases.</p>
         */
        public Builder multiCollectionRecallResult(MultiCollectionRecallResult multiCollectionRecallResult) {
            this.multiCollectionRecallResult = multiCollectionRecallResult;
            return this;
        }

        /**
         * <p>The unique ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the operation. Valid values:</p>
         * <ul>
         * <li><strong>success</strong></li>
         * <li><strong>fail</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public ChatWithKnowledgeBaseResponseBody build() {
            return new ChatWithKnowledgeBaseResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ChatWithKnowledgeBaseResponseBody} extends {@link TeaModel}
     *
     * <p>ChatWithKnowledgeBaseResponseBody</p>
     */
    public static class Function extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Arguments")
        private String arguments;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Function(Builder builder) {
            this.arguments = builder.arguments;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Function create() {
            return builder().build();
        }

        /**
         * @return arguments
         */
        public String getArguments() {
            return this.arguments;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String arguments; 
            private String name; 

            private Builder() {
            } 

            private Builder(Function model) {
                this.arguments = model.arguments;
                this.name = model.name;
            } 

            /**
             * <p>Arguments of the called function.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;city&quot;:&quot;hangzhou&quot;}</p>
             */
            public Builder arguments(String arguments) {
                this.arguments = arguments;
                return this;
            }

            /**
             * <p>The name of the called function.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;get_weather&quot;</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Function build() {
                return new Function(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChatWithKnowledgeBaseResponseBody} extends {@link TeaModel}
     *
     * <p>ChatWithKnowledgeBaseResponseBody</p>
     */
    public static class ToolCalls extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Function")
        private Function function;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Index")
        private Long index;

        private ToolCalls(Builder builder) {
            this.function = builder.function;
            this.id = builder.id;
            this.index = builder.index;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ToolCalls create() {
            return builder().build();
        }

        /**
         * @return function
         */
        public Function getFunction() {
            return this.function;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return index
         */
        public Long getIndex() {
            return this.index;
        }

        public static final class Builder {
            private Function function; 
            private String id; 
            private Long index; 

            private Builder() {
            } 

            private Builder(ToolCalls model) {
                this.function = model.function;
                this.id = model.id;
                this.index = model.index;
            } 

            /**
             * <p>Function call information.</p>
             */
            public Builder function(Function function) {
                this.function = function;
                return this;
            }

            /**
             * <p>ID</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;chatcmpl-c1bebafa-cc48-44e2-88c6-1a3572952f8e&quot;</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The position of this tool in the &quot;input&quot; request parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder index(Long index) {
                this.index = index;
                return this;
            }

            public ToolCalls build() {
                return new ToolCalls(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChatWithKnowledgeBaseResponseBody} extends {@link TeaModel}
     *
     * <p>ChatWithKnowledgeBaseResponseBody</p>
     */
    public static class Message extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("ReasoningContent")
        private String reasoningContent;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("ToolCalls")
        private java.util.List<ToolCalls> toolCalls;

        private Message(Builder builder) {
            this.content = builder.content;
            this.reasoningContent = builder.reasoningContent;
            this.role = builder.role;
            this.toolCalls = builder.toolCalls;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Message create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return reasoningContent
         */
        public String getReasoningContent() {
            return this.reasoningContent;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return toolCalls
         */
        public java.util.List<ToolCalls> getToolCalls() {
            return this.toolCalls;
        }

        public static final class Builder {
            private String content; 
            private String reasoningContent; 
            private String role; 
            private java.util.List<ToolCalls> toolCalls; 

            private Builder() {
            } 

            private Builder(Message model) {
                this.content = model.content;
                this.reasoningContent = model.reasoningContent;
                this.role = model.role;
                this.toolCalls = model.toolCalls;
            } 

            /**
             * <p>The content of the document.</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>模型思维内容</p>
             * 
             * <strong>example:</strong>
             * <p>逻辑推理过程</p>
             */
            public Builder reasoningContent(String reasoningContent) {
                this.reasoningContent = reasoningContent;
                return this;
            }

            /**
             * <p>Message role:</p>
             * <ul>
             * <li>system</li>
             * <li>user</li>
             * <li>assistant</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>user</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>Tool call response.</p>
             */
            public Builder toolCalls(java.util.List<ToolCalls> toolCalls) {
                this.toolCalls = toolCalls;
                return this;
            }

            public Message build() {
                return new Message(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChatWithKnowledgeBaseResponseBody} extends {@link TeaModel}
     *
     * <p>ChatWithKnowledgeBaseResponseBody</p>
     */
    public static class Choices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FinishReason")
        private String finishReason;

        @com.aliyun.core.annotation.NameInMap("Index")
        private Long index;

        @com.aliyun.core.annotation.NameInMap("Message")
        private Message message;

        private Choices(Builder builder) {
            this.finishReason = builder.finishReason;
            this.index = builder.index;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Choices create() {
            return builder().build();
        }

        /**
         * @return finishReason
         */
        public String getFinishReason() {
            return this.finishReason;
        }

        /**
         * @return index
         */
        public Long getIndex() {
            return this.index;
        }

        /**
         * @return message
         */
        public Message getMessage() {
            return this.message;
        }

        public static final class Builder {
            private String finishReason; 
            private Long index; 
            private Message message; 

            private Builder() {
            } 

            private Builder(Choices model) {
                this.finishReason = model.finishReason;
                this.index = model.index;
                this.message = model.message;
            } 

            /**
             * <p>Finish reason.</p>
             * 
             * <strong>example:</strong>
             * <p>finish</p>
             */
            public Builder finishReason(String finishReason) {
                this.finishReason = finishReason;
                return this;
            }

            /**
             * <p>The sequence number of the reply.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder index(Long index) {
                this.index = index;
                return this;
            }

            /**
             * <p>LLM response.</p>
             */
            public Builder message(Message message) {
                this.message = message;
                return this;
            }

            public Choices build() {
                return new Choices(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChatWithKnowledgeBaseResponseBody} extends {@link TeaModel}
     *
     * <p>ChatWithKnowledgeBaseResponseBody</p>
     */
    public static class PromptTokensDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CachedTokens")
        private Long cachedTokens;

        private PromptTokensDetails(Builder builder) {
            this.cachedTokens = builder.cachedTokens;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PromptTokensDetails create() {
            return builder().build();
        }

        /**
         * @return cachedTokens
         */
        public Long getCachedTokens() {
            return this.cachedTokens;
        }

        public static final class Builder {
            private Long cachedTokens; 

            private Builder() {
            } 

            private Builder(PromptTokensDetails model) {
                this.cachedTokens = model.cachedTokens;
            } 

            /**
             * <p>The number of tokens from cache hits.</p>
             * 
             * <strong>example:</strong>
             * <p>24</p>
             */
            public Builder cachedTokens(Long cachedTokens) {
                this.cachedTokens = cachedTokens;
                return this;
            }

            public PromptTokensDetails build() {
                return new PromptTokensDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChatWithKnowledgeBaseResponseBody} extends {@link TeaModel}
     *
     * <p>ChatWithKnowledgeBaseResponseBody</p>
     */
    public static class Usage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompletionTokens")
        private Long completionTokens;

        @com.aliyun.core.annotation.NameInMap("PromptTokens")
        private Long promptTokens;

        @com.aliyun.core.annotation.NameInMap("PromptTokensDetails")
        private PromptTokensDetails promptTokensDetails;

        @com.aliyun.core.annotation.NameInMap("TotalTokens")
        private Long totalTokens;

        private Usage(Builder builder) {
            this.completionTokens = builder.completionTokens;
            this.promptTokens = builder.promptTokens;
            this.promptTokensDetails = builder.promptTokensDetails;
            this.totalTokens = builder.totalTokens;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Usage create() {
            return builder().build();
        }

        /**
         * @return completionTokens
         */
        public Long getCompletionTokens() {
            return this.completionTokens;
        }

        /**
         * @return promptTokens
         */
        public Long getPromptTokens() {
            return this.promptTokens;
        }

        /**
         * @return promptTokensDetails
         */
        public PromptTokensDetails getPromptTokensDetails() {
            return this.promptTokensDetails;
        }

        /**
         * @return totalTokens
         */
        public Long getTotalTokens() {
            return this.totalTokens;
        }

        public static final class Builder {
            private Long completionTokens; 
            private Long promptTokens; 
            private PromptTokensDetails promptTokensDetails; 
            private Long totalTokens; 

            private Builder() {
            } 

            private Builder(Usage model) {
                this.completionTokens = model.completionTokens;
                this.promptTokens = model.promptTokens;
                this.promptTokensDetails = model.promptTokensDetails;
                this.totalTokens = model.totalTokens;
            } 

            /**
             * <p>The number of tokens consumed by the generated content.</p>
             * 
             * <strong>example:</strong>
             * <p>42</p>
             */
            public Builder completionTokens(Long completionTokens) {
                this.completionTokens = completionTokens;
                return this;
            }

            /**
             * <p>The number of tokens consumed by the prompt.</p>
             * 
             * <strong>example:</strong>
             * <p>42</p>
             */
            public Builder promptTokens(Long promptTokens) {
                this.promptTokens = promptTokens;
                return this;
            }

            /**
             * <p>The details about the prompt token.</p>
             */
            public Builder promptTokensDetails(PromptTokensDetails promptTokensDetails) {
                this.promptTokensDetails = promptTokensDetails;
                return this;
            }

            /**
             * <p>The total number of tokens.</p>
             * 
             * <strong>example:</strong>
             * <p>42</p>
             */
            public Builder totalTokens(Long totalTokens) {
                this.totalTokens = totalTokens;
                return this;
            }

            public Usage build() {
                return new Usage(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChatWithKnowledgeBaseResponseBody} extends {@link TeaModel}
     *
     * <p>ChatWithKnowledgeBaseResponseBody</p>
     */
    public static class ChatCompletion extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Choices")
        private java.util.List<Choices> choices;

        @com.aliyun.core.annotation.NameInMap("Created")
        private Long created;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("Usage")
        private Usage usage;

        private ChatCompletion(Builder builder) {
            this.choices = builder.choices;
            this.created = builder.created;
            this.id = builder.id;
            this.model = builder.model;
            this.usage = builder.usage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChatCompletion create() {
            return builder().build();
        }

        /**
         * @return choices
         */
        public java.util.List<Choices> getChoices() {
            return this.choices;
        }

        /**
         * @return created
         */
        public Long getCreated() {
            return this.created;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return usage
         */
        public Usage getUsage() {
            return this.usage;
        }

        public static final class Builder {
            private java.util.List<Choices> choices; 
            private Long created; 
            private String id; 
            private String model; 
            private Usage usage; 

            private Builder() {
            } 

            private Builder(ChatCompletion model) {
                this.choices = model.choices;
                this.created = model.created;
                this.id = model.id;
                this.model = model.model;
                this.usage = model.usage;
            } 

            /**
             * <p>Text content generated in real time.</p>
             */
            public Builder choices(java.util.List<Choices> choices) {
                this.choices = choices;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1758529748</p>
             */
            public Builder created(Long created) {
                this.created = created;
                return this;
            }

            /**
             * <p>The ID of the response.</p>
             * 
             * <strong>example:</strong>
             * <p>273e3fc7-8f56-4167-a1bb-d35d2f3b9043</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the model.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen-plus</p>
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * <p>The number of tokens used in LLM output.</p>
             */
            public Builder usage(Usage usage) {
                this.usage = usage;
                return this;
            }

            public ChatCompletion build() {
                return new ChatCompletion(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChatWithKnowledgeBaseResponseBody} extends {@link TeaModel}
     *
     * <p>ChatWithKnowledgeBaseResponseBody</p>
     */
    public static class Metadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Source")
        private Long source;

        private Metadata(Builder builder) {
            this.source = builder.source;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Metadata create() {
            return builder().build();
        }

        /**
         * @return source
         */
        public Long getSource() {
            return this.source;
        }

        public static final class Builder {
            private Long source; 

            private Builder() {
            } 

            private Builder(Metadata model) {
                this.source = model.source;
            } 

            /**
             * <p>The source of the document.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder source(Long source) {
                this.source = source;
                return this;
            }

            public Metadata build() {
                return new Metadata(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChatWithKnowledgeBaseResponseBody} extends {@link TeaModel}
     *
     * <p>ChatWithKnowledgeBaseResponseBody</p>
     */
    public static class Matches extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FileURL")
        private String fileURL;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("LoaderMetadata")
        private Object loaderMetadata;

        @com.aliyun.core.annotation.NameInMap("Metadata")
        private Metadata metadata;

        @com.aliyun.core.annotation.NameInMap("RerankScore")
        private Double rerankScore;

        @com.aliyun.core.annotation.NameInMap("RetrievalSource")
        private Long retrievalSource;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Double score;

        @com.aliyun.core.annotation.NameInMap("Vector")
        private java.util.List<Double> vector;

        private Matches(Builder builder) {
            this.content = builder.content;
            this.fileName = builder.fileName;
            this.fileURL = builder.fileURL;
            this.id = builder.id;
            this.loaderMetadata = builder.loaderMetadata;
            this.metadata = builder.metadata;
            this.rerankScore = builder.rerankScore;
            this.retrievalSource = builder.retrievalSource;
            this.score = builder.score;
            this.vector = builder.vector;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Matches create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileURL
         */
        public String getFileURL() {
            return this.fileURL;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return loaderMetadata
         */
        public Object getLoaderMetadata() {
            return this.loaderMetadata;
        }

        /**
         * @return metadata
         */
        public Metadata getMetadata() {
            return this.metadata;
        }

        /**
         * @return rerankScore
         */
        public Double getRerankScore() {
            return this.rerankScore;
        }

        /**
         * @return retrievalSource
         */
        public Long getRetrievalSource() {
            return this.retrievalSource;
        }

        /**
         * @return score
         */
        public Double getScore() {
            return this.score;
        }

        /**
         * @return vector
         */
        public java.util.List<Double> getVector() {
            return this.vector;
        }

        public static final class Builder {
            private String content; 
            private String fileName; 
            private String fileURL; 
            private String id; 
            private Object loaderMetadata; 
            private Metadata metadata; 
            private Double rerankScore; 
            private Long retrievalSource; 
            private Double score; 
            private java.util.List<Double> vector; 

            private Builder() {
            } 

            private Builder(Matches model) {
                this.content = model.content;
                this.fileName = model.fileName;
                this.fileURL = model.fileURL;
                this.id = model.id;
                this.loaderMetadata = model.loaderMetadata;
                this.metadata = model.metadata;
                this.rerankScore = model.rerankScore;
                this.retrievalSource = model.retrievalSource;
                this.score = model.score;
                this.vector = model.vector;
            } 

            /**
             * <p>The content of the document.</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The file name.</p>
             * 
             * <strong>example:</strong>
             * <p>process_info_19b9df4dc9ad4bf2b30eb2faa4a9a987.txt</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The URL of the image result. By default, the URL is valid for 2 hours.</p>
             * <p>You can use the UrlExpiration parameter to specify a validity period.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://viapi-customer-pop.oss-cn-shanghai.aliyuncs.com/b4d8_207196811002111319_570c0e199f03428f812ab21fcc00dd6a">http://viapi-customer-pop.oss-cn-shanghai.aliyuncs.com/b4d8_207196811002111319_570c0e199f03428f812ab21fcc00dd6a</a></p>
             */
            public Builder fileURL(String fileURL) {
                this.fileURL = fileURL;
                return this;
            }

            /**
             * <p>The unique ID of the vector data.</p>
             * 
             * <strong>example:</strong>
             * <p>273e3fc7-8f56-4167-a1bb-d35d2f3b9043</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Document loader metadata.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;page&quot;:1}</p>
             */
            public Builder loaderMetadata(Object loaderMetadata) {
                this.loaderMetadata = loaderMetadata;
                return this;
            }

            /**
             * <p>The metadata.</p>
             */
            public Builder metadata(Metadata metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * <p>The rerank score.</p>
             * 
             * <strong>example:</strong>
             * <p>0.1</p>
             */
            public Builder rerankScore(Double rerankScore) {
                this.rerankScore = rerankScore;
                return this;
            }

            /**
             * <p>The source of the retrieved results. 1 indicates vector retrieval, 2 indicates full-text retrieval, and 3 indicates dual-path retrieval.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder retrievalSource(Long retrievalSource) {
                this.retrievalSource = retrievalSource;
                return this;
            }

            /**
             * <p>The similarity score of the data. It is related to the <code>l2, ip, or cosine</code> algorithm that is specified when you create an index.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder score(Double score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The vector data.</p>
             */
            public Builder vector(java.util.List<Double> vector) {
                this.vector = vector;
                return this;
            }

            public Matches build() {
                return new Matches(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChatWithKnowledgeBaseResponseBody} extends {@link TeaModel}
     *
     * <p>ChatWithKnowledgeBaseResponseBody</p>
     */
    public static class MultiCollectionRecallResultUsage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EmbeddingTokens")
        private Long embeddingTokens;

        private MultiCollectionRecallResultUsage(Builder builder) {
            this.embeddingTokens = builder.embeddingTokens;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MultiCollectionRecallResultUsage create() {
            return builder().build();
        }

        /**
         * @return embeddingTokens
         */
        public Long getEmbeddingTokens() {
            return this.embeddingTokens;
        }

        public static final class Builder {
            private Long embeddingTokens; 

            private Builder() {
            } 

            private Builder(MultiCollectionRecallResultUsage model) {
                this.embeddingTokens = model.embeddingTokens;
            } 

            /**
             * <p>The number of tokens that are used during vectorization.</p>
             * <blockquote>
             * <p> A token is the minimum unit for splitting text. A token can be a word, phrase, punctuation, or character.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>21</p>
             */
            public Builder embeddingTokens(Long embeddingTokens) {
                this.embeddingTokens = embeddingTokens;
                return this;
            }

            public MultiCollectionRecallResultUsage build() {
                return new MultiCollectionRecallResultUsage(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChatWithKnowledgeBaseResponseBody} extends {@link TeaModel}
     *
     * <p>ChatWithKnowledgeBaseResponseBody</p>
     */
    public static class MultiCollectionRecallResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Entities")
        private java.util.List<String> entities;

        @com.aliyun.core.annotation.NameInMap("Matches")
        private java.util.List<Matches> matches;

        @com.aliyun.core.annotation.NameInMap("Relations")
        private java.util.List<String> relations;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tokens")
        private Long tokens;

        @com.aliyun.core.annotation.NameInMap("Usage")
        private MultiCollectionRecallResultUsage usage;

        private MultiCollectionRecallResult(Builder builder) {
            this.entities = builder.entities;
            this.matches = builder.matches;
            this.relations = builder.relations;
            this.requestId = builder.requestId;
            this.status = builder.status;
            this.tokens = builder.tokens;
            this.usage = builder.usage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MultiCollectionRecallResult create() {
            return builder().build();
        }

        /**
         * @return entities
         */
        public java.util.List<String> getEntities() {
            return this.entities;
        }

        /**
         * @return matches
         */
        public java.util.List<Matches> getMatches() {
            return this.matches;
        }

        /**
         * @return relations
         */
        public java.util.List<String> getRelations() {
            return this.relations;
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
         * @return tokens
         */
        public Long getTokens() {
            return this.tokens;
        }

        /**
         * @return usage
         */
        public MultiCollectionRecallResultUsage getUsage() {
            return this.usage;
        }

        public static final class Builder {
            private java.util.List<String> entities; 
            private java.util.List<Matches> matches; 
            private java.util.List<String> relations; 
            private String requestId; 
            private String status; 
            private Long tokens; 
            private MultiCollectionRecallResultUsage usage; 

            private Builder() {
            } 

            private Builder(MultiCollectionRecallResult model) {
                this.entities = model.entities;
                this.matches = model.matches;
                this.relations = model.relations;
                this.requestId = model.requestId;
                this.status = model.status;
                this.tokens = model.tokens;
                this.usage = model.usage;
            } 

            /**
             * <p>The details of the entity.</p>
             */
            public Builder entities(java.util.List<String> entities) {
                this.entities = entities;
                return this;
            }

            /**
             * <p>The retrieved items.</p>
             */
            public Builder matches(java.util.List<Matches> matches) {
                this.matches = matches;
                return this;
            }

            /**
             * <p>The name of the file.</p>
             */
            public Builder relations(java.util.List<String> relations) {
                this.relations = relations;
                return this;
            }

            /**
             * <p>Request ID.</p>
             * 
             * <strong>example:</strong>
             * <p>6B9E3255-4543-5B3B-9E00-6490CA64742B</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * <p>The status of the operation. Valid values:</p>
             * <ul>
             * <li><strong>success</strong></li>
             * <li><strong>fail</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The number of tokens that are consumed.</p>
             * 
             * <strong>example:</strong>
             * <p>42</p>
             */
            public Builder tokens(Long tokens) {
                this.tokens = tokens;
                return this;
            }

            /**
             * <p>The number of tokens that are consumed during document understanding or embedding.</p>
             */
            public Builder usage(MultiCollectionRecallResultUsage usage) {
                this.usage = usage;
                return this;
            }

            public MultiCollectionRecallResult build() {
                return new MultiCollectionRecallResult(this);
            } 

        } 

    }
}
