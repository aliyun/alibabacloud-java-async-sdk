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
 * {@link QueryEventTracesRequest} extends {@link RequestModel}
 *
 * <p>QueryEventTracesRequest</p>
 */
public class QueryEventTracesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventBusName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eventBusName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eventId;

    private QueryEventTracesRequest(Builder builder) {
        super(builder);
        this.eventBusName = builder.eventBusName;
        this.eventId = builder.eventId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryEventTracesRequest create() {
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

    public static final class Builder extends Request.Builder<QueryEventTracesRequest, Builder> {
        private String eventBusName; 
        private String eventId; 

        private Builder() {
            super();
        } 

        private Builder(QueryEventTracesRequest request) {
            super(request);
            this.eventBusName = request.eventBusName;
            this.eventId = request.eventId;
        } 

        /**
         * <p>The name of the event bus.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MyEventBus</p>
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

        @Override
        public QueryEventTracesRequest build() {
            return new QueryEventTracesRequest(this);
        } 

    } 

}
