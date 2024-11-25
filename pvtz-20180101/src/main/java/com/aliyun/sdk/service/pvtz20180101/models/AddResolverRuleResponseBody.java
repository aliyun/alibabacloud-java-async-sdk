// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddResolverRuleResponseBody} extends {@link TeaModel}
 *
 * <p>AddResolverRuleResponseBody</p>
 */
public class AddResolverRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleId")
    private String ruleId;

    private AddResolverRuleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddResolverRuleResponseBody create() {
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
    public String getRuleId() {
        return this.ruleId;
    }

    public static final class Builder {
        private String requestId; 
        private String ruleId; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>725B8BED-901F-480C-BBAC-FA59A18580C1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the forwarding rule.</p>
         * 
         * <strong>example:</strong>
         * <p>hr****</p>
         */
        public Builder ruleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }

        public AddResolverRuleResponseBody build() {
            return new AddResolverRuleResponseBody(this);
        } 

    } 

}
