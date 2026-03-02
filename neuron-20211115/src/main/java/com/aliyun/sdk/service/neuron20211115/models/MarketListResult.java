// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link MarketListResult} extends {@link TeaModel}
 *
 * <p>MarketListResult</p>
 */
public class MarketListResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("markets")
    private java.util.List<MarketInfo> markets;

    private MarketListResult(Builder builder) {
        this.markets = builder.markets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MarketListResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return markets
     */
    public java.util.List<MarketInfo> getMarkets() {
        return this.markets;
    }

    public static final class Builder {
        private java.util.List<MarketInfo> markets; 

        private Builder() {
        } 

        private Builder(MarketListResult model) {
            this.markets = model.markets;
        } 

        /**
         * markets.
         */
        public Builder markets(java.util.List<MarketInfo> markets) {
            this.markets = markets;
            return this;
        }

        public MarketListResult build() {
            return new MarketListResult(this);
        } 

    } 

}
