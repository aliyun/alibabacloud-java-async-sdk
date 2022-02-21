// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySchedulerRuleResponseBody} extends {@link TeaModel}
 *
 * <p>ModifySchedulerRuleResponseBody</p>
 */
public class ModifySchedulerRuleResponseBody extends TeaModel {
    @NameInMap("Cname")
    private String cname;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RuleName")
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
         * Cname.
         */
        public Builder cname(String cname) {
            this.cname = cname;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RuleName.
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
