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

        private Builder(LookupEventsRequest response) {
            super(response);
            this.direction = response.direction;
            this.endTime = response.endTime;
            this.lookupAttribute = response.lookupAttribute;
            this.maxResults = response.maxResults;
            this.nextToken = response.nextToken;
            this.startTime = response.startTime;
        } 

        /**
         * Direction.
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * LookupAttribute.
         */
        public Builder lookupAttribute(java.util.List < LookupAttribute> lookupAttribute) {
            this.putQueryParameter("LookupAttribute", lookupAttribute);
            this.lookupAttribute = lookupAttribute;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(String maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * StartTime.
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
