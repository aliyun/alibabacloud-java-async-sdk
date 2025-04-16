// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link CreateSimulatedSystemEventsResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSimulatedSystemEventsResponseBody</p>
 */
public class CreateSimulatedSystemEventsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EventIdSet")
    private EventIdSet eventIdSet;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateSimulatedSystemEventsResponseBody model) {
            this.eventIdSet = model.eventIdSet;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The IDs of the simulated events.</p>
         */
        public Builder eventIdSet(EventIdSet eventIdSet) {
            this.eventIdSet = eventIdSet;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateSimulatedSystemEventsResponseBody build() {
            return new CreateSimulatedSystemEventsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateSimulatedSystemEventsResponseBody} extends {@link TeaModel}
     *
     * <p>CreateSimulatedSystemEventsResponseBody</p>
     */
    public static class EventIdSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventId")
        private java.util.List<String> eventId;

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
        public java.util.List<String> getEventId() {
            return this.eventId;
        }

        public static final class Builder {
            private java.util.List<String> eventId; 

            private Builder() {
            } 

            private Builder(EventIdSet model) {
                this.eventId = model.eventId;
            } 

            /**
             * EventId.
             */
            public Builder eventId(java.util.List<String> eventId) {
                this.eventId = eventId;
                return this;
            }

            public EventIdSet build() {
                return new EventIdSet(this);
            } 

        } 

    }
}
