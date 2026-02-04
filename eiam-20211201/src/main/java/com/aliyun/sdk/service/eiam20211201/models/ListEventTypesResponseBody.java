// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link ListEventTypesResponseBody} extends {@link TeaModel}
 *
 * <p>ListEventTypesResponseBody</p>
 */
public class ListEventTypesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EventTypes")
    private java.util.List<EventTypes> eventTypes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListEventTypesResponseBody(Builder builder) {
        this.eventTypes = builder.eventTypes;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEventTypesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventTypes
     */
    public java.util.List<EventTypes> getEventTypes() {
        return this.eventTypes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<EventTypes> eventTypes; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListEventTypesResponseBody model) {
            this.eventTypes = model.eventTypes;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * EventTypes.
         */
        public Builder eventTypes(java.util.List<EventTypes> eventTypes) {
            this.eventTypes = eventTypes;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListEventTypesResponseBody build() {
            return new ListEventTypesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListEventTypesResponseBody} extends {@link TeaModel}
     *
     * <p>ListEventTypesResponseBody</p>
     */
    public static class EventTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventType")
        private String eventType;

        private EventTypes(Builder builder) {
            this.eventType = builder.eventType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventTypes create() {
            return builder().build();
        }

        /**
         * @return eventType
         */
        public String getEventType() {
            return this.eventType;
        }

        public static final class Builder {
            private String eventType; 

            private Builder() {
            } 

            private Builder(EventTypes model) {
                this.eventType = model.eventType;
            } 

            /**
             * EventType.
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            public EventTypes build() {
                return new EventTypes(this);
            } 

        } 

    }
}
