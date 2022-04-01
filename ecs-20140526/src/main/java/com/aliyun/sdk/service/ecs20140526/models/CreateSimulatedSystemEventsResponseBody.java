// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSimulatedSystemEventsResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSimulatedSystemEventsResponseBody</p>
 */
public class CreateSimulatedSystemEventsResponseBody extends TeaModel {
    @NameInMap("EventIdSet")
    private EventIdSet eventIdSet;

    @NameInMap("RequestId")
    private String requestId;

    private CreateSimulatedSystemEventsResponseBody(Builder builder) {
        this.eventIdSet = builder.eventIdSet;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSimulatedSystemEventsResponseBody create() {
        return builder().build();
    }

    /**
     * @return eventIdSet
     */
    public EventIdSet getEventIdSet() {
        return this.eventIdSet;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private EventIdSet eventIdSet; 
        private String requestId; 

        /**
         * EventIdSet.
         */
        public Builder eventIdSet(EventIdSet eventIdSet) {
            this.eventIdSet = eventIdSet;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateSimulatedSystemEventsResponseBody build() {
            return new CreateSimulatedSystemEventsResponseBody(this);
        } 

    } 

    public static class EventIdSet extends TeaModel {
        @NameInMap("EventId")
        private java.util.List < String > eventId;

        private EventIdSet(Builder builder) {
            this.eventId = builder.eventId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventIdSet create() {
            return builder().build();
        }

        /**
         * @return eventId
         */
        public java.util.List < String > getEventId() {
            return this.eventId;
        }

        public static final class Builder {
            private java.util.List < String > eventId; 

            /**
             * EventId.
             */
            public Builder eventId(java.util.List < String > eventId) {
                this.eventId = eventId;
                return this;
            }

            public EventIdSet build() {
                return new EventIdSet(this);
            } 

        } 

    }
}
