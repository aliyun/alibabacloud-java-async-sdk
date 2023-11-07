// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LookupEventsRequest} extends {@link RequestModel}
 *
 * <p>LookupEventsRequest</p>
 */
public class LookupEventsRequest extends Request {
    @Query
    @NameInMap("Direction")
    private String direction;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("LookupAttribute")
    private java.util.List < LookupAttribute> lookupAttribute;

    @Query
    @NameInMap("MaxResults")
    private String maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("StartTime")
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
    public java.util.List < LookupAttribute> getLookupAttribute() {
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
        private java.util.List < LookupAttribute> lookupAttribute; 
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
         * The order in which details of events are to be retrieved. Valid values:
         * <p>
         * 
         * *   FORWARD: ascending order.
         * *   BACKWARD: descending order. This is the default value.
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * The end of the time range to query. The default time is the current time. Specify the time in the ISO 8601 standard in the `YYYY-MM-DDThh:mm:ssZ` format. The time must be in UTC.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Query conditions.
         */
        public Builder lookupAttribute(java.util.List < LookupAttribute> lookupAttribute) {
            this.putQueryParameter("LookupAttribute", lookupAttribute);
            this.lookupAttribute = lookupAttribute;
            return this;
        }

        /**
         * The maximum number of entries to be returned.
         * <p>
         * 
         * Valid values: 0 to 50.
         */
        public Builder maxResults(String maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token used to request the next page of query results.
         * <p>
         * 
         * > The request parameters must be the same as those of the last request.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The beginning of the time range to query. The default time is seven days prior to the current time. Specify the time in the ISO 8601 standard in the `YYYY-MM-DDThh:mm:ssZ` format. The time must be in UTC.
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

    public static class LookupAttribute extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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

            /**
             * The key of the query condition. Valid values:
             * <p>
             * 
             * *  ServiceName: the name of a specific Alibaba Cloud service.
             * *  EventName: the name of a specific event.
             * *  User: the name of the RAM user who calls a specific operation.
             * *  EventId: the ID of a specific event.
             * *  ResourceType: the type of resources.
             * *   ResourceName: the name of a specific resource.
             * *   EventRW: the read/write type of events.
             * *  EventAccessKeyId: the AccessKey ID used in events.
             * 
             * > You can use only one query condition for each query.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the query condition. Valid values:
             * <p>
             * 
             * *   When the LookupAttribute.N.Key parameter is set to ServiceName, you can set this parameter to a value such as `Ecs`.
             * *   When the LookupAttribute.N.Key parameter is set to EventName, you can set this parameter to a value such as `ConsoleSignin`.
             * *   When the LookupAttribute.N.Key parameter is set to User, you can set this parameter to a value such as `Alice`.
             * *   When the LookupAttribute.N.Key parameter is set to EventId, you can set this parameter to a value such as `B702AFA3-FD4B-40E3-88E4-C0752FAA****`.
             * *   When the LookupAttribute.N.Key parameter is set to ResourceType, you can set this parameter to a value such as `ACS::ECS::Instance`.
             * *   When the LookupAttribute.N.Key parameter is set to ResourceName, you can set this parameter to a value such as `i-bp14664y88udkt45****`.
             * *   When the LookupAttribute.N.Key parameter is set to EventRW, you can set this parameter to `Read` or `Write`.
             * *   When the LookupAttribute.N.Key parameter is set to EventAccessKeyId, you can set this parameter to a value such as `LTAI4FoDkCf4DU1bic1V****`.
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
