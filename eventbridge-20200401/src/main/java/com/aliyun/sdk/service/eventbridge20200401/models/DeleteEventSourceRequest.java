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
 * {@link DeleteEventSourceRequest} extends {@link RequestModel}
 *
 * <p>DeleteEventSourceRequest</p>
 */
public class DeleteEventSourceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EventBusName")
    private String eventBusName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EventSourceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eventSourceName;

    private DeleteEventSourceRequest(Builder builder) {
        super(builder);
        this.eventBusName = builder.eventBusName;
        this.eventSourceName = builder.eventSourceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEventSourceRequest create() {
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
     * @return eventSourceName
     */
    public String getEventSourceName() {
        return this.eventSourceName;
    }

    public static final class Builder extends Request.Builder<DeleteEventSourceRequest, Builder> {
        private String eventBusName; 
        private String eventSourceName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEventSourceRequest request) {
            super(request);
            this.eventBusName = request.eventBusName;
            this.eventSourceName = request.eventSourceName;
        } 

        /**
         * EventBusName.
         */
        public Builder eventBusName(String eventBusName) {
            this.putBodyParameter("EventBusName", eventBusName);
            this.eventBusName = eventBusName;
            return this;
        }

        /**
         * <p>The name of the event source.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>myrabbitmq.source</p>
         */
        public Builder eventSourceName(String eventSourceName) {
            this.putBodyParameter("EventSourceName", eventSourceName);
            this.eventSourceName = eventSourceName;
            return this;
        }

        @Override
        public DeleteEventSourceRequest build() {
            return new DeleteEventSourceRequest(this);
        } 

    } 

}
