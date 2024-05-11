// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * {@link EventCenterDisableOnDefaultBusRequest} extends {@link RequestModel}
 *
 * <p>EventCenterDisableOnDefaultBusRequest</p>
 */
public class EventCenterDisableOnDefaultBusRequest extends Request {
    private EventCenterDisableOnDefaultBusRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EventCenterDisableOnDefaultBusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<EventCenterDisableOnDefaultBusRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(EventCenterDisableOnDefaultBusRequest request) {
            super(request);
        } 

        @Override
        public EventCenterDisableOnDefaultBusRequest build() {
            return new EventCenterDisableOnDefaultBusRequest(this);
        } 

    } 

}
