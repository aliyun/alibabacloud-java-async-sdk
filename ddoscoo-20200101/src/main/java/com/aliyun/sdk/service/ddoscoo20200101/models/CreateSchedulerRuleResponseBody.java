// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSchedulerRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSchedulerRuleResponseBody</p>
 */
public class CreateSchedulerRuleResponseBody extends TeaModel {
    @NameInMap("Cname")
    private String cname;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RuleName")
    private String ruleName;

    private CreateSchedulerRuleResponseBody(Builder builder) {
        this.cname = builder.cname;
        this.requestId = builder.requestId;
        this.ruleName = builder.ruleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSchedulerRuleResponseBody create() {
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

        public CreateSchedulerRuleResponseBody build() {
            return new CreateSchedulerRuleResponseBody(this);
        } 

    } 

}
