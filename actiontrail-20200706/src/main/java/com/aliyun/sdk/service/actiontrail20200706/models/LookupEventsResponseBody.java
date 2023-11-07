// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LookupEventsResponseBody} extends {@link TeaModel}
 *
 * <p>LookupEventsResponseBody</p>
 */
public class LookupEventsResponseBody extends TeaModel {
    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("Events")
    private java.util.List < java.util.Map<String, ?>> events;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartTime")
    private String startTime;

    private LookupEventsResponseBody(Builder builder) {
        this.endTime = builder.endTime;
        this.events = builder.events;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LookupEventsResponseBody create() {
        return builder().build();
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return events
     */
    public java.util.List < java.util.Map<String, ?>> getEvents() {
        return this.events;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder {
        private String endTime; 
        private java.util.List < java.util.Map<String, ?>> events; 
        private String nextToken; 
        private String requestId; 
        private String startTime; 

        /**
         * The end of the time range when event details were queried.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * The returned event details.
         * <p>
         * 
         * For more information about the fields in an event log, see [ActionTrail event log reference](~~28819~~).
         */
        public Builder events(java.util.List < java.util.Map<String, ?>> events) {
            this.events = events;
            return this;
        }

        /**
         * The token used to return the next page of query results.
         * <p>
         * 
         * > This parameter is not returned if no more results are to be returned.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The beginning of the time range when event details were queried.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public LookupEventsResponseBody build() {
            return new LookupEventsResponseBody(this);
        } 

    } 

}
