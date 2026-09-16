// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link GetMessagesResponseBody} extends {@link TeaModel}
 *
 * <p>GetMessagesResponseBody</p>
 */
public class GetMessagesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HasMore")
    private Boolean hasMore;

    @com.aliyun.core.annotation.NameInMap("Limit")
    private Long limit;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetMessagesResponseBody(Builder builder) {
        this.data = builder.data;
        this.hasMore = builder.hasMore;
        this.limit = builder.limit;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMessagesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return hasMore
     */
    public Boolean getHasMore() {
        return this.hasMore;
    }

    /**
     * @return limit
     */
    public Long getLimit() {
        return this.limit;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private Boolean hasMore; 
        private Long limit; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetMessagesResponseBody model) {
            this.data = model.data;
            this.hasMore = model.hasMore;
            this.limit = model.limit;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The query result.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Indicates whether there is a next page.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder hasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }

        /**
         * <p>The maximum number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder limit(Long limit) {
            this.limit = limit;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMessagesResponseBody build() {
            return new GetMessagesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMessagesResponseBody} extends {@link TeaModel}
     *
     * <p>GetMessagesResponseBody</p>
     */
    public static class Events extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApprovalStatus")
        private String approvalStatus;

        @com.aliyun.core.annotation.NameInMap("CallId")
        private String callId;

        @com.aliyun.core.annotation.NameInMap("ConversationId")
        private String conversationId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("MessageId")
        private String messageId;

        @com.aliyun.core.annotation.NameInMap("RoundId")
        private String roundId;

        @com.aliyun.core.annotation.NameInMap("ToolArguments")
        private java.util.Map<String, ?> toolArguments;

        @com.aliyun.core.annotation.NameInMap("ToolName")
        private String toolName;

        @com.aliyun.core.annotation.NameInMap("answer")
        private String answer;

        @com.aliyun.core.annotation.NameInMap("event")
        private String event;

        private Events(Builder builder) {
            this.approvalStatus = builder.approvalStatus;
            this.callId = builder.callId;
            this.conversationId = builder.conversationId;
            this.description = builder.description;
            this.messageId = builder.messageId;
            this.roundId = builder.roundId;
            this.toolArguments = builder.toolArguments;
            this.toolName = builder.toolName;
            this.answer = builder.answer;
            this.event = builder.event;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Events create() {
            return builder().build();
        }

        /**
         * @return approvalStatus
         */
        public String getApprovalStatus() {
            return this.approvalStatus;
        }

        /**
         * @return callId
         */
        public String getCallId() {
            return this.callId;
        }

        /**
         * @return conversationId
         */
        public String getConversationId() {
            return this.conversationId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return messageId
         */
        public String getMessageId() {
            return this.messageId;
        }

        /**
         * @return roundId
         */
        public String getRoundId() {
            return this.roundId;
        }

        /**
         * @return toolArguments
         */
        public java.util.Map<String, ?> getToolArguments() {
            return this.toolArguments;
        }

        /**
         * @return toolName
         */
        public String getToolName() {
            return this.toolName;
        }

        /**
         * @return answer
         */
        public String getAnswer() {
            return this.answer;
        }

        /**
         * @return event
         */
        public String getEvent() {
            return this.event;
        }

        public static final class Builder {
            private String approvalStatus; 
            private String callId; 
            private String conversationId; 
            private String description; 
            private String messageId; 
            private String roundId; 
            private java.util.Map<String, ?> toolArguments; 
            private String toolName; 
            private String answer; 
            private String event; 

            private Builder() {
            } 

            private Builder(Events model) {
                this.approvalStatus = model.approvalStatus;
                this.callId = model.callId;
                this.conversationId = model.conversationId;
                this.description = model.description;
                this.messageId = model.messageId;
                this.roundId = model.roundId;
                this.toolArguments = model.toolArguments;
                this.toolName = model.toolName;
                this.answer = model.answer;
                this.event = model.event;
            } 

            /**
             * <p>The approval status of the tool calling.</p>
             * 
             * <strong>example:</strong>
             * <p>pending</p>
             */
            public Builder approvalStatus(String approvalStatus) {
                this.approvalStatus = approvalStatus;
                return this;
            }

            /**
             * <p>The tool calling ID.</p>
             * 
             * <strong>example:</strong>
             * <p>call-example</p>
             */
            public Builder callId(String callId) {
                this.callId = callId;
                return this;
            }

            /**
             * <p>The session ID.</p>
             * 
             * <strong>example:</strong>
             * <p>conversation-example</p>
             */
            public Builder conversationId(String conversationId) {
                this.conversationId = conversationId;
                return this;
            }

            /**
             * <p>The description of the tool calling.</p>
             * 
             * <strong>example:</strong>
             * <p>Search ContextDB records</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The message ID.</p>
             * 
             * <strong>example:</strong>
             * <p>message-example</p>
             */
            public Builder messageId(String messageId) {
                this.messageId = messageId;
                return this;
            }

            /**
             * <p>The tool approval round ID.</p>
             * 
             * <strong>example:</strong>
             * <p>round-example</p>
             */
            public Builder roundId(String roundId) {
                this.roundId = roundId;
                return this;
            }

            /**
             * <p>The parameters of the tool calling.</p>
             */
            public Builder toolArguments(java.util.Map<String, ?> toolArguments) {
                this.toolArguments = toolArguments;
                return this;
            }

            /**
             * <p>The tool name.</p>
             * 
             * <strong>example:</strong>
             * <p>contextdb.search</p>
             */
            public Builder toolName(String toolName) {
                this.toolName = toolName;
                return this;
            }

            /**
             * answer.
             */
            public Builder answer(String answer) {
                this.answer = answer;
                return this;
            }

            /**
             * event.
             */
            public Builder event(String event) {
                this.event = event;
                return this;
            }

            public Events build() {
                return new Events(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMessagesResponseBody} extends {@link TeaModel}
     *
     * <p>GetMessagesResponseBody</p>
     */
    public static class MessageFiles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("PreviewUrl")
        private String previewUrl;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UploadFileId")
        private String uploadFileId;

        private MessageFiles(Builder builder) {
            this.id = builder.id;
            this.previewUrl = builder.previewUrl;
            this.type = builder.type;
            this.uploadFileId = builder.uploadFileId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MessageFiles create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return previewUrl
         */
        public String getPreviewUrl() {
            return this.previewUrl;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return uploadFileId
         */
        public String getUploadFileId() {
            return this.uploadFileId;
        }

        public static final class Builder {
            private String id; 
            private String previewUrl; 
            private String type; 
            private String uploadFileId; 

            private Builder() {
            } 

            private Builder(MessageFiles model) {
                this.id = model.id;
                this.previewUrl = model.previewUrl;
                this.type = model.type;
                this.uploadFileId = model.uploadFileId;
            } 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * PreviewUrl.
             */
            public Builder previewUrl(String previewUrl) {
                this.previewUrl = previewUrl;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The upload file ID.</p>
             * 
             * <strong>example:</strong>
             * <p>file-example</p>
             */
            public Builder uploadFileId(String uploadFileId) {
                this.uploadFileId = uploadFileId;
                return this;
            }

            public MessageFiles build() {
                return new MessageFiles(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMessagesResponseBody} extends {@link TeaModel}
     *
     * <p>GetMessagesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Answer")
        private String answer;

        @com.aliyun.core.annotation.NameInMap("ConversationId")
        private String conversationId;

        @com.aliyun.core.annotation.NameInMap("CreatedAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("Events")
        private java.util.List<Events> events;

        @com.aliyun.core.annotation.NameInMap("Feedback")
        private String feedback;

        @com.aliyun.core.annotation.NameInMap("GenerationFinishedAt")
        private String generationFinishedAt;

        @com.aliyun.core.annotation.NameInMap("GenerationStartedAt")
        private String generationStartedAt;

        @com.aliyun.core.annotation.NameInMap("GenerationStatus")
        private String generationStatus;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("LastSentEntryId")
        private String lastSentEntryId;

        @com.aliyun.core.annotation.NameInMap("MessageFiles")
        private java.util.List<MessageFiles> messageFiles;

        @com.aliyun.core.annotation.NameInMap("Query")
        private String query;

        @com.aliyun.core.annotation.NameInMap("RetrieverResources")
        private java.util.List<?> retrieverResources;

        @com.aliyun.core.annotation.NameInMap("StreamKey")
        private String streamKey;

        private Data(Builder builder) {
            this.answer = builder.answer;
            this.conversationId = builder.conversationId;
            this.createdAt = builder.createdAt;
            this.events = builder.events;
            this.feedback = builder.feedback;
            this.generationFinishedAt = builder.generationFinishedAt;
            this.generationStartedAt = builder.generationStartedAt;
            this.generationStatus = builder.generationStatus;
            this.id = builder.id;
            this.lastSentEntryId = builder.lastSentEntryId;
            this.messageFiles = builder.messageFiles;
            this.query = builder.query;
            this.retrieverResources = builder.retrieverResources;
            this.streamKey = builder.streamKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return answer
         */
        public String getAnswer() {
            return this.answer;
        }

        /**
         * @return conversationId
         */
        public String getConversationId() {
            return this.conversationId;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return events
         */
        public java.util.List<Events> getEvents() {
            return this.events;
        }

        /**
         * @return feedback
         */
        public String getFeedback() {
            return this.feedback;
        }

        /**
         * @return generationFinishedAt
         */
        public String getGenerationFinishedAt() {
            return this.generationFinishedAt;
        }

        /**
         * @return generationStartedAt
         */
        public String getGenerationStartedAt() {
            return this.generationStartedAt;
        }

        /**
         * @return generationStatus
         */
        public String getGenerationStatus() {
            return this.generationStatus;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return lastSentEntryId
         */
        public String getLastSentEntryId() {
            return this.lastSentEntryId;
        }

        /**
         * @return messageFiles
         */
        public java.util.List<MessageFiles> getMessageFiles() {
            return this.messageFiles;
        }

        /**
         * @return query
         */
        public String getQuery() {
            return this.query;
        }

        /**
         * @return retrieverResources
         */
        public java.util.List<?> getRetrieverResources() {
            return this.retrieverResources;
        }

        /**
         * @return streamKey
         */
        public String getStreamKey() {
            return this.streamKey;
        }

        public static final class Builder {
            private String answer; 
            private String conversationId; 
            private String createdAt; 
            private java.util.List<Events> events; 
            private String feedback; 
            private String generationFinishedAt; 
            private String generationStartedAt; 
            private String generationStatus; 
            private String id; 
            private String lastSentEntryId; 
            private java.util.List<MessageFiles> messageFiles; 
            private String query; 
            private java.util.List<?> retrieverResources; 
            private String streamKey; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.answer = model.answer;
                this.conversationId = model.conversationId;
                this.createdAt = model.createdAt;
                this.events = model.events;
                this.feedback = model.feedback;
                this.generationFinishedAt = model.generationFinishedAt;
                this.generationStartedAt = model.generationStartedAt;
                this.generationStatus = model.generationStatus;
                this.id = model.id;
                this.lastSentEntryId = model.lastSentEntryId;
                this.messageFiles = model.messageFiles;
                this.query = model.query;
                this.retrieverResources = model.retrieverResources;
                this.streamKey = model.streamKey;
            } 

            /**
             * <p>The answer.</p>
             * 
             * <strong>example:</strong>
             * <p>The disk usage of the instance rm-bp14as9914vd3**** you queried is 23%, and no capacity expansion is needed at this time. If you need to view the detailed configurations or performance monitoring of a specific instance, or perform other operations, let me know your specific requirements!</p>
             */
            public Builder answer(String answer) {
                this.answer = answer;
                return this;
            }

            /**
             * <p>The session ID.</p>
             * 
             * <strong>example:</strong>
             * <p>9cbbe885-b240-4803-9d15-6781a3fd****</p>
             */
            public Builder conversationId(String conversationId) {
                this.conversationId = conversationId;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1763986004</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * Events.
             */
            public Builder events(java.util.List<Events> events) {
                this.events = events;
                return this;
            }

            /**
             * <p>The feedback.</p>
             * 
             * <strong>example:</strong>
             * <p>like</p>
             */
            public Builder feedback(String feedback) {
                this.feedback = feedback;
                return this;
            }

            /**
             * GenerationFinishedAt.
             */
            public Builder generationFinishedAt(String generationFinishedAt) {
                this.generationFinishedAt = generationFinishedAt;
                return this;
            }

            /**
             * GenerationStartedAt.
             */
            public Builder generationStartedAt(String generationStartedAt) {
                this.generationStartedAt = generationStartedAt;
                return this;
            }

            /**
             * GenerationStatus.
             */
            public Builder generationStatus(String generationStatus) {
                this.generationStatus = generationStatus;
                return this;
            }

            /**
             * <p>The message ID.</p>
             * 
             * <strong>example:</strong>
             * <p>84dc9f9b-424a-404d-9c36-35e9d000****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * LastSentEntryId.
             */
            public Builder lastSentEntryId(String lastSentEntryId) {
                this.lastSentEntryId = lastSentEntryId;
                return this;
            }

            /**
             * MessageFiles.
             */
            public Builder messageFiles(java.util.List<MessageFiles> messageFiles) {
                this.messageFiles = messageFiles;
                return this;
            }

            /**
             * <p>The query statement.</p>
             * 
             * <strong>example:</strong>
             * <p>Disk usage of instance rm-bp14as9914vd3****, is capacity expansion needed</p>
             */
            public Builder query(String query) {
                this.query = query;
                return this;
            }

            /**
             * <p>The retrieval resources.</p>
             */
            public Builder retrieverResources(java.util.List<?> retrieverResources) {
                this.retrieverResources = retrieverResources;
                return this;
            }

            /**
             * StreamKey.
             */
            public Builder streamKey(String streamKey) {
                this.streamKey = streamKey;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
