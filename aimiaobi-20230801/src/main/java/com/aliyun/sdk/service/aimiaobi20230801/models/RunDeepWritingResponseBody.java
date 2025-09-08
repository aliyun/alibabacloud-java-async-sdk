// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link RunDeepWritingResponseBody} extends {@link TeaModel}
 *
 * <p>RunDeepWritingResponseBody</p>
 */
public class RunDeepWritingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Header")
    private RunDeepWritingResponseBodyHeader header;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private String httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Payload")
    private Payload payload;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private RunDeepWritingResponseBody(Builder builder) {
        this.code = builder.code;
        this.header = builder.header;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.payload = builder.payload;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunDeepWritingResponseBody create() {
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
     * @return header
     */
    public RunDeepWritingResponseBodyHeader getHeader() {
        return this.header;
    }

    /**
     * @return httpStatusCode
     */
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return payload
     */
    public Payload getPayload() {
        return this.payload;
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
        private RunDeepWritingResponseBodyHeader header; 
        private String httpStatusCode; 
        private String message; 
        private Payload payload; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(RunDeepWritingResponseBody model) {
            this.code = model.code;
            this.header = model.header;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.payload = model.payload;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Header.
         */
        public Builder header(RunDeepWritingResponseBodyHeader header) {
            this.header = header;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * Payload.
         */
        public Builder payload(Payload payload) {
            this.payload = payload;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public RunDeepWritingResponseBody build() {
            return new RunDeepWritingResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RunDeepWritingResponseBody} extends {@link TeaModel}
     *
     * <p>RunDeepWritingResponseBody</p>
     */
    public static class RunDeepWritingResponseBodyHeader extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Event")
        private String event;

        @com.aliyun.core.annotation.NameInMap("SessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("StatusCode")
        private Integer statusCode;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TraceId")
        private String traceId;

        private RunDeepWritingResponseBodyHeader(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.event = builder.event;
            this.sessionId = builder.sessionId;
            this.statusCode = builder.statusCode;
            this.taskId = builder.taskId;
            this.traceId = builder.traceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RunDeepWritingResponseBodyHeader create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return event
         */
        public String getEvent() {
            return this.event;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return statusCode
         */
        public Integer getStatusCode() {
            return this.statusCode;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return traceId
         */
        public String getTraceId() {
            return this.traceId;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorMessage; 
            private String event; 
            private String sessionId; 
            private Integer statusCode; 
            private String taskId; 
            private String traceId; 

            private Builder() {
            } 

            private Builder(RunDeepWritingResponseBodyHeader model) {
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.event = model.event;
                this.sessionId = model.sessionId;
                this.statusCode = model.statusCode;
                this.taskId = model.taskId;
                this.traceId = model.traceId;
            } 

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * Event.
             */
            public Builder event(String event) {
                this.event = event;
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
             * StatusCode.
             */
            public Builder statusCode(Integer statusCode) {
                this.statusCode = statusCode;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TraceId.
             */
            public Builder traceId(String traceId) {
                this.traceId = traceId;
                return this;
            }

            public RunDeepWritingResponseBodyHeader build() {
                return new RunDeepWritingResponseBodyHeader(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunDeepWritingResponseBody} extends {@link TeaModel}
     *
     * <p>RunDeepWritingResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Content(Builder builder) {
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
            private String text; 
            private String type; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.text = model.text;
                this.type = model.type;
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
     * {@link RunDeepWritingResponseBody} extends {@link TeaModel}
     *
     * <p>RunDeepWritingResponseBody</p>
     */
    public static class Item extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Agent")
        private String agent;

        @com.aliyun.core.annotation.NameInMap("Arguments")
        private String arguments;

        @com.aliyun.core.annotation.NameInMap("Content")
        private java.util.List<Content> content;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Item(Builder builder) {
            this.agent = builder.agent;
            this.arguments = builder.arguments;
            this.content = builder.content;
            this.id = builder.id;
            this.name = builder.name;
            this.result = builder.result;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Item create() {
            return builder().build();
        }

        /**
         * @return agent
         */
        public String getAgent() {
            return this.agent;
        }

        /**
         * @return arguments
         */
        public String getArguments() {
            return this.arguments;
        }

        /**
         * @return content
         */
        public java.util.List<Content> getContent() {
            return this.content;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String agent; 
            private String arguments; 
            private java.util.List<Content> content; 
            private String id; 
            private String name; 
            private String result; 
            private String status; 
            private String type; 

            private Builder() {
            } 

            private Builder(Item model) {
                this.agent = model.agent;
                this.arguments = model.arguments;
                this.content = model.content;
                this.id = model.id;
                this.name = model.name;
                this.result = model.result;
                this.status = model.status;
                this.type = model.type;
            } 

            /**
             * Agent.
             */
            public Builder agent(String agent) {
                this.agent = agent;
                return this;
            }

            /**
             * Arguments.
             */
            public Builder arguments(String arguments) {
                this.arguments = arguments;
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
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
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
             * Result.
             */
            public Builder result(String result) {
                this.result = result;
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
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Item build() {
                return new Item(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunDeepWritingResponseBody} extends {@link TeaModel}
     *
     * <p>RunDeepWritingResponseBody</p>
     */
    public static class Response extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Response(Builder builder) {
            this.id = builder.id;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Response create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String id; 
            private String status; 

            private Builder() {
            } 

            private Builder(Response model) {
                this.id = model.id;
                this.status = model.status;
            } 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Response build() {
                return new Response(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunDeepWritingResponseBody} extends {@link TeaModel}
     *
     * <p>RunDeepWritingResponseBody</p>
     */
    public static class Output extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Item")
        private Item item;

        @com.aliyun.core.annotation.NameInMap("OutputIndex")
        private Integer outputIndex;

        @com.aliyun.core.annotation.NameInMap("Response")
        private Response response;

        @com.aliyun.core.annotation.NameInMap("SequenceNumber")
        private String sequenceNumber;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Output(Builder builder) {
            this.item = builder.item;
            this.outputIndex = builder.outputIndex;
            this.response = builder.response;
            this.sequenceNumber = builder.sequenceNumber;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Output create() {
            return builder().build();
        }

        /**
         * @return item
         */
        public Item getItem() {
            return this.item;
        }

        /**
         * @return outputIndex
         */
        public Integer getOutputIndex() {
            return this.outputIndex;
        }

        /**
         * @return response
         */
        public Response getResponse() {
            return this.response;
        }

        /**
         * @return sequenceNumber
         */
        public String getSequenceNumber() {
            return this.sequenceNumber;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Item item; 
            private Integer outputIndex; 
            private Response response; 
            private String sequenceNumber; 
            private String type; 

            private Builder() {
            } 

            private Builder(Output model) {
                this.item = model.item;
                this.outputIndex = model.outputIndex;
                this.response = model.response;
                this.sequenceNumber = model.sequenceNumber;
                this.type = model.type;
            } 

            /**
             * Item.
             */
            public Builder item(Item item) {
                this.item = item;
                return this;
            }

            /**
             * OutputIndex.
             */
            public Builder outputIndex(Integer outputIndex) {
                this.outputIndex = outputIndex;
                return this;
            }

            /**
             * Response.
             */
            public Builder response(Response response) {
                this.response = response;
                return this;
            }

            /**
             * SequenceNumber.
             */
            public Builder sequenceNumber(String sequenceNumber) {
                this.sequenceNumber = sequenceNumber;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Output build() {
                return new Output(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunDeepWritingResponseBody} extends {@link TeaModel}
     *
     * <p>RunDeepWritingResponseBody</p>
     */
    public static class Payload extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Output")
        private Output output;

        private Payload(Builder builder) {
            this.output = builder.output;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Payload create() {
            return builder().build();
        }

        /**
         * @return output
         */
        public Output getOutput() {
            return this.output;
        }

        public static final class Builder {
            private Output output; 

            private Builder() {
            } 

            private Builder(Payload model) {
                this.output = model.output;
            } 

            /**
             * Output.
             */
            public Builder output(Output output) {
                this.output = output;
                return this;
            }

            public Payload build() {
                return new Payload(this);
            } 

        } 

    }
}
