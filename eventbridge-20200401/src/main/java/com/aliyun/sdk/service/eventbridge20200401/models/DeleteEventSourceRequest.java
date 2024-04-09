// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * {@link DeleteEventSourceRequest} extends {@link RequestModel}
 *
 * <p>DeleteEventSourceRequest</p>
 */
public class DeleteEventSourceRequest extends Request {
    @Body
    @NameInMap("EventBusName")
    private String eventBusName;

    @Body
    @NameInMap("EventSourceName")
    @Validation(required = true)
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
         * The name of the event source.
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
