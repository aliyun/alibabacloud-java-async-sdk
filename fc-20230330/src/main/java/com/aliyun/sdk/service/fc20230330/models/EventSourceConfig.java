// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link EventSourceConfig} extends {@link TeaModel}
 *
 * <p>EventSourceConfig</p>
 */
public class EventSourceConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("eventSourceParameters")
    private EventSourceParameters eventSourceParameters;

    @com.aliyun.core.annotation.NameInMap("eventSourceType")
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
