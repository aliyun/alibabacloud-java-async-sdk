// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddGtmAccessStrategyResponseBody} extends {@link TeaModel}
 *
 * <p>AddGtmAccessStrategyResponseBody</p>
 */
public class AddGtmAccessStrategyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StrategyId")
    private String strategyId;

    private AddGtmAccessStrategyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.strategyId = builder.strategyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddGtmAccessStrategyResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return strategyId
     */
    public String getStrategyId() {
        return this.strategyId;
    }

    public static final class Builder {
        private String requestId; 
        private String strategyId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StrategyId.
         */
        public Builder strategyId(String strategyId) {
            this.strategyId = strategyId;
            return this;
        }

        public AddGtmAccessStrategyResponseBody build() {
            return new AddGtmAccessStrategyResponseBody(this);
        } 

    } 

}
