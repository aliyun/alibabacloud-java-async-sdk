// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysms20170620.models;

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
 * {@link QueryFlowLimitNewResponseBody} extends {@link TeaModel}
 *
 * <p>QueryFlowLimitNewResponseBody</p>
 */
public class QueryFlowLimitNewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DailyLimit")
    private Long dailyLimit;

    @com.aliyun.core.annotation.NameInMap("HourLimit")
    private Long hourLimit;

    @com.aliyun.core.annotation.NameInMap("MinuteLimit")
    private Long minuteLimit;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryFlowLimitNewResponseBody(Builder builder) {
        this.dailyLimit = builder.dailyLimit;
        this.hourLimit = builder.hourLimit;
        this.minuteLimit = builder.minuteLimit;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryFlowLimitNewResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dailyLimit
     */
    public Long getDailyLimit() {
        return this.dailyLimit;
    }

    /**
     * @return hourLimit
     */
    public Long getHourLimit() {
        return this.hourLimit;
    }

    /**
     * @return minuteLimit
     */
    public Long getMinuteLimit() {
        return this.minuteLimit;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long dailyLimit; 
        private Long hourLimit; 
        private Long minuteLimit; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(QueryFlowLimitNewResponseBody model) {
            this.dailyLimit = model.dailyLimit;
            this.hourLimit = model.hourLimit;
            this.minuteLimit = model.minuteLimit;
            this.requestId = model.requestId;
        } 

        /**
         * DailyLimit.
         */
        public Builder dailyLimit(Long dailyLimit) {
            this.dailyLimit = dailyLimit;
            return this;
        }

        /**
         * HourLimit.
         */
        public Builder hourLimit(Long hourLimit) {
            this.hourLimit = hourLimit;
            return this;
        }

        /**
         * MinuteLimit.
         */
        public Builder minuteLimit(Long minuteLimit) {
            this.minuteLimit = minuteLimit;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryFlowLimitNewResponseBody build() {
            return new QueryFlowLimitNewResponseBody(this);
        } 

    } 

}
