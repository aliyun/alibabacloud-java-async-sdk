// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * {@link EventCenterCheckEnabledOnDefaultBusRequest} extends {@link RequestModel}
 *
 * <p>EventCenterCheckEnabledOnDefaultBusRequest</p>
 */
public class EventCenterCheckEnabledOnDefaultBusRequest extends Request {
    private EventCenterCheckEnabledOnDefaultBusRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EventCenterCheckEnabledOnDefaultBusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<EventCenterCheckEnabledOnDefaultBusRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(EventCenterCheckEnabledOnDefaultBusRequest request) {
            super(request);
        } 

        @Override
        public EventCenterCheckEnabledOnDefaultBusRequest build() {
            return new EventCenterCheckEnabledOnDefaultBusRequest(this);
        } 

    } 

}
