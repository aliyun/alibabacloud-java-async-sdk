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
 * {@link GetAccessKeyLastUsedEventsResponseBody} extends {@link TeaModel}
 *
 * <p>GetAccessKeyLastUsedEventsResponseBody</p>
 */
public class GetAccessKeyLastUsedEventsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Events")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Events> events;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String requestId;

    private GetAccessKeyLastUsedEventsResponseBody(Builder builder) {
        this.events = builder.events;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccessKeyLastUsedEventsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return events
     */
    public java.util.List<Events> getEvents() {
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
        private java.util.List<Events> events; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetAccessKeyLastUsedEventsResponseBody model) {
            this.events = model.events;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of returned events.</p>
         * <p>This parameter is required.</p>
         */
        public Builder events(java.util.List<Events> events) {
            this.events = events;
            return this;
        }

        /**
         * <p>The token that determines the start point of the query.</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>145318BE-DEE1-4C57-AA7C-5BE7D34A6AE0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAccessKeyLastUsedEventsResponseBody build() {
            return new GetAccessKeyLastUsedEventsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAccessKeyLastUsedEventsResponseBody} extends {@link TeaModel}
     *
     * <p>GetAccessKeyLastUsedEventsResponseBody</p>
     */
    public static class Events extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Detail")
        private String detail;

        @com.aliyun.core.annotation.NameInMap("EventName")
        private String eventName;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("UsedTimestamp")
        private Long usedTimestamp;

        private Events(Builder builder) {
            this.detail = builder.detail;
            this.eventName = builder.eventName;
            this.source = builder.source;
            this.usedTimestamp = builder.usedTimestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Events create() {
            return builder().build();
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return usedTimestamp
         */
        public Long getUsedTimestamp() {
            return this.usedTimestamp;
        }

        public static final class Builder {
            private String detail; 
            private String eventName; 
            private String source; 
            private Long usedTimestamp; 

            private Builder() {
            } 

            private Builder(Events model) {
                this.detail = model.detail;
                this.eventName = model.eventName;
                this.source = model.source;
                this.usedTimestamp = model.usedTimestamp;
            } 

            /**
             * <p>An array that consists of the details about the event.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;eventId&quot;: &quot;239EB588-CD24-522E-B0B5-174A1A58****&quot;,
             *   &quot;eventVersion&quot;: 1,
             *   &quot;eventSource&quot;: &quot;ecs.cn-hangzhou.aliyuncs.com&quot;,
             *   &quot;sourceIpAddress&quot;: &quot;<code>10.10.**.**</code>&quot;,
             *   &quot;eventType&quot;: &quot;ApiCall&quot;,
             *   &quot;userIdentity&quot;: {
             *     &quot;accountId&quot;: &quot;104758519118****&quot;,
             *     &quot;principalId&quot;: &quot;24549429003625****&quot;,
             *     &quot;type&quot;: &quot;ram-user&quot;,
             *     &quot;userName&quot;: &quot;alice&quot;
             *   },
             *   &quot;serviceName&quot;: &quot;Ecs&quot;,
             *   &quot;apiVersion&quot;: &quot;2016-01-20&quot;,
             *   &quot;requestId&quot;: &quot;239EB588-CD24-522E-B0B5-174A1A588BE0&quot;,
             *   &quot;eventTime&quot;: &quot;2021-08-05T09:21:32Z&quot;,
             *   &quot;isGlobal&quot;: false,
             *   &quot;acsRegion&quot;: &quot;cn-hangzhou&quot;,
             *   &quot;eventName&quot;: &quot;DescribeInstances&quot;
             * }</p>
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The name of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>DescribeInstances</p>
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * <p>The event source.</p>
             * 
             * <strong>example:</strong>
             * <p>ManagementEvent</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The timestamp when the event was generated.</p>
             * 
             * <strong>example:</strong>
             * <p>1657247532000</p>
             */
            public Builder usedTimestamp(Long usedTimestamp) {
                this.usedTimestamp = usedTimestamp;
                return this;
            }

            public Events build() {
                return new Events(this);
            } 

        } 

    }
}
