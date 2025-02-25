// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * {@link QueryTracedEventsRequest} extends {@link RequestModel}
 *
 * <p>QueryTracedEventsRequest</p>
 */
public class QueryTracedEventsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventBusName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eventBusName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventSource")
    private String eventSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventType")
    private String eventType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Limit")
    private Integer limit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MatchedRule")
    private String matchedRule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    private QueryTracedEventsRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.eventBusName = builder.eventBusName;
        this.eventSource = builder.eventSource;
        this.eventType = builder.eventType;
        this.limit = builder.limit;
        this.matchedRule = builder.matchedRule;
        this.nextToken = builder.nextToken;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTracedEventsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return eventBusName
     */
    public String getEventBusName() {
        return this.eventBusName;
    }

    /**
     * @return eventSource
     */
    public String getEventSource() {
        return this.eventSource;
    }

    /**
     * @return eventType
     */
    public String getEventType() {
        return this.eventType;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return matchedRule
     */
    public String getMatchedRule() {
        return this.matchedRule;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<QueryTracedEventsRequest, Builder> {
        private Long endTime; 
        private String eventBusName; 
        private String eventSource; 
        private String eventType; 
        private Integer limit; 
        private String matchedRule; 
        private String nextToken; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(QueryTracedEventsRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.eventBusName = request.eventBusName;
            this.eventSource = request.eventSource;
            this.eventType = request.eventType;
            this.limit = request.limit;
            this.matchedRule = request.matchedRule;
            this.nextToken = request.nextToken;
            this.startTime = request.startTime;
        } 

        /**
         * The end of the time range when event traces are queried. Unit: milliseconds.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The name of the event bus.
         */
        public Builder eventBusName(String eventBusName) {
            this.putQueryParameter("EventBusName", eventBusName);
            this.eventBusName = eventBusName;
            return this;
        }

        /**
         * The name of the event source.
         */
        public Builder eventSource(String eventSource) {
            this.putQueryParameter("EventSource", eventSource);
            this.eventSource = eventSource;
            return this;
        }

        /**
         * The event type.
         */
        public Builder eventType(String eventType) {
            this.putQueryParameter("EventType", eventType);
            this.eventType = eventType;
            return this;
        }

        /**
         * The maximum number of entries to be returned in a call. You can use this parameter and NextToken to implement paging. Up to 100 entries can be returned in a call.
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * The name of the event rule that is matched.
         */
        public Builder matchedRule(String matchedRule) {
            this.putQueryParameter("MatchedRule", matchedRule);
            this.matchedRule = matchedRule;
            return this;
        }

        /**
         * If you configure Limit and excess return values exist, this parameter is returned.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The beginning of the time range to query event traces. Unit: milliseconds.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public QueryTracedEventsRequest build() {
            return new QueryTracedEventsRequest(this);
        } 

    } 

}
