// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySchedulerRuleResponseBody} extends {@link TeaModel}
 *
 * <p>ModifySchedulerRuleResponseBody</p>
 */
public class ModifySchedulerRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Cname")
    private String cname;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleName")
    private String ruleName;

    private ModifySchedulerRuleResponseBody(Builder builder) {
        this.cname = builder.cname;
        this.requestId = builder.requestId;
        this.ruleName = builder.ruleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySchedulerRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return cname
     */
    public String getCname() {
        return this.cname;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    public static final class Builder {
        private String cname; 
        private String requestId; 
        private String ruleName; 

        /**
         * The CNAME that is assigned by Sec-Traffic Manager for the scheduling rule.
         * <p>
         * 
         * > To enable the scheduling rule, you must map the domain name of the service to the CNAME.
         */
        public Builder cname(String cname) {
            this.cname = cname;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The name of the rule.
         */
        public Builder ruleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }

        public ModifySchedulerRuleResponseBody build() {
            return new ModifySchedulerRuleResponseBody(this);
        } 

    } 

}
