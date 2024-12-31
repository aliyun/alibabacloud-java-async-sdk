// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

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
 * {@link QueryExchangeRateResponseBody} extends {@link TeaModel}
 *
 * <p>QueryExchangeRateResponseBody</p>
 */
public class QueryExchangeRateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExchangeRate")
    private Double exchangeRate;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryExchangeRateResponseBody(Builder builder) {
        this.exchangeRate = builder.exchangeRate;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryExchangeRateResponseBody create() {
        return builder().build();
    }

    /**
     * @return exchangeRate
     */
    public Double getExchangeRate() {
        return this.exchangeRate;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Double exchangeRate; 
        private String requestId; 

        /**
         * ExchangeRate.
         */
        public Builder exchangeRate(Double exchangeRate) {
            this.exchangeRate = exchangeRate;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryExchangeRateResponseBody build() {
            return new QueryExchangeRateResponseBody(this);
        } 

    } 

}
