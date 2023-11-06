// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAggregateConfigRuleResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateAggregateConfigRuleResponseBody</p>
 */
public class UpdateAggregateConfigRuleResponseBody extends TeaModel {
    @NameInMap("ConfigRuleId")
    private String configRuleId;

    @NameInMap("RequestId")
    private String requestId;

    private UpdateAggregateConfigRuleResponseBody(Builder builder) {
        this.configRuleId = builder.configRuleId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAggregateConfigRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return configRuleId
     */
    public String getConfigRuleId() {
        return this.configRuleId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String configRuleId; 
        private String requestId; 

        /**
         * The ID of the rule.
         */
        public Builder configRuleId(String configRuleId) {
            this.configRuleId = configRuleId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateAggregateConfigRuleResponseBody build() {
            return new UpdateAggregateConfigRuleResponseBody(this);
        } 

    } 

}
