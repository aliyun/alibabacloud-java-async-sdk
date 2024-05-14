// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainRuleGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainRuleGroupResponseBody</p>
 */
public class DescribeDomainRuleGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleGroupId")
    private Long ruleGroupId;

    @com.aliyun.core.annotation.NameInMap("WafAiStatus")
    private Integer wafAiStatus;

    private DescribeDomainRuleGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.ruleGroupId = builder.ruleGroupId;
        this.wafAiStatus = builder.wafAiStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainRuleGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return ruleGroupId
     */
    public Long getRuleGroupId() {
        return this.ruleGroupId;
    }

    /**
     * @return wafAiStatus
     */
    public Integer getWafAiStatus() {
        return this.wafAiStatus;
    }

    public static final class Builder {
        private String requestId; 
        private Long ruleGroupId; 
        private Integer wafAiStatus; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RuleGroupId.
         */
        public Builder ruleGroupId(Long ruleGroupId) {
            this.ruleGroupId = ruleGroupId;
            return this;
        }

        /**
         * WafAiStatus.
         */
        public Builder wafAiStatus(Integer wafAiStatus) {
            this.wafAiStatus = wafAiStatus;
            return this;
        }

        public DescribeDomainRuleGroupResponseBody build() {
            return new DescribeDomainRuleGroupResponseBody(this);
        } 

    } 

}
