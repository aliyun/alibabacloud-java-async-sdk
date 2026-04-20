// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adbai20250812.models;

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
 * {@link DescribeChatMessageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeChatMessageResponseBody</p>
 */
public class DescribeChatMessageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CompletedAt")
    private String completedAt;

    @com.aliyun.core.annotation.NameInMap("Content")
    private java.util.List<Content> content;

    @com.aliyun.core.annotation.NameInMap("CreatedAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Delta")
    private Boolean delta;

    @com.aliyun.core.annotation.NameInMap("Error")
    private String error;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("Index")
    private Long index;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("MsgId")
    private String msgId;

    @com.aliyun.core.annotation.NameInMap("Object")
    private String object;

    @com.aliyun.core.annotation.NameInMap("Output")
    private String output;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Role")
    private String role;

    @com.aliyun.core.annotation.NameInMap("SequenceNumber")
    private Long sequenceNumber;

    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Text")
    private String text;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private DescribeChatMessageResponseBody(Builder builder) {
        this.code = builder.code;
        this.completedAt = builder.completedAt;
        this.content = builder.content;
        this.createdAt = builder.createdAt;
        this.data = builder.data;
        this.delta = builder.delta;
        this.error = builder.error;
        this.id = builder.id;
        this.index = builder.index;
        this.message = builder.message;
        this.msgId = builder.msgId;
        this.object = builder.object;
        this.output = builder.output;
        this.requestId = builder.requestId;
        this.role = builder.role;
        this.sequenceNumber = builder.sequenceNumber;
        this.sessionId = builder.sessionId;
        this.status = builder.status;
        this.text = builder.text;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeChatMessageResponseBody create() {
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
     * @return completedAt
     */
    public String getCompletedAt() {
        return this.completedAt;
    }

    /**
     * @return content
     */
    public java.util.List<Content> getContent() {
        return this.content;
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return delta
     */
    public Boolean getDelta() {
        return this.delta;
    }

    /**
     * @return error
     */
    public String getError() {
        return this.error;
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

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return msgId
     */
    public String getMsgId() {
        return this.msgId;
    }

    /**
     * @return object
     */
    public String getObject() {
        return this.object;
    }

    /**
     * @return output
     */
    public String getOutput() {
        return this.output;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return role
     */
    public String getRole() {
        return this.role;
    }

    /**
     * @return sequenceNumber
     */
    public Long getSequenceNumber() {
        return this.sequenceNumber;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return text
     */
    public String getText() {
        return this.text;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String code; 
        private String completedAt; 
        private java.util.List<Content> content; 
        private String createdAt; 
        private Data data; 
        private Boolean delta; 
        private String error; 
        private String id; 
        private Long index; 
        private String message; 
        private String msgId; 
        private String object; 
        private String output; 
        private String requestId; 
        private String role; 
        private Long sequenceNumber; 
        private String sessionId; 
        private String status; 
        private String text; 
        private String type; 

        private Builder() {
        } 

        private Builder(DescribeChatMessageResponseBody model) {
            this.code = model.code;
            this.completedAt = model.completedAt;
            this.content = model.content;
            this.createdAt = model.createdAt;
            this.data = model.data;
            this.delta = model.delta;
            this.error = model.error;
            this.id = model.id;
            this.index = model.index;
            this.message = model.message;
            this.msgId = model.msgId;
            this.object = model.object;
            this.output = model.output;
            this.requestId = model.requestId;
            this.role = model.role;
            this.sequenceNumber = model.sequenceNumber;
            this.sessionId = model.sessionId;
            this.status = model.status;
            this.text = model.text;
            this.type = model.type;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * CompletedAt.
         */
        public Builder completedAt(String completedAt) {
            this.completedAt = completedAt;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(java.util.List<Content> content) {
            this.content = content;
            return this;
        }

        /**
         * CreatedAt.
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Delta.
         */
        public Builder delta(Boolean delta) {
            this.delta = delta;
            return this;
        }

        /**
         * Error.
         */
        public Builder error(String error) {
            this.error = error;
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
         * Index.
         */
        public Builder index(Long index) {
            this.index = index;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * MsgId.
         */
        public Builder msgId(String msgId) {
            this.msgId = msgId;
            return this;
        }

        /**
         * Object.
         */
        public Builder object(String object) {
            this.object = object;
            return this;
        }

        /**
         * Output.
         */
        public Builder output(String output) {
            this.output = output;
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
         * Role.
         */
        public Builder role(String role) {
            this.role = role;
            return this;
        }

        /**
         * SequenceNumber.
         */
        public Builder sequenceNumber(Long sequenceNumber) {
            this.sequenceNumber = sequenceNumber;
            return this;
        }

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
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
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public DescribeChatMessageResponseBody build() {
            return new DescribeChatMessageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeChatMessageResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeChatMessageResponseBody</p>
     */
    public static class ContentData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallId")
        private String callId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Output")
        private String output;

        private ContentData(Builder builder) {
            this.callId = builder.callId;
            this.name = builder.name;
            this.output = builder.output;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContentData create() {
            return builder().build();
        }

        /**
         * @return callId
         */
        public String getCallId() {
            return this.callId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return output
         */
        public String getOutput() {
            return this.output;
        }

        public static final class Builder {
            private String callId; 
            private String name; 
            private String output; 

            private Builder() {
            } 

            private Builder(ContentData model) {
                this.callId = model.callId;
                this.name = model.name;
                this.output = model.output;
            } 

            /**
             * CallId.
             */
            public Builder callId(String callId) {
                this.callId = callId;
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
             * Output.
             */
            public Builder output(String output) {
                this.output = output;
                return this;
            }

            public ContentData build() {
                return new ContentData(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeChatMessageResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeChatMessageResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private ContentData data;

        @com.aliyun.core.annotation.NameInMap("Delta")
        private Boolean delta;

        @com.aliyun.core.annotation.NameInMap("Error")
        private String error;

        @com.aliyun.core.annotation.NameInMap("Index")
        private Long index;

        @com.aliyun.core.annotation.NameInMap("MsgId")
        private String msgId;

        @com.aliyun.core.annotation.NameInMap("Object")
        private String object;

        @com.aliyun.core.annotation.NameInMap("SequenceNumber")
        private Long sequenceNumber;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Content(Builder builder) {
            this.data = builder.data;
            this.delta = builder.delta;
            this.error = builder.error;
            this.index = builder.index;
            this.msgId = builder.msgId;
            this.object = builder.object;
            this.sequenceNumber = builder.sequenceNumber;
            this.status = builder.status;
            this.text = builder.text;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public ContentData getData() {
            return this.data;
        }

        /**
         * @return delta
         */
        public Boolean getDelta() {
            return this.delta;
        }

        /**
         * @return error
         */
        public String getError() {
            return this.error;
        }

        /**
         * @return index
         */
        public Long getIndex() {
            return this.index;
        }

        /**
         * @return msgId
         */
        public String getMsgId() {
            return this.msgId;
        }

        /**
         * @return object
         */
        public String getObject() {
            return this.object;
        }

        /**
         * @return sequenceNumber
         */
        public Long getSequenceNumber() {
            return this.sequenceNumber;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private ContentData data; 
            private Boolean delta; 
            private String error; 
            private Long index; 
            private String msgId; 
            private String object; 
            private Long sequenceNumber; 
            private String status; 
            private String text; 
            private String type; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.data = model.data;
                this.delta = model.delta;
                this.error = model.error;
                this.index = model.index;
                this.msgId = model.msgId;
                this.object = model.object;
                this.sequenceNumber = model.sequenceNumber;
                this.status = model.status;
                this.text = model.text;
                this.type = model.type;
            } 

            /**
             * Data.
             */
            public Builder data(ContentData data) {
                this.data = data;
                return this;
            }

            /**
             * Delta.
             */
            public Builder delta(Boolean delta) {
                this.delta = delta;
                return this;
            }

            /**
             * Error.
             */
            public Builder error(String error) {
                this.error = error;
                return this;
            }

            /**
             * Index.
             */
            public Builder index(Long index) {
                this.index = index;
                return this;
            }

            /**
             * MsgId.
             */
            public Builder msgId(String msgId) {
                this.msgId = msgId;
                return this;
            }

            /**
             * Object.
             */
            public Builder object(String object) {
                this.object = object;
                return this;
            }

            /**
             * SequenceNumber.
             */
            public Builder sequenceNumber(Long sequenceNumber) {
                this.sequenceNumber = sequenceNumber;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
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
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeChatMessageResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeChatMessageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Arguments")
        private String arguments;

        @com.aliyun.core.annotation.NameInMap("CallId")
        private String callId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Output")
        private String output;

        private Data(Builder builder) {
            this.arguments = builder.arguments;
            this.callId = builder.callId;
            this.name = builder.name;
            this.output = builder.output;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return arguments
         */
        public String getArguments() {
            return this.arguments;
        }

        /**
         * @return callId
         */
        public String getCallId() {
            return this.callId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return output
         */
        public String getOutput() {
            return this.output;
        }

        public static final class Builder {
            private String arguments; 
            private String callId; 
            private String name; 
            private String output; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.arguments = model.arguments;
                this.callId = model.callId;
                this.name = model.name;
                this.output = model.output;
            } 

            /**
             * Arguments.
             */
            public Builder arguments(String arguments) {
                this.arguments = arguments;
                return this;
            }

            /**
             * CallId.
             */
            public Builder callId(String callId) {
                this.callId = callId;
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
             * Output.
             */
            public Builder output(String output) {
                this.output = output;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
