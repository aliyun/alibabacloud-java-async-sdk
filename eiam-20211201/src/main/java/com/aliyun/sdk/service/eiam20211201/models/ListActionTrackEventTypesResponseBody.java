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
 * {@link ListActionTrackEventTypesResponseBody} extends {@link TeaModel}
 *
 * <p>ListActionTrackEventTypesResponseBody</p>
 */
public class ListActionTrackEventTypesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EventTypes")
    private java.util.List<EventTypes> eventTypes;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PreviousToken")
    private String previousToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListActionTrackEventTypesResponseBody(Builder builder) {
        this.eventTypes = builder.eventTypes;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.previousToken = builder.previousToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListActionTrackEventTypesResponseBody create() {
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
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return previousToken
     */
    public String getPreviousToken() {
        return this.previousToken;
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
        private Long maxResults; 
        private String nextToken; 
        private String previousToken; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListActionTrackEventTypesResponseBody model) {
            this.eventTypes = model.eventTypes;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.previousToken = model.previousToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of event types.</p>
         */
        public Builder eventTypes(java.util.List<EventTypes> eventTypes) {
            this.eventTypes = eventTypes;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token to retrieve the next page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>NTxxxexample</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The token to retrieve the previous page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>PTxxxexample</p>
         */
        public Builder previousToken(String previousToken) {
            this.previousToken = previousToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListActionTrackEventTypesResponseBody build() {
            return new ListActionTrackEventTypesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListActionTrackEventTypesResponseBody} extends {@link TeaModel}
     *
     * <p>ListActionTrackEventTypesResponseBody</p>
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
             * <p>The event type.</p>
             * 
             * <strong>example:</strong>
             * <p>urn:alibaba:idaas:event:user:create</p>
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
