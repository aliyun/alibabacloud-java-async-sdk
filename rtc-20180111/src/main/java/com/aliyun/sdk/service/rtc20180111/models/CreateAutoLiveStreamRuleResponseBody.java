// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateAutoLiveStreamRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAutoLiveStreamRuleResponseBody</p>
 */
public class CreateAutoLiveStreamRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleId")
    private Long ruleId;

    private CreateAutoLiveStreamRuleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAutoLiveStreamRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return ruleId
     */
    public Long getRuleId() {
        return this.ruleId;
    }

    public static final class Builder {
        private String requestId; 
        private Long ruleId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RuleId.
         */
        public Builder ruleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }

        public CreateAutoLiveStreamRuleResponseBody build() {
            return new CreateAutoLiveStreamRuleResponseBody(this);
        } 

    } 

}
