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
 * {@link SendNapalStreamMessageRequest} extends {@link RequestModel}
 *
 * <p>SendNapalStreamMessageRequest</p>
 */
public class SendNapalStreamMessageRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Configuration")
    private Configuration configuration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Message")
    private Message message;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Metadata")
    private java.util.Map<String, String> metadata;

    private SendNapalStreamMessageRequest(Builder builder) {
        super(builder);
        this.configuration = builder.configuration;
        this.message = builder.message;
        this.metadata = builder.metadata;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendNapalStreamMessageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configuration
     */
    public Configuration getConfiguration() {
        return this.configuration;
    }

    /**
     * @return message
     */
    public Message getMessage() {
        return this.message;
    }

    /**
     * @return metadata
     */
    public java.util.Map<String, String> getMetadata() {
        return this.metadata;
    }

    public static final class Builder extends Request.Builder<SendNapalStreamMessageRequest, Builder> {
        private Configuration configuration; 
        private Message message; 
        private java.util.Map<String, String> metadata; 

        private Builder() {
            super();
        } 

        private Builder(SendNapalStreamMessageRequest request) {
            super(request);
            this.configuration = request.configuration;
            this.message = request.message;
            this.metadata = request.metadata;
        } 

        /**
         * Configuration.
         */
        public Builder configuration(Configuration configuration) {
            String configurationShrink = shrink(configuration, "Configuration", "json");
            this.putBodyParameter("Configuration", configurationShrink);
            this.configuration = configuration;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(Message message) {
            String messageShrink = shrink(message, "Message", "json");
            this.putBodyParameter("Message", messageShrink);
            this.message = message;
            return this;
        }

        /**
         * Metadata.
         */
        public Builder metadata(java.util.Map<String, String> metadata) {
            String metadataShrink = shrink(metadata, "Metadata", "json");
            this.putBodyParameter("Metadata", metadataShrink);
            this.metadata = metadata;
            return this;
        }

        @Override
        public SendNapalStreamMessageRequest build() {
            return new SendNapalStreamMessageRequest(this);
        } 

    } 

    /**
     * 
     * {@link SendNapalStreamMessageRequest} extends {@link TeaModel}
     *
     * <p>SendNapalStreamMessageRequest</p>
     */
    public static class Configuration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AcceptedOutputModes")
        private java.util.List<String> acceptedOutputModes;

        @com.aliyun.core.annotation.NameInMap("HistoryLength")
        private Integer historyLength;

        @com.aliyun.core.annotation.NameInMap("ReturnImmediately")
        private Boolean returnImmediately;

        private Configuration(Builder builder) {
            this.acceptedOutputModes = builder.acceptedOutputModes;
            this.historyLength = builder.historyLength;
            this.returnImmediately = builder.returnImmediately;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Configuration create() {
            return builder().build();
        }

        /**
         * @return acceptedOutputModes
         */
        public java.util.List<String> getAcceptedOutputModes() {
            return this.acceptedOutputModes;
        }

        /**
         * @return historyLength
         */
        public Integer getHistoryLength() {
            return this.historyLength;
        }

        /**
         * @return returnImmediately
         */
        public Boolean getReturnImmediately() {
            return this.returnImmediately;
        }

        public static final class Builder {
            private java.util.List<String> acceptedOutputModes; 
            private Integer historyLength; 
            private Boolean returnImmediately; 

            private Builder() {
            } 

            private Builder(Configuration model) {
                this.acceptedOutputModes = model.acceptedOutputModes;
                this.historyLength = model.historyLength;
                this.returnImmediately = model.returnImmediately;
            } 

            /**
             * AcceptedOutputModes.
             */
            public Builder acceptedOutputModes(java.util.List<String> acceptedOutputModes) {
                this.acceptedOutputModes = acceptedOutputModes;
                return this;
            }

            /**
             * HistoryLength.
             */
            public Builder historyLength(Integer historyLength) {
                this.historyLength = historyLength;
                return this;
            }

            /**
             * ReturnImmediately.
             */
            public Builder returnImmediately(Boolean returnImmediately) {
                this.returnImmediately = returnImmediately;
                return this;
            }

            public Configuration build() {
                return new Configuration(this);
            } 

        } 

    }
    /**
     * 
     * {@link SendNapalStreamMessageRequest} extends {@link TeaModel}
     *
     * <p>SendNapalStreamMessageRequest</p>
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
     * {@link SendNapalStreamMessageRequest} extends {@link TeaModel}
     *
     * <p>SendNapalStreamMessageRequest</p>
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
}
