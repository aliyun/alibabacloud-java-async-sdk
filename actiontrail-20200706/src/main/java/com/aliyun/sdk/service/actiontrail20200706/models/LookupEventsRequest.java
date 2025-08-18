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
 * {@link LookupEventsRequest} extends {@link RequestModel}
 *
 * <p>LookupEventsRequest</p>
 */
public class LookupEventsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Direction")
    private String direction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LookupAttribute")
    private java.util.List<LookupAttribute> lookupAttribute;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private String maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private LookupEventsRequest(Builder builder) {
        super(builder);
        this.direction = builder.direction;
        this.endTime = builder.endTime;
        this.lookupAttribute = builder.lookupAttribute;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LookupEventsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return direction
     */
    public String getDirection() {
        return this.direction;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return lookupAttribute
     */
    public java.util.List<LookupAttribute> getLookupAttribute() {
        return this.lookupAttribute;
    }

    /**
     * @return maxResults
     */
    public String getMaxResults() {
        return this.maxResults;
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
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<LookupEventsRequest, Builder> {
        private String direction; 
        private String endTime; 
        private java.util.List<LookupAttribute> lookupAttribute; 
        private String maxResults; 
        private String nextToken; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(LookupEventsRequest request) {
            super(request);
            this.direction = request.direction;
            this.endTime = request.endTime;
            this.lookupAttribute = request.lookupAttribute;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The order in which details of events are to be retrieved. Valid values:</p>
         * <ul>
         * <li>FORWARD: ascending order.</li>
         * <li>BACKWARD: descending order. This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BACKWARD</p>
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * <p>The end of the time range to query. The default time is the current time. Specify the time in the ISO 8601 standard in the <code>YYYY-MM-DDThh:mm:ssZ</code> format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-15T11:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Query conditions.</p>
         */
        public Builder lookupAttribute(java.util.List<LookupAttribute> lookupAttribute) {
            this.putQueryParameter("LookupAttribute", lookupAttribute);
            this.lookupAttribute = lookupAttribute;
            return this;
        }

        /**
         * <p>The maximum number of entries to be returned.</p>
         * <p>Valid values: 0 to 50.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(String maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token used to request the next page of query results.</p>
         * <blockquote>
         * <p>The request parameters must be the same as those of the last request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>eyJhY2NvdW50IjoiMTQyNDM3OTU4NjM4NzE2MSIsImV2ZW50SWQiOiI3MkJDRTExRi02OTU3LTQ0NUItQjY0MC1CNEUyMkM4NUEwQzgiLCJsb2dJZCI6IjgyLTE0MjQzNzk1ODYzODcxNjEiLCJ0aW1lIjoxNjAyMzExNTQwMD****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. The default time is seven days prior to the current time. Specify the time in the ISO 8601 standard in the <code>YYYY-MM-DDThh:mm:ssZ</code> format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-08T11:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public LookupEventsRequest build() {
            return new LookupEventsRequest(this);
        } 

    } 

    /**
     * 
     * {@link LookupEventsRequest} extends {@link TeaModel}
     *
     * <p>LookupEventsRequest</p>
     */
    public static class LookupAttribute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private LookupAttribute(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LookupAttribute create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(LookupAttribute model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of the query condition. Valid values:</p>
             * <ul>
             * <li>ServiceName: the name of a specific Alibaba Cloud service.</li>
             * <li>EventName: the name of a specific event.</li>
             * <li>User: the name of the RAM user who calls a specific operation.</li>
             * <li>EventId: the ID of a specific event.</li>
             * <li>ResourceType: the type of resources.</li>
             * <li>ResourceName: the name of a specific resource.</li>
             * <li>EventRW: the read/write type of events.</li>
             * <li>EventAccessKeyId: the AccessKey ID used in events.</li>
             * </ul>
             * <blockquote>
             * <p>You can use only one query condition for each query.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>ServiceName</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the query condition. Valid values:</p>
             * <ul>
             * <li>When the LookupAttribute.N.Key parameter is set to ServiceName, you can set this parameter to a value such as <code>Ecs</code>.</li>
             * <li>When the LookupAttribute.N.Key parameter is set to EventName, you can set this parameter to a value such as <code>ConsoleSignin</code>.</li>
             * <li>When the LookupAttribute.N.Key parameter is set to User, you can set this parameter to a value such as <code>Alice</code>.</li>
             * <li>When the LookupAttribute.N.Key parameter is set to EventId, you can set this parameter to a value such as <code>B702AFA3-FD4B-40E3-88E4-C0752FAA****</code>.</li>
             * <li>When the LookupAttribute.N.Key parameter is set to ResourceType, you can set this parameter to a value such as <code>ACS::ECS::Instance</code>.</li>
             * <li>When the LookupAttribute.N.Key parameter is set to ResourceName, you can set this parameter to a value such as <code>i-bp14664y88udkt45****</code>.</li>
             * <li>When the LookupAttribute.N.Key parameter is set to EventRW, you can set this parameter to <code>Read</code> or <code>Write</code>.</li>
             * <li>When the LookupAttribute.N.Key parameter is set to EventAccessKeyId, you can set this parameter to a value such as <code>LTAI****************</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Ecs</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public LookupAttribute build() {
                return new LookupAttribute(this);
            } 

        } 

    }
}
