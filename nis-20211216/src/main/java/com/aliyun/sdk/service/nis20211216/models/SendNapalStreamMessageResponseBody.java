// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

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
 * {@link SendNapalStreamMessageResponseBody} extends {@link TeaModel}
 *
 * <p>SendNapalStreamMessageResponseBody</p>
 */
public class SendNapalStreamMessageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Message")
    private Message message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Task")
    private Task task;

    @com.aliyun.core.annotation.NameInMap("TaskArtifactUpdate")
    private TaskArtifactUpdate taskArtifactUpdate;

    @com.aliyun.core.annotation.NameInMap("TaskStatusUpdate")
    private TaskStatusUpdate taskStatusUpdate;

    private SendNapalStreamMessageResponseBody(Builder builder) {
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.task = builder.task;
        this.taskArtifactUpdate = builder.taskArtifactUpdate;
        this.taskStatusUpdate = builder.taskStatusUpdate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendNapalStreamMessageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return message
     */
    public Message getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return task
     */
    public Task getTask() {
        return this.task;
    }

    /**
     * @return taskArtifactUpdate
     */
    public TaskArtifactUpdate getTaskArtifactUpdate() {
        return this.taskArtifactUpdate;
    }

    /**
     * @return taskStatusUpdate
     */
    public TaskStatusUpdate getTaskStatusUpdate() {
        return this.taskStatusUpdate;
    }

    public static final class Builder {
        private Message message; 
        private String requestId; 
        private Task task; 
        private TaskArtifactUpdate taskArtifactUpdate; 
        private TaskStatusUpdate taskStatusUpdate; 

        private Builder() {
        } 

        private Builder(SendNapalStreamMessageResponseBody model) {
            this.message = model.message;
            this.requestId = model.requestId;
            this.task = model.task;
            this.taskArtifactUpdate = model.taskArtifactUpdate;
            this.taskStatusUpdate = model.taskStatusUpdate;
        } 

        /**
         * Message.
         */
        public Builder message(Message message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Task.
         */
        public Builder task(Task task) {
            this.task = task;
            return this;
        }

        /**
         * TaskArtifactUpdate.
         */
        public Builder taskArtifactUpdate(TaskArtifactUpdate taskArtifactUpdate) {
            this.taskArtifactUpdate = taskArtifactUpdate;
            return this;
        }

        /**
         * TaskStatusUpdate.
         */
        public Builder taskStatusUpdate(TaskStatusUpdate taskStatusUpdate) {
            this.taskStatusUpdate = taskStatusUpdate;
            return this;
        }

        public SendNapalStreamMessageResponseBody build() {
            return new SendNapalStreamMessageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SendNapalStreamMessageResponseBody} extends {@link TeaModel}
     *
     * <p>SendNapalStreamMessageResponseBody</p>
     */
    public static class Parts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private Object data;

        @com.aliyun.core.annotation.NameInMap("Filename")
        private String filename;

        @com.aliyun.core.annotation.NameInMap("MediaType")
        private String mediaType;

        @com.aliyun.core.annotation.NameInMap("Raw")
        private String raw;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Parts(Builder builder) {
            this.data = builder.data;
            this.filename = builder.filename;
            this.mediaType = builder.mediaType;
            this.raw = builder.raw;
            this.text = builder.text;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parts create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public Object getData() {
            return this.data;
        }

        /**
         * @return filename
         */
        public String getFilename() {
            return this.filename;
        }

        /**
         * @return mediaType
         */
        public String getMediaType() {
            return this.mediaType;
        }

        /**
         * @return raw
         */
        public String getRaw() {
            return this.raw;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private Object data; 
            private String filename; 
            private String mediaType; 
            private String raw; 
            private String text; 
            private String url; 

            private Builder() {
            } 

            private Builder(Parts model) {
                this.data = model.data;
                this.filename = model.filename;
                this.mediaType = model.mediaType;
                this.raw = model.raw;
                this.text = model.text;
                this.url = model.url;
            } 

            /**
             * Data.
             */
            public Builder data(Object data) {
                this.data = data;
                return this;
            }

            /**
             * Filename.
             */
            public Builder filename(String filename) {
                this.filename = filename;
                return this;
            }

            /**
             * MediaType.
             */
            public Builder mediaType(String mediaType) {
                this.mediaType = mediaType;
                return this;
            }

            /**
             * Raw.
             */
            public Builder raw(String raw) {
                this.raw = raw;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Parts build() {
                return new Parts(this);
            } 

        } 

    }
    /**
     * 
     * {@link SendNapalStreamMessageResponseBody} extends {@link TeaModel}
     *
     * <p>SendNapalStreamMessageResponseBody</p>
     */
    public static class Message extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContextId")
        private String contextId;

        @com.aliyun.core.annotation.NameInMap("Extensions")
        private java.util.List<String> extensions;

        @com.aliyun.core.annotation.NameInMap("MessageId")
        private String messageId;

        @com.aliyun.core.annotation.NameInMap("Metadata")
        private java.util.Map<String, ?> metadata;

        @com.aliyun.core.annotation.NameInMap("Parts")
        private java.util.List<Parts> parts;

        @com.aliyun.core.annotation.NameInMap("ReferenceTaskIds")
        private java.util.List<String> referenceTaskIds;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private Message(Builder builder) {
            this.contextId = builder.contextId;
            this.extensions = builder.extensions;
            this.messageId = builder.messageId;
            this.metadata = builder.metadata;
            this.parts = builder.parts;
            this.referenceTaskIds = builder.referenceTaskIds;
            this.role = builder.role;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Message create() {
            return builder().build();
        }

        /**
         * @return contextId
         */
        public String getContextId() {
            return this.contextId;
        }

        /**
         * @return extensions
         */
        public java.util.List<String> getExtensions() {
            return this.extensions;
        }

        /**
         * @return messageId
         */
        public String getMessageId() {
            return this.messageId;
        }

        /**
         * @return metadata
         */
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        /**
         * @return parts
         */
        public java.util.List<Parts> getParts() {
            return this.parts;
        }

        /**
         * @return referenceTaskIds
         */
        public java.util.List<String> getReferenceTaskIds() {
            return this.referenceTaskIds;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String contextId; 
            private java.util.List<String> extensions; 
            private String messageId; 
            private java.util.Map<String, ?> metadata; 
            private java.util.List<Parts> parts; 
            private java.util.List<String> referenceTaskIds; 
            private String role; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(Message model) {
                this.contextId = model.contextId;
                this.extensions = model.extensions;
                this.messageId = model.messageId;
                this.metadata = model.metadata;
                this.parts = model.parts;
                this.referenceTaskIds = model.referenceTaskIds;
                this.role = model.role;
                this.taskId = model.taskId;
            } 

            /**
             * ContextId.
             */
            public Builder contextId(String contextId) {
                this.contextId = contextId;
                return this;
            }

            /**
             * Extensions.
             */
            public Builder extensions(java.util.List<String> extensions) {
                this.extensions = extensions;
                return this;
            }

            /**
             * MessageId.
             */
            public Builder messageId(String messageId) {
                this.messageId = messageId;
                return this;
            }

            /**
             * Metadata.
             */
            public Builder metadata(java.util.Map<String, ?> metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * Parts.
             */
            public Builder parts(java.util.List<Parts> parts) {
                this.parts = parts;
                return this;
            }

            /**
             * ReferenceTaskIds.
             */
            public Builder referenceTaskIds(java.util.List<String> referenceTaskIds) {
                this.referenceTaskIds = referenceTaskIds;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public Message build() {
                return new Message(this);
            } 

        } 

    }
    /**
     * 
     * {@link SendNapalStreamMessageResponseBody} extends {@link TeaModel}
     *
     * <p>SendNapalStreamMessageResponseBody</p>
     */
    public static class ArtifactsParts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private Object data;

        @com.aliyun.core.annotation.NameInMap("Filename")
        private String filename;

        @com.aliyun.core.annotation.NameInMap("MediaType")
        private String mediaType;

        @com.aliyun.core.annotation.NameInMap("Raw")
        private String raw;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private ArtifactsParts(Builder builder) {
            this.data = builder.data;
            this.filename = builder.filename;
            this.mediaType = builder.mediaType;
            this.raw = builder.raw;
            this.text = builder.text;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ArtifactsParts create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public Object getData() {
            return this.data;
        }

        /**
         * @return filename
         */
        public String getFilename() {
            return this.filename;
        }

        /**
         * @return mediaType
         */
        public String getMediaType() {
            return this.mediaType;
        }

        /**
         * @return raw
         */
        public String getRaw() {
            return this.raw;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private Object data; 
            private String filename; 
            private String mediaType; 
            private String raw; 
            private String text; 
            private String url; 

            private Builder() {
            } 

            private Builder(ArtifactsParts model) {
                this.data = model.data;
                this.filename = model.filename;
                this.mediaType = model.mediaType;
                this.raw = model.raw;
                this.text = model.text;
                this.url = model.url;
            } 

            /**
             * Data.
             */
            public Builder data(Object data) {
                this.data = data;
                return this;
            }

            /**
             * Filename.
             */
            public Builder filename(String filename) {
                this.filename = filename;
                return this;
            }

            /**
             * MediaType.
             */
            public Builder mediaType(String mediaType) {
                this.mediaType = mediaType;
                return this;
            }

            /**
             * Raw.
             */
            public Builder raw(String raw) {
                this.raw = raw;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public ArtifactsParts build() {
                return new ArtifactsParts(this);
            } 

        } 

    }
    /**
     * 
     * {@link SendNapalStreamMessageResponseBody} extends {@link TeaModel}
     *
     * <p>SendNapalStreamMessageResponseBody</p>
     */
    public static class Artifacts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArtifactId")
        private String artifactId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Extensions")
        private java.util.List<String> extensions;

        @com.aliyun.core.annotation.NameInMap("Metadata")
        private java.util.Map<String, ?> metadata;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Parts")
        private java.util.List<ArtifactsParts> parts;

        private Artifacts(Builder builder) {
            this.artifactId = builder.artifactId;
            this.description = builder.description;
            this.extensions = builder.extensions;
            this.metadata = builder.metadata;
            this.name = builder.name;
            this.parts = builder.parts;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Artifacts create() {
            return builder().build();
        }

        /**
         * @return artifactId
         */
        public String getArtifactId() {
            return this.artifactId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return extensions
         */
        public java.util.List<String> getExtensions() {
            return this.extensions;
        }

        /**
         * @return metadata
         */
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return parts
         */
        public java.util.List<ArtifactsParts> getParts() {
            return this.parts;
        }

        public static final class Builder {
            private String artifactId; 
            private String description; 
            private java.util.List<String> extensions; 
            private java.util.Map<String, ?> metadata; 
            private String name; 
            private java.util.List<ArtifactsParts> parts; 

            private Builder() {
            } 

            private Builder(Artifacts model) {
                this.artifactId = model.artifactId;
                this.description = model.description;
                this.extensions = model.extensions;
                this.metadata = model.metadata;
                this.name = model.name;
                this.parts = model.parts;
            } 

            /**
             * ArtifactId.
             */
            public Builder artifactId(String artifactId) {
                this.artifactId = artifactId;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Extensions.
             */
            public Builder extensions(java.util.List<String> extensions) {
                this.extensions = extensions;
                return this;
            }

            /**
             * Metadata.
             */
            public Builder metadata(java.util.Map<String, ?> metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Parts.
             */
            public Builder parts(java.util.List<ArtifactsParts> parts) {
                this.parts = parts;
                return this;
            }

            public Artifacts build() {
                return new Artifacts(this);
            } 

        } 

    }
    /**
     * 
     * {@link SendNapalStreamMessageResponseBody} extends {@link TeaModel}
     *
     * <p>SendNapalStreamMessageResponseBody</p>
     */
    public static class HistoryParts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private Object data;

        @com.aliyun.core.annotation.NameInMap("Filename")
        private String filename;

        @com.aliyun.core.annotation.NameInMap("MediaType")
        private String mediaType;

        @com.aliyun.core.annotation.NameInMap("Raw")
        private String raw;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private HistoryParts(Builder builder) {
            this.data = builder.data;
            this.filename = builder.filename;
            this.mediaType = builder.mediaType;
            this.raw = builder.raw;
            this.text = builder.text;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HistoryParts create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public Object getData() {
            return this.data;
        }

        /**
         * @return filename
         */
        public String getFilename() {
            return this.filename;
        }

        /**
         * @return mediaType
         */
        public String getMediaType() {
            return this.mediaType;
        }

        /**
         * @return raw
         */
        public String getRaw() {
            return this.raw;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private Object data; 
            private String filename; 
            private String mediaType; 
            private String raw; 
            private String text; 
            private String url; 

            private Builder() {
            } 

            private Builder(HistoryParts model) {
                this.data = model.data;
                this.filename = model.filename;
                this.mediaType = model.mediaType;
                this.raw = model.raw;
                this.text = model.text;
                this.url = model.url;
            } 

            /**
             * Data.
             */
            public Builder data(Object data) {
                this.data = data;
                return this;
            }

            /**
             * Filename.
             */
            public Builder filename(String filename) {
                this.filename = filename;
                return this;
            }

            /**
             * MediaType.
             */
            public Builder mediaType(String mediaType) {
                this.mediaType = mediaType;
                return this;
            }

            /**
             * Raw.
             */
            public Builder raw(String raw) {
                this.raw = raw;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public HistoryParts build() {
                return new HistoryParts(this);
            } 

        } 

    }
    /**
     * 
     * {@link SendNapalStreamMessageResponseBody} extends {@link TeaModel}
     *
     * <p>SendNapalStreamMessageResponseBody</p>
     */
    public static class History extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContextId")
        private String contextId;

        @com.aliyun.core.annotation.NameInMap("Extensions")
        private java.util.List<String> extensions;

        @com.aliyun.core.annotation.NameInMap("MessageId")
        private String messageId;

        @com.aliyun.core.annotation.NameInMap("Metadata")
        private java.util.Map<String, ?> metadata;

        @com.aliyun.core.annotation.NameInMap("Parts")
        private java.util.List<HistoryParts> parts;

        @com.aliyun.core.annotation.NameInMap("ReferenceTaskIds")
        private java.util.List<String> referenceTaskIds;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private History(Builder builder) {
            this.contextId = builder.contextId;
            this.extensions = builder.extensions;
            this.messageId = builder.messageId;
            this.metadata = builder.metadata;
            this.parts = builder.parts;
            this.referenceTaskIds = builder.referenceTaskIds;
            this.role = builder.role;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static History create() {
            return builder().build();
        }

        /**
         * @return contextId
         */
        public String getContextId() {
            return this.contextId;
        }

        /**
         * @return extensions
         */
        public java.util.List<String> getExtensions() {
            return this.extensions;
        }

        /**
         * @return messageId
         */
        public String getMessageId() {
            return this.messageId;
        }

        /**
         * @return metadata
         */
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        /**
         * @return parts
         */
        public java.util.List<HistoryParts> getParts() {
            return this.parts;
        }

        /**
         * @return referenceTaskIds
         */
        public java.util.List<String> getReferenceTaskIds() {
            return this.referenceTaskIds;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String contextId; 
            private java.util.List<String> extensions; 
            private String messageId; 
            private java.util.Map<String, ?> metadata; 
            private java.util.List<HistoryParts> parts; 
            private java.util.List<String> referenceTaskIds; 
            private String role; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(History model) {
                this.contextId = model.contextId;
                this.extensions = model.extensions;
                this.messageId = model.messageId;
                this.metadata = model.metadata;
                this.parts = model.parts;
                this.referenceTaskIds = model.referenceTaskIds;
                this.role = model.role;
                this.taskId = model.taskId;
            } 

            /**
             * ContextId.
             */
            public Builder contextId(String contextId) {
                this.contextId = contextId;
                return this;
            }

            /**
             * Extensions.
             */
            public Builder extensions(java.util.List<String> extensions) {
                this.extensions = extensions;
                return this;
            }

            /**
             * MessageId.
             */
            public Builder messageId(String messageId) {
                this.messageId = messageId;
                return this;
            }

            /**
             * Metadata.
             */
            public Builder metadata(java.util.Map<String, ?> metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * Parts.
             */
            public Builder parts(java.util.List<HistoryParts> parts) {
                this.parts = parts;
                return this;
            }

            /**
             * ReferenceTaskIds.
             */
            public Builder referenceTaskIds(java.util.List<String> referenceTaskIds) {
                this.referenceTaskIds = referenceTaskIds;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public History build() {
                return new History(this);
            } 

        } 

    }
    /**
     * 
     * {@link SendNapalStreamMessageResponseBody} extends {@link TeaModel}
     *
     * <p>SendNapalStreamMessageResponseBody</p>
     */
    public static class MessageParts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private Object data;

        @com.aliyun.core.annotation.NameInMap("Filename")
        private String filename;

        @com.aliyun.core.annotation.NameInMap("MediaType")
        private String mediaType;

        @com.aliyun.core.annotation.NameInMap("Raw")
        private String raw;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private MessageParts(Builder builder) {
            this.data = builder.data;
            this.filename = builder.filename;
            this.mediaType = builder.mediaType;
            this.raw = builder.raw;
            this.text = builder.text;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MessageParts create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public Object getData() {
            return this.data;
        }

        /**
         * @return filename
         */
        public String getFilename() {
            return this.filename;
        }

        /**
         * @return mediaType
         */
        public String getMediaType() {
            return this.mediaType;
        }

        /**
         * @return raw
         */
        public String getRaw() {
            return this.raw;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private Object data; 
            private String filename; 
            private String mediaType; 
            private String raw; 
            private String text; 
            private String url; 

            private Builder() {
            } 

            private Builder(MessageParts model) {
                this.data = model.data;
                this.filename = model.filename;
                this.mediaType = model.mediaType;
                this.raw = model.raw;
                this.text = model.text;
                this.url = model.url;
            } 

            /**
             * Data.
             */
            public Builder data(Object data) {
                this.data = data;
                return this;
            }

            /**
             * Filename.
             */
            public Builder filename(String filename) {
                this.filename = filename;
                return this;
            }

            /**
             * MediaType.
             */
            public Builder mediaType(String mediaType) {
                this.mediaType = mediaType;
                return this;
            }

            /**
             * Raw.
             */
            public Builder raw(String raw) {
                this.raw = raw;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public MessageParts build() {
                return new MessageParts(this);
            } 

        } 

    }
    /**
     * 
     * {@link SendNapalStreamMessageResponseBody} extends {@link TeaModel}
     *
     * <p>SendNapalStreamMessageResponseBody</p>
     */
    public static class StatusMessage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MessageId")
        private String messageId;

        @com.aliyun.core.annotation.NameInMap("Parts")
        private java.util.List<MessageParts> parts;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        private StatusMessage(Builder builder) {
            this.messageId = builder.messageId;
            this.parts = builder.parts;
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StatusMessage create() {
            return builder().build();
        }

        /**
         * @return messageId
         */
        public String getMessageId() {
            return this.messageId;
        }

        /**
         * @return parts
         */
        public java.util.List<MessageParts> getParts() {
            return this.parts;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        public static final class Builder {
            private String messageId; 
            private java.util.List<MessageParts> parts; 
            private String role; 

            private Builder() {
            } 

            private Builder(StatusMessage model) {
                this.messageId = model.messageId;
                this.parts = model.parts;
                this.role = model.role;
            } 

            /**
             * MessageId.
             */
            public Builder messageId(String messageId) {
                this.messageId = messageId;
                return this;
            }

            /**
             * Parts.
             */
            public Builder parts(java.util.List<MessageParts> parts) {
                this.parts = parts;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            public StatusMessage build() {
                return new StatusMessage(this);
            } 

        } 

    }
    /**
     * 
     * {@link SendNapalStreamMessageResponseBody} extends {@link TeaModel}
     *
     * <p>SendNapalStreamMessageResponseBody</p>
     */
    public static class Status extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Message")
        private StatusMessage message;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private String timestamp;

        private Status(Builder builder) {
            this.message = builder.message;
            this.state = builder.state;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Status create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public StatusMessage getMessage() {
            return this.message;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private StatusMessage message; 
            private String state; 
            private String timestamp; 

            private Builder() {
            } 

            private Builder(Status model) {
                this.message = model.message;
                this.state = model.state;
                this.timestamp = model.timestamp;
            } 

            /**
             * Message.
             */
            public Builder message(StatusMessage message) {
                this.message = message;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public Status build() {
                return new Status(this);
            } 

        } 

    }
    /**
     * 
     * {@link SendNapalStreamMessageResponseBody} extends {@link TeaModel}
     *
     * <p>SendNapalStreamMessageResponseBody</p>
     */
    public static class Task extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Artifacts")
        private java.util.List<Artifacts> artifacts;

        @com.aliyun.core.annotation.NameInMap("ContextId")
        private String contextId;

        @com.aliyun.core.annotation.NameInMap("History")
        private java.util.List<History> history;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Metadata")
        private java.util.Map<String, ?> metadata;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Status status;

        private Task(Builder builder) {
            this.artifacts = builder.artifacts;
            this.contextId = builder.contextId;
            this.history = builder.history;
            this.id = builder.id;
            this.metadata = builder.metadata;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Task create() {
            return builder().build();
        }

        /**
         * @return artifacts
         */
        public java.util.List<Artifacts> getArtifacts() {
            return this.artifacts;
        }

        /**
         * @return contextId
         */
        public String getContextId() {
            return this.contextId;
        }

        /**
         * @return history
         */
        public java.util.List<History> getHistory() {
            return this.history;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return metadata
         */
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        /**
         * @return status
         */
        public Status getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List<Artifacts> artifacts; 
            private String contextId; 
            private java.util.List<History> history; 
            private String id; 
            private java.util.Map<String, ?> metadata; 
            private Status status; 

            private Builder() {
            } 

            private Builder(Task model) {
                this.artifacts = model.artifacts;
                this.contextId = model.contextId;
                this.history = model.history;
                this.id = model.id;
                this.metadata = model.metadata;
                this.status = model.status;
            } 

            /**
             * Artifacts.
             */
            public Builder artifacts(java.util.List<Artifacts> artifacts) {
                this.artifacts = artifacts;
                return this;
            }

            /**
             * ContextId.
             */
            public Builder contextId(String contextId) {
                this.contextId = contextId;
                return this;
            }

            /**
             * History.
             */
            public Builder history(java.util.List<History> history) {
                this.history = history;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Metadata.
             */
            public Builder metadata(java.util.Map<String, ?> metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Status status) {
                this.status = status;
                return this;
            }

            public Task build() {
                return new Task(this);
            } 

        } 

    }
    /**
     * 
     * {@link SendNapalStreamMessageResponseBody} extends {@link TeaModel}
     *
     * <p>SendNapalStreamMessageResponseBody</p>
     */
    public static class ArtifactParts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private Object data;

        @com.aliyun.core.annotation.NameInMap("Filename")
        private String filename;

        @com.aliyun.core.annotation.NameInMap("MediaType")
        private String mediaType;

        @com.aliyun.core.annotation.NameInMap("Raw")
        private String raw;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private ArtifactParts(Builder builder) {
            this.data = builder.data;
            this.filename = builder.filename;
            this.mediaType = builder.mediaType;
            this.raw = builder.raw;
            this.text = builder.text;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ArtifactParts create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public Object getData() {
            return this.data;
        }

        /**
         * @return filename
         */
        public String getFilename() {
            return this.filename;
        }

        /**
         * @return mediaType
         */
        public String getMediaType() {
            return this.mediaType;
        }

        /**
         * @return raw
         */
        public String getRaw() {
            return this.raw;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private Object data; 
            private String filename; 
            private String mediaType; 
            private String raw; 
            private String text; 
            private String url; 

            private Builder() {
            } 

            private Builder(ArtifactParts model) {
                this.data = model.data;
                this.filename = model.filename;
                this.mediaType = model.mediaType;
                this.raw = model.raw;
                this.text = model.text;
                this.url = model.url;
            } 

            /**
             * Data.
             */
            public Builder data(Object data) {
                this.data = data;
                return this;
            }

            /**
             * Filename.
             */
            public Builder filename(String filename) {
                this.filename = filename;
                return this;
            }

            /**
             * MediaType.
             */
            public Builder mediaType(String mediaType) {
                this.mediaType = mediaType;
                return this;
            }

            /**
             * Raw.
             */
            public Builder raw(String raw) {
                this.raw = raw;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public ArtifactParts build() {
                return new ArtifactParts(this);
            } 

        } 

    }
    /**
     * 
     * {@link SendNapalStreamMessageResponseBody} extends {@link TeaModel}
     *
     * <p>SendNapalStreamMessageResponseBody</p>
     */
    public static class Artifact extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArtifactId")
        private String artifactId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Extensions")
        private java.util.List<String> extensions;

        @com.aliyun.core.annotation.NameInMap("Metadata")
        private java.util.Map<String, ?> metadata;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Parts")
        private java.util.List<ArtifactParts> parts;

        private Artifact(Builder builder) {
            this.artifactId = builder.artifactId;
            this.description = builder.description;
            this.extensions = builder.extensions;
            this.metadata = builder.metadata;
            this.name = builder.name;
            this.parts = builder.parts;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Artifact create() {
            return builder().build();
        }

        /**
         * @return artifactId
         */
        public String getArtifactId() {
            return this.artifactId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return extensions
         */
        public java.util.List<String> getExtensions() {
            return this.extensions;
        }

        /**
         * @return metadata
         */
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return parts
         */
        public java.util.List<ArtifactParts> getParts() {
            return this.parts;
        }

        public static final class Builder {
            private String artifactId; 
            private String description; 
            private java.util.List<String> extensions; 
            private java.util.Map<String, ?> metadata; 
            private String name; 
            private java.util.List<ArtifactParts> parts; 

            private Builder() {
            } 

            private Builder(Artifact model) {
                this.artifactId = model.artifactId;
                this.description = model.description;
                this.extensions = model.extensions;
                this.metadata = model.metadata;
                this.name = model.name;
                this.parts = model.parts;
            } 

            /**
             * ArtifactId.
             */
            public Builder artifactId(String artifactId) {
                this.artifactId = artifactId;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Extensions.
             */
            public Builder extensions(java.util.List<String> extensions) {
                this.extensions = extensions;
                return this;
            }

            /**
             * Metadata.
             */
            public Builder metadata(java.util.Map<String, ?> metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Parts.
             */
            public Builder parts(java.util.List<ArtifactParts> parts) {
                this.parts = parts;
                return this;
            }

            public Artifact build() {
                return new Artifact(this);
            } 

        } 

    }
    /**
     * 
     * {@link SendNapalStreamMessageResponseBody} extends {@link TeaModel}
     *
     * <p>SendNapalStreamMessageResponseBody</p>
     */
    public static class TaskArtifactUpdate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Append")
        private Boolean append;

        @com.aliyun.core.annotation.NameInMap("Artifact")
        private Artifact artifact;

        @com.aliyun.core.annotation.NameInMap("ContextId")
        private String contextId;

        @com.aliyun.core.annotation.NameInMap("LastChunk")
        private Boolean lastChunk;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private TaskArtifactUpdate(Builder builder) {
            this.append = builder.append;
            this.artifact = builder.artifact;
            this.contextId = builder.contextId;
            this.lastChunk = builder.lastChunk;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskArtifactUpdate create() {
            return builder().build();
        }

        /**
         * @return append
         */
        public Boolean getAppend() {
            return this.append;
        }

        /**
         * @return artifact
         */
        public Artifact getArtifact() {
            return this.artifact;
        }

        /**
         * @return contextId
         */
        public String getContextId() {
            return this.contextId;
        }

        /**
         * @return lastChunk
         */
        public Boolean getLastChunk() {
            return this.lastChunk;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private Boolean append; 
            private Artifact artifact; 
            private String contextId; 
            private Boolean lastChunk; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(TaskArtifactUpdate model) {
                this.append = model.append;
                this.artifact = model.artifact;
                this.contextId = model.contextId;
                this.lastChunk = model.lastChunk;
                this.taskId = model.taskId;
            } 

            /**
             * Append.
             */
            public Builder append(Boolean append) {
                this.append = append;
                return this;
            }

            /**
             * Artifact.
             */
            public Builder artifact(Artifact artifact) {
                this.artifact = artifact;
                return this;
            }

            /**
             * ContextId.
             */
            public Builder contextId(String contextId) {
                this.contextId = contextId;
                return this;
            }

            /**
             * LastChunk.
             */
            public Builder lastChunk(Boolean lastChunk) {
                this.lastChunk = lastChunk;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public TaskArtifactUpdate build() {
                return new TaskArtifactUpdate(this);
            } 

        } 

    }
    /**
     * 
     * {@link SendNapalStreamMessageResponseBody} extends {@link TeaModel}
     *
     * <p>SendNapalStreamMessageResponseBody</p>
     */
    public static class Step extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CostTime")
        private Long costTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("IsError")
        private Boolean isError;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Params")
        private Object params;

        @com.aliyun.core.annotation.NameInMap("Result")
        private Object result;

        @com.aliyun.core.annotation.NameInMap("RetryCount")
        private Long retryCount;

        @com.aliyun.core.annotation.NameInMap("UiContent")
        private String uiContent;

        private Step(Builder builder) {
            this.costTime = builder.costTime;
            this.id = builder.id;
            this.isError = builder.isError;
            this.name = builder.name;
            this.params = builder.params;
            this.result = builder.result;
            this.retryCount = builder.retryCount;
            this.uiContent = builder.uiContent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Step create() {
            return builder().build();
        }

        /**
         * @return costTime
         */
        public Long getCostTime() {
            return this.costTime;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return isError
         */
        public Boolean getIsError() {
            return this.isError;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return params
         */
        public Object getParams() {
            return this.params;
        }

        /**
         * @return result
         */
        public Object getResult() {
            return this.result;
        }

        /**
         * @return retryCount
         */
        public Long getRetryCount() {
            return this.retryCount;
        }

        /**
         * @return uiContent
         */
        public String getUiContent() {
            return this.uiContent;
        }

        public static final class Builder {
            private Long costTime; 
            private String id; 
            private Boolean isError; 
            private String name; 
            private Object params; 
            private Object result; 
            private Long retryCount; 
            private String uiContent; 

            private Builder() {
            } 

            private Builder(Step model) {
                this.costTime = model.costTime;
                this.id = model.id;
                this.isError = model.isError;
                this.name = model.name;
                this.params = model.params;
                this.result = model.result;
                this.retryCount = model.retryCount;
                this.uiContent = model.uiContent;
            } 

            /**
             * CostTime.
             */
            public Builder costTime(Long costTime) {
                this.costTime = costTime;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * IsError.
             */
            public Builder isError(Boolean isError) {
                this.isError = isError;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Params.
             */
            public Builder params(Object params) {
                this.params = params;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(Object result) {
                this.result = result;
                return this;
            }

            /**
             * RetryCount.
             */
            public Builder retryCount(Long retryCount) {
                this.retryCount = retryCount;
                return this;
            }

            /**
             * UiContent.
             */
            public Builder uiContent(String uiContent) {
                this.uiContent = uiContent;
                return this;
            }

            public Step build() {
                return new Step(this);
            } 

        } 

    }
    /**
     * 
     * {@link SendNapalStreamMessageResponseBody} extends {@link TeaModel}
     *
     * <p>SendNapalStreamMessageResponseBody</p>
     */
    public static class Metadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Step")
        private Step step;

        private Metadata(Builder builder) {
            this.step = builder.step;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Metadata create() {
            return builder().build();
        }

        /**
         * @return step
         */
        public Step getStep() {
            return this.step;
        }

        public static final class Builder {
            private Step step; 

            private Builder() {
            } 

            private Builder(Metadata model) {
                this.step = model.step;
            } 

            /**
             * Step.
             */
            public Builder step(Step step) {
                this.step = step;
                return this;
            }

            public Metadata build() {
                return new Metadata(this);
            } 

        } 

    }
    /**
     * 
     * {@link SendNapalStreamMessageResponseBody} extends {@link TeaModel}
     *
     * <p>SendNapalStreamMessageResponseBody</p>
     */
    public static class StatusMessageParts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private Object data;

        @com.aliyun.core.annotation.NameInMap("Filename")
        private String filename;

        @com.aliyun.core.annotation.NameInMap("MediaType")
        private String mediaType;

        @com.aliyun.core.annotation.NameInMap("Raw")
        private String raw;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private StatusMessageParts(Builder builder) {
            this.data = builder.data;
            this.filename = builder.filename;
            this.mediaType = builder.mediaType;
            this.raw = builder.raw;
            this.text = builder.text;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StatusMessageParts create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public Object getData() {
            return this.data;
        }

        /**
         * @return filename
         */
        public String getFilename() {
            return this.filename;
        }

        /**
         * @return mediaType
         */
        public String getMediaType() {
            return this.mediaType;
        }

        /**
         * @return raw
         */
        public String getRaw() {
            return this.raw;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private Object data; 
            private String filename; 
            private String mediaType; 
            private String raw; 
            private String text; 
            private String url; 

            private Builder() {
            } 

            private Builder(StatusMessageParts model) {
                this.data = model.data;
                this.filename = model.filename;
                this.mediaType = model.mediaType;
                this.raw = model.raw;
                this.text = model.text;
                this.url = model.url;
            } 

            /**
             * Data.
             */
            public Builder data(Object data) {
                this.data = data;
                return this;
            }

            /**
             * Filename.
             */
            public Builder filename(String filename) {
                this.filename = filename;
                return this;
            }

            /**
             * MediaType.
             */
            public Builder mediaType(String mediaType) {
                this.mediaType = mediaType;
                return this;
            }

            /**
             * Raw.
             */
            public Builder raw(String raw) {
                this.raw = raw;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public StatusMessageParts build() {
                return new StatusMessageParts(this);
            } 

        } 

    }
    /**
     * 
     * {@link SendNapalStreamMessageResponseBody} extends {@link TeaModel}
     *
     * <p>SendNapalStreamMessageResponseBody</p>
     */
    public static class TaskStatusUpdateStatusMessage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MessageId")
        private String messageId;

        @com.aliyun.core.annotation.NameInMap("Parts")
        private java.util.List<StatusMessageParts> parts;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        private TaskStatusUpdateStatusMessage(Builder builder) {
            this.messageId = builder.messageId;
            this.parts = builder.parts;
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskStatusUpdateStatusMessage create() {
            return builder().build();
        }

        /**
         * @return messageId
         */
        public String getMessageId() {
            return this.messageId;
        }

        /**
         * @return parts
         */
        public java.util.List<StatusMessageParts> getParts() {
            return this.parts;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        public static final class Builder {
            private String messageId; 
            private java.util.List<StatusMessageParts> parts; 
            private String role; 

            private Builder() {
            } 

            private Builder(TaskStatusUpdateStatusMessage model) {
                this.messageId = model.messageId;
                this.parts = model.parts;
                this.role = model.role;
            } 

            /**
             * MessageId.
             */
            public Builder messageId(String messageId) {
                this.messageId = messageId;
                return this;
            }

            /**
             * Parts.
             */
            public Builder parts(java.util.List<StatusMessageParts> parts) {
                this.parts = parts;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            public TaskStatusUpdateStatusMessage build() {
                return new TaskStatusUpdateStatusMessage(this);
            } 

        } 

    }
    /**
     * 
     * {@link SendNapalStreamMessageResponseBody} extends {@link TeaModel}
     *
     * <p>SendNapalStreamMessageResponseBody</p>
     */
    public static class TaskStatusUpdateStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Message")
        private TaskStatusUpdateStatusMessage message;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private String timestamp;

        private TaskStatusUpdateStatus(Builder builder) {
            this.message = builder.message;
            this.state = builder.state;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskStatusUpdateStatus create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public TaskStatusUpdateStatusMessage getMessage() {
            return this.message;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private TaskStatusUpdateStatusMessage message; 
            private String state; 
            private String timestamp; 

            private Builder() {
            } 

            private Builder(TaskStatusUpdateStatus model) {
                this.message = model.message;
                this.state = model.state;
                this.timestamp = model.timestamp;
            } 

            /**
             * Message.
             */
            public Builder message(TaskStatusUpdateStatusMessage message) {
                this.message = message;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public TaskStatusUpdateStatus build() {
                return new TaskStatusUpdateStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link SendNapalStreamMessageResponseBody} extends {@link TeaModel}
     *
     * <p>SendNapalStreamMessageResponseBody</p>
     */
    public static class TaskStatusUpdate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContextId")
        private String contextId;

        @com.aliyun.core.annotation.NameInMap("Final")
        private Boolean _final;

        @com.aliyun.core.annotation.NameInMap("Metadata")
        private Metadata metadata;

        @com.aliyun.core.annotation.NameInMap("Status")
        private TaskStatusUpdateStatus status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private TaskStatusUpdate(Builder builder) {
            this.contextId = builder.contextId;
            this._final = builder._final;
            this.metadata = builder.metadata;
            this.status = builder.status;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskStatusUpdate create() {
            return builder().build();
        }

        /**
         * @return contextId
         */
        public String getContextId() {
            return this.contextId;
        }

        /**
         * @return _final
         */
        public Boolean get_final() {
            return this._final;
        }

        /**
         * @return metadata
         */
        public Metadata getMetadata() {
            return this.metadata;
        }

        /**
         * @return status
         */
        public TaskStatusUpdateStatus getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String contextId; 
            private Boolean _final; 
            private Metadata metadata; 
            private TaskStatusUpdateStatus status; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(TaskStatusUpdate model) {
                this.contextId = model.contextId;
                this._final = model._final;
                this.metadata = model.metadata;
                this.status = model.status;
                this.taskId = model.taskId;
            } 

            /**
             * ContextId.
             */
            public Builder contextId(String contextId) {
                this.contextId = contextId;
                return this;
            }

            /**
             * Final.
             */
            public Builder _final(Boolean _final) {
                this._final = _final;
                return this;
            }

            /**
             * Metadata.
             */
            public Builder metadata(Metadata metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(TaskStatusUpdateStatus status) {
                this.status = status;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public TaskStatusUpdate build() {
                return new TaskStatusUpdate(this);
            } 

        } 

    }
}
