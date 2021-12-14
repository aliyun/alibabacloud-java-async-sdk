// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeDomainRuleGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainRuleGroupResponseBody</p>
 */
public class DescribeDomainRuleGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RuleGroupId")
    private Long ruleGroupId;


    private DescribeDomainRuleGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.ruleGroupId = builder.ruleGroupId;
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

    public static final class Builder {
        private String requestId; 
        private Long ruleGroupId; 

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>RuleGroupId.</p>
         */
        public Builder ruleGroupId(Long ruleGroupId) {
            this.ruleGroupId = ruleGroupId;
            return this;
        }

        public DescribeDomainRuleGroupResponseBody build() {
            return new DescribeDomainRuleGroupResponseBody(this);
        } 

    } 

}
