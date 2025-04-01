// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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
 * {@link DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponseBody</p>
 */
public class DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Datapoints")
    private String datapoints;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("Period")
    private String period;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponseBody(Builder builder) {
        this.datapoints = builder.datapoints;
        this.nextToken = builder.nextToken;
        this.period = builder.period;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return datapoints
     */
    public String getDatapoints() {
        return this.datapoints;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return period
     */
    public String getPeriod() {
        return this.period;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String datapoints; 
        private String nextToken; 
        private String period; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponseBody model) {
            this.datapoints = model.datapoints;
            this.nextToken = model.nextToken;
            this.period = model.period;
            this.requestId = model.requestId;
        } 

        /**
         * Datapoints.
         */
        public Builder datapoints(String datapoints) {
            this.datapoints = datapoints;
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
         * Period.
         */
        public Builder period(String period) {
            this.period = period;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponseBody build() {
            return new DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponseBody(this);
        } 

    } 

}
