// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddDnsGtmAccessStrategyResponseBody} extends {@link TeaModel}
 *
 * <p>AddDnsGtmAccessStrategyResponseBody</p>
 */
public class AddDnsGtmAccessStrategyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StrategyId")
    private String strategyId;

    private AddDnsGtmAccessStrategyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.strategyId = builder.strategyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDnsGtmAccessStrategyResponseBody create() {
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the access policy.
         */
        public Builder strategyId(String strategyId) {
            this.strategyId = strategyId;
            return this;
        }

        public AddDnsGtmAccessStrategyResponseBody build() {
            return new AddDnsGtmAccessStrategyResponseBody(this);
        } 

    } 

}
