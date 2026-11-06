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
 * {@link GetAgentSessionEventsRequest} extends {@link RequestModel}
 *
 * <p>GetAgentSessionEventsRequest</p>
 */
public class GetAgentSessionEventsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventEpoch")
    private String eventEpoch;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("Last-Event-Id")
    private String lastEventId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionCode;

    private GetAgentSessionEventsRequest(Builder builder) {
        super(builder);
        this.eventEpoch = builder.eventEpoch;
        this.lastEventId = builder.lastEventId;
        this.sessionCode = builder.sessionCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentSessionEventsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventEpoch
     */
    public String getEventEpoch() {
        return this.eventEpoch;
    }

    /**
     * @return lastEventId
     */
    public String getLastEventId() {
        return this.lastEventId;
    }

    /**
     * @return sessionCode
     */
    public String getSessionCode() {
        return this.sessionCode;
    }

    public static final class Builder extends Request.Builder<GetAgentSessionEventsRequest, Builder> {
        private String eventEpoch; 
        private String lastEventId; 
        private String sessionCode; 

        private Builder() {
            super();
        } 

        private Builder(GetAgentSessionEventsRequest request) {
            super(request);
            this.eventEpoch = request.eventEpoch;
            this.lastEventId = request.lastEventId;
            this.sessionCode = request.sessionCode;
        } 

        /**
         * <p>The epoch identifier of the event stream, obtained from data.eventEpoch in the stream_open control frame of the server. Pass the original value only when Last-Event-Id of the same native session and the same epoch is provided. Omit this parameter when subscribing for the first time or when the epoch is not obtained. Do not construct it yourself or reuse it across native sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>epoch_example</p>
         */
        public Builder eventEpoch(String eventEpoch) {
            this.putQueryParameter("EventEpoch", eventEpoch);
            this.eventEpoch = eventEpoch;
            return this;
        }

        /**
         * <p>The cursor of the last consumed remote SSE event, passed in the HTTP request header. Use the original value as a pure decimal non-negative safe integer (up to 9007199254740991). If omitted, only real-time events are subscribed to. Explicitly setting it to 0 attempts to replay from the starting point of the unevicted cache, which does not represent the complete history. Do not use local message sequence numbers.</p>
         * 
         * <strong>example:</strong>
         * <p>42</p>
         */
        public Builder lastEventId(String lastEventId) {
            this.putHeaderParameter("Last-Event-Id", lastEventId);
            this.lastEventId = lastEventId;
            return this;
        }

        /**
         * <p>The ID of the target agent session. Set the value to the SessionId returned by CreateAgentSession. The parameter name for this API operation is SessionCode.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>session_example</p>
         */
        public Builder sessionCode(String sessionCode) {
            this.putQueryParameter("SessionCode", sessionCode);
            this.sessionCode = sessionCode;
            return this;
        }

        @Override
        public GetAgentSessionEventsRequest build() {
            return new GetAgentSessionEventsRequest(this);
        } 

    } 

}
