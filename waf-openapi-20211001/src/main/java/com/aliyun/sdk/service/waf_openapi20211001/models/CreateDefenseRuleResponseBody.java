// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateDefenseRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDefenseRuleResponseBody</p>
 */
public class CreateDefenseRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleIds")
    private String ruleIds;

    private CreateDefenseRuleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.ruleIds = builder.ruleIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDefenseRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return ruleIds
     */
    public String getRuleIds() {
        return this.ruleIds;
    }

    public static final class Builder {
        private String requestId; 
        private String ruleIds; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>26E46541-7AAB-5565-801D-F14DBDC5F186</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The IDs of the protection rules. Multiple IDs are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>22215,23354,462165</p>
         */
        public Builder ruleIds(String ruleIds) {
            this.ruleIds = ruleIds;
            return this;
        }

        public CreateDefenseRuleResponseBody build() {
            return new CreateDefenseRuleResponseBody(this);
        } 

    } 

}
