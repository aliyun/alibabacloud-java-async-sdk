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
 * {@link LookupInsightEventsRequest} extends {@link RequestModel}
 *
 * <p>LookupInsightEventsRequest</p>
 */
public class LookupInsightEventsRequest extends Request {
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

    private LookupInsightEventsRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.lookupAttribute = builder.lookupAttribute;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LookupInsightEventsRequest create() {
        return builder().build();
    }

@Override
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

    public static final class Builder extends Request.Builder<LookupInsightEventsRequest, Builder> {
        private String endTime; 
        private java.util.List<LookupAttribute> lookupAttribute; 
        private String maxResults; 
        private String nextToken; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(LookupInsightEventsRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.lookupAttribute = request.lookupAttribute;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.startTime = request.startTime;
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
        public Builder lookupAttribute(java.util.List<LookupAttribute> lookupAttribute) {
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
        public LookupInsightEventsRequest build() {
            return new LookupInsightEventsRequest(this);
        } 

    } 

    /**
     * 
     * {@link LookupInsightEventsRequest} extends {@link TeaModel}
     *
     * <p>LookupInsightEventsRequest</p>
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
