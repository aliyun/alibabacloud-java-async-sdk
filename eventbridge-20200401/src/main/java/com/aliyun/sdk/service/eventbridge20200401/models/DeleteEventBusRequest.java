// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * {@link DeleteEventBusRequest} extends {@link RequestModel}
 *
 * <p>DeleteEventBusRequest</p>
 */
public class DeleteEventBusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventBusName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eventBusName;

    private DeleteEventBusRequest(Builder builder) {
        super(builder);
        this.eventBusName = builder.eventBusName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEventBusRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteEventBusRequest, Builder> {
        private String eventBusName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEventBusRequest request) {
            super(request);
            this.eventBusName = request.eventBusName;
        } 

        /**
         * The name of the event bus.
         */
        public Builder eventBusName(String eventBusName) {
            this.putQueryParameter("EventBusName", eventBusName);
            this.eventBusName = eventBusName;
            return this;
        }

        @Override
        public DeleteEventBusRequest build() {
            return new DeleteEventBusRequest(this);
        } 

    } 

}
