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
 * {@link GetAgentSessionEventsResponseBody} extends {@link TeaModel}
 *
 * <p>GetAgentSessionEventsResponseBody</p>
 */
public class GetAgentSessionEventsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Object data;

    @com.aliyun.core.annotation.NameInMap("Event")
    private String event;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAgentSessionEventsResponseBody(Builder builder) {
        this.data = builder.data;
        this.event = builder.event;
        this.id = builder.id;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentSessionEventsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Object getData() {
        return this.data;
    }

    /**
     * @return event
     */
    public String getEvent() {
        return this.event;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Object data; 
        private String event; 
        private String id; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetAgentSessionEventsResponseBody model) {
            this.data = model.data;
            this.event = model.event;
            this.id = model.id;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The event data of the current frame. The content varies with the Event type and should be parsed according to the event type. Preserve the original session, turn, and tool invocation identifiers.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder data(Object data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The SSE event type, such as session_update. Process control frames and business frames separately.</p>
         * 
         * <strong>example:</strong>
         * <p>session_update</p>
         */
        public Builder event(String event) {
            this.event = event;
            return this;
        }

        /**
         * <p>The remote SSE event cursor. Save it after consumption for subsequent resumption using Last-Event-Id. Some control frames may not have a cursor. Do not generate a local cursor for them.</p>
         * 
         * <strong>example:</strong>
         * <p>42</p>
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The request ID of the current OpenAPI subscription request, used to troubleshoot subscription failures. It is not an event cursor or an interactive question ID.</p>
         * 
         * <strong>example:</strong>
         * <p>01A0B6E0-E005-1465-B5DE-5CD17677426F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAgentSessionEventsResponseBody build() {
            return new GetAgentSessionEventsResponseBody(this);
        } 

    } 

}
