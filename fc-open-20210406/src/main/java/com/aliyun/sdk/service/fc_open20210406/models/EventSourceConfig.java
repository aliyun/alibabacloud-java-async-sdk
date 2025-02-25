// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EventSourceConfig} extends {@link TeaModel}
 *
 * <p>EventSourceConfig</p>
 */
public class EventSourceConfig extends TeaModel {
    @NameInMap("eventSourceParameters")
    private EventSourceParameters eventSourceParameters;

    @NameInMap("eventSourceType")
    @Validation(required = true)
    private String eventSourceType;

    private EventSourceConfig(Builder builder) {
        this.eventSourceParameters = builder.eventSourceParameters;
        this.eventSourceType = builder.eventSourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EventSourceConfig create() {
        return builder().build();
    }

    /**
     * @return eventSourceParameters
     */
    public EventSourceParameters getEventSourceParameters() {
        return this.eventSourceParameters;
    }

    /**
     * @return eventSourceType
     */
    public String getEventSourceType() {
        return this.eventSourceType;
    }

    public static final class Builder {
        private EventSourceParameters eventSourceParameters; 
        private String eventSourceType; 

        /**
         * eventSourceParameters.
         */
        public Builder eventSourceParameters(EventSourceParameters eventSourceParameters) {
            this.eventSourceParameters = eventSourceParameters;
            return this;
        }

        /**
         * eventSourceType.
         */
        public Builder eventSourceType(String eventSourceType) {
            this.eventSourceType = eventSourceType;
            return this;
        }

        public EventSourceConfig build() {
            return new EventSourceConfig(this);
        } 

    } 

}
