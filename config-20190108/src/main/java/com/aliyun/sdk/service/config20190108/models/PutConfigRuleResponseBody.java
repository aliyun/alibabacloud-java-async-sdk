// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutConfigRuleResponseBody} extends {@link TeaModel}
 *
 * <p>PutConfigRuleResponseBody</p>
 */
public class PutConfigRuleResponseBody extends TeaModel {
    @NameInMap("ConfigRuleId")
    private String configRuleId;

    @NameInMap("RequestId")
    private String requestId;

    private PutConfigRuleResponseBody(Builder builder) {
        this.configRuleId = builder.configRuleId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutConfigRuleResponseBody create() {
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
         * ConfigRuleId.
         */
        public Builder configRuleId(String configRuleId) {
            this.configRuleId = configRuleId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PutConfigRuleResponseBody build() {
            return new PutConfigRuleResponseBody(this);
        } 

    } 

}
