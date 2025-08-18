// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

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
 * {@link LookupEventsResponseBody} extends {@link TeaModel}
 *
 * <p>LookupEventsResponseBody</p>
 */
public class LookupEventsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("Events")
    private java.util.List<java.util.Map<String, ?>> events;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<java.util.Map<String, ?>> getEvents() {
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
        private java.util.List<java.util.Map<String, ?>> events; 
        private String nextToken; 
        private String requestId; 
        private String startTime; 

        private Builder() {
        } 

        private Builder(LookupEventsResponseBody model) {
            this.endTime = model.endTime;
            this.events = model.events;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
        } 

        /**
         * <p>The end of the time range when event details were queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-07-22T14:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The returned event details.</p>
         * <p>For more information about the fields in an event log, see <a href="https://help.aliyun.com/document_detail/28819.html">ActionTrail event log reference</a>.</p>
         */
        public Builder events(java.util.List<java.util.Map<String, ?>> events) {
            this.events = events;
            return this;
        }

        /**
         * <p>The token used to return the next page of query results.</p>
         * <blockquote>
         * <p>This parameter is not returned if no more results are to be returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>eyJhY2NvdW50IjoiMTQyNDM3OTU4NjM4NzE2MSIsImV2ZW50SWQiOiI3MkJDRTExRi02OTU3LTQ0NUItQjY0MC1CNEUyMkM4NUEwQzgiLCJsb2dJZCI6IjgyLTE0MjQzNzk1ODYzODcxNjEiLCJ0aW1lIjoxNjAyMzExNTQwMD****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>FD79665A-CE8B-49D4-82E6-5EE2E0E791DD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The beginning of the time range when event details were queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-07-15T14:00:00Z</p>
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
