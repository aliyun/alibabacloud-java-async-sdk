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
 * {@link QueryPrevLimitNewResponseBody} extends {@link TeaModel}
 *
 * <p>QueryPrevLimitNewResponseBody</p>
 */
public class QueryPrevLimitNewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HourLimit")
    private Long hourLimit;

    @com.aliyun.core.annotation.NameInMap("IncreaseRate")
    private Integer increaseRate;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SuccessRate")
    private Integer successRate;

    private QueryPrevLimitNewResponseBody(Builder builder) {
        this.hourLimit = builder.hourLimit;
        this.increaseRate = builder.increaseRate;
        this.requestId = builder.requestId;
        this.successRate = builder.successRate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPrevLimitNewResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hourLimit
     */
    public Long getHourLimit() {
        return this.hourLimit;
    }

    /**
     * @return increaseRate
     */
    public Integer getIncreaseRate() {
        return this.increaseRate;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return successRate
     */
    public Integer getSuccessRate() {
        return this.successRate;
    }

    public static final class Builder {
        private Long hourLimit; 
        private Integer increaseRate; 
        private String requestId; 
        private Integer successRate; 

        private Builder() {
        } 

        private Builder(QueryPrevLimitNewResponseBody model) {
            this.hourLimit = model.hourLimit;
            this.increaseRate = model.increaseRate;
            this.requestId = model.requestId;
            this.successRate = model.successRate;
        } 

        /**
         * HourLimit.
         */
        public Builder hourLimit(Long hourLimit) {
            this.hourLimit = hourLimit;
            return this;
        }

        /**
         * IncreaseRate.
         */
        public Builder increaseRate(Integer increaseRate) {
            this.increaseRate = increaseRate;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SuccessRate.
         */
        public Builder successRate(Integer successRate) {
            this.successRate = successRate;
            return this;
        }

        public QueryPrevLimitNewResponseBody build() {
            return new QueryPrevLimitNewResponseBody(this);
        } 

    } 

}
