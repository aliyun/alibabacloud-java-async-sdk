// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link PromptAgentSessionResponseBody} extends {@link TeaModel}
 *
 * <p>PromptAgentSessionResponseBody</p>
 */
public class PromptAgentSessionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Error")
    private Object error;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("Jsonrpc")
    private String jsonrpc;

    @com.aliyun.core.annotation.NameInMap("Meta")
    private Meta meta;

    @com.aliyun.core.annotation.NameInMap("Method")
    private String method;

    @com.aliyun.core.annotation.NameInMap("Params")
    private Object params;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Object result;

    @com.aliyun.core.annotation.NameInMap("Timestamp")
    private Long timestamp;

    private PromptAgentSessionResponseBody(Builder builder) {
        this.error = builder.error;
        this.id = builder.id;
        this.jsonrpc = builder.jsonrpc;
        this.meta = builder.meta;
        this.method = builder.method;
        this.params = builder.params;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.timestamp = builder.timestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PromptAgentSessionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return error
     */
    public Object getError() {
        return this.error;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return jsonrpc
     */
    public String getJsonrpc() {
        return this.jsonrpc;
    }

    /**
     * @return meta
     */
    public Meta getMeta() {
        return this.meta;
    }

    /**
     * @return method
     */
    public String getMethod() {
        return this.method;
    }

    /**
     * @return params
     */
    public Object getParams() {
        return this.params;
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
    public Object getResult() {
        return this.result;
    }

    /**
     * @return timestamp
     */
    public Long getTimestamp() {
        return this.timestamp;
    }

    public static final class Builder {
        private Object error; 
        private String id; 
        private String jsonrpc; 
        private Meta meta; 
        private String method; 
        private Object params; 
        private String requestId; 
        private Object result; 
        private Long timestamp; 

        private Builder() {
        } 

        private Builder(PromptAgentSessionResponseBody model) {
            this.error = model.error;
            this.id = model.id;
            this.jsonrpc = model.jsonrpc;
            this.meta = model.meta;
            this.method = model.method;
            this.params = model.params;
            this.requestId = model.requestId;
            this.result = model.result;
            this.timestamp = model.timestamp;
        } 

        /**
         * <p>The error message in the SSE frame. The returned content complies with the open-source Agent Client Protocol (ACP) specification. For more information, see <a href="https://agentclientprotocol.com/protocol/prompt-turn">https://agentclientprotocol.com/protocol/prompt-turn</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;code&quot;: 400, &quot;errorCode&quot;: &quot;0x50000000001&quot;, &quot;message&quot;: &quot;not exist session&quot;, &quot;data&quot;: null}</p>
         */
        public Builder error(Object error) {
            this.error = error;
            return this;
        }

        /**
         * <p>The ID passed by the requester. The value is returned as is.</p>
         * 
         * <strong>example:</strong>
         * <p>631478864897630XXXX</p>
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The JSON-RPC version. Set the value to 2.0.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        public Builder jsonrpc(String jsonrpc) {
            this.jsonrpc = jsonrpc;
            return this;
        }

        /**
         * <p>Carried only by verified native events. The client saves the EventCursor after fully applying the event, and uses EventId and EventEpoch to resume the subscription to GetAgentSessionEvents after a disconnection. Common subscription errors do not contain proof of the native execution terminal state.</p>
         */
        public Builder meta(Meta meta) {
            this.meta = meta;
            return this;
        }

        /**
         * <p>The method of the SSE. The returned content complies with the open-source Agent Client Protocol (ACP) specification. For more information, see <a href="https://agentclientprotocol.com/protocol/prompt-turn">https://agentclientprotocol.com/protocol/prompt-turn</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>session/update</p>
         */
        public Builder method(String method) {
            this.method = method;
            return this;
        }

        /**
         * <p>The params of the SSE. The returned content complies with the open-source Agent Client Protocol (ACP) specification. For more information, see <a href="https://agentclientprotocol.com/protocol/prompt-turn">https://agentclientprotocol.com/protocol/prompt-turn</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;sessionId&quot;:&quot;af4f5ef8-e8f5-481c-ad1f-94886c6c0aed&quot;,&quot;update&quot;:{&quot;sessionUpdate&quot;:&quot;agent_message_chunk&quot;,&quot;content&quot;:{&quot;type&quot;:&quot;text&quot;,&quot;text&quot;:&quot;hello world&quot;}}}</p>
         */
        public Builder params(Object params) {
            this.params = params;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>D5D70885-7CC7-594A-80C7-2EF1B00FFB4B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The result set of the SSE frame. The returned content complies with the open-source Agent Client Protocol (ACP) specification. For more information, see <a href="https://agentclientprotocol.com/protocol/prompt-turn">https://agentclientprotocol.com/protocol/prompt-turn</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;stopReason&quot;:&quot;end_turn&quot;}</p>
         */
        public Builder result(Object result) {
            this.result = result;
            return this;
        }

        /**
         * <p>The timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1747447032</p>
         */
        public Builder timestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public PromptAgentSessionResponseBody build() {
            return new PromptAgentSessionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PromptAgentSessionResponseBody} extends {@link TeaModel}
     *
     * <p>PromptAgentSessionResponseBody</p>
     */
    public static class EventCursor extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventEpoch")
        private String eventEpoch;

        @com.aliyun.core.annotation.NameInMap("EventId")
        private String eventId;

        @com.aliyun.core.annotation.NameInMap("EventType")
        private String eventType;

        @com.aliyun.core.annotation.NameInMap("PromptId")
        private String promptId;

        @com.aliyun.core.annotation.NameInMap("SessionId")
        private String sessionId;

        private EventCursor(Builder builder) {
            this.eventEpoch = builder.eventEpoch;
            this.eventId = builder.eventId;
            this.eventType = builder.eventType;
            this.promptId = builder.promptId;
            this.sessionId = builder.sessionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventCursor create() {
            return builder().build();
        }

        /**
         * @return eventEpoch
         */
        public String getEventEpoch() {
            return this.eventEpoch;
        }

        /**
         * @return eventId
         */
        public String getEventId() {
            return this.eventId;
        }

        /**
         * @return eventType
         */
        public String getEventType() {
            return this.eventType;
        }

        /**
         * @return promptId
         */
        public String getPromptId() {
            return this.promptId;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        public static final class Builder {
            private String eventEpoch; 
            private String eventId; 
            private String eventType; 
            private String promptId; 
            private String sessionId; 

            private Builder() {
            } 

            private Builder(EventCursor model) {
                this.eventEpoch = model.eventEpoch;
                this.eventId = model.eventId;
                this.eventType = model.eventType;
                this.promptId = model.promptId;
                this.sessionId = model.sessionId;
            } 

            /**
             * <p>The event stream generation identifier returned when the current prompt is accepted. It is paired with EventId during resumption. Pass this value as is to the EventEpoch query parameter of GetAgentSessionEvents to verify the same event stream.</p>
             * 
             * <strong>example:</strong>
             * <p>f7c6a27a-09f6-4bc9-b924-0c360351373c</p>
             */
            public Builder eventEpoch(String eventEpoch) {
                this.eventEpoch = eventEpoch;
                return this;
            }

            /**
             * <p>The integer ID of the current native event, returned as a decimal string. The client saves it after fully processing the event, and passes this value as the Last-Event-Id HTTP header of GetAgentSessionEvents during resumption to continue receiving subsequent events.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * <p>The type of the current native event, obtained from the type field of the native event. The examples do not constitute a fixed enumeration.</p>
             * 
             * <strong>example:</strong>
             * <p>session_update</p>
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * <p>The execution identifier returned when the current prompt is accepted. It is used to associate the current execution with its events.</p>
             * 
             * <strong>example:</strong>
             * <p>p1</p>
             */
            public Builder promptId(String promptId) {
                this.promptId = promptId;
                return this;
            }

            /**
             * <p>The identifier of the current DataAgent session. It is used to associate the event with its session.</p>
             * 
             * <strong>example:</strong>
             * <p>79fea58a-45f5-45c6-9169-c59beac0d5b6</p>
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            public EventCursor build() {
                return new EventCursor(this);
            } 

        } 

    }
    /**
     * 
     * {@link PromptAgentSessionResponseBody} extends {@link TeaModel}
     *
     * <p>PromptAgentSessionResponseBody</p>
     */
    public static class Meta extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventCursor")
        private EventCursor eventCursor;

        private Meta(Builder builder) {
            this.eventCursor = builder.eventCursor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Meta create() {
            return builder().build();
        }

        /**
         * @return eventCursor
         */
        public EventCursor getEventCursor() {
            return this.eventCursor;
        }

        public static final class Builder {
            private EventCursor eventCursor; 

            private Builder() {
            } 

            private Builder(Meta model) {
                this.eventCursor = model.eventCursor;
            } 

            /**
             * <p>The resumption cursor of the current native event. Carried only by verified native events. The client saves the cursor after fully processing the event, and uses the EventId and EventEpoch in it to resume the subscription to GetAgentSessionEvents after a disconnection without resending the prompt.</p>
             */
            public Builder eventCursor(EventCursor eventCursor) {
                this.eventCursor = eventCursor;
                return this;
            }

            public Meta build() {
                return new Meta(this);
            } 

        } 

    }
}
