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
 * {@link GetInsightsEventsCountResponseBody} extends {@link TeaModel}
 *
 * <p>GetInsightsEventsCountResponseBody</p>
 */
public class GetInsightsEventsCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetInsightsEventsCountResponseBody(Builder builder) {
        this.data = builder.data;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInsightsEventsCountResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
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
        private java.util.List<Data> data; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetInsightsEventsCountResponseBody model) {
            this.data = model.data;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
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

        public GetInsightsEventsCountResponseBody build() {
            return new GetInsightsEventsCountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInsightsEventsCountResponseBody} extends {@link TeaModel}
     *
     * <p>GetInsightsEventsCountResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("InsightType")
        private String insightType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        private Data(Builder builder) {
            this.count = builder.count;
            this.insightType = builder.insightType;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return insightType
         */
        public String getInsightType() {
            return this.insightType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private Integer count; 
            private String insightType; 
            private String regionId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.count = model.count;
                this.insightType = model.insightType;
                this.regionId = model.regionId;
            } 

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * InsightType.
             */
            public Builder insightType(String insightType) {
                this.insightType = insightType;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
