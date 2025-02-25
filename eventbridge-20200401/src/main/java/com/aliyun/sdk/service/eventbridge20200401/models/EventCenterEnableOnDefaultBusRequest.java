// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * {@link EventCenterEnableOnDefaultBusRequest} extends {@link RequestModel}
 *
 * <p>EventCenterEnableOnDefaultBusRequest</p>
 */
public class EventCenterEnableOnDefaultBusRequest extends Request {
    private EventCenterEnableOnDefaultBusRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EventCenterEnableOnDefaultBusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<EventCenterEnableOnDefaultBusRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(EventCenterEnableOnDefaultBusRequest request) {
            super(request);
        } 

        @Override
        public EventCenterEnableOnDefaultBusRequest build() {
            return new EventCenterEnableOnDefaultBusRequest(this);
        } 

    } 

}
