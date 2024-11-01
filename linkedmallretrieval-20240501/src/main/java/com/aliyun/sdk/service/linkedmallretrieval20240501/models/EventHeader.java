// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmallretrieval20240501.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link EventHeader} extends {@link TeaModel}
 *
 * <p>EventHeader</p>
 */
public class EventHeader extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("event")
    private String event;

    @com.aliyun.core.annotation.NameInMap("eventId")
    private String eventId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("responseTime")
    private Long responseTime;

    private EventHeader(Builder builder) {
        this.event = builder.event;
        this.eventId = builder.eventId;
        this.requestId = builder.requestId;
        this.responseTime = builder.responseTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EventHeader create() {
        return builder().build();
    }

    /**
     * @return event
     */
    public String getEvent() {
        return this.event;
    }

    /**
     * @return eventId
     */
    public String getEventId() {
        return this.eventId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return responseTime
     */
    public Long getResponseTime() {
        return this.responseTime;
    }

    public static final class Builder {
        private String event; 
        private String eventId; 
        private String requestId; 
        private Long responseTime; 

        /**
         * event.
         */
        public Builder event(String event) {
            this.event = event;
            return this;
        }

        /**
         * eventId.
         */
        public Builder eventId(String eventId) {
            this.eventId = eventId;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * responseTime.
         */
        public Builder responseTime(Long responseTime) {
            this.responseTime = responseTime;
            return this;
        }

        public EventHeader build() {
            return new EventHeader(this);
        } 

    } 

}
