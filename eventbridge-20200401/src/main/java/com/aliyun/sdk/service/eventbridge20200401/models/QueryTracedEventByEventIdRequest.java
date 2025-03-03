// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link QueryTracedEventByEventIdRequest} extends {@link RequestModel}
 *
 * <p>QueryTracedEventByEventIdRequest</p>
 */
public class QueryTracedEventByEventIdRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventBusName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eventBusName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eventId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventSource")
    private String eventSource;

    private QueryTracedEventByEventIdRequest(Builder builder) {
        super(builder);
        this.eventBusName = builder.eventBusName;
        this.eventId = builder.eventId;
        this.eventSource = builder.eventSource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTracedEventByEventIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventBusName
     */
    public String getEventBusName() {
        return this.eventBusName;
    }

    /**
     * @return eventId
     */
    public String getEventId() {
        return this.eventId;
    }

    /**
     * @return eventSource
     */
    public String getEventSource() {
        return this.eventSource;
    }

    public static final class Builder extends Request.Builder<QueryTracedEventByEventIdRequest, Builder> {
        private String eventBusName; 
        private String eventId; 
        private String eventSource; 

        private Builder() {
            super();
        } 

        private Builder(QueryTracedEventByEventIdRequest request) {
            super(request);
            this.eventBusName = request.eventBusName;
            this.eventId = request.eventId;
            this.eventSource = request.eventSource;
        } 

        /**
         * <p>The name of the event bus.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        public Builder eventBusName(String eventBusName) {
            this.putQueryParameter("EventBusName", eventBusName);
            this.eventBusName = eventBusName;
            return this;
        }

        /**
         * <p>The event ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1935debf-ddac-49dc-a090-d4f2857a046d</p>
         */
        public Builder eventId(String eventId) {
            this.putQueryParameter("EventId", eventId);
            this.eventId = eventId;
            return this;
        }

        /**
         * <p>The name of the event source.</p>
         * 
         * <strong>example:</strong>
         * <p>mse</p>
         */
        public Builder eventSource(String eventSource) {
            this.putQueryParameter("EventSource", eventSource);
            this.eventSource = eventSource;
            return this;
        }

        @Override
        public QueryTracedEventByEventIdRequest build() {
            return new QueryTracedEventByEventIdRequest(this);
        } 

    } 

}
