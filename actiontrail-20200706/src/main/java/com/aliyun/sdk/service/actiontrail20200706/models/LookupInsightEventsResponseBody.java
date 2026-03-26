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
 * {@link LookupInsightEventsResponseBody} extends {@link TeaModel}
 *
 * <p>LookupInsightEventsResponseBody</p>
 */
public class LookupInsightEventsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Events")
    private java.util.List<java.util.Map<String, ?>> events;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private LookupInsightEventsResponseBody(Builder builder) {
        this.events = builder.events;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LookupInsightEventsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder {
        private java.util.List<java.util.Map<String, ?>> events; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(LookupInsightEventsResponseBody model) {
            this.events = model.events;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * Events.
         */
        public Builder events(java.util.List<java.util.Map<String, ?>> events) {
            this.events = events;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public LookupInsightEventsResponseBody build() {
            return new LookupInsightEventsResponseBody(this);
        } 

    } 

}
