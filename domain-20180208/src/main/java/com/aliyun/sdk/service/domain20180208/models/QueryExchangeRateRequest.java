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
 * {@link QueryExchangeRateRequest} extends {@link RequestModel}
 *
 * <p>QueryExchangeRateRequest</p>
 */
public class QueryExchangeRateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FromCurrency")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fromCurrency;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ToCurrency")
    @com.aliyun.core.annotation.Validation(required = true)
    private String toCurrency;

    private QueryExchangeRateRequest(Builder builder) {
        super(builder);
        this.fromCurrency = builder.fromCurrency;
        this.toCurrency = builder.toCurrency;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryExchangeRateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fromCurrency
     */
    public String getFromCurrency() {
        return this.fromCurrency;
    }

    /**
     * @return toCurrency
     */
    public String getToCurrency() {
        return this.toCurrency;
    }

    public static final class Builder extends Request.Builder<QueryExchangeRateRequest, Builder> {
        private String fromCurrency; 
        private String toCurrency; 

        private Builder() {
            super();
        } 

        private Builder(QueryExchangeRateRequest request) {
            super(request);
            this.fromCurrency = request.fromCurrency;
            this.toCurrency = request.toCurrency;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>USD</p>
         */
        public Builder fromCurrency(String fromCurrency) {
            this.putQueryParameter("FromCurrency", fromCurrency);
            this.fromCurrency = fromCurrency;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        public Builder toCurrency(String toCurrency) {
            this.putQueryParameter("ToCurrency", toCurrency);
            this.toCurrency = toCurrency;
            return this;
        }

        @Override
        public QueryExchangeRateRequest build() {
            return new QueryExchangeRateRequest(this);
        } 

    } 

}
