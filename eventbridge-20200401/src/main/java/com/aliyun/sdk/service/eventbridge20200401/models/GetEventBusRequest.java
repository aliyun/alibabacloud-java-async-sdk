// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * {@link GetEventBusRequest} extends {@link RequestModel}
 *
 * <p>GetEventBusRequest</p>
 */
public class GetEventBusRequest extends Request {
    @Query
    @NameInMap("EventBusName")
    @Validation(required = true)
    private String eventBusName;

    private GetEventBusRequest(Builder builder) {
        super(builder);
        this.eventBusName = builder.eventBusName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEventBusRequest create() {
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

    public static final class Builder extends Request.Builder<GetEventBusRequest, Builder> {
        private String eventBusName; 

        private Builder() {
            super();
        } 

        private Builder(GetEventBusRequest request) {
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
        public GetEventBusRequest build() {
            return new GetEventBusRequest(this);
        } 

    } 

}
