// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link UpdateDnsGtmAccessStrategyResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateDnsGtmAccessStrategyResponseBody</p>
 */
public class UpdateDnsGtmAccessStrategyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StrategyId")
    private String strategyId;

    private UpdateDnsGtmAccessStrategyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.strategyId = builder.strategyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDnsGtmAccessStrategyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(UpdateDnsGtmAccessStrategyResponseBody model) {
            this.requestId = model.requestId;
            this.strategyId = model.strategyId;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>29D0F8F8-5499-4F6C-9FDC-1EE13BF55925</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the access policy.</p>
         * 
         * <strong>example:</strong>
         * <p>testStrategyId1</p>
         */
        public Builder strategyId(String strategyId) {
            this.strategyId = strategyId;
            return this;
        }

        public UpdateDnsGtmAccessStrategyResponseBody build() {
            return new UpdateDnsGtmAccessStrategyResponseBody(this);
        } 

    } 

}
